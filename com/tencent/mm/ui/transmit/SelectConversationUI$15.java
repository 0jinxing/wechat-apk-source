package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.bp.d;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.a.c.a.b;

final class SelectConversationUI$15
  implements c.a.b
{
  SelectConversationUI$15(SelectConversationUI paramSelectConversationUI, j.b paramb)
  {
  }

  public final void bwF()
  {
    AppMethodBeat.i(35139);
    Object localObject1 = p.B(this.hWW.url, "message");
    String str = p.B(this.hWW.fgn, "message");
    Object localObject2;
    if (at.isMobile(this.zKj.mController.ylL))
    {
      localObject2 = localObject1;
      if (str != null)
      {
        if (str.length() > 0)
          break label123;
        localObject2 = localObject1;
      }
    }
    while (true)
    {
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("rawUrl", (String)localObject2);
      ((Intent)localObject1).putExtra("showShare", false);
      d.b(this.zKj.mController.ylL, "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
      AppMethodBeat.o(35139);
      return;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((String)localObject1).length() > 0);
      }
      else
      {
        label123: localObject2 = str;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.15
 * JD-Core Version:    0.6.2
 */