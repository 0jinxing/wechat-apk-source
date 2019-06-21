package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.sb;
import com.tencent.mm.g.a.sb.a;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;
import java.util.LinkedList;

final class SnsOnlineVideoActivity$6
  implements n.d
{
  SnsOnlineVideoActivity$6(SnsOnlineVideoActivity paramSnsOnlineVideoActivity)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(39149);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2:
    case 1:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(39149);
      while (true)
      {
        return;
        paramMenuItem = new sb();
        paramMenuItem.cNV.cAd = 2;
        paramMenuItem.cNV.cNW = 17;
        Object localObject = paramMenuItem.cNV;
        if (SnsOnlineVideoActivity.u(this.rvf) == 0)
          bool = true;
        ((sb.a)localObject).cNX = bool;
        paramMenuItem.cNV.czD = SnsOnlineVideoActivity.t(this.rvf);
        a.xxA.m(paramMenuItem);
        AppMethodBeat.o(39149);
        continue;
        localObject = new Intent();
        n localn = af.cnF().YT(SnsOnlineVideoActivity.t(this.rvf));
        if (localn != null)
          ab.i("MicroMsg.SnsOnlineVideoActivity", "expose id " + localn.cqA());
        if (localn == null)
        {
          paramMenuItem = Integer.valueOf(0);
          label197: ((Intent)localObject).putExtra("k_expose_msg_id", paramMenuItem);
          if (localn != null)
            break label287;
        }
        label287: for (paramMenuItem = ""; ; paramMenuItem = localn.field_userName)
        {
          ((Intent)localObject).putExtra("k_username", paramMenuItem);
          ((Intent)localObject).putExtra("showShare", false);
          ((Intent)localObject).putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
          d.b(this.rvf, "webview", ".ui.tools.WebViewUI", (Intent)localObject);
          AppMethodBeat.o(39149);
          break;
          paramMenuItem = localn.cqA();
          break label197;
        }
        SnsOnlineVideoActivity.v(this.rvf);
        paramMenuItem = new sb();
        paramMenuItem.cNV.cAd = 1;
        paramMenuItem.cNV.cNY = 4097;
        paramMenuItem.cNV.czD = SnsOnlineVideoActivity.t(this.rvf);
        a.xxA.m(paramMenuItem);
        AppMethodBeat.o(39149);
        continue;
        paramMenuItem = af.cnF().YT(SnsOnlineVideoActivity.t(this.rvf));
        if (paramMenuItem == null)
        {
          AppMethodBeat.o(39149);
        }
        else
        {
          localObject = new Intent();
          if ((paramMenuItem.cqu().xfI.wbJ == 15) && ((bau)paramMenuItem.cqu().xfI.wbK.get(0) == null))
          {
            ab.w("MicroMsg.SnsOnlineVideoActivity", "send sight fail, mediaObj is null");
            AppMethodBeat.o(39149);
          }
          else
          {
            ((Intent)localObject).putExtra("exdevice_open_scene_type", 2);
            ((Intent)localObject).putExtra("sns_local_id", SnsOnlineVideoActivity.t(this.rvf));
            ((Intent)localObject).putExtra("sns_send_data_ui_activity", true);
            d.f(this.rvf, ".ui.chatting.ChattingSendDataToDeviceUI", (Intent)localObject);
            AppMethodBeat.o(39149);
          }
        }
      }
      paramMenuItem = new sb();
      paramMenuItem.cNV.cAd = 3;
      paramMenuItem.cNV.czD = SnsOnlineVideoActivity.t(this.rvf);
      a.xxA.m(paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsOnlineVideoActivity.6
 * JD-Core Version:    0.6.2
 */