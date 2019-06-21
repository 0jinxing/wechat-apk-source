package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.pluginsdk.ui.h.b;
import com.tencent.mm.pluginsdk.ui.tools.e;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/gallery/StoryVideoView$playLocalVideo$1", "Lcom/tencent/mm/pluginsdk/ui/tools/IVideoView$IVideoCallback;", "onCompletion", "", "onError", "what", "", "extra", "onGetVideoSize", "width", "height", "onPlayTime", "playTime", "videoTime", "onPrepared", "plugin-story_release"})
public final class StoryVideoView$b
  implements e.a
{
  public final void EA()
  {
    AppMethodBeat.i(110911);
    String str = StoryVideoView.a(this.sqJ);
    StringBuilder localStringBuilder = new StringBuilder("localVideo onCompleted, isFakeVideo:");
    Object localObject = StoryVideoView.c(this.sqJ);
    if (localObject != null)
    {
      localObject = Boolean.valueOf(((i)localObject).cze());
      ab.i(str, localObject + ", fakeStartTime:" + StoryVideoView.d(this.sqJ));
      localObject = StoryVideoView.c(this.sqJ);
      if ((localObject == null) || (((i)localObject).cze() != true) || (StoryVideoView.d(this.sqJ) <= 0L))
        break label166;
      StoryVideoView.f(this.sqJ).d(StoryVideoView.d(this.sqJ), true);
      label123: localObject = StoryVideoView.i(this.sqJ);
      if (localObject == null)
        break label183;
      ((h.b)localObject).cq(this.sqJ.getSessionId(), StoryVideoView.j(this.sqJ));
      AppMethodBeat.o(110911);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label166: StoryVideoView.f(this.sqJ).d(0.0D, true);
      break label123;
      label183: AppMethodBeat.o(110911);
    }
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110912);
    i locali = StoryVideoView.c(this.sqJ);
    if ((locali != null) && (locali.cze() == true) && (StoryVideoView.e(this.sqJ) > 0L) && (paramInt1 >= StoryVideoView.e(this.sqJ)))
    {
      ab.i(StoryVideoView.a(this.sqJ), "fakeVideo exceed endTime, playTime:" + paramInt1 + ", fakeEndTime:" + StoryVideoView.e(this.sqJ) + ", fakeStartTime:" + StoryVideoView.d(this.sqJ));
      if (StoryVideoView.d(this.sqJ) <= 0L)
        break label146;
      StoryVideoView.f(this.sqJ).d(StoryVideoView.d(this.sqJ), true);
    }
    while (true)
    {
      AppMethodBeat.o(110912);
      return 0;
      label146: StoryVideoView.f(this.sqJ).d(0.0D, true);
    }
  }

  public final void dH(int paramInt1, int paramInt2)
  {
  }

  public final void onError(int paramInt1, int paramInt2)
  {
  }

  public final void pL()
  {
    AppMethodBeat.i(110910);
    String str = StoryVideoView.a(this.sqJ);
    StringBuilder localStringBuilder = new StringBuilder("localVideo onPrepared, isLocalVideoPause:").append(StoryVideoView.b(this.sqJ)).append(", isFakeVideo:");
    Object localObject = StoryVideoView.c(this.sqJ);
    if (localObject != null)
    {
      localObject = Boolean.valueOf(((i)localObject).cze());
      ab.i(str, localObject + ", fakeStartTime:" + StoryVideoView.d(this.sqJ) + ", fakeEndTime:" + StoryVideoView.e(this.sqJ));
      if (!StoryVideoView.b(this.sqJ))
      {
        localObject = StoryVideoView.c(this.sqJ);
        if ((localObject == null) || (((i)localObject).cze() != true) || (StoryVideoView.d(this.sqJ) <= 0L))
          break label197;
        StoryVideoView.f(this.sqJ).d(StoryVideoView.d(this.sqJ), true);
      }
    }
    while (true)
    {
      StoryVideoView.f(this.sqJ).setOneTimeVideoTextureUpdateCallback((e.e)new a(this));
      AppMethodBeat.o(110910);
      return;
      localObject = null;
      break;
      label197: StoryVideoView.f(this.sqJ).start();
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onTextureUpdate"})
  static final class a
    implements e.e
  {
    a(StoryVideoView.b paramb)
    {
    }

    public final void bQL()
    {
      AppMethodBeat.i(110909);
      this.sqK.sqJ.setFirstPlayWaitTime(bo.az(StoryVideoView.g(this.sqK.sqJ)));
      al.n((Runnable)new StoryVideoView.b.a.1(this), 50L);
      AppMethodBeat.o(110909);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoView.b
 * JD-Core Version:    0.6.2
 */