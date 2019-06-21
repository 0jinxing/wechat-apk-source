package com.tencent.mm.plugin.profile;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$3
  implements DialogInterface.OnClickListener
{
  a$3(a parama)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(23205);
    paramDialogInterface.dismiss();
    AppMethodBeat.o(23205);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.a.3
 * JD-Core Version:    0.6.2
 */