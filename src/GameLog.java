public class GameLog {
    // 클래스 안에 클래스가 있는 경우, 내부 클래스는 static을 권장함.
    public static class LogEntry {
        private String message;

        public LogEntry(String message) {
            this.message = message;
        }

        public void print() {
            System.out.println("[Log]" +  message);
        }
    }



}
