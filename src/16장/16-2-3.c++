#include <bits/stdc++.h>
using namespace std;
// ........................macro k.......................... //
#define FOR(i, f, n) for(int (i) = (f); (i) < (int)(n); ++(i))
#define RFOR(i, f, n) for(int (i) = (f); (i) > (int)(n); --(i))
#define FER(i, f, n) for(int (i) = (f); (i) <= (int)(n); ++(i))
#define RFER(i, f, n) for(int (i) = (f); (i) >= (int)(n); --(i))
#define pb push_back
#define fi first
#define se second
#define endl '\n'
#define sz(A) (int)(A).size()
#define ALL(A) A.begin(), A.end()
#define ub(A,B) upper_bound(ALL(A), B) - A.begin()
#define lb(A,B) lower_bound(ALL(A), B) - A.begin()
#define UNIQUE(c) (c).resize(unique(ALL(c)) - (c).begin())  //벡터에서 중복된수 제거 
 
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
inline i64 gcd(i64 a, i64 b) { if (a % b == 0)return b; else { return gcd(b, a % b); } }
inline i64 lcm(i64 a, i64 b) { return a * b / gcd(a, b); }
inline i64 gaus(i64 a, i64 b) { return (a + b) * (b - a + 1) / 2; }
 
// ........................fuction.......................... //
 
i64 mo[1001]{0,};
 
// ........................main.......................... //
void solve() {
	i64 n,m;cin>>n>>m;
	vi64 a(n);
	for(int i=0;i<n;i++){
		cin>>a[i];
		mo[a[i]%m]++;
	}
	bool tof=true;
	for(int i=0;i<1000;i++){
		if(mo[i]>1)tof=false;
	}
	if(!tof)cout<<0<<endl;
	else{
		i64 ans=1;
		for(int i=0;i<n-1;i++){
			for(int j=i+1;j<n;j++){
				i64 cmp=a[i]<a[j]?a[j]-a[i]:a[i]-a[j];
				ans*=cmp;
				ans%=m;
				
			}
		}
		cout<<ans%m<<endl;
	}
	
}
		
int main() {
	cin.tie(0), ios_base::sync_with_stdio(false);
	solve();
	return 0;
}