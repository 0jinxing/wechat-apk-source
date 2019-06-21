package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.plugin.backup.h.c;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class g
  implements l
{
  byte[] jvw;
  byte[] jvx;

  public g()
  {
    AppMethodBeat.i(17462);
    this.jvw = new byte[] { 35, 33, 65, 77, 82, 10, 2, 35, 33 };
    this.jvx = new byte[] { 35, 33, 65, 77, 82, 10, 35, 33 };
    AppMethodBeat.o(17462);
  }

  private static String d(bi parambi, int paramInt)
  {
    String str = null;
    AppMethodBeat.i(17466);
    Object localObject;
    if (bo.isNullOrNil(parambi.field_content))
    {
      AppMethodBeat.o(17466);
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
          if (c.kH(parambi.field_talker))
            localObject = localn.fWW + ":\n" + str;
          ab.i("MicroMsg.BackupItemVoice", "parseContent xml:%s", new Object[] { localObject });
          AppMethodBeat.o(17466);
          break;
        }
      }
      catch (Exception parambi)
      {
        ab.e("MicroMsg.BackupItemVoice", "packetVoice xml error: " + parambi.toString());
        AppMethodBeat.o(17466);
        localObject = str;
      }
    }
  }

  private static boolean g(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    boolean bool = false;
    AppMethodBeat.i(17465);
    if (bo.cb(paramArrayOfByte2))
      AppMethodBeat.o(17465);
    while (true)
    {
      return bool;
      for (int i = 0; ; i++)
      {
        if (i >= paramArrayOfByte1.length)
          break label55;
        if (paramArrayOfByte1[i] != paramArrayOfByte2[i])
        {
          AppMethodBeat.o(17465);
          break;
        }
      }
      label55: bool = true;
      AppMethodBeat.o(17465);
    }
  }

  public final int a(gu paramgu, boolean paramBoolean1, bi parambi, String paramString, LinkedList<com.tencent.mm.plugin.backup.i.u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    AppMethodBeat.i(17463);
    paramHashMap = c.Fn(parambi.field_imgPath);
    int i;
    if (bo.isNullOrNil(paramHashMap))
    {
      i = 0;
      AppMethodBeat.o(17463);
    }
    while (true)
    {
      return i;
      paramString = new b(paramHashMap);
      if (!paramString.exists())
      {
        i = 0;
        AppMethodBeat.o(17463);
      }
      else
      {
        i = (int)paramString.length();
        if (paramBoolean1)
        {
          AppMethodBeat.o(17463);
        }
        else
        {
          int j = i.a(new i.a(paramHashMap, paramgu, paramLinkedList, 9, paramBoolean2, paramBoolean2, null));
          parambi = d(parambi, i);
          if (parambi == null)
          {
            i = 0;
            AppMethodBeat.o(17463);
          }
          else
          {
            paramgu.vED = new bts().alV(parambi);
            j += parambi.length();
            if (i == 0)
            {
              AppMethodBeat.o(17463);
              i = j;
            }
            else
            {
              AppMethodBeat.o(17463);
              i = j;
            }
          }
        }
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17464);
    Object localObject = paramgu.vED.wVI;
    paramString = (String)localObject;
    int i;
    if (c.kH(paramgu.vEB.wVI))
    {
      i = c.ox((String)localObject);
      if (i == -1)
      {
        paramString = (String)localObject;
        ab.v("MicroMsg.BackupItemVoice", "recover, voiceContentXml:%s", new Object[] { paramString });
      }
    }
    else
    {
      paramString = br.z(paramString, "msg");
      if (paramString == null)
        break label335;
    }
    label410: 
    while (true)
    {
      try
      {
        i = com.tencent.mm.plugin.backup.b.g.bC((String)paramString.get(".msg.voicemsg.$voicelength"), 0);
        localObject = (String)paramString.get(".msg.voicemsg.$fromusername");
        int j = com.tencent.mm.plugin.backup.b.g.bC((String)paramString.get(".msg.voicemsg.$isPlayed"), 1);
        long l = i;
        if (j == 1)
        {
          bool = true;
          parambi.setContent(n.d((String)localObject, l, bool));
          paramString = com.tencent.mm.modelvoice.u.uY(paramgu.vEB.wVI);
          parambi.jv(paramString);
          c.l(parambi);
          paramString = c.Fn(paramString);
          parambi = com.tencent.mm.plugin.backup.b.g.a(paramgu, 9);
          if (!bo.isNullOrNil(parambi))
          {
            parambi = com.tencent.mm.plugin.backup.b.g.Fa(parambi) + parambi;
            if (e.ct(parambi))
            {
              localObject = e.e(parambi, 0, 9);
              if (!g(this.jvw, (byte[])localObject))
                break label371;
              localObject = e.e(parambi, 6, -1);
              e.deleteFile(parambi);
              e.b(parambi, (byte[])localObject, localObject.length);
            }
          }
          if (paramString != null)
            break label410;
          AppMethodBeat.o(17464);
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
        ab.e("MicroMsg.BackupItemVoice", "parsing voice msg xml failed");
        ab.printErrStackTrace("MicroMsg.BackupItemVoice", paramString, "", new Object[0]);
        continue;
      }
      label335: ab.e("MicroMsg.BackupItemVoice", "voicemsg paseXml failed:%s", new Object[] { paramgu.vED.wVI });
      parambi.setContent(paramgu.vED.wVI);
      continue;
      label371: if (g(this.jvx, (byte[])localObject))
      {
        localObject = e.e(parambi, 6, -1);
        e.deleteFile(parambi);
        e.b(parambi, (byte[])localObject, localObject.length);
        continue;
        if (com.tencent.mm.plugin.backup.b.g.b(paramgu, 9, paramString))
        {
          AppMethodBeat.o(17464);
        }
        else
        {
          paramgu = com.tencent.mm.plugin.backup.b.g.a(paramgu, 9);
          if (paramgu != null)
          {
            paramgu = com.tencent.mm.plugin.backup.b.g.Fa(paramgu) + paramgu;
            ab.d("MicroMsg.BackupItemVoice", "recover from path:%s", new Object[] { paramgu });
            e.y(paramgu, paramString);
          }
          AppMethodBeat.o(17464);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.g
 * JD-Core Version:    0.6.2
 */