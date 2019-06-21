package com.tencent.mm.plugin.card.b;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.qj;
import com.tencent.mm.g.a.qj.a;
import com.tencent.mm.g.a.qj.b;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.am;
import com.tencent.mm.plugin.card.model.o;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends c<qj>
  implements com.tencent.mm.ai.f
{
  private qj kaz;

  public a()
  {
    AppMethodBeat.i(87625);
    this.xxI = qj.class.getName().hashCode();
    AppMethodBeat.o(87625);
  }

  private boolean a(qj paramqj)
  {
    boolean bool = false;
    AppMethodBeat.i(87626);
    if (!g.RK())
    {
      ab.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent account is not ready");
      AppMethodBeat.o(87626);
    }
    while (true)
    {
      return bool;
      if ((paramqj instanceof qj))
      {
        this.kaz = paramqj;
        paramqj = this.kaz.cMA.cMC;
        String str = this.kaz.cMA.cMD;
        int i = this.kaz.cMA.cME;
        if (TextUtils.isEmpty(paramqj))
        {
          ab.e("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent card_id is empty");
          bah();
          AppMethodBeat.o(87626);
        }
        else
        {
          g.RO().eJo.a(651, this);
          ab.i("MicroMsg.AccessCardEventListener", "ShakeAcceptCouponCardEvent doscene from scene ".concat(String.valueOf(i)));
          paramqj = new o(paramqj, i, "", str, "", "", 0, 0, null);
          g.RO().eJo.a(paramqj, 0);
          bool = true;
          AppMethodBeat.o(87626);
        }
      }
      else
      {
        AppMethodBeat.o(87626);
      }
    }
  }

  private void bah()
  {
    AppMethodBeat.i(87628);
    if (this.kaz.callback != null)
      this.kaz.callback.run();
    this.kaz = null;
    AppMethodBeat.o(87628);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(87627);
    qj.b localb;
    if ((paramm instanceof o))
    {
      localb = new qj.b();
      ab.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return errcode " + paramInt2 + " errmsg" + paramString);
      if ((paramInt1 != 0) || (paramInt2 != 0))
        break label245;
      ab.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is success");
      paramm = (o)paramm;
      paramInt1 = paramm.kdT;
      paramString = paramm.kdS;
      paramm = paramm.kdU;
      if (paramInt1 != 0)
        break label205;
      ab.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return ok ");
      localb.cxT = true;
      paramm = new CardInfo();
      com.tencent.mm.plugin.card.d.f.a(paramm, paramString);
      if (TextUtils.isEmpty(paramm.field_card_id))
        break label188;
      localb.cMC = paramm.field_card_id;
      am.bbb().putValue("key_accept_card_info", paramm);
    }
    while (true)
    {
      g.RO().eJo.b(651, this);
      this.kaz.cMB = localb;
      bah();
      AppMethodBeat.o(87627);
      return;
      label188: ab.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return card_id is empty ");
      localb.cMC = "";
      break;
      label205: ab.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene return false, retCode " + paramInt1 + " retMsg" + paramm);
      localb.cxT = false;
      continue;
      label245: ab.i("MicroMsg.AccessCardEventListener", "NetSceneAcceptCardItem doscene is fail");
      localb.cxT = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.b.a
 * JD-Core Version:    0.6.2
 */