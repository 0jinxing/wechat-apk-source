package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ad;
import com.tencent.mm.plugin.game.d.aw;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.plugin.game.model.x;
import com.tencent.mm.plugin.game.widget.GameTagListView;
import com.tencent.mm.sdk.platformtools.bo;

public class GameFeedGameTemplateView extends LinearLayout
  implements View.OnClickListener
{
  private TextView kEq;
  private int neT;
  private d neV;
  private ImageView ngV;
  private TextView ngW;
  private GameTagListView nio;
  private FrameLayout nip;
  private GameRoundImageView niq;
  private ImageView nir;
  private GameFeedSubscriptView nis;
  private GameDownloadView nit;

  public GameFeedGameTemplateView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  private void c(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(111930);
    int i = getResources().getDimensionPixelSize(2131427732);
    int j = getResources().getDimensionPixelSize(2131427731);
    com.tencent.mm.plugin.game.f.e.bFH().a(paramImageView, paramString, i, j, c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
    AppMethodBeat.o(111930);
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(111927);
    super.onAttachedToWindow();
    AppMethodBeat.o(111927);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111929);
    if ((this.neV == null) || (this.neV.mVH == null))
      AppMethodBeat.o(111929);
    while (true)
    {
      return;
      int i;
      if ((paramView.getId() == 2131824483) && (!bo.isNullOrNil(this.neV.mVH.naE.nbq)))
      {
        i = c.ax(getContext(), this.neV.mVH.naE.nbq);
        b.a(getContext(), 10, 1024, this.neV.position, i, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.T(this.neV.mVH.mZL, "clickType", "middle"));
        AppMethodBeat.o(111929);
      }
      else
      {
        if (!bo.isNullOrNil(this.neV.mVH.mZj))
        {
          i = c.ax(getContext(), this.neV.mVH.mZj);
          b.a(getContext(), 10, 1024, this.neV.position, i, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.T(this.neV.mVH.mZL, "clickType", "card"));
        }
        AppMethodBeat.o(111929);
      }
    }
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(111926);
    super.onDetachedFromWindow();
    AppMethodBeat.o(111926);
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111925);
    super.onFinishInflate();
    this.ngV = ((ImageView)findViewById(2131821535));
    this.ngW = ((TextView)findViewById(2131821537));
    this.nio = ((GameTagListView)findViewById(2131824482));
    this.kEq = ((TextView)findViewById(2131821095));
    this.nip = ((FrameLayout)findViewById(2131824483));
    this.niq = ((GameRoundImageView)findViewById(2131820629));
    this.nir = ((ImageView)findViewById(2131824484));
    this.nis = ((GameFeedSubscriptView)findViewById(2131824485));
    this.nit = ((GameDownloadView)findViewById(2131824317));
    setOnClickListener(this);
    this.neT = (c.getScreenWidth(getContext()) - com.tencent.mm.bz.a.fromDPToPix(getContext(), 175));
    AppMethodBeat.o(111925);
  }

  public void setData(d paramd)
  {
    AppMethodBeat.i(111928);
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naE == null))
    {
      setVisibility(8);
      AppMethodBeat.o(111928);
      return;
    }
    this.neV = paramd;
    paramd = paramd.mVH;
    setVisibility(0);
    com.tencent.mm.plugin.game.f.e.bFH().a(this.ngV, paramd.naE.mZk.mZr, com.tencent.mm.bz.a.getDensity(getContext()));
    this.ngW.setText(paramd.naE.mZk.Name);
    this.nio.f(paramd.naE.mZk.mZH, this.neT);
    if (!bo.isNullOrNil(paramd.naE.nbp))
    {
      this.kEq.setText(paramd.naE.nbp);
      this.kEq.setVisibility(0);
      label153: this.nip.setVisibility(0);
      if (bo.isNullOrNil(paramd.naE.nbr))
        break label352;
      c(this.niq, paramd.naE.mZi);
      this.nir.setVisibility(0);
    }
    while (true)
    {
      this.nip.setOnClickListener(this);
      this.nis.setData(paramd);
      paramd = x.a(this.neV.mVH.naE.mZk);
      paramd.scene = 10;
      paramd.cKG = 1024;
      paramd.position = this.neV.position;
      this.nit.setDownloadInfo(new k(paramd));
      if (!this.neV.mVJ)
      {
        com.tencent.mm.plugin.game.e.a.a(getContext(), 10, 1024, this.neV.position, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.kY(this.neV.mVH.mZL));
        this.neV.mVJ = true;
      }
      AppMethodBeat.o(111928);
      break;
      this.kEq.setVisibility(8);
      break label153;
      label352: if (!bo.isNullOrNil(paramd.naE.mZi))
      {
        c(this.niq, paramd.naE.mZi);
        this.nir.setVisibility(8);
      }
      else
      {
        this.nip.setVisibility(8);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedGameTemplateView
 * JD-Core Version:    0.6.2
 */