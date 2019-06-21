package com.tencent.mm.plugin.radar.ui;

import a.l;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bpb;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bv;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class RadarMemberView$h
  implements View.OnClickListener
{
  RadarMemberView$h(RadarMemberView paramRadarMemberView)
  {
  }

  public final void onClick(View paramView)
  {
    RadarMemberView localRadarMemberView = null;
    AppMethodBeat.i(102954);
    String str = "";
    paramView = str;
    if (RadarMemberView.c(this.pCy) != null)
    {
      paramView = RadarMemberView.c(this.pCy);
      if ((paramView == null) || (paramView.NX() != true))
        break label159;
      paramView = RadarMemberView.c(this.pCy);
      if (paramView == null)
        break label154;
    }
    int i;
    label154: for (paramView = paramView.Hr(); ; paramView = null)
    {
      localObject = (CharSequence)paramView;
      if ((localObject != null) && (!a.k.m.ar((CharSequence)localObject)))
        break;
      i = 1;
      label81: localObject = paramView;
      if (i != 0)
      {
        localObject = paramView;
        if (this.pCy.getMember() != null)
        {
          localObject = this.pCy.getMember();
          paramView = localRadarMemberView;
          if (localObject != null)
            paramView = ((bpb)localObject).jCH;
          localObject = paramView;
        }
      }
      localRadarMemberView = this.pCy;
      paramView = (View)localObject;
      if (localObject == null)
        paramView = "";
      RadarMemberView.a(localRadarMemberView, paramView);
      AppMethodBeat.o(102954);
      return;
    }
    label159: paramView = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
    a.f.b.j.o(paramView, "service(IMessengerStorage::class.java)");
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)paramView).XN();
    paramView = RadarMemberView.c(this.pCy);
    if (paramView != null)
    {
      paramView = paramView.getUsername();
      label199: localObject = ((com.tencent.mm.plugin.messenger.foundation.a.a.m)localObject).RB(paramView);
      if (localObject != null)
      {
        paramView = (CharSequence)((bv)localObject).Hv();
        if ((paramView != null) && (!a.k.m.ar(paramView)))
          break label354;
        i = 1;
        label237: if (i == 0)
          break label382;
      }
      paramView = RadarMemberView.c(this.pCy);
      if (paramView == null)
        break label360;
      paramView = paramView.Hv();
      label259: paramView = (CharSequence)paramView;
      if ((paramView != null) && (!a.k.m.ar(paramView)))
        break label365;
      i = 1;
      label278: if (i != 0)
        break label382;
      paramView = g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(paramView, "service(IMessengerStorage::class.java)");
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)paramView).XN();
      paramView = RadarMemberView.c(this.pCy);
      if (paramView == null)
        break label371;
      paramView = paramView.Hv();
      label323: localObject = ((com.tencent.mm.plugin.messenger.foundation.a.a.m)localObject).RB(paramView);
    }
    label354: label360: label365: label371: label382: 
    while (true)
    {
      paramView = str;
      if (localObject == null)
        break;
      paramView = ((bv)localObject).Hr();
      break;
      paramView = null;
      break label199;
      i = 0;
      break label237;
      paramView = null;
      break label259;
      i = 0;
      break label278;
      paramView = null;
      break label323;
      i = 0;
      break label81;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarMemberView.h
 * JD-Core Version:    0.6.2
 */