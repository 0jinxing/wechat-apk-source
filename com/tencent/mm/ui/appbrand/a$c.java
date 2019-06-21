package com.tencent.mm.ui.appbrand;

import android.content.Intent;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.WxaExposedParams;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.l;

public class a$c
  implements a.h
{
  public a$c(a parama)
  {
  }

  public void a(l paraml)
  {
  }

  public View dzm()
  {
    return null;
  }

  public void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    paramInt = 0;
    AppMethodBeat.i(29934);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    }
    while (true)
    {
      if (paramInt != 0)
        this.yrl.irC.cpE();
      AppMethodBeat.o(29934);
      return;
      al.n(new a.c.1(this), 100L);
      paramInt = 1;
      continue;
      al.n(new a.c.2(this), 100L);
      paramInt = 1;
      continue;
      this.yrl.irC.cpE();
      paramInt = 1;
      continue;
      if (!bo.isNullOrNil(this.yrl.username))
      {
        b.k(this.yrl.context, this.yrl.username, true);
        if (this.yrl.jnK)
        {
          a.a(this.yrl, 6);
          paramInt = 1;
        }
        else
        {
          this.yrl.he(this.yrl.scene, 4);
          paramInt = 1;
          continue;
          if (!bo.isNullOrNil(this.yrl.username))
          {
            b.k(this.yrl.context, this.yrl.username, false);
            if (this.yrl.jnK)
            {
              a.a(this.yrl, 1);
              paramInt = 1;
              continue;
            }
            this.yrl.he(this.yrl.scene, 2);
            paramInt = 1;
            continue;
            a locala = this.yrl;
            paramMenuItem = this.yrl.context;
            Object localObject = this.yrl.iIa;
            if (localObject == null)
            {
              ab.e("MicroMsg.AppBrandServiceActionSheet", "exportUrlParams is null");
              paramInt = 1;
              continue;
            }
            ab.i("MicroMsg.AppBrandServiceActionSheet", "exportUrlParams : %s", new Object[] { ((WxaExposedParams)localObject).toString() });
            if (!bo.isNullOrNil(((WxaExposedParams)localObject).username))
            {
              localIntent = new Intent();
              localIntent.putExtra("key_username", ((WxaExposedParams)localObject).username);
              localIntent.putExtra("key_from_scene", 4);
              localIntent.putExtra("key_scene_exposed_params", (Parcelable)localObject);
              com.tencent.mm.bp.d.b(paramMenuItem, "appbrand", ".ui.AppBrandProfileUI", localIntent);
              locala.he(locala.scene, 1);
            }
            paramInt = 1;
            continue;
            locala = this.yrl;
            Intent localIntent = new Intent();
            String str = locala.iIa.appId;
            localObject = locala.iIa.pageId;
            if (locala.iIa.appId.equals(locala.getAppId()));
            for (paramMenuItem = ""; ; paramMenuItem = locala.getAppId())
            {
              paramMenuItem = a.aE(str, (String)localObject, paramMenuItem);
              ab.v("MicroMsg.AppBrandServiceActionSheet", "KRawUrl ".concat(String.valueOf(paramMenuItem)));
              localIntent.putExtra("rawUrl", paramMenuItem);
              localIntent.putExtra("forceHideShare", true);
              com.tencent.mm.bp.d.b(locala.context, "webview", ".ui.tools.WebViewUI", localIntent);
              paramInt = 1;
              break;
            }
          }
        }
      }
      else
      {
        paramInt = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.appbrand.a.c
 * JD-Core Version:    0.6.2
 */