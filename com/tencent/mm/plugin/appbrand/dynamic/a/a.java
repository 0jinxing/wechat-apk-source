package com.tencent.mm.plugin.appbrand.dynamic.a;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.c;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

final class a
  implements c
{
  private Map<Object, Set<View>> hmb;

  public a()
  {
    AppMethodBeat.i(10726);
    this.hmb = new HashMap();
    AppMethodBeat.o(10726);
  }

  public final Map<Object, Set<View>> abx()
  {
    return this.hmb;
  }

  public final Set<View> bd(Object paramObject)
  {
    AppMethodBeat.i(10729);
    if (paramObject == null)
    {
      paramObject = null;
      AppMethodBeat.o(10729);
    }
    while (true)
    {
      return paramObject;
      paramObject = (Set)this.hmb.get(paramObject);
      AppMethodBeat.o(10729);
    }
  }

  public final Set<View> be(Object paramObject)
  {
    AppMethodBeat.i(10730);
    if (paramObject == null)
    {
      paramObject = null;
      AppMethodBeat.o(10730);
    }
    while (true)
    {
      return paramObject;
      paramObject = (Set)this.hmb.remove(paramObject);
      AppMethodBeat.o(10730);
    }
  }

  public final boolean d(Object paramObject, View paramView)
  {
    AppMethodBeat.i(10727);
    boolean bool;
    if ((paramObject == null) || (paramView == null))
    {
      bool = false;
      AppMethodBeat.o(10727);
    }
    while (true)
    {
      return bool;
      Set localSet = (Set)this.hmb.get(paramObject);
      Object localObject = localSet;
      if (localSet == null)
      {
        localObject = new HashSet();
        this.hmb.put(paramObject, localObject);
      }
      bool = ((Set)localObject).add(paramView);
      AppMethodBeat.o(10727);
    }
  }

  public final boolean e(Object paramObject, View paramView)
  {
    AppMethodBeat.i(10728);
    boolean bool;
    if ((paramObject == null) || (paramView == null))
    {
      AppMethodBeat.o(10728);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramObject = (Set)this.hmb.get(paramObject);
      if (paramObject != null)
      {
        bool = paramObject.remove(paramView);
        AppMethodBeat.o(10728);
      }
      else
      {
        AppMethodBeat.o(10728);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.a.a
 * JD-Core Version:    0.6.2
 */