package com.tencent.mm.plugin.scanner.ui;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.d;
import com.tencent.mm.ui.q;

final class ProductFurtherInfoUI$2$1
  implements h.d
{
  ProductFurtherInfoUI$2$1(ProductFurtherInfoUI.2 param2)
  {
  }

  public final void bV(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(81044);
    switch (paramInt2)
    {
    default:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(81044);
      return;
      if (!bo.isNullOrNil(ProductFurtherInfoUI.a(this.qcG.qcF)))
      {
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", ProductFurtherInfoUI.a(this.qcG.qcF));
        d.b(this.qcG.qcF.mController.ylL, "webview", ".ui.tools.WebViewUI", localIntent);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductFurtherInfoUI.2.1
 * JD-Core Version:    0.6.2
 */