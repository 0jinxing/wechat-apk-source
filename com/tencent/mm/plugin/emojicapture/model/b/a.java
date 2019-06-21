package com.tencent.mm.plugin.emojicapture.model.b;

import a.f.b.j;
import a.l;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.RectF;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.f.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/model/mix/EmojiFrameRetriever;", "Lcom/tencent/mm/media/mix/FrameRetriever;", "preViewRect", "Landroid/graphics/RectF;", "(Landroid/graphics/RectF;)V", "bitmap", "Landroid/graphics/Bitmap;", "canvas", "Landroid/graphics/Canvas;", "currFrameTime", "", "drawer", "Lcom/tencent/mm/media/mix/EditorFrameDrawer;", "editorItems", "", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "getEditorItems", "()Ljava/util/List;", "setEditorItems", "(Ljava/util/List;)V", "height", "", "paint", "Landroid/graphics/Paint;", "preViewMatrix", "Landroid/graphics/Matrix;", "width", "addItem", "", "item", "requestNextFrame", "Lcom/tencent/mm/media/mix/FrameInfo;", "start", "stop", "plugin-emojicapture_release"})
public final class a
  implements d
{
  private final Paint aFY;
  private final Bitmap bitmap;
  private final Canvas bmG;
  private long eUj;
  List<com.tencent.mm.media.editor.a.b> eWG;
  private int height;
  private final Matrix lil;
  private final com.tencent.mm.media.f.b lim;
  private int width;

  public a(RectF paramRectF)
  {
    AppMethodBeat.i(2662);
    Object localObject = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    this.width = com.tencent.mm.plugin.emojicapture.model.c.bmM();
    localObject = com.tencent.mm.plugin.emojicapture.model.c.lhw;
    this.height = com.tencent.mm.plugin.emojicapture.model.c.bmM();
    this.eWG = ((List)new ArrayList());
    this.lil = new Matrix();
    this.aFY = new Paint();
    this.lim = new com.tencent.mm.media.f.b(this.eWG);
    localObject = this.lil;
    float f1 = paramRectF.left;
    float f2 = paramRectF.top;
    float f3 = paramRectF.right;
    float f4 = paramRectF.bottom;
    float f5 = this.width;
    float f6 = this.height;
    ((Matrix)localObject).setPolyToPoly(new float[] { f1, f2, f3, f4 }, 0, new float[] { 0.0F, 0.0F, f5, f6 }, 0, 2);
    this.aFY.setAntiAlias(true);
    this.aFY.setFilterBitmap(true);
    paramRectF = Bitmap.createBitmap(this.width, this.height, Bitmap.Config.ARGB_8888);
    j.o(paramRectF, "Bitmap.createBitmap(widt… Bitmap.Config.ARGB_8888)");
    this.bitmap = paramRectF;
    this.bmG = new Canvas(this.bitmap);
    AppMethodBeat.o(2662);
  }

  public final com.tencent.mm.media.f.c UX()
  {
    AppMethodBeat.i(2659);
    com.tencent.mm.media.f.c localc;
    if (this.eWG.size() <= 0)
    {
      localc = null;
      AppMethodBeat.o(2659);
    }
    while (true)
    {
      return localc;
      int i = this.bmG.save();
      this.bmG.drawColor(0, PorterDuff.Mode.MULTIPLY);
      this.bmG.concat(this.lil);
      this.eUj = this.lim.a(this.bmG, this.aFY);
      this.bmG.restoreToCount(i);
      localc = new com.tencent.mm.media.f.c(this.bitmap, this.eUj);
      AppMethodBeat.o(2659);
    }
  }

  public final void a(com.tencent.mm.media.editor.a.b paramb)
  {
    AppMethodBeat.i(2661);
    if (paramb != null)
      this.eWG.add(paramb);
    AppMethodBeat.o(2661);
  }

  public final void stop()
  {
    AppMethodBeat.i(2660);
    Iterator localIterator = this.eWG.iterator();
    while (localIterator.hasNext())
      ((com.tencent.mm.media.editor.a.b)localIterator.next()).destroy();
    AppMethodBeat.o(2660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.model.b.a
 * JD-Core Version:    0.6.2
 */