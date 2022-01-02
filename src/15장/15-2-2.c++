#include <bits/stdc++.h>
using namespace std;
// ........................macro 090.......................... //
#define FER(i, f, n) for(int (i) = (f); (i) <= (int)(n); ++(i))
#define RFER(i, f, n) for(int (i) = (f); (i) >= (int)(n); --(i))
#define FOR(i, f, n) for(int (i) = (f); (i) < (int)(n); ++(i))
#define RFOR(i, f, n) for(int (i) = (f); (i) > (int)(n); --(i))
#define pb push_back
#define pf push_front
#define emb emplace_back
#define fi first
#define se second
#define endl '\n'
#define sz(A) (int)(A).size()
#define ALL(A) A.begin(), A.end()
#define UNIQUE(c) (c).resize(unique(ALL(c)) - (c).begin())

typedef pair<int, int> ii;
typedef pair<int, ii> iii;
typedef vector<int> vi;
typedef vector<string> vs;
typedef vector<vi> vvi;
typedef vector<ii> vii;
typedef vector<vii> vvii;
typedef long long i64;
typedef unsigned long long ui64;
inline int min(int x, int y) { return x > y ? y : x; }
inline int max(int x, int y) { return x > y ? x : y; }
// ......................function......................... //
int N,M;
int miro[101][101]{ -1 };
int inside[4][2] = { {-1,0},{0,-1},{1,0},{0,1} };
queue <ii> q;
void bfs() {
	q.push(make_pair(0, 0));
	ii current;
	
	while (!q.empty()) {
		current= q.front();
		q.pop();
		for (int i = 0; i < 4; i++) {
			int dx = current.first+ inside[i][0];
			int dy = current.second + inside[i][1];
			if (0 <= dx && dx < N && 0 <= dy && dy < M && miro[dx][dy] == 1) {
				q.push(make_pair(dx, dy));
				miro[dx][dy] = miro[current.first][current.second] + 1;
			}
		}
	}
}


// ........................main.......................... //

void solve() {
	 cin >> N>>M;
	 string str;
	for (int i = 0; i < N; i++) {
		cin >> str;
		for (int j = 0; j < M; j++) {
			if (str[j]=='0') {
				miro[i][j] =0;
			}
			else {
				miro[i][j] = 1;
			}
		}
	}
	bfs();
	cout << miro[N - 1][M - 1];
}

int main() {
	cin.tie(0), ios_base::sync_with_stdio(false);
	solve();
	return 0;
}
