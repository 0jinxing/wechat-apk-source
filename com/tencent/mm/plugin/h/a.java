package com.tencent.mm.plugin.h;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ba.r;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class a extends q
  implements b
{
  private static a kJF;

  private a()
  {
    super(r.class);
  }

  public static String Yd()
  {
    AppMethodBeat.i(79091);
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = g.RP().eJM + "package/";
    AppMethodBeat.o(79091);
    return localObject;
  }

  public static a bic()
  {
    try
    {
      AppMethodBeat.i(79089);
      if (kJF == null)
      {
        locala = new com/tencent/mm/plugin/h/a;
        locala.<init>();
        kJF = locala;
      }
      a locala = kJF;
      AppMethodBeat.o(79089);
      return locala;
    }
    finally
    {
    }
  }

  public final List<String> collectStoragePaths()
  {
    AppMethodBeat.i(79090);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "package/" });
    AppMethodBeat.o(79090);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.h.a
 * JD-Core Version:    0.6.2
 */