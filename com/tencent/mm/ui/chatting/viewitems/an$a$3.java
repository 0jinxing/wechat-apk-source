package com.tencent.mm.ui.chatting.viewitems;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.ui.chatting.c.b.ag;
import com.tencent.mm.ui.chatting.d.a;

final class an$a$3
  implements View.OnClickListener
{
  an$a$3(an.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(33358);
    paramView = (ChattingItemTranslate.a)((ChattingItemTranslate)paramView).getTag();
    if (((ag)an.a.a(this.zhw).aF(ag.class)).ni(paramView.cKd.field_msgId) == ChattingItemTranslate.b.zhi)
      ((ag)an.a.a(this.zhw).aF(ag.class)).a(paramView.cKd, true, paramView.position, 1);
    AppMethodBeat.o(33358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.an.a.3
 * JD-Core Version:    0.6.2
 */