package com.google.android.exoplayer2.h;

import android.os.Handler;
import com.google.android.exoplayer2.i.a;
import com.google.android.exoplayer2.i.b;
import com.google.android.exoplayer2.i.p;
import com.google.android.exoplayer2.i.p.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collections;

public final class k
  implements d, u<Object>
{
  private final d.a bpY;
  private final p bpZ;
  private final b bqa;
  private int bqb;
  private long bqc;
  private long bqd;
  private long bqe;
  private long bqf;
  private long bqg;
  private final Handler eventHandler;

  public k()
  {
    this(null, null);
  }

  public k(Handler paramHandler, d.a parama)
  {
    this(paramHandler, parama, (byte)0);
  }

  private k(Handler paramHandler, d.a parama, byte paramByte)
  {
    this(paramHandler, parama, b.bqX);
  }

  private k(Handler paramHandler, d.a parama, b paramb)
  {
    AppMethodBeat.i(95813);
    this.eventHandler = paramHandler;
    this.bpY = parama;
    this.bpZ = new p();
    this.bqa = paramb;
    this.bqg = -1L;
    AppMethodBeat.o(95813);
  }

  public final void eK(int paramInt)
  {
    try
    {
      this.bqd += paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final long tl()
  {
    try
    {
      long l = this.bqg;
      return l;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void tq()
  {
    try
    {
      AppMethodBeat.i(95814);
      if (this.bqb == 0)
        this.bqc = this.bqa.elapsedRealtime();
      this.bqb += 1;
      AppMethodBeat.o(95814);
      return;
    }
    finally
    {
    }
  }

  public final void tr()
  {
    long l1;
    int i;
    float f;
    Object localObject1;
    int j;
    int k;
    label356: Object localObject4;
    while (true)
    {
      try
      {
        AppMethodBeat.i(95815);
        if (this.bqb > 0)
        {
          bool = true;
          a.checkState(bool);
          l1 = this.bqa.elapsedRealtime();
          i = (int)(l1 - this.bqc);
          this.bqe += i;
          this.bqf += this.bqd;
          if (i <= 0)
            break label541;
          f = (float)(this.bqd * 8000L / i);
          localObject1 = this.bpZ;
          j = (int)Math.sqrt(this.bqd);
          if (((p)localObject1).brE != 1)
          {
            Collections.sort(((p)localObject1).brC, p.brz);
            ((p)localObject1).brE = 1;
          }
          if (((p)localObject1).brH <= 0)
            break label356;
          Object localObject2 = ((p)localObject1).brD;
          k = ((p)localObject1).brH - 1;
          ((p)localObject1).brH = k;
          localObject2 = localObject2[k];
          k = ((p)localObject1).brF;
          ((p)localObject1).brF = (k + 1);
          ((p.a)localObject2).index = k;
          ((p.a)localObject2).weight = j;
          ((p.a)localObject2).value = f;
          ((p)localObject1).brC.add(localObject2);
          ((p)localObject1).brG += j;
          if (((p)localObject1).brG <= ((p)localObject1).brB)
            break;
          j = ((p)localObject1).brG - ((p)localObject1).brB;
          localObject2 = (p.a)((p)localObject1).brC.get(0);
          if (((p.a)localObject2).weight > j)
            break label369;
          ((p)localObject1).brG -= ((p.a)localObject2).weight;
          ((p)localObject1).brC.remove(0);
          if (((p)localObject1).brH >= 5)
            continue;
          p.a[] arrayOfa = ((p)localObject1).brD;
          j = ((p)localObject1).brH;
          ((p)localObject1).brH = (j + 1);
          arrayOfa[j] = localObject2;
          continue;
        }
      }
      finally
      {
      }
      boolean bool = false;
      continue;
      localObject4 = new p.a((byte)0);
      continue;
      label369: ((p.a)localObject4).weight -= j;
      ((p)localObject1).brG -= j;
    }
    if ((this.bqe >= 2000L) || (this.bqf >= 524288L))
    {
      localObject1 = this.bpZ;
      if (((p)localObject1).brE != 0)
      {
        Collections.sort(((p)localObject1).brC, p.brA);
        ((p)localObject1).brE = 0;
      }
      f = ((p)localObject1).brG;
      j = 0;
      k = 0;
      if (j >= ((p)localObject1).brC.size())
        break label641;
      localObject4 = (p.a)((p)localObject1).brC.get(j);
      k = ((p.a)localObject4).weight + k;
      if (k < 0.5F * f)
        break label635;
      f = ((p.a)localObject4).value;
      label522: if (!Float.isNaN(f))
        break label688;
    }
    label541: label688: for (long l2 = -1L; ; l2 = ()f)
    {
      this.bqg = l2;
      l2 = this.bqd;
      long l3 = this.bqg;
      if ((this.eventHandler != null) && (this.bpY != null))
      {
        localObject1 = this.eventHandler;
        localObject4 = new com/google/android/exoplayer2/h/k$1;
        ((k.1)localObject4).<init>(this, i, l2, l3);
        ((Handler)localObject1).post((Runnable)localObject4);
      }
      j = this.bqb - 1;
      this.bqb = j;
      if (j > 0)
        this.bqc = l1;
      this.bqd = 0L;
      AppMethodBeat.o(95815);
      return;
      label635: j++;
      break;
      if (((p)localObject1).brC.isEmpty())
      {
        f = (0.0F / 0.0F);
        break label522;
      }
      f = ((p.a)((p)localObject1).brC.get(((p)localObject1).brC.size() - 1)).value;
      break label522;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.h.k
 * JD-Core Version:    0.6.2
 */