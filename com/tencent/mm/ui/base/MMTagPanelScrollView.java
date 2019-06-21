package com.tencent.mm.ui.base;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.MMEditText;
import java.util.LinkedList;

public class MMTagPanelScrollView extends ScrollView
{
  private int eTj;
  private Runnable yxO;
  private MMTagPanelScrollView.a yxP;
  private int yxQ;

  public MMTagPanelScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(106859);
    this.yxO = new MMTagPanelScrollView.1(this);
    this.yxP = new MMTagPanelScrollView.a((byte)0);
    this.eTj = 0;
    this.yxQ = 2;
    AppMethodBeat.o(106859);
  }

  public MMTagPanelScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(106858);
    this.yxO = new MMTagPanelScrollView.1(this);
    this.yxP = new MMTagPanelScrollView.a((byte)0);
    this.eTj = 0;
    this.yxQ = 2;
    AppMethodBeat.o(106858);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106861);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    scrollBy(0, paramInt4);
    AppMethodBeat.o(106861);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(106860);
    super.onMeasure(paramInt1, paramInt2);
    if (getChildCount() <= 0)
      AppMethodBeat.o(106860);
    while (true)
    {
      return;
      if ((getChildAt(0) instanceof MMTagPanel))
      {
        MMTagPanel localMMTagPanel = (MMTagPanel)getChildAt(0);
        if (localMMTagPanel.yxz == null);
        int i;
        int j;
        for (boolean bool = false; ; bool = localMMTagPanel.yxz.isFocused())
        {
          if (localMMTagPanel.getLineCount() == this.yxQ)
            this.eTj = (localMMTagPanel.getMeasuredHeight() + getResources().getDimensionPixelOffset(2131427863));
          if (localMMTagPanel.getLineCount() < this.yxQ)
            break label265;
          i = View.MeasureSpec.getSize(paramInt1);
          paramInt1 = this.yxQ;
          j = Math.max(0, Math.min(localMMTagPanel.ysy.size(), paramInt1));
          paramInt2 = localMMTagPanel.getPaddingTop();
          for (paramInt1 = 0; paramInt1 < j - 1; paramInt1++)
            paramInt2 += ((Integer)localMMTagPanel.ysy.get(paramInt1)).intValue() + localMMTagPanel.ysx;
        }
        paramInt1 = Math.max(((Integer)localMMTagPanel.ysy.get(j - 1)).intValue() + paramInt2 + localMMTagPanel.getPaddingBottom(), this.eTj);
        ab.d("MicroMsg.FavTagPanelScrollView", "height %d", new Object[] { Integer.valueOf(paramInt1) });
        setMeasuredDimension(i, paramInt1);
        if (bool)
        {
          this.yxP.yxS = localMMTagPanel;
          removeCallbacks(this.yxP);
          post(this.yxP);
        }
      }
      label265: AppMethodBeat.o(106860);
    }
  }

  public void setMaxLine(int paramInt)
  {
    int i = paramInt;
    if (paramInt <= 0)
      i = 1;
    this.yxQ = i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMTagPanelScrollView
 * JD-Core Version:    0.6.2
 */