package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;

public class Mp3SeekTable
  implements SeekTable
{
  private final Mp3FrameInfoParse.Mp3Info mInfo;

  public Mp3SeekTable()
  {
    AppMethodBeat.i(128489);
    this.mInfo = new Mp3FrameInfoParse.Mp3Info();
    AppMethodBeat.o(128489);
  }

  private static long timeToBytePositionInCbr(Mp3FrameInfoParse.Mp3Info paramMp3Info, long paramLong)
  {
    if ((paramMp3Info == null) || (paramMp3Info.bit_rate <= 0) || (paramLong < 0L))
      paramLong = -1L;
    while (true)
    {
      return paramLong;
      long l = paramMp3Info.bit_rate / 8 * paramLong;
      paramLong = l;
      if (paramMp3Info.idv2Size > 0)
        paramLong = l + paramMp3Info.idv2Size;
    }
  }

  private static long timeToBytePositionInVBRIVbr(Mp3FrameInfoParse.Mp3Info paramMp3Info, long paramLong)
  {
    if ((paramMp3Info == null) || (paramMp3Info.toc_table == null) || (paramMp3Info.fileLengthInBytes <= 0L) || (paramMp3Info.firstFramePosition < 0L) || (paramMp3Info.duration <= 0L) || (paramLong < 0L))
    {
      paramLong = -1L;
      return paramLong;
    }
    long l1 = paramMp3Info.fileLengthInBytes;
    long l2 = paramMp3Info.firstFramePosition;
    int i = paramMp3Info.entry_count;
    long[] arrayOfLong = paramMp3Info.toc_table;
    long l3 = paramMp3Info.duration;
    int j = (int)(paramLong * 1.0D / l3 * (i + 1));
    label101: label108: long l4;
    if (j < 0)
    {
      if (j < i)
        break label165;
      l4 = j * l3 / (i + 1);
      l3 = l3 * (j + 1) / (i + 1);
      if (l1 != l2)
        break label176;
    }
    label165: label176: for (paramLong = 0L; ; paramLong = ()((l1 - l2) * 1.0D * (paramLong - l4) / (l3 - l4)))
    {
      paramLong += l2;
      break;
      l2 = arrayOfLong[j];
      break label101;
      l1 = arrayOfLong[(j + 1)];
      break label108;
    }
  }

  private static long timeToBytePositionInXingVbr(Mp3FrameInfoParse.Mp3Info paramMp3Info, long paramLong)
  {
    AppMethodBeat.i(128492);
    if ((paramMp3Info == null) || (paramMp3Info.toc_table == null) || (paramMp3Info.fileLengthInBytes <= 0L) || (paramMp3Info.firstFramePosition < 0L) || (paramMp3Info.duration < 0L) || (paramLong < 0L))
    {
      paramLong = -1L;
      AppMethodBeat.o(128492);
    }
    while (true)
    {
      return paramLong;
      long l1 = paramMp3Info.fileLengthInBytes;
      long l2 = paramMp3Info.firstFramePosition;
      long[] arrayOfLong = paramMp3Info.toc_table;
      long l3 = paramMp3Info.duration;
      double d1 = paramLong * 100.0D / l3;
      if (d1 <= 0.0D);
      for (double d2 = 0.0D; ; d2 = 256.0D)
      {
        l3 = Math.round(d2 * 0.00390625D * l1) + l2;
        l1 = l1 + l2 - 1L;
        paramLong = l1;
        if (paramMp3Info.idv2Size > 0)
          paramLong = l1 - paramMp3Info.idv2Size;
        if (l3 >= paramLong)
          break label255;
        AppMethodBeat.o(128492);
        paramLong = l3;
        break;
        if (d1 < 100.0D)
          break label181;
      }
      label181: int i = (int)d1;
      float f1;
      if (i == 0)
      {
        f1 = 0.0F;
        label194: if (i >= 99)
          break label248;
      }
      label248: for (float f2 = (float)arrayOfLong[(i + 1)]; ; f2 = 256.0F)
      {
        d2 = f1;
        d2 = (f2 - f1) * (d1 - i) + d2;
        break;
        f1 = (float)arrayOfLong[i];
        break label194;
      }
      label255: AppMethodBeat.o(128492);
    }
  }

  public void parse(IDataSource paramIDataSource)
  {
    AppMethodBeat.i(128490);
    Mp3FrameInfoParse.parseFrameInfo(new TrackPositionDataSource(paramIDataSource), this.mInfo);
    AppMethodBeat.o(128490);
  }

  public long seek(long paramLong)
  {
    long l = -1L;
    AppMethodBeat.i(128491);
    if (paramLong < 0L)
    {
      AppMethodBeat.o(128491);
      paramLong = l;
    }
    while (true)
    {
      return paramLong;
      switch (this.mInfo.VBRType)
      {
      default:
        AppMethodBeat.o(128491);
        paramLong = l;
        break;
      case 0:
        paramLong = timeToBytePositionInCbr(this.mInfo, paramLong);
        AppMethodBeat.o(128491);
        break;
      case 2:
        paramLong = timeToBytePositionInXingVbr(this.mInfo, paramLong);
        AppMethodBeat.o(128491);
        break;
      case 1:
        paramLong = timeToBytePositionInVBRIVbr(this.mInfo, paramLong);
        AppMethodBeat.o(128491);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3SeekTable
 * JD-Core Version:    0.6.2
 */