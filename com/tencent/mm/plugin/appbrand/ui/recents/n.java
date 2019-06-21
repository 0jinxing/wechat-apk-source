package com.tencent.mm.plugin.appbrand.ui.recents;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.AppBrandRecentTaskInfo;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

final class n extends s<Object>
{
  n(ArrayList<?> paramArrayList1, ArrayList<?> paramArrayList2)
  {
    super(paramArrayList1, paramArrayList2);
  }

  public final boolean J(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133497);
    boolean bool;
    if (!this.iPo.get(paramInt1).getClass().equals(this.iPp.get(paramInt2).getClass()))
    {
      AppMethodBeat.o(133497);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((this.iPo.get(paramInt1) instanceof AppBrandRecentTaskInfo))
      {
        AppBrandRecentTaskInfo localAppBrandRecentTaskInfo1 = (AppBrandRecentTaskInfo)this.iPo.get(paramInt1);
        AppBrandRecentTaskInfo localAppBrandRecentTaskInfo2 = (AppBrandRecentTaskInfo)this.iPp.get(paramInt2);
        if ((localAppBrandRecentTaskInfo1.gVs == localAppBrandRecentTaskInfo2.gVs) && (localAppBrandRecentTaskInfo1.csl.equals(localAppBrandRecentTaskInfo2.csl)))
        {
          bool = true;
          AppMethodBeat.o(133497);
        }
        else
        {
          AppMethodBeat.o(133497);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(133497);
        bool = false;
      }
    }
  }

  public final boolean K(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133498);
    boolean bool;
    if ((this.iPo.get(paramInt1) instanceof AppBrandRecentTaskInfo))
    {
      AppBrandRecentTaskInfo localAppBrandRecentTaskInfo1 = (AppBrandRecentTaskInfo)this.iPo.get(paramInt1);
      AppBrandRecentTaskInfo localAppBrandRecentTaskInfo2 = (AppBrandRecentTaskInfo)this.iPp.get(paramInt2);
      if ((localAppBrandRecentTaskInfo1.had == localAppBrandRecentTaskInfo2.had) && (bo.nullAsNil(localAppBrandRecentTaskInfo1.hac).equals(localAppBrandRecentTaskInfo2.hac)) && (bo.nullAsNil(localAppBrandRecentTaskInfo1.appName).equals(localAppBrandRecentTaskInfo2.appName)))
      {
        AppMethodBeat.o(133498);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133498);
      continue;
      AppMethodBeat.o(133498);
      bool = true;
    }
  }

  public final Object L(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(133499);
    Object localObject;
    if (paramInt1 >= this.iPo.size())
    {
      AppMethodBeat.o(133499);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = new Bundle();
      if ((this.iPo.get(paramInt1) instanceof AppBrandRecentTaskInfo))
      {
        AppBrandRecentTaskInfo localAppBrandRecentTaskInfo1 = (AppBrandRecentTaskInfo)this.iPo.get(paramInt1);
        AppBrandRecentTaskInfo localAppBrandRecentTaskInfo2 = (AppBrandRecentTaskInfo)this.iPp.get(paramInt2);
        if (localAppBrandRecentTaskInfo1.had != localAppBrandRecentTaskInfo2.had)
          ((Bundle)localObject).putBoolean("star", localAppBrandRecentTaskInfo2.had);
        if (!bo.nullAsNil(localAppBrandRecentTaskInfo1.hac).equals(localAppBrandRecentTaskInfo2.hac))
          ((Bundle)localObject).putString("icon", localAppBrandRecentTaskInfo2.hac);
        if (!bo.nullAsNil(localAppBrandRecentTaskInfo1.appName).equals(localAppBrandRecentTaskInfo2.appName))
          ((Bundle)localObject).putString("nick_name", localAppBrandRecentTaskInfo2.appName);
      }
      if (((Bundle)localObject).size() <= 0)
      {
        AppMethodBeat.o(133499);
        localObject = null;
      }
      else
      {
        AppMethodBeat.o(133499);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.n
 * JD-Core Version:    0.6.2
 */