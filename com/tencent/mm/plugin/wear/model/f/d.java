package com.tencent.mm.plugin.wear.model.f;

import com.tencent.mm.sdk.platformtools.ab;

public abstract class d
  implements Runnable
{
  public d()
  {
    ab.i("MicroMsg.WearBaseWorkerTask", "Create %s", new Object[] { getName() });
  }

  protected abstract void execute();

  public abstract String getName();

  public void run()
  {
    long l1 = System.currentTimeMillis();
    try
    {
      execute();
      long l2 = System.currentTimeMillis();
      ab.i("MicroMsg.WearBaseWorkerTask", "execute %s | use time %d", new Object[] { getName(), Long.valueOf(l2 - l1) });
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WearBaseWorkerTask", localException, "run task %s occur exception: %s", new Object[] { getName(), localException.getMessage() });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.f.d
 * JD-Core Version:    0.6.2
 */