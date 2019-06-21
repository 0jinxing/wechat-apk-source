package com.tencent.mm.plugin.welab.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.welab.a.a.b;
import com.tencent.mm.plugin.welab.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Map;

final class WelabAppInfoUI$3
  implements View.OnClickListener
{
  WelabAppInfoUI$3(WelabAppInfoUI paramWelabAppInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(80601);
    ab.i("WelabAppInfoUI", "open func " + WelabAppInfoUI.b(this.uMr));
    paramView = com.tencent.mm.plugin.welab.a.ddj();
    WelabAppInfoUI localWelabAppInfoUI = this.uMr;
    String str = WelabAppInfoUI.b(this.uMr);
    b localb = (b)paramView.uLR.get(str);
    if (localb != null)
    {
      ab.i("WelabMgr", "use custome opener to open ".concat(String.valueOf(str)));
      localb.f(localWelabAppInfoUI, str);
    }
    while (true)
    {
      d.t(WelabAppInfoUI.b(this.uMr), 7, WelabAppInfoUI.c(this.uMr));
      AppMethodBeat.o(80601);
      return;
      ab.i("WelabMgr", "use default opener open ".concat(String.valueOf(str)));
      if (paramView.agI(str).field_Type == 2)
      {
        if (paramView.uLS != null)
          paramView.uLS.f(localWelabAppInfoUI, str);
        else
          ab.e("WelabMgr", "defaultWeAppOpener is null!");
      }
      else
        ab.e("WelabMgr", "can not find opener for ".concat(String.valueOf(str)));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.welab.ui.WelabAppInfoUI.3
 * JD-Core Version:    0.6.2
 */