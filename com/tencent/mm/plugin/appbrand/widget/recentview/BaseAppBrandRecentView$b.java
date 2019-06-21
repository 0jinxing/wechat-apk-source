package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.support.v7.h.c.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

final class BaseAppBrandRecentView$b extends c.a
{
  private List<a> iPo;
  private List<a> iPp;

  public BaseAppBrandRecentView$b(BaseAppBrandRecentView paramBaseAppBrandRecentView, List paramList1, List paramList2)
  {
    this.iPp = paramList1;
    this.iPo = paramList2;
  }

  public final boolean J(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134348);
    a locala1 = (a)this.iPp.get(paramInt2);
    a locala2 = (a)this.iPo.get(paramInt1);
    boolean bool;
    if ((locala1 != null) && (locala2 != null) && (locala1.iXW != null) && (locala2.iXW != null))
      if ((bo.nullAsNil(locala2.iXW.username).equals(locala1.iXW.username)) && (locala2.iXW.har == locala1.iXW.har))
      {
        AppMethodBeat.o(134348);
        bool = true;
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(134348);
      bool = false;
      continue;
      if ((locala1 != null) && (locala2 != null))
      {
        if ((locala1.type == 3) && (locala2.type == 3))
        {
          AppMethodBeat.o(134348);
          bool = true;
        }
        else
        {
          AppMethodBeat.o(134348);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(134348);
        bool = false;
      }
    }
  }

  public final boolean K(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(134349);
    a locala1 = (a)this.iPp.get(paramInt2);
    a locala2 = (a)this.iPo.get(paramInt1);
    boolean bool;
    if ((locala1 != null) && (locala2 != null) && (locala1.iXW != null) && (locala2.iXW != null))
    {
      bool = bo.nullAsNil(locala2.iXW.haO).equals(locala1.iXW.haO);
      AppMethodBeat.o(134349);
    }
    while (true)
    {
      return bool;
      if ((locala1 != null) && (locala2 != null))
      {
        if ((locala1.type == 3) && (locala2.type == 3))
        {
          bool = true;
          AppMethodBeat.o(134349);
        }
        else
        {
          AppMethodBeat.o(134349);
          bool = false;
        }
      }
      else
      {
        AppMethodBeat.o(134349);
        bool = false;
      }
    }
  }

  public final int fV()
  {
    AppMethodBeat.i(134346);
    int i;
    if (this.iPo != null)
    {
      i = this.iPo.size();
      AppMethodBeat.o(134346);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(134346);
    }
  }

  public final int fW()
  {
    AppMethodBeat.i(134347);
    int i;
    if (this.iPp != null)
    {
      i = this.iPp.size();
      AppMethodBeat.o(134347);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(134347);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.BaseAppBrandRecentView.b
 * JD-Core Version:    0.6.2
 */