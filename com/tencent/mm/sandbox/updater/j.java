package com.tencent.mm.sandbox.updater;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.c.i.a;
import com.tencent.mm.protocal.d;
import com.tencent.mm.protocal.protobuf.btd;
import com.tencent.mm.sandbox.b.a;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class j
  implements a, g
{
  public int cDq;
  public byte[] cPB;
  public int cdh;
  public String cdj;
  public String cvZ;
  public String desc;
  public byte[] gcA;
  public byte[] gcE;
  private Intent intent;
  protected Context mContext;
  private Notification oHJ;
  public int rlf;
  public int size;
  public int uin;
  public String[] xvX;
  public int xvw;
  com.tencent.mm.sandbox.monitor.c xwO;
  ArrayList<g> xwP;
  public String[] xwQ;
  public String xwR;
  public com.tencent.mm.c.i xwS;
  public i.a xwT;
  public boolean xwU;
  public boolean xwV;
  public boolean xwW;
  public String xwX;
  public boolean xwY;
  boolean xwZ;
  long xxa;
  f xxb;
  private long xxc;
  private b.a xxd;

  private j()
  {
    AppMethodBeat.i(28957);
    this.xwO = null;
    this.xwP = new ArrayList(1);
    this.cDq = d.vxo;
    this.xwU = false;
    this.xwV = false;
    this.xwW = false;
    this.xwY = false;
    this.xwZ = false;
    this.intent = null;
    this.oHJ = null;
    this.mContext = null;
    this.xxb = new f(this);
    this.xxc = -1L;
    this.xxd = new b.a()
    {
      public final void b(int paramAnonymousInt1, int paramAnonymousInt2, btd paramAnonymousbtd)
      {
        AppMethodBeat.i(28953);
        j.this.xwZ = false;
        j.this.xxb.stop();
        j.this.xxa = System.currentTimeMillis();
        if (j.this.xwO == null)
        {
          j.this.aB(2, true);
          AppMethodBeat.o(28953);
        }
        while (true)
        {
          return;
          if ((paramAnonymousInt1 == 200) && (paramAnonymousInt2 == 0))
          {
            ab.i("MicroMsg.UpdaterManager", "packCallback onSceneEnd ok");
            if (j.this.rlf != 2)
              j.a(j.this, 100, 100);
            if (j.this.xwU)
            {
              i.ap(j.this.mContext, 0);
              paramAnonymousbtd = MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "yyb_pkg_sig_prefs", com.tencent.mm.compatible.util.h.Mu());
              j.this.xwR = paramAnonymousbtd.getString(ah.getPackageName(), "");
              ab.i("MicroMsg.UpdaterManager", "summertoken downloadsuccess onSceneEnd sig[%s], path[%s]", new Object[] { j.this.xwR, j.this.xwO.dne() });
              if (bo.isNullOrNil(j.this.xwR))
                break label456;
            }
            while (true)
            {
              try
              {
                paramAnonymousbtd = new java/io/File;
                paramAnonymousbtd.<init>(j.this.xwO.dne());
                com.tencent.mm.c.c.c(paramAnonymousbtd, j.this.xwR);
                ab.i("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode done");
                com.tencent.mm.plugin.report.service.h.pYm.a(322L, 6L, 1L, false);
                com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4006), j.this.xwR });
                if (j.this.rlf != 1)
                  break label495;
                i.aq(j.this.mContext, 8);
                j.a(j.this);
                j.this.YJ(j.this.xwO.dne());
                if (j.this.xwY)
                {
                  com.tencent.mm.plugin.report.service.h.pYm.a(614L, 58L, 1L, false);
                  ab.d("MicroMsg.UpdaterManager", "boots download success.");
                }
                i.dnA();
                AppMethodBeat.o(28953);
                break;
                i.ap(j.this.mContext, 9);
              }
              catch (Exception paramAnonymousbtd)
              {
                ab.w("MicroMsg.UpdaterManager", "summertoken downloadsuccess writeSecurityCode e: " + paramAnonymousbtd.getMessage());
                com.tencent.mm.plugin.report.service.h.pYm.a(322L, 7L, 1L, false);
                com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4007), paramAnonymousbtd.getMessage() });
                continue;
              }
              label456: com.tencent.mm.plugin.report.service.h.pYm.a(322L, 8L, 1L, false);
              com.tencent.mm.plugin.report.service.h.pYm.e(11098, new Object[] { Integer.valueOf(4008) });
              continue;
              label495: if (j.this.rlf == 0)
              {
                j.this.YJ(j.this.xwO.dne());
              }
              else if (j.this.rlf == 2)
              {
                i.aq(j.this.mContext, 1);
                j.a(j.this);
              }
            }
          }
          if (paramAnonymousInt2 != -13)
            break;
          ab.e("MicroMsg.UpdaterManager", "session timeout, killself and restart");
          UpdaterService.ev();
          AppUpdaterUI.dni();
          i.dnz();
          AppMethodBeat.o(28953);
        }
        if (((j.this.xwO instanceof c)) && (j.this.xvw != 4))
        {
          ab.e("MicroMsg.UpdaterManager", "download package from cdn error.");
          if (j.this.xwU)
          {
            if ((paramAnonymousInt1 == 3) || (paramAnonymousInt1 == 4) || (paramAnonymousInt1 == 2) || (paramAnonymousInt1 == 1) || (paramAnonymousInt1 == 13))
              i.ap(j.this.mContext, paramAnonymousInt1);
            j.this.xwU = false;
            if (j.this.rlf == 1)
              if (j.this.xwY)
              {
                ab.d("MicroMsg.UpdaterManager", "boots download failed. %d", new Object[] { Integer.valueOf(paramAnonymousInt1) });
                switch (paramAnonymousInt1)
                {
                default:
                case 3:
                case 4:
                case 2:
                case 1:
                case 13:
                }
              }
          }
        }
        while (true)
        {
          j.this.a(j.this.xwO);
          AppMethodBeat.o(28953);
          break;
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 52L, 1L, false);
          continue;
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 53L, 1L, false);
          continue;
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 54L, 1L, false);
          continue;
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 51L, 1L, false);
          continue;
          com.tencent.mm.plugin.report.service.h.pYm.a(614L, 55L, 1L, false);
          continue;
          j.b(j.this);
          continue;
          if (j.this.rlf == 0)
          {
            j.this.aB(1, true);
          }
          else if (j.this.rlf == 2)
          {
            j.c(j.this);
            continue;
            j localj = j.this;
            paramAnonymousInt1 = j.this.size;
            String str = j.this.cvZ;
            int i = j.this.xvw;
            paramAnonymousInt2 = j.this.uin;
            byte[] arrayOfByte = j.this.gcA;
            paramAnonymousbtd = j.this.cPB;
            String[] arrayOfString = j.this.xwQ;
            if (j.this.rlf == 2);
            for (boolean bool = true; ; bool = false)
            {
              localj.xwO = new b(paramAnonymousInt1, str, i, paramAnonymousInt2, arrayOfByte, paramAnonymousbtd, arrayOfString, bool);
              j.d(j.this);
              break;
            }
            ab.e("MicroMsg.UpdaterManager", "update failed");
            i.ap(j.this.mContext, 10);
            if (j.this.rlf == 1)
              j.e(j.this);
            else if (j.this.rlf == 0)
              j.this.aB(1, true);
          }
        }
      }

      public final void dN(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        AppMethodBeat.i(28952);
        ab.i("MicroMsg.UpdaterManager", "total=%d, offset=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (j.this.rlf != 2)
          j.a(j.this, paramAnonymousInt2, paramAnonymousInt1);
        j.this.dN(paramAnonymousInt1, paramAnonymousInt2);
        AppMethodBeat.o(28952);
      }

      public final void mm(long paramAnonymousLong)
      {
        AppMethodBeat.i(28954);
        f localf = j.this.xxb;
        localf.che.post(new f.2(localf, paramAnonymousLong));
        AppMethodBeat.o(28954);
      }

      public final void mn(long paramAnonymousLong)
      {
        AppMethodBeat.i(28955);
        f localf = j.this.xxb;
        localf.che.post(new f.3(localf, paramAnonymousLong));
        AppMethodBeat.o(28955);
      }
    };
    this.mContext = ah.getContext();
    AppMethodBeat.o(28957);
  }

  private void dnD()
  {
    AppMethodBeat.i(28966);
    MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "system_config_prefs", 0).edit().putLong("recomended_update_ignore", bo.anT() - 86400L).commit();
    aB(2, true);
    dnk();
    AppMethodBeat.o(28966);
  }

  private void dnE()
  {
    AppMethodBeat.i(28967);
    MultiProcessSharedPreferences.getSharedPreferences(ah.getContext(), "system_config_prefs", 0).edit().putLong("recomended_update_ignore", bo.anT() - 86400L).commit();
    aB(2, true);
    dnl();
    AppMethodBeat.o(28967);
  }

  private void dnF()
  {
    AppMethodBeat.i(28968);
    if ((this.rlf == 2) && (!at.isWifi(this.mContext)))
    {
      i.dny();
      ab.i("MicroMsg.UpdaterManager", "we stop download, when silence and not wifi!");
      AppMethodBeat.o(28968);
    }
    while (true)
    {
      return;
      if ((this.rlf == 2) && (f.amb(this.cvZ)))
      {
        ab.e("MicroMsg.UpdaterManager", "the traffice is overload, not download anymore in silence mode!");
        this.xxb.stop();
        AppMethodBeat.o(28968);
      }
      else
      {
        this.xxb.ee(this.cvZ, this.size);
        if (this.xwO != null)
        {
          aB(1, false);
          this.xwZ = true;
          this.xwO.a(this.xxd);
          cpu();
          if (this.rlf == 2)
            i.dny();
        }
        AppMethodBeat.o(28968);
      }
    }
  }

  private void dnG()
  {
    AppMethodBeat.i(28969);
    cancel();
    ab.i("MicroMsg.UpdaterManager", "downloadFullPack");
    i.ap(this.mContext, 7);
    if ((this.xvX != null) && (this.xvX.length > 0))
    {
      i = this.size;
      localObject = this.cvZ;
      j = this.xvw;
      arrayOfString = this.xvX;
      if (this.rlf == 2);
      for (bool = true; ; bool = false)
      {
        this.xwO = new c(i, (String)localObject, j, arrayOfString, bool);
        com.tencent.mm.plugin.report.service.h.pYm.a(405L, 76L, 1L, true);
        dnF();
        AppMethodBeat.o(28969);
        return;
      }
    }
    int j = this.size;
    String str = this.cvZ;
    int k = this.xvw;
    int i = this.uin;
    Object localObject = this.gcA;
    byte[] arrayOfByte = this.cPB;
    String[] arrayOfString = this.xwQ;
    if (this.rlf == 2);
    for (boolean bool = true; ; bool = false)
    {
      this.xwO = new b(j, str, k, i, (byte[])localObject, arrayOfByte, arrayOfString, bool);
      com.tencent.mm.plugin.report.service.h.pYm.a(405L, 77L, 1L, true);
      break;
    }
  }

  private void pe(boolean paramBoolean)
  {
    boolean bool = true;
    AppMethodBeat.i(28962);
    ab.i("MicroMsg.UpdaterManager", "download() isWifiRetry %s", new Object[] { Boolean.valueOf(paramBoolean) });
    ab.i("MicroMsg.UpdaterManager", "summerupdate download() downloadMode %s downloading %s", new Object[] { Integer.valueOf(this.rlf), Boolean.valueOf(this.xwZ) });
    if (this.intent == null)
    {
      ab.e("MicroMsg.UpdaterManager", "download() haven't handleCommand");
      AppMethodBeat.o(28962);
    }
    while (true)
    {
      return;
      if (this.xwZ)
      {
        ab.i("MicroMsg.UpdaterManager", "download() downloading, duplicate download request");
        AppMethodBeat.o(28962);
      }
      else if (!com.tencent.mm.compatible.util.h.getExternalStorageState().equals("mounted"))
      {
        ab.e("MicroMsg.UpdaterManager", "no sdcard.");
        dnD();
        AppMethodBeat.o(28962);
      }
      else
      {
        if ((this.rlf == 2) && (!paramBoolean))
          i.aq(this.mContext, 0);
        String str1 = com.tencent.mm.sandbox.monitor.c.RP(this.cvZ);
        ab.i("MicroMsg.UpdaterManager", str1);
        if (str1 != null)
        {
          ab.i("MicroMsg.UpdaterManager", "update package already exist.");
          aB(1, true);
          YJ(str1);
          if ((this.rlf == 2) && (!i.amc(this.cvZ)))
            i.a(this.cvZ, this.xwR, this.desc, this.size, this.rlf, this.xvw, this.xwX);
          AppMethodBeat.o(28962);
        }
        else
        {
          if (this.xwW)
          {
            if (this.xwO != null)
              this.xwO.deleteTempFile();
            i.ap(this.mContext, 11);
          }
          if ((!this.xwW) && (this.xwU) && (this.xwS != null) && (this.xwT != null))
          {
            ab.i("MicroMsg.UpdaterManager", "Incresment Update");
            i.ap(this.mContext, 5);
            if (!com.tencent.mm.compatible.util.f.eW(this.size + this.xwT.size))
            {
              dnE();
              AppMethodBeat.o(28962);
            }
            else
            {
              cancel();
              int i = this.xwT.size;
              String str2 = this.cvZ;
              int j = this.xvw;
              String str3 = this.xwS.cdu + this.xwT.url;
              str1 = this.xwT.cdy;
              String str4 = this.xwT.cdx;
              if (this.rlf == 2);
              for (paramBoolean = bool; ; paramBoolean = false)
              {
                this.xwO = new c(i, str2, j, str3, str1, str4, paramBoolean);
                dnF();
                AppMethodBeat.o(28962);
                break;
              }
            }
          }
          else if (!com.tencent.mm.compatible.util.f.eW(this.size))
          {
            ab.e("MicroMsg.UpdaterManager", "SDCard is full");
            dnE();
            AppMethodBeat.o(28962);
          }
          else
          {
            dnG();
            AppMethodBeat.o(28962);
          }
        }
      }
    }
  }

  private void reset()
  {
    AppMethodBeat.i(28965);
    cancel();
    this.cdh = 0;
    this.cdj = null;
    this.xwQ = null;
    this.cDq = d.vxo;
    this.xvw = 0;
    this.gcA = null;
    this.cPB = null;
    this.gcE = null;
    this.uin = 0;
    this.cvZ = null;
    this.size = 0;
    this.desc = null;
    this.xvX = null;
    this.xwS = null;
    this.xwT = null;
    this.xwU = false;
    this.xwV = false;
    this.rlf = 0;
    this.xwW = false;
    this.intent = null;
    this.xwZ = false;
    this.oHJ = null;
    this.xxc = 0L;
    AppMethodBeat.o(28965);
  }

  public final void YJ(String paramString)
  {
    AppMethodBeat.i(28972);
    Iterator localIterator = this.xwP.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).YJ(paramString);
    AppMethodBeat.o(28972);
  }

  public final void a(com.tencent.mm.sandbox.monitor.c paramc)
  {
    AppMethodBeat.i(28973);
    Iterator localIterator = this.xwP.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).a(paramc);
    AppMethodBeat.o(28973);
  }

  public final void aB(final int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(28963);
    this.xwV = paramBoolean;
    new ak().postDelayed(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(28951);
        ((NotificationManager)j.this.mContext.getSystemService("notification")).cancel(99);
        ab.d("MicroMsg.UpdaterManager", "finishType == " + paramInt);
        if ((paramInt == 2) && (j.this.xvw == 1))
        {
          Intent localIntent = new Intent();
          localIntent.setAction("com.tencent.mm.sandbox.updater.intent.ACTION_EXIT_APP");
          j.this.mContext.sendBroadcast(localIntent, "com.tencent.mm.permission.MM_MESSAGE");
        }
        AppMethodBeat.o(28951);
      }
    }
    , 300L);
    AppMethodBeat.o(28963);
  }

  public final boolean aJ(Intent paramIntent)
  {
    AppMethodBeat.i(28959);
    boolean bool = aK(paramIntent);
    ab.i("MicroMsg.UpdaterManager", "summerupdate handleCommand(Intent intent) ret need download[%b]", new Object[] { Boolean.valueOf(bool) });
    if (bool)
      pe(false);
    AppMethodBeat.o(28959);
    return bool;
  }

  public final boolean aK(Intent paramIntent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(28960);
    ab.i("MicroMsg.UpdaterManager", "handleCommand(Intent intent)");
    if (paramIntent == null)
    {
      ab.i("MicroMsg.UpdaterManager", "intent == null");
      AppMethodBeat.o(28960);
      bool1 = false;
    }
    String str;
    Object localObject;
    while (true)
    {
      return bool1;
      int i = paramIntent.getIntExtra("intent_update_type", 3);
      int j = paramIntent.getIntExtra("intent_extra_download_mode", 1);
      str = paramIntent.getStringExtra("intent_extra_md5");
      if ((this.xwZ) && (!str.equalsIgnoreCase(this.cvZ)) && (this.rlf == 2))
        cancel();
      while (!this.xwZ)
      {
        i.dnA();
        reset();
        this.intent = paramIntent;
        this.cdh = paramIntent.getIntExtra("intent_extra_updateMode", 0);
        this.cdj = paramIntent.getStringExtra("intent_extra_marketUrl");
        this.xwQ = paramIntent.getStringArrayExtra("intent_short_ips");
        this.cDq = paramIntent.getIntExtra("intent_client_version", d.vxo);
        d.vxo = this.cDq;
        this.xvw = i;
        this.gcA = paramIntent.getByteArrayExtra("intent_extra_session");
        this.cPB = paramIntent.getByteArrayExtra("intent_extra_cookie");
        this.gcE = paramIntent.getByteArrayExtra("intent_extra_ecdhkey");
        this.uin = paramIntent.getIntExtra("intent_extra_uin", 0);
        this.cvZ = str;
        this.desc = paramIntent.getStringExtra("intent_extra_desc");
        this.size = paramIntent.getIntExtra("intent_extra_size", 0);
        this.xvX = paramIntent.getStringArrayExtra("intent_extra_download_url");
        this.rlf = j;
        this.xwW = paramIntent.getBooleanExtra("intent_extra_force_download_full", false);
        localObject = paramIntent.getStringExtra("intent_extra_patchInfo");
        if (localObject != null)
        {
          ab.i("MicroMsg.UpdaterManager", "patchXml != null");
          this.xwS = com.tencent.mm.c.i.cO((String)localObject);
        }
        localObject = paramIntent.getStringExtra("intent_extra_extinfo");
        ab.d("MicroMsg.UpdaterManager", "summerupdate extInfo[%s]", new Object[] { localObject });
        if (!bo.isNullOrNil((String)localObject))
        {
          this.xwX = ((String)br.z((String)localObject, "extinfo").get(".extinfo.notautodownloadrange"));
          ab.i("MicroMsg.UpdaterManager", "summerupdate notAutoDownloadRange[%s]", new Object[] { this.xwX });
        }
        ab.i("MicroMsg.UpdaterManager", "summerupdate handleCommand() downloadMode %s downloading %s", new Object[] { Integer.valueOf(j), Boolean.valueOf(this.xwZ) });
        if ((i != 999) || (this.xvX == null) || (this.xvX.length <= 0))
          break label486;
        if (j == 2)
          ab.e("MicroMsg.UpdaterManager", "error! DOWNLOAD_MODE_SLIENCE download don't go here! we must process it before start download");
        AppMethodBeat.o(28960);
        break;
      }
      ab.i("MicroMsg.UpdaterManager", "downloading, duplicate download request");
      AppMethodBeat.o(28960);
      continue;
      label486: if (this.xvX != null)
      {
        localObject = this.xvX;
        int k = localObject.length;
        for (j = 0; j < k; j++)
          ab.i("MicroMsg.UpdaterManager", "download url : ".concat(String.valueOf(localObject[j])));
      }
      ab.i("MicroMsg.UpdaterManager", "md5 = %s , size = %s", new Object[] { str, Integer.valueOf(this.size) });
      if ((str == null) || (this.size == 0))
      {
        AppMethodBeat.o(28960);
        bool1 = false;
      }
      else
      {
        if (i != 2)
          break;
        boolean bool2 = com.tencent.mm.modelcontrol.b.rR(this.xwX);
        ab.i("MicroMsg.UpdaterManager", "summerupdate handleCommandWithoutDownload recommended control[%b]", new Object[] { Boolean.valueOf(bool2) });
        if (!bool2)
          break;
        com.tencent.mm.plugin.report.service.h.pYm.a(405L, 78L, 1L, true);
        AppMethodBeat.o(28960);
        bool1 = false;
      }
    }
    if (this.xwS != null)
    {
      ab.i("MicroMsg.UpdaterManager", "patchInfo != null");
      localObject = com.tencent.mm.pluginsdk.f.i.fN(this.mContext);
      this.xwT = this.xwS.cN((String)localObject);
      StringBuilder localStringBuilder = new StringBuilder("increase apkMD5 = ").append((String)localObject).append(" : ");
      if (this.xwT == null)
      {
        localObject = "not match";
        label729: ab.i("MicroMsg.UpdaterManager", (String)localObject);
      }
    }
    else
    {
      ab.i("MicroMsg.UpdaterManager", "forceDownloadFull : %s", new Object[] { Boolean.valueOf(this.xwW) });
      this.xwY = paramIntent.getBooleanExtra("intent_extra_tinker_patch", false);
      if (((this.xwT == null) || (com.tencent.mm.sandbox.monitor.c.alZ(str))) && (!this.xwY))
        break label856;
      ab.i("MicroMsg.UpdaterManager", "isIncresmentUpdate");
      this.xwU = true;
    }
    while (true)
    {
      paramIntent = i.dhU();
      if ((!bo.isNullOrNil(paramIntent)) && (!paramIntent.equals(str)))
        i.dnB();
      AppMethodBeat.o(28960);
      break;
      localObject = "match";
      break label729;
      label856: ab.i("MicroMsg.UpdaterManager", "had try to download full pack.");
    }
  }

  public final void cancel()
  {
    AppMethodBeat.i(28964);
    if (this.xwO != null)
    {
      this.xwZ = false;
      this.xwO.cancel();
      this.xwO = null;
      this.xxa = System.currentTimeMillis();
      this.xxb.stop();
    }
    AppMethodBeat.o(28964);
  }

  public final void cpu()
  {
    AppMethodBeat.i(28971);
    Iterator localIterator = this.xwP.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).cpu();
    AppMethodBeat.o(28971);
  }

  public final void dN(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(28970);
    Iterator localIterator = this.xwP.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).dN(paramInt1, paramInt2);
    AppMethodBeat.o(28970);
  }

  public final void dnC()
  {
    AppMethodBeat.i(138618);
    pe(false);
    AppMethodBeat.o(138618);
  }

  public final void dnk()
  {
    AppMethodBeat.i(28974);
    Iterator localIterator = this.xwP.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).dnk();
    AppMethodBeat.o(28974);
  }

  public final void dnl()
  {
    AppMethodBeat.i(28975);
    Iterator localIterator = this.xwP.iterator();
    while (localIterator.hasNext())
      ((g)localIterator.next()).dnl();
    AppMethodBeat.o(28975);
  }

  public final boolean isBusy()
  {
    boolean bool = false;
    AppMethodBeat.i(28976);
    if ((this.xwZ) || (System.currentTimeMillis() - this.xxa <= UpdaterService.xxj))
    {
      ab.i("MicroMsg.UpdaterManager", "dont stop, because of updateManager.isDownloading() %s / updateManager.getIdleTimestamp() %s / System.currentTimeMillis() - updateManager.getIdleTimestamp() %s", new Object[] { Boolean.valueOf(this.xwZ), Long.valueOf(this.xxa), Long.valueOf(System.currentTimeMillis() - this.xxa) });
      AppMethodBeat.o(28976);
      bool = true;
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.UpdaterManager", "not busy");
      AppMethodBeat.o(28976);
    }
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(28977);
    ab.i("MicroMsg.UpdaterManager", "onDestroy");
    if (!this.xwZ)
    {
      reset();
      aB(1, true);
    }
    AppMethodBeat.o(28977);
  }

  public final void pc(boolean paramBoolean)
  {
    AppMethodBeat.i(28958);
    ab.i("MicroMsg.UpdaterManager", "summerupdate setNetStatChanged isWifi %s", new Object[] { Boolean.valueOf(paramBoolean) });
    f localf = this.xxb;
    if (localf.mgU != paramBoolean)
    {
      localf.pd(true);
      localf.mgU = paramBoolean;
    }
    if ((this.rlf != 2) || (this.xwZ))
    {
      ab.i("MicroMsg.UpdaterManager", "downloadMode %s downloading %s", new Object[] { Integer.valueOf(this.rlf), Boolean.valueOf(this.xwZ) });
      AppMethodBeat.o(28958);
    }
    while (true)
    {
      return;
      if (paramBoolean)
      {
        if (aK(this.intent))
        {
          pe(true);
          AppMethodBeat.o(28958);
        }
      }
      else
      {
        if (this.xwZ)
          cancel();
        AppMethodBeat.o(28958);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.j
 * JD-Core Version:    0.6.2
 */