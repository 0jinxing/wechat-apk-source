package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class SettingsTrustFriendUI$10
  implements View.OnClickListener
{
  SettingsTrustFriendUI$10(SettingsTrustFriendUI paramSettingsTrustFriendUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(127541);
    paramView = new Intent();
    paramView.putExtra("rawUrl", "https://weixin110.qq.com/security/readtemplate?t=w_security_center_website/trusted_friend_guide");
    d.b(this.qpo, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(127541);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsTrustFriendUI.10
 * JD-Core Version:    0.6.2
 */