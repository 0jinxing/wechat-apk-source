package com.tencent.mm.plugin.appbrand.ui.recents;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Iterator;

final class k
{
  final boolean enable;

  k(boolean paramBoolean)
  {
    this.enable = paramBoolean;
  }

  final ArrayList<AppBrandRecentTaskInfo> q(ArrayList<AppBrandRecentTaskInfo> paramArrayList)
  {
    AppMethodBeat.i(133482);
    if ((!this.enable) || (bo.ek(paramArrayList)))
      AppMethodBeat.o(133482);
    while (true)
    {
      return paramArrayList;
      ArrayList localArrayList = new ArrayList(paramArrayList.size());
      Iterator localIterator = paramArrayList.iterator();
      while (localIterator.hasNext())
      {
        paramArrayList = (AppBrandRecentTaskInfo)localIterator.next();
        if (!paramArrayList.had)
          localArrayList.add(paramArrayList);
      }
      AppMethodBeat.o(133482);
      paramArrayList = localArrayList;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.k
 * JD-Core Version:    0.6.2
 */