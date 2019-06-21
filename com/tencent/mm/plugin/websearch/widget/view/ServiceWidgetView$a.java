package com.tencent.mm.plugin.websearch.widget.view;

import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.support.v4.app.k;
import android.support.v4.view.ViewPager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.g;
import com.tencent.mm.plugin.websearch.api.y;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class ServiceWidgetView$a extends k
{
  List<WidgetData> kFl;
  private List<ServiceWidgetView.MyFragment> rdA;

  public ServiceWidgetView$a(ServiceWidgetView paramServiceWidgetView, i parami)
  {
    super(parami);
    AppMethodBeat.i(91491);
    this.rdA = new ArrayList();
    this.kFl = Collections.emptyList();
    AppMethodBeat.o(91491);
  }

  public final b Iu(int paramInt)
  {
    AppMethodBeat.i(91492);
    b localb;
    if ((paramInt < 0) || (paramInt >= this.rdA.size()))
    {
      localb = null;
      AppMethodBeat.o(91492);
    }
    while (true)
    {
      return localb;
      localb = ((ServiceWidgetView.MyFragment)this.rdA.get(paramInt)).udJ;
      AppMethodBeat.o(91492);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(91495);
    int i;
    if (this.kFl == null)
    {
      i = 0;
      AppMethodBeat.o(91495);
    }
    while (true)
    {
      return i;
      i = this.kFl.size();
      AppMethodBeat.o(91495);
    }
  }

  public final Fragment getItem(final int paramInt)
  {
    AppMethodBeat.i(91494);
    ServiceWidgetView.MyFragment localMyFragment;
    if (paramInt >= this.rdA.size())
    {
      localMyFragment = new ServiceWidgetView.MyFragment();
      Object localObject = new Bundle();
      ((Bundle)localObject).putParcelable("data", (Parcelable)this.kFl.get(paramInt));
      localMyFragment.setArguments((Bundle)localObject);
      this.rdA.add(localMyFragment);
      b localb = localMyFragment.udJ;
      localObject = this.udI.hwd;
      ServiceWidgetView localServiceWidgetView = this.udI;
      b.b localb1 = this.udI.udH;
      b.a local1 = new b.a()
      {
        public final int cVV()
        {
          AppMethodBeat.i(91489);
          int i;
          if (ServiceWidgetView.a.this.kFl == null)
          {
            i = 0;
            AppMethodBeat.o(91489);
          }
          while (true)
          {
            return i;
            i = ServiceWidgetView.a.this.kFl.size();
            AppMethodBeat.o(91489);
          }
        }

        public final List<y> cVW()
        {
          return ServiceWidgetView.a.this.udI.udG;
        }

        public final boolean cVX()
        {
          if (paramInt > 0);
          for (boolean bool = true; ; bool = false)
            return bool;
        }

        public final boolean hasNext()
        {
          AppMethodBeat.i(91490);
          boolean bool;
          if (paramInt < ServiceWidgetView.a.this.kFl.size() - 1)
          {
            bool = true;
            AppMethodBeat.o(91490);
          }
          while (true)
          {
            return bool;
            bool = false;
            AppMethodBeat.o(91490);
          }
        }
      };
      g localg = this.udI.mJG;
      WidgetData localWidgetData = (WidgetData)this.kFl.get(paramInt);
      localb.hwd = ((MMActivity)localObject);
      localb.mJs = localServiceWidgetView;
      localb.udH = localb1;
      localb.udX = local1;
      localb.mJG = localg;
      localb.udY = localWidgetData;
      if (paramInt != this.udI.rap.getCurrentItem())
        break label245;
      ServiceWidgetView.MyFragment.a(localMyFragment).setSelected(true);
    }
    while (true)
    {
      ab.i("ServiceWidgetView", "getItem %s, fragment %s", new Object[] { Integer.valueOf(paramInt), localMyFragment.toString() });
      AppMethodBeat.o(91494);
      return localMyFragment;
      localMyFragment = (ServiceWidgetView.MyFragment)this.rdA.get(paramInt);
      break;
      label245: ServiceWidgetView.MyFragment.a(localMyFragment).setSelected(false);
    }
  }

  public final int getItemPosition(Object paramObject)
  {
    AppMethodBeat.i(91493);
    paramObject = ((ServiceWidgetView.MyFragment)paramObject).udJ;
    int i;
    if (paramObject != null)
    {
      i = this.kFl.indexOf(paramObject.udY);
      if (i >= 0)
        AppMethodBeat.o(91493);
    }
    while (true)
    {
      return i;
      AppMethodBeat.o(91493);
      i = -2;
      continue;
      AppMethodBeat.o(91493);
      i = -2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.ServiceWidgetView.a
 * JD-Core Version:    0.6.2
 */