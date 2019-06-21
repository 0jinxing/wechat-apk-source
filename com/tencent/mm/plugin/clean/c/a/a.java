package com.tencent.mm.plugin.clean.c.a;

import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public abstract class a
  implements Runnable
{
  private long iBv = 0L;
  private a.a kwK;
  c kwL;

  public a(a.a parama)
  {
    this.kwK = parama;
  }

  public String alb()
  {
    return this.iBv;
  }

  public abstract void execute();

  public void run()
  {
    try
    {
      this.iBv = bo.yz();
      execute();
      this.iBv = bo.az(this.iBv);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AbstractTask", localException, "", new Object[0]);
        if (this.kwL != null)
          this.kwL.f(Long.valueOf(Thread.currentThread().getId()));
        if (this.kwK != null)
          this.kwK.a(this);
      }
    }
    finally
    {
      if (this.kwL != null)
        this.kwL.f(Long.valueOf(Thread.currentThread().getId()));
      if (this.kwK != null)
        this.kwK.a(this);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.c.a.a
 * JD-Core Version:    0.6.2
 */