package com.tencent.qqmusic.mediaplayer.seektable.mp3;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.util.Logger;

class Mp3FrameInfoParse
{
  private static final int[][][] BitrateTable;
  private static final int DECODE_ERROR_IO_READ = -3;
  private static final int DECODE_ERROR_MEMORY_ALLOC = -2;
  private static final int DECODE_ERROR_SUCCESS = 0;
  private static final int DECODE_FAIL = -1;
  private static final int[][] SAMPLE_PER_FRAME = { { 384, 1152, 1152 }, { 384, 1152, 576 }, { 384, 1152, 576 } };
  private static final int[][] SAMPLE_RATE_TABLE;
  private static final String TAG = "Mp3FrameInfoParse";
  public static final int VBR_TYPE_CBR = 0;
  public static final int VBR_TYPE_VBRI = 1;
  public static final int VBR_TYPE_XING = 2;

  static
  {
    int[] arrayOfInt = { 0, 32, 64, 96, 128, 160, 192, 224, 256, 288, 320, 352, 384, 416, 448 };
    Object localObject = { { 0, 32, 48, 56, 64, 80, 96, 112, 128, 144, 160, 176, 192, 224, 256 }, { 0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160 }, { 0, 8, 16, 24, 32, 40, 48, 56, 64, 80, 96, 112, 128, 144, 160 } };
    BitrateTable = new int[][][] { { arrayOfInt, { 0, 32, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384 }, { 0, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320 } }, localObject };
    localObject = new int[] { 0, 0, 0 };
    SAMPLE_RATE_TABLE = new int[][] { { 11025, 12000, 8000 }, localObject, { 22050, 24000, 16000 }, { 44100, 48000, 32000 } };
  }

  private static boolean IsMp3Header(TrackPositionDataSource paramTrackPositionDataSource, byte[] paramArrayOfByte, int paramInt1, int paramInt2, Mp3FrameInfoParse.Mp3Info paramMp3Info)
  {
    AppMethodBeat.i(128500);
    boolean bool;
    if ((paramArrayOfByte == null) || (paramMp3Info == null))
    {
      bool = false;
      AppMethodBeat.o(128500);
    }
    while (true)
    {
      return bool;
      int i = paramArrayOfByte[(paramInt2 + 1)] >> 3 & 0x3;
      if (1 == i)
      {
        bool = false;
        AppMethodBeat.o(128500);
      }
      else
      {
        int j = paramArrayOfByte[(paramInt2 + 1)] >> 1 & 0x3;
        if (j == 0)
        {
          bool = false;
          AppMethodBeat.o(128500);
        }
        else
        {
          int k = 4 - j;
          int m = paramArrayOfByte[(paramInt2 + 2)] >> 4 & 0xF;
          if (15 == m)
          {
            bool = false;
            AppMethodBeat.o(128500);
          }
          else
          {
            int n = paramArrayOfByte[(paramInt2 + 2)] >> 2 & 0x3;
            if (3 == n)
            {
              bool = false;
              AppMethodBeat.o(128500);
            }
            else
            {
              int i1 = paramArrayOfByte[(paramInt2 + 3)];
              j = paramArrayOfByte[(paramInt2 + 2)] >> 1 & 0x1;
              int i2;
              if (i == 3)
              {
                i2 = 0;
                label171: if (1 != k)
                  break label258;
                j = BitrateTable[i2][0][m] * 12000 / SAMPLE_RATE_TABLE[i][n] + j << 2;
              }
              while (true)
                if (j > 0)
                {
                  long l = paramTrackPositionDataSource.getCurPosition();
                  if (paramTrackPositionDataSource.seek(l - paramInt1 + paramInt2 + j) < 0L)
                  {
                    bool = false;
                    AppMethodBeat.o(128500);
                    break;
                    i2 = 1;
                    break label171;
                    label258: if (2 == k)
                    {
                      j = BitrateTable[i2][1][m] * 144000 / SAMPLE_RATE_TABLE[i][n] + j;
                      continue;
                    }
                    j = BitrateTable[i2][2][m] * 144000 / (SAMPLE_RATE_TABLE[i][n] << i2) + j;
                    continue;
                  }
                  byte[] arrayOfByte = new byte[4];
                  if (paramTrackPositionDataSource.read(arrayOfByte, 4) == -1)
                  {
                    bool = false;
                    AppMethodBeat.o(128500);
                    break;
                  }
                  paramInt1 = Mp3DecodeBase.readInt(paramArrayOfByte, paramInt2, 4);
                  paramInt2 = Mp3DecodeBase.readInt(arrayOfByte, 4);
                  paramTrackPositionDataSource.seek(l);
                  if ((paramInt1 == 0) || (paramInt2 == 0) || ((0xFFFE0C00 & paramInt1) != (paramInt2 & 0xFFFE0C00)))
                  {
                    bool = false;
                    AppMethodBeat.o(128500);
                    break;
                  }
                  Logger.i("Mp3FrameInfoParse", "FirstFrameSize = ".concat(String.valueOf(j)));
                  paramMp3Info.firstFrameSize = j;
                  paramInt1 = 0;
                  if (i == 3)
                  {
                    paramInt1 = 0;
                    label442: paramMp3Info.mpeg_version = paramInt1;
                    paramMp3Info.layer = k;
                    paramMp3Info.sample_rate = SAMPLE_RATE_TABLE[i][n];
                    paramMp3Info.bit_rate = BitrateTable[i2][(k - 1)][m];
                    if ((i1 >> 6 & 0x3) != 3)
                      break label540;
                  }
                  label540: for (paramInt1 = 1; ; paramInt1 = 2)
                  {
                    paramMp3Info.channels = paramInt1;
                    bool = true;
                    AppMethodBeat.o(128500);
                    break;
                    if (i == 2)
                    {
                      paramInt1 = 1;
                      break label442;
                    }
                    if (i != 0)
                      break label442;
                    paramInt1 = 2;
                    break label442;
                  }
                }
              paramMp3Info.firstFrameSize = -1L;
              bool = false;
              AppMethodBeat.o(128500);
            }
          }
        }
      }
    }
  }

