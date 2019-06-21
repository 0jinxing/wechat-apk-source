package com.tencent.mm.plugin.story.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run", "com/tencent/mm/plugin/story/ui/StoryBrowseUI$onCreate$2$onGalleryExitFromTop$1$1"})
final class StoryBrowseUI$b$a
  implements Runnable
{
  StoryBrowseUI$b$a(StoryBrowseUI.b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(109988);
    new ak().post((Runnable)new StoryBrowseUI.b.a.1(this));
    AppMethodBeat.o(109988);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryBrowseUI.b.a
 * JD-Core Version:    0.6.2
 */