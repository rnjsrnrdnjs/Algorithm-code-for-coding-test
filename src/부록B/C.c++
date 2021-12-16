
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
 
const i64 m=1e9+7;
i64 frr[100100]{0,};
i64 fr2[100100]{0,};
inline i64 Pow(i64 x,i64 n){
  if(x==1)return 1;
  i64 r=1;
  while(n){
    if(n&1){
      r=(r*x)%m;
    }
    x=(x*x)%m;
    n>>=1;
  }
  return r;
}
// ........................main.......................... //
void solve() {
  i64 ans=0;
  string s;cin>>s;
  i64 n=s.length();
  i64 f=0;
  for(i64 i=1;i<100000;i++){
    f+=i;
    f%=m;
    frr[i]=f;
  }
  for(i64 i=1;i<100000;i++){
    f=Pow(10,i-1);
    f*=i;
    f%=m;
    fr2[i]=f;
    fr2[i]+=fr2[i-1];
    fr2[i]%=m;
  }
  for(int i=0;i<n;i++){
    i64 left= Pow(10,n-i-1)*frr[i];
    left%=m;
    left*=(s[i]-'0');
    left%=m;
    ans+=left;ans%=m;
    i64 right=fr2[n-i-1];
    right%=m;
    right*=(s[i]-'0') ;right%=m;
    ans+=right; ans%=m;
  }
  cout<<ans<<endl;
}
 
int main() {
cin.tie(0), ios_base::sync_with_stdio(false);
solve();
return 0;
}