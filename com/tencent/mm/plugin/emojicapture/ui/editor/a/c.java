package com.tencent.mm.plugin.emojicapture.ui.editor.a;

import a.l;
import android.graphics.Canvas;
import android.graphics.Paint;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/text/TextDrawer;", "", "drawLine", "", "canvas", "Landroid/graphics/Canvas;", "lineStart", "", "lineEnd", "x", "", "y", "paint", "Landroid/graphics/Paint;", "withEllipsis", "", "refresh", "setText", "text", "", "switchFont", "fontPath", "", "Companion", "plugin-emojicapture_release"})
public abstract interface c
{
  public static final c.a loI = c.a.loK;

  public abstract void Kd(String paramString);

  public abstract void a(Canvas paramCanvas, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, Paint paramPaint, boolean paramBoolean);

  public abstract void refresh();

  public abstract void setText(CharSequence paramCharSequence);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.a.c
 * JD-Core Version:    0.6.2
 */