package com.tencent.mm.model.gdpr.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.widget.b;

final class MPGdprPolicyUI$2
  implements b
{
  MPGdprPolicyUI$2(MPGdprPolicyUI paramMPGdprPolicyUI)
  {
  }

  public final boolean pa(String paramString)
  {
    AppMethodBeat.i(1503);
    this.foz.runOnUiThread(new MPGdprPolicyUI.2.1(this, paramString));
    AppMethodBeat.o(1503);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.model.gdpr.ui.MPGdprPolicyUI.2
 * JD-Core Version:    0.6.2
 */