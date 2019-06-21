package com.tencent.mm.plugin.backup.bakoldlogic.b;

import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.g.a.na;
import com.tencent.mm.g.a.na.b;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.be;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.bi;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class b
  implements j
{
  private static int b(gu paramgu, bi parambi, LinkedList<u> paramLinkedList)
  {
    int i = 0;
    AppMethodBeat.i(17779);
    int j;
    Object localObject1;
    int k;
    if (bo.isNullOrNil(parambi.field_content))
    {
      j = 0;
      localObject1 = parambi.field_content;
      localObject2 = localObject1;
      if (parambi.field_isSend != 1)
      {
        localObject2 = localObject1;
        if (com.tencent.mm.plugin.backup.bakoldlogic.d.d.kH(parambi.field_talker))
        {
          k = parambi.field_content.indexOf(':');
          localObject2 = localObject1;
          if (k != -1)
            localObject2 = parambi.field_content.substring(k + 1);
        }
      }
      localObject2 = bo.anj((String)localObject2);
      if (localObject2 == null)
        break label996;
    }
    label214: label996: for (Object localObject2 = j.b.me((String)localObject2); ; localObject2 = null)
    {
      if (localObject2 == null)
      {
        ab.e("MicroMsg.BakOldItemAppMsg", "content is null");
        AppMethodBeat.o(17779);
        return i;
        j = parambi.field_content.getBytes().length;
        break;
      }
      ab.d("MicroMsg.BakOldItemAppMsg", "content type " + ((j.b)localObject2).type);
      localObject1 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUo().I(parambi.field_imgPath, true);
      if (com.tencent.mm.vfs.e.ct((String)localObject1))
      {
        j += i.a(new i.a((String)localObject1, paramgu, paramLinkedList, 6, "_thumb"));
        i = j;
      }
      switch (((j.b)localObject2).type)
      {
      default:
        i = j;
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
          AppMethodBeat.o(17779);
          break;
          if (((j.b)localObject2).type != 2)
            break label214;
          i = -1;
          AppMethodBeat.o(17779);
          break;
          i = j;
          if (!bo.isNullOrNil(((j.b)localObject2).csD))
          {
            localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUq().aiE(((j.b)localObject2).csD);
            if ((localObject2 == null) || (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).bCR()))
            {
              i = j;
              if (parambi.field_isSend == 1)
              {
                i = j;
                if (localObject2 != null)
                {
                  i = j;
                  if (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_isUpload);
                }
              }
            }
            else
            {
              parambi = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
              i = j;
              if (com.tencent.mm.vfs.e.ct(parambi))
              {
                ab.d("MicroMsg.BakOldItemAppMsg", "image ".concat(String.valueOf(parambi)));
                i = j + i.a(new i.a(parambi, paramgu, paramLinkedList, 8, false, null));
                continue;
                localObject1 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUq().aiE(((j.b)localObject2).csD);
                if ((localObject1 == null) || (!((com.tencent.mm.pluginsdk.model.app.b)localObject1).bCR()))
                {
                  i = j;
                  if (parambi.field_isSend == 1)
                  {
                    i = j;
                    if (localObject1 != null)
                    {
                      i = j;
                      if (!((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_isUpload);
                    }
                  }
                }
                else
                {
                  ab.d("MicroMsg.BakOldItemAppMsg", "full path " + ((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath);
                  i = j;
                  if (com.tencent.mm.vfs.e.ct(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath))
                    if ((com.tencent.mm.plugin.backup.b.d.aSx() == 1) && (((j.b)localObject2).fgo / 1024 >= 0L) && (((j.b)localObject2).filemd5 != null))
                    {
                      parambi = new u();
                      i = j + i.a(new i.a(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath, paramgu, paramLinkedList, 7, true, parambi));
                    }
                    else
                    {
                      i = j + i.a(new i.a(((com.tencent.mm.pluginsdk.model.app.b)localObject1).field_fileFullPath, paramgu, paramLinkedList, 7, false, null));
                      continue;
                      localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUq().aiE(((j.b)localObject2).csD);
                      if ((localObject2 == null) || (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).bCR()))
                      {
                        i = j;
                        if (parambi.field_isSend == 1)
                        {
                          i = j;
                          if (localObject2 != null)
                          {
                            i = j;
                            if (!((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_isUpload);
                          }
                        }
                      }
                      else
                      {
                        ab.d("MicroMsg.BakOldItemAppMsg", "full path " + ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
                        i = j;
                        if (com.tencent.mm.vfs.e.ct(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath))
                          i = j + i.a(new i.a(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath, paramgu, paramLinkedList, 7, false, null));
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
      localObject1 = new na();
      ((na)localObject1).cJc.cHz = ((j.b)localObject2).fgU;
      ((na)localObject1).cJc.cuQ = parambi.field_msgId;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      ab.i("MicroMsg.BakOldItemAppMsg", "pathList:%s", new Object[] { ((na)localObject1).cJd.cJe });
      parambi = ((na)localObject1).cJd.cJe.split(":");
      k = 0;
      while (true)
      {
        i = j;
        if (k >= parambi.length)
          break;
        i = j;
        if (com.tencent.mm.vfs.e.ct(parambi[k]))
        {
          ab.i("MicroMsg.BakOldItemAppMsg", "record file exit:%s, index:%d", new Object[] { parambi[k], Integer.valueOf(k) });
          i = j + i.a(new i.a(parambi[k], paramgu, paramLinkedList, 7, "_fav.".concat(String.valueOf(k))));
        }
        k++;
        j = i;
      }
    }
  }

  public final int a(gu paramgu, bi parambi, LinkedList<u> paramLinkedList)
  {
    int i = 0;
    AppMethodBeat.i(17778);
    int j;
    switch (parambi.getType())
    {
    default:
      j = b(paramgu, parambi, paramLinkedList);
      AppMethodBeat.o(17778);
    case 285212721:
    case 1048625:
    }
    while (true)
    {
      return j;
      if (bo.isNullOrNil(parambi.field_content));
      for (j = 0; ; j = parambi.field_content.getBytes().length)
      {
        paramLinkedList = b.a.Fh(parambi.field_content);
        if (!bo.isNullOrNil(paramLinkedList))
          break label111;
        AppMethodBeat.o(17778);
        j = i;
        break;
      }
      label111: parambi = new bts();
      parambi.alV(bo.bc(paramLinkedList, ""));
      paramgu.vED = parambi;
      AppMethodBeat.o(17778);
      continue;
      if (bo.isNullOrNil(parambi.field_content));
      for (j = 0; ; j = parambi.field_content.getBytes().length)
      {
        if (parambi.field_content != null)
          break label190;
        AppMethodBeat.o(17778);
        j = -1;
        break;
      }
      label190: Object localObject1 = ap.aps(parambi.field_content).xXL.trim();
      Object localObject2 = localObject1;
      if (!com.tencent.mm.plugin.backup.bakoldlogic.a.a.Fd((String)localObject1))
      {
        localObject1 = parambi.field_content;
        localObject2 = localObject1;
        if (!com.tencent.mm.plugin.backup.bakoldlogic.a.a.Fd((String)localObject1))
        {
          ab.e("MicroMsg.BakOldItemAppMsg", "get xml error ".concat(String.valueOf(localObject1)));
          AppMethodBeat.o(17778);
          j = i;
        }
      }
      else
      {
        i = j;
        if (!bo.isNullOrNil((String)localObject2))
        {
          localObject1 = new bts();
          ((bts)localObject1).alV(bo.bc((String)localObject2, ""));
          paramgu.vED = ((bts)localObject1);
          localObject1 = j.b.me((String)localObject2);
          localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().Yb();
          parambi = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUo().I(parambi.field_imgPath, true);
          localObject2 = (String)localObject2 + ((j.b)localObject1).fgq;
          if (com.tencent.mm.vfs.e.asZ(parambi) <= 0L)
          {
            AppMethodBeat.o(17778);
            j = -1;
          }
          else
          {
            i = i.a(new i.a(parambi, paramgu, paramLinkedList, 6, "_thumb"));
            parambi = ap.aps(aa.a(paramgu.vED));
            i = i + j + i.a(new i.a((String)localObject2, paramgu, paramLinkedList, com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUp().aqi(parambi.cvZ)));
          }
        }
        else
        {
          AppMethodBeat.o(17778);
          j = i;
        }
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17780);
    Object localObject1 = paramgu.vEB.wVI;
    Object localObject2 = paramgu.vED.wVI;
    if (localObject2 == null)
      AppMethodBeat.o(17780);
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
        if (com.tencent.mm.plugin.backup.bakoldlogic.d.d.kH((String)localObject1))
        {
          i = com.tencent.mm.plugin.backup.bakoldlogic.d.d.ox(paramgu.vED.wVI);
          localObject3 = localObject2;
          if (i != -1)
            localObject3 = (paramgu.vED.wVI + " ").substring(i + 2).trim();
        }
      }
      localObject4 = bo.anj((String)localObject3);
      localObject1 = j.b.me((String)localObject4);
      if (localObject1 == null)
      {
        ab.e("MicroMsg.BakOldItemAppMsg", "parse app message failed, insert failed");
        AppMethodBeat.o(17780);
      }
      else if (((j.b)localObject1).type == 2000)
      {
        parambi.setType(419430449);
        com.tencent.mm.plugin.backup.bakoldlogic.d.d.l(parambi);
        AppMethodBeat.o(17780);
      }
      else
      {
        if ((((j.b)localObject1).type != 19) && (((j.b)localObject1).type != 24))
          break;
        parambi.setType(l.d((j.b)localObject1));
        com.tencent.mm.plugin.backup.bakoldlogic.d.d.l(parambi);
        paramString = new na();
        paramString.cJc.cHz = ((j.b)localObject1).fgU;
        paramString.cJc.cuQ = parambi.field_msgId;
        com.tencent.mm.sdk.b.a.xxA.m(paramString);
        ab.i("MicroMsg.BakOldItemAppMsg", "pathList:%s", new Object[] { paramString.cJd.cJe });
        parambi = paramString.cJd.cJe.split(":");
        for (i = 0; i < parambi.length; i++)
        {
          paramString = com.tencent.mm.plugin.backup.bakoldlogic.a.a.a(paramgu, 7, ".".concat(String.valueOf(i)));
          if (!bo.isNullOrNil(paramString))
          {
            ab.i("MicroMsg.BakOldItemAppMsg", "record media exit:%s, index:%d", new Object[] { paramString, Integer.valueOf(i) });
            com.tencent.mm.vfs.e.y(com.tencent.mm.plugin.backup.bakoldlogic.a.a.Fp(paramString), parambi[i]);
          }
        }
        AppMethodBeat.o(17780);
      }
    }
    localObject2 = new f();
    ((f)localObject2).field_appId = ((j.b)localObject1).appId;
    Object localObject3 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ();
    if (((com.tencent.mm.plugin.backup.bakoldlogic.d.c)localObject3).uin == 0)
    {
      paramString = new com.tencent.mm.model.b();
      AppMethodBeat.o(17780);
      throw paramString;
    }
    if ((((com.tencent.mm.plugin.backup.bakoldlogic.d.c)localObject3).jyw.b((com.tencent.mm.sdk.e.c)localObject2, new String[0])) && (((f)localObject2).field_appVersion < ((j.b)localObject1).axy))
      com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aVa().g(1, ((j.b)localObject1).appId);
    parambi.setType(l.d((j.b)localObject1));
    localObject3 = com.tencent.mm.plugin.backup.bakoldlogic.a.a.b(paramgu, 6);
    if ((localObject3 != null) && (parambi.field_msgId == 0L))
      if (((j.b)localObject1).type != 2)
        break label724;
    com.tencent.mm.af.j localj;
    com.tencent.mm.plugin.backup.bakoldlogic.d.c localc;
    label724: for (boolean bool = true; ; bool = false)
    {
      localObject3 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUo().a((byte[])localObject3, bool, Bitmap.CompressFormat.PNG);
      ab.d("MicroMsg.BakOldItemAppMsg", com.tencent.mm.compatible.util.g.Mq() + " thumbData MsgInfo path:" + (String)localObject3);
      if (!bo.isNullOrNil((String)localObject3))
      {
        parambi.jv((String)localObject3);
        ab.d("MicroMsg.BakOldItemAppMsg", "new thumbnail saved, path:".concat(String.valueOf(localObject3)));
      }
      localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.a.a.a(paramgu, 8);
      i = com.tencent.mm.plugin.backup.bakoldlogic.a.a.c(paramgu, 8);
      localObject3 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
      {
        localObject3 = com.tencent.mm.plugin.backup.bakoldlogic.a.a.a(paramgu, 7);
        i = com.tencent.mm.plugin.backup.bakoldlogic.a.a.c(paramgu, 7);
      }
      localObject2 = com.tencent.mm.plugin.backup.bakoldlogic.a.a.Fp((String)localObject3);
      com.tencent.mm.plugin.backup.bakoldlogic.d.d.l(parambi);
      localj = new com.tencent.mm.af.j();
      ((j.b)localObject1).a(localj);
      localj.field_msgId = parambi.field_msgId;
      localc = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ();
      if (localc.uin != 0)
        break;
      paramString = new com.tencent.mm.model.b();
      AppMethodBeat.o(17780);
      throw paramString;
    }
    localc.jyv.b(localj);
    long l;
    if (!bo.isNullOrNil((String)localObject3))
    {
      localObject3 = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().XO();
      if (paramString.equals(paramgu.vEB.wVI));
      for (paramString = paramgu.vEC.wVI; ; paramString = paramgu.vEB.wVI)
      {
        localObject3 = ((h)localObject3).Q(paramString, paramgu.ptF);
        paramgu = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUq().aiE(((j.b)localObject1).csD);
        paramString = paramgu;
        if (paramgu != null)
          break label1122;
        ab.i("MicroMsg.BakOldItemAppMsg", "recover AppAttachInfo is null.");
        l = ((cy)localObject3).field_msgId;
        localObject4 = j.b.me((String)localObject4);
        if (localObject4 != null)
        {
          paramString = l.X(com.tencent.mm.compatible.util.e.euQ, ((j.b)localObject4).title, ((j.b)localObject4).fgp);
          int j = ((j.b)localObject4).sdkVer;
          paramgu = ((j.b)localObject4).appId;
          localObject3 = ((j.b)localObject4).csD;
          int k = ((j.b)localObject4).fgo;
          localObject4 = new com.tencent.mm.pluginsdk.model.app.b();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_fileFullPath = paramString;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_appId = paramgu;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_sdkVer = j;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_mediaSvrId = ((String)localObject3);
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_totalLen = k;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_status = 101L;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_isUpload = false;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_createTime = bo.anU();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_lastModifyTime = bo.anT();
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_msgInfoId = l;
          ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_netTimes = 0L;
          if (!com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUq().b((com.tencent.mm.sdk.e.c)localObject4))
            ab.e("MicroMsg.BakOldTempStorageLogic", "initDownloadAttach insert error, msgLocalId[%d]", new Object[] { Long.valueOf(l) });
        }
        paramgu = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUq().aiE(((j.b)localObject1).csD);
        if (paramgu != null)
          break label1078;
        ab.e("MicroMsg.BakOldItemAppMsg", "getAppAttachInfoStg().getByMediaId is null! attachid[%s]", new Object[] { ((j.b)localObject1).csD });
        AppMethodBeat.o(17780);
        break;
      }
      label1078: paramString = paramgu;
      if (((j.b)localObject1).fgo != 0)
      {
        paramString = paramgu;
        if (i != 0)
        {
          if (i >= ((j.b)localObject1).fgo)
            break label1188;
          if (parambi.field_isSend != 1)
            break label1176;
          paramgu.field_status = 105L;
          paramString = paramgu;
        }
      }
    }
    while (true)
    {
      label1122: l = i;
      paramString.field_offset = l;
      paramString.field_totalLen = l;
      com.tencent.mm.vfs.e.is((String)localObject2, paramString.field_fileFullPath);
      com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().aUZ().aUq().a(paramString, new String[0]);
      AppMethodBeat.o(17780);
      break;
      label1176: paramgu.field_status = 102L;
      paramString = paramgu;
      continue;
      label1188: paramgu.field_status = 199L;
      paramString = paramgu;
    }
  }

  static final class a$a
  {
    boolean bYN;
    Map<String, String> jvs;

    public a$a(String paramString)
    {
      AppMethodBeat.i(17767);
      this.jvs = null;
      this.bYN = true;
      this.jvs = be.amR(paramString);
      if (this.jvs == null)
      {
        this.bYN = false;
        this.jvs = new HashMap();
      }
      AppMethodBeat.o(17767);
    }

    final int getInt(String paramString)
    {
      AppMethodBeat.i(17768);
      int i;
      if (!this.jvs.containsKey(paramString))
      {
        AppMethodBeat.o(17768);
        i = 0;
      }
      while (true)
      {
        return i;
        i = bo.getInt((String)this.jvs.get(paramString), 0);
        AppMethodBeat.o(17768);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.b
 * JD-Core Version:    0.6.2
 */