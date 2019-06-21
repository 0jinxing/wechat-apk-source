package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MallIndexUI$8
  implements View.OnClickListener
{
  MallIndexUI$8(MallIndexUI paramMallIndexUI, com.tencent.mm.plugin.mall.a.d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43211);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.onx.okM);
    com.tencent.mm.bp.d.b(this.onu, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(43211);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.MallIndexUI.8
 * JD-Core Version:    0.6.2
 */