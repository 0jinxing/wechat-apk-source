package com.tencent.mm.plugin.account.ui;

import android.widget.EditText;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.account.friend.a.ad;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;

final class RegSetInfoUI$1
  implements ap.a
{
  RegSetInfoUI$1(RegSetInfoUI paramRegSetInfoUI)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(125507);
    String str = RegSetInfoUI.a(this.gHM).getText().toString().trim();
    Object localObject1 = RegSetInfoUI.b(this.gHM).getText().toString().trim();
    Object localObject2 = str;
    if (bo.isNullOrNil(str))
    {
      localObject2 = str;
      if (!bo.isNullOrNil((String)localObject1))
        if (((String)localObject1).length() <= 5)
          break label199;
    }
    label199: for (localObject2 = ((String)localObject1).substring(0, 5); ; localObject2 = localObject1)
    {
      if ((!bo.isNullOrNil((String)localObject2)) && (bo.isNullOrNil((String)localObject1)))
        localObject1 = localObject2;
      while (true)
      {
        if ((!bo.isNullOrNil((String)localObject2)) && (RegSetInfoUI.c(this.gHM)) && (RegSetInfoUI.d(this.gHM)))
        {
          int i = RegSetInfoUI.e(this.gHM);
          str = RegSetInfoUI.f(this.gHM);
          g.Rg().a(429, this.gHM);
          localObject2 = new ad(str, RegSetInfoUI.g(this.gHM), i, (String)localObject1, (String)localObject2, "", "");
          g.Rg().a((m)localObject2, 0);
          RegSetInfoUI.h(this.gHM).setVisibility(0);
        }
        AppMethodBeat.o(125507);
        return false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegSetInfoUI.1
 * JD-Core Version:    0.6.2
 */