package com.tencent.mm.plugin.subapp.ui.gallery;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.am;
import com.tencent.mm.g.a.bu;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.model.x;
import com.tencent.mm.model.x.b;
import com.tencent.mm.plugin.sns.b.l;
import com.tencent.mm.plugin.sns.b.n;
import com.tencent.mm.plugin.webview.ui.tools.widget.o;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.tools.MMGestureGallery;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class GestureGalleryUI extends MMActivity
  implements x.b
{
  private String flh;
  private String flp;
  private Bundle jWy;
  private boolean jYD;
  private com.tencent.mm.ui.tools.e jYE;
  private ImageView kkl;
  private int kkq;
  private int kkr;
  private int kks;
  private int kkt;
  private ak mHandler;
  private c mip;
  private String riC;
  private c riJ;
  private volatile String riz;
  private int rpA;
  private int rpB;
  private float rpz;
  private GestureGalleryUI.a stS;
  MMGestureGallery stT;
  private String stU;
  private x stV;
  private boolean stW;
  private boolean stX;
  private com.tencent.mm.ui.widget.a.d stY;
  private volatile boolean stZ;
  private int sua;
  private int sub;
  private int suc;
  private final Set<Integer> sud;
  private final Set<Integer> sue;
  private boolean suf;
  private c<bu> sug;
  private List<String> suh;
  private int sui;
  private int suj;
  private boolean suk;
  private AdapterView.OnItemSelectedListener sul;
  private int type;

  public GestureGalleryUI()
  {
    AppMethodBeat.i(25401);
    this.stW = false;
    this.stX = false;
    this.flh = "";
    this.flp = null;
    this.sud = new HashSet();
    this.sue = new HashSet();
    this.suf = false;
    this.jYD = false;
    this.kkq = 0;
    this.kkr = 0;
    this.kks = 0;
    this.kkt = 0;
    this.mHandler = new ak();
    this.sug = new GestureGalleryUI.1(this);
    this.suh = new ArrayList();
    this.type = 0;
    this.sui = -1;
    this.suj = -1;
    this.rpz = 1.0F;
    this.rpA = 0;
    this.rpB = 0;
    this.suk = false;
    this.sul = new GestureGalleryUI.4(this);
    this.mip = new c()
    {
    };
    this.riJ = new GestureGalleryUI.6(this);
    AppMethodBeat.o(25401);
  }

  private static void eY(Context paramContext)
  {
    AppMethodBeat.i(138616);
    if ((Build.VERSION.SDK_INT < 19) || (Build.VERSION.SDK_INT > 22))
      AppMethodBeat.o(138616);
    while (true)
    {
      return;
      InputMethodManager localInputMethodManager = (InputMethodManager)paramContext.getSystemService("input_method");
      if (localInputMethodManager == null)
      {
        AppMethodBeat.o(138616);
        continue;
      }
      int i = 0;
      label55: Object localObject1;
      if (i < 3)
        localObject1 = new String[] { "mCurRootView", "mServedView", "mNextServedView" }[i];
      try
      {
        localObject1 = localInputMethodManager.getClass().getDeclaredField((String)localObject1);
        if (!((Field)localObject1).isAccessible())
          ((Field)localObject1).setAccessible(true);
        Object localObject2 = ((Field)localObject1).get(localInputMethodManager);
        if ((localObject2 != null) && ((localObject2 instanceof View)))
        {
          if (((View)localObject2).getContext() == paramContext)
            ((Field)localObject1).set(localInputMethodManager, null);
        }
        else
        {
          label144: i++;
          break label55;
        }
        AppMethodBeat.o(138616);
        continue;
        AppMethodBeat.o(138616);
      }
      catch (Throwable localThrowable)
      {
        break label144;
      }
    }
  }

  public final void bcW()
  {
    AppMethodBeat.i(25410);
    if ((this.stT.getSelectedItemPosition() != this.suj) || (!this.suf))
    {
      finish();
      overridePendingTransition(0, 0);
      AppMethodBeat.o(25410);
    }
    while (true)
    {
      return;
      if ((!this.suk) && (this.stS != null))
        break;
      ab.i("MicroMsg.GestureGalleryUI", "isRunningExitAnimation");
      AppMethodBeat.o(25410);
    }
    ab.i("MicroMsg.GestureGalleryUI", "runExitAnimation");
    int i = this.stT.getWidth();
    int j = this.stT.getHeight();
    int k = this.stT.getSelectedItemPosition();
    Object localObject = (String)this.suh.get(k);
    if (com.tencent.mm.vfs.e.ct((String)localObject))
    {
      label130: if (bo.isNullOrNil((String)localObject))
        break label411;
      localObject = com.tencent.mm.sdk.platformtools.d.amj((String)localObject);
      float f = i / ((BitmapFactory.Options)localObject).outWidth;
      k = (int)(((BitmapFactory.Options)localObject).outHeight * f);
      j = k;
      if (k > this.stT.getHeight())
      {
        if (k < this.stT.getHeight() * 2.5D)
          this.kkt = (this.stT.getHeight() * this.kkt / k);
        j = this.stT.getHeight();
      }
    }
    label411: 
    while (true)
    {
      this.jYE.hw(i, j);
      this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
      if (this.rpz != 1.0D)
      {
        this.jYE.zEZ = (1.0F / this.rpz);
        if ((this.rpA != 0) || (this.rpB != 0))
        {
          k = (int)(this.stT.getWidth() / 2 * (1.0F - this.rpz));
          i = this.rpA;
          j = (int)(this.stT.getHeight() / 2 + this.rpB - j / 2 * this.rpz);
          this.jYE.hy(k + i, j);
        }
      }
      this.jYE.a(this.stT, this.kkl, new GestureGalleryUI.11(this), null);
      AppMethodBeat.o(25410);
      break;
      localObject = this.stV.c((String)localObject, this.type, k, this.flp);
      break label130;
    }
  }

  public final void d(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(25402);
    if (this.stS != null)
    {
      if (paramInt == this.stT.getSelectedItemPosition())
      {
        this.stU = paramString2;
        ab.d("MicroMsg.GestureGalleryUI", "onDownSucc, curFilename:%s, url:%s", new Object[] { this.stU, paramString1 });
      }
      this.stS.notifyDataSetChanged();
    }
    AppMethodBeat.o(25402);
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(25411);
    boolean bool;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
    {
      ab.d("MicroMsg.GestureGalleryUI", "dispatchKeyEvent");
      bcW();
      bool = true;
      AppMethodBeat.o(25411);
    }
    while (true)
    {
      return bool;
      bool = super.dispatchKeyEvent(paramKeyEvent);
      AppMethodBeat.o(25411);
    }
  }

  public final int getLayoutId()
  {
    return 2130970458;
  }

  public final void initView()
  {
    AppMethodBeat.i(25408);
    String str1 = bo.nullAsNil(getIntent().getStringExtra("nowUrl"));
    this.type = getIntent().getIntExtra("type", 0);
    Object localObject = getIntent().getStringArrayExtra("urlList");
    if ((localObject == null) || (localObject.length == 0))
    {
      localObject = bo.nullAsNil(getIntent().getStringExtra("htmlData"));
      i = 0;
    }
    while (i >= 0)
    {
      int j = ((String)localObject).indexOf("weixin://viewimage/", i);
      if (j >= 0)
      {
        i = ((String)localObject).indexOf("\"", j);
        if (i >= 0)
        {
          String str2 = ((String)localObject).substring(j + 19, i);
          ab.d("MicroMsg.GestureGalleryUI", "start:" + j + " end:" + i + " url:" + str2);
          this.suh.add(str2);
          continue;
          this.suh = Arrays.asList((Object[])localObject);
        }
      }
    }
    for (int i = 0; ; i++)
      if (i < this.suh.size())
      {
        if (str1.equals(this.suh.get(i)))
          this.sui = i;
      }
      else
      {
        this.suj = this.sui;
        setBackBtn(new GestureGalleryUI.7(this));
        this.kkl = ((ImageView)findViewById(2131822079));
        this.kkl.setLayerType(2, null);
        this.stS = new GestureGalleryUI.a(this);
        this.stT = ((MMGestureGallery)findViewById(2131822081));
        this.stT.setVisibility(0);
        this.stT.setVerticalFadingEdgeEnabled(false);
        this.stT.setHorizontalFadingEdgeEnabled(false);
        this.stT.setAdapter(this.stS);
        this.stT.setSelection(this.sui);
        this.stT.setOnItemSelectedListener(this.sul);
        this.stT.setSingleClickOverListener(new GestureGalleryUI.8(this));
        i = getIntent().getIntExtra("nevNext", 1);
        this.stT.setLongClickOverListener(new GestureGalleryUI.9(this, i));
        this.jYE = new com.tencent.mm.ui.tools.e(this);
        AppMethodBeat.o(25408);
        return;
      }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(25403);
    super.onCreate(paramBundle);
    this.jWy = paramBundle;
    this.sug.dnU();
    if (Build.VERSION.SDK_INT >= 21)
    {
      getWindow().setFlags(1024, 1024);
      getWindow().addFlags(67108864);
    }
    fullScreenNoTitleBar(true);
    this.stW = getIntent().getBooleanExtra("isFromWebView", false);
    this.stX = getIntent().getBooleanExtra("isOuntLink", false);
    this.flh = getIntent().getStringExtra("IsFromWebViewReffer");
    this.stZ = getIntent().getBooleanExtra("shouldShowScanQrCodeMenu", false);
    this.suf = getIntent().getBooleanExtra("shouldRunDragAnimation", false);
    this.suc = getIntent().getIntExtra("scanQrCodeGetA8KeyScene", 0);
    paramBundle = getIntent().getIntArrayExtra("scanCodeTypes");
    int i;
    if ((paramBundle != null) && (paramBundle.length > 0))
      for (i = 0; i < paramBundle.length; i++)
        this.sud.add(Integer.valueOf(paramBundle[i]));
    paramBundle = getIntent().getIntArrayExtra("scanResultCodeTypes");
    if ((paramBundle != null) && (paramBundle.length > 0))
      for (i = 0; i < paramBundle.length; i++)
        this.sue.add(Integer.valueOf(paramBundle[i]));
    this.flp = getIntent().getStringExtra("cookie");
    ab.d("MicroMsg.GestureGalleryUI", "isFromWebView: %b, isFromWebViewReffer:%s, cookie = %s", new Object[] { Boolean.valueOf(this.stW), this.flh, this.flp });
    this.stV = new x(this.stW, this.flh);
    paramBundle = this.stV;
    ab.d("MicroMsg.GetPicService", "addListener :" + hashCode());
    paramBundle.flj = this;
    com.tencent.mm.sdk.b.a.xxA.c(this.mip);
    com.tencent.mm.sdk.b.a.xxA.c(this.riJ);
    initView();
    this.suk = false;
    AppMethodBeat.o(25403);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(25404);
    super.onDestroy();
    x localx = this.stV;
    ab.d("MicroMsg.GetPicService", "removeListener :" + hashCode());
    localx.flj = null;
    localx = this.stV;
    if (localx.flf != null)
      localx.flf.fln = true;
    localx.flf = null;
    com.tencent.mm.sdk.b.a.xxA.d(this.mip);
    com.tencent.mm.sdk.b.a.xxA.d(this.riJ);
    this.sug.dead();
    eY(this);
    AppMethodBeat.o(25404);
  }

  public void onPause()
  {
    AppMethodBeat.i(25405);
    super.onPause();
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().setFlags(2048, 2048);
    o.JV(2);
    AppMethodBeat.o(25405);
  }

  public void onResume()
  {
    AppMethodBeat.i(25406);
    super.onResume();
    if (Build.VERSION.SDK_INT >= 21)
      getWindow().clearFlags(2048);
    o.JV(1);
    AppMethodBeat.o(25406);
  }

  public void onStart()
  {
    AppMethodBeat.i(25409);
    Bundle localBundle = this.jWy;
    if ((this.jYD) || (!this.suf));
    while (true)
    {
      super.onStart();
      AppMethodBeat.o(25409);
      return;
      this.jYD = true;
      this.kkq = getIntent().getIntExtra("img_gallery_top", 0);
      this.kkr = getIntent().getIntExtra("img_gallery_left", 0);
      this.kks = getIntent().getIntExtra("img_gallery_width", 0);
      this.kkt = getIntent().getIntExtra("img_gallery_height", 0);
      this.jYE.L(this.kkr, this.kkq, this.kks, this.kkt);
      if (localBundle == null)
        this.stT.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
          public final boolean onPreDraw()
          {
            AppMethodBeat.i(25387);
            GestureGalleryUI.a(GestureGalleryUI.this).getViewTreeObserver().removeOnPreDrawListener(this);
            GestureGalleryUI.d(GestureGalleryUI.this).a(GestureGalleryUI.a(GestureGalleryUI.this), null, null);
            GestureGalleryUI.e(GestureGalleryUI.this);
            AppMethodBeat.o(25387);
            return true;
          }
        });
    }
  }

  public void onStop()
  {
    AppMethodBeat.i(25407);
    super.onStop();
    if (this.riC != null)
    {
      am localam = new am();
      localam.ctA.activity = this;
      localam.ctA.ctB = this.riC;
      com.tencent.mm.sdk.b.a.xxA.m(localam);
      this.riC = null;
      this.sub = 0;
      this.sua = 0;
    }
    AppMethodBeat.o(25407);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.gallery.GestureGalleryUI
 * JD-Core Version:    0.6.2
 */