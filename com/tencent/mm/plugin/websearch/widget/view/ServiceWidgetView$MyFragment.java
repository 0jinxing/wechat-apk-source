package com.tencent.mm.plugin.websearch.widget.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.websearch.api.f;
import com.tencent.mm.plugin.websearch.api.h;
import com.tencent.mm.plugin.websearch.widget.view.footer.MoreFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

public class ServiceWidgetView$MyFragment extends Fragment
{
  b udJ;

  public ServiceWidgetView$MyFragment()
  {
    AppMethodBeat.i(91484);
    this.udJ = new b();
    AppMethodBeat.o(91484);
  }

  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    AppMethodBeat.i(91485);
    ab.i("ServiceWidgetView", "onCreateView %s", new Object[] { toString() });
    paramLayoutInflater = this.udJ;
    paramLayoutInflater.eAl = paramViewGroup;
    if (paramLayoutInflater.udN == null)
    {
      if (paramLayoutInflater.view == null)
      {
        paramLayoutInflater.view = LayoutInflater.from(paramLayoutInflater.hwd.mController.ylL).inflate(2130970620, paramLayoutInflater.eAl, false);
        paramLayoutInflater.udM = ((LinearLayout)paramLayoutInflater.view.findViewById(2131821064));
        paramLayoutInflater.udQ = paramLayoutInflater.view.findViewById(2131825996);
        paramLayoutInflater.udL = paramLayoutInflater.view.findViewById(2131827359);
        paramLayoutInflater.udT = ((LinearLayout)paramLayoutInflater.view.findViewById(2131827365));
        paramLayoutInflater.udU = ((MoreFooter)paramLayoutInflater.view.findViewById(2131827366));
        paramLayoutInflater.pNv = ((TextView)paramLayoutInflater.view.findViewById(2131822768));
        paramLayoutInflater.udR = paramLayoutInflater.view.findViewById(2131827364);
        paramLayoutInflater.ueb = paramLayoutInflater.view.findViewById(2131827358);
        paramLayoutInflater.uea = ((ThreeDotsLoadingView)paramLayoutInflater.view.findViewById(2131821325));
        paramLayoutInflater.uec = paramLayoutInflater.view.findViewById(2131827362);
        paramLayoutInflater.udL.setVisibility(8);
        paramLayoutInflater.udM.setVisibility(8);
        paramLayoutInflater.cVZ();
        paramLayoutInflater.view.findViewById(2131827363).setOnClickListener(new b.4(paramLayoutInflater));
        paramLayoutInflater.view.findViewById(2131827361).setOnClickListener(new b.5(paramLayoutInflater));
        paramLayoutInflater.udM.setOnTouchListener(new b.6(paramLayoutInflater));
        paramLayoutInflater.udM.setOnClickListener(new b.7(paramLayoutInflater));
        paramLayoutInflater.udU.setOnClickLsn(paramLayoutInflater.uee);
        paramLayoutInflater.pNv.setOnLongClickListener(new b.8(paramLayoutInflater));
      }
      paramLayoutInflater.udN = ((h)g.K(h.class)).a(paramLayoutInflater.eAl.getContext(), new b.3(paramLayoutInflater));
      paramLayoutInflater.udN.cUS();
    }
    paramLayoutInflater.cu();
    if (paramLayoutInflater.gBF)
      paramLayoutInflater.cWa();
    paramLayoutInflater = this.udJ.view;
    AppMethodBeat.o(91485);
    return paramLayoutInflater;
  }

  public void onDestroy()
  {
    AppMethodBeat.i(91488);
    super.onDestroy();
    if ((this.udJ != null) && (this.udJ.udY != null))
      this.udJ.onDestroy();
    AppMethodBeat.o(91488);
  }

  public void onPause()
  {
    AppMethodBeat.i(91487);
    super.onPause();
    if ((this.udJ != null) && (this.udJ.udY != null))
      this.udJ.onPause();
    AppMethodBeat.o(91487);
  }

  public void onResume()
  {
    AppMethodBeat.i(91486);
    super.onResume();
    if ((this.udJ != null) && (this.udJ.udY != null))
      this.udJ.onResume();
    AppMethodBeat.o(91486);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.websearch.widget.view.ServiceWidgetView.MyFragment
 * JD-Core Version:    0.6.2
 */