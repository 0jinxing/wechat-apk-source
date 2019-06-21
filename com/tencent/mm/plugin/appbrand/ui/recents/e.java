package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

public final class e
{
  public final View apJ;
  ThreeDotsLoadingView iNB;
  View iNC;
  private View iND;

  public e(Context paramContext, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(133414);
    this.apJ = LayoutInflater.from(paramContext).inflate(2130968712, paramViewGroup, false);
    this.iNB = ((ThreeDotsLoadingView)this.apJ.findViewById(2131821325));
    this.iNC = this.apJ.findViewById(2131821328);
    this.iND = this.apJ.findViewById(2131821326);
    AppMethodBeat.o(133414);
  }

  public final View aNi()
  {
    return this.apJ;
  }

  public final void aNr()
  {
    AppMethodBeat.i(133415);
    if (this.iNC != null)
      this.iNC.setBackgroundResource(2131690597);
    AppMethodBeat.o(133415);
  }

  public final void eJ(boolean paramBoolean)
  {
    AppMethodBeat.i(133413);
    if (paramBoolean)
    {
      if (this.iNB != null)
      {
        this.iNB.setVisibility(0);
        this.iNB.dKS();
      }
      if (this.iND == null)
        break label91;
      this.iND.setVisibility(8);
      AppMethodBeat.o(133413);
    }
    while (true)
    {
      return;
      if (this.iNB != null)
      {
        this.iNB.dKT();
        this.iNB.setVisibility(8);
      }
      if (this.iND != null)
        this.iND.setVisibility(0);
      label91: AppMethodBeat.o(133413);
    }
  }

  public final void onDetached()
  {
    this.iNB = null;
    this.iND = null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.e
 * JD-Core Version:    0.6.2
 */