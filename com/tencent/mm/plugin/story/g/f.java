package com.tencent.mm.plugin.story.g;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/report/StoryRemuxDetailIDKeyStat;", "", "()V", "ID", "", "TAG", "", "markFail", "", "isCaptureVideo", "", "markMixErrorData", "markMixVideoNotExist", "markRemuxStart", "markRemuxStartUniq", "markSuccess", "markSuccessCost", "time", "markSuccessRetryTimes", "times", "", "postDone", "plugin-story_release"})
public final class f
{
  public static final f sbT;

  static
  {
    AppMethodBeat.i(109818);
    sbT = new f();
    AppMethodBeat.o(109818);
  }

  public static void ai(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(109814);
    ab.i("MicroMsg.StoryRemuxDetailIDKeyStat", "markSuccessRetryTimes, times:" + paramInt + ", isCaptureVideo:" + paramBoolean);
    h.pYm.k(1005L, 41L, 1L);
    if (paramInt <= 1)
      if (paramBoolean)
      {
        h.pYm.k(1005L, 42L, 1L);
        AppMethodBeat.o(109814);
      }
    while (true)
    {
      return;
      h.pYm.k(1005L, 43L, 1L);
      AppMethodBeat.o(109814);
      continue;
      if (paramInt == 2)
      {
        if (paramBoolean)
        {
          h.pYm.k(1005L, 45L, 1L);
          AppMethodBeat.o(109814);
        }
        else
        {
          h.pYm.k(1005L, 46L, 1L);
          AppMethodBeat.o(109814);
        }
      }
      else if (paramInt == 3)
      {
        if (paramBoolean)
        {
          h.pYm.k(1005L, 48L, 1L);
          AppMethodBeat.o(109814);
        }
        else
        {
          h.pYm.k(1005L, 49L, 1L);
        }
      }
      else
        AppMethodBeat.o(109814);
    }
  }

  public static void cAh()
  {
    AppMethodBeat.i(109816);
    ab.i("MicroMsg.StoryRemuxDetailIDKeyStat", "markMixErrorData");
    h.pYm.k(1005L, 8L, 1L);
    AppMethodBeat.o(109816);
  }

  public static void cAi()
  {
    AppMethodBeat.i(109817);
    ab.i("MicroMsg.StoryRemuxDetailIDKeyStat", "post done");
    h.pYm.k(1005L, 107L, 1L);
    AppMethodBeat.o(109817);
  }

  public static void f(boolean paramBoolean, long paramLong)
  {
    AppMethodBeat.i(109813);
    ab.i("MicroMsg.StoryRemuxDetailIDKeyStat", "markSuccessCost, isCaptureVideo:" + paramBoolean + ", time:" + paramLong);
    h.pYm.k(1005L, 31L, paramLong);
    if (paramBoolean)
    {
      h.pYm.k(1005L, 32L, paramLong);
      AppMethodBeat.o(109813);
    }
    while (true)
    {
      return;
      h.pYm.k(1005L, 33L, paramLong);
      AppMethodBeat.o(109813);
    }
  }

  public static void lF(boolean paramBoolean)
  {
    AppMethodBeat.i(109809);
    ab.i("MicroMsg.StoryRemuxDetailIDKeyStat", "markRemuxStart, isCaptureVideo:".concat(String.valueOf(paramBoolean)));
    h.pYm.k(1005L, 101L, 1L);
    if (paramBoolean)
    {
      h.pYm.k(1005L, 102L, 1L);
      AppMethodBeat.o(109809);
    }
    while (true)
    {
      return;
      h.pYm.k(1005L, 103L, 1L);
      AppMethodBeat.o(109809);
    }
  }

  public static void lG(boolean paramBoolean)
  {
    AppMethodBeat.i(109810);
    ab.i("MicroMsg.StoryRemuxDetailIDKeyStat", "markRemuxStart, isCaptureVideo:".concat(String.valueOf(paramBoolean)));
    h.pYm.k(1005L, 1L, 1L);
    if (paramBoolean)
    {
      h.pYm.k(1005L, 2L, 1L);
      AppMethodBeat.o(109810);
    }
    while (true)
    {
      return;
      h.pYm.k(1005L, 3L, 1L);
      AppMethodBeat.o(109810);
    }
  }

  public static void lH(boolean paramBoolean)
  {
    AppMethodBeat.i(109811);
    ab.i("MicroMsg.StoryRemuxDetailIDKeyStat", "markSucess");
    h.pYm.k(1005L, 11L, 1L);
    if (paramBoolean)
    {
      h.pYm.k(1005L, 12L, 1L);
      AppMethodBeat.o(109811);
    }
    while (true)
    {
      return;
      h.pYm.k(1005L, 13L, 1L);
      AppMethodBeat.o(109811);
    }
  }

  public static void lI(boolean paramBoolean)
  {
    AppMethodBeat.i(109812);
    ab.i("MicroMsg.StoryRemuxDetailIDKeyStat", "markFail");
    h.pYm.k(1005L, 21L, 1L);
    if (paramBoolean)
    {
      h.pYm.k(1005L, 22L, 1L);
      AppMethodBeat.o(109812);
    }
    while (true)
    {
      return;
      h.pYm.k(1005L, 23L, 1L);
      AppMethodBeat.o(109812);
    }
  }

  public static void lJ(boolean paramBoolean)
  {
    AppMethodBeat.i(109815);
    ab.i("MicroMsg.StoryRemuxDetailIDKeyStat", "markMixVideoNotExist");
    if (paramBoolean)
    {
      h.pYm.k(1005L, 5L, 1L);
      AppMethodBeat.o(109815);
    }
    while (true)
    {
      return;
      h.pYm.k(1005L, 6L, 1L);
      AppMethodBeat.o(109815);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.g.f
 * JD-Core Version:    0.6.2
 */