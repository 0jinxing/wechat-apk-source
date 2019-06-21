package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class r
  implements v
{
  private int bbo;
  private final q bdl;
  private final l bdm;
  private int bdn;
  private boolean bdo;
  private boolean bdp;

  public r(q paramq)
  {
    AppMethodBeat.i(95157);
    this.bdl = paramq;
    this.bdm = new l(32);
    AppMethodBeat.o(95157);
  }

  public final void a(l paraml, boolean paramBoolean)
  {
    AppMethodBeat.i(95159);
    if (paramBoolean);
    for (int i = paraml.readUnsignedByte() + paraml.position; ; i = -1)
    {
      if (this.bdp)
        if (!paramBoolean)
          AppMethodBeat.o(95159);
      while (true)
      {
        return;
        this.bdp = false;
        paraml.setPosition(i);
        this.bbo = 0;
        while (true)
          if (paraml.tB() > 0)
          {
            if (this.bbo < 3)
            {
              if (this.bbo == 0)
              {
                i = paraml.readUnsignedByte();
                paraml.setPosition(paraml.position - 1);
                if (i == 255)
                {
                  this.bdp = true;
                  AppMethodBeat.o(95159);
                  break;
                }
              }
              i = Math.min(paraml.tB(), 3 - this.bbo);
              paraml.readBytes(this.bdm.data, this.bbo, i);
              this.bbo = (i + this.bbo);
              if (this.bbo != 3)
                continue;
              this.bdm.reset(3);
              this.bdm.eM(1);
              int j = this.bdm.readUnsignedByte();
              i = this.bdm.readUnsignedByte();
              if ((j & 0x80) != 0);
              for (paramBoolean = true; ; paramBoolean = false)
              {
                this.bdo = paramBoolean;
                this.bdn = (((j & 0xF) << 8 | i) + 3);
                if (this.bdm.capacity() >= this.bdn)
                  break;
                byte[] arrayOfByte = this.bdm.data;
                this.bdm.reset(Math.min(4098, Math.max(this.bdn, arrayOfByte.length * 2)));
                System.arraycopy(arrayOfByte, 0, this.bdm.data, 0, 3);
                break;
              }
            }
            i = Math.min(paraml.tB(), this.bdn - this.bbo);
            paraml.readBytes(this.bdm.data, this.bbo, i);
            this.bbo = (i + this.bbo);
            if (this.bbo == this.bdn)
            {
              if (this.bdo)
              {
                if (com.google.android.exoplayer2.i.v.m(this.bdm.data, this.bdn, -1) != 0)
                {
                  this.bdp = true;
                  AppMethodBeat.o(95159);
                  break;
                }
                this.bdm.reset(this.bdn - 4);
              }
              while (true)
              {
                this.bdl.t(this.bdm);
                this.bbo = 0;
                break;
                this.bdm.reset(this.bdn);
              }
            }
          }
        AppMethodBeat.o(95159);
      }
    }
  }

  public final void a(s params, g paramg, v.d paramd)
  {
    AppMethodBeat.i(95158);
    this.bdl.a(params, paramg, paramd);
    this.bdp = true;
    AppMethodBeat.o(95158);
  }

  public final void rn()
  {
    this.bdp = true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.r
 * JD-Core Version:    0.6.2
 */