package com.tencent.mm.plugin.appbrand.widget.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class f$1
  implements DialogInterface.OnCancelListener
{
  public f$1(f paramf)
  {
  }

  public final void onCancel(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(134253);
    ab.i(f.TAG, "user cancel evaluate dialog");
    f.a(this.jck, false);
    AppMethodBeat.o(134253);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f.1
 * JD-Core Version:    0.6.2
 */