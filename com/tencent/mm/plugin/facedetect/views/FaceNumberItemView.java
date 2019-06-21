package com.tencent.mm.plugin.facedetect.views;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Timer;

public class FaceNumberItemView extends View
{
  static final long maX = 29L;
  Timer maW;
  private boolean maY;
  private Paint maZ;
  private RectF mba;
  private Bitmap mbb;
  private int mbc;
  int mbd;
  Runnable mbe;

  public FaceNumberItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public FaceNumberItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(645);
    this.maW = null;
    this.maY = false;
    this.maZ = null;
    this.mba = null;
    this.mbb = null;
    this.mbc = 17;
    this.mbd = 0;
    this.mbe = new FaceNumberItemView.1(this);
    setLayerType(1, null);
    this.maZ = new Paint();
    this.maZ.setColor(paramContext.getResources().getColor(2131690028));
    this.maZ.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
    this.mba = new RectF();
    AppMethodBeat.o(645);
  }

  public final void btK()
  {
    AppMethodBeat.i(648);
    if (this.maW != null)
    {
      this.maW.cancel();
      this.maW = null;
    }
    AppMethodBeat.o(648);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(649);
    super.onDraw(paramCanvas);
    float f1;
    float f2;
    if (this.mbc == 17)
    {
      f1 = getWidth() - this.mbb.getWidth() >> 1;
      f2 = getHeight() - this.mbb.getHeight() >> 1;
    }
    while (true)
    {
      if (!this.maY)
        paramCanvas.drawBitmap(this.mbb, f1, f2, null);
      this.mba.set(f1, 0.0F, this.mbb.getWidth() * this.mbd / 30.0F + f1, getHeight());
      paramCanvas.drawRect(this.mba, this.maZ);
      AppMethodBeat.o(649);
      return;
      if (this.mbc == 3)
      {
        f2 = getHeight() - this.mbb.getHeight() >> 1;
        f1 = 0.0F;
      }
      else if (this.mbc == 5)
      {
        f1 = getWidth() - this.mbb.getWidth();
        f2 = getHeight() - this.mbb.getHeight() >> 1;
      }
      else
      {
        ab.e("MicroMsg.FaceNumberItemView", "hy: not support gravity! treat as center");
        f1 = getWidth() - this.mbb.getWidth() >> 1;
        f2 = getHeight() - this.mbb.getHeight() >> 1;
      }
    }
  }

  public void setGravity(int paramInt)
  {
    AppMethodBeat.i(647);
    ab.i("MicroMsg.FaceNumberItemView", "hy: setting gravity");
    this.mbc = paramInt;
    AppMethodBeat.o(647);
  }

  public void setImageResource(int paramInt)
  {
    AppMethodBeat.i(646);
    Bitmap localBitmap1 = BitmapFactory.decodeResource(getResources(), paramInt);
    if (paramInt == 2130838658)
    {
      paramInt = (getResources().getDimensionPixelSize(2131428396) - a.fromDPToPix(getContext(), 8)) / 2;
      Bitmap localBitmap2 = Bitmap.createBitmap(localBitmap1.getWidth() + paramInt * 2, localBitmap1.getHeight() + 0, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas(localBitmap2);
      localCanvas.drawARGB(0, 255, 255, 255);
      localCanvas.drawBitmap(localBitmap1, paramInt, 0.0F, null);
      this.mbb = localBitmap2;
      AppMethodBeat.o(646);
    }
    while (true)
    {
      return;
      this.mbb = Bitmap.createScaledBitmap(localBitmap1, a.fromDPToPix(getContext(), 48), localBitmap1.getHeight(), false);
      AppMethodBeat.o(646);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.views.FaceNumberItemView
 * JD-Core Version:    0.6.2
 */