package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.a.a;
import com.tencent.mm.plugin.product.b.d;
import java.util.List;

public final class h extends BaseAdapter
  implements Filterable
{
  private Context mContext;
  private List<String> phg;
  private List<String> piX;
  Filter piY;

  public h(Context paramContext)
  {
    AppMethodBeat.i(44085);
    this.piX = null;
    this.phg = null;
    this.piY = new h.1(this);
    this.mContext = paramContext;
    this.piX = a.bZC().bZE().phg;
    AppMethodBeat.o(44085);
  }

  private String getItem(int paramInt)
  {
    AppMethodBeat.i(44087);
    String str = (String)this.phg.get(paramInt);
    AppMethodBeat.o(44087);
    return str;
  }

  public final int getCount()
  {
    AppMethodBeat.i(44086);
    int i;
    if (this.phg != null)
    {
      i = this.phg.size();
      AppMethodBeat.o(44086);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(44086);
    }
  }

  public final Filter getFilter()
  {
    return this.piY;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44088);
    if (paramView == null)
    {
      paramViewGroup = new h.a(this);
      paramView = LayoutInflater.from(this.mContext).inflate(17367043, null);
      paramViewGroup.piD = ((TextView)paramView.findViewById(16908308));
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      paramViewGroup.piD.setText(getItem(paramInt));
      AppMethodBeat.o(44088);
      return paramView;
      paramViewGroup = (h.a)paramView.getTag();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.h
 * JD-Core Version:    0.6.2
 */