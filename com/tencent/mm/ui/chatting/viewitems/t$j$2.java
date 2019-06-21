package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.res.Resources;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class t$j$2
  implements e.a
{
  t$j$2(t.j paramj, int paramInt, t.c paramc)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(33080);
    if (this.ewG > 1)
    {
      this.zeD.zev.pFv.setTextColor(t.j.a(this.zeF).yTx.getContext().getResources().getColor(2131690691));
      this.zeD.zev.pFv.setBackgroundResource(2130837923);
    }
    this.zeD.zev.pFw.setVisibility(0);
    AppMethodBeat.o(33080);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.j.2
 * JD-Core Version:    0.6.2
 */