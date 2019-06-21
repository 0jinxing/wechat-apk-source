package com.tencent.mm.plugin.story.model;

import a.a.e;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.b;
import java.util.Comparator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
public final class i$a$a
  implements Runnable
{
  public static final a rSw;

  static
  {
    AppMethodBeat.i(109036);
    rSw = new a();
    AppMethodBeat.o(109036);
  }

  public final void run()
  {
    AppMethodBeat.i(109035);
    Object localObject1 = i.rSv;
    localObject1 = new b(i.cxM()).dMF();
    if (localObject1 != null)
    {
      if (localObject1.length > 1)
        e.a((Object[])localObject1, (Comparator)new i.a.a.a());
      int i = localObject1.length;
      int j = 0;
      for (int k = 0; j < i; k++)
      {
        Object localObject2 = localObject1[j];
        if (k >= 20)
          localObject2.delete();
        j++;
      }
    }
    AppMethodBeat.o(109035);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.i.a.a
 * JD-Core Version:    0.6.2
 */