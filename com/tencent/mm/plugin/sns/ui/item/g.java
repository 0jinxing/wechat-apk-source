package com.tencent.mm.plugin.sns.ui.item;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.WindowManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.h;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.MaskImageView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.aq;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.baw;
import com.tencent.mm.protocal.protobuf.ds;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.QImageView.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class g extends BaseTimeLineItem
{
  private MaskImageView rIT;
  private int rqi;
  private int rqj = 103;

  @TargetApi(16)
  public final void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, int paramInt2, au paramau)
  {
    AppMethodBeat.i(40155);
    if (paramBaseViewHolder.rHT == null)
    {
      AppMethodBeat.o(40155);
      return;
    }
    paramBaseViewHolder.rHT.setVisibility(0);
    Object localObject1;
    label37: int i;
    Object localObject2;
    float f1;
    float f2;
    Object localObject3;
    if (paramTimeLineObject.xfH == null)
    {
      localObject1 = null;
      if (!bo.isNullOrNil((String)localObject1))
        com.tencent.mm.plugin.sns.c.a.gkF.a((String)localObject1, paramTimeLineObject.jBB, paramTimeLineObject.xfM, paramav.rAt);
      localObject1 = new LinkedList();
      i = ((WindowManager)this.mActivity.getSystemService("window")).getDefaultDisplay().getWidth();
      if ((paramav.rgZ) && (paramInt2 == 2))
      {
        localObject2 = paramav.qBY.cqo();
        if ((localObject2 != null) && (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH > 0.0F) && (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI > 0.0F))
        {
          f1 = i.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUJ, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUK);
          f2 = i.a(((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI, 1, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUJ, ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUK);
          if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUG != 0)
            break label531;
          localObject3 = new baw();
          ((baw)localObject3).wFx = f1;
          ((baw)localObject3).wFy = f2;
          if (f1 >= i - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427812))
          {
            ((baw)localObject3).wFx = (i - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427812));
            ((baw)localObject3).wFy = ((int)(((baw)localObject3).wFx * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH));
          }
          ((baw)localObject3).wFz = (((baw)localObject3).wFx * ((baw)localObject3).wFy);
          ((LinkedList)localObject1).add(localObject3);
        }
      }
    }
    while (true)
    {
      if (!bo.isNullOrNil(((com.tencent.mm.plugin.sns.storage.b)localObject2).qUM))
      {
        localObject4 = paramBaseViewHolder.rHT;
        localObject3 = paramBaseViewHolder.rHT.DT(0);
        h.c("adId", ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUM, false, 41, new g.1(this, (PhotosContent)localObject4, (com.tencent.mm.plugin.sns.storage.b)localObject2, (TagImageView)localObject3));
      }
      localObject2 = paramau.rpY;
      paramau = paramBaseViewHolder.rHT;
      localObject3 = paramav.riA;
      i = this.mActivity.hashCode();
      boolean bool1 = paramav.rgZ;
      boolean bool2 = this.rps;
      Object localObject4 = az.dtg();
      ((az)localObject4).oyB = paramTimeLineObject.pcX;
      ((aq)localObject2).a(paramau, paramTimeLineObject, (String)localObject3, i, paramInt2, paramInt1, bool1, bool2, (az)localObject4, (List)localObject1, paramav.rAs);
      paramBaseViewHolder.rHT.DT(0).setScaleType(QImageView.a.zNT);
      AppMethodBeat.o(40155);
      break;
      localObject1 = paramTimeLineObject.xfH.Id;
      break label37;
      label531: int j;
      if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUG == 1)
      {
        i = i - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427812);
        j = (int)(i * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH);
        localObject3 = new baw();
        if (i > 0)
          f1 = i;
        ((baw)localObject3).wFx = f1;
        if (j > 0)
          f2 = j;
        while (true)
        {
          ((baw)localObject3).wFy = f2;
          ((baw)localObject3).wFz = (((baw)localObject3).wFx * ((baw)localObject3).wFy);
          ((LinkedList)localObject1).add(localObject3);
          break;
        }
      }
      if (((com.tencent.mm.plugin.sns.storage.b)localObject2).qUG == 2)
      {
        j = i - com.tencent.mm.bz.a.fromDPToPix(this.mActivity, 50) - this.mActivity.getResources().getDimensionPixelSize(2131427812) - this.mActivity.getResources().getDimensionPixelSize(2131427812);
        i = (int)(j * ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUI / ((com.tencent.mm.plugin.sns.storage.b)localObject2).qUH);
        localObject3 = new baw();
        if (j > 0)
          f1 = j;
        ((baw)localObject3).wFx = f1;
        if (i > 0)
          f2 = i;
        ((baw)localObject3).wFy = f2;
        ((baw)localObject3).wFz = (((baw)localObject3).wFx * ((baw)localObject3).wFy);
        ((LinkedList)localObject1).add(localObject3);
      }
    }
  }

  public final void d(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40154);
    Object localObject = new DisplayMetrics();
    this.mActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    ab.i("MiroMsg.PhotoTimeLineItem", "viewtype " + this.klY);
    this.rqi = af.cnN();
    if ((paramBaseViewHolder.rHC != null) && (paramBaseViewHolder.rHC.getParent() != null) && ((paramBaseViewHolder.rHC.getParent() instanceof ViewGroup)))
      if (this.klY == 2)
      {
        paramBaseViewHolder.rHC.setLayoutResource(2130970819);
        if (!paramBaseViewHolder.rHD)
          paramBaseViewHolder.rHT = ((PhotosContent)paramBaseViewHolder.rHC.inflate());
      }
    for (paramBaseViewHolder.rHD = true; ; paramBaseViewHolder.rHD = true)
    {
      paramBaseViewHolder.rHT.rlN.clear();
      for (int i = 0; i < aq.run[this.klY]; i++)
      {
        localObject = (TagImageView)paramBaseViewHolder.rHT.findViewById(aq.rur[i]);
        paramBaseViewHolder.rHT.a((TagImageView)localObject);
        ((TagImageView)localObject).setOnClickListener(this.qPr.qOL.rjy);
        this.qPr.jMO.c((View)localObject, this.qPr.qOL.rJV, this.qPr.qOL.rJH);
      }
      if (this.klY == 3)
      {
        paramBaseViewHolder.rHC.setLayoutResource(2130970816);
        break;
      }
      if (this.klY == 4)
      {
        paramBaseViewHolder.rHC.setLayoutResource(2130970817);
        break;
      }
      if (this.klY == 5)
      {
        paramBaseViewHolder.rHC.setLayoutResource(2130970818);
        break;
      }
      ab.e("MiroMsg.PhotoTimeLineItem", "error viewtyoe in photo item  " + this.klY);
      break;
      paramBaseViewHolder.rHT = ((PhotosContent)paramBaseViewHolder.mRR.findViewById(2131827892));
    }
    paramBaseViewHolder.rHT.setImageViewWidth(this.rqi);
    AppMethodBeat.o(40154);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.g
 * JD-Core Version:    0.6.2
 */