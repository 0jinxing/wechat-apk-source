package com.tencent.mm.plugin.ipcall.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.protobuf.crx;
import java.util.List;

final class IPCallPackageUI$a extends BaseAdapter
{
  private IPCallPackageUI nDR = null;
  List<crx> ngC = null;

  public IPCallPackageUI$a(IPCallPackageUI paramIPCallPackageUI)
  {
    this.nDR = paramIPCallPackageUI;
  }

  public final int getCount()
  {
    AppMethodBeat.i(22227);
    int i;
    if (this.ngC == null)
    {
      i = 0;
      AppMethodBeat.o(22227);
    }
    while (true)
    {
      return i;
      i = this.ngC.size();
      AppMethodBeat.o(22227);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(22228);
    Object localObject;
    if (this.ngC != null)
    {
      localObject = this.ngC.get(paramInt);
      AppMethodBeat.o(22228);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(22228);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22229);
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.nDR.getSystemService("layout_inflater")).inflate(2130969902, paramViewGroup, false);
      paramViewGroup = new IPCallPackageUI.a.a(this, (byte)0);
      paramViewGroup.nDV = ((CdnImageView)paramView.findViewById(2131825171));
      paramViewGroup.gtb = ((TextView)paramView.findViewById(2131825172));
      paramViewGroup.nDW = ((TextView)paramView.findViewById(2131825177));
      paramViewGroup.nDX = ((TextView)paramView.findViewById(2131825178));
      paramViewGroup.hrg = ((TextView)paramView.findViewById(2131825053));
      paramViewGroup.nDY = ((Button)paramView.findViewById(2131825175));
      paramView.setTag(paramViewGroup);
    }
    crx localcrx;
    while (true)
    {
      localcrx = (crx)getItem(paramInt);
      if (localcrx != null)
        break;
      AppMethodBeat.o(22229);
      return paramView;
      paramViewGroup = (IPCallPackageUI.a.a)paramView.getTag();
    }
    paramViewGroup.gtb.setText(localcrx.Title);
    paramViewGroup.nDW.setText(localcrx.wOs);
    paramViewGroup.hrg.setText(localcrx.Desc);
    paramViewGroup.nDX.setText(localcrx.nzz);
    paramViewGroup.nDV.setVisibility(0);
    paramViewGroup.nDV.setUrl(localcrx.xpy);
    if (localcrx.vEq == 0)
      paramViewGroup.nDY.setEnabled(true);
    while (true)
    {
      paramViewGroup.nDY.setTag(Integer.valueOf(paramInt));
      paramViewGroup.nDY.setOnClickListener(new IPCallPackageUI.a.1(this));
      AppMethodBeat.o(22229);
      break;
      paramViewGroup.nDY.setEnabled(false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallPackageUI.a
 * JD-Core Version:    0.6.2
 */