package exception.ex4;

public class NetworkService2 {
    public void sendMessage(String data) {
        String address = "https://example.com";

        try (NetworkClient2 client = new NetworkClient2(address)) {
            client.initError(data);
            client.connect();
            client.send(data);
        } catch (Exception e) {
            System.out.println("[예외 확인]: " + e.getMessage());
            throw e;
        }
    }
}
