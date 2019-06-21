package com.tencent.mm.plugin.clean.ui.newui;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.model.app.p;
import com.tencent.mm.sdk.c.a;
import com.tencent.mm.sdk.c.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.bq;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONException;
import org.json.JSONObject;

public class CleanNewUI extends MMActivity
  implements com.tencent.mm.plugin.clean.c.g
{
  private long kwP;
  private String kwQ = "com.tencent.qqpimsecure";
  private String kwR = "00B1208638DE0FCD3E920886D658DAF6";
  private String kwS = "11206657";
  private JSONObject kwT;
  private com.tencent.mm.plugin.clean.c.c kyR;
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

  private void E(long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(18919);
    bgk();
    this.kyk.setText(bo.ga(paramLong1));
    int i = (int)(100L * paramLong1 / paramLong2);
    this.kyl.setText(getString(2131298327, new Object[] { i + "%" }));
    AppMethodBeat.o(18919);
  }

  private boolean bgf()
  {
    boolean bool = false;
    AppMethodBeat.i(18924);
    bgg();
    if (!p.u(this.mController.ylL, this.kwQ))
      AppMethodBeat.o(18924);
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
              h.pYm.a(282L, 6L, 1L, false);
              AppMethodBeat.o(18924);
              bool = true;
            }
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.CleanNewUI", localException, "", new Object[0]);
            AppMethodBeat.o(18924);
            bool = true;
          }
      }
      else
      {
        AppMethodBeat.o(18924);
      }
    }
  }

  private boolean bgg()
  {
    AppMethodBeat.i(18923);
    aw.ZK();
    String str = (String)com.tencent.mm.model.c.Ry().get(ac.a.xMI, "");
    boolean bool;
    if (bo.isNullOrNil(str))
    {
      AppMethodBeat.o(18923);
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
        AppMethodBeat.o(18923);
      }
      catch (JSONException localJSONException)
      {
        ab.printErrStackTrace("MicroMsg.CleanNewUI", localJSONException, "", new Object[0]);
        AppMethodBeat.o(18923);
        bool = false;
      }
    }
  }

  private void bgk()
  {
    AppMethodBeat.i(18920);
    this.kyn.setEnabled(true);
    this.kyo.setVisibility(8);
    this.kyk.setVisibility(0);
    this.kyl.setVisibility(0);
    AppMethodBeat.o(18920);
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3, ArrayList<com.tencent.mm.plugin.clean.c.b> paramArrayList, long paramLong4, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(18922);
    ab.i("MicroMsg.CleanNewUI", "wechatSize[%d] accSize[%d] otherAccSize[%d]", new Object[] { Long.valueOf(paramLong2), Long.valueOf(paramLong3), Long.valueOf(paramLong4) });
    com.tencent.mm.plugin.clean.c.d.hg(paramLong1);
    com.tencent.mm.plugin.clean.c.d.hd(paramLong2);
    com.tencent.mm.plugin.clean.c.d.hf(paramLong4);
    com.tencent.mm.plugin.clean.c.d.b(paramHashSet);
    com.tencent.mm.plugin.clean.c.d.he(paramLong3);
    com.tencent.mm.plugin.clean.c.d.u(paramArrayList);
    E(com.tencent.mm.plugin.clean.c.d.bfT(), com.tencent.mm.plugin.clean.c.c.bfL());
    AppMethodBeat.o(18922);
  }

  public final void dO(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18921);
    this.kyo.setText(getString(2131296518, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    AppMethodBeat.o(18921);
  }

  public final int getLayoutId()
  {
    return 2130969147;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18917);
    super.onCreate(paramBundle);
    setMMTitle(2131298323);
    setBackBtn(new CleanNewUI.1(this));
    this.kyj = ((LinearLayout)findViewById(2131822801));
    this.kyk = ((TextView)findViewById(2131822802));
    this.kyl = ((TextView)findViewById(2131822803));
    this.kym = ((Button)findViewById(2131822804));
    this.kyn = ((Button)findViewById(2131822805));
    this.kyn.setVisibility(8);
    this.kyo = ((TextView)findViewById(2131822776));
    this.kym.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(18912);
        ab.i("MicroMsg.CleanNewUI", "goto clean msg ui");
        CleanNewUI.this.startActivityForResult(new Intent(CleanNewUI.this, CleanMsgUI.class), 0);
        AppMethodBeat.o(18912);
      }
    });
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
    long l1 = com.tencent.mm.plugin.clean.c.c.bfL();
    long l2 = com.tencent.mm.plugin.clean.c.c.bfM();
    this.kyq.setText(bo.ga(l1 - l2));
    this.kyr.setText(getString(2131298305, new Object[] { bo.ga(l2) }));
    com.tencent.mm.cj.c.atD("com.tencent.mm.intent.ACTION_CLEAR_WEBVIEW_CACHE");
    try
    {
      paramBundle = new com/tencent/mm/sdk/c/b$b;
      paramBundle.<init>();
      paramBundle.xxO = "https://";
      paramBundle.host = "jtool.qq.com";
      paramBundle.uri = "/channel?productId=31&channelId=102133";
      a locala = new com/tencent/mm/sdk/c/a;
      Object localObject = new java/net/URL;
      ((URL)localObject).<init>(paramBundle.getUrl());
      locala.<init>((HttpURLConnection)((URL)localObject).openConnection());
      CleanNewUI.5 local5 = new com/tencent/mm/plugin/clean/ui/newui/CleanNewUI$5;
      local5.<init>(this, "");
      localObject = new com/tencent/mm/sdk/platformtools/ak;
      ((ak)localObject).<init>();
      locala.a(paramBundle, local5, (ak)localObject);
      com.tencent.mm.plugin.clean.c.d.a(new com.tencent.mm.plugin.clean.c.a.b());
      if (com.tencent.mm.plugin.clean.c.d.bfS() == null)
      {
        paramBundle = com.tencent.mm.plugin.clean.c.d.bfQ();
        if (paramBundle != null)
        {
          this.kyR = new com.tencent.mm.plugin.clean.c.c(paramBundle, this);
          com.tencent.mm.sdk.g.d.post(this.kyR, "CleanUI_clean");
          this.kyn.setEnabled(false);
          this.kyk.setVisibility(8);
          this.kyl.setVisibility(8);
          this.kyo.setVisibility(0);
          this.kyo.setText(getString(2131296518, new Object[] { "0%" }));
        }
      }
      AppMethodBeat.o(18917);
      return;
    }
    catch (Exception paramBundle)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.CleanNewUI", paramBundle, paramBundle.getMessage(), new Object[0]);
    }
  }

  public void onResume()
  {
    AppMethodBeat.i(18918);
    super.onResume();
    if (com.tencent.mm.plugin.clean.c.d.bfS() != null)
      E(com.tencent.mm.plugin.clean.c.d.bfT(), com.tencent.mm.plugin.clean.c.c.bfL());
    AppMethodBeat.o(18918);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanNewUI
 * JD-Core Version:    0.6.2
 */