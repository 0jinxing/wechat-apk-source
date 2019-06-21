package com.tencent.mm.plugin.brandservice.ui.timeline.video.a;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.p;
import com.tencent.mm.af.r;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.py.a;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.model.s;
import com.tencent.mm.model.t;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bac;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/util/BizVideoMsgTransmit;", "", "()V", "TAG", "", "doSendAppMsg", "", "toUser", "msgInfo", "Lcom/tencent/mm/message/MPMsgInfo;", "appendText", "controller", "Lcom/tencent/mm/plugin/brandservice/ui/timeline/video/BizVideoController;", "transmitBizVideoMsg", "", "context", "Landroid/content/Context;", "msg", "plugin-brandservice_release"})
public final class a
{
  private static final String TAG = "MicroMsg.BizVideoMsgTransmit";
  public static final a jYp;

  static
  {
    AppMethodBeat.i(15311);
    jYp = new a();
    TAG = "MicroMsg.BizVideoMsgTransmit";
    AppMethodBeat.o(15311);
  }

  public static void a(Context paramContext, r paramr, com.tencent.mm.plugin.brandservice.ui.timeline.video.b paramb)
  {
    Object localObject = null;
    AppMethodBeat.i(15309);
    j.p(paramContext, "context");
    j.p(paramr, "msg");
    j.p(paramb, "controller");
    HashMap localHashMap = new HashMap();
    Map localMap;
    if (paramb.aYp())
    {
      localMap = (Map)localHashMap;
      paramr = paramb.jVI;
      if (paramr != null)
      {
        paramr = paramr.fjx;
        paramr = bo.nullAsNil(paramr);
        j.o(paramr, "Util.nullAsNil(controlle…aliciousTitleInfo?.cover)");
        localMap.put("img_url", paramr);
        localMap = (Map)localHashMap;
        paramr = paramb.jVI;
        if (paramr == null)
          break label339;
        paramr = paramr.fjz;
        label106: paramr = bo.nullAsNil(paramr);
        j.o(paramr, "Util.nullAsNil(controlle…liciousTitleInfo?.digest)");
        localMap.put("desc", paramr);
        localMap = (Map)localHashMap;
        bac localbac = paramb.jVI;
        paramr = (r)localObject;
        if (localbac != null)
          paramr = localbac.title;
        paramr = bo.nullAsNil(paramr);
        j.o(paramr, "Util.nullAsNil(controlle…aliciousTitleInfo?.title)");
        localMap.put("title", paramr);
      }
    }
    while (true)
    {
      paramr = (Map)localHashMap;
      localObject = paramb.url;
      if (localObject == null)
        j.dWJ();
      paramr.put("url", localObject);
      ab.i(TAG, "transmitBizVideoMsg, img_url=%s, desc=%s, title=%s, url=%s", new Object[] { localHashMap.get("img_url"), localHashMap.get("desc"), localHashMap.get("title"), paramb.url });
      h.pYm.a(157L, 5L, 1L, false);
      paramr = new Intent();
      paramr.putExtra("Select_Conv_Type", 3);
      paramr.putExtra("scene_from", 2);
      paramr.putExtra("mutil_select_is_ret", true);
      paramr.putExtra("webview_params", (Serializable)localHashMap);
      paramr.putExtra("Retr_Msg_Type", 2);
      d.b(paramContext, ".ui.transmit.SelectConversationUI", paramr, 2);
      AppMethodBeat.o(15309);
      return;
      paramr = null;
      break;
      label339: paramr = null;
      break label106;
      localMap = (Map)localHashMap;
      localObject = paramr.fjT.fjx;
      j.o(localObject, "msg.item.cover");
      localMap.put("img_url", localObject);
      localMap = (Map)localHashMap;
      localObject = paramr.fjT.fjz;
      j.o(localObject, "msg.item.digest");
      localMap.put("desc", localObject);
      localObject = (Map)localHashMap;
      paramr = paramr.fjT.title;
      j.o(paramr, "msg.item.title");
      ((Map)localObject).put("title", paramr);
    }
  }

