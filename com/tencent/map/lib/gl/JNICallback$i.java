package com.tencent.map.lib.gl;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.maps.a.hl;
import java.util.Arrays;

public class JNICallback$i
{
  public float a;
  public int b;
  public int c;
  public int d;
  public boolean e;
  byte[] f;

  private JNICallback$i()
  {
    AppMethodBeat.i(98025);
    this.f = new byte[4];
    AppMethodBeat.o(98025);
  }

  public void a(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(98026);
    Arrays.fill(this.f, (byte)0);
    System.arraycopy(paramArrayOfByte, 0, this.f, 0, 4);
    this.a = hl.c(this.f);
    System.arraycopy(paramArrayOfByte, 4, this.f, 0, 4);
    this.b = hl.a(this.f);
    System.arraycopy(paramArrayOfByte, 8, this.f, 0, 4);
    this.c = hl.a(this.f);
    System.arraycopy(paramArrayOfByte, 12, this.f, 0, 4);
    this.d = hl.a(this.f);
    System.arraycopy(paramArrayOfByte, 16, this.f, 0, 1);
    this.e = hl.b(this.f);
    AppMethodBeat.o(98026);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.map.lib.gl.JNICallback.i
 * JD-Core Version:    0.6.2
 */