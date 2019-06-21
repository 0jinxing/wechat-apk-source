package com.tencent.mm.plugin.clean.ui.fileindexui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.clean.c.j;
import com.tencent.mm.plugin.clean.ui.PieView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMActivity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CleanMsgUI extends MMActivity
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
  private TextView kya;
  private TextView kyb;
  private TextView kyc;
  private TextView kyd;
  private TextView kye;
  private LinearLayout kyf;

  private void h(long paramLong1, long paramLong2, long paramLong3)
  {
    AppMethodBeat.i(18805);
    long l = paramLong1;
    if (paramLong1 <= 0L)
    {
      l = 1L;
      com.tencent.mm.plugin.report.service.h.pYm.a(714L, 61L, 1L, false);
    }
    int i = (int)(360L * paramLong2 / l);
    if ((paramLong2 > 0L) && (i < 5))
      i = 5;
    while (true)
    {
      int j = 0;
      if (paramLong3 > 0L)
      {
        int k = (int)(360L * paramLong3 / l);
        j = k;
        if (k < 5)
          j = 5;
      }
      paramLong1 = l - paramLong2 - paramLong3;
      ab.i("MicroMsg.CleanMsgUI", "update acc[%d %d] otherAcc[%d %d] other[%d %d] wechat[%d] stack[%s]", new Object[] { Long.valueOf(paramLong2), Integer.valueOf((int)(100L * paramLong2 / l)), Long.valueOf(paramLong3), Integer.valueOf((int)(100L * paramLong3 / l)), Long.valueOf(paramLong1), Integer.valueOf((int)(100L * paramLong1 / l)), Long.valueOf(l), bo.dpG() });
      this.kxQ.setGreenTargetAngle(i);
      this.kxQ.setOtherAccTargetAngle(j);
      this.kxQ.setStage(1);
      this.kxP.setVisibility(0);
      this.kxU.setText(bo.ga(paramLong2));
      this.kxV.setText(bo.ga(paramLong3));
      this.kxW.setText(bo.ga(paramLong1));
      if (paramLong3 > 0L)
      {
        this.kxY.setVisibility(0);
        this.kxT.setEnabled(true);
      }
      while (true)
      {
        this.kyb.setText(getString(2131298288));
        this.kyc.setText(getString(2131298311));
        this.kyd.setText(getString(2131298314));
        if (((Integer)g.RP().Ry().get(ac.a.xSU, Integer.valueOf(0))).intValue() > 0)
        {
          this.kyf.setVisibility(0);
          this.kye.setVisibility(0);
          this.kye.setText(l(j.bgd().kwI));
        }
        AppMethodBeat.o(18805);
        return;
        this.kxT.setEnabled(false);
        this.kxY.setVisibility(0);
      }
    }
  }

  private static String l(HashMap<String, Long> paramHashMap)
  {
    AppMethodBeat.i(18808);
    StringBuffer localStringBuffer = new StringBuffer();
    if (!paramHashMap.isEmpty())
    {
      Iterator localIterator = paramHashMap.keySet().iterator();
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        localStringBuffer.append(str).append(" : ").append(bo.ga(((Long)paramHashMap.get(str)).longValue())).append("\n");
      }
    }
    paramHashMap = localStringBuffer.toString();
    AppMethodBeat.o(18808);
    return paramHashMap;
  }

  public final int getLayoutId()
  {
    return 2130969146;
  }

  public void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(18807);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    h(j.bgd().kvV, j.bgd().kvW, j.bgd().kvX);
    AppMethodBeat.o(18807);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(18804);
    super.onCreate(paramBundle);
    com.tencent.mm.plugin.report.service.h.pYm.a(714L, 10L, 1L, false);
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
    this.kye = ((TextView)findViewById(2131822800));
    this.kyf = ((LinearLayout)findViewById(2131822799));
    this.kyb = ((TextView)findViewById(2131822780));
    this.kyc = ((TextView)findViewById(2131822785));
    this.kyd = ((TextView)findViewById(2131822789));
    this.kxY = ((View)findViewById(2131822782));
    setMMTitle(2131298308);
    setBackBtn(new CleanMsgUI.1(this));
    this.kxT.setOnClickListener(new CleanMsgUI.2(this));
    this.kxS.setEnabled(true);
    this.kxS.setOnClickListener(new CleanMsgUI.3(this));
    getString(2131297061);
    this.ehJ = com.tencent.mm.ui.base.h.b(this, getString(2131298295), false, new CleanMsgUI.4(this));
    this.ehJ.dismiss();
    h(j.bgd().kvV, j.bgd().kvW, j.bgd().kvX);
    AppMethodBeat.o(18804);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(18806);
    super.onDestroy();
    AppMethodBeat.o(18806);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.clean.ui.fileindexui.CleanMsgUI
 * JD-Core Version:    0.6.2
 */