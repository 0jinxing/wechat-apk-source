package com.tencent.mm.plugin.webview.luggage;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.plugin.webview.modeltools.h;

final class g$2
  implements DialogInterface.OnCancelListener
{
  g$2(g paramg)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(6121);
    if (this.uiJ.icE != null)
    {
      paramDialogInterface = new Bundle();
      paramDialogInterface.putInt("type", 2);
      paramDialogInterface.putString("img_path", this.uiJ.icE.upr);
      f.a("com.tencent.mm", paramDialogInterface, g.c.class, null);
      this.uiJ.icE.cYK();
    }
    AppMethodBeat.o(6121);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.g.2
 * JD-Core Version:    0.6.2
 */