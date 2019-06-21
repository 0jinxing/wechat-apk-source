package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.plugin.luckymoney.model.ai;
import com.tencent.mm.plugin.luckymoney.model.aj;
import com.tencent.mm.plugin.luckymoney.model.x;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMLoadMoreListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class LuckyMoneyMyRecordUI extends LuckyMoneyBaseUI
{
  private int Lp;
  private View gwR;
  private boolean hZu;
  private ImageView kEn;
  private TextView kFs;
  private int mType;
  private TextView nSD;
  private List<com.tencent.mm.plugin.luckymoney.model.r> nSx;
  public String nYT;
  private boolean ocG;
  private Map<String, Integer> ocN;
  public String ocP;
  private MMLoadMoreListView odn;
  private e odo;
  private TextView oeR;
  private TextView oeS;
  private TextView oeT;
  private TextView oeU;
  private TextView oeV;
  private TextView oeW;
  private TextView oeX;
  private String oeY;
  private int oeZ;
  public List<String> ofa;

  public LuckyMoneyMyRecordUI()
  {
    AppMethodBeat.i(42770);
    this.Lp = 0;
    this.nSx = new LinkedList();
    this.ocN = new HashMap();
    this.ocG = true;
    this.hZu = false;
    this.oeZ = -1;
    this.ofa = new ArrayList();
    this.ocP = "";
    this.nYT = "";
    AppMethodBeat.o(42770);
  }

  private void bMB()
  {
    AppMethodBeat.i(42773);
    this.oeX.setVisibility(8);
    this.gwR.findViewById(2131825544).setVisibility(8);
    String str;
    if (this.mType == 1)
    {
      setMMTitle(getString(2131301137));
      str = getString(2131301187, new Object[] { com.tencent.mm.model.r.YB() });
      x.a(this.mController.ylL, this.oeR, str);
      this.oeT.setText(2131301193);
      this.odo = new f(this.mController.ylL);
      this.oeX.setVisibility(0);
    }
    while (true)
    {
      this.odn.setAdapter(this.odo);
      a.b.a(this.kEn, com.tencent.mm.model.r.Yz(), 0.0F, false);
      this.oeW.setText(getString(2131301176, new Object[] { bo.nullAsNil(this.oeY) }));
      AppMethodBeat.o(42773);
      return;
      setMMTitle(getString(2131301135));
      str = getString(2131301174, new Object[] { com.tencent.mm.model.r.YB() });
      x.a(this.mController.ylL, this.oeR, str);
      this.oeT.setText(2131301175);
      this.odo = new d(this.mController.ylL);
      this.gwR.findViewById(2131825544).setVisibility(0);
    }
  }

  private int bMC()
  {
    if (this.mType == 1);
    for (int i = 8; ; i = 9)
      return i;
  }

  private void bMr()
  {
    AppMethodBeat.i(42775);
    this.hZu = true;
    if (this.Lp == 0)
      this.ocP = "";
    n(new ai(11, this.Lp, this.mType, this.oeY, "v1.0", this.ocP));
    AppMethodBeat.o(42775);
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(42774);
    label385: boolean bool;
    if ((paramm instanceof ai))
    {
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = (ai)paramm;
        paramm = paramString.nYQ.nXj;
        this.ocP = paramString.nYz;
        this.nYT = paramString.nYT;
        Object localObject2;
        if (this.Lp == 0)
        {
          this.ofa = paramString.nYR;
          this.oeY = paramString.nYS;
          localObject1 = findViewById(2131825538);
          localObject2 = (ImageView)findViewById(2131825540);
          if (this.ofa.size() > 1)
          {
            ((ImageView)localObject2).setVisibility(0);
            ((View)localObject1).setOnClickListener(new LuckyMoneyMyRecordUI.7(this));
          }
          this.oeW.setText(getString(2131301176, new Object[] { this.oeY }));
        }
        Object localObject1 = paramString.nYQ;
        if (localObject1 != null)
        {
          if (this.mType != 1)
            break label385;
          this.nSD.setText(com.tencent.mm.wallet_core.ui.e.F(((com.tencent.mm.plugin.luckymoney.model.q)localObject1).nXK / 100.0D));
          localObject1 = ((com.tencent.mm.plugin.luckymoney.model.q)localObject1).nXJ;
          Object localObject3 = getString(2131301192, new Object[] { localObject1 });
          localObject2 = new ForegroundColorSpan(getResources().getColor(2131690229));
          paramInt1 = ((String)localObject3).indexOf((String)localObject1);
          localObject3 = new SpannableString((CharSequence)localObject3);
          ((SpannableString)localObject3).setSpan(localObject2, paramInt1, ((String)localObject1).length() + paramInt1, 33);
          this.oeX.setText((CharSequence)localObject3);
        }
        while (paramm != null)
        {
          paramInt1 = 0;
          while (true)
            if (paramInt1 < paramm.size())
            {
              localObject1 = (com.tencent.mm.plugin.luckymoney.model.r)paramm.get(paramInt1);
              if (!this.ocN.containsKey(((com.tencent.mm.plugin.luckymoney.model.r)localObject1).nSX))
              {
                this.nSx.add(paramm.get(paramInt1));
                this.ocN.put(((com.tencent.mm.plugin.luckymoney.model.r)localObject1).nSX, Integer.valueOf(1));
              }
              paramInt1++;
              continue;
              this.nSD.setText(com.tencent.mm.wallet_core.ui.e.F(((com.tencent.mm.plugin.luckymoney.model.q)localObject1).nXI / 100.0D));
              this.oeS.setText(((com.tencent.mm.plugin.luckymoney.model.q)localObject1).nXH);
              this.oeU.setText(((com.tencent.mm.plugin.luckymoney.model.q)localObject1).mLA);
              break;
            }
          this.Lp += paramm.size();
          this.ocG = paramString.bLF();
          this.hZu = false;
          this.odo.ck(this.nSx);
        }
        if ((this.nSx == null) || (this.nSx.size() == 0))
        {
          this.kFs.setVisibility(0);
          if (!this.ocG)
            break label563;
          this.odn.dzN();
        }
        while (true)
        {
          bool = true;
          AppMethodBeat.o(42774);
          return bool;
          this.kFs.setVisibility(8);
          break;
          label563: this.odn.dzO();
        }
      }
      this.nYT = null;
    }
    int i;
    do
    {
      do
      {
        bool = false;
        AppMethodBeat.o(42774);
        break;
      }
      while (!(paramm instanceof aj));
      i = this.oeZ;
      this.oeZ = -1;
    }
    while ((paramInt1 != 0) || (paramInt2 != 0));
    paramString = this.odo.yb(i);
    if (paramString != null)
    {
      Toast.makeText(this, 2131301129, 0).show();
      this.odo.a(paramString);
      this.odo.notifyDataSetChanged();
    }
    while (true)
    {
      bool = true;
      AppMethodBeat.o(42774);
      break;
      ab.e("MicroMsg.LuckyMoneyMyRecordUI", "can't found local record");
    }
  }

  public final int getLayoutId()
  {
    return 2130969987;
  }

  public final void initView()
  {
    AppMethodBeat.i(42772);
    setBackBtn(new LuckyMoneyMyRecordUI.1(this));
    addIconOptionMenu(0, 2131230740, new LuckyMoneyMyRecordUI.2(this));
    this.kFs = ((TextView)findViewById(2131825555));
    this.odn = ((MMLoadMoreListView)findViewById(2131825554));
    this.gwR = LayoutInflater.from(this).inflate(2130969985, null);
    this.odn.addHeaderView(this.gwR);
    this.kEn = ((ImageView)this.gwR.findViewById(2131825541));
    this.oeR = ((TextView)this.gwR.findViewById(2131825542));
    this.nSD = ((TextView)this.gwR.findViewById(2131825543));
    this.oeS = ((TextView)this.gwR.findViewById(2131825545));
    this.oeT = ((TextView)this.gwR.findViewById(2131825546));
    this.oeU = ((TextView)this.gwR.findViewById(2131825547));
    this.oeV = ((TextView)this.gwR.findViewById(2131825548));
    this.oeW = ((TextView)this.gwR.findViewById(2131825539));
    this.oeX = ((TextView)this.gwR.findViewById(2131825549));
    this.odn.setOnItemClickListener(new LuckyMoneyMyRecordUI.3(this));
    this.odn.setOnItemLongClickListener(new LuckyMoneyMyRecordUI.4(this));
    this.odn.setOnLoadMoreListener(new LuckyMoneyMyRecordUI.5(this));
    this.kEn.setOnClickListener(new LuckyMoneyMyRecordUI.6(this));
    bMB();
    AppMethodBeat.o(42772);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42771);
    super.onCreate(paramBundle);
    xE(getResources().getColor(2131690246));
    Nc(getResources().getColor(2131690231));
    this.mType = getIntent().getIntExtra("key_type", 2);
    initView();
    bMr();
    h.pYm.e(11701, new Object[] { Integer.valueOf(bMC()), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(0), Integer.valueOf(1) });
    AppMethodBeat.o(42771);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyMyRecordUI
 * JD-Core Version:    0.6.2
 */