package programmers;

public class Num87946 {

    int len = 0;
    int max = 0;
    int k = 0;
    int[][] dungeons;

    public int solution(int k, int[][] dungeons) {
        this.dungeons = dungeons;
        this.k = k;
        this.len = dungeons.length;

        this.dfs(new int[this.len], 1);

        return this.max;
    }

    private void dfs(int[] oldArr, int idx){
        // 복사
        int[] arr = new int[this.len];
        for(int i = 0; i < this.len; i++){
            arr[i] = oldArr[i];
        }

        for(int i = 0; i < this.len; i++){
            if(arr[i] == 0){
                arr[i] = idx;

                // 마지막 idx일때
                if(idx == this.len){
                    int cnt = 0;
                    int kk = this.k;

                    // 던전 탐색
                    for(int j = 0; j < this.len; j++){
                        if(dungeons[arr[j] - 1][0] <= kk){
                            kk -= dungeons[arr[j] - 1][1];
                            cnt = j + 1;
                        }
                        else {
                            break;
                        }
                    }
                    if(cnt > this.max) this.max = cnt;

                    return;
                }

                // 다음으로
                dfs(arr, idx + 1);
                arr[i] = 0;
            }
        }
    }

    class OtherSolution {
        public int answer = 0;
        public boolean[] visited;
        public int solution(int k, int[][] dungeons) {
            visited = new boolean[dungeons.length];
            dfs(k, 0, dungeons);
            return answer;
        }

        public void dfs(int k, int count, int[][] dungeons) {
            answer = Math.max(answer, count);
            for (int i = 0; i < dungeons.length; i++) {
                if (!visited[i] && k >= dungeons[i][0]) {
                    visited[i] = true;
                    dfs(k - dungeons[i][1], count + 1, dungeons);
                    visited[i] = false;
                }
            }
        }
    }
}

