package com.tencent.mm.ui.tools;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import junit.framework.Assert;

public class PressImageView extends ImageView
{
  private int a;
  private int b;
  private int g;
  private int r;
  private ak rgT;
  private Runnable rgU;

  public PressImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(107748);
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.rgT = new ak();
    this.rgU = new PressImageView.1(this);
    super.setOnTouchListener(new PressImageView.2(this));
    AppMethodBeat.o(107748);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(107749);
    super.onDraw(paramCanvas);
    if (isPressed())
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
    AppMethodBeat.o(107749);
  }

  @Deprecated
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    AppMethodBeat.i(107750);
    Assert.assertTrue(false);
    AppMethodBeat.o(107750);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.PressImageView
 * JD-Core Version:    0.6.2
 */