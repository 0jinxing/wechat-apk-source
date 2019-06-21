package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.u;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

final class AppBrandAuthorizeUI$5
  implements Runnable
{
  AppBrandAuthorizeUI$5(AppBrandAuthorizeUI paramAppBrandAuthorizeUI, boolean paramBoolean)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(132896);
    Preference localPreference = new Preference(this.iFJ);
    localPreference.yDf = false;
    if (this.itg)
    {
      localPreference.setLayoutResource(2130968662);
      localPreference.setTitle(this.iFJ.getString(2131296560, new Object[] { AppBrandAuthorizeUI.i(this.iFJ).nickname }));
    }
    while (true)
    {
      this.iFJ.iFE.b(localPreference);
      this.iFJ.iFE.notifyDataSetChanged();
      AppMethodBeat.o(132896);
      return;
      localPreference.setLayoutResource(2130968663);
      localPreference.setTitle(this.iFJ.getString(2131296561, new Object[] { AppBrandAuthorizeUI.i(this.iFJ).nickname }));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.5
 * JD-Core Version:    0.6.2
 */