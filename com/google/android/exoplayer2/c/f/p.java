package com.google.android.exoplayer2.c.f;

import android.util.SparseArray;
import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.l.a;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class p
  implements e
{
  public static final com.google.android.exoplayer2.c.h aTh;
  private final s aYf;
  private g baf;
  private final SparseArray<p.a> bdf;
  private final l bdg;
  private boolean bdh;
  private boolean bdi;
  private boolean bdj;

  static
  {
    AppMethodBeat.i(95156);
    aTh = new p.1();
    AppMethodBeat.o(95156);
  }

  public p()
  {
    this(new s(0L));
    AppMethodBeat.i(95150);
    AppMethodBeat.o(95150);
  }

  private p(s params)
  {
    AppMethodBeat.i(95151);
    this.aYf = params;
    this.bdg = new l(4096);
    this.bdf = new SparseArray();
    AppMethodBeat.o(95151);
  }

  public final int a(f paramf, com.google.android.exoplayer2.c.k paramk)
  {
    AppMethodBeat.i(95155);
    if (!paramf.b(this.bdg.data, 0, 4, true))
    {
      i = -1;
      AppMethodBeat.o(95155);
    }
    while (true)
    {
      return i;
      this.bdg.setPosition(0);
      i = this.bdg.readInt();
      if (i == 441)
      {
        i = -1;
        AppMethodBeat.o(95155);
      }
      else if (i == 442)
      {
        paramf.b(this.bdg.data, 0, 10);
        this.bdg.setPosition(9);
        paramf.dG((this.bdg.readUnsignedByte() & 0x7) + 14);
        AppMethodBeat.o(95155);
        i = 0;
      }
      else if (i == 443)
      {
        paramf.b(this.bdg.data, 0, 2);
        this.bdg.setPosition(0);
        paramf.dG(this.bdg.readUnsignedShort() + 6);
        AppMethodBeat.o(95155);
        i = 0;
      }
      else
      {
        if ((i & 0xFFFFFF00) >> 8 == 1)
          break;
        paramf.dG(1);
        AppMethodBeat.o(95155);
        i = 0;
      }
    }
    i &= 255;
    p.a locala = (p.a)this.bdf.get(i);
    paramk = locala;
    Object localObject;
    if (!this.bdh)
    {
      localObject = locala;
      if (locala == null)
      {
        localObject = null;
        if ((this.bdi) || (i != 189))
          break label439;
        paramk = new b();
        this.bdi = true;
        label280: localObject = locala;
        if (paramk != null)
        {
          localObject = new v.d(i, 256);
          paramk.a(this.baf, (v.d)localObject);
          localObject = new p.a(paramk, this.aYf);
          this.bdf.put(i, localObject);
        }
      }
      if ((!this.bdi) || (!this.bdj))
      {
        paramk = (com.google.android.exoplayer2.c.k)localObject;
        if (paramf.getPosition() <= 1048576L);
      }
      else
      {
        this.bdh = true;
        this.baf.rb();
        paramk = (com.google.android.exoplayer2.c.k)localObject;
      }
    }
    paramf.b(this.bdg.data, 0, 2);
    this.bdg.setPosition(0);
    int i = this.bdg.readUnsignedShort() + 6;
    if (paramk == null)
      paramf.dG(i);
    while (true)
    {
      AppMethodBeat.o(95155);
      i = 0;
      break;
      label439: if ((!this.bdi) && ((i & 0xE0) == 192))
      {
        paramk = new m();
        this.bdi = true;
        break label280;
      }
      paramk = (com.google.android.exoplayer2.c.k)localObject;
      if (this.bdj)
        break label280;
      paramk = (com.google.android.exoplayer2.c.k)localObject;
      if ((i & 0xF0) != 224)
        break label280;
      paramk = new i();
      this.bdj = true;
      break label280;
      this.bdg.reset(i);
      paramf.readFully(this.bdg.data, 0, i);
      this.bdg.setPosition(6);
      paramf = this.bdg;
      paramf.readBytes(paramk.bcY.data, 0, 3);
      paramk.bcY.setPosition(0);
      paramk.bcY.ee(8);
      paramk.bcZ = paramk.bcY.rl();
      paramk.bda = paramk.bcY.rl();
      paramk.bcY.ee(6);
      paramk.bdc = paramk.bcY.ed(8);
      paramf.readBytes(paramk.bcY.data, 0, paramk.bdc);
      paramk.bcY.setPosition(0);
      paramk.aSk = 0L;
      if (paramk.bcZ)
      {
        paramk.bcY.ee(4);
        long l1 = paramk.bcY.ed(3);
        paramk.bcY.ee(1);
        long l2 = paramk.bcY.ed(15) << 15;
        paramk.bcY.ee(1);
        long l3 = paramk.bcY.ed(15);
        paramk.bcY.ee(1);
        if ((!paramk.bdb) && (paramk.bda))
        {
          paramk.bcY.ee(4);
          long l4 = paramk.bcY.ed(3);
          paramk.bcY.ee(1);
          long l5 = paramk.bcY.ed(15) << 15;
          paramk.bcY.ee(1);
          long l6 = paramk.bcY.ed(15);
          paramk.bcY.ee(1);
          paramk.aYf.ao(l4 << 30 | l5 | l6);
          paramk.bdb = true;
        }
        paramk.aSk = paramk.aYf.ao(l1 << 30 | l2 | l3);
      }
      paramk.bdk.d(paramk.aSk, true);
      paramk.bdk.t(paramf);
      paramk.bdk.ro();
      this.bdg.eL(this.bdg.capacity());
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(95153);
    this.baf = paramg;
    paramg.a(new l.a(-9223372036854775807L));
    AppMethodBeat.o(95153);
  }

  public final boolean a(f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(95152);
    byte[] arrayOfByte = new byte[14];
    paramf.b(arrayOfByte, 0, 14);
    if (442 != ((arrayOfByte[0] & 0xFF) << 24 | (arrayOfByte[1] & 0xFF) << 16 | (arrayOfByte[2] & 0xFF) << 8 | arrayOfByte[3] & 0xFF))
      AppMethodBeat.o(95152);
    while (true)
    {
      return bool;
      if ((arrayOfByte[4] & 0xC4) != 68)
      {
        AppMethodBeat.o(95152);
      }
      else if ((arrayOfByte[6] & 0x4) != 4)
      {
        AppMethodBeat.o(95152);
      }
      else if ((arrayOfByte[8] & 0x4) != 4)
      {
        AppMethodBeat.o(95152);
      }
      else if ((arrayOfByte[9] & 0x1) != 1)
      {
        AppMethodBeat.o(95152);
      }
      else if ((arrayOfByte[12] & 0x3) != 3)
      {
        AppMethodBeat.o(95152);
      }
      else
      {
        paramf.dH(arrayOfByte[13] & 0x7);
        paramf.b(arrayOfByte, 0, 3);
        int i = arrayOfByte[0];
        int j = arrayOfByte[1];
        if (1 == (arrayOfByte[2] & 0xFF | ((i & 0xFF) << 16 | (j & 0xFF) << 8)))
        {
          AppMethodBeat.o(95152);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(95152);
        }
      }
    }
  }

  public final void g(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95154);
    this.aYf.brL = -9223372036854775807L;
    for (int i = 0; i < this.bdf.size(); i++)
    {
      p.a locala = (p.a)this.bdf.valueAt(i);
      locala.bdb = false;
      locala.bdk.rn();
    }
    AppMethodBeat.o(95154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.p
 * JD-Core Version:    0.6.2
 */