package com.tencent.mm.network;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import com.tencent.mars.comm.WakerLock;
import com.tencent.mars.mm.MMLogic;
import com.tencent.mars.stn.StnLogic;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.ay;
import com.tencent.mm.network.a.b;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.x.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bj;
import com.tencent.mm.sdk.platformtools.bo;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class t extends f.a
  implements a.a, e
{
  byte[] eJt;
  int fPj;
  int gcP;
  private long gcQ;
  private long gcR;
  private long gcS;
  private WakerLock gcT;
  public a gcU;
  a gcV;
  b gcW;
  long gcX;
  int gcY;
  private com.tencent.mm.storage.y gcZ;
  private s gda;
  private g gdb;
  h gdc;
  public ak handler;

  public t(ak paramak)
  {
    AppMethodBeat.i(58570);
    this.gcP = 0;
    this.gcQ = 0L;
    this.gcR = 0L;
    this.gcS = 0L;
    this.gcT = null;
    this.gcX = 0L;
    this.gcY = -1;
    this.fPj = 0;
    ak localak = paramak;
    if (paramak == null)
      localak = new ak();
    this.handler = localak;
    this.gcU = new a(this);
    this.gcT = new WakerLock(aa.getContext(), "MicroMsg.MMAutoAuth");
    this.gcV = new a(this, this.gcT);
    this.gcW = new b(this, this.gcT);
    this.gcZ = new com.tencent.mm.storage.y(com.tencent.mm.storage.ac.eSj + "autoauth.cfg");
    AppMethodBeat.o(58570);
  }

  private int b(r paramr, l paraml)
  {
    AppMethodBeat.i(58577);
    if (aa.anp().anc())
    {
      i = -1;
      AppMethodBeat.o(58577);
      return i;
    }
    com.tencent.mm.protocal.h localh = paramr.adt();
    a locala = new a(this);
    locala.setUsername(localh.getUserName());
    int i = aa.anp().a(paramr, paraml, locala, 0);
    if (i < 0)
      ab.e("MicroMsg.MMAutoAuth", "auth: net.send err");
    while (true)
    {
      AppMethodBeat.o(58577);
      break;
      ab.i("MicroMsg.MMAutoAuth", "auth: netid=".concat(String.valueOf(i)));
    }
  }

  public final int a(r paramr, l paraml)
  {
    try
    {
      AppMethodBeat.i(58576);
      this.gcT.lock(1000L, "MMAutoAuth.send");
      bj local7 = new com/tencent/mm/network/t$7;
      local7.<init>(this, Integer.valueOf(-1), paramr, paraml);
      int i = ((Integer)local7.b(this.handler)).intValue();
      AppMethodBeat.o(58576);
      return i;
    }
    finally
    {
      paramr = finally;
    }
    throw paramr;
  }

  public final int a(String paramString, boolean paramBoolean, List<String> paramList)
  {
    AppMethodBeat.i(58595);
    int i = MMLogic.getSnsIpsForSceneWithHostName(paramList, paramString, paramBoolean);
    AppMethodBeat.o(58595);
    return i;
  }

  public final int a(boolean paramBoolean, List<String> paramList)
  {
    AppMethodBeat.i(58594);
    int i = MMLogic.getSnsIpsForScene(paramList, paramBoolean);
    AppMethodBeat.o(58594);
    return i;
  }

  public final void a(final int paramInt1, final String paramString, final int paramInt2, final boolean paramBoolean)
  {
    AppMethodBeat.i(58599);
    this.gcT.lock(1000L, "MMAutoAuth.logUtil");
    new bj(paramInt1, paramInt2, paramString)
    {
      public final Object run()
      {
        AppMethodBeat.i(58555);
        Object localObject;
        if (paramInt1 == 3)
        {
          Date localDate = new Date();
          localDate.setTime(bo.anU() - 86400000L * paramInt2);
          localObject = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
          MMLogic.uploadFile(com.tencent.mm.compatible.util.e.eSo + "crash_" + ((SimpleDateFormat)localObject).format(localDate) + ".txt", paramString, "");
        }
        while (true)
        {
          AppMethodBeat.o(58555);
          return null;
          if (paramInt1 == 2)
          {
            ab.dot();
            int i = paramInt2;
            boolean bool = paramBoolean;
            localObject = paramString;
            MMLogic.uploadLog(new int[] { i }, bool, (String)localObject, "");
          }
          else
          {
            ab.dot();
          }
        }
      }
    }
    .b(this.handler);
    AppMethodBeat.o(58599);
  }

  public final void a(b paramb)
  {
    AppMethodBeat.i(58585);
    aa.ank().geg = paramb;
    AppMethodBeat.o(58585);
  }

  public final void a(g paramg)
  {
    this.gdb = paramg;
  }

  public final void a(h paramh)
  {
    this.gdc = paramh;
  }

  public final void a(o paramo)
  {
    AppMethodBeat.i(58603);
    aa.ans().gdH = paramo;
    AppMethodBeat.o(58603);
  }

  final void a(r paramr, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(58590);
    paramr.a(this.gcV, paramInt1, paramInt2);
    AppMethodBeat.o(58590);
  }

  public final void a(s params)
  {
    this.gda = params;
  }

  public final void a(com.tencent.mm.protocal.y paramy)
  {
    AppMethodBeat.i(58591);
    aa.anp().ane();
    AppMethodBeat.o(58591);
  }

  public final void a(boolean paramBoolean, String paramString1, String paramString2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt1, int paramInt2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(58580);
    this.gcT.lock(1000L, "MMAutoAuth.setIDCHostInfo");
    List localList = com.tencent.mm.protocal.o.akF(paramString2);
    Object localObject1 = com.tencent.mm.protocal.o.akF(paramString1);
    paramInt1 = ((List)localObject1).size();
    paramInt2 = localList.size();
    if (paramBoolean);
    for (Object localObject2 = "!!!!!CHANGE IDC NOW"; ; localObject2 = "false")
    {
      ab.d("MicroMsg.MMAutoAuth", "dkidc setIDCHostInfo short:[%s][%s](%d) long:[%s][%s](%d) reset:%s", new Object[] { paramString3, paramString1, Integer.valueOf(paramInt1), paramString4, paramString2, Integer.valueOf(paramInt2), localObject2 });
      paramString3 = new HashMap();
      localObject2 = localList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramString4 = (com.tencent.mm.protocal.o)((Iterator)localObject2).next();
        paramString2 = (ArrayList)paramString3.get(paramString4.host);
        paramString1 = paramString2;
        if (paramString2 == null)
        {
          paramString1 = new ArrayList();
          paramString3.put(paramString4.host, paramString1);
        }
        paramString1.add(paramString4.nJq);
      }
    }
    paramString4 = new HashMap();
    localObject2 = ((List)localObject1).iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject1 = (com.tencent.mm.protocal.o)((Iterator)localObject2).next();
      paramString2 = (ArrayList)paramString4.get(((com.tencent.mm.protocal.o)localObject1).host);
      paramString1 = paramString2;
      if (paramString2 == null)
      {
        paramString1 = new ArrayList();
        paramString4.put(((com.tencent.mm.protocal.o)localObject1).host, paramString1);
      }
      paramString1.add(((com.tencent.mm.protocal.o)localObject1).nJq);
    }
    new t.9(this, Integer.valueOf(-1), paramString3, paramString4, paramArrayOfInt2, paramArrayOfInt1).b(this.handler);
    AppMethodBeat.o(58580);
  }

  public final boolean acT()
  {
    if (this.gcP < 5);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final i adh()
  {
    return null;
  }

  public final void adi()
  {
    AppMethodBeat.i(58611);
    StnLogic.makesureLongLinkConnected();
    AppMethodBeat.o(58611);
  }

  public final void adj()
  {
    AppMethodBeat.i(58612);
    StnLogic.startNetworkAnalysis();
    AppMethodBeat.o(58612);
  }

  public final void amN()
  {
    AppMethodBeat.i(58583);
    this.gcT.lock(1000L, "MMAutoAuth.forceUpdateHostCache");
    new t.13(this, Integer.valueOf(-1)).b(this.handler);
    AppMethodBeat.o(58583);
  }

  public final i amO()
  {
    AppMethodBeat.i(58586);
    ac localac = aa.anl();
    AppMethodBeat.o(58586);
    return localac;
  }

  public final boolean amS()
  {
    boolean bool = false;
    AppMethodBeat.i(58578);
    if (90000L >= SystemClock.elapsedRealtime() - this.gcR)
    {
      ab.w("MicroMsg.MMAutoAuth", "auto limit lastSessionTimeout=%d, curtime=%d", new Object[] { Long.valueOf(this.gcR), Long.valueOf(SystemClock.elapsedRealtime()) });
      AppMethodBeat.o(58578);
    }
    while (true)
    {
      return bool;
      this.gcR = SystemClock.elapsedRealtime();
      a locala = this.gcU;
      int i = this.gcU.QF();
      locala.a(new byte[0], new byte[0], new byte[0], i);
      AppMethodBeat.o(58578);
      bool = true;
    }
  }

  final boolean amT()
  {
    boolean bool = true;
    AppMethodBeat.i(58587);
    if ((10001 == com.tencent.mm.platformtools.ae.giz) && (com.tencent.mm.platformtools.ae.giA > 0))
    {
      com.tencent.mm.platformtools.ae.giA = 0;
      amS();
    }
    if (this.gcU.adb())
      AppMethodBeat.o(58587);
    long l;
    while (true)
    {
      return bool;
      if (aa.anp().anc())
      {
        ab.i("MicroMsg.MMAutoAuth", "makeSureAuth hasAuthCmd ret false");
        AppMethodBeat.o(58587);
        bool = false;
      }
      else if (this.gcY != -1)
      {
        ab.w("MicroMsg.MMAutoAuth", "makeSureAuth auto limit now is getting cert, ret false");
        AppMethodBeat.o(58587);
        bool = false;
      }
      else
      {
        l = SystemClock.elapsedRealtime();
        if ((60000L >= l - this.gcQ) && (this.gcQ > 0L))
        {
          ab.w("MicroMsg.MMAutoAuth", "makeSureAuth auto limit lastAutoAuthtime=%d, curtime=%d, return false", new Object[] { Long.valueOf(this.gcQ), Long.valueOf(l) });
          AppMethodBeat.o(58587);
          bool = false;
        }
        else
        {
          if (!ah.getContext().getSharedPreferences("auth_hold_prefs", 0).getBoolean("auth_ishold", false))
            break;
          ab.i("MicroMsg.MMAutoAuth", "makeSureAuth AUTH_HOLD_KEY hold ret false");
          if (!aa.anp().and())
          {
            ab.e("MicroMsg.MMAutoAuth", "sendImp hit push hold, pid:%d, stack[%s]", new Object[] { Integer.valueOf(Process.myPid()), bo.dpG() });
            aa.anm().post(new Runnable()
            {
              public final void run()
              {
                AppMethodBeat.i(58553);
                ab.i("MicroMsg.MMAutoAuth", "makeSureAuth AUTH_HOLD_KEY hold  clearTaskAndCallback");
                aa.anp().i(4, -100, ah.getContext().getString(2131301295));
                AppMethodBeat.o(58553);
              }
            });
          }
          AppMethodBeat.o(58587);
          bool = false;
        }
      }
    }
    r localr = aa.anp().de(amV());
    if (localr != null);
    while (true)
    {
      try
      {
        if ((localr instanceof r.a))
        {
          if ((30000L >= l - this.gcS) && (this.gcS > 0L))
          {
            ab.i("MicroMsg.MMAutoAuth", "makeSureAuth session time out in push_notify mode, but hit limit");
            AppMethodBeat.o(58587);
            bool = false;
            break;
          }
          ab.i("MicroMsg.MMAutoAuth", "makeSureAuth session time out in push_notify mode, send broast to mm");
          this.gcS = SystemClock.elapsedRealtime();
          aa.anq().onPush(5, null);
          ab.i("MicroMsg.MMAutoAuth", "makeSureAuth at last ret false");
          AppMethodBeat.o(58587);
          bool = false;
          break;
        }
        this.gcQ = SystemClock.elapsedRealtime();
        ab.i("MicroMsg.MMAutoAuth", "makeSureAuth rest lastAutoAuthTime[%d]", new Object[] { Long.valueOf(this.gcQ) });
        a(localr, 3, 3);
        continue;
      }
      catch (RemoteException localRemoteException)
      {
        ab.e("MicroMsg.MMAutoAuth", "makeSureAuth exception:%s", new Object[] { bo.l(localRemoteException) });
        continue;
      }
      ab.i("MicroMsg.MMAutoAuth", "makeSureAuth getAutoAuthRR is null");
    }
  }

  public final byte[] amU()
  {
    Object localObject = null;
    AppMethodBeat.i(58592);
    if (!this.gcU.adb())
      AppMethodBeat.o(58592);
    while (true)
    {
      return localObject;
      x.a locala = new x.a();
      locala.uin = this.gcU.QF();
      locala.fIi = bo.anf(ah.getContext().getSharedPreferences("notify_sync_pref", com.tencent.mm.compatible.util.h.Mu()).getString("notify_sync_key_keybuf", ""));
      locala.netType = com.tencent.mm.protocal.a.getNetType(ah.getContext());
      locala.vyo = com.tencent.mm.protocal.a.dlZ();
      try
      {
        byte[] arrayOfByte = locala.ZT();
        this.eJt = locala.eJt;
        AppMethodBeat.o(58592);
        localObject = arrayOfByte;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.MMAutoAuth", "exception:%s", new Object[] { bo.l(localException) });
        AppMethodBeat.o(58592);
      }
    }
  }

  public final boolean amV()
  {
    boolean bool1 = false;
    AppMethodBeat.i(58604);
    boolean bool2;
    if (this.gda == null)
    {
      AppMethodBeat.o(58604);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      try
      {
        bool2 = this.gda.check();
        AppMethodBeat.o(58604);
      }
      catch (RemoteException localRemoteException)
      {
        AppMethodBeat.o(58604);
        bool2 = bool1;
      }
    }
  }

  public final void cF(boolean paramBoolean)
  {
    AppMethodBeat.i(58579);
    new t.8(this, Integer.valueOf(-1), paramBoolean).b(this.handler);
    AppMethodBeat.o(58579);
  }

  public final void cG(boolean paramBoolean)
  {
    AppMethodBeat.i(58608);
    if (com.tencent.mm.sdk.b.a.xxA == null)
    {
      ab.w("MicroMsg.MMAutoAuth", "loginevent but eventpool null, event:".concat(String.valueOf(paramBoolean)));
      AppMethodBeat.o(58608);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(58608);
    }
  }

  public final void cH(boolean paramBoolean)
  {
    AppMethodBeat.i(58609);
    com.tencent.mm.sdk.platformtools.aa.initLanguage(ah.getContext());
    AppMethodBeat.o(58609);
  }

  public final void cI(boolean paramBoolean)
  {
    AppMethodBeat.i(58610);
    ab.d("MicroMsg.MMAutoAuth", "summer setMMTLS enable[%b]", new Object[] { Boolean.valueOf(paramBoolean) });
    MMLogic.setMmtlsCtrlInfo(paramBoolean);
    AppMethodBeat.o(58610);
  }

  public final void cancel(int paramInt)
  {
    AppMethodBeat.i(58572);
    this.gcT.lock(1000L, String.format("MMAutoAuth.cancel,%d", new Object[] { Integer.valueOf(paramInt) }));
    new t.1(this, paramInt).b(this.handler);
    AppMethodBeat.o(58572);
  }

  public final void d(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(58581);
    this.gcT.lock(1000L, "MMAutoAuth.setFixedHost");
    ab.i("MicroMsg.MMAutoAuth", "dkidc setFixedHost debug short:%s:%s long:%s:%s", new Object[] { paramString1, paramString2, paramString3, paramString4 });
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString3)))
    {
      ab.w("MicroMsg.MMAutoAuth", "dkidc setFixedHost FAILED ! check assist");
      AppMethodBeat.o(58581);
    }
    while (true)
    {
      return;
      new t.10(this, Integer.valueOf(-1), paramString1, paramString2, paramString3, paramString4).b(this.handler);
      AppMethodBeat.o(58581);
    }
  }

  protected final void finalize()
  {
    AppMethodBeat.i(58571);
    reset();
    super.finalize();
    AppMethodBeat.o(58571);
  }

  public final int g(int paramInt, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(58598);
    paramInt = ae.anu().h(paramInt, paramArrayOfByte);
    AppMethodBeat.o(58598);
    return paramInt;
  }

  final boolean g(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(58589);
    int i;
    Object localObject1;
    boolean bool1;
    int j;
    String str1;
    String str2;
    Object localObject2;
    int k;
    int m;
    if (paramString1 == null)
    {
      i = -1;
      ab.i("MicroMsg.MMAutoAuth", "summerauths saveAAKAndCookieToSp aak[%s] uin[%s]", new Object[] { Integer.valueOf(i), Integer.valueOf(paramInt) });
      ah.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().remove("auth_ishold").commit();
      localObject1 = ah.getContext().getSharedPreferences("auth_info_key_prefs", com.tencent.mm.compatible.util.h.Mu());
      bool1 = ((SharedPreferences)localObject1).getBoolean("key_auth_info_prefs_created", false);
      i = ((SharedPreferences)localObject1).getInt("key_auth_update_version", 0);
      j = ((SharedPreferences)localObject1).getInt("_auth_uin", 0);
      str1 = ((SharedPreferences)localObject1).getString("_auth_key", "");
      str2 = ((SharedPreferences)localObject1).getString("server_id", "");
      localObject2 = ((SharedPreferences)localObject1).edit();
      ((SharedPreferences.Editor)localObject2).putBoolean("key_auth_info_prefs_created", true);
      ((SharedPreferences.Editor)localObject2).putInt("key_auth_update_version", d.vxo);
      ((SharedPreferences.Editor)localObject2).putInt("_auth_uin", paramInt);
      ((SharedPreferences.Editor)localObject2).putString("_auth_key", paramString1);
      ((SharedPreferences.Editor)localObject2).putString("server_id", paramString2);
      if (((SharedPreferences.Editor)localObject2).commit())
        break label500;
      ab.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 1th!");
      com.tencent.mm.plugin.report.e.pXa.a(148L, 36L, 1L, false);
      if (((SharedPreferences.Editor)localObject2).commit())
        break label500;
      ab.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 2nd!");
      com.tencent.mm.plugin.report.e.pXa.a(148L, 37L, 1L, false);
      bool2 = ((SharedPreferences)localObject1).getBoolean("key_auth_info_prefs_created", false);
      k = ((SharedPreferences)localObject1).getInt("key_auth_update_version", 0);
      m = ((SharedPreferences)localObject1).getInt("_auth_uin", 0);
      localObject2 = ((SharedPreferences)localObject1).getString("_auth_key", "");
      localObject1 = ((SharedPreferences)localObject1).getString("server_id", "");
      ab.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed 2th so ret false old vs new vs input create[%b, %b, %b] version[%d, %d, %d], uin[%d, %d, %d], aak[%s, %s, %s], cookie[%s, %s, %s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.TRUE, Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(d.vxo), Integer.valueOf(j), Integer.valueOf(m), Integer.valueOf(paramInt), str1, localObject2, paramString1, str2, localObject1, paramString2 });
      ab.dot();
      bool2 = false;
      AppMethodBeat.o(58589);
    }
    label500: boolean bool3;
    while (true)
    {
      return bool2;
      i = paramString1.length();
      break;
      bool3 = ((SharedPreferences)localObject1).getBoolean("key_auth_info_prefs_created", false);
      m = ((SharedPreferences)localObject1).getInt("key_auth_update_version", 0);
      k = ((SharedPreferences)localObject1).getInt("_auth_uin", 0);
      localObject2 = ((SharedPreferences)localObject1).getString("_auth_key", "");
      localObject1 = ((SharedPreferences)localObject1).getString("server_id", "");
      if ((bool3) && (m == d.vxo) && (k == paramInt) && (((String)localObject2).equals(paramString1)) && (((String)localObject1).equals(paramString2)))
        break label741;
      ab.e("MicroMsg.MMAutoAuth", "summerauth save aak & id commit failed check not equal so ret false old vs new vs input create[%b, %b, %b] version[%d, %d, %d], uin[%d, %d, %d], aak[%s, %s, %s], cookie[%s, %s, %s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool3), Boolean.TRUE, Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(d.vxo), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt), str1, localObject2, paramString1, str2, localObject1, paramString2 });
      ab.dot();
      bool2 = false;
      AppMethodBeat.o(58589);
    }
    label741: this.gcZ.doc();
    this.gcZ.set(1, Integer.valueOf(d.vxo));
    this.gcZ.set(2, Integer.valueOf(paramInt));
    this.gcZ.set(3, paramString1);
    this.gcZ.set(4, paramString2);
    this.gcZ.drZ();
    Boolean localBoolean = Boolean.TRUE;
    if (!this.gcZ.xIs);
    for (boolean bool2 = true; ; bool2 = false)
    {
      ab.i("MicroMsg.MMAutoAuth", "summerauth save aak & id ok old vs new vs input[%b, %b, %b, %b] version[%d, %d, %d. %d], uin[%d, %d, %d, %d], aak[%s, %s, %s, %s], cookie[%s, %s, %s, %s]", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool3), localBoolean, Boolean.valueOf(bool2), Integer.valueOf(i), Integer.valueOf(m), Integer.valueOf(d.vxo), (Integer)this.gcZ.get(1), Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(paramInt), (Integer)this.gcZ.get(2), str1, localObject2, paramString1, (String)this.gcZ.get(3), str2, localObject1, paramString2, (String)this.gcZ.get(4) });
      bool2 = true;
      AppMethodBeat.o(58589);
      break;
    }
  }

  public final int getHostByName(String paramString, List<String> paramList)
  {
    AppMethodBeat.i(58593);
    int i = MMLogic.getHostByName(paramString, paramList);
    AppMethodBeat.o(58593);
    return i;
  }

  public final String[] getIPsString(boolean paramBoolean)
  {
    AppMethodBeat.i(58574);
    String[] arrayOfString = MMLogic.getIPsString(paramBoolean);
    AppMethodBeat.o(58574);
    return arrayOfString;
  }

  public final String getIspId()
  {
    AppMethodBeat.i(58596);
    String str = MMLogic.getIspId();
    AppMethodBeat.o(58596);
    return str;
  }

  public final String getNetworkServerIp()
  {
    AppMethodBeat.i(58573);
    String str = MMLogic.getNetworkServerIp();
    AppMethodBeat.o(58573);
    return str;
  }

  final void h(int paramInt1, int paramInt2, String paramString)
  {
    AppMethodBeat.i(58588);
    ab.i("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail inErrType=" + paramInt1 + ", inErrCode=" + paramInt2 + ", errMsg=" + paramString + " stack=" + bo.dpG());
    if ((paramInt1 == 4) && (paramInt2 == -106))
      ab.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth should not be return MM_ERR_BLOCK_BY_SPAM trans to MM_ERR_AUTH_ANOTHERPLACE");
    for (int i = -100; ; i = paramInt2)
    {
      int j = i;
      int k = paramInt1;
      if (paramInt1 == 5)
      {
        j = i;
        k = paramInt1;
        if (paramInt2 == -13)
        {
          ab.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth should not be return MM_ERR_SESSIONTIMEOUT trans to MM_ERR_PASSWORD");
          k = 4;
          j = -3;
          com.tencent.mm.plugin.report.e.pXa.a(148L, 42L, 1L, false);
        }
      }
      i = k;
      if ((i != 6) || (paramInt2 != -10001))
      {
        k = j;
        paramInt1 = i;
        if (i == 5)
        {
          k = j;
          paramInt1 = i;
          if (paramInt2 == -13);
        }
      }
      else
      {
        ab.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth ENCODE ERROR check sp");
        Object localObject = ay.ZQ();
        String str = ((SharedPreferences)localObject).getString("_auth_key", "");
        localObject = ((SharedPreferences)localObject).getString("server_id", "");
        k = j;
        paramInt1 = i;
        if (bo.isNullOrNil(str))
        {
          k = j;
          paramInt1 = i;
          if (bo.isNullOrNil((String)localObject))
          {
            ab.e("MicroMsg.MMAutoAuth", "summerauth handleAutoAuthFail autoauth ENCODE ERROR check sp aak and cookie null logout");
            k = -104;
            com.tencent.mm.plugin.report.e.pXa.a(148L, 52L, 1L, false);
            paramInt1 = 4;
          }
        }
      }
      aa.anp().i(paramInt1, k, paramString);
      if ((paramInt1 == 4) && ((k == -100) || (k == -205) || (k == -213)))
      {
        ah.getContext().getSharedPreferences("auth_hold_prefs", 0).edit().putBoolean("auth_ishold", true).commit();
        reset();
      }
      AppMethodBeat.o(58588);
      return;
    }
  }

  public final void keepSignalling()
  {
    AppMethodBeat.i(58601);
    StnLogic.keepSignalling();
    AppMethodBeat.o(58601);
  }

  public final void mz(int paramInt)
  {
    AppMethodBeat.i(58605);
    if (this.gdb == null)
      AppMethodBeat.o(58605);
    while (true)
    {
      return;
      try
      {
        this.gdb.gi(paramInt);
        AppMethodBeat.o(58605);
      }
      catch (RemoteException localRemoteException)
      {
        ab.e("MicroMsg.MMAutoAuth", "exception:%s", new Object[] { bo.l(localRemoteException) });
        AppMethodBeat.o(58605);
      }
    }
  }

  public final void qs(String paramString)
  {
    AppMethodBeat.i(58584);
    this.gcT.lock(1000L, "MMAutoAuth.ipxxStatistics");
    new t.2(this, paramString).b(this.handler);
    AppMethodBeat.o(58584);
  }

  public final void qt(String paramString)
  {
    AppMethodBeat.i(58607);
    ab.e("MicroMsg.MMAutoAuth", "killPush %s", new Object[] { paramString });
    AppMethodBeat.o(58607);
  }

  public final void reportFailIp(String paramString)
  {
    AppMethodBeat.i(58606);
    MMLogic.reportFailIp(paramString);
    AppMethodBeat.o(58606);
  }

  public final void reset()
  {
    // Byte code:
    //   0: ldc_w 954
    //   3: invokestatic 63	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: getfield 73	com/tencent/mm/network/t:gcT	Lcom/tencent/mars/comm/WakerLock;
    //   10: ldc2_w 339
    //   13: ldc_w 956
    //   16: invokevirtual 346	com/tencent/mars/comm/WakerLock:lock	(JLjava/lang/String;)V
    //   19: new 14	com/tencent/mm/network/t$6
    //   22: dup
    //   23: aload_0
    //   24: invokespecial 957	com/tencent/mm/network/t$6:<init>	(Lcom/tencent/mm/network/t;)V
    //   27: aload_0
    //   28: getfield 84	com/tencent/mm/network/t:handler	Lcom/tencent/mm/sdk/platformtools/ak;
    //   31: invokevirtual 354	com/tencent/mm/sdk/platformtools/bj:b	(Lcom/tencent/mm/sdk/platformtools/ak;)Ljava/lang/Object;
    //   34: pop
    //   35: ldc_w 954
    //   38: invokestatic 141	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: return
  }

  public final void setHostInfo(String[] paramArrayOfString1, String[] paramArrayOfString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(58597);
    this.gcT.lock(1000L, "MMAutoAuth.setHostInfo");
    new t.4(this, paramArrayOfString1, paramArrayOfString2, paramArrayOfInt).b(this.handler);
    AppMethodBeat.o(58597);
  }

  public final void setNewDnsDebugHost(String paramString1, String paramString2)
  {
    AppMethodBeat.i(58582);
    if ((bo.isNullOrNil(paramString1)) && (bo.isNullOrNil(paramString2)))
    {
      ab.d("MicroMsg.MMAutoAuth", "setNewDnsDebugHost FAILED ! check assist");
      AppMethodBeat.o(58582);
    }
    while (true)
    {
      return;
      new t.11(this, paramString1, paramString2).b(this.handler);
      AppMethodBeat.o(58582);
    }
  }

  public final void setSignallingStrategy(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(58600);
    StnLogic.setSignallingStrategy(paramLong1, paramLong2);
    AppMethodBeat.o(58600);
  }

  public final void stopSignalling()
  {
    AppMethodBeat.i(58602);
    StnLogic.stopSignalling();
    AppMethodBeat.o(58602);
  }

  static final class a extends j.a
    implements l
  {
    private t ebz;
    private WakerLock gdy;
    private int gdz = 0;

    public a(t paramt, WakerLock paramWakerLock)
    {
      this.ebz = paramt;
      this.gdy = paramWakerLock;
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, r paramr, byte[] paramArrayOfByte)
    {
      AppMethodBeat.i(58567);
      if ((paramr.getType() == 252) || (paramr.getType() == 701))
      {
        ab.d("MicroMsg.MMAutoAuth", "summerauth IOnAutoAuth onGYNetEnd manual auth");
        if ((paramr.adu().ady() != 0) || (paramInt2 != 0))
          break label233;
        if (paramr.adv() != 2)
          break label213;
        com.tencent.mm.plugin.report.e.pXa.a(148L, 28L, 1L, false);
        this.gdz += 1;
        if (this.gdz > 1)
        {
          ab.w("MicroMsg.MMAutoAuth", "summerauth manualLoginDecodeFailedTry beyond 1 no more try!");
          this.ebz.h(paramInt2, paramInt3, "auth_decode_failed_" + bo.bc(paramString, ""));
        }
      }
      else
      {
        if ((paramr.adu().ady() == 0) && (paramInt2 == 0))
          break label372;
        if (-102 != paramInt3)
          break label272;
        this.ebz.gcY = paramInt1;
        paramr.a(this.ebz.gcU, this.ebz.gcW, 0, 0);
        AppMethodBeat.o(58567);
      }
      while (true)
      {
        return;
        paramr.a(this, 0, 0);
        break;
        label213: this.gdz = 0;
        paramr.a(this, paramInt2, paramInt3, paramString);
        break;
        label233: paramArrayOfByte = com.tencent.mm.plugin.report.e.pXa;
        if (-102 == paramInt3);
        for (long l = 30L; ; l = 29L)
        {
          paramArrayOfByte.a(148L, l, 1L, false);
          break;
        }
        label272: if (-301 == paramInt3)
          paramr.a(this, paramInt2, paramInt3, paramString);
        while (true)
        {
          this.ebz.h(paramInt2, paramInt3, "autoauth_errmsg_" + bo.bc(paramString, ""));
          AppMethodBeat.o(58567);
          break;
          if (-105 == paramInt3)
            paramr.a(this, paramInt2, paramInt3, paramString);
          else if (-17 == paramInt3)
            paramr.a(this, paramInt2, paramInt3, paramString);
        }
        label372: paramr.a(this, paramInt2, paramInt3, paramString);
        AppMethodBeat.o(58567);
      }
    }

    public final void a(r paramr, int paramInt1, int paramInt2, String paramString)
    {
      AppMethodBeat.i(58566);
      this.gdy.lock(1000L, "MMAutoAuth.IOnAutoAuth.onAutoAuth");
      new t.a.1(this, paramr, paramInt1, paramInt2, paramString).b(this.ebz.handler);
      AppMethodBeat.o(58566);
    }
  }

  static final class b extends j.a
    implements l
  {
    private t ebz;
    private WakerLock gdy;

    public b(t paramt, WakerLock paramWakerLock)
    {
      this.ebz = paramt;
      this.gdy = paramWakerLock;
    }

    public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, r paramr, byte[] paramArrayOfByte)
    {
    }

    public final void a(r paramr, int paramInt1, int paramInt2, String paramString)
    {
      AppMethodBeat.i(58569);
      this.gdy.lock(1000L, "MMAutoAuth.IOnGetCert.onAutoAuth");
      new t.b.1(this, paramr, paramInt1, paramInt2).b(this.ebz.handler);
      AppMethodBeat.o(58569);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.network.t
 * JD-Core Version:    0.6.2
 */