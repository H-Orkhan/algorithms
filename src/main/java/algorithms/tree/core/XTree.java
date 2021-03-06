package algorithms.tree.core;

public interface XTree<T> {
  void add(T value);
  boolean contains(T value);
  void remove(T value);
}
