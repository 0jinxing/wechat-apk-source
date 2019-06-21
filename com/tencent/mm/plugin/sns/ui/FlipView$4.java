package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.rb;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.aj;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.az;
import com.tencent.mm.ui.base.n.d;
import java.util.LinkedList;

final class FlipView$4
  implements n.d
{
  FlipView$4(FlipView paramFlipView, String paramString1, String paramString2, String paramString3)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(38229);
    Object localObject1 = af.cnF().YT(this.riM);
    if (localObject1 == null)
    {
      ab.i("MicroMsg.FlipView", "error beacause info null");
      AppMethodBeat.o(38229);
      return;
    }
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    }
    while (true)
    {
      AppMethodBeat.o(38229);
      break;
      if (((com.tencent.mm.plugin.sns.storage.n)localObject1).field_type != 15)
      {
        com.tencent.mm.pluginsdk.ui.tools.n.j(this.hWl, FlipView.e(this.riK));
        AppMethodBeat.o(38229);
        break;
      }
      FlipView.Zt(this.riM);
      AppMethodBeat.o(38229);
      break;
      if (((com.tencent.mm.plugin.sns.storage.n)localObject1).field_type != 15)
      {
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Retr_File_Name", this.hWl);
        paramMenuItem.putExtra("Retr_Compress_Type", 0);
        paramMenuItem.putExtra("Retr_Msg_Type", 0);
        if (localObject1 != null)
        {
          paramMenuItem.putExtra("Retr_FromMainTimeline", this.riK.crK());
          paramMenuItem.putExtra("Retr_KSnsId", i.j((com.tencent.mm.plugin.sns.storage.n)localObject1));
        }
        com.tencent.mm.plugin.sns.c.a.gkE.k(paramMenuItem, FlipView.e(this.riK));
        AppMethodBeat.o(38229);
        break;
      }
      new StringBuilder().append(an.fZ(af.getAccSnsPath(), this.IN)).append(i.e((bau)((com.tencent.mm.plugin.sns.storage.n)localObject1).cqu().xfI.wbK.get(0)));
      FlipView.Zu(this.riM);
      AppMethodBeat.o(38229);
      break;
      Object localObject2;
      if (((com.tencent.mm.plugin.sns.storage.n)localObject1).field_type != 15)
      {
        localObject2 = new cl();
        Object localObject3 = this.riM;
        paramMenuItem = this.IN;
        if ((paramMenuItem == null) || (bo.isNullOrNil((String)localObject3)))
        {
          ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, event is null or snsId error or position errro");
          ((cl)localObject2).cvA.cvG = 2131299622;
        }
        while (true)
        {
          ((cl)localObject2).cvA.cvH = 13;
          ((cl)localObject2).cvA.activity = ((Activity)FlipView.e(this.riK));
          com.tencent.mm.sdk.b.a.xxA.m((b)localObject2);
          if (this.riK.crK())
          {
            paramMenuItem = new rb();
            paramMenuItem.cNg.cFc = i.j((com.tencent.mm.plugin.sns.storage.n)localObject1);
            paramMenuItem.cNg.cwT = ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqU();
            com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
          }
          AppMethodBeat.o(38229);
          break;
          if (af.cnn())
          {
            ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, sns core is invalid");
            ((cl)localObject2).cvA.cvG = 2131299640;
          }
          else
          {
            localObject3 = af.cnF().YT((String)localObject3);
            if (localObject3 == null)
            {
              ab.w("MicroMsg.Sns.GetFavDataSource", "fill favorite event fail, snsInfo is null");
              ((cl)localObject2).cvA.cvG = 2131299623;
            }
            else
            {
              com.tencent.mm.plugin.sns.j.a.a((cl)localObject2, (com.tencent.mm.plugin.sns.storage.n)localObject3, paramMenuItem);
            }
          }
        }
      }
      if (localObject1 == null)
      {
        AppMethodBeat.o(38229);
        break;
      }
      if (!((com.tencent.mm.plugin.sns.storage.n)localObject1).DI(32))
        FlipView.r(this.riK.crK(), ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqU());
      while (true)
      {
        if (this.riK.crK())
        {
          paramMenuItem = new rb();
          paramMenuItem.cNg.cFc = i.j((com.tencent.mm.plugin.sns.storage.n)localObject1);
          paramMenuItem.cNg.cwT = ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqU();
          com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
        }
        AppMethodBeat.o(38229);
        break;
        paramMenuItem = new cl();
        com.tencent.mm.plugin.sns.j.a.a(paramMenuItem, (com.tencent.mm.plugin.sns.storage.n)localObject1);
        paramMenuItem.cvA.cvH = 14;
        paramMenuItem.cvA.activity = ((Activity)FlipView.e(this.riK));
        com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("k_expose_msg_id", this.riK.getSnsId());
      paramMenuItem = af.cnF().kD(this.riK.getSnsId());
      if (paramMenuItem == null);
      for (paramMenuItem = ""; ; paramMenuItem = paramMenuItem.field_userName)
      {
        ((Intent)localObject1).putExtra("k_username", paramMenuItem);
        ((Intent)localObject1).putExtra("showShare", false);
        ((Intent)localObject1).putExtra("rawUrl", "https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect33");
        ((Intent)localObject1).putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
        d.b(FlipView.e(this.riK), "webview", ".ui.tools.WebViewUI", (Intent)localObject1);
        AppMethodBeat.o(38229);
        break;
      }
      ab.i("MicroMsg.FlipView", "request deal QBAR string");
      paramMenuItem = new cf();
      paramMenuItem.cvm.activity = ((Activity)FlipView.e(this.riK));
      paramMenuItem.cvm.ctB = FlipView.f(this.riK);
      paramMenuItem.cvm.cvn = FlipView.g(this.riK);
      paramMenuItem.cvm.cvo = FlipView.h(this.riK);
      localObject1 = aj.a((com.tencent.mm.plugin.sns.storage.n)localObject1, this.IN);
      if (localObject1 != null)
      {
        paramMenuItem.cvm.imagePath = ((bau)localObject1).Url;
        paramMenuItem.cvm.cvr = ((bau)localObject1).wEY;
      }
      paramMenuItem.cvm.scene = 38;
      if ((FlipView.e(this.riK) instanceof Activity))
        paramMenuItem.cvm.cvs = ((Activity)FlipView.e(this.riK)).getIntent().getBundleExtra("_stat_obj");
      if ((this.riK instanceof SnsInfoFlip))
      {
        localObject2 = (SnsInfoFlip)this.riK;
        localObject1 = ((SnsInfoFlip)localObject2).getFromScene();
        ab.d("MicroMsg.FlipView", "from Scene: %s", new Object[] { ((az)localObject1).tag });
        if ((!((az)localObject1).tag.equals(az.xYN.tag)) && (!((az)localObject1).tag.equals(az.xYO.tag)) && (!((az)localObject1).tag.equals(az.xYP.tag)))
          break label1102;
        paramMenuItem.cvm.cvp = 5;
        if (bo.isNullOrNil(((SnsInfoFlip)localObject2).username))
        {
          ab.i("MicroMsg.FlipView", "empty username");
          ((SnsInfoFlip)localObject2).username = "";
        }
        paramMenuItem.cvm.source = ((SnsInfoFlip)localObject2).username;
      }
      while (true)
      {
        com.tencent.mm.sdk.b.a.xxA.m(paramMenuItem);
        AppMethodBeat.o(38229);
        break;
        label1102: if (((az)localObject1).tag.equals(az.xYM.tag))
          paramMenuItem.cvm.cvp = 3;
        else
          ab.i("MicroMsg.FlipView", "other scene_from: %s", new Object[] { ((az)localObject1).tag });
      }
      if (((com.tencent.mm.plugin.sns.storage.n)localObject1).cqu().xfI.wbK.size() == 0)
      {
        AppMethodBeat.o(38229);
        break;
      }
      paramMenuItem = new Intent();
      if (((com.tencent.mm.plugin.sns.storage.n)localObject1).field_type == 1)
      {
        paramInt = this.riK.getPosition();
        int i = ((com.tencent.mm.plugin.sns.storage.n)localObject1).cqu().xfI.wbK.size();
        if ((i > 1) && (paramInt > 1) && (paramInt <= i))
          paramInt--;
        while (true)
        {
          localObject1 = FlipView.g(this.hWl, FlipView.e(this.riK));
          if (localObject1 != null)
            break label1266;
          AppMethodBeat.o(38229);
          break;
          paramInt = 0;
        }
        label1266: paramMenuItem.putExtra("sns_send_data_ui_image_path", (String)localObject1);
        paramMenuItem.putExtra("sns_send_data_ui_image_position", paramInt);
      }
      paramMenuItem.putExtra("sns_send_data_ui_activity", true);
      paramMenuItem.putExtra("sns_local_id", this.riM);
      d.f(FlipView.e(this.riK), ".ui.chatting.ChattingSendDataToDeviceUI", paramMenuItem);
      AppMethodBeat.o(38229);
      break;
      this.riK.Zs(this.hWl);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.FlipView.4
 * JD-Core Version:    0.6.2
 */