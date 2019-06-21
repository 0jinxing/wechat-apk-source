package com.tencent.mm.plugin.story.model;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.api.c;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/FavourUserChecker;", "Lcom/tencent/mm/plugin/story/api/IFavourUserChecker;", "()V", "TAG", "", "mFavourUserList", "", "kotlin.jvm.PlatformType", "", "mIsChecking", "", "mListeners", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/story/api/IFavourUserNotifyListener;", "mStoryStatus", "", "mValidUserList", "addNotifyListener", "", "listener", "checkFavourUserStory", "getStoryStatus", "getValidUserList", "isStoryExist", "username", "setFavourStoryRead", "updateFavourUserList", "userList", "plugin-story_release"})
public final class b
  implements com.tencent.mm.plugin.story.api.b
{
  private static final String TAG = "MicroMsg.FavourUserChecker";
  private static final List<WeakReference<c>> mq;
  private static final List<String> rRW;
  private static final List<String> rRX;
  private static int rRY;
  private static boolean rRZ;
  public static final b rSa;

  static
  {
    AppMethodBeat.i(109008);
    rSa = new b();
    TAG = "MicroMsg.FavourUserChecker";
    mq = Collections.synchronizedList((List)new ArrayList());
    rRW = Collections.synchronizedList((List)new ArrayList());
    rRX = Collections.synchronizedList((List)new ArrayList());
    AppMethodBeat.o(109008);
  }

  public static void cxt()
  {
    AppMethodBeat.i(109003);
    d.post((Runnable)b.a.rSb, "FavourUserChecker_StoryStateChecker");
    AppMethodBeat.o(109003);
  }

  public final void b(WeakReference<c> paramWeakReference)
  {
    AppMethodBeat.i(109007);
    if (!mq.contains(paramWeakReference))
      mq.add(paramWeakReference);
    AppMethodBeat.o(109007);
  }

  public final int cwR()
  {
    return rRY;
  }

  public final void cwS()
  {
    AppMethodBeat.i(109005);
    ab.i(TAG, "setFavourStoryRead:%s", new Object[] { Integer.valueOf(rRY) });
    if (rRY != 0)
      rRY = 2;
    AppMethodBeat.o(109005);
  }

  public final List<String> cwT()
  {
    AppMethodBeat.i(109006);
    Object localObject = new ArrayList();
    ((ArrayList)localObject).addAll((Collection)rRX);
    localObject = (List)localObject;
    AppMethodBeat.o(109006);
    return localObject;
  }

  public final void dE(List<String> paramList)
  {
    AppMethodBeat.i(109004);
    rRW.clear();
    rRW.addAll((Collection)paramList);
    cxt();
    AppMethodBeat.o(109004);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.b
 * JD-Core Version:    0.6.2
 */