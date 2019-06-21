package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.Preference;

final class NewBizBindWxaInfoPreference$1
  implements View.OnClickListener
{
  NewBizBindWxaInfoPreference$1(NewBizBindWxaInfoPreference paramNewBizBindWxaInfoPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23827);
    paramView = paramView.getTag();
    if ((paramView == null) || (!(paramView instanceof String)))
    {
      ab.e("MicroMsg.NewBizBindWxaInfoPreference", "username is null, err");
      AppMethodBeat.o(23827);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.NewBizBindWxaInfoPreference", "jump to wxa:%s", new Object[] { (String)paramView });
      AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
      localAppBrandStatObject.scene = 1020;
      localAppBrandStatObject.cst = NewBizBindWxaInfoPreference.a(this.ppQ).field_username;
      ((e)g.K(e.class)).a(this.ppQ.mContext, (String)paramView, null, 0, 0, null, localAppBrandStatObject, NewBizBindWxaInfoPreference.a(this.ppQ).field_appId);
      c.cP(NewBizBindWxaInfoPreference.a(this.ppQ).field_username, 500);
      AppMethodBeat.o(23827);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizBindWxaInfoPreference.1
 * JD-Core Version:    0.6.2
 */