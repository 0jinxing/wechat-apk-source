package com.tencent.mm.plugin.websearch.widget.view;

import android.app.Activity;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.g.b.a.af;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Info;
import com.tencent.mm.plugin.websearch.api.WidgetData.Style;
import com.tencent.mm.plugin.websearch.api.g;
import com.tencent.mm.plugin.websearch.api.i;
import com.tencent.mm.plugin.websearch.api.y;
import com.tencent.mm.plugin.websearch.widget.d;
import com.tencent.mm.plugin.websearch.widget.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ServiceWidgetView
  implements i
{
  List<WidgetData> dataList;
  public MMActivity hwd;
  public LinearLayout jbJ;
  g mJG;
  private int maxWidth;
  public View pqm;
  public ViewPager rap;
  public ServiceWidgetView.a udF;
  List<y> udG;
  b.b udH;

  public ServiceWidgetView(LinearLayout paramLinearLayout, int paramInt, Activity paramActivity, g paramg)
  {
    AppMethodBeat.i(91496);
    this.udH = new ServiceWidgetView.1(this);
    this.jbJ = paramLinearLayout;
    this.hwd = ((MMActivity)paramActivity);
    this.maxWidth = paramInt;
    this.mJG = paramg;
    AppMethodBeat.o(91496);
  }

  private void cVU()
  {
    AppMethodBeat.i(91500);
    for (int i = 0; i < this.udF.getCount(); i++)
    {
      b localb = this.udF.Iu(i);
      if (localb != null)
        localb.bcM();
    }
    AppMethodBeat.o(91500);
  }

  final void Iq(int paramInt)
  {
    AppMethodBeat.i(91497);
    int i = this.rap.getCurrentItem();
    Object localObject1 = (WidgetData)this.dataList.get(i);
    if ((paramInt < 0) || (paramInt > this.dataList.size() - 1))
    {
      f.a(3, (WidgetData)localObject1, null);
      AppMethodBeat.o(91497);
    }
    while (true)
    {
      return;
      f.a(2, (WidgetData)localObject1, (WidgetData)this.dataList.get(paramInt));
      Object localObject2;
      if (paramInt == this.dataList.indexOf(localObject1))
      {
        localObject2 = new af().fh(((WidgetData)localObject1).ubs.fpS).fi(((WidgetData)localObject1).ubs.fpS);
        ((af)localObject2).cYE = 0L;
        ((af)localObject2).ff(((WidgetData)localObject1).query).fg(((WidgetData)localObject1).ubv).ajK();
        AppMethodBeat.o(91497);
      }
      else
      {
        ab.i("ServiceWidgetView", "switch widget to %d", new Object[] { Integer.valueOf(paramInt) });
        localObject2 = (WidgetData)this.dataList.get(paramInt);
        localObject1 = new af().fh(((WidgetData)localObject1).ubs.fpS).fi(((WidgetData)localObject2).ubs.fpS);
        ((af)localObject1).cYE = 1L;
        ((af)localObject1).ff(((WidgetData)localObject2).query).fg(((WidgetData)localObject2).ubv).ajK();
        this.rap.setCurrentItem(paramInt, true);
        Ir(paramInt);
        AppMethodBeat.o(91497);
      }
    }
  }

  final void Ir(int paramInt)
  {
    AppMethodBeat.i(91498);
    int i = 0;
    if (i < this.udG.size())
    {
      y localy = (y)this.udG.get(i);
      if (i == paramInt);
      for (localy.gBF = true; ; localy.gBF = false)
      {
        i++;
        break;
      }
    }
    AppMethodBeat.o(91498);
  }

  final void Is(int paramInt)
  {
    AppMethodBeat.i(91504);
    ab.i("ServiceWidgetView", "update viewpager height %d", new Object[] { Integer.valueOf(paramInt) });
    Object localObject = (WidgetData)this.dataList.get(this.rap.getCurrentItem());
    int i = paramInt;
    if (localObject != null)
    {
      i = paramInt;
      if (!((WidgetData)localObject).ubs.ubE)
        i = paramInt - a.fromDPToPix(this.hwd.mController.ylL, 46);
    }
    localObject = (LinearLayout.LayoutParams)this.rap.getLayoutParams();
    ((LinearLayout.LayoutParams)localObject).height = i;
    this.rap.setLayoutParams((ViewGroup.LayoutParams)localObject);
    AppMethodBeat.o(91504);
  }

  public final void a(int paramInt, com.tencent.mm.plugin.websearch.api.q paramq)
  {
    AppMethodBeat.i(91503);
    if ((paramq == this.udF.Iu(this.rap.getCurrentItem())) && (paramInt != this.rap.getHeight()))
      al.d(new ServiceWidgetView.3(this, paramInt));
    AppMethodBeat.o(91503);
  }

  public final void c(List<WidgetData> paramList, String paramString1, String paramString2)
  {
    AppMethodBeat.i(91499);
    this.dataList = paramList;
    if ((paramList == null) || (paramList.isEmpty()))
    {
      Is(0);
      hide();
      cVU();
      AppMethodBeat.o(91499);
    }
    while (true)
    {
      return;
      Object localObject1 = paramList.iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (WidgetData)((Iterator)localObject1).next();
        d.cVP();
        if (!d.a((WidgetData)localObject2))
        {
          ab.i("ServiceWidgetView", "widget forbidden %s", new Object[] { localObject2 });
          ((Iterator)localObject1).remove();
        }
      }
      if (paramList.isEmpty())
      {
        Is(0);
        hide();
        cVU();
        AppMethodBeat.o(91499);
      }
      else
      {
        this.dataList = paramList;
        localObject2 = paramList.iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject1 = (WidgetData)((Iterator)localObject2).next();
          if (localObject1 != null)
          {
            ((WidgetData)localObject1).ubv = paramString1;
            ((WidgetData)localObject1).query = paramString2;
            i = ((WidgetData)localObject1).ubt.width;
            if (i != this.maxWidth)
            {
              ((WidgetData)localObject1).ubt.width = this.maxWidth;
              ((WidgetData)localObject1).ubt.height = (((WidgetData)localObject1).ubt.height * this.maxWidth / i);
              ((WidgetData)localObject1).ubt.ubI = (((WidgetData)localObject1).ubt.ubI * this.maxWidth / i);
            }
          }
        }
        ab.i("ServiceWidgetView", "update with %s", new Object[] { paramList });
        this.udF.kFl = paramList;
        this.udF.notifyDataSetChanged();
        if (this.udG == null)
          this.udG = new ArrayList();
        this.udG.clear();
        int i = 0;
        if (i < this.dataList.size())
        {
          paramString2 = (WidgetData)this.dataList.get(i);
          if (paramString2 != null)
          {
            paramString1 = new y();
            paramString1.iconUrl = paramString2.ubs.iconUrl;
            paramString1.title = paramString2.ubs.bCu;
            if (i != 0)
              break label441;
          }
          label441: for (boolean bool = true; ; bool = false)
          {
            paramString1.gBF = bool;
            paramString1.desc = paramString2.ubs.label;
            this.udG.add(paramString1);
            i++;
            break;
          }
        }
        this.rap.setCurrentItem(0, false);
        for (i = 0; i < paramList.size(); i++)
        {
          paramString1 = this.udF.Iu(i);
          if (paramString1 != null)
            paramString1.e((WidgetData)this.dataList.get(i));
        }
        Is(a.fromDPToPix(this.hwd.mController.ylL, ((WidgetData)this.dataList.get(0)).ubt.height + 131));
        AppMethodBeat.o(91499);
      }
    }
  }

  public final void cUT()
  {
    AppMethodBeat.i(91501);
    Iq(this.rap.getCurrentItem() + 1);
    AppMethodBeat.o(91501);
  }

  public final void cUU()
  {
    AppMethodBeat.i(91502);
    this.rap.setCurrentItem(this.rap.getCurrentItem() - 1);
    AppMethodBeat.o(91502);
  }

  public final void hide()
  {
    AppMethodBeat.i(91505);
    this.jbJ.setVisibility(8);
    this.pqm.setVisibility(8);
    b localb = this.udF.Iu(this.rap.getCurrentItem());
    if ((localb != null) && (localb.udY != null))
      localb.hide();
    AppMethodBeat.o(91505);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(91509);
    b localb = this.udF.Iu(this.rap.getCurrentItem());
    if ((localb != null) && (localb.udY != null))
      localb.onDestroy();
    this.jbJ = null;
    this.hwd = null;
    AppMethodBeat.o(91509);
  }

  public final void onPause()
  {
    AppMethodBeat.i(91508);
    b localb = this.udF.Iu(this.rap.getCurrentItem());
    if ((localb != null) && (localb.udY != null))
      localb.onPause();
    AppMethodBeat.o(91508);
  }

  public final void onResume()
  {
    AppMethodBeat.i(91507);
    b localb = this.udF.Iu(this.rap.getCurrentItem());
    if ((localb != null) && (localb.udY != null))
      localb.onResume();
    AppMethodBeat.o(91507);
  }

  public final void show()
  {
    AppMethodBeat.i(91506);
    if ((this.dataList == null) || (this.dataList.isEmpty()))
      AppMethodBeat.o(91506);
    while (true)
    {
      return;
      this.pqm.setVisibility(0);
      this.jbJ.setVisibility(0);
      b localb = this.udF.Iu(this.rap.getCurrentItem());
      if ((localb != null) && (localb.udY != null) && (localb.gBF))
        localb.onResume();
      AppMethodBeat.o(91506);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.ServiceWidgetView
 * JD-Core Version:    0.6.2
 */