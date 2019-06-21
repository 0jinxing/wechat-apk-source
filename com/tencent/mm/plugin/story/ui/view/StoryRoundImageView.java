package com.tencent.mm.plugin.story.ui.view;

import a.l;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/StoryRoundImageView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "path", "Landroid/graphics/Path;", "rect", "Landroid/graphics/RectF;", "round", "getRound", "()I", "setRound", "(I)V", "onDraw", "", "canvas", "Landroid/graphics/Canvas;", "plugin-story_release"})
public final class StoryRoundImageView extends ImageView
{
  private final Path eAv;
  private final RectF rect;
  private int skm;

  public StoryRoundImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110467);
    AppMethodBeat.o(110467);
  }

  public StoryRoundImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110468);
    this.rect = new RectF();
    this.eAv = new Path();
    AppMethodBeat.o(110468);
  }

  public final int getRound()
  {
    return this.skm;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(110466);
    this.rect.set(0.0F, 0.0F, getMeasuredWidth(), getMeasuredHeight());
    this.eAv.addRoundRect(this.rect, this.skm, this.skm, Path.Direction.CW);
    if (paramCanvas != null)
      paramCanvas.save();
    if (paramCanvas != null)
      paramCanvas.clipPath(this.eAv);
    super.onDraw(paramCanvas);
    if (paramCanvas != null)
    {
      paramCanvas.restore();
      AppMethodBeat.o(110466);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(110466);
    }
  }

  public final void setRound(int paramInt)
  {
    this.skm = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryRoundImageView
 * JD-Core Version:    0.6.2
 */