#include <bits/stdc++.h>
using namespace std;
// ........................macro k.......................... //
#define pb push_back
#define fi first
#define se second
#define endl '\n'
#define sz(A) (int)(A).size()
#define ALL(A) A.begin(), A.end()
#define ub(A,B) upper_bound(ALL(A), B) - A.begin()
#define lb(A,B) lower_bound(ALL(A), B) - A.begin()

typedef long long i64;
typedef unsigned long long ui64;
typedef double ld;
typedef pair<int, int> ii;
typedef pair<int, ii> iii;
typedef vector<int> vi;
typedef vector<i64> vi64;
typedef vector<string> vs;
typedef vector<vi> vvi;
typedef vector<ii> vii;
typedef vector<vii> vvii;
// ........................fuction1.......................... //
 
 
// ........................main.......................... //
void solve() {
  int t;cin>>t;
  while(t--){
    int n,m;cin>>n>>m;
    i64 tb[101][101]{0,};
    for(int i=0;i<n;i++){
      for(int j=0;j<m;j++){
        cin>>tb[i][j];
      }
    }
    i64 ans=0;
    for(int i=0;i<n;i++){
      i64 sum=0;
      for(int j=0;j<m;j++){
        vi64 tr;
        tr.pb(tb[i][j]);
        tr.pb(tb[i][m-j-1]);
        tr.pb(tb[n-i-1][j]);
        sort(ALL(tr));
        ans+=abs(tr[1]-tb[i][j]);
        ans+=abs(tr[1]-tb[i][m-j-1]);
        ans+=abs(tr[1]-tb[n-i-1][j]);
        tb[i][j]=tr[1];
        tb[i][m-j-1]=tr[1];
        tb[n-i-1][j]=tr[1];
      }
    }
    cout<<ans<<endl;
  }
}
 
int main() {
cin.tie(0), ios_base::sync_with_stdio(false);
solve();
return 0;
}