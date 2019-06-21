package com.tencent.mm.ui;

import android.app.ProgressDialog;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.modelsimple.aa;
import com.tencent.mm.plugin.account.ui.RegByMobileSetPwdUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.z;

final class h$11
  implements f
{
  h$11(h paramh)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(29323);
    ab.i("MicroMsg.LauncherUI.GlobalAlertMgr", "summeralert onSceneEnd " + paramInt1 + " errCode " + paramInt2 + " errMsg " + paramString + "  " + paramm.getType());
    if (this.yih.ehJ != null)
    {
      this.yih.ehJ.dismiss();
      this.yih.ehJ = null;
    }
    if (paramm.getType() == 255)
    {
      aw.Rg().b(255, this.yih.yic);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        this.yih.pF(true);
        AppMethodBeat.o(29323);
      }
    }
    while (true)
    {
      return;
      if (u.a.a(this.yih.yhZ, paramInt1, paramInt2, paramString, 4))
      {
        AppMethodBeat.o(29323);
      }
      else
      {
        this.yih.pF(false);
        AppMethodBeat.o(29323);
        continue;
        if (paramm.getType() == 384)
        {
          if ((paramInt1 == 0) && (paramInt2 == 0))
          {
            aw.ZK();
            c.Ry().set(77830, ((aa)paramm).agg());
            paramString = new Intent(this.yih.yhZ, RegByMobileSetPwdUI.class);
            paramString.putExtra("kintent_hint", this.yih.getString(2131303155));
            this.yih.yhZ.startActivity(paramString);
            AppMethodBeat.o(29323);
          }
          else
          {
            this.yih.qmB = true;
            com.tencent.mm.ui.base.h.a(this.yih.yhZ, 2131303191, 2131297061, new h.11.1(this));
          }
        }
        else
          AppMethodBeat.o(29323);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.h.11
 * JD-Core Version:    0.6.2
 */