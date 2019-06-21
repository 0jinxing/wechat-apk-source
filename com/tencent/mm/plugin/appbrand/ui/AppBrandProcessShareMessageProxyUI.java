package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.ce;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.widget.a.c;
import java.util.HashMap;

@a(7)
public class AppBrandProcessShareMessageProxyUI extends MMActivity
{
  private c iHe;
  private AppBrandProcessShareMessageProxyUI.a iHf;

  public void finish()
  {
    AppMethodBeat.i(133023);
    super.finish();
    overridePendingTransition(0, 0);
    AppMethodBeat.o(133023);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(133022);
    super.onCreate(paramBundle);
    overridePendingTransition(0, 0);
    n.a(getWindow());
    n.a(getWindow(), false);
    getWindow().setBackgroundDrawable(new ColorDrawable(0));
    if (getIntent() == null)
    {
      finish();
      AppMethodBeat.o(133022);
      return;
    }
    paramBundle = getIntent().getStringExtra("key_dialog_touser");
    if (bo.isNullOrNil(paramBundle));
    for (int i = 0; ; i = 1)
    {
      if (i == 0)
        finish();
      AppMethodBeat.o(133022);
      break;
      Object localObject1 = (HashMap)getIntent().getSerializableExtra("key_dialog_params");
      i = ce.getInt(((HashMap)localObject1).get("type"), 1);
      String str1 = ce.e(((HashMap)localObject1).get("title"), "");
      Object localObject2 = ce.e(((HashMap)localObject1).get("img_url"), null);
      if ((i == 2) || (i == 3))
      {
        int j = ce.getInt(((HashMap)localObject1).get("pkg_type"), 0);
        i = ce.getInt(((HashMap)localObject1).get("pkg_version"), 0);
        String str2 = ce.e(((HashMap)localObject1).get("app_id"), null);
        String str3 = ce.e(((HashMap)localObject1).get("cache_key"), null);
        String str4 = ce.e(((HashMap)localObject1).get("path"), null);
        String str5 = ce.e(((HashMap)localObject1).get("delay_load_img_path"), null);
        boolean bool = ce.bc(((HashMap)localObject1).get("is_dynamic"));
        View localView = ((com.tencent.mm.modelappbrand.i)g.K(com.tencent.mm.modelappbrand.i.class)).d(this, null);
        String str6 = com.tencent.mm.plugin.appbrand.r.n.bE(this);
        localObject1 = new Bundle();
        ((Bundle)localObject1).putString("app_id", str2);
        ((Bundle)localObject1).putString("msg_id", String.format("%d-%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) }));
        ((Bundle)localObject1).putInt("msg_pkg_type", j);
        ((Bundle)localObject1).putInt("pkg_version", i);
        ((Bundle)localObject1).putString("image_url", (String)localObject2);
        ((Bundle)localObject1).putBoolean("is_dynamic_page", bool);
        ((Bundle)localObject1).putString("title", str1);
        ((Bundle)localObject1).putString("cache_key", str3);
        ((Bundle)localObject1).putString("msg_path", str4);
        ((Bundle)localObject1).putString("delay_load_img_path", str5);
        localObject2 = new AppBrandProcessShareMessageProxyUI.c(this, this);
        ((AppBrandProcessShareMessageProxyUI.c)localObject2).iHn = new AppBrandProcessShareMessageProxyUI.2(this, str6, localView);
        ((com.tencent.mm.modelappbrand.i)g.K(com.tencent.mm.modelappbrand.i.class)).a(str6, localView, (Bundle)localObject1, new AppBrandProcessShareMessageProxyUI.3(this, (AppBrandProcessShareMessageProxyUI.c)localObject2));
        this.iHf = new AppBrandProcessShareMessageProxyUI.a(this);
        this.iHe = ((com.tencent.mm.pluginsdk.i)g.K(com.tencent.mm.pluginsdk.i.class)).a(this, paramBundle, localView, getResources().getString(2131297041), new AppBrandProcessShareMessageProxyUI.4(this, (AppBrandProcessShareMessageProxyUI.c)localObject2));
        this.iHe.setOnDismissListener(this.iHf);
        this.iHe.setOnKeyListener(new AppBrandProcessShareMessageProxyUI.5(this, (AppBrandProcessShareMessageProxyUI.c)localObject2));
        this.iHe.show();
      }
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(133021);
    super.onCreateBeforeSetContentView();
    supportRequestWindowFeature(1);
    AppMethodBeat.o(133021);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(133024);
    super.onDestroy();
    if ((this.iHe != null) && (this.iHe.isShowing()))
    {
      this.iHe.dismiss();
      this.iHe = null;
      this.iHf = null;
    }
    AppMethodBeat.o(133024);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI
 * JD-Core Version:    0.6.2
 */