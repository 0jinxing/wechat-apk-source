package com.google.android.exoplayer2.c.a;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.j;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.video.a;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class e extends d
{
  private boolean aTf;
  private final l aTx;
  private final l aTy;
  private int aTz;
  private int frameType;

  public e(m paramm)
  {
    super(paramm);
    AppMethodBeat.i(94878);
    this.aTx = new l(j.bqY);
    this.aTy = new l(4);
    AppMethodBeat.o(94878);
  }

  protected final void a(l paraml, long paramLong)
  {
    AppMethodBeat.i(94880);
    int i = paraml.readUnsignedByte();
    long l = paraml.tD();
    Object localObject;
    if ((i == 0) && (!this.aTf))
    {
      localObject = new l(new byte[paraml.tB()]);
      paraml.readBytes(((l)localObject).data, 0, paraml.tB());
      paraml = a.K((l)localObject);
      this.aTz = paraml.aTz;
      paraml = Format.a(null, "video/avc", paraml.width, paraml.height, paraml.aOf, paraml.brq);
      this.aTw.f(paraml);
      this.aTf = true;
      AppMethodBeat.o(94880);
      return;
    }
    if ((i == 1) && (this.aTf))
    {
      localObject = this.aTy.data;
      localObject[0] = ((byte)0);
      localObject[1] = ((byte)0);
      localObject[2] = ((byte)0);
      j = this.aTz;
      int k;
      for (i = 0; paraml.tB() > 0; i = i + 4 + k)
      {
        paraml.readBytes(this.aTy.data, 4 - j, this.aTz);
        this.aTy.setPosition(0);
        k = this.aTy.tI();
        this.aTx.setPosition(0);
        this.aTw.a(this.aTx, 4);
        this.aTw.a(paraml, k);
      }
      paraml = this.aTw;
      if (this.frameType != 1)
        break label299;
    }
    label299: for (int j = 1; ; j = 0)
    {
      paraml.a(l * 1000L + paramLong, j, i, 0, null);
      AppMethodBeat.o(94880);
      break;
    }
  }

  protected final boolean a(l paraml)
  {
    AppMethodBeat.i(94879);
    int i = paraml.readUnsignedByte();
    int j = i >> 4 & 0xF;
    i &= 15;
    if (i != 7)
    {
      paraml = new d.a("Video format not supported: ".concat(String.valueOf(i)));
      AppMethodBeat.o(94879);
      throw paraml;
    }
    this.frameType = j;
    boolean bool;
    if (j != 5)
    {
      bool = true;
      AppMethodBeat.o(94879);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(94879);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.a.e
 * JD-Core Version:    0.6.2
 */