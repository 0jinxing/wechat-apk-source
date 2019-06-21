package com.tencent.mm.a;

import android.os.HandlerThread;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class b
{
  static ak cbT;
  File cbQ;
  private ReentrantLock cbR = new ReentrantLock();
  private Condition cbS = this.cbR.newCondition();

  public b(final String paramString)
  {
    while (true)
    {
      try
      {
        if (cbT == null)
        {
          HandlerThread localHandlerThread = new android/os/HandlerThread;
          localHandlerThread.<init>("I/O Worker");
          localHandlerThread.start();
          localObject = new com/tencent/mm/sdk/platformtools/ak;
          ((ak)localObject).<init>(localHandlerThread.getLooper());
          cbT = (ak)localObject;
        }
        Object localObject = new File(paramString);
        if (((File)localObject).exists())
        {
          this.cbQ = ((File)localObject);
          return;
        }
      }
      finally
      {
      }
      ab.i("MicroMsg.ConcurrentFileBuilder", "create new file %s", new Object[] { paramString });
      cbT.post(new Runnable()
      {
        public final void run()
        {
          File localFile = new File(paramString);
          long l;
          if (!localFile.exists())
          {
            l = System.currentTimeMillis();
            e.cx(paramString);
            ab.i("MicroMsg.ConcurrentFileBuilder", "make dir last %d ", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            l = System.currentTimeMillis();
          }
          try
          {
            localFile.createNewFile();
            ab.i("MicroMsg.ConcurrentFileBuilder", "make file last %d ", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
            b.a(b.this).lock();
          }
          catch (IOException localIOException)
          {
            try
            {
              b.this.cbQ = localFile;
              b.b(b.this).signal();
              ab.i("MicroMsg.ConcurrentFileBuilder", "notify file prepared %s", new Object[] { localFile.getAbsoluteFile() });
              return;
              localIOException = localIOException;
              ab.printErrStackTrace("MicroMsg.ConcurrentFileBuilder", localIOException, "", new Object[0]);
              ab.printErrStackTrace("MicroMsg.ConcurrentFileBuilder", localIOException, "createNewFile", new Object[0]);
            }
            finally
            {
              b.a(b.this).unlock();
            }
          }
        }
      });
    }
  }

  // ERROR //
  public final File getFile()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 24	com/tencent/mm/a/b:cbR	Ljava/util/concurrent/locks/ReentrantLock;
    //   4: invokevirtual 88	java/util/concurrent/locks/ReentrantLock:lock	()V
    //   7: aload_0
    //   8: getfield 59	com/tencent/mm/a/b:cbQ	Ljava/io/File;
    //   11: ifnonnull +35 -> 46
    //   14: ldc 61
    //   16: ldc 90
    //   18: invokestatic 93	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   21: aload_0
    //   22: getfield 30	com/tencent/mm/a/b:cbS	Ljava/util/concurrent/locks/Condition;
    //   25: invokeinterface 98 1 0
    //   30: goto -23 -> 7
    //   33: astore_1
    //   34: aload_0
    //   35: getfield 24	com/tencent/mm/a/b:cbR	Ljava/util/concurrent/locks/ReentrantLock;
    //   38: invokevirtual 101	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   41: aload_0
    //   42: getfield 59	com/tencent/mm/a/b:cbQ	Ljava/io/File;
    //   45: areturn
    //   46: aload_0
    //   47: getfield 24	com/tencent/mm/a/b:cbR	Ljava/util/concurrent/locks/ReentrantLock;
    //   50: invokevirtual 101	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   53: goto -12 -> 41
    //   56: astore_1
    //   57: aload_0
    //   58: getfield 24	com/tencent/mm/a/b:cbR	Ljava/util/concurrent/locks/ReentrantLock;
    //   61: invokevirtual 101	java/util/concurrent/locks/ReentrantLock:unlock	()V
    //   64: aload_1
    //   65: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   7	30	33	java/lang/Exception
    //   7	30	56	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.b
 * JD-Core Version:    0.6.2
 */