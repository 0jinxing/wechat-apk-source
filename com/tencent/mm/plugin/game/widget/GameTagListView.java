package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameTagListView extends LinearLayout
{
  private int textColor;
  private int textSize;

  public GameTagListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void f(LinkedList<String> paramLinkedList, int paramInt)
  {
    AppMethodBeat.i(112412);
    if (bo.ek(paramLinkedList))
    {
      setVisibility(8);
      AppMethodBeat.o(112412);
    }
    while (true)
    {
      return;
      setVisibility(0);
      TextView localTextView;
      Object localObject;
      while (getChildCount() < paramLinkedList.size())
      {
        localTextView = new TextView(getContext());
        localTextView.setBackgroundResource(2130838985);
        localTextView.setMaxLines(1);
        localTextView.setTextColor(this.textColor);
        localTextView.setTextSize(0, this.textSize);
        localObject = new LinearLayout.LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams)localObject).setMargins(0, 0, getResources().getDimensionPixelSize(2131427735), 0);
        localTextView.setLayoutParams((ViewGroup.LayoutParams)localObject);
        addView(localTextView);
      }
      int i = 0;
      float f1 = 0.0F;
      while (true)
      {
        int j = i;
        if (i < paramLinkedList.size())
        {
          localObject = (String)paramLinkedList.get(i);
          ab.d("MicroMsg.GameTagListView", (String)localObject);
          localTextView = (TextView)getChildAt(i);
          localTextView.setVisibility(0);
          localTextView.setText((CharSequence)localObject);
          float f2 = localTextView.getPaint().measureText((String)localObject);
          float f3 = localTextView.getPaddingLeft();
          float f4 = localTextView.getPaddingRight();
          f1 = getResources().getDimensionPixelSize(2131427735) + (f2 + f3 + f4 + f1);
          if (f1 > paramInt)
            localTextView.setVisibility(8);
        }
        else
        {
          for (j = i; j < getChildCount(); j++)
            getChildAt(j).setVisibility(8);
        }
        i++;
      }
      AppMethodBeat.o(112412);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112411);
    super.onFinishInflate();
    this.textColor = getResources().getColor(2131690104);
    this.textSize = getResources().getDimensionPixelSize(2131427737);
    AppMethodBeat.o(112411);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.widget.GameTagListView
 * JD-Core Version:    0.6.2
 */