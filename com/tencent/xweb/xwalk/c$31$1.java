package com.tencent.xweb.xwalk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.xweb.xwalk.a.f;
import com.tencent.xweb.xwalk.a.g;

final class c$31$1
  implements DialogInterface.OnClickListener
{
  c$31$1(c.31 param31)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(85153);
    if (!this.ARv.mFinished)
    {
      paramDialogInterface = this.ARv.ARt;
      if (paramDialogInterface.ASM != null)
        paramDialogInterface.ASM.a(4, -1, null);
    }
    AppMethodBeat.o(85153);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.31.1
 * JD-Core Version:    0.6.2
 */