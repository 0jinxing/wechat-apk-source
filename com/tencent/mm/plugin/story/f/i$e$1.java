package com.tencent.mm.plugin.story.f;

import a.l;
import android.support.v7.h.d;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/plugin/story/presenter/MultiUserGalleryPresenter$notifyUser$3$1", "Landroid/support/v7/util/ListUpdateCallback;", "onChanged", "", "position", "", "count", "payload", "", "onInserted", "onMoved", "fromPosition", "toPosition", "onRemoved", "plugin-story_release"})
public final class i$e$1
  implements d
{
  public final void G(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109598);
    ab.i(i.h(this.rZO.rZK), "onInserted: " + paramInt1 + ' ' + paramInt2);
    i.i(this.rZO.rZK).ai(this.rZO.rZk, paramInt1, paramInt2);
    AppMethodBeat.o(109598);
  }

  public final void H(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109599);
    ab.i(i.h(this.rZO.rZK), "onRemoved: " + paramInt1 + ' ' + paramInt2);
    i.i(this.rZO.rZK).aj(this.rZO.rZk, paramInt1, paramInt2);
    AppMethodBeat.o(109599);
  }

  public final void I(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109597);
    ab.i(i.h(this.rZO.rZK), "onMoved: " + paramInt1 + ' ' + paramInt2);
    AppMethodBeat.o(109597);
  }

  public final void a(int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(109596);
    ab.i(i.h(this.rZO.rZK), "onChanged: " + paramInt1 + ' ' + paramInt2);
    i.i(this.rZO.rZK).ak(this.rZO.rZk, paramInt1, paramInt2);
    AppMethodBeat.o(109596);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.f.i.e.1
 * JD-Core Version:    0.6.2
 */