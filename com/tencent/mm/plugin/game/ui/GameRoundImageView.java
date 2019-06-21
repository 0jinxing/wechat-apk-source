package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class GameRoundImageView extends AppCompatImageView
{
  private static final PorterDuffXfermode kPO;
  private Bitmap bitmap;
  private RectF kPM;
  private Bitmap kPN;
  private Rect rect;

  static
  {
    AppMethodBeat.i(112170);
    kPO = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    AppMethodBeat.o(112170);
  }

  public GameRoundImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(112167);
    Paint localPaint = new Paint();
    localPaint.setAntiAlias(true);
    localPaint.setColor(-1);
    if (this.rect == null)
      this.rect = new Rect(0, 0, getWidth(), getHeight());
    if (this.kPM == null)
      this.kPM = new RectF(this.rect);
    if ((this.bitmap != null) && (this.kPN != null))
    {
      int i = paramCanvas.saveLayer(0.0F, 0.0F, getWidth(), getHeight(), null, 31);
      paramCanvas.drawBitmap(this.kPN, this.rect, this.rect, localPaint);
      localPaint.setXfermode(kPO);
      paramCanvas.drawBitmap(this.bitmap, null, this.rect, localPaint);
      paramCanvas.restoreToCount(i);
      localPaint.setXfermode(null);
    }
    localPaint.setStyle(Paint.Style.STROKE);
    localPaint.setStrokeWidth(1.0F);
    localPaint.setColor(getResources().getColor(2131690084));
    paramCanvas.drawRoundRect(this.kPM, 18.0F, 18.0F, localPaint);
    AppMethodBeat.o(112167);
  }

  protected void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(112168);
    this.kPM = new RectF(0.0F, 0.0F, paramInt1, paramInt2);
    this.rect = new Rect(0, 0, paramInt1, paramInt2);
    Bitmap localBitmap = Bitmap.createBitmap(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
    Canvas localCanvas = new Canvas(localBitmap);
    Paint localPaint = new Paint(1);
    localPaint.setColor(-1);
    localCanvas.drawRoundRect(this.kPM, 18.0F, 18.0F, localPaint);
    this.kPN = localBitmap;
    AppMethodBeat.o(112168);
  }

  public void setImageBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(112169);
    this.bitmap = paramBitmap;
    super.setImageBitmap(paramBitmap);
    AppMethodBeat.o(112169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameRoundImageView
 * JD-Core Version:    0.6.2
 */