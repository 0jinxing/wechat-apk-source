package com.tencent.mm.plugin.story.ui.view.gallery;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$fadeInMaskView$1", "Landroid/animation/AnimatorListenerAdapter;", "onAnimationStart", "", "p0", "Landroid/animation/Animator;", "plugin-story_release"})
public final class l$e extends AnimatorListenerAdapter
{
  public final void onAnimationStart(Animator paramAnimator)
  {
    AppMethodBeat.i(110789);
    l.f(this.spK).setVisibility(0);
    AppMethodBeat.o(110789);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.l.e
 * JD-Core Version:    0.6.2
 */