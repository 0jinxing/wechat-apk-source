package com.tencent.mm.ui.conversation;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;

final class BaseConversationUI$b
  implements Runnable
{
  int bFZ;
  Intent cEd;
  int requestCode;
  int ypy = 0;

  private BaseConversationUI$b(BaseConversationUI paramBaseConversationUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34074);
    if (aw.RK())
    {
      ab.i("MicroMsg.BaseConversationUI", "on post select image job, acc has ready, retry count %d", new Object[] { Integer.valueOf(this.ypy) });
      this.zqF.startChatting(BaseConversationUI.access$1500(this.zqF));
      al.d(new BaseConversationUI.b.1(this));
      AppMethodBeat.o(34074);
    }
    while (true)
    {
      return;
      if (this.ypy >= 3)
      {
        ab.w("MicroMsg.BaseConversationUI", "on post select image job, match max retry count");
        AppMethodBeat.o(34074);
      }
      else
      {
        ab.w("MicroMsg.BaseConversationUI", "on post select image job, acc not ready, cur retry count %d", new Object[] { Integer.valueOf(this.ypy) });
        this.ypy += 1;
        al.n(this, 300L);
        AppMethodBeat.o(34074);
      }
    }
  }

  public final String toString()
  {
    AppMethodBeat.i(34075);
    String str = super.toString() + "|PostSelectImageJob";
    AppMethodBeat.o(34075);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.b
 * JD-Core Version:    0.6.2
 */