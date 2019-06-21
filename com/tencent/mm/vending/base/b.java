package com.tencent.mm.vending.base;

import android.os.Handler;
import com.tencent.mm.vending.f.a;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b<_Struct, _Change> extends Vending<_Struct, Integer, _Change>
{
  public int a = 5;
  public int c = 0;
  private b.a zXn = new b.a((byte)0);

  private void a(int paramInt1, int paramInt2)
  {
    int i;
    if (paramInt1 >= paramInt2)
      i = 1;
    int j;
    int k;
    while (true)
    {
      j = Math.min(paramInt1, paramInt2);
      paramInt1 = Math.max(paramInt1, paramInt2);
      synchronized (this.zXn)
      {
        Object localObject2 = this.zXn;
        if (!((b.a)localObject2).c)
        {
          ((b.a)localObject2).b(j, paramInt1);
          ((b.a)localObject2).c = true;
          localObject2 = new int[] { j, paramInt1 };
        }
        while (true)
          if (localObject2 == null)
          {
            return;
            i = 0;
            break;
            paramInt2 = ((b.a)localObject2).a;
            k = ((b.a)localObject2).b;
            if ((paramInt2 > paramInt1) || (k < j))
            {
              if ((paramInt2 > paramInt1 + 1) || (k < j - 1))
                ((b.a)localObject2).b(j, paramInt1);
              localObject2 = new int[] { j, paramInt1 };
            }
            else if (j < paramInt2)
            {
              if (paramInt1 > k)
              {
                ((b.a)localObject2).b(j, paramInt1);
                localObject2 = new int[] { j, paramInt2 - 1, k + 1, paramInt1 };
              }
              else
              {
                ((b.a)localObject2).b(j, k);
                localObject2 = new int[] { j, paramInt2 - 1 };
              }
            }
            else if (paramInt1 > k)
            {
              ((b.a)localObject2).b(paramInt2, paramInt1);
              localObject2 = new int[] { k + 1, paramInt1 };
            }
            else
            {
              localObject2 = null;
            }
          }
      }
    }
    if (i != 0)
      paramInt1 = localObject3.length - 2;
    while (true)
    {
      while (true)
      {
        label293: int m;
        label319: label335: Vending.c localc;
        Integer localInteger;
        if (i != 0)
        {
          if (paramInt1 < 0)
            break;
          m = localObject3[paramInt1];
          k = localObject3[(paramInt1 + 1)];
          int n = Math.abs(m - k);
          paramInt2 = 0;
          if (paramInt2 > n)
            break label478;
          if (i == 0)
            break label421;
          j = k - paramInt2;
          localc = a();
          localInteger = Integer.valueOf(j);
          if (localc.zXq.get());
        }
        synchronized (localc.b)
        {
          Vending.c.b localb = (Vending.c.b)localc.a.get(localInteger);
          if ((localb != null) && (localb != Vending.c.b.zXs))
          {
            paramInt2++;
            break label319;
            paramInt1 = 0;
            continue;
            if (paramInt1 >= localObject3.length)
              break;
            break label293;
            label421: j = m + paramInt2;
            break label335;
          }
          localc.a.put(localInteger, Vending.c.b.zXt);
          localc.e.sendMessage(localc.e.obtainMessage(0, localInteger));
        }
      }
      label478: if (i != 0)
        paramInt1 -= 2;
      else
        paramInt1 += 2;
    }
  }

  protected abstract _Struct Ep(int paramInt);

  protected abstract int dMa();

  public final <T> T get(int paramInt)
  {
    if (this.c == 0)
      a.e("Vending.ForwardVending", "mCount is 0, why call get()?", new Object[0]);
    for (Object localObject = null; ; localObject = super.get(Integer.valueOf(paramInt)))
      return localObject;
  }

  protected void loaderClear()
  {
    synchronized (this.zXn)
    {
      b.a locala2 = this.zXn;
      locala2.a = -1;
      locala2.b = -1;
      locala2.c = false;
      return;
    }
  }

  protected void synchronizing(int paramInt, Object paramObject)
  {
    this.c = dMa();
    a.i("Vending.ForwardVending", "the count %s", new Object[] { Integer.valueOf(this.c) });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vending.base.b
 * JD-Core Version:    0.6.2
 */