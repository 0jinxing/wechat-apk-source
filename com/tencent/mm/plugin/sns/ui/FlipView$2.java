package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.List;

final class FlipView$2
  implements n.c
{
  FlipView$2(FlipView paramFlipView, List paramList1, List paramList2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(38227);
    paraml.clear();
    for (int i = 0; i < this.mhY.size(); i++)
      paraml.e(((Integer)this.riL.get(i)).intValue(), (CharSequence)this.mhY.get(i));
    AppMethodBeat.o(38227);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.FlipView.2
 * JD-Core Version:    0.6.2
 */