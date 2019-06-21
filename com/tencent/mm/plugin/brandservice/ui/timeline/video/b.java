package com.tencent.mm.plugin.brandservice.ui.timeline.video;

import a.f.b.j;
import a.v;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.r;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.w;
import com.tencent.mm.ai.w.a;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.d;
import com.tencent.mm.plugin.brandservice.ui.timeline.video.a.e;
import com.tencent.mm.protocal.protobuf.bac;
import com.tencent.mm.protocal.protobuf.dx;
import com.tencent.mm.protocal.protobuf.dy;
import com.tencent.mm.protocal.protobuf.dz;
import com.tencent.mm.protocal.protobuf.eb;
import com.tencent.mm.protocal.protobuf.ec;
import com.tencent.mm.protocal.protobuf.ed;
import com.tencent.mm.protocal.protobuf.ee;
import com.tencent.mm.protocal.protobuf.ej;
import com.tencent.mm.protocal.protobuf.ek;
import com.tencent.mm.protocal.protobuf.el;
import com.tencent.mm.protocal.protobuf.em;
import com.tencent.mm.protocal.protobuf.en;
import com.tencent.mm.protocal.protobuf.eo;
import com.tencent.mm.protocal.protobuf.ep;
import com.tencent.mm.protocal.protobuf.eq;
import com.tencent.mm.protocal.protobuf.to;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.storage.s;
import com.tencent.mm.ui.base.h;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map.Entry;
import java.util.Set;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "", "()V", "TAG", "", "commentOffset", "", "getCommentOffset", "()I", "setCommentOffset", "(I)V", "copyUrl", "getCopyUrl", "()Ljava/lang/String;", "setCopyUrl", "(Ljava/lang/String;)V", "enterId", "getEnterId", "setEnterId", "funcFlag", "getFuncFlag", "setFuncFlag", "idx", "getIdx", "setIdx", "isDoingGetFansComment", "", "isDoingGetMyComment", "itemShowType", "getItemShowType", "setItemShowType", "kV17149", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/KV17149;", "getKV17149", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/KV17149;", "setKV17149", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/KV17149;)V", "mProgressDialog", "Lcom/tencent/mm/ui/base/MMProgressDialog;", "maliciousTitleInfo", "Lcom/tencent/mm/protocal/protobuf/MaliciousTitleInfo;", "getMaliciousTitleInfo", "()Lcom/tencent/mm/protocal/protobuf/MaliciousTitleInfo;", "setMaliciousTitleInfo", "(Lcom/tencent/mm/protocal/protobuf/MaliciousTitleInfo;)V", "mid", "", "getMid", "()J", "setMid", "(J)V", "msgInfo", "Lcom/tencent/mm/message/MPMsgInfo;", "getMsgInfo", "()Lcom/tencent/mm/message/MPMsgInfo;", "setMsgInfo", "(Lcom/tencent/mm/message/MPMsgInfo;)V", "myCommentOffset", "getMyCommentOffset", "setMyCommentOffset", "prompted", "getPrompted", "setPrompted", "readerItem", "Lcom/tencent/mm/message/BizReaderItem;", "getReaderItem", "()Lcom/tencent/mm/message/BizReaderItem;", "setReaderItem", "(Lcom/tencent/mm/message/BizReaderItem;)V", "report", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/MPDataReportHelper;", "getReport", "()Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/MPDataReportHelper;", "setReport", "(Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/MPDataReportHelper;)V", "scene", "getScene", "setScene", "srcDisPlayName", "getSrcDisPlayName", "setSrcDisPlayName", "srcUserName", "getSrcUserName", "setSrcUserName", "subScene", "getSubScene", "setSubScene", "ui", "Ljava/lang/ref/WeakReference;", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoDetailUI;", "getUi$plugin_brandservice_release", "()Ljava/lang/ref/WeakReference;", "setUi$plugin_brandservice_release", "(Ljava/lang/ref/WeakReference;)V", "url", "getUrl", "setUrl", "vid", "getVid", "setVid", "appMsgGet", "", "context", "disMissProgressDlg", "doAppMsgCommDataReport", "req", "Lcom/tencent/mm/protocal/protobuf/AppMsgCommDataReportReq;", "doAppMsgLike", "actionType", "comment", "doAppMsgLikeComment", "Lcom/tencent/mm/protocal/protobuf/AppMsgLikeCommentReq;", "doAppMsgOperateComment", "Lcom/tencent/mm/protocal/protobuf/AppMsgOperateCommentReq;", "doCommentExposure", "Lcom/tencent/mm/protocal/protobuf/AppMsgCommentExposureReq;", "geAppMsgtExtData", "getAppMsgCommentList", "getKv17149", "getTalker", "init", "isFinished", "isMaliciousTitle", "onDestroy", "setMsgFuncFlag", "flag", "setShareUrl", "showProgressDlg", "wording", "plugin-brandservice_release"})
public final class b
{
  final String TAG;
  String cwG;
  private com.tencent.mm.ui.base.p ejZ;
  public int ffZ;
  public int fgc;
  public String fgd;
  public WeakReference<BizVideoDetailUI> hiC;
  public int jSW;
  int jVA;
  public String jVB;
  public e jVC;
  public long jVD;
  public int jVE;
  public int jVF;
  public r jVG;
  public com.tencent.mm.af.p jVH;
  public bac jVI;
  public d jVJ;
  boolean jVK;
  boolean jVL;
  int jVx;
  int jVy;
  String jVz;
  public int scene;
  public String url;

