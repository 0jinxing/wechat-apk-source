package com.tencent.mm.plugin.profile.ui;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.report.service.h;

final class NormalUserFooterPreference$a$8
  implements DialogInterface.OnClickListener
{
  NormalUserFooterPreference$a$8(NormalUserFooterPreference.a parama, ProgressDialog paramProgressDialog, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23682);
    h.pYm.e(14553, new Object[] { Integer.valueOf(2), Integer.valueOf(3), NormalUserFooterPreference.a(this.poS.poR).field_username });
    this.eiD.show();
    this.poS.isDeleteCancel = false;
    this.poS.zq(this.pkF);
    AppMethodBeat.o(23682);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.NormalUserFooterPreference.a.8
 * JD-Core Version:    0.6.2
 */