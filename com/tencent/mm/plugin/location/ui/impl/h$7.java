package com.tencent.mm.plugin.location.ui.impl;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.e.m;

final class h$7
  implements View.OnClickListener
{
  h$7(h paramh, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(113700);
    paramView = new Intent();
    paramView.setClass(this.nRb.activity, e.m.class);
    ab.d("MicroMsg.TrackMapUI", "click url %s", new Object[] { this.nRd });
    paramView.putExtra("rawUrl", this.nRd);
    paramView.putExtra("showShare", false);
    d.f(this.nRb.activity, "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(113700);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.h.7
 * JD-Core Version:    0.6.2
 */