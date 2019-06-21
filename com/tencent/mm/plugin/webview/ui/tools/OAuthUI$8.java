package com.tencent.mm.plugin.webview.ui.tools;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class OAuthUI$8
  implements ap.a
{
  OAuthUI$8(OAuthUI paramOAuthUI, String paramString, View paramView, ThreeDotsLoadingView paramThreeDotsLoadingView)
  {
  }

  public final boolean BI()
  {
    AppMethodBeat.i(7425);
    OAuthUI.a(this.urX, this.mTQ);
    this.urY.setVisibility(8);
    this.urZ.dKT();
    AppMethodBeat.o(7425);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.OAuthUI.8
 * JD-Core Version:    0.6.2
 */