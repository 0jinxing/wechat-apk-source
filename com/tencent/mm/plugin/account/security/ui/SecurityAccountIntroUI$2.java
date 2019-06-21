package com.tencent.mm.plugin.account.security.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.account.a.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

final class SecurityAccountIntroUI$2
  implements View.OnClickListener
{
  SecurityAccountIntroUI$2(SecurityAccountIntroUI paramSecurityAccountIntroUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(69905);
    paramView = aa.g(this.gzS.getSharedPreferences(ah.doA(), 0));
    Intent localIntent = new Intent();
    if (bo.isNullOrNil(SecurityAccountIntroUI.d(this.gzS)))
      localIntent.putExtra("rawUrl", String.format("https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?lang=%s&t=w_unprotect&step=1&f=Android", new Object[] { paramView }));
    while (true)
    {
      localIntent.putExtra("useJs", true);
      localIntent.putExtra("vertical_scroll", true);
      localIntent.putExtra("title", this.gzS.getString(2131302695));
      localIntent.putExtra("show_bottom", false);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("neverGetA8Key", true);
      localIntent.putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
      localIntent.putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
      a.gkE.i(localIntent, this.gzS);
      AppMethodBeat.o(69905);
      return;
      localIntent.putExtra("rawUrl", SecurityAccountIntroUI.d(this.gzS));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.SecurityAccountIntroUI.2
 * JD-Core Version:    0.6.2
 */