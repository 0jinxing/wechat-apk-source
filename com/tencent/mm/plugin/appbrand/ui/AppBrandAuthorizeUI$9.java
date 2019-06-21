package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.fu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

final class AppBrandAuthorizeUI$9
  implements DialogInterface.OnClickListener
{
  AppBrandAuthorizeUI$9(AppBrandAuthorizeUI paramAppBrandAuthorizeUI, fu paramfu, Preference paramPreference, f paramf)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(132901);
    this.iFS.state = 2;
    AppBrandAuthorizeUI.a(this.iFJ, new AppBrandAuthorizeUI.9.1(this));
    ab.d("MicroMsg.AppBrandAuthorizeUI", "set authItem.state close");
    AppMethodBeat.o(132901);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.9
 * JD-Core Version:    0.6.2
 */