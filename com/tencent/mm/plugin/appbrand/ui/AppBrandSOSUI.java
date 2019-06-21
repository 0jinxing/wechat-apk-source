package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSMoreWebViewUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.lang.reflect.Field;
import java.util.List;

public class AppBrandSOSUI extends FTSSOSMoreWebViewUI
{
  private View iIv;
  private String iIw;
  private String iIx;
  private int scene;

  private int aMp()
  {
    int i = 0;
    AppMethodBeat.i(17079);
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int j = bo.getInt(localClass.getField("status_bar_height").get(localObject).toString(), 0);
      j = getResources().getDimensionPixelSize(j);
      i = j;
      label52: AppMethodBeat.o(17079);
      return i;
    }
    catch (Exception localException)
    {
      break label52;
    }
  }

  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(17077);
    if (!TextUtils.isEmpty(paramString2))
      this.iIv.setVisibility(8);
    try
    {
      this.icy.g(10001, null);
      super.a(paramString1, paramString2, paramList, paramb);
      AppMethodBeat.o(17077);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        ab.e("MicroMsg.AppBrandSOSUI", "refresh keyword id error : %s", new Object[] { localRemoteException });
    }
  }

  public final boolean aMo()
  {
    AppMethodBeat.i(17076);
    this.iIv.setVisibility(8);
    boolean bool = super.aMo();
    AppMethodBeat.o(17076);
    return bool;
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(17078);
    super.dealContentView(paramView);
    this.iIw = getIntent().getStringExtra("key_nearby_url");
    getIntent().getStringExtra("key_nearby_list_id");
    this.iIv = getLayoutInflater().inflate(2130968730, (ViewGroup)paramView, false);
    Object localObject = this.iIv.findViewById(2131821365);
    ((View)localObject).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(17073);
        if (TextUtils.isEmpty(AppBrandSOSUI.a(AppBrandSOSUI.this)))
          AppMethodBeat.o(17073);
        while (true)
        {
          return;
          Intent localIntent = new Intent();
          localIntent.putExtra("showShare", false);
          localIntent.putExtra("rawUrl", AppBrandSOSUI.a(AppBrandSOSUI.this));
          localIntent.putExtra("geta8key_scene", 41);
          localIntent.putExtra("show_long_click_popup_menu", false);
          com.tencent.mm.bp.d.b(paramAnonymousView.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
          AppMethodBeat.o(17073);
        }
      }
    });
    if (TextUtils.isEmpty(this.iIw))
    {
      ((View)localObject).setVisibility(8);
      this.iIv.setVisibility(8);
    }
    while ((paramView instanceof FrameLayout))
    {
      ((FrameLayout)paramView).addView(this.iIv);
      AppMethodBeat.o(17078);
      return;
      ((View)localObject).setVisibility(0);
      this.iIv.setVisibility(0);
    }
    localObject = paramView.getLayoutParams();
    View localView1;
    int i;
    int m;
    if (getWindow().hasFeature(9))
    {
      localView1 = this.iIv;
      i = this.iIv.getPaddingLeft();
      paramView = new Rect();
      int j = getActionBarHeight();
      View localView2 = getWindow().getDecorView();
      localView2.getWindowVisibleDisplayFrame(paramView);
      int k = localView2.getHeight();
      int[] arrayOfInt = new int[2];
      localView2.getLocationOnScreen(arrayOfInt);
      m = j;
      if (k == 0)
        m = j + aMp();
      if ((k - paramView.height() < 0) || (arrayOfInt[1] <= 200))
        break label317;
      m += k - paramView.height();
    }
    while (true)
    {
      localView1.setPadding(i, m + this.iIv.getPaddingTop(), this.iIv.getPaddingRight(), this.iIv.getPaddingBottom());
      addContentView(this.iIv, (ViewGroup.LayoutParams)localObject);
      AppMethodBeat.o(17078);
      break;
      label317: m += paramView.top;
    }
  }

  public final String getHint()
  {
    AppMethodBeat.i(17080);
    String str = getIntent().getStringExtra("key_search_place_holder");
    if ((str != null) && (str.length() > 0))
      AppMethodBeat.o(17080);
    while (true)
    {
      return str;
      str = super.getHint();
      AppMethodBeat.o(17080);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17074);
    super.onCreate(paramBundle);
    overridePendingTransition(2131034216, 0);
    this.iIx = getIntent().getStringExtra("key_session_id");
    this.scene = getIntent().getIntExtra("ftsbizscene", 0);
    ab.i("MicroMsg.AppBrandSOSUI", "onCreate oreh report weAppSearchClickStream(13929) statSessionId:%s", new Object[] { this.iIx });
    h.pYm.e(13929, new Object[] { this.iIx, "", Integer.valueOf(1), Integer.valueOf(this.scene) });
    paramBundle = new Intent();
    paramBundle.putExtra("key_session_id", this.iIx);
    paramBundle.putExtra("ftsbizscene", this.scene);
    setResult(-1, paramBundle);
    AppMethodBeat.o(17074);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17075);
    if ((this.scene == 3) || (this.scene == 16))
      h.pYm.e(13929, new Object[] { this.iIx, b.fpE, Integer.valueOf(2), Integer.valueOf(this.scene) });
    super.onDestroy();
    AppMethodBeat.o(17075);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandSOSUI
 * JD-Core Version:    0.6.2
 */