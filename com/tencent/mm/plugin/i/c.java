package com.tencent.mm.plugin.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class c
  implements b, com.tencent.mm.kernel.b.c
{
  private static c nuF;

  public static String XW()
  {
    AppMethodBeat.i(79099);
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = g.RP().eJM + "image/";
    AppMethodBeat.o(79099);
    return localObject;
  }

  public static String XX()
  {
    AppMethodBeat.i(79100);
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = g.RP().eJM + "image2/";
    AppMethodBeat.o(79100);
    return localObject;
  }

  public static c bGE()
  {
    try
    {
      AppMethodBeat.i(79097);
      if (nuF == null)
      {
        localc = new com/tencent/mm/plugin/i/c;
        localc.<init>();
        nuF = localc;
      }
      c localc = nuF;
      AppMethodBeat.o(79097);
      return localc;
    }
    finally
    {
    }
  }

  public static String bGF()
  {
    AppMethodBeat.i(79101);
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = g.RP().eJM + "bizimg/";
    AppMethodBeat.o(79101);
    return localObject;
  }

  public final List<String> collectStoragePaths()
  {
    AppMethodBeat.i(79098);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "image/", "image2/", "sfs", "bizimg/" });
    AppMethodBeat.o(79098);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.i.c
 * JD-Core Version:    0.6.2
 */