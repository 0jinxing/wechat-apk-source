package com.google.android.exoplayer2.g;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.google.android.exoplayer2.s;
import com.google.android.exoplayer2.source.o;
import com.google.android.exoplayer2.source.p;
import com.google.android.exoplayer2.t;
import java.util.Arrays;
import java.util.Map;

public abstract class e extends h
{
  private int aOF = 0;
  private final SparseArray<Map<p, e.b>> bpu = new SparseArray();
  private final SparseBooleanArray bpv = new SparseBooleanArray();
  private e.a bpw;

  public final i a(s[] paramArrayOfs, p paramp)
  {
    Object localObject1 = new int[paramArrayOfs.length + 1];
    Object localObject2 = new o[paramArrayOfs.length + 1][];
    int[][][] arrayOfInt = new int[paramArrayOfs.length + 1][][];
    for (int i = 0; i < localObject2.length; i++)
    {
      localObject2[i] = new o[paramp.length];
      arrayOfInt[i] = new int[paramp.length][];
    }
    Object localObject3 = new int[paramArrayOfs.length];
    for (i = 0; i < localObject3.length; i++)
      localObject3[i] = paramArrayOfs[i].pJ();
    int j = 0;
    int k;
    int m;
    Object localObject5;
    int n;
    int i2;
    if (j < paramp.length)
    {
      localObject4 = paramp.bia[j];
      k = paramArrayOfs.length;
      m = 0;
      i = 0;
      while (i < paramArrayOfs.length)
      {
        localObject5 = paramArrayOfs[i];
        n = 0;
        i1 = k;
        for (k = m; n < ((o)localObject4).length; k = m)
        {
          i2 = ((s)localObject5).b(localObject4.bhv[n]) & 0x7;
          m = k;
          if (i2 > k)
          {
            k = i;
            if (i2 == 4)
              break label241;
            m = i2;
            i1 = i;
          }
          n++;
        }
        i++;
        m = k;
        k = i1;
      }
      label241: if (k == paramArrayOfs.length)
        localObject5 = new int[((o)localObject4).length];
      while (true)
      {
        i = localObject1[k];
        localObject2[k][i] = localObject4;
        arrayOfInt[k][i] = localObject5;
        localObject1[k] += 1;
        j++;
        break;
        localObject6 = paramArrayOfs[k];
        localObject5 = new int[((o)localObject4).length];
        for (i = 0; i < ((o)localObject4).length; i++)
          localObject5[i] = ((s)localObject6).b(localObject4.bhv[i]);
      }
    }
    Object localObject4 = new p[paramArrayOfs.length];
    Object localObject6 = new int[paramArrayOfs.length];
    for (i = 0; i < paramArrayOfs.length; i++)
    {
      k = localObject1[i];
      localObject4[i] = new p((o[])Arrays.copyOf(localObject2[i], k));
      arrayOfInt[i] = ((int[][])Arrays.copyOf(arrayOfInt[i], k));
      localObject6[i] = paramArrayOfs[i].getTrackType();
    }
    i = localObject1[paramArrayOfs.length];
    localObject1 = new p((o[])Arrays.copyOf(localObject2[paramArrayOfs.length], i));
    localObject2 = a(paramArrayOfs, (p[])localObject4, arrayOfInt);
    i = 0;
    Object localObject7;
    if (i < paramArrayOfs.length)
    {
      if (this.bpv.get(i))
        localObject5 = null;
      while (true)
      {
        localObject2[i] = localObject5;
        e.b localb;
        label609: 
        while (true)
        {
          i++;
          break;
          localObject5 = localObject4[i];
          localObject7 = (Map)this.bpu.get(i);
          if ((localObject7 != null) && (((Map)localObject7).containsKey(localObject5)));
          for (k = 1; ; k = 0)
          {
            if (k == 0)
              break label609;
            localb = (e.b)((Map)this.bpu.get(i)).get(localObject5);
            if (localb != null)
              break label611;
            localObject5 = null;
            break;
          }
        }
        label611: localObject7 = localb.bpC;
        k = localb.bpD;
        localObject5 = ((f.a)localObject7).a(localObject5.bia[k], localb.bpe);
      }
    }
    localObject6 = new e.a((int[])localObject6, (p[])localObject4, (int[])localObject3, arrayOfInt, (p)localObject1);
    localObject3 = new t[paramArrayOfs.length];
    i = 0;
    if (i < paramArrayOfs.length)
    {
      if (localObject2[i] != null);
      for (localObject5 = t.aOE; ; localObject5 = null)
      {
        localObject3[i] = localObject5;
        i++;
        break;
      }
    }
    int i1 = this.aOF;
    if (i1 != 0)
    {
      n = -1;
      i = -1;
      k = 0;
      if (k >= paramArrayOfs.length)
        break label994;
      m = paramArrayOfs[k].getTrackType();
      localObject7 = localObject2[k];
      if (((m != 1) && (m != 2)) || (localObject7 == null))
        break label991;
      localObject1 = arrayOfInt[k];
      localObject5 = localObject4[k];
      if (localObject7 != null)
        break label887;
      j = 0;
      label800: if (j == 0)
        break label991;
      if (m != 1)
        break label966;
      if (n == -1)
        break label956;
      k = 0;
    }
    while (true)
    {
      label820: if ((n != -1) && (i != -1))
      {
        j = 1;
        label835: if ((j & k) != 0)
        {
          paramArrayOfs = new t(i1);
          localObject3[n] = paramArrayOfs;
          localObject3[i] = paramArrayOfs;
        }
        return new i(paramp, new g((f[])localObject2), localObject6, (t[])localObject3);
        label887: i2 = ((p)localObject5).a(((f)localObject7).tf());
        for (j = 0; ; j++)
        {
          if (j >= ((f)localObject7).length())
            break label950;
          if ((localObject1[i2][localObject7.eH(j)] & 0x20) != 32)
          {
            j = 0;
            break;
          }
        }
        label950: j = 1;
        break label800;
        label956: n = k;
      }
      label966: label991: 
      while (true)
      {
        k++;
        break;
        if (i != -1)
        {
          k = 0;
          break label820;
        }
        i = k;
        continue;
        j = 0;
        break label835;
      }
      label994: k = 1;
    }
  }

  protected abstract f[] a(s[] paramArrayOfs, p[] paramArrayOfp, int[][][] paramArrayOfInt);

  public final void ae(Object paramObject)
  {
    this.bpw = ((e.a)paramObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.g.e
 * JD-Core Version:    0.6.2
 */