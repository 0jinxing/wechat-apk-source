package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteUtil
{
  public static byte[] mBytes = new byte[4];

  public static byte[] getByteBuffer()
  {
    return mBytes;
  }

  public static int readInt()
  {
    AppMethodBeat.i(83825);
    ByteBuffer localByteBuffer = ByteBuffer.wrap(mBytes);
    localByteBuffer.order(ByteOrder.nativeOrder());
    int i = localByteBuffer.getInt();
    AppMethodBeat.o(83825);
    return i;
  }

  public static int readInt(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(83826);
    int i;
    if (paramArrayOfByte == null)
    {
      i = 0;
      AppMethodBeat.o(83826);
    }
    while (true)
    {
      return i;
      paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
      paramArrayOfByte.order(ByteOrder.nativeOrder());
      i = paramArrayOfByte.getInt();
      AppMethodBeat.o(83826);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.ByteUtil
 * JD-Core Version:    0.6.2
 */