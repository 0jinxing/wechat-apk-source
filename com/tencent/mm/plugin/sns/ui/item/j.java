package com.tencent.mm.plugin.sns.ui.item;

import android.app.Activity;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.a.b.e;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.AsyncNormalTextView;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.az;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import java.util.LinkedList;

public final class j extends BaseTimeLineItem
{
  private int mScreenHeight;
  private int mScreenWidth;
  private b.e rJj;

  public j()
  {
    AppMethodBeat.i(40169);
    this.rJj = new j.1(this);
    AppMethodBeat.o(40169);
  }

  public final void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, int paramInt2, final au paramau)
  {
    AppMethodBeat.i(40171);
    bau localbau;
    n localn;
    label157: com.tencent.mm.plugin.sns.model.g localg;
    boolean bool;
    label305: Object localObject1;
    Object localObject2;
    if ((paramTimeLineObject.xfI != null) && (paramTimeLineObject.xfI.wbK.size() > 0))
    {
      localbau = (bau)paramTimeLineObject.xfI.wbK.get(0);
      ab.v("MicroMsg.VideoTimeLineItem", "videoTImeline %d ", new Object[] { Integer.valueOf(paramInt1) });
      localn = af.cnF().YS(paramBaseViewHolder.cFc);
      if ((!paramav.rgZ) || (localbau == null))
        break label881;
      final long l = paramav.rAt;
      paramBaseViewHolder.rGD.qzM.setOnCompletionListener(new b.e()
      {
        public final void c(com.tencent.mm.plugin.sight.decode.a.b paramAnonymousb, int paramAnonymousInt)
        {
          AppMethodBeat.i(40167);
          if (paramAnonymousInt != -1)
            if ((paramau == null) || (paramau.rxP == null) || (paramau.rxP.rhm == null))
              AppMethodBeat.o(40167);
          while (true)
          {
            return;
            paramau.rxP.rhm.u(l, false);
            AppMethodBeat.o(40167);
          }
        }
      });
      if (!paramau.rxP.rhm.jO(l))
        paramBaseViewHolder.rGD.qzM.setOnDecodeDurationListener(new j.3(this, paramau, l, paramBaseViewHolder));
      paramBaseViewHolder.rGD.a(paramTimeLineObject, paramInt1, paramav.riA, paramav.rgZ);
      paramBaseViewHolder.rGD.raQ.setVisibility(8);
      localg = af.cnC();
      if ((paramTimeLineObject.xfI == null) || (paramTimeLineObject.xfI.wbK.size() <= 0))
        break label1836;
      l = System.nanoTime();
      bool = com.tencent.mm.plugin.sns.model.g.t(localbau);
      ab.i("MicroMsg.VideoTimeLineItem", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.nanoTime() - l) });
      if (bool)
        break label1209;
      if (!localg.w(localbau))
        break label962;
      paramBaseViewHolder.rGD.raP.setVisibility(8);
      paramBaseViewHolder.rGD.rnu.setVisibility(0);
      paramBaseViewHolder.rGD.rnu.dKB();
      localObject1 = com.tencent.mm.modelsns.e.a(paramBaseViewHolder.timeLineObject, paramBaseViewHolder.rGD.qzM.getUIContext(), paramav.rgZ);
      if (!paramav.rgZ)
        break label1859;
      localObject2 = paramav.qBY.cqo();
      paramInt2 = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
      if ((localObject2 == null) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH <= 0.0F) || (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI <= 0.0F))
        break label1859;
      float f1 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUJ, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUK);
      float f2 = com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUJ, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUK);
      if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUG != 0)
        break label1590;
      float f3 = f1;
      if (f1 >= paramInt2 - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 12))
      {
        f3 = paramInt2 - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 12);
        f2 = (int)(((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI * f3 / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH);
      }
      localObject1 = Pair.create(Integer.valueOf((int)f3), Integer.valueOf((int)f2));
    }
    label558: label962: label1859: 
    while (true)
    {
      paramInt2 = ((Integer)((Pair)localObject1).first).intValue();
      int i = ((Integer)((Pair)localObject1).second).intValue();
      paramBaseViewHolder.rGD.qzM.fi(paramInt2, i);
      localObject1 = paramBaseViewHolder.rGD.rnv.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).width = paramInt2;
      ((ViewGroup.LayoutParams)localObject1).height = i;
      paramBaseViewHolder.rGD.rnv.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramBaseViewHolder.rGD.qzM.setTagObject(paramBaseViewHolder.rGD);
      localObject2 = paramBaseViewHolder.rGD.qzM;
      paramInt2 = this.mActivity.hashCode();
      localObject1 = az.dtg();
      ((az)localObject1).oyB = paramTimeLineObject.pcX;
      localg.a(localn, localbau, (com.tencent.mm.plugin.sight.decode.a.a)localObject2, paramInt2, paramInt1, (az)localObject1, paramav.rgZ);
      paramBaseViewHolder.rGD.rnt.setTag(paramBaseViewHolder.rGD);
      paramTimeLineObject = an.fZ(af.getAccSnsPath(), localbau.Id);
      localObject1 = com.tencent.mm.plugin.sns.data.i.j(localbau);
      if (com.tencent.mm.vfs.e.ct(paramTimeLineObject + (String)localObject1))
      {
        paramau.rxP.rhm.v(paramav.rAt, true);
        if (!paramav.rgZ)
          break label1811;
        if (af.cnC().b(localn, null) != 5)
          break label1805;
        bool = true;
        paramau.rxP.rhm.c(paramav.rAt, bool, false);
      }
      while (true)
      {
        if ((localn != null) && (!localn.coP()))
          paramau.jMO.c(paramBaseViewHolder.rGD.rnt, paramau.qOL.rJX, paramau.qOL.rJH);
        AppMethodBeat.o(40171);
        return;
        localbau = null;
        break;
        label881: if (paramBaseViewHolder.rGD == null)
          break label157;
        if (paramBaseViewHolder.rGD.rnv != null)
          paramBaseViewHolder.rGD.rnv.setVisibility(8);
        if (paramBaseViewHolder.rGD.qzM == null)
          break label157;
        paramBaseViewHolder.rGD.qzM.setOnSightCompletionAction(null);
        paramBaseViewHolder.rGD.qzM.setOnCompletionListener(null);
        paramBaseViewHolder.rGD.qzM.setOnDecodeDurationListener(null);
        break label157;
        if ((paramav.rgZ) && (localg.b(localn, null) == 5))
        {
          localg.A(localbau);
          paramBaseViewHolder.rGD.raP.setVisibility(8);
          paramBaseViewHolder.rGD.rnu.setVisibility(0);
          paramBaseViewHolder.rGD.rnu.dKB();
          break label305;
        }
        if (localg.x(localbau))
        {
          paramBaseViewHolder.rGD.rnu.setVisibility(8);
          paramBaseViewHolder.rGD.raP.setImageResource(2130840197);
          paramBaseViewHolder.rGD.raP.setVisibility(0);
          break label305;
        }
        localg.y(localbau);
        paramBaseViewHolder.rGD.raP.setVisibility(0);
        paramBaseViewHolder.rGD.rnu.setVisibility(8);
        paramBaseViewHolder.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
        paramBaseViewHolder.rGD.raP.setContentDescription(this.mActivity.getString(2131301953));
        if ((!paramav.rgZ) && (localg.a(localn, null) == 4))
        {
          paramBaseViewHolder.rGD.raQ.setVisibility(0);
          break label305;
        }
        if ((!paramav.rgZ) || (localg.b(localn, null) != 4))
          break label305;
        paramBaseViewHolder.rGD.raQ.setVisibility(0);
        break label305;
        if (localg.u(localbau))
        {
          paramBaseViewHolder.rGD.raP.setVisibility(0);
          paramBaseViewHolder.rGD.rnu.setVisibility(8);
          paramBaseViewHolder.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
          paramBaseViewHolder.rGD.raP.setContentDescription(this.mActivity.getString(2131301953));
        }
        while (true)
        {
          if (!paramBaseViewHolder.rGD.qzM.ckY())
            break label1588;
          ab.d("MicroMsg.VideoTimeLineItem", "play video error " + localbau.Id + " " + localbau.Url + " " + localbau.wEH + " " + paramInt1);
          localg.y(localbau);
          paramBaseViewHolder.rGD.raP.setVisibility(0);
          paramBaseViewHolder.rGD.rnu.setVisibility(8);
          paramBaseViewHolder.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
          paramBaseViewHolder.rGD.raP.setContentDescription(this.mActivity.getString(2131301953));
          break;
          if (localg.v(localbau))
          {
            paramBaseViewHolder.rGD.raP.setVisibility(8);
            paramBaseViewHolder.rGD.rnu.setVisibility(8);
          }
          else if ((paramav.rgZ) && (localg.b(localn, null) <= 5))
          {
            paramBaseViewHolder.rGD.raP.setVisibility(8);
            paramBaseViewHolder.rGD.rnu.setVisibility(8);
          }
          else
          {
            localg.y(localbau);
            paramBaseViewHolder.rGD.raP.setVisibility(0);
            paramBaseViewHolder.rGD.rnu.setVisibility(8);
            paramBaseViewHolder.rGD.raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
            paramBaseViewHolder.rGD.raP.setContentDescription(this.mActivity.getString(2131301953));
          }
        }
        break label305;
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUG == 1)
        {
          paramInt2 = paramInt2 - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 12);
          localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH)));
          paramBaseViewHolder.rHz.setLayoutParams(new LinearLayout.LayoutParams(paramInt2, -2));
          break label558;
        }
        if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUG != 2)
          break label1859;
        paramInt2 = paramInt2 - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 12) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 12);
        localObject1 = Pair.create(Integer.valueOf(paramInt2), Integer.valueOf((int)(paramInt2 * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH)));
        paramBaseViewHolder.rHz.setLayoutParams(new LinearLayout.LayoutParams(paramInt2, -2));
        break label558;
        paramau.rxP.rhm.v(paramav.rAt, false);
        break label784;
        bool = false;
        break label807;
        if (af.cnC().a(localn, null) == 5)
        {
          bool = true;
          break label807;
        }
        bool = false;
        break label807;
        localg.a(paramBaseViewHolder.rGD.qzM, this.mActivity.hashCode());
      }
    }
  }

  public final void d(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40170);
    Object localObject = new DisplayMetrics();
    this.mActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    this.mScreenWidth = ((DisplayMetrics)localObject).widthPixels;
    this.mScreenHeight = ((DisplayMetrics)localObject).heightPixels;
    if (paramBaseViewHolder.rHC != null)
    {
      paramBaseViewHolder.rHC.setLayoutResource(2130970778);
      paramBaseViewHolder.rIq = ((ViewStub)paramBaseViewHolder.mRR.findViewById(2131827717));
      if (!paramBaseViewHolder.rIr)
        paramBaseViewHolder.rGD.rns = paramBaseViewHolder.rIq.inflate();
    }
    for (paramBaseViewHolder.rIr = true; ; paramBaseViewHolder.rIr = true)
    {
      paramBaseViewHolder.rGD.rnt = paramBaseViewHolder.rGD.rns.findViewById(2131822515);
      paramBaseViewHolder.rGD.qzM = ((com.tencent.mm.plugin.sight.decode.a.a)paramBaseViewHolder.rGD.rns.findViewById(2131820629));
      paramBaseViewHolder.rGD.rnt.setOnClickListener(this.qPr.qOL.rKe);
      paramBaseViewHolder.rGD.raP = ((ImageView)paramBaseViewHolder.rGD.rns.findViewById(2131820981));
      paramBaseViewHolder.rGD.rnu = ((MMPinProgressBtn)paramBaseViewHolder.rGD.rns.findViewById(2131821370));
      paramBaseViewHolder.rGD.rnv = ((TextView)paramBaseViewHolder.rGD.rns.findViewById(2131827571));
      paramBaseViewHolder.rGD.raQ = ((TextView)paramBaseViewHolder.rGD.rns.findViewById(2131827572));
      com.tencent.mm.kernel.g.RQ();
      if (((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(344065, Boolean.FALSE)).booleanValue())
      {
        localObject = (TextView)((ViewStub)paramBaseViewHolder.rGD.rns.findViewById(2131822619)).inflate();
        paramBaseViewHolder.rGD.qzM.setSightInfoView((TextView)localObject);
      }
      AppMethodBeat.o(40170);
      return;
      paramBaseViewHolder.rGD.rns = paramBaseViewHolder.mRR.findViewById(2131827797);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.j
 * JD-Core Version:    0.6.2
 */