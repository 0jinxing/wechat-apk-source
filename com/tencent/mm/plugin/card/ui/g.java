package com.tencent.mm.plugin.card.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.card.base.c;
import com.tencent.mm.plugin.card.model.CardInfo;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"UseValueOf"})
public final class g extends BaseAdapter
{
  private View.OnClickListener gKK;
  private boolean kdc;
  c kgW;
  List<CardInfo> khh;
  private boolean kmc;
  List<Boolean> kmd;
  g.a kme;
  Context mContext;

  public g(Context paramContext)
  {
    AppMethodBeat.i(88546);
    this.khh = new ArrayList();
    this.kmc = false;
    this.kmd = new ArrayList();
    this.kdc = true;
    this.gKK = new g.1(this);
    this.kgW = new l(paramContext, this);
    this.mContext = paramContext;
    AppMethodBeat.o(88546);
  }

  public final int getCount()
  {
    AppMethodBeat.i(88547);
    int i = this.khh.size();
    AppMethodBeat.o(88547);
    return i;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(88549);
    paramViewGroup = sY(paramInt);
    paramViewGroup.kdc = this.kdc;
    paramView = this.kgW.a(paramInt, paramView, paramViewGroup);
    if ((this.kmc) && (paramViewGroup.aZI()))
    {
      this.kgW.S(paramView, 0);
      if (((Boolean)this.kmd.get(paramInt)).booleanValue())
      {
        this.kgW.R(paramView, 2130838050);
        this.kgW.a(paramView, paramInt, this.gKK);
      }
    }
    while (true)
    {
      AppMethodBeat.o(88549);
      return paramView;
      this.kgW.R(paramView, 2130838051);
      break;
      this.kgW.S(paramView, 8);
    }
  }

  public final CardInfo sY(int paramInt)
  {
    AppMethodBeat.i(88548);
    CardInfo localCardInfo = (CardInfo)this.khh.get(paramInt);
    AppMethodBeat.o(88548);
    return localCardInfo;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.g
 * JD-Core Version:    0.6.2
 */