package com.tencent.mm.plugin.ipcall.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.ipcall.b.a;
import com.tencent.mm.protocal.protobuf.aqo;
import com.tencent.mm.protocal.protobuf.crt;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import junit.framework.Assert;

final class IPCallRechargeUI$a extends BaseAdapter
{
  private IPCallRechargeUI nEw;
  aqo nEx;
  List<crt> ngC;

  public IPCallRechargeUI$a(IPCallRechargeUI paramIPCallRechargeUI)
  {
    AppMethodBeat.i(22264);
    this.ngC = null;
    this.nEw = null;
    this.nEx = null;
    Assert.assertTrue(true);
    this.nEw = paramIPCallRechargeUI;
    AppMethodBeat.o(22264);
  }

  public final int getCount()
  {
    AppMethodBeat.i(22265);
    int i;
    if (this.ngC == null)
    {
      i = 0;
      AppMethodBeat.o(22265);
    }
    while (true)
    {
      return i;
      i = this.ngC.size();
      AppMethodBeat.o(22265);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(22266);
    Object localObject;
    if (this.ngC != null)
    {
      localObject = this.ngC.get(paramInt);
      AppMethodBeat.o(22266);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(22266);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22267);
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.nEw.getSystemService("layout_inflater")).inflate(2130969905, paramViewGroup, false);
      paramViewGroup = new IPCallRechargeUI.a.a(this, (byte)0);
      paramViewGroup.nDC = ((TextView)paramView.findViewById(2131825184));
      paramViewGroup.nEz = ((TextView)paramView.findViewById(2131825185));
      paramViewGroup.nEA = ((TextView)paramView.findViewById(2131825187));
      paramViewGroup.nEB = ((TextView)paramView.findViewById(2131825186));
      paramViewGroup.nEC = ((Button)paramView.findViewById(2131825182));
      paramView.setTag(paramViewGroup);
    }
    crt localcrt;
    while (true)
    {
      localcrt = (crt)getItem(paramInt);
      if (localcrt != null)
        break;
      AppMethodBeat.o(22267);
      return paramView;
      paramViewGroup = (IPCallRechargeUI.a.a)paramView.getTag();
    }
    paramViewGroup.nDC.setText(localcrt.wOs);
    paramViewGroup.nEz.setText(localcrt.xpq);
    paramViewGroup.nEA.setText(localcrt.xpr);
    if (bo.isNullOrNil(localcrt.xpr))
      paramViewGroup.nEA.setVisibility(8);
    while (true)
    {
      if (this.nEx != null)
        paramViewGroup.nEB.setText(String.format(this.nEw.getString(2131300761), new Object[] { a.Pp(this.nEx.wuk), String.valueOf(localcrt.xpo) }));
      paramViewGroup.nEC.setTag(Integer.valueOf(paramInt));
      paramViewGroup.nEC.setOnClickListener(new IPCallRechargeUI.a.1(this));
      AppMethodBeat.o(22267);
      break;
      paramViewGroup.nEA.setVisibility(0);
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallRechargeUI.a
 * JD-Core Version:    0.6.2
 */