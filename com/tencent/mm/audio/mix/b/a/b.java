package com.tencent.mm.audio.mix.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.audio.mix.b.d;
import com.tencent.mm.audio.mix.h.a;
import java.util.ArrayList;

public final class b
  implements f
{
  private String appId;

  public b(String paramString)
  {
    this.appId = paramString;
  }

  public final void Dp()
  {
    AppMethodBeat.i(137002);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmDataTrackCleanTask", "runTask, appId:%s", new Object[] { this.appId });
    d.Dm().clearCache();
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmDataTrackCleanTask", "delete all pcm cache File");
    ArrayList localArrayList = d.Dm().Do();
    if (localArrayList.size() > 0)
      a.b(this.appId, localArrayList);
    AppMethodBeat.o(137002);
  }

  public final void end()
  {
    AppMethodBeat.i(137003);
    com.tencent.mm.audio.mix.h.b.i("MicroMsg.Mix.AudioPcmDataTrackCleanTask", "end task");
    AppMethodBeat.o(137003);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.mix.b.a.b
 * JD-Core Version:    0.6.2
 */