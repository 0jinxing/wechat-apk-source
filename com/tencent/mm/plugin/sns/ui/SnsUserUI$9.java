package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class SnsUserUI$9
  implements DialogInterface.OnClickListener
{
  SnsUserUI$9(SnsUserUI paramSnsUserUI)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(39792);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(39792);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUserUI.9
 * JD-Core Version:    0.6.2
 */