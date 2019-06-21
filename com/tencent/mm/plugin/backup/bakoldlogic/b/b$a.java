package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.o;
import com.tencent.mm.af.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.biz.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

final class b$a
{
  public static String jrk = "<msg>";
  public static String jrl = "</msg>";
  public static String jvr = "]]>";

  public static String Fh(String paramString)
  {
    AppMethodBeat.i(17777);
    o localo = ((a)g.K(a.class)).b(0L, paramString);
    b.a.a locala = new b.a.a(paramString);
    if (!locala.bYN)
    {
      ab.e("MicroMsg.AppmsgConvert", "buffer error");
      paramString = "";
      AppMethodBeat.o(17777);
    }
    while (true)
    {
      return paramString;
      b.a.b localb = new b.a.b();
      Object localObject1 = localo.fjr;
      Object localObject2 = new HashMap();
      localb.Fi("msg");
      ((Map)localObject2).put("appid", (String)locala.jvs.get(".msg.appmsg.$appid"));
      ((Map)localObject2).put("sdkver", (String)locala.jvs.get(".msg.appmsg.$sdkver"));
      localb.m("appmsg", (Map)localObject2);
      paramString = (String)localObject1;
      if (localObject1 == null)
        paramString = new LinkedList();
      Object localObject3;
      String str1;
      int i;
      if (paramString.size() == 0)
      {
        localObject3 = "";
        str1 = "";
        localObject1 = "";
        localb.cY("title", (String)localObject3);
        localb.cY("des", (String)locala.jvs.get(".msg.appmsg.des"));
        localb.cY("action", (String)locala.jvs.get(".msg.appmsg.action"));
        localb.bE("type", locala.getInt(".msg.appmsg.type"));
        localb.bE("showtype", locala.getInt(".msg.appmsg.showtype"));
        localb.cY("content", (String)locala.jvs.get(".msg.appmsg.content"));
        localb.cY("url", str1);
        localb.cY("lowurl", (String)locala.jvs.get(".msg.appmsg.lowurl"));
        localb.Fi("appattach");
        localb.bE("totallen", locala.getInt(".msg.appmsg.appattach.totallen"));
        localb.cY("attachid", (String)locala.jvs.get(".msg.appmsg.appattach.attachid"));
        localb.cY("fileext", (String)locala.jvs.get(".msg.appmsg.appattach.fileext"));
        localb.Fj("appattach");
        localb.Fi("mmreader");
        ((Map)localObject2).put("type", localo.type);
        ((Map)localObject2).put("convMsgCount", paramString.size());
        localb.m("category", (Map)localObject2);
        localb.cY("name", localo.cMh);
        localb.Fi("topnew");
        localb.cY("cover", (String)locala.jvs.get(".msg.appmsg.mmreader.category.topnew.cover"));
        localb.cY("width", (String)locala.jvs.get(".msg.appmsg.mmreader.category.topnew.width"));
        localb.cY("height", (String)locala.jvs.get(".msg.appmsg.mmreader.category.topnew.height"));
        localb.cY("digest", (String)localObject1);
        localb.Fj("topnew");
        i = 0;
        label525: if (i >= paramString.size())
          break label951;
        localb.Fi("item");
        if (paramString.get(i) != null)
        {
          String str2 = ((p)paramString.get(i)).title;
          localObject2 = ((p)paramString.get(i)).url;
          localObject1 = ((p)paramString.get(i)).fjv;
          String str3 = ((p)paramString.get(i)).fjw;
          String str4 = ((p)paramString.get(i)).time;
          String str5 = ((p)paramString.get(i)).fjx;
          localObject3 = ((p)paramString.get(i)).fjy;
          str1 = ((p)paramString.get(i)).fjz;
          localb.cY("title", str2);
          localb.cY("url", (String)localObject2);
          localb.cY("shorturl", (String)localObject1);
          localb.cY("longurl", str3);
          localb.cY("pub_time", str4);
          localb.cY("cover", str5);
          localb.cY("tweetid", (String)localObject3);
          localb.cY("digest", str1);
          localObject3 = new StringBuilder(".msg.appmsg.mmreader.category.item");
          if (i != 0)
            break label941;
        }
      }
      label941: for (localObject1 = ""; ; localObject1 = String.valueOf(i))
      {
        localObject1 = (String)localObject1;
        localb.cY("fileid", (String)locala.jvs.get((String)localObject1 + ".fileid"));
        localb.Fi("source");
        localb.Fi("source");
        localb.cY("name", localo.cMh);
        localb.Fj("source");
        localb.Fj("source");
        localb.Fj("item");
        i++;
        break label525;
        localObject3 = ((p)paramString.get(0)).title;
        str1 = ((p)paramString.get(0)).url;
        paramString.get(0);
        localObject1 = ((p)paramString.get(0)).fjz;
        break;
      }
      label951: localb.Fj("category");
      localb.Fi("publisher");
      localb.cY("convName", localo.cMg);
      localb.cY("nickname", localo.cMh);
      localb.Fj("publisher");
      localb.Fj("mmreader");
      localb.Fj("appmsg");
      localb.cY("fromusername", localo.cMg);
      localb.bE("scene", locala.getInt(".msg.scene"));
      localb.Fi("appinfo");
      localb.cY("version", (String)locala.jvs.get(".msg.appinfo.appname"));
      localb.cY("appname", (String)locala.jvs.get(".msg.appinfo.version"));
      localb.Fj("appinfo");
      localb.cY("commenturl", localo.dJv);
      localb.Fj("msg");
      ab.d("MicroMsg.AppmsgConvert", "xml " + localb.jvt.toString());
      paramString = localb.jvt.toString();
      AppMethodBeat.o(17777);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.b.a
 * JD-Core Version:    0.6.2
 */