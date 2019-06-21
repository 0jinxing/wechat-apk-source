package com.tencent.mm.emoji.d;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.a.d;
import com.tencent.mm.emoji.a.d.b;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/upload/EmojiCaptureUploadTask;", "Lcom/tencent/mm/loader/loader/IWorkTask;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "TAG", "", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "isWxam", "", "()Z", "timeEnter", "", "getTimeEnter", "()J", "uploadCost", "getUploadCost", "setUploadCost", "(J)V", "call", "", "handleFail", "errorCode", "", "handleSuccess", "gifMd5", "uniqueId", "plugin-emojisdk_release"})
public final class c extends com.tencent.mm.loader.g.c
{
  final String TAG;
  long eAa;
  final boolean eAb;
  final EmojiInfo exP;
  final long ezZ;

  public c(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63299);
    this.exP = paramEmojiInfo;
    this.TAG = "MicroMsg.EmojiCaptureUploadTask";
    this.ezZ = this.exP.field_captureEnterTime;
    this.eAb = this.exP.duV();
    AppMethodBeat.o(63299);
  }

  public final void Pa()
  {
    AppMethodBeat.i(63297);
    long l = bo.anU();
    new d(this.exP, (List)this.exP.dvd(), this.exP.field_imitateMd5, (d.b)new c.a(this, l));
    AppMethodBeat.o(63297);
  }

  public final String Pc()
  {
    AppMethodBeat.i(63298);
    long l = this.ezZ;
    AppMethodBeat.o(63298);
    return String.valueOf(l);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.d.c
 * JD-Core Version:    0.6.2
 */