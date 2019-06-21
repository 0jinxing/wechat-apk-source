package com.tencent.mm.pluginsdk.model.app;

import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.at.o;
import com.tencent.mm.g.a.tq;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXDesignerSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiPageSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXEmojiSharedObject;
import com.tencent.mm.opensdk.modelmsg.WXFileObject;
import com.tencent.mm.opensdk.modelmsg.WXImageObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject;
import com.tencent.mm.opensdk.modelmsg.WXMusicObject;
import com.tencent.mm.opensdk.modelmsg.WXTextObject;
import com.tencent.mm.opensdk.modelmsg.WXVideoObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.e;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

public final class l
{
  private static com.tencent.mm.plugin.record.b.e pJg;

  public static int Kx(int paramInt)
  {
    switch (paramInt)
    {
    default:
    case 1048625:
    case 16777265:
    case 268435505:
    case 285212721:
    case 301989937:
    case 318767153:
    case 335544369:
    case 352321585:
    case 369098801:
    case 385876017:
    case 402653233:
    case 419430449:
    case 436207665:
    case 452984881:
    case 469762097:
    case 486539313:
    case 503316529:
    case 520093745:
    case 536870961:
    case 553648177:
    case 587202609:
    case 603979825:
    case 687865905:
    case 704643121:
    case -1879048191:
    case -1879048190:
    case -1879048189:
    case -1879048186:
    case -1879048185:
    case -1879048183:
    case -1879048176:
    }
    while (true)
    {
      return paramInt;
      paramInt = 49;
    }
  }

