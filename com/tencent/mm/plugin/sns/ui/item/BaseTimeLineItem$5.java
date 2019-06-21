package com.tencent.mm.plugin.sns.ui.item;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.j;
import com.tencent.mm.pluginsdk.ui.e.o.a;

final class BaseTimeLineItem$5
  implements o.a
{
  BaseTimeLineItem$5(BaseTimeLineItem paramBaseTimeLineItem)
  {
  }

  public final void a(View paramView, Object paramObject)
  {
    AppMethodBeat.i(40119);
    if (this.rHr.qPr.rqd != null)
    {
      this.rHr.qPr.rqd.cvd = 13;
      this.rHr.qPr.rqd.a(paramView, paramObject);
    }
    AppMethodBeat.o(40119);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.5
 * JD-Core Version:    0.6.2
 */