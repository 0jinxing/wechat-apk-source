package com.tencent.mm.plugin.collect.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.collect.model.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public final class a extends BaseAdapter
{
  List<com.tencent.mm.plugin.collect.model.a> kFl;
  private Context mContext;

  public a(Context paramContext)
  {
    AppMethodBeat.i(41169);
    this.kFl = new ArrayList();
    this.mContext = paramContext;
    AppMethodBeat.o(41169);
  }

  public final int getCount()
  {
    AppMethodBeat.i(41170);
    int i = this.kFl.size();
    AppMethodBeat.o(41170);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(41171);
    Object localObject = this.kFl.get(paramInt);
    AppMethodBeat.o(41171);
    return localObject;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(41172);
    View localView = paramView;
    if (paramView == null)
    {
      localView = v.hu(this.mContext).inflate(2130969153, paramViewGroup, false);
      localView.setTag(new a.a(localView));
    }
    paramView = (com.tencent.mm.plugin.collect.model.a)this.kFl.get(paramInt);
    a.a locala = (a.a)localView.getTag();
    TextView localTextView = locala.kvI;
    paramViewGroup = this.mContext;
    long l = paramView.timestamp;
    localTextView.setText(new SimpleDateFormat(paramViewGroup.getString(2131298344)).format(new Date(l * 1000L)));
    locala.kFm.setText(e.tG(paramView.cuY));
    if (!bo.isNullOrNil(paramView.desc))
    {
      locala.kEq.setText(paramView.desc);
      locala.kEq.setVisibility(0);
    }
    while (true)
    {
      AppMethodBeat.o(41172);
      return localView;
      locala.kEq.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.a
 * JD-Core Version:    0.6.2
 */