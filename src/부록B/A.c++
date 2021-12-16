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
    vi64 a(3);
    for(int i=0;i<3;i++)cin>>a[i];
    sort(ALL(a));
    cout<<a[2]+1<<endl;    
  }
}
 
int main() {
cin.tie(0), ios_base::sync_with_stdio(false);
solve();
return 0;
}