package com.tencent.mm.plugin.voip.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.snackbar.b;

final class VoipScoreDialog$4
  implements DialogInterface.OnClickListener
{
  VoipScoreDialog$4(VoipScoreDialog paramVoipScoreDialog)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(4860);
    VoipScoreDialog.b(this.sWP, 3);
    b.a(this.sWP, null, this.sWP.getString(2131304461), new VoipScoreDialog.4.1(this));
    if (VoipScoreDialog.a(this.sWP) != null)
      VoipScoreDialog.a(this.sWP).dismiss();
    AppMethodBeat.o(4860);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipScoreDialog.4
 * JD-Core Version:    0.6.2
 */