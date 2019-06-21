package com.tencent.mm.plugin.fts.b;

import android.database.Cursor;
import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qo;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.fts.a.a.g.a;
import com.tencent.mm.plugin.fts.a.a.i;
import com.tencent.mm.plugin.fts.a.a.l;
import com.tencent.mm.plugin.fts.a.b;
import com.tencent.mm.plugin.fts.a.e;
import com.tencent.mm.plugin.fts.a.e.a;
import com.tencent.mm.plugin.fts.a.n;
import com.tencent.mm.plugin.fts.jni.FTSJNIUtils;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class c extends b
  implements h.a
{
  com.tencent.mm.plugin.fts.a.m eAX;
  com.tencent.mm.plugin.fts.c.c mGp;
  boolean mGq;
  private com.tencent.mm.sdk.b.c mGr;
  private com.tencent.mm.sdk.b.c mGs;
  private com.tencent.mm.sdk.b.c mGt;
  com.tencent.mm.sdk.b.c mGu;
  ap mGv;
  g.a mGw;
  com.tencent.mm.plugin.fts.a.j mgD;

  public c()
  {
    AppMethodBeat.i(136761);
    this.mGq = false;
    this.mGr = new c.1(this);
    this.mGs = new c.2(this);
    this.mGt = new com.tencent.mm.sdk.b.c()
    {
    };
    this.mGu = new c.4(this);
    this.mGv = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new c.5(this), false);
    this.mGw = new c.6(this);
    AppMethodBeat.o(136761);
  }

  public static List<String> Nm(String paramString)
  {
    AppMethodBeat.i(136766);
    String str1 = paramString;
    if (paramString.length() > 16)
      str1 = paramString.substring(0, 16);
    ArrayList localArrayList = new ArrayList();
    String str2 = FTSJNIUtils.icuTokenizer(str1);
    String[] arrayOfString = str2.split(" ");
    paramString = new StringBuffer();
    int i = 0;
    while (true)
      if (i < arrayOfString.length)
      {
        Object localObject1 = paramString;
        try
        {
          int j = Integer.valueOf(arrayOfString[i]).intValue();
          localObject1 = paramString;
          int k = Integer.valueOf(arrayOfString[(i + 1)]).intValue();
          localObject1 = paramString;
          int m = Integer.valueOf(arrayOfString[(i + 2)]).intValue();
          localObject1 = paramString;
          str3 = str1.substring(j, k);
          if ((m >= 400) && (m < 500))
          {
            if (k - j == 1)
            {
              localObject1 = paramString;
              paramString.append(str3);
            }
            while (true)
            {
              i += 3;
              break;
              localObject2 = paramString;
              localObject1 = paramString;
              if (paramString.length() > 0)
              {
                localObject1 = paramString;
                localArrayList.add(paramString.toString());
                localObject1 = paramString;
                localObject2 = new java/lang/StringBuffer;
                localObject1 = paramString;
                ((StringBuffer)localObject2).<init>();
              }
              localObject1 = localObject2;
              localArrayList.add(str3);
              paramString = (String)localObject2;
            }
          }
        }
        catch (Exception paramString)
        {
          while (true)
          {
            String str3;
            paramString = (String)localObject1;
            continue;
            localObject1 = paramString;
            Object localObject2 = paramString;
            if (paramString.length() > 0)
            {
              localObject1 = paramString;
              localArrayList.add(paramString.toString());
              localObject1 = paramString;
              localObject2 = new java/lang/StringBuffer;
              localObject1 = paramString;
              ((StringBuffer)localObject2).<init>();
            }
            paramString = (String)localObject2;
            localObject1 = localObject2;
            if (!str3.equals("*"))
            {
              paramString = (String)localObject2;
              localObject1 = localObject2;
              if (!str3.equals(" "))
              {
                localObject1 = localObject2;
                localArrayList.add(str3);
                paramString = (String)localObject2;
              }
            }
          }
        }
      }
    if (paramString.length() > 0)
      localArrayList.add(paramString.toString());
    ab.i("MicroMsg.FTS.FTS5SearchMessageLogic", "mmICUTokenize Query-tokenList: %s indexes: %s", new Object[] { localArrayList, str2 });
    AppMethodBeat.o(136766);
    return localArrayList;
  }

  public final boolean Pq()
  {
    AppMethodBeat.i(136764);
    ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(this);
    this.mGu.dead();
    this.mGt.dead();
    this.mGs.dead();
    this.mGr.dead();
    this.mGp = null;
    this.eAX = null;
    AppMethodBeat.o(136764);
    return true;
  }

  public final com.tencent.mm.plugin.fts.a.a.a a(i parami)
  {
    AppMethodBeat.i(136762);
    switch (parami.hbo)
    {
    default:
      parami = new i(parami);
    case 3:
    case 1:
    case 10:
    case 11:
    }
    while (true)
    {
      parami = this.eAX.a(-65536, parami);
      AppMethodBeat.o(136762);
      return parami;
      parami = new c.f(this, parami);
      continue;
      ab.i("MicroMsg.FTS.FTS5SearchMessageLogic", "total message count %d", new Object[] { Long.valueOf(e.mCL.mCQ) });
      if (e.mCL.mCQ >= 1000000L)
      {
        parami = new c.g(this, parami);
      }
      else
      {
        parami = new i(parami);
        continue;
        parami = new h(parami);
        continue;
        parami = new c.e(this, parami);
      }
    }
  }

  public final void a(com.tencent.mm.plugin.messenger.foundation.a.a.h paramh, h.c paramc)
  {
    AppMethodBeat.i(136765);
    if (paramc.oqJ.equals("insert"))
    {
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      if (i < paramc.oqK.size())
      {
        paramh = (bi)paramc.oqK.get(i);
        int j;
        if ((paramh == null) || (bo.isNullOrNil(paramh.field_talker)) || (bo.isNullOrNil(paramh.field_content)))
          j = 0;
        while (true)
        {
          if (j != 0)
            localArrayList.add(paramh);
          i++;
          break;
          if (paramh.field_talker.endsWith("@app"))
            j = 0;
          else if (paramh.field_talker.contains("@bottle"))
            j = 0;
          else if ((paramh.getType() != 1) && (!paramh.bAA()) && (!paramh.bAC()))
            j = 0;
          else
            j = 1;
        }
      }
      if (localArrayList.size() > 0)
        this.eAX.a(65576, new c.c(this, localArrayList));
    }
    AppMethodBeat.o(136765);
  }

  public final String getName()
  {
    return "FTS5SearchMessageLogic";
  }

  public final boolean onCreate()
  {
    AppMethodBeat.i(136763);
    boolean bool;
    if (!((n)com.tencent.mm.kernel.g.M(n.class)).isFTSContextReady())
    {
      ab.i("MicroMsg.FTS.FTS5SearchMessageLogic", "Create Fail!");
      bool = false;
      AppMethodBeat.o(136763);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.FTS.FTS5SearchMessageLogic", "Create Success!");
      this.mGp = ((com.tencent.mm.plugin.fts.c.c)((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexStorage(4));
      this.eAX = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSTaskDaemon();
      this.mgD = ((n)com.tencent.mm.kernel.g.M(n.class)).getFTSMainDB();
      this.mGu.dnU();
      this.mGt.dnU();
      this.mGs.dnU();
      this.mGr.dnU();
      ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(this, null);
      bool = true;
      AppMethodBeat.o(136763);
    }
  }

  final class h extends com.tencent.mm.plugin.fts.a.a.h
  {
    public h(i arg2)
    {
      super();
    }

    public final void a(com.tencent.mm.plugin.fts.a.a.j paramj)
    {
      AppMethodBeat.i(136758);
      Ng("start");
      paramj.mDz = com.tencent.mm.plugin.fts.a.a.g.a(this.mEl.query, false, c.this.mGw);
      Object localObject1 = com.tencent.mm.plugin.fts.a.a.g.aO(this.mEl.mEq, true);
      Object localObject2 = new HashMap();
      Object localObject3 = ((com.tencent.mm.plugin.fts.c.a)((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexStorage(3)).a((com.tencent.mm.plugin.fts.a.a.g)localObject1, null, com.tencent.mm.plugin.fts.a.c.mCl, com.tencent.mm.plugin.fts.a.c.mCp);
      do
      {
        if (!((Cursor)localObject3).moveToNext())
          break;
        localObject4 = new com.tencent.mm.plugin.fts.a.a.m();
        ((com.tencent.mm.plugin.fts.a.a.m)localObject4).mDx = ((Cursor)localObject3).getString(0);
        ((com.tencent.mm.plugin.fts.a.a.m)localObject4).type = ((Cursor)localObject3).getInt(1);
        ((com.tencent.mm.plugin.fts.a.a.m)localObject4).mDw = ((Cursor)localObject3).getInt(2);
        ((com.tencent.mm.plugin.fts.a.a.m)localObject4).mDz = ((com.tencent.mm.plugin.fts.a.a.g)localObject1);
        if (!((HashMap)localObject2).containsKey(((com.tencent.mm.plugin.fts.a.a.m)localObject4).mDx))
          ((HashMap)localObject2).put(((com.tencent.mm.plugin.fts.a.a.m)localObject4).mDx, localObject4);
      }
      while (((HashMap)localObject2).size() <= 100);
      ((Cursor)localObject3).close();
      Ng("findHitContact");
      Cursor localCursor = c.this.mGp.a(paramj.mDz, null, ((HashMap)localObject2).keySet());
      Object localObject4 = new HashMap();
      if (localCursor.moveToNext())
      {
        localObject1 = new com.tencent.mm.plugin.fts.a.a.m().i(localCursor);
        ((com.tencent.mm.plugin.fts.a.a.m)localObject1).mDz = paramj.mDz;
        ((com.tencent.mm.plugin.fts.a.a.m)localObject1).userData = Integer.valueOf(1);
        label288: l locall;
        int i;
        if (((HashMap)localObject4).containsKey(((com.tencent.mm.plugin.fts.a.a.m)localObject1).talker))
        {
          localObject3 = (HashMap)((HashMap)localObject4).get(((com.tencent.mm.plugin.fts.a.a.m)localObject1).talker);
          if (!((HashMap)localObject3).containsKey(((com.tencent.mm.plugin.fts.a.a.m)localObject1).mDx))
            break label415;
          locall = (l)((HashMap)localObject3).get(((com.tencent.mm.plugin.fts.a.a.m)localObject1).mDx);
          i = ((Integer)locall.userData).intValue() + 1;
          if (locall.timestamp >= ((com.tencent.mm.plugin.fts.a.a.m)localObject1).timestamp)
            break label389;
          ((com.tencent.mm.plugin.fts.a.a.m)localObject1).userData = Integer.valueOf(i);
          ((HashMap)localObject3).put(((com.tencent.mm.plugin.fts.a.a.m)localObject1).mDx, localObject1);
        }
        while (true)
        {
          ((HashMap)localObject4).put(((com.tencent.mm.plugin.fts.a.a.m)localObject1).talker, localObject3);
          break;
          localObject3 = new HashMap();
          break label288;
          label389: locall.userData = Integer.valueOf(i);
          ((HashMap)localObject3).put(locall.mDx, locall);
          continue;
          label415: ((HashMap)localObject3).put(((com.tencent.mm.plugin.fts.a.a.m)localObject1).mDx, localObject1);
        }
      }
      localCursor.close();
      paramj.mEy = new ArrayList();
      localObject1 = ((HashMap)localObject2).values().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (l)((Iterator)localObject1).next();
        if (((HashMap)localObject4).containsKey(((l)localObject3).mDx))
        {
          localObject2 = new ArrayList();
          ((List)localObject2).addAll(((HashMap)((HashMap)localObject4).get(((l)localObject3).mDx)).values());
          Collections.sort((List)localObject2, this.mEl.mEv);
          ((l)localObject3).userData = localObject2;
          ((l)localObject3).timestamp = ((l)((List)localObject2).get(0)).timestamp;
          paramj.mEy.add(localObject3);
        }
      }
      Collections.sort(paramj.mEy, this.mEl.mEv);
      Ng("findHitMessage");
      AppMethodBeat.o(136758);
    }

    public final int getId()
    {
      return 28;
    }

    public final String getName()
    {
      return "SearchTalkerMessageTask";
    }
  }

  final class i extends com.tencent.mm.plugin.fts.a.a.h
  {
    private int mGJ = 0;
    private int mGK = 0;

    public i(i arg2)
    {
      super();
    }

    public final void a(com.tencent.mm.plugin.fts.a.a.j paramj)
    {
      AppMethodBeat.i(136759);
      Ng("start");
      paramj.mDz = com.tencent.mm.plugin.fts.a.a.g.a(this.mEl.query, false, c.this.mGw);
      Object localObject1 = c.this.mGp;
      Object localObject2 = paramj.mDz;
      int i = this.mEl.mEt;
      String str = ((com.tencent.mm.plugin.fts.a.a.g)localObject2).bAl();
      if (i != 2147483647);
      for (localObject2 = " LIMIT " + (i + 1); ; localObject2 = "")
      {
        localObject2 = String.format("SELECT type, subtype, entity_id, aux_index, MAX(timestamp) as maxTime, count(aux_index) as msgCount FROM %s NOT INDEXED JOIN %s ON (%s.docid = %s.rowid) WHERE %s MATCH '%s' AND status >= 0 GROUP BY aux_index ORDER BY timestamp desc" + (String)localObject2 + ";", new Object[] { ((com.tencent.mm.plugin.fts.c.c)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAf(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAg(), ((com.tencent.mm.plugin.fts.c.c)localObject1).bAg(), str });
        localObject2 = ((com.tencent.mm.plugin.fts.a.a)localObject1).mBT.rawQuery((String)localObject2, null);
        paramj.mEy = new LinkedList();
        while (((Cursor)localObject2).moveToNext())
        {
          localObject1 = new l();
          ((l)localObject1).type = ((Cursor)localObject2).getInt(0);
          ((l)localObject1).mDw = ((Cursor)localObject2).getInt(1);
          ((l)localObject1).mEB = ((Cursor)localObject2).getLong(2);
          ((l)localObject1).mDx = ((Cursor)localObject2).getString(3);
          ((l)localObject1).timestamp = ((Cursor)localObject2).getLong(4);
          ((l)localObject1).userData = Integer.valueOf(((Cursor)localObject2).getInt(5));
          paramj.mEy.add(localObject1);
          i = this.mGJ;
          this.mGJ = (((Integer)((l)localObject1).userData).intValue() + i);
          this.mGK += 1;
        }
      }
      ((Cursor)localObject2).close();
      Ng("groupMessage");
      if (paramj.mDz.mEb.length > 1)
      {
        localObject2 = com.tencent.mm.plugin.fts.a.a.g.aO(paramj.mDz.mEb[0], true);
        localObject1 = ((com.tencent.mm.plugin.fts.c.a)((n)com.tencent.mm.kernel.g.M(n.class)).getFTSIndexStorage(3)).a((com.tencent.mm.plugin.fts.a.a.g)localObject2, null, com.tencent.mm.plugin.fts.a.c.mCl, com.tencent.mm.plugin.fts.a.c.mCp);
        if (((Cursor)localObject1).moveToNext())
        {
          localObject2 = new l();
          ((l)localObject2).mDx = "create_talker_message​";
          paramj.mEy.add(0, localObject2);
        }
        ((Cursor)localObject1).close();
        Ng("findTalkerConversation");
      }
      AppMethodBeat.o(136759);
    }

    public final String aAo()
    {
      AppMethodBeat.i(136760);
      String str = String.format("{totalMsgCount: %d conversationCount: %d}", new Object[] { Integer.valueOf(this.mGJ), Integer.valueOf(this.mGK) });
      AppMethodBeat.o(136760);
      return str;
    }

    public final int getId()
    {
      return 15;
    }

    public final String getName()
    {
      return "SearchTopGroupMessageTask";
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.b.c
 * JD-Core Version:    0.6.2
 */