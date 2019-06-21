package com.tencent.mm.plugin.appbrand.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.fu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.ui.base.preference.f;

final class AppBrandAuthorizeUI$10
  implements DialogInterface.OnClickListener
{
  AppBrandAuthorizeUI$10(AppBrandAuthorizeUI paramAppBrandAuthorizeUI, fu paramfu, Preference paramPreference, f paramf)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(132902);
    ab.d("MicroMsg.AppBrandAuthorizeUI", "set authItem.state open");
    this.iFS.state = 1;
    ((CheckBoxPreference)this.iFO).uOT = true;
    this.iFR.notifyDataSetChanged();
    AppMethodBeat.o(132902);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.10
 * JD-Core Version:    0.6.2
 */