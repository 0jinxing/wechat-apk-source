package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Display;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.qqmail.b.v.a;
import com.tencent.mm.plugin.qqmail.b.v.c;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.plugin.webview.ui.tools.widget.c;
import com.tencent.mm.plugin.webview.ui.tools.widget.c.a;
import com.tencent.mm.plugin.webview.ui.tools.widget.g.a;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.tools.j;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.vfs.e;
import com.tencent.xweb.WebView;
import com.tencent.xweb.WebView.b;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadMailUI extends MMActivity
  implements View.OnCreateContextMenuListener
{
  private static String pzR = "var mail_css = document.createElement(\"style\");";
  private static String pzS = "";
  private static String pzT = "";
  private static float pzU;
  private static int pzV;
  private long cvx;
  private SharedPreferences ehZ;
  private d ext;
  private ProgressBar gtQ;
  private ak handler;
  private long hxO;
  private String ptI;
  private String ptN;
  private LinearLayout pzA;
  private MailAttachListLinearLayout pzB;
  private View pzC;
  private TextView pzD;
  private TextView pzE;
  private View pzF;
  private long pzG;
  private int pzH;
  private int pzI;
  private String pzJ;
  private String pzK;
  private String pzL;
  private int pzM;
  private String pzN;
  private ap pzO;
  private int pzP;
  private int pzQ;
  private ReadMailProxy pzW;
  private String pzX;
  private int pzY;
  private String pzo;
  private MMWebView pzp;
  private ImageView pzq;
  private TextView pzr;
  private MailAddrsViewControl pzs;
  private MailAddrsViewControl pzt;
  private MailAddrsViewControl pzu;
  private TextView pzv;
  private View pzw;
  private LinearLayout pzx;
  private TextView pzy;
  private TextView pzz;
  private TextView timeTv;

  public ReadMailUI()
  {
    AppMethodBeat.i(68448);
    this.cvx = -1L;
    this.pzG = -1L;
    this.hxO = -1L;
    this.pzM = 0;
    this.pzP = 0;
    this.pzQ = 0;
    this.ext = new d(this);
    AppMethodBeat.o(68448);
  }

  private void Bw(int paramInt)
  {
    AppMethodBeat.i(68463);
    FrameLayout.LayoutParams localLayoutParams = (FrameLayout.LayoutParams)this.pzD.getLayoutParams();
    localLayoutParams.width = paramInt;
    this.pzD.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(68463);
  }

  private void a(v.c paramc)
  {
    AppMethodBeat.i(68459);
    if ((this.ptI == null) || (this.ptI.length() == 0))
    {
      ab.e("MicroMsg.ReadMailUI", "doReadMail invalid argument");
      AppMethodBeat.o(68459);
    }
    while (true)
    {
      return;
      this.pzq.setVisibility(8);
      this.gtQ.setVisibility(0);
      HashMap localHashMap = new HashMap();
      localHashMap.put("mailid", this.ptI);
      localHashMap.put("texttype", "html");
      if ((this.pzG != -1L) && (this.pzG != -2L));
      try
      {
        localObject1 = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
        localObject2 = this.ext;
        localObject3 = new com/tencent/mm/plugin/qqmail/ui/ReadMailUI$a;
        ((a)localObject3).<init>(this, 0);
        ((ReadMailProxy)localObject1).<init>((d)localObject2, (v.a)localObject3);
        ((ReadMailProxy)localObject1).REMOTE_CALL("cancel", new Object[] { Long.valueOf(this.pzG) });
        this.pzo = this.ptI;
        localObject3 = new Bundle();
        paramc.toBundle((Bundle)localObject3);
      }
      catch (Exception localException)
      {
        try
        {
          Object localObject3;
          paramc = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
          Object localObject1 = this.ext;
          Object localObject2 = new com/tencent/mm/plugin/qqmail/ui/ReadMailUI$a;
          ((a)localObject2).<init>(this, 1);
          paramc.<init>((d)localObject1, (v.a)localObject2);
          this.pzG = ((Long)paramc.REMOTE_CALL("get", new Object[] { "/cgi-bin/readmail", localHashMap, localObject3 })).longValue();
          AppMethodBeat.o(68459);
          continue;
          localException = localException;
          ab.w("MicroMsg.ReadMailUI", "cancel, ex = %s", new Object[] { localException.getMessage() });
        }
        catch (Exception paramc)
        {
          ab.w("MicroMsg.ReadMailUI", "doReadMail get fail, ex = %s", new Object[] { paramc.getMessage() });
          AppMethodBeat.o(68459);
        }
      }
    }
  }

  private static String[] b(Map<String, String> paramMap, String paramString, int paramInt)
  {
    AppMethodBeat.i(68458);
    if (paramMap.get(paramString) == null)
    {
      paramMap = null;
      AppMethodBeat.o(68458);
    }
    while (true)
    {
      return paramMap;
      String[] arrayOfString = new String[paramInt];
      int i = 0;
      if (i < paramInt)
      {
        StringBuilder localStringBuilder = new StringBuilder().append(paramString).append(".item");
        if (i > 0);
        for (Object localObject = Integer.valueOf(i); ; localObject = "")
        {
          localObject = localObject;
          arrayOfString[i] = ((String)paramMap.get(new StringBuilder().append((String)localObject).append(".name").toString()) + " " + (String)paramMap.get(new StringBuilder().append((String)localObject).append(".addr").toString()));
          i++;
          break;
        }
      }
      AppMethodBeat.o(68458);
      paramMap = arrayOfString;
    }
  }

  private void cdl()
  {
    AppMethodBeat.i(68449);
    switch (this.pzQ)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(68449);
      while (true)
      {
        return;
        this.pzE.setText(2131302165);
        AppMethodBeat.o(68449);
        continue;
        this.pzE.setText(2131302163);
        AppMethodBeat.o(68449);
        continue;
        this.pzE.setText(2131302164);
        AppMethodBeat.o(68449);
      }
      String str = "";
      if (this.pzY > 99)
        str = "99+";
      while (true)
      {
        if (!bo.isNullOrNil(str))
          break label164;
        this.pzE.setText(2131302166);
        AppMethodBeat.o(68449);
        break;
        if (this.pzY > 0)
          str = Integer.toString(this.pzY);
      }
      label164: this.pzE.setText(String.format(a.an(this, 2131302167), new Object[] { str }));
    }
  }

  private static JsapiPermissionWrapper cdm()
  {
    AppMethodBeat.i(68455);
    Object localObject = new byte[112];
    localObject[25] = ((byte)1);
    localObject[16] = ((byte)1);
    localObject[57] = ((byte)1);
    localObject[63] = ((byte)1);
    localObject[61] = ((byte)1);
    localObject[70] = ((byte)1);
    localObject[68] = ((byte)1);
    localObject[82] = ((byte)1);
    localObject[111] = ((byte)1);
    localObject = new JsapiPermissionWrapper((byte[])localObject);
    AppMethodBeat.o(68455);
    return localObject;
  }

  private void cdn()
  {
    AppMethodBeat.i(68460);
    if ((this.ptI == null) || (this.ptI.length() == 0))
    {
      ab.e("MicroMsg.ReadMailUI", "doSetUnread invalid argument");
      AppMethodBeat.o(68460);
    }
    while (true)
    {
      return;
      HashMap localHashMap = new HashMap();
      localHashMap.put("mailid", this.ptI);
      Object localObject = new v.c();
      ((v.c)localObject).puP = false;
      Bundle localBundle = new Bundle();
      ((v.c)localObject).toBundle(localBundle);
      try
      {
        ReadMailProxy localReadMailProxy = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
        localObject = this.ext;
        a locala = new com/tencent/mm/plugin/qqmail/ui/ReadMailUI$a;
        locala.<init>(this, 2);
        localReadMailProxy.<init>((d)localObject, locala);
        localReadMailProxy.REMOTE_CALL("get", new Object[] { "/cgi-bin/setmailunread", localHashMap, localBundle });
        AppMethodBeat.o(68460);
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.ReadMailUI", "doSetUnread, ex = %s", new Object[] { localException.getMessage() });
        AppMethodBeat.o(68460);
      }
    }
  }

  private boolean cdo()
  {
    AppMethodBeat.i(68461);
    this.pzJ = ((String)new ReadMailProxy(this.ext, null).REMOTE_CALL("getMailAppRedirectUrlAndroid", new Object[0]));
    this.pzX = ((String)new ReadMailProxy(this.ext, null).REMOTE_CALL("getMailAppEnterUlAndroid", new Object[0]));
    try
    {
      Object localObject = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
      ((ReadMailProxy)localObject).<init>(this.ext, null);
      this.pzY = ((Integer)((ReadMailProxy)localObject).REMOTE_CALL("getUneradMailCountFromConfig", new Object[0])).intValue();
      new ReadMailProxy(this.ext, null).REMOTE_CALL("getUnreadMailCount", new Object[0]);
      localObject = (Integer)new ReadMailProxy(this.ext, null).REMOTE_CALL("showMailAppRecommend", new Object[0]);
      if (localObject == null)
      {
        ab.e("MicroMsg.ReadMailUI", "Remote server Proxy not ready");
        AppMethodBeat.o(68461);
        bool = true;
        return bool;
      }
    }
    catch (NullPointerException localNullPointerException)
    {
      while (true)
      {
        boolean bool;
        this.pzY = -1;
        ab.printErrStackTrace("MicroMsg.ReadMailUI", localNullPointerException, "getUneradMailCountFromConfig got an NullPointerException", new Object[0]);
        continue;
        this.pzI = 1;
        this.pzH = localNullPointerException.intValue();
        if (bo.isNullOrNil(this.pzX))
        {
          AppMethodBeat.o(68461);
          bool = true;
        }
        else if (com.tencent.mm.pluginsdk.model.app.p.u(this, "com.tencent.androidqqmail"))
        {
          this.pzQ = 3;
          cdl();
          AppMethodBeat.o(68461);
          bool = true;
        }
        else
        {
          this.ehZ = ah.getContext().getSharedPreferences("QQMAIL", com.tencent.mm.compatible.util.h.Mu());
          if (this.ehZ == null)
          {
            AppMethodBeat.o(68461);
            bool = true;
          }
          else
          {
            this.hxO = this.ehZ.getLong("qqmail_downloadid", -1L);
            this.pzM = ((Integer)new ReadMailProxy(this.ext, null).REMOTE_CALL("getMailAppDownloadStatus", new Object[] { Long.valueOf(this.hxO) })).intValue();
            this.pzN = this.ehZ.getString("qqmail_downloadpath", "");
            if ((this.pzM == 3) && (e.ct(this.pzN)))
            {
              this.pzQ = 2;
              cdl();
              if (this.pzO != null)
                this.pzO.stopTimer();
              AppMethodBeat.o(68461);
              bool = true;
            }
            else if (this.pzH != 1)
            {
              this.pzC.setVisibility(8);
              ab.e("MicroMsg.ReadMailUI", "promote qq mail error:MailAppRecomend = %d", new Object[] { Integer.valueOf(this.pzH) });
              AppMethodBeat.o(68461);
              bool = true;
            }
            else
            {
              AppMethodBeat.o(68461);
              bool = false;
            }
          }
        }
      }
    }
  }

  private void cdp()
  {
    AppMethodBeat.i(68462);
    if (bo.isNullOrNil(this.pzJ))
    {
      ab.e("MicroMsg.ReadMailUI", "mQQMailRedirectUrl = null");
      AppMethodBeat.o(68462);
    }
    while (true)
    {
      return;
      Bw(0);
      ab.i("MicroMsg.ReadMailUI", "status:%d", new Object[] { Integer.valueOf(this.pzM) });
      switch (this.pzM)
      {
      default:
      case 3:
        while (true)
        {
          this.pzQ = 0;
          Bw(0);
          cdl();
          do
          {
            AppMethodBeat.o(68462);
            break;
          }
          while (e.ct(this.pzN));
        }
      case 1:
      case 2:
      }
      this.pzQ = 1;
      cdq();
      cdl();
      AppMethodBeat.o(68462);
    }
  }

  private void cdq()
  {
    AppMethodBeat.i(68464);
    this.pzO = new ap(Looper.getMainLooper(), new ReadMailUI.4(this), true);
    this.pzO.ae(500L, 500L);
    AppMethodBeat.o(68464);
  }

  private void fb(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(68465);
    new ReadMailProxy(this.ext, null).REMOTE_CALL("reportKvState", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(68465);
  }

  public final int getLayoutId()
  {
    return 2130970463;
  }

  public final void initView()
  {
    AppMethodBeat.i(68456);
    this.pzs = ((MailAddrsViewControl)findViewById(2131826848));
    this.pzu = ((MailAddrsViewControl)findViewById(2131826851));
    this.pzt = ((MailAddrsViewControl)findViewById(2131826853));
    this.pzv = ((TextView)findViewById(2131826849));
    this.pzw = findViewById(2131826850);
    this.pzx = ((LinearLayout)findViewById(2131826852));
    this.pzy = ((TextView)findViewById(2131826854));
    this.timeTv = ((TextView)findViewById(2131826855));
    this.pzz = ((TextView)findViewById(2131826856));
    this.pzA = ((LinearLayout)findViewById(2131826857));
    this.pzB = ((MailAttachListLinearLayout)findViewById(2131826859));
    this.gtQ = ((ProgressBar)findViewById(2131826866));
    this.pzq = ((ImageView)findViewById(2131826867));
    this.pzr = ((TextView)findViewById(2131826860));
    this.pzp = g.a.uJj.du(this);
    ((FrameLayout)findViewById(2131826861)).addView(this.pzp);
    this.pzF = findViewById(2131826847);
    this.pzC = findViewById(2131826862);
    this.pzE = ((TextView)findViewById(2131826865));
    this.pzD = ((TextView)findViewById(2131826863));
    this.pzC.setOnClickListener(new ReadMailUI.7(this));
    this.pzv.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(68428);
        if (ReadMailUI.G(ReadMailUI.this).getVisibility() == 8)
        {
          ReadMailUI.H(ReadMailUI.this).setText(2131302156);
          ReadMailUI.G(ReadMailUI.this).setVisibility(0);
          ReadMailUI.G(ReadMailUI.this).post(new ReadMailUI.8.1(this));
          ReadMailUI.h(ReadMailUI.this).setVisibility(0);
          AppMethodBeat.o(68428);
        }
        while (true)
        {
          return;
          ReadMailUI.H(ReadMailUI.this).setText(2131302157);
          ReadMailUI.G(ReadMailUI.this).setVisibility(8);
          ReadMailUI.h(ReadMailUI.this).setVisibility(8);
          AppMethodBeat.o(68428);
        }
      }
    });
    setBackBtn(new ReadMailUI.9(this));
    Object localObject = new DisplayMetrics();
    getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    pzU = ((DisplayMetrics)localObject).widthPixels / ((DisplayMetrics)localObject).scaledDensity;
    pzV = ((DisplayMetrics)localObject).heightPixels;
    this.pzp.getSettings().setDefaultTextEncodingName("utf-8");
    this.pzp.getSettings().setSupportZoom(false);
    this.pzp.getSettings().setBuiltInZoomControls(false);
    this.pzp.getSettings().dUa();
    this.pzp.getSettings().setLoadsImagesAutomatically(false);
    this.pzp.getSettings().setUseWideViewPort(true);
    this.pzp.dKH();
    ((com.tencent.mm.plugin.webview.ui.tools.widget.h)this.pzp).setEmbeddedTitleBarCompat(this.pzF);
    ((com.tencent.mm.plugin.webview.ui.tools.widget.h)this.pzp).setEmbeddedBottomBar(this.pzC);
    localObject = this.mController.ylL.getIntent();
    ((Intent)localObject).putExtra("hardcode_jspermission", cdm());
    this.mController.ylL.setIntent((Intent)localObject);
    this.pzp.setWebViewClient(c.a.uJh.a(this.pzp, true, new ReadMailUI.10(this)));
    if (pzS.equals(""));
    try
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      pzS += bo.convertStreamToString(getAssets().open("mail/lib.js"));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      pzT += bo.convertStreamToString(getAssets().open("mail/readmail.js"));
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      pzR = pzR + "mail_css.innerHTML='" + bo.convertStreamToString(getAssets().open("mail/qmail_webview.css")) + "'; document.head.appendChild(mail_css);";
      registerForContextMenu(this.pzp);
      new j(this).a(this.pzp, this, null);
      AppMethodBeat.o(68456);
      return;
    }
    catch (IOException localIOException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ReadMailUI", localIOException, "", new Object[0]);
        ab.e("MicroMsg.ReadMailUI", "evaluateJavascript error " + localIOException.getMessage());
      }
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(68454);
    if (paramInt2 != -1)
      AppMethodBeat.o(68454);
    while (true)
    {
      return;
      if (paramInt1 == 1)
      {
        ab.d("MicroMsg.ReadMailUI", "USER_DATA_READMAIL onAfterVerify");
        a(new v.c());
        AppMethodBeat.o(68454);
      }
      else
      {
        if (paramInt1 == 2)
        {
          ab.d("MicroMsg.ReadMailUI", "USER_DATA_SETUNREAD onAfterVerify");
          cdn();
        }
        AppMethodBeat.o(68454);
      }
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(68450);
    super.onCreate(paramBundle);
    this.handler = new ak();
    this.cvx = getIntent().getLongExtra("msgid", -1L);
    this.pzH = 0;
    this.pzI = 0;
    initView();
    this.ext.connect(new ReadMailUI.1(this));
    AppMethodBeat.o(68450);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(68457);
    WebView.b localb;
    if ((paramView instanceof WebView))
    {
      localb = ((WebView)paramView).getHitTestResult();
      if ((localb.mType != 5) && (localb.mType != 8));
    }
    while (true)
    {
      try
      {
        ReadMailProxy localReadMailProxy = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
        localReadMailProxy.<init>(this.ext, null);
        bool = ((Boolean)localReadMailProxy.REMOTE_CALL("isSDCardAvailable", new Object[0])).booleanValue();
        if (!bool)
        {
          AppMethodBeat.o(68457);
          return;
        }
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.ReadMailUI", "createContextMenu, isSDCardAvailable, ex = %s", new Object[] { localException.getMessage() });
        boolean bool = false;
        continue;
        paramContextMenu.setHeaderTitle(2131305710);
        paramContextMenu.add(0, 0, 0, getString(2131302711)).setOnMenuItemClickListener(new ReadMailUI.14(this, localb));
      }
      super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
      AppMethodBeat.o(68457);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(68453);
    super.onDestroy();
    if (this.pzW != null)
      this.pzW.REMOTE_CALL("removeDownloadCallback", new Object[0]);
    this.ext.release();
    this.pzp.setVisibility(8);
    this.pzp.destroy();
    AppMethodBeat.o(68453);
  }

  public void onPause()
  {
    AppMethodBeat.i(68451);
    super.onPause();
    if ((this.pzG != -1L) && (this.pzG != -2L));
    while (true)
    {
      try
      {
        ReadMailProxy localReadMailProxy = new com/tencent/mm/plugin/qqmail/stub/ReadMailProxy;
        d locald = this.ext;
        a locala = new com/tencent/mm/plugin/qqmail/ui/ReadMailUI$a;
        locala.<init>(this, 0);
        localReadMailProxy.<init>(locald, locala);
        localReadMailProxy.REMOTE_CALL("cancel", new Object[] { Long.valueOf(this.pzG) });
        AppMethodBeat.o(68451);
        return;
      }
      catch (Exception localException)
      {
        ab.w("MicroMsg.ReadMailUI", "cancel, ex = %s", new Object[] { localException.getMessage() });
      }
      AppMethodBeat.o(68451);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(68466);
    if ((this.pzH == 1) && (!cdo()))
      cdp();
    super.onResume();
    AppMethodBeat.o(68466);
  }

  public void onStop()
  {
    AppMethodBeat.i(68452);
    super.onStop();
    this.pzp.stopLoading();
    AppMethodBeat.o(68452);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  final class a extends v.a
  {
    int pAh;

    public a(int arg2)
    {
      int i;
      this.pAh = i;
    }

    public final void onComplete()
    {
      AppMethodBeat.i(68447);
      ReadMailUI.i(ReadMailUI.this).post(new ReadMailUI.a.5(this));
      AppMethodBeat.o(68447);
    }

    public final void onError(int paramInt, String paramString)
    {
      AppMethodBeat.i(68445);
      ab.d("MicroMsg.ReadMailUI", "onError errCode = %d, userData = %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.pAh) });
      ReadMailUI.i(ReadMailUI.this).post(new ReadMailUI.a.3(this, paramInt, paramString));
      AppMethodBeat.o(68445);
    }

    public final boolean onReady()
    {
      AppMethodBeat.i(68446);
      ReadMailUI.i(ReadMailUI.this).post(new ReadMailUI.a.4(this));
      AppMethodBeat.o(68446);
      return true;
    }

    public final void onSuccess(String paramString, Map<String, String> paramMap)
    {
      AppMethodBeat.i(68444);
      ab.d("MicroMsg.ReadMailUI", "onSuccess userData = %d", new Object[] { Integer.valueOf(this.pAh) });
      switch (this.pAh)
      {
      default:
      case 1:
      case 2:
      }
      while (true)
      {
        ab.e("MicroMsg.ReadMailUI", "onSuccess, invalid userData = %d", new Object[] { Integer.valueOf(this.pAh) });
        AppMethodBeat.o(68444);
        while (true)
        {
          return;
          ReadMailUI.a(ReadMailUI.this, new ReadMailUI.a.1(this, paramMap));
          AppMethodBeat.o(68444);
        }
        ReadMailUI.i(ReadMailUI.this).post(new ReadMailUI.a.2(this));
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI
 * JD-Core Version:    0.6.2
 */