package com.tencent.mm.audio.c;

import android.media.AudioTrack;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.e;
import com.tencent.mm.compatible.e.b;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.sdk.platformtools.ab;

public final class a
{
  public static AudioTrack a(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3)
  {
    int i = 3;
    AppMethodBeat.i(55761);
    int j;
    int k;
    label55: e locale;
    if (paramBoolean)
    {
      j = 3;
      k = j;
      if (q.etd.epG)
      {
        q.etd.dump();
        if ((!paramBoolean) || (q.etd.eqj < 0))
          break label221;
        k = q.etd.eqj;
      }
      j = AudioTrack.getMinBufferSize(paramInt1, paramInt2, 2);
      ab.i("AudioDeviceFactory", "speakerOn: %b, type: %d, sampleRate: %d, channelConfig: %d, PlayBufSize: %d, bufTimes: %d", new Object[] { Boolean.valueOf(paramBoolean), Integer.valueOf(k), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(j), Integer.valueOf(paramInt3) });
      locale = new e(k, paramInt1, paramInt2, paramInt3 * j);
      if (locale.getState() != 0)
        break label259;
      locale.release();
      ab.i("AudioDeviceFactory", "reconstruct AudioTrack");
      if (k != 0)
        break label253;
      k = i;
      label165: locale = new e(k, paramInt1, paramInt2, paramInt3 * j);
    }
    label259: 
    while (true)
    {
      ab.i("AudioDeviceFactory", "AudioTrack state: " + locale.getState());
      AppMethodBeat.o(55761);
      return locale;
      j = 0;
      break;
      label221: k = j;
      if (paramBoolean)
        break label55;
      k = j;
      if (q.etd.eqk < 0)
        break label55;
      k = q.etd.eqk;
      break label55;
      label253: k = 0;
      break label165;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.c.a
 * JD-Core Version:    0.6.2
 */