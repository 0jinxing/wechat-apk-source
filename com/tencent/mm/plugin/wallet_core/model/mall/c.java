package com.tencent.mm.plugin.wallet_core.model.mall;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.x.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public final class c
{
  private static c tDD = null;
  public Map<String, MallNews> tDE;

  private c()
  {
    AppMethodBeat.i(47022);
    this.tDE = new HashMap();
    Kh();
    AppMethodBeat.o(47022);
  }

  public static boolean a(MallNews paramMallNews)
  {
    AppMethodBeat.i(47025);
    g.RQ();
    String str = (String)g.RP().Ry().get(ac.a.xQm, "");
    ArrayList localArrayList = bo.P(str.split(","));
    ab.i("MicroMsg.MallNewsManager", "tryCheckOutOfDateRedDot markedString %s", new Object[] { str });
    boolean bool;
    if (paramMallNews == null)
    {
      AppMethodBeat.o(47025);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramMallNews.ssr))
      {
        AppMethodBeat.o(47025);
        bool = false;
      }
      else if (localArrayList.contains(paramMallNews.ssr))
      {
        AppMethodBeat.o(47025);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(47025);
        bool = false;
      }
    }
  }

  public static void acG(String paramString)
  {
    AppMethodBeat.i(47027);
    Map localMap;
    int i;
    int k;
    if (!bo.isNullOrNil(paramString))
    {
      localMap = br.z(paramString, "sysmsg");
      if (localMap != null)
      {
        i = bo.getInt((String)localMap.get(".sysmsg.paymsg.PayMsgType"), -1);
        if (i == 31)
        {
          paramString = (String)localMap.get(".sysmsg.paymsg.WalletRedDotWording");
          int j = bo.getInt((String)localMap.get(".sysmsg.paymsg.WalletRedDot"), -1);
          k = bo.getInt((String)localMap.get(".sysmsg.paymsg.BalanceRedDot"), -1);
          i = bo.getInt((String)localMap.get(".sysmsg.paymsg.LQTRedDot"), -1);
          ab.i("MicroMsg.MallNewsManager", "walletEntryWording: %s, balanceRedDot: %s, lqtRedDot: %s", new Object[] { paramString, Integer.valueOf(k), Integer.valueOf(i) });
          g.RQ();
          g.RP().Ry().set(ac.a.xSs, paramString);
          g.RQ();
          g.RP().Ry().set(ac.a.xSt, Integer.valueOf(j));
          g.RQ();
          g.RP().Ry().set(ac.a.xSu, Integer.valueOf(k));
          g.RQ();
          g.RP().Ry().set(ac.a.xSv, Integer.valueOf(i));
          cQW();
          AppMethodBeat.o(47027);
        }
      }
    }
    while (true)
    {
      return;
      Object localObject1;
      String str1;
      String str3;
      long l;
      if (i == 34)
      {
        localObject1 = localMap.keySet();
        ab.i("MicroMsg.MallNewsManager", "receive menu ui reddot msg: %s, keys: %s", new Object[] { paramString, localObject1.toString() });
        if (((Set)localObject1).size() > 0)
        {
          paramString = new JSONObject();
          localObject1 = ((Set)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            str1 = (String)((Iterator)localObject1).next();
            if (str1.startsWith(".sysmsg.paymsg.reddot.item"))
            {
              String str2 = (String)localMap.get(str1);
              str3 = str1 + ".$wording";
              str1 = str1 + ".$expire_time";
              str3 = (String)localMap.get(str3);
              l = bo.getLong((String)localMap.get(str1), 0L) * 1000L;
              if (!bo.isNullOrNil(str2))
              {
                ab.i("MicroMsg.MallNewsManager", "mall menu ui, %s has reddot, wording: %s, expireTime: %s", new Object[] { str2, str3, Long.valueOf(l) });
                if ("mainentry_me".equals(str2))
                {
                  g.RQ();
                  g.RP().Ry().set(ac.a.xUc, Boolean.TRUE);
                  if (l > 0L)
                  {
                    g.RQ();
                    g.RP().Ry().set(ac.a.xUd, Long.valueOf(l));
                  }
                }
                else if ("entry_wxpay_wallet".equals(str2))
                {
                  g.RQ();
                  g.RP().Ry().set(ac.a.xUe, Boolean.TRUE);
                  if (!bo.isNullOrNil(str3))
                  {
                    g.RQ();
                    g.RP().Ry().set(ac.a.xUb, str3);
                  }
                  while (true)
                  {
                    if (l <= 0L)
                      break label612;
                    g.RQ();
                    g.RP().Ry().set(ac.a.xUf, Long.valueOf(l));
                    break;
                    g.RQ();
                    g.RP().Ry().set(ac.a.xUb, "");
                  }
                }
                else
                {
                  label612: if ("entry_wxpay_paycenter".equals(str2))
                  {
                    g.RQ();
                    g.RP().Ry().set(ac.a.xTW, Boolean.TRUE);
                    if (l > 0L)
                    {
                      g.RQ();
                      g.RP().Ry().set(ac.a.xTX, Long.valueOf(l));
                    }
                  }
                  else
                  {
                    try
                    {
                      paramString.put(str2, 1);
                      if (l > 0L)
                        paramString.put(String.format("%s_expiretime", new Object[] { str2 }), l);
                    }
                    catch (Exception localException)
                    {
                      ab.printErrStackTrace("MicroMsg.MallNewsManager", localException, "put redDotConfig json failed: %s", new Object[] { localException.getMessage() });
                    }
                  }
                }
              }
            }
          }
          ab.i("MicroMsg.MallNewsManager", "redDotConfig: %s", new Object[] { paramString.toString() });
          if (paramString.length() > 0)
          {
            g.RQ();
            g.RP().Ry().set(ac.a.xTV, paramString.toString());
            g.RQ();
            g.RP().Ry().set(ac.a.xTW, Boolean.TRUE);
          }
        }
        AppMethodBeat.o(47027);
      }
      else if (i == 36)
      {
        paramString = (String)localMap.get(".sysmsg.paymsg.WalletRedDotWording");
        i = bo.getInt((String)localMap.get(".sysmsg.paymsg.WalletRedDot"), -1);
        k = bo.getInt((String)localMap.get(".sysmsg.paymsg.LQBRedDot"), -1);
        ab.i("MicroMsg.MallNewsManager", "walletEntryWording: %s, walletRedDot: %s, lqbRedDot: %s", new Object[] { paramString, Integer.valueOf(i), Integer.valueOf(k) });
        g.RQ();
        g.RP().Ry().set(ac.a.xSs, paramString);
        g.RQ();
        g.RP().Ry().set(ac.a.xSt, Integer.valueOf(i));
        g.RQ();
        g.RP().Ry().set(ac.a.xSw, Integer.valueOf(k));
        cQW();
        AppMethodBeat.o(47027);
      }
      else
      {
        if (i == 38)
        {
          Object localObject2 = localMap.keySet();
          ab.i("MicroMsg.MallNewsManager", "receive menu ui reddot msg: %s, keys: %s", new Object[] { paramString, localObject2.toString() });
          if (((Set)localObject2).size() > 0)
          {
            localObject1 = new JSONObject();
            localObject2 = ((Set)localObject2).iterator();
            k = 0;
            i = 0;
            while (((Iterator)localObject2).hasNext())
            {
              str1 = (String)((Iterator)localObject2).next();
              if (str1.startsWith(".sysmsg.paymsg.reddot.item"))
              {
                paramString = (String)localMap.get(str1);
                str3 = str1 + ".$wording";
                str1 = str1 + ".$expire_time";
                str3 = (String)localMap.get(str3);
                l = bo.getLong((String)localMap.get(str1), 0L) * 1000L;
                if (!bo.isNullOrNil(paramString))
                {
                  ab.i("MicroMsg.MallNewsManager", "mall menu ui, %s has reddot, wording: %s, expireTime: %s", new Object[] { paramString, str3, Long.valueOf(l) });
                  if ("mainentry_me".equals(paramString))
                  {
                    com.tencent.mm.x.c.PK().b(ac.a.xUi, true);
                    g.RQ();
                    g.RP().Ry().set(ac.a.xUj, Long.valueOf(l));
                    i = 1;
                  }
                  else
                  {
                    if ("entry_wxpay_pay".equals(paramString))
                    {
                      com.tencent.mm.x.c.PK().b(ac.a.xUi, true);
                      if (!bo.isNullOrNil(str3))
                      {
                        g.RQ();
                        g.RP().Ry().set(ac.a.xUh, str3);
                      }
                      while (true)
                      {
                        g.RQ();
                        g.RP().Ry().set(ac.a.xUk, Long.valueOf(l));
                        k = 1;
                        break;
                        g.RQ();
                        g.RP().Ry().set(ac.a.xUh, "");
                      }
                    }
                    if ("entry_wxpay_pay_wallet".equals(paramString))
                    {
                      g.RQ();
                      g.RP().Ry().set(ac.a.xUl, Boolean.TRUE);
                      g.RQ();
                      g.RP().Ry().set(ac.a.xUm, Long.valueOf(l));
                    }
                    else
                    {
                      if (paramString.startsWith("bind_serial_"))
                      {
                        paramString = paramString.substring(12);
                        g.RQ();
                        str1 = (String)g.RP().Ry().get(ac.a.xSN, "");
                        ab.d("MicroMsg.MallNewsManager", "bind serial: %s", new Object[] { paramString });
                        if (!bo.isNullOrNil(str1))
                          paramString = str1 + "," + paramString;
                        while (true)
                        {
                          g.RQ();
                          g.RP().Ry().set(ac.a.xSN, paramString);
                          break;
                        }
                      }
                      try
                      {
                        ((JSONObject)localObject1).put(paramString, 1);
                        ((JSONObject)localObject1).put(String.format("%s_expiretime", new Object[] { paramString }), l);
                      }
                      catch (Exception paramString)
                      {
                        ab.printErrStackTrace("MicroMsg.MallNewsManager", paramString, "put redDotConfig json failed: %s", new Object[] { paramString.getMessage() });
                      }
                    }
                  }
                }
              }
            }
            if (i == 0)
              com.tencent.mm.x.c.PK().c(ac.a.xUi, ac.a.xUp);
            if (k == 0)
              com.tencent.mm.x.c.PK().c(ac.a.xUi, ac.a.xUo);
            ab.i("MicroMsg.MallNewsManager", "redDotConfig: %s", new Object[] { ((JSONObject)localObject1).toString() });
            if (((JSONObject)localObject1).length() > 0)
            {
              g.RQ();
              g.RP().Ry().set(ac.a.xUn, ((JSONObject)localObject1).toString());
              g.RQ();
              g.RP().Ry().set(ac.a.xUl, Boolean.TRUE);
            }
          }
        }
        AppMethodBeat.o(47027);
      }
    }
  }

  public static MallNews acJ(String paramString)
  {
    AppMethodBeat.i(47033);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(47033);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Map localMap = br.z(paramString, "sysmsg");
      if (localMap == null)
      {
        AppMethodBeat.o(47033);
        paramString = null;
      }
      else
      {
        MallNews localMallNews;
        while (true)
        {
          try
          {
            localMallNews = new com/tencent/mm/plugin/wallet_core/model/mall/MallNews;
            localMallNews.<init>((String)localMap.get(".sysmsg.mallactivity.functionid"));
            localMallNews.ssr = ((String)localMap.get(".sysmsg.mallactivity.activityid"));
            localMallNews.cxb = ((String)localMap.get(".sysmsg.mallactivity.ticket"));
            localMallNews.type = ((String)localMap.get(".sysmsg.mallactivity.type"));
            localMallNews.showType = bo.getInt((String)localMap.get(".sysmsg.mallactivity.showtype"), 0);
            if (localMap.containsKey(".sysmsg.mallactivity.showflag"))
            {
              localMallNews.tDt = ((String)localMap.get(".sysmsg.mallactivity.showflag"));
              if (!localMap.containsKey(".sysmsg.mallactivity.newsTipFlag"))
                break label247;
              localMallNews.tDu = ((String)localMap.get(".sysmsg.mallactivity.newsTipFlag"));
              localMallNews.tDB = paramString;
              boolean bool = bo.isNullOrNil(localMallNews.fsT);
              if (!bool)
                break label257;
              AppMethodBeat.o(47033);
              paramString = null;
              break;
            }
            localMallNews.tDt = "0";
            continue;
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.MallNewsManager", "cmdid error");
            AppMethodBeat.o(47033);
            paramString = null;
          }
          break;
          label247: localMallNews.tDu = "0";
        }
        label257: AppMethodBeat.o(47033);
        paramString = localMallNews;
      }
    }
  }

  public static c cQT()
  {
    AppMethodBeat.i(47021);
    if (tDD == null)
      tDD = new c();
    c localc = tDD;
    AppMethodBeat.o(47021);
    return localc;
  }

  public static void cQV()
  {
    AppMethodBeat.i(47028);
    g.RQ();
    g.RP().Ry().set(ac.a.xSs, "");
    g.RQ();
    g.RP().Ry().set(ac.a.xSt, Integer.valueOf(-1));
    AppMethodBeat.o(47028);
  }

  public static void cQW()
  {
    AppMethodBeat.i(47029);
    ab.d("MicroMsg.MallNewsManager", "clearMallNew ");
    com.tencent.mm.x.c.PK().bZ(262156, 266248);
    AppMethodBeat.o(47029);
  }

  public static void e(MallFunction paramMallFunction)
  {
    AppMethodBeat.i(47026);
    Object localObject;
    try
    {
      if (!bo.isNullOrNil(paramMallFunction.tDn.ssr))
      {
        g.RQ();
        localObject = bo.P(((String)g.RP().Ry().get(ac.a.xQm, "")).split(","));
        while (((List)localObject).size() > 20)
          ((List)localObject).remove(0);
      }
    }
    catch (Exception paramMallFunction)
    {
      ab.printErrStackTrace("MicroMsg.MallNewsManager", paramMallFunction, "error in markedFunction", new Object[0]);
      AppMethodBeat.o(47026);
    }
    while (true)
    {
      return;
      boolean bool = ((List)localObject).contains(paramMallFunction.tDn.ssr);
      if (bool)
      {
        AppMethodBeat.o(47026);
      }
      else
      {
        ((List)localObject).add(paramMallFunction.tDn.ssr);
        localObject = bo.c((List)localObject, ",");
        ab.i("MicroMsg.MallNewsManager", "doSelectFunction %s, markedString %s", new Object[] { paramMallFunction.tDn.ssr, localObject });
        g.RQ();
        g.RP().Ry().set(ac.a.xQm, localObject);
        AppMethodBeat.o(47026);
      }
    }
  }

  public final void Kh()
  {
    AppMethodBeat.i(47023);
    this.tDE.clear();
    g.RQ();
    Object localObject = (String)g.RP().Ry().get(270339, "");
    ab.d("MicroMsg.MallNewsManager", "data : ".concat(String.valueOf(localObject)));
    localObject = bo.P(((String)localObject).split(";")).iterator();
    while (((Iterator)localObject).hasNext())
    {
      MallNews localMallNews = acJ((String)((Iterator)localObject).next());
      if (localMallNews != null)
        this.tDE.put(localMallNews.fsT, localMallNews);
    }
    AppMethodBeat.o(47023);
  }

  public final void X(ArrayList<MallFunction> paramArrayList)
  {
    AppMethodBeat.i(47034);
    if (paramArrayList != null)
    {
      Object localObject = new HashSet(this.tDE.keySet());
      paramArrayList = paramArrayList.iterator();
      while (paramArrayList.hasNext())
        ((Set)localObject).remove(((MallFunction)paramArrayList.next()).pFP);
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramArrayList = (String)((Iterator)localObject).next();
        this.tDE.remove(paramArrayList);
      }
      bZX();
    }
    AppMethodBeat.o(47034);
  }

  public final String acH(String paramString)
  {
    AppMethodBeat.i(47031);
    paramString = (MallNews)this.tDE.get(paramString);
    if ((paramString != null) && (!bo.isNullOrNil(paramString.cxb)))
    {
      paramString = paramString.cxb;
      AppMethodBeat.o(47031);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(47031);
    }
  }

  public final MallNews acI(String paramString)
  {
    AppMethodBeat.i(47032);
    ab.d("MicroMsg.MallNewsManager", "removeNewsInIndexUI : ".concat(String.valueOf(paramString)));
    if ((!bo.isNullOrNil(paramString)) && (this.tDE.containsKey(paramString)))
    {
      paramString = (MallNews)this.tDE.get(paramString);
      if ("0".equals(paramString.tDt))
      {
        paramString.tDt = "1";
        bZX();
      }
      AppMethodBeat.o(47032);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(47032);
    }
  }

  public final boolean bZX()
  {
    AppMethodBeat.i(47030);
    ab.d("MicroMsg.MallNewsManager", "notifyNewsMap.size : " + this.tDE.size());
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.tDE.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = (MallNews)this.tDE.get(localObject);
        localStringBuffer.append(((MallNews)localObject).tDB.replace("</mallactivity></sysmsg>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<showflag>" + ((MallNews)localObject).tDt + "</showflag><newsTipFlag>" + ((MallNews)localObject).tDu + "</newsTipFlag></mallactivity></sysmsg>;");
      }
    }
    ab.d("MicroMsg.MallNewsManager", "save data  : " + localStringBuffer.toString());
    g.RQ();
    g.RP().Ry().set(270339, localStringBuffer.toString());
    AppMethodBeat.o(47030);
    return true;
  }

  public final List<String> cQU()
  {
    AppMethodBeat.i(47024);
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.tDE.values().iterator();
    while (localIterator.hasNext())
    {
      MallNews localMallNews = (MallNews)localIterator.next();
      if (!bo.isNullOrNil(localMallNews.cxb))
        localArrayList.add(localMallNews.cxb);
    }
    ab.d("MicroMsg.MallNewsManager", "tickets.size : " + localArrayList.size());
    AppMethodBeat.o(47024);
    return localArrayList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.mall.c
 * JD-Core Version:    0.6.2
 */