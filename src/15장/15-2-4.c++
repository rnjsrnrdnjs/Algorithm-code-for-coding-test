#include <bits/stdc++.h>
using namespace std;
// ........................macro 090.......................... //
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
#define UNIQUE(c) (c).resize(unique(ALL(c)) - (c).begin())  //벡터에서 중복된수 제거

typedef pair<int, int> ii;
typedef pair<int, ii> iii;
typedef vector<int> vi;
typedef vector<string> vs;
typedef vector<vi> vvi;
typedef vector<ii> vii;
typedef vector<vii> vvii;
typedef long long i64;
typedef unsigned long long ui64;
inline i64 gcd(i64 a, i64 b) { if (a % b == 0)return b; else { return gcd(b, a % b); } }
inline i64 lcm(i64 a, i64 b) { return a * b / gcd(a, b); }
// ........................fuction.......................... //

int n, m;
queue<ii> q;
int isinside[4][2] = { {0,1},{1,0},{0,-1},{-1,0} };
int lab[9][9];
int visit[9][9];
int visit2[9][9]{ 0, };
int ans = 0;
int cc;
void bfs() {
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			visit[i][j] = lab[i][j];
			if (lab[i][j]==2) {
				q.push(make_pair(i, j));
			}
		}
	}
	while (!q.empty()) {
		int y = q.front().first;
		int x = q.front().second;
		visit[y][x] = 1;
		q.pop();
		for (int i = 0; i < 4; i++) {
			int dy = y + isinside[i][0];
			int dx = x + isinside[i][1];
			if (0<=dy && dy<n && 0<=dx && dx<m && lab[dy][dx]==0 && visit[dy][dx]==0) {
				q.push(make_pair(dy,dx));
				visit[dy][dx] = 1;
			}
		}
	}
	cc = 0;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			if (lab[i][j] == 0 && !visit[i][j]) {
				cc++;
			}
		}
	}
	ans = max(ans, cc);
}
void three(int cnt) {
	if (cnt == 3) {
		bfs();
	}
	else {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (visit2[i][j]==0 && lab[i][j] == 0) {
					visit2[i][j] = 1;
					lab[i][j] = 1;
					three(cnt + 1);
					lab[i][j] = 0;
					visit2[i][j] = 0;
				}
			}
		}
	}
}
// ........................main.......................... //
void solve() {
	cin >> n >> m;
	for (int i = 0; i < n; i++) {
		for (int j = 0; j < m; j++) {
			cin >> lab[i][j];
		}
	}
	three(0);
	cout << ans << endl;
}

int main() {
	cin.tie(0), ios_base::sync_with_stdio(false);
	solve();
	return 0;
}