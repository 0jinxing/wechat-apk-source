package com.google.android.exoplayer2.c;

public final class j
{
  private static final String[] aST = { "audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg" };
  private static final int[] aSU = { 44100, 48000, 32000 };
  private static final int[] aSV = { 32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448 };
  private static final int[] aSW = { 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256 };
  private static final int[] aSX = { 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384 };
  private static final int[] aSY = { 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320 };
  private static final int[] aSZ = { 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160 };
  public int aPy;
  public int aTa;
  public int bitrate;
  public int channels;
  public String mimeType;
  public int sampleRate;
  public int version;

  public static boolean a(int paramInt, j paramj)
  {
    boolean bool = true;
    if ((paramInt & 0xFFE00000) != -2097152)
      bool = false;
    int i;
    int j;
    int k;
    while (true)
    {
      return bool;
      i = paramInt >>> 19 & 0x3;
      if (i == 1)
      {
        bool = false;
      }
      else
      {
        j = paramInt >>> 17 & 0x3;
        if (j == 0)
        {
          bool = false;
        }
        else
        {
          k = paramInt >>> 12 & 0xF;
          if ((k == 0) || (k == 15))
          {
            bool = false;
          }
          else
          {
            m = paramInt >>> 10 & 0x3;
            if (m != 3)
              break;
            bool = false;
          }
        }
      }
    }
    int m = aSU[m];
    if (i == 2)
      m /= 2;
    label384: 
    while (true)
    {
      label114: int n = paramInt >>> 9 & 0x1;
      int i1;
      int i2;
      if (j == 3)
      {
        if (i == 3);
        for (k = aSV[(k - 1)]; ; k = aSW[(k - 1)])
        {
          i1 = (k * 12000 / m + n) * 4;
          n = 384;
          i2 = k;
          k = n;
          String str = aST[(3 - j)];
          if ((paramInt >> 6 & 0x3) != 3)
            break label376;
          paramInt = 1;
          paramj.version = i;
          paramj.mimeType = str;
          paramj.aPy = i1;
          paramj.sampleRate = m;
          paramj.channels = paramInt;
          paramj.bitrate = (i2 * 1000);
          paramj.aTa = k;
          break;
          if (i != 0)
            break label384;
          m /= 4;
          break label114;
        }
      }
      if (i == 3)
        if (j == 2)
        {
          k = aSX[(k - 1)];
          label288: i1 = 1152;
          i2 = k;
          k = i1;
        }
      while (true)
      {
        i1 = 144000;
        label305: i1 = i1 * i2 / m + n;
        break;
        k = aSY[(k - 1)];
        break label288;
        i2 = aSZ[(k - 1)];
        if (j == 1)
          k = 576;
        while (true)
          if (j == 1)
          {
            i1 = 72000;
            break label305;
            k = 1152;
            continue;
            label376: paramInt = 2;
            break;
          }
      }
    }
  }

  public static int dN(int paramInt)
  {
    int i = -1;
    if ((paramInt & 0xFFE00000) != -2097152)
      j = i;
    int k;
    int m;
    int n;
    int i1;
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              return j;
              k = paramInt >>> 19 & 0x3;
              j = i;
            }
            while (k == 1);
            m = paramInt >>> 17 & 0x3;
            j = i;
          }
          while (m == 0);
          n = paramInt >>> 12 & 0xF;
          j = i;
        }
        while (n == 0);
        j = i;
      }
      while (n == 15);
      i1 = paramInt >>> 10 & 0x3;
      j = i;
    }
    while (i1 == 3);
    int j = aSU[i1];
    if (k == 2)
      j /= 2;
    label257: 
    while (true)
    {
      label101: i1 = paramInt >>> 9 & 0x1;
      if (m == 3)
      {
        if (k == 3);
        for (paramInt = aSV[(n - 1)]; ; paramInt = aSW[(n - 1)])
        {
          j = (paramInt * 12000 / j + i1) * 4;
          break;
          if (k != 0)
            break label257;
          j /= 4;
          break label101;
        }
      }
      if (k == 3)
        if (m == 2)
          paramInt = aSX[(n - 1)];
      while (true)
      {
        if (k != 3)
          break label230;
        j = 144000 * paramInt / j + i1;
        break;
        paramInt = aSY[(n - 1)];
        continue;
        paramInt = aSZ[(n - 1)];
      }
      label230: if (m == 1);
      for (i = 72000; ; i = 144000)
      {
        j = i * paramInt / j + i1;
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.j
 * JD-Core Version:    0.6.2
 */