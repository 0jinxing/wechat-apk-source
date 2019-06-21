package com.tencent.mm.media.editor.a;

import a.l;
import android.graphics.Canvas;
import android.graphics.Paint;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "", "()V", "currFrameTime", "", "getCurrFrameTime", "()J", "setCurrFrameTime", "(J)V", "consumeTime", "lastFrameTime", "destroy", "", "draw", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "init", "prepareNext", "plugin-mediaeditor_release"})
public abstract class b
{
  long eUj;

  public abstract long UH();

  public abstract void destroy();

  public abstract void draw(Canvas paramCanvas, Paint paramPaint);

  public long ff(long paramLong)
  {
    while (this.eUj <= paramLong)
      this.eUj += UH();
    this.eUj -= paramLong;
    return this.eUj;
  }

  public abstract void init();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.a.b
 * JD-Core Version:    0.6.2
 */