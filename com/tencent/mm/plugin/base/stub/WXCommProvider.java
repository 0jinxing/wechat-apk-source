package com.tencent.mm.plugin.base.stub;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.UriMatcher;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Looper;
import android.os.Process;
import com.jg.JgClassChecked;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.g.a.bl;
import com.tencent.mm.g.a.ce;
import com.tencent.mm.g.a.fc;
import com.tencent.mm.g.a.fd;
import com.tencent.mm.g.a.fd.b;
import com.tencent.mm.g.a.fj;
import com.tencent.mm.g.a.fj.b;
import com.tencent.mm.g.a.g;
import com.tencent.mm.g.a.il;
import com.tencent.mm.g.a.ph;
import com.tencent.mm.g.a.pi;
import com.tencent.mm.g.a.pj;
import com.tencent.mm.g.a.pk;
import com.tencent.mm.g.a.vf;
import com.tencent.mm.g.a.vf.b;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.account.ui.LoginUI;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.ao;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.PROVIDERCHECK})
public class WXCommProvider extends ContentProvider
{
  public static final String jDL;
  private static final String[] jDM;
  private static final UriMatcher jDO;
  private static volatile boolean jDP;
  protected static boolean jDQ;
  private static final Object lock;
  private SharedPreferences ehZ;
  private ak handler;
  protected MatrixCursor jDN;

