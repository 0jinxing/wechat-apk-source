package com.tencent.mm.plugin.emojicapture.ui.editor;

import a.f.b.j;
import a.l;
import a.v;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.view.EmojiStatusView;
import com.tencent.mm.media.editor.a.a;
import com.tencent.mm.media.editor.a.f;
import com.tencent.mm.media.editor.c.c;
import com.tencent.mm.plugin.emojicapture.c.c.a;
import com.tencent.mm.plugin.emojicapture.c.c.b;
import com.tencent.mm.plugin.gif.h;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/emojicapture/ui/editor/EmojiEditorItemView;", "Lcom/tencent/mm/emoji/view/EmojiStatusView;", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorItemContract$IView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "presenter", "Lcom/tencent/mm/plugin/emojicapture/contract/EditorItemContract$IPresenter;", "createEditorData", "Lcom/tencent/mm/media/editor/item/BaseEditorData;", "createEditorItem", "Lcom/tencent/mm/media/editor/item/BaseEditorItem;", "getItemContainer", "Lcom/tencent/mm/plugin/emojicapture/ui/editor/EditorItemContainer;", "handleRemove", "", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "setEditing", "editing", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setValidArea", "bounds", "Landroid/graphics/RectF;", "radius", "", "plugin-emojicapture_release"})
public final class EmojiEditorItemView extends EmojiStatusView
  implements c.b
{
  private final String TAG;
  private final c.a lmS;

  public EmojiEditorItemView(Context paramContext)
  {
    this(paramContext, null);
  }

  public EmojiEditorItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public EmojiEditorItemView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(3103);
    this.TAG = "MicroMsg.EmojiEditorItemView";
    this.lmS = ((c.a)new com.tencent.mm.plugin.emojicapture.e.b((c.b)this));
    AppMethodBeat.o(3103);
  }

  public final com.tencent.mm.media.editor.a.b UI()
  {
    AppMethodBeat.i(3102);
    Object localObject;
    if (getEmojiInfo() == null)
    {
      localObject = null;
      AppMethodBeat.o(3102);
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
        AppMethodBeat.o(3102);
        throw ((Throwable)localObject);
      }
      localObject = (com.tencent.mm.media.editor.a.b)new com.tencent.mm.media.editor.a.d(((BitmapDrawable)localObject).getBitmap(), this.lmS.getTouchTracker().aKk);
      AppMethodBeat.o(3102);
    }
    float f = 1.0F;
    if ((getDrawable() instanceof com.tencent.mm.plugin.gif.d))
    {
      localObject = getDrawable();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMGIFDrawable");
        AppMethodBeat.o(3102);
        throw ((Throwable)localObject);
      }
      f = ((com.tencent.mm.plugin.gif.d)localObject).getEmojiDensityScale();
    }
    while (true)
    {
      localObject = new Matrix();
      ((Matrix)localObject).setScale(f, f);
      ((Matrix)localObject).postConcat(this.lmS.getTouchTracker().aKk);
      EmojiInfo localEmojiInfo = getEmojiInfo();
      if (localEmojiInfo == null)
        j.dWJ();
      localObject = (com.tencent.mm.media.editor.a.b)new f(localEmojiInfo, (Matrix)localObject);
      AppMethodBeat.o(3102);
      break;
      if ((getDrawable() instanceof h))
      {
        localObject = getDrawable();
        if (localObject == null)
        {
          localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.gif.MMWXGFDrawable");
          AppMethodBeat.o(3102);
          throw ((Throwable)localObject);
        }
        f = ((h)localObject).getEmojiDensityScale();
      }
    }
  }

  public final a UJ()
  {
    return null;
  }

  public final void a(RectF paramRectF, float paramFloat)
  {
    AppMethodBeat.i(3096);
    j.p(paramRectF, "bounds");
    this.lmS.a(paramRectF, paramFloat);
    AppMethodBeat.o(3096);
  }

  public final boolean bob()
  {
    return false;
  }

  public final EditorItemContainer getItemContainer()
  {
    AppMethodBeat.i(3098);
    Object localObject = getParent();
    j.o(localObject, "parent");
    if ((((ViewParent)localObject).getParent() instanceof EditorItemContainer))
    {
      localObject = getParent();
      j.o(localObject, "parent");
      localObject = ((ViewParent)localObject).getParent();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.emojicapture.ui.editor.EditorItemContainer");
        AppMethodBeat.o(3098);
        throw ((Throwable)localObject);
      }
      localObject = (EditorItemContainer)localObject;
      AppMethodBeat.o(3098);
    }
    while (true)
    {
      return localObject;
      localObject = null;
      AppMethodBeat.o(3098);
    }
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(3101);
    j.p(paramCanvas, "canvas");
    paramCanvas.save();
    this.lmS.h(paramCanvas);
    Drawable localDrawable = getDrawable();
    if (localDrawable != null)
      localDrawable.draw(paramCanvas);
    paramCanvas.restore();
    this.lmS.i(paramCanvas);
    AppMethodBeat.o(3101);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(3100);
    j.p(paramMotionEvent, "event");
    boolean bool = this.lmS.G(paramMotionEvent);
    AppMethodBeat.o(3100);
    return bool;
  }

  public final void setEditing(boolean paramBoolean)
  {
    AppMethodBeat.i(3097);
    this.lmS.setEditing(paramBoolean);
    AppMethodBeat.o(3097);
  }

  public final void setImageDrawable(Drawable paramDrawable)
  {
    AppMethodBeat.i(3099);
    super.setImageDrawable(paramDrawable);
    if (paramDrawable != null)
    {
      this.lmS.dV(paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
      paramDrawable.setBounds(0, 0, paramDrawable.getIntrinsicWidth(), paramDrawable.getIntrinsicHeight());
    }
    AppMethodBeat.o(3099);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.editor.EmojiEditorItemView
 * JD-Core Version:    0.6.2
 */