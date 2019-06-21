package com.tencent.mm.plugin.appbrand.widget.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class f$5
  implements DialogInterface.OnDismissListener
{
  public f$5(f paramf, Runnable paramRunnable)
  {
  }

  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    AppMethodBeat.i(134257);
    ab.i(f.TAG, "user dismiss evaluate dialog");
    if (!f.a(this.jck))
      f.b(this.jck);
    f.P(this.val$runnable);
    AppMethodBeat.o(134257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.b.f.5
 * JD-Core Version:    0.6.2
 */