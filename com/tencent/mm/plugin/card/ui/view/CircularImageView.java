package com.tencent.mm.plugin.card.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CircularImageView extends ImageView
{
  private Paint aFY;

  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public CircularImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(88800);
    this.aFY = new Paint();
    AppMethodBeat.o(88800);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(88801);
    Object localObject1 = getDrawable();
    if (localObject1 != null)
    {
      Bitmap localBitmap = ((BitmapDrawable)localObject1).getBitmap();
      localObject1 = Bitmap.createBitmap(localBitmap.getWidth(), localBitmap.getHeight(), Bitmap.Config.ARGB_8888);
      Object localObject2 = new Canvas((Bitmap)localObject1);
      Rect localRect = new Rect(0, 0, localBitmap.getWidth(), localBitmap.getHeight());
      Object localObject3 = new RectF(localRect);
      this.aFY.setAntiAlias(true);
      this.aFY.setDither(true);
      this.aFY.setFlags(1);
      ((Canvas)localObject2).setDrawFilter(new PaintFlagsDrawFilter(0, 3));
      ((Canvas)localObject2).drawARGB(0, 0, 0, 0);
      ((Canvas)localObject2).drawRoundRect((RectF)localObject3, 20.0F, 20.0F, this.aFY);
      this.aFY.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
      ((Canvas)localObject2).drawBitmap(localBitmap, localRect, localRect, this.aFY);
      localObject3 = new Rect(0, 0, ((Bitmap)localObject1).getWidth(), ((Bitmap)localObject1).getHeight());
      localObject2 = new Rect(0, 0, getWidth(), getHeight());
      this.aFY.reset();
      paramCanvas.drawBitmap((Bitmap)localObject1, (Rect)localObject3, (Rect)localObject2, this.aFY);
      paramCanvas.save();
      AppMethodBeat.o(88801);
    }
    while (true)
    {
      return;
      super.onDraw(paramCanvas);
      AppMethodBeat.o(88801);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.ui.view.CircularImageView
 * JD-Core Version:    0.6.2
 */