package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.b;
import com.tencent.mm.protocal.protobuf.dx;
import com.tencent.mm.protocal.protobuf.dy;
import com.tencent.mm.protocal.protobuf.ea;
import com.tencent.mm.protocal.protobuf.to;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.s;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/MPDataReportHelper;", "", "()V", "TAG", "", "commentExposureMap", "Ljava/util/HashMap;", "Lcom/tencent/mm/protocal/protobuf/CommentExposure;", "Lkotlin/collections/HashMap;", "getCommentExposureMap", "()Ljava/util/HashMap;", "setCommentExposureMap", "(Ljava/util/HashMap;)V", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "enterTimeInMs", "", "getEnterTimeInMs", "()J", "setEnterTimeInMs", "(J)V", "addCommReportItem", "", "key", "value", "items", "Ljava/util/LinkedList;", "Lcom/tencent/mm/protocal/protobuf/AppMsgCommReportItem;", "init", "logReportData", "kv", "", "onCommentExposure", "comment", "Lcom/tencent/mm/protocal/protobuf/BizComment;", "onDestroy", "report10380", "actionType", "sharePageType", "report10945", "plugin-brandservice_release"})
public final class e
{
  private final String TAG;
  public b jWx;
  public HashMap<String, to> jYB;
  public long jYC;

  public e()
  {
    AppMethodBeat.i(15329);
    this.TAG = "MicroMsg.MPDataReportHelper";
    this.jYB = new HashMap();
    this.jYC = System.currentTimeMillis();
    AppMethodBeat.o(15329);
  }

  public static void a(String paramString1, String paramString2, LinkedList<ea> paramLinkedList)
  {
    AppMethodBeat.i(15328);
    ea localea = new ea();
    localea.key = paramString1;
    localea.fns = paramString2;
    paramLinkedList.add(localea);
    AppMethodBeat.o(15328);
  }

  public final void b(int paramInt, LinkedList<ea> paramLinkedList)
  {
    AppMethodBeat.i(15327);
    if ((ab.getLogLevel() <= 0) && (!bo.ek((List)paramLinkedList)))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        ea localea = (ea)paramLinkedList.next();
        localStringBuilder.append(localea.key).append(":").append(localea.fns).append("  ");
      }
      ab.v(this.TAG, paramInt + ", " + localStringBuilder);
    }
    AppMethodBeat.o(15327);
  }

  public final void sF(int paramInt)
  {
    AppMethodBeat.i(15326);
    Object localObject1 = new dy();
    dx localdx = new dx();
    localdx.type = 2;
    Object localObject2 = this.jWx;
    if (localObject2 == null)
      j.avw("controller");
    String str = ((b)localObject2).fgd;
    localObject2 = localdx.vCQ;
    j.o(localObject2, "reportData.item");
    a("Vid", str, (LinkedList)localObject2);
    str = at.gB(ah.getContext());
    localObject2 = localdx.vCQ;
    j.o(localObject2, "reportData.item");
    a("Network", str, (LinkedList)localObject2);
    localObject2 = localdx.vCQ;
    j.o(localObject2, "reportData.item");
    a("SharePageType", "2", (LinkedList)localObject2);
    localObject2 = this.jWx;
    if (localObject2 == null)
      j.avw("controller");
    str = ((b)localObject2).url;
    localObject2 = localdx.vCQ;
    j.o(localObject2, "reportData.item");
    a("ContentUrl", str, (LinkedList)localObject2);
    str = s.getSessionId();
    localObject2 = localdx.vCQ;
    j.o(localObject2, "reportData.item");
    a("SessionId", str, (LinkedList)localObject2);
    localObject2 = this.jWx;
    if (localObject2 == null)
      j.avw("controller");
    int i = ((b)localObject2).jVF;
    localObject2 = localdx.vCQ;
    j.o(localObject2, "reportData.item");
    a("EnterId", String.valueOf(i), (LinkedList)localObject2);
    localObject2 = localdx.vCQ;
    j.o(localObject2, "reportData.item");
    a("NativePage", "1", (LinkedList)localObject2);
    localObject2 = this.jWx;
    if (localObject2 == null)
      j.avw("controller");
    str = ((b)localObject2).url;
    localObject2 = localdx.vCQ;
    j.o(localObject2, "reportData.item");
    a("#AppMsgUrl#", str, (LinkedList)localObject2);
    localObject2 = localdx.vCQ;
    j.o(localObject2, "reportData.item");
    a("ActionType", String.valueOf(paramInt), (LinkedList)localObject2);
    ((dy)localObject1).vFM.add(localdx);
    localObject2 = this.jWx;
    if (localObject2 == null)
      j.avw("controller");
    ((b)localObject2).a((dy)localObject1);
    localObject1 = localdx.vCQ;
    j.o(localObject1, "reportData.item");
    b(10380, (LinkedList)localObject1);
    AppMethodBeat.o(15326);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.e
 * JD-Core Version:    0.6.2
 */