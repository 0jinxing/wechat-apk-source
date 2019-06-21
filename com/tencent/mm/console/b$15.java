package com.tencent.mm.console;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.text.ClipboardManager;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$15
  implements DialogInterface.OnClickListener
{
  b$15(Context paramContext, String paramString)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(16096);
    ((ClipboardManager)this.ewr.getSystemService("clipboard")).setText(this.ewu);
    AppMethodBeat.o(16096);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.console.b.15
 * JD-Core Version:    0.6.2
 */