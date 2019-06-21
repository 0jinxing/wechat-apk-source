package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.jj;
import com.tencent.mm.g.a.jj.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.n;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.a;
import com.tencent.mm.storage.z;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public final class aj
{
  private com.tencent.mm.storage.ad cFn;
  private Context context;
  private SimpleDateFormat juL;
  String mGM;
  List<bi> yIP;
  private String yLV;
  ArrayList<Uri> yLW;

  public aj(Context paramContext, List<bi> paramList, com.tencent.mm.storage.ad paramad)
  {
    AppMethodBeat.i(30962);
    this.yLV = null;
    this.cFn = null;
    this.juL = new SimpleDateFormat("yyyy-MM-dd");
    this.mGM = null;
    this.yLW = new ArrayList();
    this.context = paramContext;
    this.yIP = paramList;
    this.cFn = paramad;
    AppMethodBeat.o(30962);
  }

  private String aP(bi parambi)
  {
    AppMethodBeat.i(30965);
    String str = null;
    if (!com.tencent.mm.model.t.kH(this.cFn.field_username))
      str = s.mJ(parambi.field_talker);
    while (true)
    {
      if (parambi.field_isSend == 1)
      {
        ab.i("MicroMsg.OtherMailHistoryExporter", "isSend");
        str = r.YB();
      }
      long l = parambi.field_createTime;
      parambi = new SimpleDateFormat("HH:mm").format(new Date(l));
      Object localObject = new StringBuilder("");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append("  ");
      ((StringBuilder)localObject).append(parambi);
      parambi = ((StringBuilder)localObject).toString();
      AppMethodBeat.o(30965);
      return parambi;
      localObject = parambi.field_content;
      int i = bf.ox((String)localObject);
      if (i != -1)
        str = s.mJ(((String)localObject).substring(0, i).trim());
    }
  }

  private String dCM()
  {
    AppMethodBeat.i(30964);
    Object localObject;
    if (!com.tencent.mm.model.t.kH(this.cFn.field_username))
    {
      localObject = this.context.getString(2131302945);
      str1 = this.cFn.Oi();
      aw.ZK();
      str1 = String.format((String)localObject, new Object[] { str1, com.tencent.mm.model.c.Ry().get(4, null) });
      AppMethodBeat.o(30964);
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

  private String nd(long paramLong)
  {
    AppMethodBeat.i(30966);
    String str = this.juL.format(new Date(paramLong));
    AppMethodBeat.o(30966);
    return str;
  }

  public final String dCL()
  {
    AppMethodBeat.i(30963);
    if (this.mGM == null);
    Object localObject1;
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.OtherMailHistoryExporter", "export: history is null? %B, selectItems.size = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(this.yIP.size()) });
      if (this.mGM == null)
        break;
      localObject1 = this.mGM;
      AppMethodBeat.o(30963);
      return localObject1;
    }
    this.yLW.clear();
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(dCM());
    localStringBuilder.append("\n\n");
    Iterator localIterator = this.yIP.iterator();
    label115: bi localbi;
    if (localIterator.hasNext())
    {
      localbi = (bi)localIterator.next();
      if (this.yLV == null)
      {
        this.yLV = nd(localbi.field_createTime);
        localStringBuilder.append(String.format("—————  %s  —————\n\n", new Object[] { this.yLV }));
        localStringBuilder.append("\n");
        label187: if (!localbi.isText())
          break label414;
        if (!localbi.isText())
          break label409;
        if (localbi.field_isSend != 1)
          break label308;
        localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aP(localbi), localbi.field_content });
      }
    }
    label409: label414: 
    while (true)
    {
      localStringBuilder.append((String)localObject1);
      break label115;
      localObject1 = nd(localbi.field_createTime);
      if (((String)localObject1).equals(this.yLV))
        break label187;
      this.yLV = ((String)localObject1);
      localStringBuilder.append(String.format("—————  %s  —————\n\n", new Object[] { this.yLV }));
      localStringBuilder.append("\n");
      break label187;
      label308: if (!com.tencent.mm.model.t.kH(this.cFn.field_username))
      {
        localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aP(localbi), localbi.field_content });
      }
      else
      {
        int i = bf.ox(localbi.field_content);
        if (i != -1)
        {
          localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aP(localbi), localbi.field_content.substring(i + 1).trim() });
          continue;
          localObject1 = null;
          continue;
          Object localObject2;
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
              ab.d("MicroMsg.OtherMailHistoryExporter", "hdPath[%s]", new Object[] { localObject1 });
              if (!bo.isNullOrNil((String)localObject1))
              {
                localObject2 = "content://".concat(String.valueOf(localObject1));
                this.yLW.add(Uri.parse((String)localObject2));
                localObject1 = String.format("[%s: %s(%s)]", new Object[] { this.context.getString(2131299001), new File((String)localObject1).getName(), this.context.getString(2131298997) });
              }
            }
            for (localObject1 = String.format("%s\n\n%s\n\n", new Object[] { aP(localbi), localObject1 }); ; localObject1 = null)
            {
              localStringBuilder.append((String)localObject1);
              break;
            }
          }
          if (localbi.drD())
            localObject1 = String.format("[%s]", new Object[] { this.context.getString(2131299006) });
          while (true)
          {
            ab.i("MicroMsg.OtherMailHistoryExporter", "formatOtherMsg, msgStr = %s", new Object[] { localObject1 });
            localStringBuilder.append(String.format("%s\n\n%s\n\n", new Object[] { aP(localbi), localObject1 }));
            break label115;
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
              a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
              localObject1 = String.format("[%s]", new Object[] { ((jj)localObject1).cEG.cBp });
            }
            else if (localbi.bAA())
            {
              localObject1 = j.b.me(bo.anj(localbi.field_content));
              if (localObject1 != null)
              {
                switch (((j.b)localObject1).type)
                {
                case 5:
                default:
                case 4:
                case 6:
                }
                while (true)
                {
                  localObject2 = g.bT(((j.b)localObject1).appId, true);
                  if (localObject2 != null)
                    break label924;
                  localObject1 = "";
                  break;
                  localObject2 = am.aUq().aiE(((j.b)localObject1).csD);
                  if (localObject2 != null)
                  {
                    localObject2 = new File(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
                    if (((File)localObject2).exists())
                      this.yLW.add(Uri.fromFile((File)localObject2));
                  }
                }
                localObject2 = ((f)localObject2).field_appName;
                if (6 == ((j.b)localObject1).type)
                {
                  localObject1 = String.format("[%s: %s(%s)]", new Object[] { this.context.getString(2131298996), localObject2, this.context.getString(2131298997) });
                  continue;
                }
                localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(2131298996), localObject2 });
              }
            }
            else if (localbi.dtw())
            {
              aw.ZK();
              localObject1 = com.tencent.mm.model.c.XO().Rn(localbi.field_content).nickname;
              localObject1 = String.format("[%s: %s]", new Object[] { this.context.getString(2131298998), localObject1 });
            }
            else if (localbi.bws())
            {
              localObject1 = this.context.getString(2131299005);
              o.all();
              localObject2 = String.format("[%s: %s(%s)]", new Object[] { localObject1, new File(com.tencent.mm.modelvideo.t.uh(localbi.field_imgPath)).getName(), this.context.getString(2131298997) });
              o.all();
              File localFile = new File(com.tencent.mm.modelvideo.t.uh(localbi.field_imgPath));
              localObject1 = localObject2;
              if (localFile.exists())
              {
                this.yLW.add(Uri.fromFile(localFile));
                localObject1 = localObject2;
              }
            }
            else
            {
              if ((localbi.dtx()) || (localbi.dty()))
              {
                localObject1 = String.format("[%s]", new Object[] { this.context.getString(2131298999) });
                continue;
                localStringBuilder.append("\n\n");
                this.mGM = localStringBuilder.toString();
                localObject1 = this.mGM;
                AppMethodBeat.o(30963);
                break;
              }
              localObject1 = null;
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.aj
 * JD-Core Version:    0.6.2
 */