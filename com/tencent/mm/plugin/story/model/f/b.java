package com.tencent.mm.plugin.story.model.f;

import a.l;
import a.v;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.h.f;
import com.tencent.mm.plugin.story.h.g;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/sync/SingleUserStateFetcher;", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "username", "", "(Ljava/lang/String;)V", "extInfo", "Lcom/tencent/mm/plugin/story/storage/StoryExtInfo;", "hasStory", "", "hasUnread", "isInBlackList", "listener", "Lcom/tencent/mm/plugin/story/api/IStoryStateFetcher$ChatRoomStateListener;", "snsPermissionNotifyListener", "com/tencent/mm/plugin/story/model/sync/SingleUserStateFetcher$snsPermissionNotifyListener$1", "Lcom/tencent/mm/plugin/story/model/sync/SingleUserStateFetcher$snsPermissionNotifyListener$1;", "checkStoryUnread", "destroy", "", "notifyListener", "onNotifyChange", "event", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "pause", "registerNotifyListener", "resume", "start", "Companion", "plugin-story_release"})
public final class b
  implements com.tencent.mm.plugin.story.api.k, com.tencent.mm.sdk.e.k.a
{
  private static final String TAG = "MicroMsg.SingleUserStateFetcher";
  public static final b.a rXf;
  private boolean isInBlackList;
  private boolean pls;
  private com.tencent.mm.plugin.story.api.k.a rXb;
  private f rXc;
  private boolean rXd;
  private final b.c rXe;
  private final String username;

  static
  {
    AppMethodBeat.i(109390);
    rXf = new b.a((byte)0);
    TAG = "MicroMsg.SingleUserStateFetcher";
    AppMethodBeat.o(109390);
  }

  public b(String paramString)
  {
    AppMethodBeat.i(109389);
    this.username = paramString;
    this.rXe = new b.c(this);
    AppMethodBeat.o(109389);
  }

  private final void cna()
  {
    AppMethodBeat.i(109388);
    ab.i(TAG, "notifyListener: " + this.pls + ' ' + this.rXd);
    com.tencent.mm.ab.b.a((a.f.a.a)new b.b(this));
    AppMethodBeat.o(109388);
  }

  public final boolean ZW(String paramString)
  {
    return this.rXd;
  }

  public final void a(com.tencent.mm.plugin.story.api.k.a parama)
  {
    this.rXb = parama;
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(109387);
    if (this.isInBlackList)
      AppMethodBeat.o(109387);
    while (true)
    {
      return;
      if ((paramString != null) && (paramm != null) && ((paramm.obj instanceof f)))
      {
        paramm = paramm.obj;
        if (paramm == null)
        {
          paramString = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
          AppMethodBeat.o(109387);
          throw paramString;
        }
        paramm = (f)paramm;
        if ((a.f.b.j.j(this.username, paramm.getUserName()) ^ true))
        {
          AppMethodBeat.o(109387);
        }
        else if ((a.f.b.j.j(paramString, "notify_story_read")) || (a.f.b.j.j(paramString, "notify_story_unread")) || (a.f.b.j.j(paramString, "notify_story_invalid")) || (a.f.b.j.j(paramString, "notify_story_valid")))
        {
          ab.i(TAG, "update user " + paramm.getUserName() + ' ' + paramm.field_syncId + ' ' + paramString);
          if (this.rXd != paramm.cBN());
          for (int i = 1; ; i = 0)
          {
            this.rXc = paramm;
            this.pls = paramm.isValid();
            this.rXd = paramm.cBN();
            cna();
            if (i == 0)
              break label251;
            paramString = this.rXb;
            if (paramString == null)
              break label251;
            paramString.bs(this.username, this.rXd);
            AppMethodBeat.o(109387);
            break;
          }
        }
      }
      else
      {
        label251: AppMethodBeat.o(109387);
      }
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(109386);
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxU().d((com.tencent.mm.sdk.e.k.a)this);
    com.tencent.mm.sdk.b.a.xxA.d((c)this.rXe);
    AppMethodBeat.o(109386);
  }

  public final void pause()
  {
  }

  public final void resume()
  {
    AppMethodBeat.i(109385);
    Object localObject = this.rXc;
    if (localObject != null)
    {
      if ((this.pls) && (!((f)localObject).isValid()))
      {
        ab.i(TAG, "LogStory: expired " + this.username);
        localObject = com.tencent.mm.plugin.story.model.k.rTc;
        com.tencent.mm.plugin.story.model.k.aan(this.username);
      }
      AppMethodBeat.o(109385);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(109385);
    }
  }

  public final void start()
  {
    AppMethodBeat.i(109384);
    com.tencent.mm.ab.b.a("SingleUserStateFetcher_start", (a.f.a.a)new b.d(this));
    j.a locala = com.tencent.mm.plugin.story.model.j.rST;
    j.a.cxU().c((com.tencent.mm.sdk.e.k.a)this);
    com.tencent.mm.sdk.b.a.xxA.c((c)this.rXe);
    AppMethodBeat.o(109384);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.f.b
 * JD-Core Version:    0.6.2
 */