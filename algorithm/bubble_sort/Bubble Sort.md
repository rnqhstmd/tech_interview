## 개념
- 거품 정렬은 선택 정렬과 비슷하다.
- 서로 인접한 두 원소의 대소를 비교 후 조건에 맞지 않다면 자리를 교환하여 정렬하는 알고리즘이다.
## 동작 과정
- 1회전 시 모든 원소들은 자기의 오른쪽에 있는 원소와 비교한다. 그럼 n-1 번째 원소와 n번째 원소가 비교 후 조건에 맞지 않으면 교환한다.
- 2회전 시 가장 큰 원소가 n번째로 이동되므로 n번째 원소는 정렬에서 제외된다.
- 회전 차수가 높아질수록 정렬에서 제외되는 원소가 하나씩 늘어나게 된다.
## 시간 복잡도
- (n-1) + (n-2) + (n-3)...2 + 1 이므로 n(n-1)/2 이므로 O(n^2) 이다.
- 거품 정렬은 정렬이 되있던 안 되있던 모두 시간 복잡도가 O(n^2)로 동일하다.
## 공간 복잡도
- 주어진 배열 안에서 교환이기에 O(n) 이다.
## 장점
- 구현이 간단하고 소스코드가 직관적
- 제자리 정렬이다. = 정렬하고자 하는 배열 안에서 교환하는 방식으로 다른 메모리 공간이 필요하지 않다.
- 안정 정렬(Stable Sort)이다.
## 단점
- 시간복잡도가 모두 O(n^2)인만큼 비효율적이다.
- 정렬되어있지 않는 원소가 제자리로 돌아가기위해 교환 연산이 많이 일어난다.