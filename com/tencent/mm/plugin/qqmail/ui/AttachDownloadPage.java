package com.tencent.mm.plugin.qqmail.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.b.ac;
import com.tencent.mm.plugin.qqmail.b.v;
import com.tencent.mm.plugin.qqmail.b.v.c;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.aj;
import com.tencent.mm.ui.q;
import com.tencent.mm.vfs.e;
import java.util.HashMap;
import java.util.Map;

public class AttachDownloadPage extends MMActivity
{
  private int fUO = 0;
  private long fVz = 0L;
  private TextView gnh;
  private TextView iGX;
  private long jrb;
  private Button mlD;
  private Button mlF;
  private View mlI;
  private ProgressBar progressBar;
  private String ptI;
  private String pux;
  private long pvG;
  private MMImageView pvR;
  private ImageView pvS;
  private ImageView pvT;
  private TextView pvU;
  private LinearLayout pvV;
  private String pvW;
  private int pvX;
  private boolean pvY = false;
  private String pvZ;
  private boolean pwa = true;
  private int retryCount = 0;

  private void ccI()
  {
    AppMethodBeat.i(68147);
    if (FileExplorerUI.ajX(this.pvZ))
    {
      this.pvR.setBackgroundResource(2131231218);
      AppMethodBeat.o(68147);
    }
    while (true)
    {
      return;
      if (FileExplorerUI.ajY(this.pvZ))
      {
        this.pvR.setImageResource(2131230817);
        AppMethodBeat.o(68147);
      }
      else
      {
        int i = o.aiD(e.cv(this.pvZ));
        if (i > 0)
        {
          this.pvR.setImageResource(i);
          AppMethodBeat.o(68147);
        }
        else
        {
          this.pvR.setImageResource(2131230813);
          AppMethodBeat.o(68147);
        }
      }
    }
  }

  private void ccJ()
  {
    AppMethodBeat.i(68148);
    this.mlI.setVisibility(0);
    this.mlD.setVisibility(8);
    this.mlF.setVisibility(8);
    this.pvS.setVisibility(0);
    this.pvT.setVisibility(8);
    this.pvU.setVisibility(8);
    this.gnh.setVisibility(8);
    this.iGX.setVisibility(8);
    this.pvS.setOnClickListener(new AttachDownloadPage.3(this));
    this.pvT.setOnClickListener(new AttachDownloadPage.4(this));
    AppMethodBeat.o(68148);
  }

  private void ccK()
  {
    AppMethodBeat.i(68149);
    if (this.pvX == 1)
    {
      if (FileExplorerUI.ajX(this.pvZ))
        if (this.fUO == 3)
        {
          ccL();
          AppMethodBeat.o(68149);
        }
      while (true)
      {
        return;
        if ((this.fUO == 0) || (this.pwa))
        {
          this.retryCount = 0;
          this.pwa = false;
          ccM();
          ccJ();
          AppMethodBeat.o(68149);
        }
        else
        {
          this.mlI.setVisibility(8);
          this.gnh.setVisibility(0);
          this.pvU.setVisibility(8);
          this.mlD.setVisibility(0);
          this.mlF.setVisibility(8);
          this.iGX.setVisibility(0);
          this.mlD.setOnClickListener(new AttachDownloadPage.5(this));
          if (this.fUO != 3)
            break;
          this.gnh.setText(2131301263);
          this.iGX.setText(2131301260);
          this.iGX.setOnClickListener(new AttachDownloadPage.6(this));
          enableOptionMenu(true);
          AppMethodBeat.o(68149);
        }
      }
      this.gnh.setText(2131301263);
      if (this.fUO == 2)
        this.iGX.setText(2131301262);
      while (true)
      {
        this.iGX.setOnClickListener(new AttachDownloadPage.7(this));
        AppMethodBeat.o(68149);
        break;
        this.iGX.setText(2131301261);
      }
    }
    if (this.pvX == 0)
    {
      this.mlI.setVisibility(8);
      this.mlD.setVisibility(8);
      this.mlF.setVisibility(0);
      this.pvU.setVisibility(8);
      this.gnh.setVisibility(0);
      this.iGX.setVisibility(8);
      if (this.fUO != 3)
        break label388;
      this.mlF.setText(2131301257);
      enableOptionMenu(true);
    }
    while (true)
    {
      this.gnh.setText(2131301256);
      this.mlF.setOnClickListener(new AttachDownloadPage.8(this));
      AppMethodBeat.o(68149);
      break;
      label388: if (this.fUO == 2)
        this.mlF.setText(2131301264);
      else
        this.mlF.setText(2131301255);
    }
  }

  private void ccL()
  {
    AppMethodBeat.i(68150);
    Intent localIntent = new Intent();
    localIntent.putExtra("key_favorite", true);
    localIntent.putExtra("key_favorite_source_type", 9);
    localIntent.putExtra("key_image_path", jV(false));
    com.tencent.mm.plugin.qqmail.a.a.gkE.d(this.mController.ylL, localIntent);
    finish();
    AppMethodBeat.o(68150);
  }

