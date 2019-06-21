package com.tencent.mm.plugin.appbrand.widget.input;

import android.view.ViewConfiguration;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ag$1
  implements Runnable
{
  ag$1(ag paramag)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(123835);
    this.jgN.jgK = true;
    ab.v(this.jgN.TAG, "[apptouch] pendingCheckForTap run, pointerDown TRUE");
    this.jgN.jgG.postDelayed(this.jgN.jgM, ViewConfiguration.getLongPressTimeout());
    AppMethodBeat.o(123835);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.ag.1
 * JD-Core Version:    0.6.2
 */