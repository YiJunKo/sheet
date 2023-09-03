public interface Observer {
    /**
     * 訂閱者(User)
     */
    public void createUser(String user);
    public void createSheet(String userName, String sheetName);
    public void shareSheet(String userName, String sheetName, String shareUserName);
}
