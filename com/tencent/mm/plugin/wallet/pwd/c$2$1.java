package com.tencent.mm.plugin.wallet.pwd;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$2$1
  implements DialogInterface.OnClickListener
{
  c$2$1(c.2 param2)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(46156);
    c.c(this.tqx.tqw).putInt("RESET_PWD_USER_ACTION", 2);
    this.tqx.tqw.a(this.tqx.hwd, 0, c.d(this.tqx.tqw));
    AppMethodBeat.o(46156);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.pwd.c.2.1
 * JD-Core Version:    0.6.2
 */