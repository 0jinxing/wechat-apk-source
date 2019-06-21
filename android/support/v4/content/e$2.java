package android.support.v4.content;

import android.os.Binder;
import android.os.Process;
import java.util.concurrent.atomic.AtomicBoolean;

final class e$2 extends e.d<Params, Result>
{
  e$2(e parame)
  {
  }

  public final Result call()
  {
    e.a(this.GE).set(true);
    Object localObject1 = null;
    Object localObject2 = null;
    Object localObject3 = localObject2;
    Object localObject5 = localObject1;
    try
    {
      Process.setThreadPriority(10);
      localObject3 = localObject2;
      localObject5 = localObject1;
      localObject2 = this.GE.dv();
      localObject3 = localObject2;
      localObject5 = localObject2;
      Binder.flushPendingCommands();
      return localObject2;
    }
    catch (Throwable localThrowable)
    {
      localObject5 = localObject3;
      e.b(this.GE).set(true);
      localObject5 = localObject3;
      throw localThrowable;
    }
    finally
    {
      this.GE.o(localObject5);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v4.content.e.2
 * JD-Core Version:    0.6.2
 */