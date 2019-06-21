package com.tencent.mm.plugin.mmsight.model.a;

import android.media.MediaCodec;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.b.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.nio.ByteBuffer;

final class h$3
  implements c.a
{
  h$3(h paramh)
  {
  }

  public final void bN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(76576);
    ab.w("MicroMsg.MMSightAACMediaCodecRecorder", "on rec error, %d, %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(76576);
  }

  public final void u(byte[] paramArrayOfByte, int paramInt)
  {
    int i = 0;
    AppMethodBeat.i(76575);
    this.owg.ovX.sendEmptyMessage(0);
    if (!this.owg.ovS);
    for (paramInt = 1; ; paramInt = 0)
    {
      if (paramInt == 0)
        this.owg.ils += 128;
      boolean bool = this.owg.ovY;
      if (paramInt == 0)
      {
        ??? = this.owg;
        if (!((h)???).ovW)
          break label212;
        if (!((h)???).eVK)
          break label250;
      }
      while (true)
      {
        if ((bool) && (!this.owg.owc));
        synchronized (this.owg.owa)
        {
          if (this.owg.owb != null)
          {
            ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "do aac stop callback");
            this.owg.owb.WT();
            this.owg.owb = null;
            this.owg.ovZ = true;
            this.owg.owc = true;
            this.owg.owd.removeCallbacks(this.owg.owe);
            this.owg.owd.post(this.owg.owe);
            AppMethodBeat.o(76575);
            return;
            label212: synchronized (((h)???).eVL)
            {
              if (!((h)???).eVK);
            }
            label250: if (0L == ((h)???).ovN)
              ((h)???).ovN = System.nanoTime();
            if ((((h)???).ovV != null) && (((h)???).ovV.owQ <= 0L))
              ((h)???).ovV.owQ = System.nanoTime();
            if (((h)???).eVq != null)
            {
              if (((h)???).eVq == null)
                ab.w("MicroMsg.MMSightAACMediaCodecRecorder", "send audio to encoder error, encoder is null, end:".concat(String.valueOf(bool)));
              label725: 
              while (true)
              {
                ((h)???).drainEncoder(bool);
                break;
                try
                {
                  ??? = ((h)???).eVq.getInputBuffers();
                  paramInt = ((h)???).eVq.dequeueInputBuffer(10000L);
                  ((h)???).ovO = paramInt;
                  if (paramInt < 0)
                  {
                    ab.d("MicroMsg.MMSightAACMediaCodecRecorder", "audio no input available, drain first");
                    for (paramInt = i; paramInt < 5; paramInt++)
                    {
                      ((h)???).drainEncoder(false);
                      ((h)???).ovO = ((h)???).eVq.dequeueInputBuffer(10000L);
                      if (((h)???).ovO >= 0)
                        break;
                    }
                  }
                  if (((h)???).eVq != null)
                    break label477;
                  ab.w("MicroMsg.MMSightAACMediaCodecRecorder", "send audio to encoder error, encoder is null, end:".concat(String.valueOf(bool)));
                }
                catch (Throwable paramArrayOfByte)
                {
                  ab.e("MicroMsg.MMSightAACMediaCodecRecorder", "_offerAudioEncoder exception " + paramArrayOfByte.getMessage());
                }
                continue;
                label477: if (((h)???).ovO >= 0)
                {
                  ??? = ???[???.ovO];
                  ((ByteBuffer)???).clear();
                  ((ByteBuffer)???).put(paramArrayOfByte);
                  ((ByteBuffer)???).position(0);
                  ((h)???).ovP = paramArrayOfByte.length;
                  ((h)???).ovQ = System.nanoTime();
                  ((h)???).ovQ -= ((h)???).ovP / ((h)???).audioSampleRate / 1000000000;
                  if (((h)???).ovP == -3)
                    ab.e("MicroMsg.MMSightAACMediaCodecRecorder", "Audio read error");
                  long l1 = ((h)???).ovQ;
                  if (((h)???).ovV != null);
                  for (long l2 = ((h)???).ovV.owQ; ; l2 = ((h)???).ovN)
                  {
                    ((h)???).ovR = ((l1 - l2) / 1000L);
                    paramArrayOfByte = new java/lang/StringBuilder;
                    paramArrayOfByte.<init>("queueing ");
                    ab.v("MicroMsg.MMSightAACMediaCodecRecorder", ((h)???).ovP + " audio bytes with pts " + ((h)???).ovR + ", end:" + bool + ", enqueue:" + ((h)???).ovO);
                    if (!bool)
                      break label725;
                    ab.i("MicroMsg.MMSightAACMediaCodecRecorder", "EOS received in sendAudioToEncoder");
                    ((h)???).eVq.queueInputBuffer(((h)???).ovO, 0, ((h)???).ovP, ((h)???).ovR, 4);
                    break;
                  }
                  ((h)???).eVq.queueInputBuffer(((h)???).ovO, 0, ((h)???).ovP, ((h)???).ovR, 0);
                }
              }
            }
          }
          else
          {
            ab.w("MicroMsg.MMSightAACMediaCodecRecorder", "aac stop callback is null");
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.h.3
 * JD-Core Version:    0.6.2
 */