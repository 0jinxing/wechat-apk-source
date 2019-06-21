package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import com.tencent.mm.ui.base.n.c;
import java.util.List;

final class s$5
  implements n.c
{
  s$5(s params, List paramList1, List paramList2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(38255);
    paraml.clear();
    for (int i = 0; i < this.gCz.size(); i++)
      paraml.e(((Integer)this.rjv.get(i)).intValue(), (CharSequence)this.gCz.get(i));
    AppMethodBeat.o(38255);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.s.5
 * JD-Core Version:    0.6.2
 */