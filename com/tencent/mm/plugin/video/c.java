package com.tencent.mm.plugin.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigInteger;

public final class c
{
  public static String abR(String paramString)
  {
    AppMethodBeat.i(50970);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(50970);
    }
    while (true)
    {
      return paramString;
      paramString = new BigInteger(Long.toBinaryString(bo.getLong(paramString, 0L)), 2).toString();
      AppMethodBeat.o(50970);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.video.c
 * JD-Core Version:    0.6.2
 */