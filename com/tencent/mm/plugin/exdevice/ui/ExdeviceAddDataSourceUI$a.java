package com.tencent.mm.plugin.exdevice.ui;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class ExdeviceAddDataSourceUI$a extends BaseAdapter
{
  private List<ExdeviceAddDataSourceUI.b> lyd;
  private c lyr;

  public ExdeviceAddDataSourceUI$a()
  {
    AppMethodBeat.i(19788);
    this.lyd = new LinkedList();
    c.a locala = new c.a();
    locala.ePT = 2130838622;
    this.lyr = locala.ahG();
    AppMethodBeat.o(19788);
  }

  public final ExdeviceAddDataSourceUI.b KA(String paramString)
  {
    AppMethodBeat.i(19790);
    if (!bo.isNullOrNil(paramString))
    {
      Iterator localIterator = this.lyd.iterator();
      while (localIterator.hasNext())
      {
        ExdeviceAddDataSourceUI.b localb = (ExdeviceAddDataSourceUI.b)localIterator.next();
        if (paramString.equalsIgnoreCase(localb.mac))
        {
          AppMethodBeat.o(19790);
          paramString = localb;
        }
      }
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(19790);
    }
  }

  public final void bw(List<ExdeviceAddDataSourceUI.b> paramList)
  {
    AppMethodBeat.i(19789);
    this.lyd.clear();
    if ((paramList == null) || (paramList.size() == 0))
      AppMethodBeat.o(19789);
    while (true)
    {
      return;
      this.lyd.addAll(paramList);
      AppMethodBeat.o(19789);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(19791);
    int i = this.lyd.size();
    AppMethodBeat.o(19791);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(19793);
    ExdeviceAddDataSourceUI.b localb = uN(paramInt);
    View localView;
    if (paramView == null)
    {
      paramView = new ExdeviceAddDataSourceUI.a.a((byte)0);
      localView = View.inflate(paramViewGroup.getContext(), 2130969406, null);
      paramView.iqT = ((ImageView)localView.findViewById(2131823624));
      paramView.gxi = ((TextView)localView.findViewById(2131823625));
      localView.setTag(paramView);
      paramViewGroup = paramView;
    }
    while (true)
    {
      ab.d("MicroMsg.ExdeviceAddDataSourceUI", "position(%s), name(%s), mac(%s).", new Object[] { Integer.valueOf(paramInt), localb.name, localb.mac });
      paramViewGroup.gxi.setText(localb.name);
      o.ahp().a(localb.iconUrl, paramViewGroup.iqT, this.lyr);
      AppMethodBeat.o(19793);
      return localView;
      paramViewGroup = (ExdeviceAddDataSourceUI.a.a)paramView.getTag();
      localView = paramView;
    }
  }

  public final ExdeviceAddDataSourceUI.b uN(int paramInt)
  {
    AppMethodBeat.i(19792);
    ExdeviceAddDataSourceUI.b localb = (ExdeviceAddDataSourceUI.b)this.lyd.get(paramInt);
    AppMethodBeat.o(19792);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceAddDataSourceUI.a
 * JD-Core Version:    0.6.2
 */