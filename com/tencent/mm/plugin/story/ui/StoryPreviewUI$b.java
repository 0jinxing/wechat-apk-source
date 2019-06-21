package com.tencent.mm.plugin.story.ui;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/StoryPreviewUI$videoCallBack$1", "Lcom/tencent/mm/pluginsdk/ui/tools/IVideoView$IVideoCallback;", "onCompletion", "", "onError", "what", "", "extra", "onGetVideoSize", "width", "height", "onPlayTime", "playTime", "videoTime", "onPrepared", "plugin-story_release"})
public final class StoryPreviewUI$b
  implements e.a
{
  public final void EA()
  {
    AppMethodBeat.i(110035);
    StoryPreviewUI.a(this.seW).d(0.0D, true);
    AppMethodBeat.o(110035);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    return 0;
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
  }

  public final void pL()
  {
    AppMethodBeat.i(110034);
    StoryPreviewUI.a(this.seW).setOneTimeVideoTextureUpdateCallback((e.e)new StoryPreviewUI.b.a(this));
    StoryPreviewUI.a(this.seW).start();
    AppMethodBeat.o(110034);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.StoryPreviewUI.b
 * JD-Core Version:    0.6.2
 */