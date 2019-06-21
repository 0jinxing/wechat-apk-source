package com.tencent.mm.plugin.webview.ui.tools.bag;

import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class j extends View
{
  int mHeight;
  private Bitmap mMaskBitmap;
  private Paint mPaint;
  int mWidth;
  private Bitmap uyO;
  private Canvas uyP;
  private Paint uyQ;
  private Rect uyR;
  private RectF uyS;
  private int uyT;
  int uyU;
  int uyV;
  int uyW;
  int uyX;
  boolean uyY;
  private AnimatorListenerAdapter uyZ;

  public j(Context paramContext, Bitmap paramBitmap)
  {
    super(paramContext);
    AppMethodBeat.i(8181);
    this.uyX = -1;
    this.mPaint = new Paint();
    this.uyQ = new Paint();
    paramContext = new PorterDuffXfermode(PorterDuff.Mode.DST_IN);
    this.uyQ.setXfermode(paramContext);
    this.uyO = paramBitmap;
    this.mWidth = paramBitmap.getWidth();
    this.mHeight = paramBitmap.getHeight();
    this.uyR = new Rect(0, 0, this.mWidth, this.mHeight);
    this.mMaskBitmap = Bitmap.createBitmap(this.mWidth, this.mHeight, Bitmap.Config.ARGB_8888);
    this.uyP = new Canvas(this.mMaskBitmap);
    this.uyS = new RectF();
    this.uyS.left = 0.0F;
    this.uyS.top = 0.0F;
    this.uyS.right = this.mWidth;
    this.uyS.bottom = this.mHeight;
    ab.i("MicroMsg.TransformToBagAniMask", String.format("init: mWidth:%d mHeight:%d", new Object[] { Integer.valueOf(this.mWidth), Integer.valueOf(this.mHeight) }));
    AppMethodBeat.o(8181);
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(8182);
    paramCanvas.save();
    if (this.uyY)
      paramCanvas.translate(this.uyT, 0.0F);
    paramCanvas.clipRect(this.uyS);
    paramCanvas.drawBitmap(this.uyO, this.uyR, this.uyR, this.mPaint);
    paramCanvas.restore();
    AppMethodBeat.o(8182);
  }

  protected final void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(8183);
    super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.mWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(this.mHeight, 1073741824));
    AppMethodBeat.o(8183);
  }

  public final void setContentStartPosX(int paramInt)
  {
    this.uyX = paramInt;
  }

  public final void setListener(AnimatorListenerAdapter paramAnimatorListenerAdapter)
  {
    this.uyZ = paramAnimatorListenerAdapter;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.bag.j
 * JD-Core Version:    0.6.2
 */