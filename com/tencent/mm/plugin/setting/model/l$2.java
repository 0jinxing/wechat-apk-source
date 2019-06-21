package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.setting.ui.setting.UnfamiliarContactDetailUI.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

final class l$2
  implements Runnable
{
  l$2(l paraml)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(126868);
    try
    {
      this.qjY.qjQ.await();
      long l = System.currentTimeMillis();
      this.qjY.qjR.clear();
      this.qjY.qjS.remove(r.Yz());
      this.qjY.qjR.addAll(this.qjY.qjS);
      this.qjY.qjR.addAll(this.qjY.qjT);
      this.qjY.qjR.addAll(this.qjY.qjU);
      if (this.qjY.qjO)
        this.qjY.qjR.retainAll(this.qjY.qjU);
      if (this.qjY.qjP)
        this.qjY.qjR.retainAll(this.qjY.qjT);
      if (this.qjY.qjN)
        this.qjY.qjR.retainAll(this.qjY.qjS);
      this.qjY.qjW.e(this.qjY.qjR);
      ab.i("MicroMsg.UnfamiliarContactEngine", "[onResult] :%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      l.2.1 local1 = new com/tencent/mm/plugin/setting/model/l$2$1;
      local1.<init>(this);
      al.d(local1);
      ab.i("MicroMsg.UnfamiliarContactEngine", "all cost:%sms", new Object[] { Long.valueOf(System.currentTimeMillis() - this.qjY.qjX) });
      AppMethodBeat.o(126868);
      return;
    }
    catch (InterruptedException localInterruptedException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.UnfamiliarContactEngine", localInterruptedException, "", new Object[0]);
        al.d(new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(126867);
            l.2.this.qjY.qjW.onError();
            AppMethodBeat.o(126867);
          }
        });
        AppMethodBeat.o(126868);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.l.2
 * JD-Core Version:    0.6.2
 */