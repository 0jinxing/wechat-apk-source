package com.tencent.mm.plugin.appbrand.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ao.b.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import com.tencent.mm.ui.base.p;

final class AppBrandOpenWeRunSettingUI$3
  implements ao.b.a
{
  AppBrandOpenWeRunSettingUI$3(AppBrandOpenWeRunSettingUI paramAppBrandOpenWeRunSettingUI)
  {
  }

  public final void o(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(132996);
    ab.i("MicroMsg.AppBrandOpenWeRunSettingUI", "getContactCallBack, suc = %b,user %s", new Object[] { Boolean.valueOf(paramBoolean), paramString });
    AppBrandOpenWeRunSettingUI.a(this.iGZ, ((j)g.K(j.class)).XM().aoO("gh_43f2581f6fd6"));
    AppBrandOpenWeRunSettingUI.a(this.iGZ);
    AppBrandOpenWeRunSettingUI.b(this.iGZ).dismiss();
    AppMethodBeat.o(132996);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandOpenWeRunSettingUI.3
 * JD-Core Version:    0.6.2
 */