package com.tencent.mm.plugin.wear.model;

import android.os.Looper;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.e;
import com.tencent.mm.g.a.vi;
import com.tencent.mm.g.a.vi.a;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.wear.model.e.i;
import com.tencent.mm.protocal.protobuf.ctv;
import com.tencent.mm.sdk.e.n.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;

public final class b
  implements com.tencent.mm.ai.f
{
  n.b mFC;
  boolean tXD;
  com.tencent.mm.sdk.b.c tXE;
  com.tencent.mm.sdk.platformtools.ap tXF;

  public b()
  {
    AppMethodBeat.i(26280);
    this.tXE = new b.1(this);
    this.mFC = new b.3(this);
    this.tXF = new com.tencent.mm.sdk.platformtools.ap(Looper.getMainLooper(), new b.4(this), true);
    com.tencent.mm.sdk.b.a.xxA.c(this.tXE);
    aw.ZK();
    com.tencent.mm.model.c.XM().a(this.mFC);
    AppMethodBeat.o(26280);
  }

  public static void a(ctv paramctv)
  {
    AppMethodBeat.i(26285);
    if (paramctv != null)
    {
      vi localvi = new vi();
      localvi.cSq.cuy = 6;
      localvi.cSq.ceI = paramctv.xqs;
      com.tencent.mm.sdk.b.a.xxA.m(localvi);
      AppMethodBeat.o(26285);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Wear.WearBizLogic", "request is null");
      AppMethodBeat.o(26285);
    }
  }

  static boolean adq(String paramString)
  {
    AppMethodBeat.i(26283);
    vi localvi = new vi();
    localvi.cSq.cuy = 3;
    localvi.cSq.ceI = paramString;
    localvi.cSq.cws = "gh_43f2581f6fd6";
    com.tencent.mm.sdk.b.a.xxA.m(localvi);
    ab.i("MicroMsg.Wear.WearBizLogic", "isRegister: %b", new Object[] { Boolean.valueOf(localvi.cSq.cxT) });
    boolean bool = localvi.cSq.cxT;
    AppMethodBeat.o(26283);
    return bool;
  }

  static boolean cUo()
  {
    AppMethodBeat.i(26284);
    aw.ZK();
    boolean bool = com.tencent.mm.n.a.jh(com.tencent.mm.model.c.XM().aoO("gh_43f2581f6fd6").field_type);
    AppMethodBeat.o(26284);
    return bool;
  }

  public final void connect()
  {
    AppMethodBeat.i(26281);
    Object localObject = a.cUn().tXt.tXK.tYz;
    if (localObject == null)
    {
      ab.e("MicroMsg.Wear.WearBizLogic", "get connect wear data error");
      AppMethodBeat.o(26281);
    }
    while (true)
    {
      return;
      if (!cUo())
      {
        aw.ZK();
        boolean bool = ((Boolean)com.tencent.mm.model.c.Ry().get(327825, Boolean.FALSE)).booleanValue();
        ab.i("MicroMsg.Wear.WearBizLogic", "auto focus biz contact %b", new Object[] { Boolean.valueOf(bool) });
        if (!bool)
        {
          if (bo.gT(ah.getContext()))
          {
            ab.i("MicroMsg.Wear.WearBizLogic", "oversea user, forbid biz auto focus logic");
            AppMethodBeat.o(26281);
          }
          else
          {
            a.cUn().tXz.a(new b.a(this, (byte)0));
            a.cUn().tXz.a(new b.b(this, (ctv)localObject));
          }
        }
        else
          AppMethodBeat.o(26281);
      }
      else if (!adq(((ctv)localObject).xqs))
      {
        ab.i("MicroMsg.Wear.WearBizLogic", "start to register device %s", new Object[] { ((ctv)localObject).xqs });
        a.cUn().tXz.a(new b.b(this, (ctv)localObject));
        AppMethodBeat.o(26281);
      }
      else
      {
        if (this.tXD)
          break;
        ab.i("MicroMsg.Wear.WearBizLogic", "start to auth device %s", new Object[] { ((ctv)localObject).xqs });
        localObject = ((ctv)localObject).xqs;
        if ((!this.tXD) && (adq((String)localObject)))
        {
          ab.i("MicroMsg.Wear.WearBizLogic", "auth device, deviceId=%s | deviceType=%s", new Object[] { localObject, "gh_43f2581f6fd6" });
          vi localvi = new vi();
          localvi.cSq.cuy = 7;
          localvi.cSq.ceI = ((String)localObject);
          localvi.cSq.cws = "gh_43f2581f6fd6";
          com.tencent.mm.sdk.b.a.xxA.m(localvi);
        }
        AppMethodBeat.o(26281);
      }
    }
    if (this.tXF.doT())
    {
      ab.i("MicroMsg.Wear.WearBizLogic", "start step count timer");
      this.tXF.ae(3600000L, 3600000L);
    }
    while (true)
    {
      a((ctv)localObject);
      AppMethodBeat.o(26281);
      break;
      ab.i("MicroMsg.Wear.WearBizLogic", "stop timer and restart step count timer");
      this.tXF.stopTimer();
      this.tXF.ae(3600000L, 3600000L);
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(26282);
    if ((paramm instanceof com.tencent.mm.plugin.wear.model.d.a))
    {
      aw.Rg().b(1091, this);
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        ab.e("MicroMsg.Wear.WearBizLogic", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
        AppMethodBeat.o(26282);
      }
    }
    while (true)
    {
      return;
      paramm = (com.tencent.mm.plugin.wear.model.d.a)paramm;
      paramString = paramm.ceI;
      paramm = paramm.cws;
      localObject = new vi();
      ((vi)localObject).cSq.cuy = 1;
      ((vi)localObject).cSq.ceI = paramString;
      ((vi)localObject).cSq.cws = paramm;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
      AppMethodBeat.o(26282);
      continue;
      if (!(paramm instanceof com.tencent.mm.pluginsdk.model.m))
        break label366;
      aw.Rg().b(30, this);
      if ((paramInt1 == 0) && (paramInt2 == 0))
        break;
      ab.e("MicroMsg.Wear.WearBizLogic", "errType %d | errCode %d | errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 != 4) || (paramInt2 != -24) || (bo.isNullOrNil(paramString)))
        break label366;
      Toast.makeText(ah.getContext(), paramString, 1).show();
      AppMethodBeat.o(26282);
    }
    Object localObject = ((com.tencent.mm.pluginsdk.model.m)paramm).dhl();
    ab.i("MicroMsg.Wear.WearBizLogic", "bind fitness contact %s success", new Object[] { localObject });
    aw.ZK();
    paramm = com.tencent.mm.model.c.XM().aoO("gh_43f2581f6fd6");
    if ((paramm == null) || (bo.isNullOrNil((String)localObject)))
      ab.e("MicroMsg.Wear.WearBizLogic", "respUsername == " + (String)localObject + ", contact = " + paramm);
    while (true)
    {
      paramString = com.tencent.mm.aj.z.aeR().qP(paramm.field_username);
      com.tencent.mm.aj.z.aeR().e(paramString);
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(327825, Boolean.TRUE);
      connect();
      label366: AppMethodBeat.o(26282);
      break;
      paramString = null;
      if (t.mX(paramm.field_username))
      {
        String str = bo.nullAsNil(paramm.field_username);
        paramString = com.tencent.mm.aj.f.qX(str);
        if (paramString != null)
          paramString.field_username = ((String)localObject);
        com.tencent.mm.aj.z.aeR().delete(str);
        paramm.iH(str);
      }
      paramm.setUsername((String)localObject);
      if ((int)paramm.ewQ == 0)
      {
        aw.ZK();
        com.tencent.mm.model.c.XM().aa(paramm);
      }
      if ((int)paramm.ewQ <= 0)
      {
        ab.e("MicroMsg.Wear.WearBizLogic", "addContact : insert contact failed");
      }
      else
      {
        t.q(paramm);
        aw.ZK();
        localObject = com.tencent.mm.model.c.XM().aoO(paramm.field_username);
        if (paramString != null)
        {
          com.tencent.mm.aj.z.aeR().d(paramString);
        }
        else
        {
          paramString = com.tencent.mm.aj.f.qX(((com.tencent.mm.g.c.ap)localObject).field_username);
          if ((paramString == null) || (paramString.adJ()))
          {
            ab.d("MicroMsg.Wear.WearBizLogic", "shouldUpdate");
            ao.a.flu.ai(((com.tencent.mm.g.c.ap)localObject).field_username, "");
            com.tencent.mm.ah.b.pY(((com.tencent.mm.g.c.ap)localObject).field_username);
          }
          else if (((ad)localObject).dsi())
          {
            ab.d("MicroMsg.Wear.WearBizLogic", "update contact, last check time=%d", new Object[] { Integer.valueOf(((com.tencent.mm.g.c.ap)localObject).duj) });
            ao.a.flu.ai(((com.tencent.mm.g.c.ap)localObject).field_username, "");
            com.tencent.mm.ah.b.pY(((com.tencent.mm.g.c.ap)localObject).field_username);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.b
 * JD-Core Version:    0.6.2
 */