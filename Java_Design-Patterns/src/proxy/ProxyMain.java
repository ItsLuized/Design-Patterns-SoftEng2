package proxy;


public class ProxyMain {

    public static void main(String[] args) {

        FolderProxy folderProxy = new FolderProxy(new User("Luis", "SecretPassword"));
        System.out.println("When userName and password are correct:");
        folderProxy.performOperations();

        FolderProxy folderProxyWrong = new FolderProxy(new User("Amanda", "WrongPassword"));
        System.out.println("When userName and password are incorrect:");
        folderProxyWrong.performOperations();
    }
}
