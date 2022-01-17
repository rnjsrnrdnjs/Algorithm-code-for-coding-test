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
#define MS(A,B) memset(A,B,sizeof(A));
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
inline i64 Pow(i64 x,i64 n,i64 m){i64 r=1;while(n){if(n&1){r=(r*x)%m;}x=(x*x)%m;n>>=1;}return r;}
 
template <class T> ostream& operator<<(ostream& os, vector<T> v) {
	os << "[";
	int cnt = 0;
	for (auto vv : v) { os << vv; if (++cnt < v.size()) os << ","; }
	return os << "]";
}
template <class L, class R> ostream& operator<<(ostream& os, map<L, R> v) {
	os << "[";
	int cnt = 0;
	for (auto vv : v) { os << vv; if (++cnt < v.size()) os << ","; }
	return os << "]";
}
template <class L, class R> ostream& operator<<(ostream& os, pair<L, R> p) {
	return os << "(" << p.fi << "," << p.se << ")";
}
// ........................fuction2.......................... //

int tb[101][101]{0,};
deque<ii> dq;
vector<pair<int,char>> xc;
int s=0;
int d[4][2]={{0,1},{1,0},{0,-1},{-1,0}};
// ........................main.......................... //
void solve() {
	int n,k;cin>>n>>k;
	for(int i=0;i<k;i++){
		int y,x;cin>>y>>x;tb[y-1][x-1]=1;
	}
	int l;cin>>l;
	for(int i=0;i<l;i++){
		int x;char c;cin>>x>>c;
		xc.pb({x,c});
	}
	int ans=0;
	int idx=0;
	int x=0;
	int y=0;
	dq.push_back({0,0});
	tb[y][x]=2;
	
	while(true){
		ans++;
		int dy=d[s][0]+dq.back().fi;
		int dx=d[s][1]+dq.back().se;
		if( !(0<=dy && dy<n)||!(0<=dx && dx<n) || tb[dy][dx]==2 ){
			break;
		}
		if(tb[dy][dx]==0){
			tb[dq.front().fi][dq.front().se]=0;
			dq.pop_front();
		}
		tb[dy][dx]=2;
		dq.push_back({dy,dx});
		
		if(idx<xc.size()){
		if(ans==xc[idx].fi){
			if(s==0){
			if(xc[idx].se=='L')s=3;
			if(xc[idx].se=='D')s=1;	
			}
			else if(s==1){
			if(xc[idx].se=='L')s=0;
			if(xc[idx].se=='D')s=2;
			}		
			else if(s==2){
			if(xc[idx].se=='L')s=1;
			if(xc[idx].se=='D')s=3;		
			}
			else if(s==3){
			if(xc[idx].se=='L')s=2;
			if(xc[idx].se=='D')s=0;
			}
			idx++;
		}
		}
	}
	cout<<ans<<endl;	
}
		
int main() {
	cin.tie(0), ios_base::sync_with_stdio(false);
	solve();
	return 0;
}