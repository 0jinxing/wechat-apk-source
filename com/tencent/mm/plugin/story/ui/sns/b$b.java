package com.tencent.mm.plugin.story.ui.sns;

import a.l;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.ui.view.gallery.l.b;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/sns/StoryEntranceDialog$galleryScale$1", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryGalleryView$IOnGalleryScale;", "onBgAlpha", "", "alpha", "", "onGalleryExitFromTop", "plugin-story_release"})
public final class b$b
  implements l.b
{
  public final void bc(float paramFloat)
  {
  }

  public final void cCg()
  {
    long l1 = 0L;
    AppMethodBeat.i(110237);
    View localView = b.a(this.shl);
    long l2;
    if (localView != null)
    {
      localView.setEnabled(false);
      l2 = ()((localView.getHeight() - localView.getTranslationY()) / localView.getHeight() * 300.0F);
      if (l2 >= 0L)
        break label100;
    }
    while (true)
    {
      localView.animate().translationY(localView.getHeight()).setDuration(l1).withEndAction((Runnable)new a(this)).start();
      AppMethodBeat.o(110237);
      while (true)
      {
        return;
        AppMethodBeat.o(110237);
      }
      label100: l1 = l2;
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/story/ui/sns/StoryEntranceDialog$galleryScale$1$onGalleryExitFromTop$1$1"})
  static final class a
    implements Runnable
  {
    a(b.b paramb)
    {
    }

    public final void run()
    {
      AppMethodBeat.i(110236);
      new ak().post((Runnable)new b.b.a.1(this));
      AppMethodBeat.o(110236);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.b.b
 * JD-Core Version:    0.6.2
 */