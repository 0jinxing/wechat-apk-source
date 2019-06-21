package com.tencent.mm.plugin.sns.ui.item;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.sns.ui.AsyncTextView;
import com.tencent.mm.plugin.sns.ui.PhotosContent;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ao;
import com.tencent.mm.plugin.sns.ui.aq;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.d.b;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bav;
import com.tencent.mm.protocal.protobuf.cbf;
import com.tencent.mm.protocal.protobuf.cbu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.az;
import java.util.ArrayList;
import java.util.List;

public final class d extends BaseTimeLineItem
{
  private int rqj = 103;

  public final void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, int paramInt2, au paramau)
  {
    AppMethodBeat.i(40148);
    String str = paramav.riA;
    Object localObject;
    int i;
    boolean bool;
    if (paramBaseViewHolder.rIy != null)
    {
      if ((paramav.rAJ) && (paramBaseViewHolder.qCX.xaE != null) && (paramBaseViewHolder.qCX.xaE.xbg > 0))
        paramBaseViewHolder.rIy.setBackgroundResource(2130838857);
    }
    else
    {
      localObject = paramBaseViewHolder.rHT.DT(0);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localObject);
      ao localao = new ao();
      localao.czD = str;
      localao.index = 0;
      localao.rsl = localArrayList;
      localao.rps = this.rps;
      if (localObject != null)
        ((TagImageView)localObject).setTag(localao);
      localObject = paramav.rBj;
      paramBaseViewHolder.rfi = ((bav)localObject);
      if (localObject == null)
        break label469;
      if (!r.Yz().equals(paramTimeLineObject.jBB))
        break label259;
      paramBaseViewHolder.rHT.setVisibility(0);
      paramau = paramau.rpY;
      paramBaseViewHolder = paramBaseViewHolder.rHT;
      paramav = paramav.riA;
      i = this.mActivity.hashCode();
      bool = this.rps;
      localObject = az.dtg();
      ((az)localObject).oyB = paramTimeLineObject.pcX;
      paramau.a(paramBaseViewHolder, paramTimeLineObject, paramav, i, paramInt2, paramInt1, bool, (az)localObject, true);
      AppMethodBeat.o(40148);
    }
    while (true)
    {
      return;
      paramBaseViewHolder.rIy.setBackgroundResource(2130838856);
      break;
      label259: if (paramav.rAM)
      {
        paramBaseViewHolder.rHT.setVisibility(0);
        paramau = paramau.rpY;
        paramBaseViewHolder = paramBaseViewHolder.rHT;
        localObject = paramav.riA;
        i = this.mActivity.hashCode();
        bool = this.rps;
        paramav = az.dtg();
        paramav.oyB = paramTimeLineObject.pcX;
        paramau.a(paramBaseViewHolder, paramTimeLineObject, (String)localObject, i, paramInt2, paramInt1, bool, paramav, false);
        AppMethodBeat.o(40148);
      }
      else if (((bav)localObject).cRU == 0)
      {
        paramBaseViewHolder.rHT.setVisibility(0);
        paramau = paramau.rpY;
        paramBaseViewHolder = paramBaseViewHolder.rHT;
        localObject = paramav.riA;
        i = this.mActivity.hashCode();
        bool = this.rps;
        paramav = az.dtg();
        paramav.oyB = paramTimeLineObject.pcX;
        paramau.a(paramBaseViewHolder, paramTimeLineObject, (String)localObject, i, paramInt2, paramInt1, bool, paramav, true);
        AppMethodBeat.o(40148);
      }
      else
      {
        ab.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo.hbStatus is " + ((bav)localObject).cRU);
        AppMethodBeat.o(40148);
        continue;
        label469: ab.e("MiroMsg.HBRewardTimeLineItem", "mediaPostInfo is null " + paramav.riA);
        AppMethodBeat.o(40148);
      }
    }
  }

  public final void d(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40147);
    paramBaseViewHolder.rHM.setImageResource(2130839217);
    paramBaseViewHolder.rHw.setTextColor(-2730427);
    if (paramBaseViewHolder.rHC != null)
    {
      paramBaseViewHolder.rHC.setLayoutResource(2130970763);
      if (!paramBaseViewHolder.rHD)
        paramBaseViewHolder.rHT = ((PhotosContent)paramBaseViewHolder.rHC.inflate());
    }
    for (paramBaseViewHolder.rHD = true; ; paramBaseViewHolder.rHD = true)
    {
      ab.i("MiroMsg.HBRewardTimeLineItem", "viewtype " + this.klY);
      TagImageView localTagImageView = (TagImageView)paramBaseViewHolder.rHT.findViewById(aq.rur[0]);
      paramBaseViewHolder.rHT.a(localTagImageView);
      localTagImageView.setOnClickListener(this.qPr.qOL.rjy);
      AppMethodBeat.o(40147);
      return;
      paramBaseViewHolder.rHT = ((PhotosContent)paramBaseViewHolder.mRR.findViewById(2131827765));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.d
 * JD-Core Version:    0.6.2
 */