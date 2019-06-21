package com.tencent.mm.plugin.story.h;

import a.v;
import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.er;
import com.tencent.mm.plugin.story.model.b;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.k.a;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bd;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryExtInfoStorage;", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "Lcom/tencent/mm/plugin/story/storage/StoryExtInfo;", "Lcom/tencent/mm/sdk/storage/MStorage$IOnStorageChange;", "Lcom/tencent/mm/plugin/story/storage/IStoryStorage;", "vdb", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "(Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;)V", "db", "extLruMap", "Lcom/tencent/mm/memory/cache/DefaultResource;", "", "notifyListener", "Ljava/util/ArrayList;", "Lcom/tencent/mm/plugin/story/api/IStoryStatusNotifyListener;", "userUpdateMap", "getVdb", "()Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "addStoryStatusNotifyListener", "", "listener", "droptable", "dumpinfo", "get", "userName", "getAllData", "", "getAllUserStatus", "getFavoriteMd5", "getFromCache", "username", "getFromDb", "getMd5", "getStoryStatus", "insertFavMd5", "", "md5", "insertMd5", "onNotifyChange", "event", "eventData", "Lcom/tencent/mm/sdk/storage/MStorageEventData;", "removeStoryStatusNotifyListener", "replace", "", "item", "set", "info", "startNotifyListener", "stopNotifyListener", "updateByLocal", "id", "", "extinfo", "updateCache", "updatePreCache", "updateReadIdWithNotify", "updateStoryUserInfo", "storyUserInfo", "Lcom/tencent/mm/protocal/protobuf/StoryUserInfo;", "updateSyncIdWithNotify", "syncId", "createTime", "thumb", "videoUrl", "duration", "Companion", "plugin-story_release"})
public final class g extends com.tencent.mm.sdk.e.j<f>
  implements k.a
{
  private static final String TAG = "MicroMsg.StoryExtInfoStorage";
  private static final String[] fnj;
  private static final String sdP = "StoryExtItem";
  private static final String sdQ = "select *, rowid from StoryExtItem ";
  private static final String sdR = "select * from StoryExtItem";
  public static final g.a sdS;
  private final e bSd;
  public final ArrayList<com.tencent.mm.plugin.story.api.l> sdL;
  private final com.tencent.mm.memory.a.c<String, f> sdM;
  private com.tencent.mm.memory.a.c<String, f> sdN;
  private final e sdO;

  static
  {
    AppMethodBeat.i(109900);
    sdS = new g.a((byte)0);
    TAG = "MicroMsg.StoryExtInfoStorage";
    sdP = "StoryExtItem";
    f.a locala = f.sdJ;
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(f.cBF(), sdP) };
    sdQ = "select *, rowid from " + sdP + ' ';
    sdR = "select * from " + sdP;
    AppMethodBeat.o(109900);
  }

  public g(e parame)
  {
    super(parame, f.cBF(), sdP, er.diI);
    AppMethodBeat.i(109899);
    this.sdO = parame;
    this.sdL = new ArrayList();
    this.sdM = new com.tencent.mm.memory.a.c(1000);
    this.sdN = new com.tencent.mm.memory.a.c(1000);
    this.bSd = this.sdO;
    AppMethodBeat.o(109899);
  }

  private final void c(f paramf)
  {
    AppMethodBeat.i(109891);
    Object localObject;
    int i;
    if (paramf != null)
    {
      localObject = (CharSequence)paramf.getUserName();
      if ((localObject == null) || (((CharSequence)localObject).length() == 0))
      {
        i = 1;
        if (i == 0)
          break label47;
      }
    }
    else
    {
      AppMethodBeat.o(109891);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label47: localObject = com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class);
      a.f.b.j.o(localObject, "MMKernel.service(IMessengerStorage::class.java)");
      if (((com.tencent.mm.plugin.messenger.foundation.a.j)localObject).XM().aoJ(paramf.getUserName()))
      {
        this.sdM.put(paramf.getUserName(), paramf);
        this.sdN.remove(paramf.getUserName());
        AppMethodBeat.o(109891);
      }
      else
      {
        this.sdM.remove(paramf.getUserName());
        this.sdN.put(paramf.getUserName(), paramf);
        AppMethodBeat.o(109891);
      }
    }
  }

  public final void a(String paramString, m paramm)
  {
    AppMethodBeat.i(109897);
    if ((paramString != null) && (paramm != null))
      if ((a.f.b.j.j(paramString, "notify_story_read")) && ((paramm.obj instanceof f)))
      {
        paramString = paramm.obj;
        if (paramString == null)
        {
          paramString = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
          AppMethodBeat.o(109897);
          throw paramString;
        }
        paramString = ((f)paramString).getUserName();
        paramm = ((Iterable)this.sdL).iterator();
        while (paramm.hasNext())
          ((com.tencent.mm.plugin.story.api.l)paramm.next()).br(paramString, true);
        paramString = b.rSa;
        b.cxt();
        AppMethodBeat.o(109897);
      }
    while (true)
    {
      return;
      if ((a.f.b.j.j(paramString, "notify_story_unread")) && ((paramm.obj instanceof f)))
      {
        paramString = paramm.obj;
        if (paramString == null)
        {
          paramString = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
          AppMethodBeat.o(109897);
          throw paramString;
        }
        paramString = ((f)paramString).getUserName();
        paramm = ((Iterable)this.sdL).iterator();
        while (paramm.hasNext())
          ((com.tencent.mm.plugin.story.api.l)paramm.next()).br(paramString, false);
        paramString = b.rSa;
        b.cxt();
        AppMethodBeat.o(109897);
      }
      else if ((a.f.b.j.j(paramString, "notify_story_invalid")) && ((paramm.obj instanceof f)))
      {
        paramString = paramm.obj;
        if (paramString == null)
        {
          paramString = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
          AppMethodBeat.o(109897);
          throw paramString;
        }
        paramm = ((f)paramString).getUserName();
        paramString = ((Iterable)this.sdL).iterator();
        while (paramString.hasNext())
          ((com.tencent.mm.plugin.story.api.l)paramString.next()).br(paramm, true);
        paramString = b.rSa;
        b.cxt();
        AppMethodBeat.o(109897);
      }
      else if ((a.f.b.j.j(paramString, "notify_story_valid")) && ((paramm.obj instanceof f)))
      {
        paramString = paramm.obj;
        if (paramString == null)
        {
          paramString = new v("null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
          AppMethodBeat.o(109897);
          throw paramString;
        }
        paramString = ((f)paramString).getUserName();
        paramm = ((Iterable)this.sdL).iterator();
        while (paramm.hasNext())
          ((com.tencent.mm.plugin.story.api.l)paramm.next()).br(paramString, true);
        paramString = b.rSa;
        b.cxt();
        AppMethodBeat.o(109897);
      }
      else
      {
        ab.d(TAG, "unknown event ".concat(String.valueOf(paramString)));
        AppMethodBeat.o(109897);
      }
    }
  }

  public final boolean a(long paramLong, f paramf)
  {
    AppMethodBeat.i(109886);
    a.f.b.j.p(paramf, "extinfo");
    if (b(paramLong, paramf) >= 0)
      b("notify_story_preload", 3, paramf);
    AppMethodBeat.o(109886);
    return true;
  }

  public final f aaU(String paramString)
  {
    AppMethodBeat.i(109883);
    f localf = new f();
    localf.field_userName = paramString;
    super.b((com.tencent.mm.sdk.e.c)localf, new String[] { dpX() });
    AppMethodBeat.o(109883);
    return localf;
  }

  public final String aaV(String paramString)
  {
    AppMethodBeat.i(109887);
    a.f.b.j.p(paramString, "userName");
    paramString = aaU(paramString).field_md5;
    AppMethodBeat.o(109887);
    return paramString;
  }

  public final f aaW(String paramString)
  {
    AppMethodBeat.i(109894);
    a.f.b.j.p(paramString, "username");
    int i;
    Object localObject;
    if (((CharSequence)paramString).length() == 0)
    {
      i = 1;
      if (i == 0)
        break label46;
      localObject = null;
      AppMethodBeat.o(109894);
    }
    while (true)
    {
      return localObject;
      i = 0;
      break;
      label46: f localf = (f)this.sdM.get(paramString);
      localObject = localf;
      if (localf == null)
      {
        localf = (f)this.sdN.get(paramString);
        localObject = localf;
        if (localf == null)
        {
          localObject = aaU(paramString);
          c((f)localObject);
        }
      }
      AppMethodBeat.o(109894);
    }
  }

  public final f aaX(String paramString)
  {
    AppMethodBeat.i(109895);
    a.f.b.j.p(paramString, "username");
    f localf1 = (f)this.sdN.get(paramString);
    f localf2 = localf1;
    if (localf1 == null)
    {
      localf2 = aaU(paramString);
      c(localf2);
    }
    AppMethodBeat.o(109895);
    return localf2;
  }

  public final f aap(String paramString)
  {
    AppMethodBeat.i(109884);
    a.f.b.j.p(paramString, "userName");
    f localf = aaW(paramString);
    if (localf != null)
    {
      AppMethodBeat.o(109884);
      paramString = localf;
    }
    while (true)
    {
      return paramString;
      paramString = aaU(paramString);
      AppMethodBeat.o(109884);
    }
  }

  public final int b(long paramLong, f paramf)
  {
    AppMethodBeat.i(109896);
    a.f.b.j.p(paramf, "extinfo");
    ContentValues localContentValues = paramf.Hl();
    localContentValues.remove("rowid");
    c(paramf);
    int i = this.bSd.update(sdP, localContentValues, "rowid=?", new String[] { String.valueOf(paramLong) });
    AppMethodBeat.o(109896);
    return i;
  }

  public final boolean b(f paramf)
  {
    AppMethodBeat.i(109885);
    a.f.b.j.p(paramf, "info");
    c(paramf);
    boolean bool = super.a((com.tencent.mm.sdk.e.c)paramf);
    AppMethodBeat.o(109885);
    return bool;
  }

  public final List<f> cBC()
  {
    AppMethodBeat.i(109893);
    Object localObject1 = new ArrayList();
    Object localObject2 = sdR;
    localObject2 = this.bSd.a((String)localObject2, null, 2);
    ((Cursor)localObject2).moveToFirst();
    do
    {
      f localf = new f();
      a.f.b.j.o(localObject2, "cu");
      localf.d((Cursor)localObject2);
      ((ArrayList)localObject1).add(localf);
    }
    while (((Cursor)localObject2).moveToNext());
    ((Cursor)localObject2).close();
    localObject1 = (List)localObject1;
    AppMethodBeat.o(109893);
    return localObject1;
  }

  public final List<f> cBP()
  {
    AppMethodBeat.i(109892);
    Object localObject1 = new ArrayList();
    Object localObject2 = sdQ;
    Cursor localCursor = this.bSd.a((String)localObject2, null, 2);
    localCursor.moveToFirst();
    do
    {
      localObject2 = new f();
      a.f.b.j.o(localCursor, "cu");
      ((f)localObject2).d(localCursor);
      ((ArrayList)localObject1).add(localObject2);
    }
    while (localCursor.moveToNext());
    localCursor.close();
    localObject1 = (List)localObject1;
    AppMethodBeat.o(109892);
    return localObject1;
  }

  public final void cqH()
  {
    AppMethodBeat.i(109898);
    int i = this.bSd.delete(sdP, null, null);
    ab.i(TAG, "dropTable ".concat(String.valueOf(i)));
    AppMethodBeat.o(109898);
  }

  public final int gB(String paramString1, String paramString2)
  {
    AppMethodBeat.i(109888);
    a.f.b.j.p(paramString1, "userName");
    a.f.b.j.p(paramString2, "md5");
    paramString1 = aaU(paramString1);
    paramString1.field_md5 = paramString2;
    super.a((com.tencent.mm.sdk.e.c)paramString1);
    AppMethodBeat.o(109888);
    return 0;
  }

  public final int gC(String paramString1, String paramString2)
  {
    AppMethodBeat.i(109889);
    a.f.b.j.p(paramString1, "userName");
    a.f.b.j.p(paramString2, "md5");
    paramString1 = aaU(paramString1);
    paramString1.field_favoriteMd5 = paramString2;
    super.a((com.tencent.mm.sdk.e.c)paramString1);
    AppMethodBeat.o(109889);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.g
 * JD-Core Version:    0.6.2
 */