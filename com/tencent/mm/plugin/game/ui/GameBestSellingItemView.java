package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ad;
import com.tencent.mm.plugin.game.d.as;
import com.tencent.mm.plugin.game.d.y;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.plugin.game.model.x;
import com.tencent.mm.plugin.game.widget.AutoResizeTextView;
import com.tencent.mm.plugin.game.widget.GameTagListView;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameBestSellingItemView extends LinearLayout
  implements View.OnClickListener
{
  AutoResizeTextView neN;
  ImageView neO;
  TextView neP;
  GameTagListView neQ;
  GameDownloadView neR;
  View neS;
  private int neT;
  private y neU;
  private d neV;

  public GameBestSellingItemView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111731);
    if ((this.neU == null) || (bo.isNullOrNil(this.neU.mZk.mZm)))
      AppMethodBeat.o(111731);
    while (true)
    {
      return;
      int i = com.tencent.mm.plugin.game.f.c.ax(getContext(), this.neU.mZk.mZm);
      b.a(getContext(), 10, 1022, this.neV.mVI + 1, i, this.neU.mZk.mZr, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.kY(this.neV.mVH.mZL));
      AppMethodBeat.o(111731);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111729);
    super.onFinishInflate();
    this.neN = ((AutoResizeTextView)findViewById(2131824295));
    this.neO = ((ImageView)findViewById(2131821535));
    this.neP = ((TextView)findViewById(2131821537));
    this.neQ = ((GameTagListView)findViewById(2131824297));
    this.neR = ((GameDownloadView)findViewById(2131824296));
    this.neS = findViewById(2131824298);
    this.neT = (com.tencent.mm.plugin.game.f.c.getScreenWidth(getContext()) - com.tencent.mm.bz.a.fromDPToPix(getContext(), 190));
    setOnClickListener(this);
    AppMethodBeat.o(111729);
  }

  public void setData(d paramd)
  {
    AppMethodBeat.i(111730);
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naG == null) || (bo.ek(paramd.mVH.naG.mZK)))
    {
      setVisibility(8);
      AppMethodBeat.o(111730);
      return;
    }
    this.neV = paramd;
    y localy = (y)paramd.mVH.naG.mZK.get(paramd.mVI);
    int i = paramd.mVI + 1;
    if ((localy == null) || (localy.mZk == null))
      setVisibility(8);
    while (true)
    {
      if (!paramd.mVJ)
      {
        com.tencent.mm.plugin.game.e.a.a(getContext(), 10, 1022, paramd.mVI + 1, localy.mZk.mZr, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.kY(paramd.mVH.mZL));
        paramd.mVJ = true;
      }
      AppMethodBeat.o(111730);
      break;
      this.neU = localy;
      com.tencent.mm.plugin.game.model.c localc = x.a(this.neU.mZk);
      localc.scene = 10;
      localc.cKG = 1022;
      localc.position = (this.neV.mVI + 1);
      this.neR.setDownloadInfo(new k(localc));
      setVisibility(0);
      this.neN.setText(String.valueOf(i));
      if (i == 1)
        this.neN.setTextColor(com.tencent.mm.plugin.game.f.c.parseColor("#EED157"));
      while (true)
      {
        com.tencent.mm.plugin.game.f.e.bFH().a(this.neO, localy.mZk.mZr, com.tencent.mm.bz.a.getDensity(getContext()));
        this.neP.setText(localy.mZk.Name);
        this.neQ.f(localy.mZk.mZH, this.neT);
        if ((bo.ek(localy.nar)) && (localy.nas == null) && (localy.Desc == null))
          break label439;
        if ((this.neS instanceof ViewStub))
          this.neS = ((ViewStub)this.neS).inflate();
        ((GameFeedSocialInfoView)this.neS.findViewById(2131824642)).setData(localy);
        break;
        if (i == 2)
          this.neN.setTextColor(com.tencent.mm.plugin.game.f.c.parseColor("#BDC5CB"));
        else if (i == 3)
          this.neN.setTextColor(com.tencent.mm.plugin.game.f.c.parseColor("#D4B897"));
        else
          this.neN.setTextColor(com.tencent.mm.plugin.game.f.c.parseColor("#B2B2B2"));
      }
      label439: this.neS.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameBestSellingItemView
 * JD-Core Version:    0.6.2
 */