package com.tencent.matrix.resource.a.a;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class a
{
  private static final char[] HEX_DIGITS = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };

  public static String w(byte[] paramArrayOfByte)
  {
    Object localObject;
    try
    {
      localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramArrayOfByte);
      paramArrayOfByte = ((MessageDigest)localObject).digest();
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      int i = paramArrayOfByte.length;
      int j = 0;
      if (j < i)
      {
        int k = paramArrayOfByte[j];
        if ((k >= 0) && (k <= 15))
          ((StringBuilder)localObject).append('0').append(HEX_DIGITS[k]);
        while (true)
        {
          j++;
          break;
          ((StringBuilder)localObject).append(HEX_DIGITS[(k >> 4 & 0xF)]).append(HEX_DIGITS[(k & 0xF)]);
        }
      }
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      throw new IllegalStateException(paramArrayOfByte);
    }
    paramArrayOfByte = ((StringBuilder)localObject).toString();
    return paramArrayOfByte;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.resource.a.a.a
 * JD-Core Version:    0.6.2
 */