package com.tencent.mm.plugin.topstory.ui.video;

import android.content.Context;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.bp.d;
import com.tencent.mm.protocal.protobuf.bzs;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.protocal.protobuf.cvi;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.n.d;
import java.io.IOException;
import org.json.JSONArray;

final class h$3
  implements n.d
{
  h$3(h paramh, f paramf, Context paramContext, chw paramchw, b paramb, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(1715);
    if (h.a(this.sDP))
    {
      this.sDP.sDN.cFV().cEf();
      h.b(this.sDP);
    }
    this.sDP.sDN.cGc();
    Context localContext;
    chw localchw;
    Object localObject1;
    Object localObject2;
    if (paramMenuItem.getItemId() == 0)
    {
      this.sDQ.cGw();
      paramMenuItem = p.sFq;
      localContext = this.val$context;
      localchw = this.sDR;
      localObject1 = this.sDS.cFT();
      if ((localchw != null) && (localObject1 != null))
      {
        paramMenuItem.sFr = localchw;
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("Ksnsupload_title", localchw.lvA);
        ((Intent)localObject2).putExtra("Ksnsupload_imgurl", localchw.uaf);
        ((Intent)localObject2).putExtra("Ksnsupload_link", localchw.lvz);
        if (!bo.isNullOrNil(localchw.qVw))
          break label524;
        paramMenuItem = localContext.getString(2131302195);
      }
      while (true)
      {
        ((Intent)localObject2).putExtra("KContentObjDesc", paramMenuItem);
        ((Intent)localObject2).putExtra("KlinkThumb_url", localchw.uaf);
        ((Intent)localObject2).putExtra("Ksnsupload_source", 1);
        ((Intent)localObject2).putExtra("Ksnsupload_type", 16);
        ((Intent)localObject2).putExtra("need_result", true);
        paramMenuItem = new cvi();
        paramMenuItem.uaa = localchw.xgS;
        paramMenuItem.uab = localchw.xgV;
        paramMenuItem.uac = ((chv)localObject1).hlm;
        paramMenuItem.uad = localchw.xgU;
        paramMenuItem.uae = 100201L;
        paramMenuItem.lvz = localchw.lvz;
        paramMenuItem.lvA = localchw.lvA;
        paramMenuItem.qVw = localchw.qVw;
        paramMenuItem.uaf = localchw.uaf;
        paramMenuItem.uag = localchw.uag;
        paramMenuItem.uah = localchw.uah;
        paramMenuItem.source = localchw.source;
        paramMenuItem.phw = localchw.phw;
        paramMenuItem.uai = localchw.uai;
        paramMenuItem.uaj = localchw.uaj;
        paramMenuItem.uak = p.dO(((chv)localObject1).tZG).toString();
        paramMenuItem.ual = com.tencent.mm.plugin.topstory.a.g.dN(localchw.wiH).toString();
        paramMenuItem.uam = localchw.xhe;
        paramMenuItem.thumbUrl = localchw.xgQ;
        if ((p.g(localchw)) && (((chv)localObject1).xgI != null))
          paramMenuItem.uan = ((chv)localObject1).xgI.title;
        try
        {
          paramMenuItem = paramMenuItem.toByteArray();
          if (paramMenuItem != null)
            ((Intent)localObject2).putExtra("KWebSearchInfo", paramMenuItem);
          d.b(localContext, "sns", ".ui.SnsUploadUI", (Intent)localObject2, 1024);
          ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sDS.cFT(), this.sDR, this.sN, 7, "");
          AppMethodBeat.o(1715);
          return;
          label524: paramMenuItem = localchw.qVw;
        }
        catch (IOException paramMenuItem)
        {
          while (true)
          {
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.TopStory.TopStoryVideoShareMgr", paramMenuItem, "", new Object[0]);
            paramMenuItem = null;
          }
        }
      }
    }
    if (paramMenuItem.getItemId() == 1)
    {
      this.sDQ.cGw();
      paramMenuItem = p.sFq;
      localContext = this.val$context;
      localchw = this.sDR;
      localObject2 = this.sDS.cFT();
      paramMenuItem.sFr = localchw;
      localObject1 = new j.b();
      ((j.b)localObject1).type = 5;
      ((j.b)localObject1).title = localchw.lvA;
      if (!bo.isNullOrNil(localchw.qVw))
        break label1018;
    }
    label1018: for (paramMenuItem = localContext.getString(2131302195); ; paramMenuItem = localchw.qVw)
    {
      ((j.b)localObject1).description = paramMenuItem;
      ((j.b)localObject1).url = localchw.lvz;
      ((j.b)localObject1).thumburl = localchw.uaf;
      paramMenuItem = new com.tencent.mm.plugin.websearch.api.ab();
      paramMenuItem.uaa = localchw.xgS;
      paramMenuItem.uab = localchw.xgV;
      paramMenuItem.uac = ((chv)localObject2).hlm;
      paramMenuItem.uad = localchw.xgU;
      paramMenuItem.uae = 100201L;
      paramMenuItem.lvz = localchw.lvz;
      paramMenuItem.lvA = localchw.lvA;
      paramMenuItem.qVw = localchw.qVw;
      paramMenuItem.uaf = localchw.uaf;
      paramMenuItem.uag = localchw.uag;
      paramMenuItem.uah = localchw.uah;
      paramMenuItem.source = localchw.source;
      paramMenuItem.phw = localchw.phw;
      paramMenuItem.uai = localchw.uai;
      paramMenuItem.uaj = localchw.uaj;
      paramMenuItem.uak = p.dO(((chv)localObject2).tZG).toString();
      paramMenuItem.ual = com.tencent.mm.plugin.topstory.a.g.dN(localchw.wiH).toString();
      paramMenuItem.uam = localchw.xhe;
      paramMenuItem.thumbUrl = localchw.xgQ;
      if ((p.g(localchw)) && (((chv)localObject2).xgI != null))
        paramMenuItem.uan = ((chv)localObject2).xgI.title;
      ((j.b)localObject1).a(paramMenuItem);
      localObject2 = j.b.a((j.b)localObject1, null, null);
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("Retr_Msg_Type", 2);
      paramMenuItem.putExtra("Retr_Msg_content", (String)localObject2);
      paramMenuItem.putExtra("Multi_Retr", true);
      paramMenuItem.putExtra("Retr_go_to_chattingUI", false);
      paramMenuItem.putExtra("Retr_show_success_tips", true);
      d.b(localContext, ".ui.transmit.MsgRetransmitUI", paramMenuItem, 2048);
      ((com.tencent.mm.plugin.topstory.a.b)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sDS.cFT(), this.sDR, this.sN, 6, "");
      AppMethodBeat.o(1715);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.h.3
 * JD-Core Version:    0.6.2
 */