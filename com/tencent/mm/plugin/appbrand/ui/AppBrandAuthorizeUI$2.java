package com.tencent.mm.plugin.appbrand.ui;

import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;
import com.tencent.mm.ui.q;

final class AppBrandAuthorizeUI$2
  implements Runnable
{
  AppBrandAuthorizeUI$2(AppBrandAuthorizeUI paramAppBrandAuthorizeUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132893);
    if (AppBrandAuthorizeUI.f(this.iFJ) == null)
    {
      AppBrandAuthorizeUI localAppBrandAuthorizeUI = this.iFJ;
      AppCompatActivity localAppCompatActivity = this.iFJ.mController.ylL;
      this.iFJ.getString(2131297061);
      AppBrandAuthorizeUI.a(localAppBrandAuthorizeUI, h.a(localAppCompatActivity, 3, this.iFJ.getString(2131297158), false, new AppBrandAuthorizeUI.2.1(this)));
    }
    AppBrandAuthorizeUI.f(this.iFJ).show();
    AppMethodBeat.o(132893);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.2
 * JD-Core Version:    0.6.2
 */