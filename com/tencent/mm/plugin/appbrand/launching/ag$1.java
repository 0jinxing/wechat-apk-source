package com.tencent.mm.plugin.appbrand.launching;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class ag$1
  implements Runnable
{
  ag$1(String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131951);
    Toast.makeText(ah.getContext(), this.val$text, 0).show();
    AppMethodBeat.o(131951);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.ag.1
 * JD-Core Version:    0.6.2
 */