package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import android.view.MotionEvent;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/GalleryScrollConsumer;", "", "()V", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "isTouchMoved", "scrollType", "", "getScrollDirection", "onFling", "", "velocityX", "", "velocityY", "onScroll", "scrollX", "scrollY", "consumed", "", "onStopScroll", "plugin-story_release"})
public abstract class e
{
  public boolean a(MotionEvent paramMotionEvent, boolean paramBoolean, int paramInt)
  {
    j.p(paramMotionEvent, "event");
    return false;
  }

  public abstract int cCD();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.e
 * JD-Core Version:    0.6.2
 */