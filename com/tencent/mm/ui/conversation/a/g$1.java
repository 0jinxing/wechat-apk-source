package com.tencent.mm.ui.conversation.a;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.ref.WeakReference;

final class g$1
  implements View.OnClickListener
{
  g$1(g paramg, String paramString)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(34652);
    paramView = new Intent();
    paramView.putExtra("k_username", this.zwo.zwk);
    int i = 39;
    if (this.zwo.yFW)
      i = 36;
    paramView.putExtra("showShare", false);
    if (!bo.isNullOrNil(this.zwn))
      paramView.putExtra("rawUrl", this.zwn);
    while (true)
    {
      if (this.zwo.vlu.get() != null)
        com.tencent.mm.bp.d.b((Context)this.zwo.vlu.get(), "webview", ".ui.tools.WebViewUI", paramView);
      aw.ZK().Yl().oW(this.zwo.zwk);
      aw.ZK().Yl().oW(this.zwo.zwl);
      AppMethodBeat.o(34652);
      return;
      paramView.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(i) }));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.a.g.1
 * JD-Core Version:    0.6.2
 */