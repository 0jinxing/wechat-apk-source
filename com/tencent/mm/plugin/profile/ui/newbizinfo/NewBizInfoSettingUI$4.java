package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.c;

final class NewBizInfoSettingUI$4
  implements DialogInterface.OnClickListener
{
  NewBizInfoSettingUI$4(NewBizInfoSettingUI paramNewBizInfoSettingUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23915);
    NewBizInfoSettingUI.b(this.pqr);
    c.cP(NewBizInfoSettingUI.a(this.pqr).field_username, 910);
    NewBizInfoSettingUI.c(this.pqr);
    AppMethodBeat.o(23915);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.4
 * JD-Core Version:    0.6.2
 */