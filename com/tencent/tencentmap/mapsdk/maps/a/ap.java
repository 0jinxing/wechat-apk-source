package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class ap extends az
{
  private Context e = null;
  private Long[] f = null;
  private List<Long> g = null;
  private byte[] h = null;
  private boolean i = false;

  public ap(Context paramContext)
  {
    super(paramContext, 1, 4);
    this.e = paramContext;
  }

  private z a(List<av> paramList)
  {
    AppMethodBeat.i(98496);
    if ((paramList == null) || (paramList.size() <= 0))
    {
      AppMethodBeat.o(98496);
      paramList = null;
      return paramList;
    }
    Object localObject1 = new ArrayList();
    int j = paramList.size();
    this.g = new ArrayList();
    int k = 0;
    while (true)
      if (k < j)
        try
        {
          av localav = (av)paramList.get(k);
          Map localMap = localav.e();
          Object localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>(" bean.getTP: ");
          ag.a(localav.b(), new Object[0]);
          if ((localMap != null) && ("UA".equals(localav.b())))
          {
            ag.f(" Pack2Upload eventName:}%s ", new Object[] { localav.d() });
            localObject2 = e.a(localav);
            if (localObject2 == null)
              break label174;
            ((ArrayList)localObject1).add(localObject2);
          }
          while (true)
          {
            k++;
            break;
            label174: this.g.add(Long.valueOf(localav.a()));
          }
        }
        catch (Throwable paramList)
        {
          ag.a(paramList);
          ag.d(" CommonRecordUploadDatas.encode2MixPackage() error1", new Object[0]);
        }
    while (true)
    {
      try
      {
        if (((ArrayList)localObject1).size() <= 0)
          break label390;
        paramList = new com/tencent/tencentmap/mapsdk/maps/a/ad;
        paramList.<init>();
        paramList.a = ((ArrayList)localObject1);
        if (paramList == null)
        {
          AppMethodBeat.o(98496);
          paramList = null;
          break;
          if (this.g.size() > 0)
            e.a(this.e, (Long[])this.g.toArray(new Long[this.g.size()]));
          paramList = new java/lang/StringBuilder;
          paramList.<init>(" up erList:");
          ag.b(((ArrayList)localObject1).size(), new Object[0]);
          continue;
        }
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        ((Map)localObject1).put(Integer.valueOf(1), paramList.a());
        paramList = new com/tencent/tencentmap/mapsdk/maps/a/z;
        paramList.<init>();
        paramList.a = ((Map)localObject1);
        AppMethodBeat.o(98496);
      }
      catch (Exception paramList)
      {
        ag.a(paramList);
        ag.d(" CommonRecordUploadDatas.encode2MixPackage() error2", new Object[0]);
        b();
        AppMethodBeat.o(98496);
        paramList = null;
      }
      break;
      label390: paramList = null;
    }
  }

  private boolean f()
  {
    try
    {
      boolean bool = this.i;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final aa a()
  {
    Object localObject1 = null;
    int j = 0;
    Object localObject7;
    try
    {
      AppMethodBeat.i(98495);
      Object localObject2 = ax.d();
      if ((localObject2 == null) || (!((ax)localObject2).e()))
      {
        ag.c(" imposiable! ua not ready!", new Object[0]);
        AppMethodBeat.o(98495);
      }
      for (localObject2 = localObject1; ; localObject2 = localObject1)
      {
        return localObject2;
        localObject7 = ((ax)localObject2).g();
        if (localObject7 != null)
          break;
        ag.c(" imposiable! ua S not ready!", new Object[0]);
        AppMethodBeat.o(98495);
      }
    }
    finally
    {
    }
    while (true)
    {
      try
      {
        while (true)
        {
          if (!f())
            break label486;
          Object localObject8 = p.a(this.e);
          if ((localObject8 == null) || (((List)localObject8).size() <= 0))
            break label486;
          Object localObject4 = (byte[])((List)localObject8).get(3);
          this.d = String.valueOf(((List)localObject8).get(1));
          ((Integer)((List)localObject8).get(4)).intValue();
          if (localObject4 != null)
          {
            localObject4 = a(this.a, (byte[])localObject4);
            AppMethodBeat.o(98495);
            break;
          }
          int k = ((as)localObject7).e();
          int m = k;
          if (!e.l(this.e))
            m = k / 2;
          if (m < 0)
            break label480;
          localObject7 = e.a(this.e, m);
          if ((localObject7 == null) || (((List)localObject7).size() <= 0))
          {
            ag.h(" no up datas", new Object[0]);
            AppMethodBeat.o(98495);
            localObject4 = localObject1;
            break;
          }
          m = ((List)localObject7).size();
          ag.h(" size:%d", new Object[] { Integer.valueOf(m) });
          Object localObject9;
          try
          {
            localObject8 = a((List)localObject7);
            this.f = new Long[m];
            for (m = j; m < this.f.length; m++)
              this.f[m] = Long.valueOf(((av)((List)localObject7).get(m)).a());
          }
          catch (Exception localException2)
          {
            while (true)
            {
              b();
              localObject9 = null;
            }
            ((List)localObject7).clear();
            if (localObject9 == null)
              break label477;
          }
          localObject4 = localObject9.a();
          this.h = new byte[localObject4.length];
          System.arraycopy(localObject4, 0, this.h, 0, localObject4.length);
          this.d = e.b(this.c, 4);
          ag.a("comm rid:%s", new Object[] { this.d });
          try
          {
            localObject4 = a(this.a, (byte[])localObject4);
            AppMethodBeat.o(98495);
          }
          catch (Exception localException1)
          {
            while (true)
            {
              b();
              Object localObject5 = null;
            }
          }
        }
      }
      catch (Throwable localThrowable)
      {
        ag.a(localThrowable);
        ag.d(" get req datas error: %s", new Object[] { localThrowable.toString() });
        AppMethodBeat.o(98495);
        localObject6 = localObject1;
      }
      break;
      label477: continue;
      label480: localObject7 = null;
      continue;
      label486: Object localObject6 = null;
    }
  }

  public final void a(boolean paramBoolean)
  {
    try
    {
      this.i = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void b()
  {
    try
    {
      AppMethodBeat.i(98497);
      ag.c(" encode failed, clear db data", new Object[0]);
      if ((this.f != null) && (this.f.length > 0))
      {
        ag.b(" remove num :".concat(String.valueOf(e.a(this.e, this.f))), new Object[0]);
        this.f = null;
      }
      AppMethodBeat.o(98497);
      return;
    }
    finally
    {
    }
  }

  public final void b(boolean paramBoolean)
  {
    int j = 0;
    try
    {
      AppMethodBeat.i(98498);
      if (this.f != null)
        j = this.f.length;
      if (j > 0)
        ag.b(" t_event remove num :".concat(String.valueOf(e.a(this.e, this.f))), new Object[0]);
      this.f = null;
      if ((paramBoolean) && (f()))
        p.a(this.e, this.d);
      while (true)
      {
        this.h = null;
        AppMethodBeat.o(98498);
        return;
        if ((!paramBoolean) && (this.h != null))
        {
          ag.a("comm rid2:%s", new Object[] { this.d });
          p.a(this.e, this.h, this.d, j);
        }
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ap
 * JD-Core Version:    0.6.2
 */