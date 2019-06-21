package com.tencent.mm.plugin.sns.model;

import com.tencent.mm.sdk.g.b.a;
import com.tencent.mm.sdk.platformtools.ak;
import junit.framework.Assert;

public abstract class h<Params, Progress, Result>
{
  private boolean cFy = false;
  ak handler = af.bCo();

  public abstract a cin();

  public abstract Result dv();

  public void onPostExecute(Result paramResult)
  {
  }

  public final boolean u(Params[] paramArrayOfParams)
  {
    boolean bool = false;
    if (this.cFy)
      Assert.assertTrue("MicroMsg.MMAsyncTask Should construct a new Task", false);
    this.cFy = true;
    a locala = cin();
    if (locala == null);
    while (true)
    {
      return bool;
      locala.execute(new h.1(this, paramArrayOfParams));
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.model.h
 * JD-Core Version:    0.6.2
 */