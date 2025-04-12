import java.util.*;
import java.io.*;

public class Main {
	static class MinHeap {
		private List<Integer> heap;

		public MinHeap() {
			this.heap = new ArrayList<>();
		}

		public void insert(int value) {
			heap.add(value);
			heapifyUp(heap.size() - 1);
		}

		private void heapifyUp(int index) {
			while (index > 0) {
				int parentIndex = (index - 1) / 2;
				// 부모 노드의 절댓값이 작을 때
				if (Math.abs(heap.get(parentIndex)) < Math.abs(heap.get(index))) {
					break;
				}
				// 부모 노드와 자식 노드의 절댓값이 같을 때
				else if(Math.abs(heap.get(parentIndex)) == Math.abs(heap.get(index))) {
					// 부모 노드가 음수이면
					if(heap.get(parentIndex) < heap.get(index)) {
						break;
					}
					// 부모 노드와 자식노드의 부호가 같거나, 자식 노드의 부호가 음수이면 
				}
				swap(parentIndex, index);
				index = parentIndex;
			}
		}

		public int remove() {
			if (heap.isEmpty())
				throw new IllegalStateException("Heap is empty");
			int min = heap.get(0);
			int end = heap.remove(heap.size() - 1);
			if (!heap.isEmpty()) {
				heap.set(0, end);
				heapifyDown(0);
			}
			return min;
		}

		private void heapifyDown(int index) {
			while (index < heap.size()) {
				int left = 2 * index + 1;
				int right = 2 * index + 2;
				int smallest = index;
				
				// 왼쪽 자식 노드의 절댓값이 현재 노드의 절댓값보다 작으면
				if (left < heap.size() && Math.abs(heap.get(left)) 
						< Math.abs(heap.get(smallest))) {
					smallest = left;
				}
				// 왼쪽 자식 노드와 현재 노드의 절댓값이 같으면
				else if(left < heap.size() && Math.abs(heap.get(left)) 
						== Math.abs(heap.get(smallest))) {
					// 왼쪽 자식 노드의 값이 음수이면
					if(heap.get(left) < heap.get(smallest)) {
						smallest = left;
					}
					// 왼쪽 자식 노드와 부호가 같거나 현재 노드의 부호가 음수이면 그대로
				}
				
				// 오른쪽 자식 노드의 절댓값이 현재 노드의 절댓값보다 작으면
				if (right < heap.size() && Math.abs(heap.get(right)) 
						< Math.abs(heap.get(smallest))) {
					smallest = right;
				}
				// 오른쪽 자식 노드와 현재 노드의 절댓값이 같으면
				else if(right < heap.size() && Math.abs(heap.get(right)) 
						== Math.abs(heap.get(smallest))) {
					// 오른쪽 자식 노드의 값이 음수이면
					if(heap.get(right) < heap.get(smallest)) {
						smallest = right;
					}
					// 오른쪽 자식 노드와 부호가 같거나 현재 노드의 부호가 음수이면 그대로
				}
				if (smallest == index)
					break;
				swap(index, smallest);
				index = smallest;
			}
		}

		public boolean isEmpty() {
			return heap.isEmpty();
		}

		private void swap(int i, int j) {
			int temp = heap.get(i);
			heap.set(i, heap.get(j));
			heap.set(j, temp);
		}
	}
	
	public static void main(String[] args) throws IOException{
		MinHeap heap = new MinHeap();
		StringBuilder sb = new StringBuilder();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			int x = Integer.parseInt(br.readLine());
			if(x != 0) {
				heap.insert(x);
			}
			else if(!heap.isEmpty() && x == 0) {
				sb.append(heap.remove() + "\n");
			}
			else if(heap.isEmpty()) {
				sb.append(0 + "\n");
			}
		}
		System.out.println(sb.toString());
	}
}
