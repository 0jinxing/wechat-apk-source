package com.tencent.mm.plugin.downloader_app.e;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.r;
import com.tencent.mm.model.t;
import com.tencent.mm.model.u;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.preference.HelperHeaderPreference;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.be;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.preference.CheckBoxPreference;
import com.tencent.mm.ui.base.preference.f;

public final class a
  implements com.tencent.mm.pluginsdk.b.a
{
  Context context;
  private f ehK;
  private ad ehM;
  private boolean enable;
  private CheckBoxPreference kRl;
  private CheckBoxPreference kRm;

  public a(Context paramContext)
  {
    this.context = paramContext;
  }

  public final boolean IO(String paramString)
  {
    AppMethodBeat.i(136323);
    boolean bool;
    if ("contact_info_go_to_downloader".equals(paramString))
    {
      paramString = new Intent();
      paramString.putExtra("Chat_User", this.ehM.field_username);
      paramString.putExtra("finish_direct", true);
      com.tencent.mm.bp.d.f(this.context, ".ui.chatting.ChattingUI", paramString);
      AppMethodBeat.o(136323);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ("contact_info_downloader_manager".equals(paramString))
      {
        ((com.tencent.mm.plugin.downloader_app.a.d)g.K(com.tencent.mm.plugin.downloader_app.a.d.class)).a(this.context, null, null);
        AppMethodBeat.o(136323);
        bool = true;
      }
      else if ("contact_info_common_problem".equals(paramString))
      {
        paramString = new Intent();
        paramString.putExtra("KPublisherId", "custom_menu");
        paramString.putExtra("pre_username", this.ehM.field_username);
        paramString.putExtra("prePublishId", "custom_menu");
        paramString.putExtra("preUsername", this.ehM.field_username);
        paramString.putExtra("preChatName", this.ehM.field_username);
        paramString.putExtra("preChatTYPE", u.ad(this.ehM.field_username, this.ehM.field_username));
        paramString.putExtra("rawUrl", "https://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=wechat_movement_faq/index");
        paramString.putExtra("geta8key_username", this.ehM.field_username);
        paramString.putExtra("from_scence", 1);
        com.tencent.mm.bp.d.b(this.context, "webview", ".ui.tools.WebViewUI", paramString);
        AppMethodBeat.o(136323);
        bool = true;
      }
      else
      {
        if ("contact_info_top_downloader".equals(paramString))
        {
          if (this.kRl.isChecked())
            t.w(this.ehM.field_username, true);
          while (true)
          {
            AppMethodBeat.o(136323);
            bool = true;
            break;
            t.x(this.ehM.field_username, true);
          }
        }
        if ("contact_info_not_disturb".equals(paramString))
        {
          if (this.kRm.isChecked())
            t.o(this.ehM);
          while (true)
          {
            AppMethodBeat.o(136323);
            bool = true;
            break;
            t.p(this.ehM);
          }
        }
        if ("contact_info_clear_data".equals(paramString))
        {
          h.d(this.context, this.context.getString(2131298491), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.1(this), null);
          AppMethodBeat.o(136323);
          bool = true;
        }
        else if ("contact_info_downloader_install".equals(paramString))
        {
          s(this.context, true);
          AppMethodBeat.o(136323);
          bool = true;
        }
        else
        {
          if ("contact_info_downloader_uninstall".equals(paramString))
          {
            if (((com.tencent.mm.plugin.downloader_app.a.d)g.K(com.tencent.mm.plugin.downloader_app.a.d.class)).bix())
              h.d(this.context, this.context.getString(2131298963), this.context.getString(2131298964), this.context.getString(2131298962), this.context.getString(2131298948), new a.2(this), new a.3(this));
            while (true)
            {
              AppMethodBeat.o(136323);
              bool = true;
              break;
              h.d(this.context, this.context.getString(2131303217), "", this.context.getString(2131296871), this.context.getString(2131296868), new a.4(this), null);
            }
          }
          bool = false;
          AppMethodBeat.o(136323);
        }
      }
    }
  }

  public final boolean a(f paramf, ad paramad, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(136322);
    this.ehK = paramf;
    this.ehM = paramad;
    paramf.addPreferencesFromResource(2131165204);
    this.kRl = ((CheckBoxPreference)paramf.aqO("contact_info_top_downloader"));
    this.kRm = ((CheckBoxPreference)paramf.aqO("contact_info_not_disturb"));
    biW();
    AppMethodBeat.o(136322);
    return true;
  }

  public final boolean biV()
  {
    return true;
  }

  final void biW()
  {
    AppMethodBeat.i(136324);
    Object localObject = (HelperHeaderPreference)this.ehK.aqO("contact_info_header_helper");
    ((HelperHeaderPreference)localObject).ay(this.ehM.field_username, this.ehM.Oj(), this.context.getString(2131298942));
    this.enable = r.YZ();
    int i;
    boolean bool;
    if (this.enable)
    {
      i = 1;
      ((HelperHeaderPreference)localObject).sd(i);
      this.ehK.ce("contact_info_downloader_install", this.enable);
      localObject = this.ehK;
      if (this.enable)
        break label306;
      bool = true;
      label97: ((f)localObject).ce("contact_info_downloader_uninstall", bool);
      localObject = this.ehK;
      if (this.enable)
        break label311;
      bool = true;
      label120: ((f)localObject).ce("contact_info_go_to_downloader", bool);
      localObject = this.ehK;
      if (this.enable)
        break label316;
      bool = true;
      label143: ((f)localObject).ce("contact_info_downloader_manager", bool);
      this.ehK.ce("contact_info_common_problem", true);
      localObject = this.ehK;
      if (this.enable)
        break label321;
      bool = true;
      label178: ((f)localObject).ce("contact_info_top_downloader", bool);
      localObject = this.ehK;
      if (this.enable)
        break label326;
      bool = true;
      label201: ((f)localObject).ce("contact_info_not_disturb", bool);
      localObject = this.ehK;
      if (this.enable)
        break label331;
      bool = true;
      label224: ((f)localObject).ce("contact_info_clear_data", bool);
      if (!this.enable)
        break label355;
      if (!((j)g.K(j.class)).XR().aph(this.ehM.field_username))
        break label336;
      this.kRl.uOT = true;
      label277: if (!this.ehM.DX())
        break label347;
      this.kRm.uOT = true;
      AppMethodBeat.o(136324);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label306: bool = false;
      break label97;
      label311: bool = false;
      break label120;
      label316: bool = false;
      break label143;
      label321: bool = false;
      break label178;
      label326: bool = false;
      break label201;
      label331: bool = false;
      break label224;
      label336: this.kRl.uOT = false;
      break label277;
      label347: this.kRm.uOT = false;
      label355: AppMethodBeat.o(136324);
    }
  }

  public final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }

  final void s(Context paramContext, boolean paramBoolean)
  {
    AppMethodBeat.i(136325);
    if (paramBoolean);
    for (Object localObject = paramContext.getString(2131303213); ; localObject = paramContext.getString(2131303221))
    {
      paramContext.getString(2131297061);
      localObject = h.b(paramContext, (String)localObject, true, null);
      g.RS().aa(new a.5(this, paramBoolean, (ProgressDialog)localObject, paramContext));
      AppMethodBeat.o(136325);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.e.a
 * JD-Core Version:    0.6.2
 */