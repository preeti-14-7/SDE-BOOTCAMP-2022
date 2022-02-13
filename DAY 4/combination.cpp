   #include<bits/stdc++.h>
   using namespace std;
   
   void solve(vector<vector<int>>&res, int idx, int k, int n, vector<int>&list)
    {
        if(list.size() == k)
        {
            res.push_back(list);
            return;
        }
         for(int i=idx; i<=n; i++){
             
            list.push_back(i);
            solve(res,i+1,k,n,list);
            list.pop_back();
             
        }
    }

    int main (){


        int n,k; 
        cin >>n >>k;
        vector<vector<int>> res;
        vector<int>list;
        solve(res,1,k,n,list);

       for(int i=0; i<res.size(); i++){
           for(int j=0; j<k; j++)
           {
               cout<<res[i][j]<<" ";
           }
           cout<<endl;
       }
    }