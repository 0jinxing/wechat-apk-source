package com.tencent.mm.plugin.emoji;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.as.a;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.q;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public final class e extends q
  implements b
{
  private static e kRr;

  private e()
  {
    super(a.class);
  }

  public static e bjc()
  {
    try
    {
      AppMethodBeat.i(62315);
      if (kRr == null)
      {
        locale = new com/tencent/mm/plugin/emoji/e;
        locale.<init>();
        kRr = locale;
      }
      e locale = kRr;
      AppMethodBeat.o(62315);
      return locale;
    }
    finally
    {
    }
  }

  public static String bjd()
  {
    AppMethodBeat.i(62317);
    String str = g.RP().eJM + "emoji/";
    AppMethodBeat.o(62317);
    return str;
  }

  public final List<String> collectStoragePaths()
  {
    AppMethodBeat.i(62316);
    LinkedList localLinkedList = new LinkedList();
    Collections.addAll(localLinkedList, new String[] { "emoji/" });
    AppMethodBeat.o(62316);
    return localLinkedList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e
 * JD-Core Version:    0.6.2
 */