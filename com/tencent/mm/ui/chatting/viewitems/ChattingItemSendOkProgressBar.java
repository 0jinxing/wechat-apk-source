package com.tencent.mm.ui.chatting.viewitems;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.ref.SoftReference;

public class ChattingItemSendOkProgressBar extends ProgressBar
{
  private static SoftReference<Bitmap> zgq;
  private static SoftReference<Bitmap> zgr;
  private static SoftReference<Bitmap> zgs;
  private static int zgy;
  private static int zgz;
  private boolean fAA = false;
  private float rotation = 0.0F;
  private int zgm = 0;
  private int zgn = 0;
  private boolean zgo = false;
  private boolean zgp = false;
  private Bitmap zgt = null;
  private Bitmap zgu = null;
  private Bitmap zgv = null;
  private boolean zgw = false;
  private a zgx = null;

  static
  {
    AppMethodBeat.i(33278);
    zgq = null;
    zgr = null;
    zgs = null;
    zgy = 0;
    zgz = 0;
    zgy = a.fromDPToPix(ah.getContext(), 1);
    zgz = a.fromDPToPix(ah.getContext(), 6);
    AppMethodBeat.o(33278);
  }

  public ChattingItemSendOkProgressBar(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public ChattingItemSendOkProgressBar(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public a getDrawListener()
  {
    return this.zgx;
  }

  @SuppressLint({"DrawAllocation"})
  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(33277);
    if (!this.zgw)
    {
      super.onDraw(paramCanvas);
      AppMethodBeat.o(33277);
    }
    while (true)
    {
      return;
      paramCanvas.saveLayerAlpha(new RectF(0.0F, 0.0F, this.zgt.getWidth(), this.zgt.getHeight()), 255, 31);
      Object localObject1;
      Object localObject2;
      if (this.fAA)
      {
        if (!this.zgo)
        {
          if (((int)(this.rotation - 270.0F) % 360 == 0) && (this.zgp))
          {
            this.zgo = true;
            invalidate();
            AppMethodBeat.o(33277);
          }
          else
          {
            localObject1 = new Matrix();
            ((Matrix)localObject1).setRotate(this.rotation, this.zgt.getWidth() / 2, this.zgt.getHeight() / 2);
            paramCanvas.drawBitmap(this.zgt, (Matrix)localObject1, null);
            this.rotation += 6.0F;
            invalidate();
            AppMethodBeat.o(33277);
          }
        }
        else if (this.zgm <= this.zgu.getWidth())
        {
          localObject1 = new Matrix();
          this.rotation += 6.0F;
          ((Matrix)localObject1).setRotate(this.rotation, this.zgt.getWidth() / 2, this.zgt.getHeight() / 2);
          int i = (int)this.rotation % 360;
          int j = i;
          if (i < 270)
            j = i + 360;
          if ((j >= 270) && (j < 450))
          {
            localObject2 = new Paint();
            ((Paint)localObject2).setColor(-16776961);
            paramCanvas.drawBitmap(this.zgt, (Matrix)localObject1, (Paint)localObject2);
            ((Paint)localObject2).setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
            paramCanvas.drawRect(0.0F, 0.0F, this.zgt.getWidth(), this.zgt.getHeight() / 2, (Paint)localObject2);
          }
          localObject1 = new Rect(0, 0, this.zgm, this.zgu.getHeight());
          localObject2 = new Rect(zgy, zgz, this.zgm + zgy, this.zgu.getHeight() + zgz);
          paramCanvas.drawBitmap(this.zgu, (Rect)localObject1, (Rect)localObject2, null);
          this.zgm += 2;
          invalidate();
          AppMethodBeat.o(33277);
        }
        else
        {
          localObject2 = new Rect(0, 0, this.zgu.getWidth(), this.zgu.getHeight());
          localObject1 = new Rect(zgy, zgz, this.zgu.getWidth() + zgy, this.zgu.getHeight() + zgz);
          paramCanvas.drawBitmap(this.zgu, (Rect)localObject2, (Rect)localObject1, null);
          if (this.zgn < 255)
          {
            Paint localPaint = new Paint();
            localPaint.setAlpha(this.zgn);
            paramCanvas.drawBitmap(this.zgv, (Rect)localObject2, (Rect)localObject1, localPaint);
            this.zgn += 20;
            invalidate();
            AppMethodBeat.o(33277);
          }
          else
          {
            paramCanvas.drawBitmap(this.zgv, (Rect)localObject2, (Rect)localObject1, null);
            this.fAA = false;
            this.rotation = 0.0F;
            this.zgm = 0;
            this.zgn = 0;
            this.zgp = false;
            this.zgo = false;
            AppMethodBeat.o(33277);
          }
        }
      }
      else
      {
        localObject1 = new Rect(0, 0, this.zgv.getWidth(), this.zgv.getHeight());
        localObject2 = new Rect(zgy, zgz, this.zgv.getWidth() + zgy, this.zgv.getHeight() + zgz);
        paramCanvas.drawBitmap(this.zgv, (Rect)localObject1, (Rect)localObject2, null);
        AppMethodBeat.o(33277);
      }
    }
  }

  public void setDrawListener(a parama)
  {
    this.zgx = parama;
  }

  public static abstract interface a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.viewitems.ChattingItemSendOkProgressBar
 * JD-Core Version:    0.6.2
 */