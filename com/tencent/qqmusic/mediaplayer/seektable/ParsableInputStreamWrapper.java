package com.tencent.qqmusic.mediaplayer.seektable;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.qqmusic.mediaplayer.upstream.IDataSource;
import java.io.Closeable;
import java.nio.charset.Charset;

public class ParsableInputStreamWrapper
  implements Parsable, Closeable
{
  private final IDataSource dataSource;
  private final byte[] intBuffer;
  private final byte[] longBuffer;
  private long position;

  public ParsableInputStreamWrapper(IDataSource paramIDataSource)
  {
    AppMethodBeat.i(128508);
    this.dataSource = paramIDataSource;
    this.intBuffer = new byte[4];
    this.longBuffer = new byte[8];
    this.position = 0L;
    AppMethodBeat.o(128508);
  }

  public long available()
  {
    AppMethodBeat.i(128517);
    long l1 = this.dataSource.getSize();
    long l2 = this.position;
    AppMethodBeat.o(128517);
    return l1 - l2;
  }

  public void close()
  {
    AppMethodBeat.i(128519);
    this.dataSource.close();
    AppMethodBeat.o(128519);
  }

  public void readBytes(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(128515);
    long l = this.position;
    this.position = (this.dataSource.readAt(this.position, paramArrayOfByte, paramInt1, paramInt2) + l);
    AppMethodBeat.o(128515);
  }

  public int readInt()
  {
    AppMethodBeat.i(128509);
    int i = this.dataSource.readAt(this.position, this.intBuffer, 0, this.intBuffer.length);
    this.position += i;
    if (i != this.intBuffer.length)
    {
      i = -1;
      AppMethodBeat.o(128509);
    }
    while (true)
    {
      return i;
      i = (this.intBuffer[0] & 0xFF) << 24 | (this.intBuffer[1] & 0xFF) << 16 | (this.intBuffer[2] & 0xFF) << 8 | this.intBuffer[3] & 0xFF;
      AppMethodBeat.o(128509);
    }
  }

  public int[] readIntArray(int paramInt)
  {
    AppMethodBeat.i(128511);
    int[] arrayOfInt = new int[paramInt];
    for (int i = 0; i < paramInt; i++)
      arrayOfInt[i] = readInt();
    AppMethodBeat.o(128511);
    return arrayOfInt;
  }

  public void readIntArrayInterleaved(int paramInt, int[][] paramArrayOfInt)
  {
    AppMethodBeat.i(128513);
    for (int i = 0; i < paramInt; i++)
    {
      int j = paramArrayOfInt.length;
      for (int k = 0; k < j; k++)
        paramArrayOfInt[k][i] = readInt();
    }
    AppMethodBeat.o(128513);
  }

  public long readLong()
  {
    AppMethodBeat.i(128510);
    int i = this.dataSource.readAt(this.position, this.longBuffer, 0, this.longBuffer.length);
    this.position += i;
    long l;
    if (i != this.longBuffer.length)
    {
      l = -1L;
      AppMethodBeat.o(128510);
    }
    while (true)
    {
      return l;
      l = (this.longBuffer[0] & 0xFF) << 56 | (this.longBuffer[1] & 0xFF) << 48 | (this.longBuffer[2] & 0xFF) << 40 | (this.longBuffer[3] & 0xFF) << 32 | (this.longBuffer[4] & 0xFF) << 24 | (this.longBuffer[5] & 0xFF) << 16 | (this.longBuffer[6] & 0xFF) << 8 | this.longBuffer[7] & 0xFF;
      AppMethodBeat.o(128510);
    }
  }

  public long[] readLongArray(int paramInt)
  {
    AppMethodBeat.i(128512);
    long[] arrayOfLong = new long[paramInt];
    for (int i = 0; i < paramInt; i++)
      arrayOfLong[i] = readLong();
    AppMethodBeat.o(128512);
    return arrayOfLong;
  }

  public void readLongArrayInterleaved(int paramInt, long[][] paramArrayOfLong)
  {
    AppMethodBeat.i(128514);
    for (int i = 0; i < paramInt; i++)
    {
      int j = paramArrayOfLong.length;
      for (int k = 0; k < j; k++)
        paramArrayOfLong[k][i] = readLong();
    }
    AppMethodBeat.o(128514);
  }

  public String readString(int paramInt)
  {
    AppMethodBeat.i(128516);
    Object localObject = new byte[paramInt];
    readBytes((byte[])localObject, 0, paramInt);
    localObject = new String((byte[])localObject, Charset.defaultCharset());
    AppMethodBeat.o(128516);
    return localObject;
  }

  public long skip(long paramLong)
  {
    AppMethodBeat.i(128518);
    long l = available();
    if (l > paramLong)
      this.position += paramLong;
    while (true)
    {
      AppMethodBeat.o(128518);
      return paramLong;
      this.position += l;
      paramLong = l;
    }
  }

  public long tell()
  {
    return this.position;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.qqmusic.mediaplayer.seektable.ParsableInputStreamWrapper
 * JD-Core Version:    0.6.2
 */