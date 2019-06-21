package com.tencent.mm.plugin.fav.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;

final class c$3
  implements DialogInterface.OnClickListener
{
  c$3(Context paramContext, DialogInterface.OnClickListener paramOnClickListener)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(73979);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_enter_fav_cleanui_from", 3);
    b.b(this.val$context, ".ui.FavCleanUI", localIntent);
    paramDialogInterface.dismiss();
    if (this.mif != null)
      this.mif.onClick(paramDialogInterface, -2);
    AppMethodBeat.o(73979);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.c.3
 * JD-Core Version:    0.6.2
 */