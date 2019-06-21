package com.tencent.mm.plugin.sns.ui.item;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.ao;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.q;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.b.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class b extends BaseTimeLineItem
{
  public final void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, int paramInt2, au paramau)
  {
    AppMethodBeat.i(40134);
    paramBaseViewHolder.rHF.setPosition(paramInt1);
    Object localObject1 = paramav.riA;
    paramInt2 = paramTimeLineObject.xfI.wbK.size();
    if (paramInt2 > 0)
    {
      paramav = (bau)paramTimeLineObject.xfI.wbK.get(0);
      switch (paramTimeLineObject.xfI.wbJ)
      {
      default:
      case 1:
      case 15:
      }
    }
    while (true)
    {
      paramau.jMO.c(paramBaseViewHolder.rHF, paramau.qOL.rJY, paramau.qOL.rJH);
      AppMethodBeat.o(40134);
      return;
      paramBaseViewHolder.rHF.setOnClickListener(paramau.qOL.rjy);
      Object localObject2 = new ao();
      ((ao)localObject2).czD = ((String)localObject1);
      ((ao)localObject2).index = 0;
      localObject1 = new ArrayList();
      ((List)localObject1).add(paramBaseViewHolder.rHF);
      ((ao)localObject2).rsl = ((List)localObject1);
      ((ao)localObject2).rps = this.rps;
      ((ao)localObject2).position = paramInt1;
      paramBaseViewHolder.rHF.setTag(localObject2);
      paramBaseViewHolder.rHF.setVisibility(0);
      localObject2 = af.cnC();
      localObject1 = paramBaseViewHolder.rHF;
      paramInt1 = this.mActivity.hashCode();
      az localaz = az.dtg();
      localaz.oyB = paramTimeLineObject.pcX;
      ((g)localObject2).b(paramav, (View)localObject1, paramInt1, localaz);
      paramBaseViewHolder.rhd.setVisibility(8);
      paramBaseViewHolder.gne.setText(this.mActivity.getString(2131303738, new Object[] { Integer.valueOf(paramInt2) }));
      paramBaseViewHolder.gne.setVisibility(0);
      continue;
      paramBaseViewHolder.rHF.setTag(new q(paramTimeLineObject, (String)localObject1));
      paramBaseViewHolder.rHF.setOnClickListener(paramau.qOL.rKf);
      paramBaseViewHolder.rhd.setImageResource(2131231946);
      paramBaseViewHolder.rhd.setVisibility(0);
      paramBaseViewHolder.gne.setVisibility(8);
      localObject1 = af.cnC();
      localObject2 = paramBaseViewHolder.rHF;
      paramInt1 = this.mActivity.hashCode();
      localaz = az.dtg();
      localaz.oyB = paramTimeLineObject.pcX;
      ((g)localObject1).b(paramav, (View)localObject2, paramInt1, localaz);
    }
  }

  public final void d(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40133);
    int i = af.cnN();
    if (paramBaseViewHolder.rHC != null)
      if (!paramBaseViewHolder.rIm)
      {
        paramBaseViewHolder.rHC.setLayoutResource(2130970776);
        paramBaseViewHolder.rIn = paramBaseViewHolder.rHC.inflate();
      }
    for (paramBaseViewHolder.rIm = true; ; paramBaseViewHolder.rIm = true)
    {
      paramBaseViewHolder.rHF = ((TagImageView)paramBaseViewHolder.rIn.findViewById(2131827794));
      paramBaseViewHolder.rhd = ((ImageView)paramBaseViewHolder.rIn.findViewById(2131824637));
      paramBaseViewHolder.gne = ((TextView)paramBaseViewHolder.rIn.findViewById(2131827796));
      View localView = paramBaseViewHolder.rIn;
      ViewGroup.LayoutParams localLayoutParams = localView.getLayoutParams();
      localLayoutParams.height = i;
      localLayoutParams.width = i;
      localView.setLayoutParams(localLayoutParams);
      i.b(paramBaseViewHolder.rHF, this.mActivity);
      AppMethodBeat.o(40133);
      return;
      paramBaseViewHolder.rIn = paramBaseViewHolder.mRR.findViewById(2131827793);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.b
 * JD-Core Version:    0.6.2
 */