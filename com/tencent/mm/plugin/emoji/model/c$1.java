package com.tencent.mm.plugin.emoji.model;

import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.a;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.vfs.e;

final class c$1
  implements com.tencent.mm.at.a.c.c
{
  c$1(c paramc)
  {
  }

  public final void a(boolean paramBoolean, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(52998);
    if ((paramArrayOfObject == null) || (paramArrayOfObject.length < 2))
    {
      ab.w("MicroMsg.emoji.EmojiAppMsgDownloadService", "extra obj error");
      AppMethodBeat.o(52998);
      return;
    }
    int i = ((Integer)paramArrayOfObject[1]).intValue();
    if ((paramArrayOfObject[0] instanceof xx));
    for (xx localxx = (xx)paramArrayOfObject[0]; ; localxx = null)
    {
      if (localxx == null)
      {
        ab.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "msginfo or  emojiInfo");
        AppMethodBeat.o(52998);
        break;
      }
      String str1 = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", localxx.Md5);
      new StringBuilder().append(str1).append("_encrypt");
      if (i == 101)
        paramArrayOfObject = str1 + "_extern";
      for (boolean bool1 = true; ; bool1 = false)
      {
        label138: label412: Object localObject;
        while (true)
        {
          if (!paramBoolean)
            break label884;
          if (bool1)
          {
            paramBoolean = false;
            if (e.asZ(paramArrayOfObject) <= 0L)
              break label670;
            long l = System.currentTimeMillis();
            try
            {
              boolean bool2 = a.g(Base64.encodeToString(bo.anf(localxx.AesKey), 0), paramArrayOfObject, str1);
              if (bool2)
              {
                paramBoolean = bool2;
                com.tencent.mm.plugin.emoji.c.hF(7L);
              }
              for (paramBoolean = bool2; ; paramBoolean = bool2)
              {
                ab.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "encrypt file use time:%d", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
                if (paramBoolean)
                  break label421;
                str1 = localxx.Md5;
                l = e.asZ(paramArrayOfObject);
                if (e.atg(paramArrayOfObject) != null)
                  break label412;
                String str2 = "";
                ab.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "handleCNDDownloadResult file aes failed. try to download by cgi.emojiMd5:%s buf size:%d buf md5:%s key:%s eUrl:%s ", new Object[] { str1, Long.valueOf(l), str2, localxx.AesKey, localxx.EncryptUrl });
                com.tencent.mm.plugin.emoji.c.a(localxx.Md5, 3, 0, 1, "", 1, "");
                e.deleteFile(paramArrayOfObject);
                c.cb(localxx.Md5, 2);
                AppMethodBeat.o(52998);
                break;
                if (i != 102)
                  break label899;
                paramArrayOfObject = str1 + "_encrypt";
                bool1 = true;
                break label138;
                paramBoolean = bool2;
                com.tencent.mm.plugin.emoji.c.hF(8L);
              }
            }
            catch (Exception localException)
            {
              while (true)
              {
                ab.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "encrypt file failed. exception:%s", new Object[] { bo.l(localException) });
                com.tencent.mm.plugin.emoji.c.hF(8L);
                continue;
                localObject = e.atg(paramArrayOfObject);
              }
              label421: e.deleteFile(paramArrayOfObject);
            }
          }
        }
        com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(str1);
        int j = (int)e.asZ(str1);
        byte[] arrayOfByte = e.e(str1, 0, 10);
        if ((j > 0) && (arrayOfByte != null))
        {
          localObject = e.atg(com.tencent.mm.vfs.j.w(localb.mUri));
          paramArrayOfObject = localxx.Md5;
          if (i == 101)
            paramArrayOfObject = localxx.ExternMd5;
          if ((!bo.isNullOrNil((String)localObject)) && (((String)localObject).equalsIgnoreCase(paramArrayOfObject)))
          {
            if (bool1)
            {
              com.tencent.mm.plugin.emoji.c.hF(4L);
              com.tencent.mm.plugin.emoji.c.a(localxx.Md5, 3, 0, 0, "", 0, "");
              label540: j = EmojiInfo.yaq;
              if (!r.bS(arrayOfByte))
                break label748;
            }
            label670: label748: for (j = EmojiInfo.yap; ; j = EmojiInfo.yaq)
            {
              localObject = j.getEmojiStorageMgr().xYn.aqi((String)localObject);
              paramArrayOfObject = (Object[])localObject;
              if (localObject == null)
              {
                paramArrayOfObject = new EmojiInfo();
                paramArrayOfObject.field_md5 = localxx.Md5;
                paramArrayOfObject.field_catalog = EmojiInfo.yaf;
                paramArrayOfObject.field_size = ((int)e.asZ(str1));
              }
              paramArrayOfObject.field_type = j;
              paramArrayOfObject.field_state = EmojiInfo.yat;
              j.getEmojiStorageMgr().xYn.G(paramArrayOfObject);
              c.cb(localxx.Md5, 1);
              EmojiLogic.a(ah.getContext(), null, paramArrayOfObject.Aq(), paramArrayOfObject.ptQ, paramArrayOfObject);
              AppMethodBeat.o(52998);
              break;
              ab.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "handleCNDDownloadResult file aes download failed., try to download by cgi.emojiMd5:%s", new Object[] { localxx.Md5 });
              com.tencent.mm.plugin.emoji.c.a(localxx.Md5, 3, 1, 1, "", 1, "");
              c.cb(localxx.Md5, 2);
              AppMethodBeat.o(52998);
              break;
              com.tencent.mm.plugin.emoji.c.hF(4L);
              com.tencent.mm.plugin.emoji.c.a(localxx.Md5, 2, 0, 0, "", 1, "");
              break label540;
            }
          }
          ab.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "handleCNDDownloadResult md5 check failed, try to download by cgi. buf md5:%s emojiMd5:%s field_cdnUrl:%s", new Object[] { localObject, localxx.Md5, localxx.Url });
          localb.delete();
          c.cb(localxx.Md5, 2);
          if (bool1)
          {
            com.tencent.mm.plugin.emoji.c.hF(5L);
            com.tencent.mm.plugin.emoji.c.a(localxx.Md5, 3, 0, 1, "", 1, "");
            AppMethodBeat.o(52998);
            break;
          }
          com.tencent.mm.plugin.emoji.c.hF(5L);
          com.tencent.mm.plugin.emoji.c.a(localxx.Md5, 2, 0, 1, "", 1, "");
          AppMethodBeat.o(52998);
          break;
        }
        c.a(localxx, bool1);
        AppMethodBeat.o(52998);
        break;
        label884: c.a(localxx, bool1);
        AppMethodBeat.o(52998);
        break;
        label899: paramArrayOfObject = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.c.1
 * JD-Core Version:    0.6.2
 */