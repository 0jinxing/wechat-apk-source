package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.base.c;
import java.util.List;

public final class g extends BaseAdapter
{
  c kgW;
  List<b> khh;
  Context mContext;

  public final int getCount()
  {
    AppMethodBeat.i(88158);
    int i = this.khh.size();
    AppMethodBeat.o(88158);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88160);
    paramViewGroup = sM(paramInt);
    paramView = this.kgW.a(paramInt, paramView, paramViewGroup);
    AppMethodBeat.o(88160);
    return paramView;
  }

  public final b sM(int paramInt)
  {
    AppMethodBeat.i(88159);
    b localb = (b)this.khh.get(paramInt);
    AppMethodBeat.o(88159);
    return localb;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.sharecard.ui.g
 * JD-Core Version:    0.6.2
 */