  public static int parseFrameInfo(TrackPositionDataSource paramTrackPositionDataSource, Mp3FrameInfoParse.Mp3Info paramMp3Info)
  {
    AppMethodBeat.i(128498);
    int i;
    if (paramTrackPositionDataSource == null)
    {
      i = -1;
      AppMethodBeat.o(128498);
    }
    while (true)
    {
      return i;
      byte[] arrayOfByte = new byte[1024];
      if (paramTrackPositionDataSource.read(arrayOfByte, 1024) < 1024)
      {
        i = -2;
        AppMethodBeat.o(128498);
      }
      else
      {
        if (Mp3DecodeBase.hasId3v2(arrayOfByte, 4))
        {
          Logger.i("Mp3FrameInfoParse", "hasId3v2");
          skipId3v2(paramTrackPositionDataSource, arrayOfByte, paramMp3Info);
        }
        int j;
        while (true)
        {
          j = 0;
          long l1 = paramTrackPositionDataSource.getSize();
          long l2 = paramMp3Info.idv2Size;
          long l3 = l1;
          i = j;
          if (l2 > 0L)
          {
            l3 = l1;
            i = j;
            if (l1 > l2)
            {
              l3 = l1 - l2;
              i = j;
            }
          }
          label125: long l4 = paramTrackPositionDataSource.getCurPosition();
          l1 = l4;
          if (l2 > 0L)
            l1 = l4 - l2;
          if (l1 < l3 / 10L)
            break label181;
          i = -3;
          AppMethodBeat.o(128498);
          break;
          paramTrackPositionDataSource.seek(0L);
        }
        label181: if ((i < 3) || (paramTrackPositionDataSource.seek(paramTrackPositionDataSource.getCurPosition() - 3L) >= 0L))
        {
          int k = paramTrackPositionDataSource.read(arrayOfByte, 1024);
          if (k == -1)
          {
            paramMp3Info.firstFramePosition = -1L;
            i = -3;
            AppMethodBeat.o(128498);
          }
          else
          {
            int m = i + k;
            for (j = 0; ; j++)
            {
              i = m;
              if (j + 4 > k)
                break label125;
              if ((255 == (arrayOfByte[j] & 0xFF)) && (224 == (arrayOfByte[(j + 1)] & 0xE0)) && (IsMp3Header(paramTrackPositionDataSource, arrayOfByte, 1024, j, paramMp3Info)))
              {
                paramMp3Info.firstFramePosition = (paramMp3Info.idv2Size + m - k + j);
                Logger.i("Mp3FrameInfoParse", "FirstFramePos = " + paramMp3Info.firstFramePosition);
                if (paramTrackPositionDataSource.seek(paramMp3Info.firstFramePosition) < 0L)
                {
                  i = -1;
                  AppMethodBeat.o(128498);
                  break;
                }
                boolean bool = parseVBRFrameInfo(paramTrackPositionDataSource, paramMp3Info);
                if ((paramTrackPositionDataSource.seek(0L) < 0L) || (!bool))
                {
                  i = -1;
                  AppMethodBeat.o(128498);
                  break;
                }
                i = 0;
                AppMethodBeat.o(128498);
                break;
              }
            }
          }
        }
        else
        {
          i = -3;
          AppMethodBeat.o(128498);
        }
      }
    }
  }

