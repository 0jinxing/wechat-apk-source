package com.tencent.mm.plugin.avatar;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class c extends q
  implements b
{
  private static c jqC;

  private c()
  {
    super(o.class);
  }

  public static c aSm()
  {
    try
    {
      AppMethodBeat.i(79053);
      if (jqC == null)
      {
        localc = new com/tencent/mm/plugin/avatar/c;
        localc.<init>();
        jqC = localc;
      }
      c localc = jqC;
      AppMethodBeat.o(79053);
      return localc;
    }
    finally
    {
    }
  }

  public static String aSn()
  {
    AppMethodBeat.i(79055);
    String str = g.RP().cachePath + "avatar/";
    AppMethodBeat.o(79055);
    return str;
  }

  public final List<String> collectStoragePaths()
  {
    AppMethodBeat.i(79054);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "avatar/" });
    AppMethodBeat.o(79054);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.avatar.c
 * JD-Core Version:    0.6.2
 */