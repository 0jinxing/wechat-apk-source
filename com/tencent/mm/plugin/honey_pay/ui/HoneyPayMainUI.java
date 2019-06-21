package com.tencent.mm.plugin.honey_pay.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.honey_pay.a.a;
import com.tencent.mm.plugin.honey_pay.a.b;
import com.tencent.mm.plugin.honey_pay.a.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.plugin.wallet_core.ui.o.a;
import com.tencent.mm.protocal.protobuf.ati;
import com.tencent.mm.protocal.protobuf.bke;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.wallet_core.c.p;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.e;
import java.util.ArrayList;

public class HoneyPayMainUI extends HoneyPayBaseUI
{
  private ArrayList<HoneyPayCardLayout> nsA;
  private LinearLayout nsu;
  private ImageView nsv;
  private RelativeLayout nsw;
  private Button nsx;
  private LinearLayout nsy;
  private TextView nsz;

  public HoneyPayMainUI()
  {
    AppMethodBeat.i(41894);
    this.nsA = new ArrayList();
    AppMethodBeat.o(41894);
  }

  private void ab(Intent paramIntent)
  {
    AppMethodBeat.i(41901);
    boolean bool = paramIntent.getBooleanExtra("key_create_succ", false);
    String str = paramIntent.getStringExtra("key_card_no");
    paramIntent = paramIntent.getStringExtra("key_card_type");
    ab.i(this.TAG, "create succ: %s", new Object[] { Boolean.valueOf(bool) });
    if (bool)
      b(str, true, paramIntent);
    AppMethodBeat.o(41901);
  }

  private void b(String paramString1, boolean paramBoolean, String paramString2)
  {
    AppMethodBeat.i(41903);
    ab.i(this.TAG, "go to card manager: %s", new Object[] { paramString1 });
    Intent localIntent = new Intent(this, HoneyPayCardManagerUI.class);
    localIntent.putExtra("key_card_no", paramString1);
    localIntent.putExtra("key_scene", 0);
    localIntent.putExtra("key_is_create", paramBoolean);
    localIntent.putExtra("key_card_type", paramString2);
    startActivityForResult(localIntent, 3);
    AppMethodBeat.o(41903);
  }

  private void id(boolean paramBoolean)
  {
    AppMethodBeat.i(41902);
    ab.i(this.TAG, "get payer list");
    f localf = new f();
    localf.o(this);
    a(localf, paramBoolean, false);
    AppMethodBeat.o(41902);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41898);
    if ((paramm instanceof f))
    {
      paramString = (f)paramm;
      paramString.a(new HoneyPayMainUI.11(this, paramString)).b(new HoneyPayMainUI.10(this)).c(new HoneyPayMainUI.9(this));
    }
    while (true)
    {
      AppMethodBeat.o(41898);
      return true;
      if ((paramm instanceof a))
      {
        paramString = (a)paramm;
        paramString.a(new HoneyPayMainUI.14(this, paramString)).b(new HoneyPayMainUI.13(this, paramString)).c(new HoneyPayMainUI.12(this));
      }
      else if ((paramm instanceof b))
      {
        paramString = (b)paramm;
        paramString.a(new HoneyPayMainUI.3(this, paramString)).b(new HoneyPayMainUI.2(this)).c(new HoneyPayMainUI.15(this));
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130969831;
  }

  public final void initView()
  {
    AppMethodBeat.i(41896);
    this.nsy = ((LinearLayout)findViewById(2131824916));
    this.nsw = ((RelativeLayout)findViewById(2131824917));
    this.nsv = ((ImageView)findViewById(2131824919));
    this.nsx = ((Button)findViewById(2131824923));
    this.nsz = ((TextView)findViewById(2131824924));
    this.nsu = ((LinearLayout)findViewById(2131824925));
    this.nsu.setOnClickListener(new HoneyPayMainUI.1(this));
    this.nsx.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(41888);
        ab.i(HoneyPayMainUI.this.TAG, "click empty header add friend");
        HoneyPayMainUI.a(HoneyPayMainUI.this);
        AppMethodBeat.o(41888);
      }
    });
    AppMethodBeat.o(41896);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(41900);
    if (paramInt1 == 3)
      id(false);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(41900);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41895);
    this.yll = true;
    super.onCreate(paramBundle);
    nf(2725);
    nf(2618);
    nf(2926);
    ab(getIntent());
    initView();
    id(true);
    setMMTitle("");
    AppMethodBeat.o(41895);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41897);
    super.onDestroy();
    ng(2725);
    ng(2618);
    ng(2926);
    AppMethodBeat.o(41897);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(41899);
    ab.i(this.TAG, "on new intent");
    ab(paramIntent);
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(41899);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.honey_pay.ui.HoneyPayMainUI
 * JD-Core Version:    0.6.2
 */