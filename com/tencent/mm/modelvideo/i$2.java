package com.tencent.mm.modelvideo;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ui;
import com.tencent.mm.g.a.ui.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bf.b;
import com.tencent.mm.model.n;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

final class i$2
  implements Runnable
{
  i$2(i parami)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(50716);
    boolean bool = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lIR, false);
    Object localObject1;
    if (!com.tencent.mm.r.a.Oo())
    {
      localObject1 = new ui();
      ((ui)localObject1).cQx.cAd = 2;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      if (!((ui)localObject1).cQy.cQz);
    }
    else if (bool)
    {
      AppMethodBeat.o(50716);
    }
    while (true)
    {
      return;
      if (o.alq().cqT)
      {
        AppMethodBeat.o(50716);
      }
      else if (this.fWc.fWa != null)
      {
        AppMethodBeat.o(50716);
      }
      else if ((this.fWc.fVW) || (this.fWc.fVX))
      {
        AppMethodBeat.o(50716);
      }
      else
      {
        int i;
        if (this.fWc.fVS.isEmpty())
        {
          localObject1 = this.fWc;
          if (bo.fp(((i)localObject1).fWb) > 600L)
            ((i)localObject1).fWb = bo.anT();
          for (i = 1; ; i = 0)
          {
            if (i != 0)
              i.a(this.fWc);
            AppMethodBeat.o(50716);
            break;
          }
        }
        Object localObject3 = new PBool();
        while (true)
        {
          i locali;
          Object localObject7;
          synchronized (this.fWc.fVS)
          {
            Iterator localIterator = this.fWc.fVS.iterator();
            localObject1 = null;
            if (!localIterator.hasNext())
              break;
            localObject1 = (bi)localIterator.next();
            locali = this.fWc;
            if (localObject1 == null)
            {
              ((PBool)localObject3).value = true;
              i = 0;
              if (((PBool)localObject3).value)
                localIterator.remove();
              if (i != 0)
                break;
              continue;
            }
            s locals = u.ut(((cy)localObject1).field_imgPath);
            if ((locals != null) && (locals.alz()))
            {
              ab.i("MicroMsg.PreloadVideoService", "%d it finish download all file[%s], needn't preload", new Object[] { Integer.valueOf(locali.hashCode()), locals.getFileName() });
              Object localObject6 = br.z(locals.alw(), "msg");
              localObject7 = (String)((Map)localObject6).get(".msg.videomsg.$newmd5");
              localObject6 = (String)((Map)localObject6).get(".msg.videomsg.$cdnvideourl");
              bool = t.kH(locals.getUser());
              if (bool)
              {
                i = 2;
                long l = locals.frO;
                if (!t.kH(locals.getUser()))
                  continue;
                j = n.mA(locals.getUser());
                locali.a((String)localObject7, i, l, locals.alt(), locals.getUser(), j, (String)localObject6, "", "");
                h.pYm.a(354L, 146L, 1L, false);
                if (!bool)
                  continue;
                h.pYm.a(354L, 126L, 1L, false);
                ((PBool)localObject3).value = true;
                i = 0;
                continue;
              }
              i = 1;
              continue;
              int j = 0;
              continue;
              h.pYm.a(354L, 125L, 1L, false);
            }
          }
          if (bo.gb(localObject2.field_createTime) >= 86400000L)
          {
            ab.i("MicroMsg.PreloadVideoService", "%d more than 1 day don't preload", new Object[] { Integer.valueOf(locali.hashCode()) });
            ((PBool)localObject3).value = true;
            i = 0;
          }
          else
          {
            if (locali.cX(true))
              ab.i("MicroMsg.PreloadVideoService", "%d check c2c video preload timestamp[%d]", new Object[] { Integer.valueOf(locali.hashCode()), Long.valueOf(locali.fVT) });
            label811: 
            while (true)
            {
              ((PBool)localObject3).value = false;
              i = 0;
              break;
              ab.i("MicroMsg.PreloadVideoService", "%d check c2c video preload %d %s", new Object[] { Integer.valueOf(locali.hashCode()), Long.valueOf(localObject2.field_msgId), localObject2.dqJ });
              localObject7 = bf.oE(localObject2.dqJ);
              if (localObject7 == null)
              {
                ((PBool)localObject3).value = true;
                i = 0;
                break;
              }
              if (((bf.b)localObject7).fmG <= 0)
              {
                ((PBool)localObject3).value = true;
                i = 0;
                break;
              }
              if (!com.tencent.mm.modelcontrol.b.rR(((bf.b)localObject7).fmI))
              {
                if (at.isWifi(ah.getContext()))
                  i = ((bf.b)localObject7).fmH & 0x1;
                while (true)
                {
                  if (i <= 0)
                    break label811;
                  ((PBool)localObject3).value = false;
                  i = 1;
                  break;
                  if (at.is4G(ah.getContext()))
                  {
                    i = ((bf.b)localObject7).fmH & 0x2;
                  }
                  else
                  {
                    if (!at.is3G(ah.getContext()))
                      break label813;
                    i = ((bf.b)localObject7).fmH & 0x4;
                  }
                }
              }
            }
            label813: ((PBool)localObject3).value = false;
            i = 0;
          }
        }
        if (localObject2 == null)
        {
          AppMethodBeat.o(50716);
        }
        else
        {
          this.fWc.fWa = new f(localObject2.field_msgId);
          ab.i("MicroMsg.PreloadVideoService", "%s start to preload video[%s]", new Object[] { Integer.valueOf(this.fWc.hashCode()), this.fWc.fWa.alc() });
          if (this.fWc.fWa.a(this.fWc) < 0)
          {
            ab.w("MicroMsg.PreloadVideoService", "%s curr preload task do scene error.", new Object[] { Integer.valueOf(this.fWc.hashCode()) });
            synchronized (this.fWc.fVS)
            {
              ??? = this.fWc.fVS.iterator();
              while (((Iterator)???).hasNext())
              {
                localObject3 = (bi)((Iterator)???).next();
                if ((localObject3 != null) && (((cy)localObject3).field_msgId == this.fWc.fWa.cvx))
                {
                  ab.i("MicroMsg.PreloadVideoService", "%d find msg[%d], remove now", new Object[] { Integer.valueOf(this.fWc.hashCode()), Long.valueOf(this.fWc.fWa.cvx) });
                  ((Iterator)???).remove();
                }
              }
            }
            this.fWc.fWa = null;
          }
          AppMethodBeat.o(50716);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.i.2
 * JD-Core Version:    0.6.2
 */