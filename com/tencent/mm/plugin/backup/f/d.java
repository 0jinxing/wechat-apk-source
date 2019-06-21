package com.tencent.mm.plugin.backup.f;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.backup.h.c;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ad;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.bi;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashMap<Ljava.lang.Long;Lcom.tencent.mm.plugin.backup.f.h.a;>;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class d
  implements l
{
  private static String a(com.tencent.mm.at.e parame, bi parambi)
  {
    AppMethodBeat.i(17455);
    StringWriter localStringWriter = new StringWriter();
    XmlSerializer localXmlSerializer;
    try
    {
      localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
      localXmlSerializer.setOutput(localStringWriter);
      if (c.kH(parambi.field_talker))
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        localStringWriter.write(bf.oy(parambi.field_content) + ":\n");
      }
      localXmlSerializer.startTag(null, "msg");
      localXmlSerializer.startTag(null, "img");
      Object localObject = br.z(parame.fDK, "msg");
      if (localObject != null)
      {
        if (((Map)localObject).get(".msg.img.$aeskey") == null)
          localXmlSerializer.attribute(null, "aeskey", "");
        if (((Map)localObject).get(".msg.img.$encryver") == null)
          localXmlSerializer.attribute(null, "encryver", "");
        if (((Map)localObject).get(".msg.img.$cdnthumbaeskey") == null)
          localXmlSerializer.attribute(null, "cdnthumbaeskey", "");
        if (((Map)localObject).get(".msg.img.$cdnthumburl") == null)
          localXmlSerializer.attribute(null, "cdnthumburl", "");
        if (((Map)localObject).get(".msg.img.$cdnthumblength") == null)
          localXmlSerializer.attribute(null, "cdnthumblength", "10240");
        if (((Map)localObject).get(".msg.img.$cdnthumbheight") == null)
          localXmlSerializer.attribute(null, "cdnthumbheight", "0");
        if (((Map)localObject).get(".msg.img.$cdnthumbwidth") == null)
          localXmlSerializer.attribute(null, "cdnthumbwidth", "0");
        if (((Map)localObject).get(".msg.img.$cdnmidheight") == null)
          localXmlSerializer.attribute(null, "cdnmidheight", "0");
        if (((Map)localObject).get(".msg.img.$cdnmidwidth") == null)
          localXmlSerializer.attribute(null, "cdnmidwidth", "0");
        if (((Map)localObject).get(".msg.img.$cdnhdheight") == null)
          localXmlSerializer.attribute(null, "cdnhdheight", "0");
        if (((Map)localObject).get(".msg.img.$cdnhdwidth") == null)
          localXmlSerializer.attribute(null, "cdnhdwidth", "0");
        if (((Map)localObject).get(".msg.img.$cdnmidimgurl") == null)
          localXmlSerializer.attribute(null, "cdnmidimgurl", "");
        if (bo.getLong((String)((Map)localObject).get(".msg.img.$length"), 0L) == 0L)
        {
          StringBuilder localStringBuilder = new java/lang/StringBuilder;
          localStringBuilder.<init>();
          localXmlSerializer.attribute(null, "length", com.tencent.mm.vfs.e.asZ(com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().q(parame.fDz, "", "")));
        }
        if ((parambi.field_isSend != 1) || (parame.fDC == 1))
        {
          parame = new java/lang/StringBuilder;
          parame.<init>();
          localXmlSerializer.attribute(null, "cdnbigimgurl", (String)((Map)localObject).get(".msg.img.$cdnbigimgurl"));
          parame = new java/lang/StringBuilder;
          parame.<init>();
          localXmlSerializer.attribute(null, "hdlength", bo.getLong((String)((Map)localObject).get(".msg.img.$hdlength"), 0L));
        }
        ((Map)localObject).remove(".msg.img.$cdnbigimgurl");
        ((Map)localObject).remove(".msg.img.$hdlength");
        if (((Map)localObject).get(".msg.img.$md5") == null)
          localXmlSerializer.attribute(null, "md5", "");
        parambi = ((Map)localObject).keySet().iterator();
        while (parambi.hasNext())
        {
          parame = (String)parambi.next();
          if (parame.startsWith(".msg.img.$"))
            localXmlSerializer.attribute(null, parame.substring(10), (String)((Map)localObject).get(parame));
        }
      }
    }
    catch (Exception parame)
    {
      ab.e("MicroMsg.BackupItemImg", "packetImg xml error: " + parame.toString());
      AppMethodBeat.o(17455);
      parame = null;
    }
    while (true)
    {
      return parame;
      localXmlSerializer.endTag(null, "img");
      localXmlSerializer.endTag(null, "msg");
      localXmlSerializer.endDocument();
      localStringWriter.flush();
      localStringWriter.close();
      parame = localStringWriter.getBuffer().toString();
      ab.d("MicroMsg.BackupItemImg", "parseContent xml:%s", new Object[] { parame });
      AppMethodBeat.o(17455);
    }
  }

  public final int a(gu paramgu, boolean paramBoolean1, bi parambi, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    AppMethodBeat.i(17454);
    int i;
    if (bo.isNullOrNil(parambi.field_content))
    {
      i = 0;
      if (parambi.field_isSend == 1)
      {
        paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().fJ(parambi.field_msgId);
        if (paramString.fDy != 0L)
          break label973;
      }
      paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().fI(parambi.field_msgSvrId);
    }
    label312: label572: label973: 
    while (true)
    {
      paramHashMap = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().I(parambi.field_imgPath, true);
      int j = i;
      if (com.tencent.mm.vfs.e.ct(paramHashMap))
        j = i + i.a(new i.a(paramHashMap, paramgu, paramLinkedList, 1, paramBoolean1, "_thumb", paramBoolean2));
      Object localObject1;
      String str;
      Object localObject2;
      int k;
      if (parambi.field_isSend == 1)
      {
        localObject1 = "";
        str = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().q(paramString.fDz, "", "");
        localObject2 = localObject1;
        k = j;
        paramHashMap = paramString;
        if (paramString.agQ())
        {
          paramHashMap = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().ly(paramString.fDJ);
          if (paramHashMap == null)
            break label477;
          localObject2 = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().q(paramHashMap.fDz, "", "");
          ab.d("MicroMsg.BackupItemImg", "packet hd bigImgPath " + (String)localObject2 + " " + com.tencent.mm.vfs.e.asZ((String)localObject2));
          com.tencent.mm.vfs.e.asZ((String)localObject2);
          if (com.tencent.mm.vfs.e.ct((String)localObject2))
            k = j + i.a(new i.a((String)localObject2, paramgu, paramLinkedList, 3, paramBoolean1, "_hd", paramBoolean2));
        }
        else
        {
          com.tencent.mm.vfs.e.asZ(str);
          i = k;
          localObject1 = paramHashMap;
          if (!bo.isNullOrNil(str))
          {
            i = k;
            localObject1 = paramHashMap;
            if (!str.equals(localObject2))
            {
              ab.d("MicroMsg.BackupItemImg", "bigImgPath " + str + " " + com.tencent.mm.vfs.e.asZ(str));
              i = k + i.a(new i.a(str, paramgu, paramLinkedList, 2, paramBoolean1, paramBoolean2, null));
              localObject1 = paramHashMap;
            }
          }
          parambi = a((com.tencent.mm.at.e)localObject1, parambi);
          if (parambi != null)
            break label940;
          AppMethodBeat.o(17454);
        }
      }
      while (true)
      {
        return i;
        i = parambi.field_content.getBytes().length;
        break;
        ab.e("MicroMsg.BackupItemImg", "packet img.hasHdImg but hdbigImgPath has no file, hdbigImgPath:%s", new Object[] { localObject2 });
        k = j;
        break label312;
        label477: ab.e("MicroMsg.BackupItemImg", "packet img.hasHdImg but img is null");
        localObject2 = localObject1;
        k = j;
        break label312;
        i = j;
        localObject1 = paramString;
        if (!paramString.agP())
          break label419;
        str = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().q(paramString.fDz, "", "");
        localObject1 = "";
        if (paramString.agQ())
        {
          localObject2 = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().ly(paramString.fDJ);
          if (localObject2 != null)
          {
            if (localObject2 != null)
              ab.i("MicroMsg.BackupItemImg", "packet receive img hdinfo, offset[%d], totalLen[%d], compressType[%d], path:%s", new Object[] { Integer.valueOf(((com.tencent.mm.at.e)localObject2).offset), Integer.valueOf(((com.tencent.mm.at.e)localObject2).frO), Integer.valueOf(((com.tencent.mm.at.e)localObject2).fDC), ((com.tencent.mm.at.e)localObject2).fDz });
            paramHashMap = (HashMap<Long, h.a>)localObject1;
            k = j;
            if (localObject2 != null)
            {
              paramHashMap = (HashMap<Long, h.a>)localObject1;
              k = j;
              if (((com.tencent.mm.at.e)localObject2).fDC == 1)
              {
                if ((localObject2.equals(paramString)) || (((com.tencent.mm.at.e)localObject2).offset != ((com.tencent.mm.at.e)localObject2).frO))
                  break label921;
                localObject2 = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().q(((com.tencent.mm.at.e)localObject2).fDz, "", "");
                ab.d("MicroMsg.BackupItemImg", "packet hdPath:%s, fileLen[%d]", new Object[] { localObject2, Long.valueOf(com.tencent.mm.vfs.e.asZ((String)localObject2)) });
                paramHashMap = (HashMap<Long, h.a>)localObject2;
                k = j;
                if (com.tencent.mm.vfs.e.ct((String)localObject2))
                {
                  k = j + i.a(new i.a((String)localObject2, paramgu, paramLinkedList, 3, paramBoolean1, "_hd", paramBoolean2));
                  com.tencent.mm.vfs.e.asZ((String)localObject2);
                  paramHashMap = (HashMap<Long, h.a>)localObject2;
                }
              }
            }
          }
        }
        while (true)
        {
          i = k;
          localObject1 = paramString;
          if (!com.tencent.mm.vfs.e.ct(str))
            break;
          com.tencent.mm.vfs.e.asZ(str);
          i = k;
          localObject1 = paramString;
          if (bo.isNullOrNil(str))
            break;
          i = k;
          localObject1 = paramString;
          if (str.equals(paramHashMap))
            break;
          ab.d("MicroMsg.BackupItemImg", "bigImgPath " + str + " " + com.tencent.mm.vfs.e.asZ(str));
          i = k + i.a(new i.a(str, paramgu, paramLinkedList, 2, paramBoolean1, paramBoolean2, null));
          localObject1 = paramString;
          break;
          localObject2 = null;
          break label572;
          localObject2.equals(paramString);
          paramHashMap = (HashMap<Long, h.a>)localObject1;
          k = j;
        }
        paramgu.vED = new bts().alV(parambi);
        i += parambi.length();
        AppMethodBeat.o(17454);
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17456);
    int i;
    if ((paramgu == null) || (paramgu.vED == null))
    {
      ab.e("MicroMsg.BackupItemImg", "recover bakitem or bakitem content is null");
      i = 0;
      AppMethodBeat.o(17456);
      return i;
    }
    String str1 = new String(bo.bc(paramgu.vED.wVI, ""));
    ab.d("MicroMsg.BackupItemImg", "recover msg:" + paramgu.ptF + " " + str1);
    label106: int j;
    label122: Object localObject1;
    label133: com.tencent.mm.at.g localg;
    if (paramgu.vJd == null)
    {
      i = 0;
      j = paramgu.vJf;
      if (paramgu.vJc != null)
        break label613;
      paramString = "";
      if (paramgu.vJb != null)
        break label624;
      localObject1 = "";
      ab.d("MicroMsg.BackupItemImg", "recover backupItemImg:, buf:%d, BufferType:%d, MediaType%s, ids:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), paramString, localObject1 });
      paramString = null;
      parambi.setContent(str1);
      localg = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo();
      if (parambi.field_isSend != 1)
        break label636;
      if (parambi.field_msgId != 0L)
        paramString = localg.fJ(parambi.field_msgId);
      if ((paramString != null) && (paramString.fDy != 0L))
        break label1251;
      paramString = localg.fI(parambi.field_msgSvrId);
    }
    label706: label1235: label1251: 
    while (true)
    {
      label240: localObject1 = br.z(str1, "msg");
      long l1 = 0L;
      long l2;
      if (localObject1 != null)
      {
        l2 = bo.getLong((String)((Map)localObject1).get(".msg.img.$hdlength"), 0L);
        l1 = l2;
        if (l2 > 0L)
          i = 1;
      }
      while (true)
      {
        Object localObject2 = bo.bc(com.tencent.mm.plugin.backup.b.g.a(paramgu, 3), "");
        if ((paramgu.vJf == 3) && (paramgu.vJd != null))
          com.tencent.mm.plugin.backup.b.g.b(com.tencent.mm.plugin.backup.b.g.Fa((String)localObject2), (String)localObject2, paramgu.vJd.getBufferToBytes());
        localObject1 = bo.bc(com.tencent.mm.plugin.backup.b.g.a(paramgu, 2), "");
        if ((paramgu.vJf == 2) && (paramgu.vJd != null))
          com.tencent.mm.plugin.backup.b.g.b(com.tencent.mm.plugin.backup.b.g.Fa((String)localObject1), (String)localObject1, paramgu.vJd.getBufferToBytes());
        ab.d("MicroMsg.BackupItemImg", "hdName %s, imgName:%s", new Object[] { localObject2, localObject1 });
        if (bo.isNullOrNil((String)localObject1))
        {
          ab.e("MicroMsg.BackupItemImg", "imgName is null, imgName = hdName");
          localObject1 = localObject2;
        }
        while (true)
        {
          Object localObject3 = com.tencent.mm.plugin.backup.b.g.b(paramgu, 1);
          Object localObject4;
          if (localObject3 == null)
          {
            ab.i("MicroMsg.BackupItemImg", "getThumbBuf is null and read from mediapath");
            str2 = com.tencent.mm.plugin.backup.b.g.Fa((String)localObject1) + (String)localObject1;
            str3 = com.tencent.mm.a.g.x((bo.anU() + " ").getBytes());
            localObject4 = com.tencent.mm.plugin.backup.b.g.Fa(str3);
            localObject3 = (String)localObject4 + str3;
            localObject4 = new com.tencent.mm.vfs.b((String)localObject4);
            if (!((com.tencent.mm.vfs.b)localObject4).exists())
              ((com.tencent.mm.vfs.b)localObject4).mkdirs();
            j = ad.amy((String)localObject3);
            if (j > 0)
            {
              if (ad.a(str2, Bitmap.CompressFormat.JPEG, (String)localObject3, j))
                break label706;
              ab.e("MicroMsg.BackupItemImg", "createLongPictureThumbNail failed");
              i = -1;
              AppMethodBeat.o(17456);
              break;
              i = paramgu.vJd.getILen();
              break label106;
              label613: paramString = paramgu.vJc.toString();
              break label122;
              label624: localObject1 = paramgu.vJb.toString();
              break label133;
              label636: paramString = localg.fI(parambi.field_msgSvrId);
              break label240;
            }
            if (!com.tencent.mm.sdk.platformtools.d.a(str2, 120, 120, Bitmap.CompressFormat.JPEG, 90, (String)localObject3))
            {
              ab.e("MicroMsg.BackupItemImg", "createThumbNail failed");
              i = -1;
              AppMethodBeat.o(17456);
              break;
            }
            ab.d("MicroMsg.BackupItemImg", "insert: thumbName = ".concat(String.valueOf(str3)));
            localObject3 = com.tencent.mm.vfs.e.e((String)localObject3, 0, -1);
          }
          while (true)
          {
            if (localObject3 != null)
              break label766;
            ab.e("MicroMsg.BackupItemImg", "img buf is null");
            i = -1;
            AppMethodBeat.o(17456);
            break;
            ab.i("MicroMsg.BackupItemImg", "getThumbBuf len:%d", new Object[] { Integer.valueOf(localObject3.length) });
          }
          label766: String str2 = localg.q((String)localObject2, "", "");
          String str3 = localg.q((String)localObject1, "", "");
          l1 = 0L;
          long l3;
          if (paramString.fDy == 0L)
          {
            j = com.tencent.mm.plugin.backup.b.g.c(paramgu, 2);
            if (i != 0)
            {
              i = com.tencent.mm.plugin.backup.b.g.c(paramgu, 3);
              l3 = localg.a((byte[])localObject3, paramgu.ptF, true, (String)localObject2, i, str1, new PString(), new PInt(), new PInt());
              l1 = l3;
              if (!com.tencent.mm.plugin.backup.b.g.b(paramgu, 3, str2))
              {
                ab.e("MicroMsg.BackupItemImg", "writeItem BACKUPITEM_IMAGE_HD failed:%s", new Object[] { str2 });
                l1 = l3;
                if (j == l2)
                  if (com.tencent.mm.plugin.backup.b.g.b(paramgu, 3, str3))
                  {
                    ab.i("MicroMsg.BackupItemImg", "writeItem, try take img for hd img success:%s", new Object[] { str3 });
                    l1 = l3;
                    i = 0;
                    if (j > 0)
                      break label1235;
                    j = com.tencent.mm.plugin.backup.b.g.c(paramgu, 3);
                  }
              }
            }
          }
          while (true)
          {
            localObject4 = new PString();
            paramString = new PInt();
            localObject2 = new PInt();
            l2 = localg.a((byte[])localObject3, paramgu.ptF, false, (String)localObject1, j, str1, (PString)localObject4, paramString, (PInt)localObject2);
            if ((i != 0) && (!com.tencent.mm.plugin.backup.b.g.b(paramgu, 2, str3)))
              ab.e("MicroMsg.BackupItemImg", "writeItem BACKUPITEM_IMAGE failed:%s", new Object[] { str2 });
            if (l2 > 0L)
            {
              parambi.jv(((PString)localObject4).value);
              parambi.hZ(paramString.value);
              parambi.ia(((PInt)localObject2).value);
              if (l1 > 0L)
              {
                paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().b(Long.valueOf(l2));
                paramString.lu((int)l1);
                com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().a(Long.valueOf(l2), paramString);
              }
            }
            while (true)
            {
              c.l(parambi);
              i = 0;
              AppMethodBeat.o(17456);
              break;
              ab.e("MicroMsg.BackupItemImg", "writeItem, try take img for hd img failed:%s", new Object[] { str3 });
              l1 = l3;
              i = 1;
              break label944;
              i = -1;
              AppMethodBeat.o(17456);
              break;
              paramgu = paramString.fDB;
              if ((paramgu != null) && (paramgu.startsWith("THUMBNAIL_DIRPATH://")))
                parambi.jv(paramgu);
              else
                parambi.jv("THUMBNAIL://" + paramString.fDy);
            }
          }
        }
        i = 0;
        l2 = l1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.d
 * JD-Core Version:    0.6.2
 */