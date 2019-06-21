package com.tencent.mm.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.network.e;
import com.tencent.mm.sdk.platformtools.ab;

final class JSAPIUploadLogHelperUI$1
  implements bk.a
{
  JSAPIUploadLogHelperUI$1(JSAPIUploadLogHelperUI paramJSAPIUploadLogHelperUI, String paramString, int paramInt)
  {
  }

  public final void a(e arg1)
  {
    AppMethodBeat.i(29438);
    synchronized (JSAPIUploadLogHelperUI.Qk())
    {
      JSAPIUploadLogHelperUI.pL(true);
      aw.Rg().a(1, "", 0, false);
      ab.dot();
      aw.Rg().a(2, this.fwC, this.gdi, aw.RK());
      AppMethodBeat.o(29438);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.JSAPIUploadLogHelperUI.1
 * JD-Core Version:    0.6.2
 */