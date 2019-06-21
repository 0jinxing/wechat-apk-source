package com.tencent.mm.media.b;

import a.f.b.j;
import a.l;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/config/BaseCodecConfig;", "", "()V", "MIME_TYPE", "", "getMIME_TYPE", "()Ljava/lang/String;", "setMIME_TYPE", "(Ljava/lang/String;)V", "isRecognizedFormat", "", "colorFormat", "", "isRecognizedProfile", "profile", "selectCodec", "Landroid/media/MediaCodecInfo;", "mimeType", "selectColorFormat", "codecInfo", "trySetBitRateMode", "", "mediaFormat", "Landroid/media/MediaFormat;", "trySetProfile", "Companion", "plugin-mediaeditor_release"})
public class a
{
  static final String TAG = "MicroMsg.VideoCodecConfig";
  public static final a.a eTg;
  String MIME_TYPE = "video/avc";

  static
  {
    AppMethodBeat.i(12847);
    eTg = new a.a((byte)0);
    TAG = "MicroMsg.VideoCodecConfig";
    AppMethodBeat.o(12847);
  }

  public final void a(MediaCodecInfo paramMediaCodecInfo, MediaFormat paramMediaFormat)
  {
    AppMethodBeat.i(12846);
    j.p(paramMediaCodecInfo, "codecInfo");
    j.p(paramMediaFormat, "mediaFormat");
    if (d.iW(23));
    while (true)
    {
      try
      {
        paramMediaCodecInfo = paramMediaCodecInfo.getCapabilitiesForType(this.MIME_TYPE);
        if (paramMediaCodecInfo != null)
        {
          MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = paramMediaCodecInfo.profileLevels;
          if (arrayOfCodecProfileLevel != null)
          {
            paramMediaCodecInfo = new android/media/MediaCodecInfo$CodecProfileLevel;
            paramMediaCodecInfo.<init>();
            paramMediaCodecInfo.level = 0;
            paramMediaCodecInfo.profile = 0;
            int i = arrayOfCodecProfileLevel.length;
            int j = 0;
            if (j < i)
            {
              MediaCodecInfo.CodecProfileLevel localCodecProfileLevel = arrayOfCodecProfileLevel[j];
              int k = localCodecProfileLevel.profile;
              int m = localCodecProfileLevel.level;
              ab.i(TAG, "profile: %s, level: %s", new Object[] { Integer.valueOf(k), Integer.valueOf(m) });
              int n;
              switch (k)
              {
              default:
                n = 0;
                if ((n != 0) && (k >= paramMediaCodecInfo.profile) && (m >= paramMediaCodecInfo.level))
                {
                  paramMediaCodecInfo.profile = k;
                  paramMediaCodecInfo.level = m;
                }
                j++;
                break;
              case 1:
              case 2:
              case 8:
                n = 1;
                break;
              }
            }
            ab.i(TAG, "best profile: %s, level: %s", new Object[] { Integer.valueOf(paramMediaCodecInfo.profile), Integer.valueOf(paramMediaCodecInfo.level) });
            if ((paramMediaCodecInfo.profile > 0) && (paramMediaCodecInfo.level >= 256))
            {
              paramMediaFormat.setInteger("profile", paramMediaCodecInfo.profile);
              paramMediaFormat.setInteger("level", 256);
              AppMethodBeat.o(12846);
              return;
            }
          }
        }
      }
      catch (Exception paramMediaCodecInfo)
      {
        ab.e(TAG, "trySetProfile error: %s", new Object[] { paramMediaCodecInfo.getMessage() });
      }
      AppMethodBeat.o(12846);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.b.a
 * JD-Core Version:    0.6.2
 */