package com.tencent.mm.ui.bizchat;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.a.b;
import com.tencent.mm.aj.a.d;
import com.tencent.mm.aj.z;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf.a;
import com.tencent.mm.model.c;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.p;

final class BizChatConversationUI$BizChatConversationFmUI$8
  implements bf.a
{
  BizChatConversationUI$BizChatConversationFmUI$8(BizChatConversationUI.BizChatConversationFmUI paramBizChatConversationFmUI, long paramLong)
  {
  }

  public final boolean JU()
  {
    AppMethodBeat.i(30064);
    boolean bool = BizChatConversationUI.BizChatConversationFmUI.o(this.yEp);
    AppMethodBeat.o(30064);
    return bool;
  }

  public final void JV()
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(30065);
    if (BizChatConversationUI.BizChatConversationFmUI.p(this.yEp) != null)
    {
      z.aeT().fw(this.fkE);
      z.aeU().fw(this.fkE);
      Object localObject = z.aeU();
      String str = BizChatConversationUI.BizChatConversationFmUI.a(this.yEp);
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("select count(*) from BizChatConversation");
      localStringBuilder.append(" where brandUserName = '").append(str).append("' ");
      str = localStringBuilder.toString();
      localObject = ((b)localObject).bSd.a(str, null, 2);
      if (localObject != null)
      {
        i = j;
        if (((Cursor)localObject).moveToFirst())
          i = ((Cursor)localObject).getInt(0);
        ((Cursor)localObject).close();
      }
      if (i <= 0)
      {
        aw.ZK();
        c.XR().aoX(BizChatConversationUI.BizChatConversationFmUI.a(this.yEp));
      }
      BizChatConversationUI.BizChatConversationFmUI.p(this.yEp).dismiss();
    }
    AppMethodBeat.o(30065);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.bizchat.BizChatConversationUI.BizChatConversationFmUI.8
 * JD-Core Version:    0.6.2
 */