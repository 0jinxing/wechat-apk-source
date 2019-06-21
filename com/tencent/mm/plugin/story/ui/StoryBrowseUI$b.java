package com.tencent.mm.plugin.story.ui;

import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.view.gallery.l.b;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StoryBrowseUI$onCreate$2", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$IOnGalleryScale;", "onBgAlpha", "", "alpha", "", "onGalleryExitFromTop", "plugin-story_release"})
public final class StoryBrowseUI$b
  implements l.b
{
  public final void bc(float paramFloat)
  {
    AppMethodBeat.i(109989);
    ImageView localImageView = StoryBrowseUI.a(this.sew);
    if (localImageView != null)
    {
      localImageView.setAlpha(paramFloat);
      AppMethodBeat.o(109989);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109989);
    }
  }

  public final void cCg()
  {
    long l1 = 0L;
    AppMethodBeat.i(109990);
    com.tencent.mm.plugin.story.ui.view.gallery.l locall = StoryBrowseUI.b(this.sew);
    long l2;
    if (locall != null)
    {
      locall.setEnabled(false);
      l2 = ()((locall.getHeight() - locall.getTranslationY()) / locall.getHeight() * 300.0F);
      if (l2 >= 0L)
        break label157;
    }
    while (true)
    {
      Object localObject = StoryBrowseUI.a(this.sew);
      if (localObject != null)
      {
        localObject = ((ImageView)localObject).animate();
        if (localObject != null)
        {
          localObject = ((ViewPropertyAnimator)localObject).alpha(0.0F);
          if (localObject != null)
          {
            localObject = ((ViewPropertyAnimator)localObject).setDuration(l1);
            if (localObject != null)
              ((ViewPropertyAnimator)localObject).start();
          }
        }
      }
      locall.animate().translationY(locall.getHeight()).setDuration(l1).withEndAction((Runnable)new StoryBrowseUI.b.a(this)).start();
      AppMethodBeat.o(109990);
      while (true)
      {
        return;
        AppMethodBeat.o(109990);
      }
      label157: l1 = l2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryBrowseUI.b
 * JD-Core Version:    0.6.2
 */