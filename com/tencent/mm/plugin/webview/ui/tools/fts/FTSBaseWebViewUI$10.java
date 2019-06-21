package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.z;
import com.tencent.mm.plugin.webview.ui.tools.jsapi.d;

final class FTSBaseWebViewUI$10
  implements Runnable
{
  FTSBaseWebViewUI$10(FTSBaseWebViewUI paramFTSBaseWebViewUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(8392);
    int i;
    String str1;
    String str2;
    if (FTSBaseWebViewUI.e(this.uAU) != null)
    {
      FTSBaseWebViewUI.f(this.uAU).a(this.uAU.getTotalQuery(), this.uAU.getInEditTextQuery(), this.uAU.dbB(), 0, null);
      if (!TextUtils.isEmpty(this.uAU.getInEditTextQuery()))
      {
        i = FTSBaseWebViewUI.g(this.uAU);
        str1 = this.uAU.cvF;
        str2 = this.uAU.cIy;
        if (this.uAU.uAO != 0)
          break label128;
      }
    }
    label128: for (boolean bool = true; ; bool = false)
    {
      z.a(i, str1, str2, bool, this.uAU.getInEditTextQuery(), FTSBaseWebViewUI.h(this.uAU));
      AppMethodBeat.o(8392);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI.10
 * JD-Core Version:    0.6.2
 */