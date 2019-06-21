package com.tencent.mm.plugin.collect.model.voice;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class b$a
  implements Runnable
{
  private b$a(b paramb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(41026);
    try
    {
      this.kDo.mText = this.kDo.mText.replaceAll("[^0-9a-zA-Z一-龥.?!,;:。？！，、；：@%&/]+", "");
      ab.d("MicroMsg.OfflineVoice.InnerSynthesizer", "mText = %s  mVolume = %s mSpeed = %s", new Object[] { this.kDo.mText, Float.valueOf(this.kDo.mVolume), Float.valueOf(this.kDo.JN) });
      int i = this.kDo.kDk.readmoney(this.kDo.mText.getBytes("UTF-8"), this.kDo.kDn, this.kDo.kDm, this.kDo.mVolume, this.kDo.JN);
      if (i != -1)
      {
        byte[] arrayOfByte = new byte[i];
        System.arraycopy(this.kDo.kDn, 0, arrayOfByte, 0, i);
        if (!this.kDo.kDl)
        {
          Message localMessage = this.kDo.mHandler.obtainMessage(0);
          Bundle localBundle = new android/os/Bundle;
          localBundle.<init>();
          localBundle.putByteArray("data", arrayOfByte);
          localMessage.setData(localBundle);
          this.kDo.mHandler.sendMessage(localMessage);
        }
        AppMethodBeat.o(41026);
      }
      while (true)
      {
        return;
        this.kDo.mHandler.sendMessage(this.kDo.mHandler.obtainMessage(-1));
        AppMethodBeat.o(41026);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.i("MicroMsg.OfflineVoice.InnerSynthesizer", "SynthesizerRunnable Exception:%s %s", new Object[] { localException.getClass().getSimpleName(), localException.getMessage() });
        this.kDo.mHandler.sendMessage(this.kDo.mHandler.obtainMessage(-1));
        AppMethodBeat.o(41026);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.voice.b.a
 * JD-Core Version:    0.6.2
 */