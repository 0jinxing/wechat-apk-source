package com.tencent.mm.ui.chatting.viewitems;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.ui.base.b;
import com.tencent.mm.ui.chatting.TextPreviewUI;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class al$a$1
  implements View.OnClickListener
{
  al$a$1(al.a parama, al.f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33285);
    Intent localIntent = new Intent(paramView.getContext(), TextPreviewUI.class);
    localIntent.addFlags(67108864);
    ay localay = (ay)this.zgL.zgQ.getTag();
    if (localay != null)
    {
      CharSequence localCharSequence = this.zgL.zgQ.dPr();
      localIntent.putExtra("Chat_Msg_Id", localay.cKd.field_msgId);
      localIntent.putExtra("key_chat_text", localCharSequence);
      paramView.getContext().startActivity(localIntent);
      b.hL(paramView.getContext());
    }
    AppMethodBeat.o(33285);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.al.a.1
 * JD-Core Version:    0.6.2
 */