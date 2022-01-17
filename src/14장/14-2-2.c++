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
int bruteforce(int x, int y, vector<vector<char>> arr){
	char War[8][8] ={ { 'W','B','W','B','W','B','W','B'}, //w 0
					{'B','W','B','W','B','W','B','W' },
					{ 'W','B','W','B','W','B','W','B'}, //w 0
					{'B','W','B','W','B','W','B','W' },
					{ 'W','B','W','B','W','B','W','B'}, //w 0
					{'B','W','B','W','B','W','B','W' },
					{ 'W','B','W','B','W','B','W','B'}, //w 0
					{'B','W','B','W','B','W','B','W' }};
	int Bar[8][8]= {{'B','W','B','W','B','W','B','W' },
					{ 'W','B','W','B','W','B','W','B'}, //w 0
					{'B','W','B','W','B','W','B','W' },
					{ 'W','B','W','B','W','B','W','B'}, //w 0
					{'B','W','B','W','B','W','B','W' },
					{ 'W','B','W','B','W','B','W','B'}, //w 0
					{'B','W','B','W','B','W','B','W' },
					{ 'W','B','W','B','W','B','W','B'}};
	int wcnt = 0;
	int bcnt = 0;

	for (int i = x; i < x + 8; i++) {//w
		for (int j = y; j < y + 8; j++) {
			if (i%2==0) {
				if (j%2==0) {
					if (arr[i][j]!='W') {
						wcnt++;
					}
				}
				else {
					if (arr[i][j] != 'B') {
						wcnt++;
					}
				}
			}
			else {
				if (j % 2 == 0) {
					if (arr[i][j] != 'B') {
						wcnt++;
					}
				}
				else {
					if (arr[i][j] != 'W') {
						wcnt++;
					}
				}
			}
		}
	}
	for (int i = x; i < x + 8; i++) {//b
		for (int j = y; j <y + 8; j++) {
			if (i % 2 == 0) {
				if (j % 2 == 0) {
					if (arr[i][j] != 'B') {
						bcnt++;
					}
				}
				else {
					if (arr[i][j] != 'W') {
						bcnt++;
					}
				}
			}
			else {
				if (j % 2 == 0) {
					if (arr[i][j] != 'W') {
						bcnt++;
					}
				}
				else {
					if (arr[i][j] != 'B') {
						bcnt++;
					}
				}
			}
		}
	}
	return min(wcnt, bcnt);
}

// ........................main.......................... //
void solve() {
	int N, M; cin >> N >> M;
	vector<vector<char>> arr(N, vector<char>(M));
	for (int i = 0; i < N; i ++ ) {
		for (int j = 0; j < M; j++) {
			cin>>arr[i][j];
		}
	}

	int mn = 2147483647;
	for (int i = 0; i < N-7; i++) {
		for (int j = 0; j < M-7; j++) {
			mn = min(mn, bruteforce(i,j,arr));
		}
	}
	cout << mn;
}
int main() {
	cin.tie(0), ios_base::sync_with_stdio(false);
	solve();
	return 0;
}