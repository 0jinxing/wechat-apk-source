package com.tencent.mm.plugin.exdevice.ui;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.plugin.exdevice.model.f.1;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;

final class ExdeviceProfileAffectedUserView$a extends BaseAdapter
{
  private Runnable lBM;

  private ExdeviceProfileAffectedUserView$a(ExdeviceProfileAffectedUserView paramExdeviceProfileAffectedUserView)
  {
    AppMethodBeat.i(20013);
    this.lBM = new ExdeviceProfileAffectedUserView.a.1(this);
    AppMethodBeat.o(20013);
  }

  private String getItem(int paramInt)
  {
    AppMethodBeat.i(20015);
    String str = (String)ExdeviceProfileAffectedUserView.d(this.lBL).get(paramInt);
    AppMethodBeat.o(20015);
    return str;
  }

  public final int getCount()
  {
    AppMethodBeat.i(20014);
    int i;
    if (ExdeviceProfileAffectedUserView.d(this.lBL) == null)
    {
      i = 0;
      AppMethodBeat.o(20014);
    }
    while (true)
    {
      return i;
      i = ExdeviceProfileAffectedUserView.d(this.lBL).size();
      AppMethodBeat.o(20014);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(20016);
    String str = getItem(paramInt);
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.lBL.getContext()).inflate(2130969434, paramViewGroup, false);
      paramViewGroup = new ExdeviceProfileAffectedUserView.a.a(this);
      paramViewGroup.gvq = ((ImageView)paramView.findViewById(2131823704));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      Runnable localRunnable = this.lBM;
      Object localObject = o.act();
      if (localObject != null)
      {
        localObject = ((i)localObject).qo(str);
        if ((localObject == null) || (bo.isNullOrNil(((h)localObject).acl())))
        {
          long l = bo.anU();
          ao.a.flu.a(str, "", new f.1(l, localRunnable));
        }
      }
      a.b.s(paramViewGroup.gvq, str);
      AppMethodBeat.o(20016);
      return paramView;
      paramViewGroup = (ExdeviceProfileAffectedUserView.a.a)paramView.getTag();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileAffectedUserView.a
 * JD-Core Version:    0.6.2
 */