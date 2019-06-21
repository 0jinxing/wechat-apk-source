package com.tencent.mm.plugin.emoji.model;

import android.content.Context;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.gb;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import java.io.File;
import java.util.Set;

final class g$2
  implements d.a
{
  g$2(g paramg)
  {
  }

  public final void a(boolean paramBoolean, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(53051);
    gb localgb;
    String str;
    Object localObject;
    File localFile;
    if ((paramEmojiInfo != null) && (paramBoolean) && (!bo.isNullOrNil(paramEmojiInfo.field_md5)) && (this.kVy.kVv.remove(paramEmojiInfo.Aq())))
    {
      ab.i("MicroMsg.FTS.FTSEmojiLogic", "emojiServiceCallback onDownload %s", new Object[] { paramEmojiInfo.Aq() });
      localgb = new gb();
      localgb.cAm.cuy = 2;
      localgb.cAm.cAo = paramEmojiInfo.field_designerID;
      localgb.cAm.name = paramEmojiInfo.field_name;
      localgb.cAm.aeskey = paramEmojiInfo.field_aeskey;
      localgb.cAm.cAp = paramEmojiInfo.field_encrypturl;
      localgb.cAm.thumbUrl = paramEmojiInfo.field_thumbUrl;
      localgb.cAm.cvZ = paramEmojiInfo.field_md5;
      localgb.cAm.cwg = paramEmojiInfo.field_groupId;
      str = paramEmojiInfo.dve();
      localObject = j.getEmojiStorageMgr().xYn.aqi(paramEmojiInfo.Aq());
      if ((localObject != null) && ((((EmojiInfo)localObject).field_reserved4 & EmojiInfo.yaB) == EmojiInfo.yaB))
      {
        localFile = ah.getContext().getExternalCacheDir();
        if (localFile == null)
          AppMethodBeat.o(53051);
      }
    }
    while (true)
    {
      return;
      paramEmojiInfo = com.tencent.mm.vfs.j.w(new b(localFile, com.tencent.mm.a.g.x(paramEmojiInfo.Aq().getBytes())).dMD());
      if ((e.ct(str)) && (!e.ct(paramEmojiInfo)))
      {
        localObject = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l((EmojiInfo)localObject);
        e.a(paramEmojiInfo, (byte[])localObject, localObject.length);
      }
      for (localgb.cAn.path = paramEmojiInfo; ; localgb.cAn.path = str)
      {
        a.xxA.a(localgb, Looper.getMainLooper());
        AppMethodBeat.o(53051);
        break;
      }
      ab.i("MicroMsg.FTS.FTSEmojiLogic", "somethings error.");
      AppMethodBeat.o(53051);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.g.2
 * JD-Core Version:    0.6.2
 */