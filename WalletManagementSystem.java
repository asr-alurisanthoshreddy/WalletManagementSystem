package WalletManagementSystem;
import java.util.*;
class user {
int userId;
int balance;
public user(int userId, int balance) { 
this.userId = userId;
this.balance = balance;
    }
}
public class WalletManagementSystem{
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
        int N = scanner.nextInt();
        List<user> users = new ArrayList<>(); 
        for (int i = 0; i < N; i++) { int userId = scanner.nextInt();
int balance = scanner.nextInt();
users.add(new user(userId, balance));
        }
int T = scanner.nextInt();
for (int i = 0; i < T; i++) {int from_userId = scanner.nextInt();
int to_userId = scanner.nextInt();
int amount = scanner.nextInt();
            user sender = null;
            user receiver = null;
for (user user : users) {
                if (user.userId == from_userId) {
                    sender = user;
                } else if (user.userId == to_userId) {
                    receiver = user;
}
}
if (sender != null && receiver != null && sender.balance >= amount) {sender.balance -= amount;
receiver.balance += amount;
System.out.println("Success");
            } else {
System.out.println("Failure");
            }
        }
System.out.println();
users.sort(Comparator.comparingInt(u -> u.balance));
for (user user : users) {
System.out.println(user.userId + " " + user.balance);
}
    }}}
