package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.brandservice.ui.timeline.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.r;

final class e$1
  implements View.OnClickListener
{
  e$1(e parame)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14249);
    long l = ((com.tencent.mm.plugin.brandservice.a.a)g.K(com.tencent.mm.plugin.brandservice.a.a.class)).cY(paramView);
    paramView = z.aeX().B(l, "msgId");
    if (paramView != null)
    {
      this.jPq.jPm.jNy.d(paramView, 4);
      AppMethodBeat.o(14249);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.BizTimeLineItem", "mediaIconClickListener info is null");
      AppMethodBeat.o(14249);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.e.1
 * JD-Core Version:    0.6.2
 */