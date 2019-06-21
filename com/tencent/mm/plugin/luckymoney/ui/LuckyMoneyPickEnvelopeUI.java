package com.tencent.mm.plugin.luckymoney.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.luckymoney.model.f;
import com.tencent.mm.protocal.protobuf.aoj;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.e.f;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.q.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

@com.tencent.mm.ui.base.a(1)
public class LuckyMoneyPickEnvelopeUI extends MMActivity
{
  private View Ek;
  private Dialog gII;
  private boolean isLoading;
  private int nSY;
  private View oaV;
  private LuckyMoneyEnvelopeTouchRecyclerView ogP;
  private LuckyMoneyPickEnvelopeUI.a ogQ;
  private com.tencent.mm.plugin.luckymoney.scaledLayout.c ogR;
  private List<LuckyMoneyPickEnvelopeUI.b> ogS;
  private int ogT;
  private boolean ogU;
  private String ogV;
  private com.tencent.mm.plugin.luckymoney.scaledLayout.a ogW;

  public LuckyMoneyPickEnvelopeUI()
  {
    AppMethodBeat.i(42928);
    this.ogS = new ArrayList();
    this.ogT = -1;
    this.ogU = false;
    this.isLoading = false;
    this.nSY = 0;
    AppMethodBeat.o(42928);
  }

  private void a(aoj paramaoj)
  {
    AppMethodBeat.i(42933);
    ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "try show illegal msg");
    if (bo.isNullOrNil(paramaoj.nWx))
    {
      AppMethodBeat.o(42933);
      return;
    }
    ArrayList localArrayList = new ArrayList(bo.hT((String)g.RP().Ry().get(ac.a.xUx, ""), ","));
    Iterator localIterator = paramaoj.wsD.iterator();
    int i = 0;
    label71: if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (localArrayList.contains(str))
        break label190;
      localArrayList.add(str);
      ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "show illegal id: %s", new Object[] { str });
      i = 1;
    }
    label190: 
    while (true)
    {
      break label71;
      if (i != 0)
      {
        g.RP().Ry().set(ac.a.xUx, bo.c(localArrayList, ","));
        h.a(this, paramaoj.nWx, "", getString(2131296955), false, new LuckyMoneyPickEnvelopeUI.12(this));
      }
      AppMethodBeat.o(42933);
      break;
    }
  }

  private void b(aoj paramaoj)
  {
    AppMethodBeat.i(42934);
    ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "update by resp");
    if (paramaoj.wsE == 1);
    for (boolean bool = true; ; bool = false)
    {
      this.ogU = bool;
      a(paramaoj);
      if (paramaoj.wsA != null)
      {
        if (!paramaoj.wsA.isEmpty())
          break;
        this.Ek.setVisibility(0);
        this.ogP.setVisibility(8);
      }
      this.ogQ.aop.notifyChanged();
      paramaoj = new LuckyMoneyPickEnvelopeUI.13(this);
      this.ogP.post(paramaoj);
      AppMethodBeat.o(42934);
      return;
    }
    ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "list size: %s", new Object[] { Integer.valueOf(paramaoj.wsA.size()) });
    paramaoj = paramaoj.wsA.iterator();
    int i = 0;
    label140: LuckyMoneyPickEnvelopeUI.b localb;
    if (paramaoj.hasNext())
    {
      atb localatb = (atb)paramaoj.next();
      localb = new LuckyMoneyPickEnvelopeUI.b((byte)0);
      localb.nZq = localatb;
      if ((localatb.wwT != 1) || (localatb.wwS == 1))
        break label234;
    }
    label234: for (bool = true; ; bool = false)
    {
      localb.kfW = bool;
      this.ogS.add(localb);
      if (localb.kfW)
        this.ogT = i;
      i++;
      break label140;
      break;
    }
  }

  private void bMJ()
  {
    AppMethodBeat.i(42932);
    ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do get show source: %s", new Object[] { this.ogV });
    this.gII = h.a(this.mController.ylL, 3, 2131493296, getString(2131300968), false, new LuckyMoneyPickEnvelopeUI.10(this));
    this.isLoading = true;
    f localf = f.bLp();
    localf.b(new com.tencent.mm.plugin.luckymoney.model.c(this.ogV));
    localf.a(new LuckyMoneyPickEnvelopeUI.11(this));
    AppMethodBeat.o(42932);
  }

  public final int getLayoutId()
  {
    return 2130969993;
  }

  public final void initView()
  {
    AppMethodBeat.i(42930);
    this.ogP = ((LuckyMoneyEnvelopeTouchRecyclerView)findViewById(2131825612));
    this.Ek = findViewById(2131825613);
    this.ogQ = new LuckyMoneyPickEnvelopeUI.a(this, (byte)0);
    this.ogQ.jR();
    this.ogP.setAdapter(this.ogQ);
    this.ogP.setItemAnimator(null);
    this.ogP.setItemViewCacheSize(-1);
    this.ogR = new LuckyMoneyPickEnvelopeUI.7(this, this);
    this.ogR.bLS();
    this.ogP.setLayoutManager(this.ogR);
    this.ogW = new com.tencent.mm.plugin.luckymoney.scaledLayout.a();
    this.ogW.context = this;
    this.ogW.i(this.ogP);
    this.ogP.oeF = new LuckyMoneyPickEnvelopeUI.8(this);
    this.ogP.a(new LuckyMoneyPickEnvelopeUI.9(this));
    AppMethodBeat.o(42930);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(42929);
    this.yll = true;
    super.onCreate(paramBundle);
    dyb();
    xE(Color.parseColor("#f1f1f1"));
    initView();
    setMMTitle(2131301169);
    byte[] arrayOfByte = getIntent().getByteArrayExtra(e.f.yfY);
    if (arrayOfByte != null);
    while (true)
    {
      try
      {
        paramBundle = new com/tencent/mm/protocal/protobuf/aoj;
        paramBundle.<init>();
        paramBundle = (aoj)paramBundle.parseFrom(arrayOfByte);
        if (paramBundle.kCl == 0)
        {
          this.ogV = paramBundle.wsB;
          this.nSY = paramBundle.wsC;
          b(paramBundle);
          setBackBtn(new LuckyMoneyPickEnvelopeUI.1(this));
          a(1, getString(2131301166), new LuckyMoneyPickEnvelopeUI.6(this), q.b.ymv);
          enableOptionMenu(1, false);
          AppMethodBeat.o(42929);
          return;
        }
        bMJ();
        continue;
      }
      catch (IOException paramBundle)
      {
        ab.printErrStackTrace("MicroMsg.LuckyMoneyPickEnvelopeUI", paramBundle, "", new Object[0]);
      }
      bMJ();
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(42931);
    super.onDestroy();
    AppMethodBeat.o(42931);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI
 * JD-Core Version:    0.6.2
 */