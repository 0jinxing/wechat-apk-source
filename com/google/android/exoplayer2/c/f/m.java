package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.j;
import com.google.android.exoplayer2.i.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m
  implements h
{
  private final String aOt;
  private int aPy;
  private long aSk;
  private boolean aTf;
  private com.google.android.exoplayer2.c.m aTw;
  private long bbL;
  private String bbx;
  private final l bcP;
  private final j bcQ;
  private int bcR;
  private boolean bcS;
  private int state;

  public m()
  {
    this(null);
  }

  public m(String paramString)
  {
    AppMethodBeat.i(95137);
    this.state = 0;
    this.bcP = new l(4);
    this.bcP.data[0] = ((byte)-1);
    this.bcQ = new j();
    this.aOt = paramString;
    AppMethodBeat.o(95137);
  }

  public final void a(g paramg, v.d paramd)
  {
    AppMethodBeat.i(95138);
    paramd.rz();
    this.bbx = paramd.rB();
    this.aTw = paramg.dM(paramd.rA());
    AppMethodBeat.o(95138);
  }

  public final void d(long paramLong, boolean paramBoolean)
  {
    this.aSk = paramLong;
  }

  public final void rn()
  {
    this.state = 0;
    this.bcR = 0;
    this.bcS = false;
  }

  public final void ro()
  {
  }

  public final void t(l paraml)
  {
    AppMethodBeat.i(95139);
    while (paraml.tB() > 0)
    {
      Object localObject;
      int i;
      switch (this.state)
      {
      default:
        break;
      case 0:
        localObject = paraml.data;
        i = paraml.position;
        int j = paraml.limit;
        while (true)
        {
          if (i >= j)
            break label175;
          boolean bool;
          if ((localObject[i] & 0xFF) == 255)
          {
            bool = true;
            if ((!this.bcS) || ((localObject[i] & 0xE0) != 224))
              break label163;
          }
          for (int k = 1; ; k = 0)
          {
            this.bcS = bool;
            if (k == 0)
              break label169;
            paraml.setPosition(i + 1);
            this.bcS = false;
            this.bcP.data[1] = ((byte)localObject[i]);
            this.bcR = 2;
            this.state = 1;
            break;
            bool = false;
            break label85;
          }
          i++;
        }
        paraml.setPosition(j);
        break;
      case 1:
        i = Math.min(paraml.tB(), 4 - this.bcR);
        paraml.readBytes(this.bcP.data, this.bcR, i);
        this.bcR = (i + this.bcR);
        if (this.bcR >= 4)
        {
          this.bcP.setPosition(0);
          if (!j.a(this.bcP.readInt(), this.bcQ))
          {
            this.bcR = 0;
            this.state = 1;
          }
          else
          {
            this.aPy = this.bcQ.aPy;
            if (!this.aTf)
            {
              this.bbL = (1000000L * this.bcQ.aTa / this.bcQ.sampleRate);
              localObject = Format.a(this.bbx, this.bcQ.mimeType, -1, 4096, this.bcQ.channels, this.bcQ.sampleRate, null, null, this.aOt);
              this.aTw.f((Format)localObject);
              this.aTf = true;
            }
            this.bcP.setPosition(0);
            this.aTw.a(this.bcP, 4);
            this.state = 2;
          }
        }
        break;
      case 2:
        label85: i = Math.min(paraml.tB(), this.aPy - this.bcR);
        label163: label169: label175: this.aTw.a(paraml, i);
        this.bcR = (i + this.bcR);
        if (this.bcR >= this.aPy)
        {
          this.aTw.a(this.aSk, 1, this.aPy, 0, null);
          this.aSk += this.bbL;
          this.bcR = 0;
          this.state = 0;
        }
        break;
      }
    }
    AppMethodBeat.o(95139);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.m
 * JD-Core Version:    0.6.2
 */