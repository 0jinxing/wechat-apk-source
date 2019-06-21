package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.aa;
import java.util.ArrayList;

public final class r extends BaseAdapter
{
  private Context mContext;
  ArrayList<aa> mData = null;
  aa tKX = null;

  public r(Context paramContext, ArrayList<aa> paramArrayList)
  {
    this.mContext = paramContext;
    this.mData = paramArrayList;
  }

  public final aa Hz(int paramInt)
  {
    AppMethodBeat.i(47686);
    aa localaa;
    if ((this.mData != null) && (getCount() > paramInt))
    {
      localaa = (aa)this.mData.get(paramInt);
      AppMethodBeat.o(47686);
    }
    while (true)
    {
      return localaa;
      localaa = null;
      AppMethodBeat.o(47686);
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(47685);
    int i;
    if (this.mData != null)
    {
      i = this.mData.size();
      AppMethodBeat.o(47685);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(47685);
    }
  }

  public final long getItemId(int paramInt)
  {
    return 0L;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47687);
    if (paramView == null)
    {
      paramView = View.inflate(this.mContext, 2130971177, null);
      paramViewGroup = new r.a(this, (byte)0);
      paramViewGroup.gsf = ((TextView)paramView.findViewById(2131820678));
      paramViewGroup.tKY = ((ImageView)paramView.findViewById(2131829054));
      paramView.setTag(paramViewGroup);
      aa localaa = Hz(paramInt);
      if (localaa != null)
      {
        paramViewGroup.gsf.setText(localaa.field_wallet_name);
        if (localaa.field_wallet_selected != 1)
          break label127;
        this.tKX = localaa;
        paramViewGroup.tKY.setImageResource(2131231853);
      }
    }
    while (true)
    {
      AppMethodBeat.o(47687);
      return paramView;
      paramViewGroup = (r.a)paramView.getTag();
      break;
      label127: paramViewGroup.tKY.setImageResource(2131231852);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.r
 * JD-Core Version:    0.6.2
 */