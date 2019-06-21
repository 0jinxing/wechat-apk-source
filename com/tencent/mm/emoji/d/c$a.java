package com.tencent.mm.emoji.d;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.a.a;
import com.tencent.mm.emoji.a.d.b;
import com.tencent.mm.emoji.a.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.EmojiInfo.a;
import com.tencent.mm.storage.emotion.EmojiInfo.b;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/emoji/upload/EmojiCaptureUploadTask$call$1", "Lcom/tencent/mm/emoji/model/EmojiUploadLogic$EmojiUploadCallback;", "uploadCallback", "", "errorCode", "", "gifMd5", "", "activityId", "plugin-emojisdk_release"})
public final class c$a
  implements d.b
{
  c$a(long paramLong)
  {
  }

  public final void f(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(63295);
    ab.i(this.eAc.TAG, "uploadCallback: " + paramInt + ", " + paramString1);
    this.eAc.eAa = bo.gb(this.eAd);
    if (paramInt == 0)
    {
      paramString2 = this.eAc;
      paramInt = paramString2.exP.field_captureScene;
      paramString2.exP.a(EmojiInfo.a.yaC);
      EmojiCaptureReporter.d(paramString2.ezZ, paramString2.eAa, paramInt);
      com.tencent.mm.plugin.report.service.h.pYm.e(10431, new Object[] { Integer.valueOf(7), paramString2.exP.Aq(), paramString2.exP.field_designerID, paramString2.exP.awa(), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(paramString2.exP.getSize()), r.Yz(), paramString2.exP.field_activityid });
      Object localObject;
      if ((paramString2.eAb) && (!e.OR()))
      {
        ab.w(paramString2.TAG, "upload wxam but not decode, load gif");
        localObject = com.tencent.mm.emoji.loader.c.g.exW;
        com.tencent.mm.emoji.loader.c.g.a(paramString2.exP, (a.f.a.b)new c.b(paramString2, paramString1));
        AppMethodBeat.o(63295);
      }
      while (true)
      {
        return;
        a.OB().cd(true);
        localObject = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
        j.o(localObject, "MMKernel.plugin(IPluginEmoji::class.java)");
        localObject = ((com.tencent.mm.plugin.emoji.b.d)localObject).getEmojiStorageMgr();
        j.o(localObject, "MMKernel.plugin(IPluginE…ass.java).emojiStorageMgr");
        ((at)localObject).aUp().G(paramString2.exP);
        paramString2.a(com.tencent.mm.loader.g.h.eRj);
        localObject = b.ezV;
        b.b(paramString2.ezZ, true, paramString1);
        AppMethodBeat.o(63295);
      }
    }
    paramString1 = this.eAc;
    paramString1.exP.a(EmojiInfo.a.yaG);
    int i = paramString1.exP.field_captureScene;
    switch (paramInt)
    {
    default:
      EmojiCaptureReporter.g(paramString1.ezZ, 3, i);
      paramString1.exP.a(EmojiInfo.b.yaO);
    case 5:
    case 6:
    case 7:
    case 4:
    case 3:
    case 10:
    case 2:
    case 8:
    case 9:
    }
    while (true)
    {
      paramString2 = com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class);
      j.o(paramString2, "MMKernel.plugin(IPluginEmoji::class.java)");
      paramString2 = ((com.tencent.mm.plugin.emoji.b.d)paramString2).getEmojiStorageMgr();
      j.o(paramString2, "MMKernel.plugin(IPluginE…ass.java).emojiStorageMgr");
      paramString2.aUp().G(paramString1.exP);
      paramString2 = b.ezV;
      b.b(paramString1.ezZ, false, null);
      paramString1.a(com.tencent.mm.loader.g.h.eRk);
      AppMethodBeat.o(63295);
      break;
      EmojiCaptureReporter.g(paramString1.ezZ, 7, i);
      paramString1.exP.a(EmojiInfo.b.yaJ);
      continue;
      EmojiCaptureReporter.g(paramString1.ezZ, 8, i);
      paramString1.exP.a(EmojiInfo.b.yaK);
      continue;
      EmojiCaptureReporter.g(paramString1.ezZ, 9, i);
      paramString1.exP.a(EmojiInfo.b.yaL);
      continue;
      EmojiCaptureReporter.g(paramString1.ezZ, 5, i);
      paramString1.exP.a(EmojiInfo.b.yaM);
      continue;
      EmojiCaptureReporter.g(paramString1.ezZ, 1, i);
      paramString1.exP.a(EmojiInfo.b.yaN);
      continue;
      EmojiCaptureReporter.g(paramString1.ezZ, 4, i);
      paramString1.exP.a(EmojiInfo.b.yaP);
      continue;
      EmojiCaptureReporter.g(paramString1.ezZ, 2, i);
      paramString1.exP.a(EmojiInfo.b.yaQ);
      continue;
      EmojiCaptureReporter.g(paramString1.ezZ, 6, i);
      paramString1.exP.a(EmojiInfo.b.yaR);
      continue;
      EmojiCaptureReporter.g(paramString1.ezZ, 10, i);
      paramString1.exP.a(EmojiInfo.b.yaS);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.d.c.a
 * JD-Core Version:    0.6.2
 */