package com.tencent.mm.ui.chatting;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.jj;
import com.tencent.mm.g.a.jj.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.c;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class QQMailHistoryExporter
{
  private static final char[] iRk;
  private static final String[] iRl;
  private static final String yLX;
  private com.tencent.mm.storage.ad cFn = null;
  private Context context;
  private float eOg = 1.0F;
  private List<bi> yIP;
  private String yLV = null;

  static
  {
    AppMethodBeat.i(30975);
    yLX = "<img id=\"%d:%d\" src=\"%s\" height=\"100\" onclick=\"" + u.hL("weixin://img_onclick/", "this.id + '@@' + this.src") + "\"></img>";
    iRk = new char[] { 60, 62, 34, 39, 38, 10 };
    iRl = new String[] { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "<br />" };
    AppMethodBeat.o(30975);
  }

  public QQMailHistoryExporter(Context paramContext, List<bi> paramList, com.tencent.mm.storage.ad paramad)
  {
    this.context = paramContext;
    this.yIP = paramList;
    this.cFn = paramad;
  }

  private String aP(bi parambi)
  {
    AppMethodBeat.i(30973);
    String str = null;
    if (!com.tencent.mm.model.t.kH(this.cFn.field_username))
      str = s.mJ(parambi.field_talker);
    while (true)
    {
      if (parambi.field_isSend == 1)
      {
        ab.i("MicroMsg.QQMailHistoryExporter", "isSend");
        str = r.YB();
      }
      long l = parambi.field_createTime;
      parambi = new SimpleDateFormat("HH:mm").format(new Date(l));
      Object localObject = new StringBuilder("");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("  ");
      ((StringBuilder)localObject).append(parambi);
      parambi = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(30973);
      return parambi;
      localObject = parambi.field_content;
      int i = bf.ox((String)localObject);
      if (i != -1)
        str = s.mJ(((String)localObject).substring(0, i).trim());
    }
  }

  private static String ani(String paramString)
  {
    AppMethodBeat.i(30970);
    if (paramString == null)
    {
      paramString = "";
      AppMethodBeat.o(30970);
    }
    while (true)
    {
      return paramString;
      StringBuffer localStringBuffer = new StringBuffer();
      int i = paramString.length();
      int j = 0;
      if (j < i)
      {
        char c = paramString.charAt(j);
        int k = 1;
        for (int m = iRk.length - 1; ; m--)
        {
          int n = k;
          if (m >= 0)
          {
            if (iRk[m] == c)
            {
              localStringBuffer.append(iRl[m]);
              n = 0;
            }
          }
          else
          {
            if (n != 0)
              localStringBuffer.append(c);
            j++;
            break;
          }
        }
      }
      paramString = localStringBuffer.toString();
      AppMethodBeat.o(30970);
    }
  }

  private String dCM()
  {
    AppMethodBeat.i(30972);
    Object localObject;
    if (!com.tencent.mm.model.t.kH(this.cFn.field_username))
    {
      localObject = this.context.getString(2131302945);
      str1 = this.cFn.Oi();
      aw.ZK();
      str1 = String.format((String)localObject, new Object[] { str1, c.Ry().get(4, null) });
      AppMethodBeat.o(30972);
      return str1;
    }
    if (bo.isNullOrNil(this.cFn.field_nickname))
    {
      localObject = n.my(this.cFn.field_username).iterator();
      String str2;
      for (str1 = ""; ((Iterator)localObject).hasNext(); str1 = str1 + str2 + ", ")
        str2 = s.mJ((String)((Iterator)localObject).next());
    }
    for (String str1 = str1.substring(0, str1.length() - 2); ; str1 = this.cFn.Oi())
    {
      str1 = String.format(this.context.getString(2131302944), new Object[] { str1 });
      break;
    }
  }

  private static String nd(long paramLong)
  {
    AppMethodBeat.i(30974);
    String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date(paramLong));
    AppMethodBeat.o(30974);
    return str;
  }

  public final String dCL()
  {
    AppMethodBeat.i(30971);
    ab.i("MicroMsg.QQMailHistoryExporter", "selectItems.size = %d", new Object[] { Integer.valueOf(this.yIP.size()) });
    if (com.tencent.mm.bz.a.ga(this.context))
      this.eOg = com.tencent.mm.bz.a.dm(this.context);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("<div id=\"history\">\n");
    localStringBuilder.append(String.format("<p style=\"font-size:%fem;\">Dear:</p> <br> <p style=\"text-indent:2em; font-size:%fem;\">%s</p> <br>", new Object[] { Float.valueOf(this.eOg), Float.valueOf(this.eOg), dCM() }));
    Iterator localIterator = this.yIP.iterator();
    bi localbi;
    label191: Object localObject1;
    if (localIterator.hasNext())
    {
      localbi = (bi)localIterator.next();
      if (this.yLV == null)
      {
        this.yLV = nd(localbi.field_createTime);
        localStringBuilder.append(String.format("<p style=\"text-align:center; font-size:%fem;\"><span style=\"color:#b8b8b8;\">—————  %s  —————</span></p>\n \n", new Object[] { Float.valueOf(this.eOg), this.yLV }));
        if (!localbi.isText())
          break label493;
        if (!localbi.isText())
          break label487;
        if (localbi.field_isSend != 1)
          break label343;
        localObject1 = String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.eOg), aP(localbi), Float.valueOf(this.eOg), ani(localbi.field_content) });
      }
    }
    while (true)
    {
      localStringBuilder.append((String)localObject1);
      break;
      localObject1 = nd(localbi.field_createTime);
      if (((String)localObject1).equals(this.yLV))
        break label191;
      this.yLV = ((String)localObject1);
      localStringBuilder.append("<br>");
      localStringBuilder.append(String.format("<p style=\"text-align:center; font-size:%fem;\"><span style=\"color:#b8b8b8;\">—————  %s  —————</span></p>\n \n", new Object[] { Float.valueOf(this.eOg), this.yLV }));
      break label191;
      label343: if (!com.tencent.mm.model.t.kH(this.cFn.field_username))
      {
        localObject1 = String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.eOg), aP(localbi), Float.valueOf(this.eOg), ani(localbi.field_content) });
      }
      else
      {
        int i = bf.ox(localbi.field_content);
        if (i != -1)
        {
          localObject1 = String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.eOg), aP(localbi), Float.valueOf(this.eOg), ani(localbi.field_content.substring(i + 1).trim()) });
          continue;
          label487: localObject1 = null;
          continue;
          label493: Object localObject2;
          if (localbi.drE())
          {
            if (localbi.drE())
            {
              long l1 = localbi.field_msgId;
              long l2 = localbi.field_msgSvrId;
              localObject2 = ad.nb(l1);
              localObject1 = localObject2;
              if (bo.isNullOrNil((String)localObject2))
                localObject1 = ad.nc(l2);
              ab.d("MicroMsg.QQMailHistoryExporter", "hdPath[%s]", new Object[] { localObject1 });
              if (!bo.isNullOrNil((String)localObject1))
              {
                localObject2 = "file://".concat(String.valueOf(localObject1));
                localObject1 = String.format(yLX, new Object[] { Long.valueOf(localbi.field_msgId), Long.valueOf(localbi.field_msgSvrId), localObject2, localObject1 });
              }
            }
            for (localObject1 = String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.eOg), aP(localbi), Float.valueOf(this.eOg), localObject1 }); ; localObject1 = null)
            {
              localStringBuilder.append((String)localObject1);
              break;
            }
          }
          localObject1 = null;
          if (localbi.drD())
            localObject1 = String.format("[%s]", new Object[] { this.context.getString(2131299006) });
          while (true)
          {
            ab.d("MicroMsg.QQMailHistoryExporter", "formatOtherMsg, msgStr = %s", new Object[] { localObject1 });
            localStringBuilder.append(String.format("<p style=\"font-size:%fem;\"><b>%s</b></p>\n  <p style=\"font-size:%fem;\">%s</p>\n <p style=\"line-height:1.5em;\"></p>\n", new Object[] { Float.valueOf(this.eOg), aP(localbi), Float.valueOf(this.eOg), localObject1 }));
            break;
            if (localbi.dts())
            {
              if (localbi.field_isSend == 1)
                localObject1 = this.context.getString(2131299004);
              else
                localObject1 = this.context.getString(2131299003);
            }
            else if (localbi.bAC())
            {
              localObject1 = new jj();
              ((jj)localObject1).cEF.cEA = 1;
              ((jj)localObject1).cEF.csG = localbi;
              com.tencent.mm.sdk.b.a.xxA.m((b)localObject1);
              localObject1 = String.format("[%s]", new Object[] { ((jj)localObject1).cEG.cBp });
            }
            else if (localbi.bAA())
            {
              localObject2 = localbi.field_content;
              localObject1 = localObject2;
              if (com.tencent.mm.model.t.kH(this.cFn.field_username))
              {
                ab.d("MicroMsg.QQMailHistoryExporter", "chatroom msg, parse it");
                i = bf.ox(localbi.field_content);
                localObject1 = localObject2;
                if (i != -1)
                  localObject1 = localbi.field_content.substring(i + 1).trim();
              }
              localObject2 = j.b.me(bo.anj((String)localObject1));
              if (localObject2 == null)
              {
                ab.w("MicroMsg.QQMailHistoryExporter", "appmsg content is null");
                localObject1 = String.format("[%s]", new Object[] { this.context.getString(2131298996) });
              }
              else
              {
                f localf = g.bT(((j.b)localObject2).appId, true);
                if ((localf == null) || (bo.isNullOrNil(localf.field_appName)));
                for (localObject1 = ((j.b)localObject2).appName; ; localObject1 = localf.field_appName)
                {
                  localObject1 = g.b(this.context, localf, (String)localObject1);
                  if (!localbi.dtz())
                    break label1143;
                  if (!bo.isNullOrNil((String)localObject1))
                    break label1112;
                  localObject1 = ani(((j.b)localObject2).title);
                  break;
                }
                label1112: localObject1 = String.format("[%s: %s]", new Object[] { localObject1, ani(((j.b)localObject2).title) });
                continue;
                label1143: if (localbi.dtA())
                {
                  localObject1 = ad.a(localbi, (j.b)localObject2);
                  if (!bo.isNullOrNil((String)localObject1))
                  {
                    localObject2 = "file://".concat(String.valueOf(localObject1));
                    localObject1 = String.format(yLX, new Object[] { Long.valueOf(localbi.field_msgId), Long.valueOf(localbi.field_msgSvrId), localObject2, localObject1 });
                  }
                }
                else
                {
                  switch (((j.b)localObject2).type)
                  {
                  case 7:
                  default:
                    localObject1 = String.format("[%s]", new Object[] { this.context.getString(2131298996) });
                    break;
                  case 3:
                    if (bo.isNullOrNil(((j.b)localObject2).description))
                    {
                      localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(2131299002), ani(((j.b)localObject2).title) });
                      continue;
                    }
                    localObject1 = String.format("[%s: %s-%s]", new Object[] { this.context.getString(2131299002), ani(((j.b)localObject2).title), ani(((j.b)localObject2).description) });
                    break;
                  case 8:
                    localObject1 = String.format("[%s]", new Object[] { this.context.getString(2131298999) });
                    break;
                  case 6:
                    if (bo.isNullOrNil(((j.b)localObject2).description))
                    {
                      localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(2131299000), ani(((j.b)localObject2).title) });
                      continue;
                    }
                    localObject1 = String.format("[%s: %s-%s(%s)]", new Object[] { this.context.getString(2131299000), ani(((j.b)localObject2).title), ani(((j.b)localObject2).description), this.context.getString(2131298997) });
                    break;
                  case 2:
                    localObject1 = ad.a(localbi, (j.b)localObject2);
                    if (bo.isNullOrNil((String)localObject1))
                      break label1910;
                    localObject2 = "file://".concat(String.valueOf(localObject1));
                    localObject1 = String.format(yLX, new Object[] { Long.valueOf(localbi.field_msgId), Long.valueOf(localbi.field_msgSvrId), localObject2, localObject1 });
                    break;
                  case 1:
                    if (bo.isNullOrNil((String)localObject1))
                    {
                      localObject1 = ani(((j.b)localObject2).title);
                      continue;
                    }
                    localObject1 = String.format("[%s: %s]", new Object[] { localObject1, ani(((j.b)localObject2).title) });
                    break;
                  case 4:
                  case 5:
                    localObject1 = String.format("[%s: %s]", new Object[] { ani(((j.b)localObject2).title), ani(((j.b)localObject2).url) });
                    break;
                  }
                }
              }
            }
            else if (localbi.dtw())
            {
              aw.ZK();
              localObject1 = c.XO().Rn(localbi.field_content).nickname;
              localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(2131298998), localObject1 });
            }
            else if (localbi.bws())
            {
              localObject1 = this.context.getString(2131299005);
              o.all();
              localObject1 = String.format("[%s: %s(%s)]", new Object[] { localObject1, new File(com.tencent.mm.modelvideo.t.uh(localbi.field_imgPath)).getName(), this.context.getString(2131298997) });
            }
            else if ((localbi.dtx()) || (localbi.dty()))
            {
              localObject1 = String.format("[%s]", new Object[] { this.context.getString(2131298999) });
              continue;
              localStringBuilder.append("\n</div>\n");
              localObject1 = localStringBuilder.toString();
              AppMethodBeat.o(30971);
              return localObject1;
              label1910: localObject1 = "";
            }
          }
        }
        else
        {
          localObject1 = null;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.QQMailHistoryExporter
 * JD-Core Version:    0.6.2
 */