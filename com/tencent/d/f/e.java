package com.tencent.d.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class e
{
  public static byte[] atV(String paramString)
  {
    AppMethodBeat.i(114611);
    if (paramString == null)
    {
      paramString = null;
      AppMethodBeat.o(114611);
    }
    while (true)
    {
      return paramString;
      int i = paramString.length() / 2;
      byte[] arrayOfByte = new byte[i];
      paramString = paramString.toCharArray();
      for (int j = 0; j < i; j++)
      {
        int k = j * 2;
        int m = (byte)"0123456789ABCDEF".indexOf(paramString[k]);
        arrayOfByte[j] = ((byte)(byte)((byte)"0123456789ABCDEF".indexOf(paramString[(k + 1)]) | m << 4));
      }
      AppMethodBeat.o(114611);
      paramString = arrayOfByte;
    }
  }

  public static final String bytesToHexString(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(114612);
    if (paramArrayOfByte == null)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(114612);
    }
    while (true)
    {
      return paramArrayOfByte;
      StringBuffer localStringBuffer = new StringBuffer(paramArrayOfByte.length);
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
        if (str.length() < 2)
          localStringBuffer.append(0);
        localStringBuffer.append(str.toUpperCase());
      }
      paramArrayOfByte = localStringBuffer.toString();
      AppMethodBeat.o(114612);
    }
  }

  public static byte[] cn(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(114613);
    Object localObject = null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramArrayOfByte);
      paramArrayOfByte = localMessageDigest.digest();
      AppMethodBeat.o(114613);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = localObject;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      while (true)
        paramArrayOfByte = localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.d.f.e
 * JD-Core Version:    0.6.2
 */