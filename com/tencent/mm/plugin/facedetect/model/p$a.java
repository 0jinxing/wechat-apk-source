package com.tencent.mm.plugin.facedetect.model;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p$a
{
  public static byte[] e(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(263);
    byte[] arrayOfByte1 = paramString.getBytes();
    byte[] arrayOfByte2 = new byte[256];
    for (int i = 0; i < 256; i++)
      arrayOfByte2[i] = ((byte)(byte)i);
    int j;
    int k;
    if ((arrayOfByte1 == null) || (arrayOfByte1.length == 0))
    {
      paramString = null;
      arrayOfByte2 = new byte[paramArrayOfByte.length];
      if (paramString != null)
      {
        i = 0;
        j = 0;
        k = 0;
      }
    }
    else
    {
      while (i < paramArrayOfByte.length)
      {
        k = k + 1 & 0xFF;
        j = (paramString[k] & 0xFF) + j & 0xFF;
        int m = paramString[k];
        paramString[k] = ((byte)paramString[j]);
        paramString[j] = ((byte)m);
        m = paramString[k];
        int n = paramString[j];
        int i1 = paramArrayOfByte[i];
        arrayOfByte2[i] = ((byte)(byte)(paramString[((m & 0xFF) + (n & 0xFF) & 0xFF)] ^ i1));
        i++;
        continue;
        j = 0;
        k = 0;
        i = 0;
        while (true)
        {
          paramString = arrayOfByte2;
          if (j >= 256)
            break;
          k = k + ((arrayOfByte1[i] & 0xFF) + (arrayOfByte2[j] & 0xFF)) & 0xFF;
          m = arrayOfByte2[j];
          arrayOfByte2[j] = ((byte)arrayOfByte2[k]);
          arrayOfByte2[k] = ((byte)m);
          i = (i + 1) % arrayOfByte1.length;
          j++;
        }
      }
    }
    AppMethodBeat.o(263);
    return arrayOfByte2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.model.p.a
 * JD-Core Version:    0.6.2
 */