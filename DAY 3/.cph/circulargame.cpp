#include <bits/stdc++.h>
using namespace std;

  int solve(vector<int>&v, int k, int idx)
    {
        if(v.size() == 1)
            return v[0];
        idx = (idx + k)%v.size();
         v.erase(v.begin()+idx);
        return solve(v,k,idx);
    }

int main(){
    int n,k;
    cin >>n >>k;
   if(n ==1 || k==1) return n;
        
        vector<int>v;
        for(int i=0; i<n; i++)
            v.push_back(i+1);
        cout<< solve(v,k-1,0);
   
}