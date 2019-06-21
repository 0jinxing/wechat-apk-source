package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ju;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.f.b;
import com.tencent.mm.plugin.f.b.7;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.c.b.b;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bq;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONException;
import org.json.JSONObject;

public class CleanNewUI extends MMActivity
{
  private long kwP;
  private String kwQ;
  private String kwR;
  private String kwS;
  private JSONObject kwT;
  private com.tencent.mm.plugin.clean.b.c kyA;
  private com.tencent.mm.sdk.b.c<ju> kyB;
  private LinearLayout kyj;
  private TextView kyk;
  private TextView kyl;
  private Button kym;
  private Button kyn;
  private TextView kyo;
  private LinearLayout kyp;
  private TextView kyq;
  private TextView kyr;
  private Button kys;
  private View kyt;
  private boolean kyu;
  private com.tencent.mm.plugin.clean.b.a kyv;
  private long kyw;
  private long kyx;
  private long kyy;
  private long kyz;

  public CleanNewUI()
  {
    AppMethodBeat.i(18823);
    this.kyu = false;
    this.kyw = 0L;
    this.kyx = 0L;
    this.kyy = 0L;
    this.kyz = 0L;
    this.kwQ = "com.tencent.qqpimsecure";
    this.kwR = "00B1208638DE0FCD3E920886D658DAF6";
    this.kwS = "11206657";
    this.kyA = new CleanNewUI.6(this);
    this.kyB = new CleanNewUI.9(this);
    AppMethodBeat.o(18823);
  }

  private void E(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(18827);
    bgk();
    this.kym.setEnabled(true);
    this.kyk.setText(bo.ga(paramLong1));
    int i = (int)(100L * paramLong1 / paramLong2);
    if (i > 0)
    {
      this.kyl.setText(getString(2131298327, new Object[] { i + "%" }));
      AppMethodBeat.o(18827);
    }
    while (true)
    {
      return;
      this.kyl.setText(2131298328);
      AppMethodBeat.o(18827);
    }
  }

  private String aZk()
  {
    AppMethodBeat.i(18834);
    String str = hashCode();
    AppMethodBeat.o(18834);
    return str;
  }

  private boolean bgf()
  {
    boolean bool = false;
    AppMethodBeat.i(18832);
    bgg();
    if (!p.u(this.mController.ylL, this.kwQ))
      AppMethodBeat.o(18832);
    while (true)
    {
      return bool;
      Object localObject = p.bx(this, this.kwQ);
      if ((localObject != null) && (localObject[0] != null))
      {
        localObject = com.tencent.mm.a.g.x(localObject[0].toByteArray());
        if ((localObject != null) && (((String)localObject).equalsIgnoreCase(this.kwR)))
          try
          {
            localObject = getPackageManager().getLaunchIntentForPackage(this.kwQ);
            if (localObject != null)
            {
              Bundle localBundle = new android/os/Bundle;
              localBundle.<init>();
              p.j(localBundle, this.kwS);
              ((Intent)localObject).putExtras(localBundle);
              ((Intent)localObject).addFlags(268435456);
              startActivity((Intent)localObject);
              h.pYm.a(714L, 7L, 1L, false);
              AppMethodBeat.o(18832);
              bool = true;
            }
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.CleanNewUI", localException, "", new Object[0]);
            AppMethodBeat.o(18832);
            bool = true;
          }
      }
      else
      {
        AppMethodBeat.o(18832);
      }
    }
  }

