package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.os.MessageQueue.IdleHandler;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.tools.TestTimeForChatting;

final class BaseConversationUI$3
  implements MessageQueue.IdleHandler
{
  BaseConversationUI$3(BaseConversationUI paramBaseConversationUI)
  {
  }

  public final boolean queueIdle()
  {
    AppMethodBeat.i(34047);
    long l = System.currentTimeMillis();
    if (BaseConversationUI.access$200(this.zqF) == null)
      if ((this.zqF.conversationFm == null) || (bo.isNullOrNil(this.zqF.conversationFm.getUserName())))
        break label127;
    label127: for (Object localObject = this.zqF.conversationFm.getUserName(); ; localObject = r.Yz())
    {
      localObject = new Intent().putExtra("Chat_User", (String)localObject);
      BaseConversationUI.access$300(this.zqF, (Intent)localObject, true);
      BaseConversationUI.access$200(this.zqF).setVisibility(8);
      this.zqF.resumeMainFragment();
      ab.d("MicroMsg.BaseConversationUI", "prepare chattingUI logic use %dms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
      AppMethodBeat.o(34047);
      return false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BaseConversationUI.3
 * JD-Core Version:    0.6.2
 */