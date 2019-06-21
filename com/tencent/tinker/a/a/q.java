package com.tencent.tinker.a.a;

public final class q
{
  public static void c(byte[] paramArrayOfByte, int paramInt, String paramString)
  {
    int i = paramString.length();
    int j = 0;
    if (j < i)
    {
      int k = paramString.charAt(j);
      int m;
      if ((k != 0) && (k <= 127))
      {
        m = paramInt + 1;
        paramArrayOfByte[paramInt] = ((byte)(byte)k);
        paramInt = m;
      }
      while (true)
      {
        j++;
        break;
        if (k <= 2047)
        {
          m = paramInt + 1;
          paramArrayOfByte[paramInt] = ((byte)(byte)(k >> 6 & 0x1F | 0xC0));
          paramInt = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(k & 0x3F | 0x80));
        }
        else
        {
          int n = paramInt + 1;
          paramArrayOfByte[paramInt] = ((byte)(byte)(k >> 12 & 0xF | 0xE0));
          m = n + 1;
          paramArrayOfByte[n] = ((byte)(byte)(k >> 6 & 0x3F | 0x80));
          paramInt = m + 1;
          paramArrayOfByte[m] = ((byte)(byte)(k & 0x3F | 0x80));
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.a.a.q
 * JD-Core Version:    0.6.2
 */