package com.tencent.mm.ui.transmit;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.pluginsdk.ui.applet.q.a;

final class SelectConversationUI$26
  implements q.a
{
  SelectConversationUI$26(SelectConversationUI paramSelectConversationUI, String paramString)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    AppMethodBeat.i(35148);
    this.zKj.aqX();
    Intent localIntent;
    if (paramBoolean)
    {
      localIntent = new Intent();
      if (!t.kH(this.zKo))
        break label83;
      SelectConversationUI.d(localIntent, SelectConversationUI.g(this.zKj), this.zKo);
    }
    while (true)
    {
      localIntent.putExtra("custom_send_text", paramString);
      SelectConversationUI.a(this.zKj, -1, localIntent);
      this.zKj.finish();
      AppMethodBeat.o(35148);
      return;
      label83: SelectConversationUI.e(localIntent, SelectConversationUI.g(this.zKj), this.zKo);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.26
 * JD-Core Version:    0.6.2
 */