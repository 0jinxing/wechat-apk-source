package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.b;
import com.tencent.mm.plugin.appbrand.r.r;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView;
import com.tencent.mm.plugin.fts.ui.widget.FTSEditTextView.b;
import com.tencent.mm.plugin.fts.ui.widget.a;
import com.tencent.mm.plugin.fts.ui.widget.a.b;
import com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.fts.FTSBaseWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.fts.FTSSearchTabWebViewUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.ae;
import com.tencent.mm.ui.e.l;
import java.lang.reflect.Field;
import java.util.List;

public class AppBrandSearchUI extends FTSSearchTabWebViewUI
{
  private View iIv;
  private String iIw;
  private String iIx;
  private int scene;

  private int aMp()
  {
    int i = 0;
    AppMethodBeat.i(17093);
    try
    {
      Class localClass = Class.forName("com.android.internal.R$dimen");
      Object localObject = localClass.newInstance();
      int j = bo.getInt(localClass.getField("status_bar_height").get(localObject).toString(), 0);
      j = getResources().getDimensionPixelSize(j);
      i = j;
      label52: AppMethodBeat.o(17093);
      return i;
    }
    catch (Exception localException)
    {
      break label52;
    }
  }

  private void aMq()
  {
    AppMethodBeat.i(17086);
    if (this.mIr != null)
    {
      ((ImageView)this.mIr.findViewById(2131820978)).getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
      FTSEditTextView localFTSEditTextView = (FTSEditTextView)this.mIr.findViewById(2131824183);
      localFTSEditTextView.getIconView().setImageResource(2131230910);
      ((ImageButton)localFTSEditTextView.findViewById(2131820976)).getDrawable().setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
      localFTSEditTextView.getEditText().setHintTextColor(getResources().getColor(2131690199));
      localFTSEditTextView.getEditText().setTextColor(-16777216);
      p.b(this);
    }
    AppMethodBeat.o(17086);
  }

  public final void a(String paramString1, String paramString2, List<a.b> paramList, FTSEditTextView.b paramb)
  {
    AppMethodBeat.i(17091);
    if (!TextUtils.isEmpty(paramString2))
      this.iIv.setVisibility(8);
    try
    {
      this.icy.g(10001, null);
      super.a(paramString1, paramString2, paramList, paramb);
      AppMethodBeat.o(17091);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        ab.e("MicroMsg.AppBrandSearchUI", "refresh keyword id error : %s", new Object[] { localRemoteException });
    }
  }

  public final void aMh()
  {
    AppMethodBeat.i(17085);
    super.aMh();
    aMq();
    AppMethodBeat.o(17085);
  }

  public final int aMi()
  {
    AppMethodBeat.i(17088);
    int i;
    if ((Build.VERSION.SDK_INT >= 23) && ((!com.tencent.mm.compatible.util.h.Ms()) || (!AppBrandNearbyWebViewUI.Mt())))
    {
      ae.f(getWindow());
      i = -855310;
      AppMethodBeat.o(17088);
    }
    while (true)
    {
      return i;
      if (Build.VERSION.SDK_INT >= 21)
      {
        i = com.tencent.mm.plugin.appbrand.aa.gQs;
        AppMethodBeat.o(17088);
      }
      else
      {
        i = super.aMi();
        AppMethodBeat.o(17088);
      }
    }
  }

  public final boolean aMo()
  {
    AppMethodBeat.i(17090);
    this.iIv.setVisibility(8);
    boolean bool = super.aMo();
    AppMethodBeat.o(17090);
    return bool;
  }

