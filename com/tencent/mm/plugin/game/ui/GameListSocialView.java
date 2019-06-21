package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.e.j;
import java.util.LinkedList;

public class GameListSocialView extends LinearLayout
{
  public GameListSocialView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112063);
    super.onFinishInflate();
    AppMethodBeat.o(112063);
  }

  public void setData(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(112064);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0) || (paramLinkedList.size() % 2 != 0))
    {
      setVisibility(8);
      AppMethodBeat.o(112064);
    }
    while (true)
    {
      return;
      setVisibility(0);
      if (getChildCount() < paramLinkedList.size() / 2)
      {
        int i = paramLinkedList.size() / 2;
        int j = getChildCount();
        for (k = 0; k < i - j; k++)
          inflate(getContext(), 2130969743, this);
      }
      int k = 0;
      if (k < getChildCount())
      {
        if (k < paramLinkedList.size() / 2)
          getChildAt(k).setVisibility(0);
        while (true)
        {
          k++;
          break;
          getChildAt(k).setVisibility(8);
        }
      }
      for (k = 0; k < paramLinkedList.size() / 2; k++)
      {
        Object localObject = getChildAt(k);
        TextView localTextView = (TextView)((View)localObject).findViewById(2131824556);
        localObject = (TextView)((View)localObject).findViewById(2131824557);
        localTextView.setText(j.b(getContext(), (CharSequence)paramLinkedList.get(k * 2), localTextView.getTextSize()));
        ((TextView)localObject).setText(j.b(getContext(), (CharSequence)paramLinkedList.get(k * 2 + 1), ((TextView)localObject).getTextSize()));
      }
      AppMethodBeat.o(112064);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameListSocialView
 * JD-Core Version:    0.6.2
 */