package com.tencent.mm.plugin.story.ui.view.editor.item;

import a.f.b.j;
import a.l;
import com.google.android.exoplayer2.e;
import com.google.android.exoplayer2.p;
import com.google.android.exoplayer2.q.a;
import com.google.android.exoplayer2.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/ui/view/editor/item/MusicLrcView$player$1", "Lcom/google/android/exoplayer2/Player$EventListener;", "onLoadingChanged", "", "p0", "", "onPlaybackParametersChanged", "Lcom/google/android/exoplayer2/PlaybackParameters;", "onPlayerError", "Lcom/google/android/exoplayer2/ExoPlaybackException;", "onPlayerStateChanged", "p1", "", "onPositionDiscontinuity", "onRepeatModeChanged", "onTimelineChanged", "Lcom/google/android/exoplayer2/Timeline;", "", "onTracksChanged", "Lcom/google/android/exoplayer2/source/TrackGroupArray;", "Lcom/google/android/exoplayer2/trackselection/TrackSelectionArray;", "plugin-story_release"})
public final class MusicLrcView$a
  implements q.a
{
  public final void a(e parame)
  {
  }

  public final void a(p paramp)
  {
  }

  public final void aH(boolean paramBoolean)
  {
  }

  public final void c(boolean paramBoolean, int paramInt)
  {
    Object localObject1 = null;
    AppMethodBeat.i(110677);
    if (paramInt == 3)
    {
      localObject2 = this.snh;
      if (((MusicLrcView)localObject2).shY)
      {
        ((MusicLrcView)localObject2).sne = ((MusicLrcView)localObject2).getWidth();
        ((MusicLrcView)localObject2).snf = true;
        ((MusicLrcView)localObject2).cCC();
      }
      localObject2 = this.snh.getPlayer();
      if (localObject2 == null)
        break label154;
    }
    label154: for (Object localObject2 = Long.valueOf(((v)localObject2).getDuration()); ; localObject2 = null)
    {
      if (localObject2 == null)
        j.dWJ();
      if (((Long)localObject2).longValue() < this.snh.getRndDuration())
      {
        MusicLrcView localMusicLrcView = this.snh;
        v localv = this.snh.getPlayer();
        localObject2 = localObject1;
        if (localv != null)
          localObject2 = Long.valueOf(localv.getDuration());
        if (localObject2 == null)
          j.dWJ();
        localMusicLrcView.setRndDuration((int)((Long)localObject2).longValue());
      }
      AppMethodBeat.o(110677);
      return;
    }
  }

  public final void qe()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.editor.item.MusicLrcView.a
 * JD-Core Version:    0.6.2
 */