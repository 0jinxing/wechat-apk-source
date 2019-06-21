package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends BaseAdapter
{
  private LayoutInflater ezi;
  private String[] gAe;
  private Drawable gAf;
  private View.OnTouchListener gAg;

  public a(Context paramContext, String[] paramArrayOfString)
  {
    AppMethodBeat.i(124713);
    this.gAf = null;
    this.gAg = new a.1(this);
    this.gAe = paramArrayOfString;
    this.ezi = LayoutInflater.from(paramContext);
    this.gAf = paramContext.getResources().getDrawable(2130840226);
    this.gAf.setBounds(0, 0, this.gAf.getIntrinsicWidth(), this.gAf.getIntrinsicHeight());
    AppMethodBeat.o(124713);
  }

  private boolean nc(int paramInt)
  {
    if (paramInt == this.gAe.length - 1);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final int getCount()
  {
    return this.gAe.length;
  }

  public final Object getItem(int paramInt)
  {
    return this.gAe[paramInt];
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    int i = 1;
    AppMethodBeat.i(124714);
    paramViewGroup = paramView;
    if (paramView == null)
      paramViewGroup = this.ezi.inflate(2130968646, null);
    paramView = (TextView)paramViewGroup.findViewById(2131821097);
    paramViewGroup.setOnTouchListener(this.gAg);
    int j;
    if (paramInt == 0)
    {
      j = 1;
      if ((j == 0) || (!nc(paramInt)))
        break label110;
      paramView.setPadding(25, 0, 25, 10);
      paramView.setCompoundDrawablePadding(0);
      paramView.setCompoundDrawables(null, null, null, null);
    }
    while (true)
    {
      paramView.setText(this.gAe[paramInt]);
      AppMethodBeat.o(124714);
      return paramViewGroup;
      j = 0;
      break;
      label110: if (paramInt == 0);
      for (j = i; ; j = 0)
      {
        if (j == 0)
          break label160;
        paramView.setPadding(25, 0, 10, 10);
        paramView.setCompoundDrawablePadding(10);
        paramView.setCompoundDrawables(null, null, this.gAf, null);
        break;
      }
      label160: if (nc(paramInt))
      {
        paramView.setPadding(0, 0, 25, 10);
        paramView.setCompoundDrawablePadding(0);
        paramView.setCompoundDrawables(null, null, null, null);
      }
      else
      {
        paramView.setPadding(0, 0, 10, 10);
        paramView.setCompoundDrawablePadding(10);
        paramView.setCompoundDrawables(null, null, this.gAf, null);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.a
 * JD-Core Version:    0.6.2
 */