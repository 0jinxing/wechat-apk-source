package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import junit.framework.Assert;

public class AsyncMaskImageView extends ImageView
{
  private int a;
  private int b;
  private boolean enable;
  private int g;
  private int r;
  ak rgT;
  Runnable rgU;

  public AsyncMaskImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38131);
    this.a = 90;
    this.r = 0;
    this.g = 0;
    this.b = 0;
    this.enable = true;
    this.rgT = new ak();
    this.rgU = new AsyncMaskImageView.1(this);
    super.setOnTouchListener(new View.OnTouchListener()
    {
      public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
      {
        boolean bool = false;
        AppMethodBeat.i(38130);
        if (!AsyncMaskImageView.a(AsyncMaskImageView.this))
          AppMethodBeat.o(38130);
        while (true)
        {
          return bool;
          AsyncMaskImageView localAsyncMaskImageView = AsyncMaskImageView.this;
          switch (paramAnonymousMotionEvent.getAction())
          {
          case 2:
          default:
          case 0:
          case 1:
          case 3:
          }
          while (true)
          {
            if ((localAsyncMaskImageView.isClickable()) || (localAsyncMaskImageView.isLongClickable()))
              break label132;
            AppMethodBeat.o(38130);
            bool = true;
            break;
            paramAnonymousView.setPressed(true);
            paramAnonymousView.invalidate();
            localAsyncMaskImageView.rgT.removeCallbacks(localAsyncMaskImageView.rgU);
            continue;
            localAsyncMaskImageView.rgT.post(localAsyncMaskImageView.rgU);
          }
          label132: AppMethodBeat.o(38130);
        }
      }
    });
    AppMethodBeat.o(38131);
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(38134);
    super.onAttachedToWindow();
    ab.d("MicroMsg.MaskImageView", "onAttachedToWindow");
    AppMethodBeat.o(38134);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(38135);
    super.onDetachedFromWindow();
    ab.d("MicroMsg.MaskImageView", "onDetachedFromWindow");
    AppMethodBeat.o(38135);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(38132);
    super.onDraw(paramCanvas);
    if (isPressed())
      paramCanvas.drawARGB(this.a, this.r, this.g, this.b);
    AppMethodBeat.o(38132);
  }

  @Deprecated
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    AppMethodBeat.i(38133);
    Assert.assertTrue(false);
    AppMethodBeat.o(38133);
  }

  public void settouchEnable(boolean paramBoolean)
  {
    this.enable = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.AsyncMaskImageView
 * JD-Core Version:    0.6.2
 */