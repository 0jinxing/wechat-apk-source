package com.tencent.mm.plugin.expt.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import com.tencent.mm.sdk.platformtools.bo;

public final class b
{
  private static b lNR;
  private String name = null;

  public static b bqZ()
  {
    AppMethodBeat.i(73524);
    if (lNR == null)
      lNR = new b();
    b localb = lNR;
    AppMethodBeat.o(73524);
    return localb;
  }

  public final String[] allKeys()
  {
    AppMethodBeat.i(73528);
    Object localObject = bra();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(73528);
    }
    while (true)
    {
      return localObject;
      localObject = ((as)localObject).allKeys();
      AppMethodBeat.o(73528);
    }
  }

  final as bra()
  {
    AppMethodBeat.i(73525);
    int i = a.Ra();
    Object localObject;
    if (i == 0)
    {
      localObject = null;
      AppMethodBeat.o(73525);
    }
    while (true)
    {
      return localObject;
      localObject = i + "_WxPageFlow";
      if (!bo.isEqual(this.name, (String)localObject))
      {
        ab.i("MicroMsg.MMPageFlowMMKV", "get mmkv change uin old[%s] new[%s]", new Object[] { this.name, localObject });
        this.name = ((String)localObject);
      }
      localObject = as.amF(this.name);
      AppMethodBeat.o(73525);
    }
  }

  public final String get(String paramString1, String paramString2)
  {
    AppMethodBeat.i(73527);
    as localas = bra();
    if (localas == null)
      AppMethodBeat.o(73527);
    while (true)
    {
      return paramString2;
      paramString2 = localas.getString(paramString1, paramString2);
      AppMethodBeat.o(73527);
    }
  }

  public final void remove(String paramString)
  {
    AppMethodBeat.i(73526);
    as localas = bra();
    if (localas == null)
      AppMethodBeat.o(73526);
    while (true)
    {
      return;
      localas.remove(paramString);
      AppMethodBeat.o(73526);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.expt.c.b
 * JD-Core Version:    0.6.2
 */