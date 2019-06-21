package com.tencent.mm.plugin.dbbackup;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.e;

final class c$6
  implements DialogInterface.OnClickListener
{
  c$6(c paramc, String paramString, Context paramContext)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(18936);
    e.N(this.kHZ, true);
    Toast.makeText(this.val$context, "Corruption test database cleared.", 0).show();
    AppMethodBeat.o(18936);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.dbbackup.c.6
 * JD-Core Version:    0.6.2
 */