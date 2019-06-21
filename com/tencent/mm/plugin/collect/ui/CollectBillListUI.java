package com.tencent.mm.plugin.collect.ui;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AbsListView.LayoutParams;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.bz.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.v;
import com.tencent.mm.wallet_core.ui.WalletBaseUI;
import com.tencent.mm.wallet_core.ui.g;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class CollectBillListUI extends WalletBaseUI
{
  private Dialog gII;
  private int kCD;
  private boolean kFA;
  private boolean kFB;
  private boolean kFC;
  private long kFD;
  private long kFE;
  private Calendar kFF;
  private List<com.tencent.mm.plugin.collect.model.h> kFG;
  private ListView kFo;
  private b kFp;
  private LinearLayout kFq;
  private CollectPullDownView kFr;
  private TextView kFs;
  private Dialog kFt;
  private boolean kFu;
  private boolean kFv;
  private boolean kFw;
  private boolean kFx;
  private boolean kFy;
  private boolean kFz;
  private View kmT;
  private int limit;
  private int retryCount;
  private int type;

  public CollectBillListUI()
  {
    AppMethodBeat.i(41195);
    this.kFu = false;
    this.kFv = false;
    this.kFw = false;
    this.kFx = false;
    this.kFy = false;
    this.kFz = false;
    this.kFA = true;
    this.kFB = false;
    this.kFC = false;
    this.type = 0;
    this.limit = 20;
    this.kCD = 0;
    this.retryCount = 0;
    this.kFD = 0L;
    this.kFE = 0L;
    this.kFG = new ArrayList();
    AppMethodBeat.o(41195);
  }

  private void Ic(String paramString)
  {
    AppMethodBeat.i(41201);
    if (this.kFp.getCount() == 0)
    {
      ab.i("MicroMsg.CollectBillListUI", "show empty view");
      if (!bo.isNullOrNil(paramString))
      {
        this.kFs.setText(paramString);
        aEL();
        AppMethodBeat.o(41201);
      }
    }
    while (true)
    {
      return;
      if (this.kFz)
      {
        this.kFs.setText(getString(2131298349));
        break;
      }
      paramString = getString(2131298349) + getString(2131298350);
      this.kFs.setText(paramString);
      break;
      if (!bo.isNullOrNil(paramString))
        Toast.makeText(this.mController.ylL, paramString, 1).show();
      AppMethodBeat.o(41201);
    }
  }

  private void a(int paramInt1, long paramLong, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(41204);
    ab.i("MicroMsg.CollectBillListUI", "get retry page, type: %d, timestamp: %s, tryNum: %d, directFlag: %d, chooseFlag: %d", new Object[] { Integer.valueOf(this.type), Long.valueOf(paramLong), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    a(new com.tencent.mm.plugin.collect.model.q(this.type, paramLong, paramInt2, this.limit, paramInt3, paramInt1), false, false);
    this.retryCount += 1;
    AppMethodBeat.o(41204);
  }

  private void aEL()
  {
    AppMethodBeat.i(41200);
    this.kFo.setVisibility(8);
    this.kFq.setVisibility(0);
    this.kFs.setVisibility(0);
    AppMethodBeat.o(41200);
  }

  private void bhh()
  {
    AppMethodBeat.i(41199);
    this.kFr.scrollTo(0, this.kFr.getTopHeight());
    AppMethodBeat.o(41199);
  }

  private void bhi()
  {
    AppMethodBeat.i(41203);
    int i = this.kFp.getCount();
    if (i > 0)
    {
      long l = this.kFp.tI(i - 1).kCc;
      if (l < this.kFE)
      {
        ab.i("MicroMsg.CollectBillListUI", "server lastTimestamp is error! %s, %s", new Object[] { Long.valueOf(l), Long.valueOf(this.kFE) });
        this.kFE = l;
      }
    }
    ab.i("MicroMsg.CollectBillListUI", "get next page, type: %d, timestamp: %s", new Object[] { Integer.valueOf(this.type), Long.valueOf(this.kFE) });
    a(new com.tencent.mm.plugin.collect.model.q(this.type, this.kFE, this.limit, 0), false, false);
    this.kFw = true;
    AppMethodBeat.o(41203);
  }

  private void bhj()
  {
    AppMethodBeat.i(41205);
    this.kFr.setTopViewVisible(false);
    this.kFr.setIsTopShowAll(false);
    this.kFr.setBottomViewVisible(true);
    this.kFr.setIsBottomShowAll(false);
    this.kFr.setCanOverScrool(true);
    this.kFr.setAtTopCallBack(new CollectBillListUI.9(this));
    this.kFr.setAtBottomCallBack(new CollectBillListUI.10(this));
    this.kFr.setOnTopLoadDataListener(new CollectBillListUI.11(this));
    this.kFr.setOnBottomLoadDataListener(new MMPullDownView.e()
    {
      public final boolean bhk()
      {
        boolean bool = false;
        AppMethodBeat.i(41187);
        ab.d("MicroMsg.CollectBillListUI", "bottomLoad, isLoading: %s, isFinish: %s", new Object[] { Boolean.valueOf(CollectBillListUI.g(CollectBillListUI.this)), Boolean.valueOf(CollectBillListUI.h(CollectBillListUI.this)) });
        if ((!CollectBillListUI.g(CollectBillListUI.this)) && (!CollectBillListUI.h(CollectBillListUI.this)))
        {
          CollectBillListUI.i(CollectBillListUI.this);
          CollectBillListUI.j(CollectBillListUI.this);
          AppMethodBeat.o(41187);
        }
        while (true)
        {
          return bool;
          AppMethodBeat.o(41187);
          bool = true;
        }
      }
    });
    AppMethodBeat.o(41205);
  }

  private void fW(boolean paramBoolean)
  {
    AppMethodBeat.i(41202);
    CollectPullDownView localCollectPullDownView = this.kFr;
    if (!paramBoolean);
    for (paramBoolean = true; ; paramBoolean = false)
    {
      localCollectPullDownView.setBottomViewVisible(paramBoolean);
      AppMethodBeat.o(41202);
      return;
    }
  }

  public final boolean c(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(41198);
    boolean bool;
    if ((paramm instanceof com.tencent.mm.plugin.collect.model.q))
    {
      paramm = (com.tencent.mm.plugin.collect.model.q)paramm;
      if (this.gII.isShowing())
        this.gII.dismiss();
      this.kFr.setLoadDataEnd(true);
      if ((paramInt1 == 0) && (paramInt2 == 0))
        if (paramm.kCD == 0)
          if (this.kFy)
          {
            ab.i("MicroMsg.CollectBillListUI", "is loading filter, skip!");
            AppMethodBeat.o(41198);
            bool = true;
          }
    }
    while (true)
    {
      return bool;
      if (paramm.kCE == 1)
      {
        this.kFA = paramm.foa;
        if (!paramm.kCH.isEmpty())
        {
          paramString = this.kFp;
          List localList = paramm.kCH;
          paramString.kFl.addAll(0, localList);
          paramString.notifyDataSetChanged();
          this.kFD = ((com.tencent.mm.plugin.collect.model.h)paramm.kCH.get(0)).kCc;
          label170: this.kFx = false;
          this.kFv = false;
        }
      }
      while (true)
      {
        AppMethodBeat.o(41198);
        bool = true;
        break;
        this.kFA = true;
        break label170;
        this.kFz = paramm.foa;
        this.kFo.setVisibility(0);
        this.kFq.setVisibility(8);
        if (paramm.isRetry)
        {
          if (!paramm.kCH.isEmpty())
            this.kFG.addAll(paramm.kCH);
          if ((paramm.kCF == 0) && (paramm.kCG > 0) && (paramm.kCH.isEmpty()))
          {
            ab.i("MicroMsg.CollectBillListUI", "continue retry: %d", new Object[] { Integer.valueOf(this.retryCount) });
            a(paramm.kCG, paramm.kCc, paramm.kCE, paramm.kCD);
            AppMethodBeat.o(41198);
            bool = true;
            break;
          }
          this.retryCount = 0;
          if (this.kFG.size() > 0)
            this.kFp.bp(this.kFG);
          while (true)
          {
            this.kFw = false;
            this.kFE = paramm.kCc;
            bhh();
            fW(this.kFz);
            break;
            ab.i("MicroMsg.CollectBillListUI", "retry data is empty");
            Ic(paramm.hwA);
          }
        }
        if (!paramm.kCH.isEmpty())
        {
          this.kFp.bp(paramm.kCH);
          this.kFE = ((com.tencent.mm.plugin.collect.model.h)paramm.kCH.get(paramm.kCH.size() - 1)).kCc;
          if (this.kFE > paramm.kCc)
          {
            ab.d("MicroMsg.CollectBillListUI", "use from_timestamp");
            this.kFE = paramm.kCc;
          }
          while (true)
          {
            this.kFw = false;
            bhh();
            fW(this.kFz);
            break;
            ab.i("MicroMsg.CollectBillListUI", "last record timestamp is less than fromtimestamp, %s, %s", new Object[] { Long.valueOf(this.kFE), Long.valueOf(paramm.kCc) });
          }
        }
        if ((paramm.kCF == 0) && (paramm.kCG > 0))
        {
          ab.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", new Object[] { Integer.valueOf(paramm.kCG), Long.valueOf(paramm.kCc) });
          a(paramm.kCG, paramm.kCc, paramm.kCE, paramm.kCD);
          this.kFG.clear();
        }
        else
        {
          this.kFw = false;
          bhh();
          ab.i("MicroMsg.CollectBillListUI", "next loading is empty without retry");
          Ic(paramm.hwA);
          fW(this.kFz);
        }
      }
      this.kFz = paramm.foa;
      if (paramm.isRetry)
      {
        if (!paramm.kCH.isEmpty())
          this.kFG.addAll(paramm.kCH);
        if ((paramm.kCF == 0) && (paramm.kCG > 0))
        {
          ab.i("MicroMsg.CollectBillListUI", "continue retry: %d", new Object[] { Integer.valueOf(this.retryCount) });
          a(paramm.kCG, paramm.kCc, paramm.kCE, paramm.kCD);
        }
        while (true)
        {
          AppMethodBeat.o(41198);
          bool = true;
          break;
          this.retryCount = 0;
          this.kFA = true;
          this.kFE = paramm.kCc;
          if (paramm.kCF == 0);
          for (this.kFz = false; ; this.kFz = true)
          {
            if (this.kFG.size() <= 0)
              break label877;
            this.kFp.setData(this.kFG);
            break;
          }
          label877: ab.i("MicroMsg.CollectBillListUI", "still empty data, show empty view");
          aEL();
          if (!bo.isNullOrNil(paramm.hwA))
          {
            this.kFs.setText(paramm.hwA);
            this.kFs.setVisibility(0);
          }
          paramString = this.kFp;
          paramString.kFl.clear();
          paramString.notifyDataSetChanged();
        }
      }
      if (!paramm.kCH.isEmpty())
      {
        this.kFp.setData(paramm.kCH);
        this.kFD = ((com.tencent.mm.plugin.collect.model.h)paramm.kCH.get(0)).kCc;
        this.kFE = ((com.tencent.mm.plugin.collect.model.h)paramm.kCH.get(paramm.kCH.size() - 1)).kCc;
      }
      while (true)
      {
        this.kFy = false;
        this.kFA = false;
        break;
        if ((paramm.kCF == 0) && (paramm.kCG > 0))
        {
          ab.i("MicroMsg.CollectBillListUI", "need retry, tryNum: %d, timestamp: %s", new Object[] { Integer.valueOf(paramm.kCG), Long.valueOf(paramm.kCc) });
          a(paramm.kCG, paramm.kCc, paramm.kCE, paramm.kCD);
          this.kFG.clear();
        }
        else
        {
          aEL();
        }
      }
      ab.i("MicroMsg.CollectBillListUI", "net error, errType: %s, errCode: %s, errMsg: %s, chooseFlag: %d, direcFlag: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString, Integer.valueOf(paramm.kCD), Integer.valueOf(paramm.kCE) });
      if (paramm.kCD == 0)
        if (paramm.kCE == 0)
        {
          this.kFw = false;
          bhh();
        }
      while (true)
      {
        if (this.kFp.isEmpty())
          aEL();
        Toast.makeText(this, 2131298348, 1).show();
        AppMethodBeat.o(41198);
        bool = true;
        break;
        this.kFx = false;
        continue;
        this.kFy = false;
      }
      AppMethodBeat.o(41198);
      bool = false;
    }
  }

  public final int getLayoutId()
  {
    return 2130969154;
  }

  public final void initView()
  {
    AppMethodBeat.i(41197);
    this.kFo = ((ListView)findViewById(2131822833));
    this.kFq = ((LinearLayout)findViewById(2131822834));
    this.kFs = ((TextView)findViewById(2131822835));
    this.kmT = v.hu(this).inflate(2130969156, this.kFo, false);
    View localView = new View(this);
    localView.setLayoutParams(new AbsListView.LayoutParams(-1, a.fromDPToPix(this, 5)));
    this.kFo.addHeaderView(localView, null, true);
    new View(this).setLayoutParams(new AbsListView.LayoutParams(-1, a.fromDPToPix(this, 10)));
    this.kFo.addFooterView(localView, null, true);
    this.kFo.setOverScrollMode(2);
    this.kFp = new b(this);
    this.kFo.setAdapter(this.kFp);
    this.kFo.setOnItemClickListener(new CollectBillListUI.7(this));
    this.kFo.setOnScrollListener(new CollectBillListUI.8(this));
    this.kFr = ((CollectPullDownView)findViewById(2131822832));
    bhj();
    AppMethodBeat.o(41197);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(41196);
    super.onCreate(paramBundle);
    initView();
    setMMTitle(2131298351);
    if (this.kFC)
      addIconOptionMenu(0, 2131231127, new CollectBillListUI.1(this));
    this.gII = g.a(this, false, new CollectBillListUI.3(this));
    bhi();
    com.tencent.mm.plugin.report.service.h.pYm.e(13944, new Object[] { Integer.valueOf(4) });
    AppMethodBeat.o(41196);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.ui.CollectBillListUI
 * JD-Core Version:    0.6.2
 */