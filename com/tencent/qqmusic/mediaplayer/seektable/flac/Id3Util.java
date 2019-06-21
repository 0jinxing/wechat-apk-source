package com.tencent.qqmusic.mediaplayer.seektable.flac;

public class Id3Util
{
  public static int synchsafe(int paramInt)
  {
    int i = 127;
    int j = paramInt;
    for (paramInt = i; (0x7FFFFFFF ^ paramInt) > 0; paramInt = (paramInt + 1 << 8) - 1)
      j = ((paramInt ^ 0xFFFFFFFF) & j) << 1 | j & paramInt;
    return j;
  }

  public static int unsynchsafe(int paramInt)
  {
    int i = 0;
    int j = 2130706432;
    while (j > 0)
    {
      i = i >> 1 | paramInt & j;
      j >>= 8;
    }
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.flac.Id3Util
 * JD-Core Version:    0.6.2
 */