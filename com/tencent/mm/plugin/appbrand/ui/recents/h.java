package com.tencent.mm.plugin.appbrand.ui.recents;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.b.f;
import com.tencent.mm.plugin.appbrand.widget.AppBrandNearbyShowcaseView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;
import java.util.List;

public final class h
  implements View.OnClickListener
{
  h.b iNP;
  h.c iNQ;
  final h.d iNR;
  private final int iNS;
  private final int iNT;
  private final h.a iNU;

  public h(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(133439);
    this.iNQ = h.c.iNX;
    this.iNR = new h.d((byte)0);
    this.iNT = 200;
    Context localContext = paramViewGroup.getContext();
    this.iNU = new h.a(this, localContext, (byte)0);
    paramViewGroup = LayoutInflater.from(localContext).inflate(2130968716, paramViewGroup, false);
    this.iNR.apJ = paramViewGroup;
    this.iNR.iOc = ((TextView)paramViewGroup.findViewById(2131820678));
    this.iNR.iOd = paramViewGroup.findViewById(2131821329);
    this.iNR.iOf = ((TextView)paramViewGroup.findViewById(2131821331));
    this.iNR.iOe = ((AppBrandNearbyShowcaseView)paramViewGroup.findViewById(2131821330));
    this.iNR.iNB = ((ThreeDotsLoadingView)paramViewGroup.findViewById(2131821334));
    this.iNR.iOg = ((ImageView)paramViewGroup.findViewById(2131821335));
    this.iNR.iOh = ((ImageView)paramViewGroup.findViewById(2131821332));
    this.iNR.apJ.setOnClickListener(this);
    this.iNR.iOc.setText(2131296697);
    paramViewGroup = this.iNR.iOe;
    if (paramViewGroup != null)
    {
      paramViewGroup.setIconLayerCount(4);
      paramViewGroup.setIconSize(this.iNU.eop + this.iNU.eor * 2);
      paramViewGroup.setIconGap(this.iNU.eoq);
    }
    this.iNS = com.tencent.mm.bz.a.i(localContext, 2131690152);
    AppMethodBeat.o(133439);
  }

  static void cx(View paramView)
  {
    AppMethodBeat.i(133444);
    if (paramView.getVisibility() != 0)
    {
      paramView.setAlpha(0.0F);
      paramView.setVisibility(0);
    }
    paramView.animate().setDuration(200L).alpha(1.0F).withEndAction(null).start();
    AppMethodBeat.o(133444);
  }

  protected final void a(List<String> paramList, String paramString, Integer paramInteger)
  {
    AppMethodBeat.i(133441);
    ab.i("MicroMsg.AppBrandLauncherRecentsListHeaderBase", "AppBrandLauncherRecentsListHeaderBase.loadingSuccess");
    this.iNQ = h.c.iNZ;
    this.iNR.iNB.dKT();
    cw(this.iNR.iNB);
    if ((paramList == null) || (paramList.size() == 0))
    {
      ab.e("MicroMsg.AppBrandLauncherRecentsListHeaderBase", "AppBrandLauncherRecentsListHeaderBase.showLoadingSuccess empty iconUrl list");
      AppMethodBeat.o(133441);
      return;
    }
    if (paramList == null)
    {
      ab.e("MicroMsg.AppBrandLauncherRecentsListHeaderBase", "prepareIconList without icon urls");
      label77: if (paramInteger != null)
        break label345;
    }
    label345: for (int i = this.iNS; ; i = paramInteger.intValue())
    {
      if (this.iNR.iOf != null)
      {
        this.iNR.iOf.setText(paramString);
        this.iNR.iOf.setTextColor(i);
      }
      if (this.iNR.iOd != null)
      {
        cx(this.iNR.iOd);
        if (this.iNR.iOe != null)
          this.iNR.iOe.aOB();
        if (this.iNR.iOf != null)
        {
          this.iNR.iOf.setAlpha(0.0F);
          this.iNR.iOf.animate().alpha(1.0F).setDuration(500L).start();
        }
      }
      AppMethodBeat.o(133441);
      break;
      this.iNR.iOe.setIconLayerCount(Math.min(paramList.size(), 4));
      this.iNR.iOe.eO(false);
      Object localObject = this.iNU;
      if (((h.a)localObject).iNW == null)
        ((h.a)localObject).iNW = new com.tencent.mm.plugin.appbrand.ui.widget.a(((h.a)localObject).eop, ((h.a)localObject).eor);
      localObject = ((h.a)localObject).iNW;
      for (i = 0; i < this.iNR.iOe.getChildCount(); i++)
        b.abR().a(this.iNR.iOe.qf(i), (String)paramList.get(i), com.tencent.mm.modelappbrand.a.a.abQ(), (b.f)localObject);
      break label77;
    }
  }

  protected final void aNt()
  {
    AppMethodBeat.i(133440);
    ab.i("MicroMsg.AppBrandLauncherRecentsListHeaderBase", "AppBrandLauncherRecentsListHeaderBase.loading");
    this.iNQ = h.c.iNY;
    cw(this.iNR.iOd);
    cw(this.iNR.iOg);
    cx(this.iNR.iNB);
    this.iNR.iNB.dKS();
    AppMethodBeat.o(133440);
  }

  final void cw(View paramView)
  {
    AppMethodBeat.i(133443);
    if (paramView.getVisibility() == 0)
      paramView.animate().setDuration(200L).alpha(0.0F).withEndAction(new h.1(this, paramView)).start();
    AppMethodBeat.o(133443);
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133442);
    if (this.iNP != null)
      this.iNP.a(this.iNQ, paramView);
    AppMethodBeat.o(133442);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.h
 * JD-Core Version:    0.6.2
 */