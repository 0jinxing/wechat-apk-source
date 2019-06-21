package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.ui.MMActivity;

final class g$129
  implements Runnable
{
  g$129(g paramg, String paramString1, String paramString2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(9206);
    Intent localIntent = new Intent();
    localIntent.putExtra("scene_from", 4);
    localIntent.putExtra("Select_Conv_Type", 3);
    localIntent.putExtra("select_is_ret", true);
    localIntent.putExtra("mutil_select_is_ret", true);
    localIntent.putExtra("Retr_Msg_Type", 5);
    localIntent.putExtra("Retr_Msg_thumb_path", this.iRf);
    localIntent.putExtra("emoji_activity_id", this.uIv);
    localIntent.putExtra("MMActivity.OverrideEnterAnimation", 2131034180);
    if ((g.i(this.uHd) instanceof MMActivity))
      d.a((MMActivity)g.i(this.uHd), ".ui.transmit.SelectConversationUI", localIntent, 52, this.uHd);
    AppMethodBeat.o(9206);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g.129
 * JD-Core Version:    0.6.2
 */