  public static String X(String paramString1, String paramString2, String paramString3)
  {
    int i = 1;
    AppMethodBeat.i(27338);
    Object localObject1 = new com.tencent.mm.vfs.b(paramString1);
    if (!((com.tencent.mm.vfs.b)localObject1).exists())
      ((com.tencent.mm.vfs.b)localObject1).mkdirs();
    if (bo.isNullOrNil(paramString2))
    {
      localObject1 = paramString1 + "da_" + bo.anU();
      paramString2 = (String)localObject1;
      if (!bo.isNullOrNil(paramString3))
        paramString2 = (String)localObject1 + "." + paramString3;
    }
    try
    {
      Object localObject2;
      do
      {
        localObject1 = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject1).<init>(paramString2);
        localObject1 = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject1).dMC().dMD());
        localObject2 = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject2).<init>(paramString1);
        if (!((String)localObject1).equalsIgnoreCase(com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject2).dMD())))
        {
          paramString2 = new java/lang/StringBuilder;
          paramString2.<init>();
          paramString2 = paramString1 + "da_" + bo.anU();
          ab.w("MicroMsg.AppMsgLogic", "maybe DirTraversal attach. %s", new Object[] { paramString2 });
        }
        AppMethodBeat.o(27338);
        return paramString2;
        localObject1 = paramString2;
        if (!bo.isNullOrNil(paramString3))
        {
          localObject1 = paramString2;
          if (!paramString2.endsWith(paramString3))
            localObject1 = paramString2 + "." + paramString3;
        }
        localObject2 = paramString1 + (String)localObject1;
        paramString2 = (String)localObject2;
      }
      while (!com.tencent.mm.vfs.e.ct((String)localObject2));
      while (true)
      {
        paramString2 = (String)localObject2;
        if (i < 20)
        {
          if (!com.tencent.mm.vfs.e.ct(paramString1 + i + "_" + (String)localObject1))
            paramString2 = paramString1 + i + "_" + (String)localObject1;
        }
        else
        {
          if (i != 20)
            break;
          localObject1 = paramString1 + "da_" + bo.anU();
          paramString2 = (String)localObject1;
          if (bo.isNullOrNil(paramString3))
            break;
          paramString2 = (String)localObject1 + "." + paramString3;
          break;
        }
        i++;
      }
    }
    catch (Exception paramString2)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppMsgLogic", paramString2, "", new Object[0]);
        paramString1 = paramString1 + "da_" + bo.anU();
        paramString2 = paramString1;
        if (!bo.isNullOrNil(paramString3))
          paramString2 = paramString1 + "." + paramString3;
      }
    }
  }

  public static int a(long paramLong, String paramString, com.tencent.mm.i.d paramd)
  {
    AppMethodBeat.i(27335);
    aw.ZK();
    bi localbi = com.tencent.mm.model.c.XO().jf(paramLong);
    int i;
    if (localbi.field_msgId != paramLong)
    {
      ab.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " getmsgFailed id:" + paramLong);
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(27335);
    }
    j.b localb;
    while (true)
    {
      return i;
      localb = j.b.me(localbi.field_content);
      if (localb != null)
        break;
      ab.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " getmsgFailed id:" + paramLong);
      i = 0 - com.tencent.mm.compatible.util.g.getLine();
      AppMethodBeat.o(27335);
    }
    localb.csD = paramString;
    if (paramd != null)
    {
      if (paramd.field_aesKey != "")
        break label379;
      str = localb.eyr;
      label164: localb.eyr = str;
      if (paramd.field_fileId != "")
        break label388;
      str = localb.fgD;
      label187: localb.fgD = str;
      if (paramd.field_filemd5 != "")
        break label397;
      str = localb.filemd5;
      label210: localb.filemd5 = str;
      if (paramd.field_fileLength != 0)
        break label406;
      i = localb.fgo;
      label231: localb.fgo = i;
      if (paramd.field_thumbUrl != "")
        break label415;
    }
    label388: label397: label406: label415: for (String str = localb.fgE; ; str = paramd.field_thumbUrl)
    {
      localb.fgE = str;
      localbi.setContent(j.b.a(localb, localb.csD, paramd));
      aw.ZK();
      com.tencent.mm.model.c.XO().a(localbi.field_msgId, localbi);
      paramd = am.dhN().ma(paramLong);
      if (paramd != null)
      {
        paramd.field_xml = localbi.field_content;
        am.dhN().c(paramd, new String[] { "msgId" });
      }
      paramd = am.aUq().lZ(paramLong);
      paramd.field_mediaSvrId = paramString;
      paramd.field_offset = paramd.field_totalLen;
      am.aUq().a(paramd, new String[0]);
      AppMethodBeat.o(27335);
      i = 0;
      break;
      label379: str = paramd.field_aesKey;
      break label164;
      str = paramd.field_fileId;
      break label187;
      str = paramd.field_filemd5;
      break label210;
      i = paramd.field_fileLength;
      break label231;
    }
  }

  public static int a(j.b paramb, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    AppMethodBeat.i(27342);
    int i = a(paramb, paramWXMediaMessage, paramString, null, null);
    AppMethodBeat.o(27342);
    return i;
  }

  private static int a(j.b paramb, WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(27343);
    Object localObject1 = b(paramb, paramWXMediaMessage, paramString2);
    ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + "summerbig content url:" + paramb.url + " lowUrl:" + paramb.fgn + " attachlen:" + paramb.fgo + " attachid:" + paramb.csD + " attach file:" + (String)localObject1);
    Object localObject2 = System.currentTimeMillis();
    int i;
    if (!bo.isNullOrNil((String)localObject1))
    {
      localObject2 = a((String)localObject2, paramb, (String)localObject1);
      if (localObject2 == null)
      {
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(27343);
        return i;
      }
      localObject1 = com.tencent.mm.sdk.platformtools.d.amj((String)localObject1);
      if (localObject1 != null)
      {
        paramb.fgJ = ((BitmapFactory.Options)localObject1).outWidth;
        paramb.fgI = ((BitmapFactory.Options)localObject1).outHeight;
      }
    }
    while (true)
    {
      bi localbi = new bi();
      boolean bool;
      if ((paramWXMediaMessage.thumbData != null) && (paramWXMediaMessage.thumbData.length > 0))
      {
        if ((paramWXMediaMessage.thumbData.length <= 65536) || (paramWXMediaMessage.getType() == 36) || (paramWXMediaMessage.getType() == 46))
          break label526;
        if (paramb.type != 2)
          break label520;
        bool = true;
        label249: localObject1 = o.ahl().a(paramWXMediaMessage.thumbData, bool, Bitmap.CompressFormat.JPEG);
        label266: ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " summerbig thumbData MsgInfo path:" + (String)localObject1);
        if (!bo.isNullOrNil((String)localObject1))
          localbi.jv((String)localObject1);
      }
      if (localObject2 != null)
        paramb.csD = ((b)localObject2).xDa;
      paramString1 = bo.P(paramString1.split(",")).iterator();
      while (true)
      {
        if (!paramString1.hasNext())
          break label830;
        localObject1 = (String)paramString1.next();
        paramb.fgq = paramString2;
        localbi.setContent(j.b.a(paramb, null, null));
        localbi.setStatus(1);
        localbi.ju((String)localObject1);
        localbi.eJ(bf.oC((String)localObject1));
        localbi.hO(1);
        localbi.setType(d(paramb));
        if (com.tencent.mm.aj.f.kq(localbi.field_talker))
          localbi.ix(com.tencent.mm.aj.a.e.aae());
        aw.ZK();
        long l = com.tencent.mm.model.c.XO().Z(localbi);
        if (l < 0L)
        {
          ab.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " summerbig insert msg failed :" + l);
          i = 0 - com.tencent.mm.compatible.util.g.getLine();
          AppMethodBeat.o(27343);
          break;
          label520: bool = false;
          break label249;
          label526: localObject1 = o.ahl().W(paramWXMediaMessage.thumbData);
          break label266;
        }
        ab.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " summerbig new msg inserted to db , local id = " + l);
        localbi.setMsgId(l);
        localObject1 = new com.tencent.mm.af.j();
        ((com.tencent.mm.af.j)localObject1).field_xml = localbi.field_content;
        ((com.tencent.mm.af.j)localObject1).field_title = paramWXMediaMessage.title;
        ((com.tencent.mm.af.j)localObject1).field_type = paramWXMediaMessage.mediaObject.type();
        ((com.tencent.mm.af.j)localObject1).field_description = paramWXMediaMessage.description;
        ((com.tencent.mm.af.j)localObject1).field_msgId = l;
        ((com.tencent.mm.af.j)localObject1).field_source = paramb.appName;
        am.dhN().b((com.tencent.mm.sdk.e.c)localObject1);
        if (localObject2 != null)
        {
          ((b)localObject2).field_msgInfoId = l;
          ((b)localObject2).field_status = 101L;
          ab.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg update attInfo field_msgInfoId[%d], field_status[%d], systemRowid[%d], type[%d]", new Object[] { Long.valueOf(((b)localObject2).field_msgInfoId), Long.valueOf(((b)localObject2).field_status), Long.valueOf(((b)localObject2).xDa), Integer.valueOf(((com.tencent.mm.af.j)localObject1).field_type) });
          am.aUq().a((b)localObject2, new String[0]);
          if (!bo.isNullOrNil(paramString3))
            am.dhP().z(((b)localObject2).field_msgInfoId, paramString3);
          am.dhP().run();
        }
        else
        {
          ab.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg dosceneSendAppMsg attInfo[%s], msgId[%d], sessionId[%s], type[%d]", new Object[] { localObject2, Long.valueOf(l), paramString3, Integer.valueOf(((com.tencent.mm.af.j)localObject1).field_type) });
          am.dhP();
          al.a.A(l, paramString3);
        }
      }
      label830: i = 0;
      AppMethodBeat.o(27343);
      break;
      localObject2 = null;
    }
  }

  public static int a(j.b paramb, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(27336);
    int i = a(paramb, paramString1, paramString2, paramString3, paramString4, paramArrayOfByte, null);
    AppMethodBeat.o(27336);
    return i;
  }

  public static int a(j.b paramb, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String paramString5)
  {
    AppMethodBeat.i(27337);
    int i = a(paramb, paramString1, paramString2, paramString3, paramString4, paramArrayOfByte, paramString5, "");
    AppMethodBeat.o(27337);
    return i;
  }

  public static int a(j.b paramb, String paramString1, String paramString2, String paramString3, String paramString4, byte[] paramArrayOfByte, String paramString5, String paramString6)
  {
    AppMethodBeat.i(27339);
    ab.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attachFilePath[%s], content[%s]", new Object[] { paramString4, paramb });
    Object localObject = System.currentTimeMillis();
    int i;
    if (!bo.isNullOrNil(paramString4))
    {
      localObject = a((String)localObject, paramb, paramString4);
      if (localObject == null)
      {
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(27339);
        return i;
      }
    }
    while (true)
    {
      bi localbi = new bi();
      int j;
      int k;
      if ((paramArrayOfByte != null) && (paramArrayOfByte.length > 0))
      {
        if ((paramb.type != 33) && (paramb.type != 36) && (paramb.type != 44))
          break label568;
        j = (int)(com.tencent.mm.sdk.platformtools.d.anS().density * 240.0F);
        k = (int)(com.tencent.mm.sdk.platformtools.d.anS().density * 240.0F);
        com.tencent.mm.af.a locala = (com.tencent.mm.af.a)paramb.X(com.tencent.mm.af.a.class);
        if (locala == null)
          break label525;
        paramString4 = locala.ffl;
        label181: if (locala == null)
          break label532;
        bool = locala.ffm;
        label193: if (((com.tencent.mm.plugin.expt.a.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lHp, 0) != 1)
          break label538;
        i = 1;
        label218: if ((!com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED) && (i == 0))
          break label544;
        paramString4 = o.ahl().a(paramArrayOfByte, Bitmap.CompressFormat.JPEG, paramString4, bool);
      }
      long l;
      while (true)
      {
        ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " thumbData MsgInfo path:" + paramString4);
        if (!bo.isNullOrNil(paramString4))
        {
          localbi.jv(paramString4);
          ab.d("MicroMsg.AppMsgLogic", "new thumbnail saved, path".concat(String.valueOf(paramString4)));
        }
        if (localObject != null)
          paramb.csD = ((b)localObject).xDa;
        localbi.setContent(j.b.a(paramb, null, null));
        localbi.setStatus(1);
        localbi.ju(paramString3);
        localbi.eJ(bf.oC(paramString3));
        localbi.hO(1);
        localbi.setType(d(paramb));
        if (com.tencent.mm.aj.f.kq(localbi.field_talker))
        {
          localbi.ix(com.tencent.mm.aj.a.e.aae());
          ab.d("MicroMsg.AppMsgLogic", "NetSceneSendMsg:MsgSource:%s", new Object[] { localbi.dqJ });
        }
        aw.ZK();
        l = com.tencent.mm.model.c.XO().Z(localbi);
        ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " msginfo insert id: " + l);
        if (l >= 0L)
          break label628;
        ab.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + "insert msg failed :" + l);
        i = 0 - com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(27339);
        break;
        label525: paramString4 = "";
        break label181;
        label532: bool = false;
        break label193;
        label538: i = 0;
        break label218;
        label544: paramString4 = o.ahl().a(paramArrayOfByte, Bitmap.CompressFormat.JPEG, j, k, paramString4, bool);
        continue;
        label568: if (paramb.type != 46)
          break label593;
        paramString4 = o.ahl().a(paramArrayOfByte, Bitmap.CompressFormat.JPEG);
      }
      label593: if (paramb.type == 2);
      for (boolean bool = true; ; bool = false)
      {
        paramString4 = o.ahl().a(paramArrayOfByte, bool, Bitmap.CompressFormat.PNG);
        break;
      }
      label628: ab.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
      localbi.setMsgId(l);
      paramString3 = new com.tencent.mm.af.j();
      paramString3.field_xml = localbi.field_content;
      paramString3.field_appId = paramString1;
      paramString3.field_title = paramb.title;
      paramString3.field_type = paramb.type;
      paramString3.field_description = paramb.description;
      paramString3.field_msgId = l;
      paramString3.field_source = paramString2;
      am.dhN().b(paramString3);
      if (localObject == null)
      {
        bool = true;
        label740: ab.i("MicroMsg.AppMsgLogic", "summerbig sendAppMsg attInfo is null[%b]", new Object[] { Boolean.valueOf(bool) });
        if (localObject == null)
          break label843;
        ((b)localObject).field_msgInfoId = l;
        ((b)localObject).field_status = 101L;
        am.aUq().a((b)localObject, new String[0]);
        if ((paramb.type == 2) || (!bo.isNullOrNil(paramString5)))
          am.dhP().z(l, paramString5);
        am.dhP().run();
      }
      while (true)
      {
        i = 0;
        AppMethodBeat.o(27339);
        break;
        bool = false;
        break label740;
        label843: am.dhP();
        al.a.b(l, paramString5, paramString6);
      }
      localObject = null;
    }
  }

  public static int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4)
  {
    AppMethodBeat.i(27340);
    paramInt = a(paramWXMediaMessage, paramString1, paramString2, paramString3, paramInt, paramString4, null);
    AppMethodBeat.o(27340);
    return paramInt;
  }

  public static int a(WXMediaMessage paramWXMediaMessage, String paramString1, String paramString2, String paramString3, int paramInt, String paramString4, String paramString5)
  {
    AppMethodBeat.i(27341);
    j.b localb = new j.b();
    localb.appId = paramString1;
    localb.appName = paramString2;
    localb.fgr = paramInt;
    paramInt = a(localb, paramWXMediaMessage, paramString3, paramString4, paramString5);
    AppMethodBeat.o(27341);
    return paramInt;
  }

  public static b a(String paramString1, long paramLong, int paramInt1, String paramString2, String paramString3, int paramInt2)
  {
    AppMethodBeat.i(27333);
    b localb = new b();
    localb.field_fileFullPath = paramString1;
    localb.field_appId = paramString2;
    localb.field_sdkVer = paramInt1;
    localb.field_mediaSvrId = paramString3;
    localb.field_totalLen = paramInt2;
    localb.field_status = 101L;
    localb.field_isUpload = false;
    localb.field_createTime = bo.anU();
    localb.field_lastModifyTime = bo.anT();
    localb.field_msgInfoId = paramLong;
    localb.field_netTimes = 0L;
    AppMethodBeat.o(27333);
    return localb;
  }

  public static b a(String paramString1, j.b paramb, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(27334);
    ab.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " summerbig buildUploadAttachInfo clientAppDataId:" + paramString1 + " attach file :" + paramString2);
    Object localObject2 = paramString2.replace("//", "/");
    if (((String)localObject2).startsWith(com.tencent.mm.compatible.util.e.eSi))
    {
      ab.e("MicroMsg.AppMsgLogic", "summerbig Error attach path:%s", new Object[] { localObject2 });
      AppMethodBeat.o(27334);
      paramString1 = localObject1;
    }
    while (true)
    {
      return paramString1;
      localObject2 = new b();
      ((b)localObject2).field_totalLen = paramb.fgo;
      ((b)localObject2).field_fileFullPath = paramString2;
      ((b)localObject2).field_sdkVer = paramb.sdkVer;
      ((b)localObject2).field_appId = paramb.appId;
      ((b)localObject2).field_clientAppDataId = paramString1;
      ((b)localObject2).field_type = paramb.type;
      ((b)localObject2).field_status = 200L;
      ((b)localObject2).field_isUpload = true;
      ((b)localObject2).field_createTime = bo.anU();
      ((b)localObject2).field_lastModifyTime = bo.anT();
      ((b)localObject2).field_mediaSvrId = bo.anU();
      am.aUq().b((com.tencent.mm.sdk.e.c)localObject2);
      ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " summerbig buildUploadAttachInfo file:" + ((b)localObject2).field_fileFullPath + " rowid:" + ((b)localObject2).xDa + " clientAppDataId:" + ((b)localObject2).field_clientAppDataId);
      if (((b)localObject2).xDa < 0L)
      {
        ab.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " summerbig uploadAttach insert appattach info failed :" + ((b)localObject2).xDa);
        AppMethodBeat.o(27334);
        paramString1 = localObject1;
      }
      else
      {
        AppMethodBeat.o(27334);
        paramString1 = (String)localObject2;
      }
    }
  }

  public static String a(String paramString1, long paramLong, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(27332);
    b localb = new b();
    localb.field_fileFullPath = paramString1;
    localb.field_appId = paramString2;
    localb.field_sdkVer = paramInt1;
    localb.field_mediaSvrId = paramString3;
    localb.field_totalLen = paramInt2;
    localb.field_status = 101L;
    localb.field_isUpload = false;
    localb.field_createTime = bo.anU();
    localb.field_lastModifyTime = bo.anT();
    localb.field_msgInfoId = paramLong;
    localb.field_netTimes = 0L;
    localb.field_type = paramInt3;
    ab.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], stack[%s]", new Object[] { Boolean.valueOf(am.aUq().b(localb)), Long.valueOf(localb.xDa), Long.valueOf(localb.field_totalLen), Long.valueOf(localb.field_type), Integer.valueOf(paramInt4), paramString1, bo.dpG() });
    AppMethodBeat.o(27332);
    return paramString3;
  }

  public static void a(bi parambi, l.a parama)
  {
    AppMethodBeat.i(27328);
    Object localObject = j.b.me(parambi.field_content);
    if (localObject == null)
    {
      ab.e("MicroMsg.AppMsgLogic", "parse msgContent error, %s", new Object[] { parambi.field_content });
      AppMethodBeat.o(27328);
    }
    while (true)
    {
      return;
      if ((bo.isNullOrNil(((j.b)localObject).csD)) && (!bo.isNullOrNil(((j.b)localObject).fgD)))
      {
        ab.e("MicroMsg.AppMsgLogic", "msgContent format error, %s", new Object[] { parambi.field_content });
        ((j.b)localObject).csD = ((j.b)localObject).fgD.hashCode();
      }
      localObject = ((j.b)localObject).csD;
      if ((!a(parambi, i((String)localObject, parambi.field_msgId))) && (d((String)localObject, parambi)))
      {
        pJg = new com.tencent.mm.plugin.record.b.e(parambi.field_msgId, (String)localObject, new com.tencent.mm.ai.g()
        {
          public final void a(int paramAnonymousInt1, int paramAnonymousInt2, m paramAnonymousm)
          {
            AppMethodBeat.i(27323);
            if (this.vci != null)
              this.vci.gK(paramAnonymousInt1, paramAnonymousInt2);
            AppMethodBeat.o(27323);
          }
        });
        aw.Rg().a(pJg, 0);
      }
      AppMethodBeat.o(27328);
    }
  }

  public static boolean a(bi parambi, b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(27329);
    if ((paramb == null) || (!com.tencent.mm.vfs.e.ct(paramb.field_fileFullPath)))
      AppMethodBeat.o(27329);
    while (true)
    {
      return bool;
      if ((paramb.bCR()) || ((parambi.field_isSend == 1) && (paramb.field_isUpload)))
      {
        AppMethodBeat.o(27329);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(27329);
      }
    }
  }

  public static boolean aiK(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(27324);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(27324);
    while (true)
    {
      return bool;
      if (paramString.equals("0:0"))
      {
        AppMethodBeat.o(27324);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(27324);
      }
    }
  }

  public static int aiL(String paramString)
  {
    AppMethodBeat.i(27326);
    j.b localb = j.b.me(paramString);
    int i;
    if (localb == null)
    {
      AppMethodBeat.o(27326);
      i = -1;
    }
    while (true)
    {
      return i;
      if (!aiK(localb.csD))
      {
        AppMethodBeat.o(27326);
        i = -1;
      }
      else
      {
        b localb1 = new b();
        long l = bo.getLong(localb.csD, -1L);
        if (l != -1L)
        {
          am.aUq().b(l, localb1);
          paramString = localb1;
          if (localb1.xDa != l)
          {
            localb1 = am.aUq().aiE(localb.csD);
            if (localb1 != null)
            {
              paramString = localb1;
              if (localb1.field_mediaSvrId.equals(localb.csD));
            }
            else
            {
              AppMethodBeat.o(27326);
              i = -1;
            }
          }
        }
        else
        {
          localb1 = am.aUq().aiE(localb.csD);
          if (localb1 != null)
          {
            paramString = localb1;
            if (localb1.field_mediaSvrId.equals(localb.csD));
          }
          else
          {
            AppMethodBeat.o(27326);
            i = -1;
            continue;
          }
          if (paramString.field_totalLen == 0L)
          {
            AppMethodBeat.o(27326);
            i = -1;
          }
          else
          {
            i = (int)(paramString.field_offset * 100L / paramString.field_totalLen);
            AppMethodBeat.o(27326);
          }
        }
      }
    }
  }

  public static b aiM(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(27347);
    b localb = new b();
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(27347);
      return localObject;
    }
    ab.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", new Object[] { paramString });
    long l = bo.getLong(paramString, -1L);
    if (l != -1L)
    {
      am.aUq().b(l, localb);
      localObject = localb;
      if (localb.xDa != l)
      {
        localb = am.aUq().aiE(paramString);
        if (localb != null)
        {
          localObject = localb;
          if (localb.field_mediaSvrId.equals(paramString));
        }
        else
        {
          ab.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
          localObject = null;
        }
      }
    }
    while (true)
    {
      ab.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", new Object[] { paramString, Long.valueOf(l) });
      AppMethodBeat.o(27347);
      break;
      localb = am.aUq().aiE(paramString);
      if (localb != null)
      {
        localObject = localb;
        if (localb.field_mediaSvrId.equals(paramString));
      }
      else
      {
        ab.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
        localObject = null;
      }
    }
  }

  public static void al(bi parambi)
  {
    AppMethodBeat.i(27348);
    Object localObject1 = j.b.me(parambi.field_content);
    if (localObject1 == null)
    {
      ab.e("MicroMsg.AppMsgLogic", "resend app message error: app content null");
      AppMethodBeat.o(27348);
    }
    while (true)
    {
      return;
      Object localObject2 = aiM(((j.b)localObject1).csD);
      Object localObject3 = "";
      Object localObject5 = localObject3;
      if (localObject2 != null)
      {
        localObject5 = localObject3;
        if (((b)localObject2).field_fileFullPath != null)
        {
          localObject5 = localObject3;
          if (!((b)localObject2).field_fileFullPath.equals(""))
          {
            aw.ZK();
            localObject5 = X(com.tencent.mm.model.c.Ye(), ((j.b)localObject1).title, ((j.b)localObject1).fgp);
            com.tencent.mm.vfs.e.y(((b)localObject2).field_fileFullPath, (String)localObject5);
          }
        }
      }
      if ((parambi.field_imgPath != null) && (!parambi.field_imgPath.equals("")));
      String str;
      Object localObject4;
      for (localObject3 = o.ahl().I(parambi.field_imgPath, true); ; localObject4 = null)
        try
        {
          localObject3 = com.tencent.mm.vfs.e.e((String)localObject3, 0, -1);
          localObject2 = j.b.a((j.b)localObject1);
          str = ((j.b)localObject1).appName;
          localObject1 = System.currentTimeMillis();
          if (bo.isNullOrNil((String)localObject5))
            break label214;
          localObject1 = a((String)localObject1, (j.b)localObject2, (String)localObject5);
          localObject5 = localObject1;
          if (localObject1 != null)
            break label217;
          com.tencent.mm.compatible.util.g.getLine();
          AppMethodBeat.o(27348);
        }
        catch (Exception localException)
        {
        }
      label214: localObject5 = null;
      label217: localObject1 = new bi();
      if ((localObject4 != null) && (localObject4.length > 0))
      {
        if (((j.b)localObject2).type != 46)
          break label521;
        localObject4 = o.ahl().a((byte[])localObject4, Bitmap.CompressFormat.JPEG);
        ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " thumbData MsgInfo path:" + (String)localObject4);
        if (!bo.isNullOrNil((String)localObject4))
        {
          ((bi)localObject1).jv((String)localObject4);
          ab.d("MicroMsg.AppMsgLogic", "new thumbnail saved, path".concat(String.valueOf(localObject4)));
        }
      }
      if (localObject5 != null)
        ((j.b)localObject2).csD = ((b)localObject5).xDa;
      ((bi)localObject1).setContent(j.b.a((j.b)localObject2, null, null));
      ((bi)localObject1).setStatus(1);
      ((bi)localObject1).ju(parambi.field_talker);
      ((bi)localObject1).eJ(bf.oC(parambi.field_talker));
      ((bi)localObject1).hO(1);
      ((bi)localObject1).setType(d((j.b)localObject2));
      if (com.tencent.mm.aj.f.kq(((cy)localObject1).field_talker))
      {
        ((bi)localObject1).ix(com.tencent.mm.aj.a.e.aae());
        ab.d("MicroMsg.AppMsgLogic", "NetSceneSendMsg:MsgSource:%s", new Object[] { ((cy)localObject1).dqJ });
      }
      aw.ZK();
      long l = com.tencent.mm.model.c.XO().Z((bi)localObject1);
      ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " msginfo insert id: " + l);
      if (l < 0L)
      {
        ab.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + "insert msg failed :" + l);
        com.tencent.mm.compatible.util.g.getLine();
        AppMethodBeat.o(27348);
        continue;
        label521: if (((j.b)localObject2).type == 2);
        for (boolean bool = true; ; bool = false)
        {
          localObject4 = o.ahl().a((byte[])localObject4, bool, Bitmap.CompressFormat.PNG);
          break;
        }
      }
      else
      {
        ab.i("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.getLine() + " new msg inserted to db , local id = " + l);
        ((bi)localObject1).setMsgId(l);
        localObject4 = new tq();
        ((tq)localObject4).cPN.cPO = parambi.field_msgId;
        ((tq)localObject4).cPN.cPP = l;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject4);
        parambi = new com.tencent.mm.af.j();
        parambi.field_xml = ((cy)localObject1).field_content;
        parambi.field_title = ((j.b)localObject2).title;
        parambi.field_type = ((j.b)localObject2).type;
        parambi.field_description = ((j.b)localObject2).description;
        parambi.field_msgId = l;
        parambi.field_source = str;
        am.dhN().b(parambi);
        if (localObject5 != null)
        {
          ((b)localObject5).field_msgInfoId = l;
          ((b)localObject5).field_status = 101L;
          am.aUq().a((b)localObject5, new String[0]);
          am.dhP().run();
          AppMethodBeat.o(27348);
        }
        else
        {
          am.dhP();
          al.a.jB(l);
          AppMethodBeat.o(27348);
        }
      }
    }
  }

  public static String b(j.b paramb, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    AppMethodBeat.i(27345);
    ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + "mediaMessageToContent sdkver:" + paramWXMediaMessage.sdkVer + " title:" + paramWXMediaMessage.title + " desc:" + paramWXMediaMessage.description + " type:" + paramWXMediaMessage.mediaObject.type());
    paramb.sdkVer = paramWXMediaMessage.sdkVer;
    paramb.title = paramWXMediaMessage.title;
    paramb.description = paramWXMediaMessage.description;
    paramb.mediaTagName = paramWXMediaMessage.mediaTagName;
    paramb.messageAction = paramWXMediaMessage.messageAction;
    paramb.messageExt = paramWXMediaMessage.messageExt;
    paramWXMediaMessage = paramWXMediaMessage.mediaObject;
    paramb.type = paramWXMediaMessage.type();
    if (paramb.type == 7)
    {
      paramWXMediaMessage = (WXAppExtendObject)paramWXMediaMessage;
      paramb.extInfo = paramWXMediaMessage.extInfo;
      if (!bo.cb(paramWXMediaMessage.fileData))
      {
        ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " fileData:" + paramWXMediaMessage.fileData.length);
        paramb.fgo = paramWXMediaMessage.fileData.length;
        paramb = bH(paramWXMediaMessage.fileData);
        AppMethodBeat.o(27345);
      }
    }
    while (true)
    {
      return paramb;
      paramb.fgo = ((int)com.tencent.mm.vfs.e.asZ(paramWXMediaMessage.filePath));
      ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " read file:" + paramWXMediaMessage.filePath + " len:" + paramb.fgo);
      if (paramb.fgo > 0)
      {
        paramb.fgp = com.tencent.mm.vfs.e.cv(paramWXMediaMessage.filePath);
        paramb = paramWXMediaMessage.filePath;
        AppMethodBeat.o(27345);
      }
      else
      {
        AppMethodBeat.o(27345);
        paramb = null;
        continue;
        if (paramb.type == 6)
        {
          paramWXMediaMessage = (WXFileObject)paramWXMediaMessage;
          if (!bo.cb(paramWXMediaMessage.fileData))
          {
            ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " fileData:" + paramWXMediaMessage.fileData.length);
            paramb.fgo = paramWXMediaMessage.fileData.length;
            paramb = bH(paramWXMediaMessage.fileData);
            AppMethodBeat.o(27345);
          }
          else
          {
            paramb.fgo = ((int)com.tencent.mm.vfs.e.asZ(paramWXMediaMessage.filePath));
            ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " read file:" + paramWXMediaMessage.filePath + " len:" + paramb.fgo);
            if (paramb.fgo > 0)
            {
              paramb.fgp = com.tencent.mm.vfs.e.cv(paramWXMediaMessage.filePath);
              paramb = paramWXMediaMessage.filePath;
              AppMethodBeat.o(27345);
            }
            else
            {
              AppMethodBeat.o(27345);
              paramb = null;
            }
          }
        }
        else if (paramb.type == 2)
        {
          paramWXMediaMessage = (WXImageObject)paramWXMediaMessage;
          if (!bo.cb(paramWXMediaMessage.imageData))
          {
            ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " fileData:" + paramWXMediaMessage.imageData.length);
            paramb.fgo = paramWXMediaMessage.imageData.length;
            paramb = bH(paramWXMediaMessage.imageData);
            AppMethodBeat.o(27345);
          }
          else if (!bo.isNullOrNil(paramWXMediaMessage.imagePath))
          {
            paramb.fgo = ((int)com.tencent.mm.vfs.e.asZ(paramWXMediaMessage.imagePath));
            ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " read file:" + paramWXMediaMessage.imagePath + " len:" + paramb.fgo);
            if (paramb.fgo > 0)
            {
              paramb.fgp = com.tencent.mm.vfs.e.cv(paramWXMediaMessage.imagePath);
              aw.ZK();
              paramb = com.tencent.mm.vfs.j.w(new com.tencent.mm.vfs.b(com.tencent.mm.model.c.Ye(), "appmsg_img_" + System.currentTimeMillis()).dMD());
              paramString = com.tencent.mm.sdk.platformtools.d.amj(paramWXMediaMessage.imagePath);
              if ((paramString == null) || (paramString.outWidth <= 0) || (paramString.outHeight <= 0))
              {
                boolean bool;
                label771: int i;
                if (paramString == null)
                {
                  bool = true;
                  if (paramString != null)
                    break label836;
                  i = -1;
                  label778: if (paramString != null)
                    break label845;
                }
                label836: label845: for (int j = -1; ; j = paramString.outHeight)
                {
                  ab.e("MicroMsg.AppMsgLogic", "options is null! %B, bitmapWidth = %d, bitmapHeight = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), Integer.valueOf(j) });
                  AppMethodBeat.o(27345);
                  paramb = null;
                  break;
                  bool = false;
                  break label771;
                  i = paramString.outWidth;
                  break label778;
                }
              }
              if (r.g(paramWXMediaMessage.imagePath, "", true))
              {
                ab.i("MicroMsg.AppMsgLogic", "this picture can send raw image but must copy [%s] to [%s]", new Object[] { paramWXMediaMessage.imagePath, paramb });
                if (com.tencent.mm.vfs.e.y(paramWXMediaMessage.imagePath, paramb) < 0L)
                {
                  ab.w("MicroMsg.AppMsgLogic", "copy file error path[%s, %s]", new Object[] { paramWXMediaMessage.imagePath, paramb });
                  AppMethodBeat.o(27345);
                  paramb = null;
                }
                else
                {
                  AppMethodBeat.o(27345);
                }
              }
              else
              {
                if ((paramString.outWidth > 960) || (paramString.outHeight > 960))
                {
                  paramWXMediaMessage = com.tencent.mm.sdk.platformtools.d.d(paramWXMediaMessage.imagePath, 960, 960, false);
                  if (paramWXMediaMessage == null);
                }
                while (com.tencent.mm.vfs.e.y(paramWXMediaMessage.imagePath, paramb) >= 0L)
                {
                  try
                  {
                    com.tencent.mm.sdk.platformtools.d.a(paramWXMediaMessage, 100, Bitmap.CompressFormat.JPEG, paramb, true);
                    AppMethodBeat.o(27345);
                  }
                  catch (IOException paramb)
                  {
                    ab.printErrStackTrace("MicroMsg.AppMsgLogic", paramb, "", new Object[0]);
                    AppMethodBeat.o(27345);
                    paramb = null;
                  }
                  break;
                  AppMethodBeat.o(27345);
                  paramb = null;
                  break;
                }
                AppMethodBeat.o(27345);
                paramb = null;
              }
            }
            else
            {
              AppMethodBeat.o(27345);
              paramb = null;
            }
          }
          else
          {
            AppMethodBeat.o(27345);
            paramb = null;
          }
        }
        else if (paramb.type == 3)
        {
          paramWXMediaMessage = (WXMusicObject)paramWXMediaMessage;
          paramb.url = paramWXMediaMessage.musicUrl;
          paramb.fgn = paramWXMediaMessage.musicLowBandUrl;
          paramb.fgM = paramWXMediaMessage.musicDataUrl;
          paramb.fgN = paramWXMediaMessage.musicLowBandDataUrl;
          AppMethodBeat.o(27345);
          paramb = null;
        }
        else if (paramb.type == 4)
        {
          paramWXMediaMessage = (WXVideoObject)paramWXMediaMessage;
          paramb.url = paramWXMediaMessage.videoUrl;
          paramb.fgn = paramWXMediaMessage.videoLowBandUrl;
          AppMethodBeat.o(27345);
          paramb = null;
        }
        else if (paramb.type == 5)
        {
          paramWXMediaMessage = (WXWebpageObject)paramWXMediaMessage;
          paramb.url = paramWXMediaMessage.webpageUrl;
          if (!bo.isNullOrNil(paramWXMediaMessage.extInfo))
            paramb.extInfo = paramWXMediaMessage.extInfo;
          if (!bo.isNullOrNil(paramWXMediaMessage.canvasPageXml))
            paramb.canvasPageXml = paramWXMediaMessage.canvasPageXml;
          AppMethodBeat.o(27345);
          paramb = null;
        }
        else
        {
          if ((paramb.type == 36) || (paramb.type == 46))
          {
            paramWXMediaMessage = (WXMiniProgramObject)paramWXMediaMessage;
            paramb.fiP = paramWXMediaMessage.userName;
            paramb.fiO = paramWXMediaMessage.path;
            paramb.url = paramWXMediaMessage.webpageUrl;
            paramWXMediaMessage = ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).zb(paramWXMediaMessage.userName);
            if (paramWXMediaMessage != null)
            {
              if (paramWXMediaMessage.ayL() != null)
                paramb.fja = paramWXMediaMessage.ayL().axy;
              paramb.fjb = paramWXMediaMessage.field_brandIconURL;
              ab.i("MicroMsg.AppMsgLogic", "add appbrand version and appbrand icon url : %d, %s", new Object[] { Integer.valueOf(paramb.fja), paramb.fjb });
            }
          }
          label1621: 
          do
          {
            while (true)
            {
              AppMethodBeat.o(27345);
              paramb = null;
              break;
              if (paramb.type == 1)
              {
                paramb.title = ((WXTextObject)paramWXMediaMessage).text;
                AppMethodBeat.o(27345);
                paramb = null;
                break;
              }
              if (paramb.type != 8)
                break label1621;
              paramWXMediaMessage = (WXEmojiObject)paramWXMediaMessage;
              if (!bo.cb(paramWXMediaMessage.emojiData))
              {
                ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " fileData:" + paramWXMediaMessage.emojiData.length);
                paramb.fgo = paramWXMediaMessage.emojiData.length;
                paramb = bH(paramWXMediaMessage.emojiData);
                AppMethodBeat.o(27345);
                break;
              }
              if (!bo.isNullOrNil(paramWXMediaMessage.emojiPath))
              {
                paramb.fgo = ((int)com.tencent.mm.vfs.e.asZ(paramWXMediaMessage.emojiPath));
                ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " read file:" + paramWXMediaMessage.emojiPath + " len:" + paramb.fgo);
                if (paramb.fgo > 0)
                {
                  paramb.fgp = com.tencent.mm.vfs.e.cv(paramWXMediaMessage.emojiPath);
                  paramb = paramWXMediaMessage.emojiPath;
                  AppMethodBeat.o(27345);
                  break;
                }
                AppMethodBeat.o(27345);
                paramb = null;
                break;
              }
              paramb.fgq = paramString;
            }
            if (paramb.type == 15)
            {
              paramWXMediaMessage = (WXEmojiSharedObject)paramWXMediaMessage;
              paramb.thumburl = paramWXMediaMessage.thumburl;
              paramb.fgY = paramWXMediaMessage.packageflag;
              paramb.fgX = paramWXMediaMessage.packageid;
              paramb.showType = 8;
              paramb.url = paramWXMediaMessage.url;
              AppMethodBeat.o(27345);
              paramb = null;
              break;
            }
            if (paramb.type == 13)
            {
              paramWXMediaMessage = (WXEmojiSharedObject)paramWXMediaMessage;
              paramb.thumburl = paramWXMediaMessage.thumburl;
              paramb.fgY = paramWXMediaMessage.packageflag;
              paramb.fgX = paramWXMediaMessage.packageid;
              paramb.showType = 8;
              paramb.url = paramWXMediaMessage.url;
              AppMethodBeat.o(27345);
              paramb = null;
              break;
            }
            if (paramb.type == 25)
            {
              paramWXMediaMessage = (WXDesignerSharedObject)paramWXMediaMessage;
              paramb.thumburl = paramWXMediaMessage.thumburl;
              paramb.url = paramWXMediaMessage.url;
              paramb.fiD = paramWXMediaMessage.designerUIN;
              paramb.designerName = paramWXMediaMessage.designerName;
              paramb.designerRediretctUrl = paramWXMediaMessage.designerRediretctUrl;
              paramb.showType = 18;
              AppMethodBeat.o(27345);
              paramb = null;
              break;
            }
          }
          while ((paramb.type != 27) && (paramb.type != 26));
          paramWXMediaMessage = (WXEmojiPageSharedObject)paramWXMediaMessage;
          paramb.thumburl = paramWXMediaMessage.iconUrl;
          paramb.url = paramWXMediaMessage.url;
          paramb.tid = paramWXMediaMessage.tid;
          paramb.fiE = paramWXMediaMessage.title;
          paramb.desc = paramWXMediaMessage.desc;
          paramb.iconUrl = paramWXMediaMessage.iconUrl;
          paramb.secondUrl = paramWXMediaMessage.secondUrl;
          paramb.pageType = paramWXMediaMessage.pageType;
          paramb.showType = 20;
          AppMethodBeat.o(27345);
          paramb = null;
        }
      }
    }
  }

  public static String bH(byte[] paramArrayOfByte)
  {
    Object localObject1 = null;
    AppMethodBeat.i(27344);
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " attachBuf is null");
      AppMethodBeat.o(27344);
      paramArrayOfByte = localObject1;
    }
    while (true)
    {
      return paramArrayOfByte;
      Object localObject2 = new StringBuilder();
      aw.ZK();
      localObject2 = com.tencent.mm.model.c.Ye() + "ua_" + bo.anU();
      ab.d("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " buildUploadAttachInfo file:" + (String)localObject2);
      if (com.tencent.mm.vfs.e.b((String)localObject2, paramArrayOfByte, paramArrayOfByte.length) != 0)
      {
        ab.e("MicroMsg.AppMsgLogic", com.tencent.mm.compatible.util.g.Mq() + " writeFile error file:" + (String)localObject2);
        AppMethodBeat.o(27344);
        paramArrayOfByte = localObject1;
      }
      else
      {
        AppMethodBeat.o(27344);
        paramArrayOfByte = (byte[])localObject2;
      }
    }
  }

  public static int d(j.b paramb)
  {
    int i = -1879048183;
    AppMethodBeat.i(27349);
    if (paramb == null)
    {
      AppMethodBeat.o(27349);
      i = 49;
    }
    while (true)
    {
      return i;
      int j = paramb.type;
      int k = paramb.showType;
      int m = paramb.ffZ;
      int n = paramb.fgO;
      int i1 = paramb.fii;
      ab.d("MicroMsg.AppMsgLogic", "getLocalAppMsgType showType " + k + " atype " + j + ", itemShowType = " + m + ", c2cNewAAType = " + i1);
      if ((m == 4) || (n != 0))
      {
        i = 318767153;
        AppMethodBeat.o(27349);
      }
      else if (j == 2001)
      {
        if (k == 1)
        {
          i = 469762097;
          AppMethodBeat.o(27349);
        }
        else if (i1 == 4)
        {
          i = 503316529;
          AppMethodBeat.o(27349);
        }
        else
        {
          i = 436207665;
          AppMethodBeat.o(27349);
        }
      }
      else if (j == 2002)
      {
        i = 536870961;
        AppMethodBeat.o(27349);
      }
      else
      {
        switch (k)
        {
        default:
          switch (j)
          {
          default:
            AppMethodBeat.o(27349);
            i = 49;
          case 2:
          case 1:
          case 8:
          case 10:
          case 20:
          case 13:
          case 16:
          case 17:
          case 2000:
          case 34:
          case 33:
          case 46:
          case 671088689:
          case 47:
          }
          break;
        case 1:
          if (j == 21)
          {
            i = -1879048185;
            AppMethodBeat.o(27349);
          }
          else
          {
            i = 285212721;
            AppMethodBeat.o(27349);
          }
          break;
        case 2:
          if (j == 21)
          {
            AppMethodBeat.o(27349);
          }
          else
          {
            i = 301989937;
            AppMethodBeat.o(27349);
          }
          break;
        case 3:
          if (j == 21)
          {
            i = -1879048176;
            AppMethodBeat.o(27349);
          }
          else
          {
            i = -1879048189;
            AppMethodBeat.o(27349);
          }
          break;
        case 4:
          if (j == 21)
          {
            AppMethodBeat.o(27349);
          }
          else
          {
            i = -1879048190;
            AppMethodBeat.o(27349);
          }
          break;
        case 5:
          i = -1879048191;
          AppMethodBeat.o(27349);
          break;
        case 17:
          AppMethodBeat.o(27349);
          i = -1879048186;
          continue;
          i = 268435505;
          AppMethodBeat.o(27349);
          continue;
          i = 16777265;
          AppMethodBeat.o(27349);
          continue;
          i = 1048625;
          AppMethodBeat.o(27349);
          continue;
          i = 335544369;
          AppMethodBeat.o(27349);
          continue;
          i = 402653233;
          AppMethodBeat.o(27349);
          continue;
          i = 369098801;
          AppMethodBeat.o(27349);
          continue;
          i = 452984881;
          AppMethodBeat.o(27349);
          continue;
          AppMethodBeat.o(27349);
          i = -1879048186;
          continue;
          i = 419430449;
          AppMethodBeat.o(27349);
          continue;
          i = 520093745;
          AppMethodBeat.o(27349);
          continue;
          com.tencent.mm.af.a locala = (com.tencent.mm.af.a)paramb.X(com.tencent.mm.af.a.class);
          if ((locala != null) && (locala.feY) && ((paramb.fiR == 2) || (paramb.fiR == 3)))
          {
            i = 553648177;
            AppMethodBeat.o(27349);
          }
          else if ((locala != null) && (locala.ffb) && (paramb.fiR == 3))
          {
            i = 587202609;
            AppMethodBeat.o(27349);
          }
          else
          {
            AppMethodBeat.o(27349);
            i = 49;
            continue;
            i = 687865905;
            AppMethodBeat.o(27349);
            continue;
            i = 671088689;
            AppMethodBeat.o(27349);
            continue;
            i = 704643121;
            AppMethodBeat.o(27349);
          }
          break;
        }
      }
    }
  }

  public static b d(bi parambi, String paramString)
  {
    AppMethodBeat.i(27346);
    b localb = aiM(paramString);
    if (localb == null)
    {
      s(parambi.field_msgId, parambi.field_content);
      parambi = aiM(paramString);
      AppMethodBeat.o(27346);
    }
    while (true)
    {
      return parambi;
      AppMethodBeat.o(27346);
      parambi = localb;
    }
  }

  public static boolean d(String paramString, bi parambi)
  {
    AppMethodBeat.i(27330);
    if (parambi == null)
    {
      bool1 = false;
      AppMethodBeat.o(27330);
      return bool1;
    }
    boolean bool2 = true;
    String str1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    Object localObject1 = i(paramString, parambi.field_msgId);
    Object localObject2 = j.b.me(parambi.field_content);
    if (localObject2 != null)
    {
      str1 = ah.nullAsNil(((j.b)localObject2).title);
      str2 = ah.nullAsNil(((j.b)localObject2).fgp).toLowerCase();
      str3 = ah.nullAsNil(((j.b)localObject2).filemd5);
      str4 = ah.nullAsNil(((j.b)localObject2).cEV);
      str5 = ah.nullAsNil(((j.b)localObject2).eyr);
    }
    if (localObject1 == null)
    {
      s(parambi.field_msgId, parambi.field_content);
      parambi = i(paramString, parambi.field_msgId);
      paramString = parambi;
      bool1 = bool2;
      if (parambi != null)
      {
        l1 = parambi.xDa;
        l2 = parambi.field_totalLen;
        localObject1 = parambi.field_fileFullPath;
        l3 = parambi.field_type;
        paramString = parambi.field_mediaId;
        l4 = parambi.field_msgInfoId;
        bool1 = parambi.field_isUpload;
        if (parambi.field_signature != null)
          break label354;
        i = -1;
        label198: ab.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), localObject1, Long.valueOf(l3), paramString, Long.valueOf(l4), Boolean.valueOf(bool1), Integer.valueOf(i) });
        paramString = parambi;
        bool1 = bool2;
        if (localObject2 != null)
          if (((j.b)localObject2).fgs == 0)
          {
            paramString = parambi;
            bool1 = bool2;
            if (((j.b)localObject2).fgo <= 26214400);
          }
          else
          {
            if (ah.isNullOrNil(parambi.field_signature))
              break label366;
          }
      }
      label354: label366: for (bool1 = true; ; bool1 = false)
      {
        paramString = parambi;
        if (!bool1)
          aw.Rg().a(new com.tencent.mm.plugin.record.b.c(paramString, str5, str3, str1, str2, str4), 0);
        AppMethodBeat.o(27330);
        break;
        i = parambi.field_signature.length();
        break label198;
      }
    }
    paramString = new com.tencent.mm.vfs.b(((b)localObject1).field_fileFullPath);
    if ((((b)localObject1).field_status == 199L) && (!paramString.exists()))
    {
      ab.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo info exist but file not!");
      s(parambi.field_msgId, parambi.field_content);
    }
    long l3 = ((b)localObject1).xDa;
    long l4 = ((b)localObject1).field_totalLen;
    localObject2 = ((b)localObject1).field_fileFullPath;
    long l2 = ((b)localObject1).field_type;
    parambi = ((b)localObject1).field_mediaId;
    long l5 = ((b)localObject1).field_msgInfoId;
    boolean bool3 = ((b)localObject1).field_isUpload;
    boolean bool1 = paramString.exists();
    long l1 = ((b)localObject1).field_status;
    if (((b)localObject1).field_signature == null);
    for (int i = -1; ; i = ((b)localObject1).field_signature.length())
    {
      ab.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", new Object[] { Long.valueOf(l3), Long.valueOf(l4), localObject2, Long.valueOf(l2), parambi, Long.valueOf(l5), Boolean.valueOf(bool3), Boolean.valueOf(bool1), Long.valueOf(l1), Integer.valueOf(i) });
      paramString = (String)localObject1;
      bool1 = bool2;
      break;
    }
  }

  public static b i(String paramString, long paramLong)
  {
    AppMethodBeat.i(27331);
    b localb = aiM(paramString);
    paramString = localb;
    if (localb == null)
      paramString = am.aUq().lZ(paramLong);
    if (paramString != null)
      ab.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", new Object[] { paramString, Long.valueOf(paramString.xDa), Boolean.valueOf(paramString.field_isUpload), paramString.field_fileFullPath, Long.valueOf(paramString.field_totalLen), Long.valueOf(paramString.field_offset), paramString.field_mediaSvrId, paramString.field_mediaId, Long.valueOf(paramString.field_msgInfoId), Long.valueOf(paramString.field_type), ah.anW() });
    while (true)
    {
      AppMethodBeat.o(27331);
      return paramString;
      ab.w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", new Object[] { ah.anW() });
    }
  }

  public static void jC(long paramLong)
  {
    AppMethodBeat.i(27325);
    am.aUq().lY(paramLong);
    b localb = new b();
    am.aUq().b(paramLong, localb);
    if (localb.field_msgInfoId <= 0L)
      AppMethodBeat.o(27325);
    while (true)
    {
      return;
      aw.ZK();
      bi localbi = com.tencent.mm.model.c.XO().jf(localb.field_msgInfoId);
      if (localbi.field_msgId != localb.field_msgInfoId)
      {
        AppMethodBeat.o(27325);
      }
      else
      {
        localbi.setStatus(5);
        aw.ZK();
        com.tencent.mm.model.c.XO().a(localbi.field_msgId, localbi);
        AppMethodBeat.o(27325);
      }
    }
  }

  public static String s(long paramLong, String paramString)
  {
    String str = null;
    AppMethodBeat.i(27327);
    ab.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", new Object[] { Long.valueOf(paramLong), paramString, null });
    paramString = j.b.me(paramString);
    if (paramString == null)
    {
      AppMethodBeat.o(27327);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = X(com.tencent.mm.compatible.util.e.euQ, paramString.title, paramString.fgp);
      if ((bo.isNullOrNil(paramString.csD)) && (!bo.isNullOrNil(paramString.fgD)))
        paramString.csD = paramString.fgD.hashCode();
      paramString = a(str, paramLong, paramString.sdkVer, paramString.appId, paramString.csD, paramString.fgo, paramString.type, paramString.fgs);
      AppMethodBeat.o(27327);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.l
 * JD-Core Version:    0.6.2
 */