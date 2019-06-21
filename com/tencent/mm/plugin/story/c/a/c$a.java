package com.tencent.mm.plugin.story.c.a;

import a.f.b.j;
import a.l;
import android.media.MediaMetadataRetriever;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.plugin.sight.base.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryEncodeElementConfig$EncodeConfig;", "", "targetWidth", "", "targetHeight", "videoBitrate", "audioBitrate", "frameRate", "videoRotate", "duration", "iFrame", "profileIndex", "presetIndex", "isDefault", "", "thumbSize", "audioSampleRate", "recorderType", "exceedVideoBitrateTolerance", "", "(IIIIIIIIIIZIIIF)V", "getAudioBitrate", "()I", "setAudioBitrate", "(I)V", "getAudioSampleRate", "setAudioSampleRate", "getDuration", "setDuration", "getExceedVideoBitrateTolerance", "()F", "setExceedVideoBitrateTolerance", "(F)V", "getFrameRate", "setFrameRate", "getIFrame", "setIFrame", "()Z", "setDefault", "(Z)V", "getPresetIndex", "setPresetIndex", "getProfileIndex", "setProfileIndex", "getRecorderType", "setRecorderType", "getTargetHeight", "setTargetHeight", "getTargetWidth", "setTargetWidth", "getThumbSize", "setThumbSize", "getVideoBitrate", "setVideoBitrate", "videoParam", "Lcom/tencent/mm/modelcontrol/VideoTransPara;", "getVideoParam", "()Lcom/tencent/mm/modelcontrol/VideoTransPara;", "setVideoParam", "(Lcom/tencent/mm/modelcontrol/VideoTransPara;)V", "getVideoRotate", "setVideoRotate", "checkExceedConfigBitrate", "path", "", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "videoConfigForLocalFile", "", "Companion", "plugin-story_release"})
public final class c$a
{
  public static final a rRn;
  public int audioSampleRate;
  public int duration;
  public int eTi;
  public int eTj;
  public int eTk;
  public int eXL;
  public int etz;
  int fAf;
  public int fzS;
  int fzT;
  int fzU;
  int fzV;
  boolean isDefault;
  public VideoTransPara rRl;
  float rRm;
  public int videoBitrate;

  static
  {
    AppMethodBeat.i(108960);
    rRn = new a((byte)0);
    AppMethodBeat.o(108960);
  }

  private c$a()
  {
    AppMethodBeat.i(108959);
    this.eTi = 0;
    this.eTj = 0;
    this.videoBitrate = 0;
    this.fzS = 0;
    this.eTk = 0;
    this.eXL = 0;
    this.duration = 0;
    this.fzT = 0;
    this.fzU = 0;
    this.fzV = 0;
    this.isDefault = false;
    this.fAf = 0;
    this.audioSampleRate = 0;
    this.etz = 2;
    this.rRm = 1.3F;
    this.rRl = new VideoTransPara();
    AppMethodBeat.o(108959);
  }

