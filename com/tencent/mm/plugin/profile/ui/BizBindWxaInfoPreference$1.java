package com.tencent.mm.plugin.profile.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.ui.base.preference.Preference;

final class BizBindWxaInfoPreference$1
  implements View.OnClickListener
{
  BizBindWxaInfoPreference$1(BizBindWxaInfoPreference paramBizBindWxaInfoPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23294);
    Object localObject = paramView.getTag();
    if ((localObject == null) || (!(localObject instanceof String)))
      AppMethodBeat.o(23294);
    while (true)
    {
      return;
      paramView = new AppBrandStatObject();
      paramView.scene = 1020;
      paramView.cst = BizBindWxaInfoPreference.a(this.pkM).field_username;
      ((e)g.K(e.class)).a(this.pkM.mContext, (String)localObject, null, 0, 0, null, paramView, BizBindWxaInfoPreference.a(this.pkM).field_appId);
      AppMethodBeat.o(23294);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference.1
 * JD-Core Version:    0.6.2
 */