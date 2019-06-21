package com.tencent.mm.plugin.profile.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.ui.base.preference.Preference;

final class BizBindWxaInfoPreference$2
  implements View.OnClickListener
{
  BizBindWxaInfoPreference$2(BizBindWxaInfoPreference paramBizBindWxaInfoPreference)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(23295);
    ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).a(this.pkM.mContext, BizBindWxaInfoPreference.a(this.pkM).field_username, BizBindWxaInfoPreference.a(this.pkM).field_appId, BizBindWxaInfoPreference.b(this.pkM));
    AppMethodBeat.o(23295);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.BizBindWxaInfoPreference.2
 * JD-Core Version:    0.6.2
 */