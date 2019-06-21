package com.tencent.mm.plugin.profile.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class j$6
  implements DialogInterface.OnCancelListener
{
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(23553);
    j.aMr();
    AppMethodBeat.o(23553);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.j.6
 * JD-Core Version:    0.6.2
 */