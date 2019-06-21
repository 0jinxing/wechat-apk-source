package com.tencent.mm.plugin.webview.ui.tools;

import android.annotation.TargetApi;
import android.content.ClipboardManager;
import android.content.ClipboardManager.OnPrimaryClipChangedListener;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebSettings.RenderPriority;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.qg;
import com.tencent.mm.g.a.vp;
import com.tencent.mm.m.d.a;
import com.tencent.mm.m.d.b;
import com.tencent.mm.model.v;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.plugin.appbrand.compat.b.a.1;
import com.tencent.mm.plugin.appbrand.jsapi.h5_interact.SendDataToH5FromMiniProgramEvent;
import com.tencent.mm.plugin.downloader.model.DownloadChecker;
import com.tencent.mm.plugin.webview.e.d.1;
import com.tencent.mm.plugin.webview.model.af;
import com.tencent.mm.plugin.webview.model.af.b;
import com.tencent.mm.plugin.webview.model.af.c;
import com.tencent.mm.plugin.webview.model.af.c.2;
import com.tencent.mm.plugin.webview.model.af.c.3;
import com.tencent.mm.plugin.webview.model.af.c.4;
import com.tencent.mm.plugin.webview.model.af.c.5;
import com.tencent.mm.plugin.webview.model.af.d;
import com.tencent.mm.plugin.webview.model.an;
import com.tencent.mm.plugin.webview.model.aq;
import com.tencent.mm.plugin.webview.model.aq.a;
import com.tencent.mm.plugin.webview.model.aq.b;
import com.tencent.mm.plugin.webview.model.aq.d;
import com.tencent.mm.plugin.webview.model.aq.f;
import com.tencent.mm.plugin.webview.model.aq.g;
import com.tencent.mm.plugin.webview.model.aq.h;
import com.tencent.mm.plugin.webview.model.aq.i;
import com.tencent.mm.plugin.webview.model.aq.l;
import com.tencent.mm.plugin.webview.model.aq.m;
import com.tencent.mm.plugin.webview.model.aq.n;
import com.tencent.mm.plugin.webview.model.aq.o;
import com.tencent.mm.plugin.webview.model.b.1;
import com.tencent.mm.plugin.webview.modeltools.WebViewClipBoardHelper;
import com.tencent.mm.plugin.webview.stub.WebViewStubService;
import com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.widget.FontChooserView;
import com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton;
import com.tencent.mm.plugin.webview.ui.tools.widget.WebViewSearchContentInputFooter;
import com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewInputFooter;
import com.tencent.mm.pluginsdk.model.v.a;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMFalseProgressBar;
import com.tencent.mm.ui.e.m;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.ui.widget.MMWebView;
import com.tencent.mm.ui.widget.MMWebView.a;
import com.tencent.mm.ui.widget.MMWebView.d;
import com.tencent.mm.ui.widget.SwipeBackLayout;
import com.tencent.qqvideo.proxy.api.FactoryProxyManager;
import com.tencent.qqvideo.proxy.api.IPlayManager;
import com.tencent.qqvideo.proxy.api.IUtils;
import com.tencent.xweb.WebView;
import com.tencent.xweb.r;
import com.tencent.xweb.s;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import junit.framework.Assert;

