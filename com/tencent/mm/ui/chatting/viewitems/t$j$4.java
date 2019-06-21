package com.tencent.mm.ui.chatting.viewitems;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.storage.bi;

final class t$j$4
  implements e.a
{
  t$j$4(t.j paramj, t.c paramc, bi parambi)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(33082);
    this.zeD.zez.jPd.setVisibility(0);
    if ((this.fku.field_msgId + "_0").equals(this.zeD.zbz))
    {
      this.zeD.zez.jOY.setImageResource(2130838268);
      AppMethodBeat.o(33082);
    }
    while (true)
    {
      return;
      this.zeD.zez.jOY.setImageResource(2130838269);
      AppMethodBeat.o(33082);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.t.j.4
 * JD-Core Version:    0.6.2
 */