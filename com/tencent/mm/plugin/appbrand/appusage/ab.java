package com.tencent.mm.plugin.appbrand.appusage;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.ui.recents.s;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class ab extends s<LocalUsageInfo>
{
  public ab(List<LocalUsageInfo> paramList1, List<LocalUsageInfo> paramList2)
  {
    super(aD(paramList1), aD(paramList2));
    AppMethodBeat.i(129710);
    AppMethodBeat.o(129710);
  }

  private static <T> ArrayList<T> aD(List<T> paramList)
  {
    AppMethodBeat.i(129711);
    if ((paramList instanceof ArrayList))
    {
      paramList = (ArrayList)paramList;
      AppMethodBeat.o(129711);
    }
    while (true)
    {
      return paramList;
      if (bo.ek(paramList))
      {
        paramList = new ArrayList(0);
        AppMethodBeat.o(129711);
      }
      else
      {
        ArrayList localArrayList = new ArrayList(paramList.size());
        localArrayList.addAll(paramList);
        AppMethodBeat.o(129711);
        paramList = localArrayList;
      }
    }
  }

  public final boolean J(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129712);
    LocalUsageInfo localLocalUsageInfo1 = (LocalUsageInfo)this.iPo.get(paramInt1);
    LocalUsageInfo localLocalUsageInfo2 = (LocalUsageInfo)this.iPp.get(paramInt2);
    boolean bool;
    if ((bo.nullAsNil(localLocalUsageInfo1.username).equals(localLocalUsageInfo2.username)) && (localLocalUsageInfo1.har == localLocalUsageInfo2.har))
    {
      bool = true;
      AppMethodBeat.o(129712);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(129712);
    }
  }

  public final boolean K(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129713);
    LocalUsageInfo localLocalUsageInfo1 = (LocalUsageInfo)this.iPo.get(paramInt1);
    LocalUsageInfo localLocalUsageInfo2 = (LocalUsageInfo)this.iPp.get(paramInt2);
    boolean bool = bo.nullAsNil(localLocalUsageInfo1.haO).equals(localLocalUsageInfo2.haO);
    AppMethodBeat.o(129713);
    return bool;
  }

  public final Object L(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(129714);
    Object localObject;
    if (paramInt1 >= this.iPo.size())
    {
      AppMethodBeat.o(129714);
      localObject = null;
    }
    while (true)
    {
      return localObject;
      localObject = new Bundle();
      try
      {
        LocalUsageInfo localLocalUsageInfo1 = (LocalUsageInfo)this.iPo.get(paramInt1);
        LocalUsageInfo localLocalUsageInfo2 = (LocalUsageInfo)this.iPp.get(paramInt2);
        if (!bo.nullAsNil(localLocalUsageInfo1.haO).equals(localLocalUsageInfo2.haO))
          ((Bundle)localObject).putString("icon", localLocalUsageInfo2.haO);
        if (!bo.nullAsNil(localLocalUsageInfo1.nickname).equals(localLocalUsageInfo2.nickname))
          ((Bundle)localObject).putString("nick_name", localLocalUsageInfo2.nickname);
        if (((Bundle)localObject).size() <= 0)
        {
          AppMethodBeat.o(129714);
          localObject = null;
        }
      }
      catch (Exception localException)
      {
        while (true)
          ((Bundle)localObject).clear();
        AppMethodBeat.o(129714);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.ab
 * JD-Core Version:    0.6.2
 */