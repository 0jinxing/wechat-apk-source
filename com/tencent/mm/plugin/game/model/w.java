package com.tencent.mm.plugin.game.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;

public final class w extends j<v>
{
  public static final String[] fnj;

  static
  {
    AppMethodBeat.i(111357);
    fnj = new String[] { j.a(v.ccO, "GamePBCache") };
    AppMethodBeat.o(111357);
  }

  public w(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, v.ccO, "GamePBCache", null);
  }

  public final byte[] NK(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(111354);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(111354);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (!aa.dor().equals(e.bDX()))
      {
        AppMethodBeat.o(111354);
        paramString = localObject;
      }
      else
      {
        v localv = new v();
        localv.field_key = paramString;
        if (super.b(localv, new String[0]))
        {
          paramString = localv.field_value;
          AppMethodBeat.o(111354);
        }
        else
        {
          AppMethodBeat.o(111354);
          paramString = localObject;
        }
      }
    }
  }

  public final boolean b(String paramString, a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(111355);
    if ((bo.isNullOrNil(paramString)) || (parama == null))
      AppMethodBeat.o(111355);
    while (true)
    {
      return bool;
      try
      {
        parama = parama.toByteArray();
        bool = w(paramString, parama);
        AppMethodBeat.o(111355);
      }
      catch (IOException paramString)
      {
        ab.e("MicroMsg.GamePBCacheStorage", "Saving Failed: %s", new Object[] { paramString.getMessage() });
        AppMethodBeat.o(111355);
      }
    }
  }

  public final boolean w(String paramString, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(111356);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      AppMethodBeat.o(111356);
      return bool;
    }
    v localv = new v();
    localv.field_key = paramString;
    if (super.b(localv, new String[0]))
      localv.field_value = paramArrayOfByte;
    for (bool = super.c(localv, new String[0]); ; bool = super.b(localv))
    {
      if (!bool)
        ab.e("MicroMsg.GamePBCacheStorage", "Saving cache failed (update or insert)");
      AppMethodBeat.o(111356);
      break;
      localv.field_value = paramArrayOfByte;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.w
 * JD-Core Version:    0.6.2
 */