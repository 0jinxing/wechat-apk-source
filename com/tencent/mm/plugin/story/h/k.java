package com.tencent.mm.plugin.story.h;

import a.l;
import a.y;
import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.cb;
import com.tencent.mm.plugin.story.model.d;
import com.tencent.mm.protocal.protobuf.cfb;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryInfoStorage;", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "Lcom/tencent/mm/plugin/story/storage/StoryInfo;", "Lcom/tencent/mm/plugin/story/storage/IStoryStorage;", "vdb", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "(Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;)V", "CON_POST", "", "CON_SERVER", "CON_TYPE_ERROR", "db", "delList", "", "kotlin.jvm.PlatformType", "", "itemFlagSet", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "localFlagSet", "sourceTypeSet", "getVdb", "()Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "setVdb", "addDelList", "", "localId", "addReadCount", "storyId", "", "count", "conTimestampAfter", "limitTime", "conTimestampBefore", "conUserWhere", "userName", "isSelf", "", "deleteByLocalId", "deleteByStoryId", "deleteByStoryIdWithNotify", "username", "deleteByUsername", "deleteStoryByIdBefore", "id", "deleteStoryByTimeBefore", "timeStamp", "droptable", "dumpinfo", "get", "getAlbumStoryAfterByStoryId", "minId", "limitCount", "getByLocalId", "getByStoryId", "getByUserName", "getByUserNameAfter", "excludePrivacy", "getCDAboveExcudeSeq", "seq", "getCDBelowExculdeSeq", "getDiedStory", "getFavHistoryMinIdByLimit", "maxId", "getFavStoryByUsername", "getForSnsByUserNameAfter", "getHistoryMinIdByLimit", "getInfoBetweenDate", "createTime", "getLastStoryByName", "getLastUpload", "getMinIdByLimit", "baseSql", "conServer", "getStoryAfterByStoryId", "getStoryById", "getStoryReadCount", "getUserMinIdByLimit", "getUserSql", "getBuf", "checkCount", "inDelList", "isPcIdExist", "isStoryIdExist", "removeDelList", "replaceStoryId", "storyInfo", "replaceUserByPcId", "snsInfo", "seqAvailable", "set", "update", "updateByLocal", "storyinfo", "updateFilterUserName", "conSql", "updateStoryFavorite", "favorite", "updateStoryVisibility", "visibilitySelf", "Companion", "plugin-story_release"})
public final class k extends com.tencent.mm.sdk.e.j<j>
{
  public static final String TAG = "MicroMsg.StoryInfoStorage";
  private static final String[] diI;
  private static final String[] fnj;
  public static String rfn;
  private static String rfw;
  private static String rfx;
  public static final String sdP = "MMStoryInfo";
  private static final String see = "select count(*) from MMStoryInfo ";
  private static String sef;
  public static final String seg = " (storyID != 0  ) ";
  private static String seh;
  private static String sei;
  private static String sej;
  public static final k.a sek;
  public final e bSd;
  private final ArrayList<Integer> rfA;
  private final ArrayList<Integer> rfB;
  private String rfs;
  private String rft;
  private e sdO;
  private final String seb;
  private final ArrayList<Integer> sec;
  private final List<String> sed;

  static
  {
    AppMethodBeat.i(109965);
    sek = new k.a((byte)0);
    TAG = "MicroMsg.StoryInfoStorage";
    see = "select count(*) from MMStoryInfo ";
    sdP = "MMStoryInfo";
    rfn = " order by " + sdP + ".createTime desc";
    sef = " order by " + sdP + ".favoriteTime asc";
    seg = " (storyID != 0  ) ";
    Object localObject1 = new StringBuilder("CREATE INDEX IF NOT EXISTS ");
    Object localObject2 = j.sea;
    localObject1 = j.cBZ() + " ON " + sdP + " ( storyID )";
    localObject2 = new StringBuilder("CREATE INDEX IF NOT EXISTS ");
    Object localObject3 = j.sea;
    String str = j.cCa() + " ON " + sdP + " (userName,storyID, createTime)";
    localObject3 = new StringBuilder("CREATE INDEX IF NOT EXISTS ");
    localObject2 = j.sea;
    diI = new String[] { localObject1, str, j.cCb() + " ON " + sdP + " (userName, createTime)" };
    localObject1 = j.sea;
    fnj = new String[] { com.tencent.mm.sdk.e.j.a(j.cBF(), sdP) };
    AppMethodBeat.o(109965);
  }

