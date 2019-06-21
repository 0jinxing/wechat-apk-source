package com.tencent.mm.plugin.product.ui;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CheckBox;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.c.h;
import com.tencent.mm.plugin.product.c.m;
import java.util.LinkedList;

public final class j extends BaseAdapter
{
  private Context mContext;
  m pjB;
  String pjC;

  public j(Context paramContext)
  {
    this.mContext = paramContext;
  }

  private h AP(int paramInt)
  {
    AppMethodBeat.i(44125);
    h localh = (h)this.pjB.phZ.get(paramInt);
    AppMethodBeat.o(44125);
    return localh;
  }

  public final int getCount()
  {
    AppMethodBeat.i(44124);
    int i;
    if (this.pjB.phZ != null)
    {
      i = this.pjB.phZ.size();
      AppMethodBeat.o(44124);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(44124);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(44127);
    paramViewGroup = AP(paramInt);
    if ((paramView == null) || (paramView.getTag() == null))
      paramView = View.inflate(this.mContext, 2130970395, null);
    while (true)
    {
      CheckBox localCheckBox = (CheckBox)paramView;
      localCheckBox.setText(paramViewGroup.name);
      localCheckBox.setEnabled(paramViewGroup.phS);
      localCheckBox.setChecked(paramViewGroup.id.equals(this.pjC));
      if (!paramViewGroup.phS)
        paramView.setBackgroundResource(2130839863);
      while (true)
      {
        paramView.setTag(new Pair(this.pjB.phX, paramViewGroup.id));
        AppMethodBeat.o(44127);
        return paramView;
        if (paramViewGroup.id.equals(this.pjC))
          paramView.setBackgroundResource(2130839865);
        else
          paramView.setBackgroundResource(2130839864);
      }
    }
  }

  public final boolean isEnabled(int paramInt)
  {
    AppMethodBeat.i(44126);
    boolean bool = AP(paramInt).phS;
    AppMethodBeat.o(44126);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.j
 * JD-Core Version:    0.6.2
 */