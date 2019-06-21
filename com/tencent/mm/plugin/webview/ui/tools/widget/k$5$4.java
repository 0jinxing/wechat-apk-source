package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.platformtools.ab;

final class k$5$4
  implements Runnable
{
  k$5$4(k.5 param5, Bundle paramBundle)
  {
  }

  public final void run()
  {
    boolean bool1 = false;
    AppMethodBeat.i(9928);
    byte[] arrayOfByte = this.cgJ.getByteArray("jsapi_control_bytes");
    boolean bool2;
    if ((arrayOfByte == null) || (this.uJG.uJE.uFu == null) || (this.uJG.uJE.uFu.cZS() == null))
      if (arrayOfByte != null)
      {
        bool2 = true;
        if (this.uJG.uJE.uFu != null)
          bool1 = true;
        ab.e("MicroMsg.MMWebViewClient", "has JSAPI_CONTROL_BYTES %b, has wvPerm %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      }
    while (true)
    {
      if (this.uJG.uJE.uDd != null)
        this.uJG.uJE.uDd.dcj();
      AppMethodBeat.o(9928);
      return;
      bool2 = false;
      break;
      ab.i("MicroMsg.MMWebViewClient", "update control bytes by preverify, %d", new Object[] { Integer.valueOf(arrayOfByte.length) });
      this.uJG.uJE.uFu.cZS().vxM = arrayOfByte;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.k.5.4
 * JD-Core Version:    0.6.2
 */