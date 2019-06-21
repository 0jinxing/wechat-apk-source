package com.tencent.mm.plugin.wallet_core.id_verify.util;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.wallet_core.ui.j.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.wallet_core.ui.e;

final class a$1
  implements j.a
{
  a$1(a parama, int paramInt, String paramString, MMActivity paramMMActivity)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(46666);
    e.a(3, bo.anT(), this.tvW);
    paramView = new Intent();
    paramView.putExtra("rawUrl", this.tvX);
    paramView.putExtra("showShare", false);
    d.b(this.cgq, "webview", ".ui.tools.WebViewUI", paramView);
    AppMethodBeat.o(46666);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.id_verify.util.a.1
 * JD-Core Version:    0.6.2
 */