  public final void dealContentView(View paramView)
  {
    AppMethodBeat.i(17092);
    super.dealContentView(paramView);
    this.iIw = getIntent().getStringExtra("key_nearby_url");
    getIntent().getStringExtra("key_nearby_list_id");
    this.iIv = getLayoutInflater().inflate(2130968730, (ViewGroup)paramView, false);
    Object localObject = this.iIv.findViewById(2131821365);
    ((View)localObject).setOnClickListener(new AppBrandSearchUI.1(this));
    if (TextUtils.isEmpty(this.iIw))
    {
      ((View)localObject).setVisibility(8);
      this.iIv.setVisibility(8);
    }
    while ((paramView instanceof FrameLayout))
    {
      ((FrameLayout)paramView).addView(this.iIv);
      AppMethodBeat.o(17092);
      return;
      ((View)localObject).setVisibility(0);
      this.iIv.setVisibility(0);
    }
    localObject = paramView.getLayoutParams();
    int i;
    Rect localRect;
    int m;
    if (getWindow().hasFeature(9))
    {
      paramView = this.iIv;
      i = this.iIv.getPaddingLeft();
      localRect = new Rect();
      int j = getActionBarHeight();
      View localView = getWindow().getDecorView();
      localView.getWindowVisibleDisplayFrame(localRect);
      int k = localView.getHeight();
      int[] arrayOfInt = new int[2];
      localView.getLocationOnScreen(arrayOfInt);
      m = j;
      if (k == 0)
        m = j + aMp();
      if ((k - localRect.height() < 0) || (arrayOfInt[1] <= 200))
        break label322;
      m += k - localRect.height();
    }
    while (true)
    {
      paramView.setPadding(i, m + this.iIv.getPaddingTop(), this.iIv.getPaddingRight(), this.iIv.getPaddingBottom());
      addContentView(this.iIv, (ViewGroup.LayoutParams)localObject);
      AppMethodBeat.o(17092);
      break;
      label322: m += localRect.top;
    }
  }

  public final String getHint()
  {
    AppMethodBeat.i(17095);
    String str = getIntent().getStringExtra("key_search_place_holder");
    if ((str != null) && (str.length() > 0))
      AppMethodBeat.o(17095);
    while (true)
    {
      return str;
      str = super.getHint();
      AppMethodBeat.o(17095);
    }
  }

  public final void initView()
  {
    AppMethodBeat.i(17084);
    super.initView();
    xE(-855310);
    aMq();
    AppMethodBeat.o(17084);
  }

  public final void j(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(17094);
    super.j(paramInt, paramBundle);
    switch (paramInt)
    {
    default:
    case 142:
    }
    while (true)
    {
      AppMethodBeat.o(17094);
      return;
      String str = paramBundle.getString("fts_key_json_data");
      int i = paramBundle.getInt("fts_key_is_cache_data", 0);
      int j = paramBundle.getInt("fts_key_is_expired", 1);
      paramInt = paramBundle.getInt("fts_key_is_preload", 0);
      this.handler.post(new AppBrandSearchUI.2(this, str, i, j, paramInt));
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(17083);
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      AppMethodBeat.o(17083);
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.websearch.api.aa.HW(r.aLE());
      this.iIx = getIntent().getStringExtra("key_session_id");
      this.scene = getIntent().getIntExtra("ftsbizscene", 0);
      ab.i("MicroMsg.AppBrandSearchUI", "onCreate oreh report weAppSearchClickStream(13929) statSessionId:%s", new Object[] { this.iIx });
      com.tencent.mm.plugin.report.service.h.pYm.e(13929, new Object[] { this.iIx, "", Integer.valueOf(1), Integer.valueOf(this.scene) });
      paramBundle = new Intent();
      paramBundle.putExtra("key_session_id", this.iIx);
      paramBundle.putExtra("ftsbizscene", this.scene);
      setResult(-1, paramBundle);
      if (getIntent().getBooleanExtra("key_alpha_in", false))
        overridePendingTransition(2131034125, 2131034130);
      AppMethodBeat.o(17083);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(17089);
    if ((this.scene == 3) || (this.scene == 16))
      com.tencent.mm.plugin.report.service.h.pYm.e(13929, new Object[] { this.iIx, b.fpE, Integer.valueOf(2), Integer.valueOf(this.scene) });
    super.onDestroy();
    AppMethodBeat.o(17089);
  }

  public void onResume()
  {
    AppMethodBeat.i(17087);
    super.onResume();
    try
    {
      if (((com.tencent.mm.kernel.b.h)g.RM().Rn()).SG())
      {
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        ComponentName localComponentName = new android/content/ComponentName;
        localComponentName.<init>(e.l.iRj, "com.tencent.mm.booter.MMReceivers$ToolsProcessReceiver");
        localIntent.setComponent(localComponentName);
        localIntent.putExtra("tools_process_action_code_key", "com.tencent.mm.intent.ACTION_START_TOOLS_PROCESS");
        sendBroadcast(localIntent);
      }
      AppMethodBeat.o(17087);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        AppMethodBeat.o(17087);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandSearchUI
 * JD-Core Version:    0.6.2
 */