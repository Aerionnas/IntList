public class IntList {

  private int size = 0;
  private int[] list = new int[30];

  public void add(int val) {
    if (size >= list.length) {
      expandList();
    }
    list[size] += val;
    size = size + 1;
  }

  private void expandList() {
    int[] oldList = list;
    list = new int[size * 2];
    for (int i = 0; i < size; i++) {
      list[i] = oldList[i];
    }
  }

  public void set(int i, int j) {
    list[i] = j;
  }

  public int get(int val) {
    return list[val];
  }

  public int size() {
    return size + 1;
  }
}
