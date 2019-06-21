package com.tencent.mm.plugin.wallet_index.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static boolean gO(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(48174);
    if (bo.isNullOrNil(paramString1))
    {
      AppMethodBeat.o(48174);
      return bool;
    }
    Object localObject = null;
    String[] arrayOfString = paramString1.split("&");
    int i = arrayOfString.length;
    for (int j = 0; ; j++)
    {
      paramString1 = localObject;
      if (j < i)
      {
        paramString1 = arrayOfString[j].split("=");
        if ((paramString1.length > 1) && (paramString1[0].equals("prepay_id")))
          paramString1 = paramString1[1];
      }
      else
      {
        if (!bo.isNullOrNil(paramString1))
          break label101;
        AppMethodBeat.o(48174);
        break;
      }
    }
    label101: if (paramString1.startsWith(paramString2));
    for (bool = true; ; bool = false)
    {
      AppMethodBeat.o(48174);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_index.c.a
 * JD-Core Version:    0.6.2
 */