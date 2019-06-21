package com.tencent.mm.media.editor.a;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/item/BitmapEditorItem;", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "bitmap", "Landroid/graphics/Bitmap;", "matrix", "Landroid/graphics/Matrix;", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;)V", "destroy", "", "draw", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "init", "prepareNext", "", "plugin-mediaeditor_release"})
public final class d extends b
{
  private final Matrix aKk;
  private Bitmap bitmap;

  public d(Bitmap paramBitmap, Matrix paramMatrix)
  {
    AppMethodBeat.i(12879);
    this.bitmap = paramBitmap;
    this.aKk = paramMatrix;
    AppMethodBeat.o(12879);
  }

  public final long UH()
  {
    return 9223372036854775807L;
  }

  public final void destroy()
  {
  }

  public final void draw(Canvas paramCanvas, Paint paramPaint)
  {
    AppMethodBeat.i(12878);
    j.p(paramCanvas, "canvas");
    j.p(paramPaint, "paint");
    paramCanvas.save();
    paramCanvas.concat(this.aKk);
    paramCanvas.drawBitmap(this.bitmap, 0.0F, 0.0F, paramPaint);
    paramCanvas.restore();
    AppMethodBeat.o(12878);
  }

  public final void init()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.a.d
 * JD-Core Version:    0.6.2
 */