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
// ........................fuction1.......................... //


// ........................fuction2.......................... //

int City[51][51]{0,};
int answer=1e9;
int n,m;
int v[14]{0,};

vii choice_chicken;
vii house;

void dfs(int cnt,int cho){
	if(cnt>choice_chicken.size())return ;
	if(cho==m){
		int sum=0;
		for(int i=0;i<house.size();i++){
			int d=1e9;
			for(int j=0;j<choice_chicken.size();j++){
				if(v[j])
				d=min(d,abs(house[i].fi-choice_chicken[j].fi)+abs(house[i].se-choice_chicken[j].se));
			}
			sum+=d;
		}
		answer=min(answer,sum);
		return ;
	}
	v[cnt]=1;
	dfs(cnt+1,cho+1);
	v[cnt]=0;
	dfs(cnt+1,cho);
}
// ........................main.......................... //
void solve() {
	cin>>n>>m;
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
			cin>>City[i][j];
			if(City[i][j]==1)house.pb({i,j});
			if(City[i][j]==2)choice_chicken.pb({i,j});
		}
	}
	dfs(0,0);
	cout<<answer<<endl;
}
		
int main() {
	cin.tie(0), ios_base::sync_with_stdio(false);
	solve();
	return 0;
}