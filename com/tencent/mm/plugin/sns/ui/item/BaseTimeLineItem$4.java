package com.tencent.mm.plugin.sns.ui.item;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.j;
import com.tencent.mm.pluginsdk.ui.e.o.a;

final class BaseTimeLineItem$4
  implements o.a
{
  BaseTimeLineItem$4(BaseTimeLineItem paramBaseTimeLineItem, au paramau)
  {
  }

  public final void a(View paramView, Object paramObject)
  {
    AppMethodBeat.i(40118);
    if (this.rHs.rqd != null)
    {
      this.rHs.rqd.cvd = 6;
      this.rHs.rqd.a(paramView, paramObject);
    }
    AppMethodBeat.o(40118);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.4
 * JD-Core Version:    0.6.2
 */