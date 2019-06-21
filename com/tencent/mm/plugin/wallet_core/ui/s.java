package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.wallet_core.c.o;
import com.tencent.mm.plugin.wallet_core.model.al;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

public final class s
  implements com.tencent.mm.ai.f
{
  public boolean cui = false;
  public s.b tLw;
  private s.a tLx;

  public final void a(s.a parama, boolean paramBoolean)
  {
    AppMethodBeat.i(47734);
    this.tLx = parama;
    g.RQ();
    boolean bool = ((Boolean)g.RP().Ry().get(ac.a.xUU, Boolean.FALSE)).booleanValue();
    ab.v("MicroMsg.WxPayAgreementsHelper", "showProtoCol agree %s isServerControlShow %s", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(paramBoolean) });
    if (bool)
    {
      parama.bNp();
      AppMethodBeat.o(47734);
    }
    while (true)
    {
      return;
      if (this.cui)
      {
        ab.i("MicroMsg.WxPayAgreementsHelper", "showProtoCol isShow %s", new Object[] { Boolean.valueOf(this.cui) });
        parama.bNp();
        AppMethodBeat.o(47734);
      }
      else if (paramBoolean)
      {
        this.cui = true;
        parama = new com.tencent.mm.plugin.wallet_core.c.f();
        g.RQ();
        g.RO().eJo.a(parama, 0);
        AppMethodBeat.o(47734);
      }
      else
      {
        parama.bNp();
        AppMethodBeat.o(47734);
      }
    }
  }

  public final void bNo()
  {
    AppMethodBeat.i(47732);
    o localo = new o();
    g.RQ();
    g.RO().eJo.a(localo, 0);
    if (this.tLx != null)
      this.tLx.bNo();
    AppMethodBeat.o(47732);
  }

  public final void cancel()
  {
    AppMethodBeat.i(47733);
    if (this.tLx != null)
      this.tLx.cancel();
    AppMethodBeat.o(47733);
  }

  public final void onPause()
  {
    AppMethodBeat.i(47731);
    g.RQ();
    g.RO().eJo.b(2541, this);
    g.RQ();
    g.RO().eJo.b(2791, this);
    AppMethodBeat.o(47731);
  }

  public final void onResume()
  {
    AppMethodBeat.i(47730);
    g.RQ();
    g.RO().eJo.a(2541, this);
    g.RQ();
    g.RO().eJo.a(2791, this);
    AppMethodBeat.o(47730);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(47735);
    if ((paramm instanceof com.tencent.mm.plugin.wallet_core.c.f))
      if ((paramInt1 != 0) || (paramInt2 != 0))
        AppMethodBeat.o(47735);
    while (true)
    {
      return;
      paramm = (com.tencent.mm.plugin.wallet_core.c.f)paramm;
      ab.d("MicroMsg.WxPayAgreementsHelper", "errType =  %s errCode %s isShow %s content: %s need_agree_duty %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Boolean.valueOf(al.aFF()), paramm.ttP, Boolean.valueOf(paramm.ttQ) });
      if ((al.aFF()) && (paramm.ttQ))
      {
        paramString = new Intent();
        paramString.putExtra("agreement_content", paramm.ttP);
        d.b(this.tLw.getContext(), "wallet_core", ".ui.ShowWxPayAgreementsUI", paramString, this.tLw.bNq());
      }
      AppMethodBeat.o(47735);
      continue;
      if ((paramm instanceof o))
      {
        if ((paramInt1 != 0) || (paramInt2 != 0))
        {
          AppMethodBeat.o(47735);
        }
        else
        {
          g.RQ();
          g.RP().Ry().set(ac.a.xUU, Boolean.TRUE);
          ab.i("MicroMsg.WxPayAgreementsHelper", "agree Ok!");
        }
      }
      else
        AppMethodBeat.o(47735);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.s
 * JD-Core Version:    0.6.2
 */