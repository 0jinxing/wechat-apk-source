package com.tencent.mm.plugin.wallet_core.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckedTextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.wallet_core.model.ElementQuery;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.List;

public final class WalletCardSelectUI$a extends BaseAdapter
{
  private Context context;
  List<ElementQuery> items;

  public WalletCardSelectUI$a(WalletCardSelectUI paramWalletCardSelectUI, Context paramContext)
  {
    AppMethodBeat.i(47301);
    this.items = new ArrayList();
    this.context = paramContext;
    AppMethodBeat.o(47301);
  }

  public final ElementQuery Hv(int paramInt)
  {
    AppMethodBeat.i(47305);
    ElementQuery localElementQuery = (ElementQuery)this.items.get(paramInt);
    AppMethodBeat.o(47305);
    return localElementQuery;
  }

  public final int getCount()
  {
    AppMethodBeat.i(47304);
    int i = this.items.size();
    AppMethodBeat.o(47304);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(47303);
    paramViewGroup = new WalletCardSelectUI.a.a(this);
    View localView = View.inflate(this.context, 2130971056, null);
    paramViewGroup.tGI = ((CheckedTextView)localView.findViewById(2131828644));
    ElementQuery localElementQuery = (ElementQuery)this.items.get(paramInt);
    paramView = bo.bc(localElementQuery.nuL, "");
    if (!bo.isNullOrNil(localElementQuery.tyK))
    {
      paramView = paramView + "[" + localElementQuery.tyK + "]";
      paramViewGroup.tGI.setEnabled(false);
    }
    while (true)
    {
      paramViewGroup.tGI.setText(paramView);
      AppMethodBeat.o(47303);
      return localView;
      paramViewGroup.tGI.setEnabled(true);
    }
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(47302);
    boolean bool = bo.isNullOrNil(((ElementQuery)this.items.get(paramInt)).tyK);
    AppMethodBeat.o(47302);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.WalletCardSelectUI.a
 * JD-Core Version:    0.6.2
 */