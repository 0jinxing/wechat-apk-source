package com.tencent.mm.plugin.emojicapture.ui;

import a.f.a.b;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.n.c;
import com.tencent.mm.plugin.n.i;
import com.tencent.mm.pluginsdk.ui.tools.e.a;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/emojicapture/ui/EmojiVideoPlayTextureView$playerCallback$1", "Lcom/tencent/mm/plugin/mmplayer/IPlayerCallback;", "onCompletion", "", "onError", "what", "", "error", "onPrepared", "onSeekComplete", "onVideoSizeChanged", "width", "height", "degrees", "plugin-emojicapture_release"})
public final class EmojiVideoPlayTextureView$c
  implements c
{
  public final void EA()
  {
    AppMethodBeat.i(2908);
    e.a locala = EmojiVideoPlayTextureView.m(this.llP);
    if (locala != null)
    {
      locala.EA();
      AppMethodBeat.o(2908);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2908);
    }
  }

  public final void S(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(2911);
    ab.i(EmojiVideoPlayTextureView.b(this.llP), "video size changed size[%d, %d] degrees[%d]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    EmojiVideoPlayTextureView.a(this.llP, paramInt1);
    EmojiVideoPlayTextureView.b(this.llP, paramInt2);
    e.a locala = EmojiVideoPlayTextureView.m(this.llP);
    if (locala != null)
    {
      locala.dH(EmojiVideoPlayTextureView.q(this.llP), EmojiVideoPlayTextureView.r(this.llP));
      AppMethodBeat.o(2911);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2911);
    }
  }

  public final void bnT()
  {
    AppMethodBeat.i(2910);
    Object localObject = EmojiVideoPlayTextureView.n(this.llP);
    if (localObject != null)
      ((b)localObject).am(Boolean.valueOf(EmojiVideoPlayTextureView.o(this.llP)));
    if (!EmojiVideoPlayTextureView.o(this.llP))
    {
      ab.d(EmojiVideoPlayTextureView.b(this.llP), "player seek done, but don't play now.");
      EmojiVideoPlayTextureView.p(this.llP);
      AppMethodBeat.o(2910);
    }
    while (true)
    {
      return;
      String str = EmojiVideoPlayTextureView.b(this.llP);
      localObject = EmojiVideoPlayTextureView.f(this.llP);
      if (localObject != null);
      for (localObject = ((i)localObject).aZm(); ; localObject = null)
      {
        ab.d(str, "%s player seek done", new Object[] { localObject });
        localObject = EmojiVideoPlayTextureView.f(this.llP);
        if (localObject == null)
          break label140;
        ((i)localObject).start();
        AppMethodBeat.o(2910);
        break;
      }
      label140: AppMethodBeat.o(2910);
    }
  }

  public final void onError(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(2909);
    e.a locala = EmojiVideoPlayTextureView.m(this.llP);
    if (locala != null)
    {
      locala.onError(paramInt1, paramInt2);
      AppMethodBeat.o(2909);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(2909);
    }
  }

  public final void pL()
  {
    AppMethodBeat.i(2907);
    ab.i(EmojiVideoPlayTextureView.b(this.llP), "onPrepared: ");
    EmojiVideoPlayTextureView.h(this.llP);
    e.a locala = EmojiVideoPlayTextureView.m(this.llP);
    if (locala != null)
      locala.pL();
    this.llP.requestLayout();
    AppMethodBeat.o(2907);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emojicapture.ui.EmojiVideoPlayTextureView.c
 * JD-Core Version:    0.6.2
 */