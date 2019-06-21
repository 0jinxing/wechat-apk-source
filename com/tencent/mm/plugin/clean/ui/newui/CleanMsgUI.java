package com.tencent.mm.plugin.clean.ui.newui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.clean.c.c;
import com.tencent.mm.plugin.clean.c.g;
import com.tencent.mm.plugin.clean.ui.PieView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class CleanMsgUI extends MMActivity
  implements g, com.tencent.mm.plugin.clean.c.h
{
  private ProgressDialog ehJ;
  private View kxP;
  private PieView kxQ;
  private TextView kxR;
  private Button kxS;
  private Button kxT;
  private TextView kxU;
  private TextView kxV;
  private TextView kxW;
  private TextView kxX;
  private View kxY;
  private TextView kxZ;
  private com.tencent.mm.plugin.clean.c.e kyL;
  private c kyR;
  private TextView kya;
  private TextView kyb;
  private TextView kyc;
  private TextView kyd;

  private void h(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(18898);
    int i = (int)(360L * paramLong2 / paramLong1);
    if (i < 5)
      i = 5;
    while (true)
    {
      int j = 0;
      if (paramLong3 > 0L)
      {
        int k = (int)(360L * paramLong3 / paramLong1);
        j = k;
        if (k < 5)
          j = 5;
      }
      long l = paramLong1 - paramLong2 - paramLong3;
      ab.i("MicroMsg.CleanMsgUI", "update [%d %d] [%d %d] [%d %d] wechatSize[%d]", new Object[] { Long.valueOf(paramLong2), Integer.valueOf(i), Long.valueOf(paramLong3), Integer.valueOf(j), Long.valueOf(l), Integer.valueOf((int)(360L * l / paramLong1)), Long.valueOf(paramLong1) });
      this.kxQ.setGreenTargetAngle(i);
      this.kxQ.setOtherAccTargetAngle(j);
      this.kxQ.setStage(1);
      this.kxP.setVisibility(0);
      this.kxU.setText(bo.ga(paramLong2));
      this.kxV.setText(bo.ga(paramLong3));
      this.kxW.setText(bo.ga(l));
      if (paramLong3 > 0L)
      {
        this.kxY.setVisibility(0);
        this.kxT.setVisibility(0);
      }
      while (true)
      {
        j = (int)(100L * paramLong2 / paramLong1);
        this.kyb.setText(getString(2131298288, new Object[] { j + "%" }));
        j = (int)(100L * paramLong3 / paramLong1);
        this.kyc.setText(getString(2131298311, new Object[] { j + "%" }));
        j = (int)(100L * l / paramLong1);
        this.kyd.setText(getString(2131298314, new Object[] { j + "%" }));
        AppMethodBeat.o(18898);
        return;
        this.kxT.setVisibility(8);
        this.kxY.setVisibility(8);
      }
    }
  }

  private void i(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(18899);
    h(paramLong1, paramLong3, paramLong2);
    AppMethodBeat.o(18899);
  }

  public final void a(long paramLong1, long paramLong2, long paramLong3, ArrayList<com.tencent.mm.plugin.clean.c.b> paramArrayList, long paramLong4, HashSet<String> paramHashSet)
  {
    AppMethodBeat.i(18903);
    ab.i("MicroMsg.CleanMsgUI", "%d on clean result cleanDataSize[%d] wechatSize[%d] otherAccSize[%d]", new Object[] { Integer.valueOf(hashCode()), Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong4) });
    this.kxR.setVisibility(8);
    this.kxS.setEnabled(true);
    enableOptionMenu(0, true);
    i(paramLong2, paramLong4, paramLong3);
    if (paramLong1 > 0L)
    {
      this.kxZ.setVisibility(0);
      this.kxZ.setText(getString(2131298297, new Object[] { bo.ga(paramLong1) }));
      com.tencent.mm.plugin.clean.c.d.hg(paramLong1);
      com.tencent.mm.plugin.clean.c.d.hd(paramLong2);
      com.tencent.mm.plugin.clean.c.d.hf(paramLong4);
      com.tencent.mm.plugin.clean.c.d.b(paramHashSet);
      com.tencent.mm.plugin.clean.c.d.he(paramLong3);
      com.tencent.mm.plugin.clean.c.d.u(paramArrayList);
      if (paramLong4 <= 0L)
        break label199;
      com.tencent.mm.plugin.report.service.h.pYm.a(282L, 9L, 1L, false);
      AppMethodBeat.o(18903);
    }
    while (true)
    {
      return;
      this.kxZ.setVisibility(8);
      this.kxZ.setText("");
      break;
      label199: com.tencent.mm.plugin.report.service.h.pYm.a(282L, 10L, 1L, false);
      AppMethodBeat.o(18903);
    }
  }

  public final void dO(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18902);
    this.kxR.setText(getString(2131296518, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    AppMethodBeat.o(18902);
  }

  public final void dP(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(18904);
    this.ehJ.setMessage(getString(2131298315, new Object[] { paramInt1 * 100 / paramInt2 + "%" }));
    AppMethodBeat.o(18904);
  }

  public final int getLayoutId()
  {
    return 2130969146;
  }

  public final void hi(long paramLong)
  {
    AppMethodBeat.i(18905);
    this.ehJ.dismiss();
    com.tencent.mm.plugin.clean.c.d.hd(com.tencent.mm.plugin.clean.c.d.bfT() - paramLong);
    com.tencent.mm.plugin.clean.c.d.hg(com.tencent.mm.plugin.clean.c.d.bfW() + paramLong);
    com.tencent.mm.plugin.clean.c.d.bfW();
    i(com.tencent.mm.plugin.clean.c.d.bfT(), com.tencent.mm.plugin.clean.c.d.bfV(), com.tencent.mm.plugin.clean.c.d.bfU());
    AppMethodBeat.o(18905);
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(18901);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.plugin.clean.c.d.bfW();
    i(com.tencent.mm.plugin.clean.c.d.bfT(), com.tencent.mm.plugin.clean.c.d.bfV(), com.tencent.mm.plugin.clean.c.d.bfU());
    AppMethodBeat.o(18901);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18897);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.pYm.a(282L, 3L, 1L, false);
    com.tencent.mm.plugin.clean.c.d.bfZ();
    this.kxR = ((TextView)findViewById(2131822776));
    this.kxQ = ((PieView)findViewById(2131822775));
    this.kxS = ((Button)findViewById(2131822797));
    this.kxT = ((Button)findViewById(2131822798));
    this.kxP = findViewById(2131822777);
    this.kxU = ((TextView)findViewById(2131822781));
    this.kxU.setTextSize(1, 16.0F);
    this.kxV = ((TextView)findViewById(2131822786));
    this.kxV.setTextSize(1, 16.0F);
    this.kxW = ((TextView)findViewById(2131822790));
    this.kxW.setTextSize(1, 16.0F);
    this.kxX = ((TextView)findViewById(2131822794));
    this.kxX.setTextSize(1, 16.0F);
    this.kxZ = ((TextView)findViewById(2131822795));
    this.kya = ((TextView)findViewById(2131822796));
    this.kyb = ((TextView)findViewById(2131822780));
    this.kyc = ((TextView)findViewById(2131822785));
    this.kyd = ((TextView)findViewById(2131822789));
    this.kxY = ((View)findViewById(2131822782));
    setMMTitle(2131298323);
    com.tencent.mm.plugin.clean.c.d.a(new com.tencent.mm.plugin.clean.c.a.b());
    setBackBtn(new CleanMsgUI.1(this));
    this.kxT.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(18889);
        com.tencent.mm.ui.base.h.d(CleanMsgUI.this, CleanMsgUI.this.getString(2131298312, new Object[] { bo.my(com.tencent.mm.plugin.clean.c.d.bfV()) }), "", CleanMsgUI.this.getString(2131296994), CleanMsgUI.this.getString(2131296868), new CleanMsgUI.2.1(this), null);
        AppMethodBeat.o(18889);
      }
    });
    this.kxS.setOnClickListener(new CleanMsgUI.3(this));
    addIconOptionMenu(0, 2131230740, new CleanMsgUI.4(this));
    enableOptionMenu(0, false);
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131298295), false, new CleanMsgUI.5(this));
    this.ehJ.dismiss();
    if (com.tencent.mm.plugin.clean.c.d.bfS() != null)
    {
      this.kxR.setVisibility(8);
      this.kxS.setEnabled(true);
      enableOptionMenu(0, true);
      com.tencent.mm.plugin.clean.c.d.bfW();
      i(com.tencent.mm.plugin.clean.c.d.bfT(), com.tencent.mm.plugin.clean.c.d.bfV(), com.tencent.mm.plugin.clean.c.d.bfU());
      AppMethodBeat.o(18897);
    }
    while (true)
    {
      return;
      paramBundle = com.tencent.mm.plugin.clean.c.d.bfQ();
      if (paramBundle != null)
      {
        this.kyR = new c(paramBundle, this);
        com.tencent.mm.sdk.g.d.post(this.kyR, "CleanUI_clean");
        this.kxR.setText(getString(2131296518, new Object[] { "0%" }));
      }
      AppMethodBeat.o(18897);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(18900);
    Object localObject;
    if (this.kyR != null)
    {
      localObject = this.kyR;
      ab.i("MicroMsg.CleanController", "stop CleanController [%d]", new Object[] { Integer.valueOf(localObject.hashCode()) });
      ((c)localObject).isStop = true;
      com.tencent.mm.sdk.g.d.xDG.remove((Runnable)localObject);
    }
    if (this.kyL != null)
      this.kyL.bgb();
    if (com.tencent.mm.plugin.clean.c.d.bfQ() != null)
    {
      localObject = com.tencent.mm.plugin.clean.c.d.bfQ();
      Iterator localIterator = ((com.tencent.mm.plugin.clean.c.a.b)localObject).kwM.values().iterator();
      while (localIterator.hasNext())
        ((ak)localIterator.next()).removeCallbacksAndMessages(null);
      localIterator = ((com.tencent.mm.plugin.clean.c.a.b)localObject).kwM.values().iterator();
      while (localIterator.hasNext())
      {
        ak localak = (ak)localIterator.next();
        localak.getLooper().getThread().interrupt();
        localak.getLooper().quit();
      }
      ab.i("MicroMsg.ThreadController", "finish thread controller [%d]", new Object[] { Integer.valueOf(localObject.hashCode()) });
    }
    com.tencent.mm.plugin.clean.c.d.bga();
    com.tencent.mm.plugin.clean.c.d.bfY();
    super.onDestroy();
    AppMethodBeat.o(18900);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.newui.CleanMsgUI
 * JD-Core Version:    0.6.2
 */