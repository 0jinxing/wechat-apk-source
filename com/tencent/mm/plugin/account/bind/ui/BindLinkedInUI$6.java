package com.tencent.mm.plugin.account.bind.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;

final class BindLinkedInUI$6
  implements View.OnClickListener
{
  BindLinkedInUI$6(BindLinkedInUI paramBindLinkedInUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(13390);
    String str = (String)g.RP().Ry().get(286723, null);
    if (!bo.isNullOrNil(str))
    {
      paramView = new Intent();
      paramView.putExtra("rawUrl", str);
      paramView.putExtra("geta8key_username", r.Yz());
      d.b(this.grc, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", paramView);
    }
    AppMethodBeat.o(13390);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindLinkedInUI.6
 * JD-Core Version:    0.6.2
 */