package com.tencent.mm.plugin.appbrand.jsapi.auth;

import a.f.b.j;
import a.l;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.d;
import com.tencent.mm.ah.e;
import com.tencent.mm.ah.e.c;
import com.tencent.mm.ah.o;
import com.tencent.mm.plugin.appbrand.widget.b.h;
import com.tencent.mm.plugin.appbrand.widget.b.h.b;
import com.tencent.mm.plugin.appbrand.widget.b.h.c;
import java.util.ArrayList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/auth/AuthorizeHelper$Companion;", "", "()V", "SCOPE_USER_INFO", "", "TAG", "getHeadIconPath", "", "username", "callback", "Lcom/tencent/mm/plugin/appbrand/jsapi/auth/AuthorizeHelper$GetHeadIconPathCallback;", "setUserInfoListData", "context", "Landroid/content/Context;", "bitmap", "Landroid/graphics/Bitmap;", "userNickName", "scope", "dialog", "Lcom/tencent/mm/plugin/appbrand/widget/dialog/AppBrandRequestDialog;", "plugin-appbrand-integration_release"})
public final class e$a
{
  public static void a(Context paramContext, Bitmap paramBitmap, String paramString1, String paramString2, h paramh)
  {
    AppMethodBeat.i(134659);
    j.p(paramContext, "context");
    j.p(paramh, "dialog");
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new h.b(paramString1, paramContext.getResources().getString(2131297092), paramString2, paramBitmap, (byte)0));
    paramContext = (List)localArrayList;
    if (!paramContext.isEmpty())
    {
      paramh.jcy = new h.c(paramContext);
      paramh.iJP.setAdapter((RecyclerView.a)paramh.jcy);
      paramh.jct.setVisibility(0);
      paramh.jcq.setVisibility(8);
      paramh.jcv.setVisibility(8);
      paramh.jcu.setVisibility(8);
    }
    AppMethodBeat.o(134659);
  }

  public static void a(String paramString, e.b paramb)
  {
    AppMethodBeat.i(134658);
    j.p(paramString, "username");
    o.acd();
    if (d.qe(paramString))
    {
      o.acd();
      String str = d.C(paramString, false);
      paramString = str;
      if (str == null)
        paramString = "";
      paramb.AQ(paramString);
      AppMethodBeat.o(134658);
    }
    while (true)
    {
      return;
      new e().a(paramString, (e.c)new e.a.a(paramb, paramString));
      AppMethodBeat.o(134658);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.auth.e.a
 * JD-Core Version:    0.6.2
 */