  private boolean bgg()
  {
    AppMethodBeat.i(18831);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xMI, "");
    boolean bool;
    if (bo.isNullOrNil(str))
    {
      AppMethodBeat.o(18831);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        this.kwT = localJSONObject;
        this.kwQ = this.kwT.getString("packageName");
        this.kwT.get("md5");
        this.kwS = this.kwT.getString("launcherID");
        this.kwR = this.kwT.getString("signature");
        this.kwT.get("url");
        this.kwP = this.kwT.getLong("size");
        bool = true;
        AppMethodBeat.o(18831);
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.CleanNewUI", localJSONException, "", new Object[0]);
        AppMethodBeat.o(18831);
        bool = false;
      }
    }
  }

  private void bgj()
  {
    AppMethodBeat.i(18828);
    this.kyn.setEnabled(false);
    this.kyk.setVisibility(8);
    this.kyl.setVisibility(8);
    this.kyo.setVisibility(0);
    AppMethodBeat.o(18828);
  }

  private void bgk()
  {
    AppMethodBeat.i(18829);
    this.kyn.setEnabled(true);
    this.kyo.setVisibility(8);
    this.kyk.setVisibility(0);
    this.kyl.setVisibility(0);
    AppMethodBeat.o(18829);
  }

  private void bgl()
  {
    AppMethodBeat.i(18830);
    this.kyv = new com.tencent.mm.plugin.clean.b.a(this.kyA);
    this.kyy = bo.anU();
    d.post(this.kyv, "cleanUI_calc");
    bgj();
    h.pYm.a(714L, 52L, 1L, false);
    AppMethodBeat.o(18830);
  }

  public final void dQ(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18833);
    al.d(new CleanNewUI.7(this, paramInt1, paramInt2));
    AppMethodBeat.o(18833);
  }

  public final int getLayoutId()
  {
    return 2130969147;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18824);
    super.onCreate(paramBundle);
    setMMTitle(2131298308);
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(18811);
        CleanNewUI.this.finish();
        AppMethodBeat.o(18811);
        return false;
      }
    });
    this.kyj = ((LinearLayout)findViewById(2131822801));
    this.kyk = ((TextView)findViewById(2131822802));
    this.kyl = ((TextView)findViewById(2131822803));
    this.kym = ((Button)findViewById(2131822804));
    this.kym.setEnabled(false);
    this.kyn = ((Button)findViewById(2131822805));
    this.kyn.setVisibility(8);
    this.kyo = ((TextView)findViewById(2131822776));
    this.kym.setOnClickListener(new CleanNewUI.2(this));
    this.kyn.setOnClickListener(new CleanNewUI.3(this));
    this.kyp = ((LinearLayout)findViewById(2131822806));
    this.kyq = ((TextView)findViewById(2131822807));
    this.kyr = ((TextView)findViewById(2131822808));
    this.kys = ((Button)findViewById(2131822809));
    this.kyt = ((View)findViewById(2131822810));
    this.kys.setOnClickListener(new CleanNewUI.4(this));
    if ((bq.dpN()) || (com.tencent.mm.sdk.platformtools.g.cdf == 1))
    {
      this.kys.setVisibility(8);
      this.kyt.setVisibility(0);
    }
    j.bgd();
    long l1 = j.bfL();
    j.bgd();
    long l2 = j.bfM();
    this.kyq.setText(bo.ga(l1 - l2));
    this.kyr.setText(getString(2131298305, new Object[] { bo.ga(l2) }));
    com.tencent.mm.cj.c.atD("com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
    try
    {
      b.b localb = new com/tencent/mm/sdk/c/b$b;
      localb.<init>();
      localb.xxO = "https://";
      localb.host = "jtool.qq.com";
      localb.uri = "/channel?productId=31&channelId=102133";
      paramBundle = new com/tencent/mm/sdk/c/a;
      Object localObject = new java/net/URL;
      ((URL)localObject).<init>(localb.getUrl());
      paramBundle.<init>((HttpURLConnection)((URL)localObject).openConnection());
      CleanNewUI.5 local5 = new com/tencent/mm/plugin/clean/ui/fileindexui/CleanNewUI$5;
      local5.<init>(this, "");
      localObject = new com/tencent/mm/sdk/platformtools/ak;
      ((ak)localObject).<init>();
      paramBundle.a(localb, local5, (ak)localObject);
      if (b.aZc().aZg())
      {
        ab.i("MicroMsg.CleanNewUI", "%s it scan finish", new Object[] { aZk() });
        this.kyu = false;
        bgl();
        this.kyo.setText(getString(2131296518, new Object[] { "0%" }));
        h.pYm.a(714L, 50L, 1L, false);
        h.pYm.a(714L, 1L, 1L, false);
        AppMethodBeat.o(18824);
        return;
      }
    }
    catch (Exception paramBundle)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.CleanNewUI", paramBundle, paramBundle.getMessage(), new Object[0]);
        continue;
        ab.w("MicroMsg.CleanNewUI", "%s it scan not finish", new Object[] { aZk() });
        this.kyw = bo.anU();
        this.kyu = true;
        com.tencent.mm.sdk.b.a.xxA.b(this.kyB);
        b.aZc().fD(true);
        bgj();
        dQ(0, 100);
      }
    }
  }

  public void onDestroy()
  {
    boolean bool = false;
    AppMethodBeat.i(18826);
    super.onDestroy();
    ab.i("MicroMsg.CleanNewUI", "%s stop maunal scan needScanWxFileIndex[%b]", new Object[] { aZk(), Boolean.valueOf(this.kyu) });
    if (this.kyu)
    {
      com.tencent.mm.sdk.b.a.xxA.d(this.kyB);
      b localb = b.aZc();
      String str = localb.aZk();
      if (localb.jZM != null)
        bool = true;
      ab.i("MicroMsg.CalcWxService", "%s stop manual scan now manualScanTask[%b]", new Object[] { str, Boolean.valueOf(bool) });
      localb.f(new b.7(localb));
    }
    if (this.kyv != null)
      this.kyv.stop();
    AppMethodBeat.o(18826);
  }

  public void onResume()
  {
    AppMethodBeat.i(18825);
    super.onResume();
    if ((this.kyz > 0L) && (j.bgd().kvV != 0L))
    {
      long l = j.bgd().kvV;
      j.bgd();
      E(l, j.bfL());
    }
    AppMethodBeat.o(18825);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanNewUI
 * JD-Core Version:    0.6.2
 */