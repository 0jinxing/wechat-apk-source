package com.tencent.mm.plugin.story.model.audio;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.bt.b;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.anm;
import com.tencent.mm.protocal.protobuf.ann;
import com.tencent.mm.protocal.protobuf.bts;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/audio/CgiGetRecommendMusic;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/GetRecommendedMusicResponse;", "imageData", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protobuf/ByteString;", "latitude", "", "longitude", "requestId", "", "audioCount", "", "(Ljava/util/LinkedList;FFJI)V", "plugin-story_release"})
public final class d extends com.tencent.mm.ai.a<ann>
{
  private d(LinkedList<b> paramLinkedList, float paramFloat1, float paramFloat2, long paramLong)
  {
    AppMethodBeat.i(109192);
    anm localanm = new anm();
    ann localann = new ann();
    localann.setBaseResponse(new BaseResponse());
    localann.getBaseResponse().ErrMsg = new bts();
    localanm.wso = paramLinkedList;
    localanm.wsn = 10;
    localanm.cEB = paramFloat1;
    localanm.cGm = paramFloat2;
    localanm.rUb = paramLong;
    paramLinkedList = new b.a();
    paramLinkedList.a((com.tencent.mm.bt.a)localanm);
    paramLinkedList.b((com.tencent.mm.bt.a)localann);
    paramLinkedList.qq("/cgi-bin/micromsg-bin/getrecommendedmusiclist");
    paramLinkedList.kU(341);
    a(paramLinkedList.acD());
    AppMethodBeat.o(109192);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.d
 * JD-Core Version:    0.6.2
 */