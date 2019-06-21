package com.tencent.mm.plugin.aa.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

final class AASelectContactUI$4$1
  implements DialogInterface.OnClickListener
{
  AASelectContactUI$4$1(AASelectContactUI.4 param4)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(40752);
    if (AASelectContactUI.b(this.gnN.gnL).size() > AASelectContactUI.d(this.gnN.gnL))
    {
      com.tencent.mm.ui.base.h.b(this.gnN.gnL.mController.ylL, this.gnN.gnL.getString(2131300919, new Object[] { Long.valueOf(AASelectContactUI.d(this.gnN.gnL)) }), "", true);
      com.tencent.mm.plugin.report.service.h.pYm.e(13722, new Object[] { Integer.valueOf(3) });
      AppMethodBeat.o(40752);
    }
    while (true)
    {
      return;
      paramDialogInterface = new LinkedList();
      paramDialogInterface.addAll(AASelectContactUI.b(this.gnN.gnL));
      paramDialogInterface = bo.c(paramDialogInterface, ",");
      this.gnN.gnL.setResult(-1, this.gnN.gnL.getIntent().putExtra("Select_Contact", paramDialogInterface));
      this.gnN.gnL.finish();
      com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(11) });
      AppMethodBeat.o(40752);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AASelectContactUI.4.1
 * JD-Core Version:    0.6.2
 */