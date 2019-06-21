package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class b$e
  implements b.b
{
  private final int aXQ;
  private int aXR;
  private int aXS;
  private final l aXz;
  private final int sampleCount;

  public b$e(a.b paramb)
  {
    AppMethodBeat.i(94946);
    this.aXz = paramb.aXz;
    this.aXz.setPosition(12);
    this.aXQ = (this.aXz.tI() & 0xFF);
    this.sampleCount = this.aXz.tI();
    AppMethodBeat.o(94946);
  }

  public final int getSampleCount()
  {
    return this.sampleCount;
  }

  public final int rg()
  {
    AppMethodBeat.i(94947);
    int i;
    if (this.aXQ == 8)
    {
      i = this.aXz.readUnsignedByte();
      AppMethodBeat.o(94947);
    }
    while (true)
    {
      return i;
      if (this.aXQ == 16)
      {
        i = this.aXz.readUnsignedShort();
        AppMethodBeat.o(94947);
      }
      else
      {
        i = this.aXR;
        this.aXR = (i + 1);
        if (i % 2 == 0)
        {
          this.aXS = this.aXz.readUnsignedByte();
          i = (this.aXS & 0xF0) >> 4;
          AppMethodBeat.o(94947);
        }
        else
        {
          i = this.aXS & 0xF;
          AppMethodBeat.o(94947);
        }
      }
    }
  }

  public final boolean rh()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.b.e
 * JD-Core Version:    0.6.2
 */