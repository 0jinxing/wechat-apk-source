package com.tencent.mm.plugin.sns.ui.d;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.storage.o;
import com.tencent.mm.plugin.sns.ui.SnsPermissionUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class b$2$2
  implements n.d
{
  b$2$2(b.2 param2, n paramn, String paramString1, String paramString2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    long l = 0L;
    AppMethodBeat.i(40241);
    switch (paramMenuItem.getItemId())
    {
    default:
      AppMethodBeat.o(40241);
    case 0:
    case 1:
    }
    Intent localIntent;
    while (true)
    {
      return;
      paramMenuItem = new Intent();
      if (this.rKv == null);
      while (true)
      {
        paramMenuItem.putExtra("sns_permission_snsinfo_svr_id", l);
        paramMenuItem.putExtra("sns_permission_userName", this.eiH);
        paramMenuItem.putExtra("sns_permission_anim", true);
        paramMenuItem.putExtra("sns_permission_block_scene", 5);
        paramMenuItem.setClass(this.rKu.rKt.activity, SnsPermissionUI.class);
        this.rKu.rKt.activity.startActivityForResult(paramMenuItem, 11);
        AppMethodBeat.o(40241);
        break;
        l = this.rKv.field_snsId;
      }
      localIntent = new Intent();
      paramMenuItem = af.cnF().YT(this.rKw);
      if (paramMenuItem != null)
        break;
      ab.i("MicroMsg.TimelineClickListener", "error get snsinfo by id " + this.rKw);
      AppMethodBeat.o(40241);
    }
    ab.i("MicroMsg.TimelineClickListener", "expose id " + paramMenuItem.cqA() + " " + paramMenuItem.field_userName);
    if (paramMenuItem == null)
    {
      label240: localIntent.putExtra("k_expose_msg_id", l);
      if (paramMenuItem != null)
        break label329;
    }
    label329: for (paramMenuItem = ""; ; paramMenuItem = paramMenuItem.field_userName)
    {
      localIntent.putExtra("k_username", paramMenuItem);
      localIntent.putExtra("showShare", false);
      localIntent.putExtra("rawUrl", String.format("https://weixin110.qq.com/security/readtemplate?t=weixin_report/w_type&scene=%d#wechat_redirect", new Object[] { Integer.valueOf(33) }));
      d.b(this.rKu.rKt.activity, "webview", ".ui.tools.WebViewUI", localIntent);
      break;
      l = paramMenuItem.field_snsId;
      break label240;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.d.b.2.2
 * JD-Core Version:    0.6.2
 */