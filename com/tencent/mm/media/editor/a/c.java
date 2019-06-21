package com.tencent.mm.media.editor.a;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/item/BitmapArrayEditorItem;", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "bitmapArray", "", "Landroid/graphics/Bitmap;", "animInterval", "", "matrix", "Landroid/graphics/Matrix;", "([Landroid/graphics/Bitmap;JLandroid/graphics/Matrix;)V", "bitmaps", "", "currIndex", "", "destroy", "", "draw", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "init", "prepareNext", "plugin-mediaeditor_release"})
public final class c extends b
{
  private final Matrix aKk;
  private final List<Bitmap> bitmaps;
  private int eUk;
  private final long eUl;

  public c(Bitmap[] paramArrayOfBitmap, Matrix paramMatrix)
  {
    AppMethodBeat.i(12877);
    this.eUl = 100L;
    this.aKk = paramMatrix;
    this.bitmaps = ((List)new ArrayList());
    if (paramArrayOfBitmap != null)
    {
      int i = paramArrayOfBitmap.length;
      for (int j = 0; j < i; j++)
      {
        paramMatrix = paramArrayOfBitmap[j];
        if (paramMatrix != null)
          this.bitmaps.add(paramMatrix);
      }
    }
    AppMethodBeat.o(12877);
  }

  public final long UH()
  {
    AppMethodBeat.i(12876);
    long l;
    if (this.bitmaps.isEmpty())
    {
      l = 9223372036854775807L;
      AppMethodBeat.o(12876);
    }
    while (true)
    {
      return l;
      this.eUk += 1;
      this.eUk %= ((Collection)this.bitmaps).size();
      l = this.eUl;
      AppMethodBeat.o(12876);
    }
  }

  public final void destroy()
  {
  }

  public final void draw(Canvas paramCanvas, Paint paramPaint)
  {
    AppMethodBeat.i(12875);
    j.p(paramCanvas, "canvas");
    j.p(paramPaint, "paint");
    if (this.bitmaps.isEmpty())
      AppMethodBeat.o(12875);
    while (true)
    {
      return;
      Bitmap localBitmap = (Bitmap)this.bitmaps.get(this.eUk);
      paramCanvas.save();
      paramCanvas.concat(this.aKk);
      paramCanvas.drawBitmap(localBitmap, 0.0F, 0.0F, paramPaint);
      paramCanvas.restore();
      AppMethodBeat.o(12875);
    }
  }

  public final void init()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.a.c
 * JD-Core Version:    0.6.2
 */