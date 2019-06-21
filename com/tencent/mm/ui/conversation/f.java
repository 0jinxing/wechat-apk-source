package com.tencent.mm.ui.conversation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.at;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.f;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.brandservice.ui.timeline.BizTimeLineUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ak;
import com.tencent.mm.storage.be;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.LauncherUI;
import com.tencent.mm.ui.MMAppMgr;
import com.tencent.mm.ui.bizchat.BizChatConversationUI;
import junit.framework.Assert;

public final class f
  implements AdapterView.OnItemClickListener
{
  private Activity activity;
  private ListView zqz;
  private h zrd;

  public f(h paramh, ListView paramListView, Activity paramActivity)
  {
    this.zrd = paramh;
    this.zqz = paramListView;
    this.activity = paramActivity;
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34209);
    if (paramInt < this.zqz.getHeaderViewsCount())
      AppMethodBeat.o(34209);
    int i;
    while (true)
    {
      return;
      i = paramInt - this.zqz.getHeaderViewsCount();
      paramAdapterView = (ak)this.zrd.MG(i);
      if (paramAdapterView != null)
        break;
      ab.e("MicroMsg.ConversationClickListener", "null user at position = ".concat(String.valueOf(i)));
      AppMethodBeat.o(34209);
    }
    if (paramAdapterView.jl(16777216))
    {
      paramAdapterView.jk(16777216);
      aw.ZK();
      c.XR().a(paramAdapterView, paramAdapterView.field_username);
    }
    if (paramAdapterView.jl(33554432))
    {
      paramAdapterView.jk(33554432);
      aw.ZK();
      c.XR().a(paramAdapterView, paramAdapterView.field_username);
    }
    if (com.tencent.mm.model.t.ne(paramAdapterView.field_username))
      if (r.YR())
      {
        d.H(this.activity, "tmessage", ".ui.TConversationUI");
        label166: this.zrd.a(paramView, i, paramAdapterView.field_username);
        paramInt = 0;
      }
    while (true)
    {
      label182: if (paramInt != 0)
      {
        this.zrd.a(paramView, i, paramAdapterView.field_username);
        com.tencent.mm.plugin.report.service.g.BN(9);
        paramView = (LauncherUI)this.activity;
        if (paramView == null)
          break label1549;
      }
      label1159: label1544: label1549: for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue("Launcher should not be empty.", bool);
        Object localObject = new Bundle();
        ((Bundle)localObject).putInt("specific_chat_from_scene", 7);
        ((Bundle)localObject).putInt("KOpenArticleSceneFromScene", 93);
        ((Bundle)localObject).putInt("Main_IndexInSessionList", i);
        ((Bundle)localObject).putInt("Main_UnreadCount", paramAdapterView.field_unReadCount);
        paramView.startChatting(paramAdapterView.field_username, (Bundle)localObject, true);
        if (com.tencent.mm.model.t.mP(paramAdapterView.field_username))
        {
          paramView = new com.tencent.mm.g.b.a.t();
          paramView.eO(paramAdapterView.field_username);
          paramView.cXP = 1L;
          paramView.ajK();
        }
        AppMethodBeat.o(34209);
        break;
        d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
        break label166;
        if (com.tencent.mm.model.t.nf(paramAdapterView.field_username))
        {
          if (r.YQ())
            d.H(this.activity, "bottle", ".ui.BottleConversationUI");
          while (true)
          {
            this.zrd.a(paramView, i, paramAdapterView.field_username);
            paramInt = 0;
            break;
            d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          }
        }
        if (com.tencent.mm.model.t.nk(paramAdapterView.field_username))
        {
          MMAppMgr.cancelNotification(paramAdapterView.field_username);
          d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          this.zrd.a(paramView, i, paramAdapterView.field_username);
          paramInt = 0;
          break label182;
        }
        if (com.tencent.mm.model.t.nc(paramAdapterView.field_username))
        {
          com.tencent.mm.kernel.g.RQ();
          if (bo.h((Integer)com.tencent.mm.kernel.g.RP().Ry().get(17, null)) == 1);
          for (paramInt = 1; ; paramInt = 0)
          {
            if (paramInt != 0)
              break label1544;
            d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
            this.zrd.a(paramView, i, paramAdapterView.field_username);
            paramInt = 0;
            break;
          }
        }
        if (com.tencent.mm.model.t.nq(paramAdapterView.field_username))
          break label1555;
        if (com.tencent.mm.model.t.np(paramAdapterView.field_username))
        {
          if (r.YV())
          {
            localObject = new Intent();
            ((Intent)localObject).addFlags(67108864);
            ((Intent)localObject).putExtra("type", 20);
            d.b(this.activity, "readerapp", ".ui.ReaderAppUI", (Intent)localObject);
          }
          while (true)
          {
            this.zrd.a(paramView, i, paramAdapterView.field_username);
            paramInt = 0;
            break;
            d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          }
        }
        if (com.tencent.mm.model.t.nx(paramAdapterView.field_username))
        {
          if (r.YW())
          {
            localObject = new Intent();
            ((Intent)localObject).addFlags(67108864);
            ((Intent)localObject).putExtra("type", 11);
            d.b(this.activity, "readerapp", ".ui.ReaderAppUI", (Intent)localObject);
          }
          while (true)
          {
            this.zrd.a(paramView, i, paramAdapterView.field_username);
            paramInt = 0;
            break;
            d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          }
        }
        if (com.tencent.mm.model.t.nh(paramAdapterView.field_username))
        {
          d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          this.zrd.a(paramView, i, paramAdapterView.field_username);
          paramInt = 0;
          break label182;
        }
        if (com.tencent.mm.model.t.ni(paramAdapterView.field_username))
        {
          if (r.YY())
          {
            localObject = new Intent().addFlags(67108864);
            d.b(this.activity, "masssend", ".ui.MassSendHistoryUI", (Intent)localObject);
          }
          while (true)
          {
            this.zrd.a(paramView, i, paramAdapterView.field_username);
            paramInt = 0;
            break;
            d.b(this.activity, "profile", ".ui.ContactInfoUI", new Intent().putExtra("Contact_User", paramAdapterView.field_username));
          }
        }
        if (com.tencent.mm.model.t.nw(paramAdapterView.field_username))
        {
          if (ao.a.flx != null)
            ao.a.flx.ot(paramAdapterView.field_username);
          paramInt = 1;
          break label182;
        }
        if (com.tencent.mm.model.t.ny(paramAdapterView.field_username))
        {
          bool = WXHardCoderJNI.hcBizEnable;
          int j = WXHardCoderJNI.hcBizDelay;
          int k = WXHardCoderJNI.hcBizCPU;
          int m = WXHardCoderJNI.hcBizIO;
          if (WXHardCoderJNI.hcBizThr)
          {
            paramInt = Process.myTid();
            label1044: ab.i("MicroMsg.ConversationClickListener", "summer hardcoder biz startPerformance [%s][%s]", new Object[] { Integer.valueOf(901), Integer.valueOf(WXHardCoderJNI.startPerformance(bool, j, k, m, paramInt, WXHardCoderJNI.hcBizTimeout, 901, WXHardCoderJNI.hcBizAction, "MicroMsg.ConversationClickListener")) });
            if (!com.tencent.mm.storage.s.aVO())
              break label1159;
            localObject = new Intent(this.activity, BizTimeLineUI.class);
            ((Intent)localObject).putExtra("KOpenArticleSceneFromScene", 93);
            this.activity.startActivity((Intent)localObject);
          }
          while (true)
          {
            this.zrd.a(paramView, i, paramAdapterView.field_username);
            paramInt = 0;
            break;
            paramInt = 0;
            break label1044;
            this.activity.startActivity(new Intent(this.activity, BizConversationUI.class));
          }
        }
        if ((com.tencent.mm.model.t.mZ(paramAdapterView.field_username)) && (com.tencent.mm.aj.f.rc(paramAdapterView.field_username)))
        {
          if (!com.tencent.mm.model.t.mY(paramAdapterView.field_username))
          {
            com.tencent.mm.ui.base.h.bQ(this.activity, this.activity.getString(2131299228));
            AppMethodBeat.o(34209);
            break;
          }
          localObject = new Intent(this.activity, EnterpriseConversationUI.class);
          ((Intent)localObject).putExtra("enterprise_biz_name", paramAdapterView.field_username);
          ((Intent)localObject).putExtra("enterprise_biz_display_name", com.tencent.mm.model.s.mJ(paramAdapterView.field_username));
          ((Intent)localObject).putExtra("enterprise_from_scene", 1);
          this.activity.startActivity((Intent)localObject);
          this.zrd.a(paramView, i, paramAdapterView.field_username);
          paramInt = 0;
          break label182;
        }
        if ((com.tencent.mm.model.t.mZ(paramAdapterView.field_username)) && (com.tencent.mm.aj.f.kq(paramAdapterView.field_username)))
        {
          if (!com.tencent.mm.model.t.mY(paramAdapterView.field_username))
          {
            com.tencent.mm.ui.base.h.bQ(this.activity, this.activity.getString(2131299228));
            AppMethodBeat.o(34209);
            break;
          }
          localObject = new Intent(this.activity, BizChatConversationUI.class);
          ((Intent)localObject).putExtra("Contact_User", paramAdapterView.field_username);
          ((Intent)localObject).putExtra("biz_chat_from_scene", 1);
          ((Intent)localObject).addFlags(67108864);
          this.activity.startActivity((Intent)localObject);
          this.zrd.a(paramView, i, paramAdapterView.field_username);
          paramInt = 0;
          break label182;
        }
        if (com.tencent.mm.model.t.nH(paramAdapterView.field_username))
        {
          localObject = new Intent();
          ((Intent)localObject).setClassName(this.activity, "com.tencent.mm.ui.conversation.AppBrandServiceConversationUI");
          ((Intent)localObject).putExtra("Contact_User", paramAdapterView.field_username);
          ((Intent)localObject).putExtra("app_brand_conversation_from_scene", 1);
          ((Intent)localObject).addFlags(67108864);
          this.activity.startActivity((Intent)localObject);
          this.zrd.a(paramView, i, paramAdapterView.field_username);
          paramInt = 0;
          break label182;
        }
        paramInt = 1;
        break label182;
      }
      label1555: paramInt = 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.f
 * JD-Core Version:    0.6.2
 */