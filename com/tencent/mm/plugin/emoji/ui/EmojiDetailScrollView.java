package com.tencent.mm.plugin.emoji.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class EmojiDetailScrollView extends ScrollView
{
  private boolean lae;

  public EmojiDetailScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public EmojiDetailScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(53369);
    this.lae = true;
    setFadingEdgeLength(0);
    AppMethodBeat.o(53369);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(53372);
    boolean bool;
    if (!this.lae)
    {
      bool = false;
      AppMethodBeat.o(53372);
    }
    while (true)
    {
      return bool;
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(53372);
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(53371);
    this.lae = false;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(53371);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
  }

  public void requestChildFocus(View paramView1, View paramView2)
  {
  }

  public void requestLayout()
  {
    AppMethodBeat.i(53370);
    this.lae = false;
    super.requestLayout();
    AppMethodBeat.o(53370);
  }

  public void scrollBy(int paramInt1, int paramInt2)
  {
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
    this.lae = true;
  }

  public void setScrollEnable(boolean paramBoolean)
  {
    this.lae = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiDetailScrollView
 * JD-Core Version:    0.6.2
 */