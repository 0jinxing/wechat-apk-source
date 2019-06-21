package com.tencent.mm.plugin.collect.model;

import android.app.Dialog;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.pr;
import com.tencent.mm.g.a.pr.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;

public final class u extends com.tencent.mm.sdk.b.c<pr>
{
  Dialog gnn;

  public u()
  {
    AppMethodBeat.i(41000);
    this.xxI = pr.class.getName().hashCode();
    AppMethodBeat.o(41000);
  }

  private boolean a(final pr parampr)
  {
    AppMethodBeat.i(41001);
    ab.i("MicroMsg.ScanMaterialCodeListener", "scan material code type: %s", new Object[] { Integer.valueOf(parampr.cLS.type) });
    if ((parampr.cLS.aIq == null) || (parampr.cLS.aIq.get() == null))
    {
      ab.i("MicroMsg.ScanMaterialCodeListener", "context has destroyed");
      parampr.cLS.callback.run();
      AppMethodBeat.o(41001);
      return false;
    }
    Object localObject = (Context)parampr.cLS.aIq.get();
    if (parampr.cLS.type == 0)
    {
      this.gnn = com.tencent.mm.wallet_core.ui.g.a((Context)localObject, false, null);
      localObject = new k(parampr.cLS.cLU, parampr.cLS.scene);
      com.tencent.mm.kernel.g.Rg().a(1800, new u.1(this, parampr));
      com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
    }
    while (true)
    {
      AppMethodBeat.o(41001);
      break;
      if (parampr.cLS.type == 1)
      {
        this.gnn = com.tencent.mm.wallet_core.ui.g.a((Context)localObject, false, null);
        localObject = new com.tencent.mm.plugin.collect.reward.a.c(parampr.cLS.cLU, parampr.cLS.scene);
        com.tencent.mm.kernel.g.Rg().a(2811, new f()
        {
          public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, m paramAnonymousm)
          {
            AppMethodBeat.i(40999);
            if ((u.this.gnn != null) && (u.this.gnn.isShowing()))
            {
              u.this.gnn.dismiss();
              u.this.gnn = null;
            }
            com.tencent.mm.kernel.g.Rg().b(2811, this);
            paramAnonymousString = (com.tencent.mm.plugin.collect.reward.a.c)paramAnonymousm;
            paramAnonymousString.a(new u.2.3(this)).b(new u.2.2(this, paramAnonymousString)).c(new u.2.1(this));
            parampr.cLS.callback.run();
            AppMethodBeat.o(40999);
          }
        });
        com.tencent.mm.kernel.g.Rg().a((m)localObject, 0);
      }
      else
      {
        ab.w("MicroMsg.ScanMaterialCodeListener", "unknown type: %d", new Object[] { Integer.valueOf(parampr.cLS.type) });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.u
 * JD-Core Version:    0.6.2
 */