  public b()
  {
    AppMethodBeat.i(15140);
    this.TAG = "MicroMsg.BizVideoController";
    this.cwG = "";
    this.jVz = "";
    this.fgd = "";
    this.jVB = "";
    this.jVC = new e();
    this.jVF = ((int)(System.currentTimeMillis() / 1000L));
    this.url = "";
    this.jVJ = new d();
    AppMethodBeat.o(15140);
  }

  private void Ge(String paramString)
  {
    AppMethodBeat.i(15135);
    if (isFinished())
      AppMethodBeat.o(15135);
    while (true)
    {
      return;
      aYn();
      Object localObject;
      if (this.ejZ != null)
      {
        localObject = this.ejZ;
        if (localObject == null)
          j.dWJ();
        if (!((com.tencent.mm.ui.base.p)localObject).isShowing())
        {
          paramString = this.ejZ;
          if (paramString != null)
          {
            paramString.show();
            AppMethodBeat.o(15135);
            continue;
          }
          AppMethodBeat.o(15135);
        }
      }
      else
      {
        localObject = this.hiC;
        if (localObject == null)
          j.avw("ui");
        this.ejZ = h.b((Context)((WeakReference)localObject).get(), paramString, true, (DialogInterface.OnCancelListener)new b.i(this));
        AppMethodBeat.o(15135);
      }
    }
  }

