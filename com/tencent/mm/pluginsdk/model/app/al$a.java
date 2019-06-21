package com.tencent.mm.pluginsdk.model.app;

import android.database.Cursor;
import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class al$a
  implements f
{
  private static int cqX = 0;
  Queue<Long> cqQ;
  Queue<Long> cqR;
  Map<Long, g.a> cqS;
  private boolean cqT;
  private boolean cqU;
  int cqV;
  private long cqW;
  g.a cqZ;
  private ap cra;
  private boolean running;
  private HashMap<Long, String> vcK;

  public al$a()
  {
    AppMethodBeat.i(27401);
    this.vcK = new HashMap();
    this.cqQ = new LinkedList();
    this.cqR = new LinkedList();
    this.cqS = new HashMap();
    this.cqT = false;
    this.cqU = false;
    this.running = false;
    this.cqV = 0;
    this.cqW = 0L;
    this.cqZ = new g.a();
    this.cra = new ap(aw.RS().oAl.getLooper(), new al.a.4(this), false);
    aw.Rg().a(220, this);
    aw.Rg().a(221, this);
    aw.Rg().a(222, this);
    AppMethodBeat.o(27401);
  }

  public static void A(long paramLong, String paramString)
  {
    AppMethodBeat.i(27405);
    aw.Rg().a(new af(paramLong, paramString, null), 0);
    AppMethodBeat.o(27405);
  }

  private void Fb()
  {
    AppMethodBeat.i(27409);
    this.cqS.clear();
    this.cqQ.clear();
    this.cqR.clear();
    this.cqU = false;
    this.cqT = false;
    this.running = false;
    ab.d("MicroMsg.SceneAppMsg", "Finish service use time(ms):" + this.cqZ.Mr());
    AppMethodBeat.o(27409);
  }

  public static void b(long paramLong, String paramString1, String paramString2)
  {
    AppMethodBeat.i(27406);
    aw.Rg().a(new af(paramLong, paramString1, paramString2), 0);
    AppMethodBeat.o(27406);
  }

  private boolean dhK()
  {
    AppMethodBeat.i(27407);
    try
    {
      localObject1 = am.aUq().rawQuery("select *  , rowid  from appattach where status = 101", new String[0]);
      ArrayList localArrayList;
      if (localObject1 == null)
        localArrayList = null;
      while ((localArrayList == null) || (localArrayList.size() == 0))
      {
        bool = false;
        AppMethodBeat.o(27407);
        return bool;
        int i = ((Cursor)localObject1).getCount();
        ab.d("MicroMsg.AppAttachInfoStorage", "getUnfinishInfo resCount:".concat(String.valueOf(i)));
        if (i == 0)
        {
          ((Cursor)localObject1).close();
          localArrayList = null;
        }
        else
        {
          localArrayList = new java/util/ArrayList;
          localArrayList.<init>();
          for (int j = 0; j < i; j++)
          {
            ((Cursor)localObject1).moveToPosition(j);
            localObject3 = new com/tencent/mm/pluginsdk/model/app/b;
            ((b)localObject3).<init>();
            ((b)localObject3).d((Cursor)localObject1);
            localArrayList.add(localObject3);
          }
          ((Cursor)localObject1).close();
        }
      }
    }
    catch (IllegalStateException localIllegalStateException)
    {
      while (true)
      {
        boolean bool;
        ab.printErrStackTrace("MicroMsg.SceneAppMsg", localIllegalStateException, "", new Object[0]);
        Object localObject2 = am.aUq();
        Object localObject1 = " update appattach set status = 198 , lastModifyTime = " + bo.anT() + " where status = 101";
        ((c)localObject2).bSd.hY("appattach", (String)localObject1);
        ((c)localObject2).doNotify();
        localObject2 = null;
        continue;
        long l = System.currentTimeMillis() / 1000L;
        localObject1 = bo.mx(l);
        Object localObject3 = ((List)localObject2).iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject2 = (b)((Iterator)localObject3).next();
          if (this.cqS.containsKey(Long.valueOf(((b)localObject2).xDa)))
          {
            ab.d("MicroMsg.SceneAppMsg", "summerbig File is Already running:" + ((b)localObject2).xDa);
          }
          else
          {
            ab.d("MicroMsg.SceneAppMsg", "summerbig Get file:" + ((b)localObject2).field_fileFullPath + " status:" + ((b)localObject2).field_status + " create:(" + bo.mx(((b)localObject2).field_createTime) + "," + bo.mx(((b)localObject2).field_createTime / 1000L) + ", last:" + bo.mx(((b)localObject2).field_lastModifyTime) + " now:" + bo.mx(l) + " " + (l - ((b)localObject2).field_lastModifyTime));
            if (((b)localObject2).field_isUpload)
              if ((l - ((b)localObject2).field_lastModifyTime > 600L) && (((b)localObject2).field_status == 101L))
              {
                ab.e("MicroMsg.SceneAppMsg", "summerbig time out file: " + ((b)localObject2).field_fileFullPath + " last:" + bo.mx(((b)localObject2).field_lastModifyTime) + " now:" + (String)localObject1);
                l.jC(((b)localObject2).xDa);
              }
              else
              {
                this.cqQ.offer(Long.valueOf(((b)localObject2).xDa));
                this.cqS.put(Long.valueOf(((b)localObject2).xDa), null);
              }
          }
        }
        ab.d("MicroMsg.SceneAppMsg", "summerbig GetNeedRun procing:" + this.cqS.size() + " [recv:" + this.cqR.size() + ",send:" + this.cqQ.size() + "]");
        if (this.cqR.size() + this.cqQ.size() == 0)
        {
          bool = false;
          AppMethodBeat.o(27407);
        }
        else
        {
          bool = true;
          AppMethodBeat.o(27407);
        }
      }
    }
  }

  public static void jB(long paramLong)
  {
    AppMethodBeat.i(27404);
    aw.Rg().a(new af(paramLong, null, null), 0);
    AppMethodBeat.o(27404);
  }

  protected final void finalize()
  {
    AppMethodBeat.i(27402);
    aw.Rg().b(220, this);
    aw.Rg().b(221, this);
    aw.Rg().b(222, this);
    this.vcK.clear();
    super.finalize();
    AppMethodBeat.o(27402);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(27408);
    ab.d("MicroMsg.SceneAppMsg", "summersafecdn onSceneEnd type:%d errType:%d errCode:%d", new Object[] { Integer.valueOf(paramm.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    aw.RS().aa(new al.a.2(this, paramm, paramInt1, paramInt2));
    AppMethodBeat.o(27408);
  }

  public final void run()
  {
    AppMethodBeat.i(27410);
    aw.RS().aa(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(27397);
        long l = System.currentTimeMillis() - al.a.k(al.a.this);
        ab.d("MicroMsg.SceneAppMsg", "summerbig Try Run service runningFlag:" + al.a.f(al.a.this) + " timeWait:" + l + " sending:" + al.a.h(al.a.this) + " recving:" + al.a.g(al.a.this));
        if (al.a.f(al.a.this))
          if (l < 180000L)
            AppMethodBeat.o(27397);
        while (true)
        {
          return;
          ab.e("MicroMsg.SceneAppMsg", "summerbig ERR: Try Run service runningFlag:" + al.a.f(al.a.this) + " timeWait:" + l + ">=MAX_TIME_WAIT sending:" + al.a.h(al.a.this) + " recving:" + al.a.g(al.a.this));
          al.a.l(al.a.this);
          al.a.b(al.a.this);
          al.a.m(al.a.this);
          al.a.a(al.a.this);
          al.a.this.cqZ.evE = SystemClock.elapsedRealtime();
          al.a.n(al.a.this).ae(10L, 10L);
          AppMethodBeat.o(27397);
        }
      }

      public final String toString()
      {
        AppMethodBeat.i(27398);
        String str = super.toString() + "|run";
        AppMethodBeat.o(27398);
        return str;
      }
    });
    AppMethodBeat.o(27410);
  }

  public final void z(long paramLong, String paramString)
  {
    AppMethodBeat.i(27403);
    this.vcK.put(Long.valueOf(paramLong), paramString);
    AppMethodBeat.o(27403);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.al.a
 * JD-Core Version:    0.6.2
 */