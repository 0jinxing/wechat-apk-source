package com.tencent.mm.plugin.account.ui;

import android.content.Context;
import android.view.View;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.HorizontalListView;
import com.tencent.mm.ui.base.o;

public final class p
{
  public static o a(Context paramContext, View paramView, String[] paramArrayOfString, AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    AppMethodBeat.i(125300);
    Object localObject = View.inflate(paramContext, 2130970370, null);
    HorizontalListView localHorizontalListView = (HorizontalListView)((View)localObject).findViewById(2131826562);
    paramArrayOfString = new a(paramContext, paramArrayOfString);
    localHorizontalListView.setAdapter(paramArrayOfString);
    localHorizontalListView.setOnItemClickListener(paramOnItemClickListener);
    localHorizontalListView.setBackgroundResource(2130840225);
    localObject = new o((View)localObject);
    ((o)localObject).setHeight(com.tencent.mm.bz.a.fromDPToPix(paramContext, 120));
    int i = 0;
    int j = 0;
    while (i < paramArrayOfString.getCount())
    {
      paramOnItemClickListener = paramArrayOfString.getView(i, null, localHorizontalListView);
      paramOnItemClickListener.measure(0, 0);
      j += paramOnItemClickListener.getMeasuredWidth();
      i++;
    }
    ((o)localObject).setWidth(com.tencent.mm.bz.a.fromDPToPix(paramContext, 20) + j);
    ((o)localObject).showAsDropDown(paramView, (paramView.getWidth() - (com.tencent.mm.bz.a.fromDPToPix(paramContext, 20) + j)) / 2, 0);
    AppMethodBeat.o(125300);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.p
 * JD-Core Version:    0.6.2
 */