package com.tencent.mm.plugin.backup.bakoldlogic.b;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.bf;
import com.tencent.mm.plugin.backup.bakoldlogic.a.a;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b;
import com.tencent.mm.plugin.backup.bakoldlogic.d.c;
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
import java.io.File;
import java.io.StringWriter;
import java.util.LinkedList;
import java.util.Map;
import org.xmlpull.v1.XmlPullParserFactory;
import org.xmlpull.v1.XmlSerializer;

public final class e
  implements j
{
  private static String a(com.tencent.mm.at.e parame, bi parambi)
  {
    AppMethodBeat.i(17789);
    StringWriter localStringWriter = new StringWriter();
    try
    {
      XmlSerializer localXmlSerializer = XmlPullParserFactory.newInstance().newSerializer();
      localXmlSerializer.setOutput(localStringWriter);
      if (com.tencent.mm.plugin.backup.bakoldlogic.d.d.kH(parambi.field_talker))
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
        StringBuilder localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "aeskey", (String)((Map)localObject).get(".msg.img.$aeskey"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "encryver", (String)((Map)localObject).get(".msg.img.$encryver"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnthumbaeskey", (String)((Map)localObject).get(".msg.img.$cdnthumbaeskey"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnthumburl", (String)((Map)localObject).get(".msg.img.$cdnthumburl"));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnthumblength", bo.getLong((String)((Map)localObject).get(".msg.img.$cdnthumblength"), 10240L));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnthumbheight", bo.getInt((String)((Map)localObject).get(".msg.img.$cdnthumbheight"), 0));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnthumbwidth", bo.getInt((String)((Map)localObject).get(".msg.img.$cdnthumbwidth"), 0));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnmidheight", bo.getInt((String)((Map)localObject).get(".msg.img.$cdnmidheight"), 0));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnmidwidth", bo.getInt((String)((Map)localObject).get(".msg.img.$cdnmidwidth"), 0));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnhdheight", bo.getInt((String)((Map)localObject).get(".msg.img.$cdnhdheight"), 0));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnhdwidth", bo.getInt((String)((Map)localObject).get(".msg.img.$cdnhdwidth"), 0));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localXmlSerializer.attribute(null, "cdnmidimgurl", (String)((Map)localObject).get(".msg.img.$cdnmidimgurl"));
        long l1 = bo.getLong((String)((Map)localObject).get(".msg.img.$length"), 0L);
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        long l2 = l1;
        if (l1 == 0L)
          l2 = com.tencent.mm.a.e.cs(b.aUY().aUZ().aUo().q(parame.fDz, "", ""));
        localXmlSerializer.attribute(null, "length", l2);
        if ((parambi.field_isSend != 1) || (parame.fDC == 1))
        {
          parame = new java/lang/StringBuilder;
          parame.<init>();
          localXmlSerializer.attribute(null, "cdnbigimgurl", (String)((Map)localObject).get(".msg.img.$cdnbigimgurl"));
          parame = new java/lang/StringBuilder;
          parame.<init>();
          localXmlSerializer.attribute(null, "hdlength", bo.getLong((String)((Map)localObject).get(".msg.img.$hdlength"), 0L));
        }
        parame = new java/lang/StringBuilder;
        parame.<init>();
        localXmlSerializer.attribute(null, "md5", (String)((Map)localObject).get(".msg.img.$md5"));
      }
      localXmlSerializer.endTag(null, "img");
      localXmlSerializer.endTag(null, "msg");
      localXmlSerializer.endDocument();
      localStringWriter.flush();
      localStringWriter.close();
      parame = localStringWriter.getBuffer().toString();
      ab.d("MicroMsg.BakOldItemImg", "parseContent xml:%s", new Object[] { parame });
      AppMethodBeat.o(17789);
      return parame;
    }
    catch (Exception parame)
    {
      while (true)
      {
        ab.e("MicroMsg.BakOldItemImg", "packetImg xml error: " + parame.toString());
        parame = null;
        AppMethodBeat.o(17789);
      }
    }
  }

  public final int a(gu paramgu, bi parambi, LinkedList<u> paramLinkedList)
  {
    AppMethodBeat.i(17788);
    int i;
    Object localObject1;
    if (bo.isNullOrNil(parambi.field_content))
    {
      i = 0;
      if (parambi.field_isSend == 1)
      {
        localObject1 = b.aUY().aUZ().aUo().fJ(parambi.field_msgId);
        if (((com.tencent.mm.at.e)localObject1).fDy != 0L)
          break label996;
      }
      localObject1 = b.aUY().aUZ().aUo().fI(parambi.field_msgSvrId);
    }
    label291: label439: label463: label475: label989: label996: 
    while (true)
    {
      Object localObject2 = b.aUY().aUZ().aUo().I(parambi.field_imgPath, true);
      String str1;
      String str2;
      int j;
      if (com.tencent.mm.a.e.ct((String)localObject2))
      {
        i += i.a(new i.a((String)localObject2, paramgu, paramLinkedList, 1, "_thumb"));
        if (parambi.field_isSend != 1)
          break label486;
        str1 = "";
        str2 = b.aUY().aUZ().aUo().q(((com.tencent.mm.at.e)localObject1).fDz, "", "");
        localObject2 = localObject1;
        if (!((com.tencent.mm.at.e)localObject1).agQ())
          break label475;
        localObject1 = b.aUY().aUZ().aUo().ly(((com.tencent.mm.at.e)localObject1).fDJ);
        if (localObject1 == null)
          break label463;
        str1 = b.aUY().aUZ().aUo().q(((com.tencent.mm.at.e)localObject1).fDz, "", "");
        ab.d("MicroMsg.BakOldItemImg", "packet hd bigImgPath " + str1 + " " + com.tencent.mm.a.e.cs(str1));
        com.tencent.mm.a.e.cs(str1);
        if (!com.tencent.mm.a.e.ct(str1))
          break label439;
        j = i.a(new i.a(str1, paramgu, paramLinkedList, 3, "_hd")) + i;
        com.tencent.mm.a.e.cs(str2);
        localObject2 = localObject1;
        i = j;
        if (!bo.isNullOrNil(str2))
        {
          localObject2 = localObject1;
          i = j;
          if (!str2.equals(str1))
          {
            ab.d("MicroMsg.BakOldItemImg", "bigImgPath " + str2 + " " + com.tencent.mm.a.e.cs(str2));
            i = j + i.a(new i.a(str2, paramgu, paramLinkedList, 2, false, null));
            localObject2 = localObject1;
          }
        }
      }
      while (true)
      {
        parambi = a((com.tencent.mm.at.e)localObject2, parambi);
        label486: int k;
        int m;
        if (parambi == null)
        {
          AppMethodBeat.o(17788);
          while (true)
          {
            return i;
            i = parambi.field_content.getBytes().length;
            break;
            i = -1;
            AppMethodBeat.o(17788);
          }
          ab.e("MicroMsg.BakOldItemImg", "packet img.hasHdImg but hdbigImgPath has no file, hdbigImgPath:%s", new Object[] { str1 });
          j = i;
          break label291;
          ab.e("MicroMsg.BakOldItemImg", "packet img.hasHdImg but img is null");
          localObject2 = localObject1;
          localObject1 = localObject2;
          j = i;
          break label291;
          if (!((com.tencent.mm.at.e)localObject1).agP())
            break label989;
          str2 = b.aUY().aUZ().aUo().q(((com.tencent.mm.at.e)localObject1).fDz, "", "");
          if (((com.tencent.mm.at.e)localObject1).agQ())
            if (((com.tencent.mm.at.e)localObject1).agQ())
            {
              localObject2 = b.aUY().aUZ().aUo().ly(((com.tencent.mm.at.e)localObject1).fDJ);
              if (localObject2 != null)
              {
                if (localObject2 != null)
                  break label890;
                j = -1;
                if (localObject2 != null)
                  break label900;
                k = -1;
                if (localObject2 != null)
                  break label910;
                str1 = "null";
                if (localObject2 != null)
                  break label920;
                m = -1;
                ab.i("MicroMsg.BakOldItemImg", "packet hdinfo off:%d total:%d path:%s, compressType[%d]", new Object[] { Integer.valueOf(j), Integer.valueOf(k), str1, Integer.valueOf(m) });
                if ((localObject2 == null) || (((com.tencent.mm.at.e)localObject2).fDC != 1))
                  break label938;
                if ((localObject2.equals(localObject1)) || (((com.tencent.mm.at.e)localObject2).offset != ((com.tencent.mm.at.e)localObject2).frO))
                  break label930;
                str1 = b.aUY().aUZ().aUo().q(((com.tencent.mm.at.e)localObject2).fDz, "", "");
                ab.d("MicroMsg.BakOldItemImg", "packet hdPath:%s, fileLen[%d]", new Object[] { str1, Integer.valueOf(com.tencent.mm.a.e.cs(str1)) });
                if (!com.tencent.mm.a.e.ct(str1))
                  break label982;
                j = i.a(new i.a(str1, paramgu, paramLinkedList, 3, "_hd"));
                com.tencent.mm.a.e.cs(str1);
                j = i + j;
              }
            }
        }
        while (true)
        {
          localObject2 = localObject1;
          i = j;
          if (!com.tencent.mm.a.e.ct(str2))
            break;
          com.tencent.mm.a.e.cs(str2);
          localObject2 = localObject1;
          i = j;
          if (bo.isNullOrNil(str2))
            break;
          localObject2 = localObject1;
          i = j;
          if (str2.equals(str1))
            break;
          ab.d("MicroMsg.BakOldItemImg", "bigImgPath " + str2 + " " + com.tencent.mm.a.e.cs(str2));
          i = j + i.a(new i.a(str2, paramgu, paramLinkedList, 2, false, null));
          localObject2 = localObject1;
          break;
          localObject2 = localObject1;
          break label557;
          label890: j = ((com.tencent.mm.at.e)localObject2).offset;
          break label565;
          k = ((com.tencent.mm.at.e)localObject2).frO;
          break label573;
          str1 = ((com.tencent.mm.at.e)localObject2).fDz;
          break label583;
          m = ((com.tencent.mm.at.e)localObject2).fDC;
          break label591;
          localObject2.equals(localObject1);
          str1 = "";
          j = i;
          continue;
          paramgu.vED = new bts().alV(parambi);
          i += parambi.length();
          AppMethodBeat.o(17788);
          break label411;
          j = i;
        }
        localObject2 = localObject1;
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17790);
    int i;
    if ((paramgu == null) || (paramgu.vED == null))
    {
      ab.e("MicroMsg.BakOldItemImg", "recover bakitem or bakitem content is null");
      i = 0;
      AppMethodBeat.o(17790);
      return i;
    }
    String str1 = new String(bo.bc(paramgu.vED.wVI, ""));
    ab.d("MicroMsg.BakOldItemImg", "recover msg" + paramgu.ptF + " " + str1);
    label104: int j;
    label120: Object localObject1;
    label131: com.tencent.mm.at.g localg;
    if (paramgu.vJd == null)
    {
      i = 0;
      j = paramgu.vJf;
      if (paramgu.vJc != null)
        break label652;
      paramString = "";
      if (paramgu.vJb != null)
        break label663;
      localObject1 = "";
      ab.d("MicroMsg.BakOldItemImg", "recover bakitem:, buf:%d, BufferType:%d, MediaType%s, ids:%s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), paramString, localObject1 });
      paramString = null;
      parambi.setContent(str1);
      localg = b.aUY().aUZ().aUo();
      if (parambi.field_isSend != 1)
        break label675;
      if (parambi.field_msgId != 0L)
        paramString = localg.fJ(parambi.field_msgId);
      if ((paramString != null) && (paramString.fDy != 0L))
        break label1204;
      paramString = localg.fI(parambi.field_msgSvrId);
    }
    label652: label663: label675: label1204: 
    while (true)
    {
      label237: localObject1 = br.z(str1, "msg");
      if ((localObject1 != null) && (bo.getLong((String)((Map)localObject1).get(".msg.img.$hdlength"), 0L) > 0L));
      for (i = 1; ; i = 0)
      {
        Object localObject2 = bo.bc(a.a(paramgu, 3), "");
        if ((paramgu.vJf == 3) && (paramgu.vJd != null))
          com.tencent.mm.a.e.b(a.aUy() + "backupMeida/" + a.Fb((String)localObject2), (String)localObject2, paramgu.vJd.getBufferToBytes());
        localObject1 = bo.bc(a.a(paramgu, 2), "");
        if ((paramgu.vJf == 2) && (paramgu.vJd != null))
          com.tencent.mm.a.e.b(a.aUy() + "backupMeida/" + a.Fb((String)localObject1), (String)localObject1, paramgu.vJd.getBufferToBytes());
        ab.d("MicroMsg.BakOldItemImg", "hdName %s, imgName:%s", new Object[] { localObject2, localObject1 });
        if (bo.isNullOrNil((String)localObject1))
        {
          ab.e("MicroMsg.BakOldItemImg", "imgName is null, imgName = hdName");
          localObject1 = localObject2;
        }
        while (true)
        {
          Object localObject3 = a.b(paramgu, 1);
          Object localObject4;
          if (localObject3 == null)
          {
            ab.i("MicroMsg.BakOldItemImg", "getThumbBuf is null and read from mediapath");
            str2 = a.Fp((String)localObject1);
            str3 = com.tencent.mm.a.g.x((bo.anU() + " ").getBytes());
            localObject4 = a.aUy() + "backupMeida/" + a.Fb(str3);
            localObject3 = (String)localObject4 + str3;
            localObject4 = new File((String)localObject4);
            if (!((File)localObject4).exists())
              ((File)localObject4).mkdirs();
            j = ad.amy((String)localObject3);
            if (j > 0)
            {
              if (ad.a(str2, Bitmap.CompressFormat.JPEG, (String)localObject3, j))
                break label743;
              ab.e("MicroMsg.BakOldItemImg", "createLongPictureThumbNail failed");
              i = -1;
              AppMethodBeat.o(17790);
              break;
              i = paramgu.vJd.getILen();
              break label104;
              paramString = paramgu.vJc.toString();
              break label120;
              localObject1 = paramgu.vJb.toString();
              break label131;
              paramString = localg.fI(parambi.field_msgSvrId);
              break label237;
            }
            if (!com.tencent.mm.sdk.platformtools.d.a(str2, 120, 120, Bitmap.CompressFormat.JPEG, 90, (String)localObject3))
            {
              ab.e("MicroMsg.BakOldItemImg", "createThumbNail failed");
              i = -1;
              AppMethodBeat.o(17790);
              break;
            }
            ab.d("MicroMsg.BakOldItemImg", "insert: thumbName = ".concat(String.valueOf(str3)));
            label743: localObject3 = com.tencent.mm.a.e.f((String)localObject3, 0, -1);
          }
          while (true)
          {
            if (localObject3 != null)
              break label801;
            ab.e("MicroMsg.BakOldItemImg", "img buf is null");
            i = -1;
            AppMethodBeat.o(17790);
            break;
            ab.i("MicroMsg.BakOldItemImg", "getThumbBuf len:%d", new Object[] { Integer.valueOf(localObject3.length) });
          }
          String str3 = localg.q((String)localObject2, "", "");
          String str2 = localg.q((String)localObject1, "", "");
          long l1 = 0L;
          if (paramString.fDy == 0L)
          {
            if (i != 0)
            {
              i = a.c(paramgu, 3);
              l2 = localg.a((byte[])localObject3, paramgu.ptF, true, (String)localObject2, i, str1, new PString(), new PInt(), new PInt());
              l1 = l2;
              if (!a.b(paramgu, 3, str3))
              {
                ab.e("MicroMsg.BakOldItemImg", "writeItem MMBAK_HD_IMG failed:%s", new Object[] { str3 });
                l1 = l2;
              }
            }
            j = a.c(paramgu, 2);
            i = j;
            if (j <= 0)
              i = a.c(paramgu, 3);
            paramString = new PString();
            localObject2 = new PInt();
            localObject4 = new PInt();
            long l2 = localg.a((byte[])localObject3, paramgu.ptF, false, (String)localObject1, i, str1, paramString, (PInt)localObject2, (PInt)localObject4);
            if (!a.b(paramgu, 2, str2))
              ab.e("MicroMsg.BakOldItemImg", "writeItem MMBAK_IMG failed:%s", new Object[] { str3 });
            if (l2 > 0L)
            {
              parambi.jv(paramString.value);
              parambi.hZ(((PInt)localObject2).value);
              parambi.ia(((PInt)localObject4).value);
              if (l1 > 0L)
              {
                paramString = b.aUY().aUZ().aUo().b(Long.valueOf(l2));
                paramString.lu((int)l1);
                b.aUY().aUZ().aUo().a(Long.valueOf(l2), paramString);
              }
            }
          }
          while (true)
          {
            com.tencent.mm.plugin.backup.bakoldlogic.d.d.l(parambi);
            i = 0;
            AppMethodBeat.o(17790);
            break;
            i = -1;
            AppMethodBeat.o(17790);
            break;
            paramgu = paramString.fDB;
            if ((paramgu != null) && (paramgu.startsWith("THUMBNAIL_DIRPATH://")))
              parambi.jv(paramgu);
            else
              parambi.jv("THUMBNAIL://" + paramString.fDy);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.e
 * JD-Core Version:    0.6.2
 */