package com.tencent.mm.plugin.backup.f;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.plugin.backup.b.g.a;
import com.tencent.mm.plugin.backup.h.c;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.storage.ap;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.z;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public final class b
  implements l
{
  public final int a(gu paramgu, boolean paramBoolean1, bi parambi, String paramString, LinkedList<u> paramLinkedList, HashMap<Long, h.a> paramHashMap, boolean paramBoolean2, long paramLong)
  {
    AppMethodBeat.i(17449);
    int j;
    if (bo.isNullOrNil(parambi.field_content))
    {
      i = 0;
      paramHashMap = ap.aps(parambi.field_content).xXL.trim();
      paramString = paramHashMap;
      if (!com.tencent.mm.plugin.backup.b.g.Fd(paramHashMap))
      {
        paramHashMap = parambi.field_content;
        paramString = paramHashMap;
        if (!com.tencent.mm.plugin.backup.b.g.Fd(paramHashMap))
        {
          paramHashMap = g.a.a(parambi, paramgu);
          paramString = paramHashMap;
          if (parambi.field_isSend != 1)
          {
            paramString = paramHashMap;
            if (c.kH(parambi.field_talker))
              paramString = parambi.field_talker + " :\n " + paramHashMap;
          }
        }
      }
      if ((paramString != null) && (com.tencent.mm.plugin.backup.b.g.Fd(paramString)))
        break label179;
      ab.d("MicroMsg.BackupItemEmoji", "emoji error:".concat(String.valueOf(paramString)));
      j = -1;
      AppMethodBeat.o(17449);
    }
    while (true)
    {
      return j;
      i = parambi.field_content.getBytes().length;
      break;
      label179: paramHashMap = new bts();
      paramHashMap.alV(bo.bc(paramString, ""));
      paramgu.vED = paramHashMap;
      parambi = com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUp().aqi(parambi.field_imgPath);
      if ((parambi != null) && (parambi.duS()))
      {
        AppMethodBeat.o(17449);
        j = i;
      }
      else
      {
        j = i;
        if (parambi == null)
          break label434;
        if (!TextUtils.isEmpty(parambi.field_groupId))
          break label443;
        paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().Yb();
        paramString = paramString + parambi.Aq() + "_thumb";
        if (e.asZ(paramString) >= 0L)
          break label335;
        ab.e("MicroMsg.BackupItemEmoji", "thumbPath error");
        j = -1;
        AppMethodBeat.o(17449);
      }
    }
    label335: int i = i.a(new i.a(paramString, paramgu, paramLinkedList, 4, paramBoolean1, "_thumb", paramBoolean2)) + i;
    label361: if ((TextUtils.isEmpty(parambi.field_groupId)) && (parambi.duP()))
    {
      paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().Yb();
      j = i + i.a(new i.a(paramString + parambi.Aq(), paramgu, paramLinkedList, 5, paramBoolean1, paramBoolean2, null));
    }
    while (true)
    {
      label434: AppMethodBeat.o(17449);
      break;
      label443: paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().Yb();
      paramString = paramString + parambi.field_groupId + "/" + parambi.Aq() + "_cover";
      if (e.asZ(paramString) < 0L)
      {
        ab.e("MicroMsg.BackupItemEmoji", "thumbPath error");
        j = -1;
        AppMethodBeat.o(17449);
        break;
      }
      i = i.a(new i.a(paramString, paramgu, paramLinkedList, 4, paramBoolean1, "_thumb", paramBoolean2)) + i;
      break label361;
      j = i;
      if (parambi.duR())
      {
        paramString = com.tencent.mm.plugin.backup.h.d.aUr().aUs().Yb();
        j = i + i.a(new i.a(paramString + parambi.field_groupId + "/" + parambi.Aq(), paramgu, paramLinkedList, 5, paramBoolean1, paramBoolean2, null));
      }
    }
  }

  public final int a(String paramString, gu paramgu, bi parambi)
  {
    AppMethodBeat.i(17450);
    parambi.setContent(paramgu.vED.wVI);
    paramString = paramgu.vEB.wVI;
    Object localObject1 = paramgu.vEC.wVI;
    if (((String)com.tencent.mm.plugin.backup.h.d.aUr().aUs().Ry().get(2, null)).equals(paramString))
      paramString = (String)localObject1;
    as localas;
    int i;
    while (true)
    {
      localObject1 = paramgu.vED.wVI;
      localObject2 = br.z((String)localObject1, "msg");
      localas = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().dK((String)localObject1, paramString);
      if (localas != null)
        break;
      ab.w("MicroMsg.BackupItemEmoji", "EmojiMsgInfo is null");
      i = -1;
      AppMethodBeat.o(17450);
      return i;
    }
    localObject1 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().Jd(localas.cvZ);
    paramString = (String)localObject1;
    if (localObject1 == null)
    {
      ab.w("MicroMsg.BackupItemEmoji", "EmojiInfo is null");
      paramString = new EmojiInfo();
      as.a(localas, paramString);
      paramString.field_catalog = EmojiInfo.yaf;
      com.tencent.mm.plugin.backup.h.d.aUr().aUs().aUp().E(paramString);
    }
    if (((Map)localObject2).get(".msg.emoji.$androidmd5") == null)
    {
      localObject1 = g.a.Fg(localas.cvZ);
      if (!bo.isNullOrNil((String)localObject1))
      {
        localas.cvZ = ((String)localObject1);
        ab.d("MicroMsg.BackupItemEmoji", "convert ip to android md5 %s", new Object[] { localObject1 });
      }
    }
    localObject1 = localas.cwg;
    parambi.setType(47);
    parambi.jv(localas.cvZ);
    Object localObject2 = localas.fWW;
    boolean bool;
    if ((!paramString.xy()) && (!paramString.isGif()))
    {
      bool = true;
      label307: parambi.setContent(ap.a((String)localObject2, 0L, bool, localas.cvZ, false, ""));
      if (!paramString.duP())
      {
        localObject2 = com.tencent.mm.plugin.backup.h.d.aUr().aUs().Yb();
        if (!TextUtils.isEmpty((CharSequence)localObject1))
          break label452;
        com.tencent.mm.plugin.backup.b.g.b(paramgu, 4, (String)localObject2 + localas.cvZ + "_thumb");
        com.tencent.mm.plugin.backup.b.g.b(paramgu, 5, (String)localObject2 + localas.cvZ);
      }
    }
    while (true)
    {
      ab.d("MicroMsg.BackupItemEmoji", "id ".concat(String.valueOf(c.l(parambi))));
      i = 0;
      AppMethodBeat.o(17450);
      break;
      bool = false;
      break label307;
      label452: paramString = new com.tencent.mm.vfs.b((String)localObject2 + (String)localObject1);
      if (!paramString.exists())
        paramString.mkdirs();
      com.tencent.mm.plugin.backup.b.g.b(paramgu, 4, (String)localObject2 + (String)localObject1 + "/" + localas.cvZ + "_cover");
      com.tencent.mm.plugin.backup.b.g.b(paramgu, 5, (String)localObject2 + (String)localObject1 + "/" + localas.cvZ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.b
 * JD-Core Version:    0.6.2
 */