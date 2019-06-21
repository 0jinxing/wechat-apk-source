package com.tencent.mm.plugin.appbrand.menu;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.jsapi.version.JsApiUpdateApp;
import com.tencent.mm.plugin.appbrand.o;
import com.tencent.mm.plugin.appbrand.page.w;
import com.tencent.mm.plugin.appbrand.s;
import com.tencent.mm.plugin.appbrand.task.b;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.base.n.d;
import java.io.File;
import org.json.JSONObject;

final class d$2
  implements n.d
{
  d$2(d paramd, w paramw, Context paramContext)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(132204);
    switch (paramMenuItem.getItemId())
    {
    case 5:
    default:
      AppMethodBeat.o(132204);
    case 1:
    case 2:
    case 7:
    case 3:
    case 8:
    case 4:
      while (true)
      {
        return;
        paramMenuItem = new JsApiUpdateApp();
        Object localObject = this.hIw.atK();
        new JSONObject();
        paramMenuItem.a((s)localObject, 10000);
        AppMethodBeat.o(132204);
        continue;
        switch (paramMenuItem.getItemId())
        {
        default:
          paramMenuItem = "wxfile://";
        case 2:
        case 7:
        }
        while (true)
        {
          paramMenuItem = this.hIw.asE().Z(paramMenuItem, true).getAbsolutePath();
          Toast.makeText(this.val$context, this.val$context.getString(2131305806, new Object[] { paramMenuItem }), 0).show();
          paramMenuItem = ClipData.newPlainText("text", paramMenuItem);
          ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setPrimaryClip(paramMenuItem);
          AppMethodBeat.o(132204);
          break;
          paramMenuItem = "wxfile://usr";
          continue;
          paramMenuItem = "wxfile://opendata";
        }
        paramMenuItem = ClipData.newPlainText("text", this.hIw.getAppId());
        ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setPrimaryClip(paramMenuItem);
        Toast.makeText(this.val$context, this.val$context.getString(2131305802, new Object[] { this.hIw.getAppId() }), 1).show();
        AppMethodBeat.o(132204);
        continue;
        localObject = this.hIw.getRuntime().atI().username;
        paramMenuItem = ClipData.newPlainText("text", (CharSequence)localObject);
        ((ClipboardManager)ah.getContext().getSystemService("clipboard")).setPrimaryClip(paramMenuItem);
        Toast.makeText(this.val$context, this.val$context.getString(2131305809, new Object[] { localObject }), 1).show();
        AppMethodBeat.o(132204);
        continue;
        this.hIw.getContentView().postDelayed(new d.2.1(this), 1000L);
        AppMethodBeat.o(132204);
      }
    case 6:
    }
    if (b.aLG())
      b.aLI();
    while (true)
    {
      paramMenuItem.setTitle(this.val$context.getString(2131305803) + String.format("(cur:%b)", new Object[] { Boolean.valueOf(b.aLG()) }));
      Toast.makeText(this.val$context, "Restart Wechat!!", 1).show();
      break;
      b.aLH();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.menu.d.2
 * JD-Core Version:    0.6.2
 */