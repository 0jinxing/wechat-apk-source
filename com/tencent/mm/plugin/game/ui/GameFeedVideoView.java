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
import com.tencent.mm.plugin.game.d.cj;
import com.tencent.mm.plugin.game.d.dn;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.sdk.platformtools.bo;

public class GameFeedVideoView extends LinearLayout
  implements View.OnClickListener
{
  private d neV;
  private GameRoundImageView niW;
  private LinearLayout niX;
  private ImageView niY;
  private TextView niZ;
  private GameFeedTitleDescView nim;
  private FrameLayout nip;
  private GameFeedSubscriptView niz;

  public GameFeedVideoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111960);
    if (this.neV == null)
      AppMethodBeat.o(111960);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.neV.mVH.mZj))
      {
        int i = c.ax(getContext(), this.neV.mVH.mZj);
        b.a(getContext(), 10, 1024, this.neV.position, i, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), a.T(this.neV.mVH.mZL, "clickType", "card"));
      }
      AppMethodBeat.o(111960);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111957);
    super.onFinishInflate();
    this.nim = ((GameFeedTitleDescView)findViewById(2131824480));
    this.nip = ((FrameLayout)findViewById(2131824483));
    this.niW = ((GameRoundImageView)findViewById(2131824505));
    this.niX = ((LinearLayout)findViewById(2131824506));
    this.niY = ((ImageView)findViewById(2131824507));
    this.niZ = ((TextView)findViewById(2131824508));
    this.niz = ((GameFeedSubscriptView)findViewById(2131824485));
    setOnClickListener(this);
    AppMethodBeat.o(111957);
  }

  public void setLiveData(d paramd)
  {
    AppMethodBeat.i(111959);
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naC == null))
    {
      setVisibility(8);
      AppMethodBeat.o(111959);
      return;
    }
    this.neV = paramd;
    paramd = paramd.mVH;
    setVisibility(0);
    this.nim.b(paramd.naC.Title, paramd.naC.Desc, null);
    if (!bo.isNullOrNil(paramd.naC.mZi))
    {
      this.nip.setVisibility(0);
      e.bFH().a(this.niW, paramd.naC.mZi, getResources().getDimensionPixelSize(2131427723), getResources().getDimensionPixelSize(2131427722), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
      label148: if (bo.isNullOrNil(paramd.naC.ncZ))
        break label282;
      this.niX.setVisibility(0);
      this.niY.setVisibility(0);
      this.niZ.setText(paramd.naC.ncZ);
    }
    while (true)
    {
      this.niz.setData(paramd);
      if (!this.neV.mVJ)
      {
        a.a(getContext(), 10, 1024, this.neV.position, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), a.kY(this.neV.mVH.mZL));
        this.neV.mVJ = true;
      }
      AppMethodBeat.o(111959);
      break;
      this.nip.setVisibility(8);
      break label148;
      label282: this.niX.setVisibility(8);
    }
  }

  public void setVideoData(d paramd)
  {
    AppMethodBeat.i(111958);
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naB == null) || (bo.isNullOrNil(paramd.mVH.naB.mZi)))
    {
      setVisibility(8);
      AppMethodBeat.o(111958);
      return;
    }
    this.neV = paramd;
    paramd = paramd.mVH;
    setVisibility(0);
    this.nim.b(paramd.naB.Title, paramd.naB.Desc, null);
    e.bFH().a(this.niW, paramd.naB.mZi, getResources().getDimensionPixelSize(2131427723), getResources().getDimensionPixelSize(2131427722), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
    if (!bo.isNullOrNil(paramd.naB.ndH))
    {
      this.niX.setVisibility(0);
      this.niY.setVisibility(8);
      this.niZ.setText(paramd.naB.ndH);
    }
    while (true)
    {
      this.niz.setData(paramd);
      AppMethodBeat.o(111958);
      break;
      this.niX.setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedVideoView
 * JD-Core Version:    0.6.2
 */