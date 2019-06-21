package com.tencent.mm.plugin.webview.ui.tools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;
import com.tencent.mm.sdk.platformtools.ab;

final class n$14
  implements Runnable
{
  n$14(n paramn, WebViewUI paramWebViewUI, Bundle paramBundle, k paramk, d paramd)
  {
  }

  public final void run()
  {
    boolean bool1 = false;
    AppMethodBeat.i(7726);
    if ((this.uul == null) || (this.uul.isFinishing()))
    {
      AppMethodBeat.o(7726);
      return;
    }
    byte[] arrayOfByte = this.cgJ.getByteArray("jsapi_control_bytes");
    boolean bool2;
    if ((arrayOfByte == null) || (this.uun == null) || (this.uun.cZS() == null))
      if (arrayOfByte != null)
      {
        bool2 = true;
        label69: if (this.uun != null)
          bool1 = true;
        ab.e("MicroMsg.WebViewStubCallbackAIDLStub", "has JSAPI_CONTROL_BYTES %b, has wvPerm %b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool1) });
      }
    while (true)
    {
      if (this.uum != null)
        this.uum.dcj();
      AppMethodBeat.o(7726);
      break;
      bool2 = false;
      break label69;
      ab.i("MicroMsg.WebViewStubCallbackAIDLStub", "update control bytes by preverify, %d", new Object[] { Integer.valueOf(arrayOfByte.length) });
      this.uun.cZS().vxM = arrayOfByte;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.n.14
 * JD-Core Version:    0.6.2
 */