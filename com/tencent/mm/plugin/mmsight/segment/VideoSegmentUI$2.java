package com.tencent.mm.plugin.mmsight.segment;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.mmsight.segment.a.c;

final class VideoSegmentUI$2
  implements c.b
{
  VideoSegmentUI$2(VideoSegmentUI paramVideoSegmentUI)
  {
  }

  public final void U(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(55028);
    if (VideoSegmentUI.d(this.ozN) == null)
      AppMethodBeat.o(55028);
    while (true)
    {
      return;
      int i = VideoSegmentUI.e(this.ozN);
      VideoSegmentUI.d(this.ozN).setLoop((int)(i * paramFloat1), (int)(i * paramFloat2));
      VideoSegmentUI.d(this.ozN).seekTo((int)(i * paramFloat1));
      AppMethodBeat.o(55028);
    }
  }

  public final void V(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(55030);
    if (VideoSegmentUI.d(this.ozN) == null)
      AppMethodBeat.o(55030);
    while (true)
    {
      return;
      int i = (int)(VideoSegmentUI.e(this.ozN) * paramFloat1);
      int j = (int)(VideoSegmentUI.e(this.ozN) * paramFloat2);
      VideoSegmentUI.d(this.ozN).setLoop(i, j);
      VideoSegmentUI.d(this.ozN).seekTo(i);
      AppMethodBeat.o(55030);
    }
  }

  public final void W(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(55031);
    if ((paramFloat2 - paramFloat1) * VideoSegmentUI.e(this.ozN) <= VideoSegmentUI.p(this.ozN))
    {
      this.ozN.enableOptionMenu(true);
      AppMethodBeat.o(55031);
    }
    while (true)
    {
      return;
      this.ozN.enableOptionMenu(false);
      AppMethodBeat.o(55031);
    }
  }

  public final void bQc()
  {
    AppMethodBeat.i(55029);
    if (VideoSegmentUI.d(this.ozN) == null)
      AppMethodBeat.o(55029);
    while (true)
    {
      return;
      VideoSegmentUI.d(this.ozN).pause();
      AppMethodBeat.o(55029);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.segment.VideoSegmentUI.2
 * JD-Core Version:    0.6.2
 */