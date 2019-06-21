package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.b;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class aw
  implements au
{
  private boolean a;
  private List<av> b;
  private Context c;
  private Runnable d;
  private Runnable e;

  public aw(Context paramContext)
  {
    AppMethodBeat.i(98517);
    this.a = false;
    this.d = new aw.1(this);
    this.e = new aw.2(this);
    this.c = paramContext;
    this.b = Collections.synchronizedList(new ArrayList(25));
    AppMethodBeat.o(98517);
  }

  private List<av> b()
  {
    try
    {
      AppMethodBeat.i(98519);
      Object localObject1;
      if ((this.b == null) || (this.b.size() <= 0) || (!c()))
      {
        localObject1 = null;
        AppMethodBeat.o(98519);
      }
      while (true)
      {
        return localObject1;
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        ((List)localObject1).addAll(this.b);
        this.b.clear();
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>(" get realEventCnt in Mem:");
        ag.b(((List)localObject1).size(), new Object[0]);
        AppMethodBeat.o(98519);
      }
    }
    finally
    {
    }
  }

  private boolean c()
  {
    try
    {
      boolean bool = this.a;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void d()
  {
    AppMethodBeat.i(98522);
    List localList = b();
    if ((localList != null) && (localList.size() > 0))
    {
      ag.f(" dsb real events 2 db" + localList.size(), new Object[0]);
      e.a(this.c, localList);
    }
    AppMethodBeat.o(98522);
  }

  protected final void a()
  {
    AppMethodBeat.i(98523);
    if (!c())
    {
      ag.c(" err su 1R", new Object[0]);
      AppMethodBeat.o(98523);
    }
    while (true)
    {
      return;
      List localList = b();
      if ((localList != null) && (localList.size() > 0))
      {
        be localbe = ax.d().f();
        if ((!e.m(this.c)) || (localbe == null))
        {
          ag.f(" dsu real events 2 db" + localList.size(), new Object[0]);
          e.a(this.c, localList);
          AppMethodBeat.o(98523);
        }
        else
        {
          ag.f(" dsu real events 2 up " + localList.size(), new Object[0]);
          localbe.a(new aw.a(this.c, localList));
        }
      }
      else
      {
        AppMethodBeat.o(98523);
      }
    }
  }

  public final void a(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(98520);
      if (this.a != paramBoolean)
        if (paramBoolean)
        {
          this.a = paramBoolean;
          long l = ax.d().g().b() * 1000;
          b.a().a(103, this.d, 5000L, l);
          AppMethodBeat.o(98520);
        }
      while (true)
      {
        return;
        b.a().a(103);
        b(true);
        this.a = paramBoolean;
        AppMethodBeat.o(98520);
      }
    }
    finally
    {
    }
  }

  public final boolean a(av paramav)
  {
    boolean bool = false;
    while (true)
    {
      try
      {
        AppMethodBeat.i(98518);
        if (paramav == null)
        {
          localObject = "null";
          ag.f(" BF eN:%s   isRT:%b", new Object[] { localObject, Boolean.TRUE });
          if ((this.c == null) || (paramav == null))
          {
            ag.c("processUA return false, context is null or bean is null !", new Object[0]);
            AppMethodBeat.o(98518);
            return bool;
          }
        }
        else
        {
          localObject = paramav.d();
          continue;
        }
        if (!c())
        {
          ag.c("processUA return false, isEnable is false !", new Object[0]);
          AppMethodBeat.o(98518);
          continue;
        }
      }
      finally
      {
      }
      Object localObject = ax.d().g();
      int i = ((as)localObject).a();
      long l = ((as)localObject).b() * 1000;
      if ((this.b.size() >= i) || (paramav.f()))
      {
        ag.f(" BF mN!", new Object[0]);
        b.a().a(this.d);
        b.a().a(103, this.d, l, l);
      }
      this.b.add(paramav);
      if (this.b.size() >= i)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>(" err BF 3R! num:");
        ag.c(this.b.size(), new Object[0]);
      }
      if ("rqd_applaunched".equals(paramav.d()))
        b.a().a(this.d);
      ag.a("processUA:true!", new Object[0]);
      AppMethodBeat.o(98518);
      bool = true;
    }
  }

  public final void b(boolean paramBoolean)
  {
    try
    {
      AppMethodBeat.i(98521);
      ag.e("realtime process flush memory objects to db.", new Object[0]);
      if (paramBoolean)
      {
        d();
        AppMethodBeat.o(98521);
      }
      while (true)
      {
        return;
        b.a().a(this.e);
        AppMethodBeat.o(98521);
      }
    }
    finally
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.aw
 * JD-Core Version:    0.6.2
 */