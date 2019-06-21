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

public final class j$1
  implements e.a
{
  public j$1(j paramj, q paramq, int paramInt)
  {
  }

  public final void onFinish()
  {
    AppMethodBeat.i(14270);
    this.jPR.jPd.setVisibility(0);
    this.jPR.jPa.setTextColor(this.jPR.mContext.getResources().getColor(2131690691));
    this.jPR.iNr.setBackgroundResource(2131231096);
    this.jPR.jPm.jNp.m(this.jEl.field_msgId, this.sN);
    AppMethodBeat.o(14270);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.j.1
 * JD-Core Version:    0.6.2
 */