  public k(e parame)
  {
    super(parame, j.cBF(), sdP, diI);
    AppMethodBeat.i(109964);
    this.sdO = parame;
    this.seb = " (storyID != 0 ) ";
    parame = a.c.sds;
    int i = a.c.cBu();
    parame = a.c.sds;
    int j = a.c.cBv();
    parame = a.c.sds;
    parame = Arrays.asList(new Integer[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(a.c.cBw()) });
    a.f.b.j.o(parame, "Arrays.asList(ConstantsS…lag.LOCAL_FLAG_STATE_MIX)");
    this.rfA = k.a.dm(parame);
    parame = a.sdm;
    i = a.cAO();
    parame = a.sdm;
    j = a.cAP();
    parame = a.sdm;
    parame = Arrays.asList(new Integer[] { Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(a.cAQ()) });
    a.f.b.j.o(parame, "Arrays.asList(ConstantsS…ORY_SOURCE_ALBUM_HISTORY)");
    this.rfB = k.a.dm(parame);
    parame = a.sdm;
    j = a.cBm();
    parame = a.sdm;
    parame = Arrays.asList(new Integer[] { Integer.valueOf(j), Integer.valueOf(a.cBn()) });
    a.f.b.j.o(parame, "Arrays.asList(ConstantsS…STORY_ITEM_FAVORITE_FLAG)");
    this.sec = k.a.dm(parame);
    this.bSd = this.sdO;
    this.sed = Collections.synchronizedList((List)new ArrayList());
    parame = new ArrayList();
    localObject1 = this.rfA.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Integer)((Iterator)localObject1).next();
      j = ((Integer)localObject2).intValue();
      localObject3 = a.c.sds;
      if ((j & a.c.cBu()) != 0)
      {
        j = ((Integer)localObject2).intValue();
        localObject3 = a.c.sds;
        if ((j & a.c.cBv()) == 0)
          parame.add(localObject2);
      }
    }
    this.rfs = k.a.f((List)parame, "localFlag");
    parame.clear();
    localObject1 = this.rfB.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (Integer)((Iterator)localObject1).next();
      j = ((Integer)localObject3).intValue();
      localObject2 = a.sdm;
      if ((j & a.cAO()) != 0)
        parame.add(localObject3);
    }
    rfw = k.a.f((List)parame, "sourceType");
    parame.clear();
    Object localObject3 = this.rfB.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (Integer)((Iterator)localObject3).next();
      j = ((Integer)localObject1).intValue();
      localObject2 = a.sdm;
      if ((j & a.cAP()) != 0)
        parame.add(localObject1);
    }
    rfx = k.a.f((List)parame, "sourceType");
    parame.clear();
    localObject3 = this.rfA.iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (Integer)((Iterator)localObject3).next();
      j = ((Integer)localObject1).intValue();
      localObject2 = a.c.sds;
      if ((j & a.c.cBv()) != 0)
        parame.add(localObject1);
    }
    this.rft = k.a.f((List)parame, "localFlag");
    parame.clear();
    localObject1 = this.rfB.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Integer)((Iterator)localObject1).next();
      j = ((Integer)localObject2).intValue();
      localObject3 = a.sdm;
      if ((j & a.cAQ()) != 0)
        parame.add(localObject2);
    }
    sei = k.a.f((List)parame, "sourceType");
    parame.clear();
    localObject1 = this.sec.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Integer)((Iterator)localObject1).next();
      j = ((Integer)localObject2).intValue();
      localObject3 = a.sdm;
      if ((j & a.cBm()) != 0)
        parame.add(localObject2);
    }
    seh = k.a.b((List)parame, "itemStoryFlag", true);
    parame.clear();
    Object localObject2 = this.sec.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (Integer)((Iterator)localObject2).next();
      j = ((Integer)localObject1).intValue();
      localObject3 = a.sdm;
      if ((j & a.cBn()) != 0)
        parame.add(localObject1);
    }
    sej = k.a.f((List)parame, "itemStoryFlag");
    AppMethodBeat.o(109964);
  }

  private static String Ff(int paramInt)
  {
    AppMethodBeat.i(109944);
    String str = sdP + ".createTime>" + paramInt;
    AppMethodBeat.o(109944);
    return str;
  }

  public static String bm(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(109943);
    if (paramBoolean)
    {
      paramString = " WHERE " + rfw;
      AppMethodBeat.o(109943);
    }
    while (true)
    {
      return paramString;
      paramString = " WHERE " + sdP + ".userName='" + bo.vA(paramString) + "' AND " + rfx;
      AppMethodBeat.o(109943);
    }
  }

  private static String bv(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(109945);
    paramString = "select *,rowid from MMStoryInfo " + bm(paramString, paramBoolean);
    AppMethodBeat.o(109945);
    return paramString;
  }

  private long k(String paramString, long paramLong, int paramInt)
  {
    long l = 0L;
    AppMethodBeat.i(109934);
    a.f.b.j.p(paramString, "baseSql");
    Object localObject = paramString;
    if (paramLong != 0L)
      localObject = paramString + " AND " + sdP + ".storyID < '" + paramLong + '\'';
    paramString = (String)localObject + rfn + " limit " + paramInt;
    ab.d(TAG, "getMinIdByLimit sql=".concat(String.valueOf(paramString)));
    localObject = this.bSd.rawQuery(paramString, null);
    if (((Cursor)localObject).moveToLast())
    {
      paramString = new j();
      a.f.b.j.o(localObject, "cu");
      paramString.d((Cursor)localObject);
      ((Cursor)localObject).close();
      paramLong = paramString.field_storyID;
      AppMethodBeat.o(109934);
    }
    while (true)
    {
      return paramLong;
      ((Cursor)localObject).close();
      AppMethodBeat.o(109934);
      paramLong = l;
    }
  }

  private boolean lu(long paramLong)
  {
    AppMethodBeat.i(138844);
    Object localObject = "select *,rowid from MMStoryInfo  where " + sdP + ".storyID = " + paramLong;
    localObject = this.bSd.rawQuery((String)localObject, null);
    a.f.b.j.o(localObject, "cu");
    int i = ((Cursor)localObject).getCount();
    ((Cursor)localObject).close();
    boolean bool;
    if (i > 0)
    {
      bool = true;
      AppMethodBeat.o(138844);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(138844);
    }
  }

  private j lv(long paramLong)
  {
    AppMethodBeat.i(109942);
    j localj;
    if (paramLong >= 0L)
    {
      localj = Fe((int)paramLong);
      AppMethodBeat.o(109942);
    }
    while (true)
    {
      return localj;
      localj = lx(paramLong);
      AppMethodBeat.o(109942);
    }
  }

  public final boolean DL(int paramInt)
  {
    boolean bool = true;
    AppMethodBeat.i(109955);
    e locale = this.bSd;
    String str = sdP;
    StringBuilder localStringBuilder = new StringBuilder();
    j.a locala = j.sea;
    if (locale.delete(str, j.cBY() + "=?", new String[] { String.valueOf(paramInt) }) > 0)
      AppMethodBeat.o(109955);
    while (true)
    {
      return bool;
      AppMethodBeat.o(109955);
      bool = false;
    }
  }

  public final long E(long paramLong, int paramInt)
  {
    AppMethodBeat.i(109960);
    paramLong = k("select *,rowid from MMStoryInfo  WHERE " + sei, paramLong, paramInt);
    AppMethodBeat.o(109960);
    return paramLong;
  }

  public final long F(long paramLong, int paramInt)
  {
    AppMethodBeat.i(138846);
    paramLong = k("select *,rowid from MMStoryInfo  WHERE " + sej, paramLong, paramInt);
    AppMethodBeat.o(138846);
    return paramLong;
  }

  public final j Fe(int paramInt)
  {
    AppMethodBeat.i(109941);
    j localj = new j();
    StringBuilder localStringBuilder = new StringBuilder("select *,rowid from MMStoryInfo  where ").append(sdP).append('.');
    Object localObject = j.sea;
    localObject = j.cBY() + '=' + paramInt;
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      a.f.b.j.o(localObject, "cu");
      localj.d((Cursor)localObject);
      ((Cursor)localObject).close();
      AppMethodBeat.o(109941);
    }
    while (true)
    {
      return localj;
      ((Cursor)localObject).close();
      AppMethodBeat.o(109941);
      localj = null;
    }
  }

  public final int a(int paramInt, j paramj)
  {
    AppMethodBeat.i(109940);
    a.f.b.j.p(paramj, "storyinfo");
    Object localObject = com.tencent.mm.plugin.story.model.j.rST;
    if (com.tencent.mm.plugin.story.model.j.a.cxT().abb(paramInt + '_' + paramj.field_createTime))
    {
      paramInt = -1;
      AppMethodBeat.o(109940);
    }
    while (true)
    {
      return paramInt;
      localObject = paramj.Hl();
      ((ContentValues)localObject).remove("rowid");
      e locale = this.bSd;
      paramj = sdP;
      StringBuilder localStringBuilder = new StringBuilder();
      j.a locala = j.sea;
      paramInt = locale.update(paramj, (ContentValues)localObject, j.cBY() + "=?", new String[] { String.valueOf(paramInt) });
      AppMethodBeat.o(109940);
    }
  }

  public final List<j> a(String paramString, boolean paramBoolean1, int paramInt, boolean paramBoolean2)
  {
    AppMethodBeat.i(109952);
    a.f.b.j.p(paramString, "userName");
    Object localObject1 = new ArrayList();
    paramString = "select *,rowid from MMStoryInfo " + bm(paramString, paramBoolean1) + ' ';
    paramString = paramString + " AND " + Ff(paramInt);
    Object localObject2 = new StringBuilder().append(paramString);
    if (paramBoolean1);
    for (paramString = rfn; ; paramString = " AND " + seg + " AND " + seh + ' ' + rfn)
    {
      paramString = paramString;
      localObject2 = this.bSd.a(paramString, null, 2);
      if (localObject2 == null)
        break label214;
      while (((Cursor)localObject2).moveToNext())
      {
        paramString = new j();
        paramString.d((Cursor)localObject2);
        ((ArrayList)localObject1).add(paramString);
      }
    }
    ((Cursor)localObject2).close();
    label214: if (paramBoolean1)
    {
      paramString = d.rSg;
      d.EK(((ArrayList)localObject1).size());
    }
    if (paramBoolean2)
    {
      localObject1 = (Iterable)localObject1;
      paramString = (Collection)new ArrayList();
      localObject1 = ((Iterable)localObject1).iterator();
      label313: 
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = ((Iterator)localObject1).next();
        if (!((j)localObject2).cBV());
        for (paramInt = 1; ; paramInt = 0)
        {
          if (paramInt == 0)
            break label313;
          paramString.add(localObject2);
          break;
        }
      }
      paramString = (List)paramString;
      AppMethodBeat.o(109952);
    }
    while (true)
    {
      return paramString;
      paramString = (List)localObject1;
      AppMethodBeat.o(109952);
    }
  }

  public final List<j> a(String paramString, boolean paramBoolean, long paramLong, int paramInt)
  {
    AppMethodBeat.i(138847);
    a.f.b.j.p(paramString, "username");
    ArrayList localArrayList = new ArrayList();
    int i;
    if (((CharSequence)paramString).length() > 0)
      i = 1;
    while (i != 0)
    {
      Object localObject = "select *,rowid from MMStoryInfo  " + bm(paramString, paramBoolean) + " AND " + sej + ' ';
      paramString = (String)localObject;
      if (paramLong < 0L)
        paramString = (String)localObject + " AND storyID >= " + paramLong;
      localObject = paramString + rfn;
      paramString = (String)localObject;
      if (paramInt > 0)
        paramString = (String)localObject + " limit " + paramInt;
      ab.d(TAG, "getFavStoryByUsername sql:".concat(String.valueOf(paramString)));
      localObject = this.bSd.a(paramString, null, 2);
      if (localObject != null)
      {
        while (true)
          if (((Cursor)localObject).moveToNext())
          {
            paramString = new j();
            paramString.d((Cursor)localObject);
            localArrayList.add(paramString);
            continue;
            i = 0;
            break;
          }
        ((Cursor)localObject).close();
      }
    }
    paramString = (List)localArrayList;
    AppMethodBeat.o(138847);
    return paramString;
  }

  public final boolean a(long paramLong, j paramj)
  {
    AppMethodBeat.i(138843);
    a.f.b.j.p(paramj, "storyInfo");
    boolean bool;
    if (lu(paramLong))
    {
      bool = b(paramLong, paramj);
      AppMethodBeat.o(138843);
    }
    while (true)
    {
      return bool;
      if (d(paramj) != -1)
      {
        bool = true;
        AppMethodBeat.o(138843);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(138843);
      }
    }
  }

  public final void aba(String paramString)
  {
    AppMethodBeat.i(109932);
    a.f.b.j.p(paramString, "localId");
    this.sed.add(paramString);
    AppMethodBeat.o(109932);
  }

  public final boolean abb(String paramString)
  {
    AppMethodBeat.i(109933);
    a.f.b.j.p(paramString, "localId");
    boolean bool = false;
    ??? = this.sed;
    a.f.b.j.o(???, "delList");
    while (true)
      synchronized ((Iterable)???)
      {
        Iterator localIterator = ((Iterable)???).iterator();
        if (localIterator.hasNext())
        {
          if (a.f.b.j.j((String)localIterator.next(), paramString))
          {
            bool = true;
            ab.i(TAG, "wo wo wo ".concat(String.valueOf(paramString)));
          }
        }
        else
        {
          paramString = y.AUy;
          AppMethodBeat.o(109933);
          return bool;
        }
      }
  }

  public final long b(long paramLong, int paramInt, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(109946);
    a.f.b.j.p(paramString, "username");
    paramLong = k(bv(paramString, paramBoolean), paramLong, paramInt);
    AppMethodBeat.o(109946);
    return paramLong;
  }

  public final boolean b(long paramLong, j paramj)
  {
    boolean bool = true;
    AppMethodBeat.i(109935);
    a.f.b.j.p(paramj, "storyInfo");
    paramj = paramj.Hl();
    if (this.bSd.update(sdP, paramj, "storyID=?", new String[] { String.valueOf(paramLong) }) > 0)
      AppMethodBeat.o(109935);
    while (true)
    {
      return bool;
      AppMethodBeat.o(109935);
      bool = false;
    }
  }

  public final List<j> bw(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(138845);
    a.f.b.j.p(paramString, "userName");
    ArrayList localArrayList = new ArrayList();
    paramString = "select *,rowid from MMStoryInfo " + bm(paramString, paramBoolean);
    Object localObject = new StringBuilder().append(paramString);
    if (paramBoolean);
    for (paramString = rfn; ; paramString = " AND " + seg + rfn)
    {
      paramString = paramString;
      paramString = this.bSd.a(paramString, null, 2);
      while (paramString.moveToNext())
      {
        localObject = new j();
        a.f.b.j.o(paramString, "cu");
        ((j)localObject).d(paramString);
        localArrayList.add(localObject);
      }
    }
    paramString.close();
    paramString = (List)localArrayList;
    AppMethodBeat.o(138845);
    return paramString;
  }

  public final ArrayList<j> bx(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(109963);
    a.f.b.j.p(paramString, "username");
    ArrayList localArrayList = new ArrayList();
    int i;
    if (((CharSequence)paramString).length() > 0)
      i = 1;
    while (i != 0)
    {
      paramString = "select *,rowid from MMStoryInfo  " + bm(paramString, paramBoolean) + " AND " + sej + ' ' + rfn;
      ab.d(TAG, "getFavStoryByUsername sql:".concat(String.valueOf(paramString)));
      Cursor localCursor = this.bSd.a(paramString, null, 2);
      if (localCursor != null)
      {
        while (true)
          if (localCursor.moveToNext())
          {
            paramString = new j();
            paramString.d(localCursor);
            localArrayList.add(paramString);
            continue;
            i = 0;
            break;
          }
        localCursor.close();
      }
    }
    AppMethodBeat.o(109963);
    return localArrayList;
  }

  public final boolean c(long paramLong, j paramj)
  {
    AppMethodBeat.i(109947);
    a.f.b.j.p(paramj, "snsInfo");
    boolean bool;
    if (kv(paramLong))
    {
      bool = b(paramLong, paramj);
      AppMethodBeat.o(109947);
    }
    while (true)
    {
      return bool;
      if (d(paramj) != -1)
      {
        bool = true;
        AppMethodBeat.o(109947);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(109947);
      }
    }
  }

  public final j cCc()
  {
    Object localObject1 = null;
    AppMethodBeat.i(109939);
    int i = cb.aaF();
    j localj = new j();
    Object localObject2 = new StringBuilder("select *,rowid from MMStoryInfo  where ").append(this.rfs).append(" and createTime > ").append(i - 86400).append(" order by ").append(sdP).append('.');
    Object localObject3 = j.sea;
    localObject2 = j.cBY() + " asc limit 1";
    localObject3 = this.bSd.a((String)localObject2, null, 2);
    ab.d(TAG, "getLastUpload ".concat(String.valueOf(localObject2)));
    if (!((Cursor)localObject3).moveToFirst())
    {
      ((Cursor)localObject3).close();
      AppMethodBeat.o(109939);
    }
    while (true)
    {
      return localObject1;
      a.f.b.j.o(localObject3, "cr");
      localj.d((Cursor)localObject3);
      ((Cursor)localObject3).close();
      AppMethodBeat.o(109939);
      localObject1 = localj;
    }
  }

  public final void cqH()
  {
    AppMethodBeat.i(109958);
    int i = this.bSd.delete(sdP, null, null);
    ab.i(TAG, "dropTable ".concat(String.valueOf(i)));
    AppMethodBeat.o(109958);
  }

  public final int d(j paramj)
  {
    AppMethodBeat.i(109937);
    a.f.b.j.p(paramj, "storyInfo");
    ab.d(TAG, "storyInfo Insert");
    paramj = paramj.Hl();
    int i = (int)this.bSd.insert(sdP, "", paramj);
    ab.d(TAG, "StoryInfo Insert result ".concat(String.valueOf(i)));
    AppMethodBeat.o(109937);
    return i;
  }

  public final List<j> dm(String paramString, int paramInt)
  {
    AppMethodBeat.i(109959);
    a.f.b.j.p(paramString, "userName");
    ArrayList localArrayList = new ArrayList();
    paramString = "select *,rowid from MMStoryInfo " + bm(paramString, true);
    paramString = paramString + " AND createTime BETWEEN " + paramInt + " AND " + (86400 + paramInt - 1);
    paramString = paramString + rfn;
    paramString = this.bSd.a(paramString, null, 2);
    while (paramString.moveToNext())
    {
      j localj = new j();
      a.f.b.j.o(paramString, "cu");
      localj.d(paramString);
      localArrayList.add(localj);
    }
    paramString.close();
    paramString = (List)localArrayList;
    AppMethodBeat.o(109959);
    return paramString;
  }

  public final List<j> h(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(109954);
    a.f.b.j.p(paramString, "userName");
    Object localObject = (Iterable)a(this, paramString, paramBoolean, paramInt);
    paramString = (Collection)new ArrayList();
    Iterator localIterator = ((Iterable)localObject).iterator();
    label99: 
    while (localIterator.hasNext())
    {
      localObject = localIterator.next();
      if (((j)localObject).cBR().xeC == 0);
      for (paramInt = 1; ; paramInt = 0)
      {
        if (paramInt == 0)
          break label99;
        paramString.add(localObject);
        break;
      }
    }
    paramString = (List)paramString;
    AppMethodBeat.o(109954);
    return paramString;
  }

  public final boolean kv(long paramLong)
  {
    AppMethodBeat.i(109948);
    Object localObject = "select *,rowid from MMStoryInfo  where " + sdP + ".storyID = " + paramLong;
    localObject = this.bSd.rawQuery((String)localObject, null);
    a.f.b.j.o(localObject, "cu");
    int i = ((Cursor)localObject).getCount();
    ((Cursor)localObject).close();
    boolean bool;
    if (i > 0)
    {
      bool = true;
      AppMethodBeat.o(109948);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(109948);
    }
  }

  public final j lt(long paramLong)
  {
    AppMethodBeat.i(109938);
    j localj = new j();
    Object localObject = "select *,rowid from MMStoryInfo  where " + sdP + ".storyID=" + paramLong + " limit 1";
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      a.f.b.j.o(localObject, "cu");
      localj.d((Cursor)localObject);
      ((Cursor)localObject).close();
      AppMethodBeat.o(109938);
    }
    while (true)
    {
      return localj;
      ((Cursor)localObject).close();
      AppMethodBeat.o(109938);
      localj = null;
    }
  }

  public final boolean lw(long paramLong)
  {
    boolean bool = true;
    AppMethodBeat.i(109956);
    if (this.bSd.delete(sdP, "storyID=?", new String[] { String.valueOf(paramLong) }) > 0)
      AppMethodBeat.o(109956);
    while (true)
    {
      return bool;
      AppMethodBeat.o(109956);
      bool = false;
    }
  }

  public final j lx(long paramLong)
  {
    AppMethodBeat.i(109957);
    j localj = new j();
    Object localObject = "select *,rowid from MMStoryInfo  WHERE " + sdP + ".storyID=" + paramLong;
    localObject = this.bSd.a((String)localObject, null, 2);
    if (((Cursor)localObject).moveToFirst())
    {
      a.f.b.j.o(localObject, "cu");
      localj.d((Cursor)localObject);
      ((Cursor)localObject).close();
      AppMethodBeat.o(109957);
    }
    while (true)
    {
      return localj;
      ((Cursor)localObject).close();
      AppMethodBeat.o(109957);
      localj = null;
    }
  }

  public final int ly(long paramLong)
  {
    AppMethodBeat.i(109961);
    j localj = lv(paramLong);
    int i;
    if (localj != null)
    {
      i = localj.field_readCount;
      AppMethodBeat.o(109961);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(109961);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.k
 * JD-Core Version:    0.6.2
 */