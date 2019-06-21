package com.tencent.mm.plugin.emoji.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.r;
import com.tencent.mm.protocal.protobuf.hu;
import com.tencent.mm.protocal.protobuf.hv;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import java.util.LinkedList;

public final class c
  implements f
{
  private String kVc;
  private com.tencent.mm.at.a.c.c kVd;

  public c()
  {
    AppMethodBeat.i(52999);
    this.kVd = new c.1(this);
    AppMethodBeat.o(52999);
  }

  static void cb(String paramString, int paramInt)
  {
    AppMethodBeat.i(53002);
    r localr = new r();
    localr.csC.csD = paramString;
    localr.csC.status = paramInt;
    localr.csC.csE = 0;
    com.tencent.mm.sdk.b.a.xxA.m(localr);
    ab.d("MicroMsg.emoji.EmojiAppMsgDownloadService", "attachid:%s percentage:%d status:%d", new Object[] { paramString, Integer.valueOf(0), Integer.valueOf(paramInt) });
    AppMethodBeat.o(53002);
  }

  public final void c(j.b paramb)
  {
    AppMethodBeat.i(53001);
    if (paramb == null)
    {
      ab.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "msg content is null");
      AppMethodBeat.o(53001);
    }
    while (true)
    {
      return;
      String str = paramb.fgq;
      if (bo.isNullOrNil(str))
      {
        ab.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "md5 is null.");
        AppMethodBeat.o(53001);
      }
      else
      {
        EmojiInfo localEmojiInfo = new EmojiInfo();
        localEmojiInfo.field_md5 = str;
        localEmojiInfo.field_app_id = paramb.appId;
        localEmojiInfo.field_catalog = EmojiInfo.yaf;
        localEmojiInfo.field_size = paramb.fgo;
        localEmojiInfo.field_temp = 1;
        localEmojiInfo.field_state = EmojiInfo.yav;
        j.getEmojiStorageMgr().xYn.F(localEmojiInfo);
        paramb = new LinkedList();
        paramb.add(str);
        paramb = new com.tencent.mm.plugin.emoji.f.e(paramb);
        com.tencent.mm.kernel.g.RO().eJo.a(paramb, 0);
        cb(str, 0);
        ab.d("MicroMsg.emoji.EmojiAppMsgDownloadService", "start change cdn url. md5:%s", new Object[] { str });
        this.kVc = str;
        AppMethodBeat.o(53001);
      }
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(53000);
    ab.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "errType:%d errCode:%d errMsg:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    switch (paramm.getType())
    {
    default:
      ab.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "no download app attach scene");
      AppMethodBeat.o(53000);
    case 221:
    case 697:
    }
    while (true)
    {
      return;
      AppMethodBeat.o(53000);
      continue;
      String str = "";
      com.tencent.mm.plugin.emoji.f.e locale = (com.tencent.mm.plugin.emoji.f.e)paramm;
      if (locale.kWt == com.tencent.mm.plugin.emoji.f.e.kWr)
      {
        if (locale.ehh == null);
        for (paramm = null; ; paramm = (hu)locale.ehh.fsG.fsP)
        {
          paramString = str;
          if (paramm != null)
          {
            paramString = str;
            if (paramm.vKk != null)
            {
              paramString = str;
              if (paramm.vKk.size() > 0)
                paramString = (String)paramm.vKk.get(0);
            }
          }
          if (bo.isEqual(paramString, this.kVc))
            break label202;
          AppMethodBeat.o(53000);
          break;
        }
        label202: if ((paramInt1 == 0) && (paramInt2 == 0))
        {
          paramm = locale.bku();
          if ((paramm == null) || (paramm.vKl == null) || (paramm.vKl.size() <= 0))
          {
            cb(paramString, 2);
            ab.e("MicroMsg.emoji.EmojiAppMsgDownloadService", "NetSceneBatchEmojiDownLoad MD5 to URL failed.");
            AppMethodBeat.o(53000);
          }
          else
          {
            paramm = (xx)paramm.vKl.get(0);
            str = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", paramm.Md5);
            if ((com.tencent.mm.emoji.a.e.OQ()) && (com.tencent.mm.emoji.a.e.OR()) && (!bo.isNullOrNil(paramm.ExternUrl)) && (!bo.isNullOrNil(paramm.ExternMd5)))
            {
              j.bjW().a(paramm.ExternUrl, com.tencent.mm.plugin.emoji.e.g.r(str + "_extern", new Object[] { paramm, Integer.valueOf(101) }), this.kVd);
              AppMethodBeat.o(53000);
            }
            else if ((!bo.isNullOrNil(paramm.EncryptUrl)) && (!bo.isNullOrNil(paramm.AesKey)))
            {
              j.bjW().a(paramm.EncryptUrl, com.tencent.mm.plugin.emoji.e.g.r(str + "_encrypt", new Object[] { paramm, Integer.valueOf(102) }), this.kVd);
              com.tencent.mm.plugin.emoji.c.hF(6L);
              AppMethodBeat.o(53000);
            }
            else if (!bo.isNullOrNil(paramm.Url))
            {
              j.bjW().a(paramm.Url, com.tencent.mm.plugin.emoji.e.g.q(str, new Object[] { paramm, Integer.valueOf(100) }), this.kVd);
              com.tencent.mm.plugin.emoji.c.hF(1L);
              AppMethodBeat.o(53000);
            }
            else
            {
              ab.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "no url info. download faild.");
              cb(paramString, 2);
              AppMethodBeat.o(53000);
            }
          }
        }
        else
        {
          cb(paramString, 2);
          AppMethodBeat.o(53000);
        }
      }
      else
      {
        ab.i("MicroMsg.emoji.EmojiAppMsgDownloadService", "no request type ");
        AppMethodBeat.o(53000);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.c
 * JD-Core Version:    0.6.2
 */