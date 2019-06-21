package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.media.editor.a.a;
import com.tencent.mm.media.editor.a.d;
import com.tencent.mm.media.editor.c.c;
import com.tencent.mm.plugin.emojicapture.c.c.a;
import com.tencent.mm.plugin.emojicapture.c.c.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/BitmapEditorItemView;", "Landroid/view/View;", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorItemContract$IView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "value", "Landroid/graphics/Bitmap;", "bitmap", "getBitmap", "()Landroid/graphics/Bitmap;", "setBitmap", "(Landroid/graphics/Bitmap;)V", "presenter", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorItemContract$IPresenter;", "createEditorData", "Lcom/tencent/mm/media/editor/item/BaseEditorData;", "createEditorItem", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "getItemContainer", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "handleRemove", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "pause", "resume", "setEditing", "editing", "setValidArea", "bounds", "Landroid/graphics/RectF;", "radius", "", "plugin-emojicapture_release"})
public final class BitmapEditorItemView extends View
  implements c.b
{
  private Bitmap bitmap;
  private final c.a lmS;

  public BitmapEditorItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public BitmapEditorItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(3024);
    this.lmS = ((c.a)new com.tencent.mm.plugin.emojicapture.e.b((c.b)this));
    AppMethodBeat.o(3024);
  }

  public final com.tencent.mm.media.editor.a.b UI()
  {
    AppMethodBeat.i(3023);
    com.tencent.mm.media.editor.a.b localb;
    if (this.bitmap == null)
    {
      localb = null;
      AppMethodBeat.o(3023);
    }
    while (true)
    {
      return localb;
      localb = (com.tencent.mm.media.editor.a.b)new d(this.bitmap, this.lmS.getTouchTracker().aKk);
      AppMethodBeat.o(3023);
    }
  }

  public final a UJ()
  {
    return null;
  }

  public final void a(RectF paramRectF, float paramFloat)
  {
    AppMethodBeat.i(3018);
    j.p(paramRectF, "bounds");
    this.lmS.a(paramRectF, paramFloat);
    AppMethodBeat.o(3018);
  }

  public final boolean bob()
  {
    return false;
  }

  public final Bitmap getBitmap()
  {
    return this.bitmap;
  }

  public final EditorItemContainer getItemContainer()
  {
    AppMethodBeat.i(3020);
    Object localObject;
    if ((getParent() instanceof EditorItemContainer))
    {
      localObject = getParent();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer");
        AppMethodBeat.o(3020);
        throw ((Throwable)localObject);
      }
      localObject = (EditorItemContainer)localObject;
      AppMethodBeat.o(3020);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(3020);
    }
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(3022);
    j.p(paramCanvas, "canvas");
    paramCanvas.save();
    this.lmS.h(paramCanvas);
    if (this.bitmap != null)
      paramCanvas.drawBitmap(this.bitmap, 0.0F, 0.0F, null);
    paramCanvas.restore();
    AppMethodBeat.o(3022);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3021);
    j.p(paramMotionEvent, "event");
    boolean bool = this.lmS.G(paramMotionEvent);
    AppMethodBeat.o(3021);
    return bool;
  }

  public final void pause()
  {
  }

  public final void resume()
  {
  }

  public final void setBitmap(Bitmap paramBitmap)
  {
    AppMethodBeat.i(3017);
    this.bitmap = paramBitmap;
    if (paramBitmap != null)
      this.lmS.dV(paramBitmap.getWidth(), paramBitmap.getHeight());
    AppMethodBeat.o(3017);
  }

  public final void setEditing(boolean paramBoolean)
  {
    AppMethodBeat.i(3019);
    this.lmS.setEditing(paramBoolean);
    invalidate();
    AppMethodBeat.o(3019);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.BitmapEditorItemView
 * JD-Core Version:    0.6.2
 */