  public final void aaa(String paramString)
  {
    AppMethodBeat.i(108957);
    j.p(paramString, "path");
    ab.i("MicroMsg.IEncodeConfig", "videoConfigForLocalFile: ".concat(String.valueOf(paramString)));
    Object localObject = com.tencent.mm.plugin.sight.base.d.WR(paramString);
    int i;
    int j;
    int k;
    int m;
    if (localObject != null)
    {
      i = ((a)localObject).width;
      j = ((a)localObject).height;
      k = ((a)localObject).videoBitrate;
      m = ((a)localObject).eTk;
    }
    while (true)
    {
      int n;
      int i1;
      int i2;
      if (j > 0)
      {
        n = j;
        i1 = i;
        i2 = k;
        if (i > 0);
      }
      else
      {
        n = j;
        i1 = i;
        i2 = k;
      }
      try
      {
        localObject = new android/media/MediaMetadataRetriever;
        n = j;
        i1 = i;
        i2 = k;
        ((MediaMetadataRetriever)localObject).<init>();
        n = j;
        i1 = i;
        i2 = k;
        ((MediaMetadataRetriever)localObject).setDataSource(paramString);
        n = j;
        i1 = i;
        i2 = k;
        i = bo.getInt(((MediaMetadataRetriever)localObject).extractMetadata(18), 0);
        n = j;
        i1 = i;
        i2 = k;
        j = bo.getInt(((MediaMetadataRetriever)localObject).extractMetadata(19), 0);
        n = j;
        i1 = i;
        i2 = k;
        k = bo.getInt(((MediaMetadataRetriever)localObject).extractMetadata(20), 0);
        n = j;
        i1 = i;
        i2 = k;
        ((MediaMetadataRetriever)localObject).release();
        i2 = k;
        i1 = i;
        n = j;
        label217: i = m;
        if (m <= 0)
        {
          localObject = c.rRk;
          i = c.ZZ(paramString);
        }
        m = SightVideoJNI.getMp4Rotate(paramString);
        ab.i("MicroMsg.IEncodeConfig", "videoWidth: " + i1 + " , videoHeight :" + n + "  , videoBitrate:" + i2 + " ,videoFrameRate:" + i + " , videoRotate : " + m);
        if (i2 < this.videoBitrate)
          this.videoBitrate = i2;
        if ((m == 90) || (m == 270))
        {
          j = n;
          k = i1;
          if (n > this.eTi)
          {
            j = n;
            k = i1;
            if (n - this.eTi > 16)
            {
              k = (int)(this.eTi / n * i1);
              j = this.eTi;
            }
          }
        }
        while (true)
        {
          n = j;
          if (j % 16 != 0)
            n = com.tencent.mm.plugin.mmsight.d.yN(j);
          j = k;
          if (k % 16 != 0)
            j = com.tencent.mm.plugin.mmsight.d.yN(k);
          if (this.eTk > i)
            this.eTk = i;
          this.eTj = n;
          this.eTi = j;
          this.eXL = m;
          AppMethodBeat.o(108957);
          return;
          j = n;
          k = i1;
          if (i1 > this.eTi)
          {
            j = n;
            k = i1;
            if (i1 - this.eTi > 16)
            {
              float f = this.eTi / i1;
              j = (int)(n * f);
              k = this.eTi;
            }
          }
        }
      }
      catch (Exception localException)
      {
        break label217;
      }
      m = 0;
      k = 0;
      j = 0;
      i = 0;
    }
  }

  public final boolean aab(String paramString)
  {
    AppMethodBeat.i(108958);
    j.p(paramString, "path");
    Object localObject = com.tencent.mm.plugin.sight.base.d.WR(paramString);
    if (localObject != null);
    for (int i = ((a)localObject).videoBitrate; ; i = 0)
    {
      int j = i;
      if (i <= 0)
        j = i;
      try
      {
        localObject = new android/media/MediaMetadataRetriever;
        j = i;
        ((MediaMetadataRetriever)localObject).<init>();
        j = i;
        ((MediaMetadataRetriever)localObject).setDataSource(paramString);
        j = i;
        i = bo.getInt(((MediaMetadataRetriever)localObject).extractMetadata(20), 0);
        j = i;
        ((MediaMetadataRetriever)localObject).release();
        j = i;
        label79: ab.i("MicroMsg.IEncodeConfig", "checkExceedConfigBitrate, path:" + paramString + ", bitrate:" + j + ", videoBitrate:" + this.videoBitrate + ", exceedVideoBitrateTolerance:" + this.rRm);
        boolean bool;
        if (j > this.videoBitrate * this.rRm)
        {
          bool = true;
          AppMethodBeat.o(108958);
        }
        while (true)
        {
          return bool;
          AppMethodBeat.o(108958);
          bool = false;
        }
      }
      catch (Exception localException)
      {
        break label79;
      }
    }
  }

