package com.tencent.mm.plugin.backup.f;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.na;
import com.tencent.mm.g.a.na.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.util.HashMap;
import java.util.LinkedList;

public final class a
  implements l
{
  private static int b(gu paramgu, boolean paramBoolean1, bi parambi, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    AppMethodBeat.i(17447);
    int i;
    String str;
    int j;
    if (bo.isNullOrNil(parambi.field_content))
    {
      i = 0;
      str = parambi.field_content;
      localObject1 = str;
      if (parambi.field_isSend != 1)
      {
        localObject1 = str;
        if (com.tencent.mm.plugin.backup.h.c.kH(parambi.field_talker))
        {
          j = parambi.field_content.indexOf(':');
          localObject1 = str;
          if (j != -1)
            localObject1 = parambi.field_content.substring(j + 1);
        }
      }
      localObject1 = bo.anj((String)localObject1);
      if (localObject1 == null)
        break label1195;
    }
    label1195: for (Object localObject1 = j.b.me((String)localObject1); ; localObject1 = null)
    {
      if (localObject1 == null)
      {
        ab.e("MicroMsg.BackupItemAppMsg", "content is null");
        j = 0;
        AppMethodBeat.o(17447);
        return j;
        i = parambi.field_content.getBytes().length;
        break;
      }
      ab.d("MicroMsg.BackupItemAppMsg", "content type " + ((j.b)localObject1).type);
      str = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().I(parambi.field_imgPath, true);
      if (com.tencent.mm.vfs.e.ct(str))
      {
        i += i.a(new i.a(str, paramgu, paramLinkedList, 6, paramBoolean1, "_thumb", paramBoolean2));
        label220: j = i;
      }
      switch (((j.b)localObject1).type)
      {
      default:
        j = i;
      case 0:
      case 1:
      case 3:
      case 4:
      case 5:
      case 8:
      case 9:
      case 10:
      case 11:
      case 12:
      case 13:
      case 14:
      case 15:
      case 16:
      case 17:
      case 18:
      case 20:
      case 21:
      case 22:
      case 23:
      case 2:
      case 6:
      case 7:
        while (true)
        {
          AppMethodBeat.o(17447);
          break;
          if (((j.b)localObject1).type != 2)
            break label220;
          j = -1;
          AppMethodBeat.o(17447);
          break;
          j = i;
          if (!bo.isNullOrNil(((j.b)localObject1).csD))
          {
            paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUq().aiE(((j.b)localObject1).csD);
            if ((paramString == null) || (!paramString.bCR()))
            {
              j = i;
              if (parambi.field_isSend == 1)
              {
                j = i;
                if (paramString != null)
                {
                  j = i;
                  if (!paramString.field_isUpload);
                }
              }
            }
            else
            {
              parambi = paramString.field_fileFullPath;
              j = i;
              if (com.tencent.mm.vfs.e.ct(parambi))
              {
                ab.d("MicroMsg.BackupItemAppMsg", "image ".concat(String.valueOf(parambi)));
                j = i + i.a(new i.a(parambi, paramgu, paramLinkedList, 8, paramBoolean1, paramBoolean2, null));
                continue;
                com.tencent.mm.pluginsdk.model.app.b localb = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUq().aiE(((j.b)localObject1).csD);
                if ((localb == null) || (!localb.bCR()))
                {
                  j = i;
                  if (parambi.field_isSend == 1)
                  {
                    j = i;
                    if (localb != null)
                    {
                      j = i;
                      if (!localb.field_isUpload);
                    }
                  }
                }
                else
                {
                  ab.d("MicroMsg.BackupItemAppMsg", "full path " + localb.field_fileFullPath);
                  j = i;
                  if (com.tencent.mm.vfs.e.ct(localb.field_fileFullPath))
                    if (paramBoolean1)
                    {
                      j = i + i.a(new i.a(localb.field_fileFullPath, paramgu, paramLinkedList, 7, paramBoolean1, paramBoolean2, null));
                    }
                    else
                    {
                      if ((com.tencent.mm.plugin.backup.b.d.aSx() == 1) && (((j.b)localObject1).fgo / 1024 >= paramLong) && (((j.b)localObject1).filemd5 != null))
                      {
                        Object localObject2;
                        if (parambi.field_isSend == 1)
                        {
                          localObject2 = parambi.field_talker;
                          str = paramString;
                          paramString = (String)localObject2;
                        }
                        while (true)
                        {
                          localObject2 = new u();
                          i += i.a(new i.a(localb.field_fileFullPath, paramgu, paramLinkedList, 7, paramBoolean1, true, (u)localObject2));
                          j = i;
                          if (paramHashMap == null)
                            break;
                          paramgu = new h.a();
                          paramgu.jvy = ((u)localObject2);
                          paramgu.cvZ = ((j.b)localObject1).filemd5;
                          paramgu.jvA = (str + "_" + paramString + "_" + parambi.field_msgSvrId + "_backup");
                          paramgu.jvz = parambi.field_msgSvrId;
                          paramHashMap.put(Long.valueOf(parambi.field_msgSvrId), paramgu);
                          j = i;
                          break;
                          str = parambi.field_talker;
                        }
                      }
                      j = i + i.a(new i.a(localb.field_fileFullPath, paramgu, paramLinkedList, 7, paramBoolean1, paramBoolean2, null));
                      continue;
                      paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUq().aiE(((j.b)localObject1).csD);
                      if ((paramString == null) || (!paramString.bCR()))
                      {
                        j = i;
                        if (parambi.field_isSend == 1)
                        {
                          j = i;
                          if (paramString != null)
                          {
                            j = i;
                            if (!paramString.field_isUpload);
                          }
                        }
                      }
                      else
                      {
                        ab.d("MicroMsg.BackupItemAppMsg", "full path " + paramString.field_fileFullPath);
                        j = i;
                        if (com.tencent.mm.vfs.e.ct(paramString.field_fileFullPath))
                          j = i + i.a(new i.a(paramString.field_fileFullPath, paramgu, paramLinkedList, 7, paramBoolean1, paramBoolean2, null));
                      }
                    }
                }
              }
            }
          }
        }
      case 19:
      case 24:
      }
      paramString = new na();
      paramString.cJc.cHz = ((j.b)localObject1).fgU;
      paramString.cJc.cuQ = parambi.field_msgId;
      com.tencent.mm.sdk.b.a.xxA.m(paramString);
      ab.i("MicroMsg.BackupItemAppMsg", "pathList:%s", new Object[] { paramString.cJd.cJe });
      parambi = paramString.cJd.cJe.split(":");
      int k = 0;
      while (true)
      {
        j = i;
        if (k >= parambi.length)
          break;
        j = i;
        if (com.tencent.mm.vfs.e.ct(parambi[k]))
        {
          ab.i("MicroMsg.BackupItemAppMsg", "record file exit:%s, index:%d", new Object[] { parambi[k], Integer.valueOf(k) });
          j = i + i.a(new i.a(parambi[k], paramgu, paramLinkedList, 7, paramBoolean1, "_fav.".concat(String.valueOf(k)), paramBoolean2));
        }
        k++;
        i = j;
      }
    }
  }

  public final int a(gu paramgu, boolean paramBoolean1, bi parambi, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    AppMethodBeat.i(17446);
    int i;
    switch (parambi.getType())
    {
    default:
      i = b(paramgu, paramBoolean1, parambi, paramString, paramLinkedList, paramHashMap, paramBoolean2, paramLong);
      AppMethodBeat.o(17446);
    case 285212721:
    case 486539313:
    case 1048625:
    }
    while (true)
    {
      return i;
      if (bo.isNullOrNil(parambi.field_content));
      for (i = 0; ; i = parambi.field_content.getBytes().length)
      {
        if (!paramBoolean1)
          break label110;
        AppMethodBeat.o(17446);
        break;
      }
      label110: parambi = a.a.Fh(parambi.field_content);
      if (bo.isNullOrNil(parambi))
      {
        i = 0;
        AppMethodBeat.o(17446);
      }
      else
      {
        paramString = new bts();
        paramString.alV(bo.bc(parambi, ""));
        paramgu.vED = paramString;
        AppMethodBeat.o(17446);
        continue;
        if (bo.isNullOrNil(parambi.field_content));
        for (i = 0; ; i = parambi.field_content.getBytes().length)
        {
          if (parambi.field_content != null)
            break label219;
          i = -1;
          AppMethodBeat.o(17446);
          break;
        }
        label219: paramHashMap = parambi.field_content;
        paramString = paramHashMap;
        if (!com.tencent.mm.plugin.backup.b.g.Fd(paramHashMap))
        {
          paramHashMap = parambi.field_content;
          paramString = paramHashMap;
          if (!com.tencent.mm.plugin.backup.b.g.Fd(paramHashMap))
          {
            ab.e("MicroMsg.BackupItemAppMsg", "get xml error ".concat(String.valueOf(paramHashMap)));
            i = 0;
            AppMethodBeat.o(17446);
          }
        }
        else
        {
          int j = i;
          if (!bo.isNullOrNil(paramString))
          {
            paramHashMap = new bts();
            paramHashMap.alV(bo.bc(paramString, ""));
            paramgu.vED = paramHashMap;
            paramHashMap = j.b.me(paramString);
            String str = com.tencent.mm.plugin.backup.h.d.aUr().aUs().Yb();
            paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().I(parambi.field_imgPath, true);
            paramHashMap = str + paramHashMap.fgq;
            parambi = paramString;
            if (com.tencent.mm.vfs.e.asZ(paramString) <= 0L)
              parambi = paramHashMap + "_thumb";
            j = i + i.a(new i.a(parambi, paramgu, paramLinkedList, 6, paramBoolean1, "_thumb", paramBoolean2)) + i.a(new i.a(paramHashMap, paramgu, paramLinkedList, 5, paramBoolean1, paramBoolean2, null));
          }
          AppMethodBeat.o(17446);
          i = j;
        }
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17448);
    Object localObject1 = paramgu.vEB.wVI;
    Object localObject2 = paramgu.vED.wVI;
    if (localObject2 == null)
      AppMethodBeat.o(17448);
    int i;
    Object localObject4;
    while (true)
    {
      return 0;
      parambi.setContent((String)localObject2);
      localObject3 = localObject2;
      if (parambi.field_isSend != 1)
      {
        localObject3 = localObject2;
        if (com.tencent.mm.plugin.backup.h.c.kH((String)localObject1))
        {
          i = com.tencent.mm.plugin.backup.h.c.ox(paramgu.vED.wVI);
          localObject3 = localObject2;
          if (i != -1)
            localObject3 = (paramgu.vED.wVI + " ").substring(i + 2).trim();
        }
      }
      localObject4 = bo.anj((String)localObject3);
      localObject1 = j.b.me((String)localObject4);
      if (localObject1 == null)
      {
        ab.e("MicroMsg.BackupItemAppMsg", "parse app message failed, insert failed");
        AppMethodBeat.o(17448);
      }
      else if (((j.b)localObject1).type == 2000)
      {
        parambi.setType(419430449);
        com.tencent.mm.plugin.backup.h.c.l(parambi);
        AppMethodBeat.o(17448);
      }
      else
      {
        if ((((j.b)localObject1).type != 19) && (((j.b)localObject1).type != 24))
          break;
        parambi.setType(com.tencent.mm.pluginsdk.model.app.l.d((j.b)localObject1));
        com.tencent.mm.plugin.backup.h.c.l(parambi);
        paramString = new na();
        paramString.cJc.cHz = ((j.b)localObject1).fgU;
        paramString.cJc.cuQ = parambi.field_msgId;
        com.tencent.mm.sdk.b.a.xxA.m(paramString);
        ab.i("MicroMsg.BackupItemAppMsg", "pathList:%s", new Object[] { paramString.cJd.cJe });
        paramString = paramString.cJd.cJe.split(":");
        for (i = 0; i < paramString.length; i++)
        {
          parambi = com.tencent.mm.plugin.backup.b.g.a(paramgu, 7, ".".concat(String.valueOf(i)));
          if (!bo.isNullOrNil(parambi))
          {
            ab.i("MicroMsg.BackupItemAppMsg", "record media exit:%s, index:%d", new Object[] { parambi, Integer.valueOf(i) });
            com.tencent.mm.vfs.e.y(com.tencent.mm.plugin.backup.b.g.Fa(parambi) + parambi, paramString[i]);
          }
        }
        AppMethodBeat.o(17448);
      }
    }
    Object localObject3 = new f();
    ((f)localObject3).field_appId = ((j.b)localObject1).appId;
    localObject2 = com.tencent.mm.plugin.backup.h.d.aUr().aUs();
    if (((com.tencent.mm.plugin.backup.h.b)localObject2).uin == 0)
    {
      paramString = new com.tencent.mm.model.b();
      AppMethodBeat.o(17448);
      throw paramString;
    }
    if ((((com.tencent.mm.plugin.backup.h.b)localObject2).jyw.b((com.tencent.mm.sdk.e.c)localObject3, new String[0])) && (((f)localObject3).field_appVersion < ((j.b)localObject1).axy))
      com.tencent.mm.plugin.backup.h.d.aUr().aUt().g(1, ((j.b)localObject1).appId);
    parambi.setType(com.tencent.mm.pluginsdk.model.app.l.d((j.b)localObject1));
    localObject3 = com.tencent.mm.plugin.backup.b.g.b(paramgu, 6);
    if ((localObject3 != null) && (parambi.field_msgId == 0L))
      if (((j.b)localObject1).type != 2)
        break label761;
    j localj;
    com.tencent.mm.plugin.backup.h.b localb;
    label761: for (boolean bool = true; ; bool = false)
    {
      localObject3 = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUo().a((byte[])localObject3, bool, Bitmap.CompressFormat.PNG);
      ab.d("MicroMsg.BackupItemAppMsg", com.tencent.mm.compatible.util.g.Mq() + " thumbData MsgInfo path:" + (String)localObject3);
      if (!bo.isNullOrNil((String)localObject3))
      {
        parambi.jv((String)localObject3);
        ab.d("MicroMsg.BackupItemAppMsg", "new thumbnail saved, path:".concat(String.valueOf(localObject3)));
      }
      localObject2 = com.tencent.mm.plugin.backup.b.g.a(paramgu, 8);
      i = com.tencent.mm.plugin.backup.b.g.c(paramgu, 8);
      localObject3 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
      {
        localObject3 = com.tencent.mm.plugin.backup.b.g.a(paramgu, 7);
        i = com.tencent.mm.plugin.backup.b.g.c(paramgu, 7);
      }
      localObject2 = com.tencent.mm.plugin.backup.b.g.Fa((String)localObject3) + (String)localObject3;
      com.tencent.mm.plugin.backup.h.c.l(parambi);
      localj = new j();
      ((j.b)localObject1).a(localj);
      localj.field_msgId = parambi.field_msgId;
      localb = com.tencent.mm.plugin.backup.h.d.aUr().aUs();
      if (localb.uin != 0)
        break;
      paramString = new com.tencent.mm.model.b();
      AppMethodBeat.o(17448);
      throw paramString;
    }
    localb.jyv.b(localj);
    long l;
    if (!bo.isNullOrNil((String)localObject3))
    {
      localObject3 = com.tencent.mm.plugin.backup.h.d.aUr().aUs().XO();
      if (paramString.equals(paramgu.vEB.wVI));
      for (paramString = paramgu.vEC.wVI; ; paramString = paramgu.vEB.wVI)
      {
        localObject3 = ((h)localObject3).Q(paramString, paramgu.ptF);
        paramgu = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUq().aiE(((j.b)localObject1).csD);
        paramString = paramgu;
        if (paramgu != null)
          break label1159;
        ab.i("MicroMsg.BackupItemAppMsg", "recover AppAttachInfo is null.");
        l = ((cy)localObject3).field_msgId;
        localObject4 = j.b.me((String)localObject4);
        if (localObject4 != null)
        {
          paramgu = com.tencent.mm.pluginsdk.model.app.l.X(com.tencent.mm.compatible.util.e.euQ, ((j.b)localObject4).title, ((j.b)localObject4).fgp);
          int j = ((j.b)localObject4).sdkVer;
          localObject3 = ((j.b)localObject4).appId;
          paramString = ((j.b)localObject4).csD;
          int k = ((j.b)localObject4).fgo;
          localObject4 = new com.tencent.mm.pluginsdk.model.app.b();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_fileFullPath = paramgu;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_appId = ((String)localObject3);
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_sdkVer = j;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_mediaSvrId = paramString;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_totalLen = k;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_status = 101L;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_isUpload = false;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_createTime = bo.anU();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_lastModifyTime = bo.anT();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_msgInfoId = l;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_netTimes = 0L;
          if (!com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUq().b((com.tencent.mm.sdk.e.c)localObject4))
            ab.e("MicroMsg.BackupStorageLogic", "initDownloadAttach insert error, msgLocalId[%d]", new Object[] { Long.valueOf(l) });
        }
        paramgu = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUq().aiE(((j.b)localObject1).csD);
        if (paramgu != null)
          break label1115;
        ab.e("MicroMsg.BackupItemAppMsg", "getAppAttachInfoStg().getByMediaId is null! attachid[%s]", new Object[] { ((j.b)localObject1).csD });
        AppMethodBeat.o(17448);
        break;
      }
      label1115: paramString = paramgu;
      if (((j.b)localObject1).fgo != 0)
      {
        paramString = paramgu;
        if (i != 0)
        {
          if (i >= ((j.b)localObject1).fgo)
            break label1225;
          if (parambi.field_isSend != 1)
            break label1213;
          paramgu.field_status = 105L;
          paramString = paramgu;
        }
      }
    }
    while (true)
    {
      label1159: l = i;
      paramString.field_offset = l;
      paramString.field_totalLen = l;
      com.tencent.mm.vfs.e.y((String)localObject2, paramString.field_fileFullPath);
      com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUq().a(paramString, new String[0]);
      AppMethodBeat.o(17448);
      break;
      label1213: paramgu.field_status = 102L;
      paramString = paramgu;
      continue;
      label1225: paramgu.field_status = 199L;
      paramString = paramgu;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.a
 * JD-Core Version:    0.6.2
 */