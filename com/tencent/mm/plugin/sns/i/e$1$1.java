package com.tencent.mm.plugin.sns.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedHashMap;

final class e$1$1
  implements Runnable
{
  e$1$1(e.1 param1)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(36879);
    LinkedHashMap localLinkedHashMap = e.b(this.qTo.qTn);
    e.a(this.qTo.qTn, this.qTo.qTm);
    localLinkedHashMap.clear();
    AppMethodBeat.o(36879);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.i.e.1.1
 * JD-Core Version:    0.6.2
 */