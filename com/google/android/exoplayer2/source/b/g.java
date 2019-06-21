package com.google.android.exoplayer2.source.b;

import android.os.Handler;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.h.b;
import com.google.android.exoplayer2.h.s;
import com.google.android.exoplayer2.i.v;
import com.google.android.exoplayer2.source.b.a.e.a;
import com.google.android.exoplayer2.source.b.a.e.b;
import com.google.android.exoplayer2.source.h;
import com.google.android.exoplayer2.source.h.a;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements e.b, j.a, h
{
  private p aNe;
  private final int bgC;
  private final b bgF;
  private h.a bgq;
  private final k bip;
  final com.google.android.exoplayer2.source.b.a.e bir;
  private final d bjb;
  private final com.google.android.exoplayer2.source.a.a bjc;
  private final IdentityHashMap<l, Integer> bjd;
  final Handler bje;
  private int bjf;
  j[] bjg;
  private j[] bjh;
  private com.google.android.exoplayer2.source.e bji;

  public g(com.google.android.exoplayer2.source.b.a.e parame, d paramd, int paramInt, com.google.android.exoplayer2.source.a.a parama, b paramb)
  {
    AppMethodBeat.i(125910);
    this.bir = parame;
    this.bjb = paramd;
    this.bgC = paramInt;
    this.bjc = parama;
    this.bgF = paramb;
    this.bjd = new IdentityHashMap();
    this.bip = new k();
    this.bje = new Handler();
    this.bjg = new j[0];
    this.bjh = new j[0];
    AppMethodBeat.o(125910);
  }

  private j a(int paramInt, com.google.android.exoplayer2.source.b.a.a.a[] paramArrayOfa, Format paramFormat, List<Format> paramList, long paramLong)
  {
    AppMethodBeat.i(125923);
    paramArrayOfa = new j(paramInt, this, new c(this.bir, paramArrayOfa, this.bjb, this.bip, paramList), this.bgF, paramLong, paramFormat, this.bgC, this.bjc);
    AppMethodBeat.o(125923);
    return paramArrayOfa;
  }

  private static boolean a(com.google.android.exoplayer2.source.b.a.a.a parama, String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(125925);
    parama = parama.aOv.aOa;
    if (TextUtils.isEmpty(parama))
      AppMethodBeat.o(125925);
    while (true)
    {
      return bool;
      parama = parama.split("(\\s*,\\s*)|(\\s*$)");
      int i = parama.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label75;
        if (parama[j].startsWith(paramString))
        {
          bool = true;
          AppMethodBeat.o(125925);
          break;
        }
      }
      label75: AppMethodBeat.o(125925);
    }
  }

  private void sy()
  {
    AppMethodBeat.i(125924);
    if (this.aNe != null)
    {
      this.bgq.a(this);
      AppMethodBeat.o(125924);
    }
    while (true)
    {
      return;
      j[] arrayOfj = this.bjg;
      int i = arrayOfj.length;
      for (int j = 0; j < i; j++)
        arrayOfj[j].sz();
      AppMethodBeat.o(125924);
    }
  }

  public final void W(long paramLong)
  {
    AppMethodBeat.i(125914);
    for (j localj : this.bjh)
    {
      int k = localj.bgO.length;
      for (int m = 0; m < k; m++)
        localj.bgO[m].i(paramLong, localj.bjw[m]);
    }
    AppMethodBeat.o(125914);
  }

  public final long X(long paramLong)
  {
    AppMethodBeat.i(125918);
    if (this.bjh.length > 0)
    {
      boolean bool = this.bjh[0].j(paramLong, false);
      for (int i = 1; i < this.bjh.length; i++)
        this.bjh[i].j(paramLong, bool);
      if (bool)
        this.bip.bjA.clear();
    }
    AppMethodBeat.o(125918);
    return paramLong;
  }

  public final boolean Y(long paramLong)
  {
    AppMethodBeat.i(125915);
    boolean bool = this.bji.Y(paramLong);
    AppMethodBeat.o(125915);
    return bool;
  }

  public final long a(com.google.android.exoplayer2.g.f[] paramArrayOff, boolean[] paramArrayOfBoolean1, l[] paramArrayOfl, boolean[] paramArrayOfBoolean2, long paramLong)
  {
    AppMethodBeat.i(125913);
    int[] arrayOfInt1 = new int[paramArrayOff.length];
    int[] arrayOfInt2 = new int[paramArrayOff.length];
    int i = 0;
    int j;
    label37: Object localObject1;
    if (i < paramArrayOff.length)
    {
      if (paramArrayOfl[i] == null)
      {
        j = -1;
        arrayOfInt1[i] = j;
        arrayOfInt2[i] = -1;
        if (paramArrayOff[i] != null)
          localObject1 = paramArrayOff[i].tf();
      }
      for (j = 0; ; j++)
        if (j < this.bjg.length)
        {
          if (this.bjg[j].aNe.a((o)localObject1) != -1)
            arrayOfInt2[i] = j;
        }
        else
        {
          i++;
          break;
          j = ((Integer)this.bjd.get(paramArrayOfl[i])).intValue();
          break label37;
        }
    }
    boolean bool1 = false;
    this.bjd.clear();
    l[] arrayOfl1 = new l[paramArrayOff.length];
    l[] arrayOfl2 = new l[paramArrayOff.length];
    com.google.android.exoplayer2.g.f[] arrayOff = new com.google.android.exoplayer2.g.f[paramArrayOff.length];
    int k = 0;
    j[] arrayOfj = new j[this.bjg.length];
    int m = 0;
    label224: j localj;
    label266: label377: label380: com.google.android.exoplayer2.g.f localf;
    label397: Object localObject2;
    int n;
    if (m < this.bjg.length)
    {
      i = 0;
      if (i < paramArrayOff.length)
      {
        if (arrayOfInt1[i] == m)
        {
          localObject1 = paramArrayOfl[i];
          arrayOfl2[i] = localObject1;
          if (arrayOfInt2[i] != m)
            break label266;
        }
        for (localObject1 = paramArrayOff[i]; ; localObject1 = null)
        {
          arrayOff[i] = localObject1;
          i++;
          break;
          localObject1 = null;
          break label224;
        }
      }
      localj = this.bjg[m];
      com.google.android.exoplayer2.i.a.checkState(localj.prepared);
      j = localj.bgT;
      for (i = 0; i < arrayOff.length; i++)
        if ((arrayOfl2[i] != null) && ((arrayOff[i] == null) || (paramArrayOfBoolean1[i] == 0)))
        {
          localj.r(((i)arrayOfl2[i]).bjl, false);
          arrayOfl2[i] = null;
        }
      if (!bool1)
      {
        if (localj.bgR)
          if (j != 0)
            break label573;
      }
      else
      {
        i = 1;
        localf = localj.bjo.biB;
        j = 0;
        localObject1 = localf;
        if (j >= arrayOff.length)
          break label585;
        localObject2 = localObject1;
        if (arrayOfl2[j] != null)
          break label1140;
        localObject2 = localObject1;
        if (arrayOff[j] == null)
          break label1140;
        localObject2 = arrayOff[j];
        n = localj.aNe.a(((com.google.android.exoplayer2.g.f)localObject2).tf());
        localj.r(n, true);
        if (n == localj.bju)
        {
          localj.bjo.biB = ((com.google.android.exoplayer2.g.f)localObject2);
          localObject1 = localObject2;
        }
        arrayOfl2[j] = new i(localj, n);
        paramArrayOfBoolean2[j] = true;
        localObject2 = localObject1;
        if (i != 0)
          break label1140;
        localObject2 = localj.bgO[n];
        ((com.google.android.exoplayer2.source.k)localObject2).rewind();
        if ((((com.google.android.exoplayer2.source.k)localObject2).g(paramLong, true)) || (((com.google.android.exoplayer2.source.k)localObject2).bhG.sj() == 0))
          break label579;
        i = 1;
      }
    }
    while (true)
    {
      j++;
      break label397;
      if (paramLong != localj.bgZ)
        break label377;
      label573: i = 0;
      break label380;
      label579: i = 0;
      continue;
      label585: boolean bool2;
      label675: label715: int i1;
      if (localj.bgT == 0)
      {
        localj.bjo.biw = null;
        localj.bjs = null;
        localj.bjr.clear();
        if (localj.bgI.isLoading())
        {
          localObject1 = localj.bgO;
          n = localObject1.length;
          for (j = 0; j < n; j++)
            localObject1[j].sq();
          localj.bgI.cancelLoading();
        }
        for (j = i; ; j = i)
        {
          localj.bgR = true;
          n = 0;
          i = 0;
          while (true)
          {
            if (i >= paramArrayOff.length)
              break label978;
            if (arrayOfInt2[i] != m)
              break label935;
            if (arrayOfl2[i] == null)
              break;
            bool2 = true;
            com.google.android.exoplayer2.i.a.checkState(bool2);
            arrayOfl1[i] = arrayOfl2[i];
            i1 = 1;
            this.bjd.put(arrayOfl2[i], Integer.valueOf(m));
            label751: i++;
            n = i1;
          }
          localj.sA();
        }
      }
      if ((!localj.bjr.isEmpty()) && (!v.j(localObject1, localf)))
        if (!localj.bgR)
        {
          ((com.google.android.exoplayer2.g.f)localObject1).ag(0L);
          j = localj.bjo.bis.j(((f)localj.bjr.getLast()).bic);
          if (((com.google.android.exoplayer2.g.f)localObject1).th() == j)
            break label1134;
          j = 1;
        }
      while (true)
      {
        label852: if (j != 0)
        {
          bool2 = true;
          i = 1;
          localj.bjy = true;
        }
        while (true)
        {
          j = i;
          if (i == 0)
            break label675;
          localj.j(paramLong, bool2);
          for (n = 0; ; n++)
          {
            j = i;
            if (n >= arrayOfl2.length)
              break;
            if (arrayOfl2[n] != null)
              paramArrayOfBoolean2[n] = true;
          }
          j = 1;
          break label852;
          bool2 = false;
          break label715;
          label935: i1 = n;
          if (arrayOfInt1[i] != m)
            break label751;
          if (arrayOfl2[i] == null);
          for (bool2 = true; ; bool2 = false)
          {
            com.google.android.exoplayer2.i.a.checkState(bool2);
            i1 = n;
            break;
          }
          label978: i = k;
          bool2 = bool1;
          if (n != 0)
          {
            arrayOfj[k] = localj;
            i = k + 1;
            if (k != 0)
              break label1066;
            localj.aJ(true);
            if ((j == 0) && (this.bjh.length != 0) && (localj == this.bjh[0]))
              break label1072;
            this.bip.bjA.clear();
          }
          label1066: label1072: for (bool2 = true; ; bool2 = bool1)
          {
            m++;
            k = i;
            bool1 = bool2;
            break;
            localj.aJ(false);
          }
          System.arraycopy(arrayOfl1, 0, paramArrayOfl, 0, arrayOfl1.length);
          this.bjh = ((j[])Arrays.copyOf(arrayOfj, k));
          this.bji = new com.google.android.exoplayer2.source.e(this.bjh);
          AppMethodBeat.o(125913);
          return paramLong;
          bool2 = bool1;
        }
        label1134: j = 0;
      }
      label1140: localObject1 = localObject2;
    }
  }

  public final void a(com.google.android.exoplayer2.source.b.a.a.a parama)
  {
    AppMethodBeat.i(125920);
    ((e.a)this.bir.bkC.get(parama)).sD();
    AppMethodBeat.o(125920);
  }

  public final void a(h.a parama, long paramLong)
  {
    AppMethodBeat.i(125911);
    this.bgq = parama;
    this.bir.bkF.add(this);
    Object localObject1 = this.bir.biH;
    parama = new ArrayList(((com.google.android.exoplayer2.source.b.a.a)localObject1).bjF);
    Object localObject2 = new ArrayList();
    Object localObject3 = new ArrayList();
    int i = 0;
    Object localObject4;
    if (i < parama.size())
    {
      localObject4 = (com.google.android.exoplayer2.source.b.a.a.a)parama.get(i);
      if ((((com.google.android.exoplayer2.source.b.a.a.a)localObject4).aOv.height > 0) || (a((com.google.android.exoplayer2.source.b.a.a.a)localObject4, "avc")))
        ((ArrayList)localObject2).add(localObject4);
      while (true)
      {
        i++;
        break;
        if (a((com.google.android.exoplayer2.source.b.a.a.a)localObject4, "mp4a"))
          ((ArrayList)localObject3).add(localObject4);
      }
    }
    if (!((ArrayList)localObject2).isEmpty())
    {
      parama = (h.a)localObject2;
      localObject4 = ((com.google.android.exoplayer2.source.b.a.a)localObject1).bjG;
      localObject2 = ((com.google.android.exoplayer2.source.b.a.a)localObject1).bjH;
      this.bjg = new j[((List)localObject4).size() + 1 + ((List)localObject2).size()];
      this.bjf = this.bjg.length;
      if (parama.isEmpty())
        break label381;
    }
    label381: for (boolean bool = true; ; bool = false)
    {
      com.google.android.exoplayer2.i.a.checkArgument(bool);
      localObject3 = new com.google.android.exoplayer2.source.b.a.a.a[parama.size()];
      parama.toArray((Object[])localObject3);
      parama = a(0, (com.google.android.exoplayer2.source.b.a.a.a[])localObject3, ((com.google.android.exoplayer2.source.b.a.a)localObject1).bjp, ((com.google.android.exoplayer2.source.b.a.a)localObject1).bit, paramLong);
      this.bjg[0] = parama;
      parama.aJ(true);
      parama.sz();
      i = 1;
      for (j = 0; j < ((List)localObject4).size(); j++)
      {
        parama = (com.google.android.exoplayer2.source.b.a.a.a)((List)localObject4).get(j);
        localObject1 = Collections.emptyList();
        parama = a(1, new com.google.android.exoplayer2.source.b.a.a.a[] { parama }, null, (List)localObject1, paramLong);
        this.bjg[i] = parama;
        parama.sz();
        i++;
      }
      if (((ArrayList)localObject3).size() < parama.size())
        parama.removeAll((Collection)localObject3);
      break;
    }
    for (int j = 0; j < ((List)localObject2).size(); j++)
    {
      parama = (com.google.android.exoplayer2.source.b.a.a.a)((List)localObject2).get(j);
      localObject1 = Collections.emptyList();
      localObject1 = a(3, new com.google.android.exoplayer2.source.b.a.a.a[] { parama }, null, (List)localObject1, paramLong);
      parama = parama.aOv;
      ((j)localObject1).es(0).f(parama);
      ((j)localObject1).bgQ = true;
      ((j)localObject1).sB();
      this.bjg[i] = localObject1;
      i++;
    }
    this.bjh = this.bjg;
    AppMethodBeat.o(125911);
  }

  public final void b(com.google.android.exoplayer2.source.b.a.a.a parama)
  {
    AppMethodBeat.i(125922);
    j[] arrayOfj = this.bjg;
    int i = arrayOfj.length;
    for (int j = 0; j < i; j++)
    {
      c localc = arrayOfj[j].bjo;
      int k = localc.bis.j(parama.aOv);
      if (k != -1)
      {
        k = localc.biB.indexOf(k);
        if (k != -1)
          localc.biB.eI(k);
      }
    }
    sy();
    AppMethodBeat.o(125922);
  }

  public final void pL()
  {
    AppMethodBeat.i(125919);
    int i = this.bjf - 1;
    this.bjf = i;
    if (i > 0)
      AppMethodBeat.o(125919);
    while (true)
    {
      return;
      Object localObject = this.bjg;
      int j = localObject.length;
      i = 0;
      int k = 0;
      while (i < j)
      {
        k += localObject[i].aNe.length;
        i++;
      }
      localObject = new o[k];
      j[] arrayOfj = this.bjg;
      int m = arrayOfj.length;
      k = 0;
      for (i = 0; i < m; i++)
      {
        j localj = arrayOfj[i];
        int n = localj.aNe.length;
        j = 0;
        while (j < n)
        {
          localObject[k] = localj.aNe.bia[j];
          j++;
          k++;
        }
      }
      this.aNe = new p((o[])localObject);
      this.bgq.a(this);
      AppMethodBeat.o(125919);
    }
  }

  public final void rR()
  {
    AppMethodBeat.i(125912);
    j[] arrayOfj = this.bjg;
    int i = arrayOfj.length;
    for (int j = 0; j < i; j++)
      arrayOfj[j].bjo.rW();
    AppMethodBeat.o(125912);
  }

  public final p rS()
  {
    return this.aNe;
  }

  public final long rT()
  {
    return -9223372036854775807L;
  }

  public final long rU()
  {
    AppMethodBeat.i(125917);
    long l = this.bji.rU();
    AppMethodBeat.o(125917);
    return l;
  }

  public final long rV()
  {
    AppMethodBeat.i(125916);
    long l = this.bji.rV();
    AppMethodBeat.o(125916);
    return l;
  }

  public final void sx()
  {
    AppMethodBeat.i(125921);
    sy();
    AppMethodBeat.o(125921);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.source.b.g
 * JD-Core Version:    0.6.2
 */