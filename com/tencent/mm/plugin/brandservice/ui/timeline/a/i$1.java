package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.storage.q;

public final class i$1
  implements e.a
{
  public i$1(i parami, q paramq, int paramInt)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(14268);
    this.jPP.jPd.setVisibility(0);
    if ((this.jEl.field_msgId + "_0").equals(com.tencent.mm.plugin.brandservice.ui.b.c.aYR()))
      this.jPP.jOY.setImageResource(2130838268);
    while (true)
    {
      this.jPP.jPm.jNp.m(this.jEl.field_msgId, this.sN);
      AppMethodBeat.o(14268);
      return;
      this.jPP.jOY.setImageResource(2130838269);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.i.1
 * JD-Core Version:    0.6.2
 */