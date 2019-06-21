package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.plugin.sns.a.b.j;
import com.tencent.mm.plugin.sns.a.b.j.c;
import com.tencent.mm.plugin.sns.a.b.j.d;
import com.tencent.mm.plugin.sns.a.b.j.e;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import java.util.LinkedList;

final class SnsSightPlayerUI$6
  implements n.d
{
  SnsSightPlayerUI$6(SnsSightPlayerUI paramSnsSightPlayerUI)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(39254);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2:
    case 1:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(39254);
      Object localObject;
      while (true)
      {
        return;
        paramMenuItem = af.cnF().YT(SnsSightPlayerUI.f(this.rwT));
        if (paramMenuItem == null)
        {
          AppMethodBeat.o(39254);
        }
        else
        {
          localObject = new cl();
          com.tencent.mm.plugin.sns.j.a.a((cl)localObject, paramMenuItem);
          ((cl)localObject).cvA.activity = this.rwT;
          ((cl)localObject).cvA.cvH = 17;
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
          if (SnsSightPlayerUI.j(this.rwT))
          {
            i.a(new SnsAdClick(SnsSightPlayerUI.b(this.rwT), 5, paramMenuItem.field_snsId, 11, 0));
            j.a(j.d.qFe, j.c.qEZ, j.e.qFl, 0, paramMenuItem, SnsSightPlayerUI.b(this.rwT));
          }
          if (SnsSightPlayerUI.b(this.rwT) == 0)
          {
            localObject = new rb();
            ((rb)localObject).cNg.cwT = paramMenuItem.cqU();
            ((rb)localObject).cNg.cFc = i.j(paramMenuItem);
            com.tencent.mm.sdk.b.a.xxA.m((b)localObject);
          }
          AppMethodBeat.o(39254);
          continue;
          localObject = new Intent();
          n localn = af.cnF().YT(SnsSightPlayerUI.f(this.rwT));
          if (localn != null)
            ab.i("MicroMsg.SnsSightPlayerUI", "expose id " + localn.cqA());
          if (localn == null)
          {
            paramMenuItem = Integer.valueOf(0);
            label289: ((Intent)localObject).putExtra("k_expose_msg_id", paramMenuItem);
            if (localn != null)
              break label374;
          }
          label374: for (paramMenuItem = ""; ; paramMenuItem = localn.field_userName)
          {
            ((Intent)localObject).putExtra("k_username", paramMenuItem);
            ((Intent)localObject).putExtra("showShare", false);
            ((Intent)localObject).putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
            d.b(this.rwT, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
            AppMethodBeat.o(39254);
            break;
            paramMenuItem = localn.cqA();
            break label289;
          }
          SnsSightPlayerUI.v(this.rwT);
          paramMenuItem = new Intent();
          paramMenuItem.putExtra("Select_Conv_Type", 3);
          paramMenuItem.putExtra("select_is_ret", true);
          paramMenuItem.putExtra("mutil_select_is_ret", true);
          paramMenuItem.putExtra("image_path", SnsSightPlayerUI.e(this.rwT));
          paramMenuItem.putExtra("Retr_Msg_Type", 11);
          d.b(this.rwT, ".ui.transmit.SelectConversationUI", paramMenuItem, 4097);
          AppMethodBeat.o(39254);
          continue;
          paramMenuItem = af.cnF().YT(SnsSightPlayerUI.f(this.rwT));
          if (paramMenuItem == null)
          {
            AppMethodBeat.o(39254);
          }
          else
          {
            localObject = new Intent();
            if ((paramMenuItem.cqu().xfI.wbJ != 15) || ((bau)paramMenuItem.cqu().xfI.wbK.get(0) != null))
              break;
            ab.w("MicroMsg.SnsSightPlayerUI", "send sight fail, mediaObj is null");
            AppMethodBeat.o(39254);
          }
        }
      }
      ((Intent)localObject).putExtra("exdevice_open_scene_type", 2);
      ((Intent)localObject).putExtra("sns_local_id", SnsSightPlayerUI.f(this.rwT));
      ((Intent)localObject).putExtra("sns_send_data_ui_activity", true);
      d.f(this.rwT, ".ui.chatting.ChattingSendDataToDeviceUI", (Intent)localObject);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSightPlayerUI.6
 * JD-Core Version:    0.6.2
 */