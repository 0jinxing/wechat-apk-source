package com.google.android.exoplayer2.c.d;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.c.e;
import com.google.android.exoplayer2.c.f;
import com.google.android.exoplayer2.c.h;
import com.google.android.exoplayer2.c.k;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.o;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public final class g
  implements e, com.google.android.exoplayer2.c.l
{
  public static final h aTh;
  private static final int aZh;
  private long aOz;
  private com.google.android.exoplayer2.c.g aTn;
  private int aTo;
  private final com.google.android.exoplayer2.i.l aTx;
  private final com.google.android.exoplayer2.i.l aTy;
  private int aUF;
  private int aUG;
  private final com.google.android.exoplayer2.i.l aYg;
  private final Stack<a.a> aYi;
  private int aYk;
  private long aYl;
  private int aYm;
  private com.google.android.exoplayer2.i.l aYn;
  private g.a[] aZi;
  private boolean aZj;
  private final int flags;

  static
  {
    AppMethodBeat.i(95005);
    aTh = new g.1();
    aZh = v.aT("qt  ");
    AppMethodBeat.o(95005);
  }

  public g()
  {
    this(0);
  }

  public g(int paramInt)
  {
    AppMethodBeat.i(94998);
    this.flags = paramInt;
    this.aYg = new com.google.android.exoplayer2.i.l(16);
    this.aYi = new Stack();
    this.aTx = new com.google.android.exoplayer2.i.l(com.google.android.exoplayer2.i.j.bqY);
    this.aTy = new com.google.android.exoplayer2.i.l(4);
    AppMethodBeat.o(94998);
  }

  private void P(long paramLong)
  {
    AppMethodBeat.i(95003);
    while ((!this.aYi.isEmpty()) && (((a.a)this.aYi.peek()).aXw == paramLong))
    {
      a.a locala = (a.a)this.aYi.pop();
      if (locala.type == a.aWi)
      {
        f(locala);
        this.aYi.clear();
        this.aTo = 2;
      }
      else if (!this.aYi.isEmpty())
      {
        ((a.a)this.aYi.peek()).a(locala);
      }
    }
    if (this.aTo != 2)
      ri();
    AppMethodBeat.o(95003);
  }

  private void f(a.a parama)
  {
    AppMethodBeat.i(95004);
    ArrayList localArrayList = new ArrayList();
    com.google.android.exoplayer2.c.i locali = new com.google.android.exoplayer2.c.i();
    Object localObject1 = parama.dW(a.aXh);
    Metadata localMetadata;
    if (localObject1 != null)
    {
      localMetadata = b.a((a.b)localObject1, this.aZj);
      if (localMetadata != null)
        locali.c(localMetadata);
    }
    while (true)
    {
      int i = 0;
      long l1 = -9223372036854775807L;
      if (i < parama.aXy.size())
      {
        localObject1 = (a.a)parama.aXy.get(i);
        long l2 = l1;
        Object localObject2;
        if (((a.a)localObject1).type == a.aWk)
        {
          localObject2 = parama.dW(a.aWj);
          if ((this.flags & 0x1) == 0)
            break label346;
        }
        label346: for (boolean bool = true; ; bool = false)
        {
          j localj = b.a((a.a)localObject1, (a.b)localObject2, -9223372036854775807L, null, bool, this.aZj);
          l2 = l1;
          if (localj != null)
          {
            localObject1 = b.a(localj, ((a.a)localObject1).dX(a.aWl).dX(a.aWm).dX(a.aWn), locali);
            l2 = l1;
            if (((m)localObject1).sampleCount != 0)
            {
              g.a locala = new g.a(localj, (m)localObject1, this.aTn.dM(i));
              int j = ((m)localObject1).aXU;
              Format localFormat = localj.aOv.dw(j + 30);
              localObject2 = localFormat;
              if (localj.type == 1)
              {
                localObject1 = localFormat;
                if (locali.rc())
                  localObject1 = localFormat.aY(locali.aOp, locali.aOq);
                localObject2 = localObject1;
                if (localMetadata != null)
                  localObject2 = ((Format)localObject1).a(localMetadata);
              }
              locala.aVw.f((Format)localObject2);
              l2 = Math.max(l1, localj.aOz);
              localArrayList.add(locala);
            }
          }
          i++;
          l1 = l2;
          break;
        }
      }
      this.aOz = l1;
      this.aZi = ((g.a[])localArrayList.toArray(new g.a[localArrayList.size()]));
      this.aTn.rb();
      this.aTn.a(this);
      AppMethodBeat.o(95004);
      return;
      localMetadata = null;
    }
  }

  private void ri()
  {
    this.aTo = 0;
    this.aYm = 0;
  }

  public final long M(long paramLong)
  {
    AppMethodBeat.i(95002);
    long l1 = 9223372036854775807L;
    g.a[] arrayOfa = this.aZi;
    int i = arrayOfa.length;
    int j = 0;
    if (j < i)
    {
      m localm = arrayOfa[j].aZk;
      int k = localm.Q(paramLong);
      int m = k;
      if (k == -1)
        m = localm.R(paramLong);
      long l2 = localm.offsets[m];
      if (l2 >= l1)
        break label101;
      l1 = l2;
    }
    label101: 
    while (true)
    {
      j++;
      break;
      AppMethodBeat.o(95002);
      return l1;
    }
  }

  public final int a(f paramf, k paramk)
  {
    AppMethodBeat.i(95001);
    do
      switch (this.aTo)
      {
      default:
        paramf = new IllegalStateException();
        AppMethodBeat.o(95001);
        throw paramf;
      case 0:
        if (this.aYm != 0)
          break label131;
        if (paramf.a(this.aYg.data, 0, 8, true))
          break label95;
        i = 0;
      case 1:
      case 2:
      }
    while (i != 0);
    int i = -1;
    AppMethodBeat.o(95001);
    label93: return i;
    label95: this.aYm = 8;
    this.aYg.setPosition(0);
    this.aYl = this.aYg.cM();
    this.aYk = this.aYg.readInt();
    label131: if (this.aYl == 1L)
    {
      paramf.readFully(this.aYg.data, 8, 8);
      this.aYm += 8;
      this.aYl = this.aYg.tK();
    }
    while (this.aYl < this.aYm)
    {
      paramf = new o("Atom size less than header length (unsupported).");
      AppMethodBeat.o(95001);
      throw paramf;
      if (this.aYl == 0L)
      {
        l1 = paramf.getLength();
        l2 = l1;
        if (l1 == -1L)
        {
          l2 = l1;
          if (!this.aYi.isEmpty())
            l2 = ((a.a)this.aYi.peek()).aXw;
        }
        if (l2 != -1L)
          this.aYl = (l2 - paramf.getPosition() + this.aYm);
      }
    }
    i = this.aYk;
    if ((i == a.aWi) || (i == a.aWk) || (i == a.aWl) || (i == a.aWm) || (i == a.aWn) || (i == a.aWw))
    {
      i = 1;
      label350: if (i == 0)
        break label430;
      l2 = paramf.getPosition() + this.aYl - this.aYm;
      this.aYi.add(new a.a(this.aYk, l2));
      if (this.aYl != this.aYm)
        break label423;
      P(l2);
    }
    label423: label430: boolean bool;
    while (true)
    {
      i = 1;
      break;
      i = 0;
      break label350;
      ri();
      continue;
      i = this.aYk;
      if ((i == a.aWy) || (i == a.aWj) || (i == a.aWz) || (i == a.aWA) || (i == a.aWT) || (i == a.aWU) || (i == a.aWV) || (i == a.aWx) || (i == a.aWW) || (i == a.aWX) || (i == a.aWY) || (i == a.aWZ) || (i == a.aXa) || (i == a.aWv) || (i == a.aVH) || (i == a.aXh))
      {
        i = 1;
        label549: if (i == 0)
          break label651;
        if (this.aYm != 8)
          break label639;
        bool = true;
        label565: com.google.android.exoplayer2.i.a.checkState(bool);
        if (this.aYl > 2147483647L)
          break label645;
      }
      label645: for (bool = true; ; bool = false)
      {
        com.google.android.exoplayer2.i.a.checkState(bool);
        this.aYn = new com.google.android.exoplayer2.i.l((int)this.aYl);
        System.arraycopy(this.aYg.data, 0, this.aYn.data, 0, 8);
        this.aTo = 1;
        break;
        i = 0;
        break label549;
        label639: bool = false;
        break label565;
      }
      label651: this.aYn = null;
      this.aTo = 1;
    }
    long l2 = this.aYl - this.aYm;
    long l1 = paramf.getPosition();
    Object localObject;
    if (this.aYn != null)
    {
      paramf.readFully(this.aYn.data, this.aYm, (int)l2);
      if (this.aYk == a.aVH)
      {
        localObject = this.aYn;
        ((com.google.android.exoplayer2.i.l)localObject).setPosition(8);
        if (((com.google.android.exoplayer2.i.l)localObject).readInt() == aZh)
        {
          bool = true;
          label748: this.aZj = bool;
          i = 0;
        }
      }
    }
    while (true)
    {
      label756: P(l1 + l2);
      if ((i != 0) && (this.aTo != 2));
      for (i = 1; i != 0; i = 0)
      {
        i = 1;
        AppMethodBeat.o(95001);
        break label93;
        ((com.google.android.exoplayer2.i.l)localObject).eM(4);
        while (true)
          if (((com.google.android.exoplayer2.i.l)localObject).tB() > 0)
            if (((com.google.android.exoplayer2.i.l)localObject).readInt() == aZh)
            {
              bool = true;
              break;
            }
        bool = false;
        break label748;
        if (this.aYi.isEmpty())
          break label1486;
        ((a.a)this.aYi.peek()).a(new a.b(this.aYk, this.aYn));
        i = 0;
        break label756;
        if (l2 < 262144L)
        {
          paramf.dG((int)l2);
          i = 0;
          break label756;
        }
        paramk.position = (paramf.getPosition() + l2);
        i = 1;
        break label756;
      }
      int j = -1;
      l2 = 9223372036854775807L;
      i = 0;
      int k;
      while (i < this.aZi.length)
      {
        localObject = this.aZi[i];
        k = ((g.a)localObject).aXR;
        m = j;
        l1 = l2;
        if (k != ((g.a)localObject).aZk.sampleCount)
        {
          long l3 = localObject.aZk.offsets[k];
          m = j;
          l1 = l2;
          if (l3 < l2)
          {
            l1 = l3;
            m = i;
          }
        }
        i++;
        j = m;
        l2 = l1;
      }
      if (j == -1)
      {
        i = -1;
        AppMethodBeat.o(95001);
        break label93;
      }
      localObject = this.aZi[j];
      com.google.android.exoplayer2.c.m localm = ((g.a)localObject).aVw;
      j = ((g.a)localObject).aXR;
      l1 = localObject.aZk.offsets[j];
      int m = localObject.aZk.aSB[j];
      i = m;
      l2 = l1;
      if (((g.a)localObject).aYy.aZo == 1)
      {
        l2 = l1 + 8L;
        i = m - 8;
      }
      l1 = l2 - paramf.getPosition() + this.aUG;
      if ((l1 < 0L) || (l1 >= 262144L))
      {
        paramk.position = l2;
        i = 1;
        AppMethodBeat.o(95001);
        break label93;
      }
      paramf.dG((int)l1);
      if (((g.a)localObject).aYy.aTz != 0)
      {
        paramk = this.aTy.data;
        paramk[0] = ((byte)0);
        paramk[1] = ((byte)0);
        paramk[2] = ((byte)0);
        m = ((g.a)localObject).aYy.aTz;
        k = 4 - ((g.a)localObject).aYy.aTz;
        while (this.aUG < i)
          if (this.aUF == 0)
          {
            paramf.readFully(this.aTy.data, k, m);
            this.aTy.setPosition(0);
            this.aUF = this.aTy.tI();
            this.aTx.setPosition(0);
            localm.a(this.aTx, 4);
            this.aUG += 4;
            i += k;
          }
          else
          {
            int n = localm.a(paramf, this.aUF, false);
            this.aUG += n;
            this.aUF -= n;
          }
      }
      while (true)
      {
        localm.a(localObject.aZk.aZO[j], localObject.aZk.aXW[j], i, 0, null);
        ((g.a)localObject).aXR += 1;
        this.aUG = 0;
        this.aUF = 0;
        i = 0;
        AppMethodBeat.o(95001);
        break;
        while (this.aUG < i)
        {
          m = localm.a(paramf, i - this.aUG, false);
          this.aUG += m;
          this.aUF -= m;
        }
      }
      label1486: i = 0;
    }
  }

  public final void a(com.google.android.exoplayer2.c.g paramg)
  {
    this.aTn = paramg;
  }

  public final boolean a(f paramf)
  {
    AppMethodBeat.i(94999);
    boolean bool = i.h(paramf);
    AppMethodBeat.o(94999);
    return bool;
  }

  public final void g(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(95000);
    this.aYi.clear();
    this.aYm = 0;
    this.aUG = 0;
    this.aUF = 0;
    if (paramLong1 == 0L)
    {
      ri();
      AppMethodBeat.o(95000);
    }
    while (true)
    {
      return;
      if (this.aZi != null)
        for (g.a locala : this.aZi)
        {
          m localm = locala.aZk;
          int k = localm.Q(paramLong2);
          int m = k;
          if (k == -1)
            m = localm.R(paramLong2);
          locala.aXR = m;
        }
      AppMethodBeat.o(95000);
    }
  }

  public final long getDurationUs()
  {
    return this.aOz;
  }

  public final boolean qX()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.c.d.g
 * JD-Core Version:    0.6.2
 */