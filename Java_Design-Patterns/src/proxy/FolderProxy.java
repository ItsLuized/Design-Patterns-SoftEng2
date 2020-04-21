package proxy;

public class FolderProxy implements IFolder {

    Folder folder;
    User user;

    public FolderProxy(User user) {
        this.user = user;
    }

    @Override
    public void performOperations() {
        if (this.user.getUserName().equalsIgnoreCase("Luis") & this.user.getPassword().equalsIgnoreCase("SecretPassword")) {
            this.folder = new Folder();
            this.folder.performOperations();
        } else System.out.println("You don't have access to this folder");
    }
}
