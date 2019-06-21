package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvideo.q;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.plugin.backup.bakoldlogic.a.a;
import com.tencent.mm.plugin.backup.bakoldlogic.d.c;
import com.tencent.mm.plugin.backup.bakoldlogic.d.d;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class g
  implements j
{
  private static String a(gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17795);
    s locals = d.Fm(parambi.field_imgPath);
    if (locals == null)
    {
      AppMethodBeat.o(17795);
      paramgu = null;
    }
    while (true)
    {
      return paramgu;
      if (parambi.getType() == 62);
      for (int i = 62; ; i = 43)
      {
        paramgu.jCt = i;
        if (!bo.isNullOrNil(parambi.field_content))
          break label72;
        AppMethodBeat.o(17795);
        paramgu = null;
        break;
      }
      label72: StringWriter localStringWriter;
      if (d.kH(parambi.field_talker))
      {
        paramgu = locals.alt();
        localStringWriter = new StringWriter();
      }
      try
      {
        parambi = XmlPullParserFactory.newInstance().newSerializer();
        parambi.setOutput(localStringWriter);
        parambi.startTag(null, "msg");
        parambi.startTag(null, "videomsg");
        Object localObject = br.z(locals.alw(), "msg");
        if (localObject != null)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "aeskey", (String)((Map)localObject).get(".msg.videomsg.$aeskey"));
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "cdnthumbaeskey", (String)((Map)localObject).get(".msg.videomsg.$cdnthumbaeskey"));
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "cdnvideourl", (String)((Map)localObject).get(".msg.videomsg.$cdnvideourl"));
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "cdnthumburl", (String)((Map)localObject).get(".msg.videomsg.$cdnthumburl"));
          localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          parambi.attribute(null, "cdnthumblength", (String)((Map)localObject).get(".msg.videomsg.$cdnthumblength"));
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        parambi.attribute(null, "playlength", locals.fXd);
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        parambi.attribute(null, "length", locals.frO);
        parambi.attribute(null, "type", String.valueOf(i));
        if (!bo.isNullOrNil(paramgu))
          parambi.attribute(null, "fromusername", paramgu);
        paramgu = new java/lang/StringBuilder;
        paramgu.<init>();
        parambi.attribute(null, "md5", locals.cMW);
        parambi.endTag(null, "videomsg");
        parambi.endTag(null, "msg");
        parambi.endDocument();
        localStringWriter.flush();
        localStringWriter.close();
        paramgu = localStringWriter.getBuffer().toString();
        ab.d("MicroMsg.BakOldItemVideo", "parseContent xml:".concat(String.valueOf(paramgu)));
        AppMethodBeat.o(17795);
        continue;
        paramgu = paramgu.vEB.wVI;
      }
      catch (Exception paramgu)
      {
        ab.e("MicroMsg.BakOldItemVideo", "packetVoice xml error: " + paramgu.toString());
        AppMethodBeat.o(17795);
        paramgu = null;
      }
    }
  }

  public final int a(gu paramgu, bi parambi, LinkedList<u> paramLinkedList)
  {
    AppMethodBeat.i(17793);
    com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().all();
    String str1 = t.uh(parambi.field_imgPath);
    Object localObject = d.Fm(parambi.field_imgPath);
    int i;
    if ((localObject == null) || (((s)localObject).status == 199))
    {
      i = 1;
      localObject = new com.tencent.mm.vfs.b(str1);
      if ((i == 0) || (!((com.tencent.mm.vfs.b)localObject).exists()))
        break label329;
    }
    label174: label326: label329: for (int j = (int)((com.tencent.mm.vfs.b)localObject).length(); ; j = 0)
    {
      int k = 0;
      com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().all();
      String str2 = t.ui(parambi.field_imgPath);
      localObject = new com.tencent.mm.vfs.b(str2);
      if (((com.tencent.mm.vfs.b)localObject).exists())
        k = (int)((com.tencent.mm.vfs.b)localObject).length();
      int m = 0;
      if (k != 0)
      {
        if (parambi.getType() == 62)
          m = i.a(new i.a(str2, paramgu, paramLinkedList, 13, "_thumb")) + 0;
      }
      else
      {
        if ((i == 0) || (j == 0))
          break label326;
        if (parambi.getType() != 62)
          break label267;
        m = i.a(new i.a(str1, paramgu, paramLinkedList, 12, false, null)) + m;
      }
      while (true)
      {
        label216: parambi = a(paramgu, parambi);
        if (parambi == null)
          AppMethodBeat.o(17793);
        while (true)
        {
          return m;
          i = 0;
          break;
          m = i.a(new i.a(str2, paramgu, paramLinkedList, 11, "_thumb")) + 0;
          break label174;
          m = i.a(new i.a(str1, paramgu, paramLinkedList, 10, false, null)) + m;
          break label216;
          paramgu.vED = new bts().alV(parambi);
          m += parambi.length();
          AppMethodBeat.o(17793);
        }
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17794);
    paramString = new s();
    paramString.cIS = paramgu.vEB.wVI;
    paramString.createTime = parambi.field_createTime;
    paramString.cKK = paramgu.ptF;
    Object localObject = paramgu.vED.wVI;
    ab.d("MicroMsg.BakOldItemVideo", "parseVideoMsgXML content:".concat(String.valueOf(localObject)));
    localObject = br.z((String)localObject, "msg");
    if (localObject != null);
    while (true)
    {
      try
      {
        paramString.frO = a.bC((String)((Map)localObject).get(".msg.videomsg.$length"), 0);
        paramString.fXd = a.bC((String)((Map)localObject).get(".msg.videomsg.$playlength"), 0);
        paramString.fWW = ((String)((Map)localObject).get(".msg.videomsg.$fromusername"));
        int i = a.bC((String)((Map)localObject).get(".msg.videomsg.$type"), 0);
        ab.d("MicroMsg.BakOldItemVideo", "video msg exportType :".concat(String.valueOf(i)));
        if (i == 44)
        {
          i = 1;
          paramString.fXh = i;
          if ((!a.d(paramgu, 10)) && (!a.d(paramgu, 12)))
            break label538;
          paramString.status = 199;
          localObject = t.ug(paramString.alt());
          parambi.jv((String)localObject);
          paramString.fileName = ((String)localObject);
          if (parambi.getType() != 62)
            parambi.setType(43);
          parambi.setContent(q.d(paramString.alt(), paramString.fXc, false));
          paramString.fXe = ((int)d.l(parambi));
          paramString.fXb = bo.anT();
          paramString.fXf = 0;
          ab.d("MicroMsg.BakOldItemVideo", "Insert fileName[" + paramString.getFileName() + "] size:" + paramString.frO + " svrid:" + paramString.cKK + " timelen:" + paramString.fXd + " user:" + paramString.getUser() + " human:" + paramString.alt());
          com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().all().b(paramString);
          com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().all();
          paramString = t.ui((String)localObject);
          if (parambi.getType() != 62)
            break label547;
          a.b(paramgu, 13, paramString);
          paramString = a.a(paramgu, 12);
          if (paramString != null)
          {
            paramString = a.Fp(paramString);
            com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().all();
            e.y(paramString, t.uh((String)localObject));
          }
          AppMethodBeat.o(17794);
          return 0;
        }
        i = 0;
        continue;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.BakOldItemVideo", "parsing voice msg xml failed");
        ab.printErrStackTrace("MicroMsg.BakOldItemVideo", localException, "", new Object[0]);
        continue;
      }
      ab.e("MicroMsg.BakOldItemVideo", "videomsg paseXml failed:%s", new Object[] { paramgu.vED.wVI });
      parambi.setContent(paramgu.vED.wVI);
      continue;
      label538: paramString.status = 111;
      continue;
      label547: a.b(paramgu, 11, paramString);
      paramString = a.a(paramgu, 10);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.g
 * JD-Core Version:    0.6.2
 */