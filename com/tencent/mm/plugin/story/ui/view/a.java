package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import a.v;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.LayerDrawable;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/CommentAvatarConfetti;", "Lcom/tencent/mm/plugin/luckymoney/particles/confetti/Confetti;", "avatarDrawable", "Landroid/graphics/drawable/LayerDrawable;", "(Landroid/graphics/drawable/LayerDrawable;)V", "TAG", "", "centerX", "", "centerY", "drawInternal", "", "canvas", "Landroid/graphics/Canvas;", "matrix", "Landroid/graphics/Matrix;", "paint", "Landroid/graphics/Paint;", "x", "", "y", "rotation", "percentAnimated", "getHeight", "getWidth", "plugin-story_release"})
public final class a extends com.tencent.mm.plugin.luckymoney.particles.a.b
{
  private final String TAG;
  private final int centerX;
  private final int centerY;
  private final LayerDrawable sin;

  public a(LayerDrawable paramLayerDrawable)
  {
    AppMethodBeat.i(138893);
    this.sin = paramLayerDrawable;
    this.TAG = "MicroMsg.CommentConfetti";
    this.centerX = (this.sin.getIntrinsicWidth() / 2);
    this.centerY = (this.sin.getIntrinsicHeight() / 2);
    AppMethodBeat.o(138893);
  }

  public final void a(Canvas paramCanvas, Matrix paramMatrix, Paint paramPaint, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    AppMethodBeat.i(138892);
    j.p(paramCanvas, "canvas");
    j.p(paramMatrix, "matrix");
    j.p(paramPaint, "paint");
    paramFloat3 = 1.0F - paramFloat4;
    paramFloat4 = 1.0F - paramFloat4;
    paramPaint.setAlpha((int)(paramFloat4 * 255.0F));
    paramCanvas.save();
    paramCanvas.translate(paramFloat1, paramFloat2);
    paramCanvas.scale(paramFloat3, paramFloat3);
    paramMatrix = this.sin.getDrawable(1);
    if (paramMatrix == null)
    {
      paramCanvas = new v("null cannot be cast to non-null type com.tencent.mm.pluginsdk.ui.AvatarRoundDrawable");
      AppMethodBeat.o(138892);
      throw paramCanvas;
    }
    ((com.tencent.mm.pluginsdk.ui.b)paramMatrix).KK((int)(paramFloat4 * 255.0F));
    this.sin.draw(paramCanvas);
    paramCanvas.restore();
    AppMethodBeat.o(138892);
  }

  public final int getHeight()
  {
    AppMethodBeat.i(138891);
    int i = this.sin.getIntrinsicHeight();
    AppMethodBeat.o(138891);
    return i;
  }

  public final int getWidth()
  {
    AppMethodBeat.i(138890);
    int i = this.sin.getIntrinsicWidth();
    AppMethodBeat.o(138890);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.a
 * JD-Core Version:    0.6.2
 */