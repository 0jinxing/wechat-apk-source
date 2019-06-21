package com.tencent.mm.ui.chatting;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class g$b extends BaseAdapter
{
  private g$b(g paramg)
  {
  }

  private com.tencent.mm.aj.j Oi(int paramInt)
  {
    AppMethodBeat.i(30498);
    com.tencent.mm.aj.j localj = (com.tencent.mm.aj.j)g.b(this.yHS).fwr.get(paramInt);
    AppMethodBeat.o(30498);
    return localj;
  }

  public final int getCount()
  {
    AppMethodBeat.i(30497);
    int i = g.a(this.yHS);
    AppMethodBeat.o(30497);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(30499);
    if (paramView == null);
    for (paramView = (TextView)g.c(this.yHS).inflate(2130970371, paramViewGroup, false); ; paramView = (TextView)paramView)
    {
      paramViewGroup = Oi(paramInt);
      paramView.setTag(paramViewGroup);
      paramView.setText(com.tencent.mm.pluginsdk.ui.e.j.b(g.d(this.yHS), paramViewGroup.name));
      AppMethodBeat.o(30499);
      return paramView;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.g.b
 * JD-Core Version:    0.6.2
 */