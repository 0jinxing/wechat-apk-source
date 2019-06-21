package com.tencent.mm.plugin.story.ui.sns;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/story/ui/sns/StoryEntranceDialog$galleryScale$1$onGalleryExitFromTop$1$1$1"})
final class b$b$a$1
  implements Runnable
{
  b$b$a$1(b.b.a parama)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(110235);
    if (this.shn.shm.shl.isShowing())
      this.shn.shm.shl.cancel();
    AppMethodBeat.o(110235);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.sns.b.b.a.1
 * JD-Core Version:    0.6.2
 */