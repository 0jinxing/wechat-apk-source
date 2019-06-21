package com.tencent.mm.plugin.webview.modeltools;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ipcinvoker.wx_extension.b.a;
import com.tencent.mm.protocal.protobuf.caa;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.concurrent.CountDownLatch;

final class f$1
  implements b.a
{
  f$1(CountDownLatch paramCountDownLatch, Bundle paramBundle)
  {
  }

  public final void a(int paramInt1, int paramInt2, String paramString, b paramb)
  {
    AppMethodBeat.i(6952);
    ab.i("MicroMsg.SmartPickWordHelper", "onSceneEnd errType = %d, errCode = %d ,errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      this.val$countDownWait.countDown();
      AppMethodBeat.o(6952);
    }
    while (true)
    {
      return;
      paramString = (caa)paramb.fsH.fsP;
      this.uoN.putString("PickedWord", paramString.wYV);
      this.uoN.putInt("PrefixOffset", paramString.wZh);
      this.uoN.putInt("SuffixOffset", paramString.wZi);
      this.uoN.putString("PrefixText", paramString.wYW);
      this.uoN.putString("SuffixText", paramString.wYX);
      this.uoN.putInt("IsMainOrSub", paramString.wZj);
      f.access$002(paramString.wYV);
      f.b(paramString.wZk);
      f.access$202(paramString.wDM);
      ab.i("MicroMsg.SmartPickWordHelper", "response: PrefixText: %s, PickedWord: %s, SuffixText: %s, %d, %d, %d", new Object[] { paramString.wYW, paramString.wYV, paramString.wYX, Integer.valueOf(paramString.wZh), Integer.valueOf(paramString.wZi), Integer.valueOf(paramString.wZj) });
      this.val$countDownWait.countDown();
      AppMethodBeat.o(6952);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.modeltools.f.1
 * JD-Core Version:    0.6.2
 */