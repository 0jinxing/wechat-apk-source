package com.tencent.mm.plugin.voip.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class VoipScoreDialog$3
  implements DialogInterface.OnDismissListener
{
  VoipScoreDialog$3(VoipScoreDialog paramVoipScoreDialog)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(4858);
    this.sWP.finish();
    AppMethodBeat.o(4858);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.ui.VoipScoreDialog.3
 * JD-Core Version:    0.6.2
 */