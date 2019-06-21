package com.tencent.mm.ui.transmit;

import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.i;

final class SelectConversationUI$30
  implements e.a
{
  SelectConversationUI$30(SelectConversationUI paramSelectConversationUI, Intent paramIntent, String paramString, View paramView)
  {
  }

  public final void z(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(35152);
    if (paramBoolean)
    {
      this.val$intent.putExtra("custom_send_text", paramString);
      SelectConversationUI.a(this.zKj, -1, this.val$intent);
      this.zKj.finish();
    }
    while (true)
    {
      ((i)g.K(i.class)).a(this.hno, this.val$view);
      AppMethodBeat.o(35152);
      return;
      SelectConversationUI.a(this.zKj, 0, this.val$intent);
      this.zKj.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.SelectConversationUI.30
 * JD-Core Version:    0.6.2
 */