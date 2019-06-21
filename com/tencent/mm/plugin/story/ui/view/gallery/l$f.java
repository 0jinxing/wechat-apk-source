package com.tencent.mm.plugin.story.ui.view.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$fadeOutMaskView$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationEnd", "", "p0", "Landroid/animation/Animator;", "plugin-story_release"})
public final class l$f extends AnimatorListenerAdapter
{
  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(110790);
    l.f(this.spK).setVisibility(8);
    AppMethodBeat.o(110790);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.f
 * JD-Core Version:    0.6.2
 */