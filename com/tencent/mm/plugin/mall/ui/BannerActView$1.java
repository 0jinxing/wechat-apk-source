package com.tencent.mm.plugin.mall.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.wallet_core.model.mall.a;
import com.tencent.mm.plugin.wallet_core.model.mall.b;
import java.util.List;

final class BannerActView$1
  implements View.OnClickListener
{
  BannerActView$1(BannerActView paramBannerActView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(43127);
    this.olk.setVisibility(8);
    b.dT(BannerActView.a(this.olk));
    if ((BannerActView.a(this.olk) != null) && (BannerActView.a(this.olk).size() > 0))
    {
      paramView = new Intent();
      paramView.putExtra("rawUrl", ((a)BannerActView.a(this.olk).get(0)).tDk);
      d.b(this.olk.getContext(), "webview", ".ui.tools.WebViewUI", paramView);
    }
    AppMethodBeat.o(43127);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.ui.BannerActView.1
 * JD-Core Version:    0.6.2
 */