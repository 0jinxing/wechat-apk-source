package com.tencent.mm.plugin.record.b;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.d;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.t.a;
import com.tencent.mm.modelvideo.t.a.a;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

final class q$b
  implements com.tencent.mm.ai.f, t.a, Runnable
{
  private boolean cco;
  private int i;
  HashMap<Long, Boolean> pJP;
  HashMap<Long, String> pJU;
  private com.tencent.mm.plugin.record.a.j pJu;

  public q$b(q paramq, com.tencent.mm.plugin.record.a.j paramj)
  {
    AppMethodBeat.i(135727);
    this.i = 0;
    this.pJP = new HashMap();
    this.pJU = new HashMap();
    this.cco = false;
    this.pJu = paramj;
    com.tencent.mm.modelvideo.o.all().a(this, Looper.getMainLooper());
    com.tencent.mm.kernel.g.RO().eJo.a(221, this);
    AppMethodBeat.o(135727);
  }

  private void a(HashMap<Long, Boolean> paramHashMap, boolean paramBoolean, com.tencent.mm.plugin.record.a.j paramj)
  {
    AppMethodBeat.i(135732);
    if ((n(paramHashMap)) && (paramBoolean))
    {
      com.tencent.mm.modelvideo.o.all().a(this);
      paramj.field_type = 2;
      ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgStorage().c(paramj, new String[] { "localId" });
      ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgService().a(paramj);
    }
    AppMethodBeat.o(135732);
  }

  private void af(bi parambi)
  {
    AppMethodBeat.i(135731);
    Object localObject = j.b.me(parambi.field_content);
    if (localObject == null)
    {
      ab.e("MicroMsg.RecordMsgSendService", "parse msgContent error, %s", new Object[] { parambi.field_content });
      AppMethodBeat.o(135731);
    }
    while (true)
    {
      return;
      if ((bo.isNullOrNil(((j.b)localObject).csD)) && (!bo.isNullOrNil(((j.b)localObject).fgD)))
      {
        ab.e("MicroMsg.RecordMsgSendService", "msgContent format error, %s", new Object[] { parambi.field_content });
        ((j.b)localObject).csD = ((j.b)localObject).fgD.hashCode();
      }
      localObject = ((j.b)localObject).csD;
      if (!a.a(parambi, a.i((String)localObject, parambi.field_msgId)))
      {
        this.pJP.put(Long.valueOf(parambi.field_msgId), Boolean.FALSE);
        this.pJU.put(Long.valueOf(parambi.field_msgId), localObject);
        a.af(parambi);
      }
      AppMethodBeat.o(135731);
    }
  }

  private static boolean n(HashMap<Long, Boolean> paramHashMap)
  {
    AppMethodBeat.i(135733);
    boolean bool;
    if (paramHashMap == null)
    {
      AppMethodBeat.o(135733);
      bool = true;
    }
    while (true)
    {
      return bool;
      paramHashMap = paramHashMap.entrySet().iterator();
      while (true)
        if (paramHashMap.hasNext())
          if (!((Boolean)((Map.Entry)paramHashMap.next()).getValue()).booleanValue())
          {
            bool = false;
            AppMethodBeat.o(135733);
            break;
          }
      AppMethodBeat.o(135733);
      bool = true;
    }
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(135729);
    parama = u.ut(parama.fileName);
    if (parama != null)
    {
      bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(parama.fXe);
      if (parama.alz())
      {
        this.pJP.put(Long.valueOf(localbi.field_msgId), Boolean.TRUE);
        a(this.pJP, this.cco, this.pJu);
      }
      AppMethodBeat.o(135729);
    }
    while (true)
    {
      return;
      a(null, this.cco, this.pJu);
      AppMethodBeat.o(135729);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(135730);
    if ((paramm instanceof e))
    {
      com.tencent.mm.kernel.g.RO().eJo.b(221, this);
      if (this.pJU != null)
        paramm = this.pJU.entrySet().iterator();
    }
    label296: 
    while (true)
    {
      long l;
      com.tencent.mm.pluginsdk.model.app.b localb;
      if (paramm.hasNext())
      {
        paramString = (Map.Entry)paramm.next();
        l = ((Long)paramString.getKey()).longValue();
        paramString = (String)paramString.getValue();
        if ((l > 0L) && (!((Boolean)this.pJP.get(Long.valueOf(l))).booleanValue()))
        {
          ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(l);
          localb = a.i(paramString, l);
          if (localb == null);
        }
      }
      else
      {
        for (paramString = localb.field_fileFullPath; ; paramString = null)
        {
          if ((paramString == null) || (paramString.length() <= 0))
            break label296;
          this.pJP.put(Long.valueOf(l), Boolean.TRUE);
          Iterator localIterator = this.pJu.field_dataProto.wiv.iterator();
          while (localIterator.hasNext())
          {
            paramString = (aar)localIterator.next();
            if (paramString.whf == l)
              paramString.akV(localb.field_fileFullPath);
          }
          break;
          a(this.pJP, this.cco, this.pJu);
          AppMethodBeat.o(135730);
          while (true)
          {
            return;
            a(null, this.cco, this.pJu);
            AppMethodBeat.o(135730);
          }
        }
      }
    }
  }

  public final void run()
  {
    AppMethodBeat.i(135728);
    this.i = 0;
    this.cco = false;
    ab.i("MicroMsg.RecordMsgSendService", "dojob ChatDataDownloadRunnable, info id:%s", new Object[] { Long.valueOf(this.pJu.field_msgId) });
    Iterator localIterator = this.pJu.field_dataProto.wiv.iterator();
    while (localIterator.hasNext())
    {
      Object localObject1 = (aar)localIterator.next();
      long l = ((aar)localObject1).whf;
      label387: if (l > 0L)
      {
        bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(l);
        Object localObject2 = ((aar)localObject1).wgx;
        if ((System.currentTimeMillis() - localbi.field_createTime > 259200000L) && ((bo.isNullOrNil((String)localObject2)) || (!com.tencent.mm.vfs.e.ct((String)localObject2))));
        for (int j = 1; ; j = 0)
        {
          if (j == 0)
            break label185;
          ab.i("MicroMsg.RecordMsgSendService", "dataItem is expired!! msgType:%s", new Object[] { Integer.valueOf(localbi.getType()) });
          break;
        }
        label185: if (((aar)localObject1).dataType == 2)
        {
          if (localbi.drE())
          {
            com.tencent.mm.at.e locale = com.tencent.mm.at.o.ahl().fI(localbi.field_msgSvrId);
            if (localbi.field_isSend == 1)
              if (locale.agQ())
                j = 1;
            while (true)
            {
              if ((locale.offset >= locale.frO) && (locale.frO != 0))
                break label387;
              this.pJP.put(Long.valueOf(l), Boolean.FALSE);
              this.i = this.pJu.field_dataProto.wiv.indexOf(localObject1);
              com.tencent.mm.at.o.ahm().a(locale.fDy, localbi.field_msgId, j, localObject1, 2130838182, new q.b.1(this, locale, localbi, l));
              break;
              j = 0;
              continue;
              if (!locale.agQ())
              {
                j = 0;
              }
              else
              {
                localObject2 = com.tencent.mm.at.f.a(locale);
                if (!com.tencent.mm.vfs.e.ct(com.tencent.mm.at.o.ahl().q(((com.tencent.mm.at.e)localObject2).fDz, "", "")))
                  j = 0;
                else
                  j = 1;
              }
            }
          }
          else if (localbi.dtA())
          {
            af(localbi);
          }
        }
        else if ((((aar)localObject1).dataType == 4) || (((aar)localObject1).dataType == 15))
        {
          localObject1 = u.ut(localbi.field_imgPath);
          if ((localObject1 != null) && (((s)localObject1).status != 199))
          {
            this.pJP.put(Long.valueOf(l), Boolean.FALSE);
            if (((s)localObject1).aly())
            {
              ab.i("MicroMsg.RecordMsgSendService", "start complete online video");
              u.uA(localbi.field_imgPath);
            }
            else
            {
              ab.i("MicroMsg.RecordMsgSendService", "start complete offline video");
              u.up(localbi.field_imgPath);
            }
          }
        }
        else if ((((aar)localObject1).dataType == 8) && (!bo.isNullOrNil(((aar)localObject1).whr)))
        {
          af(localbi);
        }
      }
    }
    this.cco = true;
    this.pJT.pJx = false;
    a(this.pJP, this.cco, this.pJu);
    AppMethodBeat.o(135728);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.q.b
 * JD-Core Version:    0.6.2
 */