package com.tencent.qqmusic.mediaplayer.seektable.flac;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.seektable.InvalidBoxException;
import com.tencent.qqmusic.mediaplayer.seektable.Parsable;
import com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper;
import com.tencent.qqmusic.mediaplayer.seektable.SeekTable;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.util.Arrays;
import java.util.HashSet;

public class FlacSeekTable
  implements SeekTable
{
  private static final int SEEK_POINT_SIZE = 18;
  private static final byte TYPE_SEEKTABLE = 3;
  private static final byte TYPE_STREAMINFO = 0;
  private long firstFrameOffset;
  private long[] offsets;
  private long[] sampleNumbers;
  private int sampleRate = 0;

  public FlacSeekTable(int paramInt)
  {
    this.sampleRate = paramInt;
  }

  private static int binarySearchFloor(long[] paramArrayOfLong, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(128527);
    int i = Arrays.binarySearch(paramArrayOfLong, paramLong);
    int j;
    if (i < 0)
    {
      j = -(i + 2);
      if (!paramBoolean2)
        break label62;
      j = Math.max(0, j);
      AppMethodBeat.o(128527);
    }
    while (true)
    {
      return j;
      j = i;
      if (paramBoolean1)
        break;
      j = i - 1;
      break;
      label62: AppMethodBeat.o(128527);
    }
  }

  private static boolean seekToFirstFrame(Parsable paramParsable)
  {
    boolean bool1 = false;
    AppMethodBeat.i(128526);
    byte[] arrayOfByte1 = new byte[1];
    byte[] arrayOfByte2 = new byte[3];
    int i = 0;
    while (true)
    {
      boolean bool2 = bool1;
      if (paramParsable.available() > 0L)
      {
        if (i == 0)
          break label94;
        arrayOfByte2 = new byte[2];
        paramParsable.readBytes(arrayOfByte2, 0, 2);
        bool2 = bool1;
        if ((arrayOfByte2[0] & 0xFF) == 255)
        {
          bool2 = bool1;
          if ((arrayOfByte2[1] & 0xFF) >> 2 == 62)
            bool2 = true;
        }
      }
      AppMethodBeat.o(128526);
      return bool2;
      label94: paramParsable.readBytes(arrayOfByte1, 0, 1);
      if ((arrayOfByte1[0] & 0xFF) >> 7 == 1)
        i = 1;
      paramParsable.readBytes(arrayOfByte2, 0, 3);
      paramParsable.skip(BytesUtil.from(arrayOfByte2));
    }
  }

  private static boolean seekToFlac(Parsable paramParsable)
  {
    boolean bool = true;
    AppMethodBeat.i(128524);
    byte[] arrayOfByte = new byte[4];
    paramParsable.readBytes(arrayOfByte, 0, 4);
    if ((arrayOfByte[0] == 73) && (arrayOfByte[1] == 68) && (arrayOfByte[2] == 51))
    {
      paramParsable.skip(2L);
      paramParsable.skip(Id3Util.unsynchsafe(paramParsable.readInt()));
      paramParsable.readBytes(arrayOfByte, 0, 4);
    }
    if ((arrayOfByte[0] == 102) && (arrayOfByte[1] == 76) && (arrayOfByte[2] == 97) && (arrayOfByte[3] == 67))
      AppMethodBeat.o(128524);
    while (true)
    {
      return bool;
      AppMethodBeat.o(128524);
      bool = false;
    }
  }

  private static boolean walkThrough(Parsable paramParsable, FlacSeekTable.BlockHandler[] paramArrayOfBlockHandler)
  {
    boolean bool1 = true;
    AppMethodBeat.i(128525);
    byte[] arrayOfByte1 = new byte[1];
    byte[] arrayOfByte2 = new byte[3];
    HashSet localHashSet = new HashSet();
    if ((localHashSet.size() < paramArrayOfBlockHandler.length) && (paramParsable.available() > 0L))
    {
      paramParsable.readBytes(arrayOfByte1, 0, 1);
      int i = arrayOfByte1[0];
      int j = paramArrayOfBlockHandler.length;
      int k = 0;
      bool2 = false;
      while (true)
      {
        if (k < j)
        {
          FlacSeekTable.BlockHandler localBlockHandler = paramArrayOfBlockHandler[k];
          bool2 = localBlockHandler.handle(paramParsable, i & 0x7F);
          if (bool2)
            localHashSet.add(Integer.valueOf(localBlockHandler.hashCode()));
        }
        else
        {
          if (bool2)
            break;
          if ((arrayOfByte1[0] & 0xFF) >> 7 == 1)
            break label168;
          paramParsable.readBytes(arrayOfByte2, 0, 3);
          paramParsable.skip(BytesUtil.from(arrayOfByte2));
          break;
        }
        k++;
      }
    }
    label168: if (localHashSet.size() == paramArrayOfBlockHandler.length)
      AppMethodBeat.o(128525);
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      AppMethodBeat.o(128525);
    }
  }

  public long[] getOffsetRangeOfSample(int paramInt)
  {
    AppMethodBeat.i(128521);
    paramInt = binarySearchFloor(this.sampleNumbers, paramInt, true, true);
    long[] arrayOfLong;
    if (paramInt + 1 >= this.offsets.length)
    {
      arrayOfLong = new long[2];
      arrayOfLong[0] = (this.firstFrameOffset + this.offsets[paramInt]);
      arrayOfLong[1] = -1L;
      AppMethodBeat.o(128521);
    }
    while (true)
    {
      return arrayOfLong;
      arrayOfLong = new long[2];
      arrayOfLong[0] = (this.firstFrameOffset + this.offsets[paramInt]);
      arrayOfLong[1] = (this.firstFrameOffset + this.offsets[(paramInt + 1)]);
      AppMethodBeat.o(128521);
    }
  }

  public void parse(IDataSource paramIDataSource)
  {
    AppMethodBeat.i(128522);
    ParsableInputStreamWrapper localParsableInputStreamWrapper = new ParsableInputStreamWrapper(paramIDataSource);
    if (!seekToFlac(localParsableInputStreamWrapper))
      AppMethodBeat.o(128522);
    while (true)
    {
      return;
      if (this.sampleRate == 0)
      {
        paramIDataSource = new FlacSeekTable.BlockHandler[2];
        paramIDataSource[0] = new FlacSeekTable.SeektableHandler(this);
        paramIDataSource[1] = new FlacSeekTable.StreamInfoHandler(this);
      }
      while (!walkThrough(localParsableInputStreamWrapper, paramIDataSource))
      {
        paramIDataSource = new InvalidBoxException("lack one or more critical BLOCK(s) to create seek table!");
        AppMethodBeat.o(128522);
        throw paramIDataSource;
        paramIDataSource = new FlacSeekTable.BlockHandler[1];
        paramIDataSource[0] = new FlacSeekTable.SeektableHandler(this);
      }
      AppMethodBeat.o(128522);
    }
  }

  public long seek(long paramLong)
  {
    AppMethodBeat.i(128523);
    int i = (int)(Math.round(paramLong / 1000.0D) * this.sampleRate);
    i = binarySearchFloor(this.sampleNumbers, i, true, true);
    long l = this.firstFrameOffset;
    paramLong = this.offsets[i];
    AppMethodBeat.o(128523);
    return paramLong + l;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.flac.FlacSeekTable
 * JD-Core Version:    0.6.2
 */