public class WebViewUI extends MMActivity
  implements View.OnCreateContextMenuListener, MMWebView.d
{
  private static final Pattern uiv;
  private static final Pattern uiw;
  private static final Set<String> ums;
  private static final ArrayList<WebViewUI.z> uvK;
  private static WebSettings.RenderPriority uvQ;
  protected static int uwz;
  protected String cMm;
  public volatile String cOG;
  protected int cSQ;
  protected String cvF;
  private int fromScene;
  public ak handler;
  private long iBE;
  private String iCz;
  private int iJp;
  com.tencent.mm.ui.tools.j icA;
  private final com.tencent.mm.plugin.webview.modeltools.d icH;
  public com.tencent.mm.plugin.webview.stub.d icy;
  public k icz;
  protected String ium;
  protected int jLX;
  protected int jLY;
  private int jQp;
  public String jUg;
  public int jYe;
  private ServiceConnection ktl;
  protected com.tencent.mm.ui.widget.snackbar.a.b mUw;
  private int networkType;
  public int nfs;
  public String nft;
  private long oes;
  public MMWebView pzf;
  protected boolean rpm;
  protected int screenOrientation;
  public com.tencent.mm.plugin.webview.ui.tools.jsapi.d uhz;
  private d uic;
  protected com.tencent.mm.plugin.webview.ui.tools.bag.h uie;
  public aq ulI;
  protected com.tencent.mm.plugin.webview.stub.e umI;
  protected volatile String unr;
  private final com.tencent.mm.plugin.webview.modeltools.a utt;
  protected boolean uuW;
  public MMFalseProgressBar uuX;
  public ProgressBar uuY;
  private ImageButton uuZ;
  private boolean uvA;
  protected int uvB;
  private String uvC;
  protected byte[] uvD;
  private boolean uvE;
  private boolean uvF;
  public boolean uvG;
  private View uvH;
  private ap uvI;
  private List<com.tencent.mm.plugin.webview.ui.tools.jsapi.b> uvJ;
  private boolean uvL;
  private WebChromeClient.CustomViewCallback uvM;
  private View uvN;
  protected com.tencent.xweb.l uvO;
  private ProgressBar uvP;
  protected WebViewUI.l uvR;
  protected WebViewUI.m uvS;
  protected WebViewUI.o uvT;
  protected q uvU;
  private final com.tencent.mm.sdk.b.c<SendDataToH5FromMiniProgramEvent> uvV;
  private boolean uvW;
  private int uvX;
  public com.tencent.mm.plugin.webview.ui.tools.jsapi.f uvY;
  protected boolean uvZ;
  private ImageButton uva;
  protected View uvb;
  protected FrameLayout uvc;
  public FrameLayout uvd;
  protected MovingImageButton uve;
  protected boolean uvf;
  private boolean uvg;
  protected com.tencent.mm.bm.a uvh;
  private WebViewInputFooter uvi;
  protected WebViewSearchContentInputFooter uvj;
  private boolean uvk;
  private boolean uvl;
  public String uvm;
  protected boolean uvn;
  protected long uvo;
  private boolean uvp;
  int uvq;
  public boolean uvr;
  private boolean uvs;
  private boolean uvt;
  protected boolean uvu;
  private boolean uvv;
  private boolean uvw;
  private boolean uvx;
  private boolean uvy;
  protected boolean uvz;
  public boolean uwA;
  private boolean uwB;
  private boolean uwC;
  protected volatile boolean uwD;
  private com.tencent.mm.plugin.webview.e.d uwE;
  private com.tencent.mm.plugin.webview.model.b uwF;
  protected com.tencent.mm.plugin.webview.modeltools.n uwG;
  protected i uwH;
  public j uwI;
  protected IUtils uwJ;
  private WebViewClipBoardHelper uwK;
  protected com.tencent.mm.plugin.webview.b uwL;
  protected volatile String uwM;
  protected volatile long uwN;
  private o uwO;
  protected an uwP;
  protected r uwQ;
  private com.tencent.mm.sdk.b.c<qg> uwR;
  private boolean uwS;
  protected View uwT;
  private View uwU;
  private com.tencent.mm.bm.a.b uwV;
  private boolean uwW;
  protected final l uwX;
  private boolean uwY;
  private View.OnLongClickListener uwZ;
  protected HashMap<String, Boolean> uwa;
  protected HashMap<String, String> uwb;
  protected HashMap<String, ArrayList<d.b>> uwc;
  protected HashMap<String, Boolean> uwd;
  protected WebViewUI.d uwe;
  protected com.tencent.mm.ui.widget.a.c uwf;
  private View uwg;
  public View uwh;
  protected String uwi;
  private boolean uwj;
  private volatile boolean uwk;
  private final boolean uwl;
  private boolean uwm;
  protected volatile boolean uwn;
  private final Set<String> uwo;
  public boolean uwp;
  protected boolean uwq;
  private final Map<String, Map<String, String>> uwr;
  protected Map<String, String> uws;
  private Map uwt;
  private int uwu;
  private String uwv;
  private boolean uww;
  private final Map<String, String> uwx;
  private final Set<String> uwy;
  String[] uxa;
  protected boolean uxb;
  public View.OnLongClickListener uxc;
  private String uxd;
  protected volatile String uxe;
  protected volatile String uxf;
  private volatile String uxg;
  protected volatile String uxh;
  private long uxi;
  private com.tencent.mm.ui.base.p uxj;
  private af.d uxk;
  protected af.b uxl;
  private com.tencent.mm.ui.base.i uxm;
  private long uxn;
  private String[] uxo;

  static
  {
    AppMethodBeat.i(8134);
    uvK = new ArrayList();
    uvQ = WebSettings.RenderPriority.NORMAL;
    uwz = 0;
    uiv = Pattern.compile("\"\\s*rgba\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");
    uiw = Pattern.compile("\"\\s*rgb\\(\\s*[0-9]+\\s*,\\s*[0-9]+\\s*,\\s*[0-9]+\\s*\\)\\s*\"");
    Object localObject1 = new HashSet();
    ums = (Set)localObject1;
    ((Set)localObject1).add("file:///android_asset/");
    Object localObject2 = com.tencent.mm.compatible.util.e.eSk;
    localObject1 = localObject2;
    if (!bo.isNullOrNil((String)localObject2))
      localObject1 = com.tencent.mm.compatible.util.e.eSk.replace("/data/user/0", "/data/data");
    localObject2 = new File(com.tencent.mm.plugin.websearch.api.aa.Ia(0));
    ums.add("file://" + ((File)localObject2).getAbsolutePath());
    File localFile1 = new File(com.tencent.mm.compatible.util.e.eSn, "fts/res");
    ums.add("file://" + localFile1.getAbsolutePath());
    File localFile2 = new File((String)localObject1, "wenote/res");
    ums.add("file://" + localFile2.getAbsolutePath());
    localFile2 = new File(com.tencent.mm.compatible.util.e.eSn, "wenote/res");
    ums.add("file://" + localFile2.getAbsolutePath());
    localFile2 = new File((String)localObject1, "wxa_fts/res");
    ums.add("file://" + localFile2.getAbsolutePath());
    ab.i("MicroMsg.WebViewUI", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s, wxapp : %s", new Object[] { ((File)localObject2).getAbsolutePath(), localFile1.getAbsolutePath(), localFile2.getAbsolutePath() });
    localObject1 = new File((String)localObject1, "emoji/res");
    ums.add("file://" + ((File)localObject1).getAbsolutePath());
    localObject2 = new File(com.tencent.mm.compatible.util.e.eSn, "emoji/res");
    ums.add("file://" + ((File)localObject2).getAbsolutePath());
    ab.i("MicroMsg.WebViewUI", "add webview UI FILE URL WHITE LIST data: %s sdcard:%s", new Object[] { ((File)localObject1).getAbsolutePath(), ((File)localObject2).getAbsolutePath() });
    localObject2 = new File(com.tencent.mm.plugin.websearch.api.aa.Ia(1));
    ums.add("file://" + ((File)localObject2).getAbsolutePath());
    localObject1 = new File(com.tencent.mm.compatible.util.e.eSn, "fts_browse/res");
    ums.add("file://" + ((File)localObject1).getAbsolutePath());
    ab.i("MicroMsg.WebViewUI", "add browse UI FILE URL WHITE LIST data: %s sdcard:%s", new Object[] { ((File)localObject2).getAbsolutePath(), ((File)localObject1).getAbsolutePath() });
    localObject1 = ums.iterator();
    while (((Iterator)localObject1).hasNext())
      ab.i("MicroMsg.WebViewUI", "albie: WebViewUI white list path : %s", new Object[] { (String)((Iterator)localObject1).next() });
    AppMethodBeat.o(8134);
  }

  public WebViewUI()
  {
    AppMethodBeat.i(7981);
    this.uuW = false;
    this.screenOrientation = -1;
    this.uvf = false;
    this.uvg = false;
    this.cOG = null;
    this.uvm = null;
    this.uvn = true;
    this.uvo = 0L;
    this.uvp = false;
    this.cvF = "";
    this.ium = "";
    this.uvq = -1;
    this.uvr = false;
    this.rpm = true;
    this.uvs = false;
    this.uvt = false;
    this.uvu = true;
    this.uvv = false;
    this.uvw = false;
    this.uvx = false;
    this.uvy = false;
    this.uvz = false;
    this.uvA = true;
    this.uvC = null;
    this.uvD = new byte[0];
    this.uvE = false;
    this.uhz = null;
    this.uvF = false;
    this.uvG = false;
    this.uvJ = new ArrayList();
    this.uvL = false;
    this.icz = null;
    this.uvR = new WebViewUI.l(null);
    this.uvS = new WebViewUI.m(this);
    this.uvT = new WebViewUI.o(this);
    this.uvU = new q();
    this.uvV = new com.tencent.mm.sdk.b.c()
    {
    };
    this.uvW = false;
    this.uvX = 0;
    this.icy = null;
    this.uvZ = false;
    this.uwa = new HashMap();
    this.uwb = new HashMap();
    this.uwc = new HashMap();
    this.uwd = new HashMap();
    this.uwf = null;
    this.uwh = null;
    this.uwi = null;
    this.uwj = false;
    this.uwk = false;
    this.uwl = true;
    this.uwm = false;
    this.nfs = 0;
    this.nft = null;
    this.uwn = false;
    this.uwo = new HashSet();
    this.uwp = false;
    this.uwq = false;
    this.uwr = new ConcurrentHashMap();
    this.uwu = 0;
    this.uwv = "";
    this.uww = false;
    this.uwx = new HashMap();
    this.uwy = new HashSet();
    this.uwA = false;
    this.uwB = false;
    this.uwC = false;
    this.uwD = false;
    this.ulI = new aq();
    this.uwE = new com.tencent.mm.plugin.webview.e.d();
    this.uwF = new com.tencent.mm.plugin.webview.model.b(this.ulI);
    this.uwG = new com.tencent.mm.plugin.webview.modeltools.n();
    this.uwJ = null;
    this.uwP = new an(this);
    this.uwQ = new WebViewUI.12(this);
    this.uwR = new WebViewUI.23(this);
    this.ktl = new WebViewUI.33(this);
    this.uwS = true;
    this.oes = 0L;
    this.jQp = 0;
    this.uwV = new WebViewUI.4(this);
    this.uwW = false;
    this.uwX = new l();
    this.icH = new com.tencent.mm.plugin.webview.modeltools.d();
    this.utt = new com.tencent.mm.plugin.webview.modeltools.a();
    this.uwZ = new WebViewUI.25(this);
    this.uxb = false;
    this.uxc = new WebViewUI.30(this);
    this.uxd = "";
    this.uxe = "";
    this.uxf = null;
    this.uxg = "";
    this.uxh = "";
    this.uxi = 0L;
    this.iBE = 0L;
    this.uxk = new WebViewUI.43(this);
    this.uxl = new WebViewUI.45(this);
    this.uxn = 0L;
    this.uxo = null;
    this.mUw = new com.tencent.mm.ui.widget.snackbar.a.b()
    {
      public final void aIu()
      {
        AppMethodBeat.i(7880);
        try
        {
          WebViewUI.this.icy.favEditTag();
          AppMethodBeat.o(7880);
          return;
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.e("MicroMsg.WebViewUI", "favorite edittag fail, ex = " + localException.getMessage());
            AppMethodBeat.o(7880);
          }
        }
      }
    };
    this.jYe = -1;
    AppMethodBeat.o(7981);
  }

  private void IB(String paramString)
  {
    AppMethodBeat.i(7992);
    if (this.uhz != null)
      this.uhz.agn(paramString);
    while (true)
    {
      try
      {
        if (paramString.equals("onPause"))
        {
          this.icy.Je(hashCode());
          AppMethodBeat.o(7992);
          return;
        }
        if (paramString.equals("onResume"))
          this.icy.Jd(hashCode());
        AppMethodBeat.o(7992);
        continue;
      }
      catch (Exception paramString)
      {
        ab.w("MicroMsg.WebViewUI", "onResume, ex = " + paramString.getMessage());
      }
      AppMethodBeat.o(7992);
    }
  }

  private void Jr(int paramInt)
  {
    AppMethodBeat.i(8015);
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putInt("scene_end_type", paramInt);
      localBundle.putInt("scene_end_listener_hash_code", hashCode());
      this.icy.a(5, localBundle, hashCode());
      AppMethodBeat.o(8015);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUI", "addSceneEnd, ex = " + localException.getMessage());
        AppMethodBeat.o(8015);
      }
    }
  }

  private void Js(int paramInt)
  {
    AppMethodBeat.i(8016);
    try
    {
      if (this.icy != null)
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putInt("scene_end_type", paramInt);
        localBundle.putInt("scene_end_listener_hash_code", hashCode());
        this.icy.a(6, localBundle, hashCode());
      }
      AppMethodBeat.o(8016);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUI", "removeSceneEnd, ex = " + localException.getMessage());
        AppMethodBeat.o(8016);
      }
    }
  }

  private void Jv(int paramInt)
  {
    AppMethodBeat.i(8089);
    int i;
    if (paramInt > 0)
    {
      i = paramInt;
      if (paramInt <= 4);
    }
    else
    {
      i = 2;
    }
    if (this.uhz != null)
      this.uhz.JK(i);
    FontChooserView localFontChooserView = (FontChooserView)this.uvb.findViewById(2131829157);
    if (localFontChooserView != null)
      localFontChooserView.setSliderIndex(i - 1);
    AppMethodBeat.o(8089);
  }

  private void Y(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(8084);
    if (paramBoolean1)
    {
      setMMSubTitle(2131305624);
      if (this.uvv)
        break label61;
      this.uvv = true;
      AppMethodBeat.o(8084);
    }
    while (true)
    {
      return;
      if (paramBoolean2)
      {
        setMMSubTitle(2131305636);
        AppMethodBeat.o(8084);
      }
      else
      {
        setMMSubTitle(null);
        label61: AppMethodBeat.o(8084);
      }
    }
  }

  private void a(String paramString1, String paramString2, JsapiPermissionWrapper paramJsapiPermissionWrapper, GeneralControlWrapper paramGeneralControlWrapper)
  {
    AppMethodBeat.i(8082);
    if (!bo.isNullOrNil(paramString2))
    {
      this.icz.a(paramString2, paramJsapiPermissionWrapper, paramGeneralControlWrapper);
      this.uwo.remove(paramString2);
      this.uwq = false;
      this.jUg = paramString2;
    }
    if (hh(paramString1, paramString2))
    {
      this.icz.a(paramString1, paramJsapiPermissionWrapper, paramGeneralControlWrapper);
      this.uwo.remove(paramString1);
      AppMethodBeat.o(8082);
    }
    while (true)
    {
      return;
      if ((this.icy == null) || (bo.isNullOrNil(paramString1)) || (!afI(paramString1)))
      {
        AppMethodBeat.o(8082);
      }
      else
      {
        this.icz.a(paramString1, paramJsapiPermissionWrapper, paramGeneralControlWrapper);
        this.uwo.remove(paramString1);
        AppMethodBeat.o(8082);
      }
    }
  }

  private static boolean a(com.tencent.mm.plugin.webview.ui.tools.jsapi.b paramb, String paramString)
  {
    AppMethodBeat.i(8041);
    boolean bool;
    if ((bo.isNullOrNil(paramString)) || (paramb == null))
    {
      bool = false;
      AppMethodBeat.o(8041);
    }
    while (true)
    {
      return bool;
      bool = paramb.afS(paramString);
      AppMethodBeat.o(8041);
    }
  }

  private static void af(View paramView, int paramInt)
  {
    AppMethodBeat.i(8028);
    if (paramView == null)
      AppMethodBeat.o(8028);
    while (true)
    {
      return;
      paramView.setSystemUiVisibility(paramView.getSystemUiVisibility() | paramInt);
      AppMethodBeat.o(8028);
    }
  }

  private static String afJ(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(8047);
    try
    {
      paramString = Pattern.compile("(?i)^.*filename=\"?([^\"]+)\"?.*$").matcher(paramString);
      if ((paramString.find()) && (paramString.groupCount() == 1))
      {
        paramString = paramString.group(1);
        AppMethodBeat.o(8047);
      }
      while (true)
      {
        return paramString;
        AppMethodBeat.o(8047);
        paramString = localObject;
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUI", "getFileNameFromContentDisposition error " + paramString.getMessage());
        AppMethodBeat.o(8047);
        paramString = localObject;
      }
    }
  }

  private boolean afO(String paramString)
  {
    AppMethodBeat.i(8080);
    boolean bool;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.WebViewUI", "search contact err: null or nill url");
      bool = false;
      AppMethodBeat.o(8080);
    }
    while (true)
    {
      return bool;
      Jr(106);
      Bundle localBundle = new Bundle();
      localBundle.putString("search_contact_data_url", paramString);
      localBundle.putInt("webview_binder_id", hashCode());
      try
      {
        this.icy.s(106, localBundle);
        bool = true;
        AppMethodBeat.o(8080);
      }
      catch (Exception paramString)
      {
        while (true)
          ab.w("MicroMsg.WebViewUI", "startSearchContact, ex = " + paramString.getMessage());
      }
    }
  }

  private boolean afP(String paramString)
  {
    AppMethodBeat.i(8081);
    ab.i("MicroMsg.WebViewUI", "dealCustomScheme, url = ".concat(String.valueOf(paramString)));
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(8081);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        if (this.icy.dq(paramString))
        {
          ab.i("MicroMsg.WebViewUI", "dealCustomScheme, url is handled by QrCodeURLHelper, url = ".concat(String.valueOf(paramString)));
          this.icy.dB(paramString, hashCode());
          AppMethodBeat.o(8081);
          bool = true;
        }
      }
      catch (Exception localException1)
      {
        ab.w("MicroMsg.WebViewUI", "dealCustomScheme, tryHandleEvents, ex = " + localException1.getMessage());
        Uri localUri = Uri.parse(paramString);
        if ((localUri != null) && (!paramString.startsWith("weixin://")) && (!paramString.startsWith("http")))
        {
          if (paramString.startsWith("tel:"))
          {
            paramString = paramString.replace("tel:", "");
            if (!bo.isNullOrNil(paramString));
            try
            {
              this.icy.dD(paramString, hashCode());
              AppMethodBeat.o(8081);
              bool = true;
            }
            catch (Exception paramString)
            {
              while (true)
                ab.w("MicroMsg.WebViewUI", "showPhoneSpanDialog, ex = %s", new Object[] { paramString.getMessage() });
            }
          }
          else if ((paramString.startsWith("sms:")) || (paramString.startsWith("smsto:")))
          {
            paramString = new Intent("android.intent.action.SENDTO", localUri);
            paramString.addFlags(268435456);
            try
            {
              startActivity(paramString);
              AppMethodBeat.o(8081);
              bool = true;
            }
            catch (Exception paramString)
            {
              while (true)
                ab.e("MicroMsg.WebViewUI", "start sms app failed:[%s]", new Object[] { paramString.getMessage() });
            }
          }
          else if (paramString.startsWith("mailto:"))
          {
            paramString = new Intent("android.intent.action.SENDTO");
            paramString.addFlags(268435456);
            paramString.setData(localUri);
            try
            {
              startActivity(paramString);
              AppMethodBeat.o(8081);
              bool = true;
            }
            catch (Exception paramString)
            {
              while (true)
                ab.e("MicroMsg.WebViewUI", "start mailto app failed:[%s]", new Object[] { paramString.getMessage() });
            }
          }
          else
          {
            try
            {
              if ((this.icz.cZT().vxG & 0x2000) != 0);
              for (bool = true; ; bool = false)
              {
                ab.d("MicroMsg.GeneralControlWrapper", "allowOuterOpenUrl, ret = ".concat(String.valueOf(bool)));
                if ((bool) || (this.icy == null) || (!this.icy.cZd()))
                  break label472;
                ab.e("MicroMsg.WebViewUI", "dealCustomScheme, not allow outer open url");
                AppMethodBeat.o(8081);
                bool = true;
                break;
              }
              label472: int i = getIntent().getIntExtra("key_download_restrict", 0);
              String str1 = getIntent().getStringExtra("key_function_id");
              if (!bo.isNullOrNil(str1))
                com.tencent.mm.plugin.report.service.h.pYm.e(14596, new Object[] { str1, Integer.valueOf(i), Integer.valueOf(1) });
              if (i == 1)
              {
                ab.e("MicroMsg.WebViewUI", "not allow launch app by custom scheme : %s", new Object[] { paramString });
                AppMethodBeat.o(8081);
                bool = true;
              }
            }
            catch (RemoteException localRemoteException)
            {
              ab.printErrStackTrace("MicroMsg.WebViewUI", localRemoteException, "", new Object[0]);
              long l = bo.anT() - this.uxi;
              ab.i("MicroMsg.WebViewUI", "scheme launch interval ; %d", new Object[] { Long.valueOf(l) });
              String str2;
              Object localObject;
              if (l <= 2L)
              {
                str2 = dae();
                localObject = str2;
              }
              try
              {
                str2 = com.tencent.mm.compatible.util.q.encode(str2, "UTF-8");
                localObject = str2;
                String str3 = com.tencent.mm.compatible.util.q.encode(paramString, "UTF-8");
                paramString = str3;
                localObject = str2;
                com.tencent.mm.plugin.report.service.h.pYm.e(13983, new Object[] { Integer.valueOf(4), localObject, paramString });
                if (getIntent().getBooleanExtra("show_openapp_dialog", true))
                {
                  bool = com.tencent.mm.ce.a.post(new WebViewUI.42(this, localUri));
                  AppMethodBeat.o(8081);
                }
              }
              catch (Exception localException2)
              {
                while (true)
                  ab.i("MicroMsg.WebViewUI", "formate url failed");
                paramString = new Intent("android.intent.action.VIEW", localUri);
                paramString.addFlags(268435456);
                if (bo.k(this, paramString))
                {
                  startActivity(paramString);
                  AppMethodBeat.o(8081);
                  bool = true;
                }
              }
            }
          }
        }
        else
        {
          AppMethodBeat.o(8081);
          bool = false;
        }
      }
    }
  }

  private final boolean afQ(String paramString)
  {
    AppMethodBeat.i(8091);
    boolean bool;
    if (ae.giw)
    {
      ab.w("MicroMsg.WebViewUI", "skipLoadUrlCheck");
      AppMethodBeat.o(8091);
      bool = true;
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        AppMethodBeat.o(8091);
        bool = true;
      }
      else if (this.uvl)
      {
        ab.i("MicroMsg.WebViewUI", "albie: trust this url(%s)", new Object[] { paramString });
        AppMethodBeat.o(8091);
        bool = true;
      }
      else
      {
        String str = paramString.toLowerCase();
        if (str.startsWith("file://"))
        {
          paramString = ums.iterator();
          while (true)
            if (paramString.hasNext())
              if (com.tencent.mm.pluginsdk.ui.tools.u.t(str, (String)paramString.next()))
              {
                AppMethodBeat.o(8091);
                bool = true;
                break;
              }
          AppMethodBeat.o(8091);
          bool = false;
        }
        else
        {
          AppMethodBeat.o(8091);
          bool = true;
        }
      }
    }
  }

  private void cZX()
  {
    AppMethodBeat.i(7993);
    this.uwE.aI("onTryBindServiceStart", System.currentTimeMillis());
    ab.i("MicroMsg.WebViewUI", "edw tryBindService");
    bindService(new Intent(this, WebViewStubService.class), this.ktl, 1);
    this.uwE.aI("onTryBindServiceEnd", System.currentTimeMillis());
    AppMethodBeat.o(7993);
  }

  private boolean cZZ()
  {
    if ((this.uvf) || (this.uvg));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private boolean cZs()
  {
    boolean bool1 = false;
    boolean bool2 = false;
    AppMethodBeat.i(8046);
    try
    {
      if (this.icy == null)
      {
        ab.w("MicroMsg.WebViewUI", "invoker is null");
        AppMethodBeat.o(8046);
        bool1 = bool2;
      }
      while (true)
      {
        return bool1;
        bool2 = this.icy.cZs();
        bool1 = bool2;
        AppMethodBeat.o(8046);
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        ab.e("MicroMsg.WebViewUI", "unable get config for WebViewDownLoadFile" + localRemoteException.getMessage());
    }
  }

  private void daA()
  {
    AppMethodBeat.i(8092);
    if ((this.pzf == null) || (this.icy == null))
    {
      ab.i("MicroMsg.WebViewUI", "viewwv is null or invoker is null");
      AppMethodBeat.o(8092);
    }
    while (true)
    {
      return;
      try
      {
        this.pzf.removeJavascriptInterface("searchBoxJavaBridge_");
        if (this.uxo != null);
      }
      catch (Exception localException1)
      {
        try
        {
          if (this.icy.cZd())
            this.uxo = this.icy.cZe();
          if (this.uxo == null)
          {
            i = 0;
            ab.i("MicroMsg.WebViewUI", "removeConfigJsInterface, to remove list size = %d", new Object[] { Integer.valueOf(i) });
            if ((this.uxo != null) && (this.uxo.length != 0))
              break label188;
            AppMethodBeat.o(8092);
            continue;
            localException1 = localException1;
            ab.e("MicroMsg.WebViewUI", "removeConfigJsInterface, ex = %s", new Object[] { localException1.getMessage() });
          }
        }
        catch (Exception localException2)
        {
          int i;
          while (true)
          {
            ab.e("MicroMsg.WebViewUI", "getRemoveJsInterfaceList, ex = %s", new Object[] { localException2.getMessage() });
            continue;
            i = this.uxo.length;
          }
          try
          {
            label188: for (String str : this.uxo)
            {
              ab.i("MicroMsg.WebViewUI", "removeConfigJsInterface, js interface name = %s", new Object[] { str });
              this.pzf.removeJavascriptInterface(str);
            }
            AppMethodBeat.o(8092);
          }
          catch (Exception localException3)
          {
            ab.e("MicroMsg.WebViewUI", "removeConfigJsInterface, ex = %s", new Object[] { localException3.getMessage() });
            AppMethodBeat.o(8092);
          }
        }
      }
    }
  }

  private boolean daB()
  {
    AppMethodBeat.i(8094);
    int i = getIntent().getIntExtra("key_close_action", 0);
    Object localObject = getIntent().getBundleExtra("key_close_data");
    ab.i("MicroMsg.WebViewUI", "close action %s", new Object[] { Integer.valueOf(i) });
    boolean bool;
    switch (i)
    {
    default:
      bool = false;
      AppMethodBeat.o(8094);
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      if (localObject == null)
        break;
      String str1 = ((Bundle)localObject).getString("close_dialog_title");
      String str2 = ((Bundle)localObject).getString("close_dialog_msg");
      String str3 = ((Bundle)localObject).getString("close_dialog_ok");
      String str4 = ((Bundle)localObject).getString("close_dialog_cancel");
      bool = ((Bundle)localObject).getBoolean("close_dialog_ok_close", true);
      if (bo.Q(new String[] { str2, str3, str4 }))
        break;
      if (bool)
        com.tencent.mm.ui.base.h.a(this, str1, str2, str3, str4, false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(7878);
            WebViewUI.this.uwA = true;
            m.uuj.close();
            WebViewUI.this.finish();
            AppMethodBeat.o(7878);
          }
        }
        , null);
      while (true)
      {
        bool = true;
        AppMethodBeat.o(8094);
        break;
        com.tencent.mm.ui.base.h.a(this, str1, str2, str3, str4, false, null, new WebViewUI.50(this));
      }
      if (localObject == null)
        break;
      str4 = ((Bundle)localObject).getString("close_jump_url");
      i = ((Bundle)localObject).getInt("close_jump_url_request_code", 0);
      if (bo.isNullOrNil(str4))
        break;
      localObject = new Intent(this, WebViewUI.class);
      ((Intent)localObject).putExtra("rawUrl", str4);
      ((Intent)localObject).putExtra("showShare", false);
      ((Intent)localObject).putExtra("show_bottom", false);
      ((Intent)localObject).putExtra("needRedirect", false);
      ((Intent)localObject).putExtra("hardcode_jspermission", JsapiPermissionWrapper.vxI);
      ((Intent)localObject).putExtra("hardcode_general_ctrl", GeneralControlWrapper.vxE);
      startActivityForResult((Intent)localObject, i);
      com.tencent.mm.ui.base.b.hN(this);
      bool = true;
      AppMethodBeat.o(8094);
    }
  }

  private void daD()
  {
    AppMethodBeat.i(8096);
    if (this.uwC)
    {
      ab.d("MicroMsg.WebViewUI", "SwipeBackFinish, do not LaunchOuterApp");
      AppMethodBeat.o(8096);
    }
    while (true)
    {
      return;
      Object localObject = getIntent();
      boolean bool = ((Intent)localObject).getBooleanExtra("webview_invoke_launch_app_when_back", false);
      String str1 = ((Intent)localObject).getStringExtra("KAppId");
      String str2 = ((Intent)localObject).getStringExtra("webview_invoke_launch_app_ext_info_when_back");
      if ((bool) && (str1 != null) && (str1.length() > 0) && (str2 != null) && (str2.length() > 0))
      {
        localObject = new Bundle();
        ((Bundle)localObject).putString("appId", str1);
        ((Bundle)localObject).putString("extInfo", str2);
        com.tencent.mm.ipcinvoker.f.a("com.tencent.mm", (Parcelable)localObject, com.tencent.mm.pluginsdk.model.app.u.class, null);
      }
      AppMethodBeat.o(8096);
    }
  }

  private int daa()
  {
    AppMethodBeat.i(7999);
    int i;
    if (this.uwl)
    {
      i = 0;
      if ((getSupportActionBar() != null) && (getSupportActionBar().isShowing()))
        break label48;
      AppMethodBeat.o(7999);
    }
    while (true)
    {
      return i;
      i = this.iJp;
      break;
      label48: i += getActionBarHeight();
      AppMethodBeat.o(7999);
    }
  }

  private View dag()
  {
    AppMethodBeat.i(8011);
    View localView = null;
    try
    {
      i = Resources.getSystem().getIdentifier("action_bar_container", "id", "android");
      if (i > 0)
        localView = findViewById(i);
      ab.i("MicroMsg.WebViewUI", "getActionBarContainer, viewResId = %d, get view = %s", new Object[] { Integer.valueOf(i), localView });
      AppMethodBeat.o(8011);
      return localView;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUI", "get resId action_bar_container, exp = %s", new Object[] { localException });
        int i = -1;
      }
    }
  }

  private void dah()
  {
    AppMethodBeat.i(8018);
    try
    {
      this.uwX.release();
      this.pzf.stopLoading();
      this.uvG = false;
      this.pzf.removeAllViews();
      this.pzf.clearView();
      if (this.uhz != null)
        this.uhz.detach();
    }
    catch (Exception localException1)
    {
      try
      {
        this.pzf.destroy();
        this.pzf = null;
        finish();
        ab.dot();
        Process.killProcess(Process.myPid());
        AppMethodBeat.o(8018);
        return;
        localException1 = localException1;
        ab.e("MicroMsg.WebViewUI", "forceQuit, ex = " + localException1.getMessage());
      }
      catch (Exception localException2)
      {
        while (true)
          ab.w("MicroMsg.WebViewUI", "forceQuit, viewWV destroy, ex = %s", new Object[] { localException2.getMessage() });
      }
    }
  }

  private void dau()
  {
    AppMethodBeat.i(8065);
    if (this.uvH != null)
      this.uvH.setVisibility(8);
    if (this.uvI != null)
      this.uvI.stopTimer();
    AppMethodBeat.o(8065);
  }

  private boolean dav()
  {
    AppMethodBeat.i(8076);
    boolean bool;
    if (System.currentTimeMillis() - this.uvo < 300L)
    {
      bool = true;
      AppMethodBeat.o(8076);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(8076);
    }
  }

  private int daz()
  {
    AppMethodBeat.i(8088);
    float f = this.mController.ylL.getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 0).getFloat("current_text_size_scale_key", 1.0F);
    int i;
    if (f == 0.875F)
    {
      i = 1;
      AppMethodBeat.o(8088);
    }
    while (true)
    {
      return i;
      if (f == 1.125F)
      {
        i = 3;
        AppMethodBeat.o(8088);
      }
      else if ((f == 1.25F) || (f == 1.375F) || (f == 1.625F))
      {
        i = 4;
        AppMethodBeat.o(8088);
      }
      else
      {
        i = 2;
        AppMethodBeat.o(8088);
      }
    }
  }

  private static void ep(View paramView)
  {
    AppMethodBeat.i(8029);
    if (paramView == null)
      AppMethodBeat.o(8029);
    while (true)
    {
      return;
      paramView.setSystemUiVisibility(paramView.getSystemUiVisibility() & 0xFFFFE8F9);
      AppMethodBeat.o(8029);
    }
  }

  private boolean hh(String paramString1, String paramString2)
  {
    AppMethodBeat.i(8086);
    boolean bool;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      AppMethodBeat.o(8086);
      bool = false;
    }
    while (true)
    {
      return bool;
      if ((com.tencent.mm.plugin.webview.a.uet.matcher(paramString1).matches()) && (com.tencent.mm.plugin.webview.a.uet.matcher(paramString2).matches()))
      {
        String str1 = paramString1.replaceFirst("http://", "").replaceFirst("https://", "");
        int i = str1.indexOf('#');
        String str2 = str1;
        if (i > 0)
          str2 = str1.substring(0, i);
        if ((paramString2.replaceFirst("http://", "").replaceFirst("https://", "").startsWith(str2)) && (this.icy != null) && (afI(paramString1)))
        {
          bool = true;
          AppMethodBeat.o(8086);
        }
      }
      else
      {
        AppMethodBeat.o(8086);
        bool = false;
      }
    }
  }

  private WebViewUI.w j(String paramString, boolean paramBoolean, int paramInt)
  {
    AppMethodBeat.i(8078);
    if ((this.uwA) || (this.uwB) || (isFinishing()))
    {
      paramString = WebViewUI.w.uxU;
      AppMethodBeat.o(8078);
    }
    int j;
    while (true)
    {
      return paramString;
      i = -1;
      j = i;
      if (this.uvo > 0L)
      {
        j = i;
        if (dav())
          j = 4;
        this.uvo = 0L;
      }
      if (this.uwh != null)
        this.uwh.setVisibility(8);
      if (this.icz == null)
      {
        ab.e("MicroMsg.WebViewUI", "startGetA8Key fail, after onDestroy");
        paramString = WebViewUI.w.uxU;
        AppMethodBeat.o(8078);
      }
      else
      {
        if (!this.uvs)
          break;
        ab.i("MicroMsg.WebViewUI", "edw startGetA8Key, nevergeta8key");
        this.icz.a(paramString, null, null);
        paramString = WebViewUI.w.uxS;
        AppMethodBeat.o(8078);
      }
    }
    if ((this.icy != null) && (this.uwo.contains(paramString)) && (afI(paramString)));
    for (int i = 1; ; i = 0)
    {
      if (((!this.icz.has(paramString)) && (i == 0)) || (paramBoolean))
        break label260;
      ab.i("MicroMsg.WebViewUI", "edw startGetA8Key no need, wvPerm already has value, url = ".concat(String.valueOf(paramString)));
      this.uvW = this.icz.cZS().jB(24);
      paramString = WebViewUI.w.uxS;
      AppMethodBeat.o(8078);
      break;
    }
    label260: String str1 = getIntent().getStringExtra("geta8key_username");
    int k = afH(str1);
    if (paramInt == -1);
    for (i = this.uvR.ael(paramString); ; i = paramInt)
      while (true)
      {
        String str2 = getIntent().getStringExtra("key_function_id");
        int m = getIntent().getIntExtra("key_wallet_region", 0);
        ab.i("MicroMsg.WebViewUI", "edw startGetA8Key, url = %s, scene = %d, subScene = %d, username = %s, reason = %d, force = %b, functionid = %s, walletRegion = %d", new Object[] { paramString, Integer.valueOf(k), Integer.valueOf(j), str1, Integer.valueOf(i), Boolean.valueOf(paramBoolean), str2, Integer.valueOf(m) });
        if (paramInt != 5)
          X(true, false);
        this.uwo.add(paramString);
        this.icz.a(paramString, null, null);
        this.uvW = this.icz.cZS().jB(24);
        if ((i != 5) && (i != 1))
          this.uwq = true;
        this.uvS.daN();
        Object localObject = new Bundle();
        ((Bundle)localObject).putString("geta8key_data_req_url", paramString);
        ((Bundle)localObject).putString("geta8key_data_username", str1);
        ((Bundle)localObject).putInt("geta8key_data_scene", k);
        ((Bundle)localObject).putInt("geta8key_data_subscene", j);
        ((Bundle)localObject).putInt("geta8key_data_reason", i);
        if (this.pzf.getIsX5Kernel())
        {
          ((Bundle)localObject).putInt("geta8key_data_flag", 1);
          ((Bundle)localObject).putString("geta8key_data_net_type", aq.cXS());
          ((Bundle)localObject).putInt("geta8key_session_id", this.uvB);
          if (!bo.isNullOrNil(getIntent().getStringExtra("k_share_url")))
          {
            ((Bundle)localObject).putString("k_share_url", getIntent().getStringExtra("k_share_url"));
            getIntent().putExtra("k_share_url", "");
          }
          ((Bundle)localObject).putInt("key_wallet_region", m);
          ((Bundle)localObject).putString("key_function_id", str2);
          ((Bundle)localObject).putInt("webview_binder_id", hashCode());
          ((Bundle)localObject).putByteArray("k_a8key_cookie", this.uvD);
          ((Bundle)localObject).putString("geta8key_data_appid", getIntent().getStringExtra("geta8key_open_webview_appid"));
          this.uvC = paramString;
          paramBoolean = false;
        }
        try
        {
          boolean bool = this.icy.s(233, (Bundle)localObject);
          paramBoolean = bool;
          ab.i("MicroMsg.WebViewUI", "startGetA8Key, doScene ret = ".concat(String.valueOf(paramBoolean)));
          localObject = this.ulI.cXU();
          paramInt = this.cSQ;
          str1 = this.cMm;
          ((aq.m)localObject).cSQ = paramInt;
          ((aq.m)localObject).uni = str1;
          if (bo.isNullOrNil(paramString))
          {
            ab.e("MicroMsg.WebviewReporter", "WebviewGetA8keyReporter.startGetA8Key failed, url is null");
            com.tencent.mm.plugin.report.service.h.pYm.a(154L, 11L, 1L, false);
            this.uwE.aI("getA8KeyStart", System.currentTimeMillis());
            paramString = WebViewUI.w.uxT;
            AppMethodBeat.o(8078);
            break;
            ((Bundle)localObject).putInt("geta8key_data_flag", 0);
          }
        }
        catch (Exception localException)
        {
          while (true)
          {
            ab.w("MicroMsg.WebViewUI", "startGetA8Key, ex = " + localException.getMessage());
            continue;
            if (!localException.unu.containsKey(paramString))
              localException.unu.put(paramString, Long.valueOf(bo.anU()));
          }
        }
      }
  }

  private void nN(boolean paramBoolean)
  {
    if (!paramBoolean)
      this.uvL = true;
  }

  private void nQ(boolean paramBoolean)
  {
    AppMethodBeat.i(8069);
    if (this.uva != null)
      this.uva.setEnabled(paramBoolean);
    AppMethodBeat.o(8069);
  }

  protected void FY(String paramString)
  {
    AppMethodBeat.i(7982);
    ab.i("MicroMsg.WebViewUI", "[notifyPageInfo]pageInfo:%s", new Object[] { paramString });
    AppMethodBeat.o(7982);
  }

  protected void G(Bundle paramBundle)
  {
  }

  protected boolean H(Bundle paramBundle)
  {
    AppMethodBeat.i(8087);
    ab.d("MicroMsg.WebViewUI", "[cpan] process a8 key:%d", new Object[] { Long.valueOf(System.currentTimeMillis()) });
    int i = paramBundle.getInt("geta8key_result_action_code");
    String str1 = paramBundle.getString("geta8key_result_title");
    String str2 = paramBundle.getString("geta8key_result_full_url");
    String str3 = paramBundle.getString("geta8key_result_content");
    String str4 = paramBundle.getString("geta8key_result_req_url");
    Object localObject1 = paramBundle.getStringArray("geta8key_result_http_header_key_list");
    String[] arrayOfString = paramBundle.getStringArray("geta8key_result_http_header_value_list");
    Object localObject2 = localObject1;
    paramBundle = arrayOfString;
    if (getIntent().getBooleanExtra("k_has_http_header", false))
      if ((localObject1 != null) && (localObject1.length != 0) && (arrayOfString != null))
      {
        localObject2 = localObject1;
        paramBundle = arrayOfString;
        if (arrayOfString.length != 0);
      }
      else
      {
        ab.i("MicroMsg.WebViewUI", "use intent httpheader info");
        getIntent().putExtra("k_has_http_header", false);
        localObject2 = getIntent().getStringArrayExtra("geta8key_result_http_header_key_list");
        paramBundle = getIntent().getStringArrayExtra("geta8key_result_http_header_value_list");
        getIntent().putStringArrayListExtra("geta8key_result_http_header_key_list", null);
        getIntent().putStringArrayListExtra("geta8key_result_http_header_value_list", null);
      }
    ab.i("MicroMsg.WebViewUI", "processGetA8Key, actionCode = %d, title = %s, fullUrl = %s, content = %s", new Object[] { Integer.valueOf(i), str1, str2, str3 });
    localObject1 = new HashMap();
    int j;
    if ((localObject2 != null) && (paramBundle != null) && (localObject2.length > 0) && (paramBundle.length > 0) && (localObject2.length == paramBundle.length))
      for (j = 0; j < localObject2.length; j++)
        ((Map)localObject1).put(localObject2[j], paramBundle[j]);
    this.uws = ((Map)localObject1);
    if (!bo.isNullOrNil(str2));
    for (paramBundle = str2; ; paramBundle = str4)
    {
      aq.V(this.pzf.getIsX5Kernel(), bo.nullAsNil(paramBundle).startsWith("https://"));
      this.ulI.cXU().bE(str4, true);
      paramBundle = this.ulI.cXW();
      j = this.cSQ;
      localObject2 = this.cMm;
      paramBundle.cSQ = j;
      paramBundle.uni = ((String)localObject2);
      if (bo.isNullOrNil(str2))
        ab.e("MicroMsg.WebviewReporter", "WebViewRenderReporter.onPageStart failed, url is null");
      boolean bool;
      switch (i)
      {
      default:
        ab.i("MicroMsg.WebViewUI", "qrcode-getA8key-not_catch: action code = ".concat(String.valueOf(i)));
        bool = false;
        AppMethodBeat.o(8087);
      case 1:
      case 2:
      case 7:
      case 30:
      case 6:
      case 3:
      case 4:
        while (true)
        {
          return bool;
          paramBundle.iCz = str2;
          paramBundle.unh = true;
          if (!paramBundle.unf.containsKey(str2))
            paramBundle.unf.put(str2, Long.valueOf(bo.anU()));
          if (paramBundle.ung.containsKey(str2))
            break;
          paramBundle.ung.put(str2, Long.valueOf(bo.anU()));
          break;
          ab.i("MicroMsg.WebViewUI", "getA8key-text: ".concat(String.valueOf(str3)));
          if ((str3 == null) || (str3.length() == 0))
          {
            ab.e("MicroMsg.WebViewUI", "getA8key-text fail, invalid content");
            bool = false;
            AppMethodBeat.o(8087);
          }
          else
          {
            this.pzf.getSettings().setJavaScriptEnabled(false);
            this.pzf.loadData(str3, "text/html", "utf-8");
            bool = true;
            AppMethodBeat.o(8087);
            continue;
            ab.i("MicroMsg.WebViewUI", "getA8key-webview: title = " + str1 + ", fullUrl = " + str2);
            if ((str2 == null) || (str2.length() == 0))
            {
              ab.e("MicroMsg.WebViewUI", "getA8key-webview fail, invalid fullUrl");
              bool = false;
              AppMethodBeat.o(8087);
            }
            else
            {
              if ((str1 != null) && (str1.length() > 0))
                setMMTitle(str1);
              if (!afQ(str2))
              {
                ab.f("MicroMsg.WebViewUI", "processGetA8Key qrcode, canLoadUrl fail, url = ".concat(String.valueOf(str2)));
                dah();
                bool = true;
                AppMethodBeat.o(8087);
              }
              else
              {
                c(str4, str2, (Map)localObject1);
                bool = true;
                AppMethodBeat.o(8087);
                continue;
                ab.i("MicroMsg.WebViewUI", "getA8key-webview_no_notice: title = " + str1 + ", fullUrl = " + str2);
                if ((str2 == null) || (str2.length() == 0))
                {
                  ab.e("MicroMsg.WebViewUI", "getA8key-webview_no_notice fail, invalid fullUrl");
                  bool = false;
                  AppMethodBeat.o(8087);
                }
                else
                {
                  if ((str1 != null) && (str1.length() > 0))
                    setMMTitle(str1);
                  if (!afQ(str2))
                  {
                    ab.f("MicroMsg.WebViewUI", "processGetA8Key qrcode no notice, canLoadUrl fail, url = ".concat(String.valueOf(str2)));
                    dah();
                    bool = true;
                    AppMethodBeat.o(8087);
                  }
                  else
                  {
                    c(str4, str2, (Map)localObject1);
                    bool = true;
                    AppMethodBeat.o(8087);
                    continue;
                    ab.i("MicroMsg.WebViewUI", "getA8key-special_webview: fullUrl = ".concat(String.valueOf(str2)));
                    if ((str2 == null) || (str2.length() == 0))
                    {
                      ab.e("MicroMsg.WebViewUI", "getA8key-special_webview fail, invalid fullUrl");
                      bool = false;
                      AppMethodBeat.o(8087);
                    }
                    else if (!afQ(str2))
                    {
                      ab.f("MicroMsg.WebViewUI", "processGetA8Key special, canLoadUrl fail, url = ".concat(String.valueOf(str2)));
                      dah();
                      bool = true;
                      AppMethodBeat.o(8087);
                    }
                    else
                    {
                      b(str2, null, false);
                      nO(false);
                      bool = true;
                      AppMethodBeat.o(8087);
                      continue;
                      ab.i("MicroMsg.WebViewUI", "getA8key-app: ".concat(String.valueOf(str2)));
                      if ((str2 == null) || (str2.length() == 0))
                      {
                        ab.e("MicroMsg.WebViewUI", "getA8key-app, fullUrl is null");
                        bool = false;
                        AppMethodBeat.o(8087);
                      }
                      else
                      {
                        bool = afP(str2);
                        AppMethodBeat.o(8087);
                        continue;
                        bool = afO(str2);
                        AppMethodBeat.o(8087);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      case 20:
      }
      if (bo.isNullOrNil(str2))
        ab.e("MicroMsg.WebViewUI", "doJumpEmotionDetailUrlScene err: null or nill url");
      while (true)
      {
        bool = true;
        AppMethodBeat.o(8087);
        break;
        paramBundle = this.uvU;
        if (paramBundle.uxP == 0)
          paramBundle.uxp.Jr(666);
        paramBundle.uxP += 1;
        paramBundle = new Bundle();
        paramBundle.putString("emoji_store_jump_url", str2);
        paramBundle.putInt("webview_binder_id", hashCode());
        try
        {
          this.icy.s(666, paramBundle);
        }
        catch (Exception paramBundle)
        {
          ab.w("MicroMsg.WebViewUI", "startSearchContact, ex = " + paramBundle.getMessage());
        }
      }
    }
  }

  protected final void Jt(int paramInt)
  {
    AppMethodBeat.i(8035);
    Drawable localDrawable = getResources().getDrawable(2131230739).mutate();
    localDrawable.setColorFilter(paramInt, PorterDuff.Mode.SRC_IN);
    x(localDrawable);
    AppMethodBeat.o(8035);
  }

  protected final void Ju(int paramInt)
  {
    AppMethodBeat.i(8064);
    if (paramInt != -3)
      AppMethodBeat.o(8064);
    while (true)
    {
      return;
      if (this.uvH == null)
      {
        AppMethodBeat.o(8064);
      }
      else
      {
        if ((this.icz.cZT().vxG & 0x1) > 0);
        for (boolean bool = true; ; bool = false)
        {
          ab.d("MicroMsg.GeneralControlWrapper", "needShowInputAlertTips, ret = ".concat(String.valueOf(bool)));
          if (!bool)
            break label240;
          if ((this.uvH.getVisibility() != 0) && (!this.uvj.isShown()))
            break label106;
          AppMethodBeat.o(8064);
          break;
        }
        label106: if (this.uvI == null)
          this.uvI = new ap(Looper.getMainLooper(), new WebViewUI.37(this), false);
        this.uvI.ae(4000L, 4000L);
        View localView = this.uvH;
        ((ImageView)localView.findViewById(2131825261)).setImageResource(2131231709);
        TextView localTextView = (TextView)localView.findViewById(2131825262);
        localTextView.setTextSize(14.0F);
        localTextView.setText(2131305690);
        ((ImageButton)localView.findViewById(2131825263)).setOnClickListener(new WebViewUI.38(this));
        this.uvH.setVisibility(0);
        com.tencent.mm.plugin.report.service.h.pYm.X(13125, cWL());
        label240: AppMethodBeat.o(8064);
      }
    }
  }

  protected void Jw(int paramInt)
  {
    AppMethodBeat.i(8090);
    if ((this.pzf == null) || (this.pzf.getSettings() == null))
      AppMethodBeat.o(8090);
    while (true)
    {
      return;
      ab.i("MicroMsg.WebViewUI", "localSetFontSize, fontSize = ".concat(String.valueOf(paramInt)));
      switch (paramInt)
      {
      case 2:
      default:
        this.pzf.getSettings().a(com.tencent.xweb.p.a.AMG);
        AppMethodBeat.o(8090);
        break;
      case 1:
        this.pzf.getSettings().a(com.tencent.xweb.p.a.AMF);
        AppMethodBeat.o(8090);
        break;
      case 3:
        this.pzf.getSettings().a(com.tencent.xweb.p.a.AMH);
        AppMethodBeat.o(8090);
        break;
      case 4:
        this.pzf.getSettings().a(com.tencent.xweb.p.a.AMI);
        AppMethodBeat.o(8090);
      }
    }
  }

  public final void M(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(7991);
    if (this.uvx)
    {
      super.setMMTitle(2131305579);
      AppMethodBeat.o(7991);
    }
    while (true)
    {
      return;
      super.M(paramCharSequence);
      AppMethodBeat.o(7991);
    }
  }

  protected final void W(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(8027);
    this.uvf = paramBoolean1;
    Object localObject;
    if (paramBoolean1)
    {
      if (getSupportActionBar() != null)
        getSupportActionBar().hide();
      if (this.uwT != null)
      {
        localObject = (ViewGroup.MarginLayoutParams)this.uwT.getLayoutParams();
        ((ViewGroup.MarginLayoutParams)localObject).topMargin = 0;
        this.uwT.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      if (this.uwl)
        com.tencent.mm.ui.statusbar.a.D(this.uwT, true);
    }
    label307: 
    while (true)
    {
      getWindow().addFlags(1024);
      localObject = getWindow().getDecorView();
      ((View)localObject).setOnSystemUiVisibilityChangeListener(new WebViewUI.7(this, (View)localObject));
      af((View)localObject, 5894);
      if (paramBoolean2)
      {
        this.uve.setOnClickListener(new WebViewUI.8(this));
        this.uve.setVisibility(0);
        AppMethodBeat.o(8027);
      }
      while (true)
      {
        return;
        if (this.uwU == null)
          break label307;
        this.uwU.setVisibility(8);
        break;
        this.uve.setVisibility(8);
        AppMethodBeat.o(8027);
        continue;
        this.uve.setVisibility(8);
        getWindow().clearFlags(1024);
        ep(getWindow().getDecorView());
        if (getSupportActionBar() != null)
        {
          getSupportActionBar().show();
          if (this.uwT != null)
          {
            localObject = (ViewGroup.MarginLayoutParams)this.uwT.getLayoutParams();
            ((ViewGroup.MarginLayoutParams)localObject).topMargin = daa();
            this.uwT.setLayoutParams((ViewGroup.LayoutParams)localObject);
          }
        }
        if (this.uwl)
        {
          com.tencent.mm.ui.statusbar.a.D(this.uwT, false);
          AppMethodBeat.o(8027);
        }
        else
        {
          if (this.uwU != null)
            this.uwU.setVisibility(0);
          AppMethodBeat.o(8027);
        }
      }
    }
  }

  protected final void X(boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(8070);
    enableOptionMenu(paramBoolean1);
    ab.d("MicroMsg.WebViewUI", "[cpan] set title enable:%b", new Object[] { Boolean.valueOf(paramBoolean1) });
    setProgressBarIndeterminateVisibility(false);
    if (paramBoolean2)
    {
      this.uuX.finish();
      this.uwI.cZJ();
      AppMethodBeat.o(8070);
    }
    while (true)
    {
      return;
      if ((!this.uwn) && (!this.uwp))
        this.uuX.start();
      AppMethodBeat.o(8070);
    }
  }

  @TargetApi(21)
  protected final void a(ViewGroup paramViewGroup, WindowInsets paramWindowInsets)
  {
    AppMethodBeat.i(8000);
    if (this.iJp == paramWindowInsets.getSystemWindowInsetTop())
      AppMethodBeat.o(8000);
    while (true)
    {
      return;
      this.iJp = paramWindowInsets.getSystemWindowInsetTop();
      cZY();
      Object localObject = paramViewGroup;
      if ((paramViewGroup instanceof SwipeBackLayout))
        localObject = paramViewGroup.getChildAt(0);
      localObject = ((View)localObject).findViewById(2131820940);
      if (localObject != null)
      {
        paramViewGroup = (ViewGroup.MarginLayoutParams)((View)localObject).getLayoutParams();
        paramViewGroup.topMargin = paramWindowInsets.getSystemWindowInsetTop();
        ((View)localObject).setLayoutParams(paramViewGroup);
        ((View)localObject).requestLayout();
      }
      if (dab())
        dad();
      AppMethodBeat.o(8000);
    }
  }

  public void aBS()
  {
    AppMethodBeat.i(8010);
    if (Build.VERSION.SDK_INT > 10)
      if (getForceOrientation() == -1)
      {
        this.ylk = getSharedPreferences(com.tencent.mm.sdk.platformtools.ah.doA(), 4).getBoolean("settings_landscape_mode", false);
        if (this.ylk)
        {
          setRequestedOrientation(-1);
          AppMethodBeat.o(8010);
        }
      }
    while (true)
    {
      return;
      setRequestedOrientation(1);
      AppMethodBeat.o(8010);
      continue;
      setRequestedOrientation(getForceOrientation());
      AppMethodBeat.o(8010);
      continue;
      super.aBS();
      AppMethodBeat.o(8010);
    }
  }

  protected void aMh()
  {
    AppMethodBeat.i(8042);
    this.uwE.aI("onPostBindedStart", System.currentTimeMillis());
    ab.i("MicroMsg.WebViewUI", "edw postBinded");
    this.uie.a(new com.tencent.mm.plugin.webview.ui.tools.bag.p(this.icy));
    daA();
    Object localObject1 = this.uwF;
    Object localObject4 = this.icy;
    try
    {
      localObject5 = ((com.tencent.mm.plugin.webview.stub.d)localObject4).afk("DNSAdvanceOpen");
      ab.i("MicroMsg.DNSPreGetOptimize", "switch open value : %s", new Object[] { localObject5 });
      if (bo.isNullOrNil((String)localObject5))
      {
        ab.e("MicroMsg.DNSPreGetOptimize", "get switch value is null or nil");
        bool = false;
        if (bool)
          break label2236;
        ab.i("MicroMsg.DNSPreGetOptimize", "server closed the switch");
        label122: if ((aYd()) && (aYa()))
          al.d(new WebViewUI.26(this));
        this.uwE.aI("onJSAPIStart", System.currentTimeMillis());
        localObject5 = new Bundle();
        localObject4 = getIntent().getBundleExtra("jsapiargs");
        localObject1 = localObject4;
        if (localObject4 == null)
          localObject1 = new Bundle();
        ((Bundle)localObject1).putInt("key_download_restrict", getIntent().getIntExtra("key_download_restrict", 0));
        ((Bundle)localObject1).putString("key_function_id", getIntent().getStringExtra("key_function_id"));
        ab.i("MicroMsg.WebViewUI", "KDownloadRestrict = %d, KFunctionID = %s", new Object[] { Integer.valueOf(((Bundle)localObject1).getInt("key_download_restrict", 0)), ((Bundle)localObject1).getString("key_function_id", "") });
        ((Bundle)localObject5).putBundle("jsapiargs", (Bundle)localObject1);
        ((Bundle)localObject5).putCharSequence("bizofstartfrom", getIntent().getStringExtra("bizofstartfrom"));
        ((Bundle)localObject5).putBundle("startwebviewparams", getIntent().getBundleExtra("startwebviewparams"));
        ((Bundle)localObject5).putInt("screen_orientation", this.screenOrientation);
      }
    }
    catch (Exception localException8)
    {
      try
      {
        this.icy.a(20, (Bundle)localObject5, hashCode());
        label337: str2 = getIntent().getStringExtra("geta8key_username");
        i = getIntent().getIntExtra("preChatTYPE", 0);
        localObject5 = getIntent().getStringExtra("srcUsername");
        long l = getIntent().getLongExtra("message_id", 0L);
        j = getIntent().getIntExtra("message_index", 0);
        String str3 = getIntent().getStringExtra("KsnsViewId");
        localObject6 = getIntent().getStringExtra("KPublisherId");
        String str4 = getIntent().getStringExtra("KAppId");
        String str5 = getIntent().getStringExtra("pre_username");
        String str6 = getIntent().getStringExtra("expid_str");
        String str7 = ((Bundle)localObject1).getString("key_snsad_statextstr");
        localObject4 = null;
        if (this.pzf != null)
          localObject4 = this.pzf.getTitle();
        localObject1 = localObject4;
        if (bo.isNullOrNil((String)localObject4))
          localObject1 = getIntent().getStringExtra("title");
        localObject4 = localObject1;
        if (bo.isNullOrNil((String)localObject1))
          localObject4 = getIntent().getStringExtra("webpageTitle");
        localObject1 = this.ulI.cXX();
        ((aq.l)localObject1).username = str2;
        ((aq.l)localObject1).uns = i;
        ((aq.l)localObject1).cOG = this.cOG;
        ((aq.l)localObject1).uno = j;
        ((aq.l)localObject1).scene = afH(str2);
        ((aq.l)localObject1).unn = l;
        ((aq.l)localObject1).unp = new com.tencent.mm.a.p(l).toString();
        ((aq.l)localObject1).unl = ((String)localObject5);
        ((aq.l)localObject1).unm = str3;
        ((aq.l)localObject1).fjS = ((String)localObject6);
        ((aq.l)localObject1).appId = str4;
        ((aq.l)localObject1).unq = str5;
        ((aq.l)localObject1).unr = this.unr;
        ((aq.l)localObject1).rjC = str7;
        ((aq.l)localObject1).title = bo.bc((String)localObject4, "");
        ((aq.l)localObject1).dJE = str6;
        localObject1 = this.ulI.cXY();
        ((aq.a)localObject1).fjS = ((String)localObject6);
        ((aq.a)localObject1).scene = afH(str2);
        this.ulI.cYa().cOG = this.cOG;
        if (!das());
      }
      catch (RemoteException localException8)
      {
        try
        {
          while (true)
          {
            Object localObject5;
            boolean bool;
            String str2;
            int i;
            int j;
            Object localObject6;
            localObject1 = new android/os/Bundle;
            ((Bundle)localObject1).<init>();
            ((Bundle)localObject1).putString("srcUsername", getIntent().getStringExtra("srcUsername"));
            this.icy.a(29, (Bundle)localObject1, hashCode());
            label737: if (!bo.isNullOrNil((String)localObject5));
            try
            {
              this.icy.afl((String)localObject5);
            }
            catch (Exception localException8)
            {
              try
              {
                j = getIntent().getIntExtra("pay_channel", -1);
                if (j != -1)
                {
                  ab.i("MicroMsg.WebViewUI", "hy: found channel in intent. pay channel: %d", new Object[] { Integer.valueOf(j) });
                  this.uvJ.clear();
                  this.uhz = aXY();
                  localObject4 = this.uhz;
                  localObject5 = getIntent().getStringExtra("geta8key_username");
                  if (bo.isNullOrNil(getIntent().getStringExtra("srcUsername")))
                    break label2441;
                  localObject1 = new HashMap();
                  ((Map)localObject1).put("srcUsername", getIntent().getStringExtra("srcUsername"));
                  ((Map)localObject1).put("srcDisplayname", getIntent().getStringExtra("srcDisplayname"));
                  ((Map)localObject1).put("message_id", Long.valueOf(getIntent().getLongExtra("message_id", 0L)));
                  ((Map)localObject1).put("message_index", Integer.valueOf(getIntent().getIntExtra("message_index", 0)));
                  ((Map)localObject1).put("scene", Integer.valueOf(afH((String)localObject5)));
                  ((Map)localObject1).put("pay_channel", Integer.valueOf(getIntent().getIntExtra("pay_channel", 0)));
                  ((Map)localObject1).put("stastic_scene", Integer.valueOf(getIntent().getIntExtra("stastic_scene", 0)));
                  ((Map)localObject1).put("from_scence", Integer.valueOf(getIntent().getIntExtra("from_scence", 0)));
                  if (!bo.isNullOrNil(getIntent().getStringExtra("KTemplateId")))
                    ((Map)localObject1).put("KTemplateId", getIntent().getStringExtra("KTemplateId"));
                  j = getIntent().getIntExtra("pay_scene", -1);
                  if (j == -1)
                    break label2481;
                  ab.i("MicroMsg.WebViewUI", "get pay scene from extra: %s", new Object[] { Integer.valueOf(j) });
                  ((Map)localObject1).put("pay_scene", Integer.valueOf(j));
                  ((com.tencent.mm.plugin.webview.ui.tools.jsapi.d)localObject4).uFt = ((Map)localObject1);
                  if (dap() != null)
                    dap().uaz = this.uhz;
                  this.pzf.addJavascriptInterface(this.uhz, "__wx");
                  this.uvJ.add(this.uhz);
                  this.uvJ.add(new WebViewUI.s(this, (byte)0));
                  this.uvJ.add(new WebViewUI.p(this, (byte)0));
                  this.uvJ.add(new WebViewUI.e(this, (byte)0));
                  this.uvJ.add(new WebViewUI.r(this, (byte)0));
                  this.uvJ.add(new WebViewUI.u(this, (byte)0));
                  this.uvJ.add(new WebViewUI.a(this, (byte)0));
                  this.uvJ.add(new WebViewUI.y(this, (byte)0));
                  this.uvJ.add(new WebViewUI.t(this, (byte)0));
                  this.uvJ.add(new WebViewUI.i(this, (byte)0));
                  this.uvJ.add(new WebViewUI.b(this, (byte)0));
                  this.uvJ.add(new WebViewUI.c(this, (byte)0));
                  this.uvJ.add(new com.tencent.mm.plugin.webview.ui.tools.jsapi.e(this.pzf, this.uhz));
                  this.uvJ.add(new WebViewUI.x(this, (byte)0));
                  this.uvJ.add(new WebViewUI.v(this, (byte)0));
                  this.uvJ.add(new n((byte)0));
                  if (getIntent().getBooleanExtra("allow_wx_schema_url", false))
                    this.uvJ.add(new WebViewUI.k(this, (byte)0));
                  this.uvJ.add(new f((byte)0));
                }
              }
              catch (Exception localException8)
              {
                try
                {
                  j = bo.getInt(this.icy.afk("WebviewDisableX5Logo"), 0);
                  bool = getIntent().getBooleanExtra("disable_bounce_scroll", false);
                  ab.i("MicroMsg.WebViewUI", "getting flag of x5 logo state, disableX5Logo = %d, disableBounceScroll = %b", new Object[] { Integer.valueOf(j), Boolean.valueOf(bool) });
                  if ((j == 1) || (bool))
                    this.uwX.nM(true);
                  if (getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("tbs_disable_over_scroll", false))
                    this.uwX.nM(true);
                }
                catch (Exception localException8)
                {
                  try
                  {
                    this.uvX = bo.getInt(this.icy.afk("OpenJSReadySpeedy"), 0);
                    ab.i("MicroMsg.WebViewUI", "postBinded, openJSReadySpeedy = %d", new Object[] { Integer.valueOf(this.uvX) });
                    this.uwE.aI("onJSAPIEnd", System.currentTimeMillis());
                    aq.V(this.pzf.getIsX5Kernel(), bo.nullAsNil(this.cOG).startsWith("https://"));
                    if (this.pzf.getIsX5Kernel())
                    {
                      com.tencent.mm.pluginsdk.ui.tools.m.kT(7);
                      com.tencent.mm.plugin.report.service.h.pYm.a(64, 64, 1, 0, 1, 1, false);
                      this.uvY = new com.tencent.mm.plugin.webview.ui.tools.jsapi.f(this.pzf, this.icy, this.uhz, new WebViewUI.27(this), getIntent().getBooleanExtra("key_load_js_without_delay", false), aYd());
                    }
                  }
                  catch (Exception localException8)
                  {
                    try
                    {
                      j = bo.getInt(this.icy.afk("WebviewDisableDigestVerify"), 0);
                      ab.i("MicroMsg.WebViewUI", "js digest verification config = %d", new Object[] { Integer.valueOf(j) });
                      if ((j == 0) && (getSharedPreferences("com.tencent.mm_webview_x5_preferences", 4).getBoolean("wvsha1", true)) && (aYb()))
                      {
                        this.uhz.dch();
                        this.uwP.aey(this.uhz.uFw);
                      }
                      if (getIntent().getBooleanExtra("forceHideShare", false))
                      {
                        nO(false);
                        ab.d("MicroMsg.WebViewUI", "[hakon] postBinded :%d: force hide", new Object[] { Long.valueOf(System.currentTimeMillis()) });
                        this.uvb = LayoutInflater.from(this).inflate(2130971202, null);
                        localObject1 = (FontChooserView)this.uvb.findViewById(2131829157);
                        localObject4 = this.uvb.findViewById(2131829158);
                        if (!this.pzf.getIsX5Kernel())
                        {
                          ((View)localObject4).setVisibility(0);
                          ((View)localObject4).setOnClickListener(new View.OnClickListener()
                          {
                            public final void onClick(View paramAnonymousView)
                            {
                              AppMethodBeat.i(7876);
                              paramAnonymousView = AnimationUtils.loadAnimation(WebViewUI.this, 2131034185);
                              paramAnonymousView.setAnimationListener(new WebViewUI.46.1(this));
                              WebViewUI.this.uvb.startAnimation(paramAnonymousView);
                              WebViewUI.this.uvb.setVisibility(8);
                              AppMethodBeat.o(7876);
                            }
                          });
                        }
                        ((FontChooserView)localObject1).setOnChangeListener(new WebViewUI.j(this, (byte)0));
                        localObject1 = new FrameLayout.LayoutParams(-1, -2, 80);
                        this.uvb.setLayoutParams((ViewGroup.LayoutParams)localObject1);
                        this.uvc.addView(this.uvb);
                        this.uvb.setVisibility(8);
                        i = 2;
                        j = i;
                      }
                    }
                    catch (Exception localException8)
                    {
                      try
                      {
                        if (this.icy.cZd())
                        {
                          if ((dax()) || (day()))
                            j = daz();
                        }
                        else
                        {
                          if (j > 0)
                          {
                            i = j;
                            if (j <= 4);
                          }
                          else
                          {
                            i = 2;
                          }
                          Jv(i);
                          Jw(i);
                        }
                      }
                      catch (Exception localException8)
                      {
                        try
                        {
                          while (true)
                          {
                            while (true)
                            {
                              this.icy.a(this.cOG, true, null);
                              localObject1 = this.uvJ.iterator();
                              do
                              {
                                if (!((Iterator)localObject1).hasNext())
                                  break;
                                localObject4 = (com.tencent.mm.plugin.webview.ui.tools.jsapi.b)((Iterator)localObject1).next();
                              }
                              while (!a((com.tencent.mm.plugin.webview.ui.tools.jsapi.b)localObject4, this.cOG));
                              bool = ((com.tencent.mm.plugin.webview.ui.tools.jsapi.b)localObject4).afM(this.cOG);
                              ab.i("MicroMsg.WebViewUI", "initView, url handled, result = " + bool + ", url = " + this.cOG);
                              AppMethodBeat.o(8042);
                              return;
                              bool = ((String)localObject5).equalsIgnoreCase("1");
                              break;
                              localException1 = localException1;
                              ab.e("MicroMsg.DNSPreGetOptimize", "get dns pre get switch failed");
                              break label122;
                              try
                              {
                                label2236: str2 = ((com.tencent.mm.plugin.webview.stub.d)localObject4).afk("DNSAdvanceRelateDomain");
                                if (!bo.isNullOrNil(str2))
                                  break label2285;
                                ab.e("MicroMsg.DNSPreGetOptimize", "domain list is null, just return");
                              }
                              catch (Exception localException2)
                              {
                                ab.printErrStackTrace("MicroMsg.DNSPreGetOptimize", localException2, "", new Object[0]);
                              }
                            }
                            break label122;
                            label2285: localObject5 = localException2.aNS();
                            localObject6 = new com/tencent/mm/plugin/webview/model/b$1;
                            ((b.1)localObject6).<init>(localException2, str2, (com.tencent.mm.plugin.webview.stub.d)localObject4);
                            ((al)localObject5).aa((Runnable)localObject6);
                            break label122;
                            localRemoteException = localRemoteException;
                            ab.e("MicroMsg.WebViewUI", "postBinded, invoke AC_SET_INITIAL_ARGS, ex = " + localRemoteException.getMessage());
                            break label337;
                            localException3 = localException3;
                            ab.e("MicroMsg.WebViewUI", "postBinded, fail triggerGetContact, ex = " + localException3.getMessage());
                            continue;
                            j = this.icy.cZr();
                            if (j != -1)
                            {
                              ab.i("MicroMsg.WebViewUI", "hy: found channel in channel helper. pay channel: %d", new Object[] { Integer.valueOf(j) });
                              getIntent().putExtra("pay_channel", j);
                              continue;
                              localException4 = localException4;
                              ab.e("MicroMsg.WebViewUI", "hy: init pay channel failed");
                              continue;
                              label2441: HashMap localHashMap;
                              if (!bo.isNullOrNil((String)localObject5))
                              {
                                localHashMap = new HashMap();
                                localHashMap.put("srcUsername", localObject5);
                              }
                              else
                              {
                                localHashMap = new HashMap();
                                continue;
                                label2481: j = 3;
                                ab.i("MicroMsg.WebViewUI", "default pay scene to: %s", new Object[] { Integer.valueOf(3) });
                                continue;
                                localException5 = localException5;
                                ab.w("MicroMsg.WebViewUI", "getting flag of x5 logo state failed, ex = " + localException5.getMessage());
                                j = 0;
                                continue;
                                localException6 = localException6;
                                ab.w("MicroMsg.WebViewUI", "postBinded, openJSReadySpeedy, ex = " + localException6.getMessage());
                                continue;
                                com.tencent.mm.plugin.report.service.h.pYm.a(64L, 0L, 1L, false);
                                continue;
                                localException7 = localException7;
                                ab.w("MicroMsg.WebViewUI", "getting js digest verification config fails, ex = " + localException7.getMessage());
                                j = 0;
                                continue;
                                bool = getIntent().getBooleanExtra("showShare", true);
                                nO(bool);
                                ab.d("MicroMsg.WebViewUI", "[cpan] postBinded :%d: show:%b", new Object[] { Long.valueOf(System.currentTimeMillis()), Boolean.valueOf(bool) });
                                continue;
                                if ((!bo.isNullOrNil(this.cOG)) && (com.tencent.mm.plugin.webview.a.uet.matcher(this.cOG).matches()))
                                  j = this.icy.gw(16388, 0);
                                else
                                  j = this.icy.gw(16384, 0);
                              }
                            }
                          }
                          localException8 = localException8;
                          ab.w("MicroMsg.WebViewUI", "initFontChooserView, ex = " + localException8.getMessage());
                          j = i;
                        }
                        catch (Exception localException9)
                        {
                          while (true)
                          {
                            ab.w("MicroMsg.WebViewUI", "postBinded, jumpToActivity, ex = " + localException9.getMessage());
                            continue;
                            if (cZA())
                            {
                              ab.w("MicroMsg.WebViewUI", "needDelayLoadUrl is true, do nothing");
                              AppMethodBeat.o(8042);
                            }
                            else
                            {
                              String str1 = getIntent().getStringExtra("data");
                              Object localObject3;
                              if (str1 != null)
                              {
                                ab.i("MicroMsg.WebViewUI", str1);
                                Object localObject2 = str1;
                                if (getIntent().getBooleanExtra("QRDataFlag", true));
                                try
                                {
                                  localObject2 = this.icy.afg(str1);
                                  this.pzf.setOnLongClickListener(this.uwZ);
                                  this.uwY = true;
                                  this.pzf.getSettings().setUseWideViewPort(false);
                                  this.pzf.getSettings().setLoadWithOverviewMode(false);
                                  if (!afQ(null))
                                  {
                                    ab.f("MicroMsg.WebViewUI", "postBinded baseUrl, canLoadUrl fail, url = " + null);
                                    dah();
                                    AppMethodBeat.o(8042);
                                  }
                                }
                                catch (Exception localException10)
                                {
                                  while (true)
                                  {
                                    ab.w("MicroMsg.WebViewUI", "postBinded, formatQRString, ex = " + localException10.getMessage());
                                    localObject3 = str1;
                                  }
                                  this.pzf.getSettings().setJavaScriptEnabled(false);
                                  this.pzf.loadDataWithBaseURL(null, (String)localObject3, "text/html", "utf-8", null);
                                  ab.i("MicroMsg.WebViewUI", "loadDataWithBaseUrl, data = ".concat(String.valueOf(localObject3)));
                                }
                              }
                              else
                              {
                                while (true)
                                {
                                  while (true)
                                  {
                                    this.uwE.aI("onPostBindedEnd", System.currentTimeMillis());
                                    AppMethodBeat.o(8042);
                                    break;
                                    if (bo.isNullOrNil(this.cOG))
                                      jD(false);
                                    if ((this.cOG == null) || (this.cOG.length() == 0))
                                    {
                                      ab.e("MicroMsg.WebViewUI", "initView, rawUrl is null, no data or getStringExtra(\"data\") is null");
                                      AppMethodBeat.o(8042);
                                      break;
                                    }
                                    localObject3 = Uri.parse(this.cOG);
                                    if (localObject3 == null)
                                    {
                                      ab.e("MicroMsg.WebViewUI", "initView uri is null");
                                      AppMethodBeat.o(8042);
                                      break;
                                    }
                                    if (((Uri)localObject3).getScheme() == null)
                                    {
                                      this.cOG = ("http://" + this.cOG);
                                      label3160: this.uvR = new WebViewUI.l(this.cOG);
                                    }
                                    try
                                    {
                                      localObject3 = this.icy.g(100000, null);
                                      if ((localObject3 != null) && (((Bundle)localObject3).getString("force_geta8key_host_path") != null))
                                      {
                                        this.uxa = ((Bundle)localObject3).getString("force_geta8key_host_path").split(";");
                                        this.uvR.uxa = this.uxa;
                                      }
                                      if ((!this.uvs) && (!this.icz.has(this.cOG)))
                                        break label3543;
                                      ab.i("MicroMsg.WebViewUI", "initView, no need to geta8key, loadUrl directly, neverGetA8Key = " + this.uvs);
                                      if (!afQ(this.cOG))
                                      {
                                        ab.f("MicroMsg.WebViewUI", "postBinded 2, canLoadUrl fail, url = " + this.cOG);
                                        dah();
                                        AppMethodBeat.o(8042);
                                        break;
                                        if (((Uri)localObject3).getScheme().startsWith("http"))
                                          break label3160;
                                        ab.i("MicroMsg.WebViewUI", "uri scheme not startwith http, scheme = " + ((Uri)localObject3).getScheme());
                                        if (!afQ(this.cOG))
                                        {
                                          ab.f("MicroMsg.WebViewUI", "postBinded, canLoadUrl fail, url = " + this.cOG);
                                          dah();
                                          AppMethodBeat.o(8042);
                                          break;
                                        }
                                        if (!aYd())
                                        {
                                          b(this.cOG, null, false);
                                          AppMethodBeat.o(8042);
                                          break;
                                        }
                                        ab.i("MicroMsg.WebViewUI", "webview ispreloaded , do not reload url");
                                        AppMethodBeat.o(8042);
                                      }
                                    }
                                    catch (Exception localException11)
                                    {
                                      while (true)
                                        ab.e("MicroMsg.WebViewUI", "get force geta8key paths failed : %s", new Object[] { localException11.getMessage() });
                                      if (afI(this.cOG))
                                      {
                                        this.uwn = true;
                                        this.uuX.finish();
                                        this.uuX.setVisibility(8);
                                        b(this.cOG, null, true);
                                      }
                                      else
                                      {
                                        b(this.cOG, null, false);
                                      }
                                    }
                                  }
                                  continue;
                                  label3543: if (afI(this.cOG))
                                  {
                                    b(this.cOG, null, true);
                                    this.uxf = this.cOG;
                                    this.uwn = true;
                                    this.uuX.finish();
                                    this.uuX.setVisibility(8);
                                  }
                                  if ((this.uwA) || (this.uwB) || (isFinishing()))
                                    break label3662;
                                  ab.i("MicroMsg.WebViewUI", "not call onDestory, try to geta8key again");
                                  as(this.cOG, false);
                                  ab.i("MicroMsg.WebViewUI", "before geta8key, rawUrl = " + this.cOG);
                                }
                                label3662: AppMethodBeat.o(8042);
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        catch (Exception localException12)
        {
          break label737;
        }
      }
    }
  }

  protected int aMi()
  {
    AppMethodBeat.i(8001);
    int i = this.mController.dyj();
    AppMethodBeat.o(8001);
    return i;
  }

  protected boolean aMj()
  {
    return false;
  }

  protected boolean aXL()
  {
    return this.uwp;
  }

  protected MMWebView aXX()
  {
    AppMethodBeat.i(8007);
    MMWebView localMMWebView = MMWebView.a.in(this);
    AppMethodBeat.o(8007);
    return localMMWebView;
  }

  protected com.tencent.mm.plugin.webview.ui.tools.jsapi.d aXY()
  {
    AppMethodBeat.i(8050);
    Object localObject = this.pzf;
    k localk = this.icz;
    HashMap localHashMap = new HashMap();
    localHashMap.put("webview_type", "1");
    localHashMap.put("init_url", this.cOG);
    localHashMap.put("init_font_size", "1");
    localHashMap.put("short_url", bo.nullAsNil(getIntent().getStringExtra("shortUrl")));
    localObject = new com.tencent.mm.plugin.webview.ui.tools.jsapi.d((MMWebView)localObject, localk, localHashMap, this.icy, hashCode());
    AppMethodBeat.o(8050);
    return localObject;
  }

  protected s aXZ()
  {
    AppMethodBeat.i(8032);
    h localh = new h();
    AppMethodBeat.o(8032);
    return localh;
  }

  protected boolean aYa()
  {
    return true;
  }

  protected boolean aYb()
  {
    return true;
  }

  protected boolean aYc()
  {
    AppMethodBeat.i(8104);
    if ((getClass().equals(WebViewUI.class)) && (!getIntent().getBooleanExtra("disable_minimize", false)));
    for (boolean bool = true; ; bool = false)
    {
      ab.i("MicroMsg.WebViewUI", "enableMinimize class:%s enable:%b", new Object[] { getClass(), Boolean.valueOf(bool) });
      AppMethodBeat.o(8104);
      return bool;
    }
  }

  protected boolean aYd()
  {
    return false;
  }

  protected void aYe()
  {
    AppMethodBeat.i(8053);
    if (this.pzf != null)
      this.pzf.reload();
    AppMethodBeat.o(8053);
  }

  protected boolean aYf()
  {
    return false;
  }

  protected void ab(Bundle paramBundle)
  {
  }

  protected void ac(Bundle paramBundle)
  {
    AppMethodBeat.i(7983);
    int i;
    if (paramBundle.getBoolean("set_navigation_bar_color_reset", false))
      if (this.uwO == null)
        i = getResources().getColor(2131690674);
    for (int j = 255; ; j = paramBundle.getInt("set_navigation_bar_color_alpha"))
    {
      xE(i & 0xFFFFFF | j << 24);
      AppMethodBeat.o(7983);
      return;
      i = this.uwO.daW();
      break;
      i = paramBundle.getInt("set_navigation_bar_color_color");
    }
  }

  public void addIconOptionMenu(int paramInt1, int paramInt2, MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    AppMethodBeat.i(8062);
    if (!com.tencent.mm.compatible.util.d.iW(21))
    {
      super.addIconOptionMenu(paramInt1, paramInt2, paramOnMenuItemClickListener);
      AppMethodBeat.o(8062);
    }
    Drawable localDrawable;
    while (true)
    {
      return;
      localDrawable = android.support.v4.content.b.g(this, paramInt2);
      if (localDrawable != null)
        break;
      AppMethodBeat.o(8062);
    }
    if (dac())
      localDrawable.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
    while (true)
    {
      a(paramInt1, getString(2131296975), localDrawable, paramOnMenuItemClickListener);
      AppMethodBeat.o(8062);
      break;
      if ((this.uwO != null) && (!this.uwO.uxW))
        localDrawable.setColorFilter(-16777216, PorterDuff.Mode.SRC_ATOP);
      else
        localDrawable.clearColorFilter();
    }
  }

  public final void afG(String paramString)
  {
    AppMethodBeat.i(8055);
    this.uwI.afG(paramString);
    AppMethodBeat.o(8055);
  }

  protected final int afH(String paramString)
  {
    AppMethodBeat.i(8079);
    int i = getIntent().getIntExtra("geta8key_scene", 0);
    int j = i;
    if (i == 0)
    {
      if ((paramString == null) || (paramString.length() <= 0))
        break label220;
      if (this.icy != null)
        break label72;
      j = 1;
    }
    while (true)
    {
      ab.i("MicroMsg.WebViewUI", "KGetA8KeyScene = %s", new Object[] { Integer.valueOf(j) });
      AppMethodBeat.o(8079);
      return j;
      try
      {
        label72: if (this.icy.nI(paramString))
        {
          j = 8;
          continue;
        }
        if (!this.icy.mZ(paramString))
          break label215;
        i = 7;
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putString("enterprise_biz_username", paramString);
        try
        {
          paramString = this.icy.g(102, localBundle);
          j = i;
          if (paramString == null)
            continue;
          boolean bool = paramString.getBoolean("is_enterprise_username");
          j = i;
          if (!bool)
            continue;
          j = 51;
        }
        catch (RemoteException paramString)
        {
          ab.e("MicroMsg.WebViewUI", "invoke the check enterprise failed");
          j = i;
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.WebViewUI", "getScene fail, ex = " + paramString.getMessage());
        j = 1;
      }
      continue;
      label215: j = 1;
      continue;
      label220: j = 0;
    }
  }

  protected boolean afI(String paramString)
  {
    AppMethodBeat.i(8043);
    hashCode();
    boolean bool = com.tencent.mm.plugin.webview.modelcache.p.aeI(paramString);
    AppMethodBeat.o(8043);
    return bool;
  }

  protected final void afK(String paramString)
  {
    AppMethodBeat.i(8066);
    this.uhz.bJ("profile", true);
    this.uhz.ago(paramString);
    AppMethodBeat.o(8066);
  }

  protected void afL(String paramString)
  {
    AppMethodBeat.i(8071);
    if (this.icz.cZT().dmk())
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("fromScene", 100);
      if (this.icy.a(paramString, this.icz.cZS().jB(7), localBundle))
        ab.i("MicroMsg.WebViewUI", "shouldOverride, built in url handled, url = ".concat(String.valueOf(paramString)));
      AppMethodBeat.o(8071);
    }
    while (true)
    {
      return;
      ab.w("MicroMsg.WebViewUI", "shouldOverride, allow inner open url, not allow");
      AppMethodBeat.o(8071);
    }
  }

  protected boolean afM(String paramString)
  {
    AppMethodBeat.i(8072);
    Iterator localIterator = this.uvJ.iterator();
    com.tencent.mm.plugin.webview.ui.tools.jsapi.b localb;
    boolean bool;
    while (true)
      if (localIterator.hasNext())
      {
        localb = (com.tencent.mm.plugin.webview.ui.tools.jsapi.b)localIterator.next();
        if (a(localb, paramString))
        {
          ab.i("MicroMsg.WebViewUI", "url handled, url = ".concat(String.valueOf(paramString)));
          if (this.uxd.equals(paramString))
          {
            ab.i("MicroMsg.WebViewUI", "url " + paramString + " has been handle");
            AppMethodBeat.o(8072);
            bool = true;
          }
        }
      }
    while (true)
    {
      return bool;
      bool = localb.afM(paramString);
      ab.i("MicroMsg.WebViewUI", "url handled, ret = " + bool + ", url = " + paramString);
      AppMethodBeat.o(8072);
      bool = true;
      continue;
      bool = false;
      AppMethodBeat.o(8072);
    }
  }

  public final String afN(String paramString)
  {
    AppMethodBeat.i(8073);
    String str1 = "";
    Object localObject = str1;
    if (!TextUtils.isEmpty(paramString))
    {
      localObject = str1;
      if (this.icy != null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putInt("webview_binder_id", hashCode());
        ((Bundle)localObject).putString("rawUrl", paramString);
        paramString = str1;
      }
    }
    try
    {
      localObject = bo.nullAsNil(this.icy.g(76, (Bundle)localObject).getString("appId"));
      paramString = (String)localObject;
      ab.i("MicroMsg.WebViewUI", "stev cachedAppId %s", new Object[] { localObject });
      AppMethodBeat.o(8073);
      return localObject;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        ab.w("MicroMsg.WebViewUI", "get cachedAppId error ", new Object[] { localRemoteException.getMessage() });
        String str2 = paramString;
      }
    }
  }

  public final boolean apx()
  {
    AppMethodBeat.i(8040);
    this.uwC = true;
    aq.i locali = this.ulI.cYb();
    if (this.pzf != null);
    for (String str = this.pzf.getUrl(); ; str = this.cOG)
    {
      locali.une = new Object[] { str, Integer.valueOf(15) };
      locali.b(this.icy);
      boolean bool = super.apx();
      AppMethodBeat.o(8040);
      return bool;
    }
  }

  public final void aqX()
  {
    AppMethodBeat.i(8100);
    super.aqX();
    this.jYe = -2;
    AppMethodBeat.o(8100);
  }

  protected WebViewUI.w as(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(8077);
    paramString = j(paramString, paramBoolean, -1);
    AppMethodBeat.o(8077);
    return paramString;
  }

  public final void at(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(8004);
    if ((Build.VERSION.SDK_INT >= 23) && (!com.tencent.mm.sdk.h.b.Mt()))
    {
      setStatusBarColor(paramInt);
      Window localWindow = getWindow();
      paramInt = localWindow.getDecorView().getSystemUiVisibility();
      if (paramBoolean)
      {
        paramInt |= 8192;
        localWindow.getDecorView().setSystemUiVisibility(paramInt);
        AppMethodBeat.o(8004);
      }
    }
    while (true)
    {
      return;
      paramInt &= -8193;
      break;
      if (Build.VERSION.SDK_INT >= 21)
      {
        int i = paramInt;
        if (paramBoolean)
          i = g.Jj(paramInt);
        setStatusBarColor(i);
      }
      AppMethodBeat.o(8004);
    }
  }

  protected void b(com.tencent.mm.plugin.webview.stub.c paramc)
  {
    AppMethodBeat.i(8083);
    ab.i("MicroMsg.WebViewUI", "onSceneEnd, instance hashcode = " + hashCode());
    if (this.pzf == null)
    {
      ab.w("MicroMsg.WebViewUI", "onSceneEnd, viewWV is null, do nothing");
      AppMethodBeat.o(8083);
    }
    int i;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    int m;
    int n;
    while (true)
    {
      return;
      if ((isFinishing()) || (this.icz == null))
      {
        ab.w("MicroMsg.WebViewUI", "onSceneEnd, isFinishing, do nothing");
        AppMethodBeat.o(8083);
      }
      else
      {
        i = 0;
        int j = -1;
        int k = -1;
        localObject1 = null;
        localObject2 = null;
        localObject3 = localObject1;
        m = k;
        n = j;
        try
        {
          i1 = paramc.getType();
          localObject3 = localObject1;
          m = k;
          n = j;
          i = i1;
          j = paramc.cYW();
          localObject3 = localObject1;
          m = k;
          n = j;
          i = i1;
          k = paramc.cYX();
          localObject3 = localObject1;
          m = k;
          n = j;
          i = i1;
          localObject1 = paramc.adx();
          localObject3 = localObject1;
          m = k;
          n = j;
          i = i1;
          paramc = paramc.getData();
          n = k;
          i = j;
          localObject3 = paramc;
          if (paramc == null)
            localObject3 = new Bundle();
          m = ((Bundle)localObject3).getInt("scene_end_listener_hash_code");
          ab.i("MicroMsg.WebViewUI", "get hash code = %d, self hash code = %d", new Object[] { Integer.valueOf(m), Integer.valueOf(hashCode()) });
          ab.i("MicroMsg.WebViewUI", "edw onSceneEnd, type = " + i1 + ", errCode = " + n + ", errType = " + i);
          if (m != hashCode())
          {
            ab.e("MicroMsg.WebViewUI", "hash code not equal");
            AppMethodBeat.o(8083);
          }
        }
        catch (Exception paramc)
        {
          int i1;
          while (true)
          {
            ab.e("MicroMsg.WebViewUI", "onSceneEnd, ex = " + paramc.getMessage());
            localObject1 = localObject3;
            i1 = i;
            i = n;
            n = m;
            paramc = (com.tencent.mm.plugin.webview.stub.c)localObject2;
          }
          if ((i1 != 233) && (i1 != 131) && (i1 != 106) && (i1 != 673) && (i1 != 666) && (i1 != 1254) && (i1 != 1373))
            AppMethodBeat.o(8083);
          else
            switch (i1)
            {
            default:
            case 106:
            case 233:
            case 673:
            case 666:
            case 1254:
            case 1373:
            }
        }
      }
    }
    while (true)
    {
      AppMethodBeat.o(8083);
      break;
      finish();
      AppMethodBeat.o(8083);
      break;
      this.uvS.daO();
      Object localObject4 = new JsapiPermissionWrapper(((Bundle)localObject3).getByteArray("geta8key_result_jsapi_perm_control_bytes"));
      localObject2 = new GeneralControlWrapper(((Bundle)localObject3).getInt("geta8key_result_general_ctrl_b1"));
      this.uxn = ((Bundle)localObject3).getLong("geta8key_result_deep_link_bit_set", 0L);
      this.uwI.utF = ((Bundle)localObject3).getString("geta8key_result_menu_wording");
      m = ((Bundle)localObject3).getInt("geta8key_result_reason");
      ab.i("MicroMsg.WebViewUI", "edw geta8key onSceneEnd, req reason = ".concat(String.valueOf(m)));
      if (this.pzf != null)
        this.pzf.setA8keyReason(m);
      localObject1 = null;
      paramc = (com.tencent.mm.plugin.webview.stub.c)localObject1;
      switch (m)
      {
      default:
        paramc = (com.tencent.mm.plugin.webview.stub.c)localObject1;
      case 3:
      case 4:
      case 6:
      case 7:
        label711: Y(this.icz.aei(paramc).jB(34), this.icz.aei(paramc).jB(75));
        if ((i == 0) && (n == 0))
        {
          paramc = this.uwI;
          paramc.utK.add(Integer.valueOf(6));
          paramc.utK.add(Integer.valueOf(1));
          paramc.utK.add(Integer.valueOf(3));
          paramc.utK.add(Integer.valueOf(2));
          this.uwI.utI = true;
          if (this.uwI.utJ)
            cZM();
        }
        break;
      case 0:
      case 2:
      case 8:
      case 9:
      case 1:
      case 5:
      }
      while (true)
      {
        this.uwE.aI("getA8KeyEnd", System.currentTimeMillis());
        daw();
        AppMethodBeat.o(8083);
        break;
        if (((i == 0) && (n == 0)) || ((i == 4) && (n == -2005)))
        {
          paramc = ((Bundle)localObject3).getString("geta8key_result_full_url");
          a(((Bundle)localObject3).getString("geta8key_result_req_url"), paramc, (JsapiPermissionWrapper)localObject4, (GeneralControlWrapper)localObject2);
          H((Bundle)localObject3);
          this.uvW = ((JsapiPermissionWrapper)localObject4).jB(24);
          this.ulI.cYa().unc = true;
          this.uvD = ((Bundle)localObject3).getByteArray("geta8key_result_cookie");
          ab.d("MicroMsg.WebViewUI", "processGetA8Key, getA8Key = %s", new Object[] { bo.cd(this.uvD) });
          break label711;
        }
        m.uuj.Jq(i);
        paramc = ((Bundle)localObject3).getString("geta8key_result_req_url");
        if ((this.uwh != null) && (!afI(paramc)))
        {
          this.uwh.setVisibility(0);
          X(true, true);
        }
        this.ulI.cYa().unc = false;
        this.ulI.cXU().bE(paramc, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(154L, 12L, 1L, false);
        m = b.Jh(m);
        if (-1 != m)
          com.tencent.mm.plugin.report.service.h.pYm.a(154L, m, 1L, false);
        G((Bundle)localObject3);
        paramc = (com.tencent.mm.plugin.webview.stub.c)localObject1;
        if (!this.uvy)
          break label711;
        finish();
        paramc = (com.tencent.mm.plugin.webview.stub.c)localObject1;
        break label711;
        if ((i == 0) && (n == 0))
        {
          paramc = ((Bundle)localObject3).getString("geta8key_result_req_url");
          this.icz.a(paramc, (JsapiPermissionWrapper)localObject4, (GeneralControlWrapper)localObject2);
          this.uwo.remove(paramc);
          if (this.uww)
          {
            X(true, true);
            this.uww = false;
          }
          if (m != 5)
            this.uvW = ((JsapiPermissionWrapper)localObject4).jB(24);
          this.uvD = ((Bundle)localObject3).getByteArray("geta8key_result_cookie");
          ab.d("MicroMsg.WebViewUI", "processGetA8Key, getA8Key = %s", new Object[] { bo.cd(this.uvD) });
          break label711;
        }
        if ((i == 4) && (n == -2005))
        {
          this.pzf.stopLoading();
          this.uvG = false;
          paramc = ((Bundle)localObject3).getString("geta8key_result_full_url");
          a(((Bundle)localObject3).getString("geta8key_result_req_url"), paramc, (JsapiPermissionWrapper)localObject4, (GeneralControlWrapper)localObject2);
          H((Bundle)localObject3);
          this.uvD = ((Bundle)localObject3).getByteArray("geta8key_result_cookie");
          ab.d("MicroMsg.WebViewUI", "processGetA8Key, getA8Key = %s", new Object[] { bo.cd(this.uvD) });
          break label711;
        }
        if ((i != 0) && (n == -3300))
        {
          ab.e("MicroMsg.WebViewUI", "onSceneEnd errType:%d, errCode:%d, disable iframe getA8Key", new Object[] { Integer.valueOf(i), Integer.valueOf(n) });
          this.uvE = true;
          paramc = (com.tencent.mm.plugin.webview.stub.c)localObject1;
          break label711;
        }
        com.tencent.mm.plugin.report.service.h.pYm.a(154L, 12L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(154L, b.Jh(m), 1L, false);
        X(true, true);
        paramc = (com.tencent.mm.plugin.webview.stub.c)localObject1;
        break label711;
        this.uwI.utI = false;
      }
      paramc = this.uvT;
      paramc.uxO -= 1;
      if (paramc.uxO <= 0)
        paramc.uxp.Js(673);
      if ((i == 0) && (n == 0))
      {
        if (localObject3 != null);
        for (paramc = ((Bundle)localObject3).getString("reading_mode_result_url"); ; paramc = null)
        {
          ab.i("MicroMsg.WebViewUI", "[cpan] onsceneend url:%s", new Object[] { paramc });
          if (!bo.isNullOrNil(paramc))
            break label1527;
          ab.i("MicroMsg.WebViewUI", "[cpan] onsceneend failed");
          AppMethodBeat.o(8083);
          break;
        }
        label1527: b(paramc, null, false);
        AppMethodBeat.o(8083);
        break;
      }
      ab.i("MicroMsg.WebViewUI", "[cpan] onsceneend failed");
      AppMethodBeat.o(8083);
      break;
      paramc = this.uvU;
      paramc.uxP -= 1;
      if (paramc.uxP <= 0)
        paramc.uxp.Js(666);
      finish();
      AppMethodBeat.o(8083);
      break;
      label1618: com.tencent.mm.plugin.webview.stub.d locald;
      long l;
      if ((i == 0) && (n == 0))
      {
        bool1 = true;
        locald = this.icy;
        localObject2 = this.uxk;
        localObject4 = this.uxl;
        i = hashCode();
        ab.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd suc: %b", new Object[] { Boolean.valueOf(bool1) });
        ((af.d)localObject2).blb();
        ((af.b)localObject4).remove(1254);
        l = System.currentTimeMillis();
        if (localObject3 != null)
          break label1780;
        paramc = "";
        label1693: ab.i("MicroMsg.OauthAuthorizeLogic", "parse appID:%s", new Object[] { paramc });
        if (bool1)
          break label1798;
        com.tencent.mm.ui.base.h.a(this, (String)localObject1, com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131305621), new af.c.2((af.d)localObject2));
        localObject3 = com.tencent.mm.plugin.webview.e.a.uKJ;
        if (paramc != null)
          break label1795;
        paramc = "";
      }
      label1795: 
      while (true)
      {
        com.tencent.mm.plugin.webview.e.a.a(paramc, l, 2, 1, 0, 0, n);
        AppMethodBeat.o(8083);
        break;
        bool1 = false;
        break label1618;
        label1780: paramc = af.c.aep(((Bundle)localObject3).getString("oauth_url"));
        break label1693;
      }
      label1798: if (localObject3 == null)
      {
        ab.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd_Tools resp null");
        AppMethodBeat.o(8083);
        break;
      }
      boolean bool1 = ((Bundle)localObject3).getBoolean("is_recent_has_auth");
      boolean bool2 = ((Bundle)localObject3).getBoolean("is_silence_auth");
      if ((bool1) || (bool2))
      {
        localObject3 = ((Bundle)localObject3).getString("redirect_url");
        if (bo.isNullOrNil((String)localObject3))
        {
          ab.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd redirect null");
          AppMethodBeat.o(8083);
          break;
        }
        ab.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeSceneEnd isRecentHasAuth:%b isSilenceAuth:%b redirectUrl:%s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), localObject3 });
        com.tencent.mm.model.gdpr.c.a(this, com.tencent.mm.model.gdpr.a.fom, paramc, new af.c.3((af.d)localObject2, paramc, l, n, (String)localObject3));
        AppMethodBeat.o(8083);
        break;
      }
      paramc = new af.c.4(this, paramc, (af.d)localObject2, l, n, (Bundle)localObject3, locald, (af.b)localObject4, i);
      if (((this instanceof WebViewUI)) && (((WebViewUI)this).isFinishing()))
      {
        ab.i("MicroMsg.OauthAuthorizeLogic", "showWebAuthorizeDialog isFinishing");
        AppMethodBeat.o(8083);
        break;
      }
      localObject1 = af.aa((ArrayList)((Bundle)localObject3).getSerializable("scope_list"));
      localObject2 = ((Bundle)localObject3).getString("appname");
      localObject3 = ((Bundle)localObject3).getString("appicon_url");
      new com.tencent.mm.plugin.webview.ui.tools.widget.n(this).a((LinkedList)localObject1, (String)localObject2, (String)localObject3, getString(2131305632), paramc);
      AppMethodBeat.o(8083);
      break;
      if ((i == 0) && (n == 0));
      for (bool1 = true; ; bool1 = false)
      {
        paramc = this.uxk;
        localObject2 = this.uxl;
        ab.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd suc: %b", new Object[] { Boolean.valueOf(bool1) });
        ((af.b)localObject2).remove(1373);
        if (bool1)
          break label2181;
        com.tencent.mm.ui.base.h.a(this, (String)localObject1, com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131305621), new af.c.5(paramc));
        AppMethodBeat.o(8083);
        break;
      }
      label2181: if (localObject3 == null)
      {
        ab.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd resp null");
        AppMethodBeat.o(8083);
        break;
      }
      localObject3 = ((Bundle)localObject3).getString("redirect_url");
      if (bo.isNullOrNil((String)localObject3))
      {
        ab.e("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd redirect null");
        AppMethodBeat.o(8083);
        break;
      }
      paramc.aeq((String)localObject3);
      ab.i("MicroMsg.OauthAuthorizeLogic", "onOauthAuthorizeConfirmSceneEnd redirectUrl: %s", new Object[] { localObject3 });
    }
  }

  protected void b(String paramString1, String paramString2, Map<String, String> paramMap)
  {
  }

  protected void b(String paramString, Map<String, String> paramMap, boolean paramBoolean)
  {
    AppMethodBeat.i(8045);
    if (paramBoolean)
    {
      paramMap = new HashMap(2);
      paramMap.put("Pragma", "no-cache");
      paramMap.put("Cache-Control", "no-cache");
      if (this.pzf != null)
        this.pzf.loadUrl(paramString, paramMap);
      AppMethodBeat.o(8045);
    }
    while (true)
    {
      return;
      if (this.pzf != null)
      {
        if (paramMap != null)
        {
          this.pzf.loadUrl(paramString, paramMap);
          AppMethodBeat.o(8045);
        }
        else
        {
          this.pzf.loadUrl(paramString);
        }
      }
      else
        AppMethodBeat.o(8045);
    }
  }

  protected final void c(String paramString, Drawable paramDrawable)
  {
    AppMethodBeat.i(8058);
    a(0, paramString, paramDrawable, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(7851);
        if (!this.uxs)
          WebViewUI.this.cZM();
        while (true)
        {
          AppMethodBeat.o(7851);
          return true;
          WebViewUI.this.afK(this.fwC);
        }
      }
    });
    AppMethodBeat.o(8058);
  }

  protected void c(String paramString1, String paramString2, Map<String, String> paramMap)
  {
    AppMethodBeat.i(8085);
    String str1 = bo.bc(dae(), this.cOG);
    if (bo.isNullOrNil(str1))
    {
      ab.e("MicroMsg.WebViewUI", "after getA8Key, currentURL is null or nil, wtf");
      b(paramString2, null, false);
      AppMethodBeat.o(8085);
    }
    while (true)
    {
      return;
      if (this.uhz == null)
      {
        if ((paramMap != null) && (paramMap.size() > 0))
        {
          b(paramString2, paramMap, false);
          AppMethodBeat.o(8085);
        }
        else
        {
          b(paramString2, null, false);
          AppMethodBeat.o(8085);
        }
      }
      else if ((bo.nullAsNil(paramString2).contains("#wechat_redirect")) || (bo.nullAsNil(paramString1).contains("#wechat_redirect")))
      {
        if ((paramMap != null) && (paramMap.size() > 0))
        {
          b(paramString2, paramMap, false);
          AppMethodBeat.o(8085);
        }
        else
        {
          b(paramString2, null, false);
          AppMethodBeat.o(8085);
        }
      }
      else
      {
        if (!hh(str1, paramString2))
        {
          String str2 = com.tencent.mm.plugin.webview.modelcache.q.aeN(str1);
          String str3 = com.tencent.mm.plugin.webview.modelcache.q.aeN(paramString2);
          if ((bo.isNullOrNil(str3)) || (bo.isNullOrNil(str2)) || (!str3.equals(str2)) || (this.icy == null) || (!afI(str1)))
            break label314;
        }
        label314: for (int i = 1; ; i = 0)
        {
          if (i == 0)
            break label320;
          this.uwx.put(str1, paramString2);
          this.uwr.put(str1, paramMap);
          this.uwx.put(paramString1, paramString2);
          this.uwr.put(paramString1, paramMap);
          this.uhz.z(paramString2, paramMap);
          AppMethodBeat.o(8085);
          break;
        }
        label320: if ((paramMap != null) && (paramMap.size() > 0))
        {
          b(paramString2, paramMap, false);
          AppMethodBeat.o(8085);
        }
        else
        {
          b(paramString2, null, false);
          AppMethodBeat.o(8085);
        }
      }
    }
  }

  protected int cWF()
  {
    AppMethodBeat.i(8023);
    int i;
    if (this.uvi == null)
    {
      i = 0;
      AppMethodBeat.o(8023);
    }
    while (true)
    {
      return i;
      i = this.uvi.dcZ();
      AppMethodBeat.o(8023);
    }
  }

  public final boolean cWG()
  {
    boolean bool = true;
    AppMethodBeat.i(8093);
    if ((this.uwe != null) && (this.uwe.cXi()) && (!bo.isNullOrNil(this.uwe.daM())) && (!bo.isNullOrNil(this.uwe.cXk())) && (!bo.isNullOrNil(this.uwe.cXl())))
    {
      Object localObject = this.uwe.daM();
      String str1 = this.uwe.cXk();
      String str2 = this.uwe.cXl();
      ab.i("MicroMsg.WebViewUI", "use js api close window confirm info : %s, %s, %s", new Object[] { localObject, str1, str2 });
      View localView = View.inflate(this.mController.ylL, 2130970090, null);
      final CheckBox localCheckBox = (CheckBox)localView.findViewById(2131825970);
      localCheckBox.setChecked(false);
      localCheckBox.setVisibility(8);
      TextView localTextView = (TextView)localView.findViewById(2131825969);
      localTextView.setText((CharSequence)localObject);
      localTextView.setTextColor(getResources().getColor(2131690316));
      localObject = (TextView)localView.findViewById(2131825971);
      ((TextView)localObject).setTextColor(getResources().getColor(2131690316));
      ((TextView)localObject).setVisibility(8);
      this.uwf = com.tencent.mm.ui.base.h.a(this.mController.ylL, true, "", localView, str1, str2, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          AppMethodBeat.i(7877);
          if ((localCheckBox != null) && (localCheckBox.isChecked()));
          try
          {
            if (WebViewUI.this.icy.cZd())
              WebViewUI.this.icy.gx(327792, 1);
            WebViewUI.this.uwA = true;
            WebViewUI.this.uwf = null;
            m.uuj.close();
            WebViewUI.this.finish();
            AppMethodBeat.o(7877);
            return;
          }
          catch (Exception paramAnonymousDialogInterface)
          {
            while (true)
              ab.e("MicroMsg.WebViewUI", "tryShowCloseWindowConfirmInfo, ex = " + paramAnonymousDialogInterface.getMessage());
          }
        }
      }
      , new WebViewUI.48(this));
      AppMethodBeat.o(8093);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(8093);
      bool = false;
    }
  }

  public final String cWL()
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(8049);
    try
    {
      String str = getIntent().getStringExtra("rawUrl");
      localObject2 = str;
      if ((localObject2 != null) && (((String)localObject2).length() > 0))
      {
        AppMethodBeat.o(8049);
        return localObject2;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUI", "getRawUrl exception:%s", new Object[] { localException.getMessage() });
        if ((localException instanceof ClassNotFoundException))
        {
          finish();
          AppMethodBeat.o(8049);
          localObject2 = localObject1;
          continue;
          localObject2 = getIntent().getData();
          if (localObject2 == null)
          {
            localObject2 = "";
            AppMethodBeat.o(8049);
          }
          else
          {
            localObject2 = ((Uri)localObject2).toString();
            AppMethodBeat.o(8049);
          }
        }
      }
    }
  }

  protected final boolean cWO()
  {
    boolean bool1 = true;
    AppMethodBeat.i(8103);
    boolean bool2 = getIntent().getBooleanExtra("forceHideShare", false);
    boolean bool3 = getIntent().getBooleanExtra("showShare", true);
    ab.i("MicroMsg.WebViewUI", "forceHideShare:%b showShareBtn:%b enableMinimize:%b", new Object[] { Boolean.valueOf(bool2), Boolean.valueOf(bool3), Boolean.valueOf(aYc()) });
    if ((!bool2) && (bool3) && (aYc()))
      AppMethodBeat.o(8103);
    while (true)
    {
      return bool1;
      AppMethodBeat.o(8103);
      bool1 = false;
    }
  }

  protected boolean cZA()
  {
    return false;
  }

  protected void cZH()
  {
    AppMethodBeat.i(8025);
    int i = getIntent().getIntExtra("webview_bg_color_rsID", -1);
    if ((i != -1) && (this.mController.contentView != null))
    {
      setBackGroundColorResource(i);
      this.mController.contentView.setBackgroundResource(i);
      this.pzf.setBackgroundResource(17170445);
      findViewById(2131823600).setBackgroundResource(17170445);
      AppMethodBeat.o(8025);
    }
    while (true)
    {
      return;
      this.pzf.setBackgroundColor(getResources().getColor(2131689496));
      AppMethodBeat.o(8025);
    }
  }

  protected void cZM()
  {
    AppMethodBeat.i(8052);
    this.uwI.cZM();
    AppMethodBeat.o(8052);
  }

  public final void cZO()
  {
    AppMethodBeat.i(8054);
    this.uwI.cZO();
    AppMethodBeat.o(8054);
  }

  public final void cZR()
  {
    AppMethodBeat.i(8051);
    this.uwI.cZR();
    AppMethodBeat.o(8051);
  }

  public final com.tencent.mm.plugin.webview.e.d cZW()
  {
    return this.uwE;
  }

  protected final void cZY()
  {
    AppMethodBeat.i(7998);
    if ((this.uwT == null) || (cZZ()))
      AppMethodBeat.o(7998);
    while (true)
    {
      return;
      ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.uwT.getLayoutParams();
      int i = daa();
      if (i != localMarginLayoutParams.topMargin)
      {
        localMarginLayoutParams.topMargin = i;
        this.uwT.setLayoutParams(localMarginLayoutParams);
      }
      AppMethodBeat.o(7998);
    }
  }

  public final void clH()
  {
    AppMethodBeat.i(8067);
    this.uhz.bJ("sendAppMessage", true);
    this.uhz.q(this.uwI.cZP());
    this.ulI.aeG("mm_send_friend_count");
    AppMethodBeat.o(8067);
  }

  public boolean convertActivityFromTranslucent()
  {
    AppMethodBeat.i(7989);
    boolean bool = getIntent().getBooleanExtra("convertActivityFromTranslucent", true);
    AppMethodBeat.o(7989);
    return bool;
  }

  protected void dE(String paramString, int paramInt)
  {
    AppMethodBeat.i(8022);
    if (this.uvi == null)
      AppMethodBeat.o(8022);
    while (true)
    {
      return;
      WebViewInputFooter localWebViewInputFooter = this.uvi;
      localWebViewInputFooter.setVisibility(0);
      if (localWebViewInputFooter.uKu != null)
        localWebViewInputFooter.uKu.setVisibility(0);
      if (localWebViewInputFooter.uKt != null)
      {
        localWebViewInputFooter.uKt.setEnabled(true);
        localWebViewInputFooter.uKt.setBackgroundResource(2130839104);
      }
      if (localWebViewInputFooter.uKq != null)
        localWebViewInputFooter.uKq.setVisibility(0);
      localWebViewInputFooter.uKv = false;
      if (localWebViewInputFooter.uKt != null)
      {
        localWebViewInputFooter.uKt.setFocusable(true);
        localWebViewInputFooter.uKt.setFocusableInTouchMode(true);
        localWebViewInputFooter.uKt.requestFocus();
      }
      if (localWebViewInputFooter.crP != null)
        localWebViewInputFooter.crP.showVKB();
      localWebViewInputFooter.state = 0;
      if (!bo.isNullOrNil(paramString))
        this.uvi.setText(paramString);
      if (paramInt >= 0)
        this.uvi.setMaxCount(paramInt);
      AppMethodBeat.o(8022);
    }
  }

  protected void daC()
  {
    AppMethodBeat.i(8095);
    if (daB())
      AppMethodBeat.o(8095);
    while (true)
    {
      return;
      daD();
      if (!cWG())
      {
        this.uwA = true;
        m.uuj.close();
        if (this.uie.Jx(20))
          AppMethodBeat.o(8095);
        else
          finish();
      }
      else
      {
        AppMethodBeat.o(8095);
      }
    }
  }

  protected final boolean daE()
  {
    AppMethodBeat.i(8099);
    boolean bool;
    if (this.jYe != -3)
    {
      showVKB();
      bool = true;
      AppMethodBeat.o(8099);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(8099);
    }
  }

  protected void daF()
  {
  }

  protected final void daG()
  {
    AppMethodBeat.i(8106);
    overridePendingTransition(2131034228, 2131034227);
    AppMethodBeat.o(8106);
  }

  protected boolean dab()
  {
    return true;
  }

  final boolean dac()
  {
    AppMethodBeat.i(8002);
    boolean bool;
    if ((!bo.isNullOrNil(this.nft)) && (this.nft.equals("black")))
    {
      bool = true;
      AppMethodBeat.o(8002);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(8002);
    }
  }

  protected final void dad()
  {
    AppMethodBeat.i(8003);
    if ((com.tencent.mm.compatible.util.d.iW(21)) && (this.nfs != 0))
    {
      xE(this.nfs);
      if (dac())
      {
        dxZ();
        ta(-16777216);
      }
      at(this.nfs, dac());
      AppMethodBeat.o(8003);
    }
    while (true)
    {
      return;
      setStatusBarColor(aMi());
      AppMethodBeat.o(8003);
    }
  }

  public final String dae()
  {
    AppMethodBeat.i(8006);
    String str;
    if (this.handler == null)
    {
      str = this.uxf;
      AppMethodBeat.o(8006);
    }
    while (true)
    {
      return str;
      if (Thread.currentThread().getId() == this.handler.getLooper().getThread().getId())
      {
        if (this.pzf == null)
        {
          str = "";
          AppMethodBeat.o(8006);
        }
        else
        {
          str = this.pzf.getUrl();
          AppMethodBeat.o(8006);
        }
      }
      else if (!bo.isNullOrNil(this.uxf))
      {
        str = this.uxf;
        AppMethodBeat.o(8006);
      }
      else
      {
        this.uxf = ((String)new WebViewUI.3(this, "").b(this.handler));
        str = this.uxf;
        AppMethodBeat.o(8006);
      }
    }
  }

  public final void daf()
  {
    AppMethodBeat.i(138437);
    v.a.fH(this);
    AppMethodBeat.o(138437);
  }

  protected void dai()
  {
    AppMethodBeat.i(8021);
    this.uvo = System.currentTimeMillis();
    this.pzf.goBack();
    this.uvC = null;
    if (this.uvZ)
      this.uvZ = false;
    m localm = m.uuj;
    ab.v("MicroMsg.WebViewReportUtil", "goBack traceid %s", new Object[] { localm.qTK });
    if (!bo.isNullOrNil(localm.qTK))
      localm.kT(5);
    AppMethodBeat.o(8021);
  }

  protected final void daj()
  {
    AppMethodBeat.i(8024);
    this.uwX.utS = new WebViewUI.5(this);
    l locall = this.uwX;
    locall.hfA = true;
    if (locall.utU != null)
    {
      locall.utU.setVisibility(0);
      locall.utU.setMMOverScrollOffsetListener(locall);
      locall.utU.setFastScrollBack(true);
      locall.utU.nM(false);
      locall.utU.setReleaseTargetHeight(locall.utV);
    }
    if (locall.utT != null)
    {
      locall.utT.setWillNotDraw(true);
      locall.utT.setImageResource(l.utW);
      locall.utT.setVisibility(0);
      locall.utT.setAlpha(0.0F);
      locall.utT.setWillNotDraw(false);
      locall.utT.invalidate();
    }
    if (locall.uue != null)
      locall.uue.setVisibility(8);
    AppMethodBeat.o(8024);
  }

  protected void dak()
  {
    AppMethodBeat.i(8026);
    if (getIntent() == null)
      AppMethodBeat.o(8026);
    while (true)
    {
      return;
      if (getIntent().hasExtra("show_full_screen"))
        W(getIntent().getBooleanExtra("show_full_screen", false), true);
      AppMethodBeat.o(8026);
    }
  }

  protected com.tencent.xweb.l dal()
  {
    try
    {
      AppMethodBeat.i(8033);
      if (this.uvO == null)
      {
        localObject1 = new com/tencent/mm/plugin/webview/ui/tools/WebViewUI$g;
        ((WebViewUI.g)localObject1).<init>(this);
        this.uvO = ((com.tencent.xweb.l)localObject1);
      }
      Object localObject1 = this.uvO;
      AppMethodBeat.o(8033);
      return localObject1;
    }
    finally
    {
    }
  }

  protected int dam()
  {
    AppMethodBeat.i(8034);
    int i;
    if (aXL())
    {
      i = 0;
      AppMethodBeat.o(8034);
    }
    while (true)
    {
      return i;
      i = 2131230739;
      AppMethodBeat.o(8034);
    }
  }

  protected boolean dan()
  {
    return true;
  }

  protected final l dao()
  {
    return this.uwX;
  }

  protected com.tencent.mm.plugin.websearch.api.ah dap()
  {
    return null;
  }

  protected void daq()
  {
  }

  protected final LinkedList<d.a> dar()
  {
    Object localObject1 = null;
    AppMethodBeat.i(8056);
    if (this.pzf == null)
    {
      ab.e("MicroMsg.WebViewUI", "viewwv is null, maybe has destroyed");
      AppMethodBeat.o(8056);
      localObject2 = localObject1;
      return localObject2;
    }
    Object localObject2 = this.cOG;
    Object localObject4;
    if (this.pzf != null)
    {
      localObject4 = this.pzf.getUrl();
      if (!bo.isNullOrNil((String)localObject4))
        localObject2 = localObject4;
    }
    while (true)
    {
      while (true)
      {
        if (localObject2 == null)
        {
          AppMethodBeat.o(8056);
          localObject2 = localObject1;
          break;
        }
        try
        {
          localObject4 = new java/net/URL;
          ((URL)localObject4).<init>((String)localObject2);
          Pattern localPattern = Pattern.compile(".*(\\.wanggou\\.com|\\.jd\\.com)");
          localObject4 = ((URL)localObject4).getHost();
          boolean bool = bo.isNullOrNil((String)localObject4);
          if (bool)
          {
            AppMethodBeat.o(8056);
            localObject2 = localObject1;
            break;
          }
          localObject2 = localObject4;
          if (!((String)localObject4).startsWith("."))
            localObject2 = ".".concat(String.valueOf(localObject4));
          ab.d("MicroMsg.WebViewUI", "host = %s", new Object[] { localObject2 });
          if (localPattern.matcher((CharSequence)localObject2).matches())
          {
            long l;
            if (this.uwt == null)
            {
              l = System.currentTimeMillis();
              this.uwt = this.icy.cZi();
              if (this.uwt == null)
                break label278;
            }
            label278: for (bool = true; ; bool = false)
            {
              ab.d("MicroMsg.WebViewUI", "[hakon] getConfigListMap %b, cost %d", new Object[] { Boolean.valueOf(bool), Long.valueOf(System.currentTimeMillis() - l) });
              if ((this.uwt == null) || (this.uwt.size() <= 0))
                break label305;
              localObject2 = com.tencent.mm.m.d.g(this.uwt);
              AppMethodBeat.o(8056);
              break;
            }
          }
        }
        catch (Exception localException)
        {
          ab.d("MicroMsg.WebViewUI", "[hakon] getJDMenuItems, ex = ", new Object[] { localException.getMessage() });
          label305: AppMethodBeat.o(8056);
          Object localObject3 = localObject1;
        }
      }
      break;
    }
  }

  protected final boolean das()
  {
    AppMethodBeat.i(8057);
    String str1 = getIntent().getStringExtra("srcUsername");
    String str2 = getIntent().getStringExtra("bizofstartfrom");
    boolean bool;
    if ((str1 != null) && (str2 != null) && ("enterpriseHomeSubBrand".equals(str2)))
    {
      bool = true;
      AppMethodBeat.o(8057);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(8057);
    }
  }

  protected final int dat()
  {
    AppMethodBeat.i(8063);
    int i = 2130839555;
    if (dar() != null)
      i = 2131231598;
    AppMethodBeat.o(8063);
    return i;
  }

  protected void daw()
  {
  }

  protected boolean dax()
  {
    return false;
  }

  protected boolean day()
  {
    return false;
  }

  public void finish()
  {
    AppMethodBeat.i(7988);
    if (this.uvt)
      setResult(-1);
    try
    {
      if (this.icy != null)
      {
        this.icy.Jc(hashCode());
        this.icy.IP(hashCode());
        this.umI = null;
      }
      ab.w("MicroMsg.WebViewUI", "invoke onWebViewUIDestroy");
      if (this.handler != null)
        this.handler.removeCallbacksAndMessages(null);
      this.uwB = true;
      super.finish();
      AppMethodBeat.o(7988);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.w("MicroMsg.WebViewUI", "onDestroy, remove callback and invoke event on webview destroy, ex = ".concat(String.valueOf(localException)));
    }
  }

  protected final int getActionBarHeight()
  {
    AppMethodBeat.i(7997);
    int i;
    if (getResources().getDimensionPixelSize(2131427360) > com.tencent.mm.bz.a.fromDPToPix(this, 48))
    {
      i = getResources().getDimensionPixelSize(2131427360);
      AppMethodBeat.o(7997);
    }
    while (true)
    {
      return i;
      if (com.tencent.mm.compatible.util.j.gu(this))
      {
        i = getResources().getDimensionPixelSize(2131427563);
        AppMethodBeat.o(7997);
      }
      else
      {
        i = getResources().getDimensionPixelSize(2131427562);
        AppMethodBeat.o(7997);
      }
    }
  }

  public int getForceOrientation()
  {
    return this.screenOrientation;
  }

  public int getLayoutId()
  {
    return 2130971207;
  }

  public void initSwipeBack()
  {
    AppMethodBeat.i(7985);
    super.initSwipeBack();
    if (getSwipeBackLayout() == null)
      AppMethodBeat.o(7985);
    while (true)
    {
      return;
      if (this.uwl)
        break;
      AppMethodBeat.o(7985);
    }
    View localView1 = getSwipeBackLayout().getChildAt(0);
    getSwipeBackLayout().removeView(localView1);
    com.tencent.mm.ui.statusbar.b localb = new com.tencent.mm.ui.statusbar.b(this);
    if ((localView1 instanceof FrameLayout))
    {
      View localView2 = ((FrameLayout)localView1).getChildAt(0);
      ViewGroup.LayoutParams localLayoutParams = localView2.getLayoutParams();
      ((FrameLayout)localView1).removeView(localView2);
      localb.addView(localView2, localLayoutParams);
    }
    while (true)
    {
      getSwipeBackLayout().addView(localb);
      getSwipeBackLayout().setContentView(localb);
      this.uwm = true;
      AppMethodBeat.o(7985);
      break;
      localb.addView(localView1);
    }
  }

  public void initView()
  {
    AppMethodBeat.i(8031);
    boolean bool1 = getIntent().getBooleanExtra("vertical_scroll", true);
    this.uvy = getIntent().getBooleanExtra("finishviewifloadfailed", false);
    this.uvu = getIntent().getBooleanExtra("is_favorite_item", false);
    this.rpm = getIntent().getBooleanExtra("isWebwx", true);
    this.uvs = getIntent().getBooleanExtra("neverGetA8Key", false);
    this.uwk = getIntent().getBooleanExtra("neverBlockLocalRequest", false);
    this.uvw = getIntent().getBooleanExtra("KFromLoginHistory", false);
    this.uwg = LayoutInflater.from(this.mController.ylL).inflate(2130970906, null);
    boolean bool2 = getIntent().getBooleanExtra("show_feedback", false);
    this.uwi = bo.nullAsNil(getIntent().getStringExtra("sentUsername"));
    if (bool2)
      addTextOptionMenu(1, getString(2131303094), new WebViewUI.9(this));
    this.uuY = ((ProgressBar)findViewById(2131824558));
    this.uwh = findViewById(2131823604);
    this.uwh.setOnClickListener(new WebViewUI.10(this));
    Object localObject1;
    Object localObject2;
    label439: Object localObject3;
    if (this.rpm)
    {
      localObject1 = bo.nullAsNil(getIntent().getStringExtra("title"));
      if (((CharSequence)localObject1).length() > 0)
        this.uuW = true;
      M((CharSequence)localObject1);
      nP(false);
      nQ(false);
      if (uvQ == WebSettings.RenderPriority.NORMAL)
      {
        ab.i("MicroMsg.WebViewUI", "initView, set render priority to HIGH");
        this.pzf.getSettings().setRenderPriority(WebSettings.RenderPriority.HIGH);
        uvQ = WebSettings.RenderPriority.HIGH;
      }
      localObject2 = this.uwX;
      localObject1 = this.mController.contentView;
      ((l)localObject2).utU = ((LogoWebViewWrapper)((View)localObject1).findViewById(2131823602));
      ((l)localObject2).utT = ((ImageView)((View)localObject1).findViewById(2131824657));
      ((l)localObject2).uud = ((View)localObject1).findViewById(2131824656);
      if (((l)localObject2).uud != null)
      {
        ((l)localObject2).uue = ((l)localObject2).uud.findViewById(2131829178);
        ((l)localObject2).uuf = ((TextView)((l)localObject2).uue.findViewById(2131829179));
      }
      ((l)localObject2).utV = BackwardSupportUtil.b.b(((l)localObject2).utU.getContext(), 72.0F);
      if (((l)localObject2).utT != null)
        break label1239;
      localObject1 = "null";
      if (((l)localObject2).utU != null)
        break label1254;
      localObject3 = "null";
      label452: ab.d("MicroMsg.WebViewPullDownLogoDelegate", "refreshImage.id = %s, logoWrapper.id = %s", new Object[] { localObject1, localObject3 });
      ab.d("MicroMsg.WebViewPullDownLogoDelegate", "LOADING_LOGO_HEIGHT = %d", new Object[] { Integer.valueOf(((l)localObject2).utV) });
      localObject1 = this.uwX;
      localObject2 = this.pzf;
      ((MMWebView)localObject2).setCompetitorView(((l)localObject1).utU);
      ((MMWebView)localObject2).dKJ();
      if (Build.VERSION.SDK_INT <= 10)
        ((l)localObject1).utU.getWebViewContainer().setBackgroundColor(((l)localObject1).utU.getResources().getColor(2131690677));
      localObject3 = ((l)localObject1).utU;
      ((LogoWebViewWrapper)localObject3).getWebViewContainer();
      if (((LogoWebViewWrapper)localObject3).uro != null)
      {
        ((LogoWebViewWrapper)localObject3).ejN = ((WebView)localObject2);
        ((LogoWebViewWrapper)localObject3).uro.addView(((LogoWebViewWrapper)localObject3).ejN);
      }
      if ((!((MMWebView)localObject2).isXWalkKernel()) && (!((MMWebView)localObject2).getIsX5Kernel()))
        break label1270;
      ((l)localObject1).uug = true;
      label615: if ((((l)localObject1).uue != null) && (!((MMWebView)localObject2).getIsX5Kernel()))
      {
        ((ImageView)((l)localObject1).uue.findViewById(2131829180)).setVisibility(8);
        ((TextView)((l)localObject1).uue.findViewById(2131829181)).setText("");
      }
      if ((!((l)localObject1).uug) || (((l)localObject1).uuh))
        break label1278;
      ((l)localObject1).nM(false);
      if (((l)localObject1).uue != null)
        ((l)localObject1).uue.setVisibility(0);
    }
    while (true)
    {
      cZH();
      this.uvc = ((FrameLayout)findViewById(2131823601));
      this.uvd = ((FrameLayout)findViewById(2131821064));
      ab.i("MicroMsg.WebViewUI", "Is the current broswer kernel X5, " + this.pzf.getIsX5Kernel());
      this.pzf.setWebViewClientExtension(new c(this));
      if (this.pzf.getIsX5Kernel())
      {
        this.pzf.setWebViewCallbackClient(this.uwQ);
        localObject3 = this.uwX;
        localObject1 = new WebViewUI.11(this);
        if (((l)localObject3).utU != null)
          ((l)localObject3).utU.setMMOverScrollListener((LogoWebViewWrapper.a)localObject1);
      }
      this.uvi = ((WebViewInputFooter)findViewById(2131824560));
      if (this.uvi != null)
      {
        this.uvi.hide();
        this.uvi.setOnTextSendListener(new WebViewUI.13(this));
        this.uvi.setOnSmileyChosenListener(new WebViewUI.14(this));
        this.uvi.setOnSmileyPanelVisibilityChangedListener(new WebViewUI.15(this));
      }
      this.uvj = ((WebViewSearchContentInputFooter)findViewById(2131824561));
      if (this.uvj != null)
      {
        this.uvj.setActionDelegate(new WebViewUI.16(this));
        this.pzf.setFindListener(new WebViewUI.17(this));
      }
      this.uve = ((MovingImageButton)findViewById(2131824562));
      this.uvH = findViewById(2131829160);
      if (this.uvH != null)
        this.uvH.setVisibility(8);
      if (!bool1)
        this.pzf.setVerticalScrollBarEnabled(false);
      this.pzf.setWebChromeClient(dal());
      this.pzf.setWebViewClient(aXZ());
      this.pzf.setDownloadListener(new WebViewUI.18(this));
      this.pzf.requestFocus(130);
      this.pzf.setOnTouchListener(new WebViewUI.19(this));
      localObject1 = com.tencent.mm.pluginsdk.ui.tools.u.bh(this, this.pzf.getSettings().getUserAgentString());
      this.pzf.getSettings().setUserAgentString((String)localObject1);
      this.pzf.dKH();
      this.icA = new com.tencent.mm.ui.tools.j(this.mController.ylL);
      this.icA.a(this.pzf, this, null);
      this.icA.e(new WebViewUI.20(this));
      setBackBtn(new WebViewUI.21(this), dam());
      if (dan())
      {
        localObject1 = (WebViewKeyboardLinearLayout)findViewById(2131823600);
        ((WebViewKeyboardLinearLayout)localObject1).setOnkbdStateListener(new WebViewUI.34(this, (WebViewKeyboardLinearLayout)localObject1));
      }
      this.uuX = ((MMFalseProgressBar)findViewById(2131823605));
      super.setTitleBarDoubleClickListener(new WebViewUI.22(this));
      AppMethodBeat.o(8031);
      return;
      setMMTitle("");
      break;
      label1239: localObject1 = String.valueOf(((l)localObject2).utT.getId());
      break label439;
      label1254: localObject3 = String.valueOf(((l)localObject2).utU.getId());
      break label452;
      label1270: ((l)localObject1).uug = false;
      break label615;
      label1278: ((l)localObject1).nM(true);
    }
  }

  protected void j(int paramInt, Bundle paramBundle)
  {
  }

  protected void jD(boolean paramBoolean)
  {
  }

  public final void l(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(8074);
    Looper.myQueue().addIdleHandler(new WebViewUI.41(this, paramString, paramLong, paramInt));
    AppMethodBeat.o(8074);
  }

  public final void loadUrl(String paramString)
  {
    AppMethodBeat.i(138438);
    b(paramString, null, false);
    AppMethodBeat.o(138438);
  }

  public final void m(String paramString, long paramLong, int paramInt)
  {
    AppMethodBeat.i(8075);
    String str1;
    if (at.isConnected(getApplicationContext()))
    {
      if (at.isWifi(getApplicationContext()))
      {
        this.networkType = 1;
        ab.i("MicroMsg.WebViewUI", "get networkType %d", new Object[] { Integer.valueOf(this.networkType) });
      }
    }
    else
    {
      str1 = afN(this.uxh);
      if (this.fromScene != 0)
        this.uxg = " ";
      if (this.icz != null)
        break label155;
      ab.w("MicroMsg.WebViewUI", "webpageVisitInfoReport wvPerm is null");
      AppMethodBeat.o(8075);
    }
    while (true)
    {
      return;
      if (at.is4G(getApplicationContext()))
      {
        this.networkType = 4;
        break;
      }
      if (at.is3G(getApplicationContext()))
      {
        this.networkType = 3;
        break;
      }
      if (!at.is2G(getApplicationContext()))
        break;
      this.networkType = 2;
      break;
      label155: Object localObject1 = this.icz.cZT();
      boolean bool;
      long l1;
      long l2;
      String str2;
      String str3;
      Object localObject2;
      String str4;
      String str5;
      if (localObject1 != null)
      {
        bool = ((GeneralControlWrapper)localObject1).dmm();
        ab.d("MicroMsg.WebViewUI", "webpageVisitInfoReport enableReportPageEvent %s", new Object[] { Boolean.valueOf(bool) });
        if ((this.iBE > 0L) && (this.uxi > this.iBE) && (paramLong > this.uxi) && (!TextUtils.isEmpty(str1)) && (bool))
        {
          l1 = this.uxi - this.iBE;
          l2 = paramLong - this.uxi;
          ab.d("MicroMsg.WebViewUI", "report(%s), clickTimestamp : %d, appID : %s, usedTime : %s, stayTime : %s, networkType : %s, userAgent : %s, url : %s, sessionID : %s, targetAction : %s, targetUrl : %s,scene : %s, refererUrl : %s", new Object[] { Integer.valueOf(13376), Long.valueOf(this.iBE), str1, Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(this.networkType), this.ium, this.uxh, this.cvF, Integer.valueOf(paramInt), paramString, Integer.valueOf(this.fromScene), this.uxg });
          localObject1 = "";
          str2 = "";
          str3 = "";
          localObject2 = "";
          str4 = str3;
          str5 = str2;
        }
      }
      try
      {
        Object localObject3 = com.tencent.mm.compatible.util.q.encode(bo.nullAsNil(this.ium), "UTF-8");
        str4 = str3;
        str5 = str2;
        localObject1 = localObject3;
        str2 = com.tencent.mm.compatible.util.q.encode(bo.nullAsNil(this.uxh), "UTF-8");
        str4 = str3;
        str5 = str2;
        localObject1 = localObject3;
        str3 = com.tencent.mm.compatible.util.q.encode(bo.nullAsNil(paramString), "UTF-8");
        str4 = str3;
        str5 = str2;
        localObject1 = localObject3;
        String str6 = com.tencent.mm.compatible.util.q.encode(bo.nullAsNil(this.uxg), "UTF-8");
        localObject1 = str6;
        localObject2 = localObject3;
        str5 = str2;
        str4 = str3;
        localObject3 = localObject1;
        com.tencent.mm.plugin.report.service.h.pYm.e(13376, new Object[] { Long.valueOf(this.iBE), str1, Long.valueOf(l1), Long.valueOf(l2), Integer.valueOf(this.networkType), localObject2, str5, this.cvF, Integer.valueOf(paramInt), str4, Integer.valueOf(this.fromScene), localObject3 });
        this.fromScene = 0;
        if (paramInt == 1)
        {
          this.uxg = this.uxh;
          this.uxh = paramString;
          this.iBE = paramLong;
        }
        AppMethodBeat.o(8075);
        continue;
        bool = false;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.WebViewUI", localUnsupportedEncodingException, "", new Object[0]);
          Object localObject4 = localObject2;
          localObject2 = localObject1;
        }
      }
    }
  }

  protected void nO(boolean paramBoolean)
  {
    AppMethodBeat.i(8059);
    this.uwW = paramBoolean;
    if (this.pzf == null)
    {
      ab.e("MicroMsg.WebViewUI", "viewwv is null, maybe has destroyed");
      AppMethodBeat.o(8059);
      return;
    }
    enableOptionMenu(paramBoolean);
    showOptionMenu(paramBoolean);
    boolean bool1 = getIntent().getBooleanExtra("show_feedback", false);
    if (bool1)
      showOptionMenu(bool1);
    int i = dat();
    if (dar() != null)
      i = 2131231598;
    bool1 = getIntent().getBooleanExtra("KRightBtn", false);
    boolean bool2 = getIntent().getBooleanExtra("KShowFixToolsBtn", false);
    ab.i("MicroMsg.WebViewUI", "banRightBtn:%b, showFixToolsBtn:%b", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
    if (!bool1)
    {
      if (bool2)
        addIconOptionMenu(1, 2131231302, new WebViewUI.31(this));
      a(i, new WebViewUI.32(this), this.uxc);
    }
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      nR(paramBoolean);
      AppMethodBeat.o(8059);
      break;
    }
  }

  protected final void nP(boolean paramBoolean)
  {
    AppMethodBeat.i(8068);
    if (findViewById(2131823606) == null)
    {
      AppMethodBeat.o(8068);
      return;
    }
    boolean bool;
    if (findViewById(2131823606).getVisibility() == 0)
    {
      bool = true;
      label38: if (bool != paramBoolean)
      {
        localObject = this.mController.ylL;
        if (!paramBoolean)
          break label108;
      }
    }
    label108: for (int i = 2131034125; ; i = 2131034126)
    {
      localObject = AnimationUtils.loadAnimation((Context)localObject, i);
      findViewById(2131823606).startAnimation((Animation)localObject);
      if (paramBoolean)
        break label116;
      findViewById(2131823606).setVisibility(8);
      AppMethodBeat.o(8068);
      break;
      bool = false;
      break label38;
    }
    label116: findViewById(2131823606).setVisibility(0);
    this.uuZ = ((ImageButton)findViewById(2131823607));
    Object localObject = this.uuZ;
    if ((this.pzf != null) && (this.pzf.canGoBack()));
    for (paramBoolean = true; ; paramBoolean = false)
    {
      ((ImageButton)localObject).setEnabled(paramBoolean);
      this.uuZ.setOnClickListener(new WebViewUI.39(this));
      this.uva = ((ImageButton)findViewById(2131823608));
      this.uva.setOnClickListener(new WebViewUI.40(this));
      AppMethodBeat.o(8068);
      break;
    }
  }

  public final void nR(boolean paramBoolean)
  {
    AppMethodBeat.i(8098);
    String str = this.pzf.getUrl();
    if (paramBoolean)
    {
      showOptionMenu(0, false);
      this.uwd.put(str, Boolean.TRUE);
      AppMethodBeat.o(8098);
    }
    while (true)
    {
      return;
      showOptionMenu(0, true);
      if (this.uwd.containsKey(str))
        this.uwd.remove(str);
      AppMethodBeat.o(8098);
    }
  }

  public final boolean needShowIdcError()
  {
    return false;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(8036);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (this.icH.b(this, paramInt1, paramInt2, paramIntent))
      AppMethodBeat.o(8036);
    while (true)
    {
      return;
      if (com.tencent.mm.plugin.webview.modeltools.a.d(this, paramInt1, paramInt2, paramIntent))
      {
        AppMethodBeat.o(8036);
      }
      else if (paramInt1 == 777)
      {
        Object localObject = null;
        if (paramIntent != null)
          localObject = paramIntent.getBundleExtra("result_data");
        if ((localObject != null) && (((Bundle)localObject).getString("go_next", "").equals("gdpr_confirm_continue")))
        {
          ab.i("MicroMsg.WebViewUI", "gdpr continue:true");
          AppMethodBeat.o(8036);
        }
        else
        {
          ab.i("MicroMsg.WebViewUI", "gdpr continue:false");
          localObject = new Intent();
          paramIntent = new Bundle();
          paramIntent.putString("go_next", "gdpr_confirm_logout");
          ((Intent)localObject).putExtra("result_data", paramIntent);
          this.uwA = true;
          m.uuj.close();
          setResult(-1, (Intent)localObject);
          finish();
        }
      }
      else
      {
        AppMethodBeat.o(8036);
      }
    }
  }

  public void onCancel()
  {
    AppMethodBeat.i(8038);
    if (this.pzf != null)
    {
      if (!this.uwY)
        break label42;
      this.pzf.setOnLongClickListener(this.uwZ);
    }
    while (true)
    {
      super.onCancel();
      AppMethodBeat.o(8038);
      return;
      label42: this.pzf.setOnLongClickListener(null);
    }
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(8012);
    super.onConfigurationChanged(paramConfiguration);
    View localView;
    if (this.jQp != paramConfiguration.orientation)
    {
      localView = dag();
      if (localView == null)
      {
        localView = null;
        if (localView != null)
          break label55;
        AppMethodBeat.o(8012);
      }
    }
    while (true)
    {
      return;
      localView = (View)localView.getParent();
      break;
      label55: localView.dispatchConfigurationChanged(paramConfiguration);
      localView.requestLayout();
      this.jQp = paramConfiguration.orientation;
      AppMethodBeat.o(8012);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7996);
    Object localObject1 = this.uwE;
    ((com.tencent.mm.plugin.webview.e.d)localObject1).startTime = System.currentTimeMillis();
    ((com.tencent.mm.plugin.webview.e.d)localObject1).aI("onCreate", ((com.tencent.mm.plugin.webview.e.d)localObject1).startTime);
    if (this.uwl)
      this.yll = false;
    super.onCreate(paramBundle);
    this.uwE.aI("onUIInitStart", System.currentTimeMillis());
    ab.i("MicroMsg.WebViewUI", "onCreate" + hashCode());
    this.umI = new n(this);
    this.uwH = new i(this);
    this.uwI = new j(this);
    com.tencent.mm.plugin.webview.e.e.h(cWL(), this);
    this.uwO = new o(this);
    paramBundle = this.uwO;
    if (paramBundle.uxX != null)
    {
      if (!paramBundle.daQ())
        break label2208;
      paramBundle.uxW = true;
    }
    while (true)
    {
      ab.i("MicroMsg.WebViewUIStyleHelper", "initNewWebViewUIStyleParams, webViewUI#%s, disableLightActionbarStyle:%b", new Object[] { paramBundle.uxX, Boolean.valueOf(paramBundle.uxW) });
      this.uxb = true;
      this.uvB = getIntent().getIntExtra("geta8key_session_id", (int)System.currentTimeMillis());
      this.uvD = getIntent().getByteArrayExtra("geta8key_cookie");
      this.uvm = cWL();
      this.screenOrientation = getIntent().getIntExtra("screen_orientation", -1);
      this.uvz = getIntent().getBooleanExtra("from_shortcut", false);
      this.uvq = getIntent().getIntExtra(e.m.ygo, -1);
      this.nft = getIntent().getStringExtra("status_bar_style");
      this.nfs = getIntent().getIntExtra("customize_status_bar_color", 0);
      label325: boolean bool1;
      if (getIntent() == null)
      {
        paramBundle = "";
        if (getIntent() != null)
          break label2230;
        bool1 = false;
        label334: ab.i("MicroMsg.WebViewUI", "initCustomActionBarColorIfNeed isNativeStyle is %b", new Object[] { Boolean.valueOf(bool1) });
        if (!bool1)
          break label2245;
        paramBundle = "white";
        Jt(-16777216);
      }
      try
      {
        label369: i = Color.parseColor(paramBundle);
        paramBundle = Integer.valueOf(i);
        label381: if (paramBundle != null)
        {
          localObject1 = new Bundle(1);
          ((Bundle)localObject1).putInt("set_navigation_bar_color_color", paramBundle.intValue());
          ((Bundle)localObject1).putInt("set_navigation_bar_color_alpha", 255);
          ac((Bundle)localObject1);
          if (!getIntent().hasExtra("customize_status_bar_color"))
            this.nfs = paramBundle.intValue();
        }
        label441: this.cOG = cWL();
        this.uwp = getIntent().getBooleanExtra("show_native_web_view", false);
        this.uvl = getIntent().getBooleanExtra("key_trust_url", false);
        uwz += 1;
        uvK.add(new WebViewUI.z(this));
        if (uvK.size() > 1)
        {
          paramBundle = uvK;
          paramBundle = (WebViewUI.z)paramBundle.get(paramBundle.size() - 2);
          if ((paramBundle.hiC != null) && (paramBundle.hiC.get() != null))
            ((WebViewUI)paramBundle.hiC.get()).nN(false);
        }
        ab.i("MicroMsg.WebViewUI", "initView trust:%b, rawUrl = %s ", new Object[] { Boolean.valueOf(this.uvl), this.cOG });
        this.cMm = bo.nullAsNil(getIntent().getStringExtra("KPublisherId"));
        this.cSQ = afH(getIntent().getStringExtra("geta8key_username"));
        localObject1 = this.ulI.cXT();
        i = this.cSQ;
        paramBundle = this.cMm;
        ((aq.o)localObject1).cSQ = i;
        ((aq.o)localObject1).uni = paramBundle;
        this.handler = new ak();
        if (this.ulI != null)
        {
          localObject1 = this.ulI;
          paramBundle = getIntent().getBundleExtra("mm_report_bundle");
          if (paramBundle != null)
          {
            if (((aq)localObject1).umW != null)
              ((aq)localObject1).umW.mqu = null;
            ((aq)localObject1).umW = new aq.b((aq)localObject1, paramBundle);
            bool1 = true;
            label724: this.uvp = bool1;
            paramBundle = getIntent().getBundleExtra("close_window_confirm_info");
            if (paramBundle != null)
              this.uwe = WebViewUI.d.ad(paramBundle);
            getWindow().setFlags(16777216, 16777216);
            getWindow().setFormat(-3);
            this.uwI.cZI();
            v.a.fH(this);
            bool2 = getIntent().getBooleanExtra("usePlugin", true);
            bool1 = getIntent().getBooleanExtra("zoom", true);
            bool3 = getIntent().getBooleanExtra("useJs", true);
            paramBundle = cWL();
            if ((!WebView.isX5()) || (!com.tencent.mm.plugin.webview.e.e.agF(paramBundle)) || ("true".equals(com.tencent.xweb.a.iG("disable_apk_hook", "tools"))))
              break label2271;
            i = 1;
            label862: if (i == 0)
              break label2277;
            this.pzf = MMWebView.a.im(this);
            com.tencent.xweb.util.f.nI(173L);
            if (this.pzf == null)
              this.pzf = aXX();
            label896: this.pzf.zNv = this;
            localObject1 = this.pzf;
            if ((localObject1 == null) || (((MMWebView)localObject1).getIsX5Kernel()) || (com.tencent.mm.compatible.util.d.iW(19)));
          }
        }
      }
      catch (Exception paramBundle)
      {
        try
        {
          boolean bool2;
          boolean bool3;
          paramBundle = new com/tencent/mm/compatible/loader/c;
          paramBundle.<init>(localObject1, "mSysWebView", null);
          localObject1 = paramBundle.get();
          ab.d("MicroMsg.WebViewUIUtil", "tryInterruptAwaitingWebCoreThread, mSysWebView = %s", new Object[] { localObject1 });
          paramBundle = new com/tencent/mm/compatible/loader/c;
          paramBundle.<init>(localObject1, "mProvider", null);
          paramBundle = paramBundle.get();
          ab.d("MicroMsg.WebViewUIUtil", "tryInterruptAwaitingWebCoreThread, mWebViewClassic = %s", new Object[] { paramBundle });
          localObject1 = new com/tencent/mm/compatible/loader/c;
          ((com.tencent.mm.compatible.loader.c)localObject1).<init>(paramBundle, "mWebViewCore", null);
          paramBundle = ((com.tencent.mm.compatible.loader.c)localObject1).get();
          ab.d("MicroMsg.WebViewUIUtil", "tryInterruptAwaitingWebCoreThread, mWebViewCore = %s", new Object[] { paramBundle });
          localObject1 = new com/tencent/mm/compatible/loader/c;
          ((com.tencent.mm.compatible.loader.c)localObject1).<init>(paramBundle, "sWebCoreHandler", null);
          localObject1 = ((com.tencent.mm.compatible.loader.c)localObject1).get();
          ab.d("MicroMsg.WebViewUIUtil", "tryInterruptAwaitingWebCoreThread, sWebCoreHandler = %s", new Object[] { localObject1 });
          paramBundle = new com/tencent/mm/compatible/loader/c;
          paramBundle.<init>(localObject1, "mLooper", null);
          paramBundle = paramBundle.get();
          ab.d("MicroMsg.WebViewUIUtil", "tryInterruptAwaitingWebCoreThread, mLooper = %s", new Object[] { paramBundle });
          localObject1 = new com/tencent/mm/compatible/loader/c;
          ((com.tencent.mm.compatible.loader.c)localObject1).<init>(paramBundle, "mThread", null);
          paramBundle = ((com.tencent.mm.compatible.loader.c)localObject1).get();
          ab.d("MicroMsg.WebViewUIUtil", "tryInterruptAwaitingWebCoreThread, mThread = %s", new Object[] { paramBundle });
          if ((paramBundle instanceof Thread))
          {
            paramBundle = (Thread)paramBundle;
            ab.i("MicroMsg.WebViewUIUtil", "tryInterruptAwaitingWebCoreThread, webCoreThread.getState = %s", new Object[] { paramBundle.getState() });
            if (paramBundle.getState() == Thread.State.WAITING)
              paramBundle.interrupt();
          }
          label1184: this.pzf.getSettings().setJavaScriptEnabled(bool3);
          this.pzf.getSettings().setPluginsEnabled(bool2);
          this.pzf.getSettings().dUh();
          this.pzf.getSettings().setBuiltInZoomControls(bool1);
          this.pzf.getSettings().setUseWideViewPort(true);
          this.pzf.getSettings().setLoadWithOverviewMode(true);
          this.pzf.getSettings().dUc();
          this.pzf.getSettings().dUb();
          this.pzf.getSettings().setGeolocationEnabled(true);
          this.pzf.getSettings().setJavaScriptCanOpenWindowsAutomatically(true);
          this.pzf.getSettings().dUj();
          this.pzf.getSettings().dUf();
          this.pzf.getSettings().setAppCachePath(getDir("webviewcache", 0).getAbsolutePath());
          this.pzf.getSettings().dUe();
          this.pzf.getSettings().dUg();
          this.pzf.getSettings().setDatabasePath(com.tencent.mm.compatible.util.e.eSi + "databases/");
          com.tencent.xweb.b.dTR().dTS();
          com.tencent.xweb.b.dTR().f(this.pzf);
          localObject1 = (WindowManager)getApplicationContext().getSystemService("window");
        }
        catch (Exception paramBundle)
        {
          try
          {
            localObject2 = WebView.class.getDeclaredField("mWebViewCore").getType().getDeclaredField("mBrowserFrame").getType().getDeclaredField("sConfigCallback");
            ((Field)localObject2).setAccessible(true);
            paramBundle = ((Field)localObject2).get(null);
            if (paramBundle == null)
            {
              label1462: paramBundle = this.uwI;
              if (!(paramBundle.cZv() instanceof GameWebViewUI))
                break label2342;
              paramBundle.utK.add(Integer.valueOf(11));
              paramBundle.utK.add(Integer.valueOf(28));
              label1507: this.uwL = new com.tencent.mm.plugin.webview.b();
              if (getIntent().getBooleanExtra("translate_webview", false))
              {
                this.uvx = true;
                setMMTitle(2131305579);
                paramBundle = this.pzf;
                localObject2 = this.cOG;
                if (paramBundle.getX5WebViewExtension() != null)
                {
                  localObject1 = new Bundle();
                  ((Bundle)localObject1).putString("destLanguage", com.tencent.mm.sdk.platformtools.aa.dor());
                  ((Bundle)localObject1).putString("url", (String)localObject2);
                  ((Bundle)localObject1).putString("translateTips", getString(2131305584));
                  ((Bundle)localObject1).putString("translateFinish", getString(2131305581));
                  ((Bundle)localObject1).putString("errorWording", getString(2131305580));
                }
              }
            }
          }
          catch (Exception paramBundle)
          {
            try
            {
              org.a.a.ep(paramBundle.getX5WebViewExtension()).u("invokeMiscMethod", new Object[] { "translateWebSite", localObject1 });
              label1659: this.uie = com.tencent.mm.plugin.webview.ui.tools.bag.o.a(new com.tencent.mm.plugin.webview.ui.tools.bag.q(this, this.pzf), cWO());
              this.uie.afY(this.cOG);
              cZX();
              this.icz = new k((JsapiPermissionWrapper)getIntent().getParcelableExtra("hardcode_jspermission"), (GeneralControlWrapper)getIntent().getParcelableExtra("hardcode_general_ctrl"), new WebViewUI.52(this));
              initView();
              IB("onCreate");
              this.ium = this.pzf.getSettings().getUserAgentString();
              this.fromScene = getIntent().getIntExtra("from_scence", 0);
              ab.d("MicroMsg.WebViewUI", " onCreate fromScene %d", new Object[] { Integer.valueOf(this.fromScene) });
              this.cvF = v.nW(bo.nullAsNil(hashCode()));
              ab.i("MicroMsg.WebViewUI", " onCreate sessionId %s", new Object[] { this.cvF });
              paramBundle = this.ulI.cXZ();
              i = this.cSQ;
              localObject1 = this.cMm;
              paramBundle.cSQ = i;
              paramBundle.uni = ((String)localObject1);
              paramBundle.url = this.cOG;
              localObject1 = this.ulI.cYf();
              paramBundle = this.cOG;
              ab.i("MicroMsg.WebviewReporter.DomainReporter", "setRawUrl, value = %s", new Object[] { paramBundle });
            }
            catch (Exception paramBundle)
            {
              try
              {
                localObject2 = Uri.parse(paramBundle);
                if ((((Uri)localObject2).getScheme() != null) && (!((Uri)localObject2).getScheme().toLowerCase().startsWith("http")))
                  ab.i("MicroMsg.WebviewReporter.DomainReporter", "rawUrl scheme is not http/https, skip, scheme = %s", new Object[] { ((Uri)localObject2).getScheme() });
              }
              catch (Exception paramBundle)
              {
                try
                {
                  label1974: this.uwT = this.mController.contentView;
                  if (this.uwT != null)
                  {
                    cZY();
                    paramBundle = (ViewGroup)((ViewGroup)getWindow().getDecorView()).getChildAt(0);
                    localObject1 = new com/tencent/mm/plugin/webview/ui/tools/WebViewUI$54;
                    ((WebViewUI.54)localObject1).<init>(this);
                    paramBundle.addOnLayoutChangeListener((View.OnLayoutChangeListener)localObject1);
                  }
                }
                catch (Exception paramBundle)
                {
                  try
                  {
                    int i;
                    Object localObject2;
                    label2028: if (this.uwl)
                      if (dab())
                        dad();
                    while (true)
                    {
                      this.uvh = new com.tencent.mm.bm.a(this.mController.ylL, this.uwV);
                      this.uwF.aNS().aa(new WebViewUI.53(this));
                      this.uwK = new WebViewClipBoardHelper(this);
                      this.uwR.dnU();
                      this.uvV.dnU();
                      if (this.uwO != null)
                      {
                        paramBundle = this.uwO;
                        if (paramBundle.uxX != null)
                        {
                          paramBundle.pzp = paramBundle.uxX.pzf;
                          if (!paramBundle.uxW)
                            break label2599;
                          ab.i("MicroMsg.WebViewUIStyleHelper", "initNewWebViewUIStyleIfNeed, disableLightActionbarStyle true");
                        }
                      }
                      af(getWindow().getDecorView(), 256);
                      aq.lP(getIntent().getLongExtra("start_activity_time", 0L));
                      this.uwE.aI("onUIInitEnd", System.currentTimeMillis());
                      AppMethodBeat.o(7996);
                      return;
                      label2208: paramBundle.uxW = false;
                      break;
                      paramBundle = getIntent().getStringExtra("custom_action_bar_color");
                      break label325;
                      label2230: bool1 = getIntent().getBooleanExtra("open_custom_style_url", false);
                      break label334;
                      label2245: if (bo.isNullOrNil(paramBundle))
                        break label441;
                      break label369;
                      paramBundle = paramBundle;
                      paramBundle = null;
                      break label381;
                      bool1 = false;
                      break label724;
                      bool1 = false;
                      break label724;
                      label2271: i = 0;
                      break label862;
                      label2277: this.pzf = aXX();
                      break label896;
                      paramBundle = paramBundle;
                      ab.e("MicroMsg.WebViewUIUtil", "tryInterruptAwaitingWebCoreThread, exception = %s", new Object[] { paramBundle });
                      break label1184;
                      localObject2 = ((Field)localObject2).getType().getDeclaredField("mWindowManager");
                      ((Field)localObject2).setAccessible(true);
                      ((Field)localObject2).set(paramBundle, localObject1);
                      break label1462;
                      paramBundle = paramBundle;
                      break label1462;
                      label2342: paramBundle.utK.add(Integer.valueOf(7));
                      paramBundle.utK.add(Integer.valueOf(11));
                      paramBundle.utK.add(Integer.valueOf(28));
                      break label1507;
                      paramBundle = paramBundle;
                      ab.e("MicroMsg.WebViewTranslateHelper", "detectTranslateWebSiteIsNeeded error %s", new Object[] { paramBundle.getMessage() });
                      break label1659;
                      localObject2 = ((Uri)localObject2).getHost();
                      if ((localObject2 == null) || (((String)localObject2).toLowerCase().endsWith(".qq.com")))
                      {
                        ab.i("MicroMsg.WebviewReporter.DomainReporter", "rawUrl, host is .qq.com, skip, host = %s", new Object[] { localObject2 });
                        break label1974;
                        localException = localException;
                        ab.e("MicroMsg.WebviewReporter.DomainReporter", "parse rawUrl fail, rawUrl = %s", new Object[] { paramBundle });
                        break label1974;
                      }
                      localException.mlA = true;
                      break label1974;
                      paramBundle = paramBundle;
                      ab.e("MicroMsg.WebViewUI", "fixContentMargin error : %s", new Object[] { paramBundle.getMessage() });
                      break label2028;
                      if (!com.tencent.mm.compatible.util.d.iW(21))
                        break label2582;
                      ViewGroup localViewGroup = (ViewGroup)((ViewGroup)getWindow().getDecorView()).getChildAt(0);
                      paramBundle = new com/tencent/mm/plugin/webview/ui/tools/WebViewUI$55;
                      paramBundle.<init>(this, localViewGroup);
                      localViewGroup.setOnApplyWindowInsetsListener(paramBundle);
                    }
                  }
                  catch (Exception paramBundle)
                  {
                    while (true)
                    {
                      ab.e("MicroMsg.WebViewUI", "tryToExpandToStatusBar error : %s", new Object[] { paramBundle.getMessage() });
                      continue;
                      label2582: ((ViewGroup)getWindow().getDecorView()).setFitsSystemWindows(true);
                      continue;
                      label2599: ab.i("MicroMsg.WebViewUIStyleHelper", "initNewWebViewUIStyleIfNeed, disableLightActionbarStyle false");
                      paramBundle.daR();
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public final void onCreateBeforeSetContentView()
  {
    AppMethodBeat.i(7995);
    supportRequestWindowFeature(5);
    supportRequestWindowFeature(9);
    setProgressBarIndeterminateVisibility(false);
    AppMethodBeat.o(7995);
  }

  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    AppMethodBeat.i(8048);
    super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    this.uwH.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
    AppMethodBeat.o(8048);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(8017);
    ab.i("MicroMsg.WebViewUI", "onDestroy " + hashCode());
    super.onDestroy();
    com.tencent.mm.plugin.webview.modeltools.c.cYw();
    Object localObject = dae();
    if (localObject != null)
    {
      String str = getSharedPreferences("webview_url_prefs", 4).getString("url", null);
      if ((str != null) && (((String)localObject).equals(str)))
      {
        localObject = getSharedPreferences("webview_url_prefs", 4).edit();
        ((SharedPreferences.Editor)localObject).remove("url");
        ((SharedPreferences.Editor)localObject).apply();
      }
    }
    while (true)
    {
      this.uie.dbc();
      if (!this.uwB);
      try
      {
        if (this.icy != null)
        {
          this.icy.Jc(hashCode());
          this.icy.IP(hashCode());
        }
        ab.w("MicroMsg.WebViewUI", "invoke onWebViewUIDestroy");
        label166: if (this.uvh != null)
          this.uvh.disable();
        this.uwA = true;
        uwz -= 1;
        int i = hashCode();
        j = uvK.size() - 1;
        label208: if (j >= 0)
        {
          if (((WebViewUI.z)uvK.get(j)).id == i)
            uvK.remove(j);
        }
        else
        {
          l("", bo.anT(), 0);
          localObject = com.tencent.mm.plugin.webview.modelcache.p.a.cYp();
          j = hashCode();
          ((com.tencent.mm.plugin.webview.modelcache.p)localObject).uoa.put(j, Boolean.FALSE);
          localObject = this.ulI.cYb();
          ((aq.i)localObject).une = new Object[] { this.cOG, Integer.valueOf(2) };
          ((aq.i)localObject).b(this.icy);
          this.ulI.b(this.icy);
          localObject = this.ulI;
          ((aq)localObject).umM = null;
          ((aq)localObject).umK = null;
          ((aq)localObject).umL = null;
          ((aq)localObject).umJ = null;
          ((aq)localObject).umO = null;
          ((aq)localObject).umP = null;
          ((aq)localObject).umQ = null;
          ((aq)localObject).umR = null;
          if (((aq)localObject).umW != null)
          {
            ((aq)localObject).umW.mqu = null;
            ((aq)localObject).umW = null;
          }
          IB("onDestroy");
          this.uwa.clear();
          localObject = this.uwF;
          if ((((com.tencent.mm.plugin.webview.model.b)localObject).ulH != null) && (((com.tencent.mm.plugin.webview.model.b)localObject).ulH.oAl.getLooper() != null))
            ((com.tencent.mm.plugin.webview.model.b)localObject).ulH.oAl.getLooper().quit();
          ((com.tencent.mm.plugin.webview.model.b)localObject).ulH = null;
          localObject = this.uwP;
          ((an)localObject).umD.clear();
          ((an)localObject).umE.clear();
          ((an)localObject).umF.clear();
          ((an)localObject).umB.clear();
          ((an)localObject).umC.clear();
          if (this.uxm != null)
          {
            this.uxm.dismiss();
            this.uxm = null;
          }
          if (this.uxj != null)
          {
            this.uxj.dismiss();
            this.uxj = null;
          }
          if (this.uwf != null)
          {
            this.uwf.dismiss();
            this.uwf = null;
          }
          if (this.uvi != null)
            this.uvi.setOnTextSendListener(null);
          if (this.uvS.daP())
            Js(233);
          if (this.uvT.daP())
            Js(673);
          if (this.uvU.daP())
            Js(666);
          this.uwb.clear();
          this.uwI.onDestroy();
          this.uwR.dead();
          this.uvV.dead();
          if (com.tencent.xweb.c.jx(com.tencent.mm.sdk.platformtools.ah.getContext()) != null)
          {
            ab.i("MicroMsg.WebViewUI", "now force sync the cookie between ram and db");
            com.tencent.xweb.c.sync();
          }
          if (!das());
        }
      }
      catch (Exception localThrowable)
      {
        try
        {
          int j;
          if (this.icy != null)
          {
            localObject = new android/os/Bundle;
            ((Bundle)localObject).<init>();
            ((Bundle)localObject).putString("srcUsername", getIntent().getStringExtra("srcUsername"));
            this.icy.a(30, (Bundle)localObject, hashCode());
          }
          label717: ab.v("MicroMsg.WebViewUI", "on destroy isNeedCallbackMMRpt[%b]", new Object[] { Boolean.valueOf(this.uvp) });
          if (this.uvp);
          try
          {
            localObject = getIntent().getBundleExtra("mm_report_bundle");
            if (!bo.isNullOrNil(((Bundle)localObject).getString("mm_event_class")))
              if (this.icy != null)
              {
                ((Bundle)localObject).putLong("key_activity_browse_time", dyi());
                this.icy.g(250, (Bundle)localObject);
              }
          }
          catch (Exception localThrowable)
          {
            try
            {
              if (this.icy != null)
              {
                localObject = new android/os/Bundle;
                ((Bundle)localObject).<init>();
                ((Bundle)localObject).putLong("key_activity_browse_time", dyi());
                this.icy.g(251, (Bundle)localObject);
              }
            }
            catch (Exception localThrowable)
            {
              try
              {
                if (this.icy != null)
                {
                  localObject = this.icy.g(19, null);
                  if (localObject != null)
                  {
                    bool = ((Bundle)localObject).getBoolean("webview_video_proxy_init");
                    ab.i("MicroMsg.WebViewUI", "onDestroy, has init = %b, webviewHoldingCounter = %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(uwz) });
                    if ((bool) && (uwz <= 0))
                    {
                      FactoryProxyManager.getPlayManager().deinit();
                      this.icy.g(75, null);
                    }
                  }
                }
                if (this.ktl == null);
              }
              catch (Exception localThrowable)
              {
                try
                {
                  unbindService(this.ktl);
                  bool = com.tencent.mm.plugin.webview.modeltools.k.a(this.uhz, this.pzf);
                  if (this.uhz != null)
                    this.uhz.detach();
                  this.uvJ.clear();
                  if (this.uic != null)
                  {
                    localObject = this.uic;
                    ab.i("MicroMsg.WebView.MMSslErrorHandler", "detach");
                    ((d)localObject).context = null;
                    ((d)localObject).urJ = null;
                    ((d)localObject).urK.clear();
                    ((d)localObject).urL.clear();
                  }
                  if (this.uvY != null)
                    this.uvY.detach();
                  this.pzf.removeJavascriptInterface("MicroMsg");
                  this.pzf.removeJavascriptInterface("JsApi");
                  this.pzf.removeJavascriptInterface("__wx");
                }
                catch (Exception localThrowable)
                {
                  try
                  {
                    this.pzf.setWebChromeClient(null);
                    this.pzf.setWebViewClient(null);
                    this.pzf.setOnTouchListener(null);
                    this.pzf.setOnLongClickListener(null);
                    this.pzf.setVisibility(8);
                    this.pzf.removeAllViews();
                    this.pzf.clearView();
                    this.uwG.cYP();
                    if (this.icz != null)
                    {
                      localObject = this.icz;
                      ab.i("MicroMsg.WebViewPermission", "detach");
                      ((k)localObject).ulm.clear();
                      ((k)localObject).ulm = null;
                      this.icz = null;
                    }
                  }
                  catch (Exception localThrowable)
                  {
                    try
                    {
                      boolean bool;
                      this.uwX.release();
                      if (bool);
                    }
                    catch (Exception localThrowable)
                    {
                      try
                      {
                        this.pzf.destroy();
                      }
                      catch (Exception localThrowable)
                      {
                        try
                        {
                          if ((this.mController.contentView instanceof ViewGroup))
                            ((ViewGroup)this.mController.contentView).removeAllViews();
                          localObject = this.uwK;
                        }
                        catch (Throwable localThrowable)
                        {
                          try
                          {
                            while (true)
                            {
                              ((WebViewClipBoardHelper)localObject).upx.removePrimaryClipChangedListener((ClipboardManager.OnPrimaryClipChangedListener)localObject);
                              ((WebViewClipBoardHelper)localObject).upx = null;
                              label1247: localObject = this.uwL;
                              if ((((com.tencent.mm.plugin.webview.b)localObject).tipDialog != null) && (((com.tencent.mm.plugin.webview.b)localObject).tipDialog.isShowing()))
                              {
                                ((com.tencent.mm.plugin.webview.b)localObject).tipDialog.dismiss();
                                ((com.tencent.mm.plugin.webview.b)localObject).tipDialog = null;
                              }
                              this.pzf = null;
                              if (this.uwJ != null)
                              {
                                this.uwJ = null;
                                FactoryProxyManager.getPlayManager().setUtilsObject(null);
                              }
                              System.gc();
                              if (this.uvc != null)
                              {
                                this.uvc.removeAllViews();
                                this.uvc = null;
                              }
                              AppMethodBeat.o(8017);
                              return;
                              ab.w("MicroMsg.WebViewUI", "currentURL == null, qbrowser.url may be not accurate");
                              break;
                              localException1 = localException1;
                              ab.w("MicroMsg.WebViewUI", "onDestroy, remove callback and invoke event on webview destroy, ex = ".concat(String.valueOf(localException1)));
                              break label166;
                              j--;
                              break label208;
                              ab.w("MicroMsg.WebViewUI", "webview on destroy callback mm but eventclass is null");
                              continue;
                              localException2 = localException2;
                              ab.e("MicroMsg.WebViewUI", "webview on destroy callback mm exception [%s]", new Object[] { localException2.toString() });
                              continue;
                              localException3 = localException3;
                              ab.e("MicroMsg.WebViewUI", "webview on destroy callback mm exception [%s]", new Object[] { localException3.toString() });
                              continue;
                              localException4 = localException4;
                              ab.e("MicroMsg.WebViewUI", "deinit video player failed : %s", new Object[] { localException4.getMessage() });
                              continue;
                              localException5 = localException5;
                              ab.printErrStackTrace("MicroMsg.WebViewUI", localException5, "unbindService", new Object[0]);
                              continue;
                              localException6 = localException6;
                              ab.e("MicroMsg.WebViewUI", "onDestroy, set web infos to null,  ex = %s", new Object[] { localException6.getMessage() });
                              continue;
                              localException7 = localException7;
                              ab.e("MicroMsg.WebViewUI", "onDestroy, remove view,  ex = " + localException7.getMessage());
                              continue;
                              localException8 = localException8;
                              ab.w("MicroMsg.WebViewUI", "onDestroy, viewWV destroy, ex = %s", new Object[] { localException8.getMessage() });
                            }
                            localThrowable = localThrowable;
                            ab.w("MicroMsg.WebViewUI", "onDestroy contentView removeAllViews %s", new Object[] { localThrowable });
                          }
                          catch (Exception localException9)
                          {
                            break label1247;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        catch (Exception localException10)
        {
          break label717;
        }
      }
    }
  }

  public void onDrag()
  {
    AppMethodBeat.i(8039);
    if (this.pzf != null)
      this.pzf.setOnLongClickListener(new WebViewUI.24(this));
    super.onDrag();
    AppMethodBeat.o(8039);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(8020);
    ab.i("MicroMsg.WebViewUI", "onKeyDown keyCode %d", new Object[] { Integer.valueOf(paramInt) });
    if ((paramInt == 4) && (this.pzf != null) && (this.pzf.hasEnteredFullscreen()))
    {
      this.pzf.leaveFullscreen();
      AppMethodBeat.o(8020);
    }
    while (true)
    {
      return bool;
      if ((paramInt == 4) && (this.uvN != null) && (this.uvM != null) && (this.uvO != null))
      {
        try
        {
          this.uvO.onHideCustomView();
          paramKeyEvent = this.ulI.cYb();
          paramKeyEvent.une = new Object[] { this.cOG, Integer.valueOf(1) };
          paramKeyEvent.b(this.icy);
          AppMethodBeat.o(8020);
        }
        catch (Exception paramKeyEvent)
        {
          while (true)
            ab.printErrStackTrace("MicroMsg.WebViewUI", paramKeyEvent, "onkeydown", new Object[0]);
        }
      }
      else
      {
        if (paramInt == 4)
        {
          if ((this.uvi != null) && (this.uvi.isShown()))
          {
            this.uvi.hide();
            dau();
          }
          for (int i = 1; ; i = 0)
          {
            if (i == 0)
              break label219;
            AppMethodBeat.o(8020);
            break;
          }
        }
        label219: if (paramInt == 4)
        {
          if ((this.pzf != null) && (this.pzf.canGoBack()) && (this.uvn))
          {
            dai();
            paramKeyEvent = this.ulI.cYb();
            paramKeyEvent.une = new Object[] { this.cOG, Integer.valueOf(1) };
            paramKeyEvent.b(this.icy);
            AppMethodBeat.o(8020);
          }
          else
          {
            m.uuj.close();
          }
        }
        else if ((paramInt == 4) && (daB()) && (cWG()))
        {
          AppMethodBeat.o(8020);
        }
        else if ((paramInt == 4) && (this.uie.Jx(22)))
        {
          AppMethodBeat.o(8020);
        }
        else
        {
          if (paramInt == 4)
            daD();
          bool = super.onKeyDown(paramInt, paramKeyEvent);
          AppMethodBeat.o(8020);
        }
      }
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(8019);
    boolean bool;
    if ((paramInt == 82) && (!this.uwW))
    {
      bool = true;
      AppMethodBeat.o(8019);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyUp(paramInt, paramKeyEvent);
      AppMethodBeat.o(8019);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(7987);
    super.onPause();
    com.tencent.mm.modelstat.d.b(4, "WebViewUI_" + afH(bo.nullAsNil(this.uwi)), hashCode());
    com.tencent.mm.modelstat.d.h("WebViewUI_" + afH(bo.nullAsNil(this.uwi)), this.oes, bo.anT());
    Object localObject = this.ulI.cXX();
    if (((aq.l)localObject).lastResumeTime != -1L)
      ((aq.l)localObject).iBA += bo.az(((aq.l)localObject).lastResumeTime) / 1000L;
    localObject = this.ulI.cXY();
    if (((aq.a)localObject).lastResumeTime != -1L)
      ((aq.a)localObject).iBA += bo.az(((aq.a)localObject).lastResumeTime);
    localObject = m.uuj;
    ab.v("MicroMsg.WebViewReportUtil", "onPause traceid %s", new Object[] { ((m)localObject).qTK });
    if (((m)localObject).foa)
      ab.i("MicroMsg.WebViewReportUtil", "isFinish is true");
    try
    {
      if (this.icy != null)
      {
        localObject = this.icy.g(19, null);
        if (localObject != null)
        {
          boolean bool = ((Bundle)localObject).getBoolean("webview_video_proxy_init");
          ab.i("MicroMsg.WebViewUI", "onPause, has init = %b", new Object[] { Boolean.valueOf(bool) });
          if (bool)
            FactoryProxyManager.getPlayManager().appToBack();
        }
      }
      dau();
      IB("onPause");
      if (this.uvO != null)
        ab.i("MicroMsg.WebViewUI", "onPause, now try to hide customview");
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          this.uvO.onHideCustomView();
          AppMethodBeat.o(7987);
          return;
          if (bo.isNullOrNil(((m)localObject).qTK))
            continue;
          ((m)localObject).kT(6);
          continue;
          localException1 = localException1;
          ab.e("MicroMsg.WebViewUI", "notify app toback failed : %s", new Object[] { localException1.getMessage() });
        }
        catch (Exception localException2)
        {
          ab.printErrStackTrace("MicroMsg.WebViewUI", localException2, "onPause", new Object[0]);
        }
        AppMethodBeat.o(7987);
      }
    }
  }

  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    int i = 0;
    AppMethodBeat.i(7994);
    paramArrayOfString = this.icH;
    if (paramArrayOfString.uoE == null)
    {
      paramArrayOfString.cYx();
      paramInt = i;
      if (paramInt == 0)
        break label107;
      AppMethodBeat.o(7994);
    }
    while (true)
    {
      return;
      if (119 == paramInt)
      {
        if (paramArrayOfInt[0] != 0)
          break label92;
        paramArrayOfInt = (Intent)paramArrayOfString.uoE.first;
        paramInt = ((Integer)paramArrayOfString.uoE.second).intValue();
        paramArrayOfString.uoE = null;
        startActivityForResult(paramArrayOfInt, paramInt);
      }
      while (true)
      {
        paramInt = 1;
        break;
        label92: paramArrayOfString.uoE = null;
        paramArrayOfString.b(this, 0, null);
      }
      label107: AppMethodBeat.o(7994);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(7986);
    super.onResume();
    if (dae() != null)
      com.tencent.mm.plugin.webview.e.e.h(dae(), this);
    while (true)
    {
      this.ulI.cXX().lastResumeTime = bo.yz();
      this.ulI.cXY().lastResumeTime = bo.yz();
      Object localObject = m.uuj;
      ab.v("MicroMsg.WebViewReportUtil", "onResume traceid %s", new Object[] { ((m)localObject).qTK });
      if (!bo.isNullOrNil(((m)localObject).qTK))
        ((m)localObject).kT(7);
      int j;
      if (!this.uwS)
      {
        int i = hashCode();
        j = uvK.size() - 1;
        label112: if (j >= 0)
        {
          if (((WebViewUI.z)uvK.get(j)).id == i)
            uvK.remove(j);
        }
        else
          uvK.add(new WebViewUI.z(this));
      }
      else
      {
        this.uwS = false;
        if (this.uvL)
        {
          nN(true);
          this.uvL = false;
        }
        dak();
        if (this.icy == null);
      }
      try
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
        ((Bundle)localObject).putInt("screen_orientation", this.screenOrientation);
        this.icy.g(83, (Bundle)localObject);
        if ((getIntent().getBooleanExtra("disable_swipe_back", false)) && (getSwipeBackLayout() != null))
          getSwipeBackLayout().setEnableGesture(false);
        IB("onResume");
      }
      catch (Exception localException1)
      {
        try
        {
          if (this.icy != null)
          {
            localObject = this.icy.g(19, null);
            if (localObject != null)
            {
              boolean bool = ((Bundle)localObject).getBoolean("webview_video_proxy_init");
              ab.i("MicroMsg.WebViewUI", "onResume, has init = %b", new Object[] { Boolean.valueOf(bool) });
              if (bool)
                FactoryProxyManager.getPlayManager().appToFront();
            }
          }
          this.oes = bo.anT();
          this.uwF.aNS().aa(new WebViewUI.44(this));
          if (this.uwD)
            finish();
          AppMethodBeat.o(7986);
          return;
          com.tencent.mm.plugin.webview.e.e.h(cWL(), this);
          continue;
          j--;
          break label112;
          localException1 = localException1;
          ab.e("MicroMsg.WebViewUI", "ac_set_screen_orientation : " + localException1.getMessage());
        }
        catch (Exception localException2)
        {
          while (true)
            ab.e("MicroMsg.WebViewUI", "notify app tofront failed : %s", new Object[] { localException2.getMessage() });
        }
      }
    }
  }

  public void onStart()
  {
    AppMethodBeat.i(8013);
    super.onStart();
    ab.i("MicroMsg.WebViewUI", "edw onStart");
    AppMethodBeat.o(8013);
  }

  public void onStop()
  {
    AppMethodBeat.i(8014);
    ab.i("MicroMsg.WebViewUI", "edw onStop");
    X(true, true);
    super.onStop();
    AppMethodBeat.o(8014);
  }

  public void onSwipeBack()
  {
    AppMethodBeat.i(8037);
    if (this.pzf != null)
    {
      if (!this.uwY)
        break label46;
      this.pzf.setOnLongClickListener(this.uwZ);
    }
    while (true)
    {
      aqX();
      super.onSwipeBack();
      AppMethodBeat.o(8037);
      return;
      label46: this.pzf.setOnLongClickListener(null);
    }
  }

  public void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(8008);
    ab.v("MicroMsg.WebViewUI", "l=%d t=%d oldl=%d oldt=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    if ((this.uwO != null) && (!this.uwO.uxW))
      this.uwO.daU();
    AppMethodBeat.o(8008);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    AppMethodBeat.i(8030);
    super.onWindowFocusChanged(paramBoolean);
    if ((paramBoolean) && (this.uvf))
      af(getWindow().getDecorView(), 5894);
    AppMethodBeat.at(this, paramBoolean);
    AppMethodBeat.o(8030);
  }

  public final void setBackBtn(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener, int paramInt)
  {
    AppMethodBeat.i(8102);
    super.setBackBtn(paramOnMenuItemClickListener, paramInt);
    if ((com.tencent.mm.compatible.util.d.iW(21)) && (dac()))
      dxZ();
    AppMethodBeat.o(8102);
  }

  public void setMMTitle(String paramString)
  {
    AppMethodBeat.i(7990);
    if (this.uvx)
    {
      super.setMMTitle(2131305579);
      AppMethodBeat.o(7990);
    }
    while (true)
    {
      return;
      super.setMMTitle(paramString);
      AppMethodBeat.o(7990);
    }
  }

  @TargetApi(21)
  public final void setStatusBarColor(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(8005);
    Object localObject;
    if (this.uwl)
    {
      localObject = this.mController.contentView;
      if (!com.tencent.mm.ui.ah.Nw(paramInt))
        bool = true;
      com.tencent.mm.ui.statusbar.a.d((View)localObject, paramInt, bool);
      AppMethodBeat.o(8005);
    }
    while (true)
    {
      return;
      if ((this.iJp > 0) && (!com.tencent.mm.compatible.util.d.fP(21)))
        break;
      AppMethodBeat.o(8005);
    }
    getWindow().setStatusBarColor(0);
    if (this.uwU == null)
    {
      this.uwU = new View(this);
      localObject = new ViewGroup.LayoutParams(-1, this.iJp);
      ((ViewGroup)findViewById(16908290)).addView(this.uwU, (ViewGroup.LayoutParams)localObject);
    }
    while (true)
    {
      this.uwU.setBackgroundColor(paramInt);
      AppMethodBeat.o(8005);
      break;
      localObject = this.uwU.getLayoutParams();
      if (((ViewGroup.LayoutParams)localObject).height != this.iJp)
      {
        ((ViewGroup.LayoutParams)localObject).height = this.iJp;
        this.uwU.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
    }
  }

  public final void showOptionMenu(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(8061);
    if (getIntent().getBooleanExtra("hide_option_menu", false))
    {
      super.showOptionMenu(paramInt, false);
      AppMethodBeat.o(8061);
    }
    while (true)
    {
      return;
      super.showOptionMenu(paramInt, paramBoolean);
      AppMethodBeat.o(8061);
    }
  }

  public final void showOptionMenu(boolean paramBoolean)
  {
    AppMethodBeat.i(8060);
    if (getIntent().getBooleanExtra("hide_option_menu", false))
    {
      super.showOptionMenu(false);
      AppMethodBeat.o(8060);
    }
    while (true)
    {
      return;
      super.showOptionMenu(paramBoolean);
      AppMethodBeat.o(8060);
    }
  }

  public final void showVKB()
  {
    AppMethodBeat.i(8101);
    super.showVKB();
    if (this.jYe == -3)
    {
      this.jYe = -2;
      AppMethodBeat.o(8101);
    }
    while (true)
    {
      return;
      this.jYe = -3;
      AppMethodBeat.o(8101);
    }
  }

  public void startActivity(Intent paramIntent)
  {
    AppMethodBeat.i(8105);
    if (bo.isEqual(paramIntent.getType(), "application/vnd.android.package-archive"))
    {
      com.tencent.mm.pluginsdk.model.app.q.a(com.tencent.mm.sdk.platformtools.ah.getContext(), paramIntent.getData(), null);
      AppMethodBeat.o(8105);
    }
    while (true)
    {
      return;
      super.startActivity(paramIntent);
      AppMethodBeat.o(8105);
    }
  }

  protected void t(int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(8097);
    ab.i("MicroMsg.WebViewUI", "handleEmojiStoreAction");
    AppMethodBeat.o(8097);
  }

  public final void xE(int paramInt)
  {
    AppMethodBeat.i(7984);
    super.xE(paramInt);
    if (this.uwl)
      setStatusBarColor(paramInt);
    AppMethodBeat.o(7984);
  }

  final class f
    implements com.tencent.mm.plugin.webview.ui.tools.jsapi.b
  {
    private f()
    {
    }

    public final boolean afM(String paramString)
    {
      boolean bool = true;
      AppMethodBeat.i(7900);
      int i = WebViewUI.this.afH(bo.nullAsNil(WebViewUI.this.uwi));
      if (com.tencent.mm.pluginsdk.e.aH(paramString, WebViewUI.T(WebViewUI.this)));
      while (true)
      {
        try
        {
          if ("weixin://dl/shopping".equals(paramString))
          {
            localObject = WebViewUI.this.icy.cZh();
            if (!bo.isNullOrNil((String)localObject))
              WebViewUI.this.loadUrl((String)localObject);
            localObject = new java/util/ArrayList;
            ((ArrayList)localObject).<init>();
            ((List)localObject).add(paramString);
            ((List)localObject).add("1");
            ((List)localObject).add(String.valueOf(i));
            ((List)localObject).add(bo.nullAsNil(WebViewUI.this.uwi));
            ((List)localObject).add(bo.nullAsNil(WebViewUI.this.cOG));
            WebViewUI.this.icy.k(11405, (List)localObject);
            AppMethodBeat.o(7900);
            return bool;
          }
          if ("weixin://dl/faq".equals(paramString))
          {
            int j = WebViewUI.this.icy.cZj();
            int k = WebViewUI.this.icy.cZk();
            localObject = com.tencent.mm.sdk.platformtools.ah.getContext().getString(2131303297, new Object[] { Integer.valueOf(j), Integer.valueOf(k) });
            WebViewUI.this.loadUrl((String)localObject);
            continue;
          }
        }
        catch (Exception paramString)
        {
          Object localObject;
          ab.e("MicroMsg.WebViewUI", "kv report fail, ex = %s", new Object[] { paramString.getMessage() });
          continue;
          if ("weixin://dl/posts".equals(paramString))
          {
            WebViewUI.this.icy.cZl();
            continue;
          }
          if ("weixin://dl/moments".equals(paramString))
          {
            WebViewUI.this.icy.cZm();
            continue;
          }
          if (paramString.startsWith("weixin://dl/feedback"))
          {
            WebViewUI.this.icy.afp(paramString);
            continue;
          }
          if ("weixin://dl/scan".equals(paramString))
          {
            WebViewUI localWebViewUI = WebViewUI.this;
            localObject = new android/content/Intent;
            ((Intent)localObject).<init>();
            com.tencent.mm.bp.d.c(localWebViewUI, "scanner", ".ui.SingleTopScanUI", (Intent)localObject);
            continue;
          }
          com.tencent.mm.pluginsdk.e.aiq(paramString);
          continue;
        }
        bool = false;
      }
    }

    public final boolean afS(String paramString)
    {
      AppMethodBeat.i(7899);
      boolean bool;
      if (bo.isNullOrNil(paramString))
      {
        bool = false;
        AppMethodBeat.o(7899);
      }
      while (true)
      {
        return bool;
        bool = com.tencent.mm.pluginsdk.ui.tools.u.t(paramString, "weixin://");
        AppMethodBeat.o(7899);
      }
    }
  }

  public class h extends s
  {
    protected h()
    {
    }

    public static String afT(String paramString)
    {
      AppMethodBeat.i(7938);
      StringBuilder localStringBuilder = new StringBuilder();
      try
      {
        paramString = InetAddress.getAllByName(paramString);
        if ((paramString != null) && (paramString.length > 0))
          for (int i = 0; i < paramString.length; i++)
          {
            localStringBuilder.append(paramString[i].getHostAddress());
            localStringBuilder.append(";");
          }
      }
      catch (UnknownHostException paramString)
      {
        ab.printErrStackTrace("MicroMsg.WebViewUI", paramString, "dnsIps", new Object[0]);
        paramString = null;
        AppMethodBeat.o(7938);
      }
      while (true)
      {
        return paramString;
        paramString = localStringBuilder.toString();
        AppMethodBeat.o(7938);
      }
    }

    private boolean afU(String paramString)
    {
      AppMethodBeat.i(7943);
      boolean bool;
      if (!WebViewUI.c(WebViewUI.this, paramString))
      {
        ab.f("MicroMsg.WebViewUI", "shouldOverrideUrlLoading, canLoadUrl fail, url = ".concat(String.valueOf(paramString)));
        WebViewUI.k(WebViewUI.this);
        bool = true;
        AppMethodBeat.o(7943);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(7943);
      }
    }

    private com.tencent.xweb.o afV(String paramString)
    {
      AppMethodBeat.i(7944);
      String str = WebViewUI.this.dae();
      Object localObject = WebViewUI.this.uwP;
      boolean bool;
      if (!WebViewUI.O(WebViewUI.this))
      {
        bool = true;
        localObject = ((an)localObject).a(paramString, bool, WebViewUI.this.icy);
        if (localObject == null)
          break label76;
        hi(str, paramString);
        AppMethodBeat.o(7944);
        paramString = (String)localObject;
      }
      while (true)
      {
        return paramString;
        bool = false;
        break;
        label76: paramString = null;
        AppMethodBeat.o(7944);
      }
    }

    private void hi(String paramString1, String paramString2)
    {
      AppMethodBeat.i(7945);
      if ((paramString2.equals(paramString1)) || (WebViewUI.a(WebViewUI.this, paramString1, paramString2)))
        WebViewUI.l(WebViewUI.this).post(new WebViewUI.h.4(this));
      AppMethodBeat.o(7945);
    }

    private boolean i(WebView paramWebView, final String paramString)
    {
      boolean bool1 = true;
      AppMethodBeat.i(138039);
      ab.i("MicroMsg.WebViewUI", "edw opt, shouldOverride url = ".concat(String.valueOf(paramString)));
      WebViewUI.this.uvG = true;
      if (!WebViewUI.c(WebViewUI.this, paramString))
      {
        ab.f("MicroMsg.WebViewUI", "shouldOverrideUrlLoading, canLoadUrl fail, url = ".concat(String.valueOf(paramString)));
        WebViewUI.k(WebViewUI.this);
        AppMethodBeat.o(138039);
      }
      while (true)
      {
        return bool1;
        if (com.tencent.mm.pluginsdk.ui.tools.u.t(paramString, "about:blank"))
        {
          ab.e("MicroMsg.WebViewUI", "shouldOverride, url is about:blank");
          AppMethodBeat.o(138039);
        }
        else if (DownloadChecker.a(paramString, WebViewUI.this.cMm, paramWebView))
        {
          ab.i("MicroMsg.WebViewUI", "use the downloader to download");
          AppMethodBeat.o(138039);
        }
        else
        {
          int i;
          try
          {
            if ((paramString.startsWith("weixin://jump/")) || (paramString.startsWith("weixin://scanqrcode/")))
            {
              WebViewUI.this.afL(paramString);
              AppMethodBeat.o(138039);
              continue;
            }
            if ((paramString.startsWith("weixin://dl/business")) && (com.tencent.mm.pluginsdk.e.s(Uri.parse(paramString))))
            {
              String str = Uri.parse(WebViewUI.this.cOG).getHost();
              paramWebView = new android/content/Intent;
              paramWebView.<init>("android.intent.action.VIEW");
              paramWebView.addCategory("android.intent.category.BROWSABLE");
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              paramWebView.setData(Uri.parse(paramString + "&domain=" + str));
              i = WebViewUI.this.getIntent().getIntExtra("pay_channel", -1);
              if (i != -1)
              {
                ab.i("MicroMsg.WebViewUI", "%s do deeplink, bypass pay channel: %s", new Object[] { paramString, Integer.valueOf(i) });
                paramWebView.putExtra("pay_channel", i);
              }
              paramWebView.putExtra("translate_link_scene", 13);
              WebViewUI.this.startActivity(paramWebView);
              AppMethodBeat.o(138039);
              continue;
            }
            if ((paramString.startsWith("weixinpreinject://iframe")) && (WebViewUI.this.uvY != null))
              ab.i("MicroMsg.WebViewUI", "preInjectJsBridge,accept preinject_Iframe and continue preinjectjsbridge");
            label467: boolean bool2;
            do
            {
              do
              {
                if (!paramString.equals(WebViewUI.y(WebViewUI.this)))
                  break label551;
                WebViewUI.e(WebViewUI.this, "");
                AppMethodBeat.o(138039);
                break;
                if ((!paramString.startsWith("weixin://dl/login/common_view")) && (!paramString.startsWith("weixin://dl/login/phone_view")))
                  break label467;
              }
              while (((!WebViewUI.this.cOG.startsWith("https://support.weixin.qq.com/security")) && (!paramString.startsWith("https://support.wechat.com/security"))) || (!WebViewUI.x(WebViewUI.this)));
              com.tencent.mm.pluginsdk.e.bu(WebViewUI.this.mController.ylL, paramString);
              WebViewUI.this.finish();
              AppMethodBeat.o(138039);
              break;
              if (paramString.startsWith("weixin://webview/initReady/"))
                break label491;
              bool2 = paramString.startsWith("weixin://webview/preInjectJSBridge/");
            }
            while (!bool2);
            label491: AppMethodBeat.o(138039);
          }
          catch (Exception paramWebView)
          {
            do
              ab.w("MicroMsg.WebViewUI", "shouldOverride, jumpToActivity, ex = " + paramWebView.getMessage());
            while (WebViewUI.this.icz != null);
            ab.e("MicroMsg.WebViewUI", "wvPerm is null, maybe has detach");
            AppMethodBeat.o(138039);
          }
          continue;
          label551: if (WebViewUI.this.afM(paramString))
          {
            AppMethodBeat.o(138039);
          }
          else if (paramString.startsWith("weixin://"))
          {
            ab.e("MicroMsg.WebViewUI", "shouldOverrideUrlLoading, can not deal with this weixin scheme, stop directly, url = %s", new Object[] { paramString });
            AppMethodBeat.o(138039);
          }
          else
          {
            i = WebViewUI.this.uvR.ael(paramString);
            if (((i == 0) || (i == 2) || (i == 8)) && (!WebViewUI.z(WebViewUI.this)))
            {
              ab.i("MicroMsg.WebViewUI", "edw shouldOverride, should not continue, reason = ".concat(String.valueOf(i)));
              if (WebViewUI.this.afI(paramString))
              {
                WebViewUI.this.pzf.stopLoading();
                WebViewUI.this.pzf.post(new Runnable()
                {
                  public final void run()
                  {
                    AppMethodBeat.i(7926);
                    WebViewUI.this.b(paramString, null, true);
                    AppMethodBeat.o(7926);
                  }
                });
              }
              while (true)
              {
                if (!paramString.equals(WebViewUI.d(WebViewUI.this)))
                  break label765;
                ab.w("MicroMsg.WebViewUI", "shouldOverride, url equals lastGetA8KeyUrl, not trigger geta8key");
                bool1 = aft(paramString);
                AppMethodBeat.o(138039);
                break;
                if (!paramString.equals(WebViewUI.d(WebViewUI.this)))
                  WebViewUI.this.pzf.stopLoading();
              }
              label765: WebViewUI.a(WebViewUI.this, paramString, true, i);
              AppMethodBeat.o(138039);
            }
            else
            {
              bool1 = aft(paramString);
              AppMethodBeat.o(138039);
            }
          }
        }
      }
    }

    public com.tencent.xweb.o a(WebView paramWebView, com.tencent.xweb.n paramn)
    {
      AppMethodBeat.i(7941);
      if ((paramn == null) || (paramn.getUrl() == null) || (bo.isNullOrNil(paramn.getUrl().toString())))
      {
        paramWebView = super.a(paramWebView, paramn);
        AppMethodBeat.o(7941);
      }
      while (true)
      {
        return paramWebView;
        ab.i("MicroMsg.WebViewUI", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramn.getUrl(), paramn.getMethod(), Boolean.valueOf(paramn.isForMainFrame()) });
        if (afU(paramn.getUrl().toString()))
        {
          paramWebView = null;
          AppMethodBeat.o(7941);
        }
        else
        {
          paramWebView = afV(paramn.getUrl().toString());
          AppMethodBeat.o(7941);
        }
      }
    }

    public com.tencent.xweb.o a(WebView paramWebView, com.tencent.xweb.n paramn, Bundle paramBundle)
    {
      AppMethodBeat.i(7942);
      if ((paramn == null) || (paramn.getUrl() == null) || (bo.isNullOrNil(paramn.getUrl().toString())))
      {
        paramWebView = super.a(paramWebView, paramn);
        AppMethodBeat.o(7942);
      }
      while (true)
      {
        return paramWebView;
        ab.i("MicroMsg.WebViewUI", "shouldInterceptRequest, url = %s, method = %s, isForMainFrame = %b", new Object[] { paramn.getUrl(), paramn.getMethod(), Boolean.valueOf(paramn.isForMainFrame()) });
        if (afU(paramn.getUrl().toString()))
        {
          paramWebView = null;
          AppMethodBeat.o(7942);
          continue;
        }
        if (com.tencent.mm.cj.c.iv(WebViewUI.this));
        try
        {
          int i = paramBundle.getInt("resourceType");
          if (((i == 1) || (i == 7)) && (!WebViewUI.N(WebViewUI.this)))
          {
            ab.i("MicroMsg.WebViewUI", "get resoutce type is iframe : %d, start geta8key", new Object[] { Integer.valueOf(i) });
            WebViewUI.a(WebViewUI.this, paramn.getUrl().toString(), false, 5);
          }
          paramWebView = afV(paramn.getUrl().toString());
          AppMethodBeat.o(7942);
        }
        catch (Exception paramWebView)
        {
          while (true)
            ab.w("MicroMsg.WebViewUI", "get resource type failed Exception ; %s", new Object[] { paramWebView.getMessage() });
        }
        catch (Throwable paramWebView)
        {
          while (true)
            ab.w("MicroMsg.WebViewUI", "get resource type failed Throwable ; %s", new Object[] { paramWebView.getMessage() });
        }
      }
    }

    public void a(WebView paramWebView, int paramInt, String paramString1, String paramString2)
    {
      AppMethodBeat.i(7937);
      com.tencent.xweb.util.f.rB(false);
      ab.e("MicroMsg.WebViewUI", "edw onReceivedError, failingUrl = %s, errorCode = %d, desc = %s, isNetworkConnected = %b", new Object[] { paramString2, Integer.valueOf(paramInt), paramString1, Boolean.valueOf(at.isConnected(WebViewUI.this)) });
      com.tencent.mm.plugin.report.service.h.pYm.a(155L, 1L, 1L, false);
      com.tencent.mm.plugin.report.service.h.pYm.a(155L, b.Jf(paramInt), 1L, false);
      com.tencent.mm.plugin.topstory.a.h.jdMethod_do(WebViewUI.this.cMm, 1);
      com.tencent.mm.plugin.topstory.a.h.jdMethod_do(WebViewUI.this.cMm, b.Jf(paramInt));
      com.tencent.mm.plugin.topstory.a.h.c(WebViewUI.this.cMm, WebViewUI.this.cOG, b.Jf(paramInt), WebViewUI.this.ulI.cXY().edh);
      super.a(paramWebView, paramInt, paramString1, paramString2);
      m.uuj.Jq(paramInt);
      WebViewUI.this.ulI.cYg().errCode = paramInt;
      WebViewUI.this.uwI.utI = false;
      if (WebViewUI.M(WebViewUI.this))
        WebViewUI.this.finish();
      try
      {
        paramWebView = new java/net/URL;
        paramWebView.<init>(paramString2);
        if (paramWebView.getHost().equals("mp.weixin.qq.com"))
        {
          paramString1 = com.tencent.mm.sdk.g.d.xDG;
          paramWebView = new com/tencent/mm/plugin/webview/ui/tools/WebViewUI$h$3;
          paramWebView.<init>(this, paramString2, paramInt);
          paramString1.b(paramWebView, "WebViewUI.CheckDNS");
        }
        AppMethodBeat.o(7937);
        return;
      }
      catch (MalformedURLException paramWebView)
      {
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.WebViewUI", paramWebView, "check mp url", new Object[0]);
          AppMethodBeat.o(7937);
        }
      }
    }

    public final void a(WebView paramWebView, com.tencent.xweb.j paramj, SslError paramSslError)
    {
      AppMethodBeat.i(7936);
      com.tencent.xweb.util.f.rB(true);
      if (paramWebView.getUrl() == null)
      {
        paramWebView = WebViewUI.this.uxf;
        if ((paramWebView == null) || (!paramWebView.startsWith(((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).aVQ())))
          break label203;
        paramWebView = WebViewUI.this.cWL();
      }
      label203: 
      while (true)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(155L, 1L, 1L, false);
        com.tencent.mm.plugin.report.service.h.pYm.a(155L, 30L, 1L, false);
        com.tencent.mm.plugin.topstory.a.h.jdMethod_do(WebViewUI.this.cMm, 1);
        com.tencent.mm.plugin.topstory.a.h.jdMethod_do(WebViewUI.this.cMm, 30);
        com.tencent.mm.plugin.topstory.a.h.c(WebViewUI.this.cMm, WebViewUI.this.cOG, 30, WebViewUI.this.ulI.cXY().edh);
        if (WebViewUI.L(WebViewUI.this) == null)
          WebViewUI.a(WebViewUI.this, new d(WebViewUI.this, WebViewUI.this.pzf));
        WebViewUI.L(WebViewUI.this).a(paramWebView, paramj, paramSslError);
        AppMethodBeat.o(7936);
        return;
        paramWebView = paramWebView.getUrl();
        break;
      }
    }

    public void a(WebView paramWebView, String paramString, boolean paramBoolean)
    {
      AppMethodBeat.i(7933);
      ab.i("MicroMsg.WebViewUI", "doUpdateVisitedHistory, url = %s, isReload = %b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      super.a(paramWebView, paramString, paramBoolean);
      if (com.tencent.mm.pluginsdk.ui.tools.u.t(paramString, "about:blank"))
      {
        ab.e("MicroMsg.WebViewUI", "doUpdateVisitedHistory, url is about:blank");
        AppMethodBeat.o(7933);
        return;
      }
      paramWebView = paramWebView.getUrl();
      if (WebViewUI.z(WebViewUI.this))
        WebViewUI.this.as(paramWebView, false);
      if ((WebViewUI.A(WebViewUI.this)) && ((WebViewUI.this.unr == null) || (bo.isEqual(paramWebView, WebViewUI.this.unr))));
      for (paramBoolean = true; ; paramBoolean = false)
      {
        if ((paramBoolean) || ((WebViewUI.this.icz != null) && (!WebViewUI.this.icz.has(paramWebView)) && (!bo.isEqual(paramWebView, WebViewUI.d(WebViewUI.this)))))
        {
          ab.i("MicroMsg.WebViewUI", "doUpdateVisitedHistory start geta8key, url = %s", new Object[] { paramWebView });
          WebViewUI.this.as(paramWebView, paramBoolean);
          WebViewUI.this.X(true, false);
          WebViewUI.c(WebViewUI.this, true);
        }
        WebViewUI.this.uwX.cZU();
        WebViewUI.this.uxf = paramString;
        WebViewUI.this.uie.afY(paramString);
        AppMethodBeat.o(7933);
        break;
      }
    }

    public final boolean a(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(7932);
      boolean bool = i(paramWebView, paramString);
      if (bool)
        WebViewUI.this.uvG = false;
      AppMethodBeat.o(7932);
      return bool;
    }

    public boolean aft(String paramString)
    {
      boolean bool = true;
      AppMethodBeat.i(7931);
      ab.i("MicroMsg.WebViewUI", "edw mmShouldOverride");
      if ((paramString.startsWith("weixinping://iframe")) || (paramString.startsWith("weixinpreinject://iframe")))
        AppMethodBeat.o(7931);
      while (true)
      {
        return bool;
        if (WebViewUI.d(WebViewUI.this, paramString))
        {
          ab.i("MicroMsg.WebViewUI", "custom scheme url deal success, url = ".concat(String.valueOf(paramString)));
          AppMethodBeat.o(7931);
        }
        else
        {
          WebViewUI.this.uxf = paramString;
          bool = false;
          AppMethodBeat.o(7931);
        }
      }
    }

    public void b(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(7935);
      super.b(paramWebView, paramString);
      WebViewUI.this.uvG = false;
      WebViewUI.B(WebViewUI.this).aI("onPageFinished", System.currentTimeMillis());
      WebViewUI.G(WebViewUI.this);
      com.tencent.mm.plugin.webview.model.a.c(WebViewUI.this.pzf);
      WebViewUI.this.uie.afY(paramString);
      if (!WebViewUI.H(WebViewUI.this))
      {
        WebViewUI.I(WebViewUI.this);
        WebViewUI.this.ulI.cYa().loadFinished = true;
      }
      ab.i("MicroMsg.WebViewUI", "edw onPageFinished opt, url = %s", new Object[] { paramString });
      Object localObject1 = WebViewUI.this.ulI.cYf();
      if ((!((aq.d)localObject1).mlA) || (((aq.d)localObject1).und))
      {
        localObject1 = m.uuj;
        ab.v("MicroMsg.WebViewReportUtil", "onPageFinished traceid %s", new Object[] { ((m)localObject1).qTK });
        if (!bo.isNullOrNil(((m)localObject1).qTK))
          ((m)localObject1).kT(2);
        if (WebViewUI.this.pzf != null)
          break label313;
        ab.w("MicroMsg.WebViewUI", "onPageFinished, webview has been destroyed, skip");
        AppMethodBeat.o(7935);
      }
      Object localObject3;
      while (true)
      {
        while (true)
        {
          return;
          try
          {
            localObject3 = Uri.parse(paramString);
            if (paramString.startsWith("http"))
              break label253;
            ab.i("MicroMsg.WebviewReporter.DomainReporter", "onPageFinished, url not startswith http");
          }
          catch (Exception localException)
          {
            ab.e("MicroMsg.WebviewReporter.DomainReporter", "onPageFinished, parse url fail, url = %s", new Object[] { paramString });
          }
        }
        break;
        label253: localObject3 = ((Uri)localObject3).getHost();
        if ((localObject3 == null) || (!((String)localObject3).equalsIgnoreCase("v.html5.qq.com")))
          break;
        com.tencent.mm.plugin.report.service.h.pYm.a(283L, 0L, 1L, true);
        localException.und = true;
        ab.i("MicroMsg.WebviewReporter.DomainReporter", "onPageFinished, domain visit reported, url = %s", new Object[] { paramString });
        break;
        label313: WebViewUI.this.uwG.wy(paramString);
        localObject2 = WebViewUI.this.pzf.getTitle();
        ab.i("MicroMsg.WebViewUI", "onPageFinished, old title = %s, new title = %s, fixedTitle = %b, showTitle = %b, loadUrl = %s", new Object[] { WebViewUI.this.mController.getMMTitle(), localObject2, Boolean.valueOf(WebViewUI.this.uuW), Boolean.valueOf(WebViewUI.this.rpm), WebViewUI.this.uxf });
        if ((WebViewUI.this.pzf.getIsX5Kernel()) && (!bo.isNullOrNil((String)localObject2)) && (((String)localObject2).length() > 0) && (!((String)localObject2).equals(WebViewUI.this.mController.getMMTitle())) && (!((String)localObject2).startsWith("http")) && ((WebViewUI.this.uxf == null) || (!WebViewUI.this.uxf.equals(localObject2))) && (!WebViewUI.this.uuW) && (WebViewUI.this.rpm))
        {
          ab.d("MicroMsg.WebViewUI", "onPageFinished, update old title while goback");
          WebViewUI.this.setMMTitle((String)localObject2);
        }
        WebViewUI.this.uwX.setCurrentURL(WebViewUI.this.dae());
        boolean bool = WebViewUI.this.getIntent().getBooleanExtra("shouldForceViewPort", false);
        ab.d("MicroMsg.WebViewUI", "hy: shouldForceViewPort: ".concat(String.valueOf(bool)));
        if (bool)
          paramWebView.evaluateJavascript(WebViewUI.this.getIntent().getStringExtra("view_port_code"), null);
        WebViewUI.J(WebViewUI.this);
        if (!WebViewUI.c(WebViewUI.this, paramString))
        {
          ab.f("MicroMsg.WebViewUI", "onPageFinished, canLoadUrl fail, url = ".concat(String.valueOf(paramString)));
          WebViewUI.k(WebViewUI.this);
          AppMethodBeat.o(7935);
        }
        else
        {
          WebViewUI.this.setProgressBarIndeterminateVisibility(false);
          WebViewUI.this.uuX.finish();
          WebViewUI.e(WebViewUI.this, "");
          if (!paramString.equals("file:///android_asset/jsapi/wxjs.js"))
            break label691;
          ab.i("MicroMsg.WebViewUI", "onPageFinished, js is finished loaded");
          AppMethodBeat.o(7935);
        }
      }
      label691: ab.i("MicroMsg.WebViewUI", "onPageFinished, inject url" + WebViewUI.K(WebViewUI.this));
      if (WebViewUI.this.uvY != null)
      {
        WebViewUI.this.uvY.uFU = WebViewUI.this.getIntent().getBooleanExtra("inject_city_service_js", false);
        WebViewUI.this.uvY.uFV = WebViewUI.this.getIntent().getStringExtra("city_service_ext_info");
        WebViewUI.this.uvY.dbZ();
      }
      if ((WebViewUI.this.icz != null) && (WebViewUI.this.icz.aei(paramString) != null))
        WebViewUI.a(WebViewUI.this, WebViewUI.this.icz.aei(paramString).jB(34), WebViewUI.this.icz.aei(paramString).jB(75));
      WebViewUI.this.nP(WebViewUI.daJ());
      Object localObject2 = WebViewUI.this.ulI.cXV();
      label886: aq.h localh;
      label913: int i;
      long l1;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.WebviewReporter", "WebviewOpenUrl.stopLoadUrl failed, url is null");
        localObject2 = WebViewUI.this.ulI.cXW();
        if (!bo.isNullOrNil(paramString))
          break label1449;
        ab.e("MicroMsg.WebviewReporter", "WebViewRenderReporter.onPageFinish failed, url is null");
        localh = WebViewUI.this.ulI.cXZ();
        localObject3 = WebViewUI.this.icy;
        if ((localObject3 != null) && (!localh.cph))
        {
          localh.cph = true;
          i = aq.aEn();
          l1 = bo.anU() - localh.startTime;
          if ((l1 >= 0L) && (l1 <= 180000L))
            break label1501;
        }
        if (!WebViewUI.this.uwa.containsKey(paramString))
          WebViewUI.this.uwa.put(paramString, Boolean.valueOf(WebViewUI.this.dxY()));
        localObject2 = (Bundle)WebViewUI.this.getIntent().getParcelableExtra("jsapiargs");
        if (localObject2 != null)
        {
          localObject2 = ((Bundle)localObject2).getParcelable("KSnsAdTag");
          if ((localObject2 != null) && ((localObject2 instanceof SnsAdClick)))
          {
            WebViewUI.this.ulI.cYg().pmI = ((SnsAdClick)localObject2);
            WebViewUI.this.ulI.cYg().L(new String[] { paramString, "1", System.currentTimeMillis() });
            WebViewUI.this.ulI.cYg().b(WebViewUI.this.icy);
          }
        }
        WebViewUI.this.nO(((Boolean)WebViewUI.this.uwa.get(paramString)).booleanValue());
        localObject2 = (Boolean)WebViewUI.this.uwd.get(paramString);
        if ((localObject2 != null) && (((Boolean)localObject2).booleanValue()))
          break label1721;
        WebViewUI.this.showOptionMenu(0, true);
      }
      while (true)
      {
        if ((WebViewUI.this.uvu) && (bo.isNullOrNil(WebViewUI.this.uxe)))
          WebViewUI.this.uxe = WebViewUI.this.uxf;
        WebViewUI.a(WebViewUI.this, bo.anT());
        com.tencent.mm.sdk.b.a.xxA.m(new vp());
        if ((WebViewUI.F(WebViewUI.this) != null) && (!WebViewUI.F(WebViewUI.this).uxW))
        {
          localObject2 = WebViewUI.F(WebViewUI.this);
          ab.i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageFinished, url:%s", new Object[] { paramString });
          ((o)localObject2).iCz = paramString;
        }
        localObject3 = WebViewUI.B(WebViewUI.this);
        localObject2 = WebViewUI.this.pzf;
        if (localObject2 != null)
          ((MMWebView)localObject2).evaluateJavascript("JSON.stringify({timing:((window.performance && window.performance.timing) ? window.performance.timing : null)});", new d.1((com.tencent.mm.plugin.webview.e.d)localObject3));
        if (com.tencent.mm.sdk.platformtools.f.IS_FLAVOR_RED)
          com.tencent.mm.ci.g.dOW().b(new a.1(paramWebView)).a(new WebViewUI.h.2(this, paramString));
        AppMethodBeat.o(7935);
        break;
        if (!((aq.n)localObject2).unv.containsKey(paramString))
          break label886;
        long l2 = ((Long)((aq.n)localObject2).unv.get(paramString)).longValue();
        l1 = bo.anU();
        ((aq.n)localObject2).unv.put(paramString, Long.valueOf(l1 - l2));
        break label886;
        label1449: if (!((aq.f)localObject2).ung.containsKey(paramString))
          break label913;
        l1 = ((Long)((aq.f)localObject2).ung.get(paramString)).longValue();
        l2 = bo.anU();
        ((aq.f)localObject2).ung.put(paramString, Long.valueOf(l2 - l1));
        break label913;
        label1501: String str = localh.uni;
        if (localh.url == null);
        for (localObject2 = localh.url; ; localObject2 = localh.url.replace(",", "!"))
        {
          aq.b((com.tencent.mm.plugin.webview.stub.d)localObject3, str, new Object[] { Integer.valueOf(4), Long.valueOf(l1), Integer.valueOf(i), localObject2, Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(aq.access$000()), Integer.valueOf(aq.access$100()), Integer.valueOf(localh.cSQ), localh.uni });
          ab.i("MicroMsg.WebviewReporter", "WebViewTotalTimeReporter.report url : %s, cost time : %d, netType : %d, %d, %d, getA8KeyScene:%d, prePublishid:%s", new Object[] { localh.url, Long.valueOf(l1), Integer.valueOf(i), Integer.valueOf(aq.access$000()), Integer.valueOf(aq.access$100()), Integer.valueOf(localh.cSQ), localh.uni });
          break;
        }
        label1721: WebViewUI.this.showOptionMenu(0, false);
      }
    }

    public void b(WebView paramWebView, String paramString, Bitmap paramBitmap)
    {
      AppMethodBeat.i(7934);
      super.b(paramWebView, paramString, paramBitmap);
      WebViewUI.this.uvG = true;
      WebViewUI.B(WebViewUI.this).aI("onPageStarted", System.currentTimeMillis());
      com.tencent.mm.plugin.webview.model.a.c(WebViewUI.this.pzf);
      com.tencent.mm.plugin.webview.e.e.h(paramString, WebViewUI.this.mController.ylL);
      ab.i("MicroMsg.WebViewUI", "edw onPageStarted opt, url = ".concat(String.valueOf(paramString)));
      com.tencent.mm.plugin.report.service.h.pYm.a(155L, 0L, 1L, false);
      if (!WebViewUI.this.uxb)
        WebViewUI.this.uwI.cZL();
      com.tencent.mm.plugin.topstory.a.h.jdMethod_do(WebViewUI.this.cMm, 0);
      if (WebViewUI.this.aYd())
      {
        if ((!TextUtils.isEmpty(paramString)) && (paramString.equals(paramWebView.getUrl())))
        {
          ab.i("MicroMsg.WebViewUI", "onPageStarted call with same url when preload");
          WebViewUI.this.daq();
          if (WebViewUI.this.uvY != null)
            WebViewUI.this.uvY.uCf = false;
          WebViewUI.this.daF();
        }
      }
      else
      {
        if ((com.tencent.mm.sdk.a.b.dnO()) && ("http://www.dktest-mmcrash.com/".equals(paramString)))
          Assert.assertTrue("test errlog in tools " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()), false);
        WebViewUI.this.unr = WebViewUI.this.uxf;
        long l = bo.anT();
        WebViewUI.this.l(paramString, l, 1);
        WebViewUI.this.ulI.cXX().unr = WebViewUI.this.unr;
        WebViewUI.this.uxf = paramString;
        paramWebView = m.uuj;
        ab.v("MicroMsg.WebViewReportUtil", "onPageStarted url %s, currUrl %s, traceid %s", new Object[] { paramString, paramWebView.uuk, paramWebView.qTK });
        paramBitmap = paramWebView.uuk;
        paramWebView.uuk = paramString;
        if (!bo.isNullOrNil(paramWebView.qTK))
          paramWebView.h(1, paramBitmap, 0);
        ab.d("MicroMsg.WebViewUI", "onPageStarted preUrl : %s, curUrl : %s.", new Object[] { WebViewUI.this.unr, WebViewUI.this.uxf });
        if (WebViewUI.c(WebViewUI.this, paramString))
          break label464;
        ab.f("MicroMsg.WebViewUI", "onPageStarted, canLoadUrl fail, url = ".concat(String.valueOf(paramString)));
        WebViewUI.k(WebViewUI.this);
        AppMethodBeat.o(7934);
      }
      while (true)
      {
        return;
        ab.v("MicroMsg.WebViewUI", "onPageStarted call when preload url %s, webview.url %s", new Object[] { paramString, paramWebView.getUrl() });
        break;
        label464: WebViewUI.this.uwX.cZU();
        WebViewUI.this.uwX.setCurrentURL(paramString);
        if (!WebViewUI.this.afM(paramString))
          break label514;
        WebViewUI.e(WebViewUI.this, paramString);
        AppMethodBeat.o(7934);
      }
      label514: if (WebViewUI.this.uvY != null)
        WebViewUI.this.uvY.dbY();
      WebViewUI.this.setProgressBarIndeterminateVisibility(false);
      if (!WebViewUI.this.afI(paramString))
      {
        WebViewUI.this.uwn = false;
        if (!WebViewUI.this.uwp)
          WebViewUI.this.uuX.start();
        label581: WebViewUI.this.uwI.afE(paramString);
        paramWebView = WebViewUI.this.as(paramString, false);
        if (WebViewUI.w.uxS.equals(paramWebView))
        {
          WebViewUI.this.uwG.wy(paramString);
          if (!WebViewUI.this.uxb)
            WebViewUI.this.uwI.utI = true;
        }
        WebViewUI.this.X(true, false);
        WebViewUI.c(WebViewUI.this, false);
        paramWebView = WebViewUI.this.ulI.cXV();
        int i = WebViewUI.this.cSQ;
        paramBitmap = WebViewUI.this.cMm;
        paramWebView.cSQ = i;
        paramWebView.uni = paramBitmap;
        if (!bo.isNullOrNil(paramString))
          break label1001;
        ab.e("MicroMsg.WebviewReporter", "WebviewOpenUrl.startLoadUrl failed, url is null");
      }
      while (true)
      {
        paramWebView = (Bundle)WebViewUI.this.getIntent().getParcelableExtra("jsapiargs");
        if (paramWebView != null)
        {
          paramWebView = paramWebView.getParcelable("KSnsAdTag");
          if ((paramWebView != null) && ((paramWebView instanceof SnsAdClick)))
          {
            WebViewUI.this.ulI.cYg().pmI = ((SnsAdClick)paramWebView);
            WebViewUI.this.ulI.cYg().L(new String[] { paramString, "0", System.currentTimeMillis() });
            WebViewUI.this.ulI.cYg().b(WebViewUI.this.icy);
          }
        }
        WebViewUI.E(WebViewUI.this);
        if ((WebViewUI.F(WebViewUI.this) != null) && (!WebViewUI.F(WebViewUI.this).uxW))
        {
          paramWebView = WebViewUI.F(WebViewUI.this);
          ab.i("MicroMsg.WebViewUIStyleHelper", "onWebViewPageStart, url:%s", new Object[] { paramString });
          paramWebView.iCz = paramString;
          paramWebView.daR();
        }
        AppMethodBeat.o(7934);
        break;
        WebViewUI.this.uwn = true;
        WebViewUI.this.uuX.finish();
        WebViewUI.this.pzf.evaluateJavascript("javascript:(function(){ window.isWeixinCached=true; })()", null);
        if (WebViewUI.this.uhz == null)
          break label581;
        WebViewUI.this.uhz.z((String)WebViewUI.C(WebViewUI.this).get(paramString), (Map)WebViewUI.D(WebViewUI.this).get(paramString));
        break label581;
        label1001: if (!paramWebView.unv.containsKey(paramString))
          paramWebView.unv.put(paramString, Long.valueOf(bo.anU()));
      }
    }

    public com.tencent.xweb.o c(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(7940);
      ab.i("MicroMsg.WebViewUI", "shouldInterceptRequest, url = %s", new Object[] { paramString });
      if (afU(paramString))
      {
        paramWebView = null;
        AppMethodBeat.o(7940);
      }
      while (true)
      {
        return paramWebView;
        paramWebView = afV(paramString);
        AppMethodBeat.o(7940);
      }
    }

    public final void h(WebView paramWebView, String paramString)
    {
      AppMethodBeat.i(7939);
      ab.i("MicroMsg.WebViewUI", "edw onLoadResource opt, url = ".concat(String.valueOf(paramString)));
      if (!WebViewUI.c(WebViewUI.this, paramString))
      {
        ab.f("MicroMsg.WebViewUI", "onLoadResource, canLoadUrl fail, url = ".concat(String.valueOf(paramString)));
        super.h(paramWebView, paramString);
        WebViewUI.k(WebViewUI.this);
        AppMethodBeat.o(7939);
        return;
      }
      aq.f localf = WebViewUI.this.ulI.cXW();
      if (bo.isNullOrNil(paramString))
        ab.e("MicroMsg.WebviewReporter", "WebViewRenderReporter.onLoadResource failed, url is null");
      while (true)
      {
        super.h(paramWebView, paramString);
        AppMethodBeat.o(7939);
        break;
        if ((!bo.isNullOrNil(localf.iCz)) && (!paramString.equals(localf.iCz)) && (localf.unh))
        {
          if (localf.unf.containsKey(localf.iCz))
          {
            long l1 = ((Long)localf.unf.get(localf.iCz)).longValue();
            long l2 = bo.anU();
            localf.unf.put(localf.iCz, Long.valueOf(l2 - l1));
          }
          localf.unh = false;
        }
      }
    }
  }

  final class n
    implements com.tencent.mm.plugin.webview.ui.tools.jsapi.b
  {
    private n()
    {
    }

    public final boolean afM(String paramString)
    {
      AppMethodBeat.i(7959);
      if (!bo.isNullOrNil(paramString))
      {
        paramString = paramString.substring(17);
        ab.i("MicroMsg.WebViewUI", "[oneliang]get html content :".concat(String.valueOf(paramString)));
        WebViewUI.this.afG(paramString);
      }
      AppMethodBeat.o(7959);
      return false;
    }

    public final boolean afS(String paramString)
    {
      AppMethodBeat.i(7958);
      boolean bool;
      if (bo.isNullOrNil(paramString))
      {
        bool = false;
        AppMethodBeat.o(7958);
      }
      while (true)
      {
        return bool;
        bool = com.tencent.mm.pluginsdk.ui.tools.u.t(paramString, "weixin://gethtml/");
        AppMethodBeat.o(7958);
      }
    }
  }

  protected final class q
  {
    int uxP = 0;

    protected q()
    {
    }

    public final boolean daP()
    {
      if (this.uxP > 0);
      for (boolean bool = true; ; bool = false)
        return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.WebViewUI
 * JD-Core Version:    0.6.2
 */