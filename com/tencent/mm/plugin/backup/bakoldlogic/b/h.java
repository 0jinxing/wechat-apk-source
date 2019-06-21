package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.plugin.backup.bakoldlogic.a.a;
import com.tencent.mm.plugin.backup.bakoldlogic.d.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
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

public final class h
  implements j
{
  byte[] jvw;
  byte[] jvx;

  public h()
  {
    AppMethodBeat.i(17796);
    this.jvw = new byte[] { 35, 33, 65, 77, 82, 10, 2, 35, 33 };
    this.jvx = new byte[] { 35, 33, 65, 77, 82, 10, 35, 33 };
    AppMethodBeat.o(17796);
  }

  private static String d(bi parambi, int paramInt)
  {
    String str = null;
    AppMethodBeat.i(17800);
    Object localObject;
    if (bo.isNullOrNil(parambi.field_content))
    {
      AppMethodBeat.o(17800);
      localObject = str;
    }
    while (true)
    {
      return localObject;
      n localn = new n(parambi.field_content);
      StringWriter localStringWriter = new StringWriter();
      try
      {
        XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
        localXmlSerializer.setOutput(localStringWriter);
        localXmlSerializer.startTag(null, "msg");
        localXmlSerializer.startTag(null, "voicemsg");
        localXmlSerializer.attribute(null, "length", String.valueOf(paramInt));
        localXmlSerializer.attribute(null, "endflag", "1");
        localXmlSerializer.attribute(null, "cancelflag", "0");
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localXmlSerializer.attribute(null, "voicelength", localn.time);
        if (!bo.isNullOrNil(localn.fWW))
          localXmlSerializer.attribute(null, "fromusername", localn.fWW);
        if (localn.fWX);
        for (localObject = "1"; ; localObject = "0")
        {
          localXmlSerializer.attribute(null, "isPlayed", (String)localObject);
          localXmlSerializer.endTag(null, "voicemsg");
          localXmlSerializer.endTag(null, "msg");
          localXmlSerializer.endDocument();
          localStringWriter.flush();
          localStringWriter.close();
          str = localStringWriter.getBuffer().toString();
          localObject = str;
          if (d.kH(parambi.field_talker))
            localObject = localn.fWW + ":\n" + str;
          ab.i("MicroMsg.BakOldItemVoice", "parseContent xml:".concat(String.valueOf(localObject)));
          AppMethodBeat.o(17800);
          break;
        }
      }
      catch (Exception parambi)
      {
        ab.e("MicroMsg.BakOldItemVoice", "packetVoice xml error: " + parambi.toString());
        AppMethodBeat.o(17800);
        localObject = str;
      }
    }
  }

  private static boolean g(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    boolean bool = false;
    AppMethodBeat.i(17799);
    if (bo.cb(paramArrayOfByte2))
      AppMethodBeat.o(17799);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= paramArrayOfByte1.length)
          break label55;
        if (paramArrayOfByte1[i] != paramArrayOfByte2[i])
        {
          AppMethodBeat.o(17799);
          break;
        }
      }
      label55: bool = true;
      AppMethodBeat.o(17799);
    }
  }

  public final int a(gu paramgu, bi parambi, LinkedList<com.tencent.mm.plugin.backup.i.u> paramLinkedList)
  {
    int i = 0;
    AppMethodBeat.i(17797);
    String str = d.Fn(parambi.field_imgPath);
    if (bo.isNullOrNil(str))
      AppMethodBeat.o(17797);
    while (true)
    {
      return i;
      com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(str);
      if (!localb.exists())
      {
        AppMethodBeat.o(17797);
      }
      else
      {
        int j = (int)localb.length();
        int k = i.a(new i.a(str, paramgu, paramLinkedList, 9, false, null));
        parambi = d(parambi, j);
        if (parambi == null)
        {
          AppMethodBeat.o(17797);
        }
        else
        {
          paramgu.vED = new bts().alV(parambi);
          i = k + parambi.length();
          if (j == 0)
            AppMethodBeat.o(17797);
          else
            AppMethodBeat.o(17797);
        }
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17798);
    Object localObject = paramgu.vED.wVI;
    paramString = (String)localObject;
    int i;
    if (d.kH(paramgu.vEB.wVI))
    {
      i = d.ox((String)localObject);
      if (i == -1)
      {
        paramString = (String)localObject;
        ab.v("MicroMsg.BakOldItemVoice", "chatroom voicemsg, new content=".concat(String.valueOf(paramString)));
      }
    }
    else
    {
      localObject = br.z(paramString, "msg");
      if (localObject == null)
        break label320;
    }
    label418: 
    while (true)
    {
      try
      {
        i = a.bC((String)((Map)localObject).get(".msg.voicemsg.$voicelength"), 0);
        paramString = (String)((Map)localObject).get(".msg.voicemsg.$fromusername");
        if (a.bC((String)((Map)localObject).get(".msg.voicemsg.$isPlayed"), 1) == 1)
        {
          bool = true;
          parambi.setContent(n.d(paramString, i, bool));
          paramString = com.tencent.mm.modelvoice.u.uY(paramgu.vEB.wVI);
          parambi.jv(paramString);
          d.l(parambi);
          paramString = d.Fn(paramString);
          if (paramgu.vJf != 9)
            break label418;
          parambi = paramgu.vJd.getBuffer().wR;
          if (!g(this.jvw, parambi))
            break label356;
          localObject = new byte[parambi.length - 6];
          System.arraycopy(parambi, 6, localObject, 0, parambi.length - 6);
          paramgu.vJe = (parambi.length - 6);
          paramgu.vJd = new SKBuiltinBuffer_t().setBuffer((byte[])localObject);
          if (paramString != null)
            break label531;
          AppMethodBeat.o(17798);
          return 0;
          paramString = (String)localObject;
          if (i + 2 >= ((String)localObject).length())
            break;
          paramString = ((String)localObject).substring(i + 2);
          break;
        }
        boolean bool = false;
        continue;
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.BakOldItemVoice", "parsing voice msg xml failed");
        ab.printErrStackTrace("MicroMsg.BakOldItemVoice", paramString, "", new Object[0]);
        continue;
      }
      label320: ab.e("MicroMsg.BakOldItemVoice", "voicemsg paseXml failed:%s", new Object[] { paramgu.vED.wVI });
      parambi.setContent(paramgu.vED.wVI);
      continue;
      label356: if (g(this.jvx, parambi))
      {
        localObject = new byte[parambi.length - 6];
        System.arraycopy(parambi, 6, localObject, 0, parambi.length - 6);
        paramgu.vJe = (parambi.length - 6);
        paramgu.vJd = new SKBuiltinBuffer_t().setBuffer((byte[])localObject);
      }
      else
      {
        parambi = a.a(paramgu, 9);
        if (!bo.isNullOrNil(parambi))
        {
          parambi = a.Fp(parambi);
          if (e.ct(parambi))
          {
            localObject = e.e(parambi, 0, 9);
            if (g(this.jvw, (byte[])localObject))
            {
              localObject = e.e(parambi, 6, -1);
              e.deleteFile(parambi);
              e.b(parambi, (byte[])localObject, localObject.length);
            }
            else if (g(this.jvx, (byte[])localObject))
            {
              localObject = e.e(parambi, 6, -1);
              e.deleteFile(parambi);
              e.b(parambi, (byte[])localObject, localObject.length);
              continue;
              if (a.b(paramgu, 9, paramString))
              {
                AppMethodBeat.o(17798);
              }
              else
              {
                paramgu = a.a(paramgu, 9);
                if (paramgu != null)
                {
                  paramgu = a.Fp(paramgu);
                  ab.d("MicroMsg.BakOldItemVoice", "recover Frome Sdcard".concat(String.valueOf(paramgu)));
                  e.y(paramgu, paramString);
                }
                AppMethodBeat.o(17798);
              }
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.h
 * JD-Core Version:    0.6.2
 */