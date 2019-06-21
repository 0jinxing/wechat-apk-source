package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class bd
{
  private Context a = null;

  public bd(Context paramContext)
  {
    this.a = paramContext;
  }

  public final void a(int paramInt, byte[] paramArrayOfByte, boolean paramBoolean)
  {
    AppMethodBeat.i(98547);
    if (paramInt != 101)
    {
      ag.c("com strategy unmatch key: %d", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(98547);
    }
    v localv;
    while (true)
    {
      return;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
        break label969;
      localv = t.a(this.a).e();
      if (localv != null)
        break;
      ag.c("imposible! common strategy null!", new Object[0]);
      AppMethodBeat.o(98547);
    }
    label1194: label1201: label1208: 
    while (true)
    {
      Object localObject1;
      Object localObject2;
      int i;
      int j;
      int k;
      int m;
      Object localObject3;
      af localaf;
      try
      {
        localObject1 = new com/tencent/tencentmap/mapsdk/maps/a/ae;
        ((ae)localObject1).<init>();
        localObject2 = new com/tencent/tencentmap/mapsdk/maps/a/ai;
        ((ai)localObject2).<init>(paramArrayOfByte);
        ((ae)localObject1).a((ai)localObject2);
        if (localv == null)
        {
          i = 0;
          if (i != 0)
          {
            if (paramBoolean)
            {
              ag.e("update common strategy should save ", new Object[0]);
              localObject2 = this.a;
              if (paramArrayOfByte != null)
              {
                localObject1 = new com/tencent/tencentmap/mapsdk/maps/a/y;
                ((y)localObject1).<init>();
                ((y)localObject1).a(paramInt);
                ((y)localObject1).a(paramArrayOfByte);
                e.a((Context)localObject2, (y)localObject1);
              }
            }
            ag.e("com strategy changed notify! ", new Object[0]);
            paramArrayOfByte = t.a(this.a);
            paramArrayOfByte.a(localv);
            if (paramBoolean)
              paramArrayOfByte.b();
          }
          AppMethodBeat.o(98547);
          break;
        }
        j = 0;
        if (!((ae)localObject1).c.equals(localv.b()))
        {
          ag.b("strategy url changed to: %s", new Object[] { ((ae)localObject1).c });
          j = 1;
          localv.a(((ae)localObject1).c);
        }
        if (((ae)localObject1).b != localv.c())
        {
          ag.b("QueryPeriod changed to: %d", new Object[] { Integer.valueOf(((ae)localObject1).b) });
          j = 1;
          localv.a(((ae)localObject1).b);
        }
        ArrayList localArrayList = ((ae)localObject1).a;
        if (localv == null)
        {
          i = 0;
          if (i == 0)
            break label1201;
          k = 1;
          localObject1 = ((ae)localObject1).d;
          if (localv != null)
            break label1112;
          i = 0;
          if (i == 0)
            break label1194;
          i = 1;
          continue;
        }
        i = 0;
        if (localArrayList == null)
          break label1021;
        SparseArray localSparseArray = localv.e();
        if (localSparseArray == null)
          continue;
        m = 0;
        i = 0;
        k = i;
        if (m >= localSparseArray.size())
          break label1208;
        localObject2 = (v.a)localSparseArray.valueAt(m);
        localObject3 = localArrayList.iterator();
        if (!((Iterator)localObject3).hasNext())
          break label1015;
        localaf = (af)((Iterator)localObject3).next();
        k = i;
        if (localaf.a == ((v.a)localObject2).e())
        {
          ag.a("server module strategy mid: %d", new Object[] { Byte.valueOf(localaf.a) });
          if (localaf.b != 1)
            continue;
          bool = true;
          if (((v.a)localObject2).a() != bool)
          {
            ag.b("mid: %d , isUsable changed: %b ", new Object[] { Byte.valueOf(localaf.a), Boolean.valueOf(bool) });
            i = 1;
            ((v.a)localObject2).a(bool);
          }
          k = i;
          if (!((v.a)localObject2).b().equals(localaf.c))
          {
            ag.b("mid: %d , url changed: %s", new Object[] { Byte.valueOf(localaf.a), localaf.c });
            k = 1;
            ((v.a)localObject2).a(localaf.c);
          }
          if (localaf.a != 1)
          {
            i = k;
            if (localaf.a != 2);
          }
          else
          {
            if ((((v.a)localObject2).c() == null) || (localaf.d == null))
              continue;
            i = k;
            if (!((v.a)localObject2).c().equals(localaf.d))
            {
              ag.b("mid: %d , detail changed...", new Object[] { Byte.valueOf(localaf.a) });
              i = 1;
              ((v.a)localObject2).a(localaf.d);
              t.a(this.a).a(localaf.a, localaf.d);
            }
          }
          k = i;
          if (localaf.a == 1)
          {
            if ((((v.a)localObject2).d() == null) || (localaf.e == null))
              break label977;
            if (!((v.a)localObject2).d().equals(localaf.e))
            {
              ag.b("mid: %d , PreventEventCode changed...", new Object[] { Byte.valueOf(localaf.a) });
              i = 1;
              ((v.a)localObject2).a(e.a(localaf.e));
            }
            if ((((v.a)localObject2).f() == null) || (localaf.f == null))
              break label996;
            k = i;
            if (!((v.a)localObject2).f().equals(localaf.f))
            {
              ag.b("mid: %d , SampleEventSet changed...", new Object[] { Byte.valueOf(localaf.a) });
              k = 1;
              ((v.a)localObject2).b(e.a(localaf.f));
            }
          }
        }
        i = k;
        continue;
        boolean bool = false;
        continue;
        i = k;
        if (localaf.d == null)
          continue;
        i = k;
        if (((v.a)localObject2).c() != null)
          continue;
        ag.b("mid: %d , detail changed...", new Object[] { Byte.valueOf(localaf.a) });
        i = 1;
        ((v.a)localObject2).a(localaf.d);
        t.a(this.a).a(localaf.a, localaf.d);
        continue;
      }
      catch (Throwable paramArrayOfByte)
      {
        ag.a(paramArrayOfByte);
        ag.d("error to common strategy!", new Object[0]);
      }
      label969: AppMethodBeat.o(98547);
      break;
      label977: if (((v.a)localObject2).d() == null)
        label1112: if (localaf.e != null)
        {
          continue;
          label996: if (((v.a)localObject2).f() == null)
            if (localaf.f != null)
            {
              continue;
              label1015: m++;
              continue;
              label1021: localObject3 = localv.e();
              if (localObject3 != null)
              {
                int n = ((SparseArray)localObject3).size();
                m = 0;
                i = 0;
                while (true)
                {
                  k = i;
                  if (m >= n)
                    break;
                  localObject2 = (v.a)((SparseArray)localObject3).valueAt(m);
                  if (((v.a)localObject2).a())
                  {
                    ag.b("mid: %d , server not response strategy, sdk local close it!", new Object[] { Integer.valueOf(((v.a)localObject2).e()) });
                    i = 1;
                    ((v.a)localObject2).a(false);
                  }
                  m++;
                }
                j = 0;
                if ((localObject1 != null) && (localv.d() != null))
                {
                  i = j;
                  if (!((Map)localObject1).equals(localv.d()))
                  {
                    localv.a((Map)localObject1);
                    i = 1;
                  }
                }
                else
                {
                  i = j;
                  if (localObject1 != null)
                  {
                    i = j;
                    if (localv.d() == null)
                    {
                      localv.a((Map)localObject1);
                      i = 1;
                      continue;
                      i = k;
                      continue;
                      k = j;
                      continue;
                      i = k;
                    }
                  }
                }
              }
            }
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.bd
 * JD-Core Version:    0.6.2
 */