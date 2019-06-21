package com.tencent.mm.plugin.sns.ui.item;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.j;
import com.tencent.mm.pluginsdk.ui.e.o.a;

final class BaseTimeLineItem$3
  implements o.a
{
  BaseTimeLineItem$3(BaseTimeLineItem paramBaseTimeLineItem, au paramau)
  {
  }

  public final void a(View paramView, Object paramObject)
  {
    AppMethodBeat.i(40117);
    if (this.rHs.rqd != null)
    {
      this.rHs.rqd.cvd = 0;
      this.rHs.rqd.a(paramView, paramObject);
    }
    AppMethodBeat.o(40117);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.3
 * JD-Core Version:    0.6.2
 */