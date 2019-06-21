package com.tencent.mm.plugin.luggage.natives.component.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class LuFrameLayoutView extends FrameLayout
{
  public LuFrameLayoutView(Context paramContext)
  {
    super(paramContext);
  }

  public LuFrameLayoutView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public LuFrameLayoutView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(116845);
    super.onDraw(paramCanvas);
    AppMethodBeat.o(116845);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luggage.natives.component.widget.LuFrameLayoutView
 * JD-Core Version:    0.6.2
 */