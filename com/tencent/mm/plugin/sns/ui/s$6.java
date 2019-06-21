package com.tencent.mm.plugin.sns.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.model.an;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.bau;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class s$6
  implements n.d
{
  s$6(s params, com.tencent.mm.plugin.sns.storage.n paramn, bau parambau, int paramInt)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(38256);
    paramInt = paramMenuItem.getItemId();
    ab.d("MicroMsg.GalleryTitleManager", "showAlert ".concat(String.valueOf(paramInt)));
    switch (paramInt)
    {
    case 5:
    default:
    case 6:
    case 8:
    case 3:
    case 2:
    case 4:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(38256);
      while (true)
      {
        return;
        if ((this.rjt == null) || (this.rjt.cqu().xfI == null))
          break;
        s.a(this.rjs, this.rjt, this.qIs);
        AppMethodBeat.o(38256);
        continue;
        s.a(this.rjs, this.rjt, this.qIs, this.sN);
        AppMethodBeat.o(38256);
        continue;
        if ((this.rjt == null) || (this.rjt.cqu().xfI == null))
          break;
        if (this.rjt.cqu().xfI.wbJ == 1)
        {
          paramMenuItem = an.fZ(af.getAccSnsPath(), this.qIs.Id) + i.l(this.qIs);
          this.rjs.Zw(paramMenuItem);
          AppMethodBeat.o(38256);
        }
        else
        {
          s.Zy(this.rjt.cqU());
          AppMethodBeat.o(38256);
          continue;
          if ((this.rjt == null) || (this.rjt.cqu().xfI == null))
            break;
          if (this.rjt.field_type != 15)
          {
            com.tencent.mm.pluginsdk.ui.tools.n.j(an.fZ(af.getAccSnsPath(), this.qIs.Id) + i.l(this.qIs), this.rjs.context);
            AppMethodBeat.o(38256);
          }
          else
          {
            s.Zx(this.rjt.cqU());
            AppMethodBeat.o(38256);
            continue;
            s locals = this.rjs;
            long l = this.rjt.field_snsId;
            paramMenuItem = af.cnF().kD(l);
            if ((l == 0L) || (paramMenuItem == null))
            {
              AppMethodBeat.o(38256);
            }
            else
            {
              Intent localIntent = new Intent();
              localIntent.putExtra("k_username", paramMenuItem.field_userName);
              localIntent.putExtra("k_expose_msg_id", l);
              localIntent.putExtra("showShare", false);
              localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
              d.b(locals.context, "webview", ".ui.tools.WebViewUI", localIntent);
              AppMethodBeat.o(38256);
            }
          }
        }
      }
      paramMenuItem = new Bundle();
      paramMenuItem.putString("stat_msg_id", "sns_" + i.jV(this.rjt.field_snsId));
      paramMenuItem.putString("stat_send_msg_user", this.rjt.field_userName);
      paramMenuItem.putInt("stat_scene", 3);
      s.a(this.rjs, paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.s.6
 * JD-Core Version:    0.6.2
 */