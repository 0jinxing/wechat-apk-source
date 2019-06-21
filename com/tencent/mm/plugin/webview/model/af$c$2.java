package com.tencent.mm.plugin.webview.model;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class af$c$2
  implements DialogInterface.OnClickListener
{
  public af$c$2(af.d paramd)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(6661);
    this.umg.goBack();
    AppMethodBeat.o(6661);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.model.af.c.2
 * JD-Core Version:    0.6.2
 */