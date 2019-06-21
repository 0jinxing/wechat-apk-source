package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c
{
  public static String ak(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(137934);
    Object localObject = "";
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      AppMethodBeat.o(137934);
      paramArrayOfByte = (byte[])localObject;
    }
    while (true)
    {
      return paramArrayOfByte;
      localObject = new StringBuilder();
      int i = 0;
      if (i < paramArrayOfByte.length)
      {
        int j = paramArrayOfByte[i];
        int k = j & 0xF;
        int m;
        label63: int n;
        if (k < 10)
        {
          m = 48;
          n = (j & 0xF0) >> 4;
          if (n >= 10)
            break label114;
        }
        label114: for (j = 48; ; j = 55)
        {
          ((StringBuilder)localObject).append(j + n);
          ((StringBuilder)localObject).append(k + m);
          i++;
          break;
          m = 55;
          break label63;
        }
      }
      paramArrayOfByte = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(137934);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.c
 * JD-Core Version:    0.6.2
 */