package com.tencent.mm.plugin.brandservice.ui.timeline.preload;

import a.f.b.j;
import a.v;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.protocal.protobuf.bui;
import com.tencent.mm.protocal.protobuf.hz;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.as;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "errType", "errCode", "errMsg", "", "kotlin.jvm.PlatformType", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "<anonymous parameter 4>", "Lcom/tencent/mm/modelbase/NetSceneBase;", "callback"})
final class PreloadLogic$u
  implements w.a
{
  PreloadLogic$u(long paramLong1, long paramLong2, a.f.a.b paramb, ArrayList paramArrayList)
  {
  }

  public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
  {
    AppMethodBeat.i(14911);
    paramm = PreloadLogic.jSS;
    ab.i(PreloadLogic.aXu(), "callback, errType = %d, errCode = %d, errMsg = %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    paramString = new Bundle();
    Object localObject1;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      j.o(paramb, "rr");
      if ((paramb.acA() != null) && ((paramb.acA() instanceof hz)))
      {
        paramb = paramb.acA();
        if (paramb == null)
        {
          paramString = new v("null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BatchGetAppMsgResp");
          AppMethodBeat.o(14911);
          throw paramString;
        }
        paramb = (hz)paramb;
        paramString.putBoolean("success", true);
        paramString.putByteArray("response", paramb.toByteArray());
        paramm = paramb.vKy;
        j.o(paramm, "response.SceneControlList");
        if (!((Collection)paramm).isEmpty())
        {
          paramInt1 = 1;
          if (paramInt1 != 0)
          {
            paramm = l.aXy();
            localObject1 = new bui();
            ((bui)localObject1).vKy = paramb.vKy;
            paramm.encode("_msg_scene_strip", ((bui)localObject1).toByteArray());
          }
        }
      }
    }
    while (true)
    {
      paramString.putLong("start", this.jTt);
      long l = System.currentTimeMillis();
      paramString.putLong("end", l);
      paramb = PreloadLogic.jSS;
      ab.v(PreloadLogic.aXu(), "terry performance runCGI #" + this.jTu + ": " + this.jTt + ',' + l);
      this.exI.am(paramString);
      paramString.putBoolean("mount", true);
      paramb = this.jTv;
      j.o(paramb, "urls");
      paramb = ((Iterable)paramb).iterator();
      while (paramb.hasNext())
      {
        paramm = (String)paramb.next();
        j.o(paramm, "url");
        paramm = b.FJ(paramm);
        localObject1 = PreloadLogic.jSS;
        Object localObject2 = (ConcurrentLinkedDeque)PreloadLogic.aXq().get(paramm);
        localObject1 = PreloadLogic.jSS;
        PreloadLogic.aXq().remove(paramm);
        if (localObject2 != null)
        {
          localObject2 = ((Iterable)localObject2).iterator();
          while (((Iterator)localObject2).hasNext())
          {
            localObject1 = (a.f.a.b)((Iterator)localObject2).next();
            paramString.putString("id", paramm);
            ((a.f.a.b)localObject1).am(paramString);
          }
        }
      }
      paramInt1 = 0;
      break;
      paramString.putBoolean("success", false);
    }
    AppMethodBeat.o(14911);
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.preload.PreloadLogic.u
 * JD-Core Version:    0.6.2
 */