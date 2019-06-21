package com.tencent.mm.plugin.story.c.a;

import a.a.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.api.f.a;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.plugin.story.c.b;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashSet;
import java.util.regex.Pattern;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryBasicElementConfig;", "Lcom/tencent/mm/plugin/story/config/StoryElementConfig;", "Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryBasicElementConfig$StoryBasicConfig;", "Lcom/tencent/mm/plugin/story/api/IStoryBasicConfig;", "()V", "canShowConfig", "", "type", "Lcom/tencent/mm/plugin/story/api/IStoryBasicConfig$SnsPositionType;", "enableFavorite", "enableReply", "enableSnsNotify", "getEasterEggRegex", "", "getElementName", "Lcom/tencent/mm/plugin/story/config/StoryConfigConstant$ElementName;", "getFavExpiredTime", "", "initDefaultConfig", "loadConfig", "", "StoryBasicConfig", "plugin-story_release"})
public final class a extends b<a.a>
  implements com.tencent.mm.plugin.story.api.f
{
  public static final a rQZ;

  static
  {
    AppMethodBeat.i(108952);
    rQZ = new a();
    AppMethodBeat.o(108952);
  }

  public final void Uv()
  {
    boolean bool1 = true;
    AppMethodBeat.i(108949);
    if (!n.isShowStoryCheck())
    {
      AppMethodBeat.o(108949);
      return;
    }
    ((a.a)Ut()).rRa.clear();
    int i;
    if (L("SnsTimelineLikeCommentStoryBubbleSwitch", 1) == 1)
    {
      i = 1;
      label45: if (i != 0)
        ((a.a)Ut()).rRa.add(f.a.rQB);
      L("SnsTimelineJumpStorySwitch", 0);
      com.tencent.mm.pluginsdk.ui.e.i.a.vrR = Pattern.compile(((a.a)Ut()).regex);
      localObject = (a.a)Ut();
      if (L("StoryEditVideoBgmSwitch", 1) != 1)
        break label242;
    }
    label242: for (boolean bool2 = true; ; bool2 = false)
    {
      ((a.a)localObject).rRg = bool2;
      i = com.tencent.mm.bz.a.fromDPToPix(ah.getContext(), 1);
      ((a.a)Ut()).rRh = (i * 100);
      ((a.a)Ut()).rRi = (i * 100);
      if ((!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) && (!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_PURPLE) && (!com.tencent.mm.sdk.platformtools.f.DEBUG))
        break label248;
      ((a.a)Ut()).rRb = true;
      ((a.a)Ut()).rRc = true;
      localObject = (a.a)Ut();
      bool2 = bool1;
      ((a.a)localObject).rRd = bool2;
      ((a.a)Ut()).rRe = L("StoryFeaturedExpiredTime", 15552000);
      AppMethodBeat.o(108949);
      break;
      i = 0;
      break label45;
    }
    label248: Object localObject = (a.a)Ut();
    if (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lGj, 0) == 1)
    {
      bool2 = true;
      label280: ((a.a)localObject).rRb = bool2;
      localObject = (a.a)Ut();
      if (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lGk, 0) != 1)
        break label375;
    }
    label375: for (bool2 = true; ; bool2 = false)
    {
      ((a.a)localObject).rRc = bool2;
      a.a locala = (a.a)Ut();
      localObject = locala;
      bool2 = bool1;
      if (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(com.tencent.mm.plugin.expt.a.a.a.lGl, 0) == 1)
        break;
      bool2 = false;
      localObject = locala;
      break;
      bool2 = false;
      break label280;
    }
  }

  public final boolean a(f.a parama)
  {
    try
    {
      AppMethodBeat.i(108950);
      boolean bool = j.a((Iterable)((a.a)Uw()).rRa, parama);
      AppMethodBeat.o(108950);
      return bool;
    }
    finally
    {
      parama = finally;
    }
    throw parama;
  }

  public final boolean cwU()
  {
    AppMethodBeat.i(108951);
    boolean bool = ((a.a)Uw()).rRb;
    AppMethodBeat.o(108951);
    return bool;
  }

  public final boolean cxh()
  {
    AppMethodBeat.i(138744);
    boolean bool = ((a.a)Uw()).rRc;
    AppMethodBeat.o(138744);
    return bool;
  }

  public final boolean cxi()
  {
    AppMethodBeat.i(138745);
    boolean bool = ((a.a)Uw()).rRd;
    AppMethodBeat.o(138745);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.c.a.a
 * JD-Core Version:    0.6.2
 */