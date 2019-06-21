package com.tencent.mm.plugin.appbrand.weishi;

import android.content.ContextWrapper;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.q;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.precondition.d;
import com.tencent.mm.plugin.appbrand.launching.precondition.g;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends ContextWrapper
  implements g
{
  private c<q> hAT;
  private int huR;
  private ImageView iTN;

  public a(AppBrandLaunchProxyUI paramAppBrandLaunchProxyUI)
  {
    super(paramAppBrandLaunchProxyUI);
    AppMethodBeat.i(133613);
    this.huR = 0;
    this.hAT = new c()
    {
    };
    AppMethodBeat.o(133613);
  }

  private void cV(String paramString1, String paramString2)
  {
    AppMethodBeat.i(133616);
    ab.i("MicroMsg.AppBrandThumbFromMMProxyUI", "loadThumbImage:%s", new Object[] { paramString1 });
    b.abR().a(new a.2(this, paramString2), paramString1, null, null);
    AppMethodBeat.o(133616);
  }

  public final void E(Intent paramIntent)
  {
    AppMethodBeat.i(133615);
    n.c(((AppBrandLaunchProxyUI)super.getBaseContext()).getWindow(), true);
    Object localObject = ((AppBrandLaunchProxyUI)super.getBaseContext()).getLayoutInflater().inflate(2130968690, null);
    this.iTN = ((ImageView)((View)localObject).findViewById(2131821218));
    ((AppBrandLaunchProxyUI)super.getBaseContext()).setContentView((View)localObject);
    localObject = d.Cn(paramIntent.getStringExtra("extra_entry_token"));
    if (localObject == null)
    {
      finish();
      AppMethodBeat.o(133615);
      return;
    }
    ((d)localObject).setBaseContext((AppBrandLaunchProxyUI)super.getBaseContext());
    if (paramIntent != null)
    {
      localObject = paramIntent.getStringExtra("extra_launch_thumb_url");
      paramIntent = paramIntent.getStringExtra("extra_launch_thumb_path");
      ab.i("MicroMsg.AppBrandThumbFromMMProxyUI", "showLaunchThumb, thumbUrl:%s, thumbPath:%s", new Object[] { localObject, paramIntent });
      if (bo.isNullOrNil((String)localObject))
        break label172;
      cV((String)localObject, "file://".concat(String.valueOf(paramIntent)));
    }
    while (true)
    {
      com.tencent.mm.sdk.b.a.xxA.b(this.hAT);
      AppMethodBeat.o(133615);
      break;
      label172: if (!bo.isNullOrNil(paramIntent))
        cV("file://".concat(String.valueOf(paramIntent)), null);
    }
  }

  public final boolean aHO()
  {
    return false;
  }

  public final void finish()
  {
    AppMethodBeat.i(133614);
    if (((AppBrandLaunchProxyUI)super.getBaseContext() != null) && (!((AppBrandLaunchProxyUI)super.getBaseContext()).isFinishing()))
      ((AppBrandLaunchProxyUI)super.getBaseContext()).finish();
    AppMethodBeat.o(133614);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(133619);
    ab.i("MicroMsg.AppBrandThumbFromMMProxyUI", "onDestroy");
    AppMethodBeat.o(133619);
  }

  public final void onPause()
  {
    AppMethodBeat.i(133618);
    ab.i("MicroMsg.AppBrandThumbFromMMProxyUI", "onPause");
    AppMethodBeat.o(133618);
  }

  public final void onResume()
  {
    AppMethodBeat.i(133617);
    this.huR += 1;
    ab.i("MicroMsg.AppBrandThumbFromMMProxyUI", "onResume, resume count:%d", new Object[] { Integer.valueOf(this.huR) });
    if (this.huR > 1)
    {
      ab.i("MicroMsg.AppBrandThumbFromMMProxyUI", "onResume, finish when resume again");
      finish();
    }
    AppMethodBeat.o(133617);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.a
 * JD-Core Version:    0.6.2
 */