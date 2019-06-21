package com.tencent.mm.plugin.story.model;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.vfs.b;
import java.util.Comparator;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/StoryConstants$Companion;", "", "()V", "STORY_DEPRECATED_TIME_SECOND", "", "StoryAudioPath", "", "getStoryAudioPath", "()Ljava/lang/String;", "StoryMixPath", "getStoryMixPath", "StoryRootPath", "getStoryRootPath", "setStoryRootPath", "(Ljava/lang/String;)V", "StoryTempPath", "getStoryTempPath", "StoryTypeImage", "StoryTypeNone", "StoryTypeVideo", "videoRequestMaxThreadCount", "cleanAudioFile", "", "cleanMixFile", "cleanTempData", "getRecordTempPath", "timeStamp", "", "getRecordThumbTempPath", "setup", "accPath", "plugin-story_release"})
public final class i$a
{
  public static String kY(long paramLong)
  {
    AppMethodBeat.i(109040);
    com.tencent.mm.vfs.e.tf(i.cxK());
    String str = i.cxK() + "thumb" + paramLong + ".jpg";
    AppMethodBeat.o(109040);
    return str;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "run"})
  public static final class b
    implements Runnable
  {
    public static final b rSx;

    static
    {
      AppMethodBeat.i(109039);
      rSx = new b();
      AppMethodBeat.o(109039);
    }

    public final void run()
    {
      AppMethodBeat.i(109038);
      i.a locala = i.rSv;
      b[] arrayOfb = new b(i.cxL()).dMF();
      if (arrayOfb != null)
      {
        if (arrayOfb.length > 1)
          a.a.e.a(arrayOfb, (Comparator)new i.a.b.a());
        int i = arrayOfb.length;
        int j = 0;
        for (int k = 0; j < i; k++)
        {
          locala = arrayOfb[j];
          if (k >= 4)
            locala.delete();
          j++;
        }
      }
      AppMethodBeat.o(109038);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.i.a
 * JD-Core Version:    0.6.2
 */