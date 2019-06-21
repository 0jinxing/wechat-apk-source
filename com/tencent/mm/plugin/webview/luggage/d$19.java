package com.tencent.mm.plugin.webview.luggage;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import com.tencent.luggage.d.k;
import com.tencent.luggage.d.n;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$19
  implements View.OnClickListener
{
  d$19(d paramd)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(6041);
    this.uiy.bPN.loadUrl(this.uiy.getUrl());
    d.a(this.uiy).setVisibility(8);
    AppMethodBeat.o(6041);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.d.19
 * JD-Core Version:    0.6.2
 */