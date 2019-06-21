package com.tencent.mm.plugin.story.model.audio;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.jb;
import com.tencent.mm.protocal.protobuf.jc;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/model/audio/CgiSearchMusic;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/BgmSearchResp;", "searchRequestId", "", "query", "", "offset", "", "relatedRecId", "audioCount", "(JLjava/lang/String;IJI)V", "plugin-story_release"})
public final class e extends com.tencent.mm.ai.a<jc>
{
  private e(long paramLong1, String paramString, int paramInt, long paramLong2)
  {
    AppMethodBeat.i(109193);
    jb localjb = new jb();
    jc localjc = new jc();
    localjc.setBaseResponse(new BaseResponse());
    localjc.getBaseResponse().ErrMsg = new bts();
    j.o(g.RN(), "MMKernel.account()");
    localjb.vKU = com.tencent.mm.kernel.a.QF();
    localjb.vKV = paramLong1;
    localjb.query = paramString;
    localjb.offset = paramInt;
    localjb.vKW = 10;
    localjb.vKX = paramLong2;
    paramString = new b.a();
    paramString.a((com.tencent.mm.bt.a)localjb);
    paramString.b((com.tencent.mm.bt.a)localjc);
    paramString.qq("/cgi-bin/micromsg-bin/sprbgmsearch");
    paramString.kU(3645);
    a(paramString.acD());
    AppMethodBeat.o(109193);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.model.audio.e
 * JD-Core Version:    0.6.2
 */