package com.tencent.mm.plugin.story.model.audio;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.b.a.bd;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.bqk;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/audio/AudioReporter;", "", "()V", "currMusicId", "", "getCurrMusicId", "()I", "setCurrMusicId", "(I)V", "currStartTime", "", "getCurrStartTime", "()J", "setCurrStartTime", "(J)V", "feedbackList", "Ljava/util/ArrayList;", "Lcom/tencent/mm/protocal/protobuf/RecommendedMusicFeedback;", "Lkotlin/collections/ArrayList;", "getFeedbackList", "()Ljava/util/ArrayList;", "pause", "", "getPause", "()Z", "setPause", "(Z)V", "requestId", "getRequestId", "setRequestId", "source", "getSource", "setSource", "withBgm", "getWithBgm", "setWithBgm", "recordCancel", "", "recordEnterSearch", "recordNoBgm", "recordPause", "recordPlay", "musicId", "recordSend", "reportKv", "sendResult", "Companion", "plugin-story_release"})
public final class b
{
  public static final String TAG = "MicroMsg.AudioReporter";
  private static b rUt;
  public static long rUu;
  public static long rUv;
  private static bd rUw;
  public static final b.a rUx;
  public boolean cHY;
  public int cvd;
  public long pvG;
  public int rUp;
  public long rUq;
  public boolean rUr;
  public final ArrayList<bqk> rUs;

  static
  {
    AppMethodBeat.i(109190);
    rUx = new b.a((byte)0);
    TAG = "MicroMsg.AudioReporter";
    rUw = new bd();
    AppMethodBeat.o(109190);
  }

  public b()
  {
    AppMethodBeat.i(109189);
    AudioCacheInfo.a locala = AudioCacheInfo.rUj;
    this.cvd = AudioCacheInfo.cyO();
    this.cHY = true;
    this.rUs = new ArrayList();
    AppMethodBeat.o(109189);
  }

  public final void cyQ()
  {
    AppMethodBeat.i(109187);
    bqk localbqk;
    long l;
    if (!this.cHY)
    {
      localbqk = new bqk();
      l = System.currentTimeMillis();
      localbqk.wSJ = this.rUp;
      i = this.cvd;
      AudioCacheInfo.a locala = AudioCacheInfo.rUj;
      if (i != AudioCacheInfo.cyO())
        break label129;
    }
    label129: for (int i = 1; ; i = 9)
    {
      localbqk.wSK = i;
      localbqk.wSL = ((int)(l - this.rUq));
      localbqk.wSM = ((int)(this.rUq / 1000L));
      this.rUs.add(localbqk);
      this.cHY = true;
      ab.i(TAG, "record pause " + c.a(localbqk));
      AppMethodBeat.o(109187);
      return;
    }
  }

  public final void cyR()
  {
    AppMethodBeat.i(109188);
    com.tencent.mm.kernel.b localb = g.RO();
    j.o(localb, "network()");
    localb.Rg().d((m)new com.tencent.mm.plugin.story.model.a.b(this.pvG, (List)this.rUs));
    rUt = null;
    AppMethodBeat.o(109188);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.b
 * JD-Core Version:    0.6.2
 */