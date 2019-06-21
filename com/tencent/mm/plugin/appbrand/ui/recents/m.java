package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.luggage.g.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import junit.framework.Assert;

final class m extends ArrayList<AppBrandRecentTaskInfo>
{
  private final ArrayList<AppBrandRecentTaskInfo> iOH;
  private final ArrayList<AppBrandRecentTaskInfo> iOI;

  m()
  {
    AppMethodBeat.i(133483);
    this.iOH = new ArrayList(50);
    this.iOI = new ArrayList(10000);
    AppMethodBeat.o(133483);
  }

  static m d(ArrayList<AppBrandRecentTaskInfo> paramArrayList1, ArrayList<AppBrandRecentTaskInfo> paramArrayList2)
  {
    AppMethodBeat.i(133484);
    m localm = new m();
    c.c(localm.iOH, paramArrayList1);
    c.c(localm.iOI, paramArrayList2);
    AppMethodBeat.o(133484);
    return localm;
  }

  private AppBrandRecentTaskInfo pU(int paramInt)
  {
    try
    {
      AppMethodBeat.i(133490);
      AppBrandRecentTaskInfo localAppBrandRecentTaskInfo;
      if (paramInt < this.iOH.size())
      {
        localAppBrandRecentTaskInfo = (AppBrandRecentTaskInfo)this.iOH.get(paramInt);
        AppMethodBeat.o(133490);
      }
      while (true)
      {
        return localAppBrandRecentTaskInfo;
        localAppBrandRecentTaskInfo = (AppBrandRecentTaskInfo)this.iOI.get(paramInt - this.iOH.size());
        AppMethodBeat.o(133490);
      }
    }
    finally
    {
    }
  }

  final m a(m paramm)
  {
    try
    {
      AppMethodBeat.i(133486);
      paramm = e(paramm.iOH, paramm.iOI);
      AppMethodBeat.o(133486);
      return paramm;
    }
    finally
    {
      paramm = finally;
    }
    throw paramm;
  }

  final ArrayList<AppBrandRecentTaskInfo> aNw()
  {
    try
    {
      ArrayList localArrayList = this.iOH;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final ArrayList<AppBrandRecentTaskInfo> aNx()
  {
    try
    {
      ArrayList localArrayList = this.iOI;
      return localArrayList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final m aNy()
  {
    try
    {
      AppMethodBeat.i(133488);
      m localm = new com/tencent/mm/plugin/appbrand/ui/recents/m;
      localm.<init>();
      localm.iOH.addAll(this.iOH);
      localm.iOI.addAll(this.iOI);
      AppMethodBeat.o(133488);
      return localm;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean addAll(Collection<? extends AppBrandRecentTaskInfo> paramCollection)
  {
    boolean bool = false;
    AppMethodBeat.i(133487);
    if (m.class.isInstance(paramCollection));
    while (true)
    {
      try
      {
        paramCollection = (m)paramCollection;
        this.iOH.addAll(paramCollection.iOH);
        this.iOI.addAll(paramCollection.iOI);
        bool = true;
        return bool;
      }
      finally
      {
        AppMethodBeat.o(133487);
      }
      Assert.assertTrue("collection type mismatch!!", false);
      AppMethodBeat.o(133487);
    }
  }

  public final void clear()
  {
    try
    {
      AppMethodBeat.i(133492);
      this.iOH.clear();
      this.iOI.clear();
      AppMethodBeat.o(133492);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  final m e(ArrayList<AppBrandRecentTaskInfo> paramArrayList1, ArrayList<AppBrandRecentTaskInfo> paramArrayList2)
  {
    try
    {
      AppMethodBeat.i(133485);
      this.iOH.clear();
      if (!bo.ek(paramArrayList1))
        this.iOH.addAll(paramArrayList1);
      this.iOI.clear();
      if (!bo.ek(paramArrayList2))
        this.iOI.addAll(paramArrayList2);
      AppMethodBeat.o(133485);
      return this;
    }
    finally
    {
    }
    throw paramArrayList1;
  }

  public final Iterator<AppBrandRecentTaskInfo> iterator()
  {
    AppMethodBeat.i(133493);
    Assert.assertTrue("Why you need this?? call @smoothieli fix it", false);
    m.1 local1 = new m.1(this);
    AppMethodBeat.o(133493);
    return local1;
  }

  public final AppBrandRecentTaskInfo pV(int paramInt)
  {
    try
    {
      AppMethodBeat.i(133491);
      AppBrandRecentTaskInfo localAppBrandRecentTaskInfo;
      if (paramInt < this.iOH.size())
      {
        localAppBrandRecentTaskInfo = (AppBrandRecentTaskInfo)this.iOH.remove(paramInt);
        AppMethodBeat.o(133491);
      }
      while (true)
      {
        return localAppBrandRecentTaskInfo;
        localAppBrandRecentTaskInfo = (AppBrandRecentTaskInfo)this.iOI.remove(paramInt - this.iOH.size());
        AppMethodBeat.o(133491);
      }
    }
    finally
    {
    }
  }

  public final int size()
  {
    try
    {
      AppMethodBeat.i(133489);
      int i = this.iOH.size();
      int j = this.iOI.size();
      AppMethodBeat.o(133489);
      return i + j;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.m
 * JD-Core Version:    0.6.2
 */