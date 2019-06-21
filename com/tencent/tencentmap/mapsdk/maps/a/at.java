package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.tencentmap.mapsdk.a.a;
import com.tencent.tencentmap.mapsdk.a.b;
import com.tencent.tencentmap.mapsdk.a.e;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class at
{
  private av a;
  private Context b;
  private int c;
  private int d;
  private Runnable e;

  public at(Context paramContext)
  {
    AppMethodBeat.i(98507);
    this.c = 20000;
    this.d = 0;
    this.e = new at.1(this);
    this.b = paramContext;
    HashMap localHashMap = new HashMap(2);
    boolean bool = a.g(this.b);
    e.a(paramContext);
    localHashMap.put("A33", e.g(paramContext));
    if (bool)
    {
      localHashMap.put("A66", "F");
      localHashMap.put("A68", a.h(this.b));
      if (!a.b)
        break label174;
    }
    label174: for (paramContext = "Y"; ; paramContext = "N")
    {
      localHashMap.put("A85", paramContext);
      this.a = e.a(this.b, "rqd_heartbeat", true, 0L, 0L, localHashMap, false);
      AppMethodBeat.o(98507);
      return;
      localHashMap.put("A66", "B");
      break;
    }
  }

  private void a(int paramInt)
  {
    try
    {
      this.d = paramInt;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private int c()
  {
    try
    {
      int i = this.d;
      return i;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  protected final void a()
  {
    AppMethodBeat.i(98508);
    if (!e.m(this.b))
      AppMethodBeat.o(98508);
    while (true)
    {
      return;
      be localbe = ax.d().f();
      if (localbe != null)
      {
        ArrayList localArrayList = new ArrayList(2);
        localArrayList.add(this.a);
        localbe.a(new aw.a(this.b, localArrayList));
      }
      a(c() + 1);
      if (c() % 10 == 0)
      {
        b.a().a(108, this.e, 600000L, this.c);
        a(0);
      }
      AppMethodBeat.o(98508);
    }
  }

  public final void b()
  {
    AppMethodBeat.i(98509);
    String str = a.b(this.b, "HEART_DENGTA", "");
    if (e.g().equals(str))
    {
      ag.a("heartbeat has been uploaded today!", new Object[0]);
      AppMethodBeat.o(98509);
    }
    while (true)
    {
      return;
      b.a().a(108, this.e, 0L, this.c);
      AppMethodBeat.o(98509);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.at
 * JD-Core Version:    0.6.2
 */