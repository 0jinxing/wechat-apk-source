package com.tencent.mm.plugin.wallet_core.ui.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import java.util.Iterator;
import java.util.LinkedList;

public class FavourLayout extends LinearLayout
{
  public FavourLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public FavourLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public void setWording(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(47879);
    removeAllViews();
    Iterator localIterator = paramLinkedList.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramLinkedList = new TextView(getContext());
      paramLinkedList.setText(str);
      paramLinkedList.setTextColor(Color.parseColor("#ff891e"));
      paramLinkedList.setTextSize(0, a.al(getContext(), 2131427859));
      addView(paramLinkedList);
    }
    AppMethodBeat.o(47879);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.FavourLayout
 * JD-Core Version:    0.6.2
 */