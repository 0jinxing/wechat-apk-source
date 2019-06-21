package com.tencent.mm.plugin.emoji.model;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.as;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.b;
import com.tencent.mm.vfs.e;
import com.tencent.mm.vfs.j;
import java.util.List;

final class d$3
  implements com.tencent.mm.at.a.c.c
{
  d$3(d paramd)
  {
  }

  public final void a(boolean paramBoolean, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(53033);
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length < 4))
    {
      ab.w("MicroMsg.emoji.EmojiService", "extra obj error");
      AppMethodBeat.o(53033);
      return;
    }
    int i = ((Integer)paramArrayOfObject[2]).intValue();
    if ((paramArrayOfObject[0] instanceof as));
    for (as localas = (as)paramArrayOfObject[0]; ; localas = null)
    {
      if ((paramArrayOfObject[1] instanceof EmojiInfo));
      for (EmojiInfo localEmojiInfo = (EmojiInfo)paramArrayOfObject[1]; ; localEmojiInfo = null)
      {
        String str1;
        label262: String str3;
        while (true)
        {
          if ((paramArrayOfObject[3] instanceof Long))
            ((Long)paramArrayOfObject[3]).longValue();
          if ((localas == null) || (localEmojiInfo == null))
          {
            ab.w("MicroMsg.emoji.EmojiService", "msginfo or  emojiInfo");
            AppMethodBeat.o(53033);
            break;
          }
          this.kVl.kVk.remove(localas.cvZ);
          if (localEmojiInfo.field_state == EmojiInfo.yav)
          {
            ab.d("MicroMsg.emoji.EmojiService", "first receive emoji,then update.");
            localEmojiInfo.field_state = EmojiInfo.yat;
            ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().updateEmojiInfo(localEmojiInfo);
          }
          ab.i("MicroMsg.emoji.EmojiService", "download finish %s, success %b", new Object[] { localEmojiInfo.Aq(), Boolean.valueOf(paramBoolean) });
          if (!paramBoolean)
            break label1459;
          str1 = localEmojiInfo.dve();
          if ((i == 102) || (i == 101) || (i == 103))
          {
            long l;
            if (i == 103)
            {
              paramArrayOfObject = str1 + "_openim";
              paramBoolean = false;
              if (e.asZ(paramArrayOfObject) <= 0L)
                break label902;
              l = System.currentTimeMillis();
            }
            try
            {
              bool = a.g(Base64.encodeToString(bo.anf(localas.aeskey), 0), paramArrayOfObject, str1);
              if (bool)
              {
                if (i == 101)
                {
                  paramBoolean = bool;
                  com.tencent.mm.plugin.emoji.c.hF(11L);
                }
                for (paramBoolean = bool; ; paramBoolean = bool)
                {
                  ab.i("MicroMsg.emoji.EmojiService", "encrypt file use time:%d %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l), str1 });
                  if (paramBoolean)
                    break label746;
                  if (localEmojiInfo != null)
                    break label672;
                  str1 = "";
                  l = e.asZ(paramArrayOfObject);
                  if (e.atg(paramArrayOfObject) != null)
                    break label682;
                  String str2 = "";
                  if (localEmojiInfo != null)
                    break label691;
                  str3 = "";
                  if (localEmojiInfo != null)
                    break label701;
                  str4 = "";
                  if (localas != null)
                    break label711;
                  str5 = "";
                  ab.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult file aes failed. try to download by cgi.emojiMd5:%s buf size:%d buf md5:%s key:%s eUrl:%s srcContent:%s", new Object[] { str1, Long.valueOf(l), str2, str3, str4, str5 });
                  if (this.kVl.kVj != null)
                    this.kVl.kVj.a(false, localEmojiInfo);
                  if (i != 101)
                    break label721;
                  com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 4, 0, 1, localas.cwg, 1, localas.xYh);
                  e.deleteFile(paramArrayOfObject);
                  d.b(localas);
                  AppMethodBeat.o(53033);
                  break;
                  if (i == 101)
                  {
                    paramArrayOfObject = str1 + "_extern";
                    break label262;
                  }
                  paramArrayOfObject = str1 + "_encrypt";
                  break label262;
                  paramBoolean = bool;
                  com.tencent.mm.plugin.emoji.c.hF(7L);
                }
              }
            }
            catch (Exception localException)
            {
              while (true)
              {
                boolean bool;
                String str4;
                String str5;
                ab.e("MicroMsg.emoji.EmojiService", "encrypt file failed. exception:%s", new Object[] { bo.l(localException) });
                if (i == 101)
                {
                  com.tencent.mm.plugin.emoji.c.hF(12L);
                  continue;
                  if (i == 101)
                  {
                    paramBoolean = bool;
                    com.tencent.mm.plugin.emoji.c.hF(12L);
                    paramBoolean = bool;
                  }
                  else
                  {
                    paramBoolean = bool;
                    com.tencent.mm.plugin.emoji.c.hF(8L);
                    paramBoolean = bool;
                  }
                }
                else
                {
                  com.tencent.mm.plugin.emoji.c.hF(8L);
                  continue;
                  label672: str1 = localEmojiInfo.Aq();
                  continue;
                  label682: localObject = e.atg(paramArrayOfObject);
                  continue;
                  label691: str3 = localEmojiInfo.field_aeskey;
                  continue;
                  label701: str4 = localEmojiInfo.field_encrypturl;
                  continue;
                  label711: str5 = localas.xYg;
                  continue;
                  label721: com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 3, 0, 1, localas.cwg, 1, localas.xYh);
                }
              }
              label746: e.deleteFile(paramArrayOfObject);
            }
          }
        }
        Object localObject = new b(str1);
        if (e.asZ(str1) > 0L)
        {
          str3 = e.atg(j.w(((b)localObject).mUri));
          paramArrayOfObject = localEmojiInfo.Aq();
          if (i == 101)
            paramArrayOfObject = localEmojiInfo.field_externMd5;
          if ((!bo.isNullOrNil(str3)) && (str3.equalsIgnoreCase(paramArrayOfObject)))
          {
            if (i == 101)
            {
              com.tencent.mm.plugin.emoji.c.hF(13L);
              com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 4, 0, 0, localas.cwg, 0, localas.xYh);
            }
            while (true)
            {
              f.bjK().c(localEmojiInfo, true);
              if (this.kVl.kVj != null)
                this.kVl.kVj.a(true, localEmojiInfo);
              d.b(localas);
              AppMethodBeat.o(53033);
              break;
              label902: ab.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult file aes download failed., try to download by cgi.emojiMd5:%s", new Object[] { localEmojiInfo.Aq() });
              if (this.kVl.kVj != null)
                this.kVl.kVj.a(false, localEmojiInfo);
              if (i == 101)
                com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 4, 1, 1, localas.cwg, 1, localas.xYh);
              while (true)
              {
                d.b(localas);
                AppMethodBeat.o(53033);
                break;
                com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 3, 1, 1, localas.cwg, 1, localas.xYh);
              }
              if (i == 102)
              {
                com.tencent.mm.plugin.emoji.c.hF(4L);
                com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 3, 0, 0, localas.cwg, 0, localas.xYh);
              }
              else
              {
                com.tencent.mm.plugin.emoji.c.hF(4L);
                com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 2, 0, 0, localas.cwg, 1, localas.xYh);
              }
            }
          }
          if (localEmojiInfo == null)
          {
            paramArrayOfObject = "";
            label1089: if (localEmojiInfo != null)
              break label1211;
          }
          label1211: for (str1 = ""; ; str1 = localEmojiInfo.field_cdnUrl)
          {
            ab.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult md5 check failed, try to download by cgi. buf md5:%s emojiMd5:%s field_cdnUrl:%s", new Object[] { str3, paramArrayOfObject, str1 });
            if (this.kVl.kVj != null)
              this.kVl.kVj.a(false, localEmojiInfo);
            ((b)localObject).delete();
            d.b(localas);
            if (i != 101)
              break label1221;
            com.tencent.mm.plugin.emoji.c.hF(14L);
            com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 4, 0, 1, localas.cwg, 0, localas.xYh);
            AppMethodBeat.o(53033);
            break;
            paramArrayOfObject = localEmojiInfo.Aq();
            break label1089;
          }
          label1221: if (i == 102)
          {
            com.tencent.mm.plugin.emoji.c.hF(5L);
            com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 3, 0, 1, localas.cwg, 1, localas.xYh);
            AppMethodBeat.o(53033);
            break;
          }
          com.tencent.mm.plugin.emoji.c.hF(5L);
          com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 2, 0, 1, localas.cwg, 1, localas.xYh);
          AppMethodBeat.o(53033);
          break;
        }
        if (localEmojiInfo == null)
        {
          paramArrayOfObject = "";
          label1307: if (localEmojiInfo != null)
            break label1418;
          str1 = "";
          label1316: ab.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult file no exist., try to donwload by cgi.emojiMd5:%s field_cdnUrl:%s", new Object[] { paramArrayOfObject, str1 });
          if (this.kVl.kVj != null)
            this.kVl.kVj.a(false, localEmojiInfo);
          if (i != 101)
            break label1428;
          com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 4, 1, 1, localas.cwg, 1, localas.xYh);
          com.tencent.mm.plugin.emoji.c.hF(3L);
        }
        while (true)
        {
          d.b(localas);
          AppMethodBeat.o(53033);
          break;
          paramArrayOfObject = localEmojiInfo.Aq();
          break label1307;
          label1418: str1 = localEmojiInfo.field_cdnUrl;
          break label1316;
          label1428: com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 2, 1, 1, localas.cwg, 1, localas.xYh);
          com.tencent.mm.plugin.emoji.c.hF(3L);
        }
        label1459: ab.i("MicroMsg.emoji.EmojiService", "handleCNDDownloadResult file no exist., try to donwload by cgi.emojiMd5:%s", new Object[] { localEmojiInfo.Aq() });
        if (this.kVl.kVj != null)
          this.kVl.kVj.a(false, localEmojiInfo);
        if (i == 101)
        {
          com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 4, 1, 1, localas.cwg, 1, localas.xYh);
          com.tencent.mm.plugin.emoji.c.hF(3L);
        }
        while (true)
        {
          d.b(localas);
          AppMethodBeat.o(53033);
          break;
          com.tencent.mm.plugin.emoji.c.a(localas.cvZ, 2, 1, 1, localas.cwg, 1, localas.xYh);
          com.tencent.mm.plugin.emoji.c.hF(3L);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.d.3
 * JD-Core Version:    0.6.2
 */