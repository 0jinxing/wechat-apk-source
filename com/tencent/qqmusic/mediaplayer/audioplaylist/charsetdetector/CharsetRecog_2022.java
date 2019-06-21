package com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector;

abstract class CharsetRecog_2022 extends CharsetRecognizer
{
  int match(byte[] paramArrayOfByte, int paramInt, byte[][] paramArrayOfByte1)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    if (n < paramInt)
    {
      if (paramArrayOfByte[n] != 27)
        break label214;
      label107: for (int i1 = 0; ; i1++)
      {
        if (i1 >= paramArrayOfByte1.length)
          break label113;
        byte[] arrayOfByte = paramArrayOfByte1[i1];
        if (paramInt - n >= arrayOfByte.length)
        {
          for (int i2 = 1; i2 < arrayOfByte.length; i2++)
            if (arrayOfByte[i2] != paramArrayOfByte[(n + i2)])
              break label107;
          m++;
          n += arrayOfByte.length - 1;
          n++;
          break;
        }
      }
      label113: k++;
    }
    label214: 
    while (true)
    {
      if ((paramArrayOfByte[n] == 14) || (paramArrayOfByte[n] == 15))
      {
        j++;
        break;
        if (m == 0)
          j = i;
        while (true)
        {
          return j;
          k = (m * 100 - k * 100) / (m + k);
          paramInt = k;
          if (m + j < 5)
            paramInt = k - (5 - (m + j)) * 10;
          j = i;
          if (paramInt >= 0)
            j = paramInt;
        }
      }
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.audioplaylist.charsetdetector.CharsetRecog_2022
 * JD-Core Version:    0.6.2
 */