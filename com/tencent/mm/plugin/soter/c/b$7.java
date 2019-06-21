package com.tencent.mm.plugin.soter.c;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$7
  implements DialogInterface.OnCancelListener
{
  b$7(b paramb)
  {
  }

  @TargetApi(16)
  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(73877);
    ab.i("MicroMsg.SoterControllerFingerprint", "hy: user cancelled auth");
    this.rNW.cvL();
    AppMethodBeat.o(73877);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.c.b.7
 * JD-Core Version:    0.6.2
 */