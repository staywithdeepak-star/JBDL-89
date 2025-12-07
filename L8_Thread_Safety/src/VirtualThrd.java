public class VirtualThrd {

    /**
     * Threads created so far were being created on the hardware / OS which is usually time taking as there's call
     * from your applications layer to your hardware layer via kernel.
     * They are known as platform threads

     * But in Java 21 introduced a concept of Virtual threads.
     * These are lightweight threads created and managed by JVM itself without any intervention of OS.
     *
     *
     * Virtual thread by nature do not run on the cpu core, JVM whenever it needs to make any virtual thread execute, they
     * run it on a core by passing them to platform threads (carrier threads)
     *
     * Virtual threads are not at suited for CPU intensive tasks because JVM would have to make them run on cpu core, if they
     * perform some heavy operation, they are best suited for I/O tasks where they can wait for the response coming from a
     * downstream (some other) service.
     */

    public static void main(String[] args) {

        Thread.ofVirtual().start(
                () -> System.out.println("Inside run, thread = " + Thread.currentThread().getName())
        );
    }
}
