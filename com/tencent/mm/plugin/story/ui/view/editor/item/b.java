package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.BaseEmojiView;
import com.tencent.mm.media.editor.a.f;
import com.tencent.mm.media.editor.a.g;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/editor/item/EmojiItemView;", "Lcom/tencent/mm/emoji/view/BaseEmojiView;", "Lcom/tencent/mm/media/editor/item/IEditable;", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/IEditView;", "context", "Landroid/content/Context;", "isReshow", "", "(Landroid/content/Context;Z)V", "TAG", "", "frameDrawable", "Lcom/tencent/mm/media/editor/view/ActiveFrameDrawable;", "()Z", "setReshow", "(Z)V", "newRect", "Landroid/graphics/Rect;", "stateResolve", "Lcom/tencent/mm/plugin/story/ui/view/editor/item/EditorItemContainer$ItemStateResolve;", "touchTracker", "Lcom/tencent/mm/media/editor/touch/TouchTracker;", "value", "Landroid/graphics/Matrix;", "viewMatrix", "getViewMatrix", "()Landroid/graphics/Matrix;", "setViewMatrix", "(Landroid/graphics/Matrix;)V", "createEditorData", "Lcom/tencent/mm/media/editor/item/BaseEditorData;", "createEditorItem", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "getContentBoundary", "", "getSafeArea", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setSafeArea", "safeRect", "setStateResolve", "setValidArea", "validRect", "plugin-story_release"})
public final class b extends BaseEmojiView
  implements com.tencent.mm.media.editor.a.h, c
{
  private final String TAG;
  private final com.tencent.mm.media.editor.c.c lkf;
  private final com.tencent.mm.media.editor.view.a smB;
  private EditorItemContainer.b smC;
  private Matrix smG;
  private Rect smZ;
  private boolean sna;

  public b(Context paramContext, boolean paramBoolean)
  {
    super(paramContext);
    AppMethodBeat.i(110675);
    this.sna = paramBoolean;
    this.TAG = "MicroMsg.EmojiItemView";
    this.lkf = new com.tencent.mm.media.editor.c.c();
    this.smZ = new Rect();
    this.lkf.aJg = 0.5F;
    this.lkf.aJf = 3.0F;
    paramContext = getResources();
    j.o(paramContext, "resources");
    this.smB = new com.tencent.mm.media.editor.view.a(paramContext);
    AppMethodBeat.o(110675);
  }

  public final com.tencent.mm.media.editor.a.b UI()
  {
    AppMethodBeat.i(110670);
    Object localObject;
    if (getEmojiInfo() == null)
    {
      localObject = null;
      AppMethodBeat.o(110670);
    }
    while (true)
    {
      return localObject;
      if (!(getDrawable() instanceof BitmapDrawable))
        break;
      localObject = getDrawable();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type android.graphics.drawable.BitmapDrawable");
        AppMethodBeat.o(110670);
        throw ((Throwable)localObject);
      }
      localObject = (com.tencent.mm.media.editor.a.b)new com.tencent.mm.media.editor.a.d(((BitmapDrawable)localObject).getBitmap(), this.lkf.aKk);
      AppMethodBeat.o(110670);
    }
    float f = 1.0F;
    if ((getDrawable() instanceof com.tencent.mm.plugin.gif.d))
    {
      localObject = getDrawable();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
        AppMethodBeat.o(110670);
        throw ((Throwable)localObject);
      }
      f = ((com.tencent.mm.plugin.gif.d)localObject).getEmojiDensityScale();
    }
    while (true)
    {
      localObject = new Matrix();
      ((Matrix)localObject).setScale(f, f);
      ((Matrix)localObject).postConcat(this.lkf.aKk);
      EmojiInfo localEmojiInfo = getEmojiInfo();
      if (localEmojiInfo == null)
        j.dWJ();
      localObject = (com.tencent.mm.media.editor.a.b)new f(localEmojiInfo, (Matrix)localObject);
      AppMethodBeat.o(110670);
      break;
      if ((getDrawable() instanceof com.tencent.mm.plugin.gif.h))
      {
        localObject = getDrawable();
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
          AppMethodBeat.o(110670);
          throw ((Throwable)localObject);
        }
        f = ((com.tencent.mm.plugin.gif.h)localObject).getEmojiDensityScale();
      }
    }
  }

  public final com.tencent.mm.media.editor.a.a UJ()
  {
    AppMethodBeat.i(110671);
    Object localObject;
    if (getEmojiInfo() == null)
    {
      localObject = null;
      AppMethodBeat.o(110671);
    }
    while (true)
    {
      return localObject;
      if (!(getDrawable() instanceof BitmapDrawable))
        break;
      localObject = (com.tencent.mm.media.editor.a.a)new g(getEmojiInfo(), this.lkf.aKk, this.lkf.aKk);
      AppMethodBeat.o(110671);
    }
    float f = 1.0F;
    if ((getDrawable() instanceof com.tencent.mm.plugin.gif.d))
    {
      localObject = getDrawable();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
        AppMethodBeat.o(110671);
        throw ((Throwable)localObject);
      }
      f = ((com.tencent.mm.plugin.gif.d)localObject).getEmojiDensityScale();
    }
    while (true)
    {
      localObject = new Matrix();
      Matrix localMatrix = new Matrix();
      localMatrix.set(this.lkf.aKk);
      ((Matrix)localObject).setScale(f, f);
      ((Matrix)localObject).postConcat(this.lkf.aKk);
      localObject = (com.tencent.mm.media.editor.a.a)new g(getEmojiInfo(), localMatrix, (Matrix)localObject);
      AppMethodBeat.o(110671);
      break;
      if ((getDrawable() instanceof com.tencent.mm.plugin.gif.h))
      {
        localObject = getDrawable();
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
          AppMethodBeat.o(110671);
          throw ((Throwable)localObject);
        }
        f = ((com.tencent.mm.plugin.gif.h)localObject).getEmojiDensityScale();
      }
    }
  }

  public final float[] getContentBoundary()
  {
    AppMethodBeat.i(110674);
    float[] arrayOfFloat = (float[])this.lkf.eUT.clone();
    AppMethodBeat.o(110674);
    return arrayOfFloat;
  }

  public final Rect getSafeArea()
  {
    AppMethodBeat.i(110673);
    Rect localRect = this.lkf.eUN;
    Object localObject = localRect;
    if (localRect == null)
    {
      localObject = getResources();
      j.o(localObject, "resources");
      int i = ((Resources)localObject).getDisplayMetrics().widthPixels;
      localObject = getResources();
      j.o(localObject, "resources");
      localObject = new Rect(0, 0, i, ((Resources)localObject).getDisplayMetrics().heightPixels);
    }
    AppMethodBeat.o(110673);
    return localObject;
  }

  public final Matrix getViewMatrix()
  {
    return this.smG;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(110667);
    j.p(paramCanvas, "canvas");
    paramCanvas.save();
    paramCanvas.setMatrix(this.lkf.aKk);
    if (isActivated())
      this.smB.draw(paramCanvas);
    Drawable localDrawable = getDrawable();
    if (localDrawable != null)
      localDrawable.draw(paramCanvas);
    paramCanvas.restore();
    AppMethodBeat.o(110667);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(110668);
    j.p(paramMotionEvent, "event");
    boolean bool = this.lkf.u(paramMotionEvent);
    if (bool)
    {
      EditorItemContainer.b localb = this.smC;
      if (localb != null)
        localb.e((View)this, paramMotionEvent);
      bringToFront();
      postInvalidate();
    }
    AppMethodBeat.o(110668);
    return bool;
  }

  public final void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(110669);
    if (paramDrawable != null)
    {
      int i = paramDrawable.getIntrinsicWidth();
      int j = paramDrawable.getIntrinsicHeight();
      if (!this.sna)
      {
        this.lkf.width = i;
        this.lkf.height = j;
        this.lkf.aKk.postTranslate(-i / 2.0F, -j / 2.0F);
      }
      this.smB.setBounds(0, 0, i, j);
      this.lkf.h(new float[] { 0.0F, 0.0F, i, 0.0F, 0.0F, j, i, j });
    }
    super.setImageDrawable(paramDrawable);
    AppMethodBeat.o(110669);
  }

  public final void setReshow(boolean paramBoolean)
  {
    this.sna = paramBoolean;
  }

  public final void setSafeArea(Rect paramRect)
  {
    AppMethodBeat.i(110672);
    j.p(paramRect, "safeRect");
    this.lkf.eUN = paramRect;
    this.lkf.eUO = com.tencent.mm.bz.a.fromDPToPix(getContext(), 54);
    AppMethodBeat.o(110672);
  }

  public final void setStateResolve(EditorItemContainer.b paramb)
  {
    AppMethodBeat.i(110666);
    j.p(paramb, "stateResolve");
    this.smC = paramb;
    AppMethodBeat.o(110666);
  }

  public final void setValidArea(Rect paramRect)
  {
    AppMethodBeat.i(110665);
    j.p(paramRect, "validRect");
    this.smZ = paramRect;
    this.lkf.aKk.postTranslate(paramRect.width() / 2.0F, paramRect.height() / 2.0F);
    AppMethodBeat.o(110665);
  }

  public final void setViewMatrix(Matrix paramMatrix)
  {
    AppMethodBeat.i(110664);
    if (j.j(this.smG, paramMatrix))
      AppMethodBeat.o(110664);
    while (true)
    {
      return;
      if (paramMatrix != null)
        this.lkf.setMatrix(paramMatrix);
      AppMethodBeat.o(110664);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.b
 * JD-Core Version:    0.6.2
 */