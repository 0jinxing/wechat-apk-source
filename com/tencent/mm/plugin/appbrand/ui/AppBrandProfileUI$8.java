package com.tencent.mm.plugin.appbrand.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import java.util.List;

final class AppBrandProfileUI$8
  implements View.OnClickListener
{
  AppBrandProfileUI$8(AppBrandProfileUI paramAppBrandProfileUI, List paramList)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133033);
    if (!this.iIk.isEmpty())
    {
      WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)this.iIk.get(0);
      d.b(paramView.getContext(), "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", localWxaEntryInfo.username).putExtra("key_start_biz_profile_from_app_brand_profile", true).putExtra("key_use_new_contact_profile", true).putExtra("force_get_contact", true));
      AppBrandProfileUI.a(this.iIf, 3, 1);
    }
    AppMethodBeat.o(133033);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.8
 * JD-Core Version:    0.6.2
 */