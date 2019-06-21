package com.tencent.mm.plugin.nfc_open.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class NfcWebViewUI$2
  implements Runnable
{
  NfcWebViewUI$2(NfcWebViewUI paramNfcWebViewUI, String paramString)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(23070);
    h.pYm.e(12794, new Object[] { this.oTB, Integer.valueOf(0) });
    ab.d("MicroMsg.NfcWebViewUI", "doCardTypeReport url = " + this.oTB);
    AppMethodBeat.o(23070);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI.2
 * JD-Core Version:    0.6.2
 */