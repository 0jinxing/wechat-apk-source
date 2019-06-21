package com.tencent.mm.plugin.emoji.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.a.d.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.emojicapture.api.EmojiCaptureReporter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.EmojiInfo.a;
import com.tencent.mm.storage.emotion.EmojiInfo.b;

final class h$1
  implements d.b
{
  h$1(h paramh, EmojiInfo paramEmojiInfo, EmojiCaptureReporter paramEmojiCaptureReporter)
  {
  }

  public final void f(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(52885);
    g.RS().aa(new h.1.1(this));
    ab.d("MicroMsg.emoji.EmojiMgrImpl", "uploadCaptureEmoji errorCode: " + paramInt + " gifMd5: " + paramString1 + " activityId: " + paramString2);
    if (paramInt != 0)
      this.kTI.a(EmojiInfo.a.yaG);
    switch (paramInt)
    {
    case 1:
    default:
      EmojiCaptureReporter.g(this.kTR.ezZ, 3, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaO);
    case 0:
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
      ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.G(this.kTI);
      AppMethodBeat.o(52885);
      return;
      this.kTR.lgQ = System.currentTimeMillis();
      long l1 = this.kTR.lgQ;
      long l2 = this.kTR.lgP;
      EmojiCaptureReporter.d(this.kTR.ezZ, l1 - l2, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.a.yaC);
      this.kTI.a(EmojiInfo.b.yaI);
      com.tencent.mm.plugin.report.service.h.pYm.e(10431, new Object[] { Integer.valueOf(7), this.kTI.Aq(), this.kTI.field_designerID, this.kTI.field_groupId, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(this.kTI.field_size), r.Yz(), this.kTI.field_activityid });
      continue;
      EmojiCaptureReporter.g(this.kTR.ezZ, 7, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaJ);
      continue;
      EmojiCaptureReporter.g(this.kTR.ezZ, 8, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaK);
      continue;
      EmojiCaptureReporter.g(this.kTR.ezZ, 9, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaL);
      continue;
      EmojiCaptureReporter.g(this.kTR.ezZ, 5, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaM);
      continue;
      EmojiCaptureReporter.g(this.kTR.ezZ, 1, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaN);
      continue;
      EmojiCaptureReporter.g(this.kTR.ezZ, 4, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaP);
      continue;
      EmojiCaptureReporter.g(this.kTR.ezZ, 2, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaQ);
      continue;
      EmojiCaptureReporter.g(this.kTR.ezZ, 6, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaR);
      continue;
      EmojiCaptureReporter.g(this.kTR.ezZ, 10, this.kTI.field_captureScene);
      this.kTI.a(EmojiInfo.b.yaS);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.e.h.1
 * JD-Core Version:    0.6.2
 */