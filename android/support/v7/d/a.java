package android.support.v7.d;

import android.graphics.Color;
import android.support.v4.a.b;
import android.util.TimingLogger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

public final class a
{
  private static final Comparator<a.a> Xt = new a.1();
  final int[] Pn;
  public final List<b.c> Xp;
  final TimingLogger Xq = null;
  final b.b[] Xr;
  private final float[] Xs = new float[3];
  final int[] mHistogram;

  public a(int[] paramArrayOfInt, int paramInt, b.b[] paramArrayOfb)
  {
    this.Xr = paramArrayOfb;
    paramArrayOfb = new int[32768];
    this.mHistogram = paramArrayOfb;
    int k;
    for (int j = 0; j < paramArrayOfInt.length; j++)
    {
      k = paramArrayOfInt[j];
      m = k(Color.red(k), 8, 5);
      n = k(Color.green(k), 8, 5);
      m = k(Color.blue(k), 8, 5) | (m << 10 | n << 5);
      paramArrayOfInt[j] = m;
      paramArrayOfb[m] += 1;
    }
    j = 0;
    for (int m = 0; j < 32768; m = n)
    {
      if (paramArrayOfb[j] > 0)
      {
        b.d(bm(j), this.Xs);
        if (c(this.Xs))
          paramArrayOfb[j] = 0;
      }
      n = m;
      if (paramArrayOfb[j] > 0)
        n = m + 1;
      j++;
    }
    paramArrayOfInt = new int[m];
    this.Pn = paramArrayOfInt;
    int n = 0;
    j = 0;
    if (n < 32768)
    {
      if (paramArrayOfb[n] <= 0)
        break label364;
      k = j + 1;
      paramArrayOfInt[j] = n;
      j = k;
    }
    label364: 
    while (true)
    {
      n++;
      break;
      if (m <= paramInt)
      {
        this.Xp = new ArrayList();
        j = paramArrayOfInt.length;
        for (paramInt = i; paramInt < j; paramInt++)
        {
          m = paramArrayOfInt[paramInt];
          this.Xp.add(new b.c(bm(m), paramArrayOfb[m]));
        }
      }
      paramArrayOfInt = new PriorityQueue(paramInt, Xt);
      paramArrayOfInt.offer(new a.a(this, 0, this.Pn.length - 1));
      a(paramArrayOfInt, paramInt);
      this.Xp = b(paramArrayOfInt);
      return;
    }
  }

  private static void a(PriorityQueue<a.a> paramPriorityQueue, int paramInt)
  {
    while (paramPriorityQueue.size() < paramInt)
    {
      a.a locala1 = (a.a)paramPriorityQueue.poll();
      if ((locala1 == null) || (!locala1.fL()))
        break;
      if (!locala1.fL())
        throw new IllegalStateException("Can not split a box with only 1 color");
      int i = locala1.fO();
      a.a locala2 = new a.a(locala1.XD, i + 1, locala1.Xv);
      locala1.Xv = i;
      locala1.fN();
      paramPriorityQueue.offer(locala2);
      paramPriorityQueue.offer(locala1);
    }
  }

  static void a(int[] paramArrayOfInt, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = paramInt2;
    switch (paramInt1)
    {
    case -3:
    default:
    case -2:
    case -1:
    }
    while (true)
    {
      return;
      while (i <= paramInt3)
      {
        paramInt1 = paramArrayOfInt[i];
        paramArrayOfInt[i] = (paramInt1 & 0x1F | ((paramInt1 >> 5 & 0x1F) << 10 | (paramInt1 >> 10 & 0x1F) << 5));
        i++;
      }
      while (paramInt2 <= paramInt3)
      {
        paramInt1 = paramArrayOfInt[paramInt2];
        paramArrayOfInt[paramInt2] = (paramInt1 >> 10 & 0x1F | ((paramInt1 & 0x1F) << 10 | (paramInt1 >> 5 & 0x1F) << 5));
        paramInt2++;
      }
    }
  }

  private List<b.c> b(Collection<a.a> paramCollection)
  {
    ArrayList localArrayList = new ArrayList(paramCollection.size());
    paramCollection = paramCollection.iterator();
    while (paramCollection.hasNext())
    {
      b.c localc = ((a.a)paramCollection.next()).fP();
      if (!c(localc.fR()))
        localArrayList.add(localc);
    }
    return localArrayList;
  }

  private static int bm(int paramInt)
  {
    return j(paramInt >> 10 & 0x1F, paramInt >> 5 & 0x1F, paramInt & 0x1F);
  }

  static int bn(int paramInt)
  {
    return paramInt >> 10 & 0x1F;
  }

  static int bo(int paramInt)
  {
    return paramInt >> 5 & 0x1F;
  }

  static int bp(int paramInt)
  {
    return paramInt & 0x1F;
  }

  private boolean c(float[] paramArrayOfFloat)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    int i;
    if (this.Xr != null)
    {
      bool2 = bool1;
      if (this.Xr.length > 0)
        i = this.Xr.length;
    }
    for (int j = 0; ; j++)
    {
      bool2 = bool1;
      if (j < i)
      {
        if (!this.Xr[j].d(paramArrayOfFloat))
          bool2 = true;
      }
      else
        return bool2;
    }
  }

  static int j(int paramInt1, int paramInt2, int paramInt3)
  {
    return Color.rgb(k(paramInt1, 5, 8), k(paramInt2, 5, 8), k(paramInt3, 5, 8));
  }

  private static int k(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 > paramInt2)
      paramInt1 <<= paramInt3 - paramInt2;
    while (true)
    {
      return paramInt1 & (1 << paramInt3) - 1;
      paramInt1 >>= paramInt2 - paramInt3;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     android.support.v7.d.a
 * JD-Core Version:    0.6.2
 */