  public final boolean equals(Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(108963);
    int i;
    if (this != paramObject)
    {
      if (!(paramObject instanceof a))
        break label357;
      paramObject = (a)paramObject;
      if (this.eTi == paramObject.eTi)
      {
        i = 1;
        if (i == 0)
          break label357;
        if (this.eTj != paramObject.eTj)
          break label292;
        i = 1;
        label55: if (i == 0)
          break label357;
        if (this.videoBitrate != paramObject.videoBitrate)
          break label297;
        i = 1;
        label72: if (i == 0)
          break label357;
        if (this.fzS != paramObject.fzS)
          break label302;
        i = 1;
        label89: if (i == 0)
          break label357;
        if (this.eTk != paramObject.eTk)
          break label307;
        i = 1;
        label106: if (i == 0)
          break label357;
        if (this.eXL != paramObject.eXL)
          break label312;
        i = 1;
        label123: if (i == 0)
          break label357;
        if (this.duration != paramObject.duration)
          break label317;
        i = 1;
        label140: if (i == 0)
          break label357;
        if (this.fzT != paramObject.fzT)
          break label322;
        i = 1;
        label157: if (i == 0)
          break label357;
        if (this.fzU != paramObject.fzU)
          break label327;
        i = 1;
        label174: if (i == 0)
          break label357;
        if (this.fzV != paramObject.fzV)
          break label332;
        i = 1;
        label191: if (i == 0)
          break label357;
        if (this.isDefault != paramObject.isDefault)
          break label337;
        i = 1;
        label208: if (i == 0)
          break label357;
        if (this.fAf != paramObject.fAf)
          break label342;
        i = 1;
        label225: if (i == 0)
          break label357;
        if (this.audioSampleRate != paramObject.audioSampleRate)
          break label347;
        i = 1;
        label242: if (i == 0)
          break label357;
        if (this.etz != paramObject.etz)
          break label352;
        i = 1;
        label259: if ((i == 0) || (Float.compare(this.rRm, paramObject.rRm) != 0))
          break label357;
      }
    }
    else
    {
      AppMethodBeat.o(108963);
      bool = true;
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label292: i = 0;
      break label55;
      label297: i = 0;
      break label72;
      label302: i = 0;
      break label89;
      label307: i = 0;
      break label106;
      label312: i = 0;
      break label123;
      label317: i = 0;
      break label140;
      label322: i = 0;
      break label157;
      label327: i = 0;
      break label174;
      label332: i = 0;
      break label191;
      label337: i = 0;
      break label208;
      label342: i = 0;
      break label225;
      label347: i = 0;
      break label242;
      label352: i = 0;
      break label259;
      label357: AppMethodBeat.o(108963);
    }
  }

  public final int hashCode()
  {
    AppMethodBeat.i(108962);
    int i = this.eTi;
    int j = this.eTj;
    int k = this.videoBitrate;
    int m = this.fzS;
    int n = this.eTk;
    int i1 = this.eXL;
    int i2 = this.duration;
    int i3 = this.fzT;
    int i4 = this.fzU;
    int i5 = this.fzV;
    int i6 = this.isDefault;
    int i8 = i6;
    if (i6 != 0)
      i8 = 1;
    int i7 = this.fAf;
    int i9 = this.audioSampleRate;
    int i10 = this.etz;
    int i11 = Float.floatToIntBits(this.rRm);
    AppMethodBeat.o(108962);
    return ((((i8 + (((((((((i * 31 + j) * 31 + k) * 31 + m) * 31 + n) * 31 + i1) * 31 + i2) * 31 + i3) * 31 + i4) * 31 + i5) * 31) * 31 + i7) * 31 + i9) * 31 + i10) * 31 + i11;
  }

  public final String toString()
  {
    AppMethodBeat.i(108961);
    String str = "EncodeConfig(targetWidth=" + this.eTi + ", targetHeight=" + this.eTj + ", videoBitrate=" + this.videoBitrate + ", audioBitrate=" + this.fzS + ", frameRate=" + this.eTk + ", videoRotate=" + this.eXL + ", duration=" + this.duration + ", iFrame=" + this.fzT + ", profileIndex=" + this.fzU + ", presetIndex=" + this.fzV + ", isDefault=" + this.isDefault + ", thumbSize=" + this.fAf + ", audioSampleRate=" + this.audioSampleRate + ", recorderType=" + this.etz + ", exceedVideoBitrateTolerance=" + this.rRm + ")";
    AppMethodBeat.o(108961);
    return str;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/config/moduleconfig/StoryEncodeElementConfig$EncodeConfig$Companion;", "", "()V", "TAG", "", "plugin-story_release"})
  public static final class a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.c.a.c.a
 * JD-Core Version:    0.6.2
 */