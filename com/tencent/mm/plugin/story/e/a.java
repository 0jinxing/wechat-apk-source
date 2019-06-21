package com.tencent.mm.plugin.story.e;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.audio.AudioCacheInfo;
import java.io.Serializable;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/data/StoryCaptureInfo;", "Ljava/io/Serializable;", "()V", "audioInfo", "Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "getAudioInfo", "()Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;", "setAudioInfo", "(Lcom/tencent/mm/plugin/story/model/audio/AudioCacheInfo;)V", "audioMixType", "", "getAudioMixType", "()I", "setAudioMixType", "(I)V", "isCaptureVideo", "", "()Z", "setCaptureVideo", "(Z)V", "recordThumb", "", "getRecordThumb", "()Ljava/lang/String;", "setRecordThumb", "(Ljava/lang/String;)V", "recordVideo", "getRecordVideo", "setRecordVideo", "remuxEnd", "", "getRemuxEnd", "()J", "setRemuxEnd", "(J)V", "remuxStart", "getRemuxStart", "setRemuxStart", "videoRotate", "getVideoRotate", "setVideoRotate", "reset", "", "plugin-story_release"})
public final class a
  implements Serializable
{
  public int eXL;
  public String fbT = "";
  public String fbU = "";
  public boolean fbV;
  public long rRG;
  public long rRH;
  public int rRI;
  public AudioCacheInfo rRJ;

  public final void aad(String paramString)
  {
    AppMethodBeat.i(108986);
    j.p(paramString, "<set-?>");
    this.fbT = paramString;
    AppMethodBeat.o(108986);
  }

  public final void aae(String paramString)
  {
    AppMethodBeat.i(108987);
    j.p(paramString, "<set-?>");
    this.fbU = paramString;
    AppMethodBeat.o(108987);
  }

  public final void reset()
  {
    this.rRI = 0;
    this.rRJ = null;
    this.fbT = "";
    this.fbU = "";
    this.rRG = 0L;
    this.rRH = 0L;
    this.eXL = 0;
    this.fbV = false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.e.a
 * JD-Core Version:    0.6.2
 */