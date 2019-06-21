package com.tencent.mm.plugin.scanner.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.sdk.platformtools.bo;

final class ProductUI$14
  implements View.OnClickListener
{
  ProductUI$14(ProductUI paramProductUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81097);
    if ((ProductUI.a(this.qdu) != null) && (!bo.isNullOrNil(ProductUI.a(this.qdu).field_certificationurl)))
    {
      ProductUI.a(this.qdu, 10002, ProductUI.a(this.qdu).field_certificationurl);
      ProductUI.a(this.qdu, ProductUI.a(this.qdu).field_certificationurl);
    }
    AppMethodBeat.o(81097);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.14
 * JD-Core Version:    0.6.2
 */