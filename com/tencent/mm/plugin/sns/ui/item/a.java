package com.tencent.mm.plugin.sns.ui.item;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Color;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.plugin.sns.storage.b.f;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.v;
import com.tencent.mm.plugin.sns.ui.AsyncNormalTextView;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.aj;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.widget.SnsCardAdTagListView;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.QImageView.a;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;
import java.util.List;

public final class a extends BaseTimeLineItem
{
  public final void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, int paramInt2, au paramau)
  {
    AppMethodBeat.i(40132);
    ab.i("MiroMsg.CardAdTimeLineItem", "fill card ad item %d", new Object[] { Integer.valueOf(paramInt1) });
    if (paramBaseViewHolder.eBB)
    {
      ab.i("MiroMsg.CardAdTimeLineItem", "holder is busy");
      AppMethodBeat.o(40132);
      return;
    }
    paramBaseViewHolder.eBB = true;
    Object localObject1 = (a.a)paramBaseViewHolder;
    Object localObject2 = paramau.DP(paramInt1);
    ((a.a)localObject1).rIM.setVisibility(8);
    ((a.a)localObject1).rGG.setVisibility(8);
    ((a.a)localObject1).rIL.setVisibility(8);
    ((a.a)localObject1).rGM.setVisibility(8);
    ((a.a)localObject1).rGM.setTag("");
    if (paramBaseViewHolder.rHz != null)
      paramBaseViewHolder.rHz.setVisibility(8);
    Object localObject3 = (WindowManager)this.mActivity.getSystemService("window");
    int i = Math.min(((WindowManager)localObject3).getDefaultDisplay().getWidth(), ((WindowManager)localObject3).getDefaultDisplay().getHeight());
    ((a.a)paramBaseViewHolder).rHB.setOnClickListener(paramau.qOL.rKn);
    localObject3 = new LinearLayout.LayoutParams(i - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 54) - this.mActivity.getResources().getDimensionPixelSize(2131427786) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427858), -2);
    ((LinearLayout.LayoutParams)localObject3).topMargin = this.mActivity.getResources().getDimensionPixelSize(2131427796);
    ((LinearLayout.LayoutParams)localObject3).bottomMargin = com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 2);
    ((a.a)paramBaseViewHolder).rIE.setLayoutParams((ViewGroup.LayoutParams)localObject3);
    paramau.jMO.c(paramBaseViewHolder.rHB, paramau.qOL.rJZ, paramau.qOL.rJH);
    localObject3 = (RelativeLayout.LayoutParams)((a.a)localObject1).rGX.getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject3).leftMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((RelativeLayout.LayoutParams)localObject3).rightMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((RelativeLayout.LayoutParams)localObject3).topMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((RelativeLayout.LayoutParams)localObject3).bottomMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((a.a)localObject1).rGX.setLayoutParams((ViewGroup.LayoutParams)localObject3);
    localObject3 = (RelativeLayout.LayoutParams)paramBaseViewHolder.rGD.rns.getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject3).leftMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((RelativeLayout.LayoutParams)localObject3).rightMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((RelativeLayout.LayoutParams)localObject3).topMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((RelativeLayout.LayoutParams)localObject3).bottomMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    paramBaseViewHolder.rGD.rns.setLayoutParams((ViewGroup.LayoutParams)localObject3);
    localObject3 = (RelativeLayout.LayoutParams)((a.a)localObject1).rGM.getLayoutParams();
    ((RelativeLayout.LayoutParams)localObject3).leftMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((RelativeLayout.LayoutParams)localObject3).rightMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((RelativeLayout.LayoutParams)localObject3).topMargin = com.tencent.mm.bz.a.al(this.mActivity, 2131427796);
    ((a.a)localObject1).rGM.setLayoutParams((ViewGroup.LayoutParams)localObject3);
    ((a.a)localObject1).rIE.setBackgroundResource(2130840250);
    if (((a.a)localObject1).rIO != null)
      ((a.a)localObject1).rIO.setVisibility(0);
    label602: label744: int j;
    label660: label716: label858: int k;
    int m;
    int n;
    label965: label1016: Object localObject4;
    if (((a.a)localObject1).rIN != null)
    {
      if (!bo.isNullOrNil(((n)localObject2).cqo().qUS))
        ((a.a)localObject1).rIN.setVisibility(0);
    }
    else
    {
      localObject3 = ((n)localObject2).cqq();
      if ((localObject3 != null) && (((com.tencent.mm.plugin.sns.storage.a)localObject3).coI()) && (!((n)localObject2).crg()))
        ((a.a)localObject1).rIM.setVisibility(0);
      if (!bo.isNullOrNil(((n)localObject2).cqo().qUT))
        break label1731;
      localObject3 = paramTimeLineObject.xfF;
      if (bo.isNullOrNil((String)localObject3))
        break label1744;
      ((a.a)localObject1).rIO.setText((String)localObject3 + " ");
      j.h(((a.a)localObject1).rIO, 2);
      ((a.a)localObject1).rIO.setVisibility(0);
      localObject3 = ((n)localObject2).cqo().qUS;
      if (!bo.isNullOrNil((String)localObject3))
        break label1757;
      ((a.a)localObject1).rIN.setVisibility(8);
      ((a.a)localObject1).rIL.removeAllViews();
      if (((n)localObject2).cqo().qUW.size() > 0)
      {
        ((a.a)localObject1).rIL.setVisibility(0);
        ((a.a)localObject1).rIL.setTagSpace(com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 6));
        ((a.a)localObject1).rIL.dB(((n)localObject2).cqo().qUW);
      }
      if (bo.isNullOrNil(((n)localObject2).cqo().qUU))
        break label1808;
      ((a.a)localObject1).rGM.setVisibility(0);
      ((a.a)localObject1).rIK.setVisibility(0);
      ((a.a)localObject1).rIK.setText(((n)localObject2).cqo().qUU);
      if (((n)localObject2).cqo().qUG != 1)
        break label1820;
      j = com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 54);
      k = com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 54);
      m = this.mActivity.getResources().getDimensionPixelSize(2131427786);
      paramInt2 = this.mActivity.getResources().getDimensionPixelSize(2131427812);
      n = this.mActivity.getResources().getDimensionPixelSize(2131427858);
      paramBaseViewHolder.rHz.setContentWidth(i - j - k - m - paramInt2 - n);
      paramBaseViewHolder.rHz.crz();
      ((a.a)localObject1).rGM.setTag(((n)localObject2).cqo().qUV);
      if (bo.isNullOrNil(((n)localObject2).cqo().qUV))
        break label1916;
      h.a(((n)localObject2).cqo().qUV, new a.1(this, (a.a)localObject1));
      if ((((n)localObject2).cqo().coR()) || (((n)localObject2).cqo().coS()))
      {
        ((a.a)localObject1).rGG.setVisibility(0);
        j = Color.parseColor("#cdcdcd");
        k = Color.parseColor("#ffffff");
        m = 1;
        paramInt2 = m;
        if (((n)localObject2).cqo().coS())
        {
          n = v.gr(((n)localObject2).cqo().qVh.qVu, ((n)localObject2).crc());
          paramInt2 = m;
          if (n > 0)
          {
            paramInt2 = m;
            if (n <= 2)
            {
              if (n != 1)
                break label1928;
              ((a.a)localObject1).rII.setBackgroundColor(k);
              ((a.a)localObject1).rII.setTextColor(j);
              ((a.a)localObject1).rII.setText(((n)localObject2).cqo().qVh.Dm(1));
              ((a.a)localObject1).rIH.setBackgroundResource(2130840254);
              ((a.a)localObject1).rIH.setTextColor(-16777216);
              ((a.a)localObject1).rIH.setText(((n)localObject2).cqo().qVh.Dl(0));
              label1209: paramInt2 = 0;
            }
          }
        }
        if (paramInt2 != 0)
        {
          ((a.a)localObject1).rIH.setTextColor(-16777216);
          ((a.a)localObject1).rIH.setBackgroundResource(2130840254);
          ((a.a)localObject1).rII.setTextColor(-16777216);
          ((a.a)localObject1).rII.setBackgroundResource(2130840254);
          ((a.a)localObject1).rIH.setText(((n)localObject2).cqo().coL());
          ((a.a)localObject1).rII.setText(((n)localObject2).cqo().coM());
        }
      }
      ((a.a)localObject1).rGX.setScaleType(QImageView.a.zNT);
      ((SightPlayImageView)((a.a)localObject1).rGD.qzM).qyI = true;
      ((SightPlayImageView)((a.a)localObject1).rGD.qzM).setScaleType(QImageView.a.zNT);
      if ((paramTimeLineObject.xfI == null) || (paramTimeLineObject.xfI.wbK.size() <= 0))
        break label2019;
      localObject3 = (bau)paramTimeLineObject.xfI.wbK.get(0);
      label1375: paramBaseViewHolder.rGD.a(paramTimeLineObject, paramInt1, paramav.riA, paramav.rgZ);
      paramBaseViewHolder.rGD.raQ.setVisibility(8);
      localObject4 = af.cnC();
      if (localObject3 != null)
      {
        paramInt2 = i - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427858) - this.mActivity.getResources().getDimensionPixelSize(2131427796) - this.mActivity.getResources().getDimensionPixelSize(2131427796);
        m = (int)(paramInt2 * ((bau)localObject3).wEK.wFy / ((bau)localObject3).wEK.wFx);
        if (paramBaseViewHolder.timeLineObject.xfI.wbJ != 1)
          break label2025;
        ((a.a)localObject1).rGX.setVisibility(0);
        ((a.a)localObject1).rGD.rns.setVisibility(4);
        paramav = ((a.a)localObject1).rGX.getLayoutParams();
        paramav.width = paramInt2;
        paramav.height = m;
        ((a.a)localObject1).rGX.setLayoutParams(paramav);
        localObject2 = af.cnC();
        paramav = ((a.a)localObject1).rGX;
        paramInt1 = this.mActivity.hashCode();
        localObject4 = az.dtg();
        ((az)localObject4).oyB = paramTimeLineObject.pcX;
        ((com.tencent.mm.plugin.sns.model.g)localObject2).b((bau)localObject3, paramav, -1, paramInt1, (az)localObject4);
        ((a.a)localObject1).rGX.setTag(localObject1);
        ((a.a)localObject1).rIH.setTag(localObject1);
        ((a.a)localObject1).rII.setTag(localObject1);
        ((a.a)localObject1).rGX.setOnClickListener(paramau.qOL.rjy);
        paramau.jMO.c(((a.a)localObject1).rGX, paramau.qOL.rJZ, paramau.qOL.rJH);
      }
    }
    while (true)
    {
      paramBaseViewHolder.eBB = false;
      AppMethodBeat.o(40132);
      break;
      ((a.a)localObject1).rIN.setVisibility(8);
      break label602;
      label1731: localObject3 = ((n)localObject2).cqo().qUT;
      break label660;
      label1744: ((a.a)localObject1).rIO.setVisibility(8);
      break label716;
      label1757: ((a.a)localObject1).rIN.setText((String)localObject3 + " ");
      j.h(((a.a)localObject1).rIN, 2);
      ((a.a)localObject1).rIN.setVisibility(0);
      break label744;
      label1808: ((a.a)localObject1).rIK.setVisibility(4);
      break label858;
      label1820: if (((n)localObject2).cqo().qUG != 2)
        break label965;
      k = com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 54);
      j = this.mActivity.getResources().getDimensionPixelSize(2131427786);
      paramInt2 = this.mActivity.getResources().getDimensionPixelSize(2131427812);
      m = this.mActivity.getResources().getDimensionPixelSize(2131427858);
      paramBaseViewHolder.rHz.setContentWidth(i - k - j - paramInt2 - m);
      paramBaseViewHolder.rHz.crz();
      break label965;
      label1916: ((a.a)localObject1).rIJ.setVisibility(4);
      break label1016;
      label1928: if (n != 2)
        break label1209;
      ((a.a)localObject1).rIH.setBackgroundColor(k);
      ((a.a)localObject1).rIH.setTextColor(j);
      ((a.a)localObject1).rIH.setText(((n)localObject2).cqo().qVh.Dm(0));
      ((a.a)localObject1).rII.setBackgroundResource(2130840254);
      ((a.a)localObject1).rII.setTextColor(-16777216);
      ((a.a)localObject1).rII.setText(((n)localObject2).cqo().qVh.Dl(1));
      break label1209;
      label2019: localObject3 = null;
      break label1375;
      label2025: if ((paramBaseViewHolder.timeLineObject.xfI.wbJ == 5) || (paramBaseViewHolder.timeLineObject.xfI.wbJ == 15))
      {
        ((a.a)localObject1).rGD.rns.setVisibility(0);
        ((a.a)localObject1).rGX.setVisibility(4);
        paramau.jMO.c(((a.a)localObject1).rGD.rnt, paramau.qOL.rJZ, paramau.qOL.rJH);
        Object localObject5 = ((a.a)localObject1).rGD.rns.getLayoutParams();
        ((ViewGroup.LayoutParams)localObject5).width = paramInt2;
        ((ViewGroup.LayoutParams)localObject5).height = m;
        ((a.a)localObject1).rGD.rns.setLayoutParams((ViewGroup.LayoutParams)localObject5);
        ((a.a)localObject1).rGD.qzM.fi(paramInt2, m);
        ((a.a)localObject1).rGD.qzM.setOnCompletionListener(new a.2(this, paramau, paramav));
        if (!paramau.rxP.rhm.jO(paramav.rAt))
          ((a.a)localObject1).rGD.qzM.setOnDecodeDurationListener(new a.3(this, paramau, paramav, (a.a)localObject1));
        long l = System.nanoTime();
        boolean bool = com.tencent.mm.plugin.sns.model.g.t((bau)localObject3);
        ab.i("MiroMsg.CardAdTimeLineItem", "isMediaSightExist %b duration %s", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.nanoTime() - l) });
        localObject5 = ((a.a)localObject1).rGD;
        if (!bool)
          if (((com.tencent.mm.plugin.sns.model.g)localObject4).w((bau)localObject3))
          {
            ((aj)localObject5).raP.setVisibility(8);
            ((aj)localObject5).rnu.setVisibility(0);
            ((aj)localObject5).rnu.dKB();
            ((a.a)localObject1).rIH.setTag(localObject1);
            ((a.a)localObject1).rII.setTag(localObject1);
            ((aj)localObject5).qzM.setTagObject(localObject5);
            ((aj)localObject5).rnt.setTag(localObject1);
            localObject5 = ((aj)localObject5).qzM;
            paramInt2 = this.mActivity.hashCode();
            localObject1 = az.dtg();
            ((az)localObject1).oyB = paramTimeLineObject.pcX;
            ((com.tencent.mm.plugin.sns.model.g)localObject4).a((n)localObject2, (bau)localObject3, (com.tencent.mm.plugin.sight.decode.a.a)localObject5, paramInt2, paramInt1, (az)localObject1, paramav.rgZ, true);
            paramTimeLineObject = an.fZ(af.getAccSnsPath(), ((bau)localObject3).Id);
            localObject3 = com.tencent.mm.plugin.sns.data.i.j((bau)localObject3);
            if (!e.ct(paramTimeLineObject + (String)localObject3))
              break label3037;
            paramau.rxP.rhm.v(paramav.rAt, true);
            if (af.cnC().b((n)localObject2, null) != 5)
              break label3056;
          }
        label3056: for (bool = true; ; bool = false)
        {
          paramau.rxP.rhm.c(paramav.rAt, bool, false);
          break;
          if (((com.tencent.mm.plugin.sns.model.g)localObject4).b((n)localObject2, null) == 5)
          {
            ((com.tencent.mm.plugin.sns.model.g)localObject4).A((bau)localObject3);
            ((aj)localObject5).raP.setVisibility(8);
            ((aj)localObject5).rnu.setVisibility(0);
            ((aj)localObject5).rnu.dKB();
            break label2325;
          }
          if (((com.tencent.mm.plugin.sns.model.g)localObject4).x((bau)localObject3))
          {
            ((aj)localObject5).rnu.setVisibility(8);
            ((aj)localObject5).raP.setImageResource(2130840197);
            ((aj)localObject5).raP.setVisibility(0);
            break label2325;
          }
          ((com.tencent.mm.plugin.sns.model.g)localObject4).y((bau)localObject3);
          ((aj)localObject5).raP.setVisibility(0);
          ((aj)localObject5).rnu.setVisibility(8);
          ((aj)localObject5).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
          ((aj)localObject5).raP.setContentDescription(this.mActivity.getString(2131301953));
          if (((com.tencent.mm.plugin.sns.model.g)localObject4).b((n)localObject2, null) != 4)
            break label2325;
          ((aj)localObject5).raQ.setVisibility(0);
          break label2325;
          if (((com.tencent.mm.plugin.sns.model.g)localObject4).u((bau)localObject3))
          {
            ((aj)localObject5).raP.setVisibility(0);
            ((aj)localObject5).rnu.setVisibility(8);
            ((aj)localObject5).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
            ((aj)localObject5).raP.setContentDescription(this.mActivity.getString(2131301953));
          }
          while (true)
          {
            if (!((aj)localObject5).qzM.ckY())
              break label3035;
            ab.d("MiroMsg.CardAdTimeLineItem", "play video error " + ((bau)localObject3).Id + " " + ((bau)localObject3).Url + " " + ((bau)localObject3).wEH + " " + paramInt1);
            ((com.tencent.mm.plugin.sns.model.g)localObject4).y((bau)localObject3);
            ((aj)localObject5).raP.setVisibility(0);
            ((aj)localObject5).rnu.setVisibility(8);
            ((aj)localObject5).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
            ((aj)localObject5).raP.setContentDescription(this.mActivity.getString(2131301953));
            break;
            if (((com.tencent.mm.plugin.sns.model.g)localObject4).v((bau)localObject3))
            {
              ((aj)localObject5).raP.setVisibility(8);
              ((aj)localObject5).rnu.setVisibility(8);
            }
            else if (((com.tencent.mm.plugin.sns.model.g)localObject4).b((n)localObject2, null) <= 5)
            {
              ((aj)localObject5).raP.setVisibility(8);
              ((aj)localObject5).rnu.setVisibility(8);
            }
            else
            {
              ((com.tencent.mm.plugin.sns.model.g)localObject4).y((bau)localObject3);
              ((aj)localObject5).raP.setVisibility(0);
              ((aj)localObject5).rnu.setVisibility(8);
              ((aj)localObject5).raP.setImageDrawable(com.tencent.mm.bz.a.g(this.mActivity, 2131231923));
              ((aj)localObject5).raP.setContentDescription(this.mActivity.getString(2131301953));
            }
          }
          break label2325;
          paramau.rxP.rhm.v(paramav.rAt, false);
          break label2482;
        }
      }
      label2325: label2482: label3035: label3037: ((com.tencent.mm.plugin.sns.model.g)localObject4).a(paramBaseViewHolder.rGD.qzM, this.mActivity.hashCode());
      paramBaseViewHolder.rGD.rnv.setVisibility(8);
      paramBaseViewHolder.rGD.qzM.setOnSightCompletionAction(null);
      paramBaseViewHolder.rGD.qzM.setOnCompletionListener(null);
      paramBaseViewHolder.rGD.qzM.setOnDecodeDurationListener(null);
    }
  }

  public final void d(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40131);
    a.a locala = (a.a)paramBaseViewHolder;
    if (paramBaseViewHolder.rHC != null)
    {
      paramBaseViewHolder.rHC.setLayoutResource(2130970713);
      if (!paramBaseViewHolder.rHD)
      {
        locala.rIE = ((ViewGroup)paramBaseViewHolder.rHC.inflate());
        paramBaseViewHolder.rHD = true;
      }
    }
    while (true)
    {
      locala.rIF = ((ViewGroup)locala.rIE.findViewById(2131827604));
      locala.rIG = ((ViewGroup)locala.rIE.findViewById(2131827607));
      locala.rGX = ((MaskImageView)locala.rIE.findViewById(2131827605));
      locala.rGX.setOnClickListener(this.qPr.qOL.rjy);
      this.qPr.jMO.c(locala.rGX, this.qPr.qOL.rJV, this.qPr.qOL.rJH);
      locala.rIO = ((TextView)locala.rIE.findViewById(2131827609));
      locala.rIO.setClickable(false);
      locala.rIO.setLongClickable(false);
      locala.rIN = ((TextView)locala.rIE.findViewById(2131827608));
      locala.rIN.setClickable(false);
      locala.rIN.setLongClickable(false);
      locala.rGD = new aj();
      locala.rGD.rnt = locala.rIE.findViewById(2131827606);
      locala.rGD.rns = locala.rGD.rnt;
      locala.rGD.rnt.setOnClickListener(this.qPr.qOL.rKe);
      locala.rGD.qzM = ((com.tencent.mm.plugin.sight.decode.a.a)locala.rGD.rnt.findViewById(2131820629));
      locala.rGD.raP = ((ImageView)locala.rGD.rnt.findViewById(2131820981));
      locala.rGD.rnu = ((MMPinProgressBtn)locala.rGD.rnt.findViewById(2131821370));
      locala.rGD.rnv = ((TextView)locala.rGD.rnt.findViewById(2131827571));
      locala.rGD.raQ = ((TextView)locala.rGD.rnt.findViewById(2131827572));
      locala.rGM = locala.rIE.findViewById(2131827874);
      locala.rIJ = ((ImageView)locala.rIE.findViewById(2131827875));
      locala.rIK = ((TextView)locala.rIE.findViewById(2131827876));
      locala.rIM = locala.rIE.findViewById(2131827614);
      locala.rGG = locala.rIE.findViewById(2131827611);
      locala.rIH = ((Button)locala.rIE.findViewById(2131827612));
      locala.rII = ((Button)locala.rIE.findViewById(2131827613));
      locala.rIH.setOnClickListener(this.qPr.qOL.rKl);
      locala.rII.setOnClickListener(this.qPr.qOL.rKm);
      locala.rIL = ((SnsCardAdTagListView)locala.rIE.findViewById(2131827610));
      locala.rIL.setActivityContext(this.mActivity);
      AppMethodBeat.o(40131);
      return;
      if (!paramBaseViewHolder.rHD)
      {
        locala.rIE = ((ViewGroup)paramBaseViewHolder.mRR.findViewById(2131827603));
        paramBaseViewHolder.rHD = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.a
 * JD-Core Version:    0.6.2
 */