package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a.b;

final class SelectConversationUI$19
  implements c.a.b
{
  SelectConversationUI$19(SelectConversationUI paramSelectConversationUI, String paramString)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(35142);
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", this.val$url);
    localIntent.putExtra("showShare", false);
    d.b(this.zKj.mController.ylL, "webview", ".ui.tools.WebViewUI", localIntent);
    AppMethodBeat.o(35142);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.19
 * JD-Core Version:    0.6.2
 */