package com.google.android.exoplayer2.e;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.VideoCapabilities;
import com.google.android.exoplayer2.i.v;
import com.tencent.matrix.trace.core.AppMethodBeat;

@TargetApi(16)
public final class a
{
  public final boolean aQR;
  public final boolean bdX;
  public final boolean bdY;
  public final MediaCodecInfo.CodecCapabilities bdZ;
  public final String mimeType;
  public final String name;

  a(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(95231);
    this.name = ((String)com.google.android.exoplayer2.i.a.checkNotNull(paramString1));
    this.mimeType = paramString2;
    this.bdZ = paramCodecCapabilities;
    if ((!paramBoolean1) && (paramCodecCapabilities != null))
      if ((v.SDK_INT >= 19) && (paramCodecCapabilities.isFeatureSupported("adaptive-playback")))
      {
        i = 1;
        if (i == 0)
          break label177;
        paramBoolean1 = true;
        label70: this.bdX = paramBoolean1;
        if (paramCodecCapabilities == null)
          break label189;
        if ((v.SDK_INT < 21) || (!paramCodecCapabilities.isFeatureSupported("tunneled-playback")))
          break label183;
        i = 1;
        label100: if (i == 0)
          break label189;
        paramBoolean1 = true;
        label108: this.aQR = paramBoolean1;
        if (!paramBoolean2)
        {
          paramBoolean1 = bool;
          if (paramCodecCapabilities == null)
            break label159;
          if ((v.SDK_INT < 21) || (!paramCodecCapabilities.isFeatureSupported("secure-playback")))
            break label195;
        }
      }
    label159: label177: label183: label189: label195: for (int i = 1; ; i = 0)
    {
      paramBoolean1 = bool;
      if (i != 0)
        paramBoolean1 = true;
      this.bdY = paramBoolean1;
      AppMethodBeat.o(95231);
      return;
      i = 0;
      break;
      paramBoolean1 = false;
      break label70;
      i = 0;
      break label100;
      paramBoolean1 = false;
      break label108;
    }
  }

  public static a a(String paramString1, String paramString2, MediaCodecInfo.CodecCapabilities paramCodecCapabilities, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(95230);
    paramString1 = new a(paramString1, paramString2, paramCodecCapabilities, paramBoolean1, paramBoolean2);
    AppMethodBeat.o(95230);
    return paramString1;
  }

  @TargetApi(21)
  private static boolean a(MediaCodecInfo.VideoCapabilities paramVideoCapabilities, int paramInt1, int paramInt2, double paramDouble)
  {
    AppMethodBeat.i(95234);
    boolean bool;
    if ((paramDouble == -1.0D) || (paramDouble <= 0.0D))
    {
      bool = paramVideoCapabilities.isSizeSupported(paramInt1, paramInt2);
      AppMethodBeat.o(95234);
    }
    while (true)
    {
      return bool;
      bool = paramVideoCapabilities.areSizeAndRateSupported(paramInt1, paramInt2, paramDouble);
      AppMethodBeat.o(95234);
    }
  }

  @TargetApi(21)
  public final boolean a(int paramInt1, int paramInt2, double paramDouble)
  {
    boolean bool = false;
    AppMethodBeat.i(95232);
    if (this.bdZ == null)
    {
      ax("sizeAndRate.caps");
      AppMethodBeat.o(95232);
    }
    while (true)
    {
      return bool;
      Object localObject = this.bdZ.getVideoCapabilities();
      if (localObject == null)
      {
        ax("sizeAndRate.vCaps");
        AppMethodBeat.o(95232);
      }
      else if (!a((MediaCodecInfo.VideoCapabilities)localObject, paramInt1, paramInt2, paramDouble))
      {
        if ((paramInt1 >= paramInt2) || (!a((MediaCodecInfo.VideoCapabilities)localObject, paramInt2, paramInt1, paramDouble)))
        {
          ax("sizeAndRate.support, " + paramInt1 + "x" + paramInt2 + "x" + paramDouble);
          AppMethodBeat.o(95232);
        }
        else
        {
          localObject = "sizeAndRate.rotated, " + paramInt1 + "x" + paramInt2 + "x" + paramDouble;
          new StringBuilder("AssumedSupport [").append((String)localObject).append("] [").append(this.name).append(", ").append(this.mimeType).append("] [").append(v.brM).append("]");
        }
      }
      else
      {
        bool = true;
        AppMethodBeat.o(95232);
      }
    }
  }

  public final void ax(String paramString)
  {
    AppMethodBeat.i(95233);
    new StringBuilder("NoSupport [").append(paramString).append("] [").append(this.name).append(", ").append(this.mimeType).append("] [").append(v.brM).append("]");
    AppMethodBeat.o(95233);
  }

  public final MediaCodecInfo.CodecProfileLevel[] rD()
  {
    if ((this.bdZ == null) || (this.bdZ.profileLevels == null));
    for (MediaCodecInfo.CodecProfileLevel[] arrayOfCodecProfileLevel = new MediaCodecInfo.CodecProfileLevel[0]; ; arrayOfCodecProfileLevel = this.bdZ.profileLevels)
      return arrayOfCodecProfileLevel;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.exoplayer2.e.a
 * JD-Core Version:    0.6.2
 */