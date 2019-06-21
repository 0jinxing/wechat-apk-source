package com.tencent.mm.plugin.mmsight.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.b;
import com.tencent.mm.plugin.sight.base.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class m
  implements e
{
  private int audioSampleRate;
  private float bSi;
  private int bitrate;
  private int eTa;
  private int eWK;
  private boolean fdh;
  private String owG;

  public m(int paramInt1, String paramString, float paramFloat, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    AppMethodBeat.i(76627);
    this.eTa = paramInt1;
    this.owG = paramString;
    this.bSi = paramFloat;
    this.bitrate = paramInt2;
    this.eWK = paramInt3;
    this.audioSampleRate = paramInt4;
    this.fdh = paramBoolean;
    ab.d("MicroMsg.MMSightMP4Muxer", "create MMSightMP4Muxer, bufId: %s, recordPath: %s, fps: %s, bitrate: %s, videoDuration: %s, audioSampleRate%s, mute: %s", new Object[] { Integer.valueOf(paramInt1), paramString, Float.valueOf(paramFloat), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4), Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(76627);
  }

  public final boolean bPO()
  {
    AppMethodBeat.i(76628);
    long l = bo.yz();
    String str = d.WP(this.owG);
    try
    {
      bool = com.tencent.mm.vfs.e.ct(str);
      if (!bool)
        str = null;
      ab.i("MicroMsg.MMSightMP4Muxer", "start mux, bufId: %s, aacFile: %s", new Object[] { Integer.valueOf(this.eTa), str });
      i = SightVideoJNI.muxingLock(this.eTa, str, this.audioSampleRate, 1024, 2, 1, 0L, this.owG, this.bSi, Math.max(1000, this.eWK), this.bitrate, b.qwW, 8, 2, 23.0F, null, 0, false, this.fdh);
      ab.i("MicroMsg.MMSightMP4Muxer", "mux sight end, duration %ds, used %sms", new Object[] { Integer.valueOf(i), Long.valueOf(bo.az(l)) });
      if (bo.isNullOrNil(str));
    }
    catch (Exception localException1)
    {
      try
      {
        boolean bool;
        int i;
        com.tencent.mm.vfs.e.deleteFile(str);
        label153: if (i >= 0)
        {
          bool = true;
          AppMethodBeat.o(76628);
        }
        while (true)
        {
          return bool;
          localException1 = localException1;
          Object localObject = null;
          break;
          bool = false;
          AppMethodBeat.o(76628);
        }
      }
      catch (Exception localException2)
      {
        break label153;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.model.a.m
 * JD-Core Version:    0.6.2
 */