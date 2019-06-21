package com.tencent.mm.plugin.game.commlib.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;

public final class b extends j<a>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(59420);
    fnj = new String[] { j.a(a.ccO, "PBCache") };
    AppMethodBeat.o(59420);
  }

  public b(e parame)
  {
    super(parame, a.ccO, "PBCache", null);
  }

  public final byte[] NK(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(59418);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(59418);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      a locala = new a();
      locala.field_key = paramString;
      if (super.b(locala, new String[0]))
      {
        paramString = locala.field_value;
        AppMethodBeat.o(59418);
      }
      else
      {
        AppMethodBeat.o(59418);
        paramString = localObject;
      }
    }
  }

  public final boolean b(String paramString, com.tencent.mm.bt.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(59419);
    if ((bo.isNullOrNil(paramString)) || (parama == null))
      AppMethodBeat.o(59419);
    while (true)
    {
      return bool;
      try
      {
        parama = parama.toByteArray();
        if ((parama != null) && (parama.length != 0))
          break;
        AppMethodBeat.o(59419);
      }
      catch (IOException paramString)
      {
        ab.e("MicroMsg.PBCacheStorage", "Saving Failed: %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(59419);
      }
    }
    a locala = new a();
    locala.field_key = paramString;
    if (super.b(locala, new String[0]))
      locala.field_value = parama;
    for (bool = super.c(locala, new String[0]); ; bool = super.b(locala))
    {
      if (!bool)
        ab.e("MicroMsg.PBCacheStorage", "Saving cache failed (update or insert)");
      AppMethodBeat.o(59419);
      break;
      locala.field_value = parama;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.commlib.b.b
 * JD-Core Version:    0.6.2
 */