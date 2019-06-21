package com.tencent.mm.a;

import com.tencent.mm.pointers.PByteArray;

public final class c
{
  public static int a(PByteArray paramPByteArray, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null));
    for (int j = 2; ; j = 2)
    {
      return j;
      if ((paramArrayOfByte1.length >= 0) && (paramArrayOfByte2.length > 0))
        break;
    }
    j = 8 - paramArrayOfByte1.length % 8;
    if (j == 0)
      j = 8;
    while (true)
    {
      byte[] arrayOfByte = new byte[paramArrayOfByte1.length + j];
      for (int k = 0; k < paramArrayOfByte1.length; k++)
        arrayOfByte[k] = ((byte)paramArrayOfByte1[k]);
      for (k = 0; k < j; k++)
        arrayOfByte[(paramArrayOfByte1.length + k)] = ((byte)(byte)j);
      paramPByteArray.value = new byte[paramArrayOfByte1.length + j + 32];
      if (k.a(paramPByteArray.value, arrayOfByte, arrayOfByte.length, paramArrayOfByte2.length, paramArrayOfByte2, 0) == 0)
      {
        j = 11;
        break;
      }
      paramArrayOfByte1 = new byte[paramArrayOfByte1.length + j + 8];
      for (j = 0; j < paramArrayOfByte1.length; j++)
        paramArrayOfByte1[j] = ((byte)paramPByteArray.value[j]);
      paramPByteArray.value = paramArrayOfByte1;
      j = i;
      break;
    }
  }

  public static int b(PByteArray paramPByteArray, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i = 0;
    int j;
    if ((paramArrayOfByte1 == null) || (paramArrayOfByte2 == null))
      j = 2;
    while (true)
    {
      return j;
      if ((paramArrayOfByte1.length < 0) || (paramArrayOfByte2.length <= 0))
      {
        j = 2;
      }
      else
      {
        j = paramArrayOfByte1.length;
        paramPByteArray.value = new byte[j];
        if (k.a(paramPByteArray.value, paramArrayOfByte1, j, paramArrayOfByte2.length, paramArrayOfByte2, 1) == 0)
        {
          j = 12;
        }
        else
        {
          int k = paramPByteArray.value[(j - 1 - 8)];
          if ((k <= 0) || (k > 8))
          {
            j = 12;
          }
          else
          {
            paramArrayOfByte1 = new byte[j - k - 8];
            for (j = 0; j < paramArrayOfByte1.length; j++)
              paramArrayOfByte1[j] = ((byte)paramPByteArray.value[j]);
            paramPByteArray.value = paramArrayOfByte1;
            j = i;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.a.c
 * JD-Core Version:    0.6.2
 */