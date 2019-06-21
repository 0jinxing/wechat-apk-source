package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.scanner.b.a;
import com.tencent.mm.sdk.platformtools.ab;

public class RoundCornerImageView extends ImageView
{
  private int qdE;
  private int qdF;

  public RoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(81144);
    this.qdE = 8;
    this.qdF = 8;
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(81144);
  }

  public RoundCornerImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(81143);
    this.qdE = 8;
    this.qdF = 8;
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(81143);
  }

  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(81145);
    if (paramAttributeSet != null)
    {
      paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, b.a.RoundCornerImageView);
      this.qdE = paramContext.getDimensionPixelSize(0, this.qdE);
      this.qdF = paramContext.getDimensionPixelSize(1, this.qdF);
      paramContext.recycle();
      AppMethodBeat.o(81145);
    }
    while (true)
    {
      return;
      float f = paramContext.getResources().getDisplayMetrics().density;
      this.qdE = ((int)(this.qdE * f));
      this.qdF = ((int)(f * this.qdF));
      AppMethodBeat.o(81145);
    }
  }

  public void draw(Canvas paramCanvas)
  {
    AppMethodBeat.i(81146);
    Object localObject1 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
    Object localObject2 = new Canvas((Bitmap)localObject1);
    Object localObject3 = localObject1;
    if (((Bitmap)localObject1).isRecycled())
    {
      localObject3 = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.ARGB_8888);
      localObject2 = new Canvas((Bitmap)localObject3);
    }
    super.draw((Canvas)localObject2);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    localObject1 = new Path();
    ((Path)localObject1).addRoundRect(new RectF(0.0F, 0.0F, getWidth(), getHeight()), this.qdE, this.qdF, Path.Direction.CW);
    ((Path)localObject1).setFillType(Path.FillType.INVERSE_WINDING);
    ((Canvas)localObject2).drawPath((Path)localObject1, localPaint);
    localObject2 = new Paint();
    ((Paint)localObject2).setXfermode(null);
    paramCanvas.drawBitmap((Bitmap)localObject3, 0.0F, 0.0F, (Paint)localObject2);
    ab.i("RoundCornerImageView", "bitmap recycle %s", new Object[] { localObject3.toString() });
    ((Bitmap)localObject3).recycle();
    AppMethodBeat.o(81146);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.RoundCornerImageView
 * JD-Core Version:    0.6.2
 */