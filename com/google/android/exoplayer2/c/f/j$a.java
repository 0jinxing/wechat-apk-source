package com.google.android.exoplayer2.c.f;

import android.util.SparseArray;
import com.google.android.exoplayer2.i.j.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

final class j$a
{
  final com.google.android.exoplayer2.c.m aTw;
  long bbJ;
  long bbR;
  boolean bbS;
  boolean bbV;
  final boolean bbY;
  final boolean bbZ;
  private final SparseArray<j.b> bcf;
  private final SparseArray<com.google.android.exoplayer2.i.j.a> bcg;
  private final com.google.android.exoplayer2.i.m bch;
  int bci;
  int bcj;
  long bck;
  long bcl;
  j.a.a bcm;
  j.a.a bcn;
  boolean bco;
  private byte[] buffer;

  public j$a(com.google.android.exoplayer2.c.m paramm, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(95117);
    this.aTw = paramm;
    this.bbY = paramBoolean1;
    this.bbZ = paramBoolean2;
    this.bcf = new SparseArray();
    this.bcg = new SparseArray();
    this.bcm = new j.a.a((byte)0);
    this.bcn = new j.a.a((byte)0);
    this.buffer = new byte[''];
    this.bch = new com.google.android.exoplayer2.i.m(this.buffer, 0, 0);
    reset();
    AppMethodBeat.o(95117);
  }

  public final void a(com.google.android.exoplayer2.i.j.a parama)
  {
    AppMethodBeat.i(95119);
    this.bcg.append(parama.bcu, parama);
    AppMethodBeat.o(95119);
  }

  public final void a(j.b paramb)
  {
    AppMethodBeat.i(95118);
    this.bcf.append(paramb.bro, paramb);
    AppMethodBeat.o(95118);
  }

  public final void f(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(95121);
    if (!this.bbV)
      AppMethodBeat.o(95121);
    int i;
    int j;
    int k;
    j.b localb;
    boolean bool1;
    int m;
    boolean bool4;
    boolean bool5;
    boolean bool6;
    label522: label530: int n;
    int i1;
    int i2;
    int i3;
    while (true)
    {
      return;
      paramInt2 -= paramInt1;
      if (this.buffer.length < this.bci + paramInt2)
        this.buffer = Arrays.copyOf(this.buffer, (this.bci + paramInt2) * 2);
      System.arraycopy(paramArrayOfByte, paramInt1, this.buffer, this.bci, paramInt2);
      this.bci = (paramInt2 + this.bci);
      this.bch.l(this.buffer, 0, this.bci);
      if (!this.bch.eO(8))
      {
        AppMethodBeat.o(95121);
      }
      else
      {
        this.bch.tz();
        i = this.bch.ed(2);
        this.bch.ee(5);
        if (!this.bch.tM())
        {
          AppMethodBeat.o(95121);
        }
        else
        {
          this.bch.tO();
          if (!this.bch.tM())
          {
            AppMethodBeat.o(95121);
          }
          else
          {
            j = this.bch.tO();
            if (!this.bbZ)
            {
              this.bbV = false;
              this.bcn.eg(j);
              AppMethodBeat.o(95121);
            }
            else if (!this.bch.tM())
            {
              AppMethodBeat.o(95121);
            }
            else
            {
              k = this.bch.tO();
              if (this.bcg.indexOfKey(k) < 0)
              {
                this.bbV = false;
                AppMethodBeat.o(95121);
              }
              else
              {
                paramArrayOfByte = (com.google.android.exoplayer2.i.j.a)this.bcg.get(k);
                localb = (j.b)this.bcf.get(paramArrayOfByte.bro);
                if (localb.brr)
                {
                  if (!this.bch.eO(2))
                    AppMethodBeat.o(95121);
                  else
                    this.bch.ee(2);
                }
                else if (!this.bch.eO(localb.brt))
                {
                  AppMethodBeat.o(95121);
                }
                else
                {
                  bool1 = false;
                  boolean bool2 = false;
                  boolean bool3 = false;
                  m = this.bch.ed(localb.brt);
                  bool4 = bool2;
                  bool5 = bool3;
                  if (!localb.brs)
                  {
                    if (!this.bch.eO(1))
                    {
                      AppMethodBeat.o(95121);
                    }
                    else
                    {
                      bool6 = this.bch.rl();
                      bool1 = bool6;
                      bool4 = bool2;
                      bool5 = bool3;
                      if (bool6)
                      {
                        if (!this.bch.eO(1))
                        {
                          AppMethodBeat.o(95121);
                          continue;
                        }
                        bool5 = this.bch.rl();
                        bool4 = true;
                        bool1 = bool6;
                      }
                    }
                  }
                  else
                  {
                    if (this.bcj == 5);
                    for (bool6 = true; ; bool6 = false)
                    {
                      paramInt2 = 0;
                      if (!bool6)
                        break label530;
                      if (this.bch.tM())
                        break label522;
                      AppMethodBeat.o(95121);
                      break;
                    }
                    paramInt2 = this.bch.tO();
                    n = 0;
                    i1 = 0;
                    i2 = 0;
                    i3 = 0;
                    if (localb.bru != 0)
                      break label713;
                    if (!this.bch.eO(localb.brv))
                    {
                      AppMethodBeat.o(95121);
                    }
                    else
                    {
                      n = this.bch.ed(localb.brv);
                      i4 = n;
                      i5 = i1;
                      paramInt1 = i2;
                      i6 = i3;
                      if (!paramArrayOfByte.brp)
                        break label667;
                      i4 = n;
                      i5 = i1;
                      paramInt1 = i2;
                      i6 = i3;
                      if (bool1)
                        break label667;
                      if (this.bch.tM())
                        break;
                      AppMethodBeat.o(95121);
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    int i5 = this.bch.tN();
    int i6 = i3;
    paramInt1 = i2;
    int i4 = n;
    while (true)
    {
      label667: this.bcn.a(localb, i, j, m, k, bool1, bool4, bool5, bool6, paramInt2, i4, i5, paramInt1, i6);
      this.bbV = false;
      AppMethodBeat.o(95121);
      break;
      label713: i4 = n;
      i5 = i1;
      paramInt1 = i2;
      i6 = i3;
      if (localb.bru == 1)
      {
        i4 = n;
        i5 = i1;
        paramInt1 = i2;
        i6 = i3;
        if (!localb.brw)
        {
          if (!this.bch.tM())
          {
            AppMethodBeat.o(95121);
            break;
          }
          i2 = this.bch.tN();
          i4 = n;
          i5 = i1;
          paramInt1 = i2;
          i6 = i3;
          if (paramArrayOfByte.brp)
          {
            i4 = n;
            i5 = i1;
            paramInt1 = i2;
            i6 = i3;
            if (!bool1)
            {
              if (!this.bch.tM())
              {
                AppMethodBeat.o(95121);
                break;
              }
              i6 = this.bch.tN();
              i4 = n;
              i5 = i1;
              paramInt1 = i2;
            }
          }
        }
      }
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(95120);
    this.bbV = false;
    this.bco = false;
    this.bcn.clear();
    AppMethodBeat.o(95120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.j.a
 * JD-Core Version:    0.6.2
 */