package com.tenpay.ndk;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class MessageDigestUtil
{
  public static String bytesToHex(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(49574);
    StringBuilder localStringBuilder = new StringBuilder("");
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(49574);
    }
    while (true)
    {
      return paramArrayOfByte;
      for (int i = 0; i < paramArrayOfByte.length; i++)
      {
        String str = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
        if (str.length() < 2)
          localStringBuilder.append(0);
        localStringBuilder.append(str.toUpperCase());
      }
      paramArrayOfByte = localStringBuilder.toString();
      AppMethodBeat.o(49574);
    }
  }

  private native byte[] doSHA256(byte[] paramArrayOfByte);

  public String getSHA256Hex(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(49575);
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (paramArrayOfByte != null);
    try
    {
      paramArrayOfByte = doSHA256(paramArrayOfByte);
      localObject2 = localObject1;
      if (paramArrayOfByte != null)
        localObject2 = bytesToHex(paramArrayOfByte);
      AppMethodBeat.o(49575);
      return localObject2;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
        localObject2 = localObject1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tenpay.ndk.MessageDigestUtil
 * JD-Core Version:    0.6.2
 */