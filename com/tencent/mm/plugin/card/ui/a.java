package com.tencent.mm.plugin.card.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.d.l;
import com.tencent.mm.plugin.card.d.m;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.protocal.protobuf.oi;
import com.tencent.mm.protocal.protobuf.tm;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public final class a extends BaseAdapter
{
  List<CardInfo> khh;
  HashMap<String, Integer> kic;
  Context mContext;

  public a(Context paramContext)
  {
    AppMethodBeat.i(88211);
    this.khh = new ArrayList();
    this.kic = new HashMap();
    this.mContext = paramContext;
    AppMethodBeat.o(88211);
  }

  public final int getCount()
  {
    AppMethodBeat.i(88212);
    int i = this.khh.size();
    AppMethodBeat.o(88212);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88214);
    CardInfo localCardInfo = sY(paramInt);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130968890, null);
      paramViewGroup = new a.a(this);
      paramViewGroup.khS = ((RelativeLayout)paramView.findViewById(2131821912));
      paramViewGroup.kid = ((LinearLayout)paramView.findViewById(2131821913));
      paramViewGroup.khT = ((ImageView)paramView.findViewById(2131821914));
      paramViewGroup.khU = ((TextView)paramView.findViewById(2131821915));
      paramViewGroup.khV = ((TextView)paramView.findViewById(2131821917));
      paramViewGroup.khW = ((TextView)paramView.findViewById(2131821920));
      paramViewGroup.khY = ((TextView)paramView.findViewById(2131821921));
      paramViewGroup.kie = ((ImageView)paramView.findViewById(2131821916));
      paramViewGroup.kif = ((TextView)paramView.findViewById(2131821918));
      paramViewGroup.kig = ((TextView)paramView.findViewById(2131821919));
      paramView.setTag(paramViewGroup);
      if (!localCardInfo.aZI())
        break label959;
      paramViewGroup.khT.setVisibility(0);
      paramViewGroup.khV.setVisibility(0);
      paramViewGroup.khW.setVisibility(0);
      paramViewGroup.khY.setVisibility(8);
      paramViewGroup.khU.setVisibility(0);
      paramViewGroup.khU.setText(localCardInfo.aZV().kdg);
      if (!localCardInfo.aZF())
        break label726;
      if ((localCardInfo.aZV().vTW == null) || (localCardInfo.aZV().vTW.size() != 1))
        break label611;
      paramViewGroup.khV.setText(((tm)localCardInfo.aZV().vTW.get(0)).title);
      label306: if (localCardInfo.aZV().vUv != 1)
        break label746;
      paramViewGroup.kie.setVisibility(0);
      label328: long l = ((CardInfo)localCardInfo).field_begin_time;
      if ((localCardInfo.getEndTime() <= 0L) || (l <= 0L))
        break label758;
      paramViewGroup.khW.setText(this.mContext.getString(2131298014, new Object[] { l.fQ(l) + "  -  " + l.fQ(localCardInfo.getEndTime()) }));
      paramViewGroup.khW.setVisibility(0);
      label424: paramInt = this.mContext.getResources().getDimensionPixelSize(2131428175);
      m.a(paramViewGroup.khT, localCardInfo.aZV().kbV, paramInt, 2130839644, true);
      if (localCardInfo.aZV().vUt != 1)
        break label837;
      paramViewGroup.khT.setAlpha(255);
      paramViewGroup.kig.setVisibility(8);
      paramViewGroup.khV.setTextColor(this.mContext.getResources().getColor(2131689823));
      paramViewGroup.khU.setTextColor(this.mContext.getResources().getColor(2131689823));
      paramViewGroup.khW.setTextColor(this.mContext.getResources().getColor(2131690139));
      label548: paramInt = ((Integer)this.kic.get(localCardInfo.baa())).intValue();
      if (paramInt != 1)
        break label931;
      paramViewGroup.kif.setText("");
      paramViewGroup.kif.setVisibility(8);
    }
    while (true)
    {
      AppMethodBeat.o(88214);
      return paramView;
      paramViewGroup = (a.a)paramView.getTag();
      break;
      label611: if ((localCardInfo.aZV().vTW == null) || (localCardInfo.aZV().vTW.size() != 2))
        break label306;
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(((tm)localCardInfo.aZV().vTW.get(0)).title);
      localStringBuilder.append("-");
      localStringBuilder.append(((tm)localCardInfo.aZV().vTW.get(1)).title);
      paramViewGroup.khV.setText(localStringBuilder.toString());
      break label306;
      label726: paramViewGroup.khV.setText(localCardInfo.aZV().title);
      break label306;
      label746: paramViewGroup.kie.setVisibility(8);
      break label328;
      label758: if (localCardInfo.getEndTime() > 0L)
      {
        paramViewGroup.khW.setText(this.mContext.getString(2131298013, new Object[] { l.fQ(localCardInfo.getEndTime()) }));
        paramViewGroup.khW.setVisibility(0);
        break label424;
      }
      paramViewGroup.khW.setText("");
      paramViewGroup.khW.setVisibility(8);
      break label424;
      label837: paramViewGroup.kig.setText(localCardInfo.aZV().vUu);
      paramViewGroup.khT.setAlpha(90);
      paramViewGroup.kig.setVisibility(0);
      paramViewGroup.khV.setTextColor(this.mContext.getResources().getColor(2131690139));
      paramViewGroup.khU.setTextColor(this.mContext.getResources().getColor(2131690139));
      paramViewGroup.khW.setTextColor(this.mContext.getResources().getColor(2131690139));
      break label548;
      label931: paramViewGroup.kif.setText("x".concat(String.valueOf(paramInt)));
      paramViewGroup.kif.setVisibility(0);
      continue;
      label959: paramViewGroup.khT.setVisibility(8);
      paramViewGroup.khV.setVisibility(8);
      paramViewGroup.khU.setVisibility(8);
      paramViewGroup.khW.setVisibility(8);
      paramViewGroup.kig.setVisibility(8);
      paramViewGroup.kif.setVisibility(8);
      paramViewGroup.khY.setVisibility(0);
      paramViewGroup.khS.setBackgroundColor(this.mContext.getResources().getColor(2131689843));
      paramViewGroup.khY.setText(this.mContext.getResources().getString(2131297936));
    }
  }

  public final CardInfo sY(int paramInt)
  {
    AppMethodBeat.i(88213);
    CardInfo localCardInfo = (CardInfo)this.khh.get(paramInt);
    AppMethodBeat.o(88213);
    return localCardInfo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.a
 * JD-Core Version:    0.6.2
 */