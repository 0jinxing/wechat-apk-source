package com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.md;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.bakoldlogic.d.b.a;
import com.tencent.mm.plugin.backup.g.b.d;
import com.tencent.mm.plugin.backup.i.q;
import com.tencent.mm.plugin.backup.i.s;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public final class e
  implements b.d
{
  public e.c jzA;
  public e.a jzB;
  public e.e jzC;
  public d jzD;
  public f jzE;
  com.tencent.mm.plugin.backup.bakoldlogic.c.e jzF;
  private com.tencent.mm.plugin.backup.bakoldlogic.bakoldmodel.a jzG;
  public int jzH;
  public String jzI;
  public String jzJ;
  public int jzK;
  public int jzL;
  private boolean jzM;
  private e.d jzs;

  public e()
  {
    AppMethodBeat.i(17843);
    this.jzD = new d();
    this.jzE = new f();
    this.jzH = -1;
    this.jzK = -1;
    this.jzL = 1;
    this.jzM = false;
    AppMethodBeat.o(17843);
  }

  public static void a(int paramInt1, int paramInt2, s params)
  {
    AppMethodBeat.i(17852);
    com.tencent.mm.plugin.backup.i.ac localac = new com.tencent.mm.plugin.backup.i.ac();
    localac.jBh = paramInt1;
    localac.jBT = paramInt2;
    localac.jCO = params;
    try
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", "send cmd resp, status:%d, cmd:%d (%s)", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1), rG(paramInt1) });
      com.tencent.mm.plugin.backup.g.b.K(localac.toByteArray(), 4);
      AppMethodBeat.o(17852);
      return;
    }
    catch (Exception params)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.BakPcProcessMgr", params, "buf to PacketCommandResponse err", new Object[0]);
        AppMethodBeat.o(17852);
      }
    }
  }

  public static void aUL()
  {
    AppMethodBeat.i(17849);
    Intent localIntent = new Intent().setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
    localIntent.addFlags(335544320);
    localIntent.putExtra("nofification_type", "back_to_pcmgr_error_notification");
    ah.getContext().startActivity(localIntent);
    AppMethodBeat.o(17849);
  }

  public static void aUN()
  {
    AppMethodBeat.i(17855);
    md localmd = new md();
    com.tencent.mm.sdk.b.a.xxA.m(localmd);
    AppMethodBeat.o(17855);
  }

  public static void rF(int paramInt)
  {
    AppMethodBeat.i(17853);
    com.tencent.mm.plugin.backup.i.ab localab = new com.tencent.mm.plugin.backup.i.ab();
    localab.jBh = paramInt;
    try
    {
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", "sendNormalReq cmd :%d (%s)", new Object[] { Integer.valueOf(paramInt), rG(paramInt) });
      com.tencent.mm.plugin.backup.g.b.K(localab.toByteArray(), 3);
      AppMethodBeat.o(17853);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException, "buf to PacketCommandRequest err", new Object[0]);
        AppMethodBeat.o(17853);
      }
    }
  }

  private static String rG(int paramInt)
  {
    AppMethodBeat.i(17856);
    String str;
    switch (paramInt)
    {
    default:
      str = String.valueOf(paramInt);
      AppMethodBeat.o(17856);
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case -1:
    }
    while (true)
    {
      return str;
      str = "AUTHORIZE";
      AppMethodBeat.o(17856);
      continue;
      str = "BACKUP_INFO";
      AppMethodBeat.o(17856);
      continue;
      str = "RESTORE_INFO";
      AppMethodBeat.o(17856);
      continue;
      str = "BACKUP_START";
      AppMethodBeat.o(17856);
      continue;
      str = "BACKUP_CANCEL";
      AppMethodBeat.o(17856);
      continue;
      str = "BACKUP_FINISH";
      AppMethodBeat.o(17856);
      continue;
      str = "RESTORE_START";
      AppMethodBeat.o(17856);
      continue;
      str = "RESTORE_CANCE";
      AppMethodBeat.o(17856);
      continue;
      str = "RESTORE_FINISH";
      AppMethodBeat.o(17856);
      continue;
      str = "BACKUP_PAUSE";
      AppMethodBeat.o(17856);
      continue;
      str = "RESTORE_PAUSE";
      AppMethodBeat.o(17856);
      continue;
      str = "BACKUP_RESUME";
      AppMethodBeat.o(17856);
      continue;
      str = "RESTORE_RESUME";
      AppMethodBeat.o(17856);
      continue;
      str = "MERGE_PROGRESS";
      AppMethodBeat.o(17856);
      continue;
      str = "LOGOFF";
      AppMethodBeat.o(17856);
      continue;
      str = "EXIT";
      AppMethodBeat.o(17856);
      continue;
      str = "SHOW_BACKUP_RESTORE";
      AppMethodBeat.o(17856);
      continue;
      str = "COMMAND_WECHAT_LEAVE";
      AppMethodBeat.o(17856);
      continue;
      str = "COMMAND_NOT_SUPPORT";
      AppMethodBeat.o(17856);
    }
  }

  public final void a(e.d paramd)
  {
    try
    {
      AppMethodBeat.i(17844);
      if ((paramd == null) && ((this.jzs instanceof com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcui.a)))
      {
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BakPcProcessMgr", "setOperatorCallbck BakchatBannerView null ilegal, fking return");
        AppMethodBeat.o(17844);
      }
      while (true)
      {
        return;
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BakPcProcessMgr", "setOperatorCallbck:%s", new Object[] { paramd });
        this.jzs = paramd;
        this.jzD.jzs = paramd;
        this.jzE.jzs = paramd;
        AppMethodBeat.o(17844);
      }
    }
    finally
    {
    }
    throw paramd;
  }

  final void a(com.tencent.mm.plugin.backup.i.r paramr)
  {
    try
    {
      AppMethodBeat.i(17854);
      if (this.jzE != null)
        this.jzE.cancel();
      Object localObject = new com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f;
      ((f)localObject).<init>();
      this.jzE = ((f)localObject);
      f localf = this.jzE;
      LinkedList localLinkedList = paramr.jCk;
      localObject = paramr.jCl;
      long l = paramr.jBS;
      localf.jzS = localLinkedList;
      localf.jzT = ((List)localObject);
      localf.cAY = false;
      localf.eVT = false;
      localf.jzr.clear();
      localf.jzu = false;
      localf.jzV = false;
      localf.jsp = false;
      localf.jzU = 0;
      localf.jzX = 0L;
      localf.jzW = l;
      com.tencent.mm.plugin.backup.bakoldlogic.c.d.setProgress(0);
      this.jzE.jzs = this.jzs;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", "reve textList:%d,  mediaList:%d, convDataSize:%d", new Object[] { Integer.valueOf(paramr.jCk.size()), Integer.valueOf(paramr.jCl.size()), Long.valueOf(paramr.jBS) });
      localObject = this.jzE;
      ((f)localObject).jzy = 0;
      if ((((f)localObject).jzT.size() < paramr.jBX) || (((f)localObject).jzS.size() < paramr.jBW))
      {
        paramr = new com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f$2;
        paramr.<init>((f)localObject);
        com.tencent.mm.plugin.backup.g.b.a(3, paramr);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "send restore info cmd");
        paramr = new com/tencent/mm/plugin/backup/bakoldlogic/c/b;
        paramr.<init>(2);
        paramr.aUc();
        AppMethodBeat.o(17854);
      }
      while (true)
      {
        return;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "startRecover start directly");
        paramr = new com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/f$1;
        paramr.<init>((f)localObject);
        com.tencent.mm.sdk.g.d.post(paramr, "RecoverPCServer_recover");
        AppMethodBeat.o(17854);
      }
    }
    finally
    {
    }
    throw paramr;
  }

  public final void a(boolean paramBoolean, int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(17848);
    if ((paramBoolean) && (paramArrayOfByte != null))
      ai(paramInt1, new String(paramArrayOfByte));
    if ((paramInt1 == 10001) || (paramInt1 == 10002))
    {
      a.aUB().aUD().jzk = 1;
      new com.tencent.mm.plugin.backup.bakoldlogic.c.a(a.aUB().jqP, a.aUB().jqQ, com.tencent.mm.plugin.backup.b.d.aSy(), a.aUB().jqO).aUc();
    }
    Object localObject;
    if (paramInt1 == 3)
    {
      this.jzH = -1;
      localObject = new com.tencent.mm.plugin.backup.i.ab();
    }
    while (true)
    {
      try
      {
        ((com.tencent.mm.plugin.backup.i.ab)localObject).parseFrom(paramArrayOfByte);
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", "recv cmd:%d (%s)", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh), rG(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh) });
        paramInt1 = ((com.tencent.mm.plugin.backup.i.ab)localObject).jBh;
        switch (paramInt1)
        {
        case 2:
        case 5:
        case 8:
        case 13:
        case 14:
        default:
          AppMethodBeat.o(17848);
          return;
        case 0:
          if (!aw.RK())
          {
            com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BakPcProcessMgr", "acc is not ready, not support pcmgr's auth");
            a(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh, 1, null);
            AppMethodBeat.o(17848);
            continue;
          }
          this.jzH = ((com.tencent.mm.plugin.backup.i.ab)localObject).jBh;
          if (this.jzB == null)
            break label339;
          this.jzB.aUO();
          this.jzK = 0;
          this.jzL = 1;
          AppMethodBeat.o(17848);
          continue;
        case 1:
        case 3:
        case 4:
        case 6:
        case 7:
        case 9:
        case 10:
        case 11:
        case 12:
        case 15:
        case 16:
        }
      }
      catch (Exception paramArrayOfByte)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.BakPcProcessMgr", paramArrayOfByte, "buf to PacketCommandReq error", new Object[0]);
      }
      AppMethodBeat.o(17848);
      continue;
      label339: com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", "authCallback is null");
      paramArrayOfByte = new android/content/Intent;
      paramArrayOfByte.<init>();
      paramArrayOfByte = paramArrayOfByte.setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
      paramArrayOfByte.addFlags(335544320);
      paramArrayOfByte.putExtra("nofification_type", "back_to_pcmgr_notification");
      paramArrayOfByte.putExtra("newPCBackup", false);
      ah.getContext().startActivity(paramArrayOfByte);
      continue;
      a.aUB().aUE().aUF();
      a.aUB().aUD().aar();
      ai(-1, null);
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BakPcProcessMgr", "summerback new version not support old pc backup request toast upgrade pc");
      AppMethodBeat.o(17848);
      continue;
      this.jzL = 2;
      this.jzK = 3;
      aUN();
      a(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh, 0, null);
      localObject = this.jzD;
      paramArrayOfByte = new com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/d$1;
      paramArrayOfByte.<init>((d)localObject);
      com.tencent.mm.sdk.g.d.h(paramArrayOfByte, "BakPCServer_startBak").start();
      AppMethodBeat.o(17848);
      continue;
      this.jzK = -1;
      this.jzL = 1;
      aUN();
      a(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh, 0, null);
      if (this.jzF != null)
      {
        this.jzF.cancel();
        this.jzF = null;
      }
      if (this.jzD != null)
        this.jzD.cancel();
      if (this.jzG != null)
      {
        paramArrayOfByte = this.jzG;
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakCalculator", "calculator cancel.");
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BakCalculator", "calculator cancel. stack:%s", new Object[] { bo.dpG() });
        paramArrayOfByte.eVT = true;
        this.jzG = null;
      }
      if (this.jzs != null)
      {
        this.jzs.aUQ();
        AppMethodBeat.o(17848);
        continue;
        this.jzK = 5;
        this.jzL = 4;
        aUN();
        this.jzH = ((com.tencent.mm.plugin.backup.i.ab)localObject).jBh;
        if (this.jzA != null)
          this.jzA.onEvent(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh);
        while (true)
        {
          paramArrayOfByte = a.aUB().aUD();
          paramArrayOfByte.jzn += 1;
          paramArrayOfByte = com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY();
          localObject = new com/tencent/mm/plugin/backup/bakoldlogic/bakoldpcmodel/e$1;
          ((e.1)localObject).<init>(this);
          paramArrayOfByte.a((b.a)localObject);
          AppMethodBeat.o(17848);
          break;
          com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", "callback is null");
        }
        this.jzK = -1;
        this.jzL = 1;
        aUN();
        a(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh, 0, null);
        if (this.jzF != null)
        {
          this.jzF.cancel();
          this.jzF = null;
        }
        if (this.jzE != null)
          this.jzE.cancel();
        if (this.jzs != null)
        {
          this.jzs.aUQ();
          AppMethodBeat.o(17848);
          continue;
          a(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh, 0, null);
          if (this.jzD != null)
          {
            this.jzD.pause();
            AppMethodBeat.o(17848);
            continue;
            a(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh, 0, null);
            if (this.jzE != null)
            {
              this.jzE.pause();
              AppMethodBeat.o(17848);
              continue;
              a(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh, 0, null);
              if (this.jzD != null)
              {
                this.jzD.resume();
                AppMethodBeat.o(17848);
                continue;
                a(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh, 0, null);
                if (this.jzE != null)
                {
                  this.jzE.resume();
                  AppMethodBeat.o(17848);
                  continue;
                  a.aUB().aUE().aUF();
                  a.aUB().aUD().aar();
                  ai(15, null);
                  AppMethodBeat.o(17848);
                  continue;
                  a(((com.tencent.mm.plugin.backup.i.ab)localObject).jBh, 0, null);
                  if (this.jzC != null)
                    this.jzC.aUR();
                }
              }
            }
          }
        }
      }
    }
  }

  public final void aSL()
  {
    AppMethodBeat.i(17845);
    f localf;
    if (this.jzE.jzV)
    {
      localf = this.jzE;
      com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "startMerge");
      if (localf.jsp)
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.RecoverPCServer", "hasStartMerge , return");
        AppMethodBeat.o(17845);
      }
    }
    while (true)
    {
      return;
      localf.jzy = 0;
      a.aUB().aUC().jzL = 6;
      localf.jsp = true;
      com.tencent.mm.plugin.backup.bakoldlogic.d.b.aUY().a(new f.4(localf));
      AppMethodBeat.o(17845);
      continue;
      com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BakPcProcessMgr", "startMerge err state");
      AppMethodBeat.o(17845);
    }
  }

  public final boolean aUJ()
  {
    try
    {
      boolean bool = this.jzM;
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void aUK()
  {
    try
    {
      this.jzs = null;
      this.jzD.jzs = null;
      this.jzE.jzs = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final int aUM()
  {
    int i = 0;
    AppMethodBeat.i(17850);
    com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", "getPCProgressPercent now progress:%d", new Object[] { Integer.valueOf(this.jzL) });
    if ((this.jzL == 2) || (this.jzL == 3))
    {
      i = this.jzD.jzx;
      AppMethodBeat.o(17850);
    }
    while (true)
    {
      return i;
      if ((this.jzL == 4) || (this.jzL == 5))
      {
        i = this.jzE.jzY;
        AppMethodBeat.o(17850);
      }
      else if ((this.jzL == 6) || (this.jzL == 7))
      {
        i = this.jzE.jzU;
        AppMethodBeat.o(17850);
      }
      else
      {
        com.tencent.mm.sdk.platformtools.ab.w("MicroMsg.BakPcProcessMgr", "wrong operatorStatus");
        AppMethodBeat.o(17850);
      }
    }
  }

  final void ai(int paramInt, String paramString)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(17847);
        com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BakPcProcessMgr", "callbackErr type:%d,  %s", new Object[] { Integer.valueOf(paramInt), paramString });
        if ((paramInt == 10006) || (paramInt == 10008))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BakPcProcessMgr", "callbackErr socketClose");
          this.jzK = -1;
          this.jzL = 1;
          aUN();
          a.aUB().aUD().jzk = 2;
          a.aUB().aUD().aar();
          if (this.jzA != null)
            this.jzA.onError(paramInt);
          if (this.jzB != null)
            this.jzB.onError(paramInt);
          if (this.jzs != null)
            this.jzs.onError(paramInt);
          if (this.jzC != null)
            this.jzC.onError(paramInt);
        }
        if ((paramInt == 10009) || (paramInt == 10004))
        {
          com.tencent.mm.sdk.platformtools.ab.e("MicroMsg.BakPcProcessMgr", "callbackErr ip not match or connect failed: %d", new Object[] { Integer.valueOf(paramInt) });
          a.aUB().aUD().jzk = 2;
          a.aUB().aUD().aar();
          aUL();
          AppMethodBeat.o(17847);
          return;
        }
        com.tencent.mm.sdk.platformtools.ab.d("MicroMsg.BakPcProcessMgr", "summerbak errtype:%d, authcallback[%s], operatorcallback[%s], eventCallback[%s]", new Object[] { Integer.valueOf(paramInt), this.jzB, this.jzs, this.jzA });
        if (paramInt == 15)
        {
          if (this.jzB != null)
            this.jzB.onError(paramInt);
          if (this.jzs != null)
            this.jzs.onError(paramInt);
          if (this.jzA != null)
            this.jzA.rH(paramInt);
        }
        if (paramInt != -1)
          break label393;
        if (this.jzB != null)
        {
          this.jzB.onError(paramInt);
          AppMethodBeat.o(17847);
          continue;
        }
      }
      finally
      {
      }
      if (this.jzs != null)
      {
        this.jzs.onError(paramInt);
        AppMethodBeat.o(17847);
      }
      else
      {
        if (this.jzA != null)
          this.jzA.rH(paramInt);
        label393: AppMethodBeat.o(17847);
      }
    }
  }

  public final void cZ(String paramString1, String paramString2)
  {
    this.jzI = paramString1;
    this.jzJ = paramString2;
  }

  public final void fr(boolean paramBoolean)
  {
    try
    {
      this.jzM = paramBoolean;
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void pause()
  {
    AppMethodBeat.i(17846);
    if (this.jzH == 1)
    {
      this.jzD.pause();
      AppMethodBeat.o(17846);
    }
    while (true)
    {
      return;
      if (this.jzH == 6)
        this.jzE.pause();
      AppMethodBeat.o(17846);
    }
  }

  public final void rE(int paramInt)
  {
    AppMethodBeat.i(17851);
    com.tencent.mm.plugin.backup.i.ac localac;
    if (paramInt == 0)
    {
      this.jzK = 1;
      if (paramInt != 1)
        break label106;
      localac = new com.tencent.mm.plugin.backup.i.ac();
      localac.jBh = 0;
      localac.jBT = paramInt;
    }
    while (true)
    {
      try
      {
        com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", "send auth cmd resp, status:%d", new Object[] { Integer.valueOf(localac.jBT) });
        com.tencent.mm.plugin.backup.g.b.K(localac.toByteArray(), 4);
        AppMethodBeat.o(17851);
        return;
        this.jzK = -1;
      }
      catch (Exception localException1)
      {
        com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException1, "buf to PacketCommandResponse err", new Object[0]);
        AppMethodBeat.o(17851);
        continue;
      }
      label106: q localq = new q();
      localq.jCe = 0L;
      localq.jCg = Build.MANUFACTURER;
      localq.jBG = Build.MODEL;
      localq.jCf = 0L;
      localq.jCh = Build.VERSION.RELEASE;
      Object localObject2 = com.tencent.mm.storage.ac.eSj;
      Object localObject1 = localObject2;
      Object localObject3;
      if (new File(com.tencent.mm.compatible.util.e.eSl).exists())
      {
        localObject1 = localObject2;
        if (com.tencent.mm.compatible.util.f.Mn())
        {
          localObject3 = new File(com.tencent.mm.compatible.util.e.eSn);
          if (!((File)localObject3).exists())
          {
            localObject1 = localObject2;
            if (!((File)localObject3).mkdirs());
          }
          else
          {
            localObject1 = com.tencent.mm.compatible.util.e.eSn;
          }
        }
      }
      localq.jCd = ((String)localObject1);
      localq.jCc = com.tencent.mm.model.r.YB();
      localq.jCb = com.tencent.mm.model.r.Yz();
      localq.jCa = com.tencent.mm.protocal.d.vxo;
      try
      {
        localObject1 = ah.getContext().getPackageManager().getPackageInfo(ah.getContext().getPackageName(), 0);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        localq.jCa = (((PackageInfo)localObject1).versionName + ";" + ((PackageInfo)localObject1).versionCode + ";" + com.tencent.mm.protocal.d.vxo);
        o.acd();
        localObject2 = com.tencent.mm.ah.d.qf(localq.jCb);
        localObject1 = null;
        if (localObject2 != null)
        {
          localObject3 = new ByteArrayOutputStream();
          ((Bitmap)localObject2).compress(Bitmap.CompressFormat.PNG, 0, (OutputStream)localObject3);
          localObject1 = ((ByteArrayOutputStream)localObject3).toByteArray();
        }
      }
      catch (Exception localException4)
      {
        try
        {
          ((ByteArrayOutputStream)localObject3).close();
          o.acd();
          localObject2 = com.tencent.mm.ah.d.D(localq.jCb, true);
          if (localObject1 == null)
          {
            i = 0;
            com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", ", bmHDPath:%s, bm.buf.len:%d", new Object[] { localObject2, Integer.valueOf(i) });
            if (!bo.cb((byte[])localObject1))
              localq.jCi = new com.tencent.mm.bt.b((byte[])localObject1);
            localObject1 = com.tencent.mm.a.e.f((String)localObject2, 0, -1);
            if (!bo.cb((byte[])localObject1))
              localq.jCj = new com.tencent.mm.bt.b((byte[])localObject1);
            localObject1 = new com.tencent.mm.plugin.backup.i.ac();
            ((com.tencent.mm.plugin.backup.i.ac)localObject1).jBh = 0;
            ((com.tencent.mm.plugin.backup.i.ac)localObject1).jBT = paramInt;
            ((com.tencent.mm.plugin.backup.i.ac)localObject1).jCL = localq;
          }
        }
        catch (Exception localException4)
        {
          try
          {
            while (true)
            {
              com.tencent.mm.sdk.platformtools.ab.i("MicroMsg.BakPcProcessMgr", "send auth cmd resp, status:%d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.backup.i.ac)localObject1).jBT) });
              com.tencent.mm.plugin.backup.g.b.K(((com.tencent.mm.plugin.backup.i.ac)localObject1).toByteArray(), 4);
              AppMethodBeat.o(17851);
              break;
              localException2 = localException2;
              com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException2, "get packageInfo failed", new Object[0]);
              continue;
              localException4 = localException4;
              com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException4, "close", new Object[0]);
            }
            int i = localException2.length;
          }
          catch (Exception localException3)
          {
            com.tencent.mm.sdk.platformtools.ab.printErrStackTrace("MicroMsg.BakPcProcessMgr", localException3, "buf to PacketCommandResponse err", new Object[0]);
            AppMethodBeat.o(17851);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.bakoldpcmodel.e
 * JD-Core Version:    0.6.2
 */