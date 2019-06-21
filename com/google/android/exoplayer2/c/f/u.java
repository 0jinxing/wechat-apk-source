package com.google.android.exoplayer2.c.f;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.g;
import com.google.android.exoplayer2.c.h;
import com.google.android.exoplayer2.c.l.a;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.l;
import com.google.android.exoplayer2.i.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class u
  implements com.google.android.exoplayer2.c.e
{
  public static final h aTh;
  private static final long bdr;
  private static final long bds;
  private static final long bdt;
  private g baf;
  private int bdA;
  private boolean bdB;
  private v bdC;
  private final List<s> bdu;
  private final l bdv;
  private final SparseIntArray bdw;
  private final v.c bdx;
  private final SparseArray<v> bdy;
  private final SparseBooleanArray bdz;
  private final int mode;

  static
  {
    AppMethodBeat.i(95177);
    aTh = new u.1();
    bdr = com.google.android.exoplayer2.i.v.aT("AC-3");
    bds = com.google.android.exoplayer2.i.v.aT("EAC3");
    bdt = com.google.android.exoplayer2.i.v.aT("HEVC");
    AppMethodBeat.o(95177);
  }

  public u()
  {
    this((byte)0);
  }

  private u(byte paramByte)
  {
    this(1, 0);
  }

  public u(int paramInt1, int paramInt2)
  {
    this(paramInt1, new s(0L), new e(paramInt2));
    AppMethodBeat.i(95170);
    AppMethodBeat.o(95170);
  }

  public u(int paramInt, s params, v.c paramc)
  {
    AppMethodBeat.i(95171);
    this.bdx = ((v.c)a.checkNotNull(paramc));
    this.mode = paramInt;
    if ((paramInt == 1) || (paramInt == 2))
      this.bdu = Collections.singletonList(params);
    while (true)
    {
      this.bdv = new l(9400);
      this.bdz = new SparseBooleanArray();
      this.bdy = new SparseArray();
      this.bdw = new SparseIntArray();
      rw();
      AppMethodBeat.o(95171);
      return;
      this.bdu = new ArrayList();
      this.bdu.add(params);
    }
  }

  private void rw()
  {
    AppMethodBeat.i(95176);
    this.bdz.clear();
    this.bdy.clear();
    SparseArray localSparseArray = this.bdx.rv();
    int i = localSparseArray.size();
    for (int j = 0; j < i; j++)
      this.bdy.put(localSparseArray.keyAt(j), localSparseArray.valueAt(j));
    this.bdy.put(0, new r(new u.a(this)));
    this.bdC = null;
    AppMethodBeat.o(95176);
  }

  public final int a(f paramf, com.google.android.exoplayer2.c.k paramk)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(95175);
    paramk = this.bdv.data;
    int k;
    if (9400 - this.bdv.position < 188)
    {
      k = this.bdv.tB();
      if (k > 0)
        System.arraycopy(paramk, this.bdv.position, paramk, 0, k);
      this.bdv.n(paramk, k);
    }
    int m;
    if (this.bdv.tB() < 188)
    {
      k = this.bdv.limit;
      m = paramf.read(paramk, k, 9400 - k);
      if (m == -1)
      {
        AppMethodBeat.o(95175);
        k = -1;
      }
    }
    int n;
    int i1;
    int i2;
    while (true)
    {
      return k;
      this.bdv.eL(k + m);
      break;
      n = this.bdv.limit;
      for (k = this.bdv.position; (k < n) && (paramk[k] != 71); k++);
      this.bdv.setPosition(k);
      i1 = k + 188;
      if (i1 > n)
      {
        AppMethodBeat.o(95175);
        k = j;
      }
      else
      {
        i2 = this.bdv.readInt();
        if ((0x800000 & i2) == 0)
          break label260;
        this.bdv.setPosition(i1);
        AppMethodBeat.o(95175);
        k = j;
      }
    }
    label260: boolean bool;
    label272: int i3;
    if ((0x400000 & i2) != 0)
    {
      bool = true;
      i3 = (0x1FFF00 & i2) >> 8;
      if ((i2 & 0x20) == 0)
        break label385;
      k = 1;
      label294: if ((i2 & 0x10) == 0)
        break label391;
      m = 1;
    }
    while (true)
      if (this.mode != 2)
      {
        i2 &= 15;
        int i4 = this.bdw.get(i3, i2 - 1);
        this.bdw.put(i3, i2);
        if (i4 == i2)
        {
          if (m == 0)
            break label515;
          this.bdv.setPosition(i1);
          AppMethodBeat.o(95175);
          k = j;
          break;
          bool = false;
          break label272;
          label385: k = 0;
          break label294;
          label391: m = 0;
          continue;
        }
        if (i2 == (i4 + 1 & 0xF));
      }
    while (true)
    {
      if (k != 0)
      {
        k = this.bdv.readUnsignedByte();
        this.bdv.eM(k);
      }
      if (m != 0)
      {
        paramf = (v)this.bdy.get(i3);
        if (paramf != null)
        {
          if (i != 0)
            paramf.rn();
          this.bdv.eL(i1);
          paramf.a(this.bdv, bool);
          this.bdv.eL(n);
        }
      }
      this.bdv.setPosition(i1);
      AppMethodBeat.o(95175);
      k = j;
      break;
      label515: i = 0;
    }
  }

  public final void a(g paramg)
  {
    AppMethodBeat.i(95173);
    this.baf = paramg;
    paramg.a(new l.a(-9223372036854775807L));
    AppMethodBeat.o(95173);
  }

  public final boolean a(f paramf)
  {
    boolean bool = false;
    AppMethodBeat.i(95172);
    byte[] arrayOfByte = this.bdv.data;
    paramf.b(arrayOfByte, 0, 940);
    int i = 0;
    int j;
    if (i < 188)
    {
      j = 0;
      label41: if (j == 5)
      {
        paramf.dG(i);
        bool = true;
        AppMethodBeat.o(95172);
      }
    }
    while (true)
    {
      return bool;
      if (arrayOfByte[(j * 188 + i)] == 71)
      {
        j++;
        break label41;
      }
      i++;
      break;
      AppMethodBeat.o(95172);
    }
  }

  public final void g(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95174);
    int i = this.bdu.size();
    for (int j = 0; j < i; j++)
      ((s)this.bdu.get(j)).brL = -9223372036854775807L;
    this.bdv.reset();
    this.bdw.clear();
    rw();
    AppMethodBeat.o(95174);
  }

  final class b
    implements q
  {
    private final com.google.android.exoplayer2.i.k bdF;
    private final SparseArray<v> bdG;
    private final SparseIntArray bdH;
    private final int pid;

    public b(int arg2)
    {
      AppMethodBeat.i(95168);
      this.bdF = new com.google.android.exoplayer2.i.k(new byte[5]);
      this.bdG = new SparseArray();
      this.bdH = new SparseIntArray();
      int i;
      this.pid = i;
      AppMethodBeat.o(95168);
    }

    public final void a(s params, g paramg, v.d paramd)
    {
    }

    public final void t(l paraml)
    {
      AppMethodBeat.i(95169);
      if (paraml.readUnsignedByte() != 2)
      {
        AppMethodBeat.o(95169);
        return;
      }
      s locals;
      int i;
      int j;
      label228: int k;
      int m;
      int n;
      int i1;
      int i2;
      label313: int i5;
      long l;
      Object localObject3;
      Object localObject4;
      if ((u.c(u.this) == 1) || (u.c(u.this) == 2) || (u.d(u.this) == 1))
      {
        locals = (s)u.e(u.this).get(0);
        paraml.eM(2);
        i = paraml.readUnsignedShort();
        paraml.eM(5);
        paraml.c(this.bdF, 2);
        this.bdF.ee(4);
        paraml.eM(this.bdF.ed(12));
        if ((u.c(u.this) == 2) && (u.f(u.this) == null))
        {
          localObject1 = new v.b(21, null, null, new byte[0]);
          u.a(u.this, u.g(u.this).a(21, (v.b)localObject1));
          u.f(u.this).a(locals, u.h(u.this), new v.d(i, 21, 8192));
        }
        this.bdG.clear();
        this.bdH.clear();
        j = paraml.tB();
        if (j <= 0)
          break label884;
        paraml.c(this.bdF, 5);
        k = this.bdF.ed(8);
        this.bdF.ee(3);
        m = this.bdF.ed(13);
        this.bdF.ee(4);
        n = this.bdF.ed(12);
        i1 = paraml.position;
        i2 = i1 + n;
        i3 = -1;
        localObject1 = null;
        localObject2 = null;
        if (paraml.position >= i2)
          break label691;
        i4 = paraml.readUnsignedByte();
        i5 = paraml.readUnsignedByte() + paraml.position;
        if (i4 != 5)
          break label496;
        l = paraml.cM();
        if (l != u.bdr)
          break label439;
        i3 = 129;
        localObject3 = localObject1;
        localObject4 = localObject2;
      }
      label439: label496: 
      do
      {
        while (true)
        {
          paraml.eM(i5 - paraml.position);
          localObject2 = localObject4;
          localObject1 = localObject3;
          break label313;
          locals = new s(((s)u.e(u.this).get(0)).bbh);
          u.e(u.this).add(locals);
          break;
          if (l == u.rx())
          {
            i3 = 135;
            localObject4 = localObject2;
            localObject3 = localObject1;
          }
          else
          {
            localObject4 = localObject2;
            localObject3 = localObject1;
            if (l == u.ry())
            {
              i3 = 36;
              localObject4 = localObject2;
              localObject3 = localObject1;
              continue;
              if (i4 == 106)
              {
                i3 = 129;
                localObject4 = localObject2;
                localObject3 = localObject1;
              }
              else if (i4 == 122)
              {
                i3 = 135;
                localObject4 = localObject2;
                localObject3 = localObject1;
              }
              else if (i4 == 123)
              {
                i3 = 138;
                localObject4 = localObject2;
                localObject3 = localObject1;
              }
              else
              {
                if (i4 != 10)
                  break label589;
                localObject3 = paraml.readString(3).trim();
                localObject4 = localObject2;
              }
            }
          }
        }
        localObject4 = localObject2;
        localObject3 = localObject1;
      }
      while (i4 != 89);
      label589: int i4 = 89;
      Object localObject2 = new ArrayList();
      while (true)
      {
        localObject4 = localObject2;
        localObject3 = localObject1;
        i3 = i4;
        if (paraml.position >= i5)
          break;
        localObject4 = paraml.readString(3).trim();
        i3 = paraml.readUnsignedByte();
        localObject3 = new byte[4];
        paraml.readBytes((byte[])localObject3, 0, 4);
        ((List)localObject2).add(new v.a((String)localObject4, i3, (byte[])localObject3));
      }
      label691: paraml.setPosition(i2);
      Object localObject1 = new v.b(i3, (String)localObject1, (List)localObject2, Arrays.copyOfRange(paraml.data, i1, i2));
      if (k == 6);
      for (int i3 = ((v.b)localObject1).streamType; ; i3 = k)
      {
        j -= n + 5;
        if (u.c(u.this) == 2)
        {
          k = i3;
          label761: if (u.i(u.this).get(k))
            break label1158;
          if ((u.c(u.this) != 2) || (i3 != 21))
            break label863;
        }
        label863: for (localObject1 = u.f(u.this); ; localObject1 = u.g(u.this).a(i3, (v.b)localObject1))
        {
          if ((u.c(u.this) != 2) || (m < this.bdH.get(k, 8192)))
          {
            this.bdH.put(k, m);
            this.bdG.put(k, localObject1);
          }
          break;
          k = m;
          break label761;
        }
        label884: j = this.bdH.size();
        for (i3 = 0; i3 < j; i3++)
        {
          k = this.bdH.keyAt(i3);
          u.i(u.this).put(k, true);
          paraml = (v)this.bdG.valueAt(i3);
          if (paraml != null)
          {
            if (paraml != u.f(u.this))
              paraml.a(locals, u.h(u.this), new v.d(i, k, 8192));
            u.a(u.this).put(this.bdH.valueAt(i3), paraml);
          }
        }
        if (u.c(u.this) == 2)
        {
          if (u.j(u.this))
            break label1136;
          u.h(u.this).rb();
          u.a(u.this, 0);
          u.k(u.this);
          AppMethodBeat.o(95169);
          break;
        }
        u.a(u.this).remove(this.pid);
        paraml = u.this;
        if (u.c(u.this) == 1);
        for (i3 = 0; ; i3 = u.d(u.this) - 1)
        {
          u.a(paraml, i3);
          if (u.d(u.this) == 0)
          {
            u.h(u.this).rb();
            u.k(u.this);
          }
          label1136: AppMethodBeat.o(95169);
          break;
        }
        label1158: break label228;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.f.u
 * JD-Core Version:    0.6.2
 */