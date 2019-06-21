package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.w;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import java.util.LinkedList;
import java.util.List;

public final class i extends BaseAdapter
{
  private Context mContext;
  private LayoutInflater mInflater;
  int nSA;
  private List<w> nSx;
  String nSy;
  boolean nSz;
  View.OnClickListener ohU;
  i.b ohV;

  public i(Context paramContext)
  {
    AppMethodBeat.i(43030);
    this.nSx = new LinkedList();
    this.nSA = 1;
    this.ohV = null;
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    AppMethodBeat.o(43030);
  }

  private w yk(int paramInt)
  {
    AppMethodBeat.i(43033);
    w localw = (w)this.nSx.get(paramInt);
    AppMethodBeat.o(43033);
    return localw;
  }

  public final void ck(List<w> paramList)
  {
    AppMethodBeat.i(43031);
    if (paramList == null)
      new LinkedList();
    while (true)
    {
      notifyDataSetChanged();
      AppMethodBeat.o(43031);
      return;
      this.nSx = paramList;
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(43032);
    int i = this.nSx.size();
    AppMethodBeat.o(43032);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(43034);
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130969996, paramViewGroup, false);
      paramViewGroup = new i.c(this);
      paramViewGroup.kRR = paramView.findViewById(2131820987);
      paramViewGroup.kEn = ((ImageView)paramView.findViewById(2131825654));
      paramViewGroup.niS = ((TextView)paramView.findViewById(2131825655));
      paramViewGroup.nSC = ((TextView)paramView.findViewById(2131825659));
      paramViewGroup.nSD = ((TextView)paramView.findViewById(2131825656));
      paramViewGroup.nSE = ((TextView)paramView.findViewById(2131825658));
      paramViewGroup.nSF = ((TextView)paramView.findViewById(2131825657));
      paramViewGroup.nSG = ((ImageView)paramView.findViewById(2131825660));
      paramViewGroup.nSH = ((TextView)paramView.findViewById(2131825661));
      if (this.ohV != null)
        this.ohV.a(paramViewGroup, this.mContext);
      paramView.setTag(paramViewGroup);
    }
    w localw;
    while (true)
    {
      localw = yk(paramInt);
      x.b(paramViewGroup.kEn, localw.nYa, localw.userName);
      if ((!bo.nullAsNil(localw.nWX).equals(this.nSy)) || (!this.nSz))
        break;
      paramViewGroup.nSF.setOnClickListener(this.ohU);
      paramViewGroup.nSF.setVisibility(0);
      paramViewGroup.nSE.setVisibility(8);
      paramViewGroup.nSC.setVisibility(8);
      x.a(this.mContext, paramViewGroup.niS, localw.nXZ);
      String str = this.mContext.getString(2131301173, new Object[] { e.F(localw.nXM / 100.0D) });
      paramViewGroup.nSD.setText(str);
      if (!bo.isNullOrNil(localw.nYc))
        break label453;
      paramViewGroup.nSG.setVisibility(8);
      paramViewGroup.nSH.setVisibility(8);
      AppMethodBeat.o(43034);
      return paramView;
      paramViewGroup = (i.c)paramView.getTag();
    }
    if (bo.isNullOrNil(localw.nYb))
      paramViewGroup.nSE.setVisibility(8);
    while (true)
    {
      paramViewGroup.nSC.setText(x.j(this.mContext, bo.getLong(localw.nXN, 0L) * 1000L));
      paramViewGroup.nSC.setVisibility(0);
      paramViewGroup.nSF.setVisibility(8);
      break;
      x.a(this.mContext, paramViewGroup.nSE, localw.nYb);
      paramViewGroup.nSE.setVisibility(0);
    }
    label453: paramViewGroup.nSH.setText(localw.nYc);
    if (this.nSA == 2)
      paramViewGroup.nSG.setImageResource(2130839291);
    while (true)
    {
      paramViewGroup.nSG.setVisibility(0);
      paramViewGroup.nSH.setVisibility(0);
      break;
      paramViewGroup.nSG.setImageResource(2130839240);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.i
 * JD-Core Version:    0.6.2
 */