package android.support.v4.d;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.HandlerThread;
import android.os.Message;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public final class c
{
  private Handler.Callback Ku = new Handler.Callback()
  {
    public final boolean handleMessage(Message arg1)
    {
      switch (???.what)
      {
      default:
      case 1:
      case 0:
      }
      while (true)
      {
        return true;
        c localc1 = c.this;
        ((Runnable)???.obj).run();
        synchronized (localc1.mLock)
        {
          localc1.mHandler.removeMessages(0);
          localc1.mHandler.sendMessageDelayed(localc1.mHandler.obtainMessage(0), localc1.Kv);
        }
        c localc2 = c.this;
        synchronized (localc2.mLock)
        {
          if (!localc2.mHandler.hasMessages(1));
        }
        localObject2.mThread.quit();
        localObject2.mThread = null;
        localObject2.mHandler = null;
      }
    }
  };
  final int Kv;
  private int mGeneration;
  Handler mHandler;
  final Object mLock = new Object();
  private final int mPriority;
  HandlerThread mThread;
  private final String mThreadName;

  public c(String paramString)
  {
    this.mThreadName = paramString;
    this.mPriority = 10;
    this.Kv = 10000;
    this.mGeneration = 0;
  }

  // ERROR //
  public final <T> T a(final Callable<T> paramCallable, int paramInt)
  {
    // Byte code:
    //   0: new 55	java/util/concurrent/locks/ReentrantLock
    //   3: dup
    //   4: invokespecial 56	java/util/concurrent/locks/ReentrantLock:<init>	()V
    //   7: astore_3
    //   8: aload_3
    //   9: invokevirtual 60	java/util/concurrent/locks/ReentrantLock:newCondition	()Ljava/util/concurrent/locks/Condition;
    //   12: astore 4
    //   14: new 62	java/util/concurrent/atomic/AtomicReference
    //   17: dup
    //   18: invokespecial 63	java/util/concurrent/atomic/AtomicReference:<init>	()V
    //   21: astore 5
    //   23: new 65	java/util/concurrent/atomic/AtomicBoolean
    //   26: dup
    //   27: iconst_1
    //   28: invokespecial 68	java/util/concurrent/atomic/AtomicBoolean:<init>	(Z)V
    //   31: astore 6
    //   33: aload_0
    //   34: new 12	android/support/v4/d/c$3
    //   37: dup
    //   38: aload_0
    //   39: aload 5
    //   41: aload_1
    //   42: aload_3
    //   43: aload 6
    //   45: aload 4
    //   47: invokespecial 71	android/support/v4/d/c$3:<init>	(Landroid/support/v4/d/c;Ljava/util/concurrent/atomic/AtomicReference;Ljava/util/concurrent/Callable;Ljava/util/concurrent/locks/ReentrantLock;Ljava/util/concurrent/atomic/AtomicBoolean;Ljava/util/concurrent/locks/Condition;)V
    //   50: invokevirtual 75	android/support/v4/d/c:f	(Ljava/lang/Runnable;)V
    //   53: aload_3
    //   54: invokevirtual 78	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   57: aload 6
    //   59: invokevirtual 82	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   62: ifne +15 -> 77
    //   65: aload 5
    //   67: invokevirtual 85	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   70: astore_1
    //   71: aload_3
    //   72: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   75: aload_1
    //   76: areturn
    //   77: getstatic 94	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   80: iload_2
    //   81: i2l
    //   82: invokevirtual 98	java/util/concurrent/TimeUnit:toNanos	(J)J
    //   85: lstore 7
    //   87: aload 4
    //   89: lload 7
    //   91: invokeinterface 103 3 0
    //   96: lstore 9
    //   98: aload 6
    //   100: invokevirtual 82	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   103: ifne +16 -> 119
    //   106: aload 5
    //   108: invokevirtual 85	java/util/concurrent/atomic/AtomicReference:get	()Ljava/lang/Object;
    //   111: astore_1
    //   112: aload_3
    //   113: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   116: goto -41 -> 75
    //   119: lload 9
    //   121: lstore 7
    //   123: lload 9
    //   125: lconst_0
    //   126: lcmp
    //   127: ifgt -40 -> 87
    //   130: new 53	java/lang/InterruptedException
    //   133: astore_1
    //   134: aload_1
    //   135: ldc 105
    //   137: invokespecial 107	java/lang/InterruptedException:<init>	(Ljava/lang/String;)V
    //   140: aload_1
    //   141: athrow
    //   142: astore_1
    //   143: aload_3
    //   144: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   147: aload_1
    //   148: athrow
    //   149: astore_1
    //   150: lload 7
    //   152: lstore 9
    //   154: goto -56 -> 98
    //
    // Exception table:
    //   from	to	target	type
    //   57	71	142	finally
    //   77	87	142	finally
    //   87	98	142	finally
    //   98	112	142	finally
    //   130	142	142	finally
    //   87	98	149	java/lang/InterruptedException
  }

  final void f(Runnable paramRunnable)
  {
    synchronized (this.mLock)
    {
      if (this.mThread == null)
      {
        Object localObject2 = new android/os/HandlerThread;
        ((HandlerThread)localObject2).<init>(this.mThreadName, this.mPriority);
        this.mThread = ((HandlerThread)localObject2);
        this.mThread.start();
        localObject2 = new android/os/Handler;
        ((Handler)localObject2).<init>(this.mThread.getLooper(), this.Ku);
        this.mHandler = ((Handler)localObject2);
        this.mGeneration += 1;
      }
      this.mHandler.removeMessages(0);
      this.mHandler.sendMessage(this.mHandler.obtainMessage(1, paramRunnable));
      return;
    }
  }

  public static abstract interface a<T>
  {
    public abstract void D(T paramT);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.d.c
 * JD-Core Version:    0.6.2
 */