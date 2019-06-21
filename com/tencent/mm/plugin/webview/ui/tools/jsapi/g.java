package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.Activity;
import android.app.ProgressDialog;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ImageView;
import android.widget.Toast;
import com.facebook.device.yearclass.DeviceInfo;
import com.facebook.device.yearclass.YearClass;
import com.tencent.mars.smc.IDKey;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.w;
import com.tencent.mm.aj.d.b.b;
import com.tencent.mm.g.a.aq;
import com.tencent.mm.g.a.aq.a;
import com.tencent.mm.g.a.aq.b;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dh.b;
import com.tencent.mm.g.a.di;
import com.tencent.mm.g.a.di.b;
import com.tencent.mm.g.a.dl;
import com.tencent.mm.g.a.dl.b;
import com.tencent.mm.g.a.dm;
import com.tencent.mm.g.a.dm.b;
import com.tencent.mm.g.a.dn;
import com.tencent.mm.g.a.dn.b;
import com.tencent.mm.g.a.dp;
import com.tencent.mm.g.a.ds;
import com.tencent.mm.g.a.dy;
import com.tencent.mm.g.a.ee;
import com.tencent.mm.g.a.ef;
import com.tencent.mm.g.a.ef.a;
import com.tencent.mm.g.a.ef.b;
import com.tencent.mm.g.a.eh;
import com.tencent.mm.g.a.eh.b;
import com.tencent.mm.g.a.ei;
import com.tencent.mm.g.a.ei.b;
import com.tencent.mm.g.a.el;
import com.tencent.mm.g.a.el.b;
import com.tencent.mm.g.a.ev;
import com.tencent.mm.g.a.fn;
import com.tencent.mm.g.a.gu;
import com.tencent.mm.g.a.gu.b;
import com.tencent.mm.g.a.gw;
import com.tencent.mm.g.a.hc;
import com.tencent.mm.g.a.im;
import com.tencent.mm.g.a.mg;
import com.tencent.mm.g.a.nd;
import com.tencent.mm.g.a.of;
import com.tencent.mm.g.a.on;
import com.tencent.mm.g.a.op;
import com.tencent.mm.g.a.op.b;
import com.tencent.mm.g.a.py;
import com.tencent.mm.g.a.py.a;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.g.a.qh;
import com.tencent.mm.g.a.rh;
import com.tencent.mm.g.a.se;
import com.tencent.mm.g.a.se.a;
import com.tencent.mm.g.a.se.b;
import com.tencent.mm.g.a.uk;
import com.tencent.mm.g.a.uk.b;
import com.tencent.mm.g.a.vd;
import com.tencent.mm.g.a.vo;
import com.tencent.mm.g.a.vv;
import com.tencent.mm.g.a.vw;
import com.tencent.mm.graphics.MMBitmapFactory;
import com.tencent.mm.model.ao.a;
import com.tencent.mm.model.ao.b;
import com.tencent.mm.model.av;
import com.tencent.mm.model.ax;
import com.tencent.mm.model.bf;
import com.tencent.mm.model.bn;
import com.tencent.mm.model.v.b;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.websearch.api.WidgetData;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.webview.b.e.1;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.mm.plugin.webview.model.ac;
import com.tencent.mm.plugin.webview.model.ae;
import com.tencent.mm.plugin.webview.model.af.a;
import com.tencent.mm.plugin.webview.model.aj;
import com.tencent.mm.plugin.webview.model.am;
import com.tencent.mm.plugin.webview.model.ao;
import com.tencent.mm.plugin.webview.model.ar;
import com.tencent.mm.plugin.webview.model.f.a;
import com.tencent.mm.plugin.webview.modelcache.r.a;
import com.tencent.mm.plugin.webview.stub.WebViewStubTempUI;
import com.tencent.mm.plugin.webview.ui.tools.game.e.b;
import com.tencent.mm.pluginsdk.ui.applet.t.a;
import com.tencent.mm.pluginsdk.ui.tools.u;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.g;
import com.tencent.mm.protocal.c.me;
import com.tencent.mm.protocal.protobuf.atz;
import com.tencent.mm.protocal.protobuf.aua;
import com.tencent.mm.protocal.protobuf.avj;
import com.tencent.mm.protocal.protobuf.avk;
import com.tencent.mm.protocal.protobuf.axc;
import com.tencent.mm.protocal.protobuf.bfk;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.ciw;
import com.tencent.mm.protocal.protobuf.cix;
import com.tencent.mm.protocal.protobuf.cso;
import com.tencent.mm.protocal.protobuf.csp;
import com.tencent.mm.protocal.protobuf.csq;
import com.tencent.mm.protocal.protobuf.csr;
import com.tencent.mm.protocal.protobuf.cvf;
import com.tencent.mm.protocal.protobuf.li;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi;
import com.tencent.mm.storage.bq;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.widget.a.e.c;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import com.tencent.wework.api.model.WWMediaLink;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class g
  implements MMActivity.a
{
  private static final char[] iRk;
  private static final String[] iRl;
  private static final HashSet<String> uGK;
  private static final LinkedList<Runnable> uGS;
  private static boolean uGT;
  private static g.a uGU;
  private WXMediaMessage cEl;
  public final int cIv;
  private Context context;
  public boolean eBB;
  private com.tencent.mm.modelgeo.d ecr;
  private Map<String, atz> ecv;
  public ProgressDialog ehJ;
  public com.tencent.mm.sdk.b.c hwv;
  private String jMp;
  private com.tencent.mm.sdk.platformtools.ak mzp;
  private ProgressDialog nBv;
  private boolean nPX;
  private float qfA;
  public com.tencent.mm.sdk.b.c qwg;
  public com.tencent.mm.sdk.b.c qwh;
  private Map<String, String> uGA;
  private Map<String, List<aua>> uGB;
  private List<atz> uGC;
  private boolean uGD;
  private long uGE;
  private WeakReference<com.tencent.mm.plugin.webview.stub.e> uGF;
  private String uGG;
  private String uGH;
  private boolean uGI;
  private SensorEventListener uGJ;
  private com.tencent.mm.modelgeo.b.b uGL;
  public i uGM;
  public com.tencent.mm.sdk.b.c uGN;
  public final Map<String, g.b> uGO;
  public String uGP;
  public com.tencent.mm.sdk.b.c uGQ;
  public final List<String> uGR;
  public final Map<Integer, g.c> uGV;
  private int uGW;
  private int uGX;
  public com.tencent.mm.sdk.b.c uGY;
  public volatile i uGZ;
  public i uGd;
  public i uGe;
  public HashSet<String> uGf;
  public HashSet<String> uGg;
  public Bundle uGh;
  private String uGi;
  public HashMap<String, String> uGj;
  public HashMap<String, String> uGk;
  public String uGl;
  public boolean uGm;
  public String uGn;
  public boolean uGo;
  public com.tencent.mm.plugin.webview.stub.e uGp;
  private com.tencent.mm.plugin.webview.stub.e uGq;
  public c uGr;
  public boolean uGs;
  private final j uGt;
  private final com.tencent.mm.plugin.webview.modeltools.e uGu;
  public final com.tencent.mm.plugin.webview.modeltools.l uGv;
  public com.tencent.mm.plugin.webview.e.c uGw;
  private long uGx;
  private int uGy;
  private int uGz;
  public final com.tencent.mm.sdk.b.c uHa;
  public com.tencent.mm.plugin.webview.stub.e umI;

  static
  {
    AppMethodBeat.i(9805);
    iRk = new char[] { 60, 62, 34, 39, 38, 32, 39 };
    iRl = new String[] { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&nbsp;", "&#39;" };
    HashSet localHashSet = new HashSet();
    uGK = localHashSet;
    localHashSet.add("gcj02");
    uGK.add("wgs84");
    uGS = new LinkedList();
    uGT = false;
    uGU = new g.6();
    AppMethodBeat.o(9805);
  }

  g(int paramInt)
  {
    AppMethodBeat.i(9215);
    this.ehJ = null;
    this.jMp = null;
    this.uGi = null;
    this.uGj = null;
    this.uGk = null;
    this.uGl = null;
    this.uGm = false;
    this.eBB = false;
    this.uGn = null;
    this.uGo = false;
    this.uGr = null;
    this.uGs = false;
    this.uGx = 0L;
    this.uGz = -1;
    this.uGA = new ConcurrentHashMap();
    this.ecv = new ConcurrentHashMap();
    this.uGB = new ConcurrentHashMap();
    this.uGC = new CopyOnWriteArrayList();
    this.uGD = false;
    this.uGE = 0L;
    this.qwg = new g.50(this);
    this.qwh = new g.51(this);
    this.uGG = "-1000.0";
    this.uGH = "-1000.0";
    this.uGI = false;
    this.qfA = 0.0F;
    this.uGJ = new g.52(this);
    this.ecr = null;
    this.uGL = null;
    this.uGN = new g.77(this);
    this.uGO = new HashMap();
    this.uGQ = new g.104(this);
    this.uGR = new LinkedList();
    this.uGV = new HashMap();
    this.uGW = 0;
    this.uGX = 1000;
    this.uGZ = null;
    this.uHa = new g.36(this);
    this.cIv = paramInt;
    this.eBB = false;
    this.uGf = new HashSet();
    this.uGg = new HashSet();
    this.uGr = new c(this.cIv);
    this.uGt = new j();
    this.uGu = new com.tencent.mm.plugin.webview.modeltools.e();
    this.uGv = new com.tencent.mm.plugin.webview.modeltools.l();
    this.uGw = new com.tencent.mm.plugin.webview.e.c();
    AppMethodBeat.o(9215);
  }

  private boolean A(i parami)
  {
    AppMethodBeat.i(9263);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doOpenProductView");
    String str1 = (String)parami.puc.get("productInfo");
    String str2 = (String)parami.puc.get("url");
    parami = Integer.valueOf(0);
    try
    {
      Object localObject = new org/json/JSONObject;
      ((JSONObject)localObject).<init>(str1);
      int i = ((JSONObject)localObject).getInt("product_type");
      parami = Integer.valueOf(i);
      localObject = new Intent();
      ((Intent)localObject).putExtra("key_product_info", str1);
      ((Intent)localObject).putExtra("key_source_url", str2);
      boolean bool = a(parami, 3, 0, null, (Intent)localObject);
      AppMethodBeat.o(9263);
      return bool;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
    }
  }

  private boolean B(i parami)
  {
    AppMethodBeat.i(9269);
    l.a(parami.uII, agw("sendEmail"), null, null);
    String str = (String)parami.puc.get("title");
    Object localObject1 = "";
    try
    {
      Object localObject2 = ar.aek(this.umI.getCurrentUrl());
      localObject1 = localObject2;
      localObject2 = new Intent();
      ((Intent)localObject2).putExtra("composeType", 1);
      ((Intent)localObject2).putExtra("subject", str);
      ((Intent)localObject2).putExtra("mail_content", (String)localObject1);
      com.tencent.mm.bp.d.c(this.context, "qqmail", ".ui.ComposeUI", (Intent)localObject2);
      a(parami, "send_email:ok", null);
      AppMethodBeat.o(9269);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
    }
  }

  private boolean C(i parami)
  {
    AppMethodBeat.i(9270);
    com.tencent.mm.plugin.report.service.h.pYm.a(157L, 27L, 1L, false);
    String str1 = (String)parami.puc.get("task_name");
    String str2 = (String)parami.puc.get("task_url");
    Object localObject1 = (String)parami.puc.get("alternative_url");
    long l = bo.getLong((String)parami.puc.get("task_size"), 0L);
    String str3 = (String)parami.puc.get("file_md5");
    String str4 = (String)parami.puc.get("extInfo");
    String str5 = (String)parami.puc.get("fileType");
    String str6 = (String)parami.puc.get("appid");
    String str7 = (String)parami.puc.get("package_name");
    int i = bo.getInt((String)parami.puc.get("scene"), 1000);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doAddDownloadTaskStraight, md5 = " + str3 + ", url = " + str2 + ", extinfo = " + str4 + ", fileType = " + str5 + ", reportScene = " + i);
    int j;
    Object localObject2;
    if (this.uGh != null)
    {
      j = this.uGh.getInt("key_download_restrict", 0);
      localObject2 = this.uGh.getString("key_function_id", "");
      if (!bo.isNullOrNil((String)localObject2))
        com.tencent.mm.plugin.report.service.h.pYm.e(14596, new Object[] { localObject2, Integer.valueOf(j), Integer.valueOf(0) });
      if (j == 1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "not allow to download file");
        a(parami, "add_download_task_straight:fail", null);
        AppMethodBeat.o(9270);
      }
    }
    while (true)
    {
      return true;
      if (!bo.isNullOrNil(str2))
        break;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doAddDownloadTaskStraight fail, url is null");
      a(parami, "add_download_task_straight:fail_invalid_url", null);
      u(str6, com.tencent.mm.plugin.downloader.a.a.DOWNLOAD_ERR_URL_INVALID, str4);
      AppMethodBeat.o(9270);
    }
    if (bo.nullAsNil(str6).startsWith("wx"))
    {
      j = bo.getInt((String)parami.puc.get("downloader_type"), 1);
      label452: localObject2 = new gw();
      ((gw)localObject2).cBC.url = str2;
      ((gw)localObject2).cBC.cvZ = str3;
      ((gw)localObject2).cBC.extInfo = str4;
      ((gw)localObject2).cBC.appId = str6;
      ((gw)localObject2).cBC.scene = i;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
      localObject2 = new com.tencent.mm.plugin.downloader.model.e.a();
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).It(str2);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).Iu((String)localObject1);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).hA(l);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).Iv(str1);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).Iw(str3);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).setAppId(str6);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).cY(str7);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).ga(true);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).tN(bo.getInt(str5, 1));
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).setScene(i);
      ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).Ix(str4);
      localObject1 = ((com.tencent.mm.plugin.downloader.model.e.a)localObject2).kNl;
      if (j != 1)
        break label724;
      l = com.tencent.mm.plugin.downloader.model.d.bij().b((com.tencent.mm.plugin.downloader.model.e)localObject1);
      label629: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doAddDownloadTaskStraight, downloadId = ".concat(String.valueOf(l)));
      com.tencent.mm.modelstat.d.b(10, "MsgHandler_doAddDownloadTaskStraight", hashCode());
      if (l > 0L)
        break label737;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doAddDownloadTaskStraight fail, downloadId = ".concat(String.valueOf(l)));
      a(parami, "add_download_task_straight:fail", null);
    }
    while (true)
    {
      AppMethodBeat.o(9270);
      break;
      j = bo.getInt((String)parami.puc.get("downloader_type"), 0);
      break label452;
      label724: l = com.tencent.mm.plugin.downloader.model.d.bij().a((com.tencent.mm.plugin.downloader.model.e)localObject1);
      break label629;
      label737: localObject1 = new HashMap();
      ((Map)localObject1).put("download_id", Long.valueOf(l));
      a(parami, "add_download_task_straight:ok", (Map)localObject1);
    }
  }

  private boolean D(i parami)
  {
    AppMethodBeat.i(9272);
    long l = bo.getLong((String)parami.puc.get("download_id"), -1L);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doResumeDownloadTask, downloadId = ".concat(String.valueOf(l)));
    if (l <= 0L)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doResumeDownloadTask fail, invalid downloadId = ".concat(String.valueOf(l)));
      a(parami, "resume_download_task:fail", null);
      AppMethodBeat.o(9272);
      return true;
    }
    com.tencent.mm.plugin.downloader.f.a locala = com.tencent.mm.plugin.downloader.model.c.hv(l);
    if ((locala != null) && (locala.field_fromDownloadApp))
    {
      locala.field_fromDownloadApp = false;
      locala.field_showNotification = true;
      com.tencent.mm.plugin.downloader.model.c.e(locala);
      ((com.tencent.mm.plugin.downloader_app.a.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.downloader_app.a.d.class)).kP(locala.field_appId);
    }
    boolean bool = com.tencent.mm.plugin.downloader.model.d.bij().ho(l);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doResumeDownloadTask, ret = ".concat(String.valueOf(bool)));
    com.tencent.mm.modelstat.d.b(10, "MsgHandler_doResumeDownloadTask", hashCode());
    if (!bool)
      a(parami, "resume_download_task:fail", null);
    while (true)
    {
      AppMethodBeat.o(9272);
      break;
      a(parami, "resume_download_task:ok", null);
    }
  }

  // ERROR //
  private boolean E(i parami)
  {
    // Byte code:
    //   0: sipush 9274
    //   3: invokestatic 155	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 635	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:uGh	Landroid/os/Bundle;
    //   10: ifnull +98 -> 108
    //   13: aload_0
    //   14: getfield 635	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:uGh	Landroid/os/Bundle;
    //   17: ldc_w 637
    //   20: iconst_0
    //   21: invokevirtual 640	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   24: istore_2
    //   25: aload_0
    //   26: getfield 635	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:uGh	Landroid/os/Bundle;
    //   29: ldc_w 642
    //   32: ldc_w 419
    //   35: invokevirtual 646	android/os/Bundle:getString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   38: astore_3
    //   39: aload_3
    //   40: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   43: ifne +34 -> 77
    //   46: getstatic 585	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   49: sipush 14596
    //   52: iconst_3
    //   53: anewarray 4	java/lang/Object
    //   56: dup
    //   57: iconst_0
    //   58: aload_3
    //   59: aastore
    //   60: dup
    //   61: iconst_1
    //   62: iload_2
    //   63: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: aastore
    //   67: dup
    //   68: iconst_2
    //   69: iconst_1
    //   70: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   73: aastore
    //   74: invokevirtual 649	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   77: iload_2
    //   78: iconst_1
    //   79: if_icmpne +29 -> 108
    //   82: ldc_w 363
    //   85: ldc_w 853
    //   88: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   91: aload_0
    //   92: aload_1
    //   93: ldc_w 855
    //   96: aconst_null
    //   97: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   100: sipush 9274
    //   103: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   106: iconst_1
    //   107: ireturn
    //   108: aload_1
    //   109: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   112: ldc_w 857
    //   115: invokeinterface 383 2 0
    //   120: checkcast 165	java/lang/String
    //   123: astore 4
    //   125: aload_1
    //   126: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   129: ldc_w 859
    //   132: invokeinterface 383 2 0
    //   137: checkcast 165	java/lang/String
    //   140: astore 5
    //   142: invokestatic 863	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   145: aload_0
    //   146: getfield 239	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:uGx	J
    //   149: lsub
    //   150: lstore 6
    //   152: ldc_w 363
    //   155: ldc_w 865
    //   158: iconst_1
    //   159: anewarray 4	java/lang/Object
    //   162: dup
    //   163: iconst_0
    //   164: lload 6
    //   166: invokestatic 787	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   169: aastore
    //   170: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   173: ldc_w 419
    //   176: astore 8
    //   178: aload 8
    //   180: astore_3
    //   181: lload 6
    //   183: ldc2_w 866
    //   186: lcmp
    //   187: ifge +231 -> 418
    //   190: aload 8
    //   192: astore_3
    //   193: aload_0
    //   194: getfield 239	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:uGx	J
    //   197: lconst_0
    //   198: lcmp
    //   199: ifle +219 -> 418
    //   202: aload 8
    //   204: astore_3
    //   205: aload_0
    //   206: getfield 472	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:umI	Lcom/tencent/mm/plugin/webview/stub/e;
    //   209: invokeinterface 478 1 0
    //   214: astore 9
    //   216: aload 8
    //   218: astore_3
    //   219: aload_0
    //   220: getfield 235	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:uGr	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/c;
    //   223: aload 9
    //   225: invokevirtual 870	com/tencent/mm/plugin/webview/ui/tools/jsapi/c:agj	(Ljava/lang/String;)Ljava/lang/String;
    //   228: astore 8
    //   230: aload 8
    //   232: astore_3
    //   233: aload 9
    //   235: ldc_w 872
    //   238: invokestatic 877	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   241: astore 9
    //   243: aload 8
    //   245: astore_3
    //   246: getstatic 585	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   249: sipush 13983
    //   252: iconst_3
    //   253: anewarray 4	java/lang/Object
    //   256: dup
    //   257: iconst_0
    //   258: iconst_5
    //   259: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   262: aastore
    //   263: dup
    //   264: iconst_1
    //   265: aload 9
    //   267: aastore
    //   268: dup
    //   269: iconst_2
    //   270: ldc_w 419
    //   273: aastore
    //   274: invokevirtual 649	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   277: aload 8
    //   279: astore_3
    //   280: aload 9
    //   282: astore 8
    //   284: aload_1
    //   285: getfield 434	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:uII	Ljava/util/Map;
    //   288: iconst_0
    //   289: aconst_null
    //   290: aload 5
    //   292: invokestatic 439	com/tencent/mm/plugin/webview/ui/tools/jsapi/l:a	(Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;)V
    //   295: aload 4
    //   297: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   300: ifne +149 -> 449
    //   303: aload 4
    //   305: iconst_0
    //   306: invokestatic 619	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   309: istore_2
    //   310: ldc_w 363
    //   313: ldc_w 879
    //   316: iconst_1
    //   317: anewarray 4	java/lang/Object
    //   320: dup
    //   321: iconst_0
    //   322: aload 4
    //   324: aastore
    //   325: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   328: iload_2
    //   329: ifne +288 -> 617
    //   332: aload_1
    //   333: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   336: ldc_w 608
    //   339: invokeinterface 383 2 0
    //   344: checkcast 165	java/lang/String
    //   347: astore 8
    //   349: ldc_w 363
    //   352: ldc_w 881
    //   355: iconst_2
    //   356: anewarray 4	java/lang/Object
    //   359: dup
    //   360: iconst_0
    //   361: aload 5
    //   363: aastore
    //   364: dup
    //   365: iconst_1
    //   366: aload 8
    //   368: aastore
    //   369: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   372: aload 5
    //   374: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   377: ifeq +77 -> 454
    //   380: ldc_w 363
    //   383: ldc_w 883
    //   386: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   389: aload_0
    //   390: aload_1
    //   391: ldc_w 855
    //   394: aconst_null
    //   395: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   398: sipush 9274
    //   401: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   404: goto -298 -> 106
    //   407: astore 8
    //   409: ldc_w 363
    //   412: ldc_w 885
    //   415: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   418: ldc_w 419
    //   421: astore 8
    //   423: goto -139 -> 284
    //   426: astore 9
    //   428: ldc_w 363
    //   431: ldc_w 887
    //   434: iconst_1
    //   435: anewarray 4	java/lang/Object
    //   438: dup
    //   439: iconst_0
    //   440: aload 9
    //   442: invokevirtual 890	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   445: aastore
    //   446: invokestatic 892	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   449: iconst_0
    //   450: istore_2
    //   451: goto -141 -> 310
    //   454: getstatic 898	com/tencent/mm/plugin/webview/a/a:gkF	Lcom/tencent/mm/pluginsdk/m;
    //   457: invokestatic 902	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   460: aload 5
    //   462: invokeinterface 907 3 0
    //   467: ifne +39 -> 506
    //   470: ldc_w 363
    //   473: ldc_w 909
    //   476: iconst_1
    //   477: anewarray 4	java/lang/Object
    //   480: dup
    //   481: iconst_0
    //   482: aload 5
    //   484: aastore
    //   485: invokestatic 892	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   488: aload_0
    //   489: aload_1
    //   490: ldc_w 855
    //   493: aconst_null
    //   494: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   497: sipush 9274
    //   500: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   503: goto -397 -> 106
    //   506: new 911	com/tencent/mm/opensdk/modelmsg/WXAppExtendObject
    //   509: dup
    //   510: invokespecial 912	com/tencent/mm/opensdk/modelmsg/WXAppExtendObject:<init>	()V
    //   513: astore_3
    //   514: aload_3
    //   515: aload 8
    //   517: putfield 913	com/tencent/mm/opensdk/modelmsg/WXAppExtendObject:extInfo	Ljava/lang/String;
    //   520: new 915	com/tencent/mm/opensdk/modelmsg/WXMediaMessage
    //   523: dup
    //   524: aload_3
    //   525: invokespecial 918	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:<init>	(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;)V
    //   528: astore_3
    //   529: aload_3
    //   530: ldc_w 919
    //   533: putfield 922	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:sdkVer	I
    //   536: aload_3
    //   537: aload 8
    //   539: putfield 925	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:messageExt	Ljava/lang/String;
    //   542: new 927	com/tencent/mm/g/a/jc
    //   545: dup
    //   546: invokespecial 928	com/tencent/mm/g/a/jc:<init>	()V
    //   549: astore 8
    //   551: aload 8
    //   553: getfield 932	com/tencent/mm/g/a/jc:cEj	Lcom/tencent/mm/g/a/jc$a;
    //   556: aload_3
    //   557: putfield 936	com/tencent/mm/g/a/jc$a:cEl	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   560: aload 8
    //   562: getfield 932	com/tencent/mm/g/a/jc:cEj	Lcom/tencent/mm/g/a/jc$a;
    //   565: aload 5
    //   567: putfield 937	com/tencent/mm/g/a/jc$a:appId	Ljava/lang/String;
    //   570: aload 8
    //   572: getfield 932	com/tencent/mm/g/a/jc:cEj	Lcom/tencent/mm/g/a/jc$a;
    //   575: aload_0
    //   576: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   579: putfield 938	com/tencent/mm/g/a/jc$a:context	Landroid/content/Context;
    //   582: aload 8
    //   584: getfield 932	com/tencent/mm/g/a/jc:cEj	Lcom/tencent/mm/g/a/jc$a;
    //   587: new 940	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$67
    //   590: dup
    //   591: aload_0
    //   592: aload_1
    //   593: invokespecial 943	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$67:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/g;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;)V
    //   596: putfield 947	com/tencent/mm/g/a/jc$a:cEm	Lcom/tencent/mm/pluginsdk/model/app/aj;
    //   599: getstatic 702	com/tencent/mm/sdk/b/a:xxA	Lcom/tencent/mm/sdk/b/a;
    //   602: aload 8
    //   604: invokevirtual 706	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   607: pop
    //   608: sipush 9274
    //   611: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   614: goto -508 -> 106
    //   617: iload_2
    //   618: iconst_1
    //   619: if_icmpne +398 -> 1017
    //   622: aload_1
    //   623: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   626: ldc_w 949
    //   629: invokeinterface 383 2 0
    //   634: checkcast 165	java/lang/String
    //   637: astore 5
    //   639: aload_1
    //   640: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   643: ldc_w 510
    //   646: invokeinterface 383 2 0
    //   651: checkcast 165	java/lang/String
    //   654: astore 4
    //   656: aload_1
    //   657: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   660: ldc_w 951
    //   663: invokeinterface 383 2 0
    //   668: checkcast 165	java/lang/String
    //   671: astore 9
    //   673: ldc_w 363
    //   676: ldc_w 953
    //   679: iconst_3
    //   680: anewarray 4	java/lang/Object
    //   683: dup
    //   684: iconst_0
    //   685: aload 5
    //   687: aastore
    //   688: dup
    //   689: iconst_1
    //   690: aload 4
    //   692: aastore
    //   693: dup
    //   694: iconst_2
    //   695: aload 9
    //   697: aastore
    //   698: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   701: aload 5
    //   703: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   706: ifne +11 -> 717
    //   709: aload 4
    //   711: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   714: ifeq +30 -> 744
    //   717: ldc_w 363
    //   720: ldc_w 955
    //   723: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   726: aload_0
    //   727: aload_1
    //   728: ldc_w 957
    //   731: aconst_null
    //   732: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   735: sipush 9274
    //   738: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   741: goto -635 -> 106
    //   744: aload_0
    //   745: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   748: aload 4
    //   750: invokestatic 960	com/tencent/mm/pluginsdk/model/app/p:u	(Landroid/content/Context;Ljava/lang/String;)Z
    //   753: ifne +30 -> 783
    //   756: ldc_w 363
    //   759: ldc_w 962
    //   762: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   765: aload_0
    //   766: aload_1
    //   767: ldc_w 964
    //   770: aconst_null
    //   771: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   774: sipush 9274
    //   777: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   780: goto -674 -> 106
    //   783: aload_0
    //   784: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   787: aload 4
    //   789: invokestatic 968	com/tencent/mm/pluginsdk/model/app/p:bx	(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;
    //   792: astore 10
    //   794: aload 10
    //   796: ifnull +194 -> 990
    //   799: aload 10
    //   801: iconst_0
    //   802: aaload
    //   803: ifnull +187 -> 990
    //   806: aload 10
    //   808: iconst_0
    //   809: aaload
    //   810: invokevirtual 974	android/content/pm/Signature:toByteArray	()[B
    //   813: invokestatic 980	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   816: astore 10
    //   818: aload 10
    //   820: ifnull +170 -> 990
    //   823: aload 10
    //   825: aload 5
    //   827: invokevirtual 983	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   830: ifeq +160 -> 990
    //   833: invokestatic 902	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   836: invokevirtual 987	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   839: aload 4
    //   841: invokevirtual 993	android/content/pm/PackageManager:getLaunchIntentForPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   844: astore 5
    //   846: aload 5
    //   848: ifnull +124 -> 972
    //   851: new 639	android/os/Bundle
    //   854: astore 4
    //   856: aload 4
    //   858: invokespecial 994	android/os/Bundle:<init>	()V
    //   861: aload 4
    //   863: aload 9
    //   865: invokestatic 998	com/tencent/mm/pluginsdk/model/app/p:j	(Landroid/os/Bundle;Ljava/lang/String;)V
    //   868: aload 5
    //   870: aload 4
    //   872: invokevirtual 1002	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   875: pop
    //   876: aload 5
    //   878: ldc_w 1003
    //   881: invokevirtual 1007	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   884: pop
    //   885: new 639	android/os/Bundle
    //   888: astore 9
    //   890: aload 9
    //   892: invokespecial 994	android/os/Bundle:<init>	()V
    //   895: aload 9
    //   897: ldc_w 1009
    //   900: aload 8
    //   902: invokevirtual 1011	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   905: aload 9
    //   907: ldc_w 1013
    //   910: aload_3
    //   911: invokevirtual 1011	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   914: aload_0
    //   915: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   918: astore 8
    //   920: new 1015	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$68
    //   923: astore_3
    //   924: aload_3
    //   925: aload_0
    //   926: aload_1
    //   927: invokespecial 1016	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$68:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/g;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;)V
    //   930: aload 8
    //   932: aload 5
    //   934: aconst_null
    //   935: aload_3
    //   936: aload 9
    //   938: invokestatic 1021	com/tencent/mm/pluginsdk/model/app/g:a	(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/model/app/aj;Landroid/os/Bundle;)Z
    //   941: pop
    //   942: sipush 9274
    //   945: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   948: goto -842 -> 106
    //   951: astore_3
    //   952: ldc_w 363
    //   955: ldc_w 1023
    //   958: iconst_1
    //   959: anewarray 4	java/lang/Object
    //   962: dup
    //   963: iconst_0
    //   964: aload_3
    //   965: invokevirtual 890	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   968: aastore
    //   969: invokestatic 892	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   972: aload_0
    //   973: aload_1
    //   974: ldc_w 855
    //   977: aconst_null
    //   978: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   981: sipush 9274
    //   984: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   987: goto -881 -> 106
    //   990: ldc_w 363
    //   993: ldc_w 1025
    //   996: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   999: aload_0
    //   1000: aload_1
    //   1001: ldc_w 1027
    //   1004: aconst_null
    //   1005: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   1008: sipush 9274
    //   1011: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1014: goto -908 -> 106
    //   1017: aload_0
    //   1018: aload_1
    //   1019: ldc_w 1029
    //   1022: aconst_null
    //   1023: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   1026: sipush 9274
    //   1029: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   1032: goto -926 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   205	216	407	java/lang/Exception
    //   219	230	407	java/lang/Exception
    //   233	243	407	java/lang/Exception
    //   246	277	407	java/lang/Exception
    //   303	310	426	java/lang/Exception
    //   833	846	951	java/lang/Exception
    //   851	942	951	java/lang/Exception
  }

  private static String Eh(String paramString)
  {
    AppMethodBeat.i(9230);
    StringBuffer localStringBuffer = new StringBuffer();
    int i = paramString.length();
    int j = 0;
    while (j < i)
    {
      for (int k = 0; k < iRk.length; k++)
      {
        String str = iRl[k];
        for (int m = 0; (m < str.length()) && (j + m < i) && (str.charAt(m) == paramString.charAt(j + m)); m++);
        if (m == str.length())
          break;
      }
      if (k != iRk.length)
      {
        localStringBuffer.append(iRk[k]);
        j = iRl[k].length() + j;
      }
      else
      {
        localStringBuffer.append(paramString.charAt(j));
        j++;
      }
    }
    paramString = localStringBuffer.toString();
    AppMethodBeat.o(9230);
    return paramString;
  }

  private boolean F(i parami)
  {
    AppMethodBeat.i(9275);
    Object localObject = (String)parami.puc.get("url");
    if (bo.isNullOrNil((String)localObject))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenUrlByExtBrowser fail, url is null");
      a(parami, "open_url_by_ext_browser:fail", null);
      AppMethodBeat.o(9275);
    }
    while (true)
    {
      return true;
      localObject = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject));
      ((Intent)localObject).addFlags(268435456);
      try
      {
        this.context.startActivity((Intent)localObject);
        a(parami, "open_url_by_ext_browser:ok", null);
        AppMethodBeat.o(9275);
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenUrlByExtBrowser fail, e = " + localException.getMessage());
          a(parami, "open_url_by_ext_browser:fail", null);
        }
      }
    }
  }

  private boolean G(i parami)
  {
    AppMethodBeat.i(9278);
    Object localObject = "";
    try
    {
      str = this.umI.getCurrentUrl();
      localObject = str;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "currentUrl %s", new Object[] { localObject });
      if ((((String)localObject).startsWith("https://support.weixin.qq.com/security/")) || (((String)localObject).startsWith("https://support.wechat.com/security/")) || (((String)localObject).startsWith("https://szsupport.weixin.qq.com/security/")) || (((String)localObject).startsWith("https://hksupport.weixin.qq.com/security/")) || (((String)localObject).startsWith("https://mlsupport.weixin.qq.com/security/")) || (((String)localObject).startsWith("https://weixin110.qq.com/security/")))
      {
        localObject = "";
        localHashMap = new HashMap();
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        try
        {
          HashMap localHashMap;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getDeviceInfo");
          String str = Base64.encodeToString(dcA(), 0);
          localObject = str;
          localHashMap.put("securityInfo", localObject);
          a(parami, "mmsf0001:ok", localHashMap);
          AppMethodBeat.o(9278);
          return true;
          localException1 = localException1;
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "JSOAUTH exception in get currentUrl" + localException1.getMessage());
        }
        catch (Exception localException2)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "device info get error %s", new Object[] { localException2.getMessage() });
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException2, "", new Object[0]);
          continue;
        }
        a(parami, "system:access_denied", null);
        AppMethodBeat.o(9278);
      }
    }
  }

  private boolean H(i parami)
  {
    Intent localIntent = null;
    AppMethodBeat.i(9279);
    String str1;
    String str2;
    if ((this.context instanceof MMActivity))
    {
      str1 = (String)parami.puc.get("tousername");
      str2 = (String)parami.puc.get("extmsg");
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "doJumpToBizProfile %s, %s", new Object[] { str1, str2 });
    }
    while (true)
    {
      try
      {
        parami = this.umI.getCurrentUrl();
        localIntent = new Intent();
        localIntent.putExtra("toUserName", str1);
        localIntent.putExtra("extInfo", str2);
        localIntent.putExtra("fromURL", parami);
        localIntent.putExtra("source", 2);
        com.tencent.mm.plugin.webview.a.a.gkE.a(localIntent, 8, this, (MMActivity)this.context);
        AppMethodBeat.o(9279);
        return true;
      }
      catch (RemoteException parami)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "JSOAUTH exception in get currentUrl" + parami.getMessage());
        parami = localIntent;
        continue;
      }
      a(parami, "jump_to_biz_profile:fail", null);
    }
  }

  private boolean I(i parami)
  {
    AppMethodBeat.i(9280);
    String str1 = (String)parami.puc.get("switch");
    String str2 = (String)parami.puc.get("title_cn");
    String str3 = (String)parami.puc.get("title_eng");
    String str4 = (String)parami.puc.get("ok_cn");
    String str5 = (String)parami.puc.get("ok_eng");
    String str6 = (String)parami.puc.get("cancel_cn");
    String str7 = (String)parami.puc.get("cancel_eng");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSetCloseWindowConfirmDialogInfo, switch value : %s, title_cn : %s, title_eng : %s, ok_cn : %s,  ok_eng : %s,  cancel_cn : %s,  cancel_eng : %s", new Object[] { str1, str2, str3, str4, str5, str6, str7 });
    Bundle localBundle = new Bundle();
    localBundle.putString("close_window_confirm_dialog_switch", str1);
    localBundle.putString("close_window_confirm_dialog_title_cn", str2);
    localBundle.putString("close_window_confirm_dialog_title_eng", str3);
    localBundle.putString("close_window_confirm_dialog_ok_cn", str4);
    localBundle.putString("close_window_confirm_dialog_ok_eng", str5);
    localBundle.putString("close_window_confirm_dialog_cancel_cn", str6);
    localBundle.putString("close_window_confirm_dialog_cancel_eng", str7);
    try
    {
      this.umI.c(13, localBundle);
      a(parami, "setCloseWindowConfirmDialogInfo:ok", null);
      AppMethodBeat.o(9280);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSetCloseWindowConfirmDialogInfo invoke callback failed : %s", new Object[] { localRemoteException.getMessage() });
    }
  }

  private static List<String> J(JSONArray paramJSONArray)
  {
    AppMethodBeat.i(9408);
    if ((paramJSONArray == null) || (paramJSONArray.length() <= 0))
    {
      paramJSONArray = new LinkedList();
      AppMethodBeat.o(9408);
    }
    while (true)
    {
      return paramJSONArray;
      LinkedList localLinkedList = new LinkedList();
      for (int i = 0; i < paramJSONArray.length(); i++)
        localLinkedList.add(paramJSONArray.optString(i));
      AppMethodBeat.o(9408);
      paramJSONArray = localLinkedList;
    }
  }

  private boolean J(i parami)
  {
    AppMethodBeat.i(9281);
    String str1 = (String)parami.puc.get("verifyAppId");
    String str2 = (String)parami.puc.get("verifySignature");
    String str3 = (String)parami.puc.get("verifyNonceStr");
    String str4 = (String)parami.puc.get("verifyTimestamp");
    String str5 = (String)parami.puc.get("verifySignType");
    Object localObject1 = (String)parami.puc.get("verifyJsApiList");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doPreVerifyJSAPI, appid : %s, %s, %s, %s, %s", new Object[] { str1, str2, str3, str4, str5 });
    l.a(parami.uII, false, null, str1);
    LinkedList localLinkedList = new LinkedList();
    try
    {
      localObject2 = new org/json/JSONArray;
      ((JSONArray)localObject2).<init>((String)localObject1);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doPreVerifyJSAPI jsItem length %s", new Object[] { Integer.valueOf(((JSONArray)localObject2).length()) });
      if (((JSONArray)localObject2).length() == 0)
      {
        a(parami, "checkJsApi:param is empty", null);
        AppMethodBeat.o(9281);
        return true;
      }
      for (i = 0; i < ((JSONArray)localObject2).length(); i++)
      {
        localObject1 = ((JSONArray)localObject2).getString(i);
        if (!bo.isNullOrNil((String)localObject1))
          localLinkedList.add(localObject1);
      }
      str6 = this.umI.getCurrentUrl();
      j = 0;
      localObject1 = "";
      localObject2 = localObject1;
      i = j;
    }
    catch (Exception localException1)
    {
      try
      {
        localObject3 = this.umI.g(140, null);
        Object localObject2 = localObject1;
        i = j;
        int j = ((Bundle)localObject3).getInt("key_webview_preverify_info_scene", 0);
        localObject2 = localObject1;
        i = j;
        localObject1 = ((Bundle)localObject3).getString("key_webview_preverify_info_source_appid", "");
        localObject2 = localObject1;
        i = j;
        ((Bundle)localObject3).getString("raw_url", "");
        localObject2 = localObject1;
        i = j;
      }
      catch (Exception localException1)
      {
        try
        {
          int i;
          String str6;
          label376: this.umI.g(252, null);
          label390: Object localObject3 = this.umI;
          localObject1 = this.uGr;
          parami = new g.72(this, str6, (com.tencent.mm.plugin.webview.stub.e)localObject3, parami);
          if ((bo.isNullOrNil(str1)) || (localLinkedList.size() <= 0))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.webview.JSVerifyHelper", "handlePreVerify wrong args, %s", new Object[] { str1 });
            parami.a(c.a.a.uFh, null, null, 0, 0);
          }
          while (true)
          {
            AppMethodBeat.o(9281);
            break;
            localException3 = localException3;
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "exception occur " + localException3.getMessage());
            a(parami, "pre_verify_jsapi:fail", null);
            AppMethodBeat.o(9281);
            break;
            localException1 = localException1;
            com.tencent.mm.sdk.platformtools.ab.e("TAG", "doPreVerifyJSAPI: %s", new Object[] { localException1 });
            break label376;
            com.tencent.mm.kernel.g.Rg().a(1093, localException1);
            parami = new com.tencent.mm.plugin.webview.model.r(parami, str6, str1, localLinkedList, str4, str3, str2, str5, i, localException3, localException1.ulX);
            com.tencent.mm.kernel.g.Rg().a(parami, 0);
          }
        }
        catch (Exception localException2)
        {
          break label390;
        }
      }
    }
  }

  private g.c JN(int paramInt)
  {
    AppMethodBeat.i(9388);
    g.c localc = (g.c)this.uGV.get(Integer.valueOf(paramInt));
    AppMethodBeat.o(9388);
    return localc;
  }

  private void JO(int paramInt)
  {
    AppMethodBeat.i(9389);
    g.c localc = (g.c)this.uGV.remove(Integer.valueOf(paramInt));
    if (localc != null)
    {
      localc.uGd = null;
      localc.umI = null;
    }
    AppMethodBeat.o(9389);
  }

  private boolean K(i parami)
  {
    AppMethodBeat.i(9282);
    HashMap localHashMap = new HashMap();
    try
    {
      dl localdl = new com/tencent/mm/g/a/dl;
      localdl.<init>();
      localdl.cwJ.cwA = true;
      com.tencent.mm.sdk.b.a.xxA.m(localdl);
      if (localdl.cwK.cwB)
      {
        localHashMap.put("currentSSID", localdl.cwK.cwL);
        a(parami, "getCurrentSSID:ok", localHashMap);
      }
      while (true)
      {
        AppMethodBeat.o(9282);
        return true;
        localHashMap.put("err_desc", "not on wifi");
        a(parami, "getCurrentSSID:fail", localHashMap);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "getCurrentSSID:fail");
        localHashMap.put("err_desc", "not on wifi");
        a(parami, "getCurrentSSID:fail", localHashMap);
        AppMethodBeat.o(9282);
      }
    }
  }

  public static boolean Ke(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(9222);
    if (!bo.isNullOrNil(paramString))
    {
      paramString = com.tencent.mm.aj.f.qX(paramString);
      if (paramString != null)
      {
        paramString = paramString.cJ(false);
        if ((paramString != null) && (paramString.aej() != null) && (paramString.aej().aes()))
        {
          bool = true;
          AppMethodBeat.o(9222);
        }
      }
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(9222);
    }
  }

  private boolean L(i parami)
  {
    AppMethodBeat.i(9283);
    int i = cZr();
    int j = bFf();
    Object localObject1 = dcB();
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "Key Scene(%d)", new Object[] { Integer.valueOf(j) });
    Object localObject3;
    if (j == 27)
    {
      this.uGi = ((String)parami.puc.get("brandUserName"));
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "BrandUserName from shake(%s)", new Object[] { this.uGi });
      localObject3 = V(parami);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "srcUsername(%s)", new Object[] { localObject3 });
      if (bo.isNullOrNil((String)localObject3))
      {
        a(parami, "openWXDeviceLib:fail_UsernameError", null);
        AppMethodBeat.o(9283);
      }
    }
    else
    {
      while (true)
      {
        return true;
        if ((i == 8) || (i == -1))
          break;
        this.jMp = ((String)parami.puc.get("brandUserName"));
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "BrandUserName from H5(%s)", new Object[] { this.jMp });
        if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil(this.jMp)))
          break;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "Chat name(%s)", new Object[] { localObject1 });
        localObject3 = com.tencent.mm.aj.f.qX((String)localObject1);
        if (localObject3 == null)
          break;
        localObject3 = ((com.tencent.mm.aj.d)localObject3).cJ(false);
        if ((localObject3 == null) || (((com.tencent.mm.aj.d.b)localObject3).aej() == null) || (!((com.tencent.mm.aj.d.b)localObject3).aej().aes()) || (((String)localObject1).equals(this.jMp)))
          break;
        a(parami, "openWXDeviceLib:fail_UsernameError", null);
        AppMethodBeat.o(9283);
      }
    }
    com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(localObject3), "openWXDeviceLib" });
    localObject1 = "";
    if (parami.puc.containsKey("connType"))
      localObject1 = (String)parami.puc.get("connType");
    Object localObject4;
    Object localObject5;
    label688: Object localObject2;
    if (((String)localObject1).equalsIgnoreCase("lan"))
    {
      if (this.uGk == null)
        this.uGk = new HashMap();
      while (true)
      {
        try
        {
          localObject1 = com.tencent.mm.plugin.webview.ui.tools.a.a.dbo();
          localObject4 = this.umI;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.webview.WebViewExDeviceLanMgr", "tryInit");
          if (((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).uzY == null)
          {
            localObject5 = new com/tencent/mm/plugin/webview/ui/tools/a/a$a;
            ((com.tencent.mm.plugin.webview.ui.tools.a.a.a)localObject5).<init>((com.tencent.mm.plugin.webview.stub.e)localObject4, (String)localObject3);
            ((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).uzY = ((com.tencent.mm.plugin.webview.ui.tools.a.a.a)localObject5);
            com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).uzY.uAd);
            com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).uzY.uAe);
            com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).uzY.uAg);
            com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).uzY.uAf);
            com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).uzY.uAh);
          }
          localObject5 = new com/tencent/mm/g/a/ee;
          ((ee)localObject5).<init>();
          ((ee)localObject5).cxF.cwA = true;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
          ((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).hasInit = true;
          ((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).cwz = ((String)localObject3);
          ((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).uAa = null;
          com.tencent.mm.pluginsdk.ui.tools.t.a(com.tencent.mm.plugin.webview.ui.tools.a.a.dbo());
          if (!com.tencent.mm.sdk.platformtools.at.isWifi(this.context))
            break label688;
          localObject1 = "on";
          localObject3 = new HashMap();
          ((HashMap)localObject3).put("minVersion", Integer.valueOf(1));
          ((HashMap)localObject3).put("maxVersion", Integer.valueOf(1));
          ((HashMap)localObject3).put("lanState", localObject1);
          a(parami, "openWXDeviceLib:ok", (Map)localObject3);
          AppMethodBeat.o(9283);
        }
        catch (Exception localException1)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "openWXDeviceLib failed : %s", new Object[] { localException1.getMessage() });
          a(parami, "openWXDeviceLib:fail_exception", null);
          AppMethodBeat.o(9283);
        }
        break;
        localObject2 = "off";
      }
    }
    if (this.uGj == null)
      this.uGj = new HashMap();
    while (true)
    {
      try
      {
        localObject2 = com.tencent.mm.plugin.webview.ui.tools.a.b.dbr();
        localObject5 = this.umI;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.webview.WebViewExDeviceMgr", "tryInit");
        if (((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).uAj == null)
        {
          localObject4 = new com/tencent/mm/plugin/webview/ui/tools/a/b$a;
          ((com.tencent.mm.plugin.webview.ui.tools.a.b.a)localObject4).<init>((com.tencent.mm.plugin.webview.stub.e)localObject5, (String)localObject3);
          ((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).uAj = ((com.tencent.mm.plugin.webview.ui.tools.a.b.a)localObject4);
          com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).uAj.uAn);
          com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).uAj.uAo);
          com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).uAj.uAp);
          com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).uAj.uAd);
          com.tencent.mm.sdk.b.a.xxA.c(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).uAj.qwh);
        }
        localObject5 = new com/tencent/mm/g/a/dy;
        ((dy)localObject5).<init>();
        ((dy)localObject5).cxy.op = 1;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject5);
        ((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).hasInit = true;
        ((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).cwz = ((String)localObject3);
        ((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).uAa = null;
        com.tencent.mm.pluginsdk.ui.tools.t.a(com.tencent.mm.plugin.webview.ui.tools.a.b.dbr());
        localObject3 = BluetoothAdapter.getDefaultAdapter();
        if (localObject3 != null)
          break label1083;
        localObject2 = "unknow";
        ah.getContext();
        boolean bool = ah.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.webview.ExDeviceBluetoothUtil", "isBLESupported, ret = %b", new Object[] { Boolean.valueOf(bool) });
        localObject3 = new HashMap();
        ((HashMap)localObject3).put("minVersion", Integer.valueOf(1));
        ((HashMap)localObject3).put("maxVersion", Integer.valueOf(1));
        ((HashMap)localObject3).put("bluetoothState", localObject2);
        if (!bool)
          break label1147;
        localObject2 = "yes";
        ((HashMap)localObject3).put("isSupportBLE", localObject2);
        if (i == 1)
          ((HashMap)localObject3).put("OS", "android");
        a(parami, "openWXDeviceLib:ok", (Map)localObject3);
      }
      catch (Exception localException2)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "openWXDeviceLib failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "openWXDeviceLib:fail_exception", null);
        AppMethodBeat.o(9283);
      }
      break;
      label1083: String str = "unknow";
      switch (((BluetoothAdapter)localObject3).getState())
      {
      default:
        break;
      case 10:
        str = "off";
        break;
      case 12:
        str = "on";
        break;
      case 11:
        str = "resetting";
        continue;
        label1147: str = "no";
      }
    }
  }

  private boolean M(i parami)
  {
    AppMethodBeat.i(9284);
    String str1 = "";
    if (parami.puc.containsKey("connType"))
      str1 = (String)parami.puc.get("connType");
    if (str1.equalsIgnoreCase("lan"));
    while (true)
    {
      try
      {
        str1 = V(parami);
        com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(str1), "closeWXDeviceLib" });
        com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().dbp();
        a(parami, "closeWXDeviceLib:ok", null);
        AppMethodBeat.o(9284);
        return true;
      }
      catch (Exception localException1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "closeWXDeviceLib failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "closeWXDeviceLib:fail_exception", null);
        AppMethodBeat.o(9284);
        continue;
      }
      try
      {
        String str2 = V(parami);
        com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(str2), "closeWXDeviceLib" });
        com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().dbp();
      }
      catch (Exception localException2)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "closeWXDeviceLib failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "closeWXDeviceLib:fail_exception", null);
        AppMethodBeat.o(9284);
      }
    }
  }

  private boolean N(i parami)
  {
    AppMethodBeat.i(9285);
    Object localObject = "";
    if (parami.puc.containsKey("connType"))
      localObject = (String)parami.puc.get("connType");
    if (((String)localObject).equalsIgnoreCase("lan"))
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().hasInit)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "startScanWXDevice not init");
        a(parami, "startScanWXDevice:fail_notInit", null);
        AppMethodBeat.o(9285);
        return true;
      }
    while (true)
    {
      try
      {
        localObject = V(parami);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "srcUsername(%s)", new Object[] { localObject });
        com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(localObject), "startScanWXDevice" });
        if (bo.isNullOrNil((String)localObject))
        {
          a(parami, "startScanWXDevice:fail_UsernameError", null);
          AppMethodBeat.o(9285);
          break;
        }
        localObject = new com/tencent/mm/g/a/ev;
        ((ev)localObject).<init>();
        ((ev)localObject).cyp.cwA = true;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().uAc = true;
        a(parami, "startScanWXDevice:ok", null);
        AppMethodBeat.o(9285);
      }
      catch (Exception localException1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "startScanWXDevice failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "startScanWXDevice:fail_exception", null);
        AppMethodBeat.o(9285);
      }
      break;
      if ((com.tencent.mm.compatible.util.d.iW(23)) && (!((LocationManager)this.context.getSystemService("location")).isProviderEnabled("gps")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0")))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "Android version realse code: %s", new Object[] { Build.VERSION.RELEASE });
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "ScannerInThisAndroidVersionRequireGPSServiceOn");
        a(parami, "startScanWXDevice:fail_ThisAndroidVersionRequireGPSServiceOn", null);
        AppMethodBeat.o(9285);
        break;
      }
      if (!com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().hasInit)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "startScanWXDevice not init");
        a(parami, "startScanWXDevice:fail_notInit", null);
        AppMethodBeat.o(9285);
        break;
      }
      while (true)
      {
        String str2;
        try
        {
          String str1 = V(parami);
          str2 = (String)parami.puc.get("btVersion");
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "BtVersion(%s), srcUsername(%s)", new Object[] { str2, str1 });
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(str1), "startScanWXDevice" });
          if (bo.isNullOrNil(str1))
          {
            a(parami, "startScanWXDevice:fail_UsernameError", null);
            AppMethodBeat.o(9285);
            break;
          }
          ef localef = new com/tencent/mm/g/a/ef;
          localef.<init>();
          localef.cxG.cwA = true;
          localef.cxG.cwz = str1;
          if (!bo.nullAsNil(str2).equals("ble"))
            break label615;
          localef.cxG.cxI = 0;
          com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().uAl = localef.cxG.cxI;
          com.tencent.mm.sdk.b.a.xxA.m(localef);
          if (!localef.cxH.cwB)
            break label640;
          com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().uAc = true;
          a(parami, "startScanWXDevice:ok", null);
        }
        catch (Exception localException2)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "startScanWXDevice failed : %s", new Object[] { localException2.getMessage() });
          a(parami, "startScanWXDevice:fail_exception", null);
          AppMethodBeat.o(9285);
        }
        break;
        label615: if (bo.nullAsNil(str2).equals("bc"))
          localException2.cxG.cxI = 1;
      }
      label640: a(parami, "startScanWXDevice:fail", null);
    }
  }

  private boolean O(i parami)
  {
    AppMethodBeat.i(9286);
    Object localObject = "";
    if (parami.puc.containsKey("connType"))
      localObject = (String)parami.puc.get("connType");
    if (((String)localObject).equalsIgnoreCase("lan"))
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().hasInit)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "stopScanWXDevice not init");
        a(parami, "stopScanWXDevice:fail_notInit", null);
        AppMethodBeat.o(9286);
        return true;
      }
    while (true)
    {
      while (true)
      {
        try
        {
          localObject = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(localObject), "stopScanWXDevice" });
          if (bo.isNullOrNil((String)localObject))
          {
            a(parami, "stopScanWXDevice:fail_UsernameError", null);
            AppMethodBeat.o(9286);
            break;
          }
          localObject = new com/tencent/mm/g/a/ev;
          ((ev)localObject).<init>();
          ((ev)localObject).cyp.cwA = false;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
          com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().uAc = false;
          a(parami, "stopScanWXDevice:ok", null);
          AppMethodBeat.o(9286);
        }
        catch (Exception localException1)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException1, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "stopScanWXDevice failed : %s", new Object[] { localException1.getMessage() });
          a(parami, "stopScanWXDevice:fail_exception", null);
          AppMethodBeat.o(9286);
        }
        break;
        if (!com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().hasInit)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "stopScanWXDevice not init");
          a(parami, "stopScanWXDevice:fail_notInit", null);
          AppMethodBeat.o(9286);
          break;
        }
        try
        {
          String str = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(str), "stopScanWXDevice" });
          if (bo.isNullOrNil(str))
          {
            a(parami, "stopScanWXDevice:fail_UsernameError", null);
            AppMethodBeat.o(9286);
            break;
          }
          ef localef = new com/tencent/mm/g/a/ef;
          localef.<init>();
          localef.cxG.cwA = false;
          localef.cxG.cwz = str;
          localef.cxG.cxI = com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().uAl;
          com.tencent.mm.sdk.b.a.xxA.m(localef);
          if (!localef.cxH.cwB)
            break label465;
          com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().uAc = false;
          a(parami, "stopScanWXDevice:ok", null);
        }
        catch (Exception localException2)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException2, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "stopScanWXDevice failed : %s", new Object[] { localException2.getMessage() });
          a(parami, "stopScanWXDevice:fail_exception", null);
          AppMethodBeat.o(9286);
        }
      }
      break;
      label465: com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "stopScanWXDevice fail");
      a(parami, "stopScanWXDevice:fail", null);
    }
  }

  private boolean P(i parami)
  {
    AppMethodBeat.i(9287);
    String str1 = "";
    if (parami.puc.containsKey("connType"))
      str1 = (String)parami.puc.get("connType");
    String str2;
    if (str1.equalsIgnoreCase("lan"))
    {
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().hasInit)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "connectWXDevice not init");
        a(parami, "connectWXDevice:fail_notInit", null);
        AppMethodBeat.o(9287);
      }
      while (true)
      {
        return true;
        str1 = (String)parami.puc.get("deviceId");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doConnectWXDevice, deviceId : %s", new Object[] { str1 });
        if (bo.isNullOrNil(str1))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "deviceId is null");
          a(parami, "connectWXDevice:fail_noDeviceId", null);
          AppMethodBeat.o(9287);
        }
        else
        {
          str2 = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(str2), "connectWXDevice" });
          if (!bo.isNullOrNil(str2))
            break;
          a(parami, "connectWXDevice:fail_UsernameError", null);
          AppMethodBeat.o(9287);
        }
      }
      if ((this.uGk != null) && (!this.uGk.containsKey(str2)))
        this.uGk.put(str2, str1);
    }
    while (true)
    {
      try
      {
        localObject = new com/tencent/mm/g/a/di;
        ((di)localObject).<init>();
        ((di)localObject).cwC.cwA = true;
        ((di)localObject).cwC.cwz = str2;
        ((di)localObject).cwC.ceI = str1;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
        if (((di)localObject).cwD.cwB)
        {
          a(parami, "connectWXDevice:ok", null);
          AppMethodBeat.o(9287);
          break;
        }
        a(parami, "connectWXDevice:fail", null);
        continue;
      }
      catch (Exception localException1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "connectWXDevice failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "connectWXDevice:fail_exception", null);
        AppMethodBeat.o(9287);
      }
      break;
      if (!com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().hasInit)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "connectWXDevice not init");
        a(parami, "connectWXDevice:fail_notInit", null);
        AppMethodBeat.o(9287);
        break;
      }
      Object localObject = (String)parami.puc.get("deviceId");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doConnectWXDevice, deviceId : %s", new Object[] { localObject });
      if (bo.isNullOrNil((String)localObject))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "deviceId is null");
        a(parami, "connectWXDevice:fail_noDeviceId", null);
        AppMethodBeat.o(9287);
        break;
      }
      str2 = V(parami);
      com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(str2), "connectWXDevice" });
      if (bo.isNullOrNil(str2))
      {
        a(parami, "connectWXDevice:fail_UsernameError", null);
        AppMethodBeat.o(9287);
        break;
      }
      if ((this.uGj != null) && (!this.uGj.containsValue(localObject)))
        this.uGj.put(str2, localObject);
      try
      {
        dh localdh = new com/tencent/mm/g/a/dh;
        localdh.<init>();
        localdh.cwx.cwA = true;
        localdh.cwx.cwz = str2;
        localdh.cwx.ceI = ((String)localObject);
        com.tencent.mm.sdk.b.a.xxA.m(localdh);
        if (!localdh.cwy.cwB)
          break label659;
        a(parami, "connectWXDevice:ok", null);
      }
      catch (Exception localException2)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "connectWXDevice failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "connectWXDevice:fail_exception", null);
        AppMethodBeat.o(9287);
      }
      break;
      label659: a(parami, "connectWXDevice:fail", null);
    }
  }

  private boolean Q(i parami)
  {
    AppMethodBeat.i(9288);
    Object localObject1 = "";
    if (parami.puc.containsKey("connType"))
      localObject1 = (String)parami.puc.get("connType");
    String str2;
    Object localObject2;
    if (((String)localObject1).equalsIgnoreCase("lan"))
    {
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().hasInit)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "disconnectWXDevice  not init");
        a(parami, "disconnectWXDevice:fail_notInit", null);
        AppMethodBeat.o(9288);
      }
      while (true)
      {
        return true;
        str2 = (String)parami.puc.get("deviceId");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doDisconnectWXDevice, deviceId : %s", new Object[] { str2 });
        if (bo.isNullOrNil(str2))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "deviceId is null");
          a(parami, "disconnectWXDevice:fail_noDeviceId", null);
          AppMethodBeat.o(9288);
        }
        else
        {
          localObject2 = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(localObject2), "disconnectWXDevice" });
          if (!bo.isNullOrNil((String)localObject2))
            break;
          a(parami, "disconnectWXDevice:fail_UsernameError", null);
          AppMethodBeat.o(9288);
        }
      }
    }
    while (true)
    {
      try
      {
        localObject1 = new com/tencent/mm/g/a/di;
        ((di)localObject1).<init>();
        ((di)localObject1).cwC.cwA = false;
        ((di)localObject1).cwC.cwz = ((String)localObject2);
        ((di)localObject1).cwC.ceI = str2;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        if (((di)localObject1).cwD.cwB)
        {
          a(parami, "disconnectWXDevice:ok", null);
          if ((this.uGk != null) && (this.uGk.containsKey(localObject2)))
            this.uGk.remove(localObject2);
          AppMethodBeat.o(9288);
          break;
        }
        a(parami, "disconnectWXDevice:fail", null);
        continue;
      }
      catch (Exception localException1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "disconnectWXDevice failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "disconnectWXDevice:fail_exception", null);
        AppMethodBeat.o(9288);
      }
      break;
      if (!com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().hasInit)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "disconnectWXDevice  not init");
        a(parami, "disconnectWXDevice:fail_notInit", null);
        AppMethodBeat.o(9288);
        break;
      }
      str2 = (String)parami.puc.get("deviceId");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doDisconnectWXDevice, deviceId : %s", new Object[] { str2 });
      if (bo.isNullOrNil(str2))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "deviceId is null");
        a(parami, "disconnectWXDevice:fail_noDeviceId", null);
        AppMethodBeat.o(9288);
        break;
      }
      String str1 = V(parami);
      com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(str1), "disconnectWXDevice" });
      if (bo.isNullOrNil(str1))
      {
        a(parami, "disconnectWXDevice:fail_UsernameError", null);
        AppMethodBeat.o(9288);
        break;
      }
      try
      {
        localObject2 = new com/tencent/mm/g/a/dh;
        ((dh)localObject2).<init>();
        ((dh)localObject2).cwx.cwA = false;
        ((dh)localObject2).cwx.cwz = str1;
        ((dh)localObject2).cwx.ceI = str2;
        com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        if (!((dh)localObject2).cwy.cwB)
          break label657;
        a(parami, "disconnectWXDevice:ok", null);
        if ((this.uGj == null) || (!this.uGj.containsKey(str1)))
          continue;
        this.uGj.remove(str1);
      }
      catch (Exception localException2)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "disconnectWXDevice failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "disconnectWXDevice:fail_exception", null);
        AppMethodBeat.o(9288);
      }
      break;
      label657: a(parami, "disconnectWXDevice:fail", null);
    }
  }

  private boolean R(i parami)
  {
    AppMethodBeat.i(9289);
    if ((!com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().hasInit) && (!com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().hasInit))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "getWXDeviceTicket not init");
      a(parami, "getWXDeviceTicket:fail_notInit", null);
      AppMethodBeat.o(9289);
    }
    while (true)
    {
      return true;
      Object localObject = (String)parami.puc.get("deviceId");
      String str1 = (String)parami.puc.get("type");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doGetWXDeviceTicket, deviceId : %s, type : %s", new Object[] { localObject, str1 });
      if ((bo.isNullOrNil((String)localObject)) || (bo.isNullOrNil(str1)))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "deviceId or type is null");
        a(parami, "getWXDeviceTicket:fail_wrongParams", null);
        AppMethodBeat.o(9289);
      }
      else
      {
        try
        {
          String str2 = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(str2), "getWXDeviceTicket" });
          if (bo.isNullOrNil(str2))
          {
            a(parami, "getWXDeviceTicket:fail_UsernameError", null);
            AppMethodBeat.o(9289);
          }
          else
          {
            dp localdp = new com/tencent/mm/g/a/dp;
            localdp.<init>();
            localdp.cwX.type = bo.getInt(str1, 0);
            localdp.cwX.cwz = str2;
            localdp.cwX.ceI = ((String)localObject);
            localdp.cwX.cwZ = parami.uIG;
            localObject = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$74;
            ((g.74)localObject).<init>(this, localdp, parami);
            localdp.callback = ((Runnable)localObject);
            com.tencent.mm.sdk.b.a.xxA.a(localdp, Looper.getMainLooper());
            AppMethodBeat.o(9289);
          }
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "getWXDeviceTicket failed : %s", new Object[] { localException.getMessage() });
          a(parami, "getWXDeviceTicket:fail_exception", null);
          AppMethodBeat.o(9289);
        }
      }
    }
  }

  private boolean S(i parami)
  {
    AppMethodBeat.i(9290);
    Object localObject1 = "";
    if (parami.puc.containsKey("connType"))
      localObject1 = (String)parami.puc.get("connType");
    if (((String)localObject1).equalsIgnoreCase("lan"))
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().hasInit)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "getWXDeviceInfos not init");
        a(parami, "getWXDeviceInfos:fail_notInit", null);
        AppMethodBeat.o(9290);
        return true;
      }
    while (true)
    {
      while (true)
      {
        Object localObject2;
        try
        {
          localObject2 = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(localObject2), "getWXDeviceInfos" });
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doGetWXDeviceInfos, %s", new Object[] { localObject2 });
          if (bo.isNullOrNil((String)localObject2))
          {
            a(parami, "getWXDeviceInfos:fail_UsernameError", null);
            AppMethodBeat.o(9290);
            break;
          }
          localObject1 = new com/tencent/mm/g/a/dn;
          ((dn)localObject1).<init>();
          ((dn)localObject1).cwP.cwz = ((String)localObject2);
          ((dn)localObject1).cwP.context = this.context;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
          if ((((dn)localObject1).cwQ.cwB) && (((dn)localObject1).cwQ.cwO != null))
          {
            localObject2 = new java/util/HashMap;
            ((HashMap)localObject2).<init>();
            ((Map)localObject2).put("jsapi_callback_json_special_key", "deviceInfos");
            ((Map)localObject2).put("deviceInfos", ((dn)localObject1).cwQ.cwO.toString());
            a(parami, "getWXDeviceInfos:ok", (Map)localObject2);
            AppMethodBeat.o(9290);
            break;
          }
          a(parami, "getWXDeviceInfos:fail", null);
          continue;
        }
        catch (Exception localException1)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "getWXDeviceInfos failed : %s", new Object[] { localException1.getMessage() });
          a(parami, "getWXDeviceInfos:fail_exception", null);
          AppMethodBeat.o(9290);
        }
        break;
        if (!com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().hasInit)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "getWXDeviceInfos not init");
          a(parami, "getWXDeviceInfos:fail_notInit", null);
          AppMethodBeat.o(9290);
          break;
        }
        try
        {
          localObject2 = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(localObject2), "getWXDeviceInfos" });
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doGetWXDeviceInfos, %s", new Object[] { localObject2 });
          if (bo.isNullOrNil((String)localObject2))
          {
            a(parami, "getWXDeviceInfos:fail_UsernameError", null);
            AppMethodBeat.o(9290);
            break;
          }
          dm localdm = new com/tencent/mm/g/a/dm;
          localdm.<init>();
          localdm.cwM.cwz = ((String)localObject2);
          localdm.cwM.context = this.context;
          com.tencent.mm.sdk.b.a.xxA.m(localdm);
          if ((!localdm.cwN.cwB) || (localdm.cwN.cwO == null))
            break label582;
          localObject2 = new java/util/HashMap;
          ((HashMap)localObject2).<init>();
          ((Map)localObject2).put("jsapi_callback_json_special_key", "deviceInfos");
          ((Map)localObject2).put("deviceInfos", localdm.cwN.cwO.toString());
          a(parami, "getWXDeviceInfos:ok", (Map)localObject2);
        }
        catch (Exception localException2)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "getWXDeviceInfos failed : %s", new Object[] { localException2.getMessage() });
          a(parami, "getWXDeviceInfos:fail_exception", null);
          AppMethodBeat.o(9290);
        }
      }
      break;
      label582: a(parami, "getWXDeviceInfos:fail", null);
    }
  }

  private boolean T(i parami)
  {
    AppMethodBeat.i(9291);
    String str1 = "";
    if (parami.puc.containsKey("connType"))
      str1 = (String)parami.puc.get("connType");
    String str2;
    boolean bool;
    if (str1.equalsIgnoreCase("lan"))
    {
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.dbo().hasInit)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "sendDataToWXDevice not init");
        a(parami, "sendDataToWXDevice:fail_notInit", null);
        AppMethodBeat.o(9291);
        return true;
      }
      str1 = (String)parami.puc.get("deviceId");
      str2 = (String)parami.puc.get("base64Data");
      if (!bo.isNullOrNil(str2));
      for (bool = true; ; bool = false)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSendDataToWXDevice, deviceId : %s, has data : %s", new Object[] { str1, Boolean.valueOf(bool) });
        if ((!bo.isNullOrNil(str1)) && (str2 != null))
          break label197;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "deviceId or data is null");
        a(parami, "sendDataToWXDevice:fail_wrongParams", null);
        AppMethodBeat.o(9291);
        break;
      }
    }
    while (true)
    {
      while (true)
      {
        label197: Object localObject;
        try
        {
          str3 = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(str3), "sendDataToWXDevice" });
          if (bo.isNullOrNil(str3))
          {
            a(parami, "sendDataToWXDevice:fail_UsernameError", null);
            AppMethodBeat.o(9291);
            break;
          }
          localObject = new com/tencent/mm/g/a/ei;
          ((ei)localObject).<init>();
          ((ei)localObject).cxN.cwz = str3;
          ((ei)localObject).cxN.data = str2;
          ((ei)localObject).cxN.ceI = str1;
          com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
          if (((ei)localObject).cxO.cwB)
          {
            a(parami, "sendDataToWXDevice:ok", null);
            AppMethodBeat.o(9291);
            break;
          }
          a(parami, "sendDataToWXDevice:fail", null);
          continue;
        }
        catch (Exception localException1)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "sendDataToWXDevice failed : %s", new Object[] { localException1.getMessage() });
          a(parami, "sendDataToWXDevice:fail_exception", null);
          AppMethodBeat.o(9291);
        }
        break;
        if (!com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().hasInit)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "sendDataToWXDevice not init");
          a(parami, "sendDataToWXDevice:fail_notInit", null);
          AppMethodBeat.o(9291);
          break;
        }
        String str3 = (String)parami.puc.get("deviceId");
        str2 = (String)parami.puc.get("base64Data");
        if (!bo.isNullOrNil(str2));
        for (bool = true; ; bool = false)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSendDataToWXDevice, deviceId : %s, has data : %s", new Object[] { str3, Boolean.valueOf(bool) });
          if ((!bo.isNullOrNil(str3)) && (str2 != null))
            break label534;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "deviceId or data is null");
          a(parami, "sendDataToWXDevice:fail_wrongParams", null);
          AppMethodBeat.o(9291);
          break;
        }
        try
        {
          label534: localObject = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(localObject), "sendDataToWXDevice" });
          if (bo.isNullOrNil((String)localObject))
          {
            a(parami, "sendDataToWXDevice:fail_UsernameError", null);
            AppMethodBeat.o(9291);
            break;
          }
          eh localeh = new com/tencent/mm/g/a/eh;
          localeh.<init>();
          localeh.cxL.cwz = ((String)localObject);
          localeh.cxL.data = Base64.decode(str2, 0);
          localeh.cxL.ceI = str3;
          com.tencent.mm.sdk.b.a.xxA.m(localeh);
          if (!localeh.cxM.cwB)
            break label701;
          a(parami, "sendDataToWXDevice:ok", null);
        }
        catch (Exception localException2)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "sendDataToWXDevice failed : %s", new Object[] { localException2.getMessage() });
          a(parami, "sendDataToWXDevice:fail_exception", null);
          AppMethodBeat.o(9291);
        }
      }
      break;
      label701: a(parami, "sendDataToWXDevice:fail", null);
    }
  }

  private boolean U(i parami)
  {
    AppMethodBeat.i(9292);
    if (!com.tencent.mm.plugin.webview.ui.tools.a.b.dbr().hasInit)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "setSendDataDirection not init");
      a(parami, "setSendDataDirection:fail_notInit", null);
      AppMethodBeat.o(9292);
    }
    while (true)
    {
      return true;
      try
      {
        String str = (String)parami.puc.get("deviceId");
        Object localObject = (String)parami.puc.get("direction");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "setSendDataDirection, deviceId = %s, direction = %s", new Object[] { str, localObject });
        if ((bo.isNullOrNil(str)) || (bo.isNullOrNil((String)localObject)))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "wrong args");
          a(parami, "setSendDataDirection:fail_wrongParams", null);
          AppMethodBeat.o(9292);
        }
        else
        {
          int i = bo.getInt((String)localObject, 0);
          localObject = V(parami);
          com.tencent.mm.plugin.report.service.h.pYm.e(11533, new Object[] { String.valueOf(localObject), "setSendDataDirection" });
          if (bo.isNullOrNil((String)localObject))
          {
            a(parami, "setSendDataDirection:fail_UsernameError", null);
            AppMethodBeat.o(9292);
          }
          else
          {
            localObject = new com/tencent/mm/g/a/el;
            ((el)localObject).<init>();
            ((el)localObject).cxX.ceI = str;
            ((el)localObject).cxX.direction = i;
            ((el)localObject).cxX.clear = false;
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
            if (((el)localObject).cxY.cwB)
              a(parami, "setSendDataDirection:ok", null);
            while (true)
            {
              AppMethodBeat.o(9292);
              break;
              a(parami, "setSendDataDirection:fail", null);
            }
          }
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "setSendDataDirection failed : %s", new Object[] { localException.getMessage() });
        a(parami, "setSendDataDirection:fail_exception", null);
        AppMethodBeat.o(9292);
      }
    }
  }

  private String V(i parami)
  {
    AppMethodBeat.i(9297);
    Object localObject1 = null;
    Object localObject2 = dcB();
    Object localObject3;
    if (bFf() == 27)
      localObject3 = this.uGi;
    while (true)
    {
      AppMethodBeat.o(9297);
      return localObject3;
      if ((cZr() != 8) && (cZr() != -1))
      {
        if (this.jMp != null)
        {
          localObject3 = this.jMp;
        }
        else
        {
          localObject3 = localObject1;
          if (!bo.isNullOrNil((String)localObject2))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "BrandUsername in H5 is null, check if it is in hardBiz chat");
            localObject2 = com.tencent.mm.aj.f.qX((String)localObject2);
            localObject3 = localObject1;
            if (localObject2 != null)
            {
              localObject2 = ((com.tencent.mm.aj.d)localObject2).cJ(false);
              localObject3 = localObject1;
              if (localObject2 != null)
              {
                localObject3 = localObject1;
                if (((com.tencent.mm.aj.d.b)localObject2).aej() != null)
                {
                  localObject3 = localObject1;
                  if (((com.tencent.mm.aj.d.b)localObject2).aej().aes())
                  {
                    localObject3 = (String)parami.puc.get("src_username");
                    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "HardBiz chat, key_src_username(%s)", new Object[] { (String)parami.puc.get("src_username") });
                  }
                }
              }
            }
          }
        }
      }
      else
      {
        localObject3 = localObject1;
        if (parami != null)
        {
          localObject3 = (String)parami.puc.get("src_username");
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "key_src_username(%s)", new Object[] { (String)parami.puc.get("src_username") });
        }
      }
    }
  }

  // ERROR //
  private boolean W(i parami)
  {
    // Byte code:
    //   0: sipush 9298
    //   3: invokestatic 155	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   10: ldc_w 2352
    //   13: invokeinterface 383 2 0
    //   18: checkcast 165	java/lang/String
    //   21: astore_2
    //   22: ldc_w 363
    //   25: ldc_w 2354
    //   28: iconst_1
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: aload_2
    //   35: aastore
    //   36: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: aload_2
    //   40: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   43: ifne +593 -> 636
    //   46: new 1248	org/json/JSONArray
    //   49: astore_3
    //   50: aload_3
    //   51: aload_2
    //   52: invokespecial 1273	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   55: iconst_0
    //   56: istore 4
    //   58: iconst_0
    //   59: istore 5
    //   61: iload 5
    //   63: istore 6
    //   65: iload 4
    //   67: aload_3
    //   68: invokevirtual 1249	org/json/JSONArray:length	()I
    //   71: if_icmpge +83 -> 154
    //   74: aload_3
    //   75: iload 4
    //   77: invokevirtual 1279	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   80: ldc_w 2356
    //   83: invokevirtual 1439	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   86: ifeq +19 -> 105
    //   89: iload 5
    //   91: iconst_1
    //   92: ior
    //   93: istore 6
    //   95: iinc 4 1
    //   98: iload 6
    //   100: istore 5
    //   102: goto -41 -> 61
    //   105: aload_3
    //   106: iload 4
    //   108: invokevirtual 1279	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   111: ldc_w 2358
    //   114: invokevirtual 1439	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   117: istore 7
    //   119: iload 5
    //   121: istore 6
    //   123: iload 7
    //   125: ifeq -30 -> 95
    //   128: iload 5
    //   130: iconst_2
    //   131: ior
    //   132: istore 6
    //   134: goto -39 -> 95
    //   137: astore_2
    //   138: iconst_0
    //   139: istore 5
    //   141: ldc_w 363
    //   144: ldc_w 2360
    //   147: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   150: iload 5
    //   152: istore 6
    //   154: iload 6
    //   156: ifne +477 -> 633
    //   159: iconst_3
    //   160: istore 6
    //   162: ldc_w 363
    //   165: ldc_w 2362
    //   168: iconst_1
    //   169: anewarray 4	java/lang/Object
    //   172: dup
    //   173: iconst_0
    //   174: iload 6
    //   176: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   179: aastore
    //   180: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   183: iload 6
    //   185: iconst_2
    //   186: if_icmpeq +9 -> 195
    //   189: iload 6
    //   191: iconst_3
    //   192: if_icmpne +60 -> 252
    //   195: aload_0
    //   196: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   199: checkcast 2364	android/app/Activity
    //   202: ldc_w 2366
    //   205: bipush 113
    //   207: ldc_w 419
    //   210: ldc_w 419
    //   213: invokestatic 2369	com/tencent/mm/pluginsdk/permission/b:a	(Landroid/app/Activity;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Z
    //   216: istore 7
    //   218: ldc_w 363
    //   221: ldc_w 2371
    //   224: iconst_1
    //   225: anewarray 4	java/lang/Object
    //   228: dup
    //   229: iconst_0
    //   230: iload 7
    //   232: invokestatic 570	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   235: aastore
    //   236: invokestatic 1184	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   239: iload 7
    //   241: ifne +11 -> 252
    //   244: sipush 9298
    //   247: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   250: iconst_1
    //   251: ireturn
    //   252: aload_1
    //   253: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   256: ldc_w 2373
    //   259: invokeinterface 383 2 0
    //   264: checkcast 165	java/lang/String
    //   267: iconst_0
    //   268: invokestatic 619	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   271: istore 4
    //   273: aload_1
    //   274: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   277: ldc_w 2375
    //   280: invokeinterface 383 2 0
    //   285: checkcast 165	java/lang/String
    //   288: astore_3
    //   289: getstatic 2379	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   292: astore_1
    //   293: getstatic 2379	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   296: astore_2
    //   297: aload_3
    //   298: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   301: ifne +324 -> 625
    //   304: new 1248	org/json/JSONArray
    //   307: astore 8
    //   309: aload 8
    //   311: aload_3
    //   312: invokespecial 1273	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   315: iconst_0
    //   316: istore 5
    //   318: aload_2
    //   319: astore 9
    //   321: aload_1
    //   322: astore_3
    //   323: iload 5
    //   325: aload 8
    //   327: invokevirtual 1249	org/json/JSONArray:length	()I
    //   330: if_icmpge +83 -> 413
    //   333: aload 8
    //   335: iload 5
    //   337: invokevirtual 1279	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   340: ldc_w 2381
    //   343: invokevirtual 1439	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   346: ifeq +21 -> 367
    //   349: getstatic 2384	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   352: astore_3
    //   353: aload_2
    //   354: astore 9
    //   356: iinc 5 1
    //   359: aload 9
    //   361: astore_2
    //   362: aload_3
    //   363: astore_1
    //   364: goto -46 -> 318
    //   367: aload_2
    //   368: astore 9
    //   370: aload_1
    //   371: astore_3
    //   372: aload 8
    //   374: iload 5
    //   376: invokevirtual 1279	org/json/JSONArray:getString	(I)Ljava/lang/String;
    //   379: ldc_w 2386
    //   382: invokevirtual 1439	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   385: ifeq -29 -> 356
    //   388: getstatic 2384	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   391: astore 9
    //   393: aload_1
    //   394: astore_3
    //   395: goto -39 -> 356
    //   398: astore_3
    //   399: ldc_w 363
    //   402: ldc_w 2360
    //   405: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   408: aload_1
    //   409: astore_3
    //   410: aload_2
    //   411: astore 9
    //   413: aload_3
    //   414: invokevirtual 2389	java/lang/Boolean:booleanValue	()Z
    //   417: ifeq +163 -> 580
    //   420: aload 9
    //   422: invokevirtual 2389	java/lang/Boolean:booleanValue	()Z
    //   425: ifne +155 -> 580
    //   428: getstatic 2384	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   431: astore_1
    //   432: bipush 7
    //   434: istore 5
    //   436: new 404	android/content/Intent
    //   439: dup
    //   440: invokespecial 405	android/content/Intent:<init>	()V
    //   443: astore_2
    //   444: aload_2
    //   445: ldc_w 2391
    //   448: iload 6
    //   450: invokevirtual 489	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   453: pop
    //   454: aload_2
    //   455: ldc_w 2393
    //   458: iload 4
    //   460: invokevirtual 489	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   463: pop
    //   464: aload_2
    //   465: ldc_w 2395
    //   468: iload 5
    //   470: invokevirtual 489	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   473: pop
    //   474: aload_2
    //   475: ldc_w 2397
    //   478: aload_1
    //   479: invokevirtual 2400	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;
    //   482: pop
    //   483: aload_2
    //   484: ldc_w 2402
    //   487: iconst_1
    //   488: invokevirtual 489	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   491: pop
    //   492: ldc_w 363
    //   495: ldc_w 2404
    //   498: iconst_4
    //   499: anewarray 4	java/lang/Object
    //   502: dup
    //   503: iconst_0
    //   504: iload 6
    //   506: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   509: aastore
    //   510: dup
    //   511: iconst_1
    //   512: iload 4
    //   514: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   517: aastore
    //   518: dup
    //   519: iconst_2
    //   520: iload 5
    //   522: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   525: aastore
    //   526: dup
    //   527: iconst_3
    //   528: aload_1
    //   529: aastore
    //   530: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   533: aload_0
    //   534: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   537: instanceof 449
    //   540: ifeq +31 -> 571
    //   543: aload_0
    //   544: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   547: checkcast 449	com/tencent/mm/ui/MMActivity
    //   550: aload_0
    //   551: putfield 453	com/tencent/mm/ui/MMActivity:ifE	Lcom/tencent/mm/ui/MMActivity$a;
    //   554: aload_0
    //   555: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   558: ldc_w 2406
    //   561: ldc_w 2408
    //   564: aload_2
    //   565: bipush 14
    //   567: iconst_0
    //   568: invokestatic 462	com/tencent/mm/bp/d:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;IZ)V
    //   571: sipush 9298
    //   574: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   577: goto -327 -> 250
    //   580: aload_3
    //   581: invokevirtual 2389	java/lang/Boolean:booleanValue	()Z
    //   584: ifne +22 -> 606
    //   587: aload 9
    //   589: invokevirtual 2389	java/lang/Boolean:booleanValue	()Z
    //   592: ifeq +14 -> 606
    //   595: getstatic 2379	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   598: astore_1
    //   599: bipush 7
    //   601: istore 5
    //   603: goto -167 -> 436
    //   606: getstatic 2379	java/lang/Boolean:FALSE	Ljava/lang/Boolean;
    //   609: astore_1
    //   610: bipush 8
    //   612: istore 5
    //   614: goto -178 -> 436
    //   617: astore_3
    //   618: goto -219 -> 399
    //   621: astore_2
    //   622: goto -481 -> 141
    //   625: aload_2
    //   626: astore 9
    //   628: aload_1
    //   629: astore_3
    //   630: goto -217 -> 413
    //   633: goto -471 -> 162
    //   636: iconst_0
    //   637: istore 6
    //   639: goto -485 -> 154
    //
    // Exception table:
    //   from	to	target	type
    //   46	55	137	java/lang/Exception
    //   304	315	398	java/lang/Exception
    //   323	353	617	java/lang/Exception
    //   372	393	617	java/lang/Exception
    //   65	89	621	java/lang/Exception
    //   105	119	621	java/lang/Exception
  }

  private boolean X(i parami)
  {
    AppMethodBeat.i(9299);
    String str1 = (String)parami.puc.get("appId");
    String str2 = (String)parami.puc.get("localId");
    Object localObject = parami.puc.get("isShowProgressTips");
    if (localObject != null);
    while (true)
    {
      try
      {
        int i = bo.getInt(localObject.toString(), 0);
        if (i == 1)
        {
          bool = true;
          l.a(parami.uII, false, null, str1);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "upload local image, appid = %s, localid = %s, isShowProgressTips(%s)", new Object[] { str1, str2, Boolean.valueOf(bool) });
          if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)))
            break label191;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "appId or localid is null or nil.");
          a(parami, "uploadImage:fail_missing arguments", null);
          AppMethodBeat.o(9299);
          return true;
        }
        bool = false;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
      boolean bool = true;
      continue;
      label191: a(parami, str1, str2, com.tencent.mm.i.a.MediaType_FILE, 0, 0, "uploadImage", bool);
      AppMethodBeat.o(9299);
    }
  }

  private boolean Y(i parami)
  {
    AppMethodBeat.i(9300);
    Object localObject1 = (String)parami.puc.get("appId");
    String str = (String)parami.puc.get("serverId");
    Object localObject2 = parami.puc.get("isShowProgressTips");
    if (localObject2 != null);
    while (true)
    {
      try
      {
        i = bo.getInt(localObject2.toString(), 0);
        if (i == 1)
        {
          i = 1;
          l.a(parami.uII, false, null, (String)localObject1);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doDownLoadImage, appid is : %s, media id is : %s", new Object[] { localObject1, str });
          if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil(str)))
            break label174;
          a(parami, "downloadImage:fail_missing arguments", null);
          AppMethodBeat.o(9300);
          return true;
        }
        i = 0;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
      int i = 1;
      continue;
      label174: g.75 local75 = new g.75(this, str, parami);
      com.tencent.mm.plugin.webview.modeltools.g.cYE().a((String)localObject1, str, local75);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doDownLoadImage, add cdn download task result : %b", new Object[] { Boolean.TRUE });
      if (i != 0)
      {
        localObject1 = this.context;
        this.context.getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject1, this.context.getString(2131305702), true, new g.76(this, local75, str, parami));
      }
      AppMethodBeat.o(9300);
    }
  }

  private boolean Z(i parami)
  {
    AppMethodBeat.i(9301);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doUploadEncryptMediaFile()");
    String str1 = (String)parami.puc.get("appId");
    String str2 = (String)parami.puc.get("localId");
    Object localObject = parami.puc.get("isShowProgressTips");
    if (localObject != null);
    boolean bool;
    label190: WebViewJSSDKFileItem localWebViewJSSDKFileItem;
    while (true)
    {
      try
      {
        int i = bo.getInt(localObject.toString(), 0);
        if (i == 1)
        {
          bool = true;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doUploadEncryptMediaFile, appid = %s, localid = %s, isShowProgressTips(%s)", new Object[] { str1, str2, Boolean.valueOf(bool) });
          if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)))
            break label190;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "appId or localid is null");
          a(parami, "uploadEncryptMediaFile:fail_missing arguments", null);
          AppMethodBeat.o(9301);
          return true;
        }
        bool = false;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
      bool = true;
      continue;
      l.a(parami.uII, false, null, str1);
      localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(str2);
      if (localWebViewJSSDKFileItem != null)
        break;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "jssdk file item is null for localId:%s", new Object[] { str2 });
      a(parami, "uploadEncryptMediaFile:file_not_exist", null);
      AppMethodBeat.o(9301);
    }
    switch (localWebViewJSSDKFileItem.cyQ)
    {
    case 2:
    case 3:
    default:
      b(parami, str1, str2, com.tencent.mm.i.a.efH, 0, 0, "uploadEncryptMediaFile", bool);
    case 1:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(9301);
      break;
      a(parami, str1, str2, com.tencent.mm.i.a.efH, 0, 0, "uploadEncryptMediaFile", bool);
      continue;
      b(parami, str1, str2, com.tencent.mm.i.a.efH, 0, 0, "uploadEncryptMediaFile", bool);
    }
  }

  private static void a(SnsAdClick paramSnsAdClick)
  {
    AppMethodBeat.i(9378);
    of localof = new of();
    localof.cKy.cKz = paramSnsAdClick;
    com.tencent.mm.sdk.b.a.xxA.m(localof);
    AppMethodBeat.o(9378);
  }

  private void a(i parami, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(9256);
    parami = parami.uIJ;
    if ((parami.equals("requireSoterBiometricAuthentication")) || (parami.equals("getSupportSoter")))
    {
      String str = bK(getCurrentUrl());
      com.tencent.mm.plugin.soter.d.l locall = com.tencent.mm.plugin.soter.d.l.rOl;
      com.tencent.mm.plugin.soter.d.l.l(parami, str, paramInt1, paramInt2);
    }
    AppMethodBeat.o(9256);
  }

  private void a(i parami, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(9307);
    g.82 local82 = new g.82(this, paramString3, paramString2, parami);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(paramString2);
    if (localWebViewJSSDKFileItem == null)
    {
      a(parami, paramString3 + ":fail", null);
      AppMethodBeat.o(9307);
      return;
    }
    int i;
    label79: Object localObject1;
    if (localWebViewJSSDKFileItem.hes)
    {
      i = 0;
      localObject1 = new PString();
      Object localObject2 = new PInt();
      PInt localPInt = new PInt();
      long l = com.tencent.mm.at.o.ahl().a(localWebViewJSSDKFileItem.heo, i, 0, (PString)localObject1, (PInt)localObject2, localPInt);
      localObject2 = com.tencent.mm.at.o.ahl().b(Long.valueOf(l));
      localObject1 = localWebViewJSSDKFileItem.heo;
      localObject2 = com.tencent.mm.at.o.ahl().q(((com.tencent.mm.at.e)localObject2).fDz, "", "");
      localWebViewJSSDKFileItem.heo = ((String)localObject2);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "Image Inserted: %s", new Object[] { localObject2 });
      boolean bool = com.tencent.mm.plugin.webview.modeltools.g.cYE().a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, local82);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", paramString3 + ", add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool) });
      if (bool)
        break label303;
      a(parami, paramString3 + ":fail", null);
    }
    while (true)
    {
      localWebViewJSSDKFileItem.heo = ((String)localObject1);
      AppMethodBeat.o(9307);
      break;
      i = 1;
      break label79;
      label303: if (paramBoolean)
      {
        paramString1 = this.context;
        this.context.getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b(paramString1, this.context.getString(2131305732), true, new g.83(this, local82, paramString2, parami, paramString3));
      }
      else if ((this.context instanceof Activity))
      {
        ((Activity)this.context).finish();
        this.umI = this.uGq;
      }
    }
  }

  private void a(i parami, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(9383);
    a(parami, paramString, paramMap, true);
    AppMethodBeat.o(9383);
  }

  private void a(i parami, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(9382);
    a(parami, parami.uIJ + ":ok", paramMap);
    AppMethodBeat.o(9382);
  }

  private void a(String paramString1, String paramString2, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9381);
    if (paramBundle == null)
    {
      AppMethodBeat.o(9381);
      return;
    }
    String str1 = paramBundle.getString("share_report_pre_msg_url");
    String str2 = paramBundle.getString("share_report_pre_msg_title");
    String str3 = paramBundle.getString("share_report_pre_msg_desc");
    String str4 = paramBundle.getString("share_report_pre_msg_icon_url");
    String str5 = paramBundle.getString("share_report_pre_msg_appid");
    int i = paramBundle.getInt("share_report_from_scene", 0);
    String str6 = paramBundle.getString("share_report_biz_username");
    String str7 = paramBundle.getString("share_report_current_url");
    String str8 = paramBundle.getString("share_report_current_title");
    if ((this.cEl.mediaObject instanceof WXWebpageObject));
    for (paramBundle = ((WXWebpageObject)this.cEl.mediaObject).webpageUrl; ; paramBundle = "")
    {
      String str9 = this.cEl.title;
      String str10 = this.cEl.description;
      com.tencent.mm.plugin.report.service.h.pYm.e(14062, new Object[] { str1, str2, str3, str4, str5, Integer.valueOf(i), str6, str7, str8, paramString1, paramBundle, str9, str10, paramString2, Integer.valueOf(paramInt) });
      AppMethodBeat.o(9381);
      break;
    }
  }

  private boolean a(i parami, int paramInt)
  {
    AppMethodBeat.i(9305);
    String str1 = bo.nullAsNil((String)parami.puc.get("sourceType"));
    String str2 = bo.nullAsNil((String)parami.puc.get("camera"));
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doChooseVideo sourceType = %s, camera = %s, isVideoType:%d", new Object[] { str1, str2, Integer.valueOf(paramInt) });
    int i = bo.getInt((String)parami.puc.get("maxDuration"), 60);
    if (str1.contains("album"));
    label641: for (int j = 4096; ; j = 0)
    {
      int k = j;
      if (str1.contains("camera"))
      {
        if (i <= 0)
        {
          a(parami, "chooseVideo:fail", null);
          AppMethodBeat.o(9305);
          return true;
        }
        if (str2.equals("front"))
          k = j | 0x10;
      }
      else
      {
        label165: if (k != 0)
          break label667;
        k = 4352;
      }
      label388: label667: 
      while (true)
      {
        if ((k == 16) || (k == 256) || (k == 4352))
        {
          if (paramInt == 1)
          {
            bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)this.context, "android.permission.CAMERA", 117, "", "");
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
            if (!bool)
            {
              AppMethodBeat.o(9305);
              break;
              k = j | 0x100;
              break label165;
            }
            bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)this.context, "android.permission.RECORD_AUDIO", 118, "", "");
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool) });
            if (bool)
              break label388;
            AppMethodBeat.o(9305);
            break;
          }
          boolean bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)this.context, "android.permission.CAMERA", 115, "", "");
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
          if (!bool)
          {
            AppMethodBeat.o(9305);
            break;
          }
        }
        j = bo.getInt((String)parami.puc.get("quality"), 1);
        if ((j != 0) && (j != 1))
          j = 1;
        while (true)
        {
          if (i > 60)
            i = 60;
          while (true)
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doChooseVideo real scene = %d, select count = %d, video quality = %d, duration = %d", new Object[] { Integer.valueOf(k), Integer.valueOf(1), Integer.valueOf(j), Integer.valueOf(i) });
            parami = new Intent();
            parami.putExtra("key_pick_local_pic_capture", k);
            parami.putExtra("key_pick_local_pic_count", 1);
            parami.putExtra("key_pick_local_pic_query_source_type", 7);
            parami.putExtra("key_pick_local_media_quality", j);
            parami.putExtra("key_pick_local_media_duration", i);
            parami.putExtra("query_media_type", 2);
            parami.putExtra("key_pick_local_media_video_type", paramInt);
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doChooseVideo: realScene: %d, count: %d, querySourceType: %d", new Object[] { Integer.valueOf(k), Integer.valueOf(1), Integer.valueOf(7) });
            if ((this.context instanceof MMActivity))
            {
              ((MMActivity)this.context).ifE = this;
              if (paramInt != 1)
                break label641;
              com.tencent.mm.bp.d.a(this.context, "webview", ".ui.tools.OpenFileChooserUI", parami, 45, false);
            }
            while (true)
            {
              AppMethodBeat.o(9305);
              break;
              com.tencent.mm.bp.d.a(this.context, "webview", ".ui.tools.OpenFileChooserUI", parami, 32, false);
            }
          }
        }
      }
    }
  }

  private boolean a(i parami, g.a parama)
  {
    AppMethodBeat.i(9373);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doLogin!");
    LinkedList localLinkedList = new LinkedList();
    try
    {
      String str1 = this.umI.getCurrentUrl();
      str1 = bo.nullAsNil(this.uGr.agj(str1));
      if (bo.isNullOrNil(str1))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "appId is null!");
        a(parami, "doLogin:fail", null);
        parama.aCB();
        AppMethodBeat.o(9373);
        bool = false;
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localException.getMessage() });
        String str2 = null;
        continue;
        com.tencent.mm.kernel.g.Rg().a(new com.tencent.mm.z.a.c(str2, localLinkedList, "", "", new g.9(this, parami, parama, str2)), 0);
        AppMethodBeat.o(9373);
        boolean bool = true;
      }
    }
  }

  private boolean a(i parami, String paramString, long paramLong)
  {
    AppMethodBeat.i(9353);
    String str1 = new JSONObject((String)parami.puc.get("data")).optString("content");
    if (bo.isNullOrNil(str1))
    {
      a(parami, "sendEnterpriseChat:fail_params error", null);
      AppMethodBeat.o(9353);
    }
    while (true)
    {
      return true;
      Object localObject1 = com.tencent.mm.aj.z.aeT().aK(paramLong);
      synchronized (com.tencent.mm.aj.a.e.fxC)
      {
        String str2 = com.tencent.mm.aj.a.e.aae();
        com.tencent.mm.aj.a.e.d((com.tencent.mm.aj.a.c)localObject1);
        localObject1 = new com/tencent/mm/g/a/qb;
        ((qb)localObject1).<init>();
        ((qb)localObject1).cMq.cMr = paramString;
        ((qb)localObject1).cMq.content = str1;
        ((qb)localObject1).cMq.type = com.tencent.mm.model.t.nK(paramString);
        ((qb)localObject1).cMq.flags = 0;
        boolean bool = com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
        com.tencent.mm.aj.a.e.rx(str2);
        if (!bool)
        {
          a(parami, "sendEnterpriseChat:fail", null);
          AppMethodBeat.o(9353);
        }
      }
      a(parami, "sendEnterpriseChat:ok", null);
      if (this.context != null)
        com.tencent.mm.ui.base.h.bQ(this.context, this.context.getResources().getString(2131297050));
      AppMethodBeat.o(9353);
    }
  }

  private boolean a(i parami, boolean paramBoolean)
  {
    AppMethodBeat.i(9235);
    Object localObject1 = parami.puc.get("__jsapi_fw_ext_info");
    Object localObject2 = (String)parami.puc.get("link");
    if ((localObject1 instanceof Bundle));
    for (localObject1 = ((Bundle)localObject1).getString("__jsapi_fw_ext_info_key_current_url"); ; localObject1 = null)
    {
      if ((hn((String)localObject2, (String)localObject1)) || (!paramBoolean));
      while (true)
      {
        try
        {
          Bundle localBundle = this.umI.g(84, null);
          if (localBundle != null)
          {
            localObject2 = localObject1;
            if (TextUtils.isEmpty((CharSequence)localObject1))
              localObject2 = ar.aek(localBundle.getString("webview_current_url"));
            parami.puc.put("img_url", "");
            parami.puc.put("link", localObject2);
            parami.puc.put("desc", localBundle.getString("webview_current_desc"));
            parami.puc.put("title", localBundle.getString("webview_current_title"));
            AppMethodBeat.o(9235);
            paramBoolean = true;
            return paramBoolean;
          }
        }
        catch (RemoteException parami)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "invokeAsResult error : %s", new Object[] { parami });
        }
        AppMethodBeat.o(9235);
        paramBoolean = false;
      }
    }
  }

  private boolean a(i parami, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(9265);
    Object localObject1 = BluetoothAdapter.getDefaultAdapter();
    if (Build.VERSION.SDK_INT < 18)
    {
      a(parami, "startMonitoringBeacons:system unsupported", null);
      AppMethodBeat.o(9265);
      return true;
    }
    label66: label203: String str;
    if ((localObject1 != null) && (((BluetoothAdapter)localObject1).getState() != 12))
    {
      if (((BluetoothAdapter)localObject1).getState() == 10)
        a(parami, "startMonitoringBeacons:bluetooth power off", null);
    }
    else
    {
      if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
      {
        boolean bool = ((LocationManager)ah.getContext().getSystemService("location")).isProviderEnabled("gps");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "startMonitoringBeacons isGPSEnable:%b, hasGPSPerm:%b", new Object[] { Boolean.valueOf(bool), Boolean.valueOf(com.tencent.mm.pluginsdk.permission.b.o(ah.getContext(), "android.permission.ACCESS_COARSE_LOCATION")) });
        if (!bool)
        {
          a(parami, "startMonitoringBeacons:location service disable", null);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "startMonitoringBeacons:location service disable");
        }
        paramArrayOfInt = (SensorManager)ah.getContext().getSystemService("sensor");
        paramArrayOfInt.registerListener(this.uGJ, paramArrayOfInt.getDefaultSensor(3), 0);
      }
      if (this.uGI)
        break label456;
      this.uGI = true;
      a(parami, "startMonitoringBeacons:ok", null);
      if ((parami != null) && (parami.puc != null))
      {
        localObject1 = parami.puc.get("uuid");
        paramArrayOfInt = parami.puc.get("url");
        localObject2 = parami.puc.get("ticket");
        if (paramArrayOfInt == null)
          break label468;
        paramArrayOfInt = paramArrayOfInt.toString();
        label263: if (localObject1 == null)
          break label475;
        localObject1 = localObject1.toString();
        label272: str = bo.nullAsNil(this.uGr.agj(paramArrayOfInt));
        if (localObject2 == null)
          break label482;
      }
    }
    label456: label468: label475: label482: for (Object localObject2 = localObject2.toString(); ; localObject2 = "")
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(12101, new Object[] { String.valueOf(str), String.valueOf(paramArrayOfInt), this.uGG, this.uGH, String.valueOf(localObject2) });
      new StringBuilder("{\"UUID\":\"").append((String)localObject1).append("\",\"Major\":0,\"Minor\":0}");
      paramArrayOfInt = new ae(paramArrayOfInt, str, (String)localObject2);
      com.tencent.mm.kernel.g.Rg().a(1702, new g.53(this, paramArrayOfInt, parami));
      com.tencent.mm.kernel.g.Rg().a(paramArrayOfInt, 0);
      AppMethodBeat.o(9265);
      break;
      a(parami, "startMonitoringBeacons:bluetooth state unknown", null);
      break label66;
      a(parami, "startMonitoringBeacons:already started", null);
      break label203;
      paramArrayOfInt = "";
      break label263;
      localObject1 = "";
      break label272;
    }
  }

  private boolean a(com.tencent.mm.pluginsdk.model.app.f paramf, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    AppMethodBeat.i(9380);
    boolean bool;
    if (this.cEl == null)
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doSendAppMsg: but appmsg is null");
      bool = false;
      AppMethodBeat.o(9380);
    }
    while (true)
    {
      return bool;
      com.tencent.mm.at.o.ahk();
      Object localObject1 = com.tencent.mm.at.c.kR(paramString3);
      if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "thumb image is not null");
        localObject2 = new ByteArrayOutputStream();
        ((Bitmap)localObject1).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject2);
        this.cEl.thumbData = ((ByteArrayOutputStream)localObject2).toByteArray();
      }
      Object localObject2 = new py();
      ((py)localObject2).cMe.cEl = this.cEl;
      ((py)localObject2).cMe.appId = paramString1;
      localObject1 = ((py)localObject2).cMe;
      if (paramf == null)
      {
        paramf = "";
        label146: ((py.a)localObject1).appName = paramf;
        ((py)localObject2).cMe.toUser = paramString2;
        ((py)localObject2).cMe.cMf = 2;
        if (!bo.isNullOrNil(paramString4))
          break label685;
        ((py)localObject2).cMe.cMi = null;
      }
      try
      {
        label187: paramString4 = this.uGh.getString("key_snsad_statextstr");
        ((py)localObject2).cMe.cMn = paramString4;
        ((py)localObject2).cMe.cMj = this.umI.cYY();
        paramf = this.umI.g(18, null);
        if (paramf != null)
        {
          paramString5 = ((py)localObject2).cMe;
          localObject1 = bo.nullAsNil(paramf.getString("KPublisherId"));
          paramString5.cMm = ((String)localObject1);
          paramString5 = com.tencent.mm.model.v.nW((String)localObject1);
          localObject1 = com.tencent.mm.model.v.Zp().y(paramString5, true);
          ((v.b)localObject1).j("sendAppMsgScene", Integer.valueOf(2));
          ((v.b)localObject1).j("preChatName", paramf.getString("preChatName"));
          ((v.b)localObject1).j("preMsgIndex", Integer.valueOf(paramf.getInt("preMsgIndex")));
          ((v.b)localObject1).j("prePublishId", paramf.getString("prePublishId"));
          ((v.b)localObject1).j("preUsername", paramf.getString("preUsername"));
          ((v.b)localObject1).j("getA8KeyScene", Integer.valueOf(paramf.getInt("getA8KeyScene")));
          ((v.b)localObject1).j("referUrl", paramf.getString("referUrl"));
          i = paramf.getInt("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
          if (i != -1)
          {
            ((v.b)localObject1).j("_DATA_CENTER_ITEM_SHOW_TYPE", Integer.valueOf(i));
            ((v.b)localObject1).j("_tmpl_webview_transfer_scene", Integer.valueOf(11));
          }
          if (!bo.isNullOrNil(paramString4))
            ((v.b)localObject1).j("adExtStr", paramString4);
          ((py)localObject2).cMe.cvF = paramString5;
        }
        paramf = this.umI.getCurrentUrl();
        ((py)localObject2).cMe.cMk = paramf;
        ((py)localObject2).cMe.cMl = this.uGr.agj(paramf);
        label510: bool = com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
        if (!bo.isNullOrNil(paramString6))
        {
          paramf = new qb();
          paramf.cMq.cMr = paramString2;
          paramf.cMq.content = paramString6;
          paramf.cMq.type = com.tencent.mm.model.t.nK(paramString2);
          paramf.cMq.flags = 0;
          com.tencent.mm.sdk.b.a.xxA.m(paramf);
        }
        if (!bool);
      }
      catch (Exception paramf)
      {
        try
        {
          if (this.umI != null)
          {
            paramf = this.umI.g(85, null);
            if (!com.tencent.mm.model.t.kH(paramString2))
              break label732;
          }
          label685: label732: for (int i = 2; ; i = 3)
          {
            a(paramString1, paramString3, i, paramf);
            if (!bo.isNullOrNil(paramString7))
              com.tencent.mm.plugin.report.service.h.pYm.e(10424, new Object[] { Integer.valueOf(49), Integer.valueOf(128), paramString7 });
            AppMethodBeat.o(9380);
            break;
            paramf = paramf.field_appName;
            break label146;
            ((py)localObject2).cMe.cMg = paramString4;
            ((py)localObject2).cMe.cMh = paramString5;
            break label187;
            paramf = paramf;
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "init bunddata failed : %s", new Object[] { paramf.getMessage() });
            break label510;
          }
        }
        catch (RemoteException paramf)
        {
          while (true)
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "invokeAsResult : %s", new Object[] { paramf });
        }
      }
    }
  }

  private boolean a(Integer paramInteger, int paramInt1, int paramInt2, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(9264);
    paramIntent.putExtra("key_product_scene", paramInt1);
    com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenProductView, productType = %d", new Object[] { paramInteger });
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).ifE = this;
      switch (paramInteger.intValue())
      {
      default:
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenProductView fail, productType = %d", new Object[] { paramInteger });
        if (paramInt1 == 8)
          a(this.uGd, "open_product_view_with_id:fail", null);
        break;
      case 0:
      case 10000:
      case 20000:
      }
    }
    while (true)
    {
      AppMethodBeat.o(9264);
      return true;
      switch (paramInt2)
      {
      default:
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenProductView fail, productType = %d, viewType = %d", new Object[] { paramInteger, Integer.valueOf(paramInt2) });
        a(this.uGd, "open_product_view:fail", null);
        break;
      case 0:
        com.tencent.mm.bp.d.b(this.context, "product", ".ui.MallProductUI", paramIntent);
        a(this.uGd, "open_product_view:ok", null);
        break;
      case 1:
        paramIntent.putExtra("key_Qrcode_Url", paramString);
        paramIntent.putExtra("key_ProductUI_getProductInfoScene", 4);
        com.tencent.mm.bp.d.b(this.context, "scanner", ".ui.ProductUI", paramIntent, 10);
        continue;
        com.tencent.mm.bp.d.b(this.context, "card", ".ui.CardProductUI", paramIntent);
        a(this.uGd, "open_product_view:ok", null);
        continue;
        a(this.uGd, "open_product_view:fail", null);
      }
    }
  }

  private boolean a(String paramString, i parami)
  {
    AppMethodBeat.i(9273);
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>(paramString);
      if (localJSONArray.length() > 0)
      {
        JSONObject localJSONObject1 = new org/json/JSONObject;
        localJSONObject1.<init>();
        int i = 0;
        if (i < localJSONArray.length())
        {
          String str = localJSONArray.getString(i);
          FileDownloadTaskInfo localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.d.bij().Ir(str);
          JSONObject localJSONObject2 = new org/json/JSONObject;
          localJSONObject2.<init>();
          switch (localFileDownloadTaskInfo.status)
          {
          case 0:
          default:
            paramString = "default";
          case -1:
          case 1:
          case 3:
          case 2:
          case 4:
          }
          while (true)
          {
            localJSONObject2.put("download_id", localFileDownloadTaskInfo.id);
            localJSONObject2.put("state", paramString);
            if (localFileDownloadTaskInfo.kNu)
              localJSONObject2.put("reserve_for_wifi", 1);
            if (localFileDownloadTaskInfo.jrb != 0L)
            {
              long l = localFileDownloadTaskInfo.kNr * 100L / localFileDownloadTaskInfo.jrb;
              float f = (float)localFileDownloadTaskInfo.kNr * 100.0F / (float)localFileDownloadTaskInfo.jrb;
              localJSONObject2.put("progress", l);
              localJSONObject2.put("progress_float", f);
            }
            localJSONObject1.put(str, localJSONObject2);
            i++;
            break;
            paramString = "api_not_support";
            continue;
            paramString = "downloading";
            continue;
            if (com.tencent.mm.vfs.e.ct(localFileDownloadTaskInfo.path))
            {
              paramString = "download_succ";
            }
            else
            {
              paramString = "default";
              continue;
              paramString = "download_pause";
              continue;
              paramString = "download_fail";
            }
          }
        }
        paramString = new java/util/HashMap;
        paramString.<init>();
        paramString.put("result", localJSONObject1);
        a(parami, "query_download_task:ok", paramString);
      }
      while (true)
      {
        AppMethodBeat.o(9273);
        return true;
        a(parami, "query_download_task:fail", null);
      }
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", paramString.getMessage());
        a(parami, "query_download_task:fail", null);
      }
    }
  }

  private void aA(Intent paramIntent)
  {
    AppMethodBeat.i(9304);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "chooseMediaFromAlbum");
    paramIntent.putExtra("key_pick_local_pic_capture", 4096);
    ((MMActivity)this.context).ifE = this;
    com.tencent.mm.bp.d.a(this.context, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 47, false);
    AppMethodBeat.o(9304);
  }

  private boolean aA(i parami)
  {
    AppMethodBeat.i(9339);
    if (!ao.cXP().hasInit)
    {
      a(parami, "videoProxyPreload:fail_has_not_init", null);
      AppMethodBeat.o(9339);
    }
    while (true)
    {
      return false;
      Object localObject = (String)parami.puc.get("webviewVideoProxyPlaydataId");
      int i = bo.getInt((String)parami.puc.get("webviewVideoProxyPreloadTime"), 0);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doWebviewProxyPreload, playDataId = %s, duration = %d", new Object[] { localObject, Integer.valueOf(i) });
      if (bo.isNullOrNil((String)localObject))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "playDataId is null or nil");
        a(parami, "videoProxyPreload:fail_invaild_play_data_id", null);
        AppMethodBeat.o(9339);
      }
      else
      {
        try
        {
          int j = bo.getInt((String)localObject, 0);
          localObject = new android/os/Bundle;
          ((Bundle)localObject).<init>();
          ((Bundle)localObject).putInt("webview_video_proxy_play_data_id", j);
          ((Bundle)localObject).putInt("webview_video_proxy_preload_duration", i);
          i = this.umI.g(5007, (Bundle)localObject).getInt("webview_video_proxy_pre_load_result");
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "preload video result = %d", new Object[] { Integer.valueOf(i) });
          if (i == 0)
            a(parami, "videoProxyPreload:ok", null);
          while (true)
          {
            AppMethodBeat.o(9339);
            break;
            a(parami, "videoProxyPreload:fail", null);
          }
        }
        catch (Exception localException)
        {
          a(parami, "videoProxyPreload:fail", null);
          AppMethodBeat.o(9339);
        }
      }
    }
  }

  // ERROR //
  private boolean aB(i parami)
  {
    // Byte code:
    //   0: sipush 9341
    //   3: invokestatic 155	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   10: ldc_w 3468
    //   13: invokeinterface 383 2 0
    //   18: checkcast 165	java/lang/String
    //   21: astore_2
    //   22: aload_1
    //   23: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   26: ldc_w 3470
    //   29: invokeinterface 383 2 0
    //   34: checkcast 165	java/lang/String
    //   37: astore_3
    //   38: ldc_w 363
    //   41: ldc_w 3472
    //   44: iconst_2
    //   45: anewarray 4	java/lang/Object
    //   48: dup
    //   49: iconst_0
    //   50: aload_2
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: aload_3
    //   55: aastore
    //   56: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   59: aload_2
    //   60: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   63: ifne +10 -> 73
    //   66: aload_3
    //   67: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   70: ifeq +29 -> 99
    //   73: ldc_w 363
    //   76: ldc_w 3474
    //   79: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   82: aload_0
    //   83: aload_1
    //   84: ldc_w 3476
    //   87: aconst_null
    //   88: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   91: sipush 9341
    //   94: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: iconst_1
    //   98: ireturn
    //   99: aload_2
    //   100: invokevirtual 579	java/lang/String:length	()I
    //   103: ifle +29 -> 132
    //   106: aload_2
    //   107: invokevirtual 579	java/lang/String:length	()I
    //   110: bipush 32
    //   112: if_icmpgt +20 -> 132
    //   115: aload_3
    //   116: invokevirtual 579	java/lang/String:length	()I
    //   119: ifle +13 -> 132
    //   122: aload_3
    //   123: invokevirtual 579	java/lang/String:length	()I
    //   126: sipush 1024
    //   129: if_icmple +30 -> 159
    //   132: ldc_w 363
    //   135: ldc_w 3478
    //   138: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   141: aload_0
    //   142: aload_1
    //   143: ldc_w 3476
    //   146: aconst_null
    //   147: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   150: sipush 9341
    //   153: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   156: goto -59 -> 97
    //   159: ldc_w 3480
    //   162: astore 4
    //   164: ldc_w 3480
    //   167: astore 5
    //   169: ldc_w 3480
    //   172: astore 6
    //   174: aload 6
    //   176: astore 7
    //   178: aload 5
    //   180: astore 8
    //   182: aload 4
    //   184: astore 9
    //   186: aload_0
    //   187: getfield 472	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:umI	Lcom/tencent/mm/plugin/webview/stub/e;
    //   190: bipush 77
    //   192: aconst_null
    //   193: invokeinterface 1046 3 0
    //   198: astore 10
    //   200: aload 6
    //   202: astore 7
    //   204: aload 5
    //   206: astore 8
    //   208: aload 4
    //   210: astore 9
    //   212: aload 10
    //   214: ifnull +201 -> 415
    //   217: aload 6
    //   219: astore 7
    //   221: aload 5
    //   223: astore 8
    //   225: aload 4
    //   227: astore 9
    //   229: aload 10
    //   231: ldc_w 3482
    //   234: invokevirtual 1642	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   237: invokestatic 669	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   240: astore 4
    //   242: aload 6
    //   244: astore 7
    //   246: aload 5
    //   248: astore 8
    //   250: aload 4
    //   252: astore 9
    //   254: aload 10
    //   256: ldc_w 3484
    //   259: invokevirtual 1642	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   262: invokestatic 669	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   265: astore 5
    //   267: aload 6
    //   269: astore 7
    //   271: aload 5
    //   273: astore 8
    //   275: aload 4
    //   277: astore 9
    //   279: aload 10
    //   281: ldc_w 3486
    //   284: invokevirtual 1642	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   287: invokestatic 669	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   290: astore 6
    //   292: aload 6
    //   294: astore 7
    //   296: aload 5
    //   298: astore 8
    //   300: aload 4
    //   302: astore 9
    //   304: aload 6
    //   306: invokestatic 3132	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   309: ifeq +54 -> 363
    //   312: aload 6
    //   314: astore 7
    //   316: aload 5
    //   318: astore 8
    //   320: aload 4
    //   322: astore 9
    //   324: ldc_w 363
    //   327: ldc_w 3488
    //   330: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   333: aload 6
    //   335: astore 7
    //   337: aload 5
    //   339: astore 8
    //   341: aload 4
    //   343: astore 9
    //   345: aload_0
    //   346: aload_1
    //   347: ldc_w 3476
    //   350: aconst_null
    //   351: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   354: sipush 9341
    //   357: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   360: goto -263 -> 97
    //   363: aload 6
    //   365: astore 7
    //   367: aload 5
    //   369: astore 8
    //   371: aload 4
    //   373: astore 9
    //   375: ldc_w 363
    //   378: ldc_w 3490
    //   381: iconst_3
    //   382: anewarray 4	java/lang/Object
    //   385: dup
    //   386: iconst_0
    //   387: aload 4
    //   389: aastore
    //   390: dup
    //   391: iconst_1
    //   392: aload 5
    //   394: aastore
    //   395: dup
    //   396: iconst_2
    //   397: aload 6
    //   399: aastore
    //   400: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   403: aload 4
    //   405: astore 9
    //   407: aload 5
    //   409: astore 8
    //   411: aload 6
    //   413: astore 7
    //   415: aload_0
    //   416: aload 7
    //   418: invokevirtual 2702	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:bK	(Ljava/lang/String;)Ljava/lang/String;
    //   421: astore 10
    //   423: aload 10
    //   425: invokestatic 3132	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   428: ifeq +53 -> 481
    //   431: ldc_w 363
    //   434: ldc_w 3492
    //   437: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   440: aload_0
    //   441: aload_1
    //   442: ldc_w 3476
    //   445: aconst_null
    //   446: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   449: sipush 9341
    //   452: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   455: goto -358 -> 97
    //   458: astore 6
    //   460: ldc_w 363
    //   463: ldc_w 3494
    //   466: iconst_1
    //   467: anewarray 4	java/lang/Object
    //   470: dup
    //   471: iconst_0
    //   472: aload 6
    //   474: aastore
    //   475: invokestatic 892	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   478: goto -63 -> 415
    //   481: ldc_w 363
    //   484: ldc_w 3496
    //   487: iconst_1
    //   488: anewarray 4	java/lang/Object
    //   491: dup
    //   492: iconst_0
    //   493: aload 10
    //   495: aastore
    //   496: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   499: iconst_0
    //   500: istore 11
    //   502: iconst_0
    //   503: istore 12
    //   505: aload_0
    //   506: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   509: invokestatic 3499	com/tencent/mm/sdk/platformtools/at:isConnected	(Landroid/content/Context;)Z
    //   512: ifeq +37 -> 549
    //   515: aload_0
    //   516: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   519: invokestatic 1519	com/tencent/mm/sdk/platformtools/at:isWifi	(Landroid/content/Context;)Z
    //   522: ifeq +236 -> 758
    //   525: iconst_1
    //   526: istore 11
    //   528: ldc_w 363
    //   531: ldc_w 3501
    //   534: iconst_1
    //   535: anewarray 4	java/lang/Object
    //   538: dup
    //   539: iconst_0
    //   540: iload 11
    //   542: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   545: aastore
    //   546: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   549: invokestatic 863	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   552: lstore 13
    //   554: ldc_w 363
    //   557: ldc_w 3503
    //   560: bipush 9
    //   562: anewarray 4	java/lang/Object
    //   565: dup
    //   566: iconst_0
    //   567: sipush 13379
    //   570: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   573: aastore
    //   574: dup
    //   575: iconst_1
    //   576: lload 13
    //   578: invokestatic 787	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   581: aastore
    //   582: dup
    //   583: iconst_2
    //   584: aload 10
    //   586: aastore
    //   587: dup
    //   588: iconst_3
    //   589: iload 11
    //   591: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   594: aastore
    //   595: dup
    //   596: iconst_4
    //   597: aload 8
    //   599: aastore
    //   600: dup
    //   601: iconst_5
    //   602: aload 7
    //   604: aastore
    //   605: dup
    //   606: bipush 6
    //   608: aload 9
    //   610: aastore
    //   611: dup
    //   612: bipush 7
    //   614: aload_2
    //   615: aastore
    //   616: dup
    //   617: bipush 8
    //   619: aload_3
    //   620: aastore
    //   621: invokestatic 1184	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   624: ldc_w 419
    //   627: astore 6
    //   629: aload 8
    //   631: invokestatic 669	com/tencent/mm/sdk/platformtools/bo:nullAsNil	(Ljava/lang/String;)Ljava/lang/String;
    //   634: ldc_w 872
    //   637: invokestatic 877	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   640: astore 8
    //   642: aload 8
    //   644: astore 6
    //   646: aload 7
    //   648: ldc_w 872
    //   651: invokestatic 877	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   654: astore 7
    //   656: aload 7
    //   658: astore 6
    //   660: aload_2
    //   661: ldc_w 872
    //   664: invokestatic 877	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   667: astore 7
    //   669: aload_3
    //   670: ldc_w 872
    //   673: invokestatic 877	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   676: astore 5
    //   678: getstatic 585	com/tencent/mm/plugin/report/service/h:pYm	Lcom/tencent/mm/plugin/report/service/h;
    //   681: sipush 13379
    //   684: bipush 8
    //   686: anewarray 4	java/lang/Object
    //   689: dup
    //   690: iconst_0
    //   691: lload 13
    //   693: invokestatic 787	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   696: aastore
    //   697: dup
    //   698: iconst_1
    //   699: aload 10
    //   701: aastore
    //   702: dup
    //   703: iconst_2
    //   704: iload 11
    //   706: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   709: aastore
    //   710: dup
    //   711: iconst_3
    //   712: aload 8
    //   714: aastore
    //   715: dup
    //   716: iconst_4
    //   717: aload 6
    //   719: aastore
    //   720: dup
    //   721: iconst_5
    //   722: aload 9
    //   724: aastore
    //   725: dup
    //   726: bipush 6
    //   728: aload 7
    //   730: aastore
    //   731: dup
    //   732: bipush 7
    //   734: aload 5
    //   736: aastore
    //   737: invokevirtual 649	com/tencent/mm/plugin/report/service/h:e	(I[Ljava/lang/Object;)V
    //   740: aload_0
    //   741: aload_1
    //   742: ldc_w 3505
    //   745: aconst_null
    //   746: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   749: sipush 9341
    //   752: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   755: goto -658 -> 97
    //   758: aload_0
    //   759: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   762: invokestatic 3508	com/tencent/mm/sdk/platformtools/at:is4G	(Landroid/content/Context;)Z
    //   765: ifeq +9 -> 774
    //   768: iconst_4
    //   769: istore 11
    //   771: goto -243 -> 528
    //   774: aload_0
    //   775: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   778: invokestatic 3511	com/tencent/mm/sdk/platformtools/at:is3G	(Landroid/content/Context;)Z
    //   781: ifeq +9 -> 790
    //   784: iconst_3
    //   785: istore 11
    //   787: goto -259 -> 528
    //   790: iload 12
    //   792: istore 11
    //   794: aload_0
    //   795: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   798: invokestatic 3514	com/tencent/mm/sdk/platformtools/at:is2G	(Landroid/content/Context;)Z
    //   801: ifeq -273 -> 528
    //   804: iconst_2
    //   805: istore 11
    //   807: goto -279 -> 528
    //   810: astore 5
    //   812: ldc_w 419
    //   815: astore 7
    //   817: ldc_w 419
    //   820: astore 4
    //   822: aload 6
    //   824: astore 8
    //   826: aload 4
    //   828: astore 6
    //   830: ldc_w 363
    //   833: aload 5
    //   835: ldc_w 419
    //   838: iconst_0
    //   839: anewarray 4	java/lang/Object
    //   842: invokestatic 423	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   845: ldc_w 419
    //   848: astore 5
    //   850: goto -172 -> 678
    //   853: astore 5
    //   855: ldc_w 419
    //   858: astore 7
    //   860: goto -30 -> 830
    //   863: astore 5
    //   865: goto -35 -> 830
    //
    // Exception table:
    //   from	to	target	type
    //   186	200	458	java/lang/Exception
    //   229	242	458	java/lang/Exception
    //   254	267	458	java/lang/Exception
    //   279	292	458	java/lang/Exception
    //   304	312	458	java/lang/Exception
    //   324	333	458	java/lang/Exception
    //   345	354	458	java/lang/Exception
    //   375	403	458	java/lang/Exception
    //   629	642	810	java/io/UnsupportedEncodingException
    //   646	656	810	java/io/UnsupportedEncodingException
    //   660	669	853	java/io/UnsupportedEncodingException
    //   669	678	863	java/io/UnsupportedEncodingException
  }

  private boolean aC(i parami)
  {
    AppMethodBeat.i(9342);
    int i = com.tencent.mm.plugin.webview.modelcache.q.a(parami);
    if (-1 == i)
    {
      a(this.umI, parami, "cache:fail", null, true, false);
      AppMethodBeat.o(9342);
      return true;
    }
    int j = -1;
    if (2 == i)
      j = 2;
    while (true)
    {
      if (-1 != j)
        com.tencent.mm.plugin.report.service.h.pYm.a(238L, j, 1L, false);
      com.tencent.mm.plugin.webview.modelcache.c.cYl();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "user not in white list");
      com.tencent.mm.plugin.webview.modelcache.n.IO(i);
      a(this.umI, parami, "cache:not in white list", null, true, false);
      AppMethodBeat.o(9342);
      break;
      if (1 == i)
        j = 1;
    }
  }

  private void aD(Intent paramIntent)
  {
    AppMethodBeat.i(9246);
    try
    {
      Bundle localBundle = this.umI.g(18, null);
      if (localBundle != null)
      {
        String str1 = localBundle.getString("preChatName");
        String str2 = localBundle.getString("preUsername");
        int i = localBundle.getInt("preChatTYPE", 0);
        paramIntent.putExtra("preChatName", str1);
        paramIntent.putExtra("preUsername", str2);
        paramIntent.putExtra("preChatTYPE", i);
        paramIntent.putExtra("preChatTYPE", i);
        paramIntent.putExtra("url", localBundle.getString("url"));
        paramIntent.putExtra("rawUrl", localBundle.getString("rawUrl"));
      }
      com.tencent.mm.plugin.webview.ui.tools.g.a(paramIntent.getExtras(), "profile", ".ui.ContactInfoUI", this.umI, new g.114(this, paramIntent));
      AppMethodBeat.o(9246);
      return;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
    }
  }

  private boolean aD(i parami)
  {
    AppMethodBeat.i(9343);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doAddCustomMenuItems start");
    int i;
    if (parami.puc.containsKey("hideMenu"))
    {
      i = bo.getInt((String)parami.puc.get("hideMenu"), 0);
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doAddCustomMenuItems hideMenu=".concat(String.valueOf(i)));
      boolean bool;
      if (i == 1)
      {
        bool = true;
        if (!od(bool))
          break label103;
        a(parami, "doAddCustomMenuItems:ok", null);
      }
      while (true)
      {
        AppMethodBeat.o(9343);
        return true;
        bool = false;
        break;
        label103: a(parami, "doAddCustomMenuItems:fail", null);
      }
    }
    od(false);
    Object localObject1 = (String)parami.puc.get("itemList");
    if (bo.isNullOrNil((String)localObject1))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doAddCustomMenuItems fail: key or title must not be null");
      a(parami, "doAddCustomMenuItems:params error", null);
    }
    while (true)
    {
      AppMethodBeat.o(9343);
      break;
      Object localObject2;
      ArrayList localArrayList;
      while (true)
      {
        Object localObject3;
        String str;
        try
        {
          localObject2 = new JSONArray((String)localObject1);
          localArrayList = new ArrayList();
          localObject1 = new ArrayList();
          int j = ((JSONArray)localObject2).length();
          i = 0;
          if (i >= j)
            break label337;
          localObject3 = ((JSONArray)localObject2).optJSONObject(i);
          if (localObject3 != null)
          {
            str = ((JSONObject)localObject3).optString("key");
            localObject3 = ((JSONObject)localObject3).optString("title");
            if ((!bo.isNullOrNil(str)) && (!bo.isNullOrNil("title")))
              break label318;
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "key or title is null,ignore item: ".concat(String.valueOf(i)));
          }
          i++;
          continue;
        }
        catch (JSONException localJSONException)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doAddCustomMenuItems eroor, parse itemList to jsonarray error");
          a(parami, "doAddCustomMenuItems:params parse error", null);
          AppMethodBeat.o(9343);
        }
        break;
        label318: localArrayList.add(str);
        localJSONException.add(localObject3);
      }
      label337: if (localArrayList.size() > 0)
      {
        localObject2 = new Bundle();
        ((Bundle)localObject2).putStringArrayList("keys", localArrayList);
        ((Bundle)localObject2).putStringArrayList("titles", localJSONException);
        try
        {
          this.umI.X((Bundle)localObject2);
          a(parami, "doAddCustomMenuItems:ok", null);
        }
        catch (RemoteException localRemoteException)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doAddCustomMenuItems:fail");
          a(parami, "doAddCustomMenuItems:fail", null);
        }
      }
    }
  }

  private boolean aE(i parami)
  {
    AppMethodBeat.i(9344);
    Object localObject1 = (String)parami.puc.get("key");
    if (bo.isNullOrNil((String)localObject1))
    {
      a(parami, "getLocalData:fail_key_is_null", null);
      AppMethodBeat.o(9344);
      return true;
    }
    Object localObject3;
    String str1;
    while (true)
    {
      String str2;
      String str3;
      try
      {
        localObject3 = this.umI.getCurrentUrl();
        str1 = new String(Base64.encode(((String)localObject1).getBytes(), 0));
        str2 = this.uGr.agj((String)localObject3);
        localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYI();
        str3 = bo.anB((String)localObject3);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", "get value by key = %s, appid = %s, domin = %s", new Object[] { str1, str2, str3 });
        if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)) && (!bo.isNullOrNil((String)localObject3)) && (!bo.isNullOrNil(str3)))
          break label218;
        localObject1 = null;
        label154: if (!bo.isNullOrNil((String)localObject1))
          break label320;
        a(parami, "getLocalData:fail", null);
        AppMethodBeat.o(9344);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "get url failed : %s", new Object[] { localException.getMessage() });
        a(parami, "getLocalData:fail", null);
        AppMethodBeat.o(9344);
      }
      break;
      label218: localObject3 = "select value from WebviewLocalData where recordId = ".concat(String.valueOf(am.au(str2, str3, str1)));
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", (String)localObject3);
      localObject3 = localException.rawQuery((String)localObject3, new String[0]);
      if (localObject3 != null)
        break label272;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.WebViewLocalDataStorage", "get cursor is null");
      localObject2 = null;
    }
    label272: if (((Cursor)localObject3).moveToFirst());
    for (Object localObject2 = ((Cursor)localObject3).getString(0); ; localObject2 = null)
    {
      ((Cursor)localObject3).close();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", "get value : %s for key : %s", new Object[] { localObject2, str1 });
      break label154;
      label320: localObject3 = new String(Base64.decode(((String)localObject2).getBytes(), 0));
      localObject2 = new HashMap();
      ((HashMap)localObject2).put("data", localObject3);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "get local data, key = %s, value = %s", new Object[] { str1, localObject3 });
      a(parami, "getLocalData:ok", (Map)localObject2);
      AppMethodBeat.o(9344);
      break;
    }
  }

  private boolean aF(i parami)
  {
    AppMethodBeat.i(9345);
    Object localObject1 = (String)parami.puc.get("key");
    String str1 = (String)parami.puc.get("data");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "set local data, key = %s, data = %s", new Object[] { localObject1, str1 });
    if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil(str1)))
    {
      a(parami, "setLocalData:fail_param_should_not_null", null);
      AppMethodBeat.o(9345);
    }
    while (true)
    {
      return true;
      if ((((String)localObject1).length() <= 1024) && (str1.length() <= 1024))
        break;
      a(parami, "setLocalData:fail_param_lenght_too_long", null);
      AppMethodBeat.o(9345);
    }
    while (true)
    {
      Object localObject3;
      String str3;
      String str4;
      String str5;
      try
      {
        String str2 = this.umI.getCurrentUrl();
        localObject1 = Base64.encode(((String)localObject1).getBytes(), 0);
        localObject3 = Base64.encode(str1.getBytes(), 0);
        str1 = new String((byte[])localObject1);
        str3 = new String((byte[])localObject3);
        str4 = this.uGr.agj(str2);
        localObject3 = com.tencent.mm.plugin.webview.modeltools.g.cYI();
        str5 = bo.anB(str2);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", "set data, key = %s, value = %s, url = %s, appId = %s, domin = %s", new Object[] { str1, str3, str2, str4, str5 });
        if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)) && (!bo.isNullOrNil(str4)) && (!bo.isNullOrNil(str5)))
          break label359;
        str2 = "fail_params_invalid";
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSetLocalData retValue = %s", new Object[] { str2 });
        a(parami, "setLocalData:".concat(String.valueOf(str2)), null);
        AppMethodBeat.o(9345);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "get url failed : %s", new Object[] { localException.getMessage() });
        a(parami, "setLocalData:fail", null);
        AppMethodBeat.o(9345);
      }
      break;
      label359: int i = am.au(str4, str5, str1);
      Object localObject2 = "select count(*) from WebviewLocalData where appId = '" + str4 + "' and domin = '" + str5 + "'";
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", (String)localObject2);
      localObject1 = ((am)localObject3).rawQuery((String)localObject2, new String[0]);
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((Cursor)localObject1).moveToFirst())
        {
          int j = ((Cursor)localObject1).getInt(0);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", "now count = %d", new Object[] { Integer.valueOf(j) });
          ((Cursor)localObject1).close();
          if (j >= 5)
          {
            localObject2 = "fail_exceed_max_count";
          }
          else
          {
            String str6 = "select count(*) from WebviewLocalData where recordId =".concat(String.valueOf(i));
            localObject1 = ((am)localObject3).rawQuery(str6, new String[0]);
            localObject2 = localObject1;
            if (localObject1 != null)
            {
              if (((Cursor)localObject1).moveToFirst())
              {
                j = ((Cursor)localObject1).getInt(0);
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", "sql = %s, count = %d", new Object[] { str6, Integer.valueOf(j) });
                ((Cursor)localObject1).close();
                if (j > 0)
                {
                  localObject2 = "update WebviewLocalData set value = '" + str3 + "' where recordId =" + i;
                  boolean bool = ((am)localObject3).hY("WebviewLocalData", (String)localObject2);
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", "sql = %s, ret = %b", new Object[] { localObject2, Boolean.valueOf(bool) });
                  if (bool)
                  {
                    localObject2 = "ok";
                    continue;
                  }
                  localObject2 = "fail";
                  continue;
                }
              }
              ((Cursor)localObject1).close();
              localObject2 = localObject1;
            }
          }
        }
        else
        {
          ((Cursor)localObject2).close();
        }
      }
      else
      {
        localObject2 = new com.tencent.mm.plugin.webview.model.al();
        ((com.tencent.mm.plugin.webview.model.al)localObject2).field_appId = str4;
        ((com.tencent.mm.plugin.webview.model.al)localObject2).field_domin = str5;
        ((com.tencent.mm.plugin.webview.model.al)localObject2).field_key = str1;
        ((com.tencent.mm.plugin.webview.model.al)localObject2).field_value = str3;
        ((com.tencent.mm.plugin.webview.model.al)localObject2).field_recordId = i;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", "insert data, ret = %b", new Object[] { Boolean.valueOf(((am)localObject3).b((com.tencent.mm.sdk.e.c)localObject2)) });
        localObject2 = "ok";
      }
    }
  }

  private boolean aG(i parami)
  {
    AppMethodBeat.i(9346);
    try
    {
      String str1 = this.umI.getCurrentUrl();
      localam = com.tencent.mm.plugin.webview.modeltools.g.cYI();
      str3 = this.uGr.agj(str1);
      str4 = bo.anB(str1);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewLocalDataStorage", "appid = %s, url = %s, domin = %s", new Object[] { str3, str1, str4 });
      if ((bo.isNullOrNil(str3)) || (bo.isNullOrNil(str1)) || (bo.isNullOrNil(str4)))
      {
        str1 = "fail";
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doClearLocalData retValue = %s", new Object[] { str1 });
        a(parami, "clearLocalData:".concat(String.valueOf(str1)), null);
        AppMethodBeat.o(9346);
        return true;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        am localam;
        String str3;
        String str4;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "get url failed : %s", new Object[] { localException.getMessage() });
        a(parami, "clearLocalData:fail", null);
        AppMethodBeat.o(9346);
        continue;
        String str2;
        if (localam.hY("WebviewLocalData", "delete from WebviewLocalData where appId = '" + str3 + "' and domin = '" + str4 + "'"))
          str2 = "ok";
        else
          str2 = "fail";
      }
    }
  }

  private int aGu()
  {
    int i = 0;
    AppMethodBeat.i(9296);
    int j = i;
    try
    {
      if (this.umI != null)
      {
        Bundle localBundle = this.umI.g(99, null);
        j = i;
        if (localBundle != null)
          j = localBundle.getInt("geta8key_scene");
      }
      AppMethodBeat.o(9296);
      return j;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "invokeAsResult error.%s", new Object[] { localRemoteException });
        j = i;
      }
    }
  }

  private boolean aH(i parami)
  {
    AppMethodBeat.i(9347);
    Object localObject1 = (String)parami.puc.get("useridlist");
    String str1 = (String)parami.puc.get("chatname");
    String str2 = (String)parami.puc.get("chatscene");
    String str3;
    LinkedList localLinkedList;
    boolean bool;
    try
    {
      Object localObject2 = this.umI.getCurrentUrl();
      str3 = bo.nullAsNil(this.uGr.agj((String)localObject2));
      localObject2 = new LinkedList();
      localObject1 = ((String)localObject1).split(";");
      if ((localObject1 != null) && (localObject1.length > 0))
      {
        int i = localObject1.length;
        for (int j = 0; j < i; j++)
          ((LinkedList)localObject2).add(localObject1[j]);
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localRemoteException.getMessage() });
        localLinkedList = null;
      }
      a(parami, "openEnterpriseChat:fail", null);
      AppMethodBeat.o(9347);
      bool = false;
    }
    while (true)
    {
      return bool;
      com.tencent.mm.aj.z.aeZ();
      parami = new com.tencent.mm.aj.a.t(str3, str1, localLinkedList, new g.107(this, parami, str2));
      com.tencent.mm.kernel.g.RO().eJo.a(parami, 0);
      AppMethodBeat.o(9347);
      bool = true;
    }
  }

  private boolean aI(i parami)
  {
    AppMethodBeat.i(9348);
    String str1 = (String)parami.puc.get("chatId");
    String str2 = (String)parami.puc.get("chatType");
    try
    {
      String str3 = this.umI.getCurrentUrl();
      str3 = bo.nullAsNil(this.uGr.agj(str3));
      if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)) || (bo.isNullOrNil(str3)))
      {
        a(parami, "enterEnterpriseChat:fail_params error", null);
        AppMethodBeat.o(9348);
        return true;
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localRemoteException.getMessage() });
        String str4 = null;
        continue;
        com.tencent.mm.aj.z.aeZ();
        parami = new com.tencent.mm.aj.a.m(str4, str1, str2, new g.108(this, parami));
        com.tencent.mm.kernel.g.RO().eJo.a(parami, 0);
        AppMethodBeat.o(9348);
      }
    }
  }

  private boolean aJ(i parami)
  {
    AppMethodBeat.i(9349);
    try
    {
      String str = this.umI.getCurrentUrl();
      str = bo.nullAsNil(this.uGr.agj(str));
      if (bo.isNullOrNil(str))
      {
        a(parami, "getEnterpriseChat:fail", null);
        AppMethodBeat.o(9349);
      }
      while (true)
      {
        return true;
        Object localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        ((Bundle)localObject1).putString("enterprise_action", "enterprise_get_context_bizchat");
        Object localObject2 = this.umI.g(71, (Bundle)localObject1);
        localObject1 = ((Bundle)localObject2).getString("enterprise_context_biz");
        localObject2 = com.tencent.mm.aj.a.e.fD(((Bundle)localObject2).getLong("enterprise_context_bizchatid", -1L));
        if ((bo.isNullOrNil((String)localObject1)) || (bo.isNullOrNil((String)localObject2)))
        {
          a(parami, "getEnterpriseChat:fail_not in enterprise chat", null);
          AppMethodBeat.o(9349);
        }
        else
        {
          g.109 local109 = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$109;
          local109.<init>(this, parami);
          com.tencent.mm.aj.t.a(local109);
          if (!com.tencent.mm.aj.t.o(str, (String)localObject1, (String)localObject2))
          {
            com.tencent.mm.aj.t.b(local109);
            a(parami, "getEnterpriseChat:fail", null);
          }
          AppMethodBeat.o(9349);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
        a(parami, "getEnterpriseChat:fail", null);
    }
  }

  private boolean aK(i parami)
  {
    AppMethodBeat.i(9350);
    try
    {
      Object localObject1 = this.umI.getCurrentUrl();
      String str = bo.nullAsNil(this.uGr.agj((String)localObject1));
      if (bo.isNullOrNil(str))
        a(parami, "openEnterpriseContact:fail", null);
      localObject1 = new com.tencent.mm.plugin.webview.model.m(str, (String)localObject1, parami.puc);
      com.tencent.mm.kernel.g.Rg().a(1393, new g.110(this, parami, this));
      com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
      parami = this.context;
      this.context.getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b(parami, this.context.getString(2131297086), true, new g.111(this, (com.tencent.mm.plugin.webview.model.m)localObject1));
      AppMethodBeat.o(9350);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localRemoteException.getMessage() });
        Object localObject2 = null;
      }
    }
  }

  private boolean aL(i parami)
  {
    AppMethodBeat.i(9351);
    try
    {
      localObject1 = this.umI.getCurrentUrl();
      localObject3 = bo.nullAsNil(this.uGr.agj((String)localObject1));
      if (bo.isNullOrNil((String)localObject3))
        a(parami, "selectEnterpriseContact:fail", null);
      parami.puc.put("groupId", "");
      parami.puc.put("timestamp", "");
      parami.puc.put("nonceStr", "");
      parami.puc.put("signature", "");
      localJSONObject = new JSONObject();
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        JSONObject localJSONObject;
        Object localObject4 = (String)parami.puc.get("type");
        Object localObject5 = new org/json/JSONArray;
        ((JSONArray)localObject5).<init>((String)localObject4);
        localJSONObject.put("fromDepartmentId", bo.ank((String)parami.puc.get("fromDepartmentId")));
        localJSONObject.put("mode", (String)parami.puc.get("mode"));
        localJSONObject.put("type", localObject5);
        localObject5 = (String)parami.puc.get("selectedDepartmentIds");
        if (localObject5 != null)
        {
          localObject4 = new org/json/JSONArray;
          ((JSONArray)localObject4).<init>((String)localObject5);
          localJSONObject.put("selectedDepartmentIds", localObject4);
        }
        localObject5 = (String)parami.puc.get("selectedUserIds");
        if (localObject5 != null)
        {
          localObject4 = new org/json/JSONArray;
          ((JSONArray)localObject4).<init>((String)localObject5);
          localJSONObject.put("selectedUserIds", localObject4);
        }
        parami.puc.put("params", localJSONObject);
        Object localObject1 = new com.tencent.mm.plugin.webview.model.m((String)localObject3, (String)localObject1, parami.puc);
        Object localObject3 = new g.112(this, parami, this);
        com.tencent.mm.kernel.g.Rg().a(1393, (com.tencent.mm.ai.f)localObject3);
        com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
        parami = this.context;
        this.context.getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b(parami, this.context.getString(2131297086), true, new g.113(this, (com.tencent.mm.plugin.webview.model.m)localObject1, (com.tencent.mm.ai.f)localObject3));
        AppMethodBeat.o(9351);
        return true;
        localRemoteException = localRemoteException;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localRemoteException.getMessage() });
        Object localObject2 = null;
      }
      catch (JSONException localJSONException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSelectEnterpriseContact ex: %s", new Object[] { localJSONException.getMessage() });
      }
      catch (NumberFormatException localNumberFormatException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSelectEnterpriseContact ex: %s", new Object[] { localNumberFormatException.getMessage() });
      }
    }
  }

  private boolean aM(i parami)
  {
    AppMethodBeat.i(9352);
    boolean bool;
    if (this.umI == null)
    {
      a(parami, "sendEnterpriseChat:fail", null);
      bool = true;
      AppMethodBeat.o(9352);
    }
    String str1;
    long l;
    String str2;
    String str3;
    String str4;
    while (true)
    {
      return bool;
      try
      {
        Object localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        ((Bundle)localObject1).putString("enterprise_action", "enterprise_get_context_bizchat");
        localObject1 = this.umI.g(71, (Bundle)localObject1);
        str1 = ((Bundle)localObject1).getString("enterprise_context_biz");
        l = ((Bundle)localObject1).getLong("enterprise_context_bizchatid", -1L);
        if ((bo.isNullOrNil(str1)) || (l < 0L))
        {
          a(parami, "sendEnterpriseChat:fail_not in enterprise chat", null);
          bool = true;
          AppMethodBeat.o(9352);
          continue;
        }
        localObject1 = (String)parami.puc.get("type");
        if ("text".equals(localObject1))
        {
          bool = a(parami, str1, l);
          AppMethodBeat.o(9352);
          continue;
        }
        if (!"link".equals(localObject1))
          break label616;
        str2 = (String)parami.puc.get("data");
        localObject1 = new org/json/JSONObject;
        ((JSONObject)localObject1).<init>(str2);
        localObject3 = ((JSONObject)localObject1).optString("link");
        str3 = ((JSONObject)localObject1).optString("title");
        str2 = ((JSONObject)localObject1).optString("desc");
        str4 = ((JSONObject)localObject1).optString("imgUrl");
        if ((!bo.isNullOrNil(str3)) || (!bo.isNullOrNil(str2)))
          break label314;
        a(parami, "sendEnterpriseChat:fail_params error", null);
        bool = true;
        AppMethodBeat.o(9352);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "clear webview cache fail : %s", new Object[] { localException.getMessage() });
        a(parami, "sendEnterpriseChat:fail", null);
        bool = true;
        AppMethodBeat.o(9352);
      }
      continue;
      label314: if (!bo.isNullOrNil((String)localObject3))
        break;
      a(parami, "sendEnterpriseChat:fail_params error", null);
      bool = true;
      AppMethodBeat.o(9352);
    }
    Object localObject2 = new com/tencent/mm/opensdk/modelmsg/WXWebpageObject;
    ((WXWebpageObject)localObject2).<init>();
    ((WXWebpageObject)localObject2).webpageUrl = ((String)localObject3);
    Object localObject3 = new com/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    ((WXMediaMessage)localObject3).<init>();
    this.cEl = ((WXMediaMessage)localObject3);
    this.cEl.mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
    this.cEl.title = str3;
    this.cEl.description = str2;
    localObject2 = (String)parami.puc.get("appid");
    if ((this.uGh != null) && (TextUtils.isEmpty((CharSequence)localObject2)))
      localObject2 = this.uGh.getString("jsapi_args_appid");
    while (true)
    {
      com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.bT((String)localObject2, true);
      if ((this.context == null) || (this.context.getResources() == null))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "showSendAppMsgDialog fail, context or context.getResources() is null");
        a(parami, "sendEnterpriseChat:fail", null);
        bool = true;
        AppMethodBeat.o(9352);
        break;
      }
      if (!(this.context instanceof Activity))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "showsSendAppMsgDialog fail, context is not activity");
        a(parami, "sendEnterpriseChat:fail", null);
        bool = true;
        AppMethodBeat.o(9352);
        break;
      }
      localObject3 = t.a.vlq;
      com.tencent.mm.ui.q localq = ((MMActivity)this.context).mController;
      String str5 = this.context.getResources().getString(2131297041);
      g.115 local115 = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$115;
      local115.<init>(this, str4, l, localf, (String)localObject2, str1, parami);
      ((com.tencent.mm.pluginsdk.ui.applet.t)localObject3).a(localq, str3, str4, str2, true, str5, local115);
      bool = true;
      AppMethodBeat.o(9352);
      break;
      label616: a(parami, "sendEnterpriseChat:fail_params error", null);
      bool = true;
      AppMethodBeat.o(9352);
      break;
    }
  }

  private boolean aN(i parami)
  {
    AppMethodBeat.i(9354);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "start doChangePayActivityView");
    aq localaq = new aq();
    Object localObject1 = (String)parami.puc.get("showInfo");
    boolean bool;
    if (bo.isNullOrNil((String)localObject1))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "changePayActivityView eroor, parse showinfo to jsonarray error");
      a(parami, "changePayActivityView:fail", null);
      AppMethodBeat.o(9354);
      bool = false;
      return bool;
    }
    while (true)
    {
      try
      {
        Object localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        localaq.ctH.ctJ = ((JSONObject)localObject2).getString("buttonTitle");
        Object localObject3 = ((JSONObject)localObject2).getString("isButtonEnable");
        localObject1 = ((JSONObject)localObject2).getString("isButtonHidden");
        localObject2 = ((JSONObject)localObject2).getString("isActivityViewHidden");
        Object localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("isButtonEnable:");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", (String)localObject3 + " isButtonHidden:" + (String)localObject1 + " isActivityViewHidden:" + (String)localObject2);
        localObject4 = localaq.ctH;
        if (bo.getInt((String)localObject3, 0) > 0)
        {
          bool = true;
          ((aq.a)localObject4).ctK = bool;
          localObject3 = localaq.ctH;
          if (bo.getInt((String)localObject1, 0) <= 0)
            continue;
          bool = true;
          ((aq.a)localObject3).ctL = bool;
          localObject1 = localaq.ctH;
          if (bo.getInt((String)localObject2, 0) <= 0)
            continue;
          bool = true;
          ((aq.a)localObject1).ctM = bool;
          com.tencent.mm.sdk.b.a.xxA.m(localaq);
          if (!localaq.ctI.csN)
            break label350;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "changePayActivityView:ok");
          a(parami, "changePayActivityView:ok", null);
          AppMethodBeat.o(9354);
          bool = true;
          break;
        }
        bool = false;
        continue;
        bool = false;
        continue;
        bool = false;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "changePayActivityView eroor, parse showinfo to jsonarray error");
        a(parami, "changePayActivityView:fail", null);
        AppMethodBeat.o(9354);
        bool = false;
      }
      break;
      label350: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "changePayActivityView:fail");
      a(parami, "changePayActivityView:fail", null);
    }
  }

  private boolean aO(i parami)
  {
    AppMethodBeat.i(9355);
    Object localObject = (String)parami.puc.get("idKeyDataInfo");
    if (bo.isNullOrNil((String)localObject))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "idkey data is null");
      a(parami, "reportIDKey:fail_invaild_parms", null);
      AppMethodBeat.o(9355);
    }
    while (true)
    {
      return false;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject);
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>();
        for (int i = 0; i < localJSONArray.length(); i++)
        {
          JSONObject localJSONObject = localJSONArray.optJSONObject(i);
          localObject = new com/tencent/mars/smc/IDKey;
          ((IDKey)localObject).<init>();
          ((IDKey)localObject).SetID(bo.getInt(localJSONObject.optString("id"), 0));
          ((IDKey)localObject).SetKey(bo.getInt(localJSONObject.optString("key"), 0));
          ((IDKey)localObject).SetValue(bo.getInt(localJSONObject.optString("value"), 0));
          localArrayList.add(localObject);
        }
        if (localArrayList.size() > 0)
        {
          com.tencent.mm.plugin.report.service.h.pYm.b(localArrayList, true);
          a(parami, "reportIDKey:ok", null);
          AppMethodBeat.o(9355);
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "parse json array faild : %s", new Object[] { localException.getMessage() });
        a(parami, "reportIDKey:fail", null);
        AppMethodBeat.o(9355);
      }
    }
  }

  private boolean aP(i parami)
  {
    AppMethodBeat.i(9356);
    String str1 = (String)parami.puc.get("url");
    String str2 = (String)parami.puc.get("open_game_webview");
    String str3 = (String)parami.puc.get("city_service_ext");
    boolean bool = bo.getBoolean((String)parami.puc.get("inject_city_service_js"), false);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "open url with extra webview, url = %s, cityServiceId = %s, injectJs = %b", new Object[] { str1, str3, Boolean.valueOf(bool) });
    if (bo.isNullOrNil(str1))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "url is null or nil");
      a(parami, "openUrlWithExtraWebview:fail_invalid_url", null);
      AppMethodBeat.o(9356);
    }
    while (true)
    {
      return true;
      final Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str1);
      localIntent.putExtra("convertActivityFromTranslucent", false);
      localIntent.putExtra("city_service_ext_info", str3);
      localIntent.putExtra("inject_city_service_js", bool);
      localIntent.putExtra("start_activity_time", System.currentTimeMillis());
      try
      {
        Bundle localBundle = this.umI.g(18, null);
        if (localBundle != null)
        {
          String str4 = localBundle.getString("prePublishId");
          str3 = localBundle.getString("preChatName");
          str1 = localBundle.getString("preUsername");
          i = localBundle.getInt("preChatTYPE", 0);
          localIntent.putExtra("prePublishId", str4);
          localIntent.putExtra("preUsername", str1);
          localIntent.putExtra("preChatName", str3);
          localIntent.putExtra("preChatTYPE", i);
        }
        int i = bo.getInt((String)parami.puc.get("scene"), -1);
        str3 = (String)parami.puc.get("bizUsername");
        if ((!bo.isNullOrNil(str3)) && (i != -1))
        {
          localIntent.putExtra("geta8key_scene", i);
          localIntent.putExtra("geta8key_username", str3);
        }
        if (bo.nullAsNil(str2).equals("1"))
        {
          com.tencent.mm.plugin.webview.ui.tools.g.a(localIntent.getExtras(), "webview", ".ui.tools.game.GameWebViewUI", this.umI, new g.118(this, localIntent));
          a(parami, "openUrlWithExtraWebview:ok", null);
          AppMethodBeat.o(9356);
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
          continue;
          com.tencent.mm.plugin.webview.ui.tools.g.a(localIntent.getExtras(), "webview", ".ui.tools.WebViewUI", this.umI, new Runnable()
          {
            public final void run()
            {
              AppMethodBeat.i(9196);
              com.tencent.mm.bp.d.b(g.i(g.this), "webview", ".ui.tools.WebViewUI", localIntent);
              AppMethodBeat.o(9196);
            }
          });
        }
      }
    }
  }

  private boolean aQ(i parami)
  {
    AppMethodBeat.i(9357);
    Object localObject1 = (String)parami.puc.get("url");
    if (bo.isNullOrNil((String)localObject1))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "url is null or nil");
      a(parami, "openCunstonWebview:fail_invalid_url", null);
      AppMethodBeat.o(9357);
      return true;
    }
    Object localObject2 = bo.nullAsNil((String)parami.puc.get("orientation"));
    if (!bo.isNullOrNil((String)localObject2))
      if (!((String)localObject2).equals("horizontal"));
    label724: for (int i = 0; ; i = -1)
      while (true)
      {
        boolean bool1 = false;
        if (bo.nullAsNil((String)parami.puc.get("fullscreen")).equals("true"))
          bool1 = true;
        parami.puc.get("top_url");
        parami.puc.get("top_title");
        boolean bool2 = false;
        try
        {
          if (this.umI != null)
          {
            localObject3 = this.umI;
            localObject2 = new android/os/Bundle;
            ((Bundle)localObject2).<init>();
            bool2 = ((com.tencent.mm.plugin.webview.stub.e)localObject3).g(81, (Bundle)localObject2).getBoolean("from_shortcut", false);
          }
          bool3 = bool2;
          j = 0;
          if (bo.nullAsNil((String)parami.puc.get("finish_recent_webview")).equals("1"))
            j = 1;
          bool4 = false;
          if (bo.nullAsNil((String)parami.puc.get("disable_swipe_back")).equals("1"))
            bool4 = true;
          localObject3 = bo.nullAsNil((String)parami.puc.get("username"));
          localObject2 = bo.nullAsNil((String)parami.puc.get("open_game_webview"));
          bool2 = false;
        }
        catch (Exception localException1)
        {
          try
          {
            Object localObject3;
            boolean bool3;
            int j;
            boolean bool4;
            if (this.umI != null)
            {
              localObject4 = this.umI;
              localObject5 = new android/os/Bundle;
              ((Bundle)localObject5).<init>();
              bool2 = ((com.tencent.mm.plugin.webview.stub.e)localObject4).g(86, (Bundle)localObject5).getBoolean("is_from_keep_top");
            }
            Object localObject5 = bo.nullAsNil((String)parami.puc.get("gameAppid"));
            localObject4 = new Intent();
            ((Intent)localObject4).putExtra("rawUrl", (String)localObject1);
            ((Intent)localObject4).putExtra("screen_orientation", i);
            ((Intent)localObject4).putExtra("show_full_screen", bool1);
            ((Intent)localObject4).putExtra("disable_swipe_back", bool4);
            ((Intent)localObject4).putExtra("from_shortcut", bool3);
            ((Intent)localObject4).putExtra("shortcut_user_name", (String)localObject3);
            ((Intent)localObject4).putExtra("is_from_keep_top", bool2);
            ((Intent)localObject4).putExtra("game_hv_menu_appid", (String)localObject5);
            ((Intent)localObject4).putExtra("start_activity_time", System.currentTimeMillis());
            if (bool3)
            {
              com.tencent.mm.bp.d.b(this.context, "webview", ".ui.tools.game.H5GameWebViewUI", (Intent)localObject4);
              if ((j != 0) && (!bool3))
                com.tencent.mm.sdk.platformtools.al.n(new g.121(this), 200L);
              localObject1 = new gu();
              ((gu)localObject1).cBw.Cn = 2;
              ((gu)localObject1).cBw.cBy = ((String)localObject5);
              com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
              a(parami, "openCunstonWebview:ok", null);
              AppMethodBeat.o(9357);
              break;
              if (((String)localObject2).equals("vertical"))
              {
                i = 1;
                continue;
              }
              if (!((String)localObject2).equals("sensor"))
                break label724;
              i = 4;
              continue;
              localException1 = localException1;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenCustomWebview, get from shortcut exception : %s", new Object[] { localException1.getMessage() });
              bool3 = false;
            }
          }
          catch (Exception localException2)
          {
            while (true)
            {
              Object localObject4;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenCustomWebview, get from keep top exception : %s", new Object[] { localException2.getMessage() });
              bool2 = false;
              continue;
              if (bo.nullAsNil(localException1).equals("1"))
                com.tencent.mm.plugin.webview.ui.tools.g.a(((Intent)localObject4).getExtras(), "webview", ".ui.tools.game.GameWebViewUI", this.umI, new g.120(this, (Intent)localObject4));
              else
                com.tencent.mm.bp.d.b(this.context, "webview", ".ui.tools.WebViewUI", (Intent)localObject4);
            }
          }
        }
      }
  }

  private boolean aR(i parami)
  {
    AppMethodBeat.i(9358);
    Object localObject = bo.nullAsNil((String)parami.puc.get("orientation"));
    int i = -1;
    int j = i;
    if (!bo.isNullOrNil((String)localObject))
    {
      if (!((String)localObject).equals("horizontal"))
        break label105;
      j = 0;
    }
    try
    {
      if (this.umI != null)
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
        ((Bundle)localObject).putInt("screen_orientation", j);
        this.umI.g(1009, (Bundle)localObject);
        a(parami, "setScreenOrientation:ok", null);
      }
      while (true)
      {
        AppMethodBeat.o(9358);
        return true;
        label105: if (((String)localObject).equals("vertical"))
        {
          j = 1;
          break;
        }
        if (((String)localObject).equals("sensor"))
        {
          j = 4;
          break;
        }
        if (((String)localObject).equals("horizontal_unforced"))
        {
          j = 1001;
          break;
        }
        j = i;
        if (!((String)localObject).equals("vertical_unforced"))
          break;
        j = 1002;
        break;
        a(parami, "setScreenOrientation:fail", null);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSetScreenOrientation exception, " + localException.getMessage());
        a(parami, "setScreenOrientation:fail", null);
      }
    }
  }

  private boolean aS(i parami)
  {
    AppMethodBeat.i(9359);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "setNavigationBarColor");
    boolean bool = "1".equals((String)parami.puc.get("actionCode"));
    Bundle localBundle = new Bundle();
    if (bool)
      localBundle.putBoolean("set_navigation_bar_color_reset", true);
    try
    {
      while (true)
      {
        this.umI.g(53, localBundle);
        a(parami, "setNavigationBarColor:ok", null);
        AppMethodBeat.o(9359);
        return true;
        try
        {
          i = Color.parseColor((String)parami.puc.get("color"));
          j = i | 0xFF000000;
        }
        catch (Exception localException2)
        {
          try
          {
            while (true)
            {
              float f = bo.getFloat((String)parami.puc.get("alpha"), 1.0F);
              int k = (int)(f * 255.0F);
              if (k >= 0)
              {
                i = k;
                if (k <= 255);
              }
              else
              {
                i = 255;
              }
              localBundle.putInt("set_navigation_bar_color_color", j);
              localBundle.putInt("set_navigation_bar_color_alpha", i);
              break;
              localException2 = localException2;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", localException2.getMessage());
              localBundle.putBoolean("set_navigation_bar_color_reset", true);
              int j = -1;
            }
          }
          catch (Exception localException3)
          {
            while (true)
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", localException3.getMessage());
              int i = -1;
            }
          }
        }
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", localException1.getMessage());
        a(parami, "setNavigationBarColor:fail", null);
      }
    }
  }

  private boolean aT(i parami)
  {
    AppMethodBeat.i(9362);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact");
    String str = (String)parami.puc.get("openid");
    if (bo.isNullOrNil(str))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact openid is null");
      a(parami, "sendAppMessageToSpecifiedContact:fail", null);
      AppMethodBeat.o(9362);
    }
    while (true)
    {
      return true;
      Object localObject1 = (String)parami.puc.get("appId");
      Object localObject2 = localObject1;
      if (this.uGh != null)
      {
        localObject2 = localObject1;
        if (TextUtils.isEmpty((CharSequence)localObject1))
          localObject2 = this.uGh.getString("jsapi_args_appid");
      }
      if (bo.isNullOrNil((String)localObject2))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact appid is null");
        a(parami, "sendAppMessageToSpecifiedContact:fail", null);
        AppMethodBeat.o(9362);
      }
      else
      {
        this.cEl = g(parami);
        localObject1 = new ac((String)localObject2, str);
        com.tencent.mm.kernel.g.Rg().a(1142, new g.130(this, parami, (String)localObject2));
        com.tencent.mm.kernel.g.Rg().a((com.tencent.mm.ai.m)localObject1, 0);
        parami = this.context;
        this.context.getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b(parami, this.context.getString(2131297086), true, new g.131(this, (ac)localObject1));
        AppMethodBeat.o(9362);
      }
    }
  }

  private boolean aV(i parami)
  {
    AppMethodBeat.i(9366);
    Object localObject = (String)parami.puc.get("clearCookie");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "clearflag = %s", new Object[] { localObject });
    if ((!bo.isNullOrNil((String)localObject)) && (((String)localObject).equalsIgnoreCase("true")));
    for (boolean bool = true; ; bool = false)
    {
      localObject = (String)parami.puc.get("url");
      if (!bo.isNullOrNil((String)localObject))
      {
        localObject = com.tencent.mm.plugin.webview.modelcache.q.aeJ((String)localObject);
        if (!bo.isNullOrNil((String)localObject))
          break label175;
        localObject = null;
        if (!bo.isNullOrNil((String)localObject))
          r.a.cYq().aNS().aa(new g.133(this, (String)localObject));
      }
      if (this.umI != null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putBoolean("clear_webview_cache_clear_cookie", bool);
      }
      while (true)
      {
        try
        {
          this.umI.g(6001, (Bundle)localObject);
          a(parami, "clearWebviewCache:ok", null);
          AppMethodBeat.o(9366);
          return true;
          label175: localObject = Uri.parse((String)localObject);
          localObject = ((Uri)localObject).getHost() + ":" + ((Uri)localObject).getPort();
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "clear webview cache fail : %s", new Object[] { localException.getMessage() });
          a(parami, "clearWebviewCache:fail", null);
          AppMethodBeat.o(9366);
          continue;
        }
        a(parami, "clearWebviewCache:fail", null);
        AppMethodBeat.o(9366);
      }
    }
  }

  private boolean aa(i parami)
  {
    AppMethodBeat.i(9302);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doChooseMedia()");
    boolean bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)this.context, "android.permission.CAMERA", 119, "", "");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
      AppMethodBeat.o(9302);
    while (true)
    {
      return true;
      bool = com.tencent.mm.pluginsdk.permission.b.a((Activity)this.context, "android.permission.RECORD_AUDIO", 120, "", "");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool) });
      if (bool)
        break;
      AppMethodBeat.o(9302);
    }
    Object localObject = bo.nullAsNil((String)parami.puc.get("sourceType"));
    String str1 = bo.nullAsNil((String)parami.puc.get("mediaType"));
    int i = Math.min(bo.getInt((String)parami.puc.get("maxDuration"), 10), 10);
    String str2 = bo.nullAsNil((String)parami.puc.get("camera"));
    int j = bo.getInt((String)parami.puc.get("count"), 1);
    String str3 = bo.nullAsNil((String)parami.puc.get("sizeType"));
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doChooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s", new Object[] { localObject, str1, Integer.valueOf(i), str2, Integer.valueOf(j), str3 });
    Intent localIntent = new Intent();
    localIntent.putExtra("key_pick_local_pic_count", j);
    if (i <= 0)
      i = 10;
    while (true)
    {
      localIntent.putExtra("key_pick_local_media_duration", i);
      localIntent.putExtra("query_media_type", 3);
      localIntent.putExtra("key_pick_local_media_video_type", 2);
      localIntent.putExtra("key_pick_local_media_sight_type", str1);
      if ((str3.contains("original") ^ str3.contains("compressed")))
      {
        i = 7;
        label395: localIntent.putExtra("key_pick_local_pic_query_source_type", i);
        if (!str3.contains("compressed"))
          break label534;
        bool = true;
        label419: localIntent.putExtra("key_pick_local_pic_send_raw", Boolean.valueOf(bool));
        if (!bo.isNullOrNil((String)localObject))
          break label609;
        localObject = "album|camera";
      }
      label534: label609: 
      while (true)
      {
        if ((((String)localObject).contains("album")) && (((String)localObject).contains("camera")))
        {
          localObject = new com.tencent.mm.ui.tools.j(this.context);
          ((com.tencent.mm.ui.tools.j)localObject).b(null, new g.78(this), new g.79(this, str2, localIntent));
          ((com.tencent.mm.ui.tools.j)localObject).e(new g.80(this, parami));
          ((com.tencent.mm.ui.tools.j)localObject).cuu();
          AppMethodBeat.o(9302);
          break;
          i = 8;
          break label395;
          bool = false;
          break label419;
        }
        if (((String)localObject).contains("album"))
        {
          aA(localIntent);
          AppMethodBeat.o(9302);
          break;
        }
        if (((String)localObject).contains("camera"))
        {
          b(str2, localIntent);
          AppMethodBeat.o(9302);
          break;
        }
        a(parami, "chooseMedia:fail_sourceType_error", null);
        AppMethodBeat.o(9302);
        break;
      }
    }
  }

  private boolean ab(i parami)
  {
    AppMethodBeat.i(9306);
    String str1 = (String)parami.puc.get("appId");
    String str2 = (String)parami.puc.get("localId");
    Object localObject = parami.puc.get("isShowProgressTips");
    if (localObject != null);
    boolean bool;
    label181: WebViewJSSDKFileItem localWebViewJSSDKFileItem;
    while (true)
    {
      try
      {
        int i = bo.getInt(localObject.toString(), 0);
        if (i == 1)
        {
          bool = true;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "uploadMediaFile, appid = %s, localid = %s, isShowProgressTips(%s)", new Object[] { str1, str2, Boolean.valueOf(bool) });
          if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)))
            break label181;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "appId or localid is null or nil.");
          a(parami, "uploadMediaFile:fail_missing arguments", null);
          AppMethodBeat.o(9306);
          return true;
        }
        bool = false;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
      bool = true;
      continue;
      l.a(parami.uII, false, null, str1);
      localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(str2);
      if (localWebViewJSSDKFileItem != null)
        break;
      a(parami, "uploadMediaFile:fail", null);
      AppMethodBeat.o(9306);
    }
    switch (localWebViewJSSDKFileItem.cyQ)
    {
    case 2:
    case 3:
    default:
      b(parami, str1, str2, com.tencent.mm.i.a.efM, 202, 2, "uploadMediaFile", bool);
    case 1:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(9306);
      break;
      a(parami, str1, str2, com.tencent.mm.i.a.efJ, 202, 2, "uploadMediaFile", bool);
      continue;
      b(parami, str1, str2, com.tencent.mm.i.a.efK, 202, 2, "uploadMediaFile", bool);
    }
  }

  private boolean ac(i parami)
  {
    AppMethodBeat.i(9310);
    String str1 = (String)parami.puc.get("appId");
    String str2 = (String)parami.puc.get("localId");
    Object localObject = parami.puc.get("isShowProgressTips");
    if (localObject != null);
    while (true)
    {
      try
      {
        int i = bo.getInt(localObject.toString(), 0);
        if (i == 1)
        {
          bool = true;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "upload local video, appId = %s, localId = %s, isShowProgressTips(%s)", new Object[] { str1, str2, Boolean.valueOf(bool) });
          if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil(str2)))
            break label181;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "appId or localId is null or nil.");
          a(parami, "uploadVideo:fail_missing arguments", null);
          AppMethodBeat.o(9310);
          return true;
        }
        bool = false;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Exception has occurred : %s", new Object[] { localException.getMessage() });
      }
      boolean bool = true;
      continue;
      label181: b(parami, str1, str2, com.tencent.mm.i.a.MediaType_FILE, 0, 0, "uploadVideo", bool);
      AppMethodBeat.o(9310);
    }
  }

  private boolean ad(i parami)
  {
    AppMethodBeat.i(9312);
    if (dcC());
    while (true)
    {
      try
      {
        this.umI.c(2007, null);
        a(parami, "startRecord:fail_recording", null);
        AppMethodBeat.o(9312);
        return true;
      }
      catch (Exception localException1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "callback start record failed");
        continue;
      }
      String str = (String)parami.puc.get("appId");
      if (bo.isNullOrNil(str))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "appId is null or nil.");
        a(parami, "startRecord:fail_missing arguments", null);
        AppMethodBeat.o(9312);
        continue;
      }
      l.a(parami.uII, false, null, str);
      if (!com.tencent.mm.pluginsdk.permission.b.o(this.context, "android.permission.RECORD_AUDIO"))
      {
        parami = this.context;
        localObject = this.umI;
        int i = this.cIv;
        WebViewStubTempUI.a(parami, (com.tencent.mm.plugin.webview.stub.e)localObject, new String[] { "android.permission.RECORD_AUDIO" }, 116, i);
        AppMethodBeat.o(9312);
        continue;
      }
      Object localObject = com.tencent.mm.plugin.webview.model.ap.aeF(str);
      WebViewJSSDKFileItem localWebViewJSSDKFileItem = WebViewJSSDKFileItem.aev((String)localObject);
      localWebViewJSSDKFileItem.appId = str;
      com.tencent.mm.plugin.webview.modeltools.g.cYF().b(localWebViewJSSDKFileItem);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "start record appId : %s, voice file name : %s, voice file path : %s", new Object[] { str, localObject, localWebViewJSSDKFileItem.heo });
      this.uGP = localWebViewJSSDKFileItem.czD;
      com.tencent.mm.sdk.platformtools.al.d(new g.89(this, localWebViewJSSDKFileItem, parami));
      try
      {
        this.umI.c(2007, null);
        a(parami, "startRecord:ok", null);
        AppMethodBeat.o(9312);
      }
      catch (Exception localException2)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "callback start record failed");
      }
    }
  }

  private boolean ae(i parami)
  {
    AppMethodBeat.i(9313);
    if (!dcC())
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Do not in recording state.");
      a(parami, "stopRecord:fail", null);
      AppMethodBeat.o(9313);
    }
    while (true)
    {
      return true;
      Object localObject = (String)parami.puc.get("appId");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "stop record appId : %s", new Object[] { localObject });
      l.a(parami.uII, false, null, (String)localObject);
      WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(this.uGP);
      if ((localWebViewJSSDKFileItem == null) || (!((String)localObject).equals(localWebViewJSSDKFileItem.appId)))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "get jssdk file item by id failed or the appid is not corrected, appid is : %s", new Object[] { localObject });
        a(parami, "stopRecord:fail", null);
        AppMethodBeat.o(9313);
        continue;
      }
      com.tencent.mm.sdk.platformtools.al.d(new g.91(this, localWebViewJSSDKFileItem));
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "stop record, file name  : %s, file path : %s, localid : %s", new Object[] { localWebViewJSSDKFileItem.fileName, localWebViewJSSDKFileItem.heo, localWebViewJSSDKFileItem.czD });
      localObject = new HashMap();
      ((HashMap)localObject).put("localId", localWebViewJSSDKFileItem.czD);
      try
      {
        this.umI.c(2009, null);
        a(parami, "stopRecord:ok", (Map)localObject);
        AppMethodBeat.o(9313);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "callback on stop record failed.");
      }
    }
  }

  private boolean af(i parami)
  {
    AppMethodBeat.i(9314);
    Object localObject1 = (String)parami.puc.get("appId");
    String str = (String)parami.puc.get("localId");
    Object localObject2 = parami.puc.get("isShowProgressTips");
    if (localObject2 != null);
    boolean bool1;
    while (true)
    {
      try
      {
        int i = bo.getInt(localObject2.toString(), 0);
        if (i == 1)
        {
          bool1 = true;
          l.a(parami.uII, false, null, (String)localObject1);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doUploadVoice, appId : %s, localId : %s, isShowProgressTips(%s)", new Object[] { localObject1, str, Boolean.valueOf(bool1) });
          if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil(str)))
            break;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "appId or localId is null or nil.");
          a(parami, "uploadVoice:fail_missing arguments", null);
          AppMethodBeat.o(9314);
          return true;
        }
        bool1 = false;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
      bool1 = true;
    }
    g.96 local96 = new g.96(this, str, parami);
    boolean bool2 = com.tencent.mm.plugin.webview.modeltools.g.cYE().b((String)localObject1, str, local96);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doUploadVoice, add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool2) });
    if (!bool2)
      a(parami, "uploadVoice:fail", null);
    while (true)
    {
      AppMethodBeat.o(9314);
      break;
      if (bool1)
      {
        localObject1 = this.context;
        this.context.getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject1, this.context.getString(2131305732), true, new g.97(this, local96, str, parami));
      }
    }
  }

  private boolean ag(final i parami)
  {
    AppMethodBeat.i(9315);
    Object localObject1 = (String)parami.puc.get("appId");
    final String str = (String)parami.puc.get("serverId");
    Object localObject2 = parami.puc.get("isShowProgressTips");
    if (localObject2 != null);
    while (true)
    {
      try
      {
        int i = bo.getInt(localObject2.toString(), 0);
        if (i == 1)
        {
          bool = true;
          l.a(parami.uII, false, null, (String)localObject1);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doDownloadVoice, appid is : %s, media id is : %s, isShowProgDialog(%s)", new Object[] { localObject1, str, Boolean.valueOf(bool) });
          if (!bo.isNullOrNil(str))
            break label175;
          a(parami, "downloadVoice:fail_invaild_serverId", null);
          AppMethodBeat.o(9315);
          return true;
        }
        bool = false;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
      boolean bool = true;
      continue;
      label175: final g.98 local98 = new g.98(this, str, parami);
      com.tencent.mm.plugin.webview.modeltools.g.cYE().a((String)localObject1, str, local98);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doDownloadVoice, add cdn download task result : %b", new Object[] { Boolean.TRUE });
      if (bool)
      {
        localObject1 = this.context;
        this.context.getString(2131297061);
        this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject1, this.context.getString(2131305702), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            AppMethodBeat.i(9167);
            com.tencent.mm.plugin.webview.modeltools.g.cYE().a(local98);
            com.tencent.mm.plugin.webview.modeltools.g.cYE();
            aj.aet(str);
            g.a(g.this, parami, "downloadVoice:fail", null);
            AppMethodBeat.o(9167);
          }
        });
      }
      AppMethodBeat.o(9315);
    }
  }

  private boolean agA(String paramString)
  {
    AppMethodBeat.i(9266);
    Object localObject = BluetoothAdapter.getDefaultAdapter();
    if ((Build.VERSION.SDK_INT >= 18) && (localObject != null))
    {
      com.tencent.mm.sdk.b.a.xxA.c(this.qwg);
      paramString = bo.nullAsNil(paramString);
      this.uGA.put(paramString, paramString);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "[MsgHandler][doStartIBeaconRange]op=true,iBeacon = %s", new Object[] { paramString });
      localObject = ah.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).edit();
      ((SharedPreferences.Editor)localObject).putBoolean("isNewScanning", true);
      ((SharedPreferences.Editor)localObject).commit();
      if (com.tencent.mm.kernel.g.RK())
        com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xMm, Boolean.TRUE);
      localObject = new ds();
      ((ds)localObject).cxg.cxi = paramString;
      ((ds)localObject).cxg.cxf = true;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    }
    AppMethodBeat.o(9266);
    return true;
  }

  private void agv(String paramString)
  {
    AppMethodBeat.i(9223);
    if (this.uGh == null)
      this.uGh = new Bundle();
    int i = bo.getInt(paramString, 33);
    int j = i;
    if (this.uGh.getBoolean("KFromBizSearch"))
    {
      paramString = this.uGh.getBundle("KBizSearchExtArgs");
      j = i;
      if (paramString != null)
        j = paramString.getInt("Contact_Scene");
    }
    this.uGh.putInt("Contact_Scene", j);
    AppMethodBeat.o(9223);
  }

  private boolean agw(String paramString)
  {
    AppMethodBeat.i(9224);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getFromMenu, functionName = ".concat(String.valueOf(paramString)));
    boolean bool;
    if (this.uGf.contains(paramString))
    {
      this.uGf.remove(paramString);
      bool = true;
      AppMethodBeat.o(9224);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(9224);
    }
  }

  private static String agz(String paramString)
  {
    AppMethodBeat.i(9252);
    if (paramString.startsWith("http://"))
    {
      paramString = paramString.substring(7);
      AppMethodBeat.o(9252);
    }
    while (true)
    {
      return paramString;
      if (paramString.startsWith("https://"))
      {
        paramString = paramString.substring(8);
        AppMethodBeat.o(9252);
      }
      else
      {
        AppMethodBeat.o(9252);
      }
    }
  }

  private boolean ah(i parami)
  {
    AppMethodBeat.i(9316);
    Object localObject1 = (String)parami.puc.get("menuList");
    if (bo.isNullOrNil((String)localObject1))
    {
      a(parami, "hideMenuItems:param is empty", null);
      AppMethodBeat.o(9316);
    }
    while (true)
    {
      return true;
      try
      {
        Object localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>((String)localObject1);
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        for (int i = 0; i < ((JSONArray)localObject2).length(); i++)
          ((ArrayList)localObject1).add(((JSONArray)localObject2).getString(i));
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        ((Bundle)localObject2).putStringArrayList("menu_item_list", (ArrayList)localObject1);
        this.umI.q(3001, (Bundle)localObject2);
        a(parami, "hideMenuItems:ok", null);
        AppMethodBeat.o(9316);
      }
      catch (JSONException localJSONException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "JSONException : %s", new Object[] { localJSONException.getMessage() });
        a(parami, "hideMenuItems:param is empty", null);
        AppMethodBeat.o(9316);
      }
      catch (RemoteException localRemoteException)
      {
        a(parami, "hideMenuItems:param is empty", null);
        AppMethodBeat.o(9316);
      }
    }
  }

  private boolean ai(i parami)
  {
    AppMethodBeat.i(9317);
    Object localObject1 = (String)parami.puc.get("menuList");
    if (bo.isNullOrNil((String)localObject1))
    {
      a(parami, "showMenuItems:param is empty", null);
      AppMethodBeat.o(9317);
    }
    while (true)
    {
      return true;
      try
      {
        Object localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>((String)localObject1);
        localObject1 = new java/util/ArrayList;
        ((ArrayList)localObject1).<init>();
        for (int i = 0; i < ((JSONArray)localObject2).length(); i++)
          ((ArrayList)localObject1).add(((JSONArray)localObject2).getString(i));
        localObject2 = new android/os/Bundle;
        ((Bundle)localObject2).<init>();
        ((Bundle)localObject2).putStringArrayList("menu_item_list", (ArrayList)localObject1);
        this.umI.q(3002, (Bundle)localObject2);
        a(parami, "showMenuItems:ok", null);
        AppMethodBeat.o(9317);
      }
      catch (JSONException localJSONException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "JSONException : %s", new Object[] { localJSONException.getMessage() });
        a(parami, "showMenuItems:param is empty", null);
        AppMethodBeat.o(9317);
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "RemoteException : %s", new Object[] { localRemoteException.getMessage() });
          a(parami, "showMenuItems:param is empty", null);
        }
      }
    }
  }

  private boolean aj(i parami)
  {
    AppMethodBeat.i(9320);
    try
    {
      this.umI.q(3003, null);
      a(parami, "hideAllNonBaseMenuItem:ok", null);
      AppMethodBeat.o(9320);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "RemoteException : %s", new Object[] { localRemoteException.getMessage() });
        a(parami, "hideAllNonBaseMenuItem:param is empty", null);
      }
    }
  }

  private boolean ak(i parami)
  {
    AppMethodBeat.i(9321);
    try
    {
      this.umI.q(3004, null);
      a(parami, "showAllNonBaseMenuItem:ok", null);
      AppMethodBeat.o(9321);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "RemoteException : %s", new Object[] { localRemoteException.getMessage() });
        a(parami, "showAllNonBaseMenuItem:param is empty", null);
      }
    }
  }

  private boolean al(i parami)
  {
    AppMethodBeat.i(9322);
    String str = (String)parami.puc.get("jsApiList");
    if (bo.isNullOrNil(str))
    {
      a(parami, "checkJsApi:param is empty", null);
      AppMethodBeat.o(9322);
    }
    while (true)
    {
      return true;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        Object localObject = new org/json/JSONArray;
        ((JSONArray)localObject).<init>(str);
        if (((JSONArray)localObject).length() == 0)
        {
          a(parami, "checkJsApi:param is empty", null);
          AppMethodBeat.o(9322);
        }
        else
        {
          int i = 0;
          if (i < ((JSONArray)localObject).length())
          {
            str = ((JSONArray)localObject).getString(i);
            if (com.tencent.mm.protocal.c.akD(str) == null)
            {
              if (c.me.vxh == null)
              {
                HashSet localHashSet = new java/util/HashSet;
                localHashSet.<init>();
                c.me.vxh = localHashSet;
                localHashSet.add("menu:share:QZone");
                c.me.vxh.add("onImageDownloadProgress");
                c.me.vxh.add("onVoiceUploadProgress");
                c.me.vxh.add("onVoiceDownloadProgress");
                c.me.vxh.add("onVoiceRecordEnd");
                c.me.vxh.add("onVoicePlayBegin");
                c.me.vxh.add("onVoicePlayEnd");
                c.me.vxh.add("onLocalImageUploadProgress");
                c.me.vxh.add("wxdownload:state_change");
                c.me.vxh.add("wxdownload:progress_change");
                c.me.vxh.add("hdOnDeviceStateChanged");
                c.me.vxh.add("activity:state_change");
                c.me.vxh.add("onWXDeviceBluetoothStateChange");
                c.me.vxh.add("onWXDeviceLanStateChange");
                c.me.vxh.add("onWXDeviceBindStateChange");
                c.me.vxh.add("onReceiveDataFromWXDevice");
                c.me.vxh.add("onScanWXDeviceResult");
                c.me.vxh.add("onWXDeviceStateChange");
                c.me.vxh.add("onGetKeyboardHeight");
                c.me.vxh.add("onGetSmiley");
                c.me.vxh.add("onAddShortcutStatus");
                c.me.vxh.add("onMediaFileUploadProgess");
                c.me.vxh.add("onGetA8KeyUrl");
                c.me.vxh.add("onPageStateChange");
                c.me.vxh.add("onGetMsgProofItems");
                c.me.vxh.add("onNavigationBarRightButtonClick");
                c.me.vxh.add("onBackgroundAudioStateChange");
                c.me.vxh.add("onNetWorkChange");
                c.me.vxh.add("onCustomGameMenuClicked");
                c.me.vxh.add("onArticleReadingBtnClicked");
                c.me.vxh.add("onRecordHistory");
                c.me.vxh.add("onBeaconsInRange");
                c.me.vxh.add("onMiniProgramData");
              }
              if (!c.me.vxh.contains(str))
                break label564;
            }
            label564: for (boolean bool = true; ; bool = false)
            {
              localJSONObject.put(str, bool);
              i++;
              break;
            }
          }
          localObject = new java/util/HashMap;
          ((HashMap)localObject).<init>();
          ((HashMap)localObject).put("checkResult", localJSONObject.toString());
          a(parami, "checkJsApi:ok", (Map)localObject);
          AppMethodBeat.o(9322);
        }
      }
      catch (JSONException localJSONException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "JSONException : %s", new Object[] { localJSONException.getMessage() });
        a(parami, "checkJsApi:param is empty", null);
        AppMethodBeat.o(9322);
      }
    }
  }

  private boolean am(i parami)
  {
    AppMethodBeat.i(9323);
    try
    {
      String str = (String)parami.puc.get("userName");
      try
      {
        i = ((Integer)parami.puc.get("type")).intValue();
        a(parami, "setFreeWifiOwner:ok", null);
        parami = new android/content/Intent;
        parami.<init>();
        parami.putExtra("wifi_owner_name", str);
        parami.putExtra("wifi_owner_type", i);
        com.tencent.mm.bp.d.c(this.context, "freewifi", ".ui.FreeWifiOwnerUI", parami);
        AppMethodBeat.o(9323);
        return false;
      }
      catch (Exception localException)
      {
        while (true)
          int i = 0;
      }
    }
    catch (Exception parami)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "setFreeWifiOwner, Exception: %s", new Object[] { parami.getMessage() });
    }
  }

  private boolean an(i parami)
  {
    AppMethodBeat.i(9324);
    Object localObject1 = (String)parami.puc.get("appId");
    String str = (String)parami.puc.get("localId");
    Object localObject2 = parami.puc.get("isShowProgressTips");
    if (localObject2 != null);
    boolean bool;
    while (true)
    {
      try
      {
        int i = bo.getInt(localObject2.toString(), 0);
        if (i == 1)
        {
          bool = true;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "isShowProgressTips(%s)", new Object[] { Boolean.valueOf(bool) });
          l.a(parami.uII, false, null, (String)localObject1);
          if ((!bo.isNullOrNil((String)localObject1)) && (!bo.isNullOrNil(str)))
            break;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "The localId(%s) is null or appId(%s) is null.", new Object[] { str, localObject1 });
          a(parami, "translateVoice:fail_missing arguments", null);
          AppMethodBeat.o(9324);
          return true;
        }
        bool = false;
        continue;
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
      bool = true;
    }
    localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(str);
    if (localObject1 != null)
      com.tencent.mm.sdk.platformtools.al.d(new g.101(this, bool, parami, str, (WebViewJSSDKFileItem)localObject1));
    while (true)
    {
      AppMethodBeat.o(9324);
      break;
      a(parami, "translateVoice:fail_arguments error", null);
    }
  }

  private boolean ao(i parami)
  {
    AppMethodBeat.i(9325);
    WWMediaLink localWWMediaLink = new WWMediaLink();
    localWWMediaLink.thumbUrl = ((String)parami.puc.get("img_url"));
    try
    {
      localWWMediaLink.webpageUrl = ar.aek(this.umI.getCurrentUrl());
      localWWMediaLink.title = ((String)parami.puc.get("title"));
      localWWMediaLink.description = ((String)parami.puc.get("desc"));
      WWAPIFactory.jv(this.context).a(localWWMediaLink);
      a(parami, "shareWeWork:ok", null);
      AppMethodBeat.o(9325);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
        localWWMediaLink.webpageUrl = ((String)parami.puc.get("link"));
      }
    }
  }

  private boolean ap(i parami)
  {
    AppMethodBeat.i(9326);
    if (!com.tencent.mm.plugin.webview.stub.a.fq(this.context))
    {
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Tencent QQ hasn't installed at all.");
      a(parami, "shareQQ:fail", null);
      AppMethodBeat.o(9326);
    }
    Object localObject3;
    while (true)
    {
      return true;
      if (this.cEl == null)
        this.cEl = g(parami);
      String str1 = (String)parami.puc.get("img_url");
      Object localObject1 = (String)parami.puc.get("title");
      String str2 = (String)parami.puc.get("desc");
      String str3 = this.context.getResources().getString(2131296982);
      String str4 = (String)parami.puc.get("link");
      Object localObject2 = str4;
      try
      {
        if (bo.isNullOrNil(str4))
          localObject2 = this.umI.getCurrentUrl();
        str4 = ar.aek((String)localObject2);
        localObject2 = localObject1;
        if (bo.isNullOrNil((String)localObject1))
          localObject2 = this.context.getString(2131305561);
        if ((bo.isNullOrNil(str4)) || (bo.isNullOrNil((String)localObject2)))
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "url(%s) or title(%s) or description(%s) is null or nil.", new Object[] { str4, localObject2, str2 });
          a(parami, "shareQQ:fail", null);
          AppMethodBeat.o(9326);
        }
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Get current url fail. exception : %s", new Object[] { localRemoteException.getMessage() });
          localObject3 = str4;
        }
        localObject1 = new HashMap();
        ((Map)localObject1).put("image_url", u.akl(str1));
        ((Map)localObject1).put("title", u.akl((String)localObject3));
        ((Map)localObject1).put("description", u.akl(str2));
        ((Map)localObject1).put("url", u.akl(str4));
        ((Map)localObject1).put("app_name", u.akl(str3));
        ((Map)localObject1).put("req_type", u.akl("1"));
        if (parami.uIJ.equalsIgnoreCase("shareQZone"))
          ((Map)localObject1).put("cflag", u.akl("1"));
        localObject3 = new StringBuilder();
        ((StringBuilder)localObject3).append("mqqapi://share/to_fri?file_type=news&share_id=1103188687");
        ((StringBuilder)localObject3).append("&");
        ((StringBuilder)localObject3).append(u.aR((Map)localObject1));
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "Uri : %s", new Object[] { ((StringBuilder)localObject3).toString() });
        localObject3 = new Intent("android.intent.action.VIEW", Uri.parse(((StringBuilder)localObject3).toString()));
        ((Intent)localObject3).putExtra("pkg_name", "com.tencent.mm");
        ((Intent)localObject3).getStringExtra("pkg_name");
        ((Intent)localObject3).setFlags(268435456);
        if (!"shareQQ".equals(parami.uIJ))
          break label638;
      }
    }
    int i = 5;
    label533: this.uGv.bE(i, (String)parami.puc.get("use_update_jsapi_data"));
    if ((bo.k(this.context, (Intent)localObject3)) && ((this.context instanceof Activity)))
    {
      gB(i, 1);
      ((Activity)this.context).startActivityForResult((Intent)localObject3, 44);
      a(parami, parami.uIJ + ":ok", null);
    }
    while (true)
    {
      AppMethodBeat.o(9326);
      break;
      label638: i = 6;
      break label533;
      gB(i, 2);
      a(parami, parami.uIJ + ":fail", null);
    }
  }

  private boolean aq(i parami)
  {
    AppMethodBeat.i(9327);
    Object localObject1 = (String)parami.puc.get("desc");
    String str = (String)parami.puc.get("img_url");
    Object localObject2 = (String)parami.puc.get("link");
    Object localObject3 = localObject2;
    Object localObject4;
    try
    {
      if (bo.isNullOrNil((String)localObject2))
        localObject3 = this.umI.getCurrentUrl();
      localObject2 = ar.aek((String)localObject3);
      if (bo.isNullOrNil((String)localObject2))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "link is null or nil.");
        a(parami, "shareWeiboApp:fail", null);
        AppMethodBeat.o(9327);
        return true;
      }
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "Get current url fail. exception : %s", new Object[] { localRemoteException.getMessage() });
        localObject4 = localObject2;
      }
      localObject4 = localObject1;
      if (bo.isNullOrNil((String)localObject1))
      {
        localObject4 = (String)parami.puc.get("title");
        localObject4 = (String)localObject4 + " " + (String)localObject2;
      }
      localObject1 = new HashMap();
      ((Map)localObject1).put("type", Integer.valueOf(0));
      ((Map)localObject1).put("openLBS", Integer.valueOf(0));
      ((Map)localObject1).put("content", u.akk((String)localObject4));
      ((Map)localObject1).put("url", u.akk(str));
      ((Map)localObject1).put("thumbnailurl", u.akk(str));
      localObject4 = new Intent("android.intent.action.VIEW", Uri.parse("weibo://t.qq.com/proxy/write"));
      localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("TencentWeibo://Edit?from=weixin&");
      ((StringBuilder)localObject2).append(u.aR((Map)localObject1));
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "Uri : %s", new Object[] { ((StringBuilder)localObject2).toString() });
      ((Intent)localObject4).putExtra("microblog.intent.extra.ACTION", ((StringBuilder)localObject2).toString());
      ((Intent)localObject4).setFlags(268435456);
      if (!bo.k(this.context, (Intent)localObject4))
        break label412;
    }
    this.context.startActivity((Intent)localObject4);
    a(parami, "shareWeiboApp:ok", null);
    while (true)
    {
      AppMethodBeat.o(9327);
      break;
      label412: a(parami, "shareWeiboApp:fail", null);
    }
  }

  private boolean ar(i parami)
  {
    AppMethodBeat.i(9328);
    String str = (String)parami.puc.get("sessionId");
    Object localObject1 = (String)parami.puc.get("sessionFrom");
    if (bo.isNullOrNil(str))
    {
      a(parami, "startTempSession:fail_missing arguments", null);
      AppMethodBeat.o(9328);
      return true;
    }
    if (localObject1 != null);
    while (true)
    {
      try
      {
        localObject3 = URLEncoder.encode((String)localObject1, "UTF-8");
        localObject1 = localObject3;
        localObject3 = parami.puc.get("showType");
        if (localObject3 != null)
          if ((localObject3 instanceof Integer))
          {
            i = ((Integer)localObject3).intValue();
            j = bo.getInt(bo.nullAsNil((String)parami.puc.get("scene")), 0);
          }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        try
        {
          int j;
          Object localObject3 = String.format("weixin://dl/business/tempsession/?username=%s&appid=%s&sessionFrom=%s&showtype=%s&scene=%s", new Object[] { str, this.uGr.agj(this.umI.getCurrentUrl()), bo.nullAsNil((String)localObject1), Integer.valueOf(i), Integer.valueOf(j) });
          localObject1 = new android/content/Intent;
          ((Intent)localObject1).<init>("android.intent.action.VIEW");
          ((Intent)localObject1).addCategory("android.intent.category.BROWSABLE");
          ((Intent)localObject1).setData(Uri.parse((String)localObject3));
          if (j != 0)
          {
            ((Intent)localObject1).putExtra("translate_link_scene", j);
            this.context.startActivity((Intent)localObject1);
            a(parami, "startTempSession:ok", null);
            AppMethodBeat.o(9328);
            break;
            localUnsupportedEncodingException = localUnsupportedEncodingException;
            continue;
            if (!(localUnsupportedEncodingException instanceof String))
              continue;
            try
            {
              i = bo.getInt((String)localUnsupportedEncodingException, 0);
            }
            catch (NumberFormatException localNumberFormatException)
            {
              i = 0;
            }
            continue;
          }
          ((Intent)localObject1).putExtra("translate_link_scene", 4);
          continue;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
          a(parami, "startTempSession:fail_exception", null);
          continue;
        }
        int i = 0;
        continue;
      }
      Object localObject2 = null;
    }
  }

  private boolean as(i parami)
  {
    AppMethodBeat.i(9329);
    try
    {
      String str1 = (String)parami.puc.get("userName");
      String str2 = (String)parami.puc.get("nickName");
      if (bo.isNullOrNil(str1))
      {
        a(parami, "setPageOwner:missing_arguments", null);
        AppMethodBeat.o(9329);
      }
      while (true)
      {
        return false;
        this.umI.hd(str1, str2);
        a(parami, "setPageOwner:ok", null);
        AppMethodBeat.o(9329);
      }
    }
    catch (Exception parami)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "setPageOwner, Exception: %s", new Object[] { parami.getMessage() });
    }
  }

  private boolean at(i parami)
  {
    AppMethodBeat.i(9330);
    try
    {
      String str1 = (String)parami.puc.get("appId");
      String str2 = (String)parami.puc.get("signature");
      l.a(parami.uII, false, null, str1);
      if (bo.isNullOrNil(str1))
      {
        a(parami, "get_wechat_verify_ticket:fail ticket", null);
        AppMethodBeat.o(9330);
      }
      while (true)
      {
        return false;
        g.102 local102 = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$102;
        local102.<init>(this, parami);
        com.tencent.mm.kernel.g.Rg().a(1097, local102);
        parami = new com/tencent/mm/plugin/webview/model/k;
        parami.<init>(str1, str2);
        com.tencent.mm.kernel.g.Rg().a(parami, 0);
        AppMethodBeat.o(9330);
      }
    }
    catch (Exception parami)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "getWechatVerifyTicket, Exception: %s", new Object[] { parami.getMessage() });
    }
  }

  private boolean av(i parami)
  {
    AppMethodBeat.i(9334);
    try
    {
      Object localObject1 = this.umI.g(5001, null);
      if (localObject1 != null)
      {
        int i = ((Bundle)localObject1).getInt("webview_video_proxy_init");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "int webview video proxy : %d", new Object[] { Integer.valueOf(i) });
        localObject1 = new java/util/HashMap;
        ((HashMap)localObject1).<init>();
        ((Map)localObject1).put("videoProxyInitResult", Integer.valueOf(i));
        Object localObject2;
        IDKey localIDKey;
        if (i == 0)
        {
          localObject2 = ao.cXP();
          ((ao)localObject2).umI = this.umI;
          ((ao)localObject2).hasInit = true;
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          localIDKey = new com/tencent/mars/smc/IDKey;
          localIDKey.<init>();
          localIDKey.SetID(142);
          localIDKey.SetKey(0);
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          localIDKey = new com/tencent/mars/smc/IDKey;
          localIDKey.<init>();
          localIDKey.SetID(142);
          localIDKey.SetKey(1);
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          com.tencent.mm.plugin.report.service.h.pYm.b((ArrayList)localObject2, false);
          a(parami, "videoProxyInit:ok", (Map)localObject1);
        }
        while (true)
        {
          AppMethodBeat.o(9334);
          return false;
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          localIDKey = new com/tencent/mars/smc/IDKey;
          localIDKey.<init>();
          localIDKey.SetID(142);
          localIDKey.SetKey(0);
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          localIDKey = new com/tencent/mars/smc/IDKey;
          localIDKey.<init>();
          localIDKey.SetID(142);
          localIDKey.SetKey(2);
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          localIDKey = new com/tencent/mars/smc/IDKey;
          localIDKey.<init>();
          localIDKey.SetID(142);
          localIDKey.SetKey(com.tencent.mm.plugin.webview.ui.tools.b.Jg(i));
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          com.tencent.mm.plugin.report.service.h.pYm.b((ArrayList)localObject2, false);
          a(parami, "videoProxyInit:fail", (Map)localObject1);
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doinit webview proxy failed : %s", new Object[] { localException.getMessage() });
        a(parami, "videoProxyInit:fail", null);
        AppMethodBeat.o(9334);
      }
    }
  }

  private boolean aw(i parami)
  {
    AppMethodBeat.i(9335);
    if (!ao.cXP().hasInit)
    {
      a(parami, "videoProxyStartPlay:fail_has_not_init", null);
      AppMethodBeat.o(9335);
    }
    while (true)
    {
      return false;
      Object localObject1 = (String)parami.puc.get("webviewVideoProxyCdnUrls");
      String str = (String)parami.puc.get("webviewVideoProxyFileId");
      int i = bo.getInt((String)parami.puc.get("webviewVideoProxyFileSize"), 0);
      int j = bo.getInt((String)parami.puc.get("webviewVideoProxyFileDuration"), 0);
      int k = bo.getInt((String)parami.puc.get("webviewVideoProxyFileType"), 1);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "cdnurls = %s, filedId = %s, fileSize = %d, fileDuration = %d, fileType = %d", new Object[] { localObject1, str, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
      if (bo.isNullOrNil((String)localObject1))
      {
        a(parami, "videoProxyStartPlay:fail_cdnurl_is_null", null);
        AppMethodBeat.o(9335);
      }
      else
      {
        ArrayList localArrayList = new ArrayList();
        try
        {
          Object localObject2 = new android/os/Bundle;
          ((Bundle)localObject2).<init>();
          ((Bundle)localObject2).putString("webview_video_proxy_cdn_urls", (String)localObject1);
          ((Bundle)localObject2).putString("webview_video_proxy_fileId", str);
          ((Bundle)localObject2).putInt("webview_video_proxy_file_size", i);
          ((Bundle)localObject2).putInt("webview_video_proxy_file_duration", j);
          ((Bundle)localObject2).putInt("webview_video_proxy_file_type", k);
          localObject2 = this.umI.g(5002, (Bundle)localObject2);
          localObject1 = new com/tencent/mars/smc/IDKey;
          ((IDKey)localObject1).<init>();
          ((IDKey)localObject1).SetID(142);
          ((IDKey)localObject1).SetKey(15);
          ((IDKey)localObject1).SetValue(1L);
          localArrayList.add(localObject1);
          if (localObject2 != null)
          {
            j = ((Bundle)localObject2).getInt("webview_video_proxy_play_data_id");
            localObject2 = ((Bundle)localObject2).getString("webview_video_proxy_local_url");
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "invoke result palyDataId = %d, localUrl = %s", new Object[] { Integer.valueOf(j), localObject2 });
            if ((j > 0) && (!bo.isNullOrNil((String)localObject2)))
            {
              com.tencent.mm.plugin.report.service.h.pYm.b(localArrayList, false);
              localObject1 = new java/util/HashMap;
              ((HashMap)localObject1).<init>();
              ((Map)localObject1).put("videoProxyPlayDataId", Integer.valueOf(j));
              ((Map)localObject1).put("videoProxyPlayLocalUrl", localObject2);
              a(parami, "videoProxyStartPlay:ok", (Map)localObject1);
              com.tencent.mm.plugin.report.service.h.pYm.b(localArrayList, false);
              AppMethodBeat.o(9335);
            }
          }
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "proxy start play failed : %s", new Object[] { localException.getMessage() });
          IDKey localIDKey = new IDKey();
          localIDKey.SetID(142);
          localIDKey.SetKey(16);
          localIDKey.SetValue(1L);
          localArrayList.add(localIDKey);
          com.tencent.mm.plugin.report.service.h.pYm.b(localArrayList, false);
          a(parami, "videoProxyStartPlay:fail", null);
          AppMethodBeat.o(9335);
        }
      }
    }
  }

  private boolean ax(i parami)
  {
    AppMethodBeat.i(9336);
    if (!ao.cXP().hasInit)
    {
      a(parami, "videoProxyStartPlay:fail_has_not_init", null);
      AppMethodBeat.o(9336);
    }
    for (boolean bool = true; ; bool = false)
    {
      while (true)
      {
        return bool;
        int i = bo.getInt((String)parami.puc.get("webviewVideoProxyPlaydataId"), 0);
        if (i > 0)
        {
          Bundle localBundle = new Bundle();
          localBundle.putInt("webview_video_proxy_play_data_id", i);
          try
          {
            this.umI.g(5003, localBundle);
            a(parami, "videoProxyStopPlay:ok", null);
            AppMethodBeat.o(9336);
            bool = false;
          }
          catch (Exception localException)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "webview proxy stop play failed : %s", new Object[] { localException.getMessage() });
          }
        }
      }
      a(parami, "videoProxyStopPlay:fail", null);
      AppMethodBeat.o(9336);
    }
  }

  private boolean ay(i parami)
  {
    AppMethodBeat.i(9337);
    boolean bool;
    if (!ao.cXP().hasInit)
    {
      a(parami, "videoProxyStartPlay:fail_has_not_init", null);
      AppMethodBeat.o(9337);
      bool = true;
    }
    while (true)
    {
      return bool;
      Object localObject = (String)parami.puc.get("webviewVideoProxyPlayState");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "set player state : %s", new Object[] { localObject });
      if (bo.isNullOrNil((String)localObject))
      {
        a(parami, "videoProxySetPlayerState:fail", null);
        AppMethodBeat.o(9337);
        bool = true;
      }
      else
      {
        int i = bo.getInt((String)localObject, 0);
        try
        {
          localObject = new android/os/Bundle;
          ((Bundle)localObject).<init>();
          ((Bundle)localObject).putInt("webview_video_proxy_play_state", i);
          this.umI.g(5004, (Bundle)localObject);
          a(parami, "videoProxySetPlayerState:ok", null);
          AppMethodBeat.o(9337);
          bool = false;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "set player state failed : %s", new Object[] { localException.getMessage() });
          a(parami, "videoProxySetPlayerState:fail", null);
          AppMethodBeat.o(9337);
          bool = false;
        }
      }
    }
  }

  private boolean az(i parami)
  {
    AppMethodBeat.i(9338);
    if (!ao.cXP().hasInit)
    {
      a(parami, "videoProxySetRemainTime:fail_has_not_init", null);
      AppMethodBeat.o(9338);
    }
    while (true)
    {
      return false;
      Object localObject = (String)parami.puc.get("webviewVideoProxyPlaydataId");
      int i = bo.getInt((String)localObject, 0);
      String str = (String)parami.puc.get("webviewVideoProxyRemainTime");
      int j = bo.getInt(str, 0);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doWebviewProxySetRemainTime, id = %s, time = %s", new Object[] { localObject, str });
      try
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>();
        ((Bundle)localObject).putInt("webview_video_proxy_play_data_id", i);
        ((Bundle)localObject).putInt("webview_video_proxy_play_remain_time", j);
        this.umI.g(5006, (Bundle)localObject);
        a(parami, "videoProxySetRemainTime:ok", null);
        AppMethodBeat.o(9338);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "set remain time faild : %s", new Object[] { localException.getMessage() });
        a(parami, "videoProxySetRemainTime:fail", null);
        AppMethodBeat.o(9338);
      }
    }
  }

  private void b(final i parami, final String paramString1, final String paramString2, final int paramInt1, final int paramInt2, final int paramInt3, final String paramString3, final boolean paramBoolean)
  {
    AppMethodBeat.i(9308);
    Object localObject = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(paramString2);
    if ((localObject == null) || (bo.isNullOrNil(((WebViewJSSDKFileItem)localObject).heo)) || (!com.tencent.mm.vfs.e.ct(((WebViewJSSDKFileItem)localObject).heo)))
    {
      a(parami, paramString3 + ":fail_file not exist", null);
      AppMethodBeat.o(9308);
    }
    while (true)
    {
      return;
      if (!com.tencent.mm.network.ab.ch(this.context))
      {
        localObject = bo.my(com.tencent.mm.vfs.e.asZ(((WebViewJSSDKFileItem)localObject).heo));
        com.tencent.mm.ui.base.h.a(this.context, this.context.getString(2131305569, new Object[] { localObject }), this.context.getString(2131297061), false, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(9148);
            g.a(g.this, parami, paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, paramBoolean);
            AppMethodBeat.o(9148);
          }
        }
        , new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
          {
            AppMethodBeat.i(9149);
            g.a(g.this, parami, paramString3 + ":cancel", null);
            AppMethodBeat.o(9149);
          }
        });
        AppMethodBeat.o(9308);
      }
      else
      {
        c(parami, paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, paramBoolean);
        AppMethodBeat.o(9308);
      }
    }
  }

  private void b(i parami, boolean paramBoolean)
  {
    AppMethodBeat.i(9386);
    if (parami == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "msg is null when report.");
      AppMethodBeat.o(9386);
    }
    while (true)
    {
      return;
      String str = parami.uIJ;
      Object localObject = parami.uII;
      ((Map)localObject).put("isSuccess", Boolean.valueOf(paramBoolean));
      l.C(str, (Map)localObject);
      localObject = "";
      if (this.uGh != null)
        localObject = this.uGh.getString("key_webview_container_env");
      if ("miniProgram".equals(localObject))
        n.a(this.umI, str, parami);
      AppMethodBeat.o(9386);
    }
  }

  private void b(String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(9303);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "chooseMediaFromCamera");
    if (paramString.equals("front"));
    for (int i = 16; ; i = 256)
    {
      paramIntent.putExtra("key_pick_local_pic_capture", i);
      ((MMActivity)this.context).ifE = this;
      com.tencent.mm.bp.d.a(this.context, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 47, false);
      AppMethodBeat.o(9303);
      return;
    }
  }

  private boolean b(i parami)
  {
    AppMethodBeat.i(9227);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "doShowDatePicker");
    Object localObject1 = null;
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try
    {
      Object localObject2 = (String)parami.puc.get("current");
      if (bo.isNullOrNil((String)localObject2))
      {
        localObject2 = localSimpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        Object localObject3 = (String)parami.puc.get("range");
        if (!bo.isNullOrNil((String)localObject3))
        {
          localObject4 = new org/json/JSONObject;
          ((JSONObject)localObject4).<init>((String)localObject3);
          localObject1 = ((JSONObject)localObject4).optString("start", "2013-01-01");
          localObject4 = ((JSONObject)localObject4).optString("end", (String)localObject2);
          Object localObject5 = (String)parami.puc.get("fields");
          localObject3 = localObject5;
          if (bo.isNullOrNil((String)localObject5))
            localObject3 = "month";
          localObject5 = Calendar.getInstance();
          ((Calendar)localObject5).setTime(localSimpleDateFormat.parse((String)localObject2));
          if ((this.context == null) || (!(this.context instanceof Activity)))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "context error!");
            AppMethodBeat.o(9227);
            bool1 = false;
            return bool1;
          }
          localObject2 = new com/tencent/mm/ui/widget/picker/a;
          ((com.tencent.mm.ui.widget.picker.a)localObject2).<init>(this.context);
          ((com.tencent.mm.ui.widget.picker.a)localObject2).aB(((Calendar)localObject5).get(1), ((Calendar)localObject5).get(2) + 1, ((Calendar)localObject5).get(5));
          if (((String)localObject3).equals("year"))
            bool1 = false;
          for (bool2 = false; ; bool2 = true)
          {
            ((com.tencent.mm.ui.widget.picker.a)localObject2).al(bool2, bool1);
            localObject1 = ((String)localObject1).split("-");
            if (localObject1.length >= 3)
              ((com.tencent.mm.ui.widget.picker.a)localObject2).aC(bo.ank(localObject1[0]), bo.ank(localObject1[1]), bo.ank(localObject1[2]));
            localObject4 = ((String)localObject4).split("-");
            if (localObject4.length >= 3)
              ((com.tencent.mm.ui.widget.picker.a)localObject2).aD(bo.ank(localObject4[0]), bo.ank(localObject4[1]), bo.ank(localObject4[2]));
            localObject4 = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$59;
            ((g.59)localObject4).<init>(this, parami);
            ((com.tencent.mm.ui.widget.picker.a)localObject2).zSj = ((com.tencent.mm.ui.widget.picker.a.a)localObject4);
            ((com.tencent.mm.ui.widget.picker.a)localObject2).show();
            AppMethodBeat.o(9227);
            bool1 = true;
            break;
            bool1 = ((String)localObject3).equals("month");
            if (!bool1)
              break label467;
            bool1 = false;
          }
        }
      }
    }
    catch (JSONException parami)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doShowDatePicker ex: %s", new Object[] { parami.getMessage() });
    }
    catch (ParseException parami)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doShowDatePicker ex: %s", new Object[] { parami.getMessage() });
        continue;
        label467: boolean bool1 = true;
        boolean bool2 = true;
        continue;
        Object localObject4 = null;
      }
    }
  }

  private boolean b(i parami, g.a parama)
  {
    AppMethodBeat.i(9374);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doOauthAuthorize!");
    String str1 = (String)parami.puc.get("scope");
    boolean bool;
    if (bo.isNullOrNil(str1))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "scope is null!");
      a(parami, "authorize:fail", null);
      parama.aCB();
      AppMethodBeat.o(9374);
      bool = true;
    }
    while (true)
    {
      return bool;
      String str3;
      LinkedList localLinkedList;
      try
      {
        String str2 = this.umI.getCurrentUrl();
        str3 = bo.nullAsNil(this.uGr.agj(str2));
        if (bo.isNullOrNil(str3))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "appId is null!");
          a(parami, "authorize:fail", null);
          parama.aCB();
          AppMethodBeat.o(9374);
          bool = false;
        }
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localException.getMessage() });
          localLinkedList = null;
        }
        localLinkedList = new LinkedList();
        try
        {
          JSONArray localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>(str1);
          for (int i = 0; i < localJSONArray.length(); i++)
            localLinkedList.add(localJSONArray.optString(i));
        }
        catch (Exception parama)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "Exception %s", new Object[] { parama.getMessage() });
          a(parami, "authorize:fail", null);
          AppMethodBeat.o(9374);
          bool = true;
        }
      }
      continue;
      com.tencent.mm.kernel.g.Rg().a(new com.tencent.mm.z.a.a(str3, localLinkedList, new g.11(this, parami, parama, str3)), 0);
      AppMethodBeat.o(9374);
      bool = true;
    }
  }

  private boolean b(i parami, JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    boolean bool = false;
    AppMethodBeat.i(9232);
    this.cEl = g(parami);
    if (this.cEl == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSendAppMsg fail, appmsg is null");
      a(parami, "send_app_msg:fail", null);
      AppMethodBeat.o(9232);
    }
    Object localObject1;
    for (bool = true; ; bool = true)
    {
      return bool;
      localObject1 = dcv().getString("scene");
      dcv().remove("scene");
      if (!"friend".equals(localObject1))
        l.a(parami.uII, agw("sendAppMessage"), null, (String)parami.puc.get("appid"));
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "send appmsg scene is '%s'", new Object[] { localObject1 });
      if (!"connector".equals(localObject1))
        break;
      parami = dcw();
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "directly send to %s", new Object[] { parami });
      c(1, -1, new Intent().putExtra("Select_Conv_User", parami));
      label185: AppMethodBeat.o(9232);
    }
    Object localObject2;
    if ("favorite".equals(localObject1))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "favorite url");
      localObject1 = new cl();
      paramJsapiPermissionWrapper = new com.tencent.mm.plugin.webview.model.c.a();
      parami = (String)this.uGd.puc.get("link");
      localObject2 = ar.aek(parami);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "rawurl:[%s], shareurl:[%s]", new Object[] { parami, localObject2 });
      paramJsapiPermissionWrapper.url = ((String)localObject2);
      paramJsapiPermissionWrapper.thumbUrl = ((String)this.uGd.puc.get("img_url"));
      paramJsapiPermissionWrapper.title = ((String)this.uGd.puc.get("title"));
      paramJsapiPermissionWrapper.desc = ((String)this.uGd.puc.get("desc"));
      paramJsapiPermissionWrapper.csB = ((String)this.uGd.puc.get("appid"));
      if (this.uGh == null)
        break label1914;
      parami = this.uGh.getString("key_snsad_statextstr");
      paramJsapiPermissionWrapper.cMn = parami;
    }
    while (true)
    {
      try
      {
        localObject2 = this.umI.g(18, null);
        if (localObject2 != null)
        {
          String str = com.tencent.mm.model.v.nW(bo.nullAsNil(((Bundle)localObject2).getString("KPublisherId")));
          v.b localb = com.tencent.mm.model.v.Zp().y(str, true);
          localb.j("sendAppMsgScene", Integer.valueOf(2));
          localb.j("preChatName", ((Bundle)localObject2).getString("preChatName"));
          localb.j("preMsgIndex", Integer.valueOf(((Bundle)localObject2).getInt("preMsgIndex")));
          localb.j("prePublishId", ((Bundle)localObject2).getString("prePublishId"));
          localb.j("preUsername", ((Bundle)localObject2).getString("preUsername"));
          localb.j("getA8KeyScene", Integer.valueOf(((Bundle)localObject2).getInt("getA8KeyScene")));
          localb.j("referUrl", ((Bundle)localObject2).getString("referUrl"));
          if (!bo.isNullOrNil(parami))
            localb.j("adExtStr", parami);
          ((cl)localObject1).cvA.cvF = str;
        }
        if ((this.context instanceof Activity))
        {
          ((cl)localObject1).cvA.activity = ((Activity)this.context);
          ((cl)localObject1).cvA.cvH = 36;
        }
      }
      catch (RemoteException parami)
      {
        try
        {
          while (true)
          {
            parami = this.uGd.puc.get("KPublisherId");
            if (parami != null)
            {
              if (!parami.toString().startsWith("wrd"))
                break label815;
              ((cl)localObject1).cvA.scene = 2;
            }
            com.tencent.mm.plugin.webview.model.c.a((cl)localObject1, paramJsapiPermissionWrapper);
            ((cl)localObject1).cvA.cvJ = new g.70(this);
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
            this.uGv.bE(3, (String)this.uGd.puc.get("use_update_jsapi_data"));
            if (((cl)localObject1).cvB.ret != 0)
              break label844;
            gB(3, 1);
            try
            {
              parami = this.umI.g(85, null);
              a(paramJsapiPermissionWrapper.csB, paramJsapiPermissionWrapper.thumbUrl, 4, parami);
            }
            catch (RemoteException parami)
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "invokeAsResult error : %s", new Object[] { parami });
            }
          }
          break label185;
          parami = parami;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "try to report error, %s", new Object[] { parami });
          continue;
          label815: if (!parami.toString().startsWith("gs"))
            continue;
          ((cl)localObject1).cvA.scene = 3;
          continue;
        }
        catch (Exception parami)
        {
          continue;
          label844: gB(3, 2);
          a(this.uGd, "send_fav_msg:fail", null);
        }
      }
      break label185;
      if ("enterprise".equals(localObject1))
      {
        paramJsapiPermissionWrapper = dcw();
        localObject1 = new HashMap();
        ((HashMap)localObject1).put("img_url", (String)parami.puc.get("img_url"));
        ((HashMap)localObject1).put("desc", (String)parami.puc.get("desc"));
        ((HashMap)localObject1).put("title", (String)parami.puc.get("title"));
        ((HashMap)localObject1).put("src_username", (String)parami.puc.get("src_username"));
        ((HashMap)localObject1).put("src_displayname", (String)parami.puc.get("src_displayname"));
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSendAppMessage, img_url=%s, desc=%s, title=%s", new Object[] { (String)parami.puc.get("img_url"), (String)parami.puc.get("desc"), (String)parami.puc.get("title") });
        if (com.tencent.mm.aj.f.kq(paramJsapiPermissionWrapper))
        {
          parami = new Intent();
          parami.setClassName(this.context, "com.tencent.mm.ui.bizchat.BizChatSelectConversationUI");
          parami.putExtra("enterprise_biz_name", paramJsapiPermissionWrapper);
          parami.putExtra("biz_chat_scene", 1);
          parami.putExtra("enterprise_extra_params", (Serializable)localObject1);
          if (!(this.context instanceof MMActivity))
            break label185;
          ((MMActivity)this.context).ifE = this;
          ((MMActivity)this.context).b(this, parami, 37);
          break label185;
        }
        if (!com.tencent.mm.aj.f.rc(paramJsapiPermissionWrapper))
          break label185;
        parami = new Intent();
        parami.putExtra("enterprise_biz_name", paramJsapiPermissionWrapper);
        parami.putExtra("enterprise_scene", 3);
        parami.putExtra("enterprise_extra_params", (Serializable)localObject1);
        if (!(this.context instanceof MMActivity))
          break label185;
        ((MMActivity)this.context).ifE = this;
        com.tencent.mm.bp.d.b(this.context, "brandservice", ".ui.EnterpriseBizContactPlainListUI", parami, 37);
        break label185;
      }
      if ("wework".equals(localObject1))
      {
        ao(parami);
        break label185;
      }
      if ("facebook".equals(localObject1))
      {
        paramJsapiPermissionWrapper = new Intent();
        paramJsapiPermissionWrapper.putExtra("title", (String)parami.puc.get("title"));
        paramJsapiPermissionWrapper.putExtra("digest", (String)parami.puc.get("desc"));
        paramJsapiPermissionWrapper.putExtra("img", (String)parami.puc.get("img_url"));
        paramJsapiPermissionWrapper.putExtra("link", (String)parami.puc.get("link"));
        paramJsapiPermissionWrapper.setClassName(this.context, "com.tencent.mm.plugin.account.ui.ShareToFacebookRedirectUI");
        this.context.startActivity(paramJsapiPermissionWrapper);
        a(parami, "shareQZone:ok", null);
        break label185;
      }
      if ("qq".equals(localObject1))
      {
        ap(parami);
        break label185;
      }
      this.uGv.bE(1, (String)parami.puc.get("use_update_jsapi_data"));
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "select user to send");
      localObject1 = new HashMap();
      if (a(parami, paramJsapiPermissionWrapper.jB(89)))
        this.cEl = g(parami);
      if (paramJsapiPermissionWrapper.jB(290))
        this.uGd.puc.put("share_callback_with_scene", Boolean.TRUE);
      while (true)
      {
        paramJsapiPermissionWrapper = (String)parami.puc.get("img_url");
        ((HashMap)localObject1).put("img_url", paramJsapiPermissionWrapper);
        ((HashMap)localObject1).put("desc", (String)parami.puc.get("desc"));
        ((HashMap)localObject1).put("title", (String)parami.puc.get("title"));
        ((HashMap)localObject1).put("url", (String)parami.puc.get("url"));
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSendAppMessage, img_url=%s, desc=%s, title=%s, url=%s", new Object[] { (String)parami.puc.get("img_url"), (String)parami.puc.get("desc"), (String)parami.puc.get("title"), (String)parami.puc.get("url") });
        com.tencent.mm.plugin.report.service.h.pYm.a(157L, 5L, 1L, false);
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("Select_Conv_Type", 3);
        ((Intent)localObject2).putExtra("scene_from", 2);
        ((Intent)localObject2).putExtra("mutil_select_is_ret", true);
        ((Intent)localObject2).putExtra("webview_params", (Serializable)localObject1);
        ((Intent)localObject2).putExtra("Retr_Msg_Type", 2);
        if (!(this.context instanceof MMActivity))
          break label1896;
        parami.uII.put("Internal@AsyncReport", Boolean.TRUE);
        if (bo.getInt((String)parami.puc.get("open_from_scene"), 0) == 4)
          com.tencent.mm.plugin.fav.a.h.j(this.uGh.getLong("favlocalid", 0L), 1, 0);
        com.tencent.mm.bp.d.a((MMActivity)this.context, ".ui.transmit.SelectConversationUI", (Intent)localObject2, 1, this);
        k.agC(paramJsapiPermissionWrapper);
        break;
        this.uGd.puc.put("share_callback_with_scene", Boolean.FALSE);
      }
      label1896: com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSendAppMessage context is not activity");
      AppMethodBeat.o(9232);
      break;
      label1914: parami = null;
    }
  }

  private boolean bA(i parami)
  {
    int i = 0;
    AppMethodBeat.i(9423);
    String str1 = aa.t(parami.puc, "targetAppId");
    String str2 = getCurrentUrl();
    String str3 = bK(str2);
    String str4 = str3;
    if (bo.isNullOrNil(str3))
      str4 = aa.t(parami.puc, "referrerAppId");
    if (bo.isNullOrNil(str1))
      a(parami, "launchMiniProgram:fail_invalid_targetAppId", null);
    while (true)
    {
      AppMethodBeat.o(9423);
      return true;
      if (!bo.isNullOrNil(str4))
        break;
      a(parami, "launchMiniProgram:fail_invalid_referrerAppId", null);
    }
    str3 = bo.nullAsNil(aa.t(parami.puc, "envVersion"));
    int j = -1;
    switch (str3.hashCode())
    {
    default:
      switch (j)
      {
      default:
        label152: j = i;
      case 0:
      case 1:
      }
      break;
    case 1559690845:
    case 110628630:
    }
    while (true)
    {
      str3 = aa.t(parami.puc, "path");
      ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).b(this.context, str2, str4, str1, j, str3, aGu());
      a(parami, "launchMiniProgram:ok", null);
      break;
      if (!str3.equals("develop"))
        break label152;
      j = 0;
      break label152;
      if (!str3.equals("trial"))
        break label152;
      j = 1;
      break label152;
      j = 1;
      continue;
      j = 2;
    }
  }

  private boolean bB(i parami)
  {
    int i = 0;
    int j = -1;
    AppMethodBeat.i(9424);
    String str1 = aa.t(parami.puc, "businessType");
    String str2 = getCurrentUrl();
    Object localObject1 = bK(str2);
    Object localObject2 = localObject1;
    if (bo.isNullOrNil((String)localObject1))
      localObject2 = aa.t(parami.puc, "referrerAppId");
    localObject1 = new HashMap();
    if (bo.isNullOrNil(str1))
    {
      ((Map)localObject1).put("err_code", Integer.valueOf(-4));
      a(parami, "openBusinessView:fail invalid businessType", (Map)localObject1);
    }
    while (true)
    {
      AppMethodBeat.o(9424);
      return true;
      if (!bo.isNullOrNil((String)localObject2))
        break;
      ((Map)localObject1).put("err_code", Integer.valueOf(-1));
      a(parami, "openBusinessView:fail invalid referrerAppId", (Map)localObject1);
    }
    String str3 = bo.nullAsNil(aa.t(parami.puc, "envVersion"));
    switch (str3.hashCode())
    {
    default:
      switch (j)
      {
      default:
        label192: j = i;
      case 0:
      case 1:
      }
      break;
    case 1559690845:
    case 110628630:
    }
    while (true)
    {
      str3 = aa.t(parami.puc, "queryString");
      ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(this.context, str2, (String)localObject2, str1, str3, j, aGu());
      this.uGY = new g.29(this, (Map)localObject1, parami);
      this.uGY.dnU();
      break;
      if (!str3.equals("develop"))
        break label192;
      j = 0;
      break label192;
      if (!str3.equals("trial"))
        break label192;
      j = 1;
      break label192;
      j = 1;
      continue;
      j = 2;
    }
  }

  private boolean bC(i parami)
  {
    AppMethodBeat.i(9425);
    String str = (String)parami.puc.get("username");
    if (!bo.isNullOrNil(str))
      ((com.tencent.mm.plugin.appbrand.service.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.d.class)).b(str, null);
    a(parami, "forceUpdateWxaAttr:ok", null);
    AppMethodBeat.o(9425);
    return true;
  }

  private boolean bD(i parami)
  {
    AppMethodBeat.i(9426);
    Bundle localBundle = new Bundle(2);
    localBundle.putString("set_page_title_text", (String)parami.puc.get("title"));
    localBundle.putString("set_page_title_color", (String)parami.puc.get("color"));
    try
    {
      this.umI.g(43, localBundle);
      a(parami, "setPageTitle:ok", null);
      AppMethodBeat.o(9426);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSetPageTitle, exception = %s", new Object[] { localException });
        a(parami, "setPageTitle:fail", null);
      }
    }
  }

  @Deprecated
  private boolean bE(i parami)
  {
    AppMethodBeat.i(9427);
    String str = (String)parami.puc.get("color");
    if (bo.isNullOrNil(str))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSetStatusBarStyle, color is null or nill");
      a(parami, "setStatusBarStyle:fail", null);
      AppMethodBeat.o(9427);
      return true;
    }
    if (str.equalsIgnoreCase("black"));
    label172: for (int i = 48; ; i = -1)
    {
      if (-1 != i);
      while (true)
      {
        try
        {
          this.umI.g(i, Bundle.EMPTY);
          a(parami, "setStatusBarStyle:ok", null);
          AppMethodBeat.o(9427);
          break;
          if (!str.equalsIgnoreCase("white"))
            break label172;
          i = 49;
        }
        catch (Exception localException)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSetStatusBarStyle, exception = %s", new Object[] { localException });
          a(parami, "setStatusBarStyle:fail", null);
          continue;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSetStatusBarStyle, color is neither black or white");
        a(parami, "setStatusBarStyle:fail", null);
      }
    }
  }

  private boolean bF(i parami)
  {
    AppMethodBeat.i(9428);
    if (!parami.puc.containsKey("enable"))
    {
      a(parami, "enableFullScreen:fail_invalid_arguments", null);
      AppMethodBeat.o(9428);
    }
    while (true)
    {
      return true;
      try
      {
        boolean bool = Boolean.parseBoolean((String)parami.puc.get("enable"));
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>(1);
        localBundle.putBoolean("enable_fullscreen_params_enable", bool);
        this.umI.g(45, localBundle);
        a(parami, "enableFullScreen:ok", null);
        AppMethodBeat.o(9428);
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doEnableFullScreen, exception = %s", new Object[] { localException });
          a(parami, "enableFullScreen:fail", null);
        }
      }
    }
  }

  private boolean bG(i parami)
  {
    AppMethodBeat.i(9429);
    Object localObject1 = (String)parami.puc.get("left");
    String str1 = (String)parami.puc.get("right");
    if ((bo.isNullOrNil((String)localObject1)) && (bo.isNullOrNil(str1)))
    {
      a(parami, "setNavigationBarButtons:fail", null);
      AppMethodBeat.o(9429);
    }
    while (true)
    {
      return true;
      Bundle localBundle = new Bundle();
      try
      {
        localObject2 = new org/json/JSONObject;
        ((JSONObject)localObject2).<init>((String)localObject1);
        localObject1 = ((JSONObject)localObject2).optString("color", "");
        if (!bo.isNullOrNil((String)localObject1))
          localBundle.putString("set_navigation_bar_buttons_left_text_color", (String)localObject1);
      }
      catch (Exception localException1)
      {
        try
        {
          label117: localObject1 = new org/json/JSONObject;
          ((JSONObject)localObject1).<init>(str1);
          boolean bool1 = ((JSONObject)localObject1).optBoolean("hidden", false);
          String str2 = ((JSONObject)localObject1).optString("text", "");
          Object localObject2 = bo.nullAsNil(u.akm(((JSONObject)localObject1).optString("iconData", "")));
          str1 = ((JSONObject)localObject1).optString("color", "");
          boolean bool2 = ((JSONObject)localObject1).optBoolean("needClickEvent", false);
          if (!bool1)
          {
            localBundle.putString("set_navigation_bar_buttons_text", str2);
            localBundle.putString("set_navigation_bar_buttons_icon_data", (String)localObject2);
            localBundle.putString("set_navigation_bar_buttons_text_color", str1);
            localBundle.putBoolean("set_navigation_bar_buttons_need_click_event", bool2);
          }
          while (true)
          {
            if (localBundle.size() >= 0)
              break label305;
            a(parami, "setNavigationBarButtons:fail_invalid_params", null);
            AppMethodBeat.o(9429);
            break;
            localException1 = localException1;
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException1, "setNavigationBarButtons opt left ", new Object[0]);
            break label117;
            localBundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
          }
        }
        catch (Exception localException2)
        {
          while (true)
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException2, "setNavigationBarButtons opt right ", new Object[0]);
        }
      }
      try
      {
        label305: this.umI.g(44, localBundle);
        a(parami, "setNavigationBarButtons:ok", null);
        AppMethodBeat.o(9429);
      }
      catch (Exception localException3)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException3, " setNavigationBarButtons invoke ", new Object[0]);
          a(parami, "setNavigationBarButtons:fail_invoke", null);
        }
      }
    }
  }

  private boolean bR(i parami)
  {
    AppMethodBeat.i(9442);
    String str1 = (String)parami.puc.get("operationType");
    String str2 = (String)parami.puc.get("dataUrl");
    l.a(parami.uII, false, null, "");
    if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)))
    {
      a(parami, "operateMusicPlayer:fail", null);
      AppMethodBeat.o(9442);
      return true;
    }
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    if (str1.equalsIgnoreCase("play"))
    {
      str3 = (String)parami.puc.get("title");
      str4 = (String)parami.puc.get("singer");
      str5 = (String)parami.puc.get("epname");
      str1 = (String)parami.puc.get("coverImgUrl");
      str6 = (String)parami.puc.get("lowbandUrl");
      str7 = (String)parami.puc.get("webUrl");
      parami.puc.get("lyric");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "title : %s, singer : %s, epName : %s, coverImgUrl : %s, dataUrl : %s, lowbandUrl : %s, webUrl : %s, appid : %s", new Object[] { str3, str4, str5, str1, str2, str6, str7, "" });
      if ((bo.isNullOrNil(str3)) || (bo.isNullOrNil(str4)) || (bo.isNullOrNil(str5)) || (bo.isNullOrNil(str1)) || (bo.isNullOrNil(str6)) || (bo.isNullOrNil(str2)) || (bo.isNullOrNil(str7)))
        a(parami, "operateMusicPlayer:fail", null);
    }
    while (true)
    {
      AppMethodBeat.o(9442);
      break;
      com.tencent.mm.aw.a.aic();
      com.tencent.mm.aw.a.b(com.tencent.mm.aw.f.a(7, str1, str3, str4, str7, str6, str2, str2.hashCode(), com.tencent.mm.compatible.util.e.eSn, com.tencent.mm.plugin.i.c.XW() + str1.hashCode(), str5, ""));
      a(parami, "operateMusicPlayer:ok", null);
      continue;
      int i;
      if (str1.equalsIgnoreCase("resume"))
      {
        if ((com.tencent.mm.aw.b.sT(str2)) && (com.tencent.mm.aw.a.aig()) && (!com.tencent.mm.aw.a.aie()))
          com.tencent.mm.aw.a.KY();
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label471;
          a(parami, "operateMusicPlayer:ok", null);
          break;
        }
        label471: a(parami, "operateMusicPlayer:fail", null);
      }
      else if (str1.equalsIgnoreCase("pause"))
      {
        if ((com.tencent.mm.aw.b.sT(str2)) && (com.tencent.mm.aw.a.aie()))
          com.tencent.mm.aw.a.KX();
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label538;
          com.tencent.mm.aw.a.aid();
          a(parami, "operateMusicPlayer:ok", null);
          break;
        }
        label538: a(parami, "operateMusicPlayer:fail", null);
      }
      else if (str1.equalsIgnoreCase("seek"))
      {
        i = bo.getInt(bo.cD(parami.puc.get("position")), -1);
        if (com.tencent.mm.aw.b.sT(str2));
        for (boolean bool = com.tencent.mm.aw.a.lP(i * 1000); ; bool = false)
        {
          if (!bool)
            break label622;
          a(parami, "operateMusicPlayer:ok", null);
          break;
        }
        label622: a(parami, "operateMusicPlayer:fail", null);
      }
      else if (str1.equalsIgnoreCase("stop"))
      {
        if ((com.tencent.mm.aw.b.sT(str2)) && (com.tencent.mm.aw.a.aig()))
          com.tencent.mm.aw.a.aic();
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label686;
          a(parami, "operateMusicPlayer:ok", null);
          break;
        }
        label686: a(parami, "operateMusicPlayer:fail", null);
      }
      else
      {
        a(parami, "operateMusicPlayer:fail", null);
      }
    }
  }

  private boolean bS(i parami)
  {
    AppMethodBeat.i(9443);
    Object localObject1 = (String)parami.puc.get("dataUrl");
    Object localObject2 = (String)parami.puc.get("appId");
    l.a(parami.uII, false, null, (String)localObject2);
    if (bo.isNullOrNil((String)localObject1))
    {
      a(parami, "getMusicPlayerState:fail_dataUrl_null", null);
      AppMethodBeat.o(9443);
      return true;
    }
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "dataUrl : %s, appid : %s", new Object[] { localObject1, localObject2 });
    localObject2 = com.tencent.mm.aw.a.aih();
    int i;
    if ((localObject2 != null) && (((com.tencent.mm.aw.e)localObject2).fKa.equals(localObject1)))
    {
      localObject1 = com.tencent.mm.aw.a.aii();
      i = -1;
      if (localObject1 == null)
        break label293;
      i = ((com.tencent.mm.aw.c)localObject1).mDuration;
    }
    label293: for (int j = ((com.tencent.mm.aw.c)localObject1).mPosition; ; j = 0)
    {
      if ((localObject1 == null) || (i < 0) || (j < 0))
      {
        a(parami, "getMusicPlayerState:fail", null);
        AppMethodBeat.o(9443);
        break;
      }
      i /= 1000;
      int k = j / 1000;
      int m = ((com.tencent.mm.aw.c)localObject1).mStatus;
      j = ((com.tencent.mm.aw.c)localObject1).fJQ;
      localObject1 = new HashMap();
      ((Map)localObject1).put("duration", Integer.valueOf(i));
      ((Map)localObject1).put("currentPosition", Integer.valueOf(k));
      ((Map)localObject1).put("status", Integer.valueOf(m));
      ((Map)localObject1).put("downloadPercent", Integer.valueOf(j));
      a(parami, "getMusicPlayerState:ok", (Map)localObject1);
      while (true)
      {
        AppMethodBeat.o(9443);
        break;
        a(parami, "getMusicPlayerState:failed_dataUrl_diff", null);
      }
    }
  }

  private boolean bT(i parami)
  {
    AppMethodBeat.i(9444);
    Object localObject1 = (String)parami.puc.get("localId");
    if (bo.isNullOrNil((String)localObject1))
    {
      a(parami, "getLocalImgData:fail_invaild_localid", null);
      AppMethodBeat.o(9444);
    }
    while (true)
    {
      return true;
      localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex((String)localObject1);
      if ((localObject1 != null) && (((WebViewJSSDKFileItem)localObject1).hGG != null))
      {
        localObject1 = MMBitmapFactory.decodeFile(((WebViewJSSDKFileItem)localObject1).hGG);
        int i;
        if (localObject1 != null)
        {
          i = 1;
          label79: if (((Bitmap)localObject1).isRecycled())
            break label233;
        }
        label233: for (int j = 1; ; j = 0)
        {
          if ((i & j) == 0)
            break label239;
          Object localObject2 = new ByteArrayOutputStream();
          ((Bitmap)localObject1).compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject2);
          Object localObject3 = ((ByteArrayOutputStream)localObject2).toByteArray();
          localObject2 = Base64.encodeToString((byte[])localObject3, 0);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "rawData lenght = %d, base64 lenght = %d", new Object[] { Integer.valueOf(localObject3.length), Integer.valueOf(((String)localObject2).length()) });
          localObject3 = new HashMap();
          ((HashMap)localObject3).put("localData", localObject2);
          a(parami, "getLocalImgData:ok", (Map)localObject3);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "bitmap recycle %s", new Object[] { localObject1.toString() });
          ((Bitmap)localObject1).recycle();
          AppMethodBeat.o(9444);
          break;
          i = 0;
          break label79;
        }
      }
      label239: a(parami, "getLocalImgData:fail", null);
      AppMethodBeat.o(9444);
    }
  }

  private boolean bU(i parami)
  {
    int i = 0;
    AppMethodBeat.i(9445);
    this.eBB = false;
    Object localObject1 = new Bundle();
    try
    {
      int j = bo.getInt(parami.puc.get("scene").toString().trim(), 0);
      ((Bundle)localObject1).putInt("scene", j);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doExposePreparation scene:%d", new Object[] { Integer.valueOf(j) });
      if (-1 == ((Bundle)localObject1).getInt("scene"))
      {
        a(parami, "doExposePreparation fail:unknown scene", null);
        AppMethodBeat.o(9445);
        return true;
      }
      localObject2 = this.umI.g(73, (Bundle)localObject1);
      localObject1 = new java/util/HashMap;
      ((HashMap)localObject1).<init>();
      if (!((Bundle)localObject2).isEmpty())
        switch (j)
        {
        default:
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "unknown scene %d", new Object[] { Integer.valueOf(j) });
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 35:
        case 36:
        case 37:
        case 38:
        case 39:
        case 45:
        case 33:
          while (true)
          {
            ((HashMap)localObject1).put("username", ((Bundle)localObject2).getString("username"));
            localObject3 = new org/json/JSONArray;
            ((JSONArray)localObject3).<init>();
            localObject2 = ((Bundle)localObject2).getStringArrayList("proof");
            if (localObject2 == null)
              break;
            j = ((ArrayList)localObject2).size();
            while (i < j)
            {
              ((JSONArray)localObject3).put(((ArrayList)localObject2).get(i));
              i++;
            }
            ((HashMap)localObject1).put("newMsgId", ((Bundle)localObject2).getString("newMsgId"));
          }
        case 34:
        case 51:
        }
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doExposePreparation exception " + localException.getMessage());
        a(parami, "doExposePreparation fail", null);
        continue;
        localException.put("webviewImg", ((Bundle)localObject2).getString("webviewImg"));
        localException.put("webviewHtml", ((Bundle)localObject2).getString("webviewHtml"));
        localException.put("content", ((Bundle)localObject2).getString("url"));
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("content = ");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", ((Bundle)localObject2).getString("url"));
        continue;
        localException.put("newMsgId", ((Bundle)localObject2).getString("newMsgId"));
        localException.put("msgType", Integer.valueOf(((Bundle)localObject2).getInt("msgType")));
        continue;
        if (!localException.containsKey("content"))
          localException.put("content", ((JSONArray)localObject3).toString());
        a(parami, "doExposePreparation ok", localException);
        continue;
        a(parami, "doExposePreparation fail", null);
      }
    }
  }

  private boolean bV(i parami)
  {
    AppMethodBeat.i(9446);
    try
    {
      Object localObject = parami.puc.get("type").toString();
      if (!bo.isNullOrNil((String)localObject))
      {
        if (((String)localObject).equals("send"))
        {
          localObject = new android/content/Intent;
          ((Intent)localObject).<init>();
          ((Intent)localObject).putExtra("key_type", 1);
          com.tencent.mm.bp.d.b(this.context, "luckymoney", ".ui.LuckyMoneyMyRecordUI", (Intent)localObject);
          a(parami, "openLuckyMoneyHistory:ok", null);
        }
        while (true)
        {
          AppMethodBeat.o(9446);
          return true;
          if (((String)localObject).equals("receive"))
          {
            localObject = new android/content/Intent;
            ((Intent)localObject).<init>();
            ((Intent)localObject).putExtra("key_type", 2);
            com.tencent.mm.bp.d.b(this.context, "luckymoney", ".ui.LuckyMoneyMyRecordUI", (Intent)localObject);
            a(parami, "openLuckyMoneyHistory:ok", null);
          }
        }
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenLuckyMoneyHistory error %s", new Object[] { localException });
        a(parami, "openLuckyMoneyHistory:fail", null);
        continue;
        a(parami, "openLuckyMoneyHistory:fail", null);
      }
    }
  }

  private boolean bW(i parami)
  {
    AppMethodBeat.i(9447);
    String str = parami.puc.get("chat_username").toString();
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", str);
    localIntent.putExtra("finish_direct", true);
    localIntent.putExtra("expose_edit_mode", true);
    localIntent.setFlags(536870912);
    if ((this.context instanceof MMActivity))
      com.tencent.mm.bp.d.a((MMActivity)this.context, ".ui.chatting.ChattingUI", localIntent, 40, this);
    while (true)
    {
      AppMethodBeat.o(9447);
      return true;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "getMsgProofItems invalid context");
      a(parami, "select chat record:fail", null);
    }
  }

  private boolean bX(i parami)
  {
    AppMethodBeat.i(9448);
    this.eBB = false;
    Object localObject = parami.puc.get("scene").toString().trim();
    if (((String)localObject).equals("expose"))
      if (parami.puc.get("userData") == null);
    while (true)
    {
      try
      {
        localObject = new org/json/JSONTokener;
        ((JSONTokener)localObject).<init>(parami.puc.get("userData").toString());
        localObject = (JSONObject)((JSONTokener)localObject).nextValue();
        Intent localIntent = new android/content/Intent;
        localIntent.<init>();
        localIntent.putExtra("sns_permission_userName", ((JSONObject)localObject).get("userName").toString());
        localIntent.putExtra("sns_permission_anim", true);
        localIntent.putExtra("sns_permission_block_scene", 1);
        localIntent.setFlags(536870912);
        com.tencent.mm.bp.d.b(this.context, "sns", ".ui.SnsPermissionUI", localIntent);
        a(parami, "openSecurityView ok", null);
        AppMethodBeat.o(9448);
        return true;
      }
      catch (JSONException localJSONException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "openSecurityView error, userData not in json");
        a(parami, "openSecurityView error,userData not in json", null);
        continue;
      }
      a(parami, "openSecurityView fail, no userData", null);
      continue;
      a(parami, "openSecurityView fail, scene error : ".concat(String.valueOf(localJSONException)), null);
    }
  }

  private boolean bY(i parami)
  {
    AppMethodBeat.i(9449);
    Object localObject = bK(getCurrentUrl());
    String str1 = com.tencent.mm.compatible.e.q.LK();
    String str2 = com.tencent.mm.compatible.e.q.LM();
    if ((!bo.isNullOrNil(str1)) && (!bo.isNullOrNil((String)localObject)) && (!bo.isNullOrNil(str2)))
    {
      str1 = ag.ck(ag.ck((String)localObject + str1));
      str2 = ag.ck(ag.ck((String)localObject + str2));
      localObject = new HashMap();
      ((Map)localObject).put("deviceid", str1);
      ((Map)localObject).put("newDeviceId", str2);
      a(parami, "getOpenDeviceId:ok", (Map)localObject);
    }
    while (true)
    {
      AppMethodBeat.o(9449);
      return true;
      a(parami, "getOpenDeviceId:fail", null);
    }
  }

  private boolean bZ(i parami)
  {
    AppMethodBeat.i(9450);
    try
    {
      Object localObject1 = this.umI.g(90000, null);
      if (localObject1 != null)
      {
        String[] arrayOfString = ((Bundle)localObject1).getStringArray("webview_get_route_url_list");
        int i = ((Bundle)localObject1).getInt("webview_get_route_url_geta8key_scene");
        if ((i != 7) && (i != 56))
          break label298;
        localObject1 = ((Bundle)localObject1).getString("geta8key_username");
        if (bo.isNullOrNil((String)localObject1))
          break label298;
        localObject1 = com.tencent.mm.aj.f.qX((String)localObject1);
        if (localObject1 == null)
          break label298;
        localObject1 = ((com.tencent.mm.aj.d)localObject1).field_appId;
        if (arrayOfString != null);
        HashMap localHashMap;
        JSONArray localJSONArray;
        for (int j = arrayOfString.length; ; j = -1)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "routeUrl length = %d, scene = %d, appid = %s", new Object[] { Integer.valueOf(j), Integer.valueOf(i), localObject1 });
          if ((arrayOfString == null) || (arrayOfString.length <= 0))
            break label280;
          localHashMap = new java/util/HashMap;
          localHashMap.<init>();
          localJSONArray = new org/json/JSONArray;
          localJSONArray.<init>();
          int k = arrayOfString.length;
          for (j = 0; j < k; j++)
            localJSONArray.put(arrayOfString[j]);
        }
        localHashMap.put("urls", localJSONArray.toString());
        localHashMap.put("scene", Integer.valueOf(i));
        if (!bo.isNullOrNil((String)localObject1))
          localHashMap.put("appid", localObject1);
        a(parami, "getRouteUrl:ok", localHashMap);
        AppMethodBeat.o(9450);
        return true;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "get routeurl failed ; %s", new Object[] { localException.getMessage() });
        label280: a(parami, "getRouteUrl:fail", null);
        AppMethodBeat.o(9450);
        continue;
        label298: Object localObject2 = null;
      }
    }
  }

  private boolean ba(i parami)
  {
    AppMethodBeat.i(9372);
    int i;
    String str1;
    if (this.uGh != null)
    {
      i = this.uGh.getInt("key_download_restrict", 0);
      str1 = this.uGh.getString("key_function_id", "");
      if (!bo.isNullOrNil(str1))
        com.tencent.mm.plugin.report.service.h.pYm.e(14596, new Object[] { str1, Integer.valueOf(i), Integer.valueOf(1) });
      if (i == 1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "not allow to launch application");
        a(parami, "launchApplication:fail", null);
        AppMethodBeat.o(9372);
      }
    }
    while (true)
    {
      return true;
      long l = bo.anT() - this.uGx;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "launchTimeInterval = %d", new Object[] { Long.valueOf(l) });
      if ((l < 2L) && (this.uGx > 0L));
      String str3;
      String str4;
      String str5;
      String str6;
      Object localObject1;
      String str2;
      Bundle localBundle;
      try
      {
        str1 = URLEncoder.encode(this.umI.getCurrentUrl(), "UTF-8");
        com.tencent.mm.plugin.report.service.h.pYm.e(13983, new Object[] { Integer.valueOf(5), str1, "" });
        str3 = (String)parami.puc.get("appID");
        str4 = (String)parami.puc.get("schemeUrl");
        str5 = (String)parami.puc.get("parameter");
        i = bo.getInt((String)parami.puc.get("alertType"), 0);
        l.a(parami.uII, false, null, str3);
        str6 = (String)parami.puc.get("extInfo");
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s", new Object[] { str3, str4, str6, str5 });
        if ((bo.isNullOrNil(str3)) && (bo.isNullOrNil(str4)))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "appid and scheme is null or nil");
          a(parami, "launchApplication:fail", null);
          AppMethodBeat.o(9372);
        }
      }
      catch (Exception localException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "report launchApplication failed");
        localObject1 = parami.puc.get("__jsapi_fw_ext_info");
        str2 = null;
        if ((localObject1 instanceof Bundle))
          str2 = ((Bundle)localObject1).getString("__jsapi_fw_ext_info_key_current_url");
        localObject1 = this.uGr.agj(str2);
        localBundle = new Bundle();
        if (bo.isNullOrNil(str2));
      }
      try
      {
        localBundle.putString("current_page_url", URLEncoder.encode(str2, "UTF-8"));
        label468: localBundle.putString("current_page_appid", (String)localObject1);
        Object localObject2 = new com.tencent.mm.ai.b.a();
        ((com.tencent.mm.ai.b.a)localObject2).fsJ = new avj();
        ((com.tencent.mm.ai.b.a)localObject2).fsK = new avk();
        ((com.tencent.mm.ai.b.a)localObject2).uri = "/cgi-bin/mmbiz-bin/checklaunchapp";
        ((com.tencent.mm.ai.b.a)localObject2).fsI = 1125;
        com.tencent.mm.ai.b localb = ((com.tencent.mm.ai.b.a)localObject2).acD();
        localObject2 = (avj)localb.fsG.fsP;
        ((avj)localObject2).csB = ((String)localObject1);
        ((avj)localObject2).wzn = str3;
        ((avj)localObject2).scene = aGu();
        ((avj)localObject2).url = str2;
        ((avj)localObject2).wzo = str4;
        ((avj)localObject2).kCo = i;
        ((avj)localObject2).wzp = 0;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", new Object[] { localObject1, str3, Integer.valueOf(((avj)localObject2).scene), ((avj)localObject2).url, ((avj)localObject2).wzo, Integer.valueOf(((avj)localObject2).kCo) });
        w.a(localb, new g.5(this, parami, str4, localBundle, str6, str3, str5));
        AppMethodBeat.o(9372);
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label468;
      }
    }
  }

  private void bb(i parami)
  {
    AppMethodBeat.i(9376);
    parami = i.aP(parami.puc);
    try
    {
      this.umI.cZb();
      this.umI.W(parami);
      AppMethodBeat.o(9376);
      return;
    }
    catch (RemoteException parami)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "SendServiceAppMsg doCloseWindow, ex = " + parami.getMessage());
        AppMethodBeat.o(9376);
      }
    }
  }

  private int bc(i parami)
  {
    AppMethodBeat.i(9387);
    int i = parami.hashCode();
    this.uGV.put(Integer.valueOf(i), new g.c(this, parami, this.umI));
    this.eBB = false;
    try
    {
      this.umI.cZc();
      AppMethodBeat.o(9387);
      return i;
    }
    catch (RemoteException parami)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "blockMsg, dealNext ex = %s", new Object[] { parami.getMessage() });
    }
  }

  private boolean bd(i parami)
  {
    AppMethodBeat.i(9390);
    this.eBB = false;
    boolean bool;
    if (aa.d(parami.puc, "scene", 0) == 21)
    {
      bool = com.tencent.mm.plugin.webview.fts.f.cWo().aD(parami.puc);
      AppMethodBeat.o(9390);
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.plugin.webview.modeltools.g.cYD().aD(parami.puc);
      AppMethodBeat.o(9390);
    }
  }

  private boolean be(i parami)
  {
    AppMethodBeat.i(9391);
    parami.puc.put("type", Integer.valueOf(262144));
    parami.puc.put("subType", Integer.valueOf(8));
    com.tencent.mm.plugin.webview.modeltools.g.cYD().ugd = new cvf();
    com.tencent.mm.plugin.webview.modeltools.g.cYD().ugd.xrk = new li();
    com.tencent.mm.plugin.webview.modeltools.g.cYD().ugd.xrk.vOS = 1;
    a(parami, parami.uIJ + ":ok", new HashMap());
    boolean bool = bd(parami);
    AppMethodBeat.o(9391);
    return bool;
  }

  private boolean bf(i parami)
  {
    AppMethodBeat.i(9392);
    HashMap localHashMap = new HashMap();
    com.tencent.mm.plugin.webview.modeltools.g.cYC();
    com.tencent.mm.plugin.webview.fts.b.c(parami.puc, localHashMap);
    a(parami, "getSearchDisplayName:ok", localHashMap);
    AppMethodBeat.o(9392);
    return true;
  }

  private boolean bg(i parami)
  {
    AppMethodBeat.i(9393);
    this.eBB = false;
    Object localObject = com.tencent.mm.plugin.topstory.a.g.ag(parami.puc);
    aa.a(this.context, (chv)localObject);
    localObject = new HashMap();
    ((HashMap)localObject).put("ret", Integer.valueOf(0));
    a(parami, "0", (Map)localObject);
    AppMethodBeat.o(9393);
    return false;
  }

  private boolean bh(i parami)
  {
    AppMethodBeat.i(9394);
    this.eBB = false;
    HashMap localHashMap = new HashMap();
    int i = aa.d(parami.puc, "actionType", 0);
    if (i == 1)
    {
      String str1 = aa.t(parami.puc, "jumpUrl");
      String str2 = aa.t(parami.puc, "publishId");
      Intent localIntent = new Intent();
      localIntent.putExtra("rawUrl", str1);
      localIntent.putExtra("KPublisherId", str2);
      com.tencent.mm.bp.d.b(this.context, "webview", ".ui.tools.WebViewUI", localIntent);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doOpenWebSearchOutLinkItemClick actionType %d publishId %s url %s", new Object[] { Integer.valueOf(i), str2, str1 });
      localHashMap.put("ret", Integer.valueOf(0));
    }
    while (true)
    {
      a(parami, "0", localHashMap);
      AppMethodBeat.o(9394);
      return true;
      localHashMap.put("ret", Integer.valueOf(-1));
    }
  }

  private boolean bi(i parami)
  {
    AppMethodBeat.i(9395);
    this.eBB = false;
    try
    {
      if ((this.umI != null) && (parami.puc != null) && (parami.puc.containsKey("view")))
      {
        Bundle localBundle = new android/os/Bundle;
        localBundle.<init>();
        localBundle.putString("fts_key_data", (String)parami.puc.get("view"));
        this.umI.c(138, localBundle);
      }
      label84: AppMethodBeat.o(9395);
      return false;
    }
    catch (Exception parami)
    {
      break label84;
    }
  }

  private boolean bj(i parami)
  {
    AppMethodBeat.i(9396);
    this.eBB = false;
    int i = bo.ank((String)parami.puc.get("x"));
    int j = bo.ank((String)parami.puc.get("y"));
    String str = (String)parami.puc.get("eventId");
    Bundle localBundle = new Bundle();
    localBundle.putString("widgetId", (String)parami.puc.get("widgetId"));
    localBundle.putInt("x", i);
    localBundle.putInt("y", j);
    localBundle.putString("eventId", str);
    try
    {
      if (this.umI != null)
        this.umI.c(100002, localBundle);
      a(parami, "tapSearchWAWidgetView:ok", null);
      AppMethodBeat.o(9396);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doTapSearchWAWidgetView exception" + localRemoteException.getMessage());
    }
  }

  private boolean bk(i parami)
  {
    AppMethodBeat.i(9397);
    this.eBB = false;
    Bundle localBundle = new Bundle();
    localBundle.putString("widgetId", (String)parami.puc.get("widgetId"));
    try
    {
      if (this.umI != null)
        this.umI.c(100001, localBundle);
      a(parami, "openSearchWAWidgetLogView:ok", null);
      AppMethodBeat.o(9397);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doOpenSearchWAWidgetLogView exception" + localRemoteException.getMessage());
    }
  }

  private boolean bl(i parami)
  {
    AppMethodBeat.i(9398);
    this.eBB = false;
    this.uGW += 1;
    String str1 = new JSONObject(parami.puc).toString();
    com.tencent.mm.plugin.websearch.widget.d.cVP();
    String str2;
    if (!com.tencent.mm.plugin.websearch.widget.d.a(WidgetData.adQ(str1)))
      str2 = "";
    while (true)
    {
      Object localObject = new HashMap();
      ((HashMap)localObject).put("widgetId", str2);
      a(parami, "insertSearchWAWidgetView:ok", (Map)localObject);
      AppMethodBeat.o(9398);
      return true;
      str2 = (String)parami.puc.get("appid") + "_" + this.uGW + "_" + System.currentTimeMillis();
      localObject = new Bundle();
      ((Bundle)localObject).putString("fts_key_json_data", str1);
      ((Bundle)localObject).putString("fts_key_widget_view_cache_key", str2);
      ((Bundle)localObject).putInt("websearch_is_test_draw_json", ((com.tencent.mm.plugin.websearch.api.n)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.websearch.api.n.class)).cUM());
      try
      {
        if (this.umI != null)
          this.umI.c(60, (Bundle)localObject);
      }
      catch (RemoteException localRemoteException)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + localRemoteException.getMessage());
      }
    }
  }

  private boolean bm(i parami)
  {
    AppMethodBeat.i(9399);
    this.eBB = false;
    int i = this.uGX;
    this.uGX = (i + 1);
    Object localObject = i.aP(parami.puc);
    if (!((Bundle)localObject).containsKey("playerId"))
      ((Bundle)localObject).putString("playerId", String.valueOf(i));
    while (true)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "inserting video player id %d, params %s", new Object[] { Integer.valueOf(i), parami.puc });
      try
      {
        if (this.umI != null)
          this.umI.c(200000, (Bundle)localObject);
        localObject = new HashMap();
        ((HashMap)localObject).put("playerId", Integer.valueOf(i));
        a(parami, "insertVideoPlayer:ok", (Map)localObject);
        AppMethodBeat.o(9399);
        return true;
        i = bo.ank(((Bundle)localObject).getString("playerId"));
      }
      catch (RemoteException localRemoteException)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doInsertVideoPlayer exception" + localRemoteException.getMessage());
      }
    }
  }

  private boolean bn(i parami)
  {
    AppMethodBeat.i(9400);
    this.eBB = false;
    Bundle localBundle = i.aP(parami.puc);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "update video player  params %s", new Object[] { parami.puc });
    try
    {
      if (this.umI != null)
        this.umI.c(200001, localBundle);
      a(parami, "updateVideoPlayer:ok", null);
      AppMethodBeat.o(9400);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doInsertVideoPlayer exception" + localRemoteException.getMessage());
    }
  }

  private boolean bo(i parami)
  {
    AppMethodBeat.i(9401);
    this.eBB = false;
    Bundle localBundle = i.aP(parami.puc);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "remove video player   params %s", new Object[] { parami.puc });
    try
    {
      if (this.umI != null)
        this.umI.c(200002, localBundle);
      a(parami, "removeVideoPlayer:ok", null);
      AppMethodBeat.o(9401);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doRemoveVideoPlayer exception" + localRemoteException.getMessage());
    }
  }

  private boolean bp(i parami)
  {
    AppMethodBeat.i(9402);
    this.eBB = false;
    Bundle localBundle = i.aP(parami.puc);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "operate video player  params %s", new Object[] { parami.puc });
    try
    {
      if (this.umI != null)
        this.umI.c(200003, localBundle);
      a(parami, "operateVideoPlayer:ok", null);
      AppMethodBeat.o(9402);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doOperateVideoPlayer exception" + localRemoteException.getMessage());
    }
  }

  private boolean bq(i parami)
  {
    AppMethodBeat.i(9403);
    this.eBB = false;
    Object localObject = new JSONObject(parami.puc);
    String str = (String)parami.puc.get("widgetId");
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", ((JSONObject)localObject).toString());
    localBundle.putString("fts_key_widget_view_cache_key", str);
    try
    {
      if (this.umI != null)
        this.umI.c(61, localBundle);
      localObject = new HashMap();
      ((HashMap)localObject).put("widgetId", str);
      a(parami, "removeSearchWAWidgetView:ok", (Map)localObject);
      AppMethodBeat.o(9403);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + localRemoteException.getMessage());
    }
  }

  private boolean br(i parami)
  {
    AppMethodBeat.i(9404);
    this.eBB = false;
    JSONObject localJSONObject = new JSONObject(parami.puc);
    String str = (String)parami.puc.get("widgetId");
    Object localObject = new Bundle();
    ((Bundle)localObject).putString("fts_key_json_data", localJSONObject.toString());
    ((Bundle)localObject).putString("fts_key_widget_view_cache_key", str);
    try
    {
      if (this.umI != null)
        this.umI.c(62, (Bundle)localObject);
      localObject = new HashMap();
      ((HashMap)localObject).put("widgetId", str);
      a(parami, "updateSearchWAWidgetView:ok", (Map)localObject);
      AppMethodBeat.o(9404);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + localRemoteException.getMessage());
    }
  }

  private boolean bs(i parami)
  {
    AppMethodBeat.i(9405);
    String str1 = (String)parami.puc.get("miniprogramAppID");
    String str2 = (String)parami.puc.get("data");
    if (bo.isNullOrNil(str1))
      a(parami, "sendDataToMiniProgram:fail invalid miniprogramAppID", null);
    while (true)
    {
      AppMethodBeat.o(9405);
      return false;
      ((com.tencent.mm.plugin.appbrand.service.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.a.class)).i(str1, str2, this.cIv);
      a(parami, "sendDataToMiniProgram:ok", null);
    }
  }

  private boolean bt(i parami)
  {
    AppMethodBeat.i(9406);
    this.eBB = false;
    ((com.tencent.mm.plugin.appbrand.service.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.a.class)).xl(String.valueOf(parami.puc.get("appId")));
    a(parami, "preloadMiniProgramEnv:ok", null);
    AppMethodBeat.o(9406);
    return true;
  }

  private boolean bu(i parami)
  {
    AppMethodBeat.i(9407);
    this.eBB = false;
    Object localObject1 = parami.puc.get("userNames");
    String str = ":ok";
    if ((localObject1 instanceof String));
    while (true)
    {
      Object localObject2;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject1);
        localObject1 = J(localJSONArray);
        if (!bo.ek((List)localObject1))
          ((com.tencent.mm.plugin.appbrand.service.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.a.class)).ax((List)localObject1);
        a(parami, "preloadMiniProgramContacts".concat(String.valueOf(str)), null);
        AppMethodBeat.o(9407);
        return true;
      }
      catch (Exception localException)
      {
        localObject2 = null;
        str = ":fail:param type mismatch";
        continue;
      }
      if ((localObject2 instanceof JSONArray))
      {
        localObject2 = J((JSONArray)localObject2);
      }
      else if ((localObject2 instanceof String[]))
      {
        localObject2 = bo.P((String[])localObject2);
      }
      else
      {
        localObject2 = null;
        str = ":fail:empty param";
      }
    }
  }

  private boolean bv(i parami)
  {
    AppMethodBeat.i(9409);
    this.eBB = false;
    se localse = new se();
    localse.cOf.context = this.context;
    localse.cOf.userName = aa.t(parami.puc, "userName");
    localse.cOf.appId = aa.t(parami.puc, "appId");
    localse.cOf.cOh = aa.t(parami.puc, "relativeURL");
    localse.cOf.axy = aa.d(parami.puc, "appVersion", 0);
    localse.cOf.scene = aa.d(parami.puc, "scene", 1018);
    localse.cOf.cst = aa.t(parami.puc, "sceneNote");
    if (bo.isNullOrNil(localse.cOf.cst))
      localse.cOf.cst = com.tencent.mm.compatible.util.q.encode(bo.nullAsNil(getCurrentUrl()));
    localse.cOf.cOj = aa.t(parami.puc, "downloadURL");
    localse.cOf.cOi = aa.d(parami.puc, "openType", 0);
    localse.cOf.cOk = aa.t(parami.puc, "checkSumMd5");
    localse.cOf.cOm = false;
    localse.cOf.cOn.fpI = aa.t(parami.puc, "extJsonInfo");
    localse.cOf.cOs = bK(getCurrentUrl());
    if (bo.isNullOrNil(localse.cOf.cOs))
      localse.cOf.cOs = aa.t(parami.puc, "sourceAppId");
    localse.cOf.cOt = getCurrentUrl();
    localse.cOf.cOu = aa.t(parami.puc, "privateExtraData");
    com.tencent.mm.sdk.b.a.xxA.m(localse);
    if (localse.cOg.cOw)
      a(parami, "openWeApp:ok", null);
    while (true)
    {
      AppMethodBeat.o(9409);
      return true;
      a(parami, "openWeApp:fail:" + bo.nullAsNil(localse.cOg.cOx), null);
    }
  }

  private boolean bw(i parami)
  {
    AppMethodBeat.i(9410);
    this.eBB = false;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doOpenWeAppPage %s", new Object[] { parami.puc });
    Object localObject1 = aa.t(parami.puc, "userName");
    Object localObject2 = aa.t(parami.puc, "relativeURL");
    Object localObject3 = localObject2;
    if (((String)localObject2).contains("render_data"))
      localObject3 = localObject2;
    try
    {
      new StringBuilder();
      localObject3 = localObject2;
      Object localObject4 = Uri.parse((String)localObject2).getQueryParameter("widgetData");
      localObject3 = localObject2;
      Object localObject5 = new org/json/JSONObject;
      localObject3 = localObject2;
      ((JSONObject)localObject5).<init>((String)localObject4);
      localObject3 = localObject2;
      ((JSONObject)localObject5).remove("render_data");
      localObject3 = localObject2;
      localObject2 = ((String)localObject2).replaceAll("(widgetData=.*&)|(widgetData=.*$)", "&");
      localObject3 = localObject2;
      localObject4 = new java/lang/StringBuilder;
      localObject3 = localObject2;
      ((StringBuilder)localObject4).<init>();
      localObject3 = localObject2;
      localObject2 = (String)localObject2 + "&widgetData=" + ((JSONObject)localObject5).toString();
      localObject3 = localObject2;
      int i = aa.d(parami.puc, "appVersion", 0);
      localObject2 = aa.t(parami.puc, "searchId");
      String str1 = aa.t(parami.puc, "docId");
      int j = aa.d(parami.puc, "position", 1);
      k = aa.d(parami.puc, "scene", 1000);
      int m = aa.d(parami.puc, "debugMode", 0);
      int n = m;
      if (m < 0)
        n = 0;
      if (com.tencent.mm.plugin.webview.modeltools.g.cYD().tZK != null)
      {
        n = 1;
        localAppBrandStatObject = new AppBrandStatObject();
        if ((k == 201) || (k == 14) || (k == 22))
        {
          localAppBrandStatObject.scene = 1006;
          localObject4 = aa.t(parami.puc, "statSessionId");
          String str2 = aa.t(parami.puc, "statKeywordId");
          localObject5 = aa.t(parami.puc, "subScene");
          localAppBrandStatObject.cst = ((String)localObject4 + ":" + str2 + ":" + (String)localObject2 + ":" + str1 + ":" + j + ":" + (String)localObject5);
          ((com.tencent.mm.plugin.appbrand.service.e)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.e.class)).a(this.context, (String)localObject1, null, n, i, (String)localObject3, localAppBrandStatObject);
          localObject3 = new com.tencent.mm.ai.b.a();
          ((com.tencent.mm.ai.b.a)localObject3).fsJ = new csq();
          ((com.tencent.mm.ai.b.a)localObject3).fsK = new csr();
          ((com.tencent.mm.ai.b.a)localObject3).uri = "/cgi-bin/mmux-bin/weappsearchadclick";
          ((com.tencent.mm.ai.b.a)localObject3).fsI = 1873;
          localObject1 = ((com.tencent.mm.ai.b.a)localObject3).acD();
          localObject2 = (csq)((com.tencent.mm.ai.b)localObject1).fsG.fsP;
          ((csq)localObject2).xpS = aa.t(parami.puc, "statSessionId");
          ((csq)localObject2).xpT = aa.t(parami.puc, "statKeywordId");
          ((csq)localObject2).wDM = aa.t(parami.puc, "searchId");
          ((csq)localObject2).wUo = aa.t(parami.puc, "docId");
          ((csq)localObject2).gtF = aa.d(parami.puc, "position", 1);
          ((csq)localObject2).pdu = aa.t(parami.puc, "userName");
          ((csq)localObject2).xpU = aa.d(parami.puc, "appVersion", 0);
          ((csq)localObject2).xpV = aa.t(parami.puc, "adBuffer");
          ((csq)localObject2).Scene = k;
          ((csq)localObject2).xpW = aa.t(parami.puc, "clickExtInfo");
          localObject3 = new com.tencent.mm.modelsns.d();
          ((com.tencent.mm.modelsns.d)localObject3).l("20StatSessionId", ((csq)localObject2).xpS + ",");
          ((com.tencent.mm.modelsns.d)localObject3).l("21KeywordId", ((csq)localObject2).xpT + ",");
          ((com.tencent.mm.modelsns.d)localObject3).l("22SearchId", ((csq)localObject2).wDM + ",");
          ((com.tencent.mm.modelsns.d)localObject3).l("23DocId", ((csq)localObject2).wUo + ",");
          ((com.tencent.mm.modelsns.d)localObject3).l("24Pos", ((csq)localObject2).gtF + ",");
          ((com.tencent.mm.modelsns.d)localObject3).l("25AppUserName", ((csq)localObject2).pdu + ",");
          ((com.tencent.mm.modelsns.d)localObject3).l("26AppVersion", ((csq)localObject2).xpU + ",");
          ((com.tencent.mm.modelsns.d)localObject3).l("27AdBuffer", ((csq)localObject2).xpV + ",");
          ((com.tencent.mm.modelsns.d)localObject3).l("28AdClickBuffer", ((csq)localObject2).xpW + ",");
          ((com.tencent.mm.modelsns.d)localObject3).l("29scene", k + ",");
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doClickReportScene oreh" + ((com.tencent.mm.modelsns.d)localObject3).Fk());
          w.a((com.tencent.mm.ai.b)localObject1, new g.26(this, (com.tencent.mm.modelsns.d)localObject3));
          a(parami, "openWeAppPage:ok", null);
          AppMethodBeat.o(9410);
          return true;
        }
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        int k;
        AppBrandStatObject localAppBrandStatObject;
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localJSONException, "", new Object[0]);
        continue;
        if (k == 3)
          localAppBrandStatObject.scene = 1005;
        else if (k == 16)
          localAppBrandStatObject.scene = 1042;
        else if (k == 20)
          localAppBrandStatObject.scene = 1053;
        else
          localAppBrandStatObject.scene = 1000;
      }
    }
  }

  private boolean bx(i parami)
  {
    AppMethodBeat.i(9411);
    int i = aa.d(parami.puc, "logId", 0);
    String str = aa.t(parami.puc, "logString");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSearchRailtime oreh id:%d, value:%s, params:%s", new Object[] { Integer.valueOf(i), str, parami.puc });
    ((com.tencent.mm.plugin.websearch.api.n)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.websearch.api.n.class)).bw(i, str);
    a(parami, "reportWeAppSearchRealtime:ok", null);
    AppMethodBeat.o(9411);
    return true;
  }

  private boolean by(i parami)
  {
    AppMethodBeat.i(9412);
    Object localObject1 = parami.uIH.optString("name");
    Object localObject2 = parami.uIH.opt("arg");
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("name", localObject1);
      localJSONObject.put("arg", localObject2);
      localObject1 = new android/os/Bundle;
      ((Bundle)localObject1).<init>();
      ((Bundle)localObject1).putString("info", localJSONObject.toString());
      this.umI.g(139, (Bundle)localObject1);
      a(parami, "invokeMiniProgramAPI:ok", null);
      AppMethodBeat.o(9412);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doInvokeMiniProgramApi: %s", new Object[] { localException });
        a(parami, "invokeMiniProgramAPI:fail", null);
      }
    }
  }

  private void c(i parami, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3, String paramString3, boolean paramBoolean)
  {
    AppMethodBeat.i(9309);
    g.86 local86 = new g.86(this, paramString3, paramString2, parami);
    boolean bool = com.tencent.mm.plugin.webview.modeltools.g.cYE().a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, local86);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", paramString3 + ", add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      a(parami, paramString3 + ":fail", null);
      AppMethodBeat.o(9309);
    }
    while (true)
    {
      return;
      paramString1 = new g.b((byte)0);
      paramString1.uGd = parami;
      paramString1.uIC = local86;
      this.uGO.put(paramString2, paramString1);
      paramString1 = new Bundle();
      paramString1.putString("close_window_confirm_dialog_switch", "true");
      paramString1.putString("close_window_confirm_dialog_title_cn", this.context.getString(2131305571));
      paramString1.putString("close_window_confirm_dialog_title_eng", this.context.getString(2131305571));
      paramString1.putString("close_window_confirm_dialog_ok_cn", this.context.getString(2131305567));
      paramString1.putString("close_window_confirm_dialog_ok_eng", this.context.getString(2131305567));
      paramString1.putString("close_window_confirm_dialog_cancel_cn", this.context.getString(2131305568));
      paramString1.putString("close_window_confirm_dialog_cancel_eng", this.context.getString(2131305568));
      try
      {
        this.umI.c(13, paramString1);
        if (paramBoolean)
        {
          paramString1 = this.context;
          this.context.getString(2131297061);
          this.ehJ = com.tencent.mm.ui.base.h.b(paramString1, this.context.getString(2131305732), true, new g.87(this, local86, paramString2, parami, paramString3));
          this.ehJ.setOnKeyListener(new g.88(this));
          AppMethodBeat.o(9309);
        }
      }
      catch (Exception paramString1)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSetCloseWindowConfirmDialogInfo invoke callback failed : %s", new Object[] { paramString1.getMessage() });
        if ((this.context instanceof Activity))
        {
          ((Activity)this.context).finish();
          this.umI = this.uGq;
        }
        AppMethodBeat.o(9309);
      }
    }
  }

  private boolean c(i parami)
  {
    AppMethodBeat.i(9228);
    try
    {
      localObject1 = (String)this.uGd.puc.get("link");
      l.a(this.uGd.uII, agw("shareTimeline"), (String)localObject1, null);
      if ((localObject1 == null) || (((String)localObject1).length() == 0))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "naerCheckIn fail, link is null");
        a(this.uGd, "timeline_check_in:fail", null);
        AppMethodBeat.o(9228);
        bool = true;
        return bool;
      }
      agz((String)this.uGd.puc.get("desc"));
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>("naerCheckIn, img_url = ");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", (String)this.uGd.puc.get("img_url") + ", title = " + (String)this.uGd.puc.get("title") + ", desc = " + (String)this.uGd.puc.get("desc"));
      str1 = (String)this.uGd.puc.get("img_width");
      localObject2 = (String)this.uGd.puc.get("img_height");
      str2 = (String)this.uGd.puc.get("link");
      localObject1 = ar.aek(str2);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "naerCheckIn, rawUrl:[%s], shareUrl:[%s]", new Object[] { str2, localObject1 });
      str2 = (String)this.uGd.puc.get("type");
      this.uGd.puc.get("desc");
      str3 = (String)this.uGd.puc.get("title");
      str4 = (String)this.uGd.puc.get("img_url");
    }
    catch (Exception localException1)
    {
      try
      {
        String str1;
        i = Integer.valueOf(str1).intValue();
      }
      catch (Exception localException1)
      {
        try
        {
          Object localObject1;
          boolean bool;
          Object localObject2;
          String str2;
          String str3;
          String str4;
          int i;
          Integer.valueOf((String)localObject2);
          while (true)
          {
            label384: localObject2 = new android/content/Intent;
            ((Intent)localObject2).<init>();
            ((Intent)localObject2).putExtra("Ksnsupload_width", i);
            ((Intent)localObject2).putExtra("Ksnsupload_height", i);
            ((Intent)localObject2).putExtra("Ksnsupload_link", (String)localObject1);
            ((Intent)localObject2).putExtra("Ksnsupload_title", str3);
            ((Intent)localObject2).putExtra("Ksnsupload_imgurl", str4);
            ((Intent)localObject2).putExtra("Ksnsupload_type", 1);
            if ((!bo.isNullOrNil(str2)) && (str2.equals("music")))
              ((Intent)localObject2).putExtra("ksnsis_music", true);
            if ((!bo.isNullOrNil(str2)) && (str2.equals("video")))
              ((Intent)localObject2).putExtra("ksnsis_video", true);
            str3 = (String)this.uGd.puc.get("poiId");
            str2 = (String)this.uGd.puc.get("poiName");
            localObject1 = (String)this.uGd.puc.get("poiAddress");
            float f1 = bo.getFloat((String)parami.puc.get("latitude"), 0.0F);
            float f2 = bo.getFloat((String)parami.puc.get("longitude"), 0.0F);
            ((Intent)localObject2).putExtra("kpoi_id", str3);
            ((Intent)localObject2).putExtra("kpoi_name", str2);
            ((Intent)localObject2).putExtra("Kpoi_address", (String)localObject1);
            ((Intent)localObject2).putExtra("k_lat", f1);
            ((Intent)localObject2).putExtra("k_lng", f2);
            com.tencent.mm.bp.d.b(this.context, "sns", ".ui.SnsUploadUI", (Intent)localObject2);
            this.eBB = false;
            AppMethodBeat.o(9228);
            bool = false;
            break;
            parami = parami;
            AppMethodBeat.o(9228);
            bool = true;
            break;
            localException1 = localException1;
            i = -1;
          }
        }
        catch (Exception localException2)
        {
          break label384;
        }
      }
    }
  }

  private boolean c(i parami, JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    AppMethodBeat.i(9248);
    this.uGv.bE(2, (String)parami.puc.get("use_update_jsapi_data"));
    a(parami, paramJsapiPermissionWrapper.jB(88));
    this.cEl = g(parami);
    if (this.cEl == null)
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doTimeline fail, appmsg is null");
    Object localObject1 = (String)parami.puc.get("link");
    if ((localObject1 == null) || (((String)localObject1).length() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doTimeline fail, link is null");
      gB(2, 2);
      a(parami, "share_timeline:fail", null);
      AppMethodBeat.o(9248);
      return true;
    }
    paramJsapiPermissionWrapper = (String)parami.puc.get("desc");
    if (paramJsapiPermissionWrapper != null)
      agz(paramJsapiPermissionWrapper);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doTimeline, img_url = " + (String)parami.puc.get("img_url") + ", title = " + (String)parami.puc.get("title") + ", desc = " + (String)parami.puc.get("desc"));
    int i = 1;
    paramJsapiPermissionWrapper = "";
    int j = 0;
    if (this.uGh != null)
    {
      this.uGh.setClassLoader(getClass().getClassLoader());
      i = this.uGh.getInt("snsWebSource", 1);
      paramJsapiPermissionWrapper = this.uGh.getString("jsapi_args_appid");
      j = bo.getInt(this.uGh.getString("urlAttribute"), 0);
      this.uGh.remove("urlAttribute");
    }
    if (bo.isNullOrNil(paramJsapiPermissionWrapper))
      paramJsapiPermissionWrapper = (String)parami.puc.get("appid");
    while (true)
      while (true)
      {
        l.a(parami.uII, agw("shareTimeline"), (String)localObject1, paramJsapiPermissionWrapper);
        Object localObject2 = (String)parami.puc.get("img_width");
        String str1 = (String)parami.puc.get("img_height");
        Object localObject3 = (String)parami.puc.get("link");
        String str2 = ar.aek((String)localObject3);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doTimeline, rawUrl:[%s], shareUrl:[%s]", new Object[] { localObject3, str2 });
        parami.puc.get("desc");
        String str3 = (String)parami.puc.get("title");
        localObject3 = (String)parami.puc.get("img_url");
        String str4 = (String)parami.puc.get("src_username");
        parami = (String)parami.puc.get("src_displayname");
        try
        {
          k = Integer.valueOf((String)localObject2).intValue();
        }
        catch (Exception localException1)
        {
          try
          {
            int k;
            Integer.valueOf(str1);
            while (true)
            {
              while (true)
              {
                label531: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doTimeline, init intent");
                localObject2 = new Intent();
                ((Intent)localObject2).putExtra("Ksnsupload_width", k);
                ((Intent)localObject2).putExtra("Ksnsupload_height", k);
                ((Intent)localObject2).putExtra("Ksnsupload_link", str2);
                ((Intent)localObject2).putExtra("Ksnsupload_title", str3);
                ((Intent)localObject2).putExtra("Ksnsupload_imgurl", (String)localObject3);
                ((Intent)localObject2).putExtra("Ksnsupload_contentattribute", j);
                if (com.tencent.mm.model.t.mZ(str4))
                {
                  ((Intent)localObject2).putExtra("src_username", str4);
                  ((Intent)localObject2).putExtra("src_displayname", parami);
                }
                ((Intent)localObject2).putExtra("Ksnsupload_source", i);
                ((Intent)localObject2).putExtra("Ksnsupload_type", 1);
                if ((paramJsapiPermissionWrapper != null) && (paramJsapiPermissionWrapper.length() > 0))
                  ((Intent)localObject2).putExtra("Ksnsupload_appid", paramJsapiPermissionWrapper);
                boolean bool;
                if (this.uGh == null)
                {
                  bool = true;
                  label696: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doTimeline, init intent, jsapiArgs == null ? %b", new Object[] { Boolean.valueOf(bool) });
                  parami = null;
                  if (this.uGh != null)
                  {
                    str4 = this.uGh.getString("K_sns_thumb_url");
                    parami = this.uGh.getString("K_sns_raw_url");
                    localObject3 = bo.bc(this.uGh.getString("KSnsStrId"), "");
                    str3 = bo.bc(this.uGh.getString("KSnsLocalId"), "");
                    paramJsapiPermissionWrapper = this.uGh.getString("key_snsad_statextstr");
                    ((Intent)localObject2).putExtra("key_snsad_statextstr", paramJsapiPermissionWrapper);
                    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "currentUrl %s contentUrl %s thumbUrl %s", new Object[] { localObject1, parami, str4 });
                    if ((parami != null) && (localObject1 != null) && (parami.equals(localObject1)))
                      ((Intent)localObject2).putExtra("KlinkThumb_url", str4);
                    ((Intent)localObject2).putExtra("KSnsStrId", (String)localObject3);
                    ((Intent)localObject2).putExtra("KSnsLocalId", str3);
                    parami = this.uGh.getParcelable("KSnsAdTag");
                    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doTimeline, snsAdTag : %s", new Object[] { parami });
                    if ((parami != null) && ((parami instanceof SnsAdClick)))
                      ((Intent)localObject2).putExtra("KsnsAdTag", (SnsAdClick)parami);
                    parami = paramJsapiPermissionWrapper;
                    if (localObject3 != null)
                    {
                      parami = paramJsapiPermissionWrapper;
                      if (this.uGh.getBoolean("KFromTimeline", false))
                      {
                        parami = new rh();
                        parami.cNm.cFc = ((String)localObject3);
                        parami.cNm.cwT = str3;
                        com.tencent.mm.sdk.b.a.xxA.m(parami);
                        parami = paramJsapiPermissionWrapper;
                      }
                    }
                  }
                }
                try
                {
                  ((Intent)localObject2).putExtra("ShareUrlOriginal", this.umI.cYY());
                  paramJsapiPermissionWrapper = this.umI.g(18, null);
                  if (paramJsapiPermissionWrapper == null)
                  {
                    paramJsapiPermissionWrapper = "";
                    ((Intent)localObject2).putExtra("KPublisherId", paramJsapiPermissionWrapper);
                    paramJsapiPermissionWrapper = this.umI.getCurrentUrl();
                    ((Intent)localObject2).putExtra("ShareUrlOpen", paramJsapiPermissionWrapper);
                    ((Intent)localObject2).putExtra("JsAppId", this.uGr.agj(paramJsapiPermissionWrapper));
                    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doTimeline, start activity");
                    if ((this.context instanceof MMActivity))
                      ((Intent)localObject2).putExtra("need_result", true);
                  }
                }
                catch (RemoteException paramJsapiPermissionWrapper)
                {
                  try
                  {
                    while (true)
                    {
                      localObject3 = this.umI.g(18, null);
                      if (localObject3 != null)
                      {
                        paramJsapiPermissionWrapper = com.tencent.mm.model.v.nW(bo.nullAsNil(((Bundle)localObject3).getString("KPublisherId")));
                        localObject1 = com.tencent.mm.model.v.Zp().y(paramJsapiPermissionWrapper, true);
                        ((v.b)localObject1).j("sendAppMsgScene", Integer.valueOf(2));
                        ((v.b)localObject1).j("preChatName", ((Bundle)localObject3).getString("preChatName"));
                        ((v.b)localObject1).j("preMsgIndex", Integer.valueOf(((Bundle)localObject3).getInt("preMsgIndex")));
                        ((v.b)localObject1).j("prePublishId", ((Bundle)localObject3).getString("prePublishId"));
                        ((v.b)localObject1).j("preUsername", ((Bundle)localObject3).getString("preUsername"));
                        ((v.b)localObject1).j("url", str2);
                        ((v.b)localObject1).j("getA8KeyScene", Integer.valueOf(((Bundle)localObject3).getInt("getA8KeyScene")));
                        ((v.b)localObject1).j("referUrl", ((Bundle)localObject3).getString("referUrl"));
                        j = ((Bundle)localObject3).getInt("_DATA_CENTER_ITEM_SHOW_TYPE", -1);
                        if (j != -1)
                        {
                          ((v.b)localObject1).j("_DATA_CENTER_ITEM_SHOW_TYPE", Integer.valueOf(j));
                          ((v.b)localObject1).j("_tmpl_webview_transfer_scene", Integer.valueOf(10));
                        }
                        if (!bo.isNullOrNil(parami))
                          ((v.b)localObject1).j("adExtStr", parami);
                        ((Intent)localObject2).putExtra("reportSessionId", paramJsapiPermissionWrapper);
                      }
                      ((MMActivity)this.context).ifE = this;
                      com.tencent.mm.bp.d.a(this.context, "sns", ".ui.SnsUploadUI", (Intent)localObject2, 24, false);
                      AppMethodBeat.o(9248);
                      break;
                      bool = false;
                      break label696;
                      paramJsapiPermissionWrapper = bo.nullAsNil(paramJsapiPermissionWrapper.getString("KPublisherId"));
                    }
                    paramJsapiPermissionWrapper = paramJsapiPermissionWrapper;
                    com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", paramJsapiPermissionWrapper, "", new Object[0]);
                  }
                  catch (RemoteException parami)
                  {
                    while (true)
                      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "try to attach report args error, %s", new Object[] { parami });
                  }
                }
              }
              localException1 = localException1;
              k = -1;
            }
          }
          catch (Exception localException2)
          {
            break label531;
          }
        }
      }
  }

  private boolean cA(i parami)
  {
    AppMethodBeat.i(9479);
    HashMap localHashMap = new HashMap();
    try
    {
      Object localObject1 = new com/tencent/mm/ui/widget/a/c$a;
      ((com.tencent.mm.ui.widget.a.c.a)localObject1).<init>(this.context);
      Object localObject2 = parami.uIH;
      if (((JSONObject)localObject2).has("title"))
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).asD(((JSONObject)localObject2).getString("title"));
      if (((JSONObject)localObject2).has("titleDesc"))
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).aj(((JSONObject)localObject2).getString("titleDesc"));
      if (((JSONObject)localObject2).has("titleColor"))
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).PW(parseColor(((JSONObject)localObject2).getString("titleColor")));
      if (((JSONObject)localObject2).has("titleMaxLine"))
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).PX(((JSONObject)localObject2).getInt("titleMaxLine"));
      if (((JSONObject)localObject2).has("titleGravity"))
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).PY(((JSONObject)localObject2).getInt("titleGravity"));
      if (((JSONObject)localObject2).has("msg"))
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).asE(((JSONObject)localObject2).getString("msg"));
      if (((JSONObject)localObject2).has("msgSubTitle"))
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).ak(((JSONObject)localObject2).getString("msgSubTitle"));
      Object localObject3;
      if (((JSONObject)localObject2).has("msgSubDesc"))
      {
        localObject3 = ((JSONObject)localObject2).getString("msgSubDesc");
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).zQe.zPe = ((CharSequence)localObject3);
      }
      if (((JSONObject)localObject2).has("msgMaxLine"))
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).Qa(((JSONObject)localObject2).getInt("msgMaxLine"));
      if (((JSONObject)localObject2).has("msgIconBase64"))
      {
        localObject3 = Base64.decode(((JSONObject)localObject2).getString("msgIconBase64"), 0);
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).ar(BitmapFactory.decodeByteArray((byte[])localObject3, 0, localObject3.length));
      }
      while (true)
      {
        if (((JSONObject)localObject2).has("contentDesc"))
          ((com.tencent.mm.ui.widget.a.c.a)localObject1).asG(((JSONObject)localObject2).getString("contentDesc"));
        if (((JSONObject)localObject2).has("contentDescGravity"))
          ((com.tencent.mm.ui.widget.a.c.a)localObject1).Qb(((JSONObject)localObject2).getInt("contentDescGravity"));
        if (((JSONObject)localObject2).has("confirmText"))
          ((com.tencent.mm.ui.widget.a.c.a)localObject1).asJ(((JSONObject)localObject2).getString("confirmText"));
        if (((JSONObject)localObject2).has("confirmTextColor"))
          ((com.tencent.mm.ui.widget.a.c.a)localObject1).Qe(parseColor(((JSONObject)localObject2).getString("confirmTextColor")));
        if (((JSONObject)localObject2).has("cancelText"))
          ((com.tencent.mm.ui.widget.a.c.a)localObject1).asK(((JSONObject)localObject2).getString("cancelText"));
        if (((JSONObject)localObject2).has("cancelTextColor"))
          ((com.tencent.mm.ui.widget.a.c.a)localObject1).Qf(parseColor(((JSONObject)localObject2).getString("cancelTextColor")));
        localObject3 = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$38;
        ((g.38)localObject3).<init>(this, parami, localHashMap);
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).f((DialogInterface.OnCancelListener)localObject3);
        localObject3 = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$39;
        ((g.39)localObject3).<init>(this, parami, localHashMap);
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).a((DialogInterface.OnDismissListener)localObject3);
        localObject3 = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$40;
        ((g.40)localObject3).<init>(this, parami, localHashMap);
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).a((DialogInterface.OnClickListener)localObject3);
        localObject3 = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$41;
        ((g.41)localObject3).<init>(this, parami, localHashMap);
        ((com.tencent.mm.ui.widget.a.c.a)localObject1).b((DialogInterface.OnClickListener)localObject3);
        com.tencent.mm.ui.widget.a.c localc = ((com.tencent.mm.ui.widget.a.c.a)localObject1).aMb();
        if (((JSONObject)localObject2).has("msgIconUrl"))
        {
          localObject1 = localc.zPI;
          localObject3 = com.tencent.mm.at.o.ahp();
          localObject2 = ((JSONObject)localObject2).getString("msgIconUrl");
          com.tencent.mm.at.a.a.c.a locala = new com/tencent/mm/at/a/a/c$a;
          locala.<init>();
          locala.ePH = true;
          ((com.tencent.mm.at.a.a)localObject3).a((String)localObject2, (ImageView)localObject1, locala.ahG());
        }
        localc.show();
        AppMethodBeat.o(9479);
        return true;
        if (((JSONObject)localObject2).has("msgIconUrl"))
          ((com.tencent.mm.ui.widget.a.c.a)localObject1).ar(Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888));
      }
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localJSONException, "doConfirmDialog", new Object[0]);
        a(parami, parami.uIJ + ":err", localHashMap);
      }
    }
  }

  private boolean cB(i parami)
  {
    AppMethodBeat.i(9480);
    Object localObject = ((com.tencent.mm.plugin.downloader_app.a.d)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.downloader_app.a.d.class)).biz();
    if (bo.ek((List)localObject))
    {
      a(parami, parami.uIJ + ":ok", null);
      AppMethodBeat.o(9480);
    }
    while (true)
    {
      return true;
      HashMap localHashMap = new HashMap();
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = ((LinkedList)localObject).iterator();
      label88: com.tencent.mm.plugin.downloader_app.a.b localb;
      if (localIterator.hasNext())
      {
        localb = (com.tencent.mm.plugin.downloader_app.a.b)localIterator.next();
        localObject = new JSONObject();
      }
      try
      {
        ((JSONObject)localObject).put("appid", localb.appId);
        ((JSONObject)localObject).put("status", localb.kOe);
        ((JSONObject)localObject).put("download_id", localb.crZ);
        ((JSONObject)localObject).put("progress", localb.progress);
        if (localb.kNu)
          ((JSONObject)localObject).put("reserve_for_wifi", 1);
        label187: localJSONArray.put(localObject);
        break label88;
        localHashMap.put("result", localJSONArray);
        a(parami, parami.uIJ + ":ok", localHashMap);
        AppMethodBeat.o(9480);
      }
      catch (JSONException localJSONException)
      {
        break label187;
      }
    }
  }

  private boolean ca(i parami)
  {
    AppMethodBeat.i(9451);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doGetBackgroundAudioState()");
    if (!cc(parami))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "no permission to do get state");
      a(parami, "getBackgroundAudioState:fail", null);
      AppMethodBeat.o(9451);
      return true;
    }
    com.tencent.mm.aw.e locale = com.tencent.mm.aw.a.aih();
    com.tencent.mm.aw.c localc;
    int i;
    if (locale != null)
    {
      localc = com.tencent.mm.aw.a.aii();
      i = -1;
      if (localc == null)
        break label509;
      i = localc.mDuration;
    }
    label225: label509: for (int j = localc.mPosition; ; j = 0)
    {
      if ((localc == null) || (i < 0) || (j < 0))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "return parameter is invalid");
        a(parami, "getBackgroundAudioState:fail", null);
        AppMethodBeat.o(9451);
        break;
      }
      com.tencent.mm.sdk.b.a.xxA.c(this.uHa);
      i /= 1000;
      int k = j / 1000;
      int m = localc.mStatus;
      j = localc.fJQ;
      if (i > 0);
      for (j = j * i / 100; ; j = 0)
      {
        HashMap localHashMap = new HashMap();
        localHashMap.put("duration", Integer.valueOf(i));
        localHashMap.put("currentTime", Integer.valueOf(k));
        String str;
        if (m == 1)
        {
          i = 0;
          localHashMap.put("paused", Integer.valueOf(i));
          localHashMap.put("src", locale.fKa);
          localHashMap.put("buffered", Integer.valueOf(j));
          localHashMap.put("title", locale.fJW);
          localHashMap.put("epname", locale.fJY);
          localHashMap.put("singer", locale.fJX);
          localHashMap.put("coverImgUrl", locale.fJZ);
          localHashMap.put("isLive", Integer.valueOf(0));
          localHashMap.put("startTime", Integer.valueOf(locale.startTime / 1000));
          localHashMap.put("srcId", locale.fKs);
          if (locale.protocol != null)
            break label473;
          str = "";
          localHashMap.put("protocol", str);
          localHashMap.put("webUrl", locale.fKc);
          localHashMap.put("playState", localc.fJR);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getBackgroundAudioState ok");
          a(parami, "getBackgroundAudioState:ok", localHashMap);
        }
        while (true)
        {
          AppMethodBeat.o(9451);
          break;
          i = 1;
          break label225;
          str = locale.protocol;
          break label396;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "currentWrapper is null");
          a(parami, "getBackgroundAudioState:fail", null);
        }
      }
    }
  }

  private boolean cb(i parami)
  {
    AppMethodBeat.i(9453);
    String str1 = (String)parami.puc.get("operationType");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doOperateBackgroundAudio(), optype:%s", new Object[] { str1 });
    String str2 = (String)parami.puc.get("appId");
    Object localObject = str2;
    if (this.uGh != null)
    {
      String str3 = str2;
      if (TextUtils.isEmpty(str2))
        str3 = this.uGh.getString("jsapi_args_appid");
      localObject = str3;
      if (TextUtils.isEmpty(str3))
        localObject = this.uGr.agj(getCurrentUrl());
    }
    l.a(parami.uII, false, null, (String)localObject);
    if (!cc(parami))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOperateBackgroundAudio getMusicPermission is false");
      a(parami, "operateBackgroundAudio:fail", null);
      AppMethodBeat.o(9453);
    }
    while (true)
    {
      return true;
      if (!bo.isNullOrNil(str1))
        break;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOperateBackgroundAudio optype is empty");
      a(parami, "operateBackgroundAudio:fail", null);
      AppMethodBeat.o(9453);
    }
    com.tencent.mm.sdk.b.a.xxA.c(this.uHa);
    if (str1.equalsIgnoreCase("play"))
      if (com.tencent.mm.aw.b.aij())
        a(parami, "operateBackgroundAudio:ok", null);
    while (true)
    {
      AppMethodBeat.o(9453);
      break;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "operateBackgroundAudio play fail");
      a(parami, "operateBackgroundAudio:fail", null);
      continue;
      if (str1.equalsIgnoreCase("resume"))
      {
        if (com.tencent.mm.aw.b.aij())
        {
          a(parami, "operateBackgroundAudio:ok", null);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "operateBackgroundAudio resume fail");
          a(parami, "operateBackgroundAudio:fail", null);
        }
      }
      else if (str1.equalsIgnoreCase("pause"))
      {
        if (com.tencent.mm.aw.b.aik())
        {
          com.tencent.mm.aw.a.aid();
          a(parami, "operateBackgroundAudio:ok", null);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "operateBackgroundAudio pause fail");
          a(parami, "operateBackgroundAudio:fail", null);
        }
      }
      else if (str1.equalsIgnoreCase("seek"))
      {
        int i = bo.getInt((String)parami.puc.get("currentTime"), -1);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "currentTime:%d", new Object[] { Integer.valueOf(i) });
        if (i < 0)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "currentTime is invalid!");
          a(parami, "operateBackgroundAudio:fail", null);
        }
        else if (com.tencent.mm.aw.a.lP(i * 1000))
        {
          a(parami, "operateBackgroundAudio:ok", null);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "operateBackgroundAudio seek fail");
          a(parami, "operateBackgroundAudio:fail", null);
        }
      }
      else if (str1.equalsIgnoreCase("stop"))
      {
        if (com.tencent.mm.aw.b.ail())
        {
          a(parami, "operateBackgroundAudio:ok", null);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "operateBackgroundAudio stop fail");
          a(parami, "operateBackgroundAudio:fail", null);
        }
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "operateBackgroundAudio fail, invalid opeType");
        a(parami, "operateBackgroundAudio:fail", null);
      }
    }
  }

  private boolean cc(i parami)
  {
    int i = 1;
    AppMethodBeat.i(9454);
    Object localObject1 = com.tencent.mm.aw.a.aih();
    String str = (String)parami.puc.get("appId");
    Object localObject2 = str;
    if (this.uGh != null)
    {
      localObject3 = str;
      if (TextUtils.isEmpty(str))
        localObject3 = this.uGh.getString("jsapi_args_appid");
      localObject2 = localObject3;
      if (!TextUtils.isEmpty((CharSequence)localObject3));
    }
    for (Object localObject3 = this.uGr.agj(getCurrentUrl()); ; localObject3 = localObject2)
    {
      localObject2 = (String)parami.puc.get("url");
      parami = null;
      if (!bo.isNullOrNil((String)localObject2))
        parami = com.tencent.mm.plugin.webview.modelcache.q.aeL((String)localObject2);
      if (localObject1 != null)
      {
        localObject2 = ((com.tencent.mm.aw.e)localObject1).fKh;
        str = com.tencent.mm.plugin.webview.modelcache.q.aeL(((com.tencent.mm.aw.e)localObject1).fKc);
        localObject1 = ((com.tencent.mm.aw.e)localObject1).fKr;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "app_id:%s, musicAppId:%s", new Object[] { localObject3, localObject2 });
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "domain: %s, songWebDomain: %s, jsWebDomain: %s， with no port", new Object[] { parami, str, localObject1 });
        if ((TextUtils.isEmpty((CharSequence)localObject3)) || (!((String)localObject3).equalsIgnoreCase((String)localObject2)))
          break label323;
      }
      label323: for (boolean bool1 = true; ; bool1 = false)
      {
        boolean bool2 = bool1;
        if (!TextUtils.isEmpty(parami))
        {
          bool2 = bool1;
          if (parami.equalsIgnoreCase(str))
            bool2 = true;
        }
        bool1 = bool2;
        if (!TextUtils.isEmpty(parami))
        {
          bool1 = bool2;
          if (parami.equalsIgnoreCase((String)localObject1))
            bool1 = true;
        }
        if (bool1);
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getMusicPermission hasPermmision:%d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(9454);
          return bool1;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "currentWrapper is null");
          bool1 = false;
          break;
          i = 0;
        }
      }
    }
  }

  private boolean cd(i parami)
  {
    AppMethodBeat.i(9455);
    String str1 = av.fly.T("login_user_name", "");
    String str2 = (String)parami.puc.get("request_ticket");
    if (!bo.isNullOrNil(str2))
    {
      parami = new Intent();
      parami.putExtra("Kusername", str1);
      parami.putExtra("Kvertify_key", str2);
      if ((this.context instanceof MMActivity))
      {
        ((MMActivity)this.context).ifE = this;
        com.tencent.mm.bp.d.b(this.context, "voiceprint", ".ui.VoiceLoginUI", parami, 57);
      }
    }
    while (true)
    {
      AppMethodBeat.o(9455);
      return true;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "requestVoiceLoginVerify, ticket is null");
      a(parami, "requestVoiceLoginVerify:ticket is null", null);
    }
  }

  private boolean ce(i parami)
  {
    AppMethodBeat.i(9456);
    HashMap localHashMap = new HashMap();
    try
    {
      Object localObject1 = (String)parami.puc.get("next_step");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "next_step: %s", new Object[] { localObject1 });
      Object localObject2 = new android/os/Bundle;
      ((Bundle)localObject2).<init>();
      if (!bo.isNullOrNil((String)localObject1))
      {
        if (!"auth_again".equals(localObject1))
          break label169;
        ((Bundle)localObject2).putString("go_next", "auth_again");
      }
      while (true)
      {
        this.umI.cZb();
        this.umI.W((Bundle)localObject2);
        localObject2 = com.tencent.mm.sdk.b.a.xxA;
        localObject1 = new com/tencent/mm/g/a/vo;
        ((vo)localObject1).<init>();
        ((com.tencent.mm.sdk.b.a)localObject2).m((com.tencent.mm.sdk.b.b)localObject1);
        localHashMap.put("err_code", Integer.valueOf(0));
        localHashMap.put("err_msg", "ok");
        a(parami, "close window and next:ok", localHashMap);
        AppMethodBeat.o(9456);
        return true;
        label169: if ("get_reg_verify_code".equals(localObject1))
          ((Bundle)localObject2).putString("go_next", "get_reg_verify_code");
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doCloseWindow, ex = " + localException.getMessage());
        localHashMap.put("err_code", Integer.valueOf(1));
        localHashMap.put("err_msg", "fail");
        a(parami, "close window and next:fail", localHashMap);
      }
    }
  }

  private boolean cf(i parami)
  {
    AppMethodBeat.i(9457);
    String str = (String)parami.puc.get("username");
    if (bo.isNullOrNil(str))
    {
      a(parami, "open_biz_chat:param_err", null);
      AppMethodBeat.o(9457);
    }
    while (true)
    {
      return true;
      Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(str);
      if ((localObject == null) || (!((ad)localObject).dsf()))
      {
        a(parami, "open_biz_chat:not biz username", null);
        AppMethodBeat.o(9457);
      }
      else if (!com.tencent.mm.n.a.jh(((com.tencent.mm.g.c.ap)localObject).field_type))
      {
        a(parami, "open_biz_chat:unfollow", null);
        AppMethodBeat.o(9457);
      }
      else
      {
        localObject = new Intent();
        ((Intent)localObject).putExtra("Chat_User", str);
        ((Intent)localObject).putExtra("finish_direct", true);
        com.tencent.mm.bp.d.f(this.context, ".ui.chatting.ChattingUI", (Intent)localObject);
        a(parami, "open_biz_chat:ok", null);
        AppMethodBeat.o(9457);
      }
    }
  }

  private boolean cg(i parami)
  {
    AppMethodBeat.i(9458);
    String str1 = (String)parami.puc.get("url");
    if (bo.isNullOrNil(str1))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView, url is null");
      a(parami, "openGameUrlWithExtraWebView:fail", null);
      AppMethodBeat.o(9458);
    }
    while (true)
    {
      return true;
      String str2 = (String)parami.puc.get("statusBarColor");
      int i = 0;
      if (!bo.isNullOrNil(str2));
      try
      {
        i = Color.parseColor(str2);
        str2 = (String)parami.puc.get("statusBarStyle");
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", str1);
        localIntent.putExtra("customize_status_bar_color", i);
        localIntent.putExtra("status_bar_style", str2);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView, time: " + System.currentTimeMillis());
        localIntent.putExtra("start_time", System.currentTimeMillis());
        localIntent.putExtra("start_activity_time", System.currentTimeMillis());
        com.tencent.mm.plugin.webview.ui.tools.g.a(localIntent.getExtras(), "webview", ".ui.tools.game.GameWebViewUI", this.umI, new g.31(this, localIntent));
        a(parami, "openGameUrlWithExtraWebView:ok", null);
        AppMethodBeat.o(9458);
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView: " + localIllegalArgumentException.getMessage());
        a(parami, "openGameUrlWithExtraWebView:fail_invalid_color", null);
        AppMethodBeat.o(9458);
      }
    }
  }

  private boolean ch(i parami)
  {
    AppMethodBeat.i(9459);
    String str1 = bK(getCurrentUrl());
    if (bo.isNullOrNil(str1))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "appId is null");
      a(parami, "setGameData:fail_appid_null", null);
      AppMethodBeat.o(9459);
    }
    String str2;
    String str3;
    String str4;
    String str5;
    boolean bool;
    while (true)
    {
      return true;
      str2 = (String)parami.puc.get("key");
      str3 = (String)parami.puc.get("value");
      str4 = (String)parami.puc.get("weight");
      str5 = (String)parami.puc.get("expireTime");
      bool = bo.getBoolean((String)parami.puc.get("autoClean"), true);
      if ((!bo.isNullOrNil(str2)) && (!bo.isNullOrNil(str3)))
        break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "key or value is null");
      a(parami, "setGameData:fail_null_key", null);
      AppMethodBeat.o(9459);
    }
    if (com.tencent.mm.plugin.webview.b.b.cWi().a(str1, str2, str3, str4, str5, bool))
      a(parami, "setGameData:ok", null);
    while (true)
    {
      AppMethodBeat.o(9459);
      break;
      a(parami, "setGameData:fail_exceed_size", null);
    }
  }

  private boolean ci(i parami)
  {
    AppMethodBeat.i(9460);
    Object localObject1 = bK(getCurrentUrl());
    if (bo.isNullOrNil((String)localObject1))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "appId is null");
      a(parami, "getGameData:fail", null);
      AppMethodBeat.o(9460);
    }
    Object localObject2;
    while (true)
    {
      return true;
      localObject2 = (String)parami.puc.get("key");
      if (!bo.isNullOrNil((String)localObject2))
        break;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "key is null");
      a(parami, "getGameData:fail", null);
      AppMethodBeat.o(9460);
    }
    localObject1 = com.tencent.mm.plugin.webview.b.b.cWi().gV((String)localObject1, (String)localObject2);
    if (!bo.isNullOrNil(((com.tencent.mm.plugin.webview.b.a)localObject1).field_value))
    {
      localObject2 = new HashMap();
      ((Map)localObject2).put("value", ((com.tencent.mm.plugin.webview.b.a)localObject1).field_value);
      ((Map)localObject2).put("weight", ((com.tencent.mm.plugin.webview.b.a)localObject1).field_weight);
      ((Map)localObject2).put("expireTime", Long.valueOf(((com.tencent.mm.plugin.webview.b.a)localObject1).field_expireTime - System.currentTimeMillis() / 1000L));
      a(parami, "getGameData:ok", (Map)localObject2);
    }
    while (true)
    {
      AppMethodBeat.o(9460);
      break;
      a(parami, "getGameData:ok", null);
    }
  }

  private boolean cj(i parami)
  {
    AppMethodBeat.i(9461);
    String str1 = bK(getCurrentUrl());
    if (bo.isNullOrNil(str1))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "appId is null");
      a(parami, "clearData:fail", null);
      AppMethodBeat.o(9461);
      return true;
    }
    String str2 = (String)parami.puc.get("keys");
    boolean bool = bo.getBoolean((String)parami.puc.get("clearAllData"), false);
    if (!bo.isNullOrNil(str2));
    while (true)
    {
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>(str2);
        com.tencent.mm.plugin.webview.b.b.cWi().b(str1, localJSONArray);
        a(parami, "clearGameData:ok", null);
        AppMethodBeat.o(9461);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doClearData: " + localException.getMessage());
        a(parami, "clearGameData:fail", null);
        continue;
      }
      if (bool)
      {
        com.tencent.mm.plugin.webview.b.b.cWi().adY(localException);
        a(parami, "clearGameData:ok", null);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "key is null");
        a(parami, "clearGameData:fail", null);
      }
    }
  }

  private boolean ck(i parami)
  {
    AppMethodBeat.i(9462);
    this.eBB = false;
    a(parami, "recordHistory:ok", null);
    if ((com.tencent.mm.bd.b.aiC().fNf & 0x20000) == 131072L)
    {
      i = 1;
      if (i != 0)
        break label65;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doRecordHistory switch close");
      AppMethodBeat.o(9462);
    }
    label65: String str1;
    while (true)
    {
      return true;
      i = 0;
      break;
      str1 = ar.aek((String)parami.puc.get("url"));
      if (!bo.isNullOrNil(str1))
        break label109;
      a(parami, "recordHistory:fail", null);
      AppMethodBeat.o(9462);
    }
    label109: int i = bo.getInt((String)parami.puc.get("webview_scene"), 0);
    if ((i == 33) || (i == 46))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "hasRecordPermission false, getA8keyScene = ".concat(String.valueOf(i)));
      i = 0;
    }
    while (true)
    {
      if (i != 0)
        break label381;
      a(parami, "recordHistory:fail", null);
      AppMethodBeat.o(9462);
      break;
      if (!str1.startsWith("http"))
      {
        i = 0;
      }
      else
      {
        localObject1 = Uri.parse(str1);
        str2 = ((Uri)localObject1).getHost() + ((Uri)localObject1).getPath();
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "hasRecordPermission, hostPath: ".concat(String.valueOf(str2)));
        str3 = af.a.cXG().getString("oauth_host_paths");
        localObject2 = str3;
        if (bo.isNullOrNil(str3))
          localObject2 = "open.weixin.qq.com/connect/oauth2/authorize";
        localObject2 = ((String)localObject2).split(";");
        if (str2.contains("weixin110.qq.com"))
        {
          i = 0;
        }
        else if ("weixin110.qq.com;res.wx.qq.com;weops.qq.com;wx-credit-repay.tencent.com;chong.qq.com;qian.tenpay.com;payapp.weixin.qq.com;pay.weixin.qq.com;wx.tenpay.com".contains(((Uri)localObject1).getHost().toLowerCase()))
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "forbidden host %s", new Object[] { ((Uri)localObject1).getHost() });
          i = 0;
        }
        else
        {
          for (i = 0; ; i++)
          {
            if (i >= localObject2.length)
              break label376;
            if (str2.equalsIgnoreCase(localObject2[i]))
            {
              i = 0;
              break;
            }
          }
          label376: i = 1;
        }
      }
    }
    label381: Object localObject1 = bo.nullAsNil((String)parami.puc.get("title"));
    String str3 = bo.nullAsNil((String)parami.puc.get("source"));
    String str2 = bo.nullAsNil((String)parami.puc.get("img_url"));
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doRecordHistory link %s,title %s,source %s,imgUrl %s", new Object[] { str1, localObject1, str3, str2 });
    com.tencent.mm.plugin.webview.b.e locale = com.tencent.mm.plugin.webview.modeltools.g.cYJ();
    Object localObject2 = new com.tencent.mm.plugin.webview.b.d();
    ((com.tencent.mm.plugin.webview.b.d)localObject2).field_link = str1;
    if (locale.b((com.tencent.mm.sdk.e.c)localObject2, new String[] { "link" }))
    {
      label513: if (localObject2 == null)
        break label603;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doRecordHistory update");
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_link = str1;
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_title = ((String)localObject1);
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_source = str3;
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_imgUrl = str2;
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_timeStamp = (System.currentTimeMillis() / 1000L);
      com.tencent.mm.plugin.webview.modeltools.g.cYJ().c((com.tencent.mm.sdk.e.c)localObject2, new String[0]);
    }
    while (true)
    {
      a(parami, "recordHistory:ok", null);
      AppMethodBeat.o(9462);
      break;
      localObject2 = null;
      break label513;
      label603: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doRecordHistory insert");
      locale = com.tencent.mm.plugin.webview.modeltools.g.cYJ();
      localObject2 = new com.tencent.mm.plugin.webview.b.d();
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_link = str1;
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_title = ((String)localObject1);
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_source = str3;
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_imgUrl = str2;
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_timeStamp = (System.currentTimeMillis() / 1000L);
      ((com.tencent.mm.plugin.webview.b.d)localObject2).field_recordId = (str1.hashCode() + "_" + System.currentTimeMillis());
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebViewHistoryStorage", "insert: ".concat(String.valueOf(locale.b((com.tencent.mm.sdk.e.c)localObject2))));
      com.tencent.mm.ce.a.post(new e.1(locale));
    }
  }

  private boolean cl(i parami)
  {
    AppMethodBeat.i(9463);
    HashMap localHashMap = new HashMap();
    localHashMap.put("osVersion", Integer.valueOf(Build.VERSION.SDK_INT));
    localHashMap.put("cpuCores", Integer.valueOf(DeviceInfo.getNumberOfCPUCores()));
    localHashMap.put("cpuFreqHz", Integer.valueOf(DeviceInfo.getCPUMaxFreqKHz()));
    localHashMap.put("memory", Long.valueOf(DeviceInfo.getTotalMemory(ah.getContext())));
    localHashMap.put("brand", Build.BRAND);
    localHashMap.put("model", Build.MODEL);
    a(parami, "getSystemInfo:ok", localHashMap);
    AppMethodBeat.o(9463);
    return true;
  }

  private boolean cm(i parami)
  {
    AppMethodBeat.i(9464);
    try
    {
      parami = (String)parami.puc.get("tid");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doServiceClick, tid = %s", new Object[] { parami });
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("service_click_tid", parami);
      this.umI.c(70, localBundle);
      this.eBB = false;
      AppMethodBeat.o(9464);
      return false;
    }
    catch (Exception parami)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", parami, "", new Object[0]);
    }
  }

  private boolean cn(i parami)
  {
    AppMethodBeat.i(9465);
    String str = bK(getCurrentUrl());
    boolean bool;
    if (bo.isNullOrNil(str))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "[doOpenRealnameAuth]appid is null, return");
      a(parami, "openRealnameAuth:fail appid is null", null);
      AppMethodBeat.o(9465);
      bool = false;
    }
    while (true)
    {
      return bool;
      Object localObject = (String)parami.puc.get("categoryId");
      if (bo.isNullOrNil((String)localObject))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "[doOpenRealnameAuth]categoryId is null, return");
        a(parami, "openRealnameAuth:fail categoryId is null", null);
        AppMethodBeat.o(9465);
        bool = false;
      }
      else
      {
        localObject = new Intent().putExtra("intent_appid", str).putExtra("intent_category_id", (String)localObject);
        if ((this.context instanceof MMActivity))
        {
          ((MMActivity)this.context).ifE = this;
          com.tencent.mm.bp.d.b(this.context, "appbrand", ".ui.autofill.AppBrandIDCardUI", (Intent)localObject, 62);
          bool = true;
          AppMethodBeat.o(9465);
        }
        else
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "[doOpenRealnameAuth]context is err, return");
          a(parami, "openRealnameAuth:fail context is err", null);
          AppMethodBeat.o(9465);
          bool = false;
        }
      }
    }
  }

  private boolean co(i parami)
  {
    AppMethodBeat.i(9466);
    this.cEl = g(parami);
    boolean bool;
    if (this.cEl == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSendSingleAppMessage fail, appmsg is null");
      a(parami, "sendSingleAppMessage:fail", null);
      AppMethodBeat.o(9466);
      bool = true;
    }
    while (true)
    {
      return bool;
      HashMap localHashMap = new HashMap();
      String str = (String)parami.puc.get("img_url");
      localHashMap.put("img_url", str);
      localHashMap.put("desc", (String)parami.puc.get("desc"));
      localHashMap.put("title", (String)parami.puc.get("title"));
      localHashMap.put("url", (String)parami.puc.get("link"));
      parami = new Intent();
      parami.putExtra("Select_Conv_Type", 7);
      parami.putExtra("select_is_ret", true);
      parami.putExtra("Select_block_List", com.tencent.mm.model.r.Yz());
      parami.putExtra("Select_block_List", "filehelper," + com.tencent.mm.model.r.Yz());
      parami.putExtra("scene_from", 10);
      parami.putExtra("webview_params", localHashMap);
      parami.putExtra("Retr_Msg_Type", 2);
      if ((this.context instanceof MMActivity))
      {
        com.tencent.mm.bp.d.a((MMActivity)this.context, ".ui.transmit.SelectConversationUI", parami, 61, this);
        k.agC(str);
        AppMethodBeat.o(9466);
        bool = true;
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSendSingleAppMessage context is not activity");
        bool = false;
        AppMethodBeat.o(9466);
      }
    }
  }

  private boolean cp(i parami)
  {
    AppMethodBeat.i(9467);
    String str1 = (String)parami.puc.get("brandIcon");
    String str2 = (String)parami.puc.get("brandName");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doCurrentMpInfo brandIcon:%s", new Object[] { str1 });
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("key_bag_icon", str1);
      localBundle.putString("key_brand_name", str2);
      this.umI.c(71, localBundle);
      a(parami, "currentMpInfo:ok", null);
      AppMethodBeat.o(9467);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        a(parami, "currentMpInfo:fail", null);
        AppMethodBeat.o(9467);
      }
    }
  }

  private boolean cq(i parami)
  {
    int i = 0;
    AppMethodBeat.i(9468);
    Object localObject1 = (String)parami.puc.get("opcode");
    Object localObject4 = (String)parami.puc.get("business");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "business %s,opcode %s", new Object[] { localObject4, localObject1 });
    if (!bo.Q(new String[] { localObject1, localObject4 }))
    {
      if (!((String)localObject4).equals("regLogin"))
        break label836;
      if (!((String)localObject1).equals("setIsAgree"))
        break label230;
    }
    label230: String str;
    while (true)
    {
      try
      {
        localObject1 = new android/os/Bundle;
        ((Bundle)localObject1).<init>();
        if (bo.getInt((String)parami.puc.get("isAgree"), 0) == 1)
          ((Bundle)localObject1).putString("go_next", "agree_privacy");
        this.umI.cZb();
        this.umI.W((Bundle)localObject1);
        localObject4 = com.tencent.mm.sdk.b.a.xxA;
        localObject1 = new com/tencent/mm/g/a/vo;
        ((vo)localObject1).<init>();
        ((com.tencent.mm.sdk.b.a)localObject4).m((com.tencent.mm.sdk.b.b)localObject1);
        a(parami, "set wc privacy policy result:ok", null);
        AppMethodBeat.o(9468);
        return true;
      }
      catch (Exception parami)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "setWcPrivacyPolicyResult, ex = " + parami.getMessage());
        continue;
      }
      if (!((String)localObject1).equals("setBirthday"))
        break;
      str = (String)parami.puc.get("birthday");
      localObject4 = (String)parami.puc.get("mobile");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "mobile %s,birthday %s", new Object[] { localObject4, str });
      localObject1 = localObject4;
      if (bo.isNullOrNil((String)localObject4))
      {
        localObject1 = localObject4;
        if (com.tencent.mm.kernel.g.RK())
        {
          com.tencent.mm.kernel.g.RQ();
          localObject1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(6, null);
        }
      }
      if (!bo.Q(new String[] { localObject1, str }))
      {
        localObject4 = new HashMap();
        ((Map)localObject4).put("birthday", str);
        ((Map)localObject4).put("last_update_birthday_time", Long.valueOf(System.currentTimeMillis() / 1000L));
        bn.fnk.g((String)localObject1, (Map)localObject4);
      }
      a(parami, "setBirthday OK", null);
    }
    HashMap localHashMap;
    long l;
    if (((String)localObject1).equals("getBirthday"))
    {
      localHashMap = new HashMap();
      str = (String)parami.puc.get("mobile");
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getBirthday of %s", new Object[] { str });
      localObject4 = "";
      localObject1 = str;
      if (bo.isNullOrNil(str))
      {
        localObject1 = str;
        if (com.tencent.mm.kernel.g.RK())
        {
          com.tencent.mm.kernel.g.RQ();
          localObject1 = (String)com.tencent.mm.kernel.g.RP().Ry().get(6, null);
        }
      }
      if (bo.isNullOrNil((String)localObject1))
        break label1457;
      localObject4 = bn.fnk.getString((String)localObject1, "birthday");
      l = bo.anl(bn.fnk.getString((String)localObject1, "last_update_birthday_time"));
    }
    label727: label992: label994: Object localObject3;
    for (localObject1 = localObject4; ; localObject3 = localObject4)
    {
      while (true)
      {
        label924: 
        while (true)
        {
          while (true)
          {
            while (true)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "updateTime %s", new Object[] { Long.valueOf(l) });
              localHashMap.put("birthday", localObject1);
              localHashMap.put("updatetime", Long.valueOf(l));
              a(parami, "getBirthday OK", localHashMap);
              break;
              if (!((String)localObject1).equals("birthdayComfirmOK"))
                break label727;
              try
              {
                localObject1 = new android/os/Bundle;
                ((Bundle)localObject1).<init>();
                ((Bundle)localObject1).putString("go_next", "birthdayComfirmOK");
                this.umI.cZb();
                this.umI.W((Bundle)localObject1);
                localObject4 = com.tencent.mm.sdk.b.a.xxA;
                localObject1 = new com/tencent/mm/g/a/vo;
                ((vo)localObject1).<init>();
                ((com.tencent.mm.sdk.b.a)localObject4).m((com.tencent.mm.sdk.b.b)localObject1);
                a(parami, "birthdayConfirmOK", null);
              }
              catch (Exception parami)
              {
                com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "setWcPrivacyPolicyResult, ex = " + parami.getMessage());
              }
            }
            break;
            if (!((String)localObject1).equals("continue"))
              break;
            try
            {
              localObject1 = new android/os/Bundle;
              ((Bundle)localObject1).<init>();
              ((Bundle)localObject1).putString("go_next", "gdpr_confirm_continue");
              this.umI.cZb();
              this.umI.W((Bundle)localObject1);
              localObject4 = com.tencent.mm.sdk.b.a.xxA;
              localObject1 = new com/tencent/mm/g/a/vo;
              ((vo)localObject1).<init>();
              ((com.tencent.mm.sdk.b.a)localObject4).m((com.tencent.mm.sdk.b.b)localObject1);
              a(parami, "h5 confirm continue OK", null);
            }
            catch (Exception parami)
            {
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "setWcPrivacyPolicyResult, ex = " + parami.getMessage());
            }
          }
          break;
          label836: if (com.tencent.mm.model.gdpr.a.oX((String)localObject4))
          {
            boolean bool;
            if ("setIsAgree".equals(localObject1))
            {
              if (bo.getInt((String)parami.puc.get("isAgree"), 0) != 1)
                break label924;
              bool = true;
              localObject1 = new Bundle(1);
              ((Bundle)localObject1).putBoolean("OnMPGdprPolicyAgreement_KIsAgree", bool);
            }
            try
            {
              this.umI.c(200, (Bundle)localObject1);
              a(parami, "wcPrivacyPolicyResult:ok", null);
              break;
              bool = false;
            }
            catch (Exception localException1)
            {
              while (true)
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "wcPrivacyPolicyResult, [mp_gdpr], callback ex = %s", new Object[] { localException1 });
            }
          }
        }
        if (((String)localObject4).equals("search"))
          switch (localException1.hashCode())
          {
          default:
            i = -1;
            switch (i)
            {
            default:
            case 0:
            case 1:
            }
            break;
          case 334239890:
          case 158651840:
          }
        try
        {
          while (true)
          {
            label1026: Object localObject2;
            while (true)
            {
              this.umI.W(null);
              com.tencent.mm.sdk.b.a.xxA.m(new vo());
              a(parami, "wcPrivacyPolicyResult:ok", null);
              break;
              if (!localException1.equals("openSearch"))
                break label992;
              break label994;
              if (!localException1.equals("closeSearch"))
                break label992;
              i = 1;
              break label994;
              ((com.tencent.mm.plugin.websearch.api.m)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.websearch.api.m.class)).cUK();
              continue;
              ((com.tencent.mm.plugin.websearch.api.m)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.websearch.api.m.class)).cUL();
              continue;
              if (!((String)localObject4).equals("walletIndexGDPR"))
                break label1309;
              if (!localException1.equals("setIsAgree"))
                break;
              try
              {
                localObject4 = new android/os/Bundle;
                ((Bundle)localObject4).<init>();
                i = bo.getInt((String)parami.puc.get("isAgree"), 0);
                if (i == 1)
                  ((Bundle)localObject4).putString("go_next", "agree_privacy");
                localObject2 = new com/tencent/mm/g/a/vw;
                ((vw)localObject2).<init>();
                ((vw)localObject2).cTd.cBp = "agree_privacy";
                com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "walletIndexGDPR agreement %s", new Object[] { Integer.valueOf(i) });
                this.umI.cZb();
                this.umI.W((Bundle)localObject4);
                localObject4 = com.tencent.mm.sdk.b.a.xxA;
                localObject2 = new com/tencent/mm/g/a/vo;
                ((vo)localObject2).<init>();
                ((com.tencent.mm.sdk.b.a)localObject4).m((com.tencent.mm.sdk.b.b)localObject2);
                a(parami, "set walletIndexGDPR wc privacy policy result:ok", null);
              }
              catch (Exception parami)
              {
                com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "setwalletIndexGDPR WcPrivacyPolicyResult, ex = " + parami.getMessage());
              }
            }
            break;
            label1309: if ((!((String)localObject4).equals("location")) || (!((String)localObject2).equals("setIsAgree")))
              break;
            try
            {
              localObject2 = new android/os/Bundle;
              ((Bundle)localObject2).<init>();
              if (bo.getInt((String)parami.puc.get("isAgree"), 0) == 1)
                ((Bundle)localObject2).putString("go_next", "gdpr_auth_location");
              this.umI.cZb();
              this.umI.W((Bundle)localObject2);
              localObject2 = com.tencent.mm.sdk.b.a.xxA;
              localObject4 = new com/tencent/mm/g/a/vo;
              ((vo)localObject4).<init>();
              ((com.tencent.mm.sdk.b.a)localObject2).m((com.tencent.mm.sdk.b.b)localObject4);
              a(parami, "hint location permission use scene result:ok", null);
            }
            catch (Exception parami)
            {
              com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "setLocationPermissionUseScene Result, ex = " + parami.getMessage());
            }
          }
        }
        catch (Exception localException2)
        {
          break label1026;
        }
      }
      label1457: l = 0L;
    }
  }

  private boolean cr(i parami)
  {
    boolean bool = true;
    AppMethodBeat.i(9469);
    byte[] arrayOfByte = com.tencent.mm.plugin.normsg.a.b.oTO.bVS();
    if (arrayOfByte != null)
    {
      HashMap localHashMap = new HashMap(1);
      localHashMap.put("data", Base64.encodeToString(arrayOfByte, 2));
      a(parami, parami.uIJ + ":ok", localHashMap);
      AppMethodBeat.o(9469);
    }
    while (true)
    {
      return bool;
      a(parami, parami.uIJ + ":fail", null);
      bool = false;
      AppMethodBeat.o(9469);
    }
  }

  private boolean cs(i parami)
  {
    boolean bool = false;
    AppMethodBeat.i(9470);
    Object localObject = parami.puc.get("rqt");
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "calrqt, dataIn is null.");
      a(parami, parami.uIJ + ":fail", null);
      AppMethodBeat.o(9470);
    }
    while (true)
    {
      return bool;
      if ((localObject instanceof String));
      for (localObject = ((String)localObject).getBytes(Charset.forName("UTF-8")); ; localObject = (byte[])localObject)
      {
        PInt localPInt1 = new PInt();
        PInt localPInt2 = new PInt();
        PByteArray localPByteArray = new PByteArray();
        if (!com.tencent.mm.plugin.normsg.a.b.oTO.a(1, (byte[])localObject, 0, localObject.length, localPInt1, localPInt2, localPByteArray))
          break label305;
        localObject = new HashMap(5);
        ((Map)localObject).put("k1", Integer.valueOf(localPInt1.value));
        ((Map)localObject).put("k2", Integer.valueOf(localPInt2.value));
        ((Map)localObject).put("data", Base64.encodeToString(localPByteArray.value, 2));
        a(parami, parami.uIJ + ":ok", (Map)localObject);
        AppMethodBeat.o(9470);
        bool = true;
        break;
        if (!(localObject instanceof byte[]))
          break label258;
      }
      label258: com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "calrqt, cannot determine type of rqt data.");
      a(parami, parami.uIJ + ":fail", null);
      AppMethodBeat.o(9470);
      continue;
      label305: com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "calrqt, cannot calculate hash of rqt data.");
      a(parami, parami.uIJ + ":fail", null);
      AppMethodBeat.o(9470);
    }
  }

  private boolean ct(i parami)
  {
    AppMethodBeat.i(9471);
    Object localObject = (String)parami.puc.get("user_ticket");
    int i = bo.getInt((String)parami.puc.get("scene"), 0);
    int j = bo.getInt((String)parami.puc.get("check_alive_type"), 1);
    float f = bo.getFloat((String)parami.puc.get("light_threshold"), 4.0F);
    ((MMActivity)this.context).ifE = this;
    Bundle localBundle = new Bundle();
    localBundle.putInt("k_server_scene", 6);
    localBundle.putInt("k_from_scene", i);
    localBundle.putString("key_function_name", parami.uIJ);
    localBundle.putInt("key_business_type", 1);
    localBundle.putInt("check_alive_type_response", j);
    localBundle.putString("k_ticket", (String)localObject);
    localBundle.putFloat("mLight_threshold", f);
    localObject = new op();
    ((op)localObject).cKW.context = this.context;
    ((op)localObject).cKW.cKY = 64;
    ((op)localObject).cKW.extras = localBundle;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "start face detect event result: %b", new Object[] { Boolean.valueOf(((op)localObject).cKX.cKV) });
    if (!((op)localObject).cKX.cKV)
    {
      ((MMActivity)this.context).ifE = null;
      a(parami, parami.uIJ + ":fail", i.aq(((op)localObject).cKX.extras));
    }
    AppMethodBeat.o(9471);
    return true;
  }

  private boolean cu(i parami)
  {
    AppMethodBeat.i(9472);
    Object localObject1 = (String)parami.puc.get("pkgIdList");
    if (!bo.isNullOrNil((String)localObject1));
    while (true)
    {
      try
      {
        Object localObject2 = new org/json/JSONArray;
        ((JSONArray)localObject2).<init>((String)localObject1);
        if (((JSONArray)localObject2).length() > 0)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          int i = 0;
          if (i < ((JSONArray)localObject2).length())
          {
            ((List)localObject1).add(((JSONArray)localObject2).optString(i));
            i++;
            continue;
          }
          if (!bo.ek((List)localObject1))
          {
            localObject2 = new com/tencent/mm/g/a/vv;
            ((vv)localObject2).<init>();
            ((vv)localObject2).cSX.cuy = 8;
            ((vv)localObject2).cSX.scene = 0;
            ((vv)localObject2).cSX.cTc = ((List)localObject1);
            com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            a(parami, parami.uIJ + ":ok", null);
            bool = true;
            AppMethodBeat.o(9472);
            return bool;
          }
        }
      }
      catch (JSONException localJSONException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "data is not json");
      }
      a(parami, parami.uIJ + ":fail", null);
      AppMethodBeat.o(9472);
      boolean bool = false;
    }
  }

  private boolean cv(i parami)
  {
    AppMethodBeat.i(9473);
    String str = (String)parami.puc.get("uuid");
    parami = (String)parami.puc.get("req_data");
    ((com.tencent.mm.plugin.appbrand.service.a)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.a.class)).bq(str, parami);
    try
    {
      this.umI.g(100000, Bundle.EMPTY);
      AppMethodBeat.o(9473);
      return false;
    }
    catch (Exception parami)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doPrivateOpenWeappFunctionalPage, AC_FINISH_ON_RESUME e = %s", new Object[] { parami });
    }
  }

  private boolean cw(i parami)
  {
    AppMethodBeat.i(9474);
    TreeMap localTreeMap = new TreeMap(new g.34(this));
    while (true)
    {
      JSONObject localJSONObject;
      Object localObject2;
      try
      {
        Bundle localBundle = this.umI.g(150, null);
        if (localBundle == null)
        {
          a(parami, parami.uIJ + ":fail", null);
          AppMethodBeat.o(9474);
          return true;
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
        localJSONObject = null;
        continue;
        localTreeMap.put(Integer.valueOf(com.tencent.mm.plugin.webview.ui.tools.game.e.a.uDu), localJSONObject.getString("page_key"));
        localTreeMap.put(Integer.valueOf(com.tencent.mm.plugin.webview.ui.tools.game.e.a.uDv), com.tencent.mm.sdk.platformtools.at.gB(ah.getContext()));
        localTreeMap.put(Integer.valueOf(com.tencent.mm.plugin.webview.ui.tools.game.e.a.uDw), String.valueOf(YearClass.get(ah.getContext())));
        localObject2 = localJSONObject.getString("raw_url");
        if (bo.isNullOrNil((String)localObject2));
      }
      try
      {
        localTreeMap.put(Integer.valueOf(com.tencent.mm.plugin.webview.ui.tools.game.e.a.uDx), com.tencent.mm.compatible.util.q.encode((String)localObject2, "UTF-8"));
        label196: boolean bool = localJSONObject.getBoolean("is_used_wepkg", false);
        int i = com.tencent.mm.plugin.webview.ui.tools.game.e.a.uDy;
        int j;
        Object localObject3;
        if (bool)
        {
          j = 1;
          localTreeMap.put(Integer.valueOf(i), Integer.valueOf(j));
          localTreeMap.put(Integer.valueOf(com.tencent.mm.plugin.webview.ui.tools.game.e.a.uDz), Integer.valueOf(0));
          localTreeMap.put(Integer.valueOf(com.tencent.mm.plugin.webview.ui.tools.game.e.a.uDA), Integer.valueOf(0));
          localTreeMap.put(Integer.valueOf(com.tencent.mm.plugin.webview.ui.tools.game.e.a.uDB), localJSONObject.getString("wepkg_version"));
          localTreeMap.put(Integer.valueOf(com.tencent.mm.plugin.webview.ui.tools.game.e.a.uDC), localJSONObject.getString("comm_js_version"));
          localObject3 = (String)parami.puc.get("type");
          bool = "1".equals((String)parami.puc.get("isReportNow"));
        }
        try
        {
          localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>((String)parami.puc.get("data"));
          if (localJSONObject == null)
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "data is null or not json");
            a(parami, parami.uIJ + ":fail_data_is_null", null);
            AppMethodBeat.o(9474);
            continue;
            j = 0;
          }
        }
        catch (JSONException localJSONException)
        {
          Object localObject1;
          while (true)
            localObject1 = null;
          if ("1".equals(localObject3))
          {
            localTreeMap.put(Integer.valueOf(e.b.uDE), Boolean.valueOf(bool));
            localObject1 = com.tencent.mm.plugin.webview.ui.tools.game.f.aO((JSONObject)localObject1);
            Iterator localIterator = ((Map)localObject1).keySet().iterator();
            while (localIterator.hasNext())
            {
              localObject3 = (Integer)localIterator.next();
              if (!localTreeMap.containsKey(localObject3))
                localTreeMap.put(localObject3, ((Map)localObject1).get(localObject3));
            }
            com.tencent.mm.plugin.webview.ui.tools.game.f.y((String)localObject2, localTreeMap);
            a(parami, parami.uIJ + ":ok", null);
          }
          while (true)
          {
            AppMethodBeat.o(9474);
            break;
            if ("2".equals(localObject3))
            {
              localObject2 = com.tencent.mm.plugin.webview.ui.tools.game.f.aO((JSONObject)localObject1);
              localObject1 = ((Map)localObject2).keySet().iterator();
              while (((Iterator)localObject1).hasNext())
              {
                localObject3 = (Integer)((Iterator)localObject1).next();
                if (!localTreeMap.containsKey(localObject3))
                  localTreeMap.put(localObject3, ((Map)localObject2).get(localObject3));
              }
              localObject1 = com.tencent.mm.plugin.webview.ui.tools.game.e.aI(localTreeMap);
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "report web runtime. isReportNow:%b, reportData: [%s]", new Object[] { Boolean.valueOf(bool), localObject1 });
              com.tencent.mm.plugin.report.service.h.pYm.a(16145, (String)localObject1, bool, false);
              a(parami, parami.uIJ + ":ok", null);
            }
            else
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "type is error. type:%s", new Object[] { localObject3 });
              a(parami, parami.uIJ + ":fail_type_not_right", null);
            }
          }
        }
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        break label196;
      }
    }
  }

  private boolean cx(i parami)
  {
    AppMethodBeat.i(9475);
    Object localObject = "";
    try
    {
      String str = this.umI.getCurrentUrl();
      localObject = str;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doPrivateCommonApi currentUrl %s", new Object[] { localObject });
      if ((!((String)localObject).startsWith("https://support.weixin.qq.com/security/")) && (!((String)localObject).startsWith("https://support.wechat.com/security/")) && (!((String)localObject).startsWith("https://szsupport.weixin.qq.com/security/")) && (!((String)localObject).startsWith("https://hksupport.weixin.qq.com/security/")) && (!((String)localObject).startsWith("https://mlsupport.weixin.qq.com/security/")) && (!((String)localObject).startsWith("https://weixin110.qq.com/security/")))
      {
        a(parami, "privateCommonApi:fail access_denied", null);
        AppMethodBeat.o(9475);
        bool = false;
        return bool;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        boolean bool;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doPrivateCommonApi exception in get currentUrl" + localException.getMessage());
        continue;
        localObject = (String)parami.puc.get("opcode");
        if (bo.isNullOrNil((String)localObject))
        {
          a(parami, "privateCommonApi:fail, opcode is empty", null);
          AppMethodBeat.o(9475);
          bool = false;
        }
        else
        {
          if (((String)localObject).equals("selectContact"))
          {
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doPrivateSelectContact");
            localObject = new Intent();
            ((Intent)localObject).putExtra("list_type", 15);
            ((Intent)localObject).putExtra("titile", this.context.getString(2131296486));
            ((Intent)localObject).putExtra("list_attr", com.tencent.mm.ui.contact.s.C(new int[] { 2, 16384, 1, 4 }));
            if ((this.context instanceof MMActivity))
              com.tencent.mm.bp.d.a((MMActivity)this.context, ".ui.contact.SelectContactUI", (Intent)localObject, 65, this);
            while (true)
            {
              AppMethodBeat.o(9475);
              bool = true;
              break;
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSelectContact invalid context");
              a(parami, "selectContact:fail", null);
            }
          }
          a(parami, "privateCommonApi:fail, opcode is invalid", null);
          AppMethodBeat.o(9475);
          bool = false;
        }
      }
    }
  }

  private boolean cy(i parami)
  {
    AppMethodBeat.i(9476);
    Object localObject1 = (String)parami.puc.get("action");
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doHandleHaoKanAction action=%s", new Object[] { localObject1 });
    if (bo.isNullOrNil((String)localObject1))
    {
      a(parami, "handleHaokanAction:fail action is empty", null);
      AppMethodBeat.o(9476);
    }
    Object localObject2;
    String str;
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      localObject2 = (String)parami.puc.get("server_data");
      str = (String)parami.puc.get("client_data");
      if (!"submitMsgToTL".equals(localObject1))
        break;
      localObject1 = new im();
      ((im)localObject1).cDD.cDE = ((String)localObject2);
      ((im)localObject1).cDD.cDF = str;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject1);
      a(parami, "handleHaokanAction:ok", null);
      AppMethodBeat.o(9476);
    }
    if ("update_recommend_status".equals(localObject1))
    {
      str = (String)parami.puc.get("url");
      localObject2 = this.uGw.agE(str);
      if (localObject2 != null)
        break label428;
      localObject2 = new com.tencent.mm.plugin.webview.e.c.a();
    }
    label428: 
    while (true)
    {
      while (true)
      {
        ((com.tencent.mm.plugin.webview.e.c.a)localObject2).permission = bo.getInt((String)parami.puc.get("permission"), 0);
        ((com.tencent.mm.plugin.webview.e.c.a)localObject2).uKW = bo.getInt((String)parami.puc.get("recommend"), -1);
        ((com.tencent.mm.plugin.webview.e.c.a)localObject2).title = bo.bc((String)parami.puc.get("title"), ((com.tencent.mm.plugin.webview.e.c.a)localObject2).title);
        localObject1 = this.uGw;
        str = u.aef(str);
        ((com.tencent.mm.plugin.webview.e.c)localObject1).uKV.put(str, localObject2);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doHandleHaoKanAction Permission=%d,Recommend=%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.webview.e.c.a)localObject2).permission), Integer.valueOf(((com.tencent.mm.plugin.webview.e.c.a)localObject2).uKW) });
        a(parami, "handleHaokanAction:ok", null);
        try
        {
          this.umI.g(203, null);
          AppMethodBeat.o(9476);
          bool = true;
        }
        catch (RemoteException parami)
        {
          while (true)
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doHandleHaoKanAction e=%s", new Object[] { parami.getMessage() });
        }
      }
      a(parami, "handleHaokanAction:fail, action not support", null);
      AppMethodBeat.o(9476);
      bool = false;
      break;
    }
  }

  private boolean cz(i parami)
  {
    AppMethodBeat.i(9477);
    HashMap localHashMap = new HashMap();
    boolean bool;
    if (!((com.tencent.mm.plugin.brandservice.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.brandservice.a.b.class)).rW(5))
    {
      localHashMap.put("err_desc", "abtest closed");
      a(parami, parami.uIJ + ":fail", localHashMap);
      AppMethodBeat.o(9477);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (!parami.uIH.has("url"))
      {
        localHashMap.put("err_desc", "invalid url");
        a(parami, parami.uIJ + ":fail", localHashMap);
        AppMethodBeat.o(9477);
        bool = false;
      }
      else if (!parami.uIH.has("item_show_type"))
      {
        localHashMap.put("err_desc", "invalid item_show_type");
        a(parami, parami.uIJ + ":fail", localHashMap);
        AppMethodBeat.o(9477);
        bool = false;
      }
      else if (!parami.uIH.has("scene"))
      {
        localHashMap.put("err_desc", "invalid scene");
        a(parami, parami.uIJ + ":fail", localHashMap);
        AppMethodBeat.o(9477);
        bool = false;
      }
      else if (!parami.uIH.has("openType"))
      {
        localHashMap.put("err_desc", "invalid openType");
        a(parami, parami.uIJ + ":fail", localHashMap);
        AppMethodBeat.o(9477);
        bool = false;
      }
      else
      {
        try
        {
          Object localObject = new android/os/Bundle;
          ((Bundle)localObject).<init>();
          ((Bundle)localObject).putString("url", parami.uIH.getString("url"));
          ((Bundle)localObject).putInt("item_show_type", parami.uIH.getInt("item_show_type"));
          ((Bundle)localObject).putInt("scene", parami.uIH.getInt("scene"));
          ((Bundle)localObject).putInt("openType", parami.uIH.getInt("openType"));
          localObject = this.umI.g(200, (Bundle)localObject);
          if (((Bundle)localObject).getBoolean("success"))
            a(parami, localHashMap);
          while (true)
          {
            bool = true;
            AppMethodBeat.o(9477);
            break;
            localHashMap.put("err_desc", bo.bc(((Bundle)localObject).getString("desc"), ""));
            localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            a(parami, parami.uIJ + ":fail", localHashMap);
          }
        }
        catch (JSONException localJSONException)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localJSONException, "doOpenWebViewUseFastload", new Object[0]);
          localHashMap.put("err_desc", localJSONException.toString());
          a(parami, parami.uIJ + ":fail", localHashMap);
          AppMethodBeat.o(9477);
          bool = false;
        }
        catch (RemoteException localRemoteException)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "doOpenWebViewUseFastload", new Object[0]);
          localHashMap.put("err_desc", localRemoteException.toString());
          a(parami, parami.uIJ + ":fail", localHashMap);
          AppMethodBeat.o(9477);
          bool = false;
        }
      }
    }
  }

  private boolean d(i parami)
  {
    int i = 0;
    AppMethodBeat.i(9229);
    try
    {
      f1 = bo.getFloat((String)parami.puc.get("latitude"), 0.0F);
      f2 = bo.getFloat((String)parami.puc.get("longitude"), 0.0F);
      str1 = Eh((String)parami.puc.get("name"));
      str2 = Eh((String)parami.puc.get("address"));
      str3 = Eh((String)parami.puc.get("infoUrl"));
    }
    catch (Exception parami)
    {
      try
      {
        float f1;
        float f2;
        String str1;
        String str2;
        String str3;
        j = bo.getInt((String)parami.puc.get("scale"), 0);
        parami = new android/content/Intent;
        parami.<init>();
        if (bo.getInt((String)this.uGd.puc.get("webview_scene"), 0) == 25)
        {
          parami.putExtra("map_view_type", 9);
          parami.putExtra("kPoi_url", str3);
          parami.putExtra("kwebmap_slat", f1);
          parami.putExtra("kwebmap_lng", f2);
          if (j > 0)
            parami.putExtra("kwebmap_scale", j);
          parami.putExtra("kPoiName", str1);
          parami.putExtra("Kwebmap_locaion", str2);
          com.tencent.mm.bp.d.b(this.context, "location", ".ui.RedirectUI", parami);
          a(this.uGd, "open_location:ok", null);
        }
        while (true)
        {
          AppMethodBeat.o(9229);
          return true;
          parami.putExtra("map_view_type", 7);
          break;
          parami = parami;
          a(this.uGd, "open_location:invalid_coordinate", null);
        }
      }
      catch (Exception parami)
      {
        while (true)
          int j = i;
      }
    }
  }

  private boolean d(i parami, JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    AppMethodBeat.i(9452);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSetBackgroundAudioState()");
    com.tencent.mm.sdk.b.a.xxA.c(this.uHa);
    String str1 = (String)parami.puc.get("appId");
    Object localObject1 = str1;
    if (this.uGh != null)
    {
      localObject2 = str1;
      if (TextUtils.isEmpty(str1))
        localObject2 = this.uGh.getString("jsapi_args_appid");
      localObject1 = localObject2;
      if (!TextUtils.isEmpty((CharSequence)localObject2));
    }
    for (Object localObject2 = this.uGr.agj(getCurrentUrl()); ; localObject2 = localObject1)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "appId:%s", new Object[] { localObject2 });
      l.a(parami.uII, false, null, (String)localObject2);
      localObject1 = (String)parami.puc.get("url");
      if (!bo.isNullOrNil((String)localObject1));
      for (localObject1 = com.tencent.mm.plugin.webview.modelcache.q.aeL((String)localObject1); ; localObject1 = null)
      {
        String str2 = (String)parami.puc.get("src");
        String str3 = (String)parami.puc.get("lowbandSrc");
        String str4 = (String)parami.puc.get("title");
        String str5 = (String)parami.puc.get("epname");
        String str6 = (String)parami.puc.get("singer");
        str1 = (String)parami.puc.get("coverImgUrl");
        String str7 = (String)parami.puc.get("webUrl");
        int i = bo.getInt((String)parami.puc.get("startTime"), 0);
        String str8 = (String)parami.puc.get("srcId");
        String str9 = (String)parami.puc.get("protocol");
        String str10 = (String)parami.puc.get("musicbar_url");
        boolean bool = paramJsapiPermissionWrapper.jB(308);
        if (str1 == null);
        for (paramJsapiPermissionWrapper = ""; ; paramJsapiPermissionWrapper = str1)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "src : %s, title : %s, singer : %s, coverImgUrl : %s, webUrl : %s, startTime:%d, protocol:%s, barBackToWebView:%b, musicbar_url:%s", new Object[] { str2, str4, str6, paramJsapiPermissionWrapper, str7, Integer.valueOf(i), str9, Boolean.valueOf(bool), str10 });
          if ((bo.isNullOrNil(str2)) || (bo.isNullOrNil(str4)))
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "setBackgroundAudioState fail, src or title is null");
            a(parami, "setBackgroundAudioState:fail", null);
          }
          while (true)
          {
            AppMethodBeat.o(9452);
            return true;
            paramJsapiPermissionWrapper = com.tencent.mm.aw.f.a(10, paramJsapiPermissionWrapper, str4, str6, str7, str3, str2, str2.hashCode(), com.tencent.mm.compatible.util.e.eSn, com.tencent.mm.plugin.i.c.XW() + paramJsapiPermissionWrapper.hashCode(), str5, (String)localObject2);
            paramJsapiPermissionWrapper.fKr = ((String)localObject1);
            paramJsapiPermissionWrapper.startTime = (i * 1000);
            paramJsapiPermissionWrapper.fKs = str8;
            paramJsapiPermissionWrapper.protocol = str9;
            paramJsapiPermissionWrapper.fKt = bool;
            paramJsapiPermissionWrapper.fKu = str10;
            com.tencent.mm.aw.a.b(paramJsapiPermissionWrapper);
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "setBackgroundAudioState ok");
            a(parami, "setBackgroundAudioState:ok", null);
          }
        }
      }
    }
  }

  private static byte[] dcA()
  {
    AppMethodBeat.i(9277);
    try
    {
      Object localObject1 = new com/tencent/mm/sdk/platformtools/i;
      ((com.tencent.mm.sdk.platformtools.i)localObject1).<init>("softtype");
      Object localObject3 = bo.bc((String)com.tencent.mm.compatible.e.n.LA().get("Processor"), "");
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AndroidDevicesReport", "cpu %s", new Object[] { localObject3 });
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("cpu", (String)localObject3);
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("radio", com.tencent.mm.compatible.e.q.LV());
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("osversion", Build.VERSION.RELEASE);
      localObject3 = com.tencent.mm.compatible.e.q.getDeviceID(ah.getContext());
      Object localObject4 = com.tencent.mm.compatible.e.q.LX();
      Object localObject5 = com.tencent.mm.compatible.e.q.LY();
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("deviceId", (String)localObject3);
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("imsi", (String)localObject4);
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("iccid", (String)localObject5);
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("androidid", com.tencent.mm.compatible.e.q.getAndroidId());
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("serial", com.tencent.mm.compatible.e.q.LZ());
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("model", com.tencent.mm.compatible.e.q.LS());
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("core_count", com.tencent.mm.compatible.e.n.getNumCores());
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("cpuhardware", bo.bc((String)com.tencent.mm.compatible.e.n.LF().get("Hardware"), ""));
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("cpureversion", bo.bc((String)com.tencent.mm.compatible.e.n.LF().get("CPU revision"), ""));
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("cpuserial", bo.bc((String)com.tencent.mm.compatible.e.n.LF().get("Serial"), ""));
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("Features", bo.bc((String)com.tencent.mm.compatible.e.n.LF().get("Features"), ""));
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("wifi-mac", bo.bc(com.tencent.mm.compatible.e.q.LP(), ""));
      ((com.tencent.mm.sdk.platformtools.i)localObject1).cY("bluetooth", bo.bc(com.tencent.mm.compatible.e.q.LQ(), ""));
      if (!bo.isNullOrNil(((com.tencent.mm.sdk.platformtools.i)localObject1).xyh))
      {
        ((com.tencent.mm.sdk.platformtools.i)localObject1).Fj(((com.tencent.mm.sdk.platformtools.i)localObject1).xyh);
        ((com.tencent.mm.sdk.platformtools.i)localObject1).xyh = "";
      }
      localObject3 = ((com.tencent.mm.sdk.platformtools.i)localObject1).jvt.toString();
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.AndroidDevicesReport", "xmlStr %s", new Object[] { localObject3 });
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "xml %s", new Object[] { localObject3 });
      localObject1 = new com/tencent/mm/protocal/protobuf/ciw;
      ((ciw)localObject1).<init>();
      ((ciw)localObject1).xhL = com.tencent.mm.bt.b.bI(com.tencent.mm.compatible.e.q.LM().getBytes()).Lv(16);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", bo.cd(((ciw)localObject1).xhL.wR));
      ((ciw)localObject1).xhM = ((String)localObject3);
      localObject3 = ax.ZQ();
      localObject5 = bo.anf(((SharedPreferences)localObject3).getString("_auth_key", ""));
      int i = ((SharedPreferences)localObject3).getInt("_auth_uin", 0);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "cpan aak string:%s md5:%s uin:%d", new Object[] { bo.cd((byte[])localObject5), com.tencent.mm.a.g.x((byte[])localObject5), Integer.valueOf(i) });
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "aat len:%d", new Object[] { Integer.valueOf(localObject5.length) });
      ((ciw)localObject1).xhN = com.tencent.mm.bt.b.bI((byte[])localObject5);
      ((ciw)localObject1).uin = i;
      localObject5 = com.tencent.mm.protocal.z.dmv();
      localObject3 = ((ciw)localObject1).toByteArray();
      localObject4 = new com/tencent/mm/pointers/PByteArray;
      ((PByteArray)localObject4).<init>();
      localObject1 = localObject3;
      if (MMProtocalJni.rsaPublicEncrypt((byte[])localObject3, (PByteArray)localObject4, ((com.tencent.mm.protocal.z)localObject5).vyO.getBytes(), ((com.tencent.mm.protocal.z)localObject5).vyP.getBytes()))
        localObject1 = ((PByteArray)localObject4).value;
      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "cpan buf string:%s ", new Object[] { bo.cd((byte[])localObject1) });
      localObject3 = new com/tencent/mm/protocal/protobuf/cix;
      ((cix)localObject3).<init>();
      ((cix)localObject3).xhP = ((com.tencent.mm.protocal.z)localObject5).ver;
      ((cix)localObject3).xhO = com.tencent.mm.protocal.d.vxo;
      ((cix)localObject3).xhQ = com.tencent.mm.protocal.d.eSg;
      ((cix)localObject3).xhR = com.tencent.mm.bt.b.bI((byte[])localObject1);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getdevice done");
      localObject1 = ((cix)localObject3).toByteArray();
      AppMethodBeat.o(9277);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "report error");
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
        Object localObject2 = null;
        AppMethodBeat.o(9277);
      }
    }
  }

  private boolean dcD()
  {
    AppMethodBeat.i(9318);
    try
    {
      this.umI.q(3003, null);
      this.eBB = false;
      AppMethodBeat.o(9318);
      return false;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doShowOptionMenu, RemoteException : %s", new Object[] { localRemoteException.getMessage() });
    }
  }

  private boolean dcE()
  {
    AppMethodBeat.i(9319);
    try
    {
      this.umI.q(3004, null);
      this.eBB = false;
      AppMethodBeat.o(9319);
      return false;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "RemoteException : %s", new Object[] { localRemoteException.getMessage() });
    }
  }

  private boolean dcF()
  {
    AppMethodBeat.i(9363);
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>(1);
      localBundle.putString("place_holder", "place_holder");
      this.umI.cZb();
      this.umI.W(localBundle);
      label44: AppMethodBeat.o(9363);
      return true;
    }
    catch (Exception localException)
    {
      break label44;
    }
  }

  private String dcw()
  {
    AppMethodBeat.i(9236);
    String str = dcv().getString("connector_local_send");
    dcv().remove("connector_local_send");
    dcv().putString("connector_local_report", str);
    AppMethodBeat.o(9236);
    return str;
  }

  private String dcx()
  {
    AppMethodBeat.i(9237);
    String str = dcv().getString("connector_local_report");
    dcv().remove("connector_local_report");
    AppMethodBeat.o(9237);
    return str;
  }

  private boolean dcy()
  {
    AppMethodBeat.i(9268);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doGetLatestAddress JSOAUTH");
    try
    {
      String str1 = this.umI.getCurrentUrl();
      if (str1 == null)
      {
        a(this.uGd, "get_recently_used_address:" + "fail", null);
        AppMethodBeat.o(9268);
        return true;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localException.getMessage() });
        String str2 = "";
        continue;
        nd localnd = new nd();
        localnd.cJl.appId = ((String)this.uGd.puc.get("appId"));
        localnd.cJl.url = str2;
        localnd.cJm.errCode = -119;
        localnd.callback = new g.25(this, localnd, "get_recently_used_address:");
        com.tencent.mm.sdk.b.a.xxA.a(localnd, Looper.getMainLooper());
      }
    }
  }

  private void dcz()
  {
    AppMethodBeat.i(9276);
    String str = (String)this.uGd.puc.get("type");
    com.tencent.mm.sdk.platformtools.ab.v("MicroMsg.MsgHandler", "doGeoLocation, geoType = %s", new Object[] { str });
    if ((!bo.isNullOrNil(str)) && (!uGK.contains(str)))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doGeoLocation fail, unsupported type = %s", new Object[] { str });
      a(this.uGd, "geo_location:fail_unsupported_type", null);
    }
    this.ecr = com.tencent.mm.modelgeo.d.agz();
    if (this.ecr == null)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doGeoLocation fail, iGetLocation is null");
      a(this.uGd, "geo_location:fail", null);
    }
    str = (String)this.uGd.puc.get("type");
    if (this.uGL == null)
      this.uGL = new g.69(this, str);
    if (this.mzp == null)
      this.mzp = new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper());
    this.mzp.postDelayed(new g.71(this), 20000L);
    if ((bo.isNullOrNil(str)) || (str.equalsIgnoreCase("gcj02")))
    {
      this.ecr.b(this.uGL, false);
      AppMethodBeat.o(9276);
    }
    while (true)
    {
      return;
      if (str.equalsIgnoreCase("wgs84"))
      {
        this.ecr.a(this.uGL, false);
        AppMethodBeat.o(9276);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "startGeoLocation, should not reach here !!!!!");
        this.uGL = null;
        a(this.uGd, "geo_location:fail_unsupported_type_startgeo", null);
        AppMethodBeat.o(9276);
      }
    }
  }

  private Bundle e(String paramString, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(9332);
    try
    {
      paramBundle = this.umI.g(paramInt, paramBundle);
      paramString = paramBundle;
      AppMethodBeat.o(9332);
      return paramString;
    }
    catch (RemoteException paramBundle)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "[NFC] " + paramString + " callback RemoteException!" + paramBundle.toString());
        paramString = null;
        AppMethodBeat.o(9332);
      }
    }
  }

  private boolean e(i parami)
  {
    AppMethodBeat.i(9231);
    try
    {
      parami = (String)parami.puc.get("bid");
      Intent localIntent = new android/content/Intent;
      localIntent.<init>();
      localIntent.putExtra("sns_bid", parami);
      com.tencent.mm.bp.d.b(this.context, "sns", ".ui.ClassifyTimeLineUI", localIntent);
      a(this.uGd, "open_timeline_checkin_list:ok", null);
      label65: AppMethodBeat.o(9231);
      return true;
    }
    catch (Exception parami)
    {
      break label65;
    }
  }

  private static ArrayList<bi> f(long[] paramArrayOfLong)
  {
    AppMethodBeat.i(9377);
    ArrayList localArrayList = new ArrayList();
    if (paramArrayOfLong != null)
      for (int i = 0; i < paramArrayOfLong.length; i++)
        localArrayList.add(((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).bOr().jf(paramArrayOfLong[i]));
    AppMethodBeat.o(9377);
    return localArrayList;
  }

  private boolean f(i parami)
  {
    AppMethodBeat.i(9234);
    Object localObject = parami.puc.get("__jsapi_fw_ext_info");
    String str = (String)parami.puc.get("link");
    if ((localObject instanceof Bundle));
    for (parami = ((Bundle)localObject).getString("__jsapi_fw_ext_info_key_current_url"); ; parami = null)
    {
      boolean bool = hn(str, parami);
      AppMethodBeat.o(9234);
      return bool;
    }
  }

  private boolean f(String paramString, int paramInt, Bundle paramBundle)
  {
    int i = -1;
    AppMethodBeat.i(9333);
    paramBundle = e(paramString, paramInt, paramBundle);
    if (paramBundle != null)
    {
      paramInt = paramBundle.getInt("status", -1);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "[NFC] " + paramString + " result status : " + paramInt);
      switch (paramInt)
      {
      default:
        a(this.uGd, paramString + ":fail", null);
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      label129: boolean bool = false;
      AppMethodBeat.o(9333);
      while (true)
      {
        return bool;
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "[NFC] " + paramString + " callback fail!");
        paramInt = i;
        break;
        a(this.uGd, paramString + ":nfc_not_support", null);
        break label129;
        a(this.uGd, paramString + ":nfc_off", null);
        break label129;
        a(this.uGd, paramString + ":disconnect", null);
        bool = true;
        AppMethodBeat.o(9333);
      }
      a(this.uGd, paramString + ":card_not_support", null);
    }
  }

  private static WXMediaMessage g(i parami)
  {
    AppMethodBeat.i(9238);
    Object localObject1 = (String)parami.puc.get("link");
    if ((localObject1 == null) || (((String)localObject1).length() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "convert fail, link is null");
      parami = null;
      AppMethodBeat.o(9238);
    }
    while (true)
    {
      return parami;
      Object localObject2 = ar.aek((String)localObject1);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "rawurl:[%s], shareurl:[%s]", new Object[] { localObject1, localObject2 });
      localObject1 = new WXWebpageObject();
      ((WXWebpageObject)localObject1).webpageUrl = ((String)localObject2);
      ((WXWebpageObject)localObject1).extInfo = ((String)parami.puc.get("review_data"));
      localObject2 = new WXMediaMessage();
      ((WXMediaMessage)localObject2).mediaObject = ((WXMediaMessage.IMediaObject)localObject1);
      ((WXMediaMessage)localObject2).title = ((String)parami.puc.get("title"));
      ((WXMediaMessage)localObject2).description = ((String)parami.puc.get("desc"));
      AppMethodBeat.o(9238);
      parami = (i)localObject2;
    }
  }

  private boolean h(i parami)
  {
    int i = 0;
    AppMethodBeat.i(9239);
    this.eBB = false;
    Object localObject1 = parami.puc.get("list").toString();
    LinkedList localLinkedList = new LinkedList();
    try
    {
      JSONArray localJSONArray = new org/json/JSONArray;
      localJSONArray.<init>((String)localObject1);
      if (i < localJSONArray.length())
      {
        Object localObject2 = localJSONArray.optJSONObject(i);
        if (localObject2 != null)
        {
          localObject1 = new com/tencent/mm/protocal/protobuf/bfk;
          ((bfk)localObject1).<init>();
          ((bfk)localObject1).wJl = ((JSONObject)localObject2).optInt("cmdId");
          String str = ((JSONObject)localObject2).optString("cmdBuffer");
          if (TextUtils.isEmpty(str))
            break label143;
          localObject2 = new com/tencent/mm/bt/b;
          ((com.tencent.mm.bt.b)localObject2).<init>(str.getBytes());
          ((bfk)localObject1).wJm = ((com.tencent.mm.bt.b)localObject2);
          localLinkedList.add(localObject1);
        }
        while (true)
        {
          i++;
          break;
          label143: localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>("doUxSearchOpLog cmdId ");
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", ((bfk)localObject1).wJl + " , cmdBuffer is empty");
        }
      }
    }
    catch (JSONException localJSONException)
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", bo.l(localJSONException));
      HashMap localHashMap = new HashMap();
      long l = bo.anU();
      localHashMap.put("reqId", Long.valueOf(l));
      if (!localLinkedList.isEmpty())
      {
        localObject1 = new com.tencent.mm.ai.b.a();
        ((com.tencent.mm.ai.b.a)localObject1).fsJ = new cso();
        ((com.tencent.mm.ai.b.a)localObject1).fsK = new csp();
        ((com.tencent.mm.ai.b.a)localObject1).uri = "/cgi-bin/mmux-bin/wxaapp/wxaapp_opsearch";
        ((com.tencent.mm.ai.b.a)localObject1).fsI = 1865;
        localObject1 = ((com.tencent.mm.ai.b.a)localObject1).acD();
        ((cso)((com.tencent.mm.ai.b)localObject1).fsG.fsP).xpQ = localLinkedList;
        w.a((com.tencent.mm.ai.b)localObject1, new g.81(this, l));
      }
      a(parami, "uxSearchOpLog:succ", localHashMap);
      AppMethodBeat.o(9239);
    }
    return true;
  }

  private boolean hn(String paramString1, String paramString2)
  {
    AppMethodBeat.i(9233);
    Object localObject1 = this.uGr;
    Object localObject2;
    Object localObject3;
    int i;
    if (TextUtils.isEmpty(paramString2))
    {
      localObject2 = null;
      if ((TextUtils.isEmpty(paramString1)) || (localObject2 == null) || (((c.d)localObject2).uFm == null) || (((c.d)localObject2).uFm.size() <= 0))
        break label511;
      localObject3 = new LinkedList();
      i = paramString1.indexOf("://");
      if (i != -1)
        break label244;
      j = 1;
      label81: localObject1 = paramString1.substring(j + i);
      Iterator localIterator = ((c.d)localObject2).uFm.iterator();
      label103: 
      do
      {
        if (!localIterator.hasNext())
          break;
        paramString2 = (String)localIterator.next();
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "now domain : %s", new Object[] { paramString2 });
      }
      while (TextUtils.isEmpty(paramString2));
      i = paramString2.indexOf("://");
      if (i != -1)
        break label250;
    }
    label244: label250: for (int j = 1; ; j = 3)
    {
      localObject2 = paramString2.substring(j + i);
      if (((String)localObject2).contains("/"))
        break label256;
      ((List)localObject3).add(localObject2);
      break label103;
      localObject3 = (c.d)((c)localObject1).ujx.get(paramString2);
      localObject2 = localObject3;
      if (localObject3 != null)
        break;
      paramString2 = c.aef(paramString2);
      localObject2 = (c.d)((c)localObject1).ujx.get(paramString2);
      break;
      j = 3;
      break label81;
    }
    label256: boolean bool;
    if (((String)localObject1).equals(localObject2))
    {
      bool = false;
      label268: if ((!bool) || (((List)localObject3).isEmpty()))
        break label502;
      paramString2 = URI.create(paramString1);
      paramString1 = paramString2.getHost();
      j = paramString2.getPort();
      paramString2 = paramString1 + ":" + j;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "share domain : %s", new Object[] { paramString1 });
      if (bo.isNullOrNil(paramString1))
        break label502;
      localObject2 = ((List)localObject3).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (String)((Iterator)localObject2).next();
        if ((paramString1.equals(localObject3)) || (paramString1.endsWith(".".concat(String.valueOf(localObject3)))) || ((j != -1) && ((paramString2.equals(localObject3)) || (paramString2.endsWith(".".concat(String.valueOf(localObject3)))))))
          bool = false;
      }
    }
    while (true)
    {
      AppMethodBeat.o(9233);
      return bool;
      paramString2 = (String)localObject2;
      if (!((String)localObject2).endsWith("/"))
        paramString2 = (String)localObject2 + "/";
      if (!((String)localObject1).startsWith(paramString2))
        break;
      bool = false;
      break label268;
      label502: continue;
      bool = true;
      break label268;
      label511: bool = false;
    }
  }

  private boolean i(i parami)
  {
    AppMethodBeat.i(9240);
    this.eBB = false;
    Bundle localBundle;
    if (parami.puc.containsKey("actionSheetId"))
    {
      int i = bo.ank((String)parami.puc.get("actionSheetId"));
      localBundle = new Bundle();
      localBundle.putInt("actionSheetId", i);
    }
    try
    {
      this.umI.c(134, localBundle);
      a(parami, "", null);
      AppMethodBeat.o(9240);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
    }
  }

  private boolean j(i parami)
  {
    AppMethodBeat.i(9241);
    this.eBB = false;
    Bundle localBundle = new Bundle();
    if (parami.puc.containsKey("title"))
      localBundle.putString("title", (String)parami.puc.get("title"));
    if (parami.puc.containsKey("desc"))
      localBundle.putString("desc", (String)parami.puc.get("desc"));
    if (parami.puc.containsKey("items"))
      localBundle.putString("items", (String)parami.puc.get("items"));
    try
    {
      this.umI.c(133, localBundle);
      HashMap localHashMap = new HashMap();
      localHashMap.put("actionSheetId", Integer.valueOf(localBundle.getInt("actionSheetId")));
      a(parami, localHashMap);
      AppMethodBeat.o(9241);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
    }
  }

  private boolean k(i parami)
  {
    AppMethodBeat.i(9242);
    this.eBB = false;
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("title", aa.t(parami.puc, "title"));
      localBundle.putString("icon", aa.t(parami.puc, "icon"));
      localBundle.putInt("duration", aa.d(parami.puc, "duration", 500));
      localBundle.putInt("mask", aa.d(parami.puc, "mask", 0));
      this.umI.c(148, localBundle);
      a(parami, "showSearchToast:succ", null);
      AppMethodBeat.o(9242);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
    }
  }

  private boolean l(i parami)
  {
    AppMethodBeat.i(9243);
    this.eBB = false;
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle.putString("title", aa.t(parami.puc, "title"));
      localBundle.putInt("mask", aa.d(parami.puc, "mask", 0));
      this.umI.c(149, localBundle);
      a(parami, "showSearchLoading:succ", null);
      AppMethodBeat.o(9243);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
    }
  }

  private boolean m(i parami)
  {
    AppMethodBeat.i(9244);
    this.eBB = false;
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      this.umI.c(150, localBundle);
      a(parami, "hideSearchLoading:succ", null);
      AppMethodBeat.o(9244);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
    }
  }

  private boolean n(i parami)
  {
    AppMethodBeat.i(9247);
    if (!com.tencent.mm.model.r.Ze())
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doWeibo fail, qq not binded");
      localObject1 = com.tencent.mm.ui.base.h.a(this.context, 2131305693, 2131297061, new g.125(this), null);
      ((com.tencent.mm.ui.widget.a.c)localObject1).setCancelable(false);
      ((com.tencent.mm.ui.widget.a.c)localObject1).setOnDismissListener(new g.2(this, parami));
      AppMethodBeat.o(9247);
    }
    while (true)
    {
      return true;
      localObject1 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XU().RA("@t.qq.com");
      if ((localObject1 != null) && (bo.nullAsNil(((bq)localObject1).name).length() != 0))
        break;
      localObject1 = com.tencent.mm.ui.base.h.a(this.context, 2131305691, 2131297061, new g.13(this));
      ((com.tencent.mm.ui.widget.a.c)localObject1).setCancelable(false);
      ((com.tencent.mm.ui.widget.a.c)localObject1).setOnDismissListener(new g.24(this, parami));
      AppMethodBeat.o(9247);
    }
    Object localObject1 = bo.bc((String)parami.puc.get("type"), "40");
    if ((localObject1 != null) && (((String)localObject1).length() > 0));
    while (true)
    {
      try
      {
        i = bo.getInt((String)localObject1, 40);
        if ((i == 11) || (i == 20))
          break label444;
        i = 40;
        localObject2 = (String)parami.puc.get("content");
        str = (String)parami.puc.get("url");
        if (localObject2 != null)
        {
          localObject1 = localObject2;
          if (((String)localObject2).trim().length() != 0);
        }
        else
        {
          localObject1 = "";
        }
        if ((str == null) || (str.length() == 0))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doWeibo fail, invalid argument, content = " + (String)localObject1 + ", url = " + str);
          a(parami, "share_weibo:fail_-2", null);
          AppMethodBeat.o(9247);
        }
      }
      catch (Exception localException)
      {
        String str;
        i = 40;
        continue;
        l.a(parami.uII, agw("shareWeibo"), null, null);
        parami = ar.aek(str);
        Object localObject2 = new Intent(this.context, ShareToQQWeiboUI.class);
        ((Intent)localObject2).putExtra("type", i);
        ((Intent)localObject2).putExtra("shortUrl", parami);
        ((Intent)localObject2).putExtra("content", localException);
        if ((this.context instanceof MMActivity))
          ((MMActivity)this.context).b(this, (Intent)localObject2, 2);
        AppMethodBeat.o(9247);
      }
      break;
      label444: continue;
      int i = 40;
    }
  }

  // ERROR //
  private boolean o(i parami)
  {
    // Byte code:
    //   0: sipush 9249
    //   3: invokestatic 155	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_1
    //   7: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   10: ldc_w 10280
    //   13: invokeinterface 383 2 0
    //   18: checkcast 165	java/lang/String
    //   21: astore_2
    //   22: ldc_w 419
    //   25: astore_3
    //   26: invokestatic 2675	com/tencent/mm/model/r:Yz	()Ljava/lang/String;
    //   29: astore 4
    //   31: aload_0
    //   32: getfield 472	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:umI	Lcom/tencent/mm/plugin/webview/stub/e;
    //   35: bipush 18
    //   37: aconst_null
    //   38: invokeinterface 1046 3 0
    //   43: astore 5
    //   45: aload 5
    //   47: ifnull +351 -> 398
    //   50: aload 5
    //   52: ldc_w 3283
    //   55: invokevirtual 1642	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   58: astore 6
    //   60: aload 5
    //   62: ldc_w 3278
    //   65: invokevirtual 1642	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   68: astore 7
    //   70: aload 5
    //   72: ldc_w 3285
    //   75: invokevirtual 1642	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   78: astore 8
    //   80: aload 5
    //   82: ldc_w 3287
    //   85: invokevirtual 3281	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   88: istore 9
    //   90: aload 5
    //   92: ldc_w 3545
    //   95: iconst_0
    //   96: invokevirtual 640	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   99: istore 10
    //   101: new 526	java/lang/StringBuilder
    //   104: astore_3
    //   105: aload_3
    //   106: invokespecial 527	java/lang/StringBuilder:<init>	()V
    //   109: aload_3
    //   110: ldc_w 419
    //   113: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   116: aload 6
    //   118: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   121: ldc_w 6948
    //   124: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   127: aload 7
    //   129: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   132: ldc_w 6948
    //   135: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: aload 8
    //   140: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   143: ldc_w 6948
    //   146: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   149: iload 9
    //   151: invokevirtual 633	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   154: ldc_w 6948
    //   157: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   160: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   163: astore_3
    //   164: iload 10
    //   166: istore 9
    //   168: iload 10
    //   170: ifne +12 -> 182
    //   173: aload 8
    //   175: aload 7
    //   177: invokestatic 10285	com/tencent/mm/model/u:ad	(Ljava/lang/String;Ljava/lang/String;)I
    //   180: istore 9
    //   182: aload 6
    //   184: ifnull +378 -> 562
    //   187: aload 6
    //   189: ldc_w 10287
    //   192: invokevirtual 674	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   195: ifeq +367 -> 562
    //   198: aload 6
    //   200: iconst_4
    //   201: invokevirtual 4793	java/lang/String:substring	(I)Ljava/lang/String;
    //   204: invokestatic 2919	com/tencent/mm/sdk/platformtools/bo:anl	(Ljava/lang/String;)J
    //   207: lstore 11
    //   209: ldc_w 7986
    //   212: invokestatic 829	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   215: checkcast 7986	com/tencent/mm/plugin/messenger/foundation/a/j
    //   218: invokeinterface 9910 1 0
    //   223: aload 7
    //   225: lload 11
    //   227: invokeinterface 10290 4 0
    //   232: astore 7
    //   234: aload 7
    //   236: getfield 10295	com/tencent/mm/g/c/cy:field_talker	Ljava/lang/String;
    //   239: invokestatic 10300	com/tencent/mm/model/n:mA	(Ljava/lang/String;)I
    //   242: istore 10
    //   244: new 526	java/lang/StringBuilder
    //   247: astore 5
    //   249: aload 5
    //   251: invokespecial 527	java/lang/StringBuilder:<init>	()V
    //   254: aload 5
    //   256: aload_3
    //   257: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   260: aload 7
    //   262: invokevirtual 10305	com/tencent/mm/storage/bi:getType	()I
    //   265: invokevirtual 633	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   268: ldc_w 6948
    //   271: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   274: iload 10
    //   276: invokevirtual 633	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   279: ldc_w 6948
    //   282: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: iload 9
    //   287: invokevirtual 633	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   290: ldc_w 6948
    //   293: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   296: invokestatic 10310	com/tencent/mm/plugin/webview/model/aq:aEn	()I
    //   299: invokevirtual 633	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   302: ldc_w 6948
    //   305: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   308: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   311: astore 5
    //   313: aload 5
    //   315: astore_3
    //   316: new 526	java/lang/StringBuilder
    //   319: astore 7
    //   321: aload 5
    //   323: astore_3
    //   324: aload 7
    //   326: invokespecial 527	java/lang/StringBuilder:<init>	()V
    //   329: aload 5
    //   331: astore_3
    //   332: aload 7
    //   334: aload 5
    //   336: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   339: aload 4
    //   341: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   344: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   347: astore 5
    //   349: aload 5
    //   351: astore_3
    //   352: new 526	java/lang/StringBuilder
    //   355: astore 7
    //   357: aload 5
    //   359: astore_3
    //   360: aload 7
    //   362: invokespecial 527	java/lang/StringBuilder:<init>	()V
    //   365: aload 5
    //   367: astore_3
    //   368: aload 7
    //   370: aload 5
    //   372: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   375: ldc_w 6948
    //   378: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   381: invokestatic 902	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   384: invokestatic 10313	com/tencent/mm/sdk/platformtools/bo:gN	(Landroid/content/Context;)Ljava/lang/String;
    //   387: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   390: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   393: astore 5
    //   395: aload 5
    //   397: astore_3
    //   398: ldc_w 363
    //   401: ldc_w 10315
    //   404: iconst_1
    //   405: anewarray 4	java/lang/Object
    //   408: dup
    //   409: iconst_0
    //   410: aload_2
    //   411: aastore
    //   412: invokestatic 7180	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   415: ldc_w 363
    //   418: ldc_w 10317
    //   421: iconst_1
    //   422: anewarray 4	java/lang/Object
    //   425: dup
    //   426: iconst_0
    //   427: aload_3
    //   428: aastore
    //   429: invokestatic 7180	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   432: new 526	java/lang/StringBuilder
    //   435: dup
    //   436: invokespecial 527	java/lang/StringBuilder:<init>	()V
    //   439: aload_2
    //   440: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   443: ldc_w 6948
    //   446: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   449: aload_3
    //   450: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   453: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   456: astore_3
    //   457: ldc_w 10319
    //   460: invokestatic 829	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   463: checkcast 10319	com/tencent/mm/plugin/sns/b/a
    //   466: sipush 13297
    //   469: aload_3
    //   470: invokestatic 863	com/tencent/mm/sdk/platformtools/bo:anT	()J
    //   473: l2i
    //   474: invokeinterface 10321 4 0
    //   479: aload_1
    //   480: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   483: ldc_w 10323
    //   486: invokeinterface 383 2 0
    //   491: checkcast 165	java/lang/String
    //   494: ldc_w 2842
    //   497: invokestatic 2947	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   500: invokestatic 2826	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   503: ifeq +42 -> 545
    //   506: new 639	android/os/Bundle
    //   509: dup
    //   510: invokespecial 994	android/os/Bundle:<init>	()V
    //   513: astore_3
    //   514: aload_3
    //   515: ldc_w 10325
    //   518: aload_2
    //   519: invokevirtual 1011	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   522: aload_3
    //   523: ldc_w 2812
    //   526: aload 4
    //   528: invokevirtual 1011	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   531: aload_0
    //   532: getfield 472	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:umI	Lcom/tencent/mm/plugin/webview/stub/e;
    //   535: ldc_w 10326
    //   538: aload_3
    //   539: invokeinterface 1046 3 0
    //   544: pop
    //   545: aload_0
    //   546: aload_1
    //   547: ldc_w 10328
    //   550: aconst_null
    //   551: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   554: sipush 9249
    //   557: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   560: iconst_1
    //   561: ireturn
    //   562: new 526	java/lang/StringBuilder
    //   565: astore 5
    //   567: aload 5
    //   569: invokespecial 527	java/lang/StringBuilder:<init>	()V
    //   572: aload 5
    //   574: aload_3
    //   575: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   578: ldc_w 10330
    //   581: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   584: iload 9
    //   586: invokevirtual 633	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   589: ldc_w 6948
    //   592: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   595: invokestatic 10310	com/tencent/mm/plugin/webview/model/aq:aEn	()I
    //   598: invokevirtual 633	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   601: ldc_w 6948
    //   604: invokevirtual 536	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   607: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   610: astore 5
    //   612: goto -299 -> 313
    //   615: astore 5
    //   617: ldc_w 363
    //   620: aload 5
    //   622: ldc_w 419
    //   625: iconst_0
    //   626: anewarray 4	java/lang/Object
    //   629: invokestatic 423	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   632: goto -234 -> 398
    //   635: astore_3
    //   636: ldc_w 363
    //   639: aload_3
    //   640: ldc_w 419
    //   643: iconst_0
    //   644: anewarray 4	java/lang/Object
    //   647: invokestatic 423	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   650: aload_0
    //   651: aload_1
    //   652: ldc_w 10332
    //   655: aconst_null
    //   656: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   659: sipush 9249
    //   662: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   665: goto -105 -> 560
    //   668: astore_3
    //   669: ldc_w 363
    //   672: ldc_w 10334
    //   675: iconst_1
    //   676: anewarray 4	java/lang/Object
    //   679: dup
    //   680: iconst_0
    //   681: aload_3
    //   682: invokevirtual 1200	android/os/RemoteException:getMessage	()Ljava/lang/String;
    //   685: aastore
    //   686: invokestatic 892	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   689: goto -144 -> 545
    //   692: astore 5
    //   694: goto -77 -> 617
    //
    // Exception table:
    //   from	to	target	type
    //   187	313	615	java/lang/Exception
    //   562	612	615	java/lang/Exception
    //   31	45	635	android/os/RemoteException
    //   50	164	635	android/os/RemoteException
    //   173	182	635	android/os/RemoteException
    //   187	313	635	android/os/RemoteException
    //   316	321	635	android/os/RemoteException
    //   324	329	635	android/os/RemoteException
    //   332	349	635	android/os/RemoteException
    //   352	357	635	android/os/RemoteException
    //   360	365	635	android/os/RemoteException
    //   368	395	635	android/os/RemoteException
    //   562	612	635	android/os/RemoteException
    //   617	632	635	android/os/RemoteException
    //   531	545	668	android/os/RemoteException
    //   316	321	692	java/lang/Exception
    //   324	329	692	java/lang/Exception
    //   332	349	692	java/lang/Exception
    //   352	357	692	java/lang/Exception
    //   360	365	692	java/lang/Exception
    //   368	395	692	java/lang/Exception
  }

  private boolean od(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(9361);
    com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "hideMenuEntry:".concat(String.valueOf(paramBoolean)));
    try
    {
      this.umI.nL(paramBoolean);
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "hideMenuEntry succ");
      AppMethodBeat.o(9361);
      paramBoolean = bool;
      return paramBoolean;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "hideMenuEntry error");
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "hideMenuEntry succ");
        AppMethodBeat.o(9361);
        paramBoolean = false;
      }
    }
    finally
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "hideMenuEntry succ");
        AppMethodBeat.o(9361);
        paramBoolean = bool;
      }
    }
  }

  private boolean p(i parami)
  {
    AppMethodBeat.i(9250);
    try
    {
      if (this.umI != null)
      {
        localObject = this.umI.g(87, null);
        if (localObject != null)
        {
          if (!bo.nullAsNil(((Bundle)localObject).getString("result")).equals("not_return"))
            break label66;
          a(parami, "getWePkgAuthResult:fail_auth_result_not_return", null);
        }
      }
      while (true)
      {
        AppMethodBeat.o(9250);
        return true;
        label66: String str = ((Bundle)localObject).getString("full_url");
        i = ((Bundle)localObject).getInt("set_cookie");
        if (!bo.isNullOrNil(str))
          break;
        a(parami, "getWePkgAuthResult:fail_full_url_empty", null);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        int i;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doGetWePkgAuthResult exception, " + localException.getMessage());
        a(parami, "getWePkgAuthResult:fail", null);
        continue;
        Object localObject = new java/util/HashMap;
        ((HashMap)localObject).<init>();
        ((HashMap)localObject).put("full_url", localException);
        ((HashMap)localObject).put("set_cookie", Integer.valueOf(i));
        a(parami, "getWePkgAuthResult:ok", (Map)localObject);
      }
    }
  }

  private static int parseColor(String paramString)
  {
    AppMethodBeat.i(9478);
    int i = Color.parseColor(paramString);
    AppMethodBeat.o(9478);
    return i | 0xFF000000;
  }

  private boolean q(i parami)
  {
    AppMethodBeat.i(9251);
    String str1 = (String)parami.puc.get("reportId");
    boolean bool1 = bo.nullAsNil((String)parami.puc.get("reportInstantly")).equals("1");
    boolean bool2 = bo.nullAsNil((String)parami.puc.get("reportTimeBegin")).equals("1");
    String str2 = (String)parami.puc.get("reportFormatData");
    String str3 = (String)parami.puc.get("reportTabsFormatData");
    if (bo.isNullOrNil(str1))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "reportId is null or nil");
      a(parami, "reportGamePageTime:fail_invalid_reportId", null);
      AppMethodBeat.o(9251);
    }
    while (true)
    {
      return true;
      if ((bo.isNullOrNil(str2)) && (bo.isNullOrNil(str3)))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "reportFormatData && reportTabsFormatData is null or nil");
        a(parami, "reportGamePageTime:fail_invalid_reportFormatData_reportTabsFormatData", null);
        AppMethodBeat.o(9251);
        continue;
      }
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "reportGamePageTime, reportId:%s, reportInstantly:%b, reportTimeBegin:%b, reportFormatData:(%s), reportTabsFormatData(%s)", new Object[] { str1, Boolean.valueOf(bool1), Boolean.valueOf(bool2), str2, str3 });
      Bundle localBundle = new Bundle();
      localBundle.putString("game_page_report_id", str1);
      localBundle.putBoolean("game_page_report_instantly", bool1);
      localBundle.putBoolean("game_page_report_time_begin", bool2);
      localBundle.putString("game_page_report_format_data", str2);
      localBundle.putString("game_page_report_tabs_format_data", str3);
      try
      {
        this.umI.g(95, localBundle);
        a(parami, "reportGamePageTime:ok", null);
        AppMethodBeat.o(9251);
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "reportGamePageTime, exception = %s", new Object[] { localException });
          a(parami, "reportGamePageTime:fail", null);
        }
      }
    }
  }

  private boolean r(i parami)
  {
    AppMethodBeat.i(9253);
    String str1 = (String)parami.puc.get("webtype");
    String str2 = (String)parami.puc.get("username");
    String str3 = (String)parami.puc.get("scene");
    String str4 = (String)parami.puc.get("profileReportInfo");
    boolean bool;
    if ((str1 == null) || (str1.length() == 0) || (str2 == null) || (str2.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doAddContact fail, invalid arguments, webType = " + str1 + ", username = " + str2);
      a(parami, "add_contact:fail", null);
      AppMethodBeat.o(9253);
      bool = true;
    }
    while (true)
    {
      return bool;
      agv(str3);
      i = bo.getInt(str1, -1);
      if (i == -1)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doAddContact fail, parseInt fail, str = ".concat(String.valueOf(str1)));
        a(parami, "add_contact:fail", null);
        AppMethodBeat.o(9253);
        bool = true;
      }
      else if (!(this.context instanceof Activity))
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doAddContact invalid context");
        a(parami, "add_contact:fail", null);
        AppMethodBeat.o(9253);
        bool = false;
      }
      else
      {
        l.a(parami.uII, false, str2, null);
        switch (i)
        {
        default:
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "unknown addScene = ".concat(String.valueOf(i)));
          a(parami, "add_contact:fail", null);
          AppMethodBeat.o(9253);
          bool = true;
        case 1:
        }
      }
    }
    if (this.uGh == null);
    for (int i = 33; ; i = this.uGh.getInt("Contact_Scene", 33))
    {
      ((com.tencent.mm.pluginsdk.g)com.tencent.mm.kernel.g.K(com.tencent.mm.pluginsdk.g.class)).a(this.context, str2, i, new g.44(this, parami), str4).show();
      AppMethodBeat.o(9253);
      bool = true;
      break;
    }
  }

  private boolean s(i parami)
  {
    AppMethodBeat.i(9254);
    Object localObject1 = (String)parami.puc.get("current");
    Object localObject2 = (String[])parami.puc.get("urls");
    Object localObject4 = new ArrayList();
    if ((localObject2 == null) || (localObject2.length == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doImgPreview fail, urls is null");
      this.eBB = false;
      AppMethodBeat.o(9254);
      return false;
    }
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "doImgPreview ok");
    int i = 0;
    if (i < localObject2.length)
    {
      if ((bo.isNullOrNil(localObject2[i])) || (localObject2[i].equalsIgnoreCase("null")))
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "null url, i = %d", new Object[] { Integer.valueOf(i) });
      while (true)
      {
        i++;
        break;
        if (bo.nullAsNil(localObject2[i]).startsWith("weixin://resourceid/"))
          localObject2[i] = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(localObject2[i]).heo;
        ((ArrayList)localObject4).add(localObject2[i]);
      }
    }
    localObject2 = (String[])((ArrayList)localObject4).toArray((Object[])localObject2);
    String[] arrayOfString = (String[])((ArrayList)localObject4).toArray(new String[((ArrayList)localObject4).size()]);
    if (bo.isNullOrNil((String)localObject1))
      localObject1 = localObject2[0];
    label1368: 
    while (true)
    {
      label232: Intent localIntent = new Intent();
      String str1;
      if (parami.puc.containsKey("key_wxapp_id"))
      {
        str1 = (String)parami.puc.get("key_wxapp_id");
        if (!bo.isNullOrNil(str1))
        {
          localIntent.putExtra("scanCodeTypes", new int[] { 3 });
          localIntent.putExtra("scanResultCodeTypes", new int[] { 22 });
        }
      }
      while (true)
      {
        while (true)
        {
          boolean bool1 = true;
          boolean bool2 = true;
          boolean bool3 = true;
          localObject2 = "";
          localObject4 = localObject2;
          boolean bool4 = bool2;
          try
          {
            Object localObject5 = this.umI;
            localObject4 = localObject2;
            bool4 = bool2;
            localObject6 = new android/os/Bundle;
            localObject4 = localObject2;
            bool4 = bool2;
            ((Bundle)localObject6).<init>();
            localObject4 = localObject2;
            bool4 = bool2;
            localObject6 = ((com.tencent.mm.plugin.webview.stub.e)localObject5).g(90001, (Bundle)localObject6);
            f = -1.0F;
            if (localObject6 != null)
            {
              localObject4 = localObject2;
              bool4 = bool2;
              localObject5 = ((Bundle)localObject6).getString("cookie", null);
              localObject4 = localObject2;
              bool4 = bool2;
              if (!bo.isNullOrNil((String)localObject5))
              {
                localObject4 = localObject2;
                bool4 = bool2;
                localIntent.putExtra("cookie", (String)localObject5);
              }
              localObject4 = localObject2;
              bool4 = bool2;
              f = ((Bundle)localObject6).getFloat("density", -1.0F);
            }
            localObject4 = localObject2;
            bool4 = bool2;
            Object localObject7 = this.umI.g(18, null);
            localObject4 = localObject2;
            if (localObject7 != null)
            {
              localObject4 = localObject2;
              bool4 = bool2;
              String str2 = ((Bundle)localObject7).getString("preChatName");
              localObject4 = localObject2;
              bool4 = bool2;
              localObject6 = ((Bundle)localObject7).getString("preUsername");
              localObject4 = localObject2;
              bool4 = bool2;
              localObject5 = ((Bundle)localObject7).getString("rawUrl");
              localObject4 = localObject2;
              bool4 = bool2;
              localObject2 = ((Bundle)localObject7).getString("url");
              localObject4 = localObject2;
              bool4 = bool2;
              i = ((Bundle)localObject7).getInt("getA8KeyScene");
              localObject4 = localObject2;
              bool4 = bool2;
              localObject7 = com.tencent.mm.model.v.nW("ImgPreview");
              localObject4 = localObject2;
              bool4 = bool2;
              v.b localb = com.tencent.mm.model.v.Zp().y((String)localObject7, true);
              localObject4 = localObject2;
              bool4 = bool2;
              localb.j("preUsername", str2);
              localObject4 = localObject2;
              bool4 = bool2;
              localb.j("preChatName", localObject6);
              localObject4 = localObject2;
              bool4 = bool2;
              localb.j("url", localObject2);
              localObject4 = localObject2;
              bool4 = bool2;
              localb.j("rawUrl", localObject5);
              if (i != 53)
              {
                bool1 = bool3;
                if (i != 52);
              }
              else
              {
                localObject4 = localObject2;
                bool4 = bool2;
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "not allow to ScanQRCode");
                bool1 = false;
              }
              localObject4 = localObject2;
              bool4 = bool1;
              localIntent.putExtra("img_gallery_session_id", (String)localObject7);
              localObject4 = localObject2;
            }
          }
          catch (Exception localException2)
          {
            try
            {
              parami = (String)parami.puc.get("currentInfo");
              if (!bo.isNullOrNil(parami))
              {
                localObject2 = new org/json/JSONObject;
                ((JSONObject)localObject2).<init>(parami);
                parami = com.tencent.mm.plugin.webview.modeltools.j.a((String)localObject1, arrayOfString, (JSONObject)localObject2);
                localObject1 = localObject2;
              }
            }
            catch (Exception localException2)
            {
              while (true)
              {
                try
                {
                  Object localObject6;
                  float f;
                  int j;
                  if ((com.tencent.mm.plugin.webview.modeltools.j.cYM()) && (localObject1 != null))
                  {
                    localObject1 = ((JSONObject)localObject1).optJSONObject("pos");
                    if (localObject1 != null)
                    {
                      localObject2 = this.umI;
                      localObject6 = new android/os/Bundle;
                      ((Bundle)localObject6).<init>();
                      localObject2 = ((com.tencent.mm.plugin.webview.stub.e)localObject2).g(107, (Bundle)localObject6);
                      if (localObject2 == null)
                        continue;
                      bool4 = ((Bundle)localObject2).getBoolean("isFullScreen", false);
                      j = com.tencent.mm.ui.ak.de(this.context);
                      i = com.tencent.mm.ui.ak.getStatusBarHeight(this.context);
                      if (f > 0.0F)
                        continue;
                      f = com.tencent.mm.bz.a.getDensity(this.context);
                      int k = (int)(((JSONObject)localObject1).optDouble("width") * f);
                      int m = (int)(((JSONObject)localObject1).optDouble("height") * f);
                      int n = (int)(((JSONObject)localObject1).optDouble("x") * f);
                      double d1 = ((JSONObject)localObject1).optDouble("y");
                      double d2 = f;
                      if (!bool4)
                        continue;
                      i = 0;
                      i = (int)(i + d1 * d2);
                      localIntent.putExtra("img_gallery_width", k).putExtra("img_gallery_height", m).putExtra("img_gallery_left", n).putExtra("img_gallery_top", i);
                      j = com.tencent.mm.bz.a.ge(this.context);
                      com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "doPreviewImg left %d, top %d, w %d, h %d, density %f,screenHeight %d", new Object[] { Integer.valueOf(n), Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(m), Float.valueOf(f), Integer.valueOf(j) });
                      if ((k > 0) && (m > 0) && (m < j))
                        localIntent.putExtra("shouldRunDragAnimation", true);
                    }
                  }
                  localObject1 = localObject4;
                  localIntent.putExtra("nowUrl", parami);
                  localIntent.putExtra("urlList", arrayOfString);
                  localIntent.putExtra("type", -255);
                  localIntent.putExtra("isFromWebView", true);
                  localIntent.putExtra("shouldShowScanQrCodeMenu", bool1);
                  if ((this.context instanceof Service))
                    localIntent.addFlags(268435456);
                  parami = new Bundle();
                  parami.putInt("stat_scene", 4);
                  parami.putString("stat_url", (String)localObject1);
                  if (!bo.isNullOrNil(str1))
                  {
                    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "[banjump] doImgPreview, wxappId:%s", new Object[] { str1 });
                    parami.putString("stat_app_id", str1);
                  }
                  localIntent.putExtra("_stat_obj", parami);
                  com.tencent.mm.plugin.webview.a.a.gkE.q(localIntent, this.context);
                  this.eBB = false;
                  AppMethodBeat.o(9254);
                  break;
                  if (!((String)localObject1).startsWith("weixin://resourceid/"))
                    break label1368;
                  localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex((String)localObject1).heo;
                  break label232;
                  bool4 = false;
                  continue;
                  i = j + i;
                  continue;
                  localException1 = localException1;
                  parami = (i)localObject1;
                  bool1 = bool4;
                  localObject1 = localObject4;
                  com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doImgPreview fail : %s", new Object[] { localException1.getMessage() });
                  continue;
                  localException2 = localException2;
                  parami = (i)localObject1;
                  localObject1 = localObject4;
                  continue;
                }
                catch (Exception localException3)
                {
                  localObject1 = localObject4;
                  continue;
                  continue;
                }
                Object localObject3 = null;
                parami = (i)localObject1;
                localObject1 = localObject3;
              }
            }
          }
        }
        str1 = null;
      }
    }
  }

  private boolean t(i parami)
  {
    AppMethodBeat.i(9255);
    try
    {
      Object localObject = i.aP(parami.puc);
      this.umI.cZb();
      this.umI.W((Bundle)localObject);
      localObject = "";
      if (this.uGh != null)
      {
        this.uGh.setClassLoader(getClass().getClassLoader());
        localObject = this.uGh.getString("KoriginUrl");
        this.uGh.getBoolean("KIsHKAgreeUrl");
      }
      vo localvo = new com/tencent/mm/g/a/vo;
      localvo.<init>();
      localvo.cSB.clP = ((String)localObject);
      com.tencent.mm.sdk.b.a.xxA.m(localvo);
      a(parami, "close_window:ok", null);
      AppMethodBeat.o(9255);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "doCloseWindow, ex = " + localException.getMessage());
    }
  }

  private static void u(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(9271);
    hc localhc = new hc();
    localhc.cBN.appId = paramString1;
    localhc.cBN.opType = 2;
    localhc.cBN.cBO = paramInt;
    localhc.cBN.cvq = paramString2;
    com.tencent.mm.sdk.b.a.xxA.m(localhc);
    AppMethodBeat.o(9271);
  }

  private boolean u(i parami)
  {
    AppMethodBeat.i(9257);
    this.eBB = false;
    int i = bo.ank(parami.puc.get("voteResultIndex").toString());
    try
    {
      parami = new android/os/Bundle;
      parami.<init>();
      parami.putInt("sns_landing_pages_ad_vote_index", i);
      this.umI.c(150, parami);
      label60: AppMethodBeat.o(9257);
      return false;
    }
    catch (Exception parami)
    {
      break label60;
    }
  }

  private boolean v(i parami)
  {
    AppMethodBeat.i(9258);
    Object localObject1 = (String)parami.puc.get("packageName");
    if (bo.isNullOrNil((String)localObject1))
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "packageName is null or nil");
      a(parami, "get_install_state:no", null);
      AppMethodBeat.o(9258);
    }
    Object localObject2;
    while (true)
    {
      return true;
      l.a(parami.uII, false, (String)localObject1, null);
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject1);
        if (localJSONArray.length() > 0)
        {
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localObject2 = new org/json/JSONObject;
          ((JSONObject)localObject2).<init>();
          int i = 0;
          j = 0;
          if (j < localJSONArray.length())
          {
            String str1 = localJSONArray.getString(j);
            PackageInfo localPackageInfo = com.tencent.mm.plugin.appbrand.r.b.getPackageInfo(this.context, str1);
            int k;
            if (localPackageInfo == null)
            {
              k = 0;
              label143: if (localPackageInfo != null)
                break label276;
            }
            label276: for (localObject3 = "null"; ; localObject3 = localPackageInfo.versionName)
            {
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>("doGetInstallState, packageName = ");
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", str1 + ", packageInfo = " + localPackageInfo + ", version = " + k + ", versionName = " + (String)localObject3);
              int m = i;
              if (i == 0)
              {
                m = i;
                if (k > 0)
                  m = 1;
              }
              localJSONObject.put(str1, k);
              ((JSONObject)localObject2).put(str1, localObject3);
              j++;
              i = m;
              break;
              k = localPackageInfo.versionCode;
              break label143;
            }
          }
          Object localObject3 = new java/util/HashMap;
          ((HashMap)localObject3).<init>();
          ((HashMap)localObject3).put("result", localJSONObject);
          ((HashMap)localObject3).put("versionName", localObject2);
          if (i != 0)
            a(parami, "get_install_state:yes", (Map)localObject3);
          while (true)
          {
            AppMethodBeat.o(9258);
            break;
            a(parami, "get_install_state:no", null);
          }
        }
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "it is not batch get install state");
        localObject2 = com.tencent.mm.plugin.appbrand.r.b.getPackageInfo(this.context, (String)localObject1);
        if (localObject2 != null)
          break label472;
      }
    }
    int j = 0;
    label383: String str2;
    if (localObject2 == null)
    {
      str2 = "null";
      label393: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doGetInstallState, packageName = " + (String)localObject1 + ", packageInfo = " + localObject2 + ", version = " + j + ", versionName = " + str2);
      if (localObject2 != null)
        break label492;
      a(parami, "get_install_state:no", null);
    }
    while (true)
    {
      AppMethodBeat.o(9258);
      break;
      label472: j = ((PackageInfo)localObject2).versionCode;
      break label383;
      str2 = ((PackageInfo)localObject2).versionName;
      break label393;
      label492: localObject1 = new HashMap();
      ((Map)localObject1).put("versionName", str2);
      a(parami, "get_install_state:yes_".concat(String.valueOf(j)), (Map)localObject1);
    }
  }

  // ERROR //
  private boolean w(i parami)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: sipush 9259
    //   5: invokestatic 155	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_1
    //   9: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   12: ldc_w 2949
    //   15: invokeinterface 383 2 0
    //   20: checkcast 165	java/lang/String
    //   23: astore_3
    //   24: aload_1
    //   25: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   28: ldc_w 10740
    //   31: invokeinterface 383 2 0
    //   36: checkcast 165	java/lang/String
    //   39: iconst_1
    //   40: invokestatic 619	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   43: istore 4
    //   45: aload_1
    //   46: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   49: ldc_w 10742
    //   52: invokeinterface 383 2 0
    //   57: checkcast 165	java/lang/String
    //   60: astore 5
    //   62: ldc_w 363
    //   65: ldc_w 10744
    //   68: iconst_3
    //   69: anewarray 4	java/lang/Object
    //   72: dup
    //   73: iconst_0
    //   74: aload_3
    //   75: aastore
    //   76: dup
    //   77: iconst_1
    //   78: iload 4
    //   80: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   83: aastore
    //   84: dup
    //   85: iconst_2
    //   86: aload 5
    //   88: aastore
    //   89: invokestatic 573	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   92: aload 5
    //   94: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   97: ifeq +375 -> 472
    //   100: iconst_1
    //   101: istore 6
    //   103: iconst_1
    //   104: istore 7
    //   106: aload 5
    //   108: ifnull +353 -> 461
    //   111: new 1248	org/json/JSONArray
    //   114: astore_3
    //   115: aload_3
    //   116: aload 5
    //   118: invokespecial 1273	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   121: iload 6
    //   123: istore 8
    //   125: iload 7
    //   127: istore 6
    //   129: iload 8
    //   131: istore 7
    //   133: iload 7
    //   135: istore 8
    //   137: iload 6
    //   139: istore 9
    //   141: iload_2
    //   142: aload_3
    //   143: invokevirtual 1249	org/json/JSONArray:length	()I
    //   146: if_icmpge +84 -> 230
    //   149: aload_3
    //   150: iload_2
    //   151: invokevirtual 10745	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   154: checkcast 165	java/lang/String
    //   157: astore 5
    //   159: aload 5
    //   161: ldc_w 10747
    //   164: invokevirtual 983	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   167: ifeq +12 -> 179
    //   170: iconst_1
    //   171: istore 6
    //   173: iinc 2 1
    //   176: goto -43 -> 133
    //   179: aload 5
    //   181: ldc_w 10749
    //   184: invokevirtual 983	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   187: istore 10
    //   189: iload 10
    //   191: ifeq +267 -> 458
    //   194: iconst_1
    //   195: istore 7
    //   197: goto -24 -> 173
    //   200: astore_3
    //   201: iload 6
    //   203: istore 8
    //   205: iload 7
    //   207: istore 6
    //   209: iload 8
    //   211: istore 7
    //   213: ldc_w 363
    //   216: ldc_w 10751
    //   219: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   222: iload 6
    //   224: istore 9
    //   226: iload 7
    //   228: istore 8
    //   230: iload 9
    //   232: ifeq +91 -> 323
    //   235: iload 8
    //   237: ifne +86 -> 323
    //   240: bipush 8
    //   242: istore 7
    //   244: iload 4
    //   246: ifne +93 -> 339
    //   249: ldc_w 363
    //   252: ldc_w 10753
    //   255: invokestatic 4093	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   258: new 404	android/content/Intent
    //   261: dup
    //   262: invokespecial 405	android/content/Intent:<init>	()V
    //   265: astore_3
    //   266: aload_3
    //   267: ldc_w 4377
    //   270: iload 7
    //   272: invokevirtual 489	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   275: pop
    //   276: aload_0
    //   277: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   280: invokestatic 4382	com/tencent/mm/r/a:bI	(Landroid/content/Context;)Z
    //   283: ifne +23 -> 306
    //   286: invokestatic 4387	com/tencent/mm/bg/e:akI	()Z
    //   289: ifne +17 -> 306
    //   292: aload_0
    //   293: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   296: ldc_w 3349
    //   299: ldc_w 4389
    //   302: aload_3
    //   303: invokestatic 501	com/tencent/mm/bp/d:c	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   306: aload_0
    //   307: aload_1
    //   308: ldc_w 10755
    //   311: aconst_null
    //   312: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   315: sipush 9259
    //   318: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   321: iconst_1
    //   322: ireturn
    //   323: iload 9
    //   325: ifne +127 -> 452
    //   328: iload 8
    //   330: ifeq +122 -> 452
    //   333: iconst_4
    //   334: istore 7
    //   336: goto -92 -> 244
    //   339: iload 4
    //   341: iconst_1
    //   342: if_icmpne +85 -> 427
    //   345: new 404	android/content/Intent
    //   348: dup
    //   349: invokespecial 405	android/content/Intent:<init>	()V
    //   352: astore_1
    //   353: aload_1
    //   354: ldc_w 4377
    //   357: iload 7
    //   359: invokevirtual 489	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   362: pop
    //   363: aload_1
    //   364: ldc_w 10757
    //   367: iconst_1
    //   368: invokevirtual 2902	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   371: pop
    //   372: aload_1
    //   373: ldc_w 10759
    //   376: iconst_1
    //   377: invokevirtual 2902	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   380: pop
    //   381: aload_1
    //   382: ldc_w 10761
    //   385: iconst_3
    //   386: invokevirtual 489	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   389: pop
    //   390: aload_0
    //   391: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   394: invokestatic 4382	com/tencent/mm/r/a:bI	(Landroid/content/Context;)Z
    //   397: ifne -82 -> 315
    //   400: invokestatic 4387	com/tencent/mm/bg/e:akI	()Z
    //   403: ifne -88 -> 315
    //   406: aload_0
    //   407: getfield 447	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   410: ldc_w 3349
    //   413: ldc_w 4389
    //   416: aload_1
    //   417: aload_0
    //   418: getfield 322	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:cIv	I
    //   421: invokestatic 10763	com/tencent/mm/plugin/webview/stub/WebViewStubTempUI:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;I)V
    //   424: goto -109 -> 315
    //   427: ldc_w 363
    //   430: ldc_w 10765
    //   433: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   436: aload_0
    //   437: aload_1
    //   438: ldc_w 10767
    //   441: aconst_null
    //   442: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   445: goto -130 -> 315
    //   448: astore_3
    //   449: goto -236 -> 213
    //   452: iconst_1
    //   453: istore 7
    //   455: goto -211 -> 244
    //   458: goto -285 -> 173
    //   461: iload 6
    //   463: istore 8
    //   465: iload 7
    //   467: istore 9
    //   469: goto -239 -> 230
    //   472: iconst_0
    //   473: istore 6
    //   475: iconst_0
    //   476: istore 7
    //   478: goto -372 -> 106
    //
    // Exception table:
    //   from	to	target	type
    //   111	121	200	java/lang/Exception
    //   141	170	448	java/lang/Exception
    //   179	189	448	java/lang/Exception
  }

  private boolean x(i parami)
  {
    AppMethodBeat.i(9260);
    parami = (String)parami.puc.get("fontSize");
    if ((parami == null) || (parami.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doSetFontSizeCb, fontSize is null");
      this.eBB = false;
      AppMethodBeat.o(9260);
    }
    while (true)
    {
      return false;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSetFontSizeCb, fontSize = ".concat(String.valueOf(parami)));
      try
      {
        this.umI.afd(parami);
        this.eBB = false;
        AppMethodBeat.o(9260);
      }
      catch (Exception parami)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "setFontSizeCb, ex = " + parami.getMessage());
      }
    }
  }

  // ERROR //
  private boolean y(i parami)
  {
    // Byte code:
    //   0: sipush 9261
    //   3: invokestatic 155	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc_w 363
    //   9: ldc_w 10808
    //   12: invokestatic 370	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   15: aload_0
    //   16: invokevirtual 2699	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:getCurrentUrl	()Ljava/lang/String;
    //   19: astore_2
    //   20: aload_0
    //   21: aload_2
    //   22: invokevirtual 2702	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:bK	(Ljava/lang/String;)Ljava/lang/String;
    //   25: astore_3
    //   26: aload_0
    //   27: getfield 472	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:umI	Lcom/tencent/mm/plugin/webview/stub/e;
    //   30: invokeinterface 10811 1 0
    //   35: istore 4
    //   37: new 526	java/lang/StringBuilder
    //   40: astore 5
    //   42: aload 5
    //   44: ldc_w 10813
    //   47: invokespecial 622	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   50: ldc_w 363
    //   53: aload 5
    //   55: aload_0
    //   56: getfield 472	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:umI	Lcom/tencent/mm/plugin/webview/stub/e;
    //   59: invokeinterface 10811 1 0
    //   64: invokevirtual 633	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   67: invokevirtual 541	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   70: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   73: aload_1
    //   74: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   77: ldc_w 857
    //   80: invokeinterface 383 2 0
    //   85: checkcast 165	java/lang/String
    //   88: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   91: ifeq +60 -> 151
    //   94: ldc_w 363
    //   97: ldc_w 10815
    //   100: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   103: aload_0
    //   104: aload_1
    //   105: ldc_w 10817
    //   108: aconst_null
    //   109: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   112: aload_0
    //   113: iconst_0
    //   114: putfield 229	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:eBB	Z
    //   117: sipush 9261
    //   120: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   123: iconst_1
    //   124: ireturn
    //   125: astore 5
    //   127: iconst_0
    //   128: istore 4
    //   130: ldc_w 363
    //   133: ldc_w 10819
    //   136: iconst_1
    //   137: anewarray 4	java/lang/Object
    //   140: dup
    //   141: iconst_0
    //   142: aload 5
    //   144: aastore
    //   145: invokestatic 892	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   148: goto -75 -> 73
    //   151: aload_1
    //   152: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   155: ldc_w 10821
    //   158: invokeinterface 383 2 0
    //   163: checkcast 165	java/lang/String
    //   166: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   169: ifeq +35 -> 204
    //   172: ldc_w 363
    //   175: ldc_w 10823
    //   178: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   181: aload_0
    //   182: aload_1
    //   183: ldc_w 10817
    //   186: aconst_null
    //   187: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   190: aload_0
    //   191: iconst_0
    //   192: putfield 229	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:eBB	Z
    //   195: sipush 9261
    //   198: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   201: goto -78 -> 123
    //   204: aload_1
    //   205: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   208: ldc_w 5720
    //   211: invokeinterface 383 2 0
    //   216: checkcast 165	java/lang/String
    //   219: invokestatic 515	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   222: ifeq +35 -> 257
    //   225: ldc_w 363
    //   228: ldc_w 10825
    //   231: invokestatic 520	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   234: aload_0
    //   235: aload_1
    //   236: ldc_w 10817
    //   239: aconst_null
    //   240: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   243: aload_0
    //   244: iconst_0
    //   245: putfield 229	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:eBB	Z
    //   248: sipush 9261
    //   251: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   254: goto -131 -> 123
    //   257: aload_1
    //   258: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   261: ldc_w 10827
    //   264: invokeinterface 1449 2 0
    //   269: ifeq +46 -> 315
    //   272: aload_1
    //   273: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   276: ldc_w 10827
    //   279: invokeinterface 383 2 0
    //   284: checkcast 165	java/lang/String
    //   287: invokestatic 2826	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   290: istore 6
    //   292: iload 6
    //   294: ifeq +21 -> 315
    //   297: aload_1
    //   298: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   301: ldc_w 10827
    //   304: iload 6
    //   306: invokestatic 391	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   309: invokeinterface 791 3 0
    //   314: pop
    //   315: new 10829	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$46
    //   318: dup
    //   319: aload_0
    //   320: aload_1
    //   321: invokespecial 10830	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$46:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/g;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;)V
    //   324: astore 5
    //   326: aload_1
    //   327: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   330: ldc_w 857
    //   333: invokeinterface 383 2 0
    //   338: checkcast 165	java/lang/String
    //   341: ldc_w 10832
    //   344: invokevirtual 1439	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   347: ifeq +50 -> 397
    //   350: ldc_w 363
    //   353: ldc_w 10834
    //   356: invokestatic 370	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   359: ldc_w 10836
    //   362: invokestatic 829	com/tencent/mm/kernel/g:K	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   365: checkcast 10836	com/tencent/mm/pluginsdk/wallet/b
    //   368: aload_1
    //   369: getfield 375	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:puc	Ljava/util/Map;
    //   372: aload_2
    //   373: aload_3
    //   374: iload 4
    //   376: aload 5
    //   378: invokeinterface 10839 6 0
    //   383: aload_0
    //   384: iconst_0
    //   385: putfield 229	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:eBB	Z
    //   388: sipush 9261
    //   391: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   394: goto -271 -> 123
    //   397: ldc_w 363
    //   400: ldc_w 10841
    //   403: invokestatic 370	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   406: new 297	java/util/HashMap
    //   409: dup
    //   410: invokespecial 298	java/util/HashMap:<init>	()V
    //   413: astore 5
    //   415: aload 5
    //   417: ldc_w 1378
    //   420: ldc_w 887
    //   423: invokeinterface 791 3 0
    //   428: pop
    //   429: aload_0
    //   430: aload_1
    //   431: ldc_w 10817
    //   434: aload 5
    //   436: invokespecial 506	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   439: aload_0
    //   440: iconst_0
    //   441: putfield 229	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:eBB	Z
    //   444: sipush 9261
    //   447: invokestatic 211	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   450: goto -327 -> 123
    //   453: astore 5
    //   455: goto -325 -> 130
    //
    // Exception table:
    //   from	to	target	type
    //   26	37	125	java/lang/Exception
    //   37	73	453	java/lang/Exception
  }

  private boolean z(i parami)
  {
    AppMethodBeat.i(9262);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "hy: doGetPayResultReq");
    if ((this.context instanceof MMActivity))
    {
      com.tencent.mm.pluginsdk.wallet.g localg = new com.tencent.mm.pluginsdk.wallet.g(parami.puc);
      mg localmg = new mg();
      localmg.cIc.appId = localg.appId;
      localmg.cIc.partnerId = localg.partnerId;
      localmg.cIc.signType = localg.signType;
      localmg.cIc.nonceStr = localg.nonceStr;
      localmg.cIc.timeStamp = localg.timeStamp;
      localmg.cIc.packageExt = localg.packageExt;
      localmg.cIc.cId = localg.cId;
      localmg.cIc.url = localg.url;
      localmg.cIc.cIe = localg.cIe;
      localmg.cIc.cIf = localg.cIf;
      localmg.cIc.cvS = localg.cvS;
      localmg.cIc.cIg = localg.cIg;
      com.tencent.mm.sdk.b.a.xxA.m(localmg);
      c(21, -1, null);
    }
    l.a(parami.uII, false, null, (String)parami.puc.get("appId"));
    AppMethodBeat.o(9262);
    return true;
  }

  public final void K(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(9340);
    Object localObject = JN(paramInt);
    if (localObject == null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "onWebViewCacheCallback, get null MsgWrapperBin, may be the webview called cache api has been closed.");
      AppMethodBeat.o(9340);
    }
    while (true)
    {
      return;
      localObject = ((g.c)localObject).uGd;
      JO(paramInt);
      if (!bo.nullAsNil(paramString2).equalsIgnoreCase("ok"))
      {
        paramInt = com.tencent.mm.plugin.webview.modelcache.q.a((i)localObject);
        if (-1 != paramInt)
          com.tencent.mm.plugin.webview.modelcache.n.IO(paramInt);
      }
      if (this.umI != null)
        a(this.umI, (i)localObject, String.format("%s:%s", new Object[] { paramString1, paramString2 }), null, false, true);
      AppMethodBeat.o(9340);
    }
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.webview.stub.e parame)
  {
    AppMethodBeat.i(9218);
    if (parame == null);
    for (String str = "null"; ; str = parame.toString())
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "set context and callbacker, callbacker %s", new Object[] { str });
      this.context = paramContext;
      if (this.uGr != null)
        this.uGr.a(paramContext, parame);
      this.umI = parame;
      AppMethodBeat.o(9218);
      return;
    }
  }

  public final void a(Context paramContext, com.tencent.mm.plugin.webview.stub.e parame1, com.tencent.mm.plugin.webview.stub.e parame2)
  {
    AppMethodBeat.i(9219);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "set context, callbacker and service callbacker");
    this.context = paramContext;
    if (this.uGr != null)
      this.uGr.a(paramContext, parame1);
    this.umI = parame1;
    this.uGq = parame2;
    AppMethodBeat.o(9219);
  }

  public final void a(com.tencent.mm.plugin.webview.stub.e parame, i parami, String paramString, Map<String, Object> paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(9385);
    if (!paramBoolean2)
      this.eBB = false;
    if (parami == null)
      parami = null;
    try
    {
      while (true)
      {
        parame.a(parami, paramString, i.aP(paramMap), paramBoolean1);
        AppMethodBeat.o(9385);
        return;
        parami = parami.uIG;
      }
    }
    catch (Exception parame)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onHandleEnd, ex = " + parame.getMessage());
        AppMethodBeat.o(9385);
      }
    }
  }

  public final void a(i parami, String paramString, Map<String, Object> paramMap, boolean paramBoolean)
  {
    AppMethodBeat.i(9384);
    this.eBB = false;
    try
    {
      com.tencent.mm.plugin.webview.stub.e locale;
      if (this.umI != null)
      {
        locale = this.umI;
        if (parami != null)
          break label53;
      }
      label53: for (parami = null; ; parami = parami.uIG)
      {
        locale.a(parami, paramString, i.aP(paramMap), paramBoolean);
        AppMethodBeat.o(9384);
        return;
      }
    }
    catch (Exception parami)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onHandleEnd, ex = " + parami.getMessage());
        AppMethodBeat.o(9384);
      }
    }
  }

  public final void a(String paramString1, boolean paramBoolean, String paramString2, long paramLong)
  {
    AppMethodBeat.i(9360);
    Bundle localBundle = new Bundle();
    localBundle.putString("emoji_store_json_data", paramString1);
    localBundle.putBoolean("emoji_store_new_query", paramBoolean);
    localBundle.putString("emoji_store_page_buf", paramString2);
    localBundle.putLong("emoji_store_search_id", paramLong);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "cpan emoji getSearchEmotionDataCallBack:%d", new Object[] { Long.valueOf(paramLong) });
    try
    {
      if (this.umI != null)
        this.umI.c(80001, localBundle);
      AppMethodBeat.o(9360);
      return;
    }
    catch (RemoteException paramString1)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "getSearchEmotionDataCallBack exception" + paramString1.getMessage());
        AppMethodBeat.o(9360);
      }
    }
  }

  public final void a(String paramString1, boolean paramBoolean, String paramString2, Bundle paramBundle)
  {
    AppMethodBeat.i(9413);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", paramString1);
    localBundle.putString("fts_key_req_id", paramString2);
    localBundle.putBoolean("fts_key_new_query", paramBoolean);
    if (paramBundle != null)
      localBundle.putBundle("fts_key_data", paramBundle);
    try
    {
      if (this.umI != null)
        this.umI.c(119, localBundle);
      AppMethodBeat.o(9413);
      return;
    }
    catch (RemoteException paramString1)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + paramString1.getMessage());
        AppMethodBeat.o(9413);
      }
    }
  }

  public final boolean a(i parami, JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    boolean bool1 = false;
    AppMethodBeat.i(9226);
    if (this.eBB)
      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "handleMsg, MsgHandler is busy, old msg will be overrided");
    if (this.uGh != null)
      this.uGh.setClassLoader(getClass().getClassLoader());
    this.uGd = parami;
    this.eBB = true;
    l.a(this.umI);
    c.g localg;
    if (parami.type.equals("call"))
    {
      this.uGn = parami.uIJ;
      int i = com.tencent.mm.plugin.webview.ui.tools.b.afq(parami.uIJ);
      if (-1 != i)
        com.tencent.mm.plugin.report.service.h.pYm.a(157L, i, 1L, false);
      localg = com.tencent.mm.protocal.c.akD(bo.nullAsNil(this.uGn));
      if (localg != null);
    }
    while (true)
    {
      try
      {
        paramJsapiPermissionWrapper = this.umI.dj(this.uGn, parami.uIH.toString());
        if ((paramJsapiPermissionWrapper != null) && (paramJsapiPermissionWrapper.getBoolean("handle")))
        {
          a(parami, paramJsapiPermissionWrapper.getString("handle_result", ""), null, true);
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "proxy function = %s", new Object[] { this.uGn });
          AppMethodBeat.o(9226);
          bool1 = true;
          return bool1;
        }
      }
      catch (RemoteException paramJsapiPermissionWrapper)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", paramJsapiPermissionWrapper, "proxy handleMsg:%s", new Object[] { this.uGn });
        paramJsapiPermissionWrapper = null;
        continue;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "unknown function = %s", new Object[] { this.uGn });
        a(parami, "system:function_not_exist", null, true);
        AppMethodBeat.o(9226);
        bool1 = true;
        continue;
      }
      if (localg.getName() == "recordHistory")
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "handleMsg access denied func: %s", new Object[] { localg.getName() });
        a(parami, "system:access_denied", null, true);
        AppMethodBeat.o(9226);
        bool1 = true;
      }
      else
      {
        Object localObject = localg.getName();
        if ((!this.uGg.contains(localObject)) && (paramJsapiPermissionWrapper.Lx(localg.dmb()) == 0))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "handleMsg access denied func: %s", new Object[] { localg.getName() });
          a(parami, "system:access_denied", null, true);
          AppMethodBeat.o(9226);
          bool1 = true;
        }
        else
        {
          try
          {
            localObject = new com/tencent/mm/plugin/webview/ui/tools/jsapi/g$1;
            ((g.1)localObject).<init>(this, parami, paramJsapiPermissionWrapper, localg);
            this.uGr.a(paramJsapiPermissionWrapper, getCurrentUrl(), localg.dmb(), parami, (c.a)localObject);
            boolean bool2 = ((c.c)localObject).dcf();
            bool1 = bool2;
            AppMethodBeat.o(9226);
          }
          catch (Exception paramJsapiPermissionWrapper)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "handleMsg excpetion %s", new Object[] { paramJsapiPermissionWrapper.getMessage() });
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", paramJsapiPermissionWrapper, "", new Object[0]);
          }
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "unknown type = " + parami.type);
          this.eBB = false;
          AppMethodBeat.o(9226);
        }
      }
    }
  }

  public final void aP(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(9416);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", paramJSONObject.toString());
    try
    {
      if (this.umI != null)
        this.umI.c(137, localBundle);
      AppMethodBeat.o(9416);
      return;
    }
    catch (RemoteException paramJSONObject)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + paramJSONObject.getMessage());
        AppMethodBeat.o(9416);
      }
    }
  }

  public final boolean aU(i parami)
  {
    AppMethodBeat.i(9364);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doWCPayRealnameVerify call");
    com.tencent.mm.pluginsdk.wallet.g localg = new com.tencent.mm.pluginsdk.wallet.g(parami.puc);
    Intent localIntent = new Intent();
    parami = null;
    try
    {
      String str = this.umI.getCurrentUrl();
      parami = str;
      if (!bo.isNullOrNil(parami))
      {
        localIntent.putExtra("appId", this.uGr.agj(parami));
        localIntent.putExtra("timeStamp", localg.timeStamp);
        localIntent.putExtra("nonceStr", localg.nonceStr);
        localIntent.putExtra("packageExt", localg.packageExt);
        localIntent.putExtra("signtype", localg.signType);
        localIntent.putExtra("paySignature", localg.cId);
      }
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        localIntent.putExtra("url", this.umI.getCurrentUrl());
        localIntent.setFlags(536870912);
        localIntent.putExtra("pay_channel", localg.cvS);
        localIntent.putExtra("realname_scene", 1);
        ((MMActivity)this.context).ifE = this;
        com.tencent.mm.bp.d.b(this.context, "wallet_core", ".id_verify.WalletRealNameProcessProxyUI", localIntent, 34);
        AppMethodBeat.o(9364);
        return true;
        localRemoteException = localRemoteException;
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
      }
      catch (RemoteException parami)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", parami, "", new Object[0]);
      }
    }
  }

  public final boolean aW(i parami)
  {
    AppMethodBeat.i(9367);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doIdCardRealnameVerify call");
    com.tencent.mm.pluginsdk.wallet.g localg = new com.tencent.mm.pluginsdk.wallet.g(parami.puc);
    Intent localIntent = new Intent();
    parami = null;
    try
    {
      String str = this.umI.getCurrentUrl();
      parami = str;
      if (!bo.isNullOrNil(parami))
      {
        localIntent.putExtra("appId", this.uGr.agj(parami));
        localIntent.putExtra("timeStamp", localg.timeStamp);
        localIntent.putExtra("nonceStr", localg.nonceStr);
        localIntent.putExtra("packageExt", localg.packageExt);
        localIntent.putExtra("signtype", localg.signType);
        localIntent.putExtra("paySignature", localg.cId);
      }
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        localIntent.putExtra("url", this.umI.getCurrentUrl());
        localIntent.putExtra("pay_channel", localg.cvS);
        localIntent.putExtra("real_name_verify_mode", 2);
        localIntent.setFlags(536870912);
        localIntent.putExtra("realname_scene", 1);
        ((MMActivity)this.context).ifE = this;
        com.tencent.mm.bp.d.b(this.context, "wallet_core", ".id_verify.WalletRealNameProcessProxyUI", localIntent, 41);
        AppMethodBeat.o(9367);
        return true;
        localRemoteException = localRemoteException;
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
      }
      catch (RemoteException parami)
      {
        while (true)
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", parami, "", new Object[0]);
      }
    }
  }

  public final boolean aX(i parami)
  {
    AppMethodBeat.i(9368);
    a(parami, "uploadIdCardSuccess:ok", null);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "uploadIdCardSuccess");
    parami = new vd();
    parami.cSa.result = -1;
    com.tencent.mm.sdk.b.a.xxA.m(parami);
    AppMethodBeat.o(9368);
    return true;
  }

  public final boolean aY(i parami)
  {
    AppMethodBeat.i(9369);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getGameCommInfo call");
    int i = bo.getInt((String)parami.puc.get("cmd"), 0);
    Object localObject1 = (String)parami.puc.get("param");
    if (i == 10002)
      if (this.umI == null);
    while (true)
    {
      try
      {
        localObject1 = this.umI.g(97, null);
        if (localObject1 != null)
        {
          i = ((Bundle)localObject1).getInt("web_page_count");
          localObject1 = new java/util/HashMap;
          ((HashMap)localObject1).<init>();
          ((Map)localObject1).put("webpageCount", Integer.valueOf(i));
          a(parami, "getGameCommInfo:ok", (Map)localObject1);
        }
        AppMethodBeat.o(9369);
        return true;
      }
      catch (RemoteException localRemoteException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doGetGameCommInfo exception, " + localRemoteException.getMessage());
        a(parami, "getGameCommInfo:fail", null);
        continue;
      }
      Object localObject2 = new gu();
      ((gu)localObject2).cBw.Cn = i;
      ((gu)localObject2).cBw.cBy = localRemoteException;
      ((gu)localObject2).cBw.context = this.context;
      com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "gameCommInfo:%s", new Object[] { ((gu)localObject2).cBx.result });
      if (bo.isNullOrNil(((gu)localObject2).cBx.result))
      {
        a(parami, "getGameCommInfo:fail", null);
      }
      else
      {
        HashMap localHashMap;
        try
        {
          localHashMap = new java/util/HashMap;
          localHashMap.<init>();
          JSONObject localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>(((gu)localObject2).cBx.result);
          Iterator localIterator = localJSONObject.keys();
          while (localIterator.hasNext())
          {
            localObject2 = (String)localIterator.next();
            localHashMap.put(localObject2, localJSONObject.getString((String)localObject2));
          }
        }
        catch (JSONException localJSONException)
        {
          a(parami, "getGameCommInfo:fail", null);
        }
        continue;
        a(parami, "getGameCommInfo:ok", localHashMap);
      }
    }
  }

  public final boolean aZ(i parami)
  {
    AppMethodBeat.i(9371);
    com.tencent.mm.ui.tools.j localj = new com.tencent.mm.ui.tools.j(this.context);
    localj.b(null, new View.OnCreateContextMenuListener()
    {
      public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        AppMethodBeat.i(9211);
        paramAnonymousContextMenu.add(0, 1, 0, g.i(g.this).getString(2131302732));
        paramAnonymousContextMenu.add(0, 2, 1, g.i(g.this).getString(2131302727));
        AppMethodBeat.o(9211);
      }
    }
    , new g.135(this, parami));
    localj.e(new g.3(this, parami));
    localj.cuu();
    AppMethodBeat.o(9371);
    return true;
  }

  public final void agq(String paramString)
  {
    AppMethodBeat.i(9415);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", paramString);
    try
    {
      if (this.umI != null)
        this.umI.c(124, localBundle);
      AppMethodBeat.o(9415);
      return;
    }
    catch (RemoteException paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + paramString.getMessage());
        AppMethodBeat.o(9415);
      }
    }
  }

  public final boolean agx(String paramString)
  {
    AppMethodBeat.i(9225);
    boolean bool = this.uGg.remove(paramString);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "removeInvokedJsApiFromMenu, functionName = %s, succ = %s.", new Object[] { paramString, Boolean.valueOf(bool) });
    AppMethodBeat.o(9225);
    return bool;
  }

  public final boolean agy(String paramString)
  {
    AppMethodBeat.i(9245);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doProfile fail, username is null");
      this.eBB = false;
      AppMethodBeat.o(9245);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        Toast.makeText(ah.getContext(), this.context.getString(2131299997, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
        this.eBB = false;
        AppMethodBeat.o(9245);
        bool = false;
      }
      else
      {
        if (this.uGd != null)
          l.a(this.uGd.uII, agw("profile"), paramString, null);
        com.tencent.mm.kernel.g.RN();
        if (com.tencent.mm.kernel.a.QX())
          break;
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doProfile, hasLogin is false");
        this.eBB = false;
        AppMethodBeat.o(9245);
        bool = false;
      }
    }
    Object localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO(paramString);
    if ((localObject == null) || ((int)((com.tencent.mm.n.a)localObject).ewQ <= 0))
      localObject = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoK(paramString);
    while (true)
    {
      Intent localIntent = new Intent();
      String str1 = "";
      String str2 = str1;
      if (this.uGd != null)
      {
        str2 = str1;
        if (this.uGd.puc != null)
        {
          str2 = str1;
          if (this.uGd.puc.get("profileReportInfo") != null)
            str2 = (String)this.uGd.puc.get("profileReportInfo");
        }
      }
      if (!bo.isNullOrNil(str2))
        localIntent.putExtra("key_add_contact_report_info", str2);
      if ((this.uGh != null) && (this.uGh.getBoolean("KFromBizSearch")))
        localIntent.putExtra("Contact_Ext_Args", this.uGh.getBundle("KBizSearchExtArgs"));
      if ((localObject != null) && ((int)((com.tencent.mm.n.a)localObject).ewQ > 0))
      {
        localIntent.addFlags(268435456);
        localIntent.putExtra("Contact_User", ((com.tencent.mm.g.c.ap)localObject).field_username);
        if (((ad)localObject).dsf())
          if (this.uGh != null)
            break label531;
        label531: for (int i = 42; ; i = this.uGh.getInt("Contact_Scene", 42))
        {
          com.tencent.mm.plugin.report.service.h.pYm.X(10298, ((com.tencent.mm.g.c.ap)localObject).field_username + "," + i);
          localIntent.putExtra("Contact_Scene", i);
          if (com.tencent.mm.n.a.jh(((com.tencent.mm.g.c.ap)localObject).field_type))
          {
            paramString = new qh();
            paramString.cMw.intent = localIntent;
            paramString.cMw.username = ((com.tencent.mm.g.c.ap)localObject).field_username;
            com.tencent.mm.sdk.b.a.xxA.m(paramString);
          }
          aD(localIntent);
          a(this.uGd, "profile:ok", null);
          AppMethodBeat.o(9245);
          bool = false;
          break;
        }
      }
      if (this.uGl != null)
        ao.a.flu.or(this.uGl);
      this.uGl = paramString;
      ao.a.flu.a(paramString, "", new g.92(this, localIntent));
      localObject = this.context;
      this.context.getString(2131297061);
      this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject, this.context.getString(2131297086), true, new g.103(this, paramString));
      AppMethodBeat.o(9245);
      bool = true;
      break;
    }
  }

  public final boolean au(i parami)
  {
    AppMethodBeat.i(9331);
    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "doSelectPedometerSource");
    if ((this.context != null) && ((this.context instanceof MMActivity)))
    {
      ((MMActivity)this.context).ifE = this;
      parami = new Intent();
      com.tencent.mm.bp.d.b(this.context, "exdevice", ".ui.ExdeviceAddDataSourceUI", parami, 26);
    }
    while (true)
    {
      AppMethodBeat.o(9331);
      return true;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "context is null");
      a(parami, "selectPedometerSource:fail", null);
    }
  }

  public final boolean b(i parami, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(9267);
    Iterator localIterator;
    boolean bool;
    if (Build.VERSION.SDK_INT >= 18)
    {
      com.tencent.mm.sdk.b.a.xxA.d(this.qwg);
      localIterator = this.uGA.keySet().iterator();
      if (!com.tencent.mm.kernel.g.RK())
        break label307;
      bool = bo.a((Boolean)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xMr, null), false);
    }
    while (true)
    {
      Object localObject;
      if (localIterator.hasNext())
      {
        localObject = (String)localIterator.next();
        ds localds = new ds();
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "[MsgHandler][doStopIBeaconRange]op=false,iBeacon = %s", new Object[] { localObject });
        localds.cxg.cxi = ((String)localObject);
        localds.cxg.cxf = false;
        if (!bool)
          com.tencent.mm.sdk.b.a.xxA.m(localds);
      }
      else
      {
        if (com.tencent.mm.kernel.g.RK())
          com.tencent.mm.kernel.g.RP().Ry().set(ac.a.xMm, Boolean.FALSE);
        localObject = ah.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).edit();
        ((SharedPreferences.Editor)localObject).putBoolean("isNewScanning", false);
        ((SharedPreferences.Editor)localObject).commit();
        this.uGA.clear();
        this.ecv.clear();
        this.uGB.clear();
        this.uGC.clear();
        this.uGI = false;
        if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
        {
          a(parami, "stopMonitoringBeacons:ok", null);
          this.uGI = false;
        }
        if (this.uGJ != null)
          ((SensorManager)ah.getContext().getSystemService("sensor")).unregisterListener(this.uGJ);
        AppMethodBeat.o(9267);
        return true;
        label307: bool = false;
      }
    }
  }

  public final int bFf()
  {
    int i = 0;
    AppMethodBeat.i(9295);
    int j = i;
    try
    {
      if (this.umI != null)
      {
        Bundle localBundle = this.umI.g(25, null);
        j = i;
        if (localBundle != null)
          j = localBundle.getInt("scene");
      }
      AppMethodBeat.o(9295);
      return j;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "invokeAsResult error.%s", new Object[] { localRemoteException });
        j = i;
      }
    }
  }

  public final void bH(int paramInt, String paramString)
  {
    AppMethodBeat.i(9418);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "onSearchImageListReady ret %d data %s", new Object[] { Integer.valueOf(paramInt), paramString });
    Bundle localBundle = new Bundle();
    localBundle.putInt("fts_key_ret", paramInt);
    localBundle.putString("fts_key_data", paramString);
    try
    {
      if (this.umI != null)
        this.umI.c(120, localBundle);
      AppMethodBeat.o(9418);
      return;
    }
    catch (RemoteException paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onSearchImageListReady exception" + paramString.getMessage());
        AppMethodBeat.o(9418);
      }
    }
  }

  public final boolean bH(i parami)
  {
    AppMethodBeat.i(9430);
    try
    {
      this.umI.g(34, Bundle.EMPTY);
      a(parami, "enablePullDownRefresh:ok", null);
      AppMethodBeat.o(9430);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doEnablePullDownRefresh, exception = %s", new Object[] { localException });
        a(parami, "enablePullDownRefresh:fail", null);
      }
    }
  }

  public final boolean bI(i parami)
  {
    AppMethodBeat.i(9431);
    try
    {
      this.umI.g(35, Bundle.EMPTY);
      a(parami, "startPullDownRefresh:ok", null);
      AppMethodBeat.o(9431);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doStartPullDownRefresh, exception = %s", new Object[] { localException });
        a(parami, "startPullDownRefresh:fail", null);
      }
    }
  }

  public final boolean bJ(i parami)
  {
    AppMethodBeat.i(9432);
    try
    {
      this.umI.g(36, Bundle.EMPTY);
      a(parami, "stopPullDownRefresh:ok", null);
      AppMethodBeat.o(9432);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doStopPullDownRefresh, exception = %s", new Object[] { localException });
        a(parami, "stopPullDownRefresh:fail", null);
      }
    }
  }

  public final String bK(String paramString)
  {
    AppMethodBeat.i(9221);
    if (this.uGr == null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getCachedAppId, jsVerifyHelper is null, return null");
      paramString = null;
      AppMethodBeat.o(9221);
    }
    while (true)
    {
      return paramString;
      paramString = this.uGr.agj(paramString);
      AppMethodBeat.o(9221);
    }
  }

  public final boolean bK(i parami)
  {
    AppMethodBeat.i(9434);
    this.eBB = false;
    String str = bo.nullAsNil((String)parami.puc.get("placeholder"));
    int i = bo.getInt((String)parami.puc.get("maxLength"), 0);
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>(2);
      localBundle.putString("show_kb_placeholder", str);
      localBundle.putInt("show_kb_max_length", i);
      this.umI.g(37, localBundle);
      this.uGZ = parami;
      AppMethodBeat.o(9434);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doShowKeyBoard, exception = %s", new Object[] { localException });
        a(this.umI, parami, "showKeyboard:fail", null, true, true);
      }
    }
  }

  public final boolean bL(i parami)
  {
    AppMethodBeat.i(9435);
    this.eBB = false;
    try
    {
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>();
      localBundle = this.umI.g(79, localBundle);
      HashMap localHashMap = new java/util/HashMap;
      localHashMap.<init>();
      int i = localBundle.getInt("height", 0);
      if (i > 0)
      {
        localHashMap.put("height", Integer.valueOf(com.tencent.mm.bz.a.ao(ah.getContext(), i)));
        a(this.umI, parami, "showSmileyPanel:ok", localHashMap, true, true);
      }
      while (true)
      {
        AppMethodBeat.o(9435);
        return true;
        a(this.umI, parami, "showSmileyPanel:fail", null, true, true);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doShowSmileyPanel, exception = %s", new Object[] { localException });
        a(this.umI, parami, "showSmileyPanel:fail", null, true, true);
      }
    }
  }

  public final boolean bM(i parami)
  {
    AppMethodBeat.i(9436);
    Object localObject = (String)parami.puc.get("place");
    if (bo.isNullOrNil((String)localObject))
    {
      a(parami, "disableBounceScroll:fail", null);
      AppMethodBeat.o(9436);
    }
    while (true)
    {
      return true;
      int j;
      try
      {
        JSONArray localJSONArray = new org/json/JSONArray;
        localJSONArray.<init>((String)localObject);
        int i = 0;
        j = 0;
        while (i < localJSONArray.length())
        {
          boolean bool = "top".equalsIgnoreCase(localJSONArray.getString(i));
          if (bool)
            j = 1;
          i++;
        }
      }
      catch (JSONException localJSONException)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doDisableBounceScroll, invalid json array, string = %s", new Object[] { localObject });
        a(parami, "disableBounceScroll:fail", null);
        AppMethodBeat.o(9436);
      }
      continue;
      if (j == 0)
      {
        a(parami, "disableBounceScroll:ok", null);
        AppMethodBeat.o(9436);
        continue;
      }
      try
      {
        localObject = new android/os/Bundle;
        ((Bundle)localObject).<init>(1);
        ((Bundle)localObject).putInt("webview_disable_bounce_scroll_top", 1);
        this.umI.g(38, (Bundle)localObject);
        a(parami, "disableBounceScroll:ok", null);
        AppMethodBeat.o(9436);
      }
      catch (Exception localException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doDisableBounceScroll, exception = %s", new Object[] { localException });
          a(parami, "disableBounceScroll:fail", null);
        }
      }
    }
  }

  public final boolean bN(i parami)
  {
    AppMethodBeat.i(9437);
    try
    {
      com.tencent.mm.plugin.webview.stub.e locale = this.umI;
      Bundle localBundle = new android/os/Bundle;
      localBundle.<init>(0);
      locale.g(39, localBundle);
      a(parami, "clearBounceBackground:ok", null);
      AppMethodBeat.o(9437);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doClearBounceBackground, exception = %s", new Object[] { localException });
        a(parami, "clearBounceBackground:fail", null);
      }
    }
  }

  public final boolean bO(i parami)
  {
    AppMethodBeat.i(9438);
    Bundle localBundle = new Bundle();
    localBundle.putString("key_set_bounce_background_color", (String)parami.puc.get("backgroundColor"));
    try
    {
      this.umI.g(72, localBundle);
      a(parami, "setBounceBackground:ok", null);
      AppMethodBeat.o(9438);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "setBounceBackground, exception = %s", new Object[] { localException });
        a(parami, "setBounceBackground:fail", null);
      }
    }
  }

  public final boolean bP(i parami)
  {
    AppMethodBeat.i(9439);
    int i = bo.getInt(bo.cD(parami.puc.get("id")), 0);
    if (i <= 0)
    {
      a(parami, "realtimeReport:fail", null);
      AppMethodBeat.o(9439);
      return true;
    }
    String str = bo.cD(parami.puc.get("value"));
    int j = bo.getInt(bo.cD(parami.puc.get("type")), 0);
    com.tencent.mm.plugin.webview.model.f localf = f.a.cXv();
    if (!com.tencent.mm.kernel.g.RK())
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.WebView.JsLogHelper", "kvStat(), acc not ready, skip");
      label104: j = 0;
      label107: if (j == 0)
        break label417;
      a(parami, "realtimeReport:ok", null);
    }
    while (true)
    {
      AppMethodBeat.o(9439);
      break;
      Object localObject1 = com.tencent.mm.plugin.webview.modeltools.g.cYH();
      Object localObject2 = (Long)((com.tencent.mm.plugin.webview.model.e)localObject1).ulM.get(Integer.valueOf(i));
      long l1;
      if (localObject2 != null)
        l1 = ((Long)localObject2).longValue();
      while (true)
      {
        l2 = l1;
        if (l1 == 0L)
          break label351;
        l2 = l1;
        if (l1 >= bo.anT())
          break label351;
        localObject2 = ((com.tencent.mm.plugin.webview.model.e)localObject1).ulM;
        localObject1 = Integer.valueOf(i);
        if (localObject1 != null)
          break;
        parami = new NullPointerException("key == null");
        AppMethodBeat.o(9439);
        throw parami;
        localObject2 = ((com.tencent.mm.plugin.webview.model.e)localObject1).fni.a(String.format("select %s from %s where %s=?", new Object[] { "liftTime", "JsLogBlockList", "logId" }), new String[] { String.valueOf(i) }, 2);
        if (localObject2 == null)
        {
          l1 = 0L;
        }
        else if (((Cursor)localObject2).moveToFirst())
        {
          l1 = ((Cursor)localObject2).getLong(0);
          ((Cursor)localObject2).close();
        }
        else
        {
          ((Cursor)localObject2).close();
          l1 = 0L;
        }
      }
      if (((bb)localObject2).get(localObject1) != null)
        ((bb)localObject2).A(localObject1, null);
      long l2 = 0L;
      label351: if ((l2 != 0L) && (l2 >= bo.anT()))
        break label104;
      localObject1 = new axc();
      ((axc)localObject1).wBd = i;
      ((axc)localObject1).wBe = com.tencent.mm.bt.b.akB(str);
      ((axc)localObject1).wBm = j;
      localf.ulR.add(localObject1);
      j = 1;
      break label107;
      label417: a(parami, "realtimeReport:fail", null);
    }
  }

  public final boolean bQ(i parami)
  {
    AppMethodBeat.i(9440);
    String str1 = (String)parami.puc.get("latitude");
    String str2 = (String)parami.puc.get("longitude");
    String str3 = (String)parami.puc.get("destinationName");
    if ((bo.isNullOrNil(str1)) || (bo.isNullOrNil(str2)))
    {
      a(parami, "openMapNavigateMenu:fail", null);
      AppMethodBeat.o(9440);
      return true;
    }
    while (true)
    {
      try
      {
        double d1 = Double.parseDouble(str1);
        double d2 = Double.parseDouble(str2);
        int i = bo.getInt((String)parami.puc.get("preferMap"), com.tencent.mm.pluginsdk.model.a.a.vaU.code);
        if ((this.context == null) || (!(this.context instanceof Activity)) || (((Activity)this.context).isFinishing()))
          break label216;
        com.tencent.mm.sdk.platformtools.al.d(new g.30(this, i, d1, d2, str3, bc(parami)));
        AppMethodBeat.o(9440);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "doOpenMapNavigateMenu, parse double, exception = %s");
        a(parami, "openMapNavigateMenu:fail", null);
        AppMethodBeat.o(9440);
      }
      break;
      label216: a(parami, "openMapNavigateMenu:fail", null);
    }
  }

  public final boolean bz(i parami)
  {
    boolean bool1 = false;
    AppMethodBeat.i(9421);
    int i = bo.getInt(bo.cD(parami.puc.get("id")), 0);
    if (i <= 0)
    {
      a(parami, "kvReport:fail", null);
      AppMethodBeat.o(9421);
      return true;
    }
    String str = bo.cD(parami.puc.get("value"));
    if (bo.getInt(bo.cD(parami.puc.get("is_important")), 0) > 0);
    for (boolean bool2 = true; ; bool2 = false)
    {
      if (bo.getInt(bo.cD(parami.puc.get("is_report_now")), 0) > 0)
        bool1 = true;
      com.tencent.mm.plugin.report.service.h.pYm.a(i, str, bool1, bool2);
      a(parami, "kvReport:ok", null);
      AppMethodBeat.o(9421);
      break;
    }
  }

  public final void c(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    AppMethodBeat.i(9379);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "mmOnActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2);
    Object localObject1;
    Object localObject3;
    if (paramInt1 == 1)
    {
      if (this.cEl == null)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, appmsg is null");
        gB(1, 2);
        a(this.uGd, "send_app_msg:fail", null);
        AppMethodBeat.o(9379);
        return;
      }
      localObject1 = (String)this.uGd.puc.get("appid");
      localObject2 = null;
      if (this.uGh == null)
        break label13891;
      localObject3 = (SnsAdClick)this.uGh.getParcelable("KSnsAdTag");
      localObject2 = localObject3;
      if (!TextUtils.isEmpty((CharSequence)localObject1))
        break label13891;
    }
    label410: label1962: label9258: label13874: for (Object localObject2 = this.uGh.getString("jsapi_args_appid"); ; localObject2 = localObject1)
    {
      Object localObject5;
      Object localObject7;
      Object localObject8;
      Object localObject9;
      int i;
      int j;
      while (true)
      {
        while (true)
        {
          while (true)
          {
            localObject5 = this.uGd.dcO().get("Internal@AsyncReport");
            this.uGd.puc.get("link");
            switch (paramInt2)
            {
            default:
            case 0:
            case -1:
            }
            while (true)
            {
              AppMethodBeat.o(9379);
              break;
              if (localObject3 != null)
              {
                ((SnsAdClick)localObject3).fPZ = 8;
                a((SnsAdClick)localObject3);
              }
              l.a(this.uGd.dcO(), agw("sendAppMessage"), null, (String)localObject2);
              if ((localObject5 != null) && ((localObject5 instanceof Boolean)) && (((Boolean)localObject5).booleanValue()))
                b(this.uGd, true);
              gB(1, 3);
              a(this.uGd, "send_app_msg:ok", null);
              AppMethodBeat.o(9379);
              break;
              if (localObject3 != null)
              {
                ((SnsAdClick)localObject3).fPZ = 7;
                a((SnsAdClick)localObject3);
              }
              ??? = com.tencent.mm.pluginsdk.model.app.g.Uq((String)localObject2);
              if (paramIntent == null);
              for (localObject3 = null; ; localObject3 = paramIntent.getStringExtra("Select_Conv_User"))
              {
                if ((localObject3 != null) && (((String)localObject3).length() != 0))
                  break label410;
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, toUser is null");
                gB(1, 2);
                a(this.uGd, "send_app_msg:fail", null);
                AppMethodBeat.o(9379);
                break;
              }
              localObject7 = (String)this.uGd.puc.get("img_url");
              this.uGd.puc.get("desc");
              localObject8 = (String)this.uGd.puc.get("src_username");
              localObject1 = (String)this.uGd.puc.get("src_displayname");
              localObject9 = dcx();
              l.a(this.uGd.dcO(), agw("sendAppMessage"), (String)localObject3, (String)localObject2);
              if ((localObject5 != null) && ((localObject5 instanceof Boolean)) && (((Boolean)localObject5).booleanValue()))
                b(this.uGd, true);
              localObject5 = ((String)localObject3).split(",");
              paramInt1 = 0;
              i = 0;
              j = localObject5.length;
              paramInt2 = 0;
              if (paramInt2 < j)
              {
                if (localObject5[paramInt2].endsWith("@chatroom"))
                  paramInt1++;
                while (true)
                {
                  paramInt2++;
                  break;
                  i++;
                }
              }
              localObject5 = new HashMap();
              if ((this.uGd.puc.get("share_callback_with_scene") != null) && (((Boolean)this.uGd.puc.get("share_callback_with_scene")).booleanValue()))
              {
                ((Map)localObject5).put("groupCount", Integer.valueOf(paramInt1));
                ((Map)localObject5).put("singleCount", Integer.valueOf(i));
              }
              if (bo.isNullOrNil((String)localObject9))
              {
                if (paramIntent == null);
                for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("custom_send_text"))
                {
                  a(null, "", (String)localObject3, (String)localObject7, (String)localObject8, (String)localObject1, paramIntent, (String)localObject9);
                  if (this.context != null)
                    com.tencent.mm.ui.base.h.bN(this.context, this.context.getResources().getString(2131297050));
                  gB(1, 1);
                  a(this.uGd, "send_app_msg:ok", (Map)localObject5);
                  AppMethodBeat.o(9379);
                  break;
                }
              }
              if (bo.isNullOrNil((String)localObject7))
              {
                a(null, "", (String)localObject3, (String)localObject7, (String)localObject8, (String)localObject1, null, (String)localObject9);
                com.tencent.mm.ui.base.h.bN(this.context, this.context.getString(2131297039));
                a(this.uGd, "send_app_msg:ok", (Map)localObject5);
                AppMethodBeat.o(9379);
                break;
              }
              paramIntent = com.tencent.mm.ui.base.h.b(this.context, this.context.getResources().getString(2131297043), true, new g.15(this, (String)localObject7));
              com.tencent.mm.at.o.ahk().a((String)localObject7, new g.16(this, paramIntent, (com.tencent.mm.pluginsdk.model.app.f)???, (String)localObject2, (String)localObject3, (String)localObject7, (String)localObject8, (String)localObject1, (String)localObject9, (Map)localObject5));
            }
            if (paramInt1 == 2)
              switch (paramInt2)
              {
              default:
                a(this.uGd, "share_weibo:fail_" + paramIntent.getIntExtra("err_code", 0), null);
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "unknown resultCode");
                AppMethodBeat.o(9379);
                break;
              case -1:
                com.tencent.mm.ui.base.h.bN(this.context, this.context.getResources().getString(2131297050));
                a(this.uGd, "share_weibo:ok", null);
                AppMethodBeat.o(9379);
                break;
              case 0:
                a(this.uGd, "share_weibo:cancel", null);
                AppMethodBeat.o(9379);
                break;
              case 1:
                a(this.uGd, "share_weibo:fail_" + paramIntent.getIntExtra("err_code", 0), null);
                AppMethodBeat.o(9379);
                break;
              }
            if (paramInt1 == 3)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "get callback address, result code = %d", new Object[] { Integer.valueOf(paramInt2) });
              if ((paramInt2 == -1) && (paramIntent != null))
              {
                localObject7 = bo.bc(paramIntent.getStringExtra("nationalCode"), "");
                localObject2 = bo.bc(paramIntent.getStringExtra("userName"), "");
                localObject3 = bo.bc(paramIntent.getStringExtra("telNumber"), "");
                ??? = bo.bc(paramIntent.getStringExtra("addressPostalCode"), "");
                localObject1 = bo.bc(paramIntent.getStringExtra("proviceFirstStageName"), "");
                localObject9 = bo.bc(paramIntent.getStringExtra("addressCitySecondStageName"), "");
                localObject8 = bo.bc(paramIntent.getStringExtra("addressCountiesThirdStageName"), "");
                localObject5 = bo.bc(paramIntent.getStringExtra("addressDetailInfo"), "");
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "first =  " + (String)localObject1 + " ; detail =" + (String)localObject5 + "; second = " + (String)localObject9 + " ; tel = " + (String)localObject3 + "; third = " + (String)localObject8);
                if (!bo.isNullOrNil((String)localObject2))
                {
                  paramIntent = new HashMap();
                  paramIntent.put("nationalCode", localObject7);
                  paramIntent.put("userName", localObject2);
                  paramIntent.put("telNumber", localObject3);
                  paramIntent.put("addressPostalCode", ???);
                  paramIntent.put("proviceFirstStageName", localObject1);
                  paramIntent.put("addressCitySecondStageName", localObject9);
                  paramIntent.put("addressCountiesThirdStageName", localObject8);
                  paramIntent.put("addressDetailInfo", localObject5);
                  a(this.uGd, "edit_address:ok", paramIntent);
                  AppMethodBeat.o(9379);
                  break;
                }
              }
              if (paramInt2 == 0)
              {
                a(this.uGd, "edit_address:cancel", null);
                AppMethodBeat.o(9379);
                break;
              }
              a(this.uGd, "edit_address:fail", null);
              AppMethodBeat.o(9379);
              break;
            }
            if (paramInt1 != 4)
              break label1984;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request pay, resultCode = ".concat(String.valueOf(paramInt2)));
            if ((this.uGz != -1) && (JN(this.uGz) != null))
            {
              com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "hy: has blocked ");
              this.uGd = JN(this.uGz).uGd;
              this.umI = JN(this.uGz).umI;
            }
            this.uGz = -1;
            if (paramInt2 == -1)
            {
              localObject2 = new HashMap();
              if (paramIntent != null)
              {
                paramInt1 = paramIntent.getIntExtra("key_jsapi_close_page_after_pay", 0);
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "closePage: %s", new Object[] { Integer.valueOf(paramInt1) });
                if (paramInt1 != 1);
              }
              try
              {
                if ((this.context != null) && ((this.context instanceof Activity)))
                  ((Activity)this.context).finish();
                if (this.umI != null)
                {
                  this.umI.cZb();
                  this.umI.W(null);
                }
                paramInt1 = paramIntent.getIntExtra("key_is_clear_failure", -1);
                if (paramInt1 == 0)
                {
                  ((Map)localObject2).put("pay_status", "pending");
                  a(this.uGd, "get_brand_wcpay_request:ok", (Map)localObject2);
                  AppMethodBeat.o(9379);
                }
              }
              catch (Exception localException)
              {
                while (true)
                {
                  com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
                  continue;
                  if (paramInt1 == 1)
                    ((Map)localObject2).put("pay_status", "fail");
                }
              }
            }
          }
          if (paramInt2 == 5)
          {
            localObject2 = new HashMap();
            if (paramIntent != null)
            {
              paramInt1 = paramIntent.getIntExtra("key_jsapi_pay_err_code", 0);
              paramIntent = bo.nullAsNil(paramIntent.getStringExtra("key_jsapi_pay_err_msg"));
              ((Map)localObject2).put("err_code", Integer.valueOf(paramInt1));
              ((Map)localObject2).put("err_desc", paramIntent);
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "hy: pay jsapi failed. errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), paramIntent });
            }
            a(this.uGd, "get_brand_wcpay_request:fail", (Map)localObject2);
            AppMethodBeat.o(9379);
            break;
          }
          localObject2 = new HashMap();
          if (paramIntent != null)
          {
            paramInt1 = paramIntent.getIntExtra("key_is_clear_failure", -1);
            if (paramInt1 != 0)
              break label1962;
            ((Map)localObject2).put("pay_status", "pending");
          }
          while (true)
          {
            a(this.uGd, "get_brand_wcpay_request:cancel", (Map)localObject2);
            AppMethodBeat.o(9379);
            break;
            if (paramInt1 == 1)
              ((Map)localObject2).put("pay_status", "fail");
          }
          label1984: if (paramInt1 != 27)
            break label2183;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request ibg prepay request, resultCode = ".concat(String.valueOf(paramInt2)));
          if (this.uGz != -1)
          {
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "hy: has blocked ");
            this.uGd = JN(this.uGz).uGd;
            this.umI = JN(this.uGz).umI;
            this.uGz = -1;
          }
          if (paramInt2 == -1)
          {
            if ((paramIntent != null) && (paramIntent.hasExtra("url")))
            {
              localObject2 = null;
              if (paramIntent.hasExtra("view_port_code"))
                localObject2 = paramIntent.getStringExtra("view_port_code");
            }
            try
            {
              this.umI.he(paramIntent.getStringExtra("url"), (String)localObject2);
              a(this.uGd, "get_h5_prepay_request:ok", null);
              AppMethodBeat.o(9379);
            }
            catch (RemoteException paramIntent)
            {
              while (true)
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "loadUrl ex: %s", new Object[] { paramIntent.getMessage() });
            }
          }
        }
        a(this.uGd, "get_h5_prepay_request:cancel", null);
        AppMethodBeat.o(9379);
        break;
        if (paramInt1 == 5)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request jump to mall, resultCode = ".concat(String.valueOf(paramInt2)));
          if (paramInt2 == -1)
          {
            a(this.uGd, "jump_wcmall:ok", null);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "jump_wcmall:fail", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 6)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request jump to product view, resultCode = ".concat(String.valueOf(paramInt2)));
          if (paramInt2 == -1)
          {
            a(this.uGd, "open_product_view:ok", null);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "open_product_view:fail", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 7)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request bind card, resultCode = ".concat(String.valueOf(paramInt2)));
          if (paramInt2 == -1)
          {
            a(this.uGd, "get_brand_wcpay_bind_card_request:ok", null);
            com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_brand_wcpay_bind_card_request:ok" });
          }
          while (true)
          {
            if (com.tencent.mm.pluginsdk.wallet.f.dlH())
              break label13856;
            com.tencent.mm.pluginsdk.wallet.f.dlJ();
            AppMethodBeat.o(9379);
            break;
            a(this.uGd, "get_brand_wcpay_bind_card_request:fail", null);
            if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
              com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_brand_wcpay_bind_card_request:fail" });
          }
        }
        if (paramInt1 == 9)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request open wxcredit, resultCode = ".concat(String.valueOf(paramInt2)));
          if (paramInt2 == -1)
          {
            a(this.uGd, "get_wcpay_create_credit_card_request:ok", null);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "get_wcpay_create_credit_card_request:fail", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 8)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request jumpToBizProfile, resultCode = ".concat(String.valueOf(paramInt2)));
          switch (paramInt2)
          {
          case 1:
          default:
            a(this.uGd, "jump_to_biz_profile:fail", null);
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "unknown resultCode");
            AppMethodBeat.o(9379);
            break;
          case -1:
            a(this.uGd, "jump_to_biz_profile:ok", null);
            AppMethodBeat.o(9379);
            break;
          case 0:
            a(this.uGd, "jump_to_biz_profile:cancel", null);
            AppMethodBeat.o(9379);
            break;
          case 2:
          case 3:
            a(this.uGd, "jump_to_biz_profile:check_fail", null);
            AppMethodBeat.o(9379);
            break;
          }
        }
        if (paramInt1 == 10)
        {
          if (paramInt2 != 0)
            break label13856;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "open scan product ui back");
          a(this.uGd, "open_scan_product_view:ok", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 11)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request transfer_money, resultCode = ".concat(String.valueOf(paramInt2)));
          if (paramInt2 == -1)
          {
            a(this.uGd, "get_transfer_money_request:ok", null);
            com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_transfer_money_request:ok" });
          }
          while (true)
          {
            if (com.tencent.mm.pluginsdk.wallet.f.dlH())
              break label13856;
            com.tencent.mm.pluginsdk.wallet.f.dlJ();
            AppMethodBeat.o(9379);
            break;
            a(this.uGd, "get_transfer_money_request:fail", null);
            if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
              com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_transfer_money_request:fail" });
          }
        }
        if (paramInt1 == 17)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request open_wcpay_specific_view, resultCode = ".concat(String.valueOf(paramInt2)));
          if ((paramIntent != null) && ("1".equals(paramIntent.getStringExtra("closeWebView"))))
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "close web view");
          try
          {
            this.umI.cZb();
            this.umI.W(null);
            if (paramInt2 == -1)
            {
              a(this.uGd, "open_wcpay_specific_view:ok", null);
              com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "open_wcpay_specific_view:ok" });
              if (com.tencent.mm.pluginsdk.wallet.f.dlH())
                break label13856;
              com.tencent.mm.pluginsdk.wallet.f.dlJ();
              AppMethodBeat.o(9379);
            }
          }
          catch (RemoteException paramIntent)
          {
            while (true)
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "REQUEST_OPEN_WCPAY_SPECIFIC_VIEW ex: %s", new Object[] { paramIntent.getMessage() });
              continue;
              a(this.uGd, "open_wcpay_specific_view:fail", null);
              if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
                com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "open_wcpay_specific_view:fail" });
            }
          }
        }
      }
      if (paramInt1 == 18)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request request_wcpay_send_c2c_msg, resultCode = ".concat(String.valueOf(paramInt2)));
        if (paramInt2 == -1)
        {
          a(this.uGd, "get_send_c2c_message_request:ok", null);
          com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_send_c2c_message_request:ok" });
        }
        while (true)
        {
          if (com.tencent.mm.pluginsdk.wallet.f.dlH())
            break label13856;
          com.tencent.mm.pluginsdk.wallet.f.dlJ();
          AppMethodBeat.o(9379);
          break;
          if (paramInt2 == 0)
          {
            a(this.uGd, "get_send_c2c_message_request:cancel", null);
            com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_send_c2c_message_request:cancel" });
          }
          else
          {
            a(this.uGd, "get_send_c2c_message_request:fail", null);
            if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
              com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_send_c2c_message_request:fail" });
          }
        }
      }
      if (paramInt1 == 13)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "request choose card, resultCode = ".concat(String.valueOf(paramInt2)));
        localObject2 = new HashMap();
        if (paramInt2 == -1)
        {
          if (paramIntent != null)
            ((Map)localObject2).put("choose_card_info", bo.bc(paramIntent.getStringExtra("choose_card_info"), ""));
          a(this.uGd, "choose_card:ok", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt2 == 0)
        {
          a(this.uGd, "choose_card:cancel", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
        }
        a(this.uGd, "choose_card:fail", (Map)localObject2);
        AppMethodBeat.o(9379);
        break;
      }
      if (paramInt1 == 36)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "request choose invoice, resultCode = ".concat(String.valueOf(paramInt2)));
        localObject2 = new HashMap();
        if (paramInt2 == -1)
        {
          if (paramIntent != null)
            ((Map)localObject2).put("choose_invoice_info", bo.bc(paramIntent.getStringExtra("choose_invoice_info"), ""));
          a(this.uGd, "choose_invoice:ok", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt2 == 0)
        {
          a(this.uGd, "choose_invoice:cancel", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
        }
        a(this.uGd, "choose_invoice:fail", (Map)localObject2);
        AppMethodBeat.o(9379);
        break;
      }
      if (paramInt1 == 16)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "request batch add card, resultCode = ".concat(String.valueOf(paramInt2)));
        localObject2 = new HashMap();
        if (paramIntent != null)
          ((Map)localObject2).put("card_list", bo.bc(paramIntent.getStringExtra("card_list"), ""));
        if (paramInt2 == -1)
        {
          a(this.uGd, "batch_add_card:ok", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
        }
        paramInt1 = 2;
        if (paramIntent != null)
          paramInt1 = paramIntent.getIntExtra("result_code", 2);
        if (paramInt1 == 2)
        {
          a(this.uGd, "batch_add_card:fail", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
        }
        a(this.uGd, "batch_add_card:cancel", (Map)localObject2);
        AppMethodBeat.o(9379);
        break;
      }
      if (paramInt1 == 23)
      {
        if (paramInt2 == -1)
        {
          a(this.uGd, "batch_view_card:ok", null);
          AppMethodBeat.o(9379);
          break;
        }
        a(this.uGd, "batch_view_card:fail", null);
        AppMethodBeat.o(9379);
        break;
      }
      if (paramInt1 == 15)
      {
        if ((this.uGd == null) || (bo.isNullOrNil(this.uGd.uIJ)))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "msg is null");
          AppMethodBeat.o(9379);
          break;
        }
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request to scan qr code, result code = %d, function is %s", new Object[] { Integer.valueOf(paramInt2), this.uGd.uIJ });
        if (!this.uGd.uIJ.equals("scanQRCode"))
          break label13856;
        switch (paramInt2)
        {
        default:
          a(this.uGd, "scanQRCode:fail", null);
          AppMethodBeat.o(9379);
          break;
        case -1:
          localObject2 = new HashMap();
          if (paramIntent != null)
            ((HashMap)localObject2).put("resultStr", paramIntent.getStringExtra("key_scan_result"));
          a(this.uGd, "scanQRCode:ok", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
        case 0:
          a(this.uGd, "scanQRCode:cancel", null);
          AppMethodBeat.o(9379);
          break;
        }
      }
      boolean bool;
      if (paramInt1 == 14)
      {
        if (paramIntent == null)
        {
          bool = false;
          label3898: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request to open file chooser, result code = %d, hasShowMemoryWarning = %b", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
          localObject2 = new HashMap();
          if (bool)
            ((HashMap)localObject2).put("memoryWarning", Boolean.TRUE);
        }
        switch (paramInt2)
        {
        default:
        case -1:
          do
          {
            a(this.uGd, "chooseImage:fail", (Map)localObject2);
            AppMethodBeat.o(9379);
            break;
            bool = paramIntent.getBooleanExtra("key_pick_local_media_show_memory_warning", false);
            break label3898;
            localObject4 = paramIntent.getStringExtra("key_pick_local_pic_callback_local_ids");
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "localIds = %s", new Object[] { localObject4 });
          }
          while (bo.isNullOrNil((String)localObject4));
          ((HashMap)localObject2).put("localIds", localObject4);
          paramIntent = paramIntent.getStringExtra("key_pick_local_pic_source_type");
          if (paramIntent != null)
            ((HashMap)localObject2).put("sourceType", paramIntent);
          a(this.uGd, "chooseImage:ok", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
        case 0:
          a(this.uGd, "chooseImage:cancel", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
        }
      }
      if (paramInt1 == 32)
        switch (paramInt2)
        {
        default:
          a(this.uGd, "chooseVideo:fail", null);
          AppMethodBeat.o(9379);
          break;
        case 0:
          a(this.uGd, "chooseVideo:cancel", null);
          AppMethodBeat.o(9379);
          break;
        case -1:
          paramIntent = paramIntent.getStringExtra("key_pick_local_media_local_id");
          if (!bo.isNullOrNil(paramIntent))
          {
            localObject2 = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex(paramIntent);
            if ((localObject2 != null) && ((localObject2 instanceof WebViewJSSDKVideoItem)))
            {
              localObject4 = (WebViewJSSDKVideoItem)localObject2;
              localObject2 = new HashMap();
              ((HashMap)localObject2).put("localId", paramIntent);
              ((HashMap)localObject2).put("duration", Integer.valueOf(((WebViewJSSDKVideoItem)localObject4).duration));
              ((HashMap)localObject2).put("height", Integer.valueOf(((WebViewJSSDKVideoItem)localObject4).height));
              ((HashMap)localObject2).put("size", Integer.valueOf(((WebViewJSSDKVideoItem)localObject4).size));
              ((HashMap)localObject2).put("width", Integer.valueOf(((WebViewJSSDKVideoItem)localObject4).width));
              a(this.uGd, "chooseVideo:ok", (Map)localObject2);
              AppMethodBeat.o(9379);
              break;
            }
          }
          a(this.uGd, "chooseVideo:fail", null);
          AppMethodBeat.o(9379);
          break;
        }
      if (paramInt1 == 45)
        switch (paramInt2)
        {
        default:
          a(this.uGd, "recordVideo:fail", null);
          AppMethodBeat.o(9379);
          break;
        case 0:
          a(this.uGd, "recordVideo:cancel", null);
          AppMethodBeat.o(9379);
          break;
        case -1:
          localObject2 = paramIntent.getStringExtra("key_pick_local_media_local_id");
          paramIntent = paramIntent.getStringExtra("key_pick_local_media_thumb_local_id");
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "localId:%s", new Object[] { localObject2 });
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "thumbLocalId:%s", new Object[] { paramIntent });
          if (!bo.isNullOrNil((String)localObject2))
          {
            localObject4 = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex((String)localObject2);
            if ((localObject4 != null) && ((localObject4 instanceof WebViewJSSDKVideoItem)))
            {
              localObject4 = (WebViewJSSDKVideoItem)localObject4;
              localObject1 = new HashMap();
              ((HashMap)localObject1).put("localId", localObject2);
              ((HashMap)localObject1).put("duration", Integer.valueOf(((WebViewJSSDKVideoItem)localObject4).duration));
              ((HashMap)localObject1).put("height", Integer.valueOf(((WebViewJSSDKVideoItem)localObject4).height));
              ((HashMap)localObject1).put("size", Integer.valueOf(((WebViewJSSDKVideoItem)localObject4).size));
              ((HashMap)localObject1).put("width", Integer.valueOf(((WebViewJSSDKVideoItem)localObject4).width));
              ((HashMap)localObject1).put("thumbLocalId", paramIntent);
              a(this.uGd, "recordVideo:ok", (Map)localObject1);
              AppMethodBeat.o(9379);
              break;
            }
          }
          a(this.uGd, "recordVideo:fail", null);
          AppMethodBeat.o(9379);
          break;
        }
      if (paramInt1 == 47)
        switch (paramInt2)
        {
        default:
          a(this.uGd, "chooseMedia:fail", null);
          AppMethodBeat.o(9379);
          break;
        case 0:
          a(this.uGd, "chooseMedia:cancel", null);
          AppMethodBeat.o(9379);
          break;
        case -1:
          if (paramIntent == null)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult REQUEST_CHOOSE_MEDIA data is null,");
            a(this.uGd, "chooseMedia:fail", null);
            AppMethodBeat.o(9379);
            break;
          }
          paramInt1 = paramIntent.getIntExtra("key_pick_local_media_callback_type", 0);
          if (paramInt1 == 1)
          {
            localObject2 = paramIntent.getStringExtra("key_pick_local_media_local_id");
            paramIntent = paramIntent.getStringExtra("key_pick_local_media_thumb_local_id");
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "video localId:%s", new Object[] { localObject2 });
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "video thumbLocalId:%s", new Object[] { paramIntent });
            if (bo.isNullOrNil((String)localObject2))
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult REQUEST_CHOOSE_MEDIA video localId is null");
              a(this.uGd, "chooseMedia:fail", null);
              AppMethodBeat.o(9379);
              break;
            }
            localObject4 = com.tencent.mm.plugin.webview.modeltools.g.cYF().aex((String)localObject2);
            if ((localObject4 != null) && ((localObject4 instanceof WebViewJSSDKVideoItem)))
            {
              localObject4 = (WebViewJSSDKVideoItem)localObject4;
              paramIntent = com.tencent.mm.plugin.webview.model.ap.c((String)localObject2, paramIntent, ((WebViewJSSDKVideoItem)localObject4).duration, ((WebViewJSSDKVideoItem)localObject4).height, ((WebViewJSSDKVideoItem)localObject4).width, ((WebViewJSSDKVideoItem)localObject4).size);
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "after parse to json data : %s", new Object[] { paramIntent });
              localObject2 = new HashMap();
              ((HashMap)localObject2).put("type", Integer.valueOf(1));
              ((HashMap)localObject2).put("localIds", paramIntent);
              a(this.uGd, "chooseMedia:ok", (Map)localObject2);
              AppMethodBeat.o(9379);
              break;
            }
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult REQUEST_CHOOSE_MEDIA nor the videoitem");
            a(this.uGd, "chooseMedia:fail", null);
            AppMethodBeat.o(9379);
            break;
          }
          if (paramInt1 == 2)
          {
            localObject2 = paramIntent.getStringExtra("key_pick_local_media_local_ids");
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "chooseMedia localIds:%s", new Object[] { localObject2 });
            if (bo.isNullOrNil((String)localObject2))
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult REQUEST_CHOOSE_MEDIA image localIds is null");
              a(this.uGd, "chooseMedia:fail", null);
              AppMethodBeat.o(9379);
              break;
            }
            paramIntent = new HashMap();
            paramIntent.put("type", Integer.valueOf(2));
            paramIntent.put("localIds", localObject2);
            a(this.uGd, "chooseMedia:ok", paramIntent);
            AppMethodBeat.o(9379);
            break;
          }
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "type:%d is error", new Object[] { Integer.valueOf(paramInt1) });
          a(this.uGd, "chooseMedia:fail", null);
          AppMethodBeat.o(9379);
          break;
        }
      if (paramInt1 == 46)
        switch (paramInt2)
        {
        default:
          a(this.uGd, "previewVideo:fail", null);
          AppMethodBeat.o(9379);
          break;
        case 0:
          a(this.uGd, "previewVideo:cancel", null);
          AppMethodBeat.o(9379);
          break;
        case -1:
          a(this.uGd, "previewVideo:ok", null);
          AppMethodBeat.o(9379);
          break;
        }
      if (paramInt1 == 19)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request to config exdevice wifi connection, result code = ".concat(String.valueOf(paramInt2)));
        switch (paramInt2)
        {
        default:
        case -1:
        case 0:
        case 1:
        }
        while (true)
        {
          AppMethodBeat.o(9379);
          break;
          a(this.uGd, "configWXDeviceWiFi:ok", null);
          AppMethodBeat.o(9379);
          break;
          localObject4 = null;
          localObject2 = localObject4;
          if (paramIntent != null)
          {
            localObject2 = localObject4;
            if (!paramIntent.getBooleanExtra("is_wifi_connected", true))
            {
              localObject2 = new HashMap();
              ((HashMap)localObject2).put("desc", "wifi_not_connected");
            }
          }
          a(this.uGd, "configWXDeviceWiFi:cancel", (Map)localObject2);
          AppMethodBeat.o(9379);
          break;
          a(this.uGd, "configWXDeviceWiFi:fail", null);
        }
      }
      if (paramInt1 == 20)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request request_verify_wcpay_password, resultCode = ".concat(String.valueOf(paramInt2)));
        localObject4 = new HashMap();
        if (paramInt2 == -1)
        {
          localObject2 = "";
          if (paramIntent != null)
            localObject2 = bo.bc(paramIntent.getStringExtra("token"), "");
          if (!TextUtils.isEmpty((CharSequence)localObject2))
          {
            ((Map)localObject4).put("token", localObject2);
            a(this.uGd, "verifyWCPayPassword:ok", (Map)localObject4);
            com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "verifyWCPayPassword:ok" });
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "checkPwdToken is valid, verifyWCPayPassword:ok");
          }
        }
        while (true)
        {
          if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
            com.tencent.mm.pluginsdk.wallet.f.dlJ();
          AppMethodBeat.o(9379);
          break;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "checkPwdToken is empty, verifyWCPayPassword:fail");
          a(this.uGd, "verifyWCPayPassword:fail", null);
          if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
          {
            com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "verifyWCPayPassword:fail" });
            continue;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "resultCode is canlcel, verifyWCPayPassword:fail");
            a(this.uGd, "verifyWCPayPassword:fail", null);
            if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
              com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "verifyWCPayPassword:fail" });
          }
        }
      }
      if (21 == paramInt1)
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "hy: callback to see order. directly finish");
        a(this.uGd, "see_order_ok", null);
        AppMethodBeat.o(9379);
        break;
      }
      if (paramInt1 == 22)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request get_recevie_biz_hongbao_request, resultCode = ".concat(String.valueOf(paramInt2)));
        if (paramInt2 == -1)
        {
          a(this.uGd, "get_recevie_biz_hongbao_request:ok", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 0)
        {
          a(this.uGd, "get_recevie_biz_hongbao_request:cancel", null);
          AppMethodBeat.o(9379);
          break;
        }
        a(this.uGd, "get_recevie_biz_hongbao_request:fail", null);
        AppMethodBeat.o(9379);
        break;
      }
      if (paramInt1 == 24)
      {
        paramIntent = null;
        if (this.uGh != null)
          paramIntent = (SnsAdClick)this.uGh.getParcelable("KSnsAdTag");
        if (paramInt2 == -1)
        {
          if (paramIntent != null)
          {
            paramIntent.fPZ = 9;
            a(paramIntent);
          }
          gB(2, 1);
          if (bo.getInt((String)this.uGd.puc.get("open_from_scene"), 0) == 4)
            com.tencent.mm.plugin.fav.a.h.j(this.uGh.getLong("favlocalid", 0L), 0, 0);
        }
      }
      label6839: label9279: label13888: 
      while (true)
      {
        while (true)
        {
          try
          {
            if (this.umI != null)
            {
              paramIntent = (String)this.uGd.puc.get("appId");
              if (!TextUtils.isEmpty(paramIntent))
                break label13888;
              paramIntent = (String)this.uGd.puc.get("appid");
              a(paramIntent, (String)this.uGd.puc.get("img_url"), 1, this.umI.g(85, null));
            }
            a(this.uGd, "share_timeline:ok", null);
            AppMethodBeat.o(9379);
          }
          catch (RemoteException paramIntent)
          {
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "invokeAsResult : %s", new Object[] { paramIntent });
            continue;
          }
          if (paramIntent != null)
          {
            paramIntent.fPZ = 10;
            a(paramIntent);
          }
          gB(2, 3);
          a(this.uGd, "share_timeline:ok", null);
          AppMethodBeat.o(9379);
          break;
          if (paramInt1 == 26)
          {
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "select pedometer source resultCode = ".concat(String.valueOf(paramInt2)));
            if (paramInt2 == -1)
            {
              a(this.uGd, "selectPedometerSource:ok", null);
              AppMethodBeat.o(9379);
              break;
            }
            if (paramInt2 == 0)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "selectPedometerSource result cancel");
              a(this.uGd, "selectPedometerSource:cancel", null);
              AppMethodBeat.o(9379);
              break;
            }
            com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "selectPedometerSource result fail");
            a(this.uGd, "selectPedometerSource:fail", null);
            AppMethodBeat.o(9379);
            break;
          }
          if (paramInt1 != 25)
            break label6344;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "hy: get ibg order finish. result code: %d", new Object[] { Integer.valueOf(paramInt2) });
          if ((this.uGy == 1) && (this.umI != null));
          try
          {
            this.umI.cZb();
            this.umI.W(null);
            if (paramInt2 == -1)
            {
              a(this.uGd, "get_h5_transaction_request:ok", null);
              AppMethodBeat.o(9379);
            }
          }
          catch (RemoteException paramIntent)
          {
            while (true)
              com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", paramIntent, "", new Object[0]);
            a(this.uGd, "get_h5_transaction_request:cancel", null);
            AppMethodBeat.o(9379);
          }
        }
        break;
        label6344: if (paramInt1 == 28)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "get web pay checkout counter request finish. result code: %d", new Object[] { Integer.valueOf(paramInt2) });
          if (paramInt2 == -1)
          {
            localObject2 = new HashMap();
            localObject4 = bo.bc(paramIntent.getStringExtra("token"), "");
            paramIntent = bo.bc(paramIntent.getStringExtra("bind_serial"), "");
            ((Map)localObject2).put("token", localObject4);
            ((Map)localObject2).put("bind_serial", paramIntent);
            a(this.uGd, "getWebPayCheckoutCounterRequst:ok", (Map)localObject2);
            com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "getWebPayCheckoutCounterRequst:ok" });
          }
          while (true)
          {
            if (com.tencent.mm.pluginsdk.wallet.f.dlH())
              break label13856;
            com.tencent.mm.pluginsdk.wallet.f.dlJ();
            AppMethodBeat.o(9379);
            break;
            a(this.uGd, "getWebPayCheckoutCounterRequst:fail", null);
            if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
              com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "getWebPayCheckoutCounterRequst:fail" });
          }
        }
        if (paramInt1 == 31)
        {
          if (paramInt2 != -1)
          {
            a(this.uGd, "openEnterpriseContact:ok", null);
            AppMethodBeat.o(9379);
            break;
          }
          paramIntent = paramIntent.getBundleExtra("result_data");
          if (paramIntent != null)
          {
            paramIntent = paramIntent.getString("result");
            localObject2 = new HashMap();
            ((Map)localObject2).put("result", paramIntent);
            a(this.uGd, "openEnterpriseContact:ok", (Map)localObject2);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "openEnterpriseContact:ok", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 53)
        {
          if (paramInt2 != -1)
          {
            a(this.uGd, "selectEnterpriseContact:ok", null);
            AppMethodBeat.o(9379);
            break;
          }
          paramIntent = paramIntent.getBundleExtra("result_data");
          if (paramIntent != null)
          {
            paramIntent = paramIntent.getString("result");
            localObject2 = new HashMap();
            ((Map)localObject2).put("result", paramIntent);
            a(this.uGd, "selectEnterpriseContact:ok", (Map)localObject2);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "selectEnterpriseContact:ok", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 29)
        {
          if (paramInt2 == -1);
          for (bool = true; ; bool = false)
          {
            com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "consumedShareCard:ok(r : %b)", new Object[] { Boolean.valueOf(bool) });
            if (paramInt2 != -1)
              break label6839;
            a(this.uGd, "consumedShareCard:ok", null);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "consumedShareCard:fail", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 113)
        {
          if (paramInt2 == -1)
          {
            W(this.uGd);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "chooseImage:fail_android_permission_denied", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 116)
        {
          if (paramInt2 == -1)
          {
            ad(this.uGd);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "startRecord:fail_android_permission_denied", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 115)
        {
          if (paramInt2 == -1)
          {
            a(this.uGd, 0);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "chooseVideo:fail_android_permission_denied", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 117)
        {
          if (paramInt2 == -1)
          {
            a(this.uGd, 1);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "recordVideo:fail_android_permission_denied", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 118)
        {
          if (paramInt2 == -1)
          {
            a(this.uGd, 1);
            AppMethodBeat.o(9379);
            break;
          }
          a(this.uGd, "recordVideo:fail_android_permission_denied", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 119)
        {
          if (paramInt2 == -1)
          {
            aa(this.uGd);
            AppMethodBeat.o(9379);
            break;
          }
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "chooseMedia:fail_android_permission_denied:CAMERA");
          a(this.uGd, "chooseMedia:fail_android_permission_denied", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 120)
        {
          if (paramInt2 == -1)
          {
            aa(this.uGd);
            AppMethodBeat.o(9379);
            break;
          }
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "chooseMedia:fail_android_permission_denied:MICROPHONE");
          a(this.uGd, "chooseMedia:fail_android_permission_denied", null);
          AppMethodBeat.o(9379);
          break;
        }
        if (paramInt1 == 30)
        {
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSelectSingleContact activtiy callback");
          localObject2 = (String)this.uGd.puc.get("appId");
          if ((this.uGh == null) || (!TextUtils.isEmpty((CharSequence)localObject2)))
            break label13885;
          localObject2 = this.uGh.getString("jsapi_args_appid");
        }
        while (true)
        {
          while (true)
          {
            paramInt1 = bo.getInt((String)this.uGd.puc.get("selectMode"), 0);
            localObject4 = (String)this.uGd.puc.get("busiId");
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "select single contact : appId:%s, busiId:%s, selectedMode:%d", new Object[] { localObject2, localObject4, Integer.valueOf(paramInt1) });
            switch (paramInt2)
            {
            default:
            case 0:
            case -1:
            }
            while (true)
            {
              AppMethodBeat.o(9379);
              break;
              a(this.uGd, "selectSingleContact:cancel", null);
              AppMethodBeat.o(9379);
              break;
              if (paramIntent == null);
              for (paramIntent = null; ; paramIntent = paramIntent.getStringExtra("Select_Conv_User"))
              {
                if ((paramIntent != null) && (paramIntent.length() != 0))
                  break label7476;
                com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult,selectSingleContact fail, user is null");
                a(this.uGd, "selectSingleContact:fail", null);
                AppMethodBeat.o(9379);
                break;
              }
              if (paramInt1 == 0)
              {
                paramIntent = new com.tencent.mm.plugin.webview.model.p((String)localObject2, paramIntent);
                com.tencent.mm.kernel.g.Rg().a(1566, new g.17(this));
                com.tencent.mm.kernel.g.Rg().d(paramIntent);
                localObject2 = this.context;
                this.context.getString(2131297061);
                this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject2, this.context.getString(2131297086), true, new g.18(this, paramIntent));
                AppMethodBeat.o(9379);
                break;
              }
              if (paramInt1 == 1)
              {
                paramIntent = new com.tencent.mm.plugin.webview.model.v((String)localObject2, (String)localObject4, paramIntent);
                com.tencent.mm.kernel.g.Rg().a(1177, new g.19(this));
                com.tencent.mm.kernel.g.Rg().d(paramIntent);
                localObject2 = this.context;
                this.context.getString(2131297061);
                this.ehJ = com.tencent.mm.ui.base.h.b((Context)localObject2, this.context.getString(2131297086), true, new DialogInterface.OnCancelListener()
                {
                  public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                  {
                    AppMethodBeat.i(9064);
                    com.tencent.mm.kernel.g.Rg().c(paramIntent);
                    AppMethodBeat.o(9064);
                  }
                });
              }
            }
            if (paramInt1 == 34)
            {
              if (paramInt2 == -1)
              {
                a(this.uGd, "get_wcpay_realname_verify:ok", null);
                com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_wcpay_realname_verify:ok" });
              }
              while (true)
              {
                if (com.tencent.mm.pluginsdk.wallet.f.dlH())
                  break label13856;
                com.tencent.mm.pluginsdk.wallet.f.dlJ();
                AppMethodBeat.o(9379);
                break;
                if (paramInt2 == 1)
                {
                  a(this.uGd, "get_wcpay_realname_verify:fail", null);
                  if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
                    com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_wcpay_realname_verify:fail" });
                }
                else
                {
                  a(this.uGd, "get_wcpay_realname_verify:cancel", null);
                  com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "get_wcpay_realname_verify:cancel" });
                }
              }
            }
            if (paramInt1 != 35)
              break label7931;
            if (paramInt2 != -1)
              break label7910;
            paramIntent = new on();
            paramIntent.cKQ.context = this.context;
            com.tencent.mm.sdk.b.a.xxA.m(paramIntent);
            try
            {
              this.umI.cZb();
              this.umI.W(null);
              AppMethodBeat.o(9379);
            }
            catch (RemoteException paramIntent)
            {
              com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", paramIntent, "", new Object[0]);
              AppMethodBeat.o(9379);
            }
          }
          break;
          label7910: a(this.uGd, "selectWalletCurrency:cancel", null);
          AppMethodBeat.o(9379);
          break;
          label7931: if (paramInt1 == 37)
          {
            if (this.cEl == null)
            {
              com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, appmsg is null");
              a(this.uGd, "send_app_msg:fail", null);
              AppMethodBeat.o(9379);
              break;
            }
            localObject1 = (String)this.uGd.puc.get("appid");
            localObject2 = null;
            if (this.uGh == null)
              break label13874;
            localObject4 = (SnsAdClick)this.uGh.getParcelable("KSnsAdTag");
            localObject2 = localObject4;
            if (!TextUtils.isEmpty((CharSequence)localObject1))
              break label13874;
          }
          for (localObject2 = this.uGh.getString("jsapi_args_appid"); ; localObject2 = localObject1)
          {
            long l;
            while (true)
            {
              while (true)
              {
                ??? = this.uGd.dcO().get("Internal@AsyncReport");
                switch (paramInt2)
                {
                default:
                case 0:
                case -1:
                }
                while (true)
                {
                  AppMethodBeat.o(9379);
                  break;
                  if (localObject4 != null)
                  {
                    ((SnsAdClick)localObject4).fPZ = 8;
                    a((SnsAdClick)localObject4);
                  }
                  l.a(this.uGd.dcO(), agw("sendAppMessage"), null, (String)localObject2);
                  if ((??? != null) && ((??? instanceof Boolean)) && (((Boolean)???).booleanValue()))
                    b(this.uGd, true);
                  a(this.uGd, "send_app_msg:cancel", null);
                  AppMethodBeat.o(9379);
                  break;
                  if (localObject4 != null)
                  {
                    ((SnsAdClick)localObject4).fPZ = 7;
                    a((SnsAdClick)localObject4);
                  }
                  localObject4 = com.tencent.mm.pluginsdk.model.app.g.Uq((String)localObject2);
                  if (paramIntent == null)
                  {
                    AppMethodBeat.o(9379);
                    break;
                  }
                  localObject1 = paramIntent.getStringExtra("enterprise_biz_name");
                  l = paramIntent.getLongExtra("key_biz_chat_id", -1L);
                  localObject8 = paramIntent.getStringExtra("enterprise_share_append_text");
                  if ((localObject1 == null) || (((String)localObject1).length() == 0))
                  {
                    com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, toUser is null");
                    a(this.uGd, "send_app_msg:fail", null);
                    AppMethodBeat.o(9379);
                    break;
                  }
                  paramIntent = (String)this.uGd.puc.get("img_url");
                  this.uGd.puc.get("desc");
                  localObject5 = (String)this.uGd.puc.get("src_username");
                  localObject7 = (String)this.uGd.puc.get("src_displayname");
                  localObject9 = dcx();
                  l.a(this.uGd.dcO(), agw("sendAppMessage"), (String)localObject1, (String)localObject2);
                  if ((??? != null) && ((??? instanceof Boolean)) && (((Boolean)???).booleanValue()))
                    b(this.uGd, true);
                  if (bo.isNullOrNil(paramIntent))
                  {
                    com.tencent.mm.aj.a.c localc;
                    if (l >= 0L)
                      localc = com.tencent.mm.aj.z.aeT().aK(l);
                    while (true)
                    {
                      synchronized (com.tencent.mm.aj.a.e.fxC)
                      {
                        String str = com.tencent.mm.aj.a.e.aae();
                        com.tencent.mm.aj.a.e.d(localc);
                        a((com.tencent.mm.pluginsdk.model.app.f)localObject4, (String)localObject2, (String)localObject1, paramIntent, (String)localObject5, (String)localObject7, (String)localObject8, (String)localObject9);
                        com.tencent.mm.aj.a.e.rx(str);
                        com.tencent.mm.ui.base.h.bN(this.context, this.context.getString(2131298422));
                        a(this.uGd, "send_app_msg:ok", null);
                        AppMethodBeat.o(9379);
                      }
                      a((com.tencent.mm.pluginsdk.model.app.f)localObject4, (String)localObject2, (String)localObject1, paramIntent, (String)localObject5, (String)localObject7, (String)localObject8, (String)localObject9);
                    }
                  }
                  com.tencent.mm.at.o.ahk().a(paramIntent, new g.21(this, l, (com.tencent.mm.pluginsdk.model.app.f)localObject4, (String)localObject2, (String)localObject1, paramIntent, (String)localObject5, (String)localObject7, (String)localObject8, (String)localObject9));
                }
                if (paramInt1 == 38)
                {
                  if (paramInt2 == -1)
                  {
                    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "hy: soter auth ok");
                    paramIntent = i.aq(paramIntent.getExtras());
                    a(this.uGd, "soter_biometric_authentication:ok", paramIntent);
                    AppMethodBeat.o(9379);
                    break;
                  }
                  if (paramInt2 == 1)
                  {
                    com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "hy: soter auth failed");
                    a(this.uGd, "soter_biometric_authentication:fail", i.aq(paramIntent.getExtras()));
                    AppMethodBeat.o(9379);
                    break;
                  }
                  com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "hy: soter user cancelled");
                  a(this.uGd, "soter_biometric_authentication:cancel", i.aq(paramIntent.getExtras()));
                  AppMethodBeat.o(9379);
                  break;
                }
                if (paramInt1 == 39)
                {
                  if (paramInt2 == -1)
                    a(this.uGd, "unbind_bank_card:ok", null);
                  while (true)
                  {
                    if (com.tencent.mm.pluginsdk.wallet.f.dlH())
                      break label13856;
                    AppMethodBeat.o(9379);
                    break;
                    if (paramInt2 == 1)
                      a(this.uGd, "unbind_bank_card:fail", null);
                    else
                      a(this.uGd, "unbind_bank_card:cancel", null);
                  }
                }
                if (paramInt1 != 40)
                  break label9279;
                if (paramInt2 != -1)
                  break label9258;
                ??? = new Bundle();
                if (paramIntent == null)
                  break label9237;
                localObject4 = f(paramIntent.getLongArrayExtra("k_outside_expose_proof_item_list"));
                paramInt2 = ((ArrayList)localObject4).size();
                localObject8 = new String[paramInt2];
                localObject2 = new String[paramInt2];
                localObject1 = new String[paramInt2];
                localObject5 = new int[paramInt2];
                localObject9 = new int[paramInt2];
                paramInt1 = 0;
                if (paramInt1 < paramInt2)
                {
                  localObject7 = (bi)((ArrayList)localObject4).get(paramInt1);
                  localObject8[paramInt1] = String.valueOf(((bi)localObject7).HB());
                  if (paramIntent.getBooleanExtra("k_is_group_chat", false))
                    if (((bi)localObject7).bws())
                    {
                      localObject2[paramInt1] = bf.oz(((bi)localObject7).HG());
                      label8939: localObject1[paramInt1] = bf.oy(((bi)localObject7).getContent());
                      if (((bi)localObject7).HC() == 1)
                        localObject1[paramInt1] = com.tencent.mm.model.r.Yz();
                      if (localObject2[paramInt1] == null)
                        localObject2[paramInt1] = "";
                      if (localObject1[paramInt1] == null)
                        localObject1[paramInt1] = "";
                      if (!((bi)localObject7).bAA())
                        break label9085;
                      localObject5[paramInt1] = 49;
                    }
                  while (true)
                  {
                    localObject9[paramInt1] = ((int)(((bi)localObject7).HD() / 1000L));
                    paramInt1++;
                    break;
                    localObject2[paramInt1] = bf.oz(((bi)localObject7).getContent());
                    break label8939;
                    if (((bi)localObject7).bws())
                      localObject2[paramInt1] = ((bi)localObject7).HG();
                    while (true)
                    {
                      localObject1[paramInt1] = ((bi)localObject7).HE();
                      break;
                      localObject2[paramInt1] = ((bi)localObject7).getContent();
                    }
                    label9085: localObject5[paramInt1] = ((bi)localObject7).getType();
                  }
                }
                ((Bundle)???).putStringArray("msgIds", (String[])localObject8);
                ((Bundle)???).putStringArray("contents", (String[])localObject2);
                ((Bundle)???).putStringArray("senders", (String[])localObject1);
                ((Bundle)???).putIntArray("msgTypes", (int[])localObject5);
                ((Bundle)???).putIntArray("msgTimes", (int[])localObject9);
                try
                {
                  if (this.umI != null)
                    this.umI.c(48, (Bundle)???);
                  a(this.uGd, "select chat record:ok", null);
                  AppMethodBeat.o(9379);
                }
                catch (RemoteException paramIntent)
                {
                  com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onGetMsgProofItems exception" + paramIntent.getMessage());
                  a(this.uGd, "select chat record:fail", null);
                  AppMethodBeat.o(9379);
                }
              }
              break;
              a(this.uGd, "select chat record:fail", null);
              AppMethodBeat.o(9379);
              break;
              a(this.uGd, "select chat record:cancel", null);
              AppMethodBeat.o(9379);
              break;
              if (paramInt1 == 41)
              {
                if (paramInt2 == -1)
                {
                  a(this.uGd, "id_card_realname_verify:ok", null);
                  com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "id_card_realname_verify:ok" });
                }
                while (true)
                {
                  if (com.tencent.mm.pluginsdk.wallet.f.dlH())
                    break label13856;
                  com.tencent.mm.pluginsdk.wallet.f.dlJ();
                  AppMethodBeat.o(9379);
                  break;
                  if (paramInt2 == 1)
                  {
                    a(this.uGd, "id_card_realname_verify:fail", null);
                    if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
                      com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "id_card_realname_verify:fail" });
                  }
                  else
                  {
                    a(this.uGd, "id_card_realname_verify:cancel", null);
                    com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "id_card_realname_verify:cancel" });
                  }
                }
              }
              if (paramInt1 == 42)
              {
                if (paramInt2 == -1)
                {
                  if (paramIntent != null)
                  {
                    localObject2 = bo.bc(paramIntent.getStringExtra("gameRegionName"), "");
                    paramIntent = new HashMap();
                    paramIntent.put("gameRegionName", localObject2);
                    a(this.uGd, "get game region:ok", paramIntent);
                    AppMethodBeat.o(9379);
                    break;
                  }
                  a(this.uGd, "get game region:fail", null);
                  AppMethodBeat.o(9379);
                  break;
                }
                if (paramInt2 == 1)
                {
                  a(this.uGd, "get game region:fail", null);
                  AppMethodBeat.o(9379);
                  break;
                }
                a(this.uGd, "get game region:cancel", null);
                AppMethodBeat.o(9379);
                break;
              }
              if (paramInt1 != 43)
                break label9866;
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request to open file chooser for id card image, result code = ".concat(String.valueOf(paramInt2)));
              switch (paramInt2)
              {
              default:
                a(this.uGd, "chooseImage:fail", null);
                AppMethodBeat.o(9379);
                break;
              case -1:
                localObject2 = new HashMap();
                localObject4 = paramIntent.getStringExtra("key_pick_local_pic_callback_local_ids");
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "localIds = %s", new Object[] { localObject4 });
                if (bo.isNullOrNil((String)localObject4))
                {
                  a(this.uGd, "chooseIdCard:fail", null);
                  AppMethodBeat.o(9379);
                  break;
                }
                try
                {
                  localObject1 = new org/json/JSONArray;
                  ((JSONArray)localObject1).<init>((String)localObject4);
                  if (((JSONArray)localObject1).length() <= 0)
                    break label9824;
                  ((HashMap)localObject2).put("localId", ((JSONArray)localObject1).get(0).toString());
                  if (paramIntent.getStringExtra("key_pick_local_pic_source_type") != null)
                    ((HashMap)localObject2).put("sourceType", "album");
                  a(this.uGd, "chooseIdCard:ok", (Map)localObject2);
                  AppMethodBeat.o(9379);
                }
                catch (Exception paramIntent)
                {
                  com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", paramIntent, "", new Object[0]);
                  a(this.uGd, "chooseImage:fail", null);
                  AppMethodBeat.o(9379);
                }
              case 0:
              }
            }
            break;
            label9824: a(this.uGd, "chooseImage:fail", null);
            AppMethodBeat.o(9379);
            break;
            a(this.uGd, "chooseIdCard:cancel", null);
            AppMethodBeat.o(9379);
            break;
            if (paramInt1 == 48)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "alvinluo: requestWxFacePictureVerify resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
              if (paramInt2 == -1)
              {
                localObject2 = this.uGd;
                if (paramIntent != null);
                for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                {
                  a((i)localObject2, "requestWxFacePictureVerify:ok", i.aq(paramIntent));
                  AppMethodBeat.o(9379);
                  break;
                }
              }
              if (paramInt2 == 1)
              {
                localObject2 = this.uGd;
                if (paramIntent != null);
                for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                {
                  a((i)localObject2, "requestWxFacePictureVerify:fail", i.aq(paramIntent));
                  AppMethodBeat.o(9379);
                  break;
                }
              }
              if (paramInt2 == 0)
              {
                localObject2 = this.uGd;
                if (paramIntent != null);
                for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                {
                  a((i)localObject2, "requestWxFacePictureVerify:cancel", i.aq(paramIntent));
                  AppMethodBeat.o(9379);
                  break;
                }
              }
            }
            else if (paramInt1 == 49)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "hy: REQUEST_FACE_DETECT_WITH_VIDEO resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
              if (paramInt2 == -1)
              {
                localObject2 = this.uGd;
                if (paramIntent != null);
                for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                {
                  a((i)localObject2, "requestWxFacePictureVerifyUnionVideo:ok", i.aq(paramIntent));
                  AppMethodBeat.o(9379);
                  break;
                }
              }
              if (paramInt2 == 1)
              {
                localObject2 = this.uGd;
                if (paramIntent != null);
                for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                {
                  a((i)localObject2, "requestWxFacePictureVerifyUnionVideo:fail", i.aq(paramIntent));
                  AppMethodBeat.o(9379);
                  break;
                }
              }
              if (paramInt2 == 0)
              {
                localObject2 = this.uGd;
                if (paramIntent != null);
                for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                {
                  a((i)localObject2, "requestWxFacePictureVerifyUnionVideo:cancel", i.aq(paramIntent));
                  AppMethodBeat.o(9379);
                  break;
                }
              }
            }
            else if (paramInt1 == 52)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "share emmotion resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
              switch (paramInt2)
              {
              default:
                a(this.uGd, "shareEmoticon:fail", null);
                AppMethodBeat.o(9379);
                break;
              case -1:
                localObject4 = bo.bc(paramIntent.getStringExtra("Select_Conv_User"), "");
                localObject9 = bo.bc(paramIntent.getStringExtra("emoji_thumb_path"), "");
                localObject1 = bo.bc(paramIntent.getStringExtra("emoji_activity_id"), "");
                localObject2 = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().aUp().aqi((String)localObject9);
                if (localObject2 == null)
                {
                  localObject7 = EmojiLogic.L(com.tencent.mm.plugin.emoji.h.b.Yb(), "", (String)localObject9);
                  if (com.tencent.mm.vfs.e.ct((String)localObject7))
                    if (com.tencent.mm.sdk.platformtools.r.amo((String)localObject7))
                    {
                      paramInt1 = EmojiInfo.yan;
                      localObject2 = new EmojiInfo();
                      ((EmojiInfo)localObject2).vS((String)localObject9);
                      ((EmojiInfo)localObject2).Mw(EmojiInfo.yaf);
                      ((EmojiInfo)localObject2).setType(paramInt1);
                      ((EmojiInfo)localObject2).setSize((int)com.tencent.mm.vfs.e.asZ((String)localObject7));
                      ((EmojiInfo)localObject2).duY();
                      if (!bo.isNullOrNil((String)localObject1))
                        ((EmojiInfo)localObject2).field_activityid = ((String)localObject1);
                      localObject2 = com.tencent.mm.plugin.emoji.model.j.getEmojiStorageMgr().aUp().E((EmojiInfo)localObject2);
                    }
                }
                break;
              case 0:
              }
            }
            while (true)
            {
              while (true)
              {
                localObject7 = bo.P(bo.bc((String)localObject4, "").split(",")).iterator();
                while (true)
                  if (((Iterator)localObject7).hasNext())
                  {
                    localObject1 = (String)((Iterator)localObject7).next();
                    if (localObject2 != null)
                    {
                      com.tencent.mm.plugin.emoji.model.j.bki().a((String)localObject1, (EmojiInfo)localObject2, null);
                      continue;
                      paramInt1 = EmojiInfo.yam;
                      break;
                    }
                  }
                paramIntent = paramIntent.getStringExtra("custom_send_text");
                if (!bo.isNullOrNil(paramIntent))
                {
                  localObject2 = new qb();
                  ((qb)localObject2).cMq.cMr = ((String)localObject4);
                  ((qb)localObject2).cMq.content = paramIntent;
                  ((qb)localObject2).cMq.type = com.tencent.mm.model.t.nK((String)localObject4);
                  ((qb)localObject2).cMq.flags = 0;
                  com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject2);
                }
                com.tencent.mm.ui.base.h.bN(this.context, this.context.getResources().getString(2131297050));
                a(this.uGd, "shareEmoticon:ok", null);
                AppMethodBeat.o(9379);
                break;
                a(this.uGd, "shareEmoticon:cancel", null);
                AppMethodBeat.o(9379);
                break;
                if (paramInt1 == 50)
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "hy: requestWxFaceRegisterInternal resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                  if (paramInt2 == -1)
                  {
                    localObject2 = this.uGd;
                    if (paramIntent != null);
                    for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                    {
                      a((i)localObject2, "requestWxFaceRegisterInternal:ok", i.aq(paramIntent));
                      AppMethodBeat.o(9379);
                      break;
                    }
                  }
                  if (paramInt2 == 1)
                  {
                    localObject2 = this.uGd;
                    if (paramIntent != null);
                    for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                    {
                      a((i)localObject2, "requestWxFaceRegisterInternal:fail", i.aq(paramIntent));
                      AppMethodBeat.o(9379);
                      break;
                    }
                  }
                  if (paramInt2 != 0)
                    break label13856;
                  localObject2 = this.uGd;
                  if (paramIntent != null);
                  for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                  {
                    a((i)localObject2, "requestWxFaceRegisterInternal:cancel", i.aq(paramIntent));
                    AppMethodBeat.o(9379);
                    break;
                  }
                }
                if (paramInt1 == 51)
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "hy: requestWxFaceVerifyInternal resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                  if (paramInt2 == -1)
                  {
                    localObject2 = this.uGd;
                    if (paramIntent != null);
                    for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                    {
                      a((i)localObject2, "requestWxFaceVerifyInternal:ok", i.aq(paramIntent));
                      AppMethodBeat.o(9379);
                      break;
                    }
                  }
                  if (paramInt2 == 1)
                  {
                    localObject2 = this.uGd;
                    if (paramIntent != null);
                    for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                    {
                      a((i)localObject2, "requestWxFaceVerifyInternal:fail", i.aq(paramIntent));
                      AppMethodBeat.o(9379);
                      break;
                    }
                  }
                  if (paramInt2 != 0)
                    break label13856;
                  localObject2 = this.uGd;
                  if (paramIntent != null);
                  for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                  {
                    a((i)localObject2, "requestWxFaceVerifyInternal:cancel", i.aq(paramIntent));
                    AppMethodBeat.o(9379);
                    break;
                  }
                }
                if (paramInt1 != 54)
                  break label11140;
                if ((paramInt2 == -1) && (paramIntent != null))
                {
                  paramIntent = paramIntent.getStringExtra("Select_Contact");
                  localObject4 = com.tencent.mm.model.s.mJ(paramIntent);
                  localObject2 = new Bundle();
                  ((Bundle)localObject2).putString("username", paramIntent);
                  ((Bundle)localObject2).putString("nickname", (String)localObject4);
                  ((Bundle)localObject2).putInt("ret", 0);
                  try
                  {
                    if (this.umI != null)
                      this.umI.c(128, (Bundle)localObject2);
                    a(this.uGd, "selectContact:succ", null);
                    AppMethodBeat.o(9379);
                  }
                  catch (RemoteException paramIntent)
                  {
                    while (true)
                      com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + paramIntent.getMessage());
                  }
                }
              }
              a(this.uGd, "selectContact:fail", null);
              AppMethodBeat.o(9379);
              break;
              if (paramInt1 == 65)
              {
                if ((paramInt2 == -1) && (paramIntent != null))
                {
                  localObject2 = paramIntent.getStringExtra("Select_Contact");
                  localObject4 = com.tencent.mm.model.s.mJ((String)localObject2);
                  paramIntent = new HashMap();
                  paramIntent.put("username", localObject2);
                  paramIntent.put("nickname", localObject4);
                  localObject4 = com.tencent.mm.ah.o.act().qo((String)localObject2);
                  if (localObject4 != null)
                    paramIntent.put("headurl", ((com.tencent.mm.ah.h)localObject4).acl());
                  localObject2 = ((com.tencent.mm.plugin.messenger.foundation.a.j)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.foundation.a.j.class)).XM().aoO((String)localObject2);
                  if ((localObject2 != null) && (!bo.isNullOrNil(((ad)localObject2).Hq())))
                    paramIntent.put("alias", ((ad)localObject2).Hq());
                  a(this.uGd, "selectContact:ok", paramIntent);
                  AppMethodBeat.o(9379);
                  break;
                }
                a(this.uGd, "selectContact:fail", null);
                AppMethodBeat.o(9379);
                break;
              }
              if (paramInt1 == 55)
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "hy: REQUEST_SET_RESET_WALLET_PWD_REQUEST resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                if (paramInt2 == -1)
                {
                  localObject2 = this.uGd;
                  if (paramIntent != null);
                  for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                  {
                    a((i)localObject2, "setWCPayPassword:ok", i.aq(paramIntent));
                    com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "setWCPayPassword:ok" });
                    if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
                      com.tencent.mm.pluginsdk.wallet.f.dlJ();
                    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "WalletJsApiReqKey: " + com.tencent.mm.pluginsdk.wallet.f.dlI());
                    AppMethodBeat.o(9379);
                    break;
                  }
                }
                if (paramInt2 == 0)
                {
                  localObject2 = this.uGd;
                  if (paramIntent != null);
                  for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                  {
                    a((i)localObject2, "setWCPayPassword:cancel", i.aq(paramIntent));
                    com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "setWCPayPassword:cancel" });
                    break;
                  }
                }
                localObject2 = this.uGd;
                if (paramIntent != null);
                for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                {
                  a((i)localObject2, "setWCPayPassword:fail", i.aq(paramIntent));
                  if (com.tencent.mm.pluginsdk.wallet.f.dlH())
                    break;
                  com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "setWCPayPassword:fail" });
                  break;
                }
              }
              if (paramInt1 == 56)
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request choose invoice title, resultCode = ".concat(String.valueOf(paramInt2)));
                localObject2 = new HashMap();
                if (paramInt2 == -1)
                {
                  if (paramIntent != null)
                    ((Map)localObject2).put("choose_invoice_title_info", bo.bc(paramIntent.getStringExtra("choose_invoice_title_info"), ""));
                  a(this.uGd, "chooseInvoiceTitle:ok", (Map)localObject2);
                  AppMethodBeat.o(9379);
                  break;
                }
                if (paramInt2 == 0)
                {
                  a(this.uGd, "chooseInvoiceTitle:cancel", (Map)localObject2);
                  AppMethodBeat.o(9379);
                  break;
                }
                a(this.uGd, "chooseInvoiceTitle:fail", (Map)localObject2);
                AppMethodBeat.o(9379);
                break;
              }
              if (paramInt1 == 57)
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request voice login verify, resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                paramIntent = new HashMap();
                if (paramInt2 == -1)
                {
                  paramIntent.put("err_code", Integer.valueOf(0));
                  paramIntent.put("err_msg", "verify ok");
                  a(this.uGd, "request voice login verify:ok", paramIntent);
                  AppMethodBeat.o(9379);
                  break;
                }
                if (paramInt2 == 0)
                {
                  paramIntent.put("err_code", Integer.valueOf(1));
                  paramIntent.put("err_msg", "verify cancel");
                  a(this.uGd, "request voice login verify:cancel", paramIntent);
                  AppMethodBeat.o(9379);
                  break;
                }
                paramIntent.put("err_code", Integer.valueOf(2));
                paramIntent.put("err_msg", "verify error");
                a(this.uGd, "request voice login verify:error", paramIntent);
                AppMethodBeat.o(9379);
                break;
              }
              if (paramInt1 == 59)
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "hy: REQUEST_OPEN_CARD_LIST resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                if (paramInt2 == -1)
                {
                  localObject2 = this.uGd;
                  if (paramIntent != null);
                  for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                  {
                    a((i)localObject2, "openWCPayCardList:ok", i.aq(paramIntent));
                    com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "openWCPayCardList:ok" });
                    if (com.tencent.mm.pluginsdk.wallet.f.dlH())
                      break label13856;
                    com.tencent.mm.pluginsdk.wallet.f.dlJ();
                    AppMethodBeat.o(9379);
                    break;
                  }
                }
                if (paramInt2 == 0)
                {
                  localObject2 = this.uGd;
                  if (paramIntent != null);
                  for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                  {
                    a((i)localObject2, "openWCPayCardList:fail", i.aq(paramIntent));
                    if (com.tencent.mm.pluginsdk.wallet.f.dlH())
                      break;
                    com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "openWCPayCardList:fail" });
                    break;
                  }
                }
                localObject2 = this.uGd;
                if (paramIntent != null);
                for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                {
                  a((i)localObject2, "openWCPayCardList:fail", i.aq(paramIntent));
                  if (com.tencent.mm.pluginsdk.wallet.f.dlH())
                    break;
                  com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "openWCPayCardList:fail" });
                  break;
                }
              }
              if (paramInt1 == 60)
              {
                if (paramIntent != null)
                {
                  paramIntent = paramIntent.getStringExtra("key_callback");
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "open offline pay view callback: %s", new Object[] { paramIntent });
                  a(this.uGd, String.format("openOfflinePayView:%s", new Object[] { paramIntent }), null);
                  com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "openOfflinePayView:ok" });
                }
                while (true)
                {
                  if (com.tencent.mm.pluginsdk.wallet.f.dlH())
                    break label13856;
                  com.tencent.mm.pluginsdk.wallet.f.dlJ();
                  AppMethodBeat.o(9379);
                  break;
                  a(this.uGd, "openOfflinePayView:fail", null);
                  if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
                    com.tencent.mm.plugin.report.service.h.pYm.e(14954, new Object[] { com.tencent.mm.pluginsdk.wallet.f.dlI(), "openOfflinePayView:fail" });
                }
              }
              if (paramInt1 == 58)
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "request bind email, resultCode %d", new Object[] { Integer.valueOf(paramInt2) });
                if (paramInt2 == -1)
                {
                  a(this.uGd, "bindEmail:ok", null);
                  AppMethodBeat.o(9379);
                  break;
                }
                a(this.uGd, "bindEmail:cancel", null);
                AppMethodBeat.o(9379);
                break;
              }
              if (paramInt1 == 62)
              {
                com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "[openRealnameAuth]resultCode:%d", new Object[] { Integer.valueOf(paramInt2) });
                localObject2 = new HashMap();
                if (paramInt2 == -1)
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "openRealnameAuth ok");
                  paramIntent = paramIntent.getStringExtra("intent_auth_token");
                  if (!bo.isNullOrNil(paramIntent))
                  {
                    ((Map)localObject2).put("err_code", Integer.valueOf(0));
                    ((Map)localObject2).put("auth_token", paramIntent);
                    com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "authToken:%s", new Object[] { paramIntent });
                    a(this.uGd, "openRealnameAuth:ok", (Map)localObject2);
                    AppMethodBeat.o(9379);
                    break;
                  }
                  a(this.uGd, "openRealnameAuth:fail", (Map)localObject2);
                  AppMethodBeat.o(9379);
                  break;
                }
                if (paramInt2 == 0)
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "openRealnameAuth cancel");
                  a(this.uGd, "openRealnameAuth:cancel", (Map)localObject2);
                  AppMethodBeat.o(9379);
                  break;
                }
                if (paramInt2 == 1)
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "openRealnameAuth fail");
                  if (paramIntent != null)
                  {
                    paramInt1 = paramIntent.getIntExtra("intent_err_code", -1);
                    paramIntent = paramIntent.getStringExtra("intent_err_msg");
                    ((Map)localObject2).put("err_code", Integer.valueOf(paramInt1));
                    ((Map)localObject2).put("err_msg", paramIntent);
                    a(this.uGd, "openRealnameAuth:fail", (Map)localObject2);
                    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "openRealnameAuth errCode:%d, errMsg:%s", new Object[] { Integer.valueOf(paramInt1), paramIntent });
                    AppMethodBeat.o(9379);
                    break;
                  }
                  a(this.uGd, "openRealnameAuth:fail", (Map)localObject2);
                }
                AppMethodBeat.o(9379);
                break;
              }
              if (paramInt1 == 61)
              {
                if (this.cEl == null)
                {
                  com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, appmsg is null");
                  a(this.uGd, "sendSingleAppMessage:fail", null);
                  AppMethodBeat.o(9379);
                  break;
                }
                switch (paramInt2)
                {
                default:
                  a(this.uGd, "sendSingleAppMessage:fail", null);
                  AppMethodBeat.o(9379);
                  break;
                case 0:
                  a(this.uGd, "sendSingleAppMessage:cancel", null);
                  AppMethodBeat.o(9379);
                  break;
                case -1:
                  if (paramIntent == null);
                  for (localObject2 = null; ; localObject2 = paramIntent.getStringExtra("Select_Conv_User"))
                  {
                    if ((localObject2 != null) && (((String)localObject2).length() != 0))
                      break label12868;
                    com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, toUser is null");
                    a(this.uGd, "sendSingleAppMessage:fail", null);
                    AppMethodBeat.o(9379);
                    break;
                  }
                  label12868: localObject4 = this.uGd.puc.get("__jsapi_fw_ext_info");
                  if (!(localObject4 instanceof Bundle));
                  break;
                }
              }
              for (localObject4 = ((Bundle)localObject4).getString("__jsapi_fw_ext_info_key_current_url"); ; localObject4 = null)
              {
                localObject1 = this.uGr.agj((String)localObject4);
                localObject4 = localObject1;
                if (bo.isNullOrNil((String)localObject1))
                  localObject4 = (String)this.uGd.puc.get("appId");
                localObject4 = new com.tencent.mm.plugin.webview.model.v((String)localObject4, "", (String)localObject2);
                com.tencent.mm.kernel.g.Rg().a(1177, new g.22(this, paramIntent, (String)localObject2));
                com.tencent.mm.kernel.g.Rg().d((com.tencent.mm.ai.m)localObject4);
                paramIntent = this.context;
                this.context.getString(2131297061);
                this.ehJ = com.tencent.mm.ui.base.h.b(paramIntent, this.context.getString(2131297086), true, new g.23(this, (com.tencent.mm.plugin.webview.model.v)localObject4));
                AppMethodBeat.o(9379);
                break;
                if (paramInt1 == 75)
                {
                  if (paramInt2 == -1)
                  {
                    dcz();
                    AppMethodBeat.o(9379);
                    break;
                  }
                  a(this.uGd, "geo_location:fail", null);
                  AppMethodBeat.o(9379);
                  break;
                }
                if (paramInt1 == 63)
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "REQUEST_FACE_VERIFY_FOR_PAY resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                  i = paramIntent.getIntExtra("err_code", 0);
                  paramIntent.getStringExtra("err_msg");
                  paramInt1 = paramIntent.getIntExtra("scene", 0);
                  j = paramIntent.getIntExtra("countFace", 0);
                  l = paramIntent.getLongExtra("totalTime", 0L);
                  int k = paramIntent.getIntExtra("err_type", 6);
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "errCode： ".concat(String.valueOf(i)));
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "scene： ".concat(String.valueOf(paramInt1)));
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "countFace： ".concat(String.valueOf(j)));
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "totalTime： ".concat(String.valueOf(l)));
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "errorType： ".concat(String.valueOf(k)));
                  if (paramInt2 == -1)
                  {
                    com.tencent.mm.plugin.report.service.h.pYm.e(15711, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(0), Integer.valueOf(j), Long.valueOf(l), Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(i) });
                    localObject2 = this.uGd;
                    if (paramIntent != null);
                    for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                    {
                      a((i)localObject2, "faceVerifyForPay:ok", i.aq(paramIntent));
                      AppMethodBeat.o(9379);
                      break;
                    }
                  }
                  if (paramInt2 == 1)
                  {
                    com.tencent.mm.plugin.report.service.h.pYm.e(15711, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(3), Integer.valueOf(j), Long.valueOf(l), Integer.valueOf(2), Integer.valueOf(k), Integer.valueOf(i) });
                    localObject2 = this.uGd;
                    if (paramIntent != null);
                    for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                    {
                      a((i)localObject2, "faceVerifyForPay:fail", i.aq(paramIntent));
                      AppMethodBeat.o(9379);
                      break;
                    }
                  }
                  if (paramInt2 == 0)
                  {
                    com.tencent.mm.plugin.report.service.h.pYm.e(15711, new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(2), Integer.valueOf(j), Long.valueOf(l), Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(i) });
                    localObject2 = this.uGd;
                    if (paramIntent == null)
                      break label13598;
                  }
                  for (paramIntent = paramIntent.getExtras(); ; paramIntent = null)
                  {
                    a((i)localObject2, "faceVerifyForPay:cancel", i.aq(paramIntent));
                    AppMethodBeat.o(9379);
                    break;
                  }
                }
                if (paramInt1 == 64)
                {
                  com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "REQUEST_FACE_VERIFY resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                  localObject9 = new Bundle();
                  if (paramIntent != null)
                  {
                    localObject4 = paramIntent.getStringExtra("err_msg");
                    localObject2 = paramIntent.getStringExtra("k_bio_id");
                    localObject7 = paramIntent.getStringExtra("key_pic_cdn_id");
                    localObject1 = paramIntent.getStringExtra("key_cdn_aes_key");
                    paramInt1 = paramIntent.getIntExtra("check_alive_type", 0);
                    ((Bundle)localObject9).putString("err_msg", (String)localObject4);
                    ((Bundle)localObject9).putInt("check_alive_type", paramInt1);
                    ((Bundle)localObject9).putString("bioid", (String)localObject2);
                    ((Bundle)localObject9).putString("fileid", (String)localObject7);
                    ((Bundle)localObject9).putString("aeskey", (String)localObject1);
                    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "errMsg： %s ,bioID：%s ,fileID： %s ,aesKey： %s ,check_alive_type： %d", new Object[] { localObject4, localObject2, localObject7, localObject1, Integer.valueOf(paramInt1) });
                  }
                  if (paramInt2 == -1)
                  {
                    a(this.uGd, "internelWxFaceVerify:ok", i.aq((Bundle)localObject9));
                    AppMethodBeat.o(9379);
                    break;
                  }
                  if (paramInt2 == 1)
                  {
                    a(this.uGd, "internelWxFaceVerify:fail", i.aq((Bundle)localObject9));
                    AppMethodBeat.o(9379);
                    break;
                  }
                  if (paramInt2 == 0)
                    a(this.uGd, "internelWxFaceVerify:cancel", i.aq((Bundle)localObject9));
                }
                AppMethodBeat.o(9379);
                break;
              }
            }
            localObject4 = localObject2;
          }
        }
      }
      label7476: label13885: label13891: Object localObject4 = localObject2;
    }
  }

  public final void c(int paramInt, String paramString, Map<String, Object> paramMap)
  {
    AppMethodBeat.i(9414);
    Bundle localBundle = new Bundle();
    localBundle.putInt("FTS_KEY_onStartWebSearch_type", paramInt);
    localBundle.putString("FTS_KEY_onStartWebSearch_query", paramString);
    localBundle.putSerializable("FTS_KEY_onStartWebSearch_params", new HashMap(paramMap));
    try
    {
      if (this.umI != null)
        this.umI.c(135, localBundle);
      AppMethodBeat.o(9414);
      return;
    }
    catch (RemoteException paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + paramString.getMessage());
        AppMethodBeat.o(9414);
      }
    }
  }

  public final int cZr()
  {
    AppMethodBeat.i(9294);
    int i = -1;
    int j = i;
    try
    {
      if (this.umI != null)
      {
        Bundle localBundle = this.umI.g(22, null);
        j = i;
        if (localBundle != null)
          j = localBundle.getInt("pay_channel");
      }
      AppMethodBeat.o(9294);
      return j;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "invokeAsResult error.%s", new Object[] { localRemoteException });
        j = i;
      }
    }
  }

  public final void d(int paramInt1, String paramString1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(9419);
    Bundle localBundle = new Bundle();
    localBundle.putInt("fts_key_teach_request_type", paramInt1);
    localBundle.putString("fts_key_json_data", paramString1);
    localBundle.putInt("fts_key_is_cache_data", paramInt2);
    localBundle.putString("requestId", paramString2);
    try
    {
      if (this.umI != null)
        this.umI.c(121, localBundle);
      AppMethodBeat.o(9419);
      return;
    }
    catch (RemoteException paramString1)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onTeachSearchDataReady exception" + paramString1.getMessage());
        AppMethodBeat.o(9419);
      }
    }
  }

  public final void dN(String paramString, int paramInt)
  {
    AppMethodBeat.i(9417);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_sns_id", paramString);
    localBundle.putInt("fts_key_status", paramInt);
    try
    {
      if (this.umI != null)
        this.umI.c(125, localBundle);
      AppMethodBeat.o(9417);
      return;
    }
    catch (RemoteException paramString)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.MsgHandler", "onMusicStatusChanged exception" + paramString.getMessage());
        AppMethodBeat.o(9417);
      }
    }
  }

  public final String dcB()
  {
    Object localObject1 = null;
    AppMethodBeat.i(9293);
    Object localObject2 = localObject1;
    try
    {
      if (this.umI != null)
      {
        Bundle localBundle = this.umI.g(18, null);
        localObject2 = localObject1;
        if (localBundle != null)
          localObject2 = localBundle.getString("preChatName");
      }
      AppMethodBeat.o(9293);
      return localObject2;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "invokeAsResult error.%s", new Object[] { localRemoteException });
        Object localObject3 = localObject1;
      }
    }
  }

  public final boolean dcC()
  {
    AppMethodBeat.i(9311);
    if (!bo.isNullOrNil(this.uGP));
    for (boolean bool = true; ; bool = false)
    {
      if (bool)
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "in recording state.");
      AppMethodBeat.o(9311);
      return bool;
    }
  }

  public final boolean dcG()
  {
    AppMethodBeat.i(9365);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "doSwitchWalletCurrency call");
    ((MMActivity)this.context).ifE = this;
    com.tencent.mm.bp.d.b(this.context, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", null, 35);
    AppMethodBeat.o(9365);
    return true;
  }

  public final boolean dcH()
  {
    AppMethodBeat.i(9370);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "openGameRegion call");
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).ifE = this;
      com.tencent.mm.bp.d.a(this.context, "game", ".ui.GameRegionSelectUI", null, 42, false);
    }
    AppMethodBeat.o(9370);
    return true;
  }

  public final boolean dcI()
  {
    AppMethodBeat.i(9433);
    try
    {
      this.umI.g(47, Bundle.EMPTY);
      a(this.uGd, "disablePullDownRefresh:ok", null);
      AppMethodBeat.o(9433);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
        a(this.uGd, "disablePullDownRefresh:fail", null);
      }
    }
  }

  public final Bundle dcJ()
  {
    Object localObject = null;
    AppMethodBeat.i(9441);
    try
    {
      Bundle localBundle = this.umI.g(33, null);
      localObject = localBundle;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getWebViewIntentExtras(%s)", new Object[] { localObject });
      AppMethodBeat.o(9441);
      return localObject;
    }
    catch (RemoteException localRemoteException)
    {
      while (true)
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
    }
  }

  public final void dcu()
  {
    AppMethodBeat.i(9217);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "setIsBusy: true");
    this.eBB = true;
    AppMethodBeat.o(9217);
  }

  public final Bundle dcv()
  {
    AppMethodBeat.i(9220);
    if (this.uGh == null)
      this.uGh = new Bundle();
    Bundle localBundle = this.uGh;
    AppMethodBeat.o(9220);
    return localBundle;
  }

  public final void gB(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(9375);
    String str1 = "";
    String str2 = " ";
    String str3 = "";
    Bundle localBundle = null;
    Object localObject = str2;
    String str4 = str1;
    try
    {
      if (this.umI != null)
      {
        localObject = str2;
        str4 = str1;
        localBundle = this.umI.g(77, null);
      }
      str6 = str3;
      localObject = str2;
      str4 = str1;
      if (localBundle != null)
      {
        localObject = str2;
        str4 = str1;
        str1 = localBundle.getString("KUrl");
        localObject = str2;
        str4 = str1;
        if (TextUtils.isEmpty(str1))
        {
          localObject = str2;
          str4 = str1;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "url is empty");
          AppMethodBeat.o(9375);
          return;
        }
        localObject = str2;
        str4 = str1;
        str6 = bo.nullAsNil(localBundle.getString("KSessionId"));
        localObject = str6;
        str4 = str1;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "sessionId %s", new Object[] { str6 });
        localObject = str6;
        str4 = str1;
        str2 = localBundle.getString("geta8key_username");
        str4 = str1;
        localObject = str6;
        str6 = str2;
      }
      str2 = bo.nullAsNil(bK(str4));
      int i = this.cEl.mediaObject.type();
      if (this.uGv.IS(paramInt1))
      {
        j = 2;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "appId %s, type %d,publisher %s, opType %d", new Object[] { str2, Integer.valueOf(i), str6, Integer.valueOf(j) });
        if (i == 5)
        {
          l = bo.anT();
          com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.MsgHandler", "report(%s), clickTimestamp : %d, appID : %s, url : %s, sessionId : %s, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13377), Long.valueOf(l), str2, str4, localObject, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        }
      }
    }
    catch (Exception localException)
    {
      try
      {
        while (true)
        {
          String str6;
          long l;
          str4 = URLEncoder.encode(bo.nullAsNil(str4), "UTF-8");
          com.tencent.mm.plugin.report.service.h.pYm.e(13377, new Object[] { Long.valueOf(l), str2, str4, localObject, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(j), str6 });
          AppMethodBeat.o(9375);
          continue;
          localException = localException;
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "get sessionId error, %s", new Object[] { localException });
          String str7 = str3;
        }
        int j = 1;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        while (true)
        {
          com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.MsgHandler", localUnsupportedEncodingException, "", new Object[0]);
          String str5 = "";
        }
      }
    }
  }

  public final String getCurrentUrl()
  {
    Object localObject = null;
    AppMethodBeat.i(9422);
    if (this.umI == null)
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "getCurrentUrl, callbacker is null");
      AppMethodBeat.o(9422);
    }
    while (true)
    {
      return localObject;
      try
      {
        String str = this.umI.getCurrentUrl();
        localObject = str;
        AppMethodBeat.o(9422);
      }
      catch (Exception localException)
      {
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.MsgHandler", "getCurrentUrl, exception = %s", new Object[] { localException });
        AppMethodBeat.o(9422);
      }
    }
  }

  public final void m(String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(9420);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", paramString);
    localBundle.putInt("fts_key_is_cache_data", paramInt1);
    localBundle.putInt("fts_key_is_expired", paramInt2);
    localBundle.putInt("fts_key_is_preload", paramInt3);
    try
    {
      if (this.umI != null)
        this.umI.c(142, localBundle);
      AppMethodBeat.o(9420);
      return;
    }
    catch (Exception paramString)
    {
      while (true)
        AppMethodBeat.o(9420);
    }
  }

  public final void oc(boolean paramBoolean)
  {
    AppMethodBeat.i(9216);
    this.uGo = paramBoolean;
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.MsgHandler", "markAwaitingProxyUI %d, %b", new Object[] { Integer.valueOf(this.cIv), Boolean.valueOf(paramBoolean) });
    AppMethodBeat.o(9216);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.jsapi.g
 * JD-Core Version:    0.6.2
 */