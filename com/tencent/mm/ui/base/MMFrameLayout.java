package com.tencent.mm.ui.base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MMFrameLayout extends FrameLayout
{
  private boolean yuz = false;

  public MMFrameLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(106612);
    int i = getChildCount();
    for (int j = 0; (!this.yuz) && (j < i); j++)
    {
      View localView = getChildAt(j);
      if (localView != null)
      {
        FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)localView.getLayoutParams();
        if (localLayoutParams.gravity == -1)
        {
          localLayoutParams.gravity = 51;
          localView.setLayoutParams(localLayoutParams);
        }
      }
    }
    this.yuz = true;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(106612);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMFrameLayout
 * JD-Core Version:    0.6.2
 */