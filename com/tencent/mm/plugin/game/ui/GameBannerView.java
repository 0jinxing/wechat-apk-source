package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.game.e.b;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.pluginsdk.model.app.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.MMDotView;
import java.util.LinkedList;

public class GameBannerView extends LinearLayout
  implements ViewPager.OnPageChangeListener, View.OnClickListener
{
  private MMDotView jiG;
  private Context mContext;
  private int mXC;
  private GameBannerView.b neD;
  LinkedList<GameBannerView.a> neE;
  ap neF;
  private float neG;
  private float neH;
  private ViewPager sq;

  public GameBannerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(111722);
    this.mXC = 0;
    this.neF = new ap(new GameBannerView.1(this), true);
    this.neG = 0.0F;
    this.neH = 0.0F;
    this.mContext = paramContext;
    inflate(paramContext, 2130969651, this);
    this.neE = new LinkedList();
    AppMethodBeat.o(111722);
  }

  private void hR(boolean paramBoolean)
  {
    AppMethodBeat.i(111727);
    ViewParent localViewParent = getParent();
    if (localViewParent != null)
      localViewParent.requestDisallowInterceptTouchEvent(paramBoolean);
    AppMethodBeat.o(111727);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111728);
    if (!(paramView.getTag() instanceof GameBannerView.a))
      AppMethodBeat.o(111728);
    while (true)
    {
      return;
      Object localObject = (GameBannerView.a)paramView.getTag();
      paramView = ((GameBannerView.a)localObject).neJ;
      int i;
      if (!bo.isNullOrNil(((GameBannerView.a)localObject).mVm))
      {
        paramView = ((GameBannerView.a)localObject).mVm;
        i = c.ax(this.mContext, paramView);
        b.a(this.mContext, 11, 1101, 1, i, this.mXC, null);
        AppMethodBeat.o(111728);
      }
      else
      {
        ab.i("MicroMsg.GameBannerView", "null or nil url");
        localObject = new Bundle();
        ((Bundle)localObject).putCharSequence("game_app_id", paramView.field_appId);
        ((Bundle)localObject).putInt("game_report_from_scene", 5);
        i = c.b(this.mContext, paramView.field_appId, null, (Bundle)localObject);
        b.a(this.mContext, 11, 1101, 1, i, this.mXC, null);
        AppMethodBeat.o(111728);
      }
    }
  }

  protected void onFinishInflate()
  {
    AppMethodBeat.i(111723);
    super.onFinishInflate();
    this.jiG = ((MMDotView)findViewById(2131824293));
    this.sq = ((ViewPager)findViewById(2131824292));
    this.sq.setOnPageChangeListener(this);
    this.neD = new GameBannerView.b(this, (byte)0);
    AppMethodBeat.o(111723);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(111726);
    int i = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    switch (i)
    {
    default:
      switch (paramMotionEvent.getAction())
      {
      case 2:
      default:
      case 0:
      case 1:
      case 3:
      }
      break;
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(111726);
      return bool;
      this.neG = f1;
      this.neH = f2;
      break;
      i = (int)(f1 - this.neG);
      int j = (int)(f2 - this.neH);
      if (Math.abs(i) <= Math.abs(j))
        break;
      hR(true);
      break;
      hR(false);
      this.neG = 0.0F;
      this.neH = 0.0F;
      break;
      this.neF.stopTimer();
      continue;
      this.neF.ae(5000L, 5000L);
    }
  }

  public void onPageScrollStateChanged(int paramInt)
  {
  }

  public void onPageScrolled(int paramInt1, float paramFloat, int paramInt2)
  {
  }

  public void onPageSelected(int paramInt)
  {
    AppMethodBeat.i(111725);
    int i = paramInt % this.neE.size();
    ab.i("MicroMsg.GameBannerView", "now selected page %d, now exactly positon : %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i) });
    if ((((GameBannerView.a)this.neE.get(i)).neJ != null) && (g.RK()))
      b.a(this.mContext, 11, 1101, i + 1, 1, this.mXC, null);
    AppMethodBeat.o(111725);
  }

  public void setBannerList(LinkedList<GameBannerView.a> paramLinkedList)
  {
    AppMethodBeat.i(111724);
    if ((paramLinkedList == null) || (paramLinkedList.size() == 0))
    {
      ab.e("MicroMsg.GameBannerView", "Empty banner list");
      setVisibility(8);
      AppMethodBeat.o(111724);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.GameBannerView", "bannerList size", new Object[] { Integer.valueOf(paramLinkedList.size()) });
      this.neF.stopTimer();
      this.neE.clear();
      this.neE.addAll(paramLinkedList);
      this.sq.setAdapter(this.neD);
      this.sq.setCurrentItem(paramLinkedList.size() * 1000, false);
      if (this.neE.size() > 1)
        this.neF.ae(5000L, 5000L);
      this.jiG.setVisibility(8);
      setVisibility(0);
      AppMethodBeat.o(111724);
    }
  }

  public void setSourceScene(int paramInt)
  {
    this.mXC = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameBannerView
 * JD-Core Version:    0.6.2
 */