  private void ccM()
  {
    AppMethodBeat.i(68151);
    ccP();
    if (this.fUO == 4)
      if (this.retryCount < 5)
      {
        this.retryCount += 1;
        ccM();
      }
    while (true)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("mailid", this.ptI);
      localHashMap.put("attachid", this.pux);
      localHashMap.put("username", "");
      localHashMap.put("offset", this.fVz);
      localHashMap.put("datalen", this.jrb);
      localHashMap.put("default_attach_name", ccN() + ".temp");
      v.c localc = new v.c();
      localc.puP = false;
      localc.puQ = false;
      this.pvG = ac.ccC().a("/cgi-bin/mmdownload", localHashMap, localc, new AttachDownloadPage.9(this));
      AppMethodBeat.o(68151);
      return;
      ccK();
      continue;
      if (this.fUO == 3)
      {
        e.h(this.pvW, ccN() + ".temp", ccN());
        this.fUO = 3;
        ccK();
      }
    }
  }

  private String ccN()
  {
    AppMethodBeat.i(68153);
    int i = this.pux.hashCode();
    int j = this.pvZ.lastIndexOf(".");
    String str1 = "";
    String str2;
    if (j != -1)
    {
      str2 = this.pvZ.substring(0, j);
      str1 = this.pvZ;
      str1 = str1.substring(j, str1.length());
    }
    while (true)
    {
      str2 = String.format("%s_%d%s", new Object[] { str2, Integer.valueOf(i & 0xFFFF), str1 });
      AppMethodBeat.o(68153);
      return str2;
      str2 = this.pvZ;
    }
  }

  private String ccO()
  {
    AppMethodBeat.i(68155);
    String str = this.pvW + this.pvZ;
    AppMethodBeat.o(68155);
    return str;
  }

  private void ccP()
  {
    AppMethodBeat.i(68156);
    if (e.ct(jV(true)))
    {
      this.fVz = e.asZ(jV(true));
      this.fUO = 2;
      AppMethodBeat.o(68156);
    }
    while (true)
    {
      return;
      if (e.ct(jV(false)))
      {
        this.fUO = 3;
        AppMethodBeat.o(68156);
      }
      else if (e.ct(ccO()))
      {
        if (e.asZ(ccO()) == this.jrb)
        {
          e.h(this.pvW, this.pvZ, ccN());
          this.fUO = 3;
          AppMethodBeat.o(68156);
        }
        else if (e.asZ(ccO()) > this.jrb)
        {
          e.deleteFile(ccO());
          this.fVz = 0L;
          this.fUO = 4;
          AppMethodBeat.o(68156);
        }
        else
        {
          this.fVz = 0L;
          this.fUO = 0;
          AppMethodBeat.o(68156);
        }
      }
      else
      {
        this.fVz = 0L;
        this.fUO = 0;
        AppMethodBeat.o(68156);
      }
    }
  }

  private String jV(boolean paramBoolean)
  {
    AppMethodBeat.i(68154);
    StringBuilder localStringBuilder = new StringBuilder().append(this.pvW).append(ccN());
    if (!paramBoolean);
    for (String str = ""; ; str = ".temp")
    {
      str = str;
      AppMethodBeat.o(68154);
      return str;
    }
  }

  public final int getLayoutId()
  {
    return 2130968783;
  }

  public final void initView()
  {
    AppMethodBeat.i(68146);
    this.pvR = ((MMImageView)findViewById(2131821523));
    this.mlI = findViewById(2131821524);
    this.progressBar = ((ProgressBar)findViewById(2131821525));
    this.pvS = ((ImageView)findViewById(2131821526));
    this.pvT = ((ImageView)findViewById(2131821527));
    this.pvU = ((TextView)findViewById(2131821528));
    this.mlD = ((Button)findViewById(2131821529));
    this.mlF = ((Button)findViewById(2131821530));
    this.pvV = ((LinearLayout)findViewById(2131821531));
    this.gnh = ((TextView)findViewById(2131821532));
    this.iGX = ((TextView)findViewById(2131821533));
    ccI();
    setBackBtn(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        AppMethodBeat.i(68130);
        AttachDownloadPage.this.finish();
        AppMethodBeat.o(68130);
        return true;
      }
    });
    addIconOptionMenu(0, 2131231770, new AttachDownloadPage.2(this));
    enableOptionMenu(false);
    ccP();
    if (this.fUO == 1)
    {
      ccJ();
      AppMethodBeat.o(68146);
    }
    while (true)
    {
      return;
      ccK();
      AppMethodBeat.o(68146);
    }
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(68152);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, true, 2131298926, 2131298927, 3);
    AppMethodBeat.o(68152);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(68157);
    super.onConfigurationChanged(paramConfiguration);
    int i = getResources().getConfiguration().orientation;
    paramConfiguration = (FrameLayout.LayoutParams)this.pvV.getLayoutParams();
    if (i == 2)
      paramConfiguration.bottomMargin = aj.fromDPToPix(this.mController.ylL, 60);
    while (true)
    {
      this.pvV.setLayoutParams(paramConfiguration);
      AppMethodBeat.o(68157);
      return;
      if (i == 1)
        paramConfiguration.bottomMargin = aj.fromDPToPix(this.mController.ylL, 120);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(68142);
    super.onCreate(paramBundle);
    this.pvX = getIntent().getIntExtra("is_preview", 0);
    this.pvY = getIntent().getBooleanExtra("is_compress", false);
    this.pvZ = getIntent().getStringExtra("attach_name");
    this.ptI = getIntent().getStringExtra("mail_id");
    this.pux = getIntent().getStringExtra("attach_id");
    this.jrb = getIntent().getLongExtra("total_size", 0L);
    ac.ccC();
    this.pvW = v.getDownloadPath();
    setMMTitle(this.pvZ);
    initView();
    AppMethodBeat.o(68142);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(68145);
    super.onDestroy();
    ac.ccC().cancel(this.pvG);
    AppMethodBeat.o(68145);
  }

  public void onPause()
  {
    AppMethodBeat.i(68144);
    super.onPause();
    AppMethodBeat.o(68144);
  }

  public void onResume()
  {
    AppMethodBeat.i(68143);
    super.onResume();
    AppMethodBeat.o(68143);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.AttachDownloadPage
 * JD-Core Version:    0.6.2
 */