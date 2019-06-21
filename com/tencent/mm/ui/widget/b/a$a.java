package com.tencent.mm.ui.widget.b;

import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;
import java.util.List;

final class a$a extends BaseAdapter
{
  private a$a(a parama)
  {
  }

  private String getItem(int paramInt)
  {
    AppMethodBeat.i(112761);
    String str = (String)((MenuItem)a.a(this.zSe).yvT.get(paramInt)).getTitle();
    AppMethodBeat.o(112761);
    return str;
  }

  public final int getCount()
  {
    AppMethodBeat.i(112760);
    int i = a.a(this.zSe).size();
    AppMethodBeat.o(112760);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(112762);
    Object localObject = null;
    if (paramView == null)
      paramViewGroup = (TextView)a.f(this.zSe).inflate(2130970371, paramViewGroup, false);
    while (true)
    {
      paramView = getItem(paramInt);
      if (paramViewGroup != null)
      {
        paramViewGroup.setTag(paramView);
        paramViewGroup.setText(paramView);
      }
      AppMethodBeat.o(112762);
      return paramViewGroup;
      paramViewGroup = localObject;
      if ((paramView instanceof TextView))
        paramViewGroup = (TextView)paramView;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.b.a.a
 * JD-Core Version:    0.6.2
 */