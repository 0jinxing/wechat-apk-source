package com.tencent.mm.plugin.sns.ui.item;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.am.a;
import com.tencent.mm.plugin.sns.model.g;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.plugin.sns.ui.au;
import com.tencent.mm.plugin.sns.ui.av;
import com.tencent.mm.plugin.sns.ui.bc;
import com.tencent.mm.plugin.sns.ui.q;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.widget.b.a;
import java.util.LinkedList;

public final class f extends BaseTimeLineItem
{
  public final void a(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder, int paramInt1, av paramav, TimeLineObject paramTimeLineObject, int paramInt2, au paramau)
  {
    AppMethodBeat.i(40152);
    paramBaseViewHolder.rHF.setPosition(paramInt1);
    Object localObject1 = paramav.riA;
    Object localObject2 = paramav.qBY;
    paramInt1 = 0;
    int i;
    if (paramav.rgZ)
    {
      if (((n)localObject2).cqo().qUR == 2)
      {
        paramInt1 = 1;
        paramBaseViewHolder.rvR.setTag(paramBaseViewHolder);
        paramBaseViewHolder.rvR.setOnClickListener(paramau.qOL.rKs);
      }
      i = 0;
    }
    while (true)
    {
      label106: int j;
      if (paramInt1 != 0)
      {
        paramau.jMO.c(paramBaseViewHolder.rvR, paramau.qOL.rKa, paramau.qOL.rJH);
        if (paramTimeLineObject.xfI.wbJ != 9)
          break label1183;
        j = 1;
        label122: if (j == 0)
          break label1203;
        paramav = au.ZI(paramTimeLineObject.xfI.Url);
        label139: if ((paramTimeLineObject.xfI.wbJ != 9) && (paramTimeLineObject.xfI.wbJ != 14) && (paramTimeLineObject.xfI.wbJ != 12) && (paramTimeLineObject.xfI.wbJ != 13) && (paramInt1 == 0))
          break label1637;
      }
      label384: label409: label449: label1637: for (paramau = paramTimeLineObject.xfI.Desc; ; paramau = paramav)
      {
        paramav = paramTimeLineObject.xfI.Title;
        if ((paramav != null) && (paramav.length() > 40))
          paramav = paramav.substring(0, 40) + "...";
        while (true)
        {
          paramBaseViewHolder.rhd.setVisibility(8);
          Object localObject3;
          Object localObject4;
          if (!paramTimeLineObject.xfI.wbK.isEmpty())
          {
            paramBaseViewHolder.rHF.setVisibility(0);
            localObject1 = (bau)paramTimeLineObject.xfI.wbK.get(0);
            if (paramTimeLineObject.xfI.wbJ == 5)
            {
              paramav = ((bau)localObject1).Title;
              paramBaseViewHolder.rhd.setImageResource(2130840532);
              paramBaseViewHolder.rhd.setVisibility(0);
              localObject3 = af.cnC();
              localObject2 = paramBaseViewHolder.rHF;
              paramInt1 = this.mActivity.hashCode();
              localObject4 = az.dtg();
              ((az)localObject4).oyB = paramTimeLineObject.pcX;
              ((g)localObject3).a((bau)localObject1, (View)localObject2, 2131230817, paramInt1, (az)localObject4);
              if (bo.isNullOrNil(paramau))
                break label1525;
              paramBaseViewHolder.rHG.setVisibility(0);
              paramBaseViewHolder.rHG.setText(paramau);
              if (bo.isNullOrNil(paramav))
                break label1577;
              if (paramBaseViewHolder.rHG.getVisibility() != 8)
                break label1537;
              if (paramBaseViewHolder.rHH != 2)
                paramBaseViewHolder.gne.setMaxLines(2);
              paramBaseViewHolder.rHH = 2;
              paramBaseViewHolder.gne.setVisibility(0);
              if (i == 0)
                break label1561;
              paramBaseViewHolder.gne.setText(i.a(paramav, this.mActivity, paramBaseViewHolder.gne));
              AppMethodBeat.o(40152);
            }
          }
          while (true)
          {
            return;
            if (paramTimeLineObject.xfI.wbJ == 9)
            {
              if (paramTimeLineObject.xfI.wbK.size() <= 0)
                break label1643;
              paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
              paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rDu);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (paramTimeLineObject.xfI.wbJ == 10)
            {
              if (paramTimeLineObject.xfI.wbK.size() <= 0)
                break label1643;
              paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
              paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rDw);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (paramTimeLineObject.xfI.wbJ == 17)
            {
              if (paramTimeLineObject.xfI.wbK.size() <= 0)
                break label1643;
              paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
              paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rDx);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (paramTimeLineObject.xfI.wbJ == 22)
            {
              if (paramTimeLineObject.xfI.wbK.size() <= 0)
                break label1643;
              paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
              paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rDy);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (paramTimeLineObject.xfI.wbJ == 23)
            {
              if (paramTimeLineObject.xfI.wbK.size() <= 0)
                break label1643;
              paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
              paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rDz);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (paramTimeLineObject.xfI.wbJ == 14)
            {
              if (paramTimeLineObject.xfI.wbK.size() <= 0)
                break label1643;
              paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
              paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rDv);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (paramTimeLineObject.xfI.wbJ == 12)
            {
              if (paramTimeLineObject.xfI.wbK.size() <= 0)
                break label1643;
              paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
              paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rDD);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (paramTimeLineObject.xfI.wbJ == 13)
            {
              if (paramTimeLineObject.xfI.wbK.size() > 0)
              {
                paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
                paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rDE);
                paramInt1 = 0;
                i = 0;
                break;
              }
              paramBaseViewHolder.rvR.setOnClickListener(null);
              paramInt1 = 0;
              i = 0;
              break;
            }
            if (paramTimeLineObject.xfI.wbJ == 26)
            {
              paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
              paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rDF);
              paramInt1 = 0;
              i = 0;
              break;
            }
            paramBaseViewHolder.rvR.setTag(new q(paramTimeLineObject, (String)localObject1));
            paramBaseViewHolder.rvR.setOnClickListener(paramau.rqg.rvD);
            if ((paramTimeLineObject.fgt & 0x1) <= 0)
              break label1643;
            paramInt1 = 0;
            i = 1;
            break;
            paramau.jMO.c(paramBaseViewHolder.rvR, paramau.qOL.rJW, paramau.qOL.rJH);
            break label106;
            if ((am.a.coe() & 0x1) <= 0)
            {
              j = 1;
              break label122;
            }
            j = 0;
            break label122;
            paramav = "";
            break label139;
            if (paramTimeLineObject.xfI.wbJ == 18)
            {
              paramBaseViewHolder.rhd.setVisibility(0);
              paramBaseViewHolder.rhd.setImageResource(2130840532);
              paramBaseViewHolder.rHF.setVisibility(0);
              localObject4 = af.cnC();
              localObject2 = paramBaseViewHolder.rHF;
              paramInt1 = this.mActivity.hashCode();
              localObject3 = az.dtg();
              ((az)localObject3).oyB = paramTimeLineObject.pcX;
              ((g)localObject4).a((bau)localObject1, (View)localObject2, 2131230817, paramInt1, (az)localObject3);
              break label384;
            }
            if ((paramTimeLineObject.qNQ != null) && (!bo.isNullOrNil(paramTimeLineObject.qNQ.uaa)))
            {
              paramBaseViewHolder.rhd.setImageResource(2130840532);
              paramBaseViewHolder.rhd.setVisibility(0);
            }
            localObject2 = af.cnC();
            localObject3 = paramBaseViewHolder.rHF;
            paramInt1 = this.mActivity.hashCode();
            localObject4 = az.dtg();
            ((az)localObject4).oyB = paramTimeLineObject.pcX;
            ((g)localObject2).b((bau)localObject1, (View)localObject3, paramInt1, (az)localObject4);
            break label384;
            if (paramTimeLineObject.xfI.wbJ == 18)
            {
              paramBaseViewHolder.rhd.setVisibility(0);
              paramBaseViewHolder.rhd.setImageResource(2130840532);
              paramBaseViewHolder.rHF.setVisibility(0);
              af.cnC().a(paramBaseViewHolder.rHF, -1, 2131230817, this.mActivity.hashCode());
              break label384;
            }
            if (paramTimeLineObject.xfI.wbJ == 26)
            {
              paramBaseViewHolder.rHF.setVisibility(0);
              af.cnC().a(paramBaseViewHolder.rHF, -1, 2131231726, this.mActivity.hashCode());
              break label384;
            }
            paramBaseViewHolder.rHF.setVisibility(0);
            af.cnC().a(paramBaseViewHolder.rHF, -1, 2131230820, this.mActivity.hashCode());
            break label384;
            label1525: paramBaseViewHolder.rHG.setVisibility(8);
            break label409;
            if (paramBaseViewHolder.rHH != 1)
              paramBaseViewHolder.gne.setMaxLines(1);
            paramBaseViewHolder.rHH = 1;
            break label449;
            paramBaseViewHolder.gne.setText(paramav);
            AppMethodBeat.o(40152);
            continue;
            if (paramInt2 == 1)
            {
              paramBaseViewHolder.gne.setText(au.ZI(paramTimeLineObject.xfI.Url));
              paramBaseViewHolder.gne.setVisibility(0);
              AppMethodBeat.o(40152);
            }
            else
            {
              paramBaseViewHolder.gne.setVisibility(8);
              AppMethodBeat.o(40152);
            }
          }
        }
      }
      label1183: label1203: label1643: paramInt1 = 0;
      label1537: label1561: label1577: i = 0;
    }
  }

  public final void d(BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(40151);
    if ((paramBaseViewHolder.rHC != null) && (paramBaseViewHolder.rHC.getParent() != null))
    {
      paramBaseViewHolder.rHC.setLayoutResource(2130970780);
      if (!paramBaseViewHolder.rIm)
        paramBaseViewHolder.rIn = paramBaseViewHolder.rHC.inflate();
    }
    for (paramBaseViewHolder.rIm = true; ; paramBaseViewHolder.rIm = true)
    {
      paramBaseViewHolder.rvR = paramBaseViewHolder.rIn;
      paramBaseViewHolder.rHF = ((TagImageView)paramBaseViewHolder.rvR.findViewById(2131825687));
      paramBaseViewHolder.rhd = ((ImageView)paramBaseViewHolder.rvR.findViewById(2131824637));
      paramBaseViewHolder.rHG = ((TextView)paramBaseViewHolder.rvR.findViewById(2131825690));
      paramBaseViewHolder.gne = ((TextView)paramBaseViewHolder.rvR.findViewById(2131825689));
      paramBaseViewHolder.gne.setTextColor(this.mActivity.getResources().getColor(2131689761));
      i.b(paramBaseViewHolder.rHF, this.mActivity);
      AppMethodBeat.o(40151);
      return;
      paramBaseViewHolder.rIn = paramBaseViewHolder.mRR.findViewById(2131827798);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.item.f
 * JD-Core Version:    0.6.2
 */