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
import com.tencent.mm.protocal.protobuf.cmk;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class ExdeviceRankDataSourceUI$b extends BaseAdapter
{
  List<ExdeviceRankDataSourceUI.a> lDe;
  private c lyr;

  public ExdeviceRankDataSourceUI$b()
  {
    AppMethodBeat.i(20117);
    this.lDe = new LinkedList();
    c.a locala = new c.a();
    locala.ePT = 2130838622;
    this.lyr = locala.ahG();
    AppMethodBeat.o(20117);
  }

  private ExdeviceRankDataSourceUI.a uV(int paramInt)
  {
    AppMethodBeat.i(20121);
    ExdeviceRankDataSourceUI.a locala = (ExdeviceRankDataSourceUI.a)this.lDe.get(paramInt);
    AppMethodBeat.o(20121);
    return locala;
  }

  public final ExdeviceRankDataSourceUI.a KG(String paramString)
  {
    try
    {
      AppMethodBeat.i(20118);
      if (!bo.isNullOrNil(paramString))
      {
        Iterator localIterator = this.lDe.iterator();
        while (localIterator.hasNext())
        {
          ExdeviceRankDataSourceUI.a locala = (ExdeviceRankDataSourceUI.a)localIterator.next();
          if (paramString.equals(locala.mac))
          {
            AppMethodBeat.o(20118);
            paramString = locala;
          }
        }
      }
      while (true)
      {
        return paramString;
        paramString = null;
        AppMethodBeat.o(20118);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final ExdeviceRankDataSourceUI.a dW(String paramString1, String paramString2)
  {
    try
    {
      AppMethodBeat.i(20119);
      Iterator localIterator = this.lDe.iterator();
      while (localIterator.hasNext())
      {
        ExdeviceRankDataSourceUI.a locala = (ExdeviceRankDataSourceUI.a)localIterator.next();
        if ((locala != null) && (ExdeviceRankDataSourceUI.a(paramString1, paramString2, locala.lDc)))
        {
          AppMethodBeat.o(20119);
          paramString1 = locala;
        }
      }
      while (true)
      {
        return paramString1;
        paramString1 = null;
        AppMethodBeat.o(20119);
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public final int getCount()
  {
    AppMethodBeat.i(20120);
    int i = this.lDe.size();
    AppMethodBeat.o(20120);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(20122);
    ExdeviceRankDataSourceUI.a locala = uV(paramInt);
    Object localObject;
    if (paramView == null)
    {
      localObject = new a((byte)0);
      paramView = View.inflate(paramViewGroup.getContext(), 2130969436, null);
      ((a)localObject).gxi = ((TextView)paramView.findViewById(2131823625));
      ((a)localObject).iqT = ((ImageView)paramView.findViewById(2131823624));
      paramView.setTag(localObject);
    }
    for (paramViewGroup = (ViewGroup)localObject; ; paramViewGroup = (a)paramView.getTag())
    {
      localObject = ExdeviceRankDataSourceUI.a(locala);
      ab.d("MicroMsg.ExdeviceRankDataSourceUI", "position(%s), name(%s), mac(%s).", new Object[] { Integer.valueOf(paramInt), localObject, locala.mac });
      paramViewGroup.gxi.setText((CharSequence)localObject);
      o.ahp().a(locala.lDc.IconUrl, paramViewGroup.iqT, this.lyr);
      AppMethodBeat.o(20122);
      return paramView;
    }
  }

  static final class a
  {
    TextView gxi;
    ImageView iqT;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankDataSourceUI.b
 * JD-Core Version:    0.6.2
 */