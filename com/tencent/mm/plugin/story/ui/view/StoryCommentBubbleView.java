package com.tencent.mm.plugin.story.ui.view;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/StoryCommentBubbleView;", "Landroid/widget/ImageView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "bubbleLeft", "getBubbleLeft", "()I", "setBubbleLeft", "(I)V", "bubbleTop", "getBubbleTop", "setBubbleTop", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "plugin-story_release"})
public final class StoryCommentBubbleView extends ImageView
{
  private int siT;
  private int siU;

  public StoryCommentBubbleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    AppMethodBeat.i(110379);
    AppMethodBeat.o(110379);
  }

  public StoryCommentBubbleView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(110378);
    AppMethodBeat.o(110378);
  }

  public final int getBubbleLeft()
  {
    AppMethodBeat.i(138897);
    int[] arrayOfInt = new int[2];
    getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[0];
    AppMethodBeat.o(138897);
    return i;
  }

  public final int getBubbleTop()
  {
    AppMethodBeat.i(138898);
    int[] arrayOfInt = new int[2];
    getLocationOnScreen(arrayOfInt);
    int i = arrayOfInt[1];
    AppMethodBeat.o(138898);
    return i;
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(110377);
    j.p(paramMotionEvent, "event");
    switch (paramMotionEvent.getActionMasked())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(110377);
      return bool;
      animate().scaleX(1.3F).scaleY(1.3F).setDuration(100L).start();
      continue;
      animate().scaleX(1.0F).scaleY(1.0F).setDuration(100L).start();
    }
  }

  public final void setBubbleLeft(int paramInt)
  {
    this.siT = paramInt;
  }

  public final void setBubbleTop(int paramInt)
  {
    this.siU = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.StoryCommentBubbleView
 * JD-Core Version:    0.6.2
 */