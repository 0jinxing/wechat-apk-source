package com.tencent.mm.plugin.e;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.n;
import com.tencent.mm.ai.p;
import com.tencent.mm.ai.p.a;
import com.tencent.mm.booter.NotifyReceiver.NotifyService;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.b.g;
import com.tencent.mm.model.am;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMAppMgr;

public final class e extends com.tencent.mm.kernel.a.c.a
{
  private am flA;

  public e(am paramam)
  {
    this.flA = paramam;
  }

  public final void execute(g paramg)
  {
    AppMethodBeat.i(18526);
    aw.a(this.flA, new p.a()
    {
      public final void a(p paramAnonymousp)
      {
      }

      public final void a(p paramAnonymousp, boolean paramAnonymousBoolean)
      {
        AppMethodBeat.i(18525);
        if ((paramAnonymousBoolean) && (!paramAnonymousp.foreground))
          if (!e.aVI())
          {
            ab.w("MicroMsg.MMCoreInitTask", "can't kill the working process");
            AppMethodBeat.o(18525);
          }
        while (true)
        {
          return;
          MMAppMgr.dyr();
          ab.e("MicroMsg.MMCoreInitTask", "now killing the working process....");
          if (com.tencent.mm.platformtools.a.anD())
          {
            ab.e("MicroMsg.MMCoreInitTask", "address book syncing, wait a minute please");
            AppMethodBeat.o(18525);
          }
          else
          {
            d.aI(new Intent(ah.getContext(), NotifyReceiver.NotifyService.class));
            n.x(new e.1.1(this));
            AppMethodBeat.o(18525);
          }
        }
      }
    });
    AppMethodBeat.o(18526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.e.e
 * JD-Core Version:    0.6.2
 */