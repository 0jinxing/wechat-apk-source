package android.support.v4.content;

import android.support.v4.os.c;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

final class a$a extends e<Void, Void, D>
  implements Runnable
{
  final CountDownLatch Gh = new CountDownLatch(1);
  boolean Gi;

  a$a(a parama)
  {
  }

  private D du()
  {
    try
    {
      Object localObject1 = this.Gj.onLoadInBackground();
      return localObject1;
    }
    catch (c localc)
    {
      while (true)
      {
        if (!this.GC.get())
          throw localc;
        Object localObject2 = null;
      }
    }
  }

  protected final void onCancelled(D paramD)
  {
    try
    {
      this.Gj.dispatchOnCancelled(this, paramD);
      return;
    }
    finally
    {
      this.Gh.countDown();
    }
    throw paramD;
  }

  protected final void onPostExecute(D paramD)
  {
    try
    {
      this.Gj.dispatchOnLoadComplete(this, paramD);
      return;
    }
    finally
    {
      this.Gh.countDown();
    }
    throw paramD;
  }

  public final void run()
  {
    this.Gi = false;
    this.Gj.executePendingTask();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.content.a.a
 * JD-Core Version:    0.6.2
 */