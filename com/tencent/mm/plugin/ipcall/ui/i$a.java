package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;
import junit.framework.Assert;

public final class i$a extends BaseAdapter
{
  private Context mContext;
  View.OnClickListener nFP;
  List<Integer> ngC;

  public i$a(Context paramContext)
  {
    AppMethodBeat.i(22345);
    this.ngC = null;
    if (paramContext != null);
    for (boolean bool = true; ; bool = false)
    {
      Assert.assertTrue(bool);
      this.mContext = paramContext;
      AppMethodBeat.o(22345);
      return;
    }
  }

  public final int getCount()
  {
    AppMethodBeat.i(22346);
    int i;
    if (this.ngC == null)
    {
      i = 0;
      AppMethodBeat.o(22346);
    }
    while (true)
    {
      return i;
      i = this.ngC.size();
      AppMethodBeat.o(22346);
    }
  }

  public final Object getItem(int paramInt)
  {
    AppMethodBeat.i(22347);
    Object localObject;
    if (this.ngC != null)
    {
      localObject = this.ngC.get(paramInt);
      AppMethodBeat.o(22347);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(22347);
    }
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(22348);
    Object localObject;
    if (paramView == null)
    {
      paramView = ((LayoutInflater)this.mContext.getSystemService("layout_inflater")).inflate(2130969909, paramViewGroup, false);
      paramViewGroup = new i.a.a(this);
      paramViewGroup.nFR = ((RelativeLayout)paramView.findViewById(2131824244));
      paramViewGroup.nFS = ((TextView)paramView.findViewById(2131825196));
      paramViewGroup.nFT = ((ImageView)paramView.findViewById(2131825195));
      paramView.setTag(paramViewGroup);
      localObject = getItem(paramInt);
      if (localObject != null)
        break label114;
      AppMethodBeat.o(22348);
    }
    while (true)
    {
      return paramView;
      paramViewGroup = (i.a.a)paramView.getTag();
      break;
      label114: paramViewGroup.id = ((Integer)localObject).intValue();
      IPCallShareCouponCardUI.a(this.mContext, paramViewGroup.id, paramViewGroup.nFS, paramViewGroup.nFT);
      paramViewGroup.nFR.setOnClickListener(new i.a.1(this));
      AppMethodBeat.o(22348);
    }
  }

  public final int getViewTypeCount()
  {
    return 2;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.i.a
 * JD-Core Version:    0.6.2
 */