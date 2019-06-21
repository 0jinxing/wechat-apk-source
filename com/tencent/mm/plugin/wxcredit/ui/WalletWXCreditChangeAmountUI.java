package com.tencent.mm.plugin.wxcredit.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.wxcredit.a.e;
import com.tencent.mm.plugin.wxcredit.a.l;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.wallet_core.a;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import java.util.ArrayList;
import java.util.List;

public class WalletWXCreditChangeAmountUI extends WalletBaseUI
  implements View.OnClickListener
{
  private List<l> uYY;
  private List<l> uYZ;
  private l uZa;
  private l uZb;
  private int uZc;
  private boolean uZd;
  private boolean uZe;
  private TextView uZf;
  private TextView uZg;
  private TextView uZh;
  private TextView uZi;
  private TextView uZj;
  private TextView uZk;
  private EditText uZl;
  private EditText uZm;
  private EditText uZn;
  private EditText uZo;
  private BaseAdapter uZp;
  private BaseAdapter uZq;

  public WalletWXCreditChangeAmountUI()
  {
    AppMethodBeat.i(48703);
    this.uYZ = new ArrayList();
    this.uZc = -1;
    this.uZp = new WalletWXCreditChangeAmountUI.11(this);
    this.uZq = new WalletWXCreditChangeAmountUI.2(this);
    AppMethodBeat.o(48703);
  }

  private void cu()
  {
    AppMethodBeat.i(48706);
    if (this.uZa != null)
    {
      this.uZf.setText(this.uZa.desc);
      if (this.uZa.uYS == null)
        break label300;
      this.uZj.setVisibility(0);
      this.uZl.setVisibility(8);
      this.uZh.setText(this.uZa.uYS.desc);
      this.uZm.setHint(this.uZa.uYS.kfM);
      if ("Y".equals(this.uZa.nYb))
      {
        this.uZh.setVisibility(0);
        this.uZm.setVisibility(0);
        this.uZj.setText(2131297088);
      }
    }
    else
    {
      if (this.uZb == null)
        break label451;
      this.uZg.setText(this.uZb.desc);
      if (this.uZb.uYS == null)
        break label402;
      this.uZk.setVisibility(0);
      this.uZn.setVisibility(8);
      this.uZi.setText(this.uZb.uYS.desc);
      this.uZo.setHint(this.uZb.uYS.kfM);
      if (!"Y".equals(this.uZb.nYb))
        break label352;
      this.uZi.setVisibility(0);
      this.uZo.setVisibility(0);
      this.uZk.setText(2131297088);
      AppMethodBeat.o(48706);
    }
    while (true)
    {
      return;
      this.uZh.setVisibility(8);
      this.uZm.setVisibility(8);
      if (!"N".equals(this.uZa.nYb))
        break;
      this.uZj.setText(2131296990);
      break;
      label300: this.uZj.setVisibility(8);
      this.uZl.setVisibility(0);
      this.uZl.setHint(this.uZa.kfM);
      this.uZh.setVisibility(8);
      this.uZm.setVisibility(8);
      break;
      label352: this.uZi.setVisibility(8);
      this.uZo.setVisibility(8);
      if ("N".equals(this.uZb.nYb))
      {
        this.uZk.setText(2131296990);
        AppMethodBeat.o(48706);
        continue;
        label402: this.uZk.setVisibility(8);
        this.uZn.setVisibility(0);
        this.uZn.setHint(this.uZb.kfM);
        this.uZi.setVisibility(8);
        this.uZo.setVisibility(8);
      }
      else
      {
        label451: AppMethodBeat.o(48706);
      }
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(48707);
    boolean bool;
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      if (!(paramm instanceof e))
        break label165;
      this.uYY = ((e)paramm).uYx;
      this.uZc = ((e)paramm).uYy;
      if ((this.uYY != null) && (this.uYY.size() >= 2))
      {
        this.uZa = ((l)this.uYY.get(0));
        this.uZb = ((l)this.uYY.get(1));
        this.uZa.uYP = 1;
        this.uZb.uYP = 2;
      }
      cu();
      AppMethodBeat.o(48707);
      bool = true;
    }
    while (true)
    {
      return bool;
      if ((paramm instanceof com.tencent.mm.plugin.wxcredit.a.c))
      {
        h.a(this, paramString, null, false, new WalletWXCreditChangeAmountUI.3(this));
        AppMethodBeat.o(48707);
        bool = true;
      }
      else
      {
        label165: AppMethodBeat.o(48707);
        bool = false;
      }
    }
  }

  public final int getLayoutId()
  {
    return 2130971184;
  }

  public final void initView()
  {
    AppMethodBeat.i(48705);
    setMMTitle(2131305514);
    this.uZf = ((TextView)findViewById(2131829080));
    this.uZh = ((TextView)findViewById(2131829083));
    this.uZg = ((TextView)findViewById(2131829085));
    this.uZi = ((TextView)findViewById(2131829088));
    this.uZl = ((EditText)findViewById(2131829081));
    this.uZm = ((EditText)findViewById(2131829084));
    this.uZn = ((EditText)findViewById(2131829086));
    this.uZo = ((EditText)findViewById(2131829089));
    this.uZj = ((TextView)findViewById(2131829082));
    this.uZk = ((TextView)findViewById(2131829087));
    this.uZj.setOnClickListener(this);
    this.uZk.setOnClickListener(this);
    this.uZf.setOnClickListener(new WalletWXCreditChangeAmountUI.1(this));
    this.uZg.setOnClickListener(new WalletWXCreditChangeAmountUI.4(this));
    setBackBtn(new WalletWXCreditChangeAmountUI.5(this));
    findViewById(2131822846).setOnClickListener(new WalletWXCreditChangeAmountUI.6(this));
    AppMethodBeat.o(48705);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(48708);
    if (paramView.getId() == 2131829082)
    {
      this.uZe = true;
      showDialog(2);
      AppMethodBeat.o(48708);
    }
    while (true)
    {
      return;
      if (paramView.getId() == 2131829087)
      {
        this.uZe = false;
        showDialog(2);
      }
      AppMethodBeat.o(48708);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(48704);
    super.onCreate(paramBundle);
    initView();
    cu();
    AppMethodBeat.o(48704);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wxcredit.ui.WalletWXCreditChangeAmountUI
 * JD-Core Version:    0.6.2
 */