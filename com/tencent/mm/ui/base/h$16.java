package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class h$16
  implements n.c
{
  h$16(String paramString1, List paramList1, List paramList2, String paramString2)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(106420);
    if (!bo.isNullOrNil(this.chV))
      paraml.setHeaderTitle(this.chV);
    for (int i = 0; i < this.rjq.size(); i++)
      paraml.e(((Integer)this.riL.get(i)).intValue(), (CharSequence)this.rjq.get(i));
    if (!bo.isNullOrNil(this.ytw))
      paraml.e(-1, this.ytw);
    AppMethodBeat.o(106420);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.h.16
 * JD-Core Version:    0.6.2
 */