package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.n;
import java.util.List;

public final class k extends BaseAdapter
{
  private Context mContext;
  List<n> pjD;
  AdapterView.OnItemClickListener pjw;

  public k(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private n AQ(int paramInt)
  {
    AppMethodBeat.i(44130);
    n localn = (n)this.pjD.get(paramInt);
    AppMethodBeat.o(44130);
    return localn;
  }

  public final int getCount()
  {
    AppMethodBeat.i(44129);
    int i;
    if (this.pjD != null)
    {
      i = this.pjD.size();
      AppMethodBeat.o(44129);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(44129);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44131);
    n localn = AQ(paramInt);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramViewGroup = new k.a(this);
      paramView = View.inflate(this.mContext, 2130970399, null);
      paramViewGroup.pjx = ((TextView)paramView.findViewById(2131826617));
      paramViewGroup.pjy = ((MaxGridView)paramView.findViewById(2131826618));
      paramViewGroup.pjE = new l(this.mContext);
      paramView.setTag(paramViewGroup);
    }
    while (true)
    {
      paramViewGroup.pjx.setText(localn.name);
      paramViewGroup.pjy.setOnItemClickListener(this.pjw);
      paramViewGroup.pjE.pjG = localn.phz;
      paramViewGroup.pjE.notifyDataSetChanged();
      paramViewGroup.pjy.setAdapter(paramViewGroup.pjE);
      AppMethodBeat.o(44131);
      return paramView;
      paramViewGroup = (k.a)paramView.getTag();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.k
 * JD-Core Version:    0.6.2
 */