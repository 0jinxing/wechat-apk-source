package android.support.v7.widget;

import android.support.v4.os.f;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

final class af
  implements Runnable
{
  static final ThreadLocal<af> aiU = new ThreadLocal();
  static Comparator<af.b> aiZ = new af.1();
  ArrayList<RecyclerView> aiV = new ArrayList();
  long aiW;
  long aiX;
  private ArrayList<af.b> aiY = new ArrayList();

  private static RecyclerView.v a(RecyclerView paramRecyclerView, int paramInt, long paramLong)
  {
    int i = paramRecyclerView.anf.hU();
    int j = 0;
    RecyclerView.v localv;
    if (j < i)
    {
      localv = RecyclerView.bn(paramRecyclerView.anf.bI(j));
      if ((localv.mPosition == paramInt) && (!localv.kq()))
      {
        j = 1;
        label53: if (j == 0)
          break label74;
        paramRecyclerView = null;
      }
    }
    while (true)
    {
      return paramRecyclerView;
      j++;
      break;
      j = 0;
      break label53;
      label74: RecyclerView.o localo = paramRecyclerView.anc;
      try
      {
        paramRecyclerView.jw();
        localv = localo.e(paramInt, paramLong);
        if (localv != null)
        {
          if ((!localv.isBound()) || (localv.kq()))
            break label135;
          localo.bI(localv.apJ);
        }
        while (true)
        {
          paramRecyclerView.al(false);
          paramRecyclerView = localv;
          break;
          label135: localo.a(localv, false);
        }
      }
      finally
      {
        paramRecyclerView.al(false);
      }
    }
  }

  final void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    if ((paramRecyclerView.isAttachedToWindow()) && (this.aiW == 0L))
    {
      this.aiW = paramRecyclerView.getNanoTime();
      paramRecyclerView.post(this);
    }
    paramRecyclerView = paramRecyclerView.anX;
    paramRecyclerView.aja = paramInt1;
    paramRecyclerView.ajb = paramInt2;
  }

  public final void run()
  {
    label732: label735: label738: 
    while (true)
    {
      try
      {
        f.beginSection("RV Prefetch");
        boolean bool = this.aiV.isEmpty();
        if (bool)
          return;
        int i = this.aiV.size();
        long l1 = 0L;
        int j = 0;
        Object localObject1;
        if (j < i)
        {
          localObject1 = (RecyclerView)this.aiV.get(j);
          if (((RecyclerView)localObject1).getWindowVisibility() != 0)
            break label738;
          l1 = Math.max(((RecyclerView)localObject1).getDrawingTime(), l1);
          j++;
          continue;
        }
        if (l1 == 0L)
        {
          this.aiW = 0L;
          f.endSection();
          continue;
        }
        long l2 = TimeUnit.MILLISECONDS.toNanos(l1) + this.aiX;
        int k = this.aiV.size();
        j = 0;
        i = 0;
        if (i < k)
        {
          localObject1 = (RecyclerView)this.aiV.get(i);
          if (((RecyclerView)localObject1).getWindowVisibility() != 0)
            break label735;
          ((RecyclerView)localObject1).anX.a((RecyclerView)localObject1, false);
          j = ((RecyclerView)localObject1).anX.mCount + j;
          i++;
          continue;
        }
        this.aiY.ensureCapacity(j);
        j = 0;
        i = 0;
        RecyclerView localRecyclerView;
        Object localObject4;
        if (i < k)
        {
          localRecyclerView = (RecyclerView)this.aiV.get(i);
          if (localRecyclerView.getWindowVisibility() != 0)
            break label732;
          localObject4 = localRecyclerView.anX;
          int m = Math.abs(((af.a)localObject4).aja) + Math.abs(((af.a)localObject4).ajb);
          int n = 0;
          if (n < ((af.a)localObject4).mCount * 2)
          {
            if (j >= this.aiY.size())
            {
              localObject1 = new android/support/v7/widget/af$b;
              ((af.b)localObject1).<init>();
              this.aiY.add(localObject1);
              int i1 = localObject4.ajc[(n + 1)];
              if (i1 > m)
                continue;
              bool = true;
              ((af.b)localObject1).ajd = bool;
              ((af.b)localObject1).aje = m;
              ((af.b)localObject1).ajf = i1;
              ((af.b)localObject1).ajg = localRecyclerView;
              ((af.b)localObject1).position = localObject4.ajc[n];
              j++;
              n += 2;
              continue;
            }
            localObject1 = (af.b)this.aiY.get(j);
            continue;
            bool = false;
            continue;
          }
          i++;
          continue;
        }
        Collections.sort(this.aiY, aiZ);
        j = 0;
        if (j < this.aiY.size())
        {
          localObject1 = (af.b)this.aiY.get(j);
          if (((af.b)localObject1).ajg != null)
          {
            if (((af.b)localObject1).ajd)
            {
              l1 = 9223372036854775807L;
              localObject4 = a(((af.b)localObject1).ajg, ((af.b)localObject1).position, l1);
              if ((localObject4 == null) || (((RecyclerView.v)localObject4).apK == null) || (!((RecyclerView.v)localObject4).isBound()) || (((RecyclerView.v)localObject4).kq()))
                continue;
              localRecyclerView = (RecyclerView)((RecyclerView.v)localObject4).apK.get();
              if (localRecyclerView == null)
                continue;
              if ((localRecyclerView.anA) && (localRecyclerView.anf.hU() != 0))
                localRecyclerView.jj();
              localObject4 = localRecyclerView.anX;
              ((af.a)localObject4).a(localRecyclerView, true);
              i = ((af.a)localObject4).mCount;
              if (i == 0)
                continue;
            }
            try
            {
              f.beginSection("RV Nested Prefetch");
              RecyclerView.s locals = localRecyclerView.anY;
              RecyclerView.a locala = localRecyclerView.Yq;
              locals.aps = 1;
              locals.apt = locala.getItemCount();
              locals.apv = false;
              locals.apw = false;
              locals.apx = false;
              i = 0;
              if (i < ((af.a)localObject4).mCount * 2)
              {
                a(localRecyclerView, localObject4.ajc[i], l2);
                i += 2;
                continue;
                l1 = l2;
                continue;
              }
              f.endSection();
              ((af.b)localObject1).ajd = false;
              ((af.b)localObject1).aje = 0;
              ((af.b)localObject1).ajf = 0;
              ((af.b)localObject1).ajg = null;
              ((af.b)localObject1).position = 0;
              j++;
              continue;
            }
            finally
            {
              f.endSection();
            }
          }
        }
      }
      finally
      {
        this.aiW = 0L;
        f.endSection();
      }
      this.aiW = 0L;
      f.endSection();
      continue;
      continue;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.af
 * JD-Core Version:    0.6.2
 */