package com.tencent.mm.plugin.recharge.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.recharge.model.MallRechargeProduct;
import java.util.List;

final class RechargeUI$a extends BaseAdapter
{
  private List<MallRechargeProduct> pFZ = null;

  private RechargeUI$a(RechargeUI paramRechargeUI)
  {
  }

  public final void BC(int paramInt)
  {
    AppMethodBeat.i(44326);
    for (int i = 0; i < this.pFZ.size(); i++)
      ((MallRechargeProduct)this.pFZ.get(i)).isDefault = false;
    ((MallRechargeProduct)this.pFZ.get(paramInt)).isDefault = true;
    AppMethodBeat.o(44326);
  }

  public final MallRechargeProduct BD(int paramInt)
  {
    AppMethodBeat.i(44328);
    MallRechargeProduct localMallRechargeProduct = (MallRechargeProduct)this.pFZ.get(paramInt);
    AppMethodBeat.o(44328);
    return localMallRechargeProduct;
  }

  public final void cN(List<MallRechargeProduct> paramList)
  {
    AppMethodBeat.i(44325);
    this.pFZ = paramList;
    notifyDataSetChanged();
    AppMethodBeat.o(44325);
  }

  public final int getCount()
  {
    AppMethodBeat.i(44327);
    int i;
    if (this.pFZ == null)
    {
      i = 0;
      AppMethodBeat.o(44327);
    }
    while (true)
    {
      return i;
      i = this.pFZ.size();
      AppMethodBeat.o(44327);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44330);
    paramViewGroup = (CheckedTextView)View.inflate(this.pHV, 2130970475, null);
    paramView = BD(paramInt);
    paramViewGroup.setText(paramView.lcC);
    paramViewGroup.setEnabled(paramView.isValid());
    if (paramView.isDefault)
      paramViewGroup.setChecked(true);
    while (true)
    {
      AppMethodBeat.o(44330);
      return paramViewGroup;
      paramViewGroup.setChecked(false);
    }
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(44329);
    boolean bool;
    if (!BD(paramInt).isValid())
    {
      bool = false;
      AppMethodBeat.o(44329);
    }
    while (true)
    {
      return bool;
      bool = super.isEnabled(paramInt);
      AppMethodBeat.o(44329);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.ui.RechargeUI.a
 * JD-Core Version:    0.6.2
 */