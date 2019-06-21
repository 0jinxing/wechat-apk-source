package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SnsUnScaleTextView extends TextView
{
  public SnsUnScaleTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public SnsUnScaleTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public int getBaseline()
  {
    AppMethodBeat.i(39674);
    try
    {
      i = super.getBaseline();
      AppMethodBeat.o(39674);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        int i = -1;
        AppMethodBeat.o(39674);
      }
    }
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(39673);
    try
    {
      super.onDraw(paramCanvas);
      AppMethodBeat.o(39673);
      return;
    }
    catch (Throwable paramCanvas)
    {
      while (true)
        AppMethodBeat.o(39673);
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(39672);
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(39672);
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        AppMethodBeat.o(39672);
    }
  }

  public boolean onPreDraw()
  {
    AppMethodBeat.i(39675);
    try
    {
      bool = super.onPreDraw();
      AppMethodBeat.o(39675);
      return bool;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        boolean bool = true;
        AppMethodBeat.o(39675);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUnScaleTextView
 * JD-Core Version:    0.6.2
 */