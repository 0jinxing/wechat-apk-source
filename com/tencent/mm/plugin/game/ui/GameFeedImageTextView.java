package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.d.ad;
import com.tencent.mm.plugin.game.d.ca;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.f.e;
import com.tencent.mm.plugin.game.f.e.a;
import com.tencent.mm.plugin.game.f.e.a.a;
import com.tencent.mm.plugin.game.model.d;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.LinkedList;

public class GameFeedImageTextView extends LinearLayout
  implements View.OnClickListener
{
  private int ieu = 0;
  private d neV;
  private int niA = 0;
  private int niB;
  private GameFeedTitleDescView nim;
  private GameRoundImageView niq;
  private LinearLayout niu;
  private GameRoundImageView niv;
  private GameRoundImageView niw;
  private GameRoundImageView nix;
  private TextView niy;
  private GameFeedSubscriptView niz;

  public GameFeedImageTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111933);
    if ((this.neV == null) || (this.neV.mVH == null))
      AppMethodBeat.o(111933);
    while (true)
    {
      return;
      if (!bo.isNullOrNil(this.neV.mVH.mZj))
      {
        int i = c.ax(getContext(), this.neV.mVH.mZj);
        b.a(getContext(), 10, 1024, this.neV.position, i, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.T(this.neV.mVH.mZL, "clickType", "card"));
      }
      AppMethodBeat.o(111933);
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111931);
    super.onFinishInflate();
    this.nim = ((GameFeedTitleDescView)findViewById(2131824480));
    this.niq = ((GameRoundImageView)findViewById(2131824486));
    this.niu = ((LinearLayout)findViewById(2131824487));
    this.niv = ((GameRoundImageView)findViewById(2131824488));
    this.niw = ((GameRoundImageView)findViewById(2131824489));
    this.nix = ((GameRoundImageView)findViewById(2131824490));
    this.niy = ((TextView)findViewById(2131824491));
    this.niz = ((GameFeedSubscriptView)findViewById(2131824485));
    setOnClickListener(this);
    this.ieu = (c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
    this.niA = ((this.ieu - com.tencent.mm.bz.a.fromDPToPix(getContext(), 10) * 2) / 3);
    this.niB = com.tencent.mm.bz.a.fromDPToPix(getContext(), 105);
    if (this.niA < this.niB)
      this.niB = this.niA;
    ViewGroup.LayoutParams localLayoutParams = this.niv.getLayoutParams();
    localLayoutParams.width = this.niB;
    localLayoutParams.height = this.niB;
    this.niv.setLayoutParams(localLayoutParams);
    this.niw.setLayoutParams(localLayoutParams);
    this.nix.setLayoutParams(localLayoutParams);
    AppMethodBeat.o(111931);
  }

  public void setData(d paramd)
  {
    AppMethodBeat.i(111932);
    if ((paramd == null) || (paramd.mVH == null) || (paramd.mVH.naA == null))
    {
      setVisibility(8);
      AppMethodBeat.o(111932);
      return;
    }
    this.neV = paramd;
    paramd = paramd.mVH;
    setVisibility(0);
    this.nim.b(paramd.naA.Title, paramd.naA.ncM, null);
    int i;
    if (!bo.ek(paramd.naA.ncN))
    {
      i = paramd.naA.ncN.size();
      if (i == 1)
      {
        this.niu.setVisibility(8);
        this.niq.setVisibility(0);
        e.bFH().a(this.niq, (String)paramd.naA.ncN.get(0), getResources().getDimensionPixelSize(2131427723), getResources().getDimensionPixelSize(2131427722), c.getScreenWidth(getContext()) - getPaddingLeft() - getPaddingRight());
      }
    }
    while (true)
    {
      this.niz.setData(paramd);
      if (!this.neV.mVJ)
      {
        com.tencent.mm.plugin.game.e.a.a(getContext(), 10, 1024, this.neV.position, this.neV.mVH.fKh, GameIndexListView.getSourceScene(), com.tencent.mm.plugin.game.e.a.kY(this.neV.mVH.mZL));
        this.neV.mVJ = true;
      }
      AppMethodBeat.o(111932);
      break;
      this.niq.setVisibility(8);
      this.niu.setVisibility(0);
      this.niy.setVisibility(8);
      Object localObject = new e.a.a();
      ((e.a.a)localObject).nnP = true;
      localObject = ((e.a.a)localObject).bFI();
      e.bFH().a(this.niv, (String)paramd.naA.ncN.get(0), (e.a)localObject);
      e.bFH().a(this.niw, (String)paramd.naA.ncN.get(1), (e.a)localObject);
      if (i > 2)
      {
        e.bFH().a(this.nix, (String)paramd.naA.ncN.get(2), (e.a)localObject);
        this.nix.setVisibility(0);
        if (i > 3)
        {
          this.niy.setVisibility(0);
          this.niy.setText(String.format("共%d张", new Object[] { Integer.valueOf(i) }));
        }
      }
      else
      {
        this.nix.setVisibility(4);
        continue;
        this.niq.setVisibility(8);
        this.niu.setVisibility(8);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameFeedImageTextView
 * JD-Core Version:    0.6.2
 */