  private static boolean parseVBRFrameInfo(TrackPositionDataSource paramTrackPositionDataSource, Mp3FrameInfoParse.Mp3Info paramMp3Info)
  {
    AppMethodBeat.i(128501);
    boolean bool;
    if ((paramTrackPositionDataSource == null) || (paramMp3Info == null))
    {
      bool = false;
      AppMethodBeat.o(128501);
    }
    long l1;
    byte[] arrayOfByte;
    long l2;
    while (true)
    {
      return bool;
      l1 = paramMp3Info.sample_rate;
      int i = paramMp3Info.channels;
      arrayOfByte = new byte[1024];
      if (paramMp3Info.mpeg_version == 0)
        if (i != 1)
          l2 = 36L;
      while (true)
      {
        if (paramTrackPositionDataSource.seek(paramTrackPositionDataSource.getCurPosition() + l2) >= 0L)
          break label114;
        bool = false;
        AppMethodBeat.o(128501);
        break;
        l2 = 21L;
        continue;
        if (i != 1)
          l2 = 21L;
        else
          l2 = 13L;
      }
      label114: if (paramTrackPositionDataSource.read(arrayOfByte, 1024) >= 1024)
        break;
      bool = false;
      AppMethodBeat.o(128501);
    }
    if (Mp3DecodeBase.isXingVBRheader(arrayOfByte, 4))
    {
      Logger.i("Mp3FrameInfoParse", "is Xing VBR");
      paramMp3Info.VBRType = 2;
      paramMp3Info.isVbr = 1;
      parseXingInfo(arrayOfByte, l1, paramMp3Info);
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(128501);
      break;
      if (paramTrackPositionDataSource.seek(paramTrackPositionDataSource.getCurPosition() - (l2 + 1024L)) < 0L)
      {
        bool = false;
        AppMethodBeat.o(128501);
        break;
      }
      if (paramTrackPositionDataSource.seek(paramTrackPositionDataSource.getCurPosition() + 36L) < 0L)
      {
        bool = false;
        AppMethodBeat.o(128501);
        break;
      }
      if (paramTrackPositionDataSource.read(arrayOfByte, 1024) < 1024)
      {
        bool = false;
        AppMethodBeat.o(128501);
        break;
      }
      if (Mp3DecodeBase.isVBRIVBRHeader(arrayOfByte, 4))
      {
        Logger.i("Mp3FrameInfoParse", "is VBRI VBR");
        paramMp3Info.VBRType = 1;
        paramMp3Info.isVbr = 1;
        parseVBRIInfo(paramMp3Info, arrayOfByte, l1);
      }
      else
      {
        Logger.i("Mp3FrameInfoParse", "is CBR");
        paramMp3Info.VBRType = 0;
        l2 = paramTrackPositionDataSource.getSize();
        if (paramMp3Info.fileLengthInBytes <= 0L)
          paramMp3Info.fileLengthInBytes = l2;
        paramMp3Info.duration = (()((float)(paramMp3Info.fileLengthInBytes - paramMp3Info.idv2Size) * 8.0F / paramMp3Info.bit_rate));
      }
    }
  }

  private static void parseVBRIInfo(Mp3FrameInfoParse.Mp3Info paramMp3Info, byte[] paramArrayOfByte, long paramLong)
  {
    AppMethodBeat.i(128503);
    if ((paramArrayOfByte == null) || (paramMp3Info == null))
      AppMethodBeat.o(128503);
    while (true)
    {
      return;
      long l1 = Mp3DecodeBase.readLong(paramArrayOfByte, 10, 4);
      paramMp3Info.fileLengthInBytes = l1;
      long l2 = Mp3DecodeBase.readLong(paramArrayOfByte, 14, 4);
      int i;
      int j;
      if ((l2 > 0L) && (paramLong > 0L))
      {
        i = paramMp3Info.mpeg_version;
        j = paramMp3Info.layer;
        paramMp3Info.lengthInFrames = l2;
        paramMp3Info.duration = (()(l2 * SAMPLE_PER_FRAME[i][(j - 1)] * 1.0D / paramLong * 1000.0D));
      }
      int k = Mp3DecodeBase.readShort(paramArrayOfByte, 18, 2);
      int m = Mp3DecodeBase.readShort(paramArrayOfByte, 20, 2);
      int n = Mp3DecodeBase.readShort(paramArrayOfByte, 22, 2);
      int i1 = 24;
      if ((k > 0) && (m > 0))
      {
        int i2 = k + 1;
        long[] arrayOfLong1 = new long[i2];
        j = 0;
        if (paramMp3Info.firstFramePosition > 0L)
          j = (int)(0L + paramMp3Info.firstFramePosition);
        i = j;
        if (paramMp3Info.firstFrameSize > 0L)
          i = (int)(j + paramMp3Info.firstFrameSize);
        int i3 = 1;
        int i4 = i;
        i = i1;
        long[] arrayOfLong2 = arrayOfLong1;
        if (i3 < i2)
        {
          j = -1;
          if (n == 1)
          {
            j = Mp3DecodeBase.readByte(paramArrayOfByte, i, 1);
            i++;
          }
          while (true)
          {
            arrayOfLong2 = arrayOfLong1;
            if (j < 0)
              break label369;
            i4 = j * m + i4;
            j = i4;
            if (i4 >= l1)
              j = (int)l1;
            arrayOfLong1[i3] = j;
            i3++;
            i4 = j;
            break;
            if (n == 2)
            {
              j = Mp3DecodeBase.readShort(paramArrayOfByte, i, 2);
              i += 2;
            }
            else if (n == 3)
            {
              j = Mp3DecodeBase.readUnsignedInt24(paramArrayOfByte, i, 3);
              i += 3;
            }
            else if (n == 4)
            {
              j = Mp3DecodeBase.readInt(paramArrayOfByte, i, 4);
              i += 4;
            }
            else
            {
              arrayOfLong1 = null;
            }
          }
        }
        label369: paramMp3Info.entry_count = k;
        paramMp3Info.entry_size = n;
        paramMp3Info.scale_factor = m;
        paramMp3Info.toc_table = arrayOfLong2;
      }
      AppMethodBeat.o(128503);
    }
  }

