package com.tencent.mm.plugin.ext.voicecontrol;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.d.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

final class ExtControlProviderVoiceControl$1
  implements Runnable
{
  ExtControlProviderVoiceControl$1(ExtControlProviderVoiceControl paramExtControlProviderVoiceControl, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(20440);
    int i = bo.getInt(this.lRq, 4);
    if (i == 1)
      ExtControlProviderVoiceControl.a(this.lRu, this.val$filePath);
    while (true)
    {
      if (!ExtControlProviderVoiceControl.b(ExtControlProviderVoiceControl.a(this.lRu), i, bo.getInt(this.lRr, 4), bo.getInt(this.lRs, 16000), bo.getInt(this.lRt, 16), this.val$filePath))
      {
        ab.e("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] !ok countDown");
        ExtControlProviderVoiceControl.b(this.lRu);
        this.lRu.lRm.countDown();
      }
      AppMethodBeat.o(20440);
      return;
      ab.i("MicroMsg.ext.ExtControlProviderVoiceControl", "[voiceControl] not pcm, don't run localVoiceControl");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ext.voicecontrol.ExtControlProviderVoiceControl.1
 * JD-Core Version:    0.6.2
 */