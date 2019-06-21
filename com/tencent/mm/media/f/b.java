package com.tencent.mm.media.f;

import a.f.b.j;
import a.l;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/mix/EditorFrameDrawer;", "", "editorItems", "", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "(Ljava/util/List;)V", "currFrameTime", "", "drawFrame", "canvas", "Landroid/graphics/Canvas;", "paint", "Landroid/graphics/Paint;", "plugin-mediaeditor_release"})
public final class b
{
  private long eUj;
  private final List<com.tencent.mm.media.editor.a.b> eWG;

  public b(List<com.tencent.mm.media.editor.a.b> paramList)
  {
    AppMethodBeat.i(12991);
    this.eWG = paramList;
    AppMethodBeat.o(12991);
  }

  public final long a(Canvas paramCanvas, Paint paramPaint)
  {
    AppMethodBeat.i(12990);
    j.p(paramCanvas, "canvas");
    j.p(paramPaint, "paint");
    if (this.eWG.size() <= 0)
    {
      l1 = 0L;
      AppMethodBeat.o(12990);
      return l1;
    }
    Iterator localIterator = this.eWG.iterator();
    long l1 = 9223372036854775807L;
    label55: if (localIterator.hasNext())
    {
      com.tencent.mm.media.editor.a.b localb = (com.tencent.mm.media.editor.a.b)localIterator.next();
      long l2 = localb.ff(this.eUj);
      localb.draw(paramCanvas, paramPaint);
      if (l2 >= l1)
        break label127;
      l1 = l2;
    }
    label127: 
    while (true)
    {
      break label55;
      this.eUj = l1;
      l1 = this.eUj;
      AppMethodBeat.o(12990);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.f.b
 * JD-Core Version:    0.6.2
 */