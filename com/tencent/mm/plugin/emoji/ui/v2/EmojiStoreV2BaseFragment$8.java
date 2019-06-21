package com.tencent.mm.plugin.emoji.ui.v2;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.GetEmotionListResponse;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.p;

final class EmojiStoreV2BaseFragment$8
  implements Runnable
{
  EmojiStoreV2BaseFragment$8(EmojiStoreV2BaseFragment paramEmojiStoreV2BaseFragment, GetEmotionListResponse paramGetEmotionListResponse)
  {
  }

  public final void run()
  {
    int i = 0;
    AppMethodBeat.i(53578);
    int j;
    if (this.ldd != null)
    {
      if (this.ldd != null)
        break label95;
      j = 0;
      if (this.ldd != null)
        break label106;
    }
    while (true)
    {
      ab.d("MicroMsg.emoji.EmojiStoreV2BaseFragment", "jacks save EmoijStoreUI Cache: list:%d, size: %d, type: %d", new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(this.ldc.bkV()) });
      j.getEmojiStorageMgr().xYq.a(this.ldc.bkV(), this.ldd);
      AppMethodBeat.o(53578);
      return;
      label95: j = this.ldd.EmotionCount;
      break;
      label106: if (this.ldd.ReqBuf != null)
        i = this.ldd.ReqBuf.computeSize();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2BaseFragment.8
 * JD-Core Version:    0.6.2
 */