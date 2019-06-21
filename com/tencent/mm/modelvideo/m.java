package com.tencent.mm.modelvideo;

import android.os.HandlerThread;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.b;
import com.tencent.mm.al.c;
import com.tencent.mm.al.f;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.i.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class m
{
  private static int cqX = 0;
  private boolean cqU;
  int cqV;
  private g.a cqZ;
  private ap cra;
  private LinkedList<Long> fWe;
  private Map<Long, g.a> fWf;
  private Map<Long, String> fWg;
  private Object fWh;
  String fWi;
  private boolean running;

  public m()
  {
    AppMethodBeat.i(50744);
    this.fWe = new LinkedList();
    this.fWf = new HashMap();
    this.fWg = new HashMap();
    this.fWh = new Object();
    this.cqU = false;
    this.running = false;
    this.cqV = 0;
    this.cqZ = new g.a();
    this.cra = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(50739);
        m.h(m.this);
        AppMethodBeat.o(50739);
        return false;
      }

      public final String toString()
      {
        AppMethodBeat.i(50740);
        String str = super.toString() + "|scenePusher";
        AppMethodBeat.o(50740);
        return str;
      }
    }
    , false);
    AppMethodBeat.o(50744);
  }

  private void Fb()
  {
    AppMethodBeat.i(50749);
    this.fWg.clear();
    this.fWf.clear();
    this.fWe.clear();
    this.cqU = false;
    this.running = false;
    ab.d("MicroMsg.SightMassSendService", "Finish service use time(ms):" + this.cqZ.Mr());
    AppMethodBeat.o(50749);
  }

  public static void ak(List<s> paramList)
  {
    AppMethodBeat.i(50745);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(50745);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        u.um(((s)paramList.next()).getFileName());
      AppMethodBeat.o(50745);
    }
  }

  public static void al(List<s> paramList)
  {
    AppMethodBeat.i(50746);
    if ((paramList == null) || (paramList.isEmpty()))
      AppMethodBeat.o(50746);
    while (true)
    {
      return;
      paramList = paramList.iterator();
      while (paramList.hasNext())
        u.un(((s)paramList.next()).getFileName());
      AppMethodBeat.o(50746);
    }
  }

  private String fT(long paramLong)
  {
    AppMethodBeat.i(50747);
    Object localObject1 = o.all().fU(paramLong);
    Object localObject2;
    if (((List)localObject1).isEmpty())
    {
      ab.e("MicroMsg.SightMassSendService", "check use cdn fail: mass send video list empty");
      localObject2 = null;
      AppMethodBeat.o(50747);
    }
    while (true)
    {
      return localObject2;
      Object localObject3 = ((List)localObject1).iterator();
      while (true)
        if (((Iterator)localObject3).hasNext())
        {
          localObject2 = (s)((Iterator)localObject3).next();
          if (com.tencent.mm.model.t.nJ(((s)localObject2).getUser()))
          {
            ab.w("MicroMsg.SightMassSendService", "cdntra not use cdn user:%s, list %s, massSendId %d", new Object[] { ((s)localObject2).getUser(), ((s)localObject2).fXl, Long.valueOf(paramLong) });
            localObject2 = null;
            AppMethodBeat.o(50747);
            break;
          }
          f.afx();
          if ((!b.lg(2)) && (((s)localObject2).fXi != 1))
          {
            f.afx();
            ab.w("MicroMsg.SightMassSendService", "cdntra not use cdn flag:%b getCdnInfo:%d, list %s, massSendId %d", new Object[] { Boolean.valueOf(b.lg(2)), Integer.valueOf(((s)localObject2).fXi), ((s)localObject2).fXl, Long.valueOf(paramLong) });
            localObject2 = null;
            AppMethodBeat.o(50747);
            break;
          }
        }
      if ((localObject1 == null) || (((List)localObject1).isEmpty()))
        localObject2 = null;
      while (true)
      {
        if (localObject2 != null)
          break label434;
        ab.w("MicroMsg.SightMassSendService", "check use cdn fail: no valid info");
        localObject2 = null;
        AppMethodBeat.o(50747);
        break;
        for (int i = 0; ; i++)
        {
          if (i >= ((List)localObject1).size())
            break label428;
          localObject3 = (s)((List)localObject1).get(i);
          localObject2 = u.ut(((s)localObject3).getFileName());
          if (localObject2 != null)
          {
            ab.i("MicroMsg.SightMassSendService", "check %s ok, index %d, size %d, massSendId %d, massSendList %s", new Object[] { ((s)localObject3).getFileName(), Integer.valueOf(i), Integer.valueOf(((List)localObject1).size()), Long.valueOf(paramLong), ((s)localObject3).fXl });
            ((List)localObject1).remove(i);
            ((List)localObject1).add(i, localObject2);
            break;
          }
          ab.w("MicroMsg.SightMassSendService", "check %s fail, index %d, size %d, massSendId %d, massSendList %s", new Object[] { ((s)localObject3).getFileName(), Integer.valueOf(i), Integer.valueOf(((List)localObject1).size()), Long.valueOf(paramLong), ((s)localObject3).fXl });
        }
        label428: localObject2 = null;
      }
      label434: localObject3 = c.a("upvideo", ((s)localObject2).createTime, ((s)localObject2).fXl, ((s)localObject2).getFileName());
      if (bo.isNullOrNil((String)localObject3))
      {
        ab.w("MicroMsg.SightMassSendService", "cdntra genClientId failed not use cdn file:%s, massSendId %d, massSendList %s", new Object[] { ((s)localObject2).getFileName(), Long.valueOf(((s)localObject2).fVs), ((s)localObject2).fXl });
        localObject2 = null;
        AppMethodBeat.o(50747);
      }
      else
      {
        Object localObject4 = ((s)localObject2).getFileName();
        o.all();
        String str1 = t.ui((String)localObject4);
        o.all();
        String str2 = t.uh((String)localObject4);
        m.a locala = new m.a(this, (byte)0);
        locala.foD = ((List)localObject1);
        locala.fVs = paramLong;
        locala.fWl = ((String)localObject3);
        locala.startTime = bo.anU();
        locala.fVt = ((s)localObject2);
        localObject4 = new com.tencent.mm.i.g();
        ((com.tencent.mm.i.g)localObject4).egl = locala;
        ((com.tencent.mm.i.g)localObject4).field_mediaId = ((String)localObject3);
        ((com.tencent.mm.i.g)localObject4).field_fullpath = str2;
        ((com.tencent.mm.i.g)localObject4).field_thumbpath = str1;
        ((com.tencent.mm.i.g)localObject4).field_fileType = a.MediaType_VIDEO;
        ((com.tencent.mm.i.g)localObject4).field_smallVideoFlag = 1;
        ((com.tencent.mm.i.g)localObject4).field_talker = ((s)localObject2).fXl;
        ((com.tencent.mm.i.g)localObject4).field_priority = a.efC;
        ((com.tencent.mm.i.g)localObject4).field_needStorage = false;
        ((com.tencent.mm.i.g)localObject4).field_isStreamMedia = false;
        localObject2 = br.z(((s)localObject2).alw(), "msg");
        if (localObject2 != null)
        {
          ((com.tencent.mm.i.g)localObject4).field_fileId = ((String)((Map)localObject2).get(".msg.videomsg.$cdnvideourl"));
          ((com.tencent.mm.i.g)localObject4).field_aesKey = ((String)((Map)localObject2).get(".msg.videomsg.$aeskey"));
        }
        while (true)
        {
          if (f.afx().e((com.tencent.mm.i.g)localObject4))
            break label765;
          ab.e("MicroMsg.SightMassSendService", "cdntra addSendTask failed.");
          localObject2 = null;
          AppMethodBeat.o(50747);
          break;
          ab.i("MicroMsg.SightMassSendService", "cdntra parse video recv xml failed");
        }
        label765: localObject1 = ((List)localObject1).iterator();
        while (((Iterator)localObject1).hasNext())
        {
          localObject2 = (s)((Iterator)localObject1).next();
          if (((s)localObject2).fXi != 1)
          {
            ((s)localObject2).fXi = 1;
            ((s)localObject2).bJt = 524288;
            boolean bool = u.f((s)localObject2);
            ab.i("MicroMsg.SightMassSendService", "update %s useCDN, result %B", new Object[] { ((s)localObject2).getFileName(), Boolean.valueOf(bool) });
          }
        }
        AppMethodBeat.o(50747);
        localObject2 = localObject3;
      }
    }
  }

  public final void e(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(50748);
    com.tencent.mm.kernel.g.RS().aa(new m.2(this, paramLong, paramInt1, paramInt2));
    AppMethodBeat.o(50748);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.m
 * JD-Core Version:    0.6.2
 */