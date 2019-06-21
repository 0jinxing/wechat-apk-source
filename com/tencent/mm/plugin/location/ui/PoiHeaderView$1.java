package com.tencent.mm.plugin.location.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class PoiHeaderView$1
  implements View.OnClickListener
{
  PoiHeaderView$1(PoiHeaderView paramPoiHeaderView)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113468);
    Intent localIntent = new Intent();
    if (bo.isNullOrNil(PoiHeaderView.a(this.nMh)));
    for (paramView = PoiHeaderView.b(this.nMh); ; paramView = PoiHeaderView.a(this.nMh))
    {
      ab.d("MicroMsg.PoiHeaderView", "click url %s", new Object[] { paramView });
      localIntent.putExtra("rawUrl", paramView);
      localIntent.putExtra("showShare", false);
      d.f(this.nMh.getContext(), "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", localIntent);
      AppMethodBeat.o(113468);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.PoiHeaderView.1
 * JD-Core Version:    0.6.2
 */