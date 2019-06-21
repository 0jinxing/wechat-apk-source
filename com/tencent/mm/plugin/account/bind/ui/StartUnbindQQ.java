package com.tencent.mm.plugin.account.bind.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.f;
import com.tencent.mm.g.a.ag;
import com.tencent.mm.g.a.tt;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.account.friend.a.an;
import com.tencent.mm.plugin.messenger.foundation.a.a.k;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;
import com.tencent.mm.ui.widget.a.c;

public class StartUnbindQQ extends MMWizardActivity
  implements f
{
  private String grq = null;
  private View guo;
  private c gup;
  private com.tencent.mm.ui.base.p tipDialog;

  public final int getLayoutId()
  {
    return 2130970845;
  }

  public final void initView()
  {
    AppMethodBeat.i(13768);
    setMMTitle(2131304141);
    this.guo = findViewById(2131827984);
    setBackBtn(new StartUnbindQQ.1(this));
    this.guo.setOnClickListener(new StartUnbindQQ.2(this));
    AppMethodBeat.o(13768);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(13765);
    super.onCreate(paramBundle);
    g.Rg().a(253, this);
    this.grq = getIntent().getStringExtra("notice");
    AppMethodBeat.o(13765);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(13766);
    g.Rg().b(253, this);
    super.onDestroy();
    AppMethodBeat.o(13766);
  }

  public void onResume()
  {
    AppMethodBeat.i(13767);
    super.onResume();
    initView();
    AppMethodBeat.o(13767);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(13769);
    ab.d("MicroMsg.StartUnbindQQ", "onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramm.getType());
    if (paramm.getType() == 253)
    {
      if (this.tipDialog != null)
      {
        this.tipDialog.dismiss();
        this.tipDialog = null;
      }
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramInt1 = bo.a((Integer)g.RP().Ry().get(9, null), 0);
        ab.d("MicroMsg.StartUnbindQQ", "iBindUin ".concat(String.valueOf(paramInt1)));
        if (paramInt1 != 0)
          ((j)g.K(j.class)).XU().delete(new com.tencent.mm.a.p(paramInt1) + "@qqim");
        paramm = g.RP().Ry().get(102407, null);
        if ((paramm != null) && (((String)paramm).length() > 0))
          g.RP().Ry().set(102407, null);
      }
    }
    while (true)
    {
      try
      {
        paramm = com.tencent.mm.sdk.b.a.xxA;
        Object localObject = new com/tencent/mm/g/a/ag;
        ((ag)localObject).<init>();
        paramm.m((b)localObject);
        paramInt1 = bo.a((Integer)g.RP().Ry().get(9, null), 0);
        paramm = new java/lang/StringBuilder;
        paramm.<init>();
        localObject = new com/tencent/mm/a/p;
        ((com.tencent.mm.a.p)localObject).<init>(paramInt1);
        paramm = localObject + "@qqim";
        ((j)g.K(j.class)).XU().delete(paramm);
        ((j)g.K(j.class)).XM().aoU(paramm);
        o.act().qp(paramm);
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localObject = r.Yz() + "@qqim";
        o.act().qp((String)localObject);
        o.acd();
        d.E(paramm, false);
        o.acd();
        d.E(paramm, true);
        o.acd();
        d.E((String)localObject, false);
        o.acd();
        d.E((String)localObject, true);
        paramm = (an)((com.tencent.mm.plugin.account.a.a.a)g.M(com.tencent.mm.plugin.account.a.a.a.class)).getQQGroupStg();
        ab.d("MicroMsg.QQGroupStorage", "delete all");
        if (paramm.fni.delete("qqgroup", null, null) > 0)
          paramm.doNotify();
        com.tencent.mm.plugin.account.a.a.gkF.BS();
        g.RP().Ry().set(9, Integer.valueOf(0));
        paramm = new tt();
        paramm.cPS.cPT = false;
        paramm.cPS.cPU = true;
        com.tencent.mm.sdk.b.a.xxA.m(paramm);
        if (!bo.isNullOrNil(this.grq))
        {
          com.tencent.mm.ui.base.h.a(this, this.grq, "", getString(2131296955), new StartUnbindQQ.3(this));
          paramString = com.tencent.mm.h.a.jY(paramString);
          if (paramString == null)
            break label640;
          paramString.a(this, null, null);
          AppMethodBeat.o(13769);
        }
      }
      catch (Exception paramm)
      {
        ab.printErrStackTrace("MicroMsg.StartUnbindQQ", paramm, "", new Object[0]);
        ab.printErrStackTrace("MicroMsg.StartUnbindQQ", paramm, "", new Object[0]);
        continue;
        Ni(1);
        continue;
      }
      label640: AppMethodBeat.o(13769);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.StartUnbindQQ
 * JD-Core Version:    0.6.2
 */