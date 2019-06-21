package com.tencent.mm.plugin.collect.reward.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.e;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.collect.reward.a.a;
import com.tencent.mm.plugin.collect.reward.b.b;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMGridView;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMEditText;
import com.tencent.mm.wallet_core.ui.formview.WalletFormView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class QrRewardSetMoneyUI extends QrRewardBaseUI
{
  private String desc;
  private String hHN;
  private TextView iDT;
  private MMGridView kEY;
  private Button kEZ;
  private int kEb;
  private ImageView kEn;
  private MMEditText kFa;
  private TextView kFb;
  private TextView kFc;
  private SparseArray<WalletFormView> kFd;
  private List<Integer> kFe;
  private List<Integer> kFf;
  private boolean kFg;
  private Runnable kFh;
  private TextWatcher kFi;

  public QrRewardSetMoneyUI()
  {
    AppMethodBeat.i(41158);
    this.kFg = false;
    this.kFh = new QrRewardSetMoneyUI.5(this);
    this.kFi = new QrRewardSetMoneyUI.6(this);
    AppMethodBeat.o(41158);
  }

  private boolean bhf()
  {
    boolean bool = false;
    AppMethodBeat.i(41163);
    int i = 0;
    if (i < this.kFe.size())
      if (!((Integer)this.kFe.get(i)).equals(this.kFf.get(i)))
      {
        ab.i("MicroMsg.QrRewardSetMoneyUI", "modify money: %s, %s", new Object[] { this.kFe.get(i), this.kFf.get(i) });
        AppMethodBeat.o(41163);
        bool = true;
      }
    while (true)
    {
      return bool;
      i++;
      break;
      AppMethodBeat.o(41163);
    }
  }

  private void bhg()
  {
    AppMethodBeat.i(41164);
    int i = 0;
    if (i < this.kFf.size())
    {
      WalletFormView localWalletFormView = (WalletFormView)LayoutInflater.from(this.mController.ylL).inflate(2130970435, null);
      localWalletFormView.a(this.kFi);
      int j = ((Integer)this.kFf.get(i)).intValue();
      int k = j / 100;
      double d = j / 100.0D;
      if (d > k)
        localWalletFormView.setText(String.format("%.2f", new Object[] { Double.valueOf(d) }));
      while (true)
      {
        e(localWalletFormView, 2, false);
        this.kFd.put(i, localWalletFormView);
        i++;
        break;
        localWalletFormView.setText(String.format("%d", new Object[] { Integer.valueOf(k) }));
      }
    }
    AppMethodBeat.o(41164);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41162);
    if ((paramm instanceof com.tencent.mm.plugin.collect.reward.a.g))
    {
      paramString = (com.tencent.mm.plugin.collect.reward.a.g)paramm;
      paramString.a(new QrRewardSetMoneyUI.4(this, paramString)).b(new QrRewardSetMoneyUI.3(this, paramString)).c(new QrRewardSetMoneyUI.2(this));
    }
    AppMethodBeat.o(41162);
    return false;
  }

  public final int getLayoutId()
  {
    return 2130970437;
  }

  public final void initView()
  {
    AppMethodBeat.i(41160);
    this.kEY = ((MMGridView)findViewById(2131826776));
    this.kEZ = ((Button)findViewById(2131826777));
    this.kFb = ((TextView)findViewById(2131826779));
    this.kEn = ((ImageView)findViewById(2131826773));
    this.kFa = ((MMEditText)findViewById(2131826775));
    this.iDT = ((TextView)findViewById(2131826774));
    this.kFc = ((TextView)findViewById(2131826778));
    String str = r.YB();
    Object localObject = str;
    if (bo.isNullOrNil(str))
      localObject = r.YC();
    this.iDT.setText(j.b(this.mController.ylL, (CharSequence)localObject));
    a.b.a(this.kEn, r.Yz(), 0.06F, false);
    localObject = new QrRewardSetMoneyUI.a(this, (byte)0);
    this.kEY.setAdapter((ListAdapter)localObject);
    if (!bo.isNullOrNil(this.desc))
      this.kFa.setText(j.b(this, this.desc, this.kFa.getTextSize()));
    this.kFb.setText(getString(2131302080, new Object[] { Math.round(this.kEb / 100.0F) }));
    if (this.kFg)
    {
      this.kEZ.setText(2131302061);
      this.kFc.setVisibility(8);
    }
    this.kEZ.setOnClickListener(new QrRewardSetMoneyUI.1(this));
    AppMethodBeat.o(41160);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41159);
    super.onCreate(paramBundle);
    setMMTitle(2131302083);
    nf(1562);
    paramBundle = bo.hT((String)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTB, ""), ",");
    this.kFe = new ArrayList();
    if (paramBundle.isEmpty())
    {
      ab.i("MicroMsg.QrRewardSetMoneyUI", "use client hardcode amt list");
      this.kFe = Arrays.asList(b.kDG);
    }
    while (true)
    {
      this.kFf = new ArrayList(this.kFe);
      this.kEb = ((Integer)com.tencent.mm.kernel.g.RP().Ry().get(ac.a.xTA, Integer.valueOf(20000))).intValue();
      this.kFg = getIntent().getBooleanExtra("key_first_flag", false);
      this.desc = getIntent().getStringExtra("key_desc_word");
      this.kFd = new SparseArray();
      bhg();
      initView();
      AppMethodBeat.o(41159);
      return;
      Iterator localIterator = paramBundle.iterator();
      while (localIterator.hasNext())
      {
        paramBundle = (String)localIterator.next();
        this.kFe.add(Integer.valueOf(bo.getInt(paramBundle, 0)));
      }
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(41161);
    super.onDestroy();
    ng(1562);
    al.af(this.kFh);
    AppMethodBeat.o(41161);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardSetMoneyUI
 * JD-Core Version:    0.6.2
 */