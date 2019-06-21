package com.tencent.mm.plugin.wallet_core.model.mall;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.z;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class d
{
  private static d tDF = null;
  private Map<String, MallNews> tDE;

  private d()
  {
    AppMethodBeat.i(47036);
    this.tDE = new HashMap();
    Kh();
    AppMethodBeat.o(47036);
  }

  private static MallNews acJ(String paramString)
  {
    AppMethodBeat.i(47042);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(47042);
      paramString = null;
    }
    while (true)
    {
      return paramString;
      Map localMap = br.z(paramString, "sysmsg");
      if (localMap == null)
      {
        AppMethodBeat.o(47042);
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
            localMallNews.<init>((String)localMap.get(".sysmsg.mallactivitynew.functionid"));
            localMallNews.ssr = ((String)localMap.get(".sysmsg.mallactivitynew.activityid"));
            localMallNews.type = ((String)localMap.get(".sysmsg.mallactivitynew.type"));
            localMallNews.showType = bo.getInt((String)localMap.get(".sysmsg.mallactivitynew.showtype"), 0);
            if (localMap.containsKey(".sysmsg.mallactivitynew.showflag"))
            {
              localMallNews.tDt = ((String)localMap.get(".sysmsg.mallactivitynew.showflag"));
              if (!localMap.containsKey(".sysmsg.mallactivitynew.newsTipFlag"))
                break label216;
              localMallNews.tDu = ((String)localMap.get(".sysmsg.mallactivitynew.newsTipFlag"));
              localMallNews.tDB = paramString;
              boolean bool = bo.isNullOrNil(localMallNews.fsT);
              if (!bool)
                break label225;
              AppMethodBeat.o(47042);
              paramString = null;
              break;
            }
            localMallNews.tDt = "0";
            continue;
          }
          catch (Exception paramString)
          {
            ab.e("MicroMsg.MallNewsManagerNewVersion", "cmdid error");
            AppMethodBeat.o(47042);
            paramString = null;
          }
          break;
          label216: localMallNews.tDu = "0";
        }
        label225: AppMethodBeat.o(47042);
        paramString = localMallNews;
      }
    }
  }

  private boolean bZX()
  {
    AppMethodBeat.i(47039);
    ab.d("MicroMsg.MallNewsManagerNewVersion", "notifyNewsMap.size : " + this.tDE.size());
    StringBuffer localStringBuffer = new StringBuffer();
    Iterator localIterator = this.tDE.keySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (String)localIterator.next();
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = (MallNews)this.tDE.get(localObject);
        localStringBuffer.append(((MallNews)localObject).tDB.replace("</mallactivitynew></sysmsg>;", "").replaceAll("<activityid>([^<]*)</activityid>", "").replaceAll("<type>([^<]*)</type>", "").replaceAll("<showflag>([^<]*)</showflag>", "").replaceAll("<newsTipFlag>([^<]*)</newsTipFlag>", "") + "<activityid>" + ((MallNews)localObject).ssr + "</activityid><type>" + ((MallNews)localObject).type + "</type><showflag>" + ((MallNews)localObject).tDt + "</showflag><newsTipFlag>" + ((MallNews)localObject).tDu + "</newsTipFlag></mallactivitynew></sysmsg>;");
      }
    }
    ab.d("MicroMsg.MallNewsManagerNewVersion", "save data  : " + localStringBuffer.toString());
    g.RQ();
    g.RP().Ry().set(270341, localStringBuffer.toString());
    AppMethodBeat.o(47039);
    return true;
  }

  public static d cQX()
  {
    AppMethodBeat.i(47035);
    if (tDF == null)
      tDF = new d();
    d locald = tDF;
    AppMethodBeat.o(47035);
    return locald;
  }

  public final void Kh()
  {
    AppMethodBeat.i(47037);
    this.tDE.clear();
    g.RQ();
    Object localObject = (String)g.RP().Ry().get(270341, "");
    ab.d("MicroMsg.MallNewsManagerNewVersion", "data : ".concat(String.valueOf(localObject)));
    Iterator localIterator = bo.P(((String)localObject).split(";")).iterator();
    while (localIterator.hasNext())
    {
      localObject = acJ((String)localIterator.next());
      if (localObject != null)
        this.tDE.put(((MallNews)localObject).fsT, localObject);
    }
    AppMethodBeat.o(47037);
  }

  public final MallNews acI(String paramString)
  {
    AppMethodBeat.i(47041);
    ab.d("MicroMsg.MallNewsManagerNewVersion", "removeNewsInIndexUI : ".concat(String.valueOf(paramString)));
    if ((!bo.isNullOrNil(paramString)) && (this.tDE.containsKey(paramString)))
    {
      paramString = (MallNews)this.tDE.get(paramString);
      if ("0".equals(paramString.tDt))
      {
        paramString.tDt = "1";
        bZX();
      }
      AppMethodBeat.o(47041);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(47041);
    }
  }

  public final MallNews acK(String paramString)
  {
    AppMethodBeat.i(47040);
    paramString = (MallNews)this.tDE.get(paramString);
    AppMethodBeat.o(47040);
    return paramString;
  }

  public final void b(MallNews paramMallNews)
  {
    AppMethodBeat.i(47038);
    if (paramMallNews == null)
    {
      ab.w("MicroMsg.MallNewsManagerNewVersion", "null obj");
      AppMethodBeat.o(47038);
    }
    while (true)
    {
      return;
      paramMallNews.tDB = ("<sysmsg><mallactivitynew><functionid>" + paramMallNews.fsT + "</functionid><activityid>" + paramMallNews.ssr + "</activityid><type>" + paramMallNews.type + "</type><showflag>" + paramMallNews.tDt + "</showflag><newsTipFlag>" + paramMallNews.tDu + "</newsTipFlag></mallactivitynew></sysmsg>;");
      this.tDE.put(paramMallNews.fsT, paramMallNews);
      bZX();
      AppMethodBeat.o(47038);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.model.mall.d
 * JD-Core Version:    0.6.2
 */