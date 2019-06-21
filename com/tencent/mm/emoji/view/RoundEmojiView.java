package com.tencent.mm.emoji.view;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/view/RoundEmojiView;", "Lcom/tencent/mm/emoji/view/BaseEmojiView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "path", "Landroid/graphics/Path;", "getPath", "()Landroid/graphics/Path;", "rect", "Landroid/graphics/RectF;", "getRect", "()Landroid/graphics/RectF;", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "plugin-emojisdk_release"})
public final class RoundEmojiView extends BaseEmojiView
{
  private final Path eAv;
  private final RectF rect;

  public RoundEmojiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public RoundEmojiView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(63326);
    this.eAv = new Path();
    this.rect = new RectF();
    AppMethodBeat.o(63326);
  }

  public final Path getPath()
  {
    return this.eAv;
  }

  public final RectF getRect()
  {
    return this.rect;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(63325);
    int i = getMeasuredWidth();
    Object localObject = getDrawable();
    j.o(localObject, "drawable");
    Drawable localDrawable;
    float f1;
    float f2;
    float f5;
    if (i >= ((Drawable)localObject).getBounds().right)
    {
      i = getMeasuredHeight();
      localObject = getDrawable();
      j.o(localObject, "drawable");
      if (i >= ((Drawable)localObject).getBounds().bottom)
      {
        localObject = this.rect;
        i = getMeasuredWidth();
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        f1 = (i - localDrawable.getBounds().right) / 2.0F;
        i = getMeasuredHeight();
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        f2 = (i - localDrawable.getBounds().bottom) / 2.0F;
        i = getMeasuredWidth();
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        float f3 = (i - localDrawable.getBounds().right) / 2.0F;
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        float f4 = localDrawable.getBounds().right;
        i = getMeasuredHeight();
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        f5 = (i - localDrawable.getBounds().bottom) / 2.0F;
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        ((RectF)localObject).set(f1, f2, f3 + f4, f5 + localDrawable.getBounds().bottom);
        this.eAv.addRoundRect(this.rect, getMeasuredWidth() / 10.0F, getMeasuredHeight() / 10.0F, Path.Direction.CW);
        if (paramCanvas != null)
          paramCanvas.save();
        if (paramCanvas != null)
          paramCanvas.clipPath(this.eAv);
        super.onDraw(paramCanvas);
        if (paramCanvas == null)
          break label631;
        paramCanvas.restore();
        AppMethodBeat.o(63325);
      }
    }
    while (true)
    {
      return;
      i = getMeasuredWidth();
      localObject = getDrawable();
      j.o(localObject, "drawable");
      if (i >= ((Drawable)localObject).getBounds().right)
      {
        localObject = this.rect;
        i = getMeasuredWidth();
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        f2 = (i - localDrawable.getBounds().right) / 2.0F;
        i = getMeasuredWidth();
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        f5 = (i - localDrawable.getBounds().right) / 2.0F;
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        ((RectF)localObject).set(f2, 0.0F, f5 + localDrawable.getBounds().right, getMeasuredHeight());
        break;
      }
      i = getMeasuredHeight();
      localObject = getDrawable();
      j.o(localObject, "drawable");
      if (i >= ((Drawable)localObject).getBounds().bottom)
      {
        localObject = this.rect;
        i = getMeasuredHeight();
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        f1 = (i - localDrawable.getBounds().bottom) / 2.0F;
        f5 = getMeasuredWidth();
        i = getMeasuredHeight();
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        f2 = (i - localDrawable.getBounds().bottom) / 2.0F;
        localDrawable = getDrawable();
        j.o(localDrawable, "drawable");
        ((RectF)localObject).set(0.0F, f1, f5, f2 + localDrawable.getBounds().bottom);
        break;
      }
      this.rect.set(0.0F, 0.0F, getMeasuredWidth(), getMeasuredHeight());
      break;
      label631: AppMethodBeat.o(63325);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.view.RoundEmojiView
 * JD-Core Version:    0.6.2
 */