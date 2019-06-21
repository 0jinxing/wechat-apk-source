package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.c;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class k$1
  implements e.a
{
  public k$1(k paramk, int paramInt1, q paramq, int paramInt2)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(14272);
    this.jPT.jPi.setTextColor(this.jPT.mContext.getResources().getColor(2131690691));
    this.jPT.jPa.setTextColor(-436207617);
    if (this.ewG == 1)
      this.jPT.jPS.setBackgroundResource(2130837929);
    while (true)
    {
      this.jPT.jPm.jNp.m(this.jEl.field_msgId, this.sN);
      AppMethodBeat.o(14272);
      return;
      this.jPT.jPS.setBackgroundResource(2130837923);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.k.1
 * JD-Core Version:    0.6.2
 */