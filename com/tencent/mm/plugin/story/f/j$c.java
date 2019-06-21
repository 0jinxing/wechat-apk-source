package com.tencent.mm.plugin.story.f;

import a.l;
import android.support.v7.h.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/presenter/SelfGalleryPresenter$initLoad$1", "Landroid/support/v7/util/ListUpdateCallback;", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "plugin-story_release"})
public final class j$c
  implements d
{
  public final void G(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109616);
    ab.i(j.access$getTAG$cp(), "onInserted: " + paramInt1 + ' ' + paramInt2);
    this.rZW.rZU.ai(0, paramInt1, paramInt2);
    AppMethodBeat.o(109616);
  }

  public final void H(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109617);
    ab.i(j.access$getTAG$cp(), "onRemoved: " + paramInt1 + ' ' + paramInt2);
    this.rZW.rZU.aj(0, paramInt1, paramInt2);
    AppMethodBeat.o(109617);
  }

  public final void I(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109615);
    ab.i(j.access$getTAG$cp(), "onMoved: " + paramInt1 + ' ' + paramInt2);
    AppMethodBeat.o(109615);
  }

  public final void a(int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(109614);
    ab.i(j.access$getTAG$cp(), "onChanged: " + paramInt1 + ' ' + paramInt2);
    this.rZW.rZU.ak(0, paramInt1, paramInt2);
    AppMethodBeat.o(109614);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.j.c
 * JD-Core Version:    0.6.2
 */