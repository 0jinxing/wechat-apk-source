package com.tencent.mm.plugin.emojicapture.ui.editor.a;

import a.f.b.j;
import a.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/DefaultTextDrawer;", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/TextDrawer;", "()V", "text", "", "drawLine", "", "canvas", "Landroid/graphics/Canvas;", "lineStart", "", "lineEnd", "x", "", "y", "paint", "Landroid/graphics/Paint;", "withEllipsis", "", "refresh", "setText", "switchFont", "fontName", "", "plugin-emojicapture_release"})
public final class a
  implements c
{
  private CharSequence text;

  public final void Kd(String paramString)
  {
    AppMethodBeat.i(3132);
    j.p(paramString, "fontName");
    AppMethodBeat.o(3132);
  }

  public final void a(Canvas paramCanvas, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, Paint paramPaint, boolean paramBoolean)
  {
    AppMethodBeat.i(3133);
    j.p(paramCanvas, "canvas");
    j.p(paramPaint, "paint");
    if (this.text == null)
      AppMethodBeat.o(3133);
    while (true)
    {
      return;
      paramCanvas.drawText(this.text, paramInt1, paramInt2, paramFloat1, paramFloat2, paramPaint);
      if (paramBoolean)
      {
        float f = paramPaint.measureText(this.text, paramInt1, paramInt2);
        paramCanvas.drawText(c.a.boe(), f + paramFloat1, paramFloat2, paramPaint);
      }
      AppMethodBeat.o(3133);
    }
  }

  public final void refresh()
  {
  }

  public final void setText(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(3131);
    j.p(paramCharSequence, "text");
    this.text = paramCharSequence;
    AppMethodBeat.o(3131);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.a.a
 * JD-Core Version:    0.6.2
 */