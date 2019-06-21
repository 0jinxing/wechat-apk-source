package com.tencent.mm.plugin.luckymoney.appbrand.ui.detail;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.protocal.protobuf.ash;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.wallet_core.ui.e;
import java.util.LinkedList;
import java.util.List;

public final class c extends BaseAdapter
{
  private Context mContext;
  private LayoutInflater mInflater;
  private int nSA;
  private c.a nSB;
  private List<ash> nSx;
  private String nSy;
  boolean nSz;

  public c(Context paramContext)
  {
    AppMethodBeat.i(42017);
    this.nSx = new LinkedList();
    this.nSy = null;
    this.nSz = false;
    this.nSA = 1;
    this.nSB = null;
    this.mContext = paramContext;
    this.mInflater = LayoutInflater.from(paramContext);
    AppMethodBeat.o(42017);
  }

  private ash xJ(int paramInt)
  {
    AppMethodBeat.i(42020);
    ash localash = (ash)this.nSx.get(paramInt);
    AppMethodBeat.o(42020);
    return localash;
  }

  public final void ck(List<ash> paramList)
  {
    AppMethodBeat.i(42018);
    if (paramList == null);
    for (this.nSx = new LinkedList(); ; this.nSx = paramList)
    {
      notifyDataSetChanged();
      AppMethodBeat.o(42018);
      return;
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(42019);
    int i = this.nSx.size();
    AppMethodBeat.o(42019);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(42021);
    if (paramView == null)
    {
      paramView = this.mInflater.inflate(2130969996, paramViewGroup, false);
      paramViewGroup = new c.b(this);
      paramViewGroup.kRR = paramView.findViewById(2131820987);
      paramViewGroup.kEn = ((ImageView)paramView.findViewById(2131825654));
      paramViewGroup.niS = ((TextView)paramView.findViewById(2131825655));
      paramViewGroup.nSC = ((TextView)paramView.findViewById(2131825659));
      paramViewGroup.nSD = ((TextView)paramView.findViewById(2131825656));
      paramViewGroup.nSE = ((TextView)paramView.findViewById(2131825658));
      paramViewGroup.nSF = ((TextView)paramView.findViewById(2131825657));
      paramViewGroup.nSG = ((ImageView)paramView.findViewById(2131825660));
      paramViewGroup.nSH = ((TextView)paramView.findViewById(2131825661));
      paramView.setTag(paramViewGroup);
    }
    ash localash;
    while (true)
    {
      localash = xJ(paramInt);
      x.b(paramViewGroup.kEn, localash.nSa, localash.username);
      paramViewGroup.nSE.setVisibility(8);
      x.a(this.mContext, paramViewGroup.niS, localash.nickname);
      String str = this.mContext.getString(2131301173, new Object[] { e.F(localash.wvQ / 100.0D) });
      paramViewGroup.nSD.setText(str);
      paramViewGroup.nSC.setText(x.j(this.mContext, localash.wvR * 1000L));
      paramViewGroup.nSC.setVisibility(0);
      paramViewGroup.nSF.setVisibility(8);
      if (!bo.isNullOrNil(localash.wvT))
        break;
      paramViewGroup.nSG.setVisibility(8);
      paramViewGroup.nSH.setVisibility(8);
      AppMethodBeat.o(42021);
      return paramView;
      paramViewGroup = (c.b)paramView.getTag();
    }
    paramViewGroup.nSH.setText(localash.wvT);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.appbrand.ui.detail.c
 * JD-Core Version:    0.6.2
 */