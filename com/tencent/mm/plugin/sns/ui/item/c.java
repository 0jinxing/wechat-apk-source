package com.tencent.mm.plugin.sns.ui.item;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.GradientDrawable.Orientation;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.b.c;
import com.tencent.mm.plugin.sns.storage.b.c.a;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.widget.SnsDrawGestureView;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.QImageView.a;
import com.tencent.mm.ui.widget.RoundedCornerRelativeLayout;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

public final class c extends BaseTimeLineItem
{
  private void a(c.a parama)
  {
    AppMethodBeat.i(40145);
    al.d(new c.5(this, parama));
    AppMethodBeat.o(40145);
  }

  public final void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, int paramInt2, au paramau)
  {
    AppMethodBeat.i(40144);
    ab.i("MicroMsg.FullCardAdTimeLineItem", "fill full card ad item %d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramBaseViewHolder.eBB)
    {
      ab.i("MicroMsg.FullCardAdTimeLineItem", "holder is busy");
      AppMethodBeat.o(40144);
      return;
    }
    c.a locala = (c.a)paramBaseViewHolder;
    n localn = paramav.qBY;
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (localn != null)
    {
      localObject2 = localObject1;
      if (localn.cqo() != null)
        localObject2 = localn.cqo().qUY;
    }
    localObject1 = (WindowManager)this.mActivity.getSystemService("window");
    paramInt2 = Math.min(((WindowManager)localObject1).getDefaultDisplay().getWidth(), ((WindowManager)localObject1).getDefaultDisplay().getHeight());
    locala.rGQ.setVisibility(8);
    locala.rGS.setVisibility(8);
    locala.rGT.setVisibility(8);
    locala.rGR.setVisibility(8);
    locala.rGU.setVisibility(8);
    locala.rGV.setVisibility(8);
    locala.rGW.setVisibility(8);
    c.a.b(locala).setVisibility(8);
    locala.rGD.qzM.setOnCompletionListener(null);
    locala.rGD.qzM.setOnDecodeDurationListener(null);
    a(locala);
    if (localObject2 != null)
    {
      paramInt2 = paramInt2 - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 54) - this.mActivity.getResources().getDimensionPixelSize(2131427786) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427858);
      if (((b.c)localObject2).qVk == 0)
      {
        localObject1 = new ViewGroup.LayoutParams(-2, -2);
        ((ViewGroup.LayoutParams)localObject1).width = paramInt2;
        ((ViewGroup.LayoutParams)localObject1).height = ((int)(((ViewGroup.LayoutParams)localObject1).width * 0.75F));
      }
    }
    while (true)
    {
      label343: Object localObject3;
      if (localObject1 != null)
      {
        localObject3 = locala.roq.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject3).width = ((ViewGroup.LayoutParams)localObject1).width;
        ((ViewGroup.LayoutParams)localObject3).height = ((ViewGroup.LayoutParams)localObject1).height;
        locala.roq.setLayoutParams((ViewGroup.LayoutParams)localObject3);
        ((RoundedCornerRelativeLayout)locala.roq).setRadius(8.0F);
        localObject3 = locala.rGX.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject3).width = ((ViewGroup.LayoutParams)localObject1).width;
        ((ViewGroup.LayoutParams)localObject3).height = ((ViewGroup.LayoutParams)localObject1).height;
        locala.rGX.setLayoutParams((ViewGroup.LayoutParams)localObject3);
        localObject3 = locala.rGD.rns.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject3).width = ((ViewGroup.LayoutParams)localObject1).width;
        ((ViewGroup.LayoutParams)localObject3).height = ((ViewGroup.LayoutParams)localObject1).height;
        locala.rGD.rns.setLayoutParams((ViewGroup.LayoutParams)localObject3);
        locala.rGD.qzM.fi(((ViewGroup.LayoutParams)localObject1).width, ((ViewGroup.LayoutParams)localObject1).height);
      }
      int i;
      if (((b.c)localObject2).qVm == 0)
      {
        i = Color.argb((int)(((b.c)localObject2).qVl * 2.55F), 0, 0, 0);
        paramInt2 = Color.argb(0, 0, 0, 0);
        localObject1 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[] { i, paramInt2 });
        ((GradientDrawable)localObject1).setGradientType(0);
        locala.rGQ.setBackground((Drawable)localObject1);
        if ((!bo.isNullOrNil(((b.c)localObject2).title)) || (!bo.isNullOrNil(((b.c)localObject2).description)))
          locala.rGQ.setVisibility(0);
        if (!bo.isNullOrNil(((b.c)localObject2).title))
        {
          locala.rGS.setVisibility(0);
          localObject1 = locala.rGS;
          localObject3 = com.tencent.mm.cb.g.dqQ();
          locala.rGS.getContext();
          ((TextView)localObject1).setText(((com.tencent.mm.cb.g)localObject3).b(((b.c)localObject2).title, locala.rGS.getTextSize()));
        }
        if (!bo.isNullOrNil(((b.c)localObject2).description))
        {
          locala.rGT.setVisibility(0);
          localObject1 = locala.rGT;
          localObject3 = com.tencent.mm.cb.g.dqQ();
          locala.rGT.getContext();
          ((TextView)localObject1).setText(((com.tencent.mm.cb.g)localObject3).b(((b.c)localObject2).description, locala.rGT.getTextSize()));
        }
        label747: if (localn.cqq().coI())
        {
          paramInt2 = Color.argb((int)(((b.c)localObject2).qVl * 2.55F), 0, 0, 0);
          i = Color.argb(0, 0, 0, 0);
          localObject1 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[] { paramInt2, i });
          ((GradientDrawable)localObject1).setGradientType(0);
          locala.rGR.setVisibility(0);
          locala.rGR.setBackground((Drawable)localObject1);
          locala.rGW.setVisibility(0);
        }
        label845: if ((paramTimeLineObject.xfI == null) || (paramTimeLineObject.xfI.wbK.size() <= 0))
          break label1364;
      }
      label1364: for (localObject1 = (bau)paramTimeLineObject.xfI.wbK.get(0); ; localObject1 = null)
      {
        paramBaseViewHolder.rGD.a(paramTimeLineObject, paramInt1, paramav.riA, paramav.rgZ);
        paramBaseViewHolder.rGD.raQ.setVisibility(8);
        localObject3 = af.cnC();
        if (localObject1 == null)
          break label2368;
        if (paramTimeLineObject.xfI.wbJ != 1)
          break label1370;
        locala.rGX.setVisibility(0);
        locala.rGD.rns.setVisibility(4);
        localObject2 = locala.rGX;
        paramInt1 = this.mActivity.hashCode();
        paramav = az.dtg();
        paramav.oyB = paramTimeLineObject.pcX;
        ((com.tencent.mm.plugin.sns.model.g)localObject3).b((bau)localObject1, (View)localObject2, -1, paramInt1, paramav);
        locala.rGX.setTag(paramBaseViewHolder);
        locala.rGX.setOnClickListener(paramau.qOL.rKn);
        AppMethodBeat.o(40144);
        break;
        if (((b.c)localObject2).qVk != 1)
          break label2447;
        localObject1 = new ViewGroup.LayoutParams(-2, -2);
        ((ViewGroup.LayoutParams)localObject1).width = paramInt2;
        ((ViewGroup.LayoutParams)localObject1).height = ((ViewGroup.LayoutParams)localObject1).width;
        break label343;
        if (((b.c)localObject2).qVm != 1)
          break label747;
        i = Color.argb((int)(((b.c)localObject2).qVl * 2.55F), 0, 0, 0);
        paramInt2 = Color.argb(0, 0, 0, 0);
        localObject1 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[] { i, paramInt2 });
        ((GradientDrawable)localObject1).setGradientType(0);
        locala.rGR.setBackground((Drawable)localObject1);
        if ((!bo.isNullOrNil(((b.c)localObject2).title)) || (!bo.isNullOrNil(((b.c)localObject2).description)))
        {
          locala.rGR.setVisibility(0);
          localObject1 = (RelativeLayout.LayoutParams)locala.rGW.getLayoutParams();
          ((RelativeLayout.LayoutParams)localObject1).topMargin = com.tencent.mm.bz.a.fromDPToPix(locala.roq.getContext(), 4);
          locala.rGW.setLayoutParams((ViewGroup.LayoutParams)localObject1);
        }
        if (!bo.isNullOrNil(((b.c)localObject2).title))
        {
          locala.rGU.setVisibility(0);
          localObject3 = locala.rGU;
          localObject1 = com.tencent.mm.cb.g.dqQ();
          locala.rGU.getContext();
          ((TextView)localObject3).setText(((com.tencent.mm.cb.g)localObject1).b(((b.c)localObject2).title, locala.rGU.getTextSize()));
        }
        if (bo.isNullOrNil(((b.c)localObject2).description))
          break label747;
        locala.rGV.setVisibility(0);
        localObject1 = locala.rGV;
        localObject3 = com.tencent.mm.cb.g.dqQ();
        locala.rGV.getContext();
        ((TextView)localObject1).setText(((com.tencent.mm.cb.g)localObject3).b(((b.c)localObject2).description, locala.rGV.getTextSize()));
        break label747;
        ab.e("MicroMsg.FullCardAdTimeLineItem", "invalid full card");
        break label845;
      }
      label1370: if ((paramTimeLineObject.xfI.wbJ == 15) || (paramTimeLineObject.xfI.wbJ == 5))
      {
        locala.rGD.qzM.setOnCompletionListener(new c.1(this, paramau, paramav));
        locala.rGD.qzM.setOnDecodeDurationListener(new c.2(this, paramau, paramav, locala, (b.c)localObject2, localn));
        localObject2 = ((b.c)localObject2).qVn;
        String str = localn.cqo().coW();
        if ((!bo.isNullOrNil(str)) && (localObject2 != null) && (((b.c.a)localObject2).startTime >= 0L) && (((b.c.a)localObject2).endTime > ((b.c.a)localObject2).startTime))
          d.post(new c.3(this, str), "preDownloadFloatPage");
        long l = System.nanoTime();
        boolean bool = com.tencent.mm.plugin.sns.model.g.t((bau)localObject1);
        ab.i("MicroMsg.FullCardAdTimeLineItem", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.nanoTime() - l) });
        localObject2 = locala.rGD;
        if (!bool)
          if (((com.tencent.mm.plugin.sns.model.g)localObject3).w((bau)localObject1))
          {
            ((aj)localObject2).raP.setVisibility(8);
            ((aj)localObject2).rnu.setVisibility(0);
            ((aj)localObject2).rnu.dKB();
            locala.rGD.rns.setVisibility(0);
            locala.rGX.setVisibility(4);
            ((aj)localObject2).qzM.setTagObject(localObject2);
            ((aj)localObject2).rnt.setTag(paramBaseViewHolder);
            locala.rGD.rns.setOnClickListener(paramau.qOL.rKn);
            localObject2 = ((aj)localObject2).qzM;
            paramInt2 = this.mActivity.hashCode();
            paramBaseViewHolder = az.dtg();
            paramBaseViewHolder.oyB = paramTimeLineObject.pcX;
            ((com.tencent.mm.plugin.sns.model.g)localObject3).a(localn, (bau)localObject1, (com.tencent.mm.plugin.sight.decode.a.a)localObject2, paramInt2, paramInt1, paramBaseViewHolder, paramav.rgZ, true);
            paramBaseViewHolder = an.fZ(af.getAccSnsPath(), ((bau)localObject1).Id);
            paramTimeLineObject = com.tencent.mm.plugin.sns.data.i.j((bau)localObject1);
            if (!e.ct(paramBaseViewHolder + paramTimeLineObject))
              break label2343;
            paramau.rxP.rhm.v(paramav.rAt, true);
            label1783: if (af.cnC().b(localn, null) != 5)
              break label2362;
          }
        for (bool = true; ; bool = false)
        {
          paramau.rxP.rhm.c(paramav.rAt, bool, false);
          AppMethodBeat.o(40144);
          break;
          if (((com.tencent.mm.plugin.sns.model.g)localObject3).b(localn, null) == 5)
          {
            ((com.tencent.mm.plugin.sns.model.g)localObject3).A((bau)localObject1);
            ((aj)localObject2).raP.setVisibility(8);
            ((aj)localObject2).rnu.setVisibility(0);
            ((aj)localObject2).rnu.dKB();
            break label1612;
          }
          if (((com.tencent.mm.plugin.sns.model.g)localObject3).x((bau)localObject1))
          {
            ((aj)localObject2).rnu.setVisibility(8);
            ((aj)localObject2).raP.setImageResource(2130840197);
            ((aj)localObject2).raP.setVisibility(0);
            break label1612;
          }
          ((com.tencent.mm.plugin.sns.model.g)localObject3).y((bau)localObject1);
          ((aj)localObject2).raP.setVisibility(0);
          ((aj)localObject2).rnu.setVisibility(8);
          ((aj)localObject2).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
          ((aj)localObject2).raP.setContentDescription(this.mActivity.getString(2131301953));
          if (((com.tencent.mm.plugin.sns.model.g)localObject3).b(localn, null) != 4)
            break label1612;
          ((aj)localObject2).raQ.setVisibility(0);
          break label1612;
          if (((com.tencent.mm.plugin.sns.model.g)localObject3).u((bau)localObject1))
          {
            ((aj)localObject2).raP.setVisibility(0);
            ((aj)localObject2).rnu.setVisibility(8);
            ((aj)localObject2).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
            ((aj)localObject2).raP.setContentDescription(this.mActivity.getString(2131301953));
          }
          while (true)
          {
            if (!((aj)localObject2).qzM.ckY())
              break label2341;
            ab.d("MicroMsg.FullCardAdTimeLineItem", "play video error " + ((bau)localObject1).Id + " " + ((bau)localObject1).Url + " " + ((bau)localObject1).wEH + " " + paramInt1);
            ((com.tencent.mm.plugin.sns.model.g)localObject3).y((bau)localObject1);
            ((aj)localObject2).raP.setVisibility(0);
            ((aj)localObject2).rnu.setVisibility(8);
            ((aj)localObject2).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
            ((aj)localObject2).raP.setContentDescription(this.mActivity.getString(2131301953));
            break;
            if (((com.tencent.mm.plugin.sns.model.g)localObject3).v((bau)localObject1))
            {
              ((aj)localObject2).raP.setVisibility(8);
              ((aj)localObject2).rnu.setVisibility(8);
            }
            else if (((com.tencent.mm.plugin.sns.model.g)localObject3).b(localn, null) <= 5)
            {
              ((aj)localObject2).raP.setVisibility(8);
              ((aj)localObject2).rnu.setVisibility(8);
            }
            else
            {
              ((com.tencent.mm.plugin.sns.model.g)localObject3).y((bau)localObject1);
              ((aj)localObject2).raP.setVisibility(0);
              ((aj)localObject2).rnu.setVisibility(8);
              ((aj)localObject2).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
              ((aj)localObject2).raP.setContentDescription(this.mActivity.getString(2131301953));
            }
          }
          break label1612;
          paramau.rxP.rhm.v(paramav.rAt, false);
          break label1783;
        }
        ((com.tencent.mm.plugin.sns.model.g)localObject3).a(paramBaseViewHolder.rGD.qzM, this.mActivity.hashCode());
        paramBaseViewHolder.rGD.rnv.setVisibility(8);
        paramBaseViewHolder.rGD.qzM.setOnSightCompletionAction(null);
        paramBaseViewHolder.rGD.qzM.setOnCompletionListener(null);
        paramBaseViewHolder.rGD.qzM.setOnDecodeDurationListener(null);
      }
      label1612: AppMethodBeat.o(40144);
      label2341: label2343: label2362: label2368: break;
      label2447: localObject1 = null;
    }
  }

  public final void d(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40143);
    c.a locala = (c.a)paramBaseViewHolder;
    if (paramBaseViewHolder.rHC != null)
    {
      paramBaseViewHolder.rHC.setLayoutResource(2130970812);
      if (!paramBaseViewHolder.rHD)
      {
        locala.roq = paramBaseViewHolder.rHC.inflate();
        paramBaseViewHolder.rHD = true;
      }
    }
    while (true)
    {
      locala.rGQ = locala.mRR.findViewById(2131827880);
      locala.rGR = locala.mRR.findViewById(2131827883);
      locala.rGS = ((TextView)locala.mRR.findViewById(2131827881));
      locala.rGT = ((TextView)locala.mRR.findViewById(2131827882));
      locala.rGU = ((TextView)locala.mRR.findViewById(2131827884));
      locala.rGV = ((TextView)locala.mRR.findViewById(2131827885));
      locala.rGX = ((MaskImageView)locala.mRR.findViewById(2131827878));
      locala.rGW = locala.mRR.findViewById(2131827886);
      locala.rGX.setScaleType(QImageView.a.zNT);
      locala.rGD = new aj();
      locala.rGD.rnt = locala.roq.findViewById(2131827879);
      locala.rGD.rns = locala.rGD.rnt;
      locala.rGD.rnt.setOnClickListener(this.qPr.qOL.rKe);
      locala.rGD.qzM = ((com.tencent.mm.plugin.sight.decode.a.a)locala.rGD.rnt.findViewById(2131820629));
      locala.rGD.raP = ((ImageView)locala.rGD.rnt.findViewById(2131820981));
      locala.rGD.rnu = ((MMPinProgressBtn)locala.rGD.rnt.findViewById(2131821370));
      locala.rGD.rnv = ((TextView)locala.rGD.rnt.findViewById(2131827571));
      locala.rGD.raQ = ((TextView)locala.rGD.rnt.findViewById(2131827572));
      ((SightPlayImageView)locala.rGD.qzM).qyI = true;
      ((SightPlayImageView)locala.rGD.qzM).setScaleType(QImageView.a.zNT);
      c.a.a(locala, (SnsDrawGestureView)locala.mRR.findViewById(2131827887));
      AppMethodBeat.o(40143);
      return;
      if (!paramBaseViewHolder.rHD)
      {
        locala.roq = paramBaseViewHolder.mRR.findViewById(2131827877);
        paramBaseViewHolder.rHD = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.c
 * JD-Core Version:    0.6.2
 */