package com.tencent.mm.plugin.story.i;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.loader.g.a.c;
import com.tencent.mm.loader.g.a.g;
import com.tencent.mm.loader.g.a.h;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/task/StoryCleanTask;", "", "()V", "CLEAN_LIMIT", "", "TAG", "", "cleanQueue", "Lcom/tencent/mm/loader/loader/LoaderCore;", "Lcom/tencent/mm/plugin/story/task/StoryCleanTask$CleanTask;", "isStop", "", "stopLock", "Ljava/lang/Object;", "checkLoopClean", "", "list", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "Lkotlin/collections/ArrayList;", "startClean", "stopClean", "CleanTask", "plugin-story_release"})
public final class a
{
  private static final Object eTu;
  private static com.tencent.mm.loader.g.d<Object> seq;
  public static final a ser;

  static
  {
    AppMethodBeat.i(109986);
    ser = new a();
    seq = new com.tencent.mm.loader.g.d((com.tencent.mm.loader.g.a.d)new g((c)new com.tencent.mm.loader.g.a.a(5), new h(), "storyCleanQueue"));
    eTu = new Object();
    AppMethodBeat.o(109986);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.i.a
 * JD-Core Version:    0.6.2
 */