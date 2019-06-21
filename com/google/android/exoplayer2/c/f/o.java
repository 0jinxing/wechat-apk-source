package com.google.android.exoplayer2.c.f;

import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.i.k;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class o
  implements v
{
  private long aSk;
  private s aYf;
  private int bbo;
  private final h bcX;
  private final k bcY;
  private boolean bcZ;
  private boolean bda;
  private boolean bdb;
  private int bdc;
  private int bdd;
  private boolean bde;
  private int state;

  public o(h paramh)
  {
    AppMethodBeat.i(95143);
    this.bcX = paramh;
    this.bcY = new k(new byte[10]);
    this.state = 0;
    AppMethodBeat.o(95143);
  }

  private boolean a(l paraml, byte[] paramArrayOfByte, int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(95147);
    int i = Math.min(paraml.tB(), paramInt - this.bbo);
    if (i <= 0)
      AppMethodBeat.o(95147);
    while (true)
    {
      return bool;
      if (paramArrayOfByte == null)
        paraml.eM(i);
      while (true)
      {
        this.bbo = (i + this.bbo);
        if (this.bbo != paramInt)
          break label87;
        AppMethodBeat.o(95147);
        break;
        paraml.readBytes(paramArrayOfByte, this.bbo, i);
      }
      label87: bool = false;
      AppMethodBeat.o(95147);
    }
  }

  private void setState(int paramInt)
  {
    this.state = paramInt;
    this.bbo = 0;
  }

  public final void a(l paraml, boolean paramBoolean)
  {
    AppMethodBeat.i(95146);
    if (paramBoolean)
      switch (this.state)
      {
      case 0:
      case 1:
      case 2:
      default:
        setState(1);
      case 3:
      }
    while (true)
      if (paraml.tB() > 0)
      {
        int i;
        switch (this.state)
        {
        default:
          break;
        case 0:
          paraml.eM(paraml.tB());
          continue;
          if (this.bdd != -1)
            new StringBuilder("Unexpected start indicator: expected ").append(this.bdd).append(" more bytes");
          this.bcX.ro();
          break;
        case 1:
          if (a(paraml, this.bcY.data, 9))
          {
            this.bcY.setPosition(0);
            if (this.bcY.ed(24) != 1)
            {
              this.bdd = -1;
              i = 0;
              if (i == 0)
                break label330;
            }
            for (i = 2; ; i = 0)
            {
              setState(i);
              break;
              this.bcY.ee(8);
              i = this.bcY.ed(16);
              this.bcY.ee(5);
              this.bde = this.bcY.rl();
              this.bcY.ee(2);
              this.bcZ = this.bcY.rl();
              this.bda = this.bcY.rl();
              this.bcY.ee(6);
              this.bdc = this.bcY.ed(8);
              if (i == 0);
              for (this.bdd = -1; ; this.bdd = (i + 6 - 9 - this.bdc))
              {
                i = 1;
                break;
              }
            }
          }
          break;
        case 2:
          i = Math.min(10, this.bdc);
          if ((a(paraml, this.bcY.data, i)) && (a(paraml, null, this.bdc)))
          {
            this.bcY.setPosition(0);
            this.aSk = -9223372036854775807L;
            if (this.bcZ)
            {
              this.bcY.ee(4);
              long l1 = this.bcY.ed(3);
              this.bcY.ee(1);
              long l2 = this.bcY.ed(15) << 15;
              this.bcY.ee(1);
              long l3 = this.bcY.ed(15);
              this.bcY.ee(1);
              if ((!this.bdb) && (this.bda))
              {
                this.bcY.ee(4);
                long l4 = this.bcY.ed(3);
                this.bcY.ee(1);
                long l5 = this.bcY.ed(15) << 15;
                this.bcY.ee(1);
                long l6 = this.bcY.ed(15);
                this.bcY.ee(1);
                this.aYf.ao(l4 << 30 | l5 | l6);
                this.bdb = true;
              }
              this.aSk = this.aYf.ao(l1 << 30 | l2 | l3);
            }
            this.bcX.d(this.aSk, this.bde);
            setState(3);
          }
          break;
        case 3:
          label330: int j = paraml.tB();
          if (this.bdd == -1);
          for (int k = 0; ; k = j - this.bdd)
          {
            i = j;
            if (k > 0)
            {
              i = j - k;
              paraml.eL(paraml.position + i);
            }
            this.bcX.t(paraml);
            if (this.bdd == -1)
              break;
            this.bdd -= i;
            if (this.bdd != 0)
              break;
            this.bcX.ro();
            setState(1);
            break;
          }
        }
      }
    AppMethodBeat.o(95146);
  }

  public final void a(s params, g paramg, v.d paramd)
  {
    AppMethodBeat.i(95144);
    this.aYf = params;
    this.bcX.a(paramg, paramd);
    AppMethodBeat.o(95144);
  }

  public final void rn()
  {
    AppMethodBeat.i(95145);
    this.state = 0;
    this.bbo = 0;
    this.bdb = false;
    this.bcX.rn();
    AppMethodBeat.o(95145);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.o
 * JD-Core Version:    0.6.2
 */