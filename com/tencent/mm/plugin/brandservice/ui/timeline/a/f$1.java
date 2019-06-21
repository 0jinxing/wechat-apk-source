package com.tencent.mm.plugin.brandservice.ui.timeline.a;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aj.z;
import com.tencent.mm.plugin.brandservice.ui.timeline.a;
import com.tencent.mm.storage.q;
import com.tencent.mm.storage.r;

final class f$1
  implements View.OnClickListener
{
  f$1(f paramf)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(14257);
    paramView = (q)paramView.getTag();
    paramView.field_isExpand = true;
    z.aeX().h(paramView);
    this.jPC.jPm.jNy.d(paramView, 0);
    AppMethodBeat.o(14257);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.a.f.1
 * JD-Core Version:    0.6.2
 */