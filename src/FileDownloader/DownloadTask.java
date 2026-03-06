package FileDownloader;

class DownloadTask implements Runnable {
    private int partNumber;

    public DownloadTask(int partNumber) {
        this.partNumber = partNumber;
    }

    @Override
    public void run() {
        System.out.println(
                Thread.currentThread().getName() +
                        " started downloading part " + partNumber
        );

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(
                Thread.currentThread().getName() +
                        " finished downloading part " + partNumber
        );
    }
}
