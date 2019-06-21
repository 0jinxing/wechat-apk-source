package com.tencent.mm.plugin.story.g;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/report/StoryRemuxIDKeyStat;", "", "()V", "ID", "", "TAG", "", "markCreateThumbFailed", "", "markRemuxProcessType", "isForeground", "", "markStoryRemuxHitBitrateExceed", "markStoryRemuxResult", "isLocalCapture", "bitrate", "", "fps", "plugin-story_release"})
public final class g
{
  public static final g sbU;

  static
  {
    AppMethodBeat.i(109823);
    sbU = new g();
    AppMethodBeat.o(109823);
  }

  public static void cAj()
  {
    AppMethodBeat.i(109820);
    ab.i("MicroMsg.StoryRemuxIDKeyStat", "markCreateThumbFailed");
    h.pYm.k(986L, 9L, 1L);
    AppMethodBeat.o(109820);
  }

  public static void cAk()
  {
    AppMethodBeat.i(109822);
    ab.i("MicroMsg.StoryRemuxIDKeyStat", "markStoryRemuxHitBitrateExceed");
    h.pYm.k(986L, 73L, 1L);
    AppMethodBeat.o(109822);
  }

  public static void h(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(109821);
    ab.i("MicroMsg.StoryRemuxIDKeyStat", "markStoryRemuxResult, isLocalCapture:" + paramBoolean + ", bitrate:" + paramInt1 + ", fps:" + paramInt2);
    if (paramBoolean)
    {
      h.pYm.k(986L, 56L, 1L);
      h.pYm.k(986L, 60L, paramInt1);
      h.pYm.k(986L, 63L, paramInt2);
      AppMethodBeat.o(109821);
    }
    while (true)
    {
      return;
      h.pYm.k(986L, 57L, 1L);
      h.pYm.k(986L, 66L, paramInt1);
      h.pYm.k(986L, 69L, paramInt2);
      AppMethodBeat.o(109821);
    }
  }

  public static void lK(boolean paramBoolean)
  {
    AppMethodBeat.i(109819);
    ab.i("MicroMsg.StoryRemuxIDKeyStat", "markRemuxProcessType, isForeground:".concat(String.valueOf(paramBoolean)));
    if (paramBoolean)
    {
      h.pYm.k(986L, 5L, 1L);
      AppMethodBeat.o(109819);
    }
    while (true)
    {
      return;
      h.pYm.k(986L, 6L, 1L);
      AppMethodBeat.o(109819);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.g.g
 * JD-Core Version:    0.6.2
 */