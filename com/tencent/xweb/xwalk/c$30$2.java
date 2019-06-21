package com.tencent.xweb.xwalk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Environment;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$30$2
  implements DialogInterface.OnClickListener
{
  c$30$2(c.30 param30)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(85151);
    c.b(this.ARr.ARk, Environment.getExternalStorageDirectory() + "/xweb_dump");
    AppMethodBeat.o(85151);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.xwalk.c.30.2
 * JD-Core Version:    0.6.2
 */