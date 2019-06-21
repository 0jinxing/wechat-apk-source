package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import a.v;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
final class StoryVideoView$b$a$1
  implements Runnable
{
  StoryVideoView$b$a$1(StoryVideoView.b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110908);
    ab.i(StoryVideoView.a(this.sqL.sqK.sqJ), "onTextureUpdate");
    if (StoryVideoView.f(this.sqL.sqK.sqJ) == null)
      AppMethodBeat.o(110908);
    while (true)
    {
      return;
      StoryVideoView.h(this.sqL.sqK.sqJ);
      Object localObject = StoryVideoView.f(this.sqL.sqK.sqJ);
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type android.view.View");
        AppMethodBeat.o(110908);
        throw ((Throwable)localObject);
      }
      ((View)localObject).setAlpha(1.0F);
      AppMethodBeat.o(110908);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView.b.a.1
 * JD-Core Version:    0.6.2
 */