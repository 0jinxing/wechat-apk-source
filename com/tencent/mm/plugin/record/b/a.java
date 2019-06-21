package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;

public final class a
{
  private static e pJg;

  private static String X(String paramString1, String paramString2, String paramString3)
  {
    int i = 1;
    AppMethodBeat.i(135623);
    Object localObject = new com.tencent.mm.vfs.b(paramString1);
    if (!((com.tencent.mm.vfs.b)localObject).exists())
      ((com.tencent.mm.vfs.b)localObject).mkdirs();
    if (bo.isNullOrNil(paramString2))
    {
      localObject = paramString1 + "da_" + bo.anU();
      paramString2 = (String)localObject;
      if (!bo.isNullOrNil(paramString3))
        paramString2 = (String)localObject + "." + paramString3;
    }
    try
    {
      String str;
      do
      {
        localObject = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject).<init>(paramString2);
        str = com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject).dMC().dMD());
        localObject = new com/tencent/mm/vfs/b;
        ((com.tencent.mm.vfs.b)localObject).<init>(paramString1);
        if (!str.equalsIgnoreCase(com.tencent.mm.vfs.j.w(((com.tencent.mm.vfs.b)localObject).dMD())))
        {
          paramString2 = new java/lang/StringBuilder;
          paramString2.<init>();
          paramString2 = paramString1 + "da_" + bo.anU();
          ab.w("MicroMsg.AppMsgLogic", "maybe DirTraversal attach. %s", new Object[] { paramString2 });
        }
        AppMethodBeat.o(135623);
        return paramString2;
        localObject = paramString2;
        if (!bo.isNullOrNil(paramString3))
        {
          localObject = paramString2;
          if (!paramString2.endsWith(paramString3))
            localObject = paramString2 + "." + paramString3;
        }
        str = paramString1 + (String)localObject;
        paramString2 = str;
      }
      while (!com.tencent.mm.vfs.e.ct(str));
      while (true)
      {
        paramString2 = str;
        if (i < 20)
        {
          if (!com.tencent.mm.vfs.e.ct(paramString1 + i + "_" + (String)localObject))
            paramString2 = paramString1 + i + "_" + (String)localObject;
        }
        else
        {
          if (i != 20)
            break;
          localObject = paramString1 + "da_" + bo.anU();
          paramString2 = (String)localObject;
          if (bo.isNullOrNil(paramString3))
            break;
          paramString2 = (String)localObject + "." + paramString3;
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

  private static String a(String paramString1, long paramLong, int paramInt1, String paramString2, String paramString3, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(135624);
    com.tencent.mm.pluginsdk.model.app.b localb = new com.tencent.mm.pluginsdk.model.app.b();
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
    ab.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach ret[%b], rowid[%d], field_totalLen[%d], type[%d], isLargeFile[%d], destFile[%s], stack[%s]", new Object[] { Boolean.valueOf(com.tencent.mm.plugin.s.a.aUq().b(localb)), Long.valueOf(localb.xDa), Long.valueOf(localb.field_totalLen), Long.valueOf(localb.field_type), Integer.valueOf(paramInt4), paramString1, bo.dpG() });
    AppMethodBeat.o(135624);
    return paramString3;
  }

  public static boolean a(bi parambi, com.tencent.mm.pluginsdk.model.app.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(135621);
    if ((paramb == null) || (!com.tencent.mm.vfs.e.ct(paramb.field_fileFullPath)))
      AppMethodBeat.o(135621);
    while (true)
    {
      return bool;
      if ((paramb.bCR()) || ((parambi.field_isSend == 1) && (paramb.field_isUpload)))
      {
        AppMethodBeat.o(135621);
        bool = true;
      }
      else
      {
        AppMethodBeat.o(135621);
      }
    }
  }

  public static void af(bi parambi)
  {
    AppMethodBeat.i(135622);
    Object localObject1 = j.b.me(parambi.field_content);
    if (localObject1 == null)
    {
      ab.e("MicroMsg.AppMsgLogic", "parse msgContent error, %s", new Object[] { parambi.field_content });
      AppMethodBeat.o(135622);
    }
    String str1;
    while (true)
    {
      return;
      if ((bo.isNullOrNil(((j.b)localObject1).csD)) && (!bo.isNullOrNil(((j.b)localObject1).fgD)))
      {
        ab.e("MicroMsg.AppMsgLogic", "msgContent format error, %s", new Object[] { parambi.field_content });
        ((j.b)localObject1).csD = ((j.b)localObject1).fgD.hashCode();
      }
      str1 = ((j.b)localObject1).csD;
      if (!a(parambi, i(str1, parambi.field_msgId)))
      {
        if (parambi != null)
          break;
        i = 0;
        if (i != 0)
        {
          pJg = new e(parambi.field_msgId, str1, new a.1());
          g.RO().eJo.a(pJg, 0);
        }
      }
      AppMethodBeat.o(135622);
    }
    int j = 1;
    localObject1 = null;
    String str2 = null;
    String str3 = null;
    String str4 = null;
    String str5 = null;
    Object localObject2 = i(str1, parambi.field_msgId);
    Object localObject3 = j.b.me(parambi.field_content);
    if (localObject3 != null)
    {
      localObject1 = bo.nullAsNil(((j.b)localObject3).title);
      str2 = bo.nullAsNil(((j.b)localObject3).fgp).toLowerCase();
      str3 = bo.nullAsNil(((j.b)localObject3).filemd5);
      str4 = bo.nullAsNil(((j.b)localObject3).cEV);
      str5 = bo.nullAsNil(((j.b)localObject3).eyr);
    }
    if (localObject2 == null)
    {
      s(parambi.field_msgId, parambi.field_content);
      localObject4 = i(str1, parambi.field_msgId);
      localObject2 = localObject4;
      i = j;
      if (localObject4 != null)
      {
        l1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject4).xDa;
        l2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_totalLen;
        str6 = ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_fileFullPath;
        l3 = ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_type;
        localObject2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_mediaId;
        l4 = ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_msgInfoId;
        bool1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_isUpload;
        if (((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_signature != null)
          break label531;
        i = -1;
        label368: ab.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo newInfo systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], signature len[%d]", new Object[] { Long.valueOf(l1), Long.valueOf(l2), str6, Long.valueOf(l3), localObject2, Long.valueOf(l4), Boolean.valueOf(bool1), Integer.valueOf(i) });
        localObject2 = localObject4;
        i = j;
        if (localObject3 != null)
          if (((j.b)localObject3).fgs == 0)
          {
            localObject2 = localObject4;
            i = j;
            if (((j.b)localObject3).fgo <= 26214400);
          }
          else
          {
            if (bo.isNullOrNil(((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_signature))
              break label543;
          }
      }
      label531: label543: for (i = 1; ; i = 0)
      {
        localObject2 = localObject4;
        if (i == 0)
          g.RO().eJo.a(new c((com.tencent.mm.pluginsdk.model.app.b)localObject2, str5, str3, (String)localObject1, str2, str4), 0);
        break;
        i = ((com.tencent.mm.pluginsdk.model.app.b)localObject4).field_signature.length();
        break label368;
      }
    }
    localObject3 = new com.tencent.mm.vfs.b(((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath);
    if ((((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_status == 199L) && (!((com.tencent.mm.vfs.b)localObject3).exists()))
    {
      ab.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo info exist but file not!");
      s(parambi.field_msgId, parambi.field_content);
    }
    long l5 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).xDa;
    long l2 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_totalLen;
    String str6 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_fileFullPath;
    long l3 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_type;
    Object localObject4 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_mediaId;
    long l4 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_msgInfoId;
    boolean bool1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_isUpload;
    boolean bool2 = ((com.tencent.mm.vfs.b)localObject3).exists();
    long l1 = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_status;
    if (((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature == null);
    for (int i = -1; ; i = ((com.tencent.mm.pluginsdk.model.app.b)localObject2).field_signature.length())
    {
      ab.i("MicroMsg.AppMsgLogic", "summerbig tryInitAttachInfo info exist systemRowid [%d], totalLen[%d], field_fileFullPath[%s], type[%d], mediaId[%s], msgid[%d], upload[%b], file.exists[%b], status[%d], signature len[%d]", new Object[] { Long.valueOf(l5), Long.valueOf(l2), str6, Long.valueOf(l3), localObject4, Long.valueOf(l4), Boolean.valueOf(bool1), Boolean.valueOf(bool2), Long.valueOf(l1), Integer.valueOf(i) });
      i = j;
      break;
    }
  }

  public static com.tencent.mm.pluginsdk.model.app.b i(String paramString, long paramLong)
  {
    AppMethodBeat.i(135619);
    com.tencent.mm.pluginsdk.model.app.b localb1 = new com.tencent.mm.pluginsdk.model.app.b();
    com.tencent.mm.pluginsdk.model.app.b localb2;
    if (bo.isNullOrNil(paramString))
    {
      localb2 = null;
      paramString = localb2;
      if (localb2 == null)
        paramString = com.tencent.mm.plugin.s.a.aUq().lZ(paramLong);
      if (paramString == null)
        break label322;
      ab.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo info[%s], rowid[%d], isUpload[%b], fullpath[%s], totallen[%d], offset[%d], mediaSvrId[%s], mediaid[%s], msgid[%d], type[%d], stack[%s]", new Object[] { paramString, Long.valueOf(paramString.xDa), Boolean.valueOf(paramString.field_isUpload), paramString.field_fileFullPath, Long.valueOf(paramString.field_totalLen), Long.valueOf(paramString.field_offset), paramString.field_mediaSvrId, paramString.field_mediaId, Long.valueOf(paramString.field_msgInfoId), Long.valueOf(paramString.field_type), bo.dpG() });
    }
    while (true)
    {
      AppMethodBeat.o(135619);
      return paramString;
      ab.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s", new Object[] { paramString });
      long l = bo.getLong(paramString, -1L);
      if (l != -1L)
      {
        com.tencent.mm.plugin.s.a.aUq().b(l, localb1);
        localb2 = localb1;
        if (localb1.xDa != l)
        {
          localb1 = com.tencent.mm.plugin.s.a.aUq().aiE(paramString);
          if (localb1 != null)
          {
            localb2 = localb1;
            if (localb1.field_mediaSvrId.equals(paramString));
          }
          else
          {
            ab.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 1");
            localb2 = null;
          }
        }
      }
      while (true)
      {
        ab.i("MicroMsg.AppMsgLogic", "getAppAttachInfoByAttachId %s id %s", new Object[] { paramString, Long.valueOf(l) });
        break;
        localb1 = com.tencent.mm.plugin.s.a.aUq().aiE(paramString);
        if (localb1 != null)
        {
          localb2 = localb1;
          if (localb1.field_mediaSvrId.equals(paramString));
        }
        else
        {
          ab.i("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfoByAttachId set appAttachInfo null 2");
          localb2 = null;
        }
      }
      label322: ab.w("MicroMsg.AppMsgLogic", "summerbig getAppAttachInfo is null stack[%s]", new Object[] { bo.dpG() });
    }
  }

  public static void jC(long paramLong)
  {
    AppMethodBeat.i(135620);
    com.tencent.mm.plugin.s.a.aUq().lY(paramLong);
    com.tencent.mm.pluginsdk.model.app.b localb = new com.tencent.mm.pluginsdk.model.app.b();
    com.tencent.mm.plugin.s.a.aUq().b(paramLong, localb);
    if (localb.field_msgInfoId <= 0L)
      AppMethodBeat.o(135620);
    while (true)
    {
      return;
      bi localbi = ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(localb.field_msgInfoId);
      if (localbi.field_msgId != localb.field_msgInfoId)
      {
        AppMethodBeat.o(135620);
      }
      else
      {
        localbi.setStatus(5);
        ((com.tencent.mm.plugin.messenger.foundation.a.j)g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().a(localbi.field_msgId, localbi);
        AppMethodBeat.o(135620);
      }
    }
  }

  private static String s(long paramLong, String paramString)
  {
    String str = null;
    AppMethodBeat.i(135625);
    ab.i("MicroMsg.AppMsgLogic", "summerbig initDownloadAttach msgLocalId[%d], msgXml[%s], downloadPath[%s]", new Object[] { Long.valueOf(paramLong), paramString, null });
    paramString = j.b.me(paramString);
    if (paramString == null)
    {
      AppMethodBeat.o(135625);
      paramString = str;
    }
    while (true)
    {
      return paramString;
      str = X(com.tencent.mm.compatible.util.e.euQ, paramString.title, paramString.fgp);
      if ((bo.isNullOrNil(paramString.csD)) && (!bo.isNullOrNil(paramString.fgD)))
        paramString.csD = paramString.fgD.hashCode();
      paramString = a(str, paramLong, paramString.sdkVer, paramString.appId, paramString.csD, paramString.fgo, paramString.type, paramString.fgs);
      AppMethodBeat.o(135625);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.a
 * JD-Core Version:    0.6.2
 */