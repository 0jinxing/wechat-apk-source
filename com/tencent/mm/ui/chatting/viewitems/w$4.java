package com.tencent.mm.ui.chatting.viewitems;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;

final class w$4
  implements View.OnClickListener
{
  w$4(w paramw, String paramString1, String paramString2)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33130);
    if (!bo.isNullOrNil(this.val$url))
    {
      paramView = new Intent();
      paramView.putExtra("rawUrl", this.val$url);
      d.b(w.b(this.zeW).yTx.getContext(), "webview", ".ui.tools.WebViewUI", paramView);
      h.pYm.e(11608, new Object[] { w.d(this.zeW), this.uHr, Integer.valueOf(1) });
    }
    AppMethodBeat.o(33130);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.w.4
 * JD-Core Version:    0.6.2
 */