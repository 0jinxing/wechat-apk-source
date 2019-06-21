package com.tencent.mm.plugin.product.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.protocal.protobuf.bpz;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.t;

final class MallProductReceiptUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MallProductReceiptUI$1(MallProductReceiptUI paramMallProductReceiptUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    int i = 0;
    AppMethodBeat.i(44090);
    paramMenuItem = MallProductReceiptUI.a(this.pjd).getText().toString();
    if (!bo.isNullOrNil(paramMenuItem))
    {
      c localc = MallProductReceiptUI.b(this.pjd);
      localc.pgV = new bpz();
      bpz localbpz = localc.pgV;
      if (bo.isNullOrNil(paramMenuItem))
      {
        localbpz.wSm = i;
        localc.pgV.naq = paramMenuItem;
        this.pjd.finish();
      }
    }
    while (true)
    {
      AppMethodBeat.o(44090);
      return true;
      i = 1;
      break;
      t.makeText(this.pjd, 2131301353, 0).show();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductReceiptUI.1
 * JD-Core Version:    0.6.2
 */