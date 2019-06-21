package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.a.a;
import com.google.android.exoplayer2.a.a.a;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.m;
import com.google.android.exoplayer2.i.k;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b
  implements h
{
  private final String aOt;
  private Format aOv;
  long aSk;
  private m aTw;
  private final k bbl;
  private final l bbm;
  private String bbn;
  private int bbo;
  private boolean bbp;
  private long bbq;
  private int sampleSize;
  private int state;

  public b()
  {
    this(null);
  }

  public b(String paramString)
  {
    AppMethodBeat.i(95075);
    this.bbl = new k(new byte[8]);
    this.bbm = new l(this.bbl.data);
    this.state = 0;
    this.aOt = paramString;
    AppMethodBeat.o(95075);
  }

  private boolean a(l paraml, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(95078);
    int i = Math.min(paraml.tB(), 8 - this.bbo);
    paraml.readBytes(paramArrayOfByte, this.bbo, i);
    this.bbo = (i + this.bbo);
    boolean bool;
    if (this.bbo == 8)
    {
      bool = true;
      AppMethodBeat.o(95078);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(95078);
    }
  }

  private void rp()
  {
    AppMethodBeat.i(95080);
    this.bbl.setPosition(0);
    a.a locala = a.a(this.bbl);
    if ((this.aOv == null) || (locala.aOn != this.aOv.aOn) || (locala.sampleRate != this.aOv.sampleRate) || (locala.mimeType != this.aOv.aOd))
    {
      this.aOv = Format.a(this.bbn, locala.mimeType, -1, -1, locala.aOn, locala.sampleRate, null, null, this.aOt);
      this.aTw.f(this.aOv);
    }
    this.sampleSize = locala.aPy;
    this.bbq = (1000000L * locala.sampleCount / this.aOv.sampleRate);
    AppMethodBeat.o(95080);
  }

  private boolean u(l paraml)
  {
    boolean bool1 = true;
    AppMethodBeat.i(95079);
    int i;
    if (paraml.tB() > 0)
    {
      if (!this.bbp)
      {
        if (paraml.readUnsignedByte() == 11);
        for (bool2 = true; ; bool2 = false)
        {
          this.bbp = bool2;
          break;
        }
      }
      i = paraml.readUnsignedByte();
      if (i == 119)
      {
        this.bbp = false;
        AppMethodBeat.o(95079);
      }
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      if (i == 11);
      for (bool2 = true; ; bool2 = false)
      {
        this.bbp = bool2;
        break;
      }
      AppMethodBeat.o(95079);
    }
  }

  public final void a(g paramg, v.d paramd)
  {
    AppMethodBeat.i(95076);
    paramd.rz();
    this.bbn = paramd.rB();
    this.aTw = paramg.dM(paramd.rA());
    AppMethodBeat.o(95076);
  }

  public final void d(long paramLong, boolean paramBoolean)
  {
    this.aSk = paramLong;
  }

  public final void rn()
  {
    this.state = 0;
    this.bbo = 0;
    this.bbp = false;
  }

  public final void ro()
  {
  }

  public final void t(l paraml)
  {
    AppMethodBeat.i(95077);
    while (paraml.tB() > 0)
      switch (this.state)
      {
      default:
        break;
      case 0:
        if (u(paraml))
        {
          this.state = 1;
          this.bbm.data[0] = ((byte)11);
          this.bbm.data[1] = ((byte)119);
          this.bbo = 2;
        }
        break;
      case 1:
        if (a(paraml, this.bbm.data))
        {
          rp();
          this.bbm.setPosition(0);
          this.aTw.a(this.bbm, 8);
          this.state = 2;
        }
        break;
      case 2:
        int i = Math.min(paraml.tB(), this.sampleSize - this.bbo);
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
    AppMethodBeat.o(95077);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.b
 * JD-Core Version:    0.6.2
 */