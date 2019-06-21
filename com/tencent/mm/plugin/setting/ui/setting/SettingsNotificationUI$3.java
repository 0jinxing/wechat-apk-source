package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.f;
import com.tencent.mm.model.au;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.bi;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class SettingsNotificationUI$3
  implements DialogInterface.OnClickListener
{
  SettingsNotificationUI$3(SettingsNotificationUI paramSettingsNotificationUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127354);
    f.bM(false);
    paramDialogInterface = new bi();
    paramDialogInterface.hO(2);
    paramDialogInterface.eJ(System.currentTimeMillis());
    paramDialogInterface.setType(1);
    paramDialogInterface.ju("weixin");
    paramDialogInterface.setContent(this.qoe.mController.ylL.getString(2131303181, new Object[] { Build.MODEL }));
    bf.l(paramDialogInterface);
    paramDialogInterface = ((j)g.K(j.class)).XR().aoZ("weixin");
    if (paramDialogInterface != null)
    {
      paramDialogInterface.setContent(this.qoe.mController.ylL.getString(2131303181, new Object[] { Build.MODEL }));
      paramDialogInterface.hM(paramDialogInterface.field_unReadCount + 1);
      ((j)g.K(j.class)).XR().a(paramDialogInterface, "weixin");
    }
    while (true)
    {
      this.qoe.initView();
      h.pYm.a(500L, 3L, 1L, false);
      au.k(false, true);
      AppMethodBeat.o(127354);
      return;
      paramDialogInterface = new ak();
      paramDialogInterface.setContent(this.qoe.mController.ylL.getString(2131303181, new Object[] { Build.MODEL }));
      paramDialogInterface.setUsername("weixin");
      paramDialogInterface.hM(1);
      ((j)g.K(j.class)).XR().d(paramDialogInterface);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsNotificationUI.3
 * JD-Core Version:    0.6.2
 */