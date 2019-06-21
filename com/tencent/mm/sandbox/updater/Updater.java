package com.tencent.mm.sandbox.updater;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.c.i.a;
import com.tencent.mm.g.a.bi;
import com.tencent.mm.model.an;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.bk.a;
import com.tencent.mm.platformtools.ae;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.protocal.protobuf.ant;
import com.tencent.mm.protocal.protobuf.anu;
import com.tencent.mm.protocal.protobuf.aph;
import com.tencent.mm.protocal.protobuf.bdm;
import com.tencent.mm.protocal.protobuf.bhx;
import com.tencent.mm.protocal.protobuf.bia;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import com.tencent.mm.sdk.platformtools.g;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import junit.framework.Assert;

public class Updater extends LinearLayout
  implements com.tencent.mm.ai.f, com.tencent.mm.plugin.p.a
{
  private boolean cui;
  private int xvw;
  private com.tencent.mm.ui.base.p xwC = null;
  private boolean xwD = false;
  private boolean xwE = false;
  private boolean xwF = false;
  private com.tencent.mm.ai.f xwG;
  private com.tencent.mm.ai.f xwH;

  private Updater(Context paramContext)
  {
    super(paramContext);
  }

  public Updater(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static void LS(int paramInt)
  {
    AppMethodBeat.i(28949);
    if (!aw.RK())
      AppMethodBeat.o(28949);
    while (true)
    {
      return;
      ab.d("MicroMsg.Updater", "reportUpdateStat : opCode = ".concat(String.valueOf(paramInt)));
      aw.ZK();
      com.tencent.mm.model.c.XL().c(new com.tencent.mm.az.m(paramInt));
      AppMethodBeat.o(28949);
    }
  }

  private void cancel()
  {
    AppMethodBeat.i(28944);
    aw.Rg().b(11, this);
    AppMethodBeat.o(28944);
  }

  public static Updater e(Context paramContext, DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(28938);
    if (paramContext == null)
    {
      AppMethodBeat.o(28938);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      if (((paramContext instanceof Activity)) && ((((Activity)paramContext).isFinishing()) || (((Activity)paramContext).getWindow() == null)))
      {
        ab.e("MicroMsg.Updater", "showWithProgress, context isFinishing");
        AppMethodBeat.o(28938);
        paramContext = null;
      }
      else
      {
        ah.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bo.anT()).commit();
        aw.getNotification().cancel(34);
        ab.i("MicroMsg.Updater", "showWithProgress");
        Updater localUpdater = (Updater)View.inflate(paramContext, 2130970977, null);
        localUpdater.onStart();
        paramContext = com.tencent.mm.ui.base.p.d(paramContext, paramContext.getString(2131304164));
        paramContext.setCancelable(true);
        paramContext.setOnCancelListener(new Updater.1(localUpdater, paramOnCancelListener));
        try
        {
          localUpdater.xwC = paramContext;
          localUpdater.xwC.show();
          localUpdater.cui = true;
          com.tencent.mm.plugin.report.service.h.pYm.a(405L, 46L, 1L, true);
          AppMethodBeat.o(28938);
          paramContext = localUpdater;
        }
        catch (Exception paramContext)
        {
          ab.e("MicroMsg.Updater", "exception in showWithProgress, ", new Object[] { paramContext.getMessage() });
          ab.printErrStackTrace("MicroMsg.Updater", paramContext, "", new Object[0]);
          AppMethodBeat.o(28938);
          paramContext = null;
        }
      }
    }
  }

  public static void e(String paramString1, int paramInt, String paramString2, String paramString3)
  {
    AppMethodBeat.i(28948);
    Intent localIntent = new Intent(ah.getContext(), UpdaterService.class);
    localIntent.putExtra("intent_client_version", com.tencent.mm.protocal.d.vxo);
    localIntent.putExtra("intent_update_type", 4);
    localIntent.putExtra("intent_extra_desc", paramString2);
    localIntent.putExtra("intent_extra_md5", paramString1);
    localIntent.putExtra("intent_extra_size", paramInt);
    localIntent.putExtra("intent_extra_download_url", new String[] { paramString3 });
    localIntent.putExtra("intent_extra_updateMode", g.cdh);
    localIntent.putExtra("intent_extra_marketUrl", g.xyc);
    localIntent.putExtra("intent_extra_run_in_foreground", true);
    localIntent.putExtra("intent_extra_download_mode", 2);
    com.tencent.mm.plugin.report.service.h.pYm.a(405L, 45L, 1L, true);
    com.tencent.mm.bp.d.j(localIntent, "sandbox");
    AppMethodBeat.o(28948);
  }

  public static void ez(Context paramContext)
  {
    AppMethodBeat.i(28941);
    paramContext.startActivity(new Intent(paramContext, AppInstallerUI.class));
    AppMethodBeat.o(28941);
  }

  public static Updater f(Context paramContext, final DialogInterface.OnCancelListener paramOnCancelListener)
  {
    AppMethodBeat.i(28939);
    ah.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bo.anT()).commit();
    aw.getNotification().cancel(34);
    ab.i("MicroMsg.Updater", "show update dialog");
    Updater localUpdater = (Updater)View.inflate(paramContext, 2130970977, null);
    localUpdater.onStart();
    paramContext = com.tencent.mm.ui.base.p.d(paramContext, "");
    paramContext.setCancelable(true);
    paramContext.setOnCancelListener(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        AppMethodBeat.i(28932);
        aw.getNotification().cancel(99);
        com.tencent.mm.plugin.report.service.h.pYm.a(405L, 49L, 1L, true);
        Updater.LS(2);
        this.xwI.onStop();
        if ((!Updater.a(this.xwI)) && (paramOnCancelListener != null))
          paramOnCancelListener.onCancel(paramAnonymousDialogInterface);
        AppMethodBeat.o(28932);
      }
    });
    com.tencent.mm.plugin.report.service.h.pYm.a(405L, 48L, 1L, true);
    localUpdater.xwC = paramContext;
    localUpdater.cui = false;
    AppMethodBeat.o(28939);
    return localUpdater;
  }

  private String[] getShortIps()
  {
    int i = 0;
    AppMethodBeat.i(28945);
    Object localObject;
    if ((ae.gii != null) && (ae.gii.length() > 0))
    {
      localObject = new String[1];
      localObject[0] = ae.gii;
      AppMethodBeat.o(28945);
    }
    while (true)
    {
      return localObject;
      localObject = ah.getContext().getSharedPreferences("system_config_prefs", 0).getString("builtin_short_ips", "");
      if ((localObject != null) && (((String)localObject).length() > 0));
      while (true)
      {
        List localList = com.tencent.mm.protocal.o.akF((String)localObject);
        localObject = new String[localList.size()];
        while (i < localList.size())
        {
          localObject[i] = ((com.tencent.mm.protocal.o)localList.get(i)).nJq;
          i++;
        }
        localObject = "0,112.64.200.240,80|0,180.153.82.27,80|0,117.135.130.177,80";
      }
      AppMethodBeat.o(28945);
    }
  }

  public static Updater gh(Context paramContext)
  {
    AppMethodBeat.i(28940);
    ah.getContext().getSharedPreferences("system_config_prefs", 0).edit().putLong("recomended_update_ignore", bo.anT()).commit();
    aw.getNotification().cancel(34);
    com.tencent.mm.plugin.report.service.h.pYm.a(405L, 50L, 1L, true);
    ab.i("MicroMsg.Updater", "updater silence");
    paramContext = new Updater(paramContext);
    paramContext.onStart();
    paramContext.xwE = true;
    AppMethodBeat.o(28940);
    return paramContext;
  }

  private void onStart()
  {
    AppMethodBeat.i(28936);
    aw.Rg().a(11, this);
    com.tencent.mm.plugin.report.service.h.pYm.a(405L, 42L, 1L, true);
    AppMethodBeat.o(28936);
  }

  public final void a(Intent paramIntent, e parame)
  {
    AppMethodBeat.i(28943);
    paramIntent.putExtra("intent_short_ips", getShortIps());
    paramIntent.putExtra("intent_client_version", com.tencent.mm.protocal.d.vxo);
    paramIntent.putExtra("intent_update_type", 3);
    int i;
    if ((parame.nuh != null) && (!parame.nuh.isEmpty()) && (parame.nuh.containsKey(Integer.valueOf(4))))
    {
      i = 1;
      if (i == 0)
        break label364;
      localObject1 = parame.nuh;
      if ((localObject1 != null) && (!((HashMap)localObject1).isEmpty()))
        break label217;
      localObject1 = "";
    }
    label217: Object localObject2;
    LinkedList localLinkedList;
    int j;
    label266: 
    do
    {
      do
      {
        do
        {
          paramIntent.putExtra("intent_extra_desc", (String)localObject1);
          paramIntent.putExtra("intent_extra_md5", parame.nul);
          paramIntent.putExtra("intent_extra_size", parame.fileSize);
          paramIntent.putExtra("intent_extra_download_url", new String[] { parame.nuk });
          paramIntent.putExtra("intent_extra_patchInfo", parame.dnp());
          paramIntent.putExtra("intent_extra_updateMode", g.cdh);
          paramIntent.putExtra("intent_extra_marketUrl", g.xyc);
          paramIntent.putExtra("intent_extra_extinfo", "<extinfo></extinfo>");
          paramIntent.putExtra("intent_extra_tinker_patch", true);
          paramIntent.putExtra("intent_extra_download_mode", 1);
          AppMethodBeat.o(28943);
          return;
          i = 0;
          break;
          localObject2 = "";
          localLinkedList = (LinkedList)((HashMap)localObject1).get(Integer.valueOf(4));
          localObject1 = localObject2;
        }
        while (localLinkedList == null);
        localObject1 = localObject2;
      }
      while (localLinkedList.isEmpty());
      j = localLinkedList.size();
      i = 0;
      localObject1 = localObject2;
    }
    while (i >= j);
    Object localObject1 = (bdm)localLinkedList.get(i);
    if (((bdm)localObject1).lang.equalsIgnoreCase("default"));
    for (localObject1 = new String(Base64.decode(((bdm)localObject1).content, 0)); ; localObject1 = localObject2)
    {
      i++;
      localObject2 = localObject1;
      break label266;
      if (((bdm)localObject1).lang.equalsIgnoreCase(aa.dor()))
      {
        localObject1 = new String(Base64.decode(((bdm)localObject1).content, 0));
        break;
        label364: localObject1 = "";
        break;
      }
    }
  }

  public final void aA(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(28947);
    ab.i("MicroMsg.Updater", "summerupdate begin update routine, type=".concat(String.valueOf(paramInt)));
    this.xvw = paramInt;
    this.xwF = paramBoolean;
    com.tencent.mm.plugin.report.service.h.pYm.a(405L, 44L, 1L, true);
    com.tencent.mm.sandbox.a.a locala = new com.tencent.mm.sandbox.a.a(paramInt);
    aw.Rg().a(locala, 0);
    AppMethodBeat.o(28947);
  }

  public void onSceneEnd(int paramInt1, int paramInt2, final String paramString, final com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(28942);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      com.tencent.mm.plugin.report.service.h.pYm.a(405L, 51L, 1L, true);
      ab.i("MicroMsg.Updater", "isShow " + this.cui);
      if ((!this.cui) && (this.xwC != null))
        this.xwC.show();
      this.xwD = true;
      if (this.xwC != null)
        this.xwC.cancel();
      paramString = (com.tencent.mm.sandbox.a.a)paramm;
      aw.Rg().a(new bk(new bk.a()
      {
        public final void a(final com.tencent.mm.network.e paramAnonymouse)
        {
          AppMethodBeat.i(28934);
          if (paramAnonymouse == null)
          {
            com.tencent.mm.plugin.report.service.h.pYm.a(405L, 52L, 1L, true);
            Assert.assertTrue("updater invalid assert", false);
          }
          aw.getNotification().cancel(34);
          ab.i("MicroMsg.Updater", "go to update");
          if (!com.tencent.mm.compatible.util.h.getExternalStorageState().equals("mounted"))
          {
            ab.e("MicroMsg.Updater", "no sdcard.");
            com.tencent.mm.plugin.report.service.h.pYm.a(405L, 53L, 1L, true);
            Updater.b(Updater.this);
          }
          int i = paramString.dmZ();
          com.tencent.mm.c.i locali = com.tencent.mm.c.i.cO(paramString.dnb());
          String str = com.tencent.mm.pluginsdk.f.i.fN(Updater.this.getContext());
          Object localObject = null;
          if (locali != null)
            localObject = locali.cN(str);
          long l;
          if (localObject == null)
          {
            l = i;
            if (!com.tencent.mm.compatible.util.f.eW(l))
            {
              ab.e("MicroMsg.Updater", "no enough space.");
              com.tencent.mm.plugin.report.service.h.pYm.a(405L, 54L, 1L, true);
              Updater.b(Updater.this);
            }
            if ((g.cdh & 0x1) != 0)
            {
              ab.i("MicroMsg.Updater", "channel pack, not silence download.");
              com.tencent.mm.plugin.report.service.h.pYm.a(405L, 55L, 1L, true);
              Updater.b(Updater.this);
            }
            if ((Updater.c(Updater.this) != 2) || (Updater.d(Updater.this)))
              break label328;
            localObject = i.dhU();
            if ((com.tencent.mm.sandbox.monitor.c.RP(paramString.dna()) == null) || (bo.isNullOrNil((String)localObject)) || (!((String)localObject).equals(paramString.dna())))
              break label328;
            ab.i("MicroMsg.Updater", "we already have this pack %s being to install, just ignore this update request", new Object[] { localObject });
            com.tencent.mm.plugin.report.service.h.pYm.a(405L, 56L, 1L, true);
            AppMethodBeat.o(28934);
          }
          while (true)
          {
            return;
            l = ((i.a)localObject).size + i;
            break;
            label328: localObject = paramString.bQR();
            if ((localObject != null) && (((aph)localObject).wtp != 0) && (!bo.isNullOrNil(((aph)localObject).wtq)))
            {
              paramAnonymouse = ((aph)localObject).wtq;
              localObject = new Intent();
              ((Intent)localObject).putExtra("rawUrl", paramAnonymouse);
              ((Intent)localObject).putExtra("showShare", false);
              ((Intent)localObject).putExtra("show_bottom", false);
              com.tencent.mm.bp.d.b(Updater.this.getContext(), "webview", ".ui.tools.WebViewUI", (Intent)localObject);
              i.dnw();
              com.tencent.mm.plugin.report.service.h.pYm.a(405L, 57L, 1L, true);
              AppMethodBeat.o(28934);
            }
            else
            {
              if (!Updater.e(Updater.this))
                break label538;
              ab.i("MicroMsg.Updater", "summerupdate gonna start UpdaterService checkcontrol");
              com.tencent.mm.plugin.report.service.h.pYm.a(405L, 58L, 1L, true);
              aw.Rg().a(725, Updater.a(Updater.this, new com.tencent.mm.ai.f()
              {
                public final void onSceneEnd(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ai.m paramAnonymous2m)
                {
                  AppMethodBeat.i(28933);
                  aw.Rg().b(221, Updater.f(Updater.this));
                  Updater.a(Updater.this, null);
                  long l1;
                  if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
                  {
                    paramAnonymous2String = (com.tencent.mm.modelsimple.o)paramAnonymous2m;
                    if (((ant)paramAnonymous2String.fmP.fsG.fsP).jCt == 0)
                    {
                      paramAnonymous2String = ((anu)paramAnonymous2String.fmP.fsH.fsP).ncM;
                      if (!bo.isNullOrNil(paramAnonymous2String))
                      {
                        Map localMap = br.z(paramAnonymous2String, "resourcecontrolinfo");
                        if (localMap != null)
                        {
                          paramAnonymous2String = (String)localMap.get(".resourcecontrolinfo.enableupdate");
                          paramAnonymous2m = (String)localMap.get(".resourcecontrolinfo.expiredtime");
                          ab.i("MicroMsg.NetSceneGetResourceControlInfo", "summerupdate getDisableUpdateTime values[%s]", new Object[] { localMap });
                          if (bo.getInt(paramAnonymous2String, 1) == 0)
                          {
                            l1 = bo.getLong(paramAnonymous2m, 0L);
                            long l2 = System.currentTimeMillis() / 1000L;
                            if (l1 <= l2)
                              break label235;
                            ab.i("MicroMsg.Updater", "summerupdate checkcontrol time[%d] > now[%d] control not auto download and ret", new Object[] { Long.valueOf(l1), Long.valueOf(l2) });
                            com.tencent.mm.plugin.report.service.h.pYm.a(405L, 0L, 1L, true);
                            AppMethodBeat.o(28933);
                          }
                        }
                      }
                    }
                  }
                  while (true)
                  {
                    return;
                    l1 = 0L;
                    break;
                    label235: ab.i("MicroMsg.Updater", "summerupdate gonna start UpdaterService after checkcontrol");
                    com.tencent.mm.plugin.report.service.h.pYm.a(405L, 59L, 1L, true);
                    paramAnonymous2String = new Intent(Updater.this.getContext(), UpdaterService.class);
                    Updater.a(Updater.this, paramAnonymous2String, paramAnonymouse, Updater.3.this.xwK);
                    paramAnonymous2String.putExtra("intent_extra_run_in_foreground", true);
                    paramAnonymous2String.putExtra("intent_extra_download_mode", 2);
                    com.tencent.mm.bp.d.j(paramAnonymous2String, "sandbox");
                    AppMethodBeat.o(28933);
                  }
                }
              }));
              aw.Rg().a(new com.tencent.mm.modelsimple.o(), 0);
              com.tencent.mm.x.c.PK().x(262145, true);
              com.tencent.mm.pluginsdk.model.app.a.dht();
              AppMethodBeat.o(28934);
            }
          }
          label538: ab.i("MicroMsg.Updater", "gonna start AppUpdaterUI");
          localObject = new Intent(Updater.this.getContext(), AppUpdaterUI.class);
          Updater.a(Updater.this, (Intent)localObject, paramAnonymouse, paramString);
          ab.i("MicroMsg.Updater", "current updateType : %s", new Object[] { Integer.valueOf(Updater.c(Updater.this)) });
          if (Updater.c(Updater.this) == 1)
          {
            ((Intent)localObject).putExtra("intent_extra_download_mode", 0);
            com.tencent.mm.plugin.report.service.h.pYm.a(405L, 60L, 1L, true);
          }
          while (true)
          {
            Updater.this.getContext().startActivity((Intent)localObject);
            break;
            com.tencent.mm.plugin.report.service.h.pYm.a(405L, 61L, 1L, true);
            ((Intent)localObject).putExtra("intent_extra_download_mode", 1);
          }
        }
      }), 0);
      onStop();
      AppMethodBeat.o(28942);
      return;
    }
    com.tencent.mm.plugin.report.service.h.pYm.a(405L, 62L, 1L, true);
    if (this.xwC != null)
    {
      paramString = this.xwC;
      if (paramString.iUz != null)
        paramString.iUz.setVisibility(8);
      paramm = (TextView)this.xwC.findViewById(2131821803);
      if ((paramInt1 != 4) || (paramInt2 != -18))
        break label265;
      paramString = new bi();
      com.tencent.mm.sdk.b.a.xxA.m(paramString);
      paramString = aw.Rg();
      paramm = new com.tencent.mm.ai.f()
      {
        public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
        {
          AppMethodBeat.i(28935);
          aw.Rg().b(3899, Updater.g(Updater.this));
          Updater.a(Updater.this, null);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousm = ((bhx)((b)paramAnonymousm.ftl).fsH.fsP).wLf;
            paramAnonymousString = new e(paramAnonymousm);
            if ((paramAnonymousm != null) && (paramAnonymousm.wLk == 3))
            {
              paramAnonymousm = new Intent(Updater.this.getContext(), AppUpdaterUI.class);
              if (e.OH(paramAnonymousString.clientVersion))
                if (bo.isNullOrNil(paramAnonymousString.nur))
                {
                  paramAnonymousString = "http://support.weixin.qq.com/cgi-bin/mmsupport-bin/readtemplate?t=page/android_exp__index";
                  paramAnonymousm = new Intent("android.intent.action.VIEW");
                  paramAnonymousm.setClassName(Updater.this.getContext().getPackageName(), Updater.this.getContext().getPackageName() + ".plugin.webview.ui.tools.WebViewUI");
                  paramAnonymousm.putExtra("rawUrl", paramAnonymousString);
                  paramAnonymousm.putExtra("useJs", true);
                  paramAnonymousm.putExtra("vertical_scroll", true);
                  paramAnonymousm.setFlags(872415232);
                  Updater.this.getContext().startActivity(paramAnonymousm);
                  label228: if (Updater.h(Updater.this) != null)
                    Updater.h(Updater.this).cancel();
                  Updater.this.onStop();
                  AppMethodBeat.o(28935);
                }
            }
          }
          while (true)
          {
            return;
            paramAnonymousString = paramAnonymousString.nur;
            break;
            Updater.this.a(paramAnonymousm, paramAnonymousString);
            Updater.this.getContext().startActivity(paramAnonymousm);
            break label228;
            if (Updater.h(Updater.this).findViewById(2131821802) != null)
              Updater.h(Updater.this).findViewById(2131821802).setVisibility(8);
            if (paramm != null)
            {
              com.tencent.mm.plugin.report.service.h.pYm.a(405L, 63L, 1L, true);
              paramm.setText(2131304169);
            }
            AppMethodBeat.o(28935);
            continue;
            if (Updater.h(Updater.this).findViewById(2131821802) != null)
              Updater.h(Updater.this).findViewById(2131821802).setVisibility(8);
            if (paramm != null)
            {
              com.tencent.mm.plugin.report.service.h.pYm.a(405L, 63L, 1L, true);
              paramm.setText(2131304169);
            }
            AppMethodBeat.o(28935);
          }
        }
      };
      this.xwH = paramm;
      paramString.a(3899, paramm);
    }
    while (true)
    {
      i.dnA();
      cancel();
      AppMethodBeat.o(28942);
      break;
      label265: if (paramm != null)
      {
        com.tencent.mm.plugin.report.service.h.pYm.a(405L, 64L, 1L, true);
        paramm.setText(2131304159);
        j.h(paramm, 1);
      }
    }
  }

  public final void onStop()
  {
    AppMethodBeat.i(28937);
    com.tencent.mm.plugin.report.service.h.pYm.a(405L, 43L, 1L, true);
    cancel();
    AppMethodBeat.o(28937);
  }

  public final void update(int paramInt)
  {
    AppMethodBeat.i(28946);
    aA(paramInt, false);
    AppMethodBeat.o(28946);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sandbox.updater.Updater
 * JD-Core Version:    0.6.2
 */