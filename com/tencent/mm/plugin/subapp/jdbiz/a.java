package com.tencent.mm.plugin.subapp.jdbiz;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.Map;

public final class a
  implements bz.a
{
  com.tencent.mm.sdk.b.c ssn;

  public a()
  {
    AppMethodBeat.i(25190);
    this.ssn = new a.1(this);
    AppMethodBeat.o(25190);
  }

  public final void a(e.a parama)
  {
    boolean bool = false;
    AppMethodBeat.i(25191);
    ab.i("MicroMsg.JDSysMsgNotifyLsn", "receivemsg jd");
    Object localObject1 = parama.eAB;
    if (localObject1 == null)
    {
      ab.e("MicroMsg.JDSysMsgNotifyLsn", "onPreAddMessage cmdAM is null");
      AppMethodBeat.o(25191);
      return;
    }
    parama = new b();
    parama.YH(aa.a(((cm)localObject1).vED));
    ab.i("MicroMsg.JDSysMsgNotifyLsn", "bizType " + bo.bc(parama.ssq, ""));
    if (bo.isNullOrNil(parama.ssq))
      ab.e("MicroMsg.JDSysMsgNotifyLsn", "bizTye is null or nil");
    while (true)
    {
      aw.ZK();
      com.tencent.mm.model.c.Ry().dsb();
      AppMethodBeat.o(25191);
      break;
      if (bo.isNullOrNil(parama.ssr))
      {
        ab.e("MicroMsg.JDSysMsgNotifyLsn", "activity id is null");
      }
      else if (!parama.a(c.cDr().cDw()))
      {
        ab.i("MicroMsg.JDSysMsgNotifyLsn", "fo zu baoyou! the activityid is same");
      }
      else if (!c.cDz())
      {
        ab.e("MicroMsg.JDSysMsgNotifyLsn", "no entrance, ignore msg");
      }
      else
      {
        if (parama.ssq.equals("3"))
        {
          ((cm)localObject1).vEH = null;
          if ((bo.isNullOrNil(parama.ssB)) || (bo.isNullOrNil(parama.jumpUrl)) || (bo.isNullOrNil(parama.ssC)) || (bo.isNullOrNil(parama.ssD)) || (bo.isNullOrNil(parama.ssA)))
            ab.e("MicroMsg.JDSysMsgNotifyLsn", "invalid params");
          while (true)
          {
            c.b(parama);
            break;
            if (parama.bxX())
            {
              ab.i("MicroMsg.JDSysMsgNotifyLsn", "ingore msg due to msg is expired");
            }
            else
            {
              Object localObject2 = c.cDr();
              localObject1 = parama.ssr;
              if (bo.isNullOrNil((String)localObject1));
              while (true)
              {
                if (!bool)
                  break label342;
                ab.i("MicroMsg.JDSysMsgNotifyLsn", "activity id already show, " + parama.ssr);
                break;
                bool = ((c)localObject2).ssG.containsKey(localObject1);
              }
              label342: if (!parama.a(c.cDr().cDw()))
              {
                ab.i("MicroMsg.JDSysMsgNotifyLsn", "the remind activitid is same");
              }
              else
              {
                localObject1 = c.cDr();
                localObject2 = parama.ssr;
                if (!bo.isNullOrNil((String)localObject2))
                  ((c)localObject1).ssG.put(localObject2, Integer.valueOf(1));
                ab.i("MicroMsg.JDSysMsgNotifyLsn", "add activity id" + parama.ssr);
                new ak(Looper.getMainLooper()).post(new a.2(this, parama));
              }
            }
          }
        }
        if (parama.ssq.equals("1"))
        {
          c.b(parama);
        }
        else if (parama.ssq.equals("2"))
        {
          c.b(parama);
          h.pYm.e(11178, new Object[] { parama.jumpUrl, parama.ssr, Integer.valueOf(3) });
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.jdbiz.a
 * JD-Core Version:    0.6.2
 */