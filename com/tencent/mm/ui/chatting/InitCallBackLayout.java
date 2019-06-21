package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class InitCallBackLayout extends FrameLayout
{
  private boolean hasDrawed;
  private ap yqt;

  public InitCallBackLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(30954);
    super.onDraw(paramCanvas);
    if (!this.hasDrawed)
    {
      this.hasDrawed = true;
      if (this.yqt != null)
        this.yqt.bCv();
    }
    AppMethodBeat.o(30954);
  }

  public void setListener(ap paramap)
  {
    this.yqt = paramap;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.InitCallBackLayout
 * JD-Core Version:    0.6.2
 */