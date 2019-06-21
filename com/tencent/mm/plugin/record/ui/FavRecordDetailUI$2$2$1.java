package com.tencent.mm.plugin.record.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gh;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;

final class FavRecordDetailUI$2$2$1
  implements DialogInterface.OnClickListener
{
  FavRecordDetailUI$2$2$1(FavRecordDetailUI.2.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(24205);
    paramDialogInterface = h.b(this.pKm.pKl.pKi.mController.ylL, this.pKm.pKl.pKi.getString(2131296882), false, null);
    gh localgh = new gh();
    localgh.cAH.type = 12;
    localgh.cAH.cvv = FavRecordDetailUI.a(this.pKm.pKl.pKi);
    localgh.cAH.cAM = new FavRecordDetailUI.2.2.1.1(this, paramDialogInterface);
    a.xxA.m(localgh);
    AppMethodBeat.o(24205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.FavRecordDetailUI.2.2.1
 * JD-Core Version:    0.6.2
 */