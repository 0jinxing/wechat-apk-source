package com.tencent.mm.media.b;

import a.f.b.j;
import a.k.m;
import a.l;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/config/VideoCodecConfig;", "Lcom/tencent/mm/media/config/BaseCodecConfig;", "()V", "bitrate", "", "getBitrate", "()I", "setBitrate", "(I)V", "codecInfo", "Landroid/media/MediaCodecInfo;", "getCodecInfo", "()Landroid/media/MediaCodecInfo;", "setCodecInfo", "(Landroid/media/MediaCodecInfo;)V", "colorFormat", "getColorFormat", "setColorFormat", "frameRate", "getFrameRate", "setFrameRate", "iFrameInterval", "getIFrameInterval", "setIFrameInterval", "initError", "", "getInitError", "()Z", "setInitError", "(Z)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "targetHeight", "getTargetHeight", "setTargetHeight", "targetWidth", "getTargetWidth", "setTargetWidth", "configToFormat", "Landroid/media/MediaFormat;", "Companion", "plugin-mediaeditor_release"})
public final class c extends a
{
  public static final c.a eTp;
  public int bitrate;
  public int eTi;
  public int eTj;
  public int eTk;
  private int eTl;
  private int eTm;
  public boolean eTn;
  private MediaCodecInfo eTo;
  public String name;

  static
  {
    AppMethodBeat.i(12850);
    eTp = new c.a((byte)0);
    AppMethodBeat.o(12850);
  }

  public c()
  {
    AppMethodBeat.i(12849);
    this.eTl = 2130708361;
    this.eTm = 1;
    j.p("video/avc", "<set-?>");
    this.MIME_TYPE = "video/avc";
    String str = this.MIME_TYPE;
    j.p(str, "mimeType");
    int i = MediaCodecList.getCodecCount();
    int j = 0;
    MediaCodecInfo localMediaCodecInfo;
    int m;
    if (j < i)
    {
      localMediaCodecInfo = MediaCodecList.getCodecInfoAt(j);
      j.o(localMediaCodecInfo, "codecInfo");
      label154: if (localMediaCodecInfo.isEncoder())
      {
        String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
        j.o(arrayOfString, "types");
        int k = arrayOfString.length;
        m = 0;
        label99: if (m < k)
        {
          ab.i(a.TAG, "selectCodec :  " + i + "  type: " + arrayOfString[m]);
          if (m.I(arrayOfString[m], str, true))
          {
            this.eTo = localMediaCodecInfo;
            if (this.eTo != null)
              break label208;
            h.pYm.k(1047L, 0L, 1L);
            this.eTn = true;
            AppMethodBeat.o(12849);
          }
        }
      }
    }
    while (true)
    {
      return;
      m++;
      break label99;
      j++;
      break;
      localMediaCodecInfo = null;
      break label154;
      label208: localMediaCodecInfo = this.eTo;
      if (localMediaCodecInfo == null)
        j.dWJ();
      this.name = localMediaCodecInfo.getName();
      this.eTm = ((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lGn, 1);
      ab.i("MicroMsg.VideoCodecConfig", "codecInfo.name : " + this.name + "  iFrameInterval " + this.eTm);
      AppMethodBeat.o(12849);
    }
  }

  public final MediaFormat Ux()
  {
    AppMethodBeat.i(12848);
    ab.i("MicroMsg.VideoCodecConfig", "targetWidth:" + this.eTi + ", targetHeight:" + this.eTj + ", bitrate:" + this.bitrate + ", frameRate:" + this.eTk + ", colorFormat:" + this.eTl + ", iFrameInterval:" + this.eTm);
    MediaFormat localMediaFormat = MediaFormat.createVideoFormat(this.MIME_TYPE, this.eTi, this.eTj);
    Object localObject = this.eTo;
    if (localObject == null)
      j.dWJ();
    j.o(localMediaFormat, "mediaFormat");
    a((MediaCodecInfo)localObject, localMediaFormat);
    localObject = this.eTo;
    if (localObject == null)
      j.dWJ();
    j.p(localObject, "codecInfo");
    j.p(localMediaFormat, "mediaFormat");
    try
    {
      if (d.iW(21))
      {
        localObject = ((MediaCodecInfo)localObject).getCapabilitiesForType(this.MIME_TYPE);
        if (localObject != null)
        {
          localObject = ((MediaCodecInfo.CodecCapabilities)localObject).getEncoderCapabilities();
          if (localObject != null)
          {
            if (!((MediaCodecInfo.EncoderCapabilities)localObject).isBitrateModeSupported(1))
              break label261;
            ab.i(a.TAG, "support vbr bitrate mode");
            localMediaFormat.setInteger("bitrate-mode", 1);
          }
        }
      }
      while (true)
      {
        localMediaFormat.setInteger("bitrate", this.bitrate);
        localMediaFormat.setInteger("frame-rate", this.eTk);
        localMediaFormat.setInteger("color-format", this.eTl);
        localMediaFormat.setInteger("i-frame-interval", this.eTm);
        AppMethodBeat.o(12848);
        return localMediaFormat;
        label261: if (!((MediaCodecInfo.EncoderCapabilities)localObject).isBitrateModeSupported(2))
          break;
        ab.i(a.TAG, "support cbr bitrate mode");
        localMediaFormat.setInteger("bitrate-mode", 2);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e(a.TAG, "trySetBitRateMode error: %s", new Object[] { localException.getMessage() });
        continue;
        ab.i(a.TAG, "both vbr and cbr bitrate mode not support!");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.b.c
 * JD-Core Version:    0.6.2
 */