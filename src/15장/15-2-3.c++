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
// ........................fuction1.......................... //
 
// ........................fuction2.......................... //
int n, m;
queue<pair<ii,int>> q;
int tb[1002][1002];
int visit[1001][1001][2];
int isinside[4][2] = { {0,1},{1,0},{0,-1},{-1,0} };
void bfs() {
	memset(visit, 0, sizeof(visit));
	visit[1][1][1] = 1;
	while (!q.empty()) {
		int y = q.front().first.first;
		int x = q.front().fi.second;
		int bomb = q.front().second;
		q.pop();
		if (y == n && x == m) {
			cout << visit[n][m][bomb] << endl;
			return;
		}
		for (int i = 0; i < 4; i++) {
			int dy = y + isinside[i][0];
			int dx = x + isinside[i][1];
			if (1<=dy && dy<=n && 1<=dx && dx<=m) {
				if (tb[dy][dx]==1 && bomb  ) {
					q.push({ {dy, dx},0 });
					visit[dy][dx][0] = visit[y][x][bomb] + 1;
				}
				else if (tb[dy][dx] == 0 && !visit[dy][dx][bomb]) {
					q.push({ {dy, dx},bomb });
					visit[dy][dx][bomb] = visit[y][x][bomb] + 1;

				}
			}
		}
	}
	cout << -1 << endl;
}
// ........................main.......................... //
void solve() {
	cin >> n >> m;
	for (int i = 1; i <= n; i++) {
		string tmp; cin >> tmp;
		for (int j = 1; j <= m; j++) {
			tb[i][j] = tmp[j - 1]-'0';
		}
	}
	int ans = -1;
	q.push({ {1,1},1 });
	bfs();
}
 
int main() {
	cin.tie(0), ios_base::sync_with_stdio(false);
	solve();
	return 0;
}