package com.tencent.mm.plugin.c;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cd.h;
import com.tencent.mm.cd.h.d;
import com.tencent.mm.kernel.b.c;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a
  implements com.tencent.mm.kernel.api.a, com.tencent.mm.kernel.api.e, c
{
  private static final HashMap<Integer, h.d> eaA;
  private static a gLq;
  private com.tencent.mm.storage.g gLr;

  static
  {
    AppMethodBeat.i(79051);
    HashMap localHashMap = new HashMap();
    eaA = localHashMap;
    localHashMap.put(Integer.valueOf("AddContactAntispamTicket".hashCode()), new a.1());
    AppMethodBeat.o(79051);
  }

  public static a ask()
  {
    try
    {
      AppMethodBeat.i(79047);
      if (gLq == null)
      {
        locala = new com/tencent/mm/plugin/c/a;
        locala.<init>();
        gLq = locala;
      }
      a locala = gLq;
      AppMethodBeat.o(79047);
      return locala;
    }
    finally
    {
    }
  }

  public static boolean x(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(79049);
    boolean bool;
    if ((bo.ac(paramCharSequence)) || (!com.tencent.mm.kernel.g.RN().eJb))
    {
      AppMethodBeat.o(79049);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        String str1 = ((com.tencent.mm.plugin.zero.b.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.zero.b.a.class)).Nu().getValue("ClipProtectPattern");
        if (!bo.isNullOrNil(str1))
        {
          String str2 = new java/lang/String;
          str2.<init>(Base64.decode(str1, 0));
          if (!bo.isNullOrNil(str2))
          {
            bool = Pattern.compile(str2).matcher(paramCharSequence).matches();
            if (bool)
            {
              bool = true;
              AppMethodBeat.o(79049);
            }
          }
        }
      }
      catch (Exception paramCharSequence)
      {
        AppMethodBeat.o(79049);
        bool = false;
      }
    }
  }

  public final com.tencent.mm.storage.g Yn()
  {
    AppMethodBeat.i(79048);
    com.tencent.mm.kernel.g.RN().QU();
    com.tencent.mm.storage.g localg = this.gLr;
    AppMethodBeat.o(79048);
    return localg;
  }

  public final HashMap<Integer, h.d> collectDatabaseFactory()
  {
    return eaA;
  }

  public final void onDataBaseClosed(h paramh1, h paramh2)
  {
  }

  public final void onDataBaseOpened(h paramh1, h paramh2)
  {
    AppMethodBeat.i(79050);
    this.gLr = new com.tencent.mm.storage.g(paramh1);
    AppMethodBeat.o(79050);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.c.a
 * JD-Core Version:    0.6.2
 */