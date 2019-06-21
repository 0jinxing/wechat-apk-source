package com.tencent.mm.plugin.radar.ui;

import a.f.b.j;
import a.k.m;
import a.l;
import a.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.radar.b.c.e;
import com.tencent.mm.plugin.radar.b.e;
import com.tencent.mm.protocal.protobuf.bpb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.HashMap;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/radar/ui/RadarViewController$prepareGrid$1", "Lcom/tencent/mm/plugin/radar/ui/RadarSpecialGridView$OnItemClickListener;", "onItemClick", "", "position", "", "view", "Landroid/view/View;", "plugin-radar_release"})
public final class RadarViewController$h
  implements RadarSpecialGridView.a
{
  public final void f(int paramInt, View paramView)
  {
    int i = 0;
    AppMethodBeat.i(103100);
    j.p(paramView, "view");
    bpb localbpb = (bpb)RadarViewController.d(this.pEg).pEi[paramInt];
    if (localbpb == null)
      AppMethodBeat.o(103100);
    Object localObject1;
    Object localObject2;
    while (true)
    {
      return;
      localObject1 = this.pEg.getRadarStatus();
      switch (h.pCY[localObject1.ordinal()])
      {
      default:
        ab.d(RadarViewController.access$getTAG$cp(), "unknow status for grid view %s", new Object[] { this.pEg.getRadarStatus() });
        AppMethodBeat.o(103100);
        break;
      case 1:
      case 2:
        localObject1 = g.pDK;
        localObject1 = g.b(localbpb);
        if (localbpb != null)
        {
          localObject2 = (CharSequence)localbpb.jBB;
          if ((localObject2 != null) && (!m.ar((CharSequence)localObject2)))
            break label279;
          j = 1;
          label157: paramInt = i;
          if (j == 0)
            break label199;
          localObject2 = (CharSequence)localbpb.wfK;
          if ((localObject2 != null) && (!m.ar((CharSequence)localObject2)))
            break label285;
        }
        label279: label285: for (int j = 1; ; j = 0)
        {
          paramInt = i;
          if (j != 0)
            paramInt = 1;
          label199: if (paramInt != 0)
            break;
          localObject2 = (View)RadarViewController.d(this.pEg).pEn.get(localObject1);
          localObject1 = e.a(RadarViewController.c(this.pEg), localbpb);
          if ((localObject2 == null) || (localObject1 == c.e.pAW))
            break label353;
          localObject2 = ((View)localObject2).getTag();
          if (localObject2 != null)
            break label291;
          paramView = new v("null cannot be cast to non-null type com.tencent.mm.plugin.radar.ui.RadarViewController.RadarSearchAdapter.ViewHolder");
          AppMethodBeat.o(103100);
          throw paramView;
          j = 0;
          break label157;
        }
        label291: ((RadarViewController.c.a)localObject2).pEr.cdM();
        localObject2 = new ak();
        localObject1 = (Runnable)new RadarViewController.h.a(this, paramView, localbpb, (c.e)localObject1);
        paramView = RadarStateView.pDf;
        ((ak)localObject2).postDelayed((Runnable)localObject1, RadarStateView.cdN());
        AppMethodBeat.o(103100);
        continue;
        label353: RadarViewController.g(this.pEg).a(paramView, localbpb, (c.e)localObject1);
        RadarViewController.f(this.pEg).cdV();
        AppMethodBeat.o(103100);
      case 3:
      }
    }
    if (localbpb != null)
    {
      paramView = (CharSequence)localbpb.jBB;
      if ((paramView == null) || (m.ar(paramView)))
      {
        paramInt = 1;
        if (paramInt == 0)
          break label548;
        paramView = (CharSequence)localbpb.wfK;
        if ((paramView != null) && (!m.ar(paramView)))
          break label543;
        paramInt = 1;
        label439: if (paramInt == 0)
          break label548;
      }
    }
    else
    {
      paramInt = 1;
    }
    while (true)
      if (paramInt == 0)
      {
        localObject2 = RadarViewController.d(this.pEg);
        if (localbpb == null)
          break label621;
        paramView = g.pDK;
        localObject1 = g.b(localbpb);
        paramView = (View)localObject1;
        if (RadarViewController.c(((RadarViewController.c)localObject2).pEg).pBv.containsKey(localObject1))
        {
          paramView = RadarViewController.c(((RadarViewController.c)localObject2).pEg).pBv.get(localObject1);
          if (paramView == null)
          {
            paramView = new v("null cannot be cast to non-null type kotlin.String");
            AppMethodBeat.o(103100);
            throw paramView;
            paramInt = 0;
            break;
            label543: paramInt = 0;
            break label439;
            label548: paramInt = 0;
            continue;
          }
          paramView = (String)paramView;
        }
        if (!((RadarViewController.c)localObject2).pEj.containsKey(paramView))
          break label621;
        paramInt = 1;
        label572: if (paramInt != 0)
          break label626;
        RadarViewController.d(this.pEg).d(localbpb);
      }
    while (true)
    {
      RadarViewController.c(this.pEg).a(localbpb);
      RadarViewController.cdS();
      RadarViewController.d(this.pEg).aPw();
      AppMethodBeat.o(103100);
      break;
      label621: paramInt = 0;
      break label572;
      label626: localObject2 = RadarViewController.d(this.pEg);
      if (localbpb != null)
      {
        paramView = (CharSequence)localbpb.jBB;
        if ((paramView != null) && (!m.ar(paramView)))
          break label781;
        paramInt = 1;
        if (paramInt == 0)
          break label791;
        paramView = (CharSequence)localbpb.wfK;
        if ((paramView != null) && (!m.ar(paramView)))
          break label786;
        paramInt = 1;
        label688: if (paramInt == 0)
          break label791;
      }
      label781: label786: label791: for (paramInt = 1; ; paramInt = 0)
      {
        if (paramInt != 0)
          break label794;
        paramView = g.pDK;
        if (localbpb == null)
          j.dWJ();
        localObject1 = g.b(localbpb);
        paramView = (View)localObject1;
        if (!RadarViewController.c(((RadarViewController.c)localObject2).pEg).pBv.containsKey(localObject1))
          break label801;
        paramView = RadarViewController.c(((RadarViewController.c)localObject2).pEg).pBv.get(localObject1);
        if (paramView != null)
          break label796;
        paramView = new v("null cannot be cast to non-null type kotlin.String");
        AppMethodBeat.o(103100);
        throw paramView;
        paramInt = 0;
        break;
        paramInt = 0;
        break label688;
      }
      label794: continue;
      label796: paramView = (String)paramView;
      label801: ((RadarViewController.c)localObject2).pEj.remove(paramView);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarViewController.h
 * JD-Core Version:    0.6.2
 */