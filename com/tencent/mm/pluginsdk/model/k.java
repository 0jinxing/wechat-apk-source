package com.tencent.mm.pluginsdk.model;

import android.os.Looper;
import com.tencent.mm.sdk.g.b.a;
import com.tencent.mm.sdk.platformtools.ak;
import junit.framework.Assert;

public abstract class k<Params, Progress, Result>
{
  private boolean cFy = false;
  ak handler = new ak(Looper.getMainLooper());

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
    v(paramArrayOfParams);
    a locala = cin();
    if (locala == null);
    while (true)
    {
      return bool;
      locala.execute(new k.1(this, paramArrayOfParams));
      bool = true;
    }
  }

  public void v(Params[] paramArrayOfParams)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.k
 * JD-Core Version:    0.6.2
 */