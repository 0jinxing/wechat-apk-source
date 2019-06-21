package com.tencent.mm.plugin.v;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.api.bucket.b;
import com.tencent.mm.kernel.b.c;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import java.util.List;

public final class a
  implements b, c
{
  private static a pLk;

  public static a ceU()
  {
    try
    {
      AppMethodBeat.i(136942);
      if (pLk == null)
      {
        locala = new com/tencent/mm/plugin/v/a;
        locala.<init>();
        pLk = locala;
      }
      a locala = pLk;
      AppMethodBeat.o(136942);
      return locala;
    }
    finally
    {
    }
  }

  public static String ceV()
  {
    AppMethodBeat.i(136943);
    String str = g.RP().eJM + "remark/";
    AppMethodBeat.o(136943);
    return str;
  }

  public final List<String> collectStoragePaths()
  {
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.v.a
 * JD-Core Version:    0.6.2
 */