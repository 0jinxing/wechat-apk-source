package com.tencent.mm.af;

import android.content.Context;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.i;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.service.d;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.plugin.messenger.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.s;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

public final class l
{
  private static final com.tencent.mm.a.f<Long, o> emX;

  static
  {
    AppMethodBeat.i(11221);
    emX = new com.tencent.mm.a.h(50);
    AppMethodBeat.o(11221);
  }

  public static int Me()
  {
    AppMethodBeat.i(11220);
    Context localContext = ah.getContext();
    int i;
    if (at.isNetworkConnected(localContext))
      if (at.is2G(localContext))
      {
        i = 2;
        AppMethodBeat.o(11220);
      }
    while (true)
    {
      return i;
      if (at.is3G(localContext))
      {
        i = 3;
        AppMethodBeat.o(11220);
      }
      else if (at.is4G(localContext))
      {
        i = 4;
        AppMethodBeat.o(11220);
      }
      else if (at.isWifi(localContext))
      {
        i = 1;
        AppMethodBeat.o(11220);
      }
      else
      {
        i = 0;
        AppMethodBeat.o(11220);
        continue;
        i = 100;
        AppMethodBeat.o(11220);
      }
    }
  }

  public static String Y(String paramString1, String paramString2)
  {
    AppMethodBeat.i(11210);
    paramString1 = br.z(paramString1, "msg");
    if (paramString1 == null)
    {
      ab.e("MicroMsg.AppMsgBizHelper", "getAppMsgDyeingTempFromUser fail, values is null");
      paramString1 = null;
      if ((!bo.isNullOrNil(paramString1)) || (com.tencent.mm.model.t.ny(paramString2)))
        break label147;
    }
    while (true)
    {
      if (!bo.isNullOrNil(paramString2))
        if (mg(paramString2))
        {
          paramString1 = ((d)g.K(d.class)).zb(paramString2);
          if ((paramString1 != null) && (!TextUtils.isEmpty(paramString1.field_nickname)))
          {
            paramString1 = paramString1.field_nickname;
            AppMethodBeat.o(11210);
          }
        }
      while (true)
      {
        return paramString1;
        paramString1 = (String)paramString1.get(".msg.fromusername");
        break;
        paramString1 = ((b)g.K(b.class)).mJ(paramString2);
        AppMethodBeat.o(11210);
        continue;
        paramString1 = "";
        AppMethodBeat.o(11210);
      }
      label147: paramString2 = paramString1;
    }
  }

  public static String a(Context paramContext, int paramInt, String paramString1, String paramString2, long paramLong)
  {
    AppMethodBeat.i(11218);
    if (paramContext == null)
    {
      ab.w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: context is null");
      AppMethodBeat.o(11218);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      if ((paramString1 == null) || (paramString2 == null))
      {
        ab.w("MicroMsg.AppMsgBizHelper", "getReaderAppMsgContent: msg is null");
        AppMethodBeat.o(11218);
        paramContext = null;
      }
      else
      {
        g.RQ();
        if (!g.RP().isSDCardAvailable())
        {
          com.tencent.mm.ui.base.t.hO(paramContext);
          AppMethodBeat.o(11218);
          paramContext = null;
        }
        else
        {
          try
          {
            Object localObject = ((a)g.K(a.class)).b(paramLong, paramString1);
            paramContext = ((o)localObject).fjr;
            if ((paramContext != null) && (paramContext.size() > 0) && (paramInt < paramContext.size()))
            {
              paramString1 = (p)paramContext.get(paramInt);
              paramContext = new com/tencent/mm/af/j$b;
              paramContext.<init>();
              paramContext.title = paramString1.title;
              paramContext.description = paramString1.fjz;
              paramContext.action = "view";
              paramContext.type = 5;
              paramContext.url = paramString1.url;
              paramContext.cMg = ((o)localObject).cMg;
              paramContext.cMh = ((o)localObject).cMh;
              paramContext.dJv = ((o)localObject).dJv;
              paramContext.thumburl = a(paramString1);
              localObject = new com/tencent/mm/af/e;
              ((e)localObject).<init>();
              ((e)localObject).ffZ = paramString1.type;
              if (paramString1.type == 5)
              {
                ((e)localObject).fgd = paramString1.fgd;
                ((e)localObject).fga = ((int)paramString1.time);
                ((e)localObject).duration = paramString1.fjB;
                ((e)localObject).videoWidth = paramString1.videoWidth;
                ((e)localObject).videoHeight = paramString1.videoHeight;
              }
              paramContext.a((f)localObject);
              if (bo.isNullOrNil(paramContext.thumburl))
              {
                paramString1 = com.tencent.mm.ah.o.act().qo(paramString2);
                if (paramString1 != null)
                  paramContext.thumburl = paramString1.ack();
              }
              paramContext = j.b.a(paramContext, null, null);
              AppMethodBeat.o(11218);
            }
          }
          catch (Exception paramContext)
          {
            ab.printErrStackTrace("MicroMsg.AppMsgBizHelper", paramContext, "", new Object[0]);
            ab.e("MicroMsg.AppMsgBizHelper", "retransmit app msg error : %s", new Object[] { paramContext.getLocalizedMessage() });
            AppMethodBeat.o(11218);
            paramContext = null;
          }
        }
      }
    }
  }

