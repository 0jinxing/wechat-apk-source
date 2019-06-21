package com.tencent.mm.ui.base;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class h$5
  implements n.c
{
  h$5(String paramString, ArrayList paramArrayList)
  {
  }

  public final void a(l paraml)
  {
    AppMethodBeat.i(106407);
    paraml.setHeaderTitle(this.chV);
    for (int i = 0; i < this.ewh.size(); i++)
      paraml.e(i, (CharSequence)this.ewh.get(i));
    AppMethodBeat.o(106407);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.h.5
 * JD-Core Version:    0.6.2
 */