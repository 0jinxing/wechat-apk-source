package com.tencent.mm.plugin.radar.ui;

import a.l;
import a.v;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.radar.b.e;
import com.tencent.mm.plugin.radar.b.e.e;
import com.tencent.mm.protocal.protobuf.bpb;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"})
final class RadarViewController$f
  implements View.OnClickListener
{
  RadarViewController$f(RadarViewController paramRadarViewController)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(103097);
    if ((this.pEg.getRadarStatus() == e.e.pBM) || (this.pEg.getRadarStatus() == e.e.pBN))
    {
      paramView = this.pEg.getContext();
      if (paramView == null)
      {
        paramView = new v("null cannot be cast to non-null type android.app.Activity");
        AppMethodBeat.o(103097);
        throw paramView;
      }
      ((Activity)paramView).finish();
      AppMethodBeat.o(103097);
      return;
    }
    RadarViewController localRadarViewController = this.pEg;
    paramView = RadarViewController.d(this.pEg);
    LinkedList localLinkedList = new LinkedList();
    int i = paramView.pEi.length;
    for (int j = 0; j < i; j++)
    {
      bpb localbpb = paramView.pEi[j];
      if (localbpb != null)
        localLinkedList.add(localbpb);
    }
    if (RadarViewController.a(localRadarViewController, localLinkedList))
    {
      RadarViewController.f(this.pEg).cdU();
      RadarViewController.f(this.pEg).setVisibility(0);
      RadarViewController.c(this.pEg).cdA();
      RadarViewController.a(this.pEg, e.e.pBN);
    }
    while (true)
    {
      RadarViewController.d(this.pEg).aPw();
      AppMethodBeat.o(103097);
      break;
      RadarViewController.a(this.pEg, e.e.pBM);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.RadarViewController.f
 * JD-Core Version:    0.6.2
 */