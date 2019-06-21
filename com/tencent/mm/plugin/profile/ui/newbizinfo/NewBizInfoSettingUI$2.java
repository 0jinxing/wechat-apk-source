package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.d;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.c;

final class NewBizInfoSettingUI$2
  implements DialogInterface.OnClickListener
{
  NewBizInfoSettingUI$2(NewBizInfoSettingUI paramNewBizInfoSettingUI, d paramd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23913);
    this.cgD.field_hadAlert = 1;
    this.cgD.field_brandFlag |= 4;
    NewBizInfoSettingUI.a(this.pqr, this.cgD, true);
    c.cP(NewBizInfoSettingUI.a(this.pqr).field_username, 906);
    AppMethodBeat.o(23913);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoSettingUI.2
 * JD-Core Version:    0.6.2
 */