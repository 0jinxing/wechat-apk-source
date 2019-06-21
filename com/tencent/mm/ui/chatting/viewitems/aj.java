package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.b;
import com.tencent.mm.ba.r;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.neattextview.textview.view.NeatTextView;

final class aj
  implements ai.a
{
  public final void b(c.a parama, int paramInt, com.tencent.mm.ui.chatting.d.a parama1, bi parambi)
  {
    AppMethodBeat.i(33282);
    parama = (ai.b)parama;
    parama.zgE.ah(parambi.field_content);
    Bundle localBundle = new Bundle();
    localBundle.putString("chatroom_name", parama1.getTalkerUserName());
    localBundle.putLong("msg_id", parambi.field_msgId);
    if ((parambi.field_flag & 0x8) != 0)
    {
      parama.zgE.a(j.a(parama1.yTx.getContext(), parambi.field_content, (int)parama.zgE.getTextSize(), false, localBundle), TextView.BufferType.SPANNABLE);
      parama.zgE.setClickable(true);
      parambi = r.aiy().sU(parama1.getTalkerUserName());
      aw.ZK();
      paramInt = ((Integer)c.Ry().get(12311, Integer.valueOf(-2))).intValue();
      if (((parambi == null) || (parambi.fLV == -2)) && ((parambi != null) || (paramInt == -2)))
        break label268;
      parama.zgE.setTextColor(parama1.yTx.getContext().getResources().getColor(2131689764));
      parama.zgE.setBackground(parama1.yTx.getContext().getResources().getDrawable(2130838200));
    }
    while (true)
    {
      parama.zgE.invalidate();
      AppMethodBeat.o(33282);
      return;
      parama.zgE.a(j.a(parama1.yTx.getContext(), parambi.field_content, (int)parama.zgE.getTextSize(), true, localBundle), TextView.BufferType.SPANNABLE);
      break;
      label268: parama.zgE.setTextColor(parama1.yTx.getContext().getResources().getColor(2131690556));
      parama.zgE.setBackground(parama1.yTx.getContext().getResources().getDrawable(2130838199));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.aj
 * JD-Core Version:    0.6.2
 */