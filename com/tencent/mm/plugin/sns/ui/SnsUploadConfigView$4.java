package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;

final class SnsUploadConfigView$4
  implements DialogInterface.OnClickListener
{
  SnsUploadConfigView$4(SnsUploadConfigView paramSnsUploadConfigView)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39692);
    paramDialogInterface = new Intent();
    paramDialogInterface.putExtra("is_force_unbind", true);
    paramDialogInterface.putExtra("shake_music", true);
    d.b(this.rCy.getContext(), "account", ".ui.FacebookAuthUI", paramDialogInterface, 8);
    AppMethodBeat.o(39692);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUploadConfigView.4
 * JD-Core Version:    0.6.2
 */