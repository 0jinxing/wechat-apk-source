package com.tencent.mm.plugin.account.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ad;
import com.tencent.mm.ui.applet.SecurityImage;
import com.tencent.mm.ui.base.h;

final class RegSetInfoUI$15
  implements DialogInterface.OnClickListener
{
  RegSetInfoUI$15(RegSetInfoUI paramRegSetInfoUI, m paramm)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(125522);
    Object localObject1 = RegSetInfoUI.b(this.gHM).getText().toString().trim();
    Object localObject2 = RegSetInfoUI.a(this.gHM).getText().toString().trim();
    if ((localObject1 == null) || (((String)localObject1).length() <= 0))
    {
      h.g(this.gHM, 2131304226, 2131302287);
      AppMethodBeat.o(125522);
    }
    while (true)
    {
      return;
      this.gHM.aqX();
      paramInt = RegSetInfoUI.e(this.gHM);
      paramDialogInterface = RegSetInfoUI.f(this.gHM);
      g.Rg().a(429, this.gHM);
      localObject1 = new ad(paramDialogInterface, RegSetInfoUI.g(this.gHM), paramInt, (String)localObject1, (String)localObject2, ((ad)this.crb).ajn(), RegSetInfoUI.C(this.gHM).getSecImgCode());
      g.Rg().a((m)localObject1, 0);
      localObject2 = this.gHM;
      paramDialogInterface = this.gHM;
      this.gHM.getString(2131297061);
      RegSetInfoUI.a((RegSetInfoUI)localObject2, h.b(paramDialogInterface, this.gHM.getString(2131302326), true, new RegSetInfoUI.15.1(this, (ad)localObject1)));
      AppMethodBeat.o(125522);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.15
 * JD-Core Version:    0.6.2
 */