  static
  {
    AppMethodBeat.i(18180);
    jDL = ah.getPackageName() + "_comm_preferences";
    jDM = new String[] { "packageName", "data" };
    jDO = new UriMatcher(-1);
    lock = new Object();
    jDP = false;
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "pref", 1);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openQRCodeScan", 18);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "batchAddShortcut", 19);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "getUnreadCount", 20);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "jumpToBizProfile", 21);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "jumpToBizTempSession", 27);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "registerMsgListener", 22);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "getAvatar", 23);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "regWatchAppId", 24);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "decodeVoice", 25);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "addCardToWX", 26);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "unReadMsgs", 9);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "to_chatting", 3);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "setReaded", 13);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "voiceControl", 29);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openRankList", 28);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openWebview", 30);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openBusiLuckyMoney", 31);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "createChatroom", 32);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "joinChatroom", 33);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "sendSight", 34);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "redirectToChattingByPhoneNumber", 35);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "redirectToWechatOutByPhoneNumber", 36);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "getWifiList", 37);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "connectWifi", 38);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "chooseCardFromWX", 39);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openOfflinePay", 42);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "setWechatSportStep", 40);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "getWechatSportConfig", 41);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "handleScanResult", 44);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openTypeWebview", 45);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openCleanUI", 46);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "launchWXMiniprogram", 47);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openBusinessView", 53);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "genTokenForOpenSdk", 43);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "qrcodeEvent", 48);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "jumpToOfflinePay", 49);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openBusinessWebview", 50);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "getWxaInfo", 51);
    jDO.addURI("com.tencent.mm.sdk.comm.provider", "openWxaDesktopOrWxaMyFavorite", 52);
    jDQ = false;
    AppMethodBeat.o(18180);
  }

  public WXCommProvider()
  {
    AppMethodBeat.i(18172);
    this.jDN = new MatrixCursor(new String[0]);
    AppMethodBeat.o(18172);
  }

  private String[] aVj()
  {
    AppMethodBeat.i(18177);
    try
    {
      int i = Binder.getCallingUid();
      String[] arrayOfString1 = getContext().getPackageManager().getPackagesForUid(Binder.getCallingUid());
      int j;
      if (arrayOfString1 == null)
      {
        j = 0;
        ab.i("MicroMsg.WXCommProvider", "getCallingPackages, callingUid = %d, packages size = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (arrayOfString1 != null)
          break label85;
        ab.w("MicroMsg.WXCommProvider", "getCallingPackages fail, packages is null");
        arrayOfString1 = new String[0];
        AppMethodBeat.o(18177);
      }
      while (true)
      {
        return arrayOfString1;
        j = arrayOfString1.length;
        break;
        label85: i = arrayOfString1.length;
        for (j = 0; j < i; j++)
          ab.i("MicroMsg.WXCommProvider", "getCallingPackages = %s", new Object[] { arrayOfString1[j] });
        AppMethodBeat.o(18177);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.WXCommProvider", "getCallingPackages, ex = %s", new Object[] { localException.getMessage() });
        String[] arrayOfString2 = new String[0];
        AppMethodBeat.o(18177);
      }
    }
  }

  private boolean aVk()
  {
    AppMethodBeat.i(18178);
    try
    {
      ab.i("MicroMsg.WXCommProvider", "checkIsLogin()");
      Object localObject;
      if (!jDQ)
      {
        localObject = new com/tencent/mm/plugin/base/stub/WXCommProvider$6;
        ((WXCommProvider.6)localObject).<init>(this, Boolean.FALSE);
        if (!((Boolean)((WXCommProvider.6)localObject).b(this.handler)).booleanValue())
        {
          ab.i("MicroMsg.WXCommProvider", "checkIsLogin !syncTaskRet");
          jDQ = false;
          AppMethodBeat.o(18178);
          bool = false;
          return bool;
        }
      }
      if ((aw.RK()) && (aw.ZM()) && (!aw.QT()));
      for (jDQ = true; ; jDQ = false)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("hasLogin = ");
        ab.i("MicroMsg.WXCommProvider", jDQ);
        bool = jDQ;
        AppMethodBeat.o(18178);
        break;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.WXCommProvider", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.WXCommProvider", localException, "", new Object[0]);
        AppMethodBeat.o(18178);
        boolean bool = false;
      }
    }
  }

  private boolean aVl()
  {
    boolean bool1 = false;
    AppMethodBeat.i(18179);
    try
    {
      ab.i("MicroMsg.WXCommProvider", "checkIsLogin()");
      Object localObject;
      if (!jDQ)
      {
        com.tencent.mm.pluginsdk.d.a.b localb = new com/tencent/mm/pluginsdk/d/a/b;
        localb.<init>();
        localObject = new com/tencent/mm/plugin/base/stub/WXCommProvider$7;
        ((WXCommProvider.7)localObject).<init>(this, localb);
        localb.b(4000L, (Runnable)localObject);
      }
      if ((aw.RK()) && (aw.ZM()) && (!aw.QT()));
      for (jDQ = true; ; jDQ = false)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>("hasLogin = ");
        ab.i("MicroMsg.WXCommProvider", jDQ);
        bool2 = jDQ;
        AppMethodBeat.o(18179);
        return bool2;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.WXCommProvider", localException.getMessage());
        ab.printErrStackTrace("MicroMsg.WXCommProvider", localException, "", new Object[0]);
        AppMethodBeat.o(18179);
        boolean bool2 = bool1;
      }
    }
  }

  public final Cursor a(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, int paramInt, String[] paramArrayOfString3)
  {
    AppMethodBeat.i(18175);
    switch (paramInt)
    {
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 10:
    case 11:
    case 12:
    case 14:
    case 15:
    case 16:
    case 17:
    default:
      paramArrayOfString1 = new MatrixCursor(jDM);
      paramUri = (Cursor)new WXCommProvider.4(this, paramUri, paramInt, paramArrayOfString3, paramArrayOfString1).b(this.handler);
      if (paramUri == null)
        paramArrayOfString1.close();
      AppMethodBeat.o(18175);
    case 18:
    case 19:
    case 20:
    case 3:
    case 9:
    case 13:
    case 22:
    case 23:
    case 25:
    case 29:
    case 34:
    case 35:
    case 36:
    case 37:
    case 38:
    case 40:
    case 41:
    case 42:
    case 46:
    case 48:
    case 51:
    case 52:
    case 24:
    case 21:
    case 27:
    case 28:
    case 26:
    case 30:
    case 45:
    case 50:
    case 47:
    case 53:
    case 49:
    case 31:
    case 32:
    case 33:
    case 39:
    case 44:
    case 43:
    }
    while (true)
    {
      return paramUri;
      if (!aVk())
      {
        paramUri = null;
        AppMethodBeat.o(18175);
      }
      else
      {
        paramArrayOfString1 = new fd();
        paramArrayOfString1.cyw.cyy = paramInt;
        paramArrayOfString1.cyw.uri = paramUri;
        paramArrayOfString1.cyw.selectionArgs = paramArrayOfString2;
        paramArrayOfString1.cyw.context = getContext();
        paramArrayOfString1.cyw.crW = paramArrayOfString3;
        if (!a.xxA.m(paramArrayOfString1))
        {
          ab.e("MicroMsg.WXCommProvider", "ExtCallEvent fail");
          paramUri = null;
          AppMethodBeat.o(18175);
        }
        else
        {
          paramUri = paramArrayOfString1.cyx.cyz;
          AppMethodBeat.o(18175);
          continue;
          long l = System.currentTimeMillis();
          if (!aVl())
          {
            String str = bo.nullAsNil(paramUri.getQueryParameter("appid"));
            if ("1".equals(bo.bc(paramUri.getQueryParameter("autoLogin"), "0")))
            {
              ab.i("MicroMsg.WXCommProvider", "hy: not login. try to login return code = 9");
              ao.vdg = new ao(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, paramInt, paramArrayOfString3);
              ao.vdh = System.currentTimeMillis();
              paramUri = new Intent(getContext(), LoginUI.class);
              paramUri.addFlags(268435456);
              getContext().startActivity(paramUri);
              paramUri = new MatrixCursor(com.tencent.mm.protocal.b.lPA);
              paramUri.addRow(new Object[] { Integer.valueOf(9) });
              AppMethodBeat.o(18175);
            }
            else
            {
              ab.i("MicroMsg.WXCommProvider", "not login, appID = %s, apiID = %s return code =%s ", new Object[] { str, Integer.valueOf(paramInt), Integer.valueOf(3) });
              h.pYm.e(10505, new Object[] { bo.nullAsNil(paramArrayOfString3[0]), str, Integer.valueOf(paramInt), Integer.valueOf(1), Long.valueOf(System.currentTimeMillis() - l) });
              paramUri = new MatrixCursor(com.tencent.mm.protocal.b.lPA);
              paramUri.addRow(new Object[] { Integer.valueOf(3) });
              AppMethodBeat.o(18175);
            }
          }
          else
          {
            paramArrayOfString1 = new fj();
            paramArrayOfString1.czd.cyy = paramInt;
            paramArrayOfString1.czd.uri = paramUri;
            paramArrayOfString1.czd.selectionArgs = paramArrayOfString2;
            paramArrayOfString1.czd.context = getContext();
            paramArrayOfString1.czd.crW = paramArrayOfString3;
            if (!a.xxA.m(paramArrayOfString1))
            {
              ab.e("MicroMsg.WXCommProvider", "ExtCallEvent fail return code = 8");
              paramUri = new MatrixCursor(com.tencent.mm.protocal.b.lPA);
              paramUri.addRow(new Object[] { Integer.valueOf(8) });
              AppMethodBeat.o(18175);
            }
            else
            {
              ab.i("MicroMsg.WXCommProvider", "[extApiCost] total cost = %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
              paramUri = paramArrayOfString1.cze.cyz;
              AppMethodBeat.o(18175);
              continue;
              if (!aVk())
              {
                paramUri = this.jDN;
                AppMethodBeat.o(18175);
              }
              else
              {
                paramArrayOfString1 = new vf();
                paramArrayOfString1.cSc.cyy = paramInt;
                paramArrayOfString1.cSc.uri = paramUri;
                paramArrayOfString1.cSc.context = getContext();
                for (paramInt = 0; ; paramInt++)
                  if (paramInt < paramArrayOfString3.length)
                  {
                    if (paramArrayOfString3[paramInt] != null)
                      paramArrayOfString1.cSc.callingPackage = paramArrayOfString3[paramInt];
                  }
                  else
                  {
                    if (a.xxA.m(paramArrayOfString1))
                      break label940;
                    ab.e("MicroMsg.WXCommProvider", "WatchAppIdRegEvent fail");
                    paramUri = null;
                    AppMethodBeat.o(18175);
                    break;
                  }
                label940: paramUri = paramArrayOfString1.cSd.cyz;
                AppMethodBeat.o(18175);
                continue;
                paramUri = new fc();
                paramUri.cyu.op = 21;
                paramUri.cyu.cvd = 1;
                paramUri.cyu.selectionArgs = paramArrayOfString2;
                paramUri.cyu.context = getContext();
                paramUri.cyu.crW = paramArrayOfString3;
                if (!a.xxA.m(paramUri))
                  ab.e("MicroMsg.WXCommProvider", "ExtCallBizEvent fail");
                paramUri = null;
                AppMethodBeat.o(18175);
                continue;
                if ((paramArrayOfString2 == null) || (paramArrayOfString2.length < 2))
                {
                  ab.e("MicroMsg.WXCommProvider", "wrong args");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                }
                else
                {
                  paramUri = new fc();
                  paramUri.cyu.op = 27;
                  paramUri.cyu.cvd = 1;
                  paramUri.cyu.selectionArgs = paramArrayOfString2;
                  paramUri.cyu.context = getContext();
                  paramUri.cyu.crW = paramArrayOfString3;
                  if (!a.xxA.m(paramUri))
                    ab.e("MicroMsg.WXCommProvider", "ExtCallBizEvent fail");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new fc();
                  paramUri.cyu.op = paramInt;
                  paramUri.cyu.selectionArgs = paramArrayOfString2;
                  paramUri.cyu.context = getContext();
                  paramUri.cyu.crW = paramArrayOfString3;
                  if (!a.xxA.m(paramUri))
                    ab.e("MicroMsg.WXCommProvider", "ExtCallBizEvent fail");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new g();
                  paramUri.crV.selectionArgs = paramArrayOfString2;
                  paramUri.crV.crW = paramArrayOfString3;
                  paramUri.crV.context = getContext();
                  if (!a.xxA.m(paramUri))
                    ab.e("MicroMsg.WXCommProvider", "add card to wx fail");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new pk();
                  paramUri.cLC.selectionArgs = paramArrayOfString2;
                  paramUri.cLC.crW = paramArrayOfString3;
                  paramUri.cLC.context = getContext();
                  paramArrayOfString1 = paramUri.cLC;
                  if (paramInt == 45);
                  for (boolean bool = true; ; bool = false)
                  {
                    paramArrayOfString1.cLD = bool;
                    if ((paramInt == 30) && (paramArrayOfString2 != null) && (paramArrayOfString2.length > 2))
                      com.tencent.mm.pluginsdk.e.vao = paramArrayOfString2[2];
                    if (!a.xxA.m(paramUri))
                      ab.e("MicroMsg.WXCommProvider", "open webview fail");
                    paramUri = null;
                    AppMethodBeat.o(18175);
                    break;
                  }
                  e.a(getContext(), paramArrayOfString2, paramArrayOfString3);
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new ph();
                  paramUri.cLz.selectionArgs = paramArrayOfString2;
                  paramUri.cLz.crW = paramArrayOfString3;
                  paramUri.cLz.context = getContext();
                  if (!a.xxA.m(paramUri))
                    ab.e("MicroMsg.WXCommProvider", "launch wx miniprogram fail");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  e.b(getContext(), paramArrayOfString2, paramArrayOfString3);
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new pj();
                  paramUri.cLB.selectionArgs = paramArrayOfString2;
                  paramUri.cLB.crW = paramArrayOfString3;
                  paramUri.cLB.context = getContext();
                  if (!a.xxA.m(paramUri))
                    ab.e("MicroMsg.WXCommProvider", "open offline pay fail");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new pi();
                  paramUri.cLA.selectionArgs = paramArrayOfString2;
                  paramUri.cLA.crW = paramArrayOfString3;
                  paramUri.cLA.context = getContext();
                  if (!a.xxA.m(paramUri))
                    ab.e("MicroMsg.WXCommProvider", "open busi luckymoney fail");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new ce();
                  paramUri.cvl.action = 1;
                  paramUri.cvl.selectionArgs = paramArrayOfString2;
                  paramUri.cvl.crW = paramArrayOfString3;
                  paramUri.cvl.context = getContext();
                  if (!a.xxA.m(paramUri))
                    ab.e("MicroMsg.WXCommProvider", "open webview fail");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new ce();
                  paramUri.cvl.action = 2;
                  paramUri.cvl.selectionArgs = paramArrayOfString2;
                  paramUri.cvl.crW = paramArrayOfString3;
                  paramUri.cvl.context = getContext();
                  if (!a.xxA.m(paramUri))
                    ab.e("MicroMsg.WXCommProvider", "open webview fail");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new bl();
                  paramUri.cuK.selectionArgs = paramArrayOfString2;
                  paramUri.cuK.crW = paramArrayOfString3;
                  paramUri.cuK.context = getContext();
                  if (!a.xxA.m(paramUri))
                    ab.e("MicroMsg.WXCommProvider", "choose card from wx fail");
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  paramUri = new il();
                  paramUri.cDC.selectionArgs = paramArrayOfString2;
                  paramUri.cDC.crW = paramArrayOfString3;
                  paramUri.cDC.context = getContext();
                  if (!a.xxA.m(paramUri))
                  {
                    ab.e("MicroMsg.WXCommProvider", "handle scan result failed try again");
                    al.n(new WXCommProvider.3(this, paramUri), 200L);
                  }
                  paramUri = null;
                  AppMethodBeat.o(18175);
                  continue;
                  if (paramArrayOfString3.length > 0)
                  {
                    paramArrayOfString1 = "OpenSdkToken@" + bo.anU();
                    v.Zp().y(paramArrayOfString1, true).j("open_sdk_token_package_name", paramArrayOfString3[0]);
                    ab.i("MicroMsg.WXCommProvider", "gen token for opensdk ,package = %s", new Object[] { paramArrayOfString3[0] });
                    paramUri = new MatrixCursor(new String[] { "token" });
                    paramUri.addRow(new String[] { paramArrayOfString1 });
                    AppMethodBeat.o(18175);
                  }
                  else
                  {
                    paramUri = null;
                    AppMethodBeat.o(18175);
                  }
                }
              }
            }
          }
        }
      }
    }
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    AppMethodBeat.i(18176);
    int i;
    if (paramUri == null)
    {
      ab.e("MicroMsg.WXCommProvider", "delete fail, uri is null");
      AppMethodBeat.o(18176);
      i = 0;
    }
    while (true)
    {
      return i;
      i = ((Integer)new WXCommProvider.5(this, Integer.valueOf(0), paramUri, jDO.match(paramUri), aVj()).b(this.handler)).intValue();
      AppMethodBeat.o(18176);
    }
  }

  public String getType(Uri paramUri)
  {
    return null;
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    return null;
  }

  public boolean onCreate()
  {
    boolean bool = false;
    AppMethodBeat.i(18173);
    ab.d("MicroMsg.WXCommProvider", "onCreate");
    this.handler = new ak();
    ab.i("MicroMsg.WXCommProvider", "pid = " + Process.myPid() + ", tid : = " + Process.myTid());
    this.ehZ = getContext().getSharedPreferences(jDL, 0);
    getContext().registerReceiver(new WXCommProvider.1(this), new IntentFilter("com.tencent.mm.plugin.openapi.Intent.ACTION_REFRESH_WXAPP"));
    if (this.ehZ != null)
    {
      bool = true;
      AppMethodBeat.o(18173);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(18173);
    }
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    ??? = null;
    AppMethodBeat.i(18174);
    ab.i("MicroMsg.WXCommProvider", "uri:%s", new Object[] { paramUri });
    if (paramUri == null)
    {
      ab.e("MicroMsg.WXCommProvider", "query fail, uri is null return null");
      AppMethodBeat.o(18174);
    }
    String[] arrayOfString;
    for (paramUri = ???; ; paramUri = ???)
    {
      return paramUri;
      arrayOfString = aVj();
      if ((arrayOfString != null) && (arrayOfString.length > 0))
        break;
      ab.e("MicroMsg.WXCommProvider", "CallingPackages is null return null");
      AppMethodBeat.o(18174);
    }
    int i = jDO.match(paramUri);
    if ((WorkerProfile.Ca() == null) || (!WorkerProfile.Ca().cfM))
    {
      new ap(Looper.getMainLooper(), new WXCommProvider.2(this), true).ae(50L, 50L);
      try
      {
        synchronized (lock)
        {
          ab.i("MicroMsg.WXCommProvider", "Lock to wait for the first initialize of the Application.");
          if (!jDP)
            lock.wait();
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        ab.e("MicroMsg.WXCommProvider", "the lock may have some problem," + localInterruptedException.getMessage());
        ab.printErrStackTrace("MicroMsg.WXCommProvider", localInterruptedException, "", new Object[0]);
      }
    }
    while (true)
    {
      paramUri = a(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2, i, arrayOfString);
      AppMethodBeat.o(18174);
      break;
      jDP = false;
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    return 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.WXCommProvider
 * JD-Core Version:    0.6.2
 */