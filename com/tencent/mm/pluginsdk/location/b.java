package com.tencent.mm.pluginsdk.location;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
{
  public int cED;
  public float fBr;
  public float fBs;
  public long itemId;
  public int scene;

  public b(long paramLong, float paramFloat1, float paramFloat2, int paramInt1, int paramInt2)
  {
    this.fBr = paramFloat1;
    this.fBs = paramFloat2;
    this.cED = paramInt1;
    this.scene = paramInt2;
    this.itemId = paramLong;
  }

  public final String toString()
  {
    AppMethodBeat.i(79210);
    String str = String.format("%d-%d-%d", new Object[] { Integer.valueOf((int)(this.fBr * 1000000.0F)), Integer.valueOf((int)(this.fBs * 1000000.0F)), Integer.valueOf(this.cED) });
    AppMethodBeat.o(79210);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.location.b
 * JD-Core Version:    0.6.2
 */