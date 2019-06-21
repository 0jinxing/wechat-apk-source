package com.tencent.mm.plugin.address.ui;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.address.d.b;
import java.util.ArrayList;
import java.util.List;

public final class WalletSelectAddrUI$a extends BaseAdapter
{
  private final Context context;
  List<b> items;

  public WalletSelectAddrUI$a(WalletSelectAddrUI paramWalletSelectAddrUI, Context paramContext)
  {
    AppMethodBeat.i(16989);
    this.items = new ArrayList();
    this.context = paramContext;
    AppMethodBeat.o(16989);
  }

  private b nk(int paramInt)
  {
    AppMethodBeat.i(16992);
    b localb = (b)this.items.get(paramInt);
    AppMethodBeat.o(16992);
    return localb;
  }

  public final int getCount()
  {
    AppMethodBeat.i(16991);
    int i = this.items.size();
    AppMethodBeat.o(16991);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(16990);
    paramViewGroup = new WalletSelectAddrUI.a.a(this);
    if (paramView == null)
    {
      paramView = View.inflate(this.context, 2130971041, null);
      paramViewGroup.gKm = ((ImageView)paramView.findViewById(2131828587));
      paramViewGroup.gKl = ((TextView)paramView.findViewById(2131828586));
      paramViewGroup.gtb = ((TextView)paramView.findViewById(2131828585));
      paramView.setTag(paramViewGroup);
      b localb = nk(paramInt);
      StringBuilder localStringBuilder = new StringBuilder();
      if (!TextUtils.isEmpty(localb.gJa))
        localStringBuilder.append(localb.gJa);
      if (!TextUtils.isEmpty(localb.gJb))
      {
        localStringBuilder.append(" ");
        localStringBuilder.append(localb.gJb);
      }
      if (!TextUtils.isEmpty(localb.gJc))
      {
        localStringBuilder.append(" ");
        localStringBuilder.append(localb.gJc);
      }
      if (!TextUtils.isEmpty(localb.gJe))
      {
        localStringBuilder.append(" ");
        localStringBuilder.append(localb.gJe);
      }
      paramViewGroup.gKl.setText(localStringBuilder.toString());
      paramViewGroup.gtb.setText(localb.gJf + "，" + localb.gJg);
      if ((!WalletSelectAddrUI.e(this.gLk)) || (WalletSelectAddrUI.g(this.gLk) == null) || (WalletSelectAddrUI.g(this.gLk).id != localb.id))
        break label318;
      paramViewGroup.gKm.setImageResource(2131231853);
    }
    while (true)
    {
      AppMethodBeat.o(16990);
      return paramView;
      paramViewGroup = (WalletSelectAddrUI.a.a)paramView.getTag();
      break;
      label318: paramViewGroup.gKm.setImageBitmap(null);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.address.ui.WalletSelectAddrUI.a
 * JD-Core Version:    0.6.2
 */