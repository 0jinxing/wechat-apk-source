package com.tencent.mm.plugin.appbrand.s;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

final class b$1
  implements Runnable
{
  b$1(String paramString, b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(87394);
    if (!b.aEd().containsKey(this.val$url))
      b.aEd().put(this.val$url, new ArrayList());
    ((List)b.aEd().get(this.val$url)).add(this.iRe);
    AppMethodBeat.o(87394);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.s.b.1
 * JD-Core Version:    0.6.2
 */