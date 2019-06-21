package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.b;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.ArrayList;
import java.util.List;

public final class ao
  implements au
{
  private Context a;
  private boolean b;
  private Object c;
  private Object d;
  private Object e;
  private List<av> f;
  private long g;
  private Runnable h;
  private Runnable i;
  private Runnable j;

  public ao(Context paramContext)
  {
    AppMethodBeat.i(98487);
    this.b = false;
    this.c = new Object();
    this.d = new Object();
    this.e = new Object();
    this.g = 60000L;
    this.h = new ao.1(this);
    this.i = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(98485);
        ao.a(ao.this);
        AppMethodBeat.o(98485);
      }
    };
    this.j = new ao.3();
    this.a = paramContext;
    this.f = new ArrayList(25);
    AppMethodBeat.o(98487);
  }

  private List<av> b()
  {
    try
    {
      AppMethodBeat.i(98488);
      Object localObject1;
      if ((this.f == null) || (this.f.size() <= 0) || (!d()))
      {
        localObject1 = null;
        AppMethodBeat.o(98488);
      }
      while (true)
      {
        return localObject1;
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        ((List)localObject1).addAll(this.f);
        this.f.clear();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(" get MN:");
        ag.b(((List)localObject1).size(), new Object[0]);
        AppMethodBeat.o(98488);
      }
    }
    finally
    {
    }
  }

  private void c()
  {
    AppMethodBeat.i(98491);
    synchronized (this.e)
    {
      if (!d())
      {
        ag.c(" err su 1R", new Object[0]);
        AppMethodBeat.o(98491);
        return;
      }
      List localList = b();
      if ((localList != null) && (localList.size() > 0))
        e.a(this.a, localList);
      AppMethodBeat.o(98491);
    }
  }

  private boolean d()
  {
    try
    {
      boolean bool = this.b;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final void a()
  {
    boolean bool = false;
    int k = 0;
    AppMethodBeat.i(98490);
    synchronized (this.d)
    {
      if (!d())
      {
        ag.c(" err su 1R", new Object[0]);
        AppMethodBeat.o(98490);
        return;
      }
      Object localObject2 = b();
      if ((localObject2 != null) && (((List)localObject2).size() > 0))
      {
        localObject2 = e.a(this.a, (List)localObject2);
        bf localbf = bf.a(this.a);
        if (localObject2 != null)
        {
          long l1 = ax.d().g().e();
          long l2 = l1;
          if (e.l(this.a))
          {
            ag.e(" onwifi, so half mSZ ".concat(String.valueOf(l1)), new Object[0]);
            l2 = l1 / 2L;
          }
          int m = e.j(this.a);
          ag.b("countCommomRecordNum: ".concat(String.valueOf(m)), new Object[0]);
          if (m >= l2)
            k = 1;
          if ((k != 0) && (localbf.a()) && (localbf.b()))
          {
            this.j.run();
            ag.e(" common max up", new Object[0]);
          }
        }
      }
      do
      {
        AppMethodBeat.o(98490);
        break;
        localObject2 = ax.d().g();
        if (localObject2 != null)
          bool = ((as)localObject2).g();
      }
      while (!bool);
      this.j.run();
      ag.e(" common polling up", new Object[0]);
    }
  }

  public final void a(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(98492);
      if (this.b != paramBoolean)
        if (paramBoolean)
        {
          this.b = paramBoolean;
          this.g = (ax.d().g().d() * 1000);
          b.a().a(102, this.h, this.g, this.g);
          AppMethodBeat.o(98492);
        }
      while (true)
      {
        return;
        b.a().a(102);
        b.a().a(112);
        b(true);
        this.b = paramBoolean;
        AppMethodBeat.o(98492);
      }
    }
    finally
    {
    }
  }

  public final boolean a(av paramav)
  {
    boolean bool = false;
    AppMethodBeat.i(98489);
    Object localObject1 = this.c;
    Object localObject2;
    if (paramav == null)
      localObject2 = "null";
    try
    {
      ag.f(" BF eN:%s   isRT:%b ", new Object[] { localObject2, Boolean.FALSE });
      if ((this.a == null) || (paramav == null) || (!this.b))
        ag.d(" err BF 1R", new Object[0]);
      while (true)
      {
        return bool;
        localObject2 = paramav.d();
        break;
        if (!d())
        {
          ag.d(" CommonProcess processUA return false, isEnable is false !", new Object[0]);
          AppMethodBeat.o(98489);
        }
        else
        {
          localObject2 = ax.d().g();
          int k = ((as)localObject2).c();
          this.g = (((as)localObject2).d() * 1000);
          int m = this.f.size();
          if (m >= k)
          {
            ag.f(" BF mN!", new Object[0]);
            b.a().a(this.h);
            b.a().a(102, this.h, this.g, this.g);
          }
          this.f.add(paramav);
          if (this.f.size() >= k)
            ag.c(" err BF 3R! list size:".concat(String.valueOf(m)), new Object[0]);
          ag.a("CommonprocessUA:true!", new Object[0]);
          AppMethodBeat.o(98489);
          bool = true;
        }
      }
    }
    finally
    {
      AppMethodBeat.o(98489);
    }
    throw paramav;
  }

  public final void b(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(98493);
      ag.e("common process flush memory objects to db.", new Object[0]);
      if (paramBoolean)
      {
        c();
        AppMethodBeat.o(98493);
      }
      while (true)
      {
        return;
        b.a().a(this.i);
        AppMethodBeat.o(98493);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.ao
 * JD-Core Version:    0.6.2
 */