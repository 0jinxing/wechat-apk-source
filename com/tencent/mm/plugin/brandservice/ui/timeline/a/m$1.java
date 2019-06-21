package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.content.Context;
import android.content.res.Resources;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.plugin.brandservice.ui.timeline.preload.c;
import com.tencent.mm.pluginsdk.ui.applet.e.a;
import com.tencent.mm.storage.q;
import com.tencent.mm.ui.widget.MMNeat7extView;

public final class m$1
  implements e.a
{
  public m$1(m paramm, q paramq, int paramInt)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(14275);
    this.jPX.jPd.setVisibility(0);
    this.jPX.jPV.setTextColor(this.jPX.mContext.getResources().getColor(2131690691));
    this.jPX.jPi.setTextColor(this.jPX.mContext.getResources().getColor(2131690691));
    this.jPX.jPa.setTextColor(-436207617);
    this.jPX.jPm.jNp.m(this.jEl.field_msgId, this.sN);
    AppMethodBeat.o(14275);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.m.1
 * JD-Core Version:    0.6.2
 */