  public static String a(p paramp)
  {
    AppMethodBeat.i(11215);
    if (paramp.type == 5)
      if (bo.isNullOrNil(paramp.fjx))
      {
        paramp = paramp.fjO;
        AppMethodBeat.o(11215);
      }
    while (true)
    {
      return paramp;
      paramp = paramp.fjx;
      AppMethodBeat.o(11215);
      continue;
      if (bo.isNullOrNil(paramp.fjO))
      {
        paramp = paramp.fjx;
        AppMethodBeat.o(11215);
      }
      else
      {
        paramp = paramp.fjO;
        AppMethodBeat.o(11215);
      }
    }
  }

  public static o b(long paramLong, String paramString)
  {
    AppMethodBeat.i(11214);
    o localo;
    if (paramLong > 0L)
    {
      localo = (o)emX.get(Long.valueOf(paramLong));
      if (localo != null)
      {
        AppMethodBeat.o(11214);
        paramString = localo;
      }
    }
    while (true)
    {
      return paramString;
      Object localObject1 = be.amR(paramString);
      if (localObject1 == null)
      {
        paramString = new o();
        AppMethodBeat.o(11214);
      }
      else
      {
        int i = bo.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.category.$type"), 0);
        paramString = bo.nullAsNil((String)((Map)localObject1).get(".msg.appmsg.mmreader.name"));
        int j = bo.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.forbid_forward"), 0);
        int k = bo.getInt((String)((Map)localObject1).get(".msg.appmsg.mmreader.category.$count"), 0);
        Object localObject2 = (String)((Map)localObject1).get(".msg.commenturl");
        localo = new o();
        localo.type = i;
        localo.name = paramString;
        localo.dJv = ((String)localObject2);
        localo.fjs = j;
        j = 0;
        if (j < k)
        {
          localObject2 = new p();
          Object localObject3 = new StringBuilder(".msg.appmsg.mmreader.category.item");
          if (j == 0);
          for (paramString = ""; ; paramString = String.valueOf(j))
          {
            localObject3 = paramString;
            ((p)localObject2).title = ((String)((Map)localObject1).get((String)localObject3 + ".title"));
            ((p)localObject2).url = ((String)((Map)localObject1).get((String)localObject3 + ".url"));
            ((p)localObject2).fjv = ((String)((Map)localObject1).get((String)localObject3 + ".shorturl"));
            ((p)localObject2).fjw = ((String)((Map)localObject1).get((String)localObject3 + ".longurl"));
            ((p)localObject2).time = bo.getLong((String)((Map)localObject1).get((String)localObject3 + ".pub_time"), 0L);
            ((p)localObject2).fjy = ((String)((Map)localObject1).get((String)localObject3 + ".tweetid"));
            ((p)localObject2).fjz = ((String)((Map)localObject1).get((String)localObject3 + ".digest"));
            ((p)localObject2).type = bo.getInt((String)((Map)localObject1).get((String)localObject3 + ".itemshowtype"), 0);
            ((p)localObject2).fjB = bo.getInt((String)((Map)localObject1).get((String)localObject3 + ".play_length"), 0);
            ((p)localObject2).fjx = ((String)((Map)localObject1).get((String)localObject3 + ".cover"));
            paramString = (String)((Map)localObject1).get((String)localObject3 + ".cover_235_1");
            if (((((p)localObject2).type != 5) && (!bo.isNullOrNil(paramString))) || (bo.isNullOrNil(((p)localObject2).fjx)))
              ((p)localObject2).fjx = paramString;
            ((p)localObject2).fjO = ((String)((Map)localObject1).get((String)localObject3 + ".cover_1_1"));
            ((p)localObject2).fjA = bo.getInt((String)((Map)localObject1).get((String)localObject3 + ".del_flag"), 0);
            ((p)localObject2).fjC = ((String)((Map)localObject1).get((String)localObject3 + ".weapp_username"));
            ((p)localObject2).fjD = ((String)((Map)localObject1).get((String)localObject3 + ".weapp_path"));
            ((p)localObject2).fjE = bo.getInt((String)((Map)localObject1).get((String)localObject3 + ".weapp_version"), 0);
            ((p)localObject2).fjF = bo.getInt((String)((Map)localObject1).get((String)localObject3 + ".weapp_state"), 0);
            ((p)localObject2).fjG = ((String)((Map)localObject1).get((String)localObject3 + ".weapp_appid"));
            ((p)localObject2).fjH = ((String)((Map)localObject1).get((String)localObject3 + ".weapp_image_url"));
            ((p)localObject2).fjI = ((String)((Map)localObject1).get((String)localObject3 + ".weapp_icon"));
            ((p)localObject2).fjJ = ((String)((Map)localObject1).get((String)localObject3 + ".weapp_nickname"));
            ((p)localObject2).fjK = ((String)((Map)localObject1).get((String)localObject3 + ".play_url"));
            ((p)localObject2).fjL = ((String)((Map)localObject1).get((String)localObject3 + ".player"));
            ((p)localObject2).fjM = bo.getInt((String)((Map)localObject1).get((String)localObject3 + ".music_source"), 1);
            ((p)localObject2).fjN = bo.getInt((String)((Map)localObject1).get((String)localObject3 + ".pic_num"), 1);
            ((p)localObject2).videoWidth = bo.getInt((String)((Map)localObject1).get((String)localObject3 + ".video_width"), 0);
            ((p)localObject2).videoHeight = bo.getInt((String)((Map)localObject1).get((String)localObject3 + ".video_height"), 0);
            ((p)localObject2).fgd = ((String)((Map)localObject1).get((String)localObject3 + ".vid"));
            localo.fjr.add(localObject2);
            j++;
            break;
          }
        }
        localo.fgf = com.tencent.mm.aj.j.o((Map)localObject1);
        paramString = bo.nullAsNil((String)((Map)localObject1).get(".msg.fromusername"));
        if (!bo.isNullOrNil(paramString))
        {
          localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString).Oi();
          localo.cMg = paramString;
          localo.cMh = ((String)localObject1);
        }
        if (paramLong > 0L)
          emX.k(Long.valueOf(paramLong), localo);
        AppMethodBeat.o(11214);
        paramString = localo;
      }
    }
  }

  public static String c(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 0;
    AppMethodBeat.i(11219);
    int j = s.getSessionId();
    if ((paramString == null) || (!paramString.contains("mp.weixin.qq.com")) || ((j <= 0) && (paramInt2 < 0) && (paramInt1 < 0) && (paramInt3 <= 0)))
    {
      AppMethodBeat.o(11219);
      return paramString;
    }
    String str = "";
    int k = paramString.indexOf("#");
    Object localObject1;
    if (k > 0)
    {
      localObject1 = paramString.substring(0, k);
      str = paramString.substring(k);
    }
    while (true)
    {
      Object localObject2 = localObject1;
      if (!paramString.contains("?"))
      {
        localObject2 = (String)localObject1 + "?";
        i = 1;
      }
      paramString = (String)localObject2;
      if (paramInt1 >= 0)
      {
        paramString = ((String)localObject2).replaceAll("(scene=[\\d]*)", "");
        paramString = paramString + "&scene=" + paramInt1;
      }
      localObject2 = paramString;
      if (paramInt2 >= 0)
        localObject2 = paramString + "&subscene=" + paramInt2;
      localObject1 = localObject2;
      if (j > 0)
        localObject1 = (String)localObject2 + "&sessionid=" + j;
      paramString = (String)localObject1;
      if (paramInt3 > 0)
        paramString = (String)localObject1 + "&clicktime=" + paramInt3;
      localObject2 = paramString;
      if (i != 0)
        localObject2 = paramString.replace("?&", "?");
      paramString = (String)localObject2 + str;
      AppMethodBeat.o(11219);
      break;
      localObject1 = paramString;
    }
  }

  public static boolean c(long paramLong, String paramString)
  {
    AppMethodBeat.i(11217);
    boolean bool;
    if (paramString == null)
    {
      AppMethodBeat.o(11217);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramString = ((a)g.K(a.class)).b(paramLong, paramString);
      if (paramString == null)
      {
        ab.w("MicroMsg.AppMsgBizHelper", "isBizMsgForbidForward reader is null");
        AppMethodBeat.o(11217);
        bool = false;
      }
      else if (paramString.fjs == 1)
      {
        AppMethodBeat.o(11217);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(11217);
        bool = false;
      }
    }
  }

  public static String kr(int paramInt)
  {
    AppMethodBeat.i(11216);
    if ((paramInt <= 0) || (paramInt >= 86400L))
    {
      localObject = null;
      AppMethodBeat.o(11216);
      return localObject;
    }
    if (paramInt < 3600L);
    for (Object localObject = "mm:ss"; ; localObject = "HH:mm:ss")
    {
      localObject = new SimpleDateFormat((String)localObject);
      ((SimpleDateFormat)localObject).setTimeZone(TimeZone.getTimeZone("GMT+0:00"));
      localObject = ((SimpleDateFormat)localObject).format(Long.valueOf(paramInt * 1000L));
      AppMethodBeat.o(11216);
      break;
    }
  }

  public static boolean mg(String paramString)
  {
    AppMethodBeat.i(11211);
    boolean bool;
    if ((paramString != null) && (paramString.endsWith("@app")))
    {
      bool = true;
      AppMethodBeat.o(11211);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(11211);
    }
  }

  public static String mh(String paramString)
  {
    AppMethodBeat.i(11212);
    Map localMap = br.z(paramString, "msg");
    String str;
    if (localMap == null)
    {
      ab.e("MicroMsg.AppMsgBizHelper", "getAppMsgDyeingTempTitle fail, values is null");
      str = " ";
      AppMethodBeat.o(11212);
    }
    while (true)
    {
      return str;
      bo.getInt((String)localMap.get(".msg.appmsg.mmreader.template_detail.template_show_type"), 0);
      bo.bc((String)localMap.get(".msg.appmsg.ext_pay_info.pay_type"), "");
      str = bo.nullAsNil((String)localMap.get(".msg.appmsg.title"));
      paramString = str;
      if (bo.isNullOrNil(str))
        paramString = (String)localMap.get(".msg.appmsg.mmreader.category.item.title");
      str = paramString;
      if (bo.isNullOrNil(paramString))
        str = " ";
      AppMethodBeat.o(11212);
    }
  }

  public static String mi(String paramString)
  {
    AppMethodBeat.i(11213);
    paramString = be.amR(paramString);
    if (paramString == null)
    {
      Object localObject = new o();
      paramString = new StringBuilder("");
      Iterator localIterator = ((o)localObject).fjr.iterator();
      while (localIterator.hasNext())
      {
        localObject = (p)localIterator.next();
        if (!bo.isNullOrNil(((p)localObject).title))
          paramString.append(((p)localObject).title);
      }
      paramString = paramString.toString();
      AppMethodBeat.o(11213);
    }
    while (true)
    {
      return paramString;
      paramString = (String)paramString.get(".msg.appmsg.mmreader.category.item.title");
      if (paramString == null)
      {
        paramString = "";
        AppMethodBeat.o(11213);
      }
      else
      {
        AppMethodBeat.o(11213);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.af.l
 * JD-Core Version:    0.6.2
 */