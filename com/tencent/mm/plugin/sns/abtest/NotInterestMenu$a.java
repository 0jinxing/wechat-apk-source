package com.tencent.mm.plugin.sns.abtest;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.v;

final class NotInterestMenu$a extends BaseAdapter
{
  NotInterestMenu$a(NotInterestMenu paramNotInterestMenu)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(35664);
    int i = NotInterestMenu.clY().length;
    AppMethodBeat.o(35664);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(35665);
    paramInt = NotInterestMenu.clY()[paramInt];
    AppMethodBeat.o(35665);
    return Integer.valueOf(paramInt);
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(35666);
    View localView = paramView;
    if (paramView == null)
    {
      localView = v.hu(NotInterestMenu.d(this.qCw)).inflate(2130970311, paramViewGroup, false);
      paramView = new NotInterestMenu.a.a(this);
      paramView.qCx = ((TextView)localView.findViewById(2131826366));
      localView.setTag(paramView);
    }
    ((NotInterestMenu.a.a)localView.getTag()).qCx.setText(NotInterestMenu.clY()[paramInt]);
    AppMethodBeat.o(35666);
    return localView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.abtest.NotInterestMenu.a
 * JD-Core Version:    0.6.2
 */