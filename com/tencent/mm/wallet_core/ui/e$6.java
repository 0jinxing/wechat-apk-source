package com.tencent.mm.wallet_core.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.protocal.g;
import com.tencent.mm.sdk.platformtools.ab;

final class e$6
  implements View.OnClickListener
{
  e$6(String paramString1, TextView paramTextView, String paramString2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(49261);
    ab.i("MicroMsg.WalletBaseUtil ", "hy: on click banner");
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.val$url);
    paramView.putExtra("showShare", false);
    d.b(this.AhK.getContext(), "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    g.gu(e.arI(this.AhL), 1);
    AppMethodBeat.o(49261);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.e.6
 * JD-Core Version:    0.6.2
 */