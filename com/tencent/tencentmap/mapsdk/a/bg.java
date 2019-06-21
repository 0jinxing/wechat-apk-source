package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.hl;
import java.util.Arrays;

public class bg
{
  private int a;
  private int b;
  private int c;
  private byte[] d;

  public bg()
  {
    AppMethodBeat.i(100786);
    this.d = new byte[4];
    AppMethodBeat.o(100786);
  }

  public int a()
  {
    return this.a;
  }

  public void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(100787);
    Arrays.fill(this.d, (byte)0);
    System.arraycopy(paramArrayOfByte, 0, this.d, 0, 4);
    this.a = hl.a(this.d);
    System.arraycopy(paramArrayOfByte, 4, this.d, 0, 4);
    this.b = hl.a(this.d);
    System.arraycopy(paramArrayOfByte, 8, this.d, 0, 4);
    this.c = hl.a(this.d);
    AppMethodBeat.o(100787);
  }

  public int b()
  {
    return this.b;
  }

  public int c()
  {
    return this.c;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.bg
 * JD-Core Version:    0.6.2
 */