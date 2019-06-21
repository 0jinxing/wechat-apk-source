package com.tencent.mm.plugin.offline.a;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.us;
import com.tencent.mm.kernel.e;
import com.tencent.mm.plugin.offline.i;
import com.tencent.mm.plugin.offline.k;
import com.tencent.mm.plugin.wallet_core.model.Orders;
import com.tencent.mm.plugin.wallet_core.model.Orders.Commodity;
import com.tencent.mm.plugin.wallet_core.model.ak;
import com.tencent.mm.plugin.wallet_core.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class s
{
  private List<WeakReference<s.a>> kaD;
  public ArrayList<Long> oVR;
  public s.b oYL;
  private HashSet<String> oYM;

  public s()
  {
    AppMethodBeat.i(43423);
    this.kaD = new ArrayList();
    this.oYL = null;
    this.oVR = new ArrayList();
    this.oYM = new HashSet();
    Object localObject = com.tencent.mm.plugin.offline.c.a.bYn();
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = br.z((String)localObject, "sysmsg");
      if (localObject != null)
      {
        int i = bo.getInt((String)((Map)localObject).get(".sysmsg.paymsg.PayMsgType"), -1);
        if ((i >= 0) && (i == 4))
        {
          ab.i("MicroMsg.WalletOfflineMsgManager", "msg type is 4 ");
          b(O((Map)localObject));
        }
      }
    }
    this.oVR.clear();
    AppMethodBeat.o(43423);
  }

  private s.d N(Map<String, String> paramMap)
  {
    AppMethodBeat.i(43428);
    s.d locald = new s.d(this);
    locald.oYS = bo.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), -1);
    locald.cBT = ((String)paramMap.get(".sysmsg.paymsg.req_key"));
    AppMethodBeat.o(43428);
    return locald;
  }

  private s.b O(Map<String, String> paramMap)
  {
    AppMethodBeat.i(43429);
    if (this.oYL == null)
      this.oYL = new s.b(this);
    this.oYL.oYS = bo.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), -1);
    this.oYL.oYP = ((String)paramMap.get(".sysmsg.paymsg.isfreeze"));
    this.oYL.oYQ = ((String)paramMap.get(".sysmsg.paymsg.freezetype"));
    this.oYL.oYR = ((String)paramMap.get(".sysmsg.paymsg.freezemsg"));
    paramMap = this.oYL;
    AppMethodBeat.o(43429);
    return paramMap;
  }

  private s.e P(Map<String, String> paramMap)
  {
    AppMethodBeat.i(43430);
    s.e locale = new s.e(this);
    locale.oYS = bo.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), -1);
    locale.oYT = ((String)paramMap.get(".sysmsg.paymsg.cftretcode"));
    locale.oYU = ((String)paramMap.get(".sysmsg.paymsg.cftretmsg"));
    locale.oYV = ((String)paramMap.get(".sysmsg.paymsg.wxretcode"));
    locale.oYW = ((String)paramMap.get(".sysmsg.paymsg.wxretmsg"));
    locale.oYX = ((String)paramMap.get(".sysmsg.paymsg.error_detail_url"));
    locale.oYY = true;
    AppMethodBeat.o(43430);
    return locale;
  }

  private s.f Q(Map<String, String> paramMap)
  {
    AppMethodBeat.i(43431);
    s.f localf = new s.f(this);
    localf.oYS = bo.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), -1);
    localf.oYZ = ((String)paramMap.get(".sysmsg.paymsg.transid"));
    localf.oZa = com.tencent.mm.plugin.offline.c.a.T(paramMap);
    if (localf.oZa.tAq.size() > 0)
      com.tencent.mm.plugin.offline.c.a.Uo(((Orders.Commodity)localf.oZa.tAq.get(0)).cAa);
    if (paramMap.containsKey(".sysmsg.paymsg.real_name_info"))
      localf.cRz = new s.h(this, paramMap);
    AppMethodBeat.o(43431);
    return localf;
  }

  private s.d R(Map<String, String> paramMap)
  {
    AppMethodBeat.i(43432);
    s.d locald = new s.d(this);
    locald.oYS = bo.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), -1);
    locald.cBT = ((String)paramMap.get(".sysmsg.paymsg.req_key"));
    AppMethodBeat.o(43432);
    return locald;
  }

  private s.g S(Map<String, String> paramMap)
  {
    AppMethodBeat.i(43433);
    s.g localg = new s.g(this);
    localg.oYS = bo.getInt((String)paramMap.get(".sysmsg.paymsg.PayMsgType"), -1);
    localg.oZb = ((String)paramMap.get(".sysmsg.paymsg.good_name"));
    localg.oZc = ((String)paramMap.get(".sysmsg.paymsg.total_fee"));
    localg.cBT = ((String)paramMap.get(".sysmsg.paymsg.req_key"));
    localg.id = ((String)paramMap.get(".sysmsg.paymsg.id"));
    paramMap = (String)paramMap.get(".sysmsg.paymsg.confirm_type");
    ab.i("MicroMsg.WalletOfflineMsgManager", "msg confirm_type is" + localg.kKC);
    if ((!TextUtils.isEmpty(paramMap)) && (paramMap.equals("1")));
    for (localg.kKC = 1; ; localg.kKC = 0)
    {
      AppMethodBeat.o(43433);
      return localg;
    }
  }

  private void b(s.c paramc)
  {
    AppMethodBeat.i(43424);
    if (this.kaD == null)
      AppMethodBeat.o(43424);
    while (true)
    {
      return;
      for (int i = 0; i < this.kaD.size(); i++)
      {
        Object localObject = (WeakReference)this.kaD.get(i);
        if (localObject != null)
        {
          localObject = (s.a)((WeakReference)localObject).get();
          if ((localObject != null) && (((s.a)localObject).a(paramc)))
            break;
        }
      }
      AppMethodBeat.o(43424);
    }
  }

  public final void TW(String arg1)
  {
    AppMethodBeat.i(43427);
    com.tencent.mm.plugin.offline.c.a.Um("");
    com.tencent.mm.plugin.offline.c.a.Uo("");
    com.tencent.mm.plugin.offline.c.a.Un("");
    Object localObject = br.z(???, "sysmsg");
    if (localObject == null)
      AppMethodBeat.o(43427);
    int i;
    int j;
    String str;
    while (true)
    {
      return;
      i = bo.getInt((String)((Map)localObject).get(".sysmsg.paymsg.PayMsgType"), -1);
      j = bo.getInt((String)((Map)localObject).get(".sysmsg.paymsg.pay_cmd"), -1);
      str = (String)((Map)localObject).get(".sysmsg.paymsg.req_key");
      com.tencent.mm.plugin.offline.c.a.Um((String)((Map)localObject).get(".sysmsg.paymsg.ack_key"));
      com.tencent.mm.plugin.offline.c.a.AE(i);
      com.tencent.mm.plugin.offline.c.a.Un(str);
      i = bo.getInt((String)((Map)localObject).get(".sysmsg.paymsg.PayMsgType"), -1);
      ab.i("MicroMsg.WalletOfflineMsgManager", "msg type is ".concat(String.valueOf(i)));
      ab.v("MicroMsg.WalletOfflineMsgManager", "msg type is type %d xml %s", new Object[] { Integer.valueOf(i), ??? });
      if ((i < 0) || (i != 4))
        break;
      b(O((Map)localObject));
      com.tencent.mm.plugin.offline.c.a.Ud(???);
      AppMethodBeat.o(43427);
    }
    if ((i >= 0) && (i == 5))
    {
      if (j != 1)
        break label641;
      ab.i("MicroMsg.WalletOfflineMsgManager", "payCmd is PAY_CMD_OFFLINE_PAY_REFRESH_TOKEN (value is 1), refresh offline token");
      k.bXg();
      k.bXj().eO(4, 4);
    }
    label641: for (boolean bool = false; ; bool = true)
    {
      while (true)
      {
        ??? = P((Map)localObject);
        ???.oYY = bool;
        b(???);
        AppMethodBeat.o(43427);
        break;
        if ((i >= 0) && (i == 6))
        {
          str = (String)((Map)localObject).get(".sysmsg.paymsg.transid");
          ab.i("helios", "MSG_TYPE_ORDER trasid=".concat(String.valueOf(str)));
          if (!bo.isNullOrNil(str))
          {
            com.tencent.mm.kernel.g.RQ();
            com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xOS, Boolean.TRUE);
          }
          ab.i("MicroMsg.WalletOfflineMsgManager", "orders xml: %s", new Object[] { ??? });
          b(Q((Map)localObject));
          AppMethodBeat.o(43427);
          break;
        }
        if ((i >= 0) && (i == 7))
        {
          r.cPI().Km();
          AppMethodBeat.o(43427);
          break;
        }
        if ((i >= 0) && (i == 8))
        {
          b(S((Map)localObject));
          AppMethodBeat.o(43427);
          break;
        }
        if ((i >= 0) && (i == 10))
        {
          k.bXg();
          k.bXj().eO(4, 4);
          AppMethodBeat.o(43427);
          break;
        }
        if ((i >= 0) && (i == 20))
        {
          ??? = new us();
          ???.cRy.cRz = new s.h(this, (Map)localObject);
          com.tencent.mm.sdk.b.a.xxA.m(???);
          AppMethodBeat.o(43427);
          break;
        }
        if ((i >= 0) && (i == 23))
        {
          localObject = R((Map)localObject);
          synchronized (this.oYM)
          {
            if (this.oYM.contains(((s.d)localObject).cBT))
            {
              ab.i("MicroMsg.WalletOfflineMsgManager", "pass this msg %s", new Object[] { ((s.d)localObject).cBT });
              AppMethodBeat.o(43427);
              break;
            }
            this.oYM.add(((s.d)localObject).cBT);
            b((s.c)localObject);
            AppMethodBeat.o(43427);
          }
        }
      }
      if ((i >= 0) && (i == 24))
      {
        b(N(localMap));
        AppMethodBeat.o(43427);
        break;
      }
      AppMethodBeat.o(43427);
      break;
    }
  }

  public final void TX(String paramString)
  {
    AppMethodBeat.i(43434);
    int i = bo.getInt((String)br.z(paramString, "sysmsg").get(".sysmsg.paymsg.PayMsgType"), -1);
    paramString = new HashSet();
    paramString.add(Integer.valueOf(com.tencent.mm.plugin.offline.g.oXe));
    paramString.add(Integer.valueOf(com.tencent.mm.plugin.offline.g.oXd));
    paramString.add(Integer.valueOf(com.tencent.mm.plugin.offline.g.oXf));
    paramString.add(Integer.valueOf(com.tencent.mm.plugin.offline.g.oXc));
    paramString.add(Integer.valueOf(com.tencent.mm.plugin.offline.g.oWZ));
    if (paramString.contains(Integer.valueOf(i)))
      com.tencent.mm.kernel.g.RS().aa(new s.1(this));
    AppMethodBeat.o(43434);
  }

  public final void a(s.a parama)
  {
    AppMethodBeat.i(43425);
    if (this.kaD == null)
      this.kaD = new ArrayList();
    this.kaD.add(new WeakReference(parama));
    AppMethodBeat.o(43425);
  }

  public final void b(s.a parama)
  {
    AppMethodBeat.i(43426);
    if (this.kaD == null)
      AppMethodBeat.o(43426);
    while (true)
    {
      return;
      for (int i = 0; ; i++)
      {
        if (i >= this.kaD.size())
          break label102;
        WeakReference localWeakReference = (WeakReference)this.kaD.get(i);
        if (localWeakReference != null)
        {
          s.a locala = (s.a)localWeakReference.get();
          if ((locala != null) && (locala.equals(parama)))
          {
            this.kaD.remove(localWeakReference);
            AppMethodBeat.o(43426);
            break;
          }
        }
      }
      label102: AppMethodBeat.o(43426);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.offline.a.s
 * JD-Core Version:    0.6.2
 */