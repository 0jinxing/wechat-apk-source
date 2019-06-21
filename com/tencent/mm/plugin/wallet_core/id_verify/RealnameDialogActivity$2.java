package com.tencent.mm.plugin.wallet_core.id_verify;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class RealnameDialogActivity$2
  implements DialogInterface.OnClickListener
{
  RealnameDialogActivity$2(RealnameDialogActivity paramRealnameDialogActivity)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46588);
    paramDialogInterface.dismiss();
    this.tuS.finish();
    AppMethodBeat.o(46588);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.RealnameDialogActivity.2
 * JD-Core Version:    0.6.2
 */