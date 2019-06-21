package com.tencent.mm.plugin.game.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.e.a.a;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameSmallAvatarList extends LinearLayout
{
  public GameSmallAvatarList(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void setData(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(112410);
    if (bo.ek(paramLinkedList))
    {
      setVisibility(8);
      AppMethodBeat.o(112410);
    }
    while (true)
    {
      return;
      setVisibility(0);
      Object localObject;
      while (getChildCount() < paramLinkedList.size())
      {
        localObject = new ImageView(getContext());
        LinearLayout.LayoutParams localLayoutParams = new LinearLayout.LayoutParams(getResources().getDimensionPixelSize(2131427740), getResources().getDimensionPixelSize(2131427740));
        localLayoutParams.setMargins(0, 0, getResources().getDimensionPixelSize(2131427735), 0);
        ((ImageView)localObject).setLayoutParams(localLayoutParams);
        ((ImageView)localObject).setScaleType(ImageView.ScaleType.FIT_XY);
        addView((View)localObject);
      }
      int j;
      for (int i = 0; ; i++)
      {
        j = i;
        if (i >= paramLinkedList.size())
          break;
        localObject = new e.a.a();
        ((e.a.a)localObject).eQf = true;
        e.bFH().a((ImageView)getChildAt(i), (String)paramLinkedList.get(i), ((e.a.a)localObject).bFI());
        getChildAt(i).setVisibility(0);
      }
      while (j < getChildCount())
      {
        getChildAt(j).setVisibility(8);
        j++;
      }
      AppMethodBeat.o(112410);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.widget.GameSmallAvatarList
 * JD-Core Version:    0.6.2
 */