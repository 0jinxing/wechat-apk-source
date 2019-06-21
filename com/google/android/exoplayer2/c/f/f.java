package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f
  implements h
{
  private final String aOt;
  private Format aOv;
  private long aSk;
  private m aTw;
  private int bbE;
  private final l bbm;
  private int bbo;
  private long bbq;
  private String bbx;
  private int sampleSize;
  private int state;

  public f(String paramString)
  {
    AppMethodBeat.i(95103);
    this.bbm = new l(new byte[15]);
    this.bbm.data[0] = ((byte)127);
    this.bbm.data[1] = ((byte)-2);
    this.bbm.data[2] = ((byte)-128);
    this.bbm.data[3] = ((byte)1);
    this.state = 0;
    this.aOt = paramString;
    AppMethodBeat.o(95103);
  }

  public final void a(g paramg, v.d paramd)
  {
    AppMethodBeat.i(95104);
    paramd.rz();
    this.bbx = paramd.rB();
    this.aTw = paramg.dM(paramd.rA());
    AppMethodBeat.o(95104);
  }

  public final void d(long paramLong, boolean paramBoolean)
  {
    this.aSk = paramLong;
  }

  public final void rn()
  {
    this.state = 0;
    this.bbo = 0;
    this.bbE = 0;
  }

  public final void ro()
  {
  }

  public final void t(l paraml)
  {
    AppMethodBeat.i(95105);
    while (paraml.tB() > 0)
    {
      int i;
      switch (this.state)
      {
      default:
        break;
      case 0:
        while (paraml.tB() > 0)
        {
          this.bbE <<= 8;
          this.bbE |= paraml.readUnsignedByte();
          if (this.bbE == 2147385345)
            this.bbE = 0;
        }
        for (i = 1; i != 0; i = 0)
        {
          this.bbo = 4;
          this.state = 1;
          break;
        }
      case 1:
        byte[] arrayOfByte = this.bbm.data;
        i = Math.min(paraml.tB(), 15 - this.bbo);
        paraml.readBytes(arrayOfByte, this.bbo, i);
        this.bbo += i;
        if (this.bbo == 15);
        for (i = 1; i != 0; i = 0)
        {
          arrayOfByte = this.bbm.data;
          if (this.aOv == null)
          {
            this.aOv = com.google.android.exoplayer2.a.h.a(arrayOfByte, this.bbx, this.aOt);
            this.aTw.f(this.aOv);
          }
          this.sampleSize = com.google.android.exoplayer2.a.h.l(arrayOfByte);
          this.bbq = ((int)(com.google.android.exoplayer2.a.h.k(arrayOfByte) * 1000000L / this.aOv.sampleRate));
          this.bbm.setPosition(0);
          this.aTw.a(this.bbm, 15);
          this.state = 2;
          break;
        }
      case 2:
        i = Math.min(paraml.tB(), this.sampleSize - this.bbo);
        this.aTw.a(paraml, i);
        this.bbo = (i + this.bbo);
        if (this.bbo == this.sampleSize)
        {
          this.aTw.a(this.aSk, 1, this.sampleSize, 0, null);
          this.aSk += this.bbq;
          this.state = 0;
        }
        break;
      }
    }
    AppMethodBeat.o(95105);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.f
 * JD-Core Version:    0.6.2
 */