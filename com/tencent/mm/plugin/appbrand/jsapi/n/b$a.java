package com.tencent.mm.plugin.appbrand.jsapi.n;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class b$a extends BaseAdapter
{
  private final ArrayList<String> hUW;
  private final int hUX;

  public b$a(ArrayList<String> paramArrayList, int paramInt)
  {
    this.hUW = paramArrayList;
    this.hUX = paramInt;
  }

  private String getItem(int paramInt)
  {
    AppMethodBeat.i(74785);
    String str = (String)this.hUW.get(paramInt);
    AppMethodBeat.o(74785);
    return str;
  }

  public final int getCount()
  {
    AppMethodBeat.i(74784);
    int i = this.hUW.size();
    AppMethodBeat.o(74784);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(74786);
    if (paramView == null)
    {
      paramView = View.inflate(paramViewGroup.getContext(), 2130968733, null);
      paramViewGroup = new b.a.a((byte)0);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131820678));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      paramViewGroup.gsf.setText(getItem(paramInt));
      paramViewGroup.gsf.setTextColor(this.hUX);
      AppMethodBeat.o(74786);
      return paramView;
      paramViewGroup = (b.a.a)paramView.getTag();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.n.b.a
 * JD-Core Version:    0.6.2
 */