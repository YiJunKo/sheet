public interface Subject {
    /**
     * 被訂閱者(Sheet)
     */
    abstract void printSheet();
    abstract double changeSheet(int colume, int row, String operation);
}
