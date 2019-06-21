package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.r;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.plugin.gallery.model.k;
import com.tencent.mm.plugin.record.b.n;
import com.tencent.mm.pluginsdk.model.app.am;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.protobuf.aap;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.aas;
import com.tencent.mm.protocal.protobuf.aat;
import com.tencent.mm.protocal.protobuf.aay;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bi.b;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import com.tencent.wework.api.model.WWMediaConversation;
import com.tencent.wework.api.model.WWMediaFile;
import com.tencent.wework.api.model.WWMediaImage;
import com.tencent.wework.api.model.WWMediaLink;
import com.tencent.wework.api.model.WWMediaLocation;
import com.tencent.wework.api.model.WWMediaMergedConvs;
import com.tencent.wework.api.model.WWMediaMessage.WWMediaObject;
import com.tencent.wework.api.model.WWMediaMiniProgram;
import com.tencent.wework.api.model.WWMediaText;
import com.tencent.wework.api.model.WWMediaVideo;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class an
{
  private static WWMediaMergedConvs a(aar paramaar, bi parambi, ad paramad, boolean paramBoolean)
  {
    AppMethodBeat.i(31041);
    WWMediaMergedConvs localWWMediaMergedConvs = new WWMediaMergedConvs();
    if (paramaar == null)
      AppMethodBeat.o(31041);
    while (true)
    {
      return localWWMediaMergedConvs;
      paramaar = n.VI(paramaar.whj);
      if (paramaar == null)
      {
        AppMethodBeat.o(31041);
        continue;
      }
      localWWMediaMergedConvs.title = paramaar.title;
      Iterator localIterator = paramaar.fjr.iterator();
      label67: aar localaar;
      WWMediaConversation localWWMediaConversation;
      if (localIterator.hasNext())
      {
        localaar = (aar)localIterator.next();
        localWWMediaConversation = new WWMediaConversation();
        paramaar = localaar.wgV;
        if (bo.isNullOrNil(localaar.whu))
          localWWMediaConversation.name = paramaar;
      }
      try
      {
        label121: paramaar = localaar.wgT.whw;
        label142: label186: long l1;
        if (paramaar.whQ)
        {
          paramaar = paramaar.cEV;
          paramaar = com.tencent.mm.ah.b.a(paramaar, false, -1);
          ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
          localByteArrayOutputStream.<init>();
          paramaar.compress(Bitmap.CompressFormat.JPEG, 50, localByteArrayOutputStream);
          localWWMediaConversation.ALE = localByteArrayOutputStream.toByteArray();
          localByteArrayOutputStream.close();
          l1 = 0L;
        }
        try
        {
          paramaar = new java/text/SimpleDateFormat;
          paramaar.<init>("yyyy-MM-dd HH:mm:ss");
          l2 = paramaar.parse(localaar.wgX).getTime();
          localWWMediaConversation.pXQ = l2;
          localWWMediaConversation.ALF = a(paramad, localaar, parambi, paramBoolean);
          localWWMediaMergedConvs.a(localWWMediaConversation);
          break label67;
          localWWMediaConversation.name = (paramaar + localaar.whu);
          break label121;
          if (paramaar.whV)
          {
            paramaar = paramaar.whU;
            break label142;
          }
          paramaar = "";
          break label142;
          AppMethodBeat.o(31041);
        }
        catch (ParseException paramaar)
        {
          while (true)
            long l2 = l1;
        }
      }
      catch (Exception paramaar)
      {
        break label186;
      }
    }
  }

  private static WWMediaMergedConvs a(bi parambi, ad paramad, boolean paramBoolean)
  {
    AppMethodBeat.i(31042);
    Object localObject1 = parambi.field_content;
    if (com.tencent.mm.model.t.kH(parambi.field_talker))
      localObject1 = bf.oz(parambi.field_content);
    localObject1 = j.b.me((String)localObject1);
    if (localObject1 != null);
    label86: label233: Object localObject2;
    for (localObject1 = n.VI(((j.b)localObject1).fgU); ; localObject2 = null)
    {
      WWMediaMergedConvs localWWMediaMergedConvs = new WWMediaMergedConvs();
      if (localObject1 == null)
        AppMethodBeat.o(31042);
      while (true)
      {
        return localWWMediaMergedConvs;
        localWWMediaMergedConvs.title = ((com.tencent.mm.protocal.b.a.c)localObject1).title;
        Iterator localIterator = ((com.tencent.mm.protocal.b.a.c)localObject1).fjr.iterator();
        aar localaar;
        WWMediaConversation localWWMediaConversation;
        if (localIterator.hasNext())
        {
          localaar = (aar)localIterator.next();
          localWWMediaConversation = new WWMediaConversation();
          localObject1 = localaar.wgV;
          if (bo.isNullOrNil(localaar.whu))
            localWWMediaConversation.name = ((String)localObject1);
        }
        try
        {
          label140: localObject1 = localaar.wgT.whw;
          label161: label202: long l1;
          if (((aat)localObject1).whQ)
          {
            localObject1 = ((aat)localObject1).cEV;
            Bitmap localBitmap = com.tencent.mm.ah.b.a((String)localObject1, false, -1);
            localObject1 = new java/io/ByteArrayOutputStream;
            ((ByteArrayOutputStream)localObject1).<init>();
            localBitmap.compress(Bitmap.CompressFormat.JPEG, 50, (OutputStream)localObject1);
            localWWMediaConversation.ALE = ((ByteArrayOutputStream)localObject1).toByteArray();
            ((ByteArrayOutputStream)localObject1).close();
            l1 = 0L;
          }
          try
          {
            localObject1 = new java/text/SimpleDateFormat;
            ((SimpleDateFormat)localObject1).<init>("yyyy-MM-dd HH:mm:ss");
            long l2 = ((SimpleDateFormat)localObject1).parse(localaar.wgX).getTime();
            l1 = l2;
            localWWMediaConversation.pXQ = l1;
            localWWMediaConversation.ALF = a(paramad, localaar, parambi, paramBoolean);
            localWWMediaMergedConvs.a(localWWMediaConversation);
            break label86;
            localWWMediaConversation.name = ((String)localObject1 + localaar.whu);
            break label140;
            if (((aat)localObject1).whV)
            {
              localObject1 = ((aat)localObject1).whU;
              break label161;
            }
            localObject1 = "";
            break label161;
            AppMethodBeat.o(31042);
          }
          catch (ParseException localParseException)
          {
            break label233;
          }
        }
        catch (Exception localException)
        {
          break label202;
        }
      }
    }
  }

  private static WWMediaMessage.WWMediaObject a(ad paramad, aar paramaar, bi parambi, boolean paramBoolean)
  {
    Object localObject = null;
    AppMethodBeat.i(31037);
    int i = paramaar.dataType;
    if (i == 1)
    {
      paramad = new WWMediaText(paramaar.desc);
      AppMethodBeat.o(31037);
    }
    while (true)
    {
      return paramad;
      if (i == 2)
      {
        long l = parambi.field_msgId;
        if (!com.tencent.mm.compatible.util.f.Mn())
          paramaar = null;
        while (true)
        {
          if (!bo.isNullOrNil(paramaar))
            break label148;
          ab.i("MicroMsg.SendToWeWorkHelper", "FAV_DATA_TYPE_IMG not exist!");
          AppMethodBeat.o(31037);
          paramad = localObject;
          break;
          parambi = n.c(paramaar, l);
          paramad = parambi;
          if (bo.isNullOrNil(parambi))
            paramad = n.f(paramaar, l);
          if (!bo.isNullOrNil(paramad))
          {
            paramaar = paramad;
            if (com.tencent.mm.a.e.ct(paramad));
          }
          else
          {
            ab.d("MicroMsg.RecordMsgImgService", "getPath file not exist, path[%s]", new Object[] { paramad });
            paramaar = null;
          }
        }
        label148: paramad = new WWMediaImage();
        paramad.filePath = paramaar;
        ab.i("MicroMsg.SendToWeWorkHelper", "send img2, path:%s", new Object[] { paramad.filePath });
        AppMethodBeat.o(31037);
      }
      else if (i == 4)
      {
        paramaar = n.c(paramaar, parambi.field_msgId);
        if ((bo.isNullOrNil(paramaar)) || (!com.tencent.mm.pluginsdk.g.a.d.a.ct(paramaar)))
        {
          ab.i("MicroMsg.SendToWeWorkHelper", "FAV_DATA_TYPE_VIDEO not exist!");
          AppMethodBeat.o(31037);
          paramad = localObject;
        }
        else
        {
          paramad = new WWMediaVideo();
          paramad.filePath = paramaar;
          ab.i("MicroMsg.SendToWeWorkHelper", "send video2, path:%s", new Object[] { paramad.filePath });
          AppMethodBeat.o(31037);
        }
      }
      else if (i == 6)
      {
        paramad = new WWMediaLocation();
        if (paramaar.wgT == null)
        {
          ab.i("MicroMsg.SendToWeWorkHelper", "FAV_DATA_TYPE_LOC not exist!");
          AppMethodBeat.o(31037);
          paramad = localObject;
        }
        else
        {
          parambi = paramaar.wgT.why;
          if (parambi == null)
          {
            ab.w("MicroMsg.SendToWeWorkHelper", "location error, locItem null, dataid[%s]", new Object[] { paramaar.mnd });
            AppMethodBeat.o(31037);
            paramad = localObject;
          }
          else
          {
            paramad.title = parambi.cIK;
            paramad.fBg = parambi.label;
            paramad.longitude = parambi.lng;
            paramad.latitude = parambi.lat;
            paramad.ALG = parambi.cED;
            AppMethodBeat.o(31037);
          }
        }
      }
      else if (i == 8)
      {
        parambi = n.c(paramaar, parambi.field_msgId);
        if (bo.isNullOrNil(parambi))
        {
          ab.w("MicroMsg.SendToWeWorkHelper", "FAV_DATA_TYPE_FILE title == null, dataid[%s]", new Object[] { paramaar.mnd });
          AppMethodBeat.o(31037);
          paramad = localObject;
        }
        else
        {
          if (com.tencent.mm.pluginsdk.g.a.d.a.ek(parambi) > 104857600L)
          {
            paramad = new an.a((byte)0);
            AppMethodBeat.o(31037);
            throw paramad;
          }
          paramad = new WWMediaFile();
          paramad.fileName = paramaar.title;
          paramad.filePath = parambi;
          paramad.contentLengthLimit = 104857600;
          AppMethodBeat.o(31037);
        }
      }
      else if (i == 17)
      {
        paramad = a(paramaar, parambi, paramad, paramBoolean);
        AppMethodBeat.o(31037);
      }
      else if (i == 19)
      {
        paramaar = paramaar.wgT.whN;
        paramad = new WWMediaMiniProgram();
        paramad.username = paramaar.username;
        paramad.path = paramaar.csu;
        paramad.iconUrl = paramaar.iconUrl;
        paramad.ALI = new byte[1];
        paramad.name = paramaar.wfO;
        paramad.title = "";
        ab.d("MicroMsg.SendToWeWorkHelper", "WWMediaMiniProgram[username:%s path:%s iconUrl:%s hdImageData:%s name:%s title:%s]", new Object[] { paramad.username, paramad.path, paramad.iconUrl, Integer.valueOf(paramad.ALI.length), paramad.name, paramad.title });
        AppMethodBeat.o(31037);
      }
      else
      {
        ab.e("MicroMsg.SendToWeWorkHelper", "unsupport msg type: %d", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(31037);
        paramad = localObject;
      }
    }
  }

  private static WWMediaMessage.WWMediaObject a(ad paramad, bi parambi, boolean paramBoolean)
  {
    AppMethodBeat.i(31036);
    int i = parambi.getType();
    if (i == 1)
    {
      paramad = new WWMediaText(j.v(parambi.field_content, parambi.field_isSend, paramBoolean));
      AppMethodBeat.o(31036);
    }
    while (true)
    {
      return paramad;
      if (i == 3)
      {
        paramad = aZ(parambi);
        AppMethodBeat.o(31036);
      }
      else if (i == 43)
      {
        paramad = new WWMediaVideo();
        parambi = u.ut(parambi.field_imgPath);
        com.tencent.mm.modelvideo.o.all();
        paramad.filePath = com.tencent.mm.modelvideo.t.uh(parambi.getFileName());
        ab.i("MicroMsg.SendToWeWorkHelper", "send video2, path:%s", new Object[] { paramad.filePath });
        AppMethodBeat.o(31036);
      }
      else if (i == 48)
      {
        paramad = new WWMediaLocation();
        parambi = j.v(parambi.field_content, parambi.field_isSend, paramBoolean);
        aw.ZK();
        parambi = com.tencent.mm.model.c.XO().Ro(parambi);
        paramad.title = parambi.eUu;
        paramad.fBg = parambi.label;
        paramad.longitude = parambi.nJv;
        paramad.latitude = parambi.nJu;
        paramad.ALG = parambi.cED;
        AppMethodBeat.o(31036);
      }
      else if ((i == 49) || (i == 268435505))
      {
        paramad = b(paramad, parambi, paramBoolean);
        AppMethodBeat.o(31036);
      }
      else
      {
        ab.e("MicroMsg.SendToWeWorkHelper", "unsupport msg type: %d", new Object[] { Integer.valueOf(i) });
        paramad = null;
        AppMethodBeat.o(31036);
      }
    }
  }

  private static WWMediaMessage.WWMediaObject a(ad paramad, List<bi> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(31038);
    WWMediaMergedConvs localWWMediaMergedConvs = new WWMediaMergedConvs();
    Object localObject1 = paramad.field_username;
    Object localObject2 = ah.getContext();
    if (paramBoolean)
      localObject2 = ((Context)localObject2).getString(2131302200);
    while (true)
    {
      localWWMediaMergedConvs.title = ((String)localObject2);
      Object localObject3 = paramList.iterator();
      label53: label97: Object localObject4;
      if (((Iterator)localObject3).hasNext())
      {
        localObject1 = (bi)((Iterator)localObject3).next();
        localObject2 = new WWMediaConversation();
        if (((cy)localObject1).field_isSend == 1)
        {
          paramList = r.Yz();
          localObject4 = com.tencent.mm.openim.room.a.a.A(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramList));
          ((WWMediaConversation)localObject2).name = (com.tencent.mm.model.s.mI(paramList) + bo.nullAsNil((String)localObject4));
        }
      }
      try
      {
        localObject4 = com.tencent.mm.ah.b.a(paramList, false, -1);
        paramList = new java/io/ByteArrayOutputStream;
        paramList.<init>();
        ((Bitmap)localObject4).compress(Bitmap.CompressFormat.JPEG, 50, paramList);
        ((WWMediaConversation)localObject2).ALE = paramList.toByteArray();
        paramList.close();
        label193: ((WWMediaConversation)localObject2).pXQ = ((cy)localObject1).field_createTime;
        ((WWMediaConversation)localObject2).ALF = a(paramad, (bi)localObject1, paramBoolean);
        localWWMediaMergedConvs.a((WWMediaConversation)localObject2);
        break label53;
        localObject3 = r.YB();
        localObject1 = com.tencent.mm.model.s.mI((String)localObject1);
        if (((String)localObject3).equals(localObject1))
        {
          localObject2 = ((Context)localObject2).getString(2131299698, new Object[] { localObject3 });
          continue;
        }
        localObject2 = ((Context)localObject2).getString(2131299697, new Object[] { localObject3, localObject1 });
        continue;
        if (!paramBoolean)
        {
          paramList = ((cy)localObject1).field_talker;
          break label97;
        }
        paramList = bf.oy(((cy)localObject1).field_content);
        break label97;
        AppMethodBeat.o(31038);
        return localWWMediaMergedConvs;
      }
      catch (Exception paramList)
      {
        break label193;
      }
    }
  }

  public static void a(Context paramContext, ad paramad, List<bi> paramList, boolean paramBoolean)
  {
    AppMethodBeat.i(31035);
    IWWAPI localIWWAPI = WWAPIFactory.jv(paramContext);
    try
    {
      if (paramList.size() == 1);
      for (paramad = a(paramad, (bi)paramList.get(0), paramBoolean); ; paramad = a(paramad, paramList, paramBoolean))
      {
        localIWWAPI.a(paramad);
        AppMethodBeat.o(31035);
        return;
      }
    }
    catch (an.a paramad)
    {
      while (true)
      {
        com.tencent.mm.ui.base.h.g(paramContext, 2131302959, 2131297061);
        AppMethodBeat.o(31035);
      }
    }
  }

  private static WWMediaMessage.WWMediaObject aZ(bi parambi)
  {
    Object localObject1 = null;
    AppMethodBeat.i(31039);
    if (parambi.field_msgId > 0L);
    for (Object localObject2 = com.tencent.mm.at.o.ahl().fJ(parambi.field_msgId); ; localObject2 = null)
    {
      Object localObject3;
      if (localObject2 != null)
      {
        localObject3 = localObject2;
        if (((com.tencent.mm.at.e)localObject2).fDy > 0L);
      }
      else
      {
        localObject3 = localObject2;
        if (parambi.field_msgSvrId > 0L)
          localObject3 = com.tencent.mm.at.o.ahl().fI(parambi.field_msgSvrId);
      }
      if (localObject3 == null)
      {
        AppMethodBeat.o(31039);
        parambi = localObject1;
      }
      while (true)
      {
        return parambi;
        localObject2 = com.tencent.mm.at.o.ahl().q(com.tencent.mm.at.f.c((com.tencent.mm.at.e)localObject3), "", "");
        parambi = new WWMediaImage();
        parambi.filePath = ((String)localObject2);
        ab.i("MicroMsg.SendToWeWorkHelper", "send img2, path:%s", new Object[] { parambi.filePath });
        AppMethodBeat.o(31039);
      }
    }
  }

  private static WWMediaMessage.WWMediaObject b(ad paramad, bi parambi, boolean paramBoolean)
  {
    Object localObject1 = null;
    AppMethodBeat.i(31040);
    String str = parambi.field_content;
    Object localObject2 = str;
    if (paramBoolean)
    {
      int i = parambi.field_content.indexOf(':');
      localObject2 = str;
      if (i != -1)
        localObject2 = parambi.field_content.substring(i + 1);
    }
    if (localObject2 != null);
    label242: Object localObject3;
    for (localObject2 = j.b.X((String)localObject2, parambi.field_reserved); ; localObject3 = null)
    {
      if (localObject2 == null)
      {
        AppMethodBeat.o(31040);
        paramad = (ad)localObject1;
      }
      while (true)
      {
        return paramad;
        switch (((j.b)localObject2).type)
        {
        default:
          AppMethodBeat.o(31040);
          paramad = (ad)localObject1;
          break;
        case 5:
          paramad = new WWMediaLink();
          paramad.webpageUrl = ((j.b)localObject2).url;
          paramad.title = ((j.b)localObject2).title;
          paramad.description = ((j.b)localObject2).description;
          localObject1 = com.tencent.mm.at.o.ahl().a(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(null), false);
        case 2:
        case 6:
        case 19:
        case 33:
          try
          {
            localObject2 = new java/io/ByteArrayOutputStream;
            ((ByteArrayOutputStream)localObject2).<init>();
            ((Bitmap)localObject1).compress(Bitmap.CompressFormat.JPEG, 85, (OutputStream)localObject2);
            paramad.thumbData = ((ByteArrayOutputStream)localObject2).toByteArray();
            ((ByteArrayOutputStream)localObject2).close();
            try
            {
              localObject2 = com.tencent.mm.at.o.ahl().a(parambi.field_imgPath, com.tencent.mm.bz.a.getDensity(null), false);
              parambi = new java/io/ByteArrayOutputStream;
              parambi.<init>();
              ((Bitmap)localObject2).compress(Bitmap.CompressFormat.JPEG, 100, parambi);
              paramad.thumbData = parambi.toByteArray();
              parambi.close();
              label291: AppMethodBeat.o(31040);
              continue;
              if ((((j.b)localObject2).csD != null) && (((j.b)localObject2).csD.length() > 0))
              {
                paramad = am.aUq().aiE(((j.b)localObject2).csD);
                if ((paramad != null) && (paramad.bCR()))
                {
                  localObject2 = paramad.field_fileFullPath;
                  if (!com.tencent.mm.vfs.e.ct((String)localObject2))
                  {
                    ab.i("MicroMsg.SendToWeWorkHelper", "Img not exist, bigImgPath: %s, msgId: %d, msgSvrId: %d", new Object[] { localObject2, Long.valueOf(parambi.field_msgId), Long.valueOf(parambi.field_msgSvrId) });
                    AppMethodBeat.o(31040);
                    paramad = (ad)localObject1;
                    continue;
                  }
                  paramad = new WWMediaImage();
                  paramad.filePath = ((String)localObject2);
                  ab.i("MicroMsg.SendToWeWorkHelper", "send img2, path:%s", new Object[] { paramad.filePath });
                  AppMethodBeat.o(31040);
                }
              }
              else
              {
                AppMethodBeat.o(31040);
                paramad = (ad)localObject1;
                continue;
                localObject1 = l.aiM(((j.b)localObject2).csD);
                paramad = (ad)localObject1;
                if (localObject1 == null)
                  paramad = am.aUq().lZ(parambi.field_msgId);
                if (paramad.field_totalLen > 104857600L)
                {
                  paramad = new an.a((byte)0);
                  AppMethodBeat.o(31040);
                  throw paramad;
                }
                parambi = new WWMediaFile();
                parambi.fileName = ((j.b)localObject2).title;
                parambi.filePath = paramad.field_fileFullPath;
                parambi.contentLengthLimit = 104857600;
                AppMethodBeat.o(31040);
                paramad = parambi;
                continue;
                paramad = a(parambi, paramad, paramBoolean);
                AppMethodBeat.o(31040);
                continue;
                if (((j.b)localObject2).fiR == 3)
                {
                  AppMethodBeat.o(31040);
                  paramad = (ad)localObject1;
                }
                else
                {
                  paramad = new WWMediaMiniProgram();
                  paramad.username = ((j.b)localObject2).fiP;
                  paramad.path = ((j.b)localObject2).fiO;
                  paramad.iconUrl = ((j.b)localObject2).fjb;
                  parambi = com.tencent.mm.at.o.ahl().c(parambi.field_imgPath, false, true);
                  if (com.tencent.mm.pluginsdk.g.a.d.a.ct(parambi));
                  while (true)
                  {
                    try
                    {
                      parambi = k.NC(parambi);
                      localObject1 = new java/io/ByteArrayOutputStream;
                      ((ByteArrayOutputStream)localObject1).<init>();
                      parambi.compress(Bitmap.CompressFormat.JPEG, 70, (OutputStream)localObject1);
                      paramad.ALI = ((ByteArrayOutputStream)localObject1).toByteArray();
                      ((ByteArrayOutputStream)localObject1).close();
                      if (paramad.ALI.length > 1048576)
                      {
                        ab.i("MicroMsg.SendToWeWorkHelper", "miniProgram.hdImageData.length > 1M");
                        paramad.ALI = new byte[1];
                      }
                      paramad.name = ((j.b)localObject2).cMh;
                      paramad.title = ((j.b)localObject2).title;
                      ab.d("MicroMsg.SendToWeWorkHelper", "WWMediaMiniProgram[username:%s path:%s iconUrl:%s hdImageData:%s name:%s title:%s]", new Object[] { paramad.username, paramad.path, paramad.iconUrl, Integer.valueOf(paramad.ALI.length), paramad.name, paramad.title });
                      AppMethodBeat.o(31040);
                    }
                    catch (Exception parambi)
                    {
                      ab.i("MicroMsg.SendToWeWorkHelper", "WWMediaMiniProgram.hdImageData Exception:%s", new Object[] { parambi.getMessage() });
                    }
                    paramad.ALI = new byte[1];
                  }
                }
              }
            }
            catch (Exception parambi)
            {
              break label291;
            }
          }
          catch (Exception localException)
          {
            break label242;
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.an
 * JD-Core Version:    0.6.2
 */