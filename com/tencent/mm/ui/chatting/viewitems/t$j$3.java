package com.tencent.mm.ui.chatting.viewitems;

import android.app.Activity;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.ui.chatting.BaseChattingUIFragment;
import com.tencent.mm.ui.chatting.d.a;
import com.tencent.mm.ui.widget.MMNeat7extView;

final class t$j$3
  implements e.a
{
  t$j$3(t.j paramj, t.c paramc)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(33081);
    this.zeD.zew.jPd.setVisibility(0);
    this.zeD.zew.jPi.setTextColor(t.j.a(this.zeF).yTx.getContext().getResources().getColor(2131690691));
    this.zeD.zew.timeTv.setTextColor(t.j.a(this.zeF).yTx.getContext().getResources().getColor(2131690691));
    AppMethodBeat.o(33081);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.j.3
 * JD-Core Version:    0.6.2
 */