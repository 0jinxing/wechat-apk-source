package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$3
  implements DialogInterface.OnClickListener
{
  c$3(c paramc)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(111700);
    Intent localIntent = new Intent("android.settings.SECURITY_SETTINGS");
    this.neo.mContext.startActivity(localIntent);
    paramDialogInterface.cancel();
    AppMethodBeat.o(111700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.c.3
 * JD-Core Version:    0.6.2
 */