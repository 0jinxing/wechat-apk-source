package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.plugin.game.model.n;
import com.tencent.mm.plugin.game.model.n.i;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameMessageListContainerView extends LinearLayout
{
  private Context mContext;

  public GameMessageListContainerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.mContext = paramContext;
  }

  public final void a(n paramn, LinkedList<n.i> paramLinkedList, int paramInt1, int paramInt2, f<String, Bitmap> paramf)
  {
    AppMethodBeat.i(112089);
    if ((paramn == null) || (bo.ek(paramLinkedList)))
    {
      setVisibility(8);
      AppMethodBeat.o(112089);
    }
    while (true)
    {
      return;
      setVisibility(0);
      if (paramInt1 > paramLinkedList.size());
      int j;
      GameMessageListUserIconView localGameMessageListUserIconView;
      for (int i = 1; ; i = 2)
      {
        j = this.mContext.getResources().getDimensionPixelSize(2131427500);
        while (getChildCount() < i)
        {
          localGameMessageListUserIconView = new GameMessageListUserIconView(this.mContext);
          if (getChildCount() > 0)
            localGameMessageListUserIconView.setPadding(0, j, 0, 0);
          localGameMessageListUserIconView.setSourceScene(paramInt2);
          addView(localGameMessageListUserIconView);
        }
      }
      paramInt2 = 0;
      if (paramInt2 < getChildCount())
      {
        if (paramInt2 < i)
        {
          getChildAt(paramInt2).setVisibility(0);
          localGameMessageListUserIconView = (GameMessageListUserIconView)getChildAt(paramInt2);
          LinkedList localLinkedList = new LinkedList();
          for (j = paramInt2 * paramInt1; (j < (paramInt2 + 1) * paramInt1) && (j < paramLinkedList.size()); j++)
            localLinkedList.add(paramLinkedList.get(j));
          localGameMessageListUserIconView.a(paramn, localLinkedList, paramf);
        }
        while (true)
        {
          paramInt2++;
          break;
          getChildAt(paramInt2).setVisibility(8);
        }
      }
      AppMethodBeat.o(112089);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(112088);
    super.onFinishInflate();
    AppMethodBeat.o(112088);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameMessageListContainerView
 * JD-Core Version:    0.6.2
 */