package com.tencent.mm.plugin.story.model.f;

import a.k.m;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.story.api.k;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/sync/StoryStateFetcherFactory;", "", "()V", "getFetcher", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher;", "talker", "", "plugin-story_release"})
public final class e
{
  public static final e rXx;

  static
  {
    AppMethodBeat.i(109426);
    rXx = new e();
    AppMethodBeat.o(109426);
  }

  public static k aaM(String paramString)
  {
    AppMethodBeat.i(109425);
    CharSequence localCharSequence = (CharSequence)paramString;
    int i;
    if ((localCharSequence == null) || (m.ar(localCharSequence)))
    {
      i = 1;
      if (i == 0)
        break label41;
      paramString = null;
      AppMethodBeat.o(109425);
    }
    while (true)
    {
      return paramString;
      i = 0;
      break;
      label41: if (t.mO(paramString))
      {
        paramString = (k)new d(paramString);
        AppMethodBeat.o(109425);
      }
      else
      {
        paramString = (k)new b(paramString);
        AppMethodBeat.o(109425);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.f.e
 * JD-Core Version:    0.6.2
 */