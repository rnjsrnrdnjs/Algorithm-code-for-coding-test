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
 struct node {
	char left;
	char right;
};
node Tree[100];
void preorder(char root) {
	if (root == '.')return;
	cout << root;
	preorder(Tree[root].left);
	preorder(Tree[root].right);
}
void inorder(char root) {
	if (root == '.')return;
	inorder(Tree[root].left);
	cout << root;
	inorder(Tree[root].right);
}
void postorder(char root) {
	if (root == '.')return;
	postorder(Tree[root].left);
	postorder(Tree[root].right);
	cout << root;
}
// ..........................main............................//
void solve() {
	int n; cin >> n;
	for (int i = 1; i <= n; i++) {
		char t1, t2, t3; cin >> t1 >> t2 >> t3;
		Tree[t1].left = t2;
		Tree[t1].right = t3;
	}
	preorder('A'); cout << endl;
	inorder('A'); cout << endl;
	postorder('A'); cout << endl;
}

int main() {
	cin.tie(0), ios_base::sync_with_stdio(false);
	solve();
	return 0;
}