package com.tencent.mm.plugin.story.g;

import a.l;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/report/StoryReporterUtil$Companion;", "", "()V", "getContactType", "", "userName", "", "getEnterScene", "", "pageType", "plugin-story_release"})
public final class i$a
{
  public static long Fb(int paramInt)
  {
    AppMethodBeat.i(109849);
    long l;
    switch (paramInt)
    {
    case 1:
    case 2:
    case 3:
    default:
      l = 0L;
      AppMethodBeat.o(109849);
    case 0:
    case 4:
    case 6:
    case 5:
    }
    while (true)
    {
      return l;
      l = 7L;
      AppMethodBeat.o(109849);
      continue;
      l = 8L;
      AppMethodBeat.o(109849);
      continue;
      l = 9L;
      AppMethodBeat.o(109849);
      continue;
      h localh = h.scu;
      l = h.cAs().FF();
      AppMethodBeat.o(109849);
    }
  }

  public static int aaR(String paramString)
  {
    AppMethodBeat.i(109848);
    a.f.b.j.p(paramString, "userName");
    int i;
    if (TextUtils.isEmpty((CharSequence)paramString))
    {
      i = 0;
      AppMethodBeat.o(109848);
    }
    while (true)
    {
      return i;
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      if (a.f.b.j.j(j.a.cnk(), paramString))
      {
        i = 1;
        AppMethodBeat.o(109848);
      }
      else
      {
        paramString = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
        a.f.b.j.o(paramString, "ct");
        if (paramString.Oc())
        {
          i = 3;
          AppMethodBeat.o(109848);
        }
        else if (paramString.NX())
        {
          i = 4;
          AppMethodBeat.o(109848);
        }
        else
        {
          i = 5;
          AppMethodBeat.o(109848);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.g.i.a
 * JD-Core Version:    0.6.2
 */