  private BizVideoDetailUI aYo()
  {
    AppMethodBeat.i(15138);
    Object localObject = this.hiC;
    if (localObject == null)
      j.avw("ui");
    if (((WeakReference)localObject).get() == null)
    {
      localObject = null;
      AppMethodBeat.o(15138);
    }
    while (true)
    {
      return localObject;
      localObject = this.hiC;
      if (localObject == null)
        j.avw("ui");
      localObject = ((WeakReference)localObject).get();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI");
        AppMethodBeat.o(15138);
        throw ((Throwable)localObject);
      }
      localObject = (BizVideoDetailUI)localObject;
      AppMethodBeat.o(15138);
    }
  }

  private boolean isFinished()
  {
    AppMethodBeat.i(15139);
    Object localObject = this.hiC;
    if (localObject == null)
      j.avw("ui");
    boolean bool;
    if (((WeakReference)localObject).get() != null)
    {
      localObject = this.hiC;
      if (localObject == null)
        j.avw("ui");
      localObject = ((WeakReference)localObject).get();
      if (localObject == null)
      {
        localObject = new v("null cannot be cast to non-null type com.tencent.mm.plugin.brandservice.ui.timeline.video.BizVideoDetailUI");
        AppMethodBeat.o(15139);
        throw ((Throwable)localObject);
      }
      if (!((BizVideoDetailUI)localObject).isFinishing());
    }
    else
    {
      bool = true;
      AppMethodBeat.o(15139);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(15139);
    }
  }

  public final void Gd(String paramString)
  {
    if (paramString != null)
      this.url = paramString;
  }

  public final String HE()
  {
    AppMethodBeat.i(15137);
    Object localObject = this.jVG;
    if (localObject == null)
      j.avw("msgInfo");
    localObject = ((r)localObject).HE();
    AppMethodBeat.o(15137);
    return localObject;
  }

  public final void a(dy paramdy)
  {
    AppMethodBeat.i(15133);
    j.p(paramdy, "req");
    com.tencent.mm.ai.b.a locala = new com.tencent.mm.ai.b.a();
    locala.a((a)paramdy);
    locala.b((a)new dz());
    locala.qq("/cgi-bin/mmbiz-bin/appmsg/appmsg_report");
    locala.kU(1870);
    locala.kV(0);
    locala.kW(0);
    w.a(locala.acD(), (w.a)new b.b(this));
    AppMethodBeat.o(15133);
  }

  public final void a(el paramel)
  {
    AppMethodBeat.i(15130);
    j.p(paramel, "req");
    paramel.scene = this.scene;
    paramel.vFQ = this.jSW;
    paramel.url = this.url;
    paramel.vFO = this.ffZ;
    paramel.session_id = s.getSessionId();
    paramel.vFP = this.jVF;
    com.tencent.mm.ai.b.a locala = new com.tencent.mm.ai.b.a();
    locala.a((a)paramel);
    locala.b((a)new em());
    locala.qq("/cgi-bin/mmbiz-bin/appmsg/appmsg_like_comment");
    locala.kU(2759);
    locala.kV(0);
    locala.kW(0);
    w.a(locala.acD(), (w.a)b.d.jVP);
    AppMethodBeat.o(15130);
  }

  public final void a(ep paramep)
  {
    AppMethodBeat.i(15132);
    j.p(paramep, "req");
    paramep.scene = this.scene;
    paramep.vFQ = this.jSW;
    paramep.url = this.url;
    Object localObject = this.jVH;
    if (localObject == null)
      j.avw("readerItem");
    paramep.title = ((com.tencent.mm.af.p)localObject).title;
    paramep.vGx = System.currentTimeMillis();
    paramep.vFO = this.ffZ;
    paramep.session_id = s.getSessionId();
    paramep.vFP = this.jVF;
    localObject = new com.tencent.mm.ai.b.a();
    ((com.tencent.mm.ai.b.a)localObject).a((a)paramep);
    ((com.tencent.mm.ai.b.a)localObject).b((a)new eq());
    ((com.tencent.mm.ai.b.a)localObject).qq("/cgi-bin/mmbiz-bin/appmsg/appmsg_operate_comment");
    ((com.tencent.mm.ai.b.a)localObject).kU(2617);
    ((com.tencent.mm.ai.b.a)localObject).kV(0);
    ((com.tencent.mm.ai.b.a)localObject).kW(0);
    w.a(((com.tencent.mm.ai.b.a)localObject).acD(), (w.a)b.e.jVQ);
    paramep = aYo();
    if (paramep != null);
    for (paramep = paramep.getString(2131297086); ; paramep = null)
    {
      Ge(paramep);
      AppMethodBeat.o(15132);
      return;
    }
  }

  public final com.tencent.mm.af.p aYl()
  {
    AppMethodBeat.i(15127);
    com.tencent.mm.af.p localp = this.jVH;
    if (localp == null)
      j.avw("readerItem");
    AppMethodBeat.o(15127);
    return localp;
  }

  public final void aYm()
  {
    AppMethodBeat.i(15128);
    ej localej = new ej();
    localej.url = this.url;
    localej.fgd = this.fgd;
    localej.scene = this.scene;
    localej.vFQ = this.jSW;
    localej.nettype = com.tencent.mm.af.l.Me();
    if (localej.nettype == 100)
      localej.nettype = 0;
    localej.session_id = s.getSessionId();
    localej.vFP = this.jVF;
    Object localObject = this.jVG;
    if (localObject == null)
      j.avw("msgInfo");
    if (r.ks(((r)localObject).fgc));
    for (localej.vGf = 1; ; localej.vGf = 0)
    {
      localObject = new com.tencent.mm.ai.b.a();
      ((com.tencent.mm.ai.b.a)localObject).a((a)localej);
      ((com.tencent.mm.ai.b.a)localObject).b((a)new ek());
      ((com.tencent.mm.ai.b.a)localObject).qq("/cgi-bin/mmbiz-bin/appmsg/appmsg_get");
      ((com.tencent.mm.ai.b.a)localObject).kU(1179);
      ((com.tencent.mm.ai.b.a)localObject).kV(0);
      ((com.tencent.mm.ai.b.a)localObject).kW(0);
      w.a(((com.tencent.mm.ai.b.a)localObject).acD(), (w.a)b.a.jVM);
      AppMethodBeat.o(15128);
      return;
    }
  }

  public final void aYn()
  {
    AppMethodBeat.i(15136);
    Object localObject;
    if (this.ejZ != null)
    {
      localObject = this.ejZ;
      if (localObject != null)
      {
        localObject = Boolean.valueOf(((com.tencent.mm.ui.base.p)localObject).isShowing());
        if (localObject == null)
          j.dWJ();
        if (!((Boolean)localObject).booleanValue())
          break label69;
        localObject = this.ejZ;
        if (localObject == null)
          break label69;
        ((com.tencent.mm.ui.base.p)localObject).dismiss();
        AppMethodBeat.o(15136);
      }
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label69: AppMethodBeat.o(15136);
    }
  }

  public final boolean aYp()
  {
    if ((this.fgc & 0x4) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void ao(int paramInt, String paramString)
  {
    AppMethodBeat.i(15131);
    en localen = new en();
    localen.url = this.url;
    localen.fBq = System.currentTimeMillis();
    localen.vGv = paramString;
    localen.scene = this.scene;
    localen.vFQ = this.jSW;
    localen.kdC = paramInt;
    localen.vFO = this.ffZ;
    localen.session_id = s.getSessionId();
    localen.vFP = this.jVF;
    paramString = new com.tencent.mm.ai.b.a();
    paramString.a((a)localen);
    paramString.b((a)new eo());
    paramString.qq("/cgi-bin/mmbiz-bin/appmsg/appmsg_like");
    paramString.kU(2691);
    paramString.kV(0);
    paramString.kW(0);
    w.a(paramString.acD(), (w.a)b.c.jVO);
    paramString = aYo();
    if (paramString != null);
    for (paramString = paramString.getString(2131305928); ; paramString = null)
    {
      Ge(paramString);
      AppMethodBeat.o(15131);
      return;
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(15134);
    aYn();
    e locale = this.jVC;
    if (locale.jYB.size() > 0)
    {
      localObject1 = new LinkedList();
      localObject2 = locale.jYB.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = ((Iterator)localObject2).next();
        j.o(localObject3, "it.next()");
        localObject3 = ((Map.Entry)localObject3).getValue();
        j.o(localObject3, "entry.value");
        ((LinkedList)localObject1).add((to)localObject3);
      }
      localObject2 = new eb();
      ((eb)localObject2).vFN = ((LinkedList)localObject1);
      localObject3 = locale.jWx;
      if (localObject3 == null)
        j.avw("controller");
      j.p(localObject2, "req");
      ((eb)localObject2).vFP = ((b)localObject3).jVF;
      ((eb)localObject2).session_id = s.getSessionId();
      ((eb)localObject2).vFO = ((b)localObject3).ffZ;
      ((eb)localObject2).url = ((b)localObject3).url;
      localObject1 = new com.tencent.mm.ai.b.a();
      ((com.tencent.mm.ai.b.a)localObject1).a((a)localObject2);
      ((com.tencent.mm.ai.b.a)localObject1).b((a)new ec());
      ((com.tencent.mm.ai.b.a)localObject1).qq("/cgi-bin/mmbiz-bin/appmsg/appmsg_comment_exposure");
      ((com.tencent.mm.ai.b.a)localObject1).kU(2827);
      ((com.tencent.mm.ai.b.a)localObject1).kV(0);
      ((com.tencent.mm.ai.b.a)localObject1).kW(0);
      w.a(((com.tencent.mm.ai.b.a)localObject1).acD(), (w.a)new b.f((b)localObject3));
    }
    Object localObject2 = new dy();
    Object localObject1 = new dx();
    ((dx)localObject1).type = 1;
    Object localObject3 = locale.jWx;
    if (localObject3 == null)
      j.avw("controller");
    int i = ((b)localObject3).scene;
    localObject3 = ((dx)localObject1).vCQ;
    j.o(localObject3, "reportData.item");
    e.a("scene", String.valueOf(i), (LinkedList)localObject3);
    localObject3 = at.gB(ah.getContext());
    Object localObject4 = ((dx)localObject1).vCQ;
    j.o(localObject4, "reportData.item");
    e.a("netType", (String)localObject3, (LinkedList)localObject4);
    long l = locale.jYC;
    localObject3 = ((dx)localObject1).vCQ;
    j.o(localObject3, "reportData.item");
    e.a("StartTimeMs", String.valueOf(l), (LinkedList)localObject3);
    l = System.currentTimeMillis();
    localObject3 = ((dx)localObject1).vCQ;
    j.o(localObject3, "reportData.item");
    e.a("EndTimeMs", String.valueOf(l), (LinkedList)localObject3);
    localObject3 = locale.jWx;
    if (localObject3 == null)
      j.avw("controller");
    i = ((b)localObject3).ffZ;
    localObject3 = ((dx)localObject1).vCQ;
    j.o(localObject3, "reportData.item");
    e.a("ItemShowType", String.valueOf(i), (LinkedList)localObject3);
    localObject4 = s.getSessionId();
    localObject3 = ((dx)localObject1).vCQ;
    j.o(localObject3, "reportData.item");
    e.a("SessionId", (String)localObject4, (LinkedList)localObject3);
    localObject3 = locale.jWx;
    if (localObject3 == null)
      j.avw("controller");
    i = ((b)localObject3).jVF;
    localObject3 = ((dx)localObject1).vCQ;
    j.o(localObject3, "reportData.item");
    e.a("EnterId", String.valueOf(i), (LinkedList)localObject3);
    localObject3 = ((dx)localObject1).vCQ;
    j.o(localObject3, "reportData.item");
    e.a("NativePage", "1", (LinkedList)localObject3);
    localObject3 = locale.jWx;
    if (localObject3 == null)
      j.avw("controller");
    localObject4 = ((b)localObject3).url;
    localObject3 = ((dx)localObject1).vCQ;
    j.o(localObject3, "reportData.item");
    e.a("#AppMsgUrl#", (String)localObject4, (LinkedList)localObject3);
    ((dy)localObject2).vFM.add(localObject1);
    localObject3 = locale.jWx;
    if (localObject3 == null)
      j.avw("controller");
    ((b)localObject3).a((dy)localObject2);
    localObject1 = ((dx)localObject1).vCQ;
    j.o(localObject1, "reportData.item");
    locale.b(10945, (LinkedList)localObject1);
    AppMethodBeat.o(15134);
  }

  public final void sB(int paramInt)
  {
    AppMethodBeat.i(15129);
    ed localed = new ed();
    localed.url = this.url;
    if (paramInt == 1)
    {
      if (this.jVL)
        AppMethodBeat.o(15129);
      while (true)
      {
        return;
        if (this.jVx != -1)
          break;
        ab.i(this.TAG, "no more comment");
        AppMethodBeat.o(15129);
      }
      localed.offset = this.jVx;
      this.jVL = true;
    }
    while (true)
    {
      localed.kdC = paramInt;
      localed.scene = this.scene;
      localed.vFQ = this.jSW;
      localed.vFO = this.ffZ;
      localed.session_id = s.getSessionId();
      localed.vFP = this.jVF;
      com.tencent.mm.ai.b.a locala = new com.tencent.mm.ai.b.a();
      locala.a((a)localed);
      locala.b((a)new ee());
      locala.qq("/cgi-bin/mmbiz-bin/appmsg/appmsg_comment_list");
      locala.kU(2866);
      locala.kV(0);
      locala.kW(0);
      w.a(locala.acD(), (w.a)new b.h(this, paramInt));
      AppMethodBeat.o(15129);
      break;
      if (this.jVK)
      {
        AppMethodBeat.o(15129);
        break;
      }
      localed.offset = this.jVy;
      if (this.jVy == -1)
      {
        ab.i(this.TAG, "no more my comment");
        AppMethodBeat.o(15129);
        break;
      }
      this.jVK = true;
    }
  }

  @a.l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "errType", "errCode", "errMsg", "", "rr", "Lcom/tencent/mm/modelbase/CommReqResp;", "kotlin.jvm.PlatformType", "<anonymous parameter 4>", "Lcom/tencent/mm/modelbase/NetSceneBase;", "callback"})
  static final class g
    implements w.a
  {
    public static final g jVR;

    static
    {
      AppMethodBeat.i(15125);
      jVR = new g();
      AppMethodBeat.o(15125);
    }

    public final int a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.b paramb, m paramm)
    {
      return 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.b
 * JD-Core Version:    0.6.2
 */