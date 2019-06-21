package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.collect.model.e;
import com.tencent.mm.plugin.collect.model.h;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.ArrayList;
import java.util.List;

public final class b extends BaseAdapter
{
  List<h> kFl;
  private Context mContext;

  public b(Context paramContext)
  {
    AppMethodBeat.i(41179);
    this.kFl = new ArrayList();
    this.mContext = paramContext;
    AppMethodBeat.o(41179);
  }

  public final void bp(List<h> paramList)
  {
    AppMethodBeat.i(41184);
    this.kFl.addAll(paramList);
    notifyDataSetChanged();
    AppMethodBeat.o(41184);
  }

  public final int getCount()
  {
    AppMethodBeat.i(41180);
    int i = this.kFl.size();
    AppMethodBeat.o(41180);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(41182);
    View localView = paramView;
    if (paramView == null)
    {
      localView = v.hu(this.mContext).inflate(2130969155, paramViewGroup, false);
      localView.setTag(new b.a(localView));
    }
    paramViewGroup = (b.a)localView.getTag();
    paramView = tI(paramInt);
    paramViewGroup.kvI.setText(e.a(this.mContext, paramView.kCc, paramView.type));
    paramViewGroup.kFm.setText(e.tG(paramView.kCe));
    paramViewGroup.kEq.setText(this.mContext.getString(2131298356, new Object[] { Integer.valueOf(paramView.kCd) }));
    AppMethodBeat.o(41182);
    return localView;
  }

  public final void setData(List<h> paramList)
  {
    AppMethodBeat.i(41183);
    this.kFl.clear();
    this.kFl.addAll(paramList);
    notifyDataSetChanged();
    AppMethodBeat.o(41183);
  }

  public final h tI(int paramInt)
  {
    AppMethodBeat.i(41181);
    h localh = (h)this.kFl.get(paramInt);
    AppMethodBeat.o(41181);
    return localh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.b
 * JD-Core Version:    0.6.2
 */