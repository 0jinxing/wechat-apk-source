package com.tencent.matrix.resource.e;

import android.content.Context;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.view.LayoutInflater;
import android.widget.Toast;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class c
{
  private final d bXU;
  final Context mContext;
  private final Handler mMainHandler;

  public c(Context paramContext, d paramd)
  {
    this(paramContext, paramd, new Handler(Looper.getMainLooper()));
  }

  private c(Context paramContext, d paramd, Handler paramHandler)
  {
    this.mContext = paramContext;
    this.bXU = paramd;
    this.mMainHandler = paramHandler;
  }

  public final File zs()
  {
    Object localObject1 = this.bXU.zt();
    Object localObject2;
    if (localObject1 == null)
    {
      localObject2 = null;
      if (localObject2 != null)
        break label86;
      com.tencent.matrix.d.c.w("Matrix.AndroidHeapDumper", "hprof file is null.", new Object[0]);
      localObject2 = null;
    }
    while (true)
    {
      return localObject2;
      localObject2 = UUID.randomUUID();
      localObject2 = new File((File)localObject1, "dump_" + Long.toHexString(((UUID)localObject2).getMostSignificantBits()) + Long.toHexString(((UUID)localObject2).getLeastSignificantBits()) + ".hprof");
      break;
      label86: localObject1 = ((File)localObject2).getParentFile();
      if (localObject1 == null)
      {
        com.tencent.matrix.d.c.w("Matrix.AndroidHeapDumper", "hprof file path: %s does not indicate a full path.", new Object[] { ((File)localObject2).getAbsolutePath() });
        localObject2 = null;
      }
      else if (!((File)localObject1).canWrite())
      {
        com.tencent.matrix.d.c.w("Matrix.AndroidHeapDumper", "hprof file path: %s cannot be written.", new Object[] { ((File)localObject2).getAbsolutePath() });
        localObject2 = null;
      }
      else
      {
        localObject1 = new com.tencent.matrix.resource.d.a.a();
        this.mMainHandler.post(new Runnable()
        {
          public final void run()
          {
            final Toast localToast = new Toast(c.this.mContext);
            localToast.setDuration(1);
            localToast.setGravity(16, 0, 0);
            localToast.setView(LayoutInflater.from(c.this.mContext).inflate(2130970523, null));
            localToast.show();
            Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler()
            {
              public final boolean queueIdle()
              {
                com.tencent.matrix.resource.d.a.a locala = c.1.this.bYg;
                Toast localToast = localToast;
                locala.bXP.set(localToast);
                locala.bXQ.countDown();
                return false;
              }
            });
          }
        });
        if (!((com.tencent.matrix.resource.d.a.a)localObject1).a(TimeUnit.SECONDS))
        {
          com.tencent.matrix.d.c.w("Matrix.AndroidHeapDumper", "give up dumping heap, waiting for toast too long.", new Object[0]);
          localObject2 = null;
        }
        else
        {
          try
          {
            Debug.dumpHprofData(((File)localObject2).getAbsolutePath());
            if (((com.tencent.matrix.resource.d.a.a)localObject1).bXQ.getCount() <= 0L)
              break label255;
            localObject1 = new java/lang/IllegalStateException;
            ((IllegalStateException)localObject1).<init>("Call wait() and check its result");
            throw ((Throwable)localObject1);
          }
          catch (IOException localIOException)
          {
            com.tencent.matrix.d.c.printErrStackTrace("Matrix.AndroidHeapDumper", localIOException, "failed to dump heap into file: %s.", new Object[] { ((File)localObject2).getAbsolutePath() });
            localObject2 = null;
          }
          continue;
          label255: Toast localToast = (Toast)localIOException.bXP.get();
          Handler localHandler = this.mMainHandler;
          Runnable local2 = new com/tencent/matrix/resource/e/c$2;
          local2.<init>(this, localToast);
          localHandler.post(local2);
        }
      }
    }
  }

  public static abstract interface a
  {
    public abstract void a(com.tencent.matrix.resource.analyzer.model.a parama);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.e.c
 * JD-Core Version:    0.6.2
 */