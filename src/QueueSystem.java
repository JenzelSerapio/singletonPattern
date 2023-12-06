import java.util.LinkedList;
import java.util.Queue;

    class QueueSystem {
        private Queue<Integer> queue;

        public QueueSystem() {
            this.queue = new LinkedList<>();
        }

        public void enqueue(int number) {
            queue.add(number);
        }

        public int dequeue() {
            if (queue.isEmpty()) {
                System.out.println("QUEUE IS NOW EMPTY.");
                return -1;
            }
            return queue.poll();
        }

        public void resetQueue(int nextNumber) {
            queue.clear();
            enqueue(nextNumber);
        }

        public int getCurrentQueueNumber() {
            if (queue.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            return queue.peek();
        }
    }

