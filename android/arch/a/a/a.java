package android.arch.a.a;

import java.util.concurrent.Executor;

public class a extends c
{
  private static volatile a bL;
  private static final Executor bO = new Executor()
  {
    public final void execute(Runnable paramAnonymousRunnable)
    {
      a.Y().d(paramAnonymousRunnable);
    }
  };
  private static final Executor bP = new Executor()
  {
    public final void execute(Runnable paramAnonymousRunnable)
    {
      a.Y().c(paramAnonymousRunnable);
    }
  };
  public c bM = this.bN;
  private c bN = new b();

  public static a Y()
  {
    a locala;
    if (bL != null)
      locala = bL;
    while (true)
    {
      return locala;
      try
      {
        if (bL == null)
        {
          locala = new android/arch/a/a/a;
          locala.<init>();
          bL = locala;
        }
        locala = bL;
      }
      finally
      {
      }
    }
  }

  public final void c(Runnable paramRunnable)
  {
    this.bM.c(paramRunnable);
  }

  public final void d(Runnable paramRunnable)
  {
    this.bM.d(paramRunnable);
  }

  public final boolean isMainThread()
  {
    return this.bM.isMainThread();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.arch.a.a.a
 * JD-Core Version:    0.6.2
 */