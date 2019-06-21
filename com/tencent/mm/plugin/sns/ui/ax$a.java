package com.tencent.mm.plugin.sns.ui;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import java.util.HashMap;

final class ax$a extends BaseAdapter
{
  private ax$a(ax paramax)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(39615);
    int i = ax.a(this.rBr).size();
    AppMethodBeat.o(39615);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(39616);
    MenuItem localMenuItem;
    if (paramView == null)
    {
      paramView = ax.b(this.rBr).inflate(2130970821, paramViewGroup, false);
      paramViewGroup = new ax.a.a(this, (byte)0);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131820678));
      paramViewGroup.rBs = ((TextView)paramView.findViewById(2131827915));
      paramView.setTag(paramViewGroup);
      localMenuItem = ax.a(this.rBr).getItem(paramInt);
      paramViewGroup.gsf.setText(localMenuItem.getTitle());
      if (ax.c(this.rBr).get(Integer.valueOf(localMenuItem.getItemId())) == null)
        break label227;
      paramViewGroup.rBs.setText((CharSequence)ax.c(this.rBr).get(Integer.valueOf(localMenuItem.getItemId())));
      paramViewGroup.rBs.setVisibility(0);
    }
    while (true)
    {
      if (ax.d(this.rBr).get(Integer.valueOf(localMenuItem.getItemId())) != null)
        paramViewGroup.rBs.setTextColor(((Integer)ax.d(this.rBr).get(Integer.valueOf(localMenuItem.getItemId()))).intValue());
      AppMethodBeat.o(39616);
      return paramView;
      paramViewGroup = (ax.a.a)paramView.getTag();
      break;
      label227: paramViewGroup.rBs.setVisibility(4);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ax.a
 * JD-Core Version:    0.6.2
 */