  public static boolean a(String paramString1, r paramr, String paramString2, com.tencent.mm.plugin.brandservice.ui.timeline.video.b paramb)
  {
    Object localObject1 = null;
    AppMethodBeat.i(15310);
    j.p(paramString1, "toUser");
    j.p(paramr, "msgInfo");
    j.p(paramb, "controller");
    Object localObject2 = new WXWebpageObject();
    ((WXWebpageObject)localObject2).webpageUrl = paramb.url;
    Object localObject3 = new WXMediaMessage();
    ((WXMediaMessage)localObject3).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
    if (paramb.aYp())
    {
      localObject2 = paramb.jVI;
      if (localObject2 != null)
        localObject2 = ((bac)localObject2).title;
    }
    while (true)
    {
      ((WXMediaMessage)localObject3).title = ((String)localObject2);
      localObject2 = paramb.jVI;
      if (localObject2 != null)
      {
        localObject2 = ((bac)localObject2).fjz;
        label114: ((WXMediaMessage)localObject3).description = ((String)localObject2);
        label121: localObject2 = new py();
        ((py)localObject2).cMe.cEl = ((WXMediaMessage)localObject3);
        ((py)localObject2).cMe.toUser = paramString1;
        ((py)localObject2).cMe.cMf = 2;
        if (!bo.isNullOrNil(paramr.cwG))
          break label690;
        ((py)localObject2).cMe.cMg = paramr.HE();
        ((py)localObject2).cMe.cMh = s.mJ(paramr.HE());
      }
      try
      {
        label195: ((py)localObject2).cMe.cMj = paramb.url;
        ((py)localObject2).cMe.cMm = bo.nullAsNil(paramr.fjS);
        localObject3 = v.nW(((py)localObject2).cMe.cMm);
        v.b localb = v.Zp().y((String)localObject3, true);
        if (localb == null)
          j.dWJ();
        localb.j("sendAppMsgScene", Integer.valueOf(2));
        localb.j("preChatName", paramr.HE());
        localb.j("preMsgIndex", Integer.valueOf(paramr.fjQ));
        localb.j("prePublishId", paramr.fjS);
        localb.j("preUsername", paramr.HE());
        int i = paramr.fjT.type;
        if (i != -1)
        {
          localb.j("_DATA_CENTER_ITEM_SHOW_TYPE", Integer.valueOf(i));
          localb.j("_tmpl_webview_transfer_scene", Integer.valueOf(11));
        }
        if (paramr.fjT.type == 5)
        {
          localb.j("_DATA_CENTER_VID", paramr.fjT.fgd);
          localb.j("_DATA_CENTER_FUNC_FLAG", Integer.valueOf(paramr.fgc));
          localb.j("_DATA_CENTER_PUB_TIME", Integer.valueOf((int)paramr.fjT.time));
          localb.j("_DATA_CENTER__DULATION", Integer.valueOf(paramr.fjT.fjB));
          localb.j("_DATA_CENTER_VIDEO_WIDTH", Integer.valueOf(paramr.fjT.videoWidth));
          localb.j("_DATA_CENTER_VIDEO_HEIGHT", Integer.valueOf(paramr.fjT.videoHeight));
          if (!paramb.aYp())
            break label722;
          paramr = paramb.jVI;
          if (paramr == null)
            break label717;
          paramr = paramr.fjx;
          label506: localb.j("_DATA_CENTER_COVER_URL", paramr);
          bac localbac = paramb.jVI;
          paramr = localObject1;
          if (localbac != null)
            paramr = localbac.fjz;
          localb.j("_DATA_CENTER_DESC", paramr);
        }
        while (true)
        {
          ((py)localObject2).cMe.cvF = ((String)localObject3);
          ((py)localObject2).cMe.cMk = paramb.url;
          boolean bool = com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
          if (!bo.isNullOrNil(paramString2))
          {
            paramr = new qb();
            paramr.cMq.cMr = paramString1;
            paramr.cMq.content = paramString2;
            paramr.cMq.type = t.nK(paramString1);
            paramr.cMq.flags = 0;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)paramr);
          }
          AppMethodBeat.o(15310);
          return bool;
          localObject2 = null;
          break;
          localObject2 = null;
          break label114;
          ((WXMediaMessage)localObject3).title = paramr.fjT.title;
          ((WXMediaMessage)localObject3).description = paramr.fjT.fjz;
          break label121;
          label690: ((py)localObject2).cMe.cMg = paramr.cwG;
          ((py)localObject2).cMe.cMh = paramr.fjR;
          break label195;
          label717: paramr = null;
          break label506;
          label722: localb.j("_DATA_CENTER_COVER_URL", paramr.fjT.fjx);
          localb.j("_DATA_CENTER_DESC", paramr.fjT.fjz);
        }
      }
      catch (Exception paramr)
      {
        while (true)
          ab.e(TAG, "init bunddata failed : %s", new Object[] { paramr.getMessage() });
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.timeline.video.a.a
 * JD-Core Version:    0.6.2
 */