package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.w;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.ad;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.i;
import com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.m;
import com.tencent.mm.protocal.protobuf.adw;
import com.tencent.mm.protocal.protobuf.adx;
import com.tencent.mm.protocal.protobuf.akz;
import com.tencent.mm.protocal.protobuf.ala;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(3)
public class SnsAdNativeLandingPagesPreviewUI extends MMActivity
{
  private static boolean f(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(38609);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && (ad.YK(paramString)))
    {
      paramString = ad.YL(paramString);
      if (bo.isNullOrNil(paramString))
      {
        bool = false;
        AppMethodBeat.o(38609);
      }
    }
    while (true)
    {
      return bool;
      paramIntent.putExtra("sns_landing_pages_xml", "");
      paramIntent.putExtra("sns_landing_pages_too_large_xml_path", paramString);
      bool = true;
      AppMethodBeat.o(38609);
    }
  }

  private boolean g(Intent paramIntent, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(38610);
    if (i.YO(paramString))
    {
      paramIntent.setClass(this, SnsAdNativeLandingPagesUI.class);
      startActivity(paramIntent);
      finish();
      if (paramIntent.getBooleanExtra("sns_landing_pages_need_enter_and_exit_animation", false))
      {
        overridePendingTransition(0, 0);
        AppMethodBeat.o(38610);
      }
    }
    while (true)
    {
      return bool;
      overridePendingTransition(2131034265, 2131034262);
      break;
      ab.i("SnsAdNativeLandingPagesPreviewUI", "unknown canvas goto webview, ".concat(String.valueOf(paramString)));
      int i = paramString.indexOf("<shareWebUrl>");
      if (i >= 0)
      {
        int j = paramString.indexOf("</shareWebUrl>");
        if (j > i + 13)
        {
          paramString = paramString.substring(i + 13, j);
          paramIntent = new Intent();
          paramIntent.putExtra("rawUrl", paramString);
          paramIntent.putExtra("showShare", true);
          d.b(this, "webview", ".ui.tools.WebViewUI", paramIntent);
          finish();
          overridePendingTransition(2131034265, 2131034262);
          AppMethodBeat.o(38610);
        }
      }
      else
      {
        AppMethodBeat.o(38610);
        bool = false;
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130970734;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(38608);
    super.onCreate(paramBundle);
    ad.ac(this);
    Intent localIntent = getIntent();
    if (localIntent == null)
    {
      finish();
      AppMethodBeat.o(38608);
    }
    while (true)
    {
      return;
      Object localObject = localIntent.getStringExtra("sns_landing_pages_xml");
      int i;
      label52: long l;
      String str1;
      String str2;
      if (localIntent.hasExtra("sns_landing_pages_canvasid"))
      {
        i = 1;
        l = localIntent.getLongExtra("sns_landing_pages_pageid", 0L);
        str1 = localIntent.getStringExtra("sns_landing_pages_canvasid");
        str2 = localIntent.getStringExtra("sns_landing_pages_canvas_ext");
        if (!TextUtils.isEmpty((CharSequence)localObject))
          break label290;
        paramBundle = (Bundle)localObject;
        if (localIntent.getIntExtra("sns_landing_pages_no_store", 0) != 1)
        {
          if (i != 1)
            break label276;
          paramBundle = m.cqn().j(str1, str2, 0, 0);
          label116: localIntent.putExtra("sns_landing_pages_xml", paramBundle);
        }
        label124: if (!TextUtils.isEmpty(paramBundle))
          break label433;
        localObject = findViewById(2131821219);
        ((View)localObject).setVisibility(0);
        paramBundle = new b.a();
        if ((i != 0) || (l <= 0L))
          break label312;
        ab.i("SnsAdNativeLandingPagesPreviewUI", "intent without canvas xml, pageId:%d", new Object[] { Long.valueOf(l) });
        paramBundle.fsJ = new adw();
        paramBundle.fsK = new adx();
        paramBundle.uri = "/cgi-bin/mmoc-bin/adplayinfo/get_adcanvasinfo";
        paramBundle.fsI = 1286;
        paramBundle = paramBundle.acD();
        ((adw)paramBundle.fsG.fsP).wlV = l;
      }
      while (true)
      {
        w.a(paramBundle, new SnsAdNativeLandingPagesPreviewUI.1(this, (View)localObject, i, str1, str2, l, localIntent), false, this);
        AppMethodBeat.o(38608);
        break;
        i = 0;
        break label52;
        label276: paramBundle = m.cqn().n(l, 0, 0);
        break label116;
        label290: paramBundle = (Bundle)localObject;
        if (f(localIntent, (String)localObject))
          break label124;
        finish();
        AppMethodBeat.o(38608);
        break;
        label312: if ((i != 1) || (bo.isNullOrNil(str1)))
          break label413;
        ab.i("SnsAdNativeLandingPagesPreviewUI", "intent without canvas xml, canvasId:%s", new Object[] { str1 });
        paramBundle.fsJ = new akz();
        paramBundle.fsK = new ala();
        paramBundle.uri = "/cgi-bin/mmux-bin/wxaapp/mmuxwxa_getofficialcanvasinfo";
        paramBundle.fsI = 1890;
        paramBundle = paramBundle.acD();
        akz localakz = (akz)paramBundle.fsG.fsP;
        localakz.wqx = str1;
        localakz.wqy = str2;
      }
      label413: ab.e("SnsAdNativeLandingPagesPreviewUI", "intent without canvas xml, or pageId!");
      finish();
      AppMethodBeat.o(38608);
      continue;
      label433: if (g(localIntent, paramBundle))
      {
        AppMethodBeat.o(38608);
      }
      else
      {
        finish();
        AppMethodBeat.o(38608);
      }
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesPreviewUI
 * JD-Core Version:    0.6.2
 */