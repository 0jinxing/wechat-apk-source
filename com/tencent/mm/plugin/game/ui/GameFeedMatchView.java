package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ad;
import com.tencent.mm.plugin.game.d.ck;
import com.tencent.mm.plugin.game.e.a;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.sdk.platformtools.bo;

public class GameFeedMatchView extends LinearLayout
  implements View.OnClickListener
{
  private d neV;
  private GameRoundImageView niC;
  private GameFeedTitleDescView nim;
  private GameFeedSubscriptView niz;

  public GameFeedMatchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111936);
    if ((this.neV == null) || (this.neV.mVH == null))
      AppMethodBeat.o(111936);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.neV.mVH.mZj))
      {
        int i = c.ax(getContext(), this.neV.mVH.mZj);
        b.a(getContext(), 10, 1024, this.neV.position, i, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), a.T(this.neV.mVH.mZL, "clickType", "card"));
      }
      AppMethodBeat.o(111936);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111934);
    super.onFinishInflate();
    this.nim = ((GameFeedTitleDescView)findViewById(2131824480));
    this.niC = ((GameRoundImageView)findViewById(2131824486));
    this.niz = ((GameFeedSubscriptView)findViewById(2131824485));
    setOnClickListener(this);
    AppMethodBeat.o(111934);
  }

  public void setData(d paramd)
  {
    AppMethodBeat.i(111935);
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naD == null))
    {
      setVisibility(8);
      AppMethodBeat.o(111935);
      return;
    }
    this.neV = paramd;
    paramd = paramd.mVH;
    setVisibility(0);
    this.nim.b(paramd.naD.Title, paramd.naD.Desc, null);
    if (!bo.isNullOrNil(paramd.naD.mZi))
    {
      this.niC.setVisibility(0);
      e.bFH().a(this.niC, paramd.naD.mZi, getResources().getDimensionPixelSize(2131427732), getResources().getDimensionPixelSize(2131427731), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
    }
    while (true)
    {
      this.niz.setData(paramd);
      if (!this.neV.mVJ)
      {
        a.a(getContext(), 10, 1024, this.neV.position, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), a.kY(this.neV.mVH.mZL));
        this.neV.mVJ = true;
      }
      AppMethodBeat.o(111935);
      break;
      setVisibility(8);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedMatchView
 * JD-Core Version:    0.6.2
 */