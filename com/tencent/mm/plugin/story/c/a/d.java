package com.tencent.mm.plugin.story.c.a;

import a.l;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.story.api.n;
import com.tencent.mm.plugin.story.c.b;
import java.util.HashSet;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryEntranceElementConfig;", "Lcom/tencent/mm/plugin/story/config/StoryElementConfig;", "Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryEntranceElementConfig$ShowEntranceConfig;", "()V", "checkChatterEnableStoryEntrance", "", "userName", "", "getElementName", "Lcom/tencent/mm/plugin/story/config/StoryConfigConstant$ElementName;", "initDefaultConfig", "loadConfig", "", "ShowEntranceConfig", "ShowEntranceType", "plugin-story_release"})
public final class d extends b<a>
{
  public static final d rRo;

  static
  {
    AppMethodBeat.i(108978);
    rRo = new d();
    AppMethodBeat.o(108978);
  }

  public static boolean aac(String paramString)
  {
    AppMethodBeat.i(108975);
    boolean bool;
    if (TextUtils.isEmpty((CharSequence)paramString))
    {
      AppMethodBeat.o(108975);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((!t.mR(paramString)) && (!t.mZ(paramString)) && (!t.mU(paramString)) && (!t.mV(paramString)) && (!t.nc(paramString)) && (!t.nd(paramString)) && (!t.nD(paramString)) && (!t.nI(paramString)) && (!t.no(paramString)) && (!t.mP(paramString)) && (!t.mO(paramString)))
      {
        bool = true;
        AppMethodBeat.o(108975);
      }
      else
      {
        AppMethodBeat.o(108975);
        bool = false;
      }
    }
  }

  public final void Uv()
  {
    AppMethodBeat.i(108977);
    ((a)Ut()).clear();
    if (!n.isShowStoryCheck())
      AppMethodBeat.o(108977);
    while (true)
    {
      return;
      ((a)Ut()).add(d.b.rRq);
      ((a)Ut()).add(d.b.rRr);
      ((a)Ut()).add(d.b.rRs);
      ((a)Ut()).add(d.b.rRt);
      ((a)Ut()).add(d.b.rRu);
      ((a)Ut()).add(d.b.rRw);
      ((a)Ut()).add(d.b.rRv);
      AppMethodBeat.o(108977);
    }
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryEntranceElementConfig$ShowEntranceConfig;", "Ljava/util/HashSet;", "Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryEntranceElementConfig$ShowEntranceType;", "Lkotlin/collections/HashSet;", "()V", "plugin-story_release"})
  public static final class a extends HashSet<d.b>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.c.a.d
 * JD-Core Version:    0.6.2
 */