  private static void parseXingInfo(byte[] paramArrayOfByte, long paramLong, Mp3FrameInfoParse.Mp3Info paramMp3Info)
  {
    AppMethodBeat.i(128502);
    if ((paramArrayOfByte == null) || (paramMp3Info == null))
    {
      AppMethodBeat.o(128502);
      return;
    }
    Object localObject = null;
    int i = Mp3DecodeBase.readInt(paramArrayOfByte, 4, 4);
    int j = 8;
    int k;
    if ((i & 0x1) == 1)
    {
      long l = Mp3DecodeBase.readLong(paramArrayOfByte, 8, 4) - 1L;
      if ((l > 0L) && (paramLong > 0L))
      {
        j = paramMp3Info.mpeg_version;
        k = paramMp3Info.layer;
        paramMp3Info.lengthInFrames = l;
        paramMp3Info.duration = (()(l * SAMPLE_PER_FRAME[j][(k - 1)] * 1.0D / paramLong * 1000.0D));
      }
      j = 12;
    }
    if ((i & 0x2) == 2)
    {
      paramMp3Info.fileLengthInBytes = Mp3DecodeBase.readLong(paramArrayOfByte, j, 4);
      j += 4;
    }
    while (true)
    {
      if ((i & 0x4) == 4)
      {
        long[] arrayOfLong = new long[100];
        for (k = 0; ; k++)
        {
          localObject = arrayOfLong;
          if (k >= 100)
            break;
          arrayOfLong[k] = (paramArrayOfByte[(k + j)] & 0xFF);
        }
      }
      if ((i > 0) && (localObject != null))
      {
        paramMp3Info.toc_table = localObject;
        paramMp3Info.flag_value = i;
      }
      AppMethodBeat.o(128502);
      break;
    }
  }

  private static void skipId3v2(TrackPositionDataSource paramTrackPositionDataSource, byte[] paramArrayOfByte, Mp3FrameInfoParse.Mp3Info paramMp3Info)
  {
    AppMethodBeat.i(128499);
    if ((paramTrackPositionDataSource == null) || (paramArrayOfByte == null))
      AppMethodBeat.o(128499);
    while (true)
    {
      return;
      if ((paramArrayOfByte[0] == 73) && (paramArrayOfByte[1] == 68) && (paramArrayOfByte[2] == 51))
      {
        int i = ((paramArrayOfByte[6] & 0x7F) << 21) + ((paramArrayOfByte[7] & 0x7F) << 14) + ((paramArrayOfByte[8] & 0x7F) << 7) + (paramArrayOfByte[9] & 0x7F);
        if ((paramArrayOfByte[5] & 0x10) != 0)
          i += 20;
        for (int j = 1; ; j = 0)
        {
          if (paramTrackPositionDataSource.seek(i) >= 0L)
            break label127;
          AppMethodBeat.o(128499);
          break;
          i += 10;
        }
        label127: int k = i;
        if (j == 0)
        {
          paramArrayOfByte = new byte[1];
          for (j = paramTrackPositionDataSource.read(paramArrayOfByte, 1); ; j = paramTrackPositionDataSource.read(paramArrayOfByte, 1))
          {
            k = i;
            if (paramArrayOfByte[0] != 0)
              break;
            k = i;
            if (j != 1)
              break;
            i++;
          }
        }
        paramMp3Info.idv2Size = k;
        Logger.i("Mp3FrameInfoParse", "id3V2 Size: " + paramMp3Info.idv2Size);
        paramTrackPositionDataSource.seek(k);
      }
      AppMethodBeat.o(128499);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.mp3.Mp3FrameInfoParse
 * JD-Core Version:    0.6.2
 */