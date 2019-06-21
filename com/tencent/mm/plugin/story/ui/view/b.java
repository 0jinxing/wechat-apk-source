package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CommentConfetti;", "Lcom/tencent/mm/plugin/luckymoney/particles/confetti/Confetti;", "bitmap", "Landroid/graphics/Bitmap;", "(Landroid/graphics/Bitmap;)V", "TAG", "", "getBitmap", "()Landroid/graphics/Bitmap;", "centerX", "", "centerY", "drawInternal", "", "canvas", "Landroid/graphics/Canvas;", "matrix", "Landroid/graphics/Matrix;", "paint", "Landroid/graphics/Paint;", "x", "", "y", "rotation", "percentAnimated", "getHeight", "getWidth", "plugin-story_release"})
public final class b extends com.tencent.mm.plugin.luckymoney.particles.a.b
{
  private final String TAG;
  private final Bitmap bitmap;
  private final int centerX;
  private final int centerY;

  public b(Bitmap paramBitmap)
  {
    AppMethodBeat.i(110339);
    this.bitmap = paramBitmap;
    this.TAG = "MicroMsg.CommentConfetti";
    this.centerX = (this.bitmap.getWidth() / 2);
    this.centerY = (this.bitmap.getHeight() / 2);
    AppMethodBeat.o(110339);
  }

  public final void a(Canvas paramCanvas, Matrix paramMatrix, Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(110338);
    j.p(paramCanvas, "canvas");
    j.p(paramMatrix, "matrix");
    j.p(paramPaint, "paint");
    paramFloat3 = 1.0F - paramFloat4;
    int i = paramPaint.getAlpha();
    paramMatrix.preTranslate(paramFloat1, paramFloat2);
    paramMatrix.preScale(paramFloat3, paramFloat3, this.centerX, this.centerY);
    paramPaint.setAlpha((int)(255.0F * (1.0F - paramFloat4)));
    paramCanvas.drawBitmap(this.bitmap, paramMatrix, paramPaint);
    paramPaint.setAlpha(i);
    AppMethodBeat.o(110338);
  }

  public final int getHeight()
  {
    AppMethodBeat.i(110337);
    int i = this.bitmap.getHeight();
    AppMethodBeat.o(110337);
    return i;
  }

  public final int getWidth()
  {
    AppMethodBeat.i(110336);
    int i = this.bitmap.getWidth();
    AppMethodBeat.o(110336);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.b
 * JD-Core Version:    0.6.2
 */