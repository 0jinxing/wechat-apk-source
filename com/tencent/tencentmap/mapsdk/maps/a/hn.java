package com.tencent.tencentmap.mapsdk.maps.a;

import android.graphics.Rect;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class hn
{
  public final Rect a;
  public int[] b;
  public int[] c;
  public int[] d;

  public hn()
  {
    AppMethodBeat.i(99558);
    this.a = new Rect();
    AppMethodBeat.o(99558);
  }

  public static hn a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(99561);
    ByteBuffer localByteBuffer = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.nativeOrder());
    if (localByteBuffer.get() == 0)
    {
      paramArrayOfByte = null;
      AppMethodBeat.o(99561);
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = new hn();
      paramArrayOfByte.b = new int[localByteBuffer.get()];
      paramArrayOfByte.c = new int[localByteBuffer.get()];
      paramArrayOfByte.d = new int[localByteBuffer.get()];
      a(paramArrayOfByte.b.length);
      a(paramArrayOfByte.c.length);
      localByteBuffer.getInt();
      localByteBuffer.getInt();
      paramArrayOfByte.a.left = localByteBuffer.getInt();
      paramArrayOfByte.a.right = localByteBuffer.getInt();
      paramArrayOfByte.a.top = localByteBuffer.getInt();
      paramArrayOfByte.a.bottom = localByteBuffer.getInt();
      localByteBuffer.getInt();
      a(paramArrayOfByte.b, localByteBuffer);
      a(paramArrayOfByte.c, localByteBuffer);
      a(paramArrayOfByte.d, localByteBuffer);
      AppMethodBeat.o(99561);
    }
  }

  private static void a(int paramInt)
  {
    AppMethodBeat.i(99560);
    if ((paramInt == 0) || ((paramInt & 0x1) != 0))
    {
      RuntimeException localRuntimeException = new RuntimeException("invalid nine-patch: ".concat(String.valueOf(paramInt)));
      AppMethodBeat.o(99560);
      throw localRuntimeException;
    }
    AppMethodBeat.o(99560);
  }

  private static void a(int[] paramArrayOfInt, ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(99559);
    int i = 0;
    int j = paramArrayOfInt.length;
    while (i < j)
    {
      paramArrayOfInt[i] = paramByteBuffer.getInt();
      i++;
    }
    AppMethodBeat.o(99559);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.hn
 * JD-Core Version:    0.6.2
 */