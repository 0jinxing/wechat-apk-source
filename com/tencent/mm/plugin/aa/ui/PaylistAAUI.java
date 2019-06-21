package com.tencent.mm.plugin.aa.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.aa.a.c.g.d;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.pluginsdk.ui.e.m;
import com.tencent.mm.protocal.protobuf.t;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.wallet_core.ui.WalletTextView;
import java.util.List;

public class PaylistAAUI extends BaseAAPresenterActivity
{
  private String cJH;
  private String cva;
  private View gnR;
  private Dialog gnn;
  private String gpA;
  private long gpB;
  private com.tencent.mm.plugin.aa.a.c.g gpl;
  private com.tencent.mm.plugin.aa.a.c.f gpm;
  private LinearLayout gpn;
  private LinearLayout gpo;
  private LinearLayout gpp;
  private WalletTextView gpq;
  private Button gpr;
  private TextView gps;
  private TextView gpt;
  private TextView gpu;
  private TextView gpv;
  private String gpw;
  private String gpx;
  private String gpy;
  private int gpz;
  private String title;

  public PaylistAAUI()
  {
    AppMethodBeat.i(40885);
    this.gpl = ((com.tencent.mm.plugin.aa.a.c.g)V(com.tencent.mm.plugin.aa.a.c.g.class));
    this.gpm = ((com.tencent.mm.plugin.aa.a.c.f)Z(com.tencent.mm.plugin.aa.a.c.f.class));
    this.gnn = null;
    AppMethodBeat.o(40885);
  }

  private static boolean K(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == com.tencent.mm.plugin.aa.a.a.gld) && (paramInt2 != com.tencent.mm.plugin.aa.a.a.glh) && (paramInt3 == com.tencent.mm.plugin.aa.a.a.gkZ));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void a(LinearLayout paramLinearLayout, t paramt, boolean paramBoolean)
  {
    AppMethodBeat.i(40891);
    LinearLayout localLinearLayout = (LinearLayout)getLayoutInflater().inflate(2130970344, paramLinearLayout, false);
    ImageView localImageView = (ImageView)localLinearLayout.findViewById(2131826456);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(2131826457);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(2131826458);
    View localView = localLinearLayout.findViewById(2131821128);
    if (paramBoolean)
    {
      localView.setVisibility(8);
      a.b.b(localImageView, paramt.vAh);
      localTextView1.setText(j.b(this.mController.ylL, this.gpm.mJ(paramt.vAh), localTextView1.getTextSize()));
      if (paramt.vAj != com.tencent.mm.plugin.aa.a.a.glk)
        break label198;
      localTextView2.setText(getString(2131301915, new Object[] { Double.valueOf(paramt.vzU / 100.0D) }));
      localTextView2.setTextColor(getResources().getColor(2131690332));
      localTextView2.setVisibility(0);
      paramLinearLayout.addView(localLinearLayout);
      AppMethodBeat.o(40891);
    }
    while (true)
    {
      return;
      localView.setVisibility(0);
      break;
      label198: if (paramt.vAj == com.tencent.mm.plugin.aa.a.a.glj)
      {
        localTextView2.setText(getString(2131301905, new Object[] { Double.valueOf(paramt.vzU / 100.0D) }));
        localTextView2.setTextColor(getResources().getColor(2131690334));
        localTextView2.setVisibility(0);
        paramLinearLayout.addView(localLinearLayout);
        AppMethodBeat.o(40891);
      }
      else
      {
        localTextView2.setVisibility(8);
        paramLinearLayout.addView(localLinearLayout);
        AppMethodBeat.o(40891);
      }
    }
  }

  private void a(List<t> paramList, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(40889);
    ((TextView)findViewById(2131826470)).setText(paramString);
    paramString = this.gpu;
    int i;
    LinearLayout localLinearLayout;
    if (paramBoolean)
    {
      i = 0;
      paramString.setVisibility(i);
      localLinearLayout = (LinearLayout)findViewById(2131826472);
      localLinearLayout.removeAllViews();
      i = 0;
      label58: if (i >= paramList.size())
        break label122;
      paramString = (t)paramList.get(i);
      if (i < paramList.size() - 1)
        break label117;
    }
    label117: for (paramBoolean = true; ; paramBoolean = false)
    {
      a(localLinearLayout, paramString, paramBoolean);
      i++;
      break label58;
      i = 8;
      break;
    }
    label122: AppMethodBeat.o(40889);
  }

  private void aoL()
  {
    AppMethodBeat.i(40887);
    this.gnn = com.tencent.mm.wallet_core.ui.g.b(this, false, null);
    this.gnR.setVisibility(4);
    this.gpl.gmS.aor().f(new PaylistAAUI.10(this)).a(new PaylistAAUI.9(this));
    AppMethodBeat.o(40887);
  }

  private void d(List<t> paramList, String paramString)
  {
    AppMethodBeat.i(40890);
    ((TextView)findViewById(2131826474)).setText(paramString);
    LinearLayout localLinearLayout = (LinearLayout)findViewById(2131826475);
    localLinearLayout.removeAllViews();
    int i = 0;
    if (i < paramList.size())
    {
      paramString = (t)paramList.get(i);
      if (i >= paramList.size() - 1);
      for (boolean bool = true; ; bool = false)
      {
        a(localLinearLayout, paramString, bool);
        i++;
        break;
      }
    }
    AppMethodBeat.o(40890);
  }

  public final int getLayoutId()
  {
    return 2130970345;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(40892);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject;
    if (paramInt1 == 233)
    {
      if (paramInt2 != -1)
        break label309;
      ab.i("MicroMsg.PaylistAAUI", "pay success, payMsgId: %s", new Object[] { this.cJH });
      RealnameGuideHelper localRealnameGuideHelper = (RealnameGuideHelper)paramIntent.getParcelableExtra("key_realname_guide_helper");
      if (localRealnameGuideHelper != null)
      {
        ab.i("MicroMsg.PaylistAAUI", "do realname guide");
        localObject = new Intent();
        ((Intent)localObject).putExtra("key_realname_guide_helper", localRealnameGuideHelper);
        d.b(this, "wallet_core", ".id_verify.RealnameDialogActivity", (Intent)localObject);
      }
      com.tencent.mm.plugin.aa.a.h.vF(this.gpx);
      finish();
      localObject = this.gpl.gmU;
      com.tencent.mm.vending.g.f.h(this.cJH, this.gpy, this.gpA).c((com.tencent.mm.vending.c.a)localObject).f(new PaylistAAUI.7(this));
      com.tencent.mm.plugin.report.service.h.pYm.a(407L, 12L, 1L, false);
      paramIntent = paramIntent.getStringExtra("key_trans_id");
      localObject = this.gpl.gmV;
      com.tencent.mm.vending.g.f.h(Long.valueOf(this.gpB), this.cva, paramIntent).c((com.tencent.mm.vending.c.a)localObject);
      AppMethodBeat.o(40892);
    }
    while (true)
    {
      return;
      if ((paramInt1 == 222) && (paramInt2 == -1))
      {
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        ab.i("MicroMsg.PaylistAAUI", "select chatroom：%s", new Object[] { localObject });
        if (!bo.isNullOrNil((String)localObject))
        {
          paramIntent = new Intent(this.mController.ylL, LaunchAAUI.class);
          paramIntent.putExtra("enter_scene", 3);
          paramIntent.putExtra("chatroom_name", (String)localObject);
          startActivity(paramIntent);
        }
      }
      label309: AppMethodBeat.o(40892);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(40886);
    super.onCreate(paramBundle);
    setBackBtn(new PaylistAAUI.1(this));
    setMMTitle(2131300931);
    this.gpx = getIntent().getStringExtra("chatroom");
    this.gpn = ((LinearLayout)findViewById(2131826462));
    this.gpo = ((LinearLayout)findViewById(2131826465));
    this.gpp = ((LinearLayout)findViewById(2131826473));
    this.gps = ((TextView)findViewById(2131826463));
    this.gpt = ((TextView)findViewById(2131826464));
    this.gnR = findViewById(2131823601);
    this.gpu = ((TextView)findViewById(2131826471));
    this.gpu.setClickable(true);
    this.gpu.setOnTouchListener(new m(this));
    paramBundle = new SpannableStringBuilder(getString(2131301918));
    paramBundle.setSpan(new a(new PaylistAAUI.8(this)), 0, paramBundle.length(), 18);
    this.gpu.setText(paramBundle);
    this.gpv = ((TextView)findViewById(2131826477));
    aoL();
    AppMethodBeat.o(40886);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(40888);
    super.onDestroy();
    AppMethodBeat.o(40888);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.PaylistAAUI
 * JD-Core Version:    0.6.2
 */