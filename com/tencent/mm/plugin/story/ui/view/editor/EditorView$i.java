package com.tencent.mm.plugin.story.ui.view.editor;

import a.f.a.a;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.pluginsdk.ui.tools.e.e;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/EditorView$videoCallBack$1", "Lcom/tencent/mm/pluginsdk/ui/tools/IVideoView$IVideoCallback;", "onCompletion", "", "onError", "what", "", "extra", "onGetVideoSize", "width", "height", "onPlayTime", "playTime", "videoTime", "onPrepared", "plugin-story_release"})
public final class EditorView$i
  implements e.a
{
  public final void EA()
  {
    double d = 0.0D;
    AppMethodBeat.i(110593);
    if (EditorView.p(this.smw) >= 0.0D)
      d = EditorView.p(this.smw);
    ab.i(EditorView.b(this.smw), "onCompletion, seekTo startTime: " + EditorView.p(this.smw));
    EditorView.n(this.smw).d(d * 1000.0D, true);
    this.smw.getPresenter();
    AppMethodBeat.o(110593);
  }

  public final int dG(int paramInt1, int paramInt2)
  {
    double d = 0.0D;
    AppMethodBeat.i(110594);
    if ((EditorView.q(this.smw) > 0.0D) && (paramInt1 >= EditorView.q(this.smw) * 1000.0D))
    {
      if (EditorView.p(this.smw) >= 0.0D)
        d = EditorView.p(this.smw);
      ab.i(EditorView.b(this.smw), "onPlayTime, reach loop endtime:" + EditorView.q(this.smw) + ", startTime:" + d);
      EditorView.n(this.smw).d(d * 1000.0D, true);
    }
    AppMethodBeat.o(110594);
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
    AppMethodBeat.i(110592);
    EditorView.n(this.smw).setOneTimeVideoTextureUpdateCallback((e.e)new a(this));
    double d;
    if (EditorView.p(this.smw) >= 0.0D)
    {
      d = EditorView.p(this.smw);
      ab.i(EditorView.b(this.smw), "onPrepared, startTime:".concat(String.valueOf(d)));
      if (d <= 0.0D)
        break label98;
      EditorView.n(this.smw).d(d * 1000.0D, true);
      AppMethodBeat.o(110592);
    }
    while (true)
    {
      return;
      d = 0.0D;
      break;
      label98: EditorView.n(this.smw).start();
      AppMethodBeat.o(110592);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "onTextureUpdate"})
  static final class a
    implements e.e
  {
    a(EditorView.i parami)
    {
    }

    public final void bQL()
    {
      AppMethodBeat.i(110591);
      EditorView.n(this.smA.smw).setVisibility(0);
      a locala = EditorView.o(this.smA.smw);
      if (locala != null)
        locala.invoke();
      EditorView.n(this.smA.smw).setAlpha(1.0F);
      AppMethodBeat.o(110591);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.EditorView.i
 * JD-Core Version:    0.6.2
 */