package com.tencent.mm.plugin.websearch.widget.view;

import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.WidgetData.Style;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.List;

public final class ServiceWidgetView$2
  implements ViewPager.OnPageChangeListener
{
  public ServiceWidgetView$2(ServiceWidgetView paramServiceWidgetView)
  {
  }

  public final void onPageScrollStateChanged(int paramInt)
  {
  }

  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public final void onPageSelected(int paramInt)
  {
    int i = 1;
    AppMethodBeat.i(91482);
    ab.i("ServiceWidgetView", "opPageSelected %d", new Object[] { Integer.valueOf(paramInt) });
    this.udI.Ir(paramInt);
    ServiceWidgetView localServiceWidgetView = this.udI;
    int j = 0;
    if (j < localServiceWidgetView.dataList.size())
    {
      localb = localServiceWidgetView.udF.Iu(j);
      if (localb != null)
        if (j != localServiceWidgetView.rap.getCurrentItem())
          break label99;
      label99: for (boolean bool = true; ; bool = false)
      {
        localb.setSelected(bool);
        j++;
        break;
      }
    }
    this.udI.udF.Iu(paramInt).e((WidgetData)this.udI.dataList.get(paramInt));
    b localb = this.udI.udF.Iu(paramInt);
    if ((!localb.isLoading) && (localb.udZ == localb.udY));
    for (j = i; ; j = 0)
    {
      if (j != 0)
        ServiceWidgetView.a(this.udI);
      this.udI.Is(a.fromDPToPix(this.udI.hwd.mController.ylL, ((WidgetData)this.udI.dataList.get(paramInt)).ubt.height + 131));
      AppMethodBeat.o(91482);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.ServiceWidgetView.2
 * JD-Core Version:    0.6.2
 */