package com.tencent.mm.plugin.scanner.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class ProductUI$15
  implements View.OnClickListener
{
  ProductUI$15(ProductUI paramProductUI, o.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81098);
    ProductUI.a(this.qdu, 10003, this.qdw.field_introlink);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.qdw.field_introlink);
    paramView.putExtra("geta8key_scene", ProductUI.m(this.qdu));
    d.b(this.qdu.mController.ylL, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(81098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.15
 * JD-Core Version:    0.6.2
 */