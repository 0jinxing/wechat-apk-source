package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ad;
import com.tencent.mm.plugin.game.d.cs;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.plugin.game.model.x;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public class GameFeedNoGamePlayTemplate extends LinearLayout
  implements View.OnClickListener
{
  private ImageView iUn;
  GameDownloadView neR;
  private d neV;
  private GameFeedTitleDescView niD;
  private FrameLayout niE;
  private RelativeLayout niF;
  private TextView niG;
  private GameRoundImageView niq;
  private ImageView nir;

  public GameFeedNoGamePlayTemplate(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111944);
    if ((this.neV == null) || (this.neV.mVH == null) || (this.neV.mVH.naF == null))
      AppMethodBeat.o(111944);
    while (true)
    {
      return;
      int i;
      if ((paramView.getId() == 2131824493) && (!bo.isNullOrNil(this.neV.mVH.naF.nbr)))
      {
        i = c.ax(getContext(), this.neV.mVH.naF.nbr);
        b.a(getContext(), 10, 1024, this.neV.position, i, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.T(this.neV.mVH.mZL, "clickType", "middle"));
        AppMethodBeat.o(111944);
      }
      else
      {
        if (!bo.isNullOrNil(this.neV.mVH.mZj))
        {
          i = c.ax(getContext(), this.neV.mVH.mZj);
          b.a(getContext(), 10, 1024, this.neV.position, i, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.T(this.neV.mVH.mZL, "clickType", "card"));
        }
        AppMethodBeat.o(111944);
      }
    }
  }

  public void onFinishInflate()
  {
    AppMethodBeat.i(111942);
    super.onFinishInflate();
    this.niD = ((GameFeedTitleDescView)findViewById(2131824480));
    this.niE = ((FrameLayout)findViewById(2131824493));
    this.niq = ((GameRoundImageView)findViewById(2131824494));
    this.nir = ((ImageView)findViewById(2131824484));
    this.niF = ((RelativeLayout)findViewById(2131824495));
    this.iUn = ((ImageView)findViewById(2131821535));
    this.niG = ((TextView)findViewById(2131821537));
    this.neR = ((GameDownloadView)findViewById(2131824317));
    setOnClickListener(this);
    this.niE.setOnClickListener(this);
    AppMethodBeat.o(111942);
  }

  public void setData(d paramd)
  {
    AppMethodBeat.i(111943);
    ab.d("MicroMsg.GameFeedNoGamePlayTemplate", "setData");
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naF == null))
    {
      setVisibility(8);
      AppMethodBeat.o(111943);
      return;
    }
    ab.d("MicroMsg.GameFeedNoGamePlayTemplate", "setData 1");
    this.neV = paramd;
    paramd = paramd.mVH;
    setVisibility(0);
    this.niD.b(paramd.naF.Title, paramd.naF.Desc, paramd.naF.ndm);
    this.niE.setVisibility(0);
    if (!bo.isNullOrNil(paramd.naF.mZi))
    {
      com.tencent.mm.plugin.game.f.e.bFH().a(this.niq, paramd.naF.mZi, getResources().getDimensionPixelSize(2131427732), getResources().getDimensionPixelSize(2131427731), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
      if (!bo.isNullOrNil(paramd.naF.nbr))
        this.nir.setVisibility(0);
    }
    while (true)
    {
      if (paramd.naF.mZk != null)
      {
        this.niF.setVisibility(0);
        com.tencent.mm.plugin.game.f.e.bFH().a(this.iUn, paramd.naF.mZk.mZr, com.tencent.mm.bz.a.getDensity(getContext()));
        this.niG.setText(paramd.naF.mZk.Name);
        paramd = x.a(paramd.naF.mZk);
        paramd.scene = 10;
        paramd.cKG = 1024;
        paramd.position = this.neV.position;
        this.neR.setDownloadInfo(new k(paramd));
      }
      if (!this.neV.mVJ)
      {
        com.tencent.mm.plugin.game.e.a.a(getContext(), 10, 1024, this.neV.position, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.kY(this.neV.mVH.mZL));
        this.neV.mVJ = true;
      }
      AppMethodBeat.o(111943);
      break;
      this.nir.setVisibility(8);
      continue;
      this.niE.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedNoGamePlayTemplate
 * JD-Core Version:    0.6.2
 */