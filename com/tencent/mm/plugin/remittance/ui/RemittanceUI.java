package com.tencent.mm.plugin.remittance.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.fw;
import com.tencent.mm.g.a.uo;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.remittance.model.v;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.c.ae;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.t;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;

public class RemittanceUI extends RemittanceBaseUI
{
  protected String pWR;
  private String pWS;

  public final void a(String paramString1, int paramInt, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, fw paramfw)
  {
    AppMethodBeat.i(45166);
    if (this.pQU != null)
      this.pQU.i(3, new Object[] { Integer.valueOf(this.pQY), Double.valueOf(this.pQV) });
    int i = getIntent().getIntExtra("pay_channel", -1);
    String str = "";
    Object localObject = str;
    if (!bo.Q(new String[0]))
    {
      g.RQ();
      localObject = ((j)g.K(j.class)).XM().aoM(this.edV);
      if (localObject != null)
        localObject = ((ad)localObject).Oj();
    }
    else
    {
      if (!bo.isNullOrNil(paramString6))
        break label390;
    }
    label390: for (this.pRH = true; ; this.pRH = false)
    {
      ab.i("MicroMsg.RemittanceUI", "doSceneGenRemittance, channel: %s", new Object[] { Integer.valueOf(i) });
      int j = 0;
      int k = 0;
      if (bo.gW(this.cKs, 4))
      {
        boolean bool1 = bo.C(Double.valueOf(this.pRS), Double.valueOf(this.pQV));
        boolean bool2 = bo.isEqual(this.pRT, paramString1);
        boolean bool3 = bo.isEqual(this.pRU, paramString4);
        j = k;
        if (!bool1)
          j = 1;
        k = j;
        if (!bool2)
          k = j | 0x2;
        j = k;
        if (!bool3)
          j = k | 0x4;
      }
      paramString1 = new v(this.pQV, "1", this.edV, this.pRx, this.pQY, this.gOW, paramString1, paramInt, paramString2, paramString3, paramString4, paramString5, this.pRb, i, this.pRC, paramString6, this.pQW, (String)localObject, this.pRx, paramfw, this.pRE, this.pRD, this.pWR, this.pWS, this.cKs, this.pRV, j);
      paramString1.eHT = "RemittanceProcess";
      a(paramString1, true, true);
      this.pRE = "";
      AppMethodBeat.o(45166);
      return;
      ab.e("MicroMsg.RemittanceUI", "can not found contact for user::" + this.edV);
      localObject = str;
      break;
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(45167);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.remittance.model.e))
    {
      paramString = (com.tencent.mm.plugin.remittance.model.e)paramm;
      paramString.pOI.vWX = false;
      paramString.a(new RemittanceUI.3(this, paramString)).b(new RemittanceUI.2(this)).c(new RemittanceUI.1(this, paramString));
      bool = true;
      AppMethodBeat.o(45167);
    }
    while (true)
    {
      return bool;
      bool = super.c(paramInt1, paramInt2, paramString, paramm);
      AppMethodBeat.o(45167);
    }
  }

  public final void cfC()
  {
    AppMethodBeat.i(45168);
    t.makeText(this.mController.ylL, 2131302360, 0).show();
    AppMethodBeat.o(45168);
  }

  public final void cfG()
  {
    AppMethodBeat.i(45170);
    uo localuo = new uo();
    localuo.cQJ.cQL = "7";
    localuo.callback = new RemittanceUI.4(this, localuo);
    com.tencent.mm.sdk.b.a.xxA.m(localuo);
    AppMethodBeat.o(45170);
  }

  public final void cfz()
  {
    AppMethodBeat.i(45164);
    if (cfK())
    {
      g.RQ();
      this.pRy = ((String)g.RP().Ry().get(ac.a.xPL, ""));
      g.RQ();
      this.pRz = ((String)g.RP().Ry().get(ac.a.xPP, ""));
      g.RQ();
      this.pRA = ((Integer)g.RP().Ry().get(ac.a.xPQ, Integer.valueOf(0))).intValue();
      if ((!bo.isNullOrNil(this.pRy)) && (!bo.isNullOrNil(this.pRz)))
        break label151;
      ae.a(true, null);
    }
    while (true)
    {
      ab.d("MicroMsg.RemittanceUI", "do before transfer");
      a(new com.tencent.mm.plugin.remittance.model.e(this.edV), false, false);
      AppMethodBeat.o(45164);
      return;
      label151: ae.a(false, null);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(45165);
    super.onCreate(paramBundle);
    h.pYm.e(15386, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    nf(2783);
    AppMethodBeat.o(45165);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(45169);
    super.onDestroy();
    ng(2783);
    AppMethodBeat.o(45169);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.remittance.ui.RemittanceUI
 * JD-Core Version:    0.6.2
 */