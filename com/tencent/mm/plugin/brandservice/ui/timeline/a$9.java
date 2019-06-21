package com.tencent.mm.plugin.brandservice.ui.timeline;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.storage.q;

final class a$9
  implements View.OnClickListener
{
  a$9(a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14106);
    q localq = (q)paramView.getTag();
    paramView = new Intent();
    paramView.putExtra("Chat_User", localq.field_talker);
    paramView.putExtra("finish_direct", true);
    paramView.putExtra("KOpenArticleSceneFromScene", 90);
    paramView.putExtra("specific_chat_from_scene", 2);
    paramView.putExtra("preChatTYPE", 11);
    d.f(a.a(this.jNG), ".ui.chatting.ChattingUI", paramView);
    this.jNG.jNy.d(localq, 9);
    AppMethodBeat.o(14106);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.9
 * JD-Core Version:    0.6.2
 */