package com.tencent.mm.plugin.story;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.mars.comm.NetStatusUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.sn;
import com.tencent.mm.g.a.so;
import com.tencent.mm.g.b.a.ap;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.story.api.k.c;
import com.tencent.mm.plugin.story.f.h.a;
import com.tencent.mm.plugin.story.model.d;
import com.tencent.mm.plugin.story.model.f.a;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.n.a;
import com.tencent.mm.plugin.story.model.r;
import com.tencent.mm.protocal.protobuf.cfc;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/PluginStory;", "Lcom/tencent/mm/kernel/plugin/Plugin;", "Lcom/tencent/mm/plugin/story/api/IPluginStory;", "()V", "STORAGE_STORY", "", "STORAGE_STORY_TEMP", "addStoryPostListener", "", "listener", "Lcom/tencent/mm/plugin/story/api/IStoryPostListener;", "addStoryStatusNotifyListener", "Lcom/tencent/mm/plugin/story/api/IStoryStatusNotifyListener;", "canPostStory", "", "checkPost", "checkReportFromChatting", "clickScene", "", "user", "configure", "profile", "Lcom/tencent/mm/kernel/plugin/ProcessProfile;", "enterGallery", "unreadList", "", "execute", "getAccStoryCachePath", "getAccStoryPath", "getAccStoryTmpPath", "getContactFetcher", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher$IContactSyncFetcher;", "getFavourUserChecker", "Lcom/tencent/mm/plugin/story/api/IFavourUserChecker;", "getStoryBasicConfig", "Lcom/tencent/mm/plugin/story/api/IStoryBasicConfig;", "getStoryStateFetcher", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher;", "talker", "getStoryUIFactory", "Lcom/tencent/mm/plugin/story/api/IStoryUIFactory;", "getStoryUserInfo", "Lcom/tencent/mm/protocal/protobuf/StoryUserInfo;", "hasNewStory", "username", "isShowStoryCheck", "isStoryExist", "userName", "isStoryUnread", "loadStory", "roomId", "name", "preLoadVideoViewMgr", "preloadForSnsUser", "isEnter", "removeStoryPostListener", "removeStoryStatusNotifyListener", "reportWaitPlayList", "userList", "scene", "", "setPreviewEnterScene", "showStoryEntranceDialog", "context", "Landroid/content/Context;", "sessionId", "exposeOrder", "storyComment", "Lcom/tencent/mm/plugin/story/api/IStoryComment;", "updateStoryUserInfo", "userInfo", "Companion", "StoryCleanListener", "StorySynclistener", "plugin-story_release"})
public final class PluginStory extends com.tencent.mm.kernel.b.f
  implements com.tencent.mm.plugin.story.api.e
{
  private static final String TAG = "MicroMsg.PluginStory";
  public static final PluginStory.a rQs;
  private final String rQq = "oneday/";
  private final String rQr = "oneday/temp/";

  static
  {
    AppMethodBeat.i(108938);
    rQs = new PluginStory.a((byte)0);
    TAG = "MicroMsg.PluginStory";
    AppMethodBeat.o(108938);
  }

  public final void addStoryPostListener(com.tencent.mm.plugin.story.api.j paramj)
  {
    AppMethodBeat.i(108921);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cya().a(paramj);
    AppMethodBeat.o(108921);
  }

  public final void addStoryStatusNotifyListener(com.tencent.mm.plugin.story.api.l paraml)
  {
    AppMethodBeat.i(108923);
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    localObject = j.a.cxU();
    if ((paraml != null) && (!((com.tencent.mm.plugin.story.h.g)localObject).sdL.contains(paraml)))
      ((com.tencent.mm.plugin.story.h.g)localObject).sdL.add(paraml);
    AppMethodBeat.o(108923);
  }

  public final boolean canPostStory()
  {
    AppMethodBeat.i(108928);
    d locald = d.rSg;
    boolean bool = d.canPostStory();
    AppMethodBeat.o(108928);
    return bool;
  }

  public final void checkPost()
  {
    AppMethodBeat.i(108926);
    if (!isShowStoryCheck())
      AppMethodBeat.o(108926);
    while (true)
    {
      return;
      j.a locala = com.tencent.mm.plugin.story.model.j.rST;
      j.a.cya().checkPost();
      AppMethodBeat.o(108926);
    }
  }

  public final boolean checkReportFromChatting(int paramInt, String paramString)
  {
    AppMethodBeat.i(108929);
    boolean bool1;
    if (bo.isNullOrNil(paramString))
    {
      bool1 = false;
      AppMethodBeat.o(108929);
      return bool1;
    }
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    com.tencent.mm.plugin.story.h.g localg = j.a.cxU();
    if (paramString == null);
    label137: label300: label449: for (localObject = ""; ; localObject = paramString)
    {
      localObject = localg.aap((String)localObject);
      boolean bool2 = ((com.tencent.mm.plugin.story.h.f)localObject).cBN();
      int i;
      if (((com.tencent.mm.plugin.story.h.f)localObject).cBL() > 0L)
      {
        i = 1;
        label68: localObject = com.tencent.mm.plugin.story.g.c.sbQ;
        com.tencent.mm.plugin.story.g.c.clean();
        localObject = com.tencent.mm.plugin.story.g.b.sbw;
        com.tencent.mm.plugin.story.g.b.clean();
        localObject = com.tencent.mm.plugin.story.g.b.sbw;
        if (paramString != null)
          break label455;
      }
      label324: label455: for (localObject = ""; ; localObject = paramString)
      {
        a.f.b.j.p(localObject, "user");
        com.tencent.mm.plugin.story.g.b.EV(paramInt);
        com.tencent.mm.plugin.story.g.b.clean();
        com.tencent.mm.plugin.story.g.b.sbp = bo.anU();
        if ((NetStatusUtil.isWifi(ah.getContext())) || (NetStatusUtil.is4G(ah.getContext())))
        {
          bool1 = true;
          com.tencent.mm.plugin.story.g.b.mgU = bool1;
          if (bool1)
          {
            ab.i("MicroMsg.StoryBrowseDetailIDKeyStat", "chattingRight " + (String)localObject + " isWifi:" + com.tencent.mm.plugin.story.g.b.mgU);
            com.tencent.mm.plugin.story.g.b.l(com.tencent.mm.plugin.story.g.b.lhy, 1L, 1L);
          }
          if (paramInt != 1)
            break label324;
          localObject = com.tencent.mm.plugin.story.g.c.sbQ;
          if (paramString != null)
            break label449;
        }
        for (localObject = ""; ; localObject = paramString)
        {
          a.f.b.j.p(localObject, "user");
          com.tencent.mm.plugin.story.g.c.clean();
          com.tencent.mm.plugin.story.g.c.sbM = false;
          com.tencent.mm.plugin.story.g.c.sbH = new com.tencent.mm.plugin.story.g.c.a((String)localObject, 1);
          ab.i("MicroMsg.StoryBrowseIDKeyStat", "chattingRight ".concat(String.valueOf(localObject)));
          com.tencent.mm.plugin.report.service.h.pYm.k(988L, 1L, 1L);
          if (bool2)
          {
            if (i == 0)
              break label300;
            paramString = com.tencent.mm.plugin.story.g.c.sbQ;
            com.tencent.mm.plugin.story.g.c.czT();
          }
          do
            while (true)
            {
              bool1 = true;
              AppMethodBeat.o(108929);
              break;
              i = 0;
              break label68;
              bool1 = false;
              break label137;
              localObject = com.tencent.mm.plugin.story.g.c.sbQ;
              localObject = paramString;
              if (paramString == null)
                localObject = "";
              com.tencent.mm.plugin.story.g.c.aaN((String)localObject);
            }
          while (paramInt != 2);
          localObject = com.tencent.mm.plugin.story.g.c.sbQ;
          if (paramString == null);
          for (localObject = ""; ; localObject = paramString)
          {
            a.f.b.j.p(localObject, "user");
            com.tencent.mm.plugin.story.g.c.clean();
            com.tencent.mm.plugin.story.g.c.sbM = true;
            com.tencent.mm.plugin.story.g.c.sbH = new com.tencent.mm.plugin.story.g.c.a((String)localObject, 2);
            ab.i("MicroMsg.StoryBrowseIDKeyStat", "chattingDoubleCheck ".concat(String.valueOf(localObject)));
            com.tencent.mm.plugin.report.service.h.pYm.k(988L, 2L, 1L);
            if (!bool2)
              break;
            if (i != 0)
            {
              paramString = com.tencent.mm.plugin.story.g.c.sbQ;
              com.tencent.mm.plugin.story.g.c.czU();
              break;
            }
            localObject = com.tencent.mm.plugin.story.g.c.sbQ;
            localObject = paramString;
            if (paramString == null)
              localObject = "";
            com.tencent.mm.plugin.story.g.c.aaO((String)localObject);
            break;
          }
        }
      }
    }
  }

  public final void configure(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(108916);
    if ((paramg != null) && (paramg.SG()))
    {
      ab.i(TAG, "PluginStory configure");
      pin((com.tencent.mm.kernel.b.c)new com.tencent.mm.model.q(com.tencent.mm.plugin.story.model.j.class));
    }
    AppMethodBeat.o(108916);
  }

  public final void enterGallery(List<String> paramList)
  {
    AppMethodBeat.i(108930);
    a.f.b.j.p(paramList, "unreadList");
    Object localObject = com.tencent.mm.plugin.story.g.c.sbQ;
    com.tencent.mm.plugin.story.g.c.dF(paramList);
    localObject = com.tencent.mm.plugin.story.g.b.sbw;
    com.tencent.mm.plugin.story.g.b.dF(paramList);
    AppMethodBeat.o(108930);
  }

  public final void execute(com.tencent.mm.kernel.b.g paramg)
  {
    AppMethodBeat.i(108915);
    com.tencent.mm.media.g.c.eXz = (com.tencent.mm.media.g.c.a)new com.tencent.mm.media.g.g();
    AppMethodBeat.o(108915);
  }

  public final String getAccStoryCachePath()
  {
    AppMethodBeat.i(108914);
    String str = ah.getContext().getCacheDir().getAbsolutePath() + "/" + this.rQq;
    AppMethodBeat.o(108914);
    return str;
  }

  public final String getAccStoryPath()
  {
    AppMethodBeat.i(108912);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.e locale = com.tencent.mm.kernel.g.RP();
    a.f.b.j.o(locale, "storage()");
    localObject = locale.getAccPath() + this.rQq;
    AppMethodBeat.o(108912);
    return localObject;
  }

  public final String getAccStoryTmpPath()
  {
    AppMethodBeat.i(108913);
    StringBuilder localStringBuilder = new StringBuilder();
    Object localObject = com.tencent.mm.kernel.g.RP();
    a.f.b.j.o(localObject, "storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).getAccPath() + this.rQr;
    AppMethodBeat.o(108913);
    return localObject;
  }

  public final k.c getContactFetcher()
  {
    return (k.c)com.tencent.mm.plugin.story.model.f.a.rWL;
  }

  public final com.tencent.mm.plugin.story.api.b getFavourUserChecker()
  {
    return (com.tencent.mm.plugin.story.api.b)com.tencent.mm.plugin.story.model.b.rSa;
  }

  public final com.tencent.mm.plugin.story.api.f getStoryBasicConfig()
  {
    return (com.tencent.mm.plugin.story.api.f)com.tencent.mm.plugin.story.c.a.a.rQZ;
  }

  public final com.tencent.mm.plugin.story.api.k getStoryStateFetcher(String paramString)
  {
    AppMethodBeat.i(108920);
    com.tencent.mm.plugin.story.model.f.e locale = com.tencent.mm.plugin.story.model.f.e.rXx;
    paramString = com.tencent.mm.plugin.story.model.f.e.aaM(paramString);
    AppMethodBeat.o(108920);
    return paramString;
  }

  public final com.tencent.mm.plugin.story.api.m getStoryUIFactory()
  {
    return (com.tencent.mm.plugin.story.api.m)r.rTS;
  }

  public final cfc getStoryUserInfo()
  {
    AppMethodBeat.i(108936);
    Object localObject1 = com.tencent.mm.plugin.story.model.j.rST;
    localObject1 = j.a.cxU();
    Object localObject2 = com.tencent.mm.plugin.story.model.j.rST;
    localObject2 = ((com.tencent.mm.plugin.story.h.g)localObject1).aap(j.a.cnk()).cBM();
    localObject1 = localObject2;
    if (localObject2 == null)
      localObject1 = new cfc();
    AppMethodBeat.o(108936);
    return localObject1;
  }

  public final boolean hasNewStory(String paramString)
  {
    AppMethodBeat.i(108927);
    boolean bool;
    if (!com.tencent.mm.plugin.story.api.n.isShowStoryCheck())
    {
      bool = false;
      AppMethodBeat.o(108927);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.plugin.story.model.k localk = com.tencent.mm.plugin.story.model.k.rTc;
      bool = com.tencent.mm.plugin.story.model.k.aaq(paramString);
      AppMethodBeat.o(108927);
    }
  }

  public final boolean isShowStoryCheck()
  {
    AppMethodBeat.i(108925);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    boolean bool = j.a.cyg();
    AppMethodBeat.o(108925);
    return bool;
  }

  public final boolean isStoryExist(String paramString)
  {
    boolean bool1 = false;
    AppMethodBeat.i(108918);
    boolean bool2;
    if (!com.tencent.mm.plugin.story.api.n.isShowStoryCheck())
    {
      AppMethodBeat.o(108918);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      if (paramString == null)
      {
        AppMethodBeat.o(108918);
        bool2 = bool1;
      }
      else
      {
        Object localObject = com.tencent.mm.plugin.story.model.j.rST;
        boolean bool3;
        if ((a.f.b.j.j(paramString, j.a.cnk()) ^ true))
        {
          localObject = com.tencent.mm.plugin.story.model.j.rST;
          bool3 = j.a.cxU().aap(paramString).isValid();
          bool2 = bool3;
          if (bool3)
          {
            ab.i(TAG, "ret1 has story!");
            AppMethodBeat.o(108918);
            bool2 = true;
          }
        }
        else
        {
          bool2 = false;
          localObject = com.tencent.mm.plugin.story.model.n.rTi;
          bool3 = n.a.dl(paramString, cb.aaF() - 86400);
          if (bool3)
            ab.i(TAG, "ret2 has story!");
          if ((bool2) || (bool3))
          {
            AppMethodBeat.o(108918);
            bool2 = true;
          }
          else
          {
            AppMethodBeat.o(108918);
            bool2 = bool1;
          }
        }
      }
    }
  }

  public final boolean isStoryUnread(String paramString)
  {
    AppMethodBeat.i(108917);
    f.a locala = com.tencent.mm.plugin.story.model.f.rSp;
    boolean bool = f.a.isStoryUnread(paramString);
    AppMethodBeat.o(108917);
    return bool;
  }

  public final void loadStory(String paramString1, String paramString2)
  {
    AppMethodBeat.i(108919);
    if (paramString1 == null)
      AppMethodBeat.o(108919);
    while (true)
    {
      return;
      if (!com.tencent.mm.plugin.story.api.n.isShowStoryCheck())
      {
        AppMethodBeat.o(108919);
      }
      else
      {
        Object localObject = com.tencent.mm.plugin.story.model.j.rST;
        boolean bool = bo.isEqual(paramString1, j.a.cnk());
        if ((!bool) && (!com.tencent.mm.plugin.story.api.n.cxf()))
        {
          localObject = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
          a.f.b.j.o(localObject, "MMKernel.service(IMessengerStorage::class.java)");
          localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().aoO(paramString1);
          if (localObject == null)
          {
            AppMethodBeat.o(108919);
          }
          else if (!((ad)localObject).NX())
          {
            ab.i(TAG, "filter by isOpenStrangerUserPage close ".concat(String.valueOf(paramString1)));
            AppMethodBeat.o(108919);
          }
        }
        else
        {
          localObject = paramString2;
          if (paramString2 == null)
            localObject = "";
          paramString2 = new com.tencent.mm.plugin.story.model.a.j(paramString1, bool, (String)localObject);
          paramString1 = com.tencent.mm.kernel.g.RO();
          a.f.b.j.o(paramString1, "MMKernel.network()");
          paramString1.Rg().d((com.tencent.mm.ai.m)paramString2);
          AppMethodBeat.o(108919);
        }
      }
    }
  }

  public final String name()
  {
    return "plugin-story";
  }

  public final boolean preLoadVideoViewMgr(String paramString)
  {
    AppMethodBeat.i(108932);
    Object localObject = com.tencent.mm.plugin.story.ui.view.gallery.q.srv;
    localObject = paramString;
    if (paramString == null)
      localObject = "";
    com.tencent.mm.plugin.story.ui.view.gallery.q.abg((String)localObject);
    AppMethodBeat.o(108932);
    return true;
  }

  public final void preloadForSnsUser(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(108933);
    if (paramString == null)
      AppMethodBeat.o(108933);
    while (true)
    {
      return;
      if (paramBoolean);
      for (int i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGd, 1); ; i = ((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGf, 0))
      {
        ab.i(TAG, "preloadForSnsUser: " + i + " isEnter: " + paramBoolean + " username " + paramString + ' ' + bo.dpG());
        if (i != 1)
          break label162;
        Object localObject = com.tencent.mm.plugin.story.f.h.rZx;
        localObject = h.a.bt(paramString, false);
        if (localObject == null)
          break label162;
        paramString = com.tencent.mm.plugin.story.ui.view.gallery.n.sqi;
        com.tencent.mm.plugin.story.ui.view.gallery.n.dK(a.a.j.listOf(((com.tencent.mm.plugin.story.model.d.g)localObject).rVZ));
        AppMethodBeat.o(108933);
        break;
      }
      label162: AppMethodBeat.o(108933);
    }
  }

  public final void removeStoryPostListener(com.tencent.mm.plugin.story.api.j paramj)
  {
    AppMethodBeat.i(108922);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cya().b(paramj);
    AppMethodBeat.o(108922);
  }

  public final void removeStoryStatusNotifyListener(com.tencent.mm.plugin.story.api.l paraml)
  {
    AppMethodBeat.i(108924);
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    localObject = j.a.cxU();
    if (paraml != null)
      ((com.tencent.mm.plugin.story.h.g)localObject).sdL.remove(paraml);
    AppMethodBeat.o(108924);
  }

  public final void reportWaitPlayList(List<String> paramList, long paramLong)
  {
    AppMethodBeat.i(108934);
    a.f.b.j.p(paramList, "userList");
    com.tencent.mm.plugin.story.model.k localk = com.tencent.mm.plugin.story.model.k.rTc;
    com.tencent.mm.plugin.story.model.k.reportWaitPlayList(paramList, paramLong);
    AppMethodBeat.o(108934);
  }

  public final void setPreviewEnterScene(long paramLong)
  {
    AppMethodBeat.i(108931);
    com.tencent.mm.plugin.story.g.h localh = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAs().bG(paramLong);
    AppMethodBeat.o(108931);
  }

  public final boolean showStoryEntranceDialog(Context paramContext, String paramString, int paramInt)
  {
    AppMethodBeat.i(108935);
    a.f.b.j.p(paramContext, "context");
    a.f.b.j.p(paramString, "sessionId");
    com.tencent.mm.plugin.story.g.h localh = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAM().fw(paramString);
    paramString = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAM().gJ((int)System.currentTimeMillis());
    paramString = com.tencent.mm.plugin.story.g.h.scu;
    paramString = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.Fa(com.tencent.mm.plugin.story.g.h.cAM().FB());
    paramString = com.tencent.mm.plugin.story.g.h.scu;
    com.tencent.mm.plugin.story.g.h.cAM().gK(paramInt);
    paramString = new com.tencent.mm.plugin.story.ui.sns.b(paramContext);
    paramString.setContentView((View)new com.tencent.mm.plugin.story.ui.sns.c(paramContext, (View.OnClickListener)new PluginStory.d(paramString)));
    paramString.show();
    AppMethodBeat.o(108935);
    return true;
  }

  public final com.tencent.mm.plugin.story.api.h storyComment()
  {
    return (com.tencent.mm.plugin.story.api.h)com.tencent.mm.plugin.story.model.b.b.rVw;
  }

  public final void updateStoryUserInfo(String paramString, cfc paramcfc)
  {
    AppMethodBeat.i(108937);
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    localObject = j.a.cxU();
    if ((paramString == null) || (paramcfc == null))
    {
      AppMethodBeat.o(108937);
      return;
    }
    com.tencent.mm.plugin.story.h.f localf = ((com.tencent.mm.plugin.story.h.g)localObject).aap(paramString);
    if (paramcfc != null);
    for (paramString = paramcfc.toByteArray(); ; paramString = null)
    {
      localf.field_userInfo = paramString;
      ((com.tencent.mm.plugin.story.h.g)localObject).b(localf);
      AppMethodBeat.o(108937);
      break;
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/PluginStory$StoryCleanListener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/StoryFileCleanTaskEvent;", "()V", "callback", "", "event", "plugin-story_release"})
  public static final class b extends com.tencent.mm.sdk.b.c<sn>
  {
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/PluginStory$StorySynclistener;", "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/StorySyncEvent;", "()V", "callback", "", "event", "plugin-story_release"})
  public static final class c extends com.tencent.mm.sdk.b.c<so>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.PluginStory
 * JD-Core Version:    0.6.2
 */