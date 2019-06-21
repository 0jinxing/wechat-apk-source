package com.tencent.mm.plugin.story.ui.view.gallery;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.protocal.protobuf.cek;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoPreloadMgr$TaskInfo;", "", "positionV", "", "positionH", "item", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "quota", "connectionCount", "(IILcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;II)V", "cdnMediaId", "", "getCdnMediaId", "()Ljava/lang/String;", "setCdnMediaId", "(Ljava/lang/String;)V", "getConnectionCount", "()I", "setConnectionCount", "(I)V", "getItem", "()Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "getPositionH", "getPositionV", "getQuota", "setQuota", "info", "plugin-story_release"})
public final class n$c
{
  private int connectionCount;
  int ehE;
  String fUL;
  private final int sqr;
  private final int sqs;
  final i sqy;

  public n$c(int paramInt1, int paramInt2, i parami, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(110876);
    this.sqr = paramInt1;
    this.sqs = paramInt2;
    this.sqy = parami;
    this.ehE = paramInt3;
    this.connectionCount = paramInt4;
    parami = s.rTV;
    String str = s.be(this.sqy.fDG, this.sqy.rWj.Url);
    parami = str;
    if (str == null)
      parami = "";
    this.fUL = parami;
    AppMethodBeat.o(110876);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.n.c
 * JD-Core Version:    0.6.2
 */