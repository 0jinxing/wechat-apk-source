package android.support.v4.content;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

final class e$3 extends FutureTask<Result>
{
  e$3(e parame, Callable paramCallable)
  {
    super(paramCallable);
  }

  protected final void done()
  {
    try
    {
      Object localObject = get();
      this.GE.n(localObject);
      label13: return;
    }
    catch (ExecutionException localExecutionException)
    {
      throw new RuntimeException("An error occurred while executing doInBackground()", localExecutionException.getCause());
    }
    catch (CancellationException localCancellationException)
    {
      while (true)
        this.GE.n(null);
    }
    catch (Throwable localThrowable)
    {
      throw new RuntimeException("An error occurred while executing doInBackground()", localThrowable);
    }
    catch (InterruptedException localInterruptedException)
    {
      break label13;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.content.e.3
 * JD-Core Version:    0.6.2
 */