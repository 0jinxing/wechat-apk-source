package com.tencent.mm.ui.chatting.view;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.MMPullDownView;
import com.tencent.mm.ui.base.MMPullDownView.c;
import com.tencent.mm.ui.base.MMPullDownView.d;
import com.tencent.mm.ui.base.MMPullDownView.e;
import com.tencent.mm.ui.base.MMPullDownView.g;
import com.tencent.mm.ui.chatting.f.d.a;

public class MMChattingListView extends MMPullDownView
  implements MMPullDownView.c, MMPullDownView.d, MMPullDownView.e, MMPullDownView.g
{
  private ListView mListView;
  private com.tencent.mm.ui.chatting.l.a.a yNt;
  private Bundle yZU;
  private BaseAdapter zaN;
  private Rect zaO;
  private Paint zaP;
  private boolean zaQ;
  private int zaR;

  public MMChattingListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(32764);
    this.zaO = new Rect();
    this.zaQ = false;
    init(paramContext);
    AppMethodBeat.o(32764);
  }

  public MMChattingListView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(32765);
    this.zaO = new Rect();
    this.zaQ = false;
    init(paramContext);
    AppMethodBeat.o(32765);
  }

  private void init(Context paramContext)
  {
    AppMethodBeat.i(32766);
    this.zaP = new Paint();
    this.zaP.setColor(-16777216);
    this.mListView = new MMChattingListView.1(this, paramContext);
    this.mListView.setBackgroundDrawable(null);
    this.mListView.setSelector(2130839517);
    this.mListView.setCacheColorHint(0);
    this.mListView.setDivider(null);
    this.mListView.setPadding(0, 0, 0, com.tencent.mm.bz.a.fromDPToPix(paramContext, 6));
    this.mListView.setClipToPadding(false);
    this.mListView.setScrollBarStyle(33554432);
    setOverScrollMode(2);
    addView(this.mListView, new FrameLayout.LayoutParams(-1, -1));
    setCanOverScrool(false);
    qc(false);
    qd(false);
    setTopViewVisible(true);
    setOnBottomLoadDataListener(this);
    setOnTopLoadDataListener(this);
    setAtBottomCallBack(this);
    setAtTopCallBack(this);
    setIsBottomShowAll(true);
    setIsTopShowAll(false);
    setBottomViewVisible(true);
    AppMethodBeat.o(32766);
  }

  public final void a(boolean paramBoolean, Bundle paramBundle)
  {
    AppMethodBeat.i(32769);
    StringBuilder localStringBuilder = new StringBuilder("[lockTopLoadDataForPosition] start:").append(paramBoolean).append(" sourceArgs:");
    if (paramBundle == null);
    for (Object localObject = "null"; ; localObject = paramBundle)
    {
      ab.i("MicroMsg.MMChattingListView", localObject);
      this.zaQ = paramBoolean;
      this.yZU = paramBundle;
      super.qc(paramBoolean);
      AppMethodBeat.o(32769);
      return;
    }
  }

  public final void aw(Bundle paramBundle)
  {
    AppMethodBeat.i(32771);
    StringBuilder localStringBuilder = new StringBuilder("[forceTopLoadData] sourceArgs:");
    if (paramBundle == null);
    for (String str = ""; ; str = paramBundle.toString())
    {
      ab.i("MicroMsg.MMChattingListView", str);
      this.yZU = paramBundle;
      super.qd(true);
      AppMethodBeat.o(32771);
      return;
    }
  }

  public final boolean bhk()
  {
    AppMethodBeat.i(32773);
    this.zaR = getCurCount();
    ab.i("MicroMsg.MMChattingListView", "[onBottomLoadData] mPreCount:" + this.zaR);
    if (this.yNt != null)
    {
      this.yNt.a(d.a.yYt, false, this.yZU);
      this.yZU = null;
      this.zaQ = false;
    }
    AppMethodBeat.o(32773);
    return false;
  }

  public final boolean bhl()
  {
    AppMethodBeat.i(32772);
    View localView = getListView().getChildAt(getListView().getFirstVisiblePosition());
    boolean bool;
    if ((localView != null) && (localView.getTop() == 0))
    {
      bool = true;
      AppMethodBeat.o(32772);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(32772);
    }
  }

  public final boolean bhm()
  {
    boolean bool = true;
    AppMethodBeat.i(32768);
    View localView = getListView().getChildAt(getListView().getChildCount() - 1);
    if (localView == null)
      AppMethodBeat.o(32768);
    while (true)
    {
      return bool;
      if ((localView.getBottom() <= getListView().getHeight() - getListView().getPaddingBottom()) && (getListView().getLastVisiblePosition() == getListView().getAdapter().getCount() - 1))
      {
        AppMethodBeat.o(32768);
      }
      else
      {
        bool = false;
        AppMethodBeat.o(32768);
      }
    }
  }

  public final boolean bhn()
  {
    AppMethodBeat.i(32774);
    this.zaR = getCurCount();
    ab.i("MicroMsg.MMChattingListView", "[onTopLoadData] mPreCount:" + this.zaR + " isForceTopLoadDataForPosition:" + this.zaQ);
    com.tencent.mm.ui.chatting.l.a.a locala;
    if (this.yNt != null)
    {
      if ((this.zaQ) && (this.yZU != null))
        this.yZU.putInt("SCENE", 2);
      locala = this.yNt;
      if (!this.zaQ)
        break label128;
    }
    label128: for (d.a locala1 = d.a.yYw; ; locala1 = d.a.yYs)
    {
      locala.a(locala1, false, this.yZU);
      this.yZU = null;
      this.zaQ = false;
      AppMethodBeat.o(32774);
      return false;
    }
  }

  public BaseAdapter getBaseAdapter()
  {
    return this.zaN;
  }

  public int getCurCount()
  {
    AppMethodBeat.i(32775);
    int i;
    if (this.zaN == null)
    {
      i = 0;
      AppMethodBeat.o(32775);
    }
    while (true)
    {
      return i;
      i = this.zaN.getCount();
      AppMethodBeat.o(32775);
    }
  }

  public ListView getListView()
  {
    return this.mListView;
  }

  public int getPreCount()
  {
    return this.zaR;
  }

  public final void qc(boolean paramBoolean)
  {
    AppMethodBeat.i(32770);
    ab.i("MicroMsg.MMChattingListView", "[forceTopLoadData] start:" + paramBoolean + " isForceTopLoadDataForPosition:" + this.zaQ);
    if (this.zaQ)
      AppMethodBeat.o(32770);
    while (true)
    {
      return;
      super.qc(paramBoolean);
      AppMethodBeat.o(32770);
    }
  }

  public void setAdapter(BaseAdapter paramBaseAdapter)
  {
    AppMethodBeat.i(32767);
    this.zaN = paramBaseAdapter;
    getListView().setAdapter(this.zaN);
    AppMethodBeat.o(32767);
  }

  public void setHighLightChild(int paramInt)
  {
    AppMethodBeat.i(32776);
    paramInt = Math.max(0, paramInt);
    if (this.mListView == null)
    {
      ab.e("MicroMsg.MMChattingListView", "null == listView index:%s", new Object[] { Integer.valueOf(paramInt) });
      AppMethodBeat.o(32776);
    }
    while (true)
    {
      return;
      Object localObject1 = this.mListView.getChildAt(paramInt);
      if (localObject1 == null)
      {
        ab.e("MicroMsg.MMChattingListView", "null == view index:%s", new Object[] { Integer.valueOf(paramInt) });
        AppMethodBeat.o(32776);
      }
      else
      {
        Object localObject2 = localObject1;
        if (((View)localObject1).getBottom() - ((View)localObject1).getTop() <= 0)
        {
          localObject2 = this.mListView;
          localObject2 = ((ListView)localObject2).getChildAt(((ListView)localObject2).getHeaderViewsCount() + paramInt);
        }
        if (localObject2 == null)
        {
          ab.e("MicroMsg.MMChattingListView", "null == view index:%s", new Object[] { Integer.valueOf(paramInt + this.mListView.getHeaderViewsCount()) });
          AppMethodBeat.o(32776);
        }
        else
        {
          ab.i("MicroMsg.MMChattingListView", "[setHighLightChild] index:%s view rect:%s headerCount:%s", new Object[] { Integer.valueOf(paramInt), new Rect(((View)localObject2).getLeft(), ((View)localObject2).getTop(), ((View)localObject2).getRight(), ((View)localObject2).getBottom()), Integer.valueOf(this.mListView.getHeaderViewsCount()) });
          localObject1 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("alpha", new float[] { 0.0F, 0.85F, 0.85F, 0.85F, 0.85F, 0.85F, 0.0F }) });
          ((ValueAnimator)localObject1).addUpdateListener(new MMChattingListView.2(this, (View)localObject2));
          ((ValueAnimator)localObject1).addListener(new MMChattingListView.3(this));
          ((ValueAnimator)localObject1).setDuration(1600L);
          ((ValueAnimator)localObject1).start();
          AppMethodBeat.o(32776);
        }
      }
    }
  }

  public void setLoadExecutor(com.tencent.mm.ui.chatting.l.a.a parama)
  {
    this.yNt = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.view.MMChattingListView
 * JD-Core Version:    0.6.2
 */