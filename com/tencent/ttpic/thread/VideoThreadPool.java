package com.tencent.ttpic.thread;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;

public class VideoThreadPool
{
  private static final int CORE_POOL_SIZE;
  private static final int CPU_COUNT;
  private static final int MAXIMUM_POOL_SIZE;
  private static String TAG;
  private ThreadPoolExecutor DUAL_THREAD_EXECUTOR;
  private final ThreadFactory sThreadFactory;

  static
  {
    AppMethodBeat.i(83797);
    TAG = VideoThreadPool.class.getSimpleName();
    int i = Runtime.getRuntime().availableProcessors();
    CPU_COUNT = i;
    CORE_POOL_SIZE = i * 2 + 1;
    MAXIMUM_POOL_SIZE = CPU_COUNT * 10 + 1;
    AppMethodBeat.o(83797);
  }

  private VideoThreadPool()
  {
    AppMethodBeat.i(83793);
    this.sThreadFactory = new VideoThreadFactory(10);
    init();
    AppMethodBeat.o(83793);
  }

  public static VideoThreadPool getInstance()
  {
    AppMethodBeat.i(83792);
    VideoThreadPool localVideoThreadPool = VideoThreadPool.VideoThreadPoolHolder.access$100();
    AppMethodBeat.o(83792);
    return localVideoThreadPool;
  }

  public ThreadPoolExecutor getDualThreadExecutor()
  {
    try
    {
      ThreadPoolExecutor localThreadPoolExecutor = this.DUAL_THREAD_EXECUTOR;
      return localThreadPoolExecutor;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public void init()
  {
    AppMethodBeat.i(83796);
    this.DUAL_THREAD_EXECUTOR = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 500L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), this.sThreadFactory, new ThreadPoolExecutor.DiscardOldestPolicy());
    this.DUAL_THREAD_EXECUTOR.allowCoreThreadTimeOut(true);
    AppMethodBeat.o(83796);
  }

  public void shutdown()
  {
    AppMethodBeat.i(83795);
    this.DUAL_THREAD_EXECUTOR.shutdownNow();
    try
    {
      while (!this.DUAL_THREAD_EXECUTOR.awaitTermination(500L, TimeUnit.MILLISECONDS))
      {
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>("[clear] thread pool active count = ");
        localStringBuilder.append(getInstance().getDualThreadExecutor().getActiveCount());
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      AppMethodBeat.o(83795);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(83795);
    }
  }

  public void submit(Runnable paramRunnable)
  {
    AppMethodBeat.i(83794);
    this.DUAL_THREAD_EXECUTOR.execute(paramRunnable);
    AppMethodBeat.o(83794);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.thread.VideoThreadPool
 * JD-Core Version:    0.6.2
 */