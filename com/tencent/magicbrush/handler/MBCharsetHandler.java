package com.tencent.magicbrush.handler;

import android.support.annotation.Keep;
import com.tencent.magicbrush.a.c.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.UnsupportedEncodingException;

@Keep
public class MBCharsetHandler
{
  private static final String TAG = "MicroMsg.MBCharsetHandler";

  @Keep
  static String decode(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(115897);
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length == 0))
    {
      AppMethodBeat.o(115897);
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      try
      {
        String str = new java/lang/String;
        str.<init>(paramArrayOfByte, paramString);
        paramArrayOfByte = str;
        AppMethodBeat.o(115897);
      }
      catch (UnsupportedEncodingException paramArrayOfByte)
      {
        while (true)
        {
          c.c.e("MicroMsg.MBCharsetHandler", "UnsupportedDecoding [%s] [%s]", new Object[] { paramString, paramArrayOfByte });
          paramArrayOfByte = null;
        }
      }
    }
  }

  @Keep
  public static byte[] encode(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(115896);
    if (paramString1 == null)
    {
      AppMethodBeat.o(115896);
      paramString1 = localObject2;
    }
    while (true)
    {
      return paramString1;
      try
      {
        paramString1 = paramString1.getBytes(paramString2);
        AppMethodBeat.o(115896);
      }
      catch (UnsupportedEncodingException paramString1)
      {
        while (true)
        {
          c.c.e("MicroMsg.MBCharsetHandler", "MBCharsetHandler encode failed. [%s]", new Object[] { paramString1 });
          paramString1 = localObject1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.magicbrush.handler.MBCharsetHandler
 * JD-Core Version:    0.6.2
 */