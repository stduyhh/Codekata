public int Solution (int n) {
    int answer = 0;
    for (int i = 0; i <= n; i++){
        if (n % i == 0){
            answer += i;
        }
    }
    return answer;
}

void main() {
}
