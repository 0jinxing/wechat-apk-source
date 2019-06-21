package com.tencent.mm.plugin.appbrand.launching;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ah;

final class v$3
  implements Runnable
{
  v$3(v paramv, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(131890);
    Toast.makeText(ah.getContext(), this.ihH, 0).show();
    AppMethodBeat.o(131890);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.v.3
 * JD-Core Version:    0.6.2
 */