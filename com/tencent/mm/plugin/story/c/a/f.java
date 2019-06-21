package com.tencent.mm.plugin.story.c.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.e.v;
import com.tencent.mm.plugin.story.c.a.a;
import com.tencent.mm.plugin.story.c.a.b;
import com.tencent.mm.plugin.story.c.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryProcessElementConfig;", "Lcom/tencent/mm/plugin/story/config/StoryElementConfig;", "Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryProcessElementConfig$StoryProcessType;", "()V", "DEFAULT_VALUE", "TAG", "", "getTAG", "()Ljava/lang/String;", "getElementName", "Lcom/tencent/mm/plugin/story/config/StoryConfigConstant$ElementName;", "initDefaultConfig", "loadConfig", "", "loadDebugConfig", "", "loadServerConfig", "update", "parse", "StoryProcessType", "plugin-story_release"})
public final class f extends b<f.a>
{
  private static final String TAG = "MicroMsg.StoryProcessElementConfig";
  private static final f.a rRB;
  public static final f rRC;

  static
  {
    AppMethodBeat.i(108985);
    rRC = new f();
    TAG = "MicroMsg.StoryProcessElementConfig";
    rRB = f.a.rRE;
    AppMethodBeat.o(108985);
  }

  public final void Uv()
  {
    AppMethodBeat.i(108984);
    ab.i(TAG, "loadDebugConfig false ");
    Object localObject = as.amF(a.b.rQX.name()).getString(a.a.rQS.name(), rRB.name());
    if (localObject == null)
      j.dWJ();
    j.o(localObject, "mmkv.getString(getElemen…me, DEFAULT_VALUE.name)!!");
    aQ(f.a.valueOf((String)localObject));
    int i = L("StoryBackgroundRemux", 0);
    int j;
    if (i != 0)
    {
      if (i == 1)
      {
        localObject = f.a.rRE;
        aQ(localObject);
      }
    }
    else
    {
      j = q.etk.etL;
      if (j != -1)
        if (j != 1)
          break label170;
    }
    label170: for (localObject = f.a.rRE; ; localObject = f.a.rRD)
    {
      aQ(localObject);
      ab.i(TAG, "loadServerConfig : " + (f.a)Ut() + ", serverConfig:" + i + ", deviceConfig:" + j);
      AppMethodBeat.o(108984);
      return;
      localObject = f.a.rRD;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.c.a.f
 * JD-Core Version:    0.6.2
 */