package com.tencent.mm.ui.applet;

import android.content.Context;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.VerticalScrollBar;

public class StrokeScrollBar extends VerticalScrollBar
{
  public StrokeScrollBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public final void Ky()
  {
    AppMethodBeat.i(29979);
    this.nBS = new String[18];
    for (int i = 0; i < this.nBS.length; i++)
      this.nBS[i] = (Integer.toString(i + 3) + "劃");
    this.nBQ = 2.0F;
    this.nBR = 79;
    AppMethodBeat.o(29979);
  }

  public int getToastLayoutId()
  {
    return 2130970676;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.applet.StrokeScrollBar
 * JD-Core Version:    0.6.2
 */