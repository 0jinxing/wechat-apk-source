package com.tencent.mm.ui.widget.listview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.ai;
import com.tencent.mm.ui.ak;
import java.util.ArrayList;
import java.util.List;

public class PullDownListView extends ListView
  implements AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener, AdapterView.OnItemSelectedListener
{
  private float aKM;
  private float aKN;
  private AdapterView.OnItemSelectedListener amA;
  private AdapterView.OnItemClickListener amz;
  private View aus;
  private boolean hOy;
  private int iVr;
  private int iVs;
  private Vibrator iVt;
  private int iev;
  public boolean isVisible;
  private int mActivePointerId;
  private float mLastMotionY;
  private Rect mRect;
  private int yI;
  private boolean zRA;
  private boolean zRB;
  private float zRC;
  private float zRD;
  private int zRE;
  private int zRF;
  private boolean zRG;
  private float zRH;
  private int zRI;
  private int zRJ;
  private boolean zRK;
  private long zRL;
  private long zRM;
  private AdapterView.OnItemLongClickListener zRN;
  private boolean zRi;
  private float zRj;
  private float zRk;
  private float zRl;
  private float zRm;
  public boolean zRn;
  private View zRo;
  private View zRp;
  private int zRq;
  public PullDownListView.a zRr;
  private boolean zRs;
  private final int zRt;
  private final int zRu;
  private final int zRv;
  private View zRw;
  private float zRx;
  private float zRy;
  private boolean zRz;

  public PullDownListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(112731);
    this.zRi = false;
    this.zRj = 0.05F;
    this.zRk = 0.05F;
    this.iVr = 0;
    this.iVs = 0;
    this.iev = 0;
    this.zRl = 0.0F;
    this.zRm = 0.0F;
    this.zRn = true;
    this.mRect = new Rect();
    this.yI = 0;
    this.zRq = 0;
    this.zRs = false;
    this.zRt = 1;
    this.zRu = 2;
    this.zRv = 200;
    this.zRx = 0.0F;
    this.zRy = 0.0F;
    this.hOy = false;
    this.isVisible = true;
    this.zRz = false;
    this.zRA = false;
    this.zRB = false;
    this.zRD = 0.0F;
    this.zRE = 0;
    this.zRF = 0;
    this.zRG = false;
    this.zRH = 0.0F;
    this.mActivePointerId = -1;
    this.zRI = 0;
    this.zRJ = 0;
    this.zRK = false;
    this.zRL = 0L;
    this.zRM = 0L;
    super.setOnItemClickListener(this);
    super.setOnItemLongClickListener(this);
    super.setOnItemSelectedListener(this);
    ak.hy(paramContext);
    this.iev = ak.hy(paramContext).y;
    this.iVt = ((Vibrator)getContext().getSystemService("vibrator"));
    post(new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(112725);
        ai.d("MicroMsg.PullDownListView", "mThis.getLeft()=%s, mThis.getTop()=%s, mThis.getRight()=%s, mThis.getBottom()=%s", new Object[] { Integer.valueOf(PullDownListView.c(PullDownListView.this).getLeft()), Integer.valueOf(PullDownListView.c(PullDownListView.this).getTop()), Integer.valueOf(PullDownListView.c(PullDownListView.this).getRight()), Integer.valueOf(PullDownListView.c(PullDownListView.this).getBottom()) });
        PullDownListView.d(PullDownListView.this).set(PullDownListView.c(PullDownListView.this).getLeft(), PullDownListView.c(PullDownListView.this).getTop(), PullDownListView.c(PullDownListView.this).getRight(), PullDownListView.c(PullDownListView.this).getBottom());
        AppMethodBeat.o(112725);
      }
    });
    AppMethodBeat.o(112731);
  }

  private int Qm(int paramInt)
  {
    AppMethodBeat.i(112742);
    int i = (int)Math.abs(paramInt / this.iev * this.zRE);
    ai.d("MicroMsg.PullDownListView", "offset:%s,  ((float) offset / screenHeight):%s,  Math.abs(mCoordinationAnimThreshold):%s,  result:%s", new Object[] { Integer.valueOf(paramInt), Float.valueOf(paramInt / this.iev), Integer.valueOf(Math.abs(this.zRE)), Integer.valueOf(i) });
    AppMethodBeat.o(112742);
    return i;
  }

  private boolean T(MotionEvent paramMotionEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(112743);
    float f1 = paramMotionEvent.getRawX();
    float f2 = paramMotionEvent.getRawY();
    if (this.zRp != null)
      if ((paramMotionEvent.getActionMasked() != 1) || (this.zRM >= 200L))
        if (this.aKM < this.zRp.getRight())
          if ((f1 <= this.zRp.getLeft()) || (f1 >= this.zRp.getRight()) || (f2 <= this.zRp.getTop() - this.zRp.getHeight() / 2) || (f2 >= this.zRp.getBottom() + this.zRq));
    while (true)
    {
      AppMethodBeat.o(112743);
      return bool;
      bool = false;
      continue;
      if ((f1 <= this.zRp.getLeft()) || (f1 >= this.zRp.getRight()) || (f2 <= this.zRp.getTop()) || (f2 >= this.zRp.getBottom() + this.zRq))
      {
        bool = false;
        continue;
        bool = false;
      }
    }
  }

  private int aOX()
  {
    if (this.iVr == 0)
      this.iVr = ((int)(this.iev * this.zRj));
    return this.iVr;
  }

  @TargetApi(11)
  private void bBu()
  {
    AppMethodBeat.i(112740);
    this.yI = 0;
    ai.d("MicroMsg.PullDownListView", "startAnimation %s %s %s %s", new Object[] { Integer.valueOf(this.zRo.getLeft()), Integer.valueOf(this.zRo.getTop()), Integer.valueOf(this.zRo.getRight()), Integer.valueOf(this.zRo.getBottom()) });
    AppMethodBeat.o(112740);
  }

  private int dLa()
  {
    if (this.iVs == 0)
      this.iVs = ((int)((this.iev - this.zRF) * (1.0F - this.zRk)));
    return this.iVs;
  }

  private void dLb()
  {
    AppMethodBeat.i(112737);
    if (this.zRp != null)
    {
      float f1 = this.zRp.getTranslationX();
      float f2 = this.zRp.getTranslationY();
      ObjectAnimator localObjectAnimator1 = ObjectAnimator.ofFloat(this.zRp, "translationX", new float[] { f1, this.zRl });
      ObjectAnimator localObjectAnimator2 = ObjectAnimator.ofFloat(this.zRp, "translationY", new float[] { f2, this.zRm });
      AnimatorSet localAnimatorSet = new AnimatorSet();
      localAnimatorSet.playTogether(new Animator[] { localObjectAnimator1, localObjectAnimator2 });
      localAnimatorSet.addListener(new PullDownListView.3(this));
      localAnimatorSet.start();
    }
    AppMethodBeat.o(112737);
  }

  private boolean dLc()
  {
    AppMethodBeat.i(112741);
    boolean bool;
    if ((!this.mRect.isEmpty()) && (Math.abs(this.yI) > 0))
    {
      bool = true;
      AppMethodBeat.o(112741);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112741);
    }
  }

  private void dLd()
  {
    AppMethodBeat.i(112744);
    if (this.zRp != null)
      this.zRp.setVisibility(8);
    AppMethodBeat.o(112744);
  }

  private void dLe()
  {
    AppMethodBeat.i(112745);
    if (this.zRp != null)
    {
      this.zRp.setTranslationX(this.zRl);
      this.zRp.setTranslationY(this.zRm);
      this.zRp.setVisibility(8);
    }
    AppMethodBeat.o(112745);
  }

  private ValueAnimator hB(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112746);
    ai.d("MicroMsg.PullDownListView", "startStoryGalleryOpenAnim start:%s, end:%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    ValueAnimator localValueAnimator = ValueAnimator.ofInt(new int[] { paramInt1, paramInt2 });
    localValueAnimator.addUpdateListener(new PullDownListView.5(this));
    AppMethodBeat.o(112746);
    return localValueAnimator;
  }

  private void z(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    AppMethodBeat.i(112738);
    ai.i("MicroMsg.PullDownListView", "story_cat animation: %s %s %s %s %s %s %s %s start:%s, end:%s, openLimitPx():%s, closeLimitPx():%s, isMute:%s", new Object[] { Integer.valueOf(this.mRect.left), Integer.valueOf(this.mRect.top), Integer.valueOf(this.mRect.right), Integer.valueOf(this.mRect.bottom), Integer.valueOf(getLeft()), Integer.valueOf(getTop()), Integer.valueOf(getRight()), Integer.valueOf(getBottom()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(aOX()), Integer.valueOf(dLa()), Boolean.valueOf(paramBoolean) });
    AnimatorSet localAnimatorSet = new AnimatorSet();
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(ObjectAnimator.ofFloat(this, "translationY", new float[] { paramInt1, paramInt2 }));
    if ((this.aus != null) && (paramInt1 > aOX()) && (paramInt1 < dLa()))
    {
      if (paramInt2 != 0)
        localArrayList.add(ObjectAnimator.ofFloat(this.aus, "translationY", new float[] { paramInt1, paramInt2 }));
    }
    else if (this.zRw != null)
    {
      if (paramInt2 < getBottom())
        break label382;
      localArrayList.add(hB(((ViewGroup.MarginLayoutParams)this.zRw.getLayoutParams()).topMargin, 0));
    }
    while (true)
    {
      localAnimatorSet.addListener(new PullDownListView.4(this, paramInt1, paramInt2, paramBoolean));
      localAnimatorSet.playTogether(localArrayList);
      localAnimatorSet.start();
      bBu();
      AppMethodBeat.o(112738);
      return;
      localArrayList.add(ObjectAnimator.ofFloat(this.aus, "translationY", new float[] { paramInt1, paramInt2 - this.zRq }));
      break;
      label382: localArrayList.add(hB(((ViewGroup.MarginLayoutParams)this.zRw.getLayoutParams()).topMargin, this.zRE));
    }
  }

  public final void dLf()
  {
    AppMethodBeat.i(112751);
    ai.i("MicroMsg.PullDownListView", "switchNormalStatus", new Object[0]);
    if (!this.isVisible)
      z(dLa() - 1, 0, false);
    AppMethodBeat.o(112751);
  }

  public final void dLg()
  {
    AppMethodBeat.i(112752);
    ai.i("MicroMsg.PullDownListView", "switchPullDownStatus", new Object[0]);
    if (this.isVisible)
      z(aOX() + 1, this.zRo.getBottom() + this.zRq, false);
    AppMethodBeat.o(112752);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(112735);
    boolean bool = super.dispatchTouchEvent(paramMotionEvent);
    AppMethodBeat.o(112735);
    return bool;
  }

  @TargetApi(11)
  protected void onFinishInflate()
  {
    AppMethodBeat.i(112734);
    this.zRo = this;
    this.zRC = getTranslationY();
    ai.d("MicroMsg.PullDownListView", "onFinishInflate %s %s %s %s", new Object[] { Integer.valueOf(this.zRo.getLeft()), Integer.valueOf(this.zRo.getTop()), Integer.valueOf(this.zRo.getRight()), Integer.valueOf(this.zRo.getBottom()) });
    AppMethodBeat.o(112734);
  }

  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112747);
    if ((this.amz != null) && (!this.hOy) && (this.isVisible))
    {
      this.zRs = true;
      this.amz.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    }
    AppMethodBeat.o(112747);
  }

  public boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112750);
    boolean bool;
    if ((this.zRN != null) && (!this.hOy) && (this.isVisible))
    {
      this.zRs = true;
      bool = this.zRN.onItemLongClick(paramAdapterView, paramView, paramInt, paramLong);
      AppMethodBeat.o(112750);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112750);
    }
  }

  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(112748);
    if ((this.amA != null) && (!this.hOy) && (this.isVisible))
    {
      this.zRs = true;
      this.amA.onItemSelected(paramAdapterView, paramView, paramInt, paramLong);
    }
    AppMethodBeat.o(112748);
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(112739);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(112739);
  }

  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
    AppMethodBeat.i(112749);
    if (this.amA != null)
      this.amA.onNothingSelected(paramAdapterView);
    AppMethodBeat.o(112749);
  }

  @TargetApi(11)
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool1 = true;
    AppMethodBeat.i(112736);
    ai.d("MicroMsg.PullDownListView", "dancy test onTouchEvent, supportOverscroll:%s, scrollY:%s", new Object[] { Boolean.valueOf(this.zRi), Integer.valueOf(getScrollY()) });
    boolean bool2;
    if ((!this.zRi) || (this.zRo == null) || (this.zRz))
    {
      bool2 = super.onTouchEvent(paramMotionEvent);
      AppMethodBeat.o(112736);
      return bool2;
    }
    int i = paramMotionEvent.getActionMasked();
    ai.d("MicroMsg.PullDownListView", "onTouchEvent %s", new Object[] { Integer.valueOf(i) });
    label144: label146: float f;
    label386: int j;
    label441: int k;
    switch (i)
    {
    case 4:
    default:
    case 0:
    case 2:
      do
      {
        for (bool2 = false; ; bool2 = false)
        {
          ai.d("MicroMsg.PullDownListView", "consumed: %b", new Object[] { Boolean.valueOf(bool2) });
          if (bool2)
            paramMotionEvent.setAction(3);
          if (!bool2)
            break label2324;
          AppMethodBeat.o(112736);
          bool2 = bool1;
          break;
          if (this.zRG)
            break label144;
          this.mActivePointerId = paramMotionEvent.getPointerId(0);
          dLd();
          this.zRs = false;
          f = paramMotionEvent.getY(0);
          this.mLastMotionY = f;
          this.zRx = f;
          this.zRy = paramMotionEvent.getX(0);
          this.mRect.setEmpty();
          this.aKN = paramMotionEvent.getY(0);
          this.aKM = paramMotionEvent.getX(0);
          this.zRD = 0.0F;
          this.zRI = ((int)this.zRD);
          this.zRG = true;
          this.zRK = false;
          this.zRL = System.currentTimeMillis();
          this.zRM = 0L;
          dLe();
        }
        this.hOy = true;
        if (!this.zRG)
        {
          if (this.isVisible)
            break label1404;
          this.mActivePointerId = paramMotionEvent.getPointerId(0);
          this.mLastMotionY = paramMotionEvent.getY(0);
          this.aKN = paramMotionEvent.getY(0);
          this.zRD = (this.iev - this.zRF);
          this.zRI = ((int)this.zRD);
          this.zRG = true;
        }
        j = paramMotionEvent.findPointerIndex(this.mActivePointerId);
      }
      while (j == -1);
      this.zRx = paramMotionEvent.getY(j);
      this.zRy = paramMotionEvent.getX(j);
      if (this.zRx - this.aKN >= 0.0F)
      {
        this.zRJ = 2;
        k = getChildCount();
        if ((k <= 0) || (!this.isVisible))
          break label2480;
        if (this.zRJ != 2)
          break label1515;
        if (getChildAt(0).getTop() >= getPaddingTop() + 0)
          break label1509;
        k = 1;
      }
      break;
    case 1:
    case 3:
    case 5:
    case 6:
    }
    while (true)
    {
      label487: if (k != 0)
        this.zRK = true;
      label1028: ViewGroup.MarginLayoutParams localMarginLayoutParams;
      if (!this.zRK)
      {
        ai.d("MicroMsg.PullDownListView", "rawY:%s, rawX:%s, indexY:%s, indexX:%s", new Object[] { Float.valueOf(paramMotionEvent.getRawY()), Float.valueOf(paramMotionEvent.getRawX()), Float.valueOf(paramMotionEvent.getY(j)), Float.valueOf(paramMotionEvent.getX(j)) });
        ai.d("MicroMsg.PullDownListView", "move deltaY:%s, isAnima:%s, mDeltaY:%s, mIsIgnoreCallBack:%s translateBaseY:%s", new Object[] { Integer.valueOf((int)(this.mLastMotionY - this.zRx)), Boolean.valueOf(this.zRz), Integer.valueOf(this.yI), Boolean.valueOf(this.zRs), Float.valueOf(this.zRD) });
        if ((!this.zRs) && (!this.zRz))
        {
          if (this.mRect.isEmpty())
          {
            this.zRC = getTranslationY();
            this.mRect.set(this.zRo.getLeft(), this.zRo.getTop(), this.zRo.getRight(), this.zRo.getBottom());
            ai.d("MicroMsg.PullDownListView", "mRect.isEmpty() %s %s %s %s", new Object[] { Integer.valueOf(this.zRo.getLeft()), Integer.valueOf(this.zRo.getTop()), Integer.valueOf(this.zRo.getRight()), Integer.valueOf(this.zRo.getBottom()) });
          }
          ai.d("MicroMsg.PullDownListView", "eventIndex:%s, ev.getY():%s, y_down:%s, ev.getY()-y_down:%s", new Object[] { Integer.valueOf(j), Float.valueOf(paramMotionEvent.getY(j)), Float.valueOf(this.aKN), Float.valueOf(paramMotionEvent.getY(j) - this.aKN) });
          this.zRI += (int)((int)(this.zRx - this.mLastMotionY) / 2.0F);
          this.yI = Math.max(0, this.zRI);
          ai.d("MicroMsg.PullDownListView", "top %s, bottom:%s, mDeltaY %s, deltaOverScrollY:%s", new Object[] { Integer.valueOf(this.zRo.getTop()), Integer.valueOf(this.zRo.getBottom()), Integer.valueOf(this.yI), Integer.valueOf(this.zRI) });
          if (Math.abs(this.zRI) > 50)
          {
            if ((!this.zRA) && (this.yI >= aOX()) && (this.yI <= dLa()))
            {
              this.iVt.vibrate(10L);
              this.zRA = true;
              this.zRH = this.zRI;
            }
            ai.d("MicroMsg.PullDownListView", "OverScroll top %s, mIsIgnoreCallBack:%s, isVisible:%s", new Object[] { Integer.valueOf(this.mRect.top + this.yI), Boolean.valueOf(this.zRs), Boolean.valueOf(this.isVisible) });
            bool2 = true;
            this.zRo.setTranslationY(this.yI);
            if (this.isVisible)
            {
              k = Qm(Math.max(this.yI - (int)this.zRD, 0));
              if (this.zRw != null)
              {
                localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.zRw.getLayoutParams();
                localMarginLayoutParams.topMargin = Math.max(this.zRE, Math.min(0, k + this.zRE));
                ai.d("MicroMsg.PullDownListView", "openingCoordinationView params.bottomMargin:%s", new Object[] { Integer.valueOf(localMarginLayoutParams.bottomMargin) });
                this.zRw.setLayoutParams(localMarginLayoutParams);
              }
              if (this.zRr != null)
                this.zRr.AU(Qm(Math.max(this.yI - aOX() - (int)this.zRD, 0)));
              label1180: if (this.zRH != 0.0F)
              {
                k = (int)((int)(this.zRI - this.zRH) * 3.0F);
                if ((!this.isVisible) || (k <= 0) || (this.zRr == null))
                  break label1712;
                f = k;
                if (this.zRp != null)
                {
                  this.zRp.setTranslationX(Math.min(this.zRl + f, 0.0F));
                  this.zRp.setTranslationY(Math.max(this.zRm - f, 0.0F));
                  this.zRp.setVisibility(0);
                }
                if ((this.zRB) || (!T(paramMotionEvent)))
                  break label1684;
                this.iVt.vibrate(20L);
                this.zRB = true;
                label1313: if (!this.zRB)
                  break label1700;
                this.zRr.caL();
              }
              label1329: ai.d("MicroMsg.PullDownListView", "mThis.layout %s %s %s %s", new Object[] { Integer.valueOf(this.zRo.getLeft()), Integer.valueOf(this.zRo.getTop()), Integer.valueOf(this.zRo.getRight()), Integer.valueOf(this.zRo.getBottom()) });
            }
          }
        }
      }
      while (true)
      {
        this.mLastMotionY = this.zRx;
        break label146;
        label1404: this.mActivePointerId = paramMotionEvent.getPointerId(0);
        dLd();
        this.zRs = false;
        f = paramMotionEvent.getY(0);
        this.mLastMotionY = f;
        this.zRx = f;
        this.zRy = paramMotionEvent.getX(0);
        this.mRect.setEmpty();
        this.aKN = paramMotionEvent.getY(0);
        this.aKM = paramMotionEvent.getX(0);
        this.zRD = 0.0F;
        this.zRI = ((int)this.zRD);
        this.zRG = true;
        dLe();
        break label386;
        this.zRJ = 1;
        break label441;
        label1509: k = 0;
        break label487;
        label1515: if (this.zRJ != 1)
          break label2480;
        if (getChildAt(k - 1).getBottom() >= getHeight() - getPaddingBottom())
        {
          k = 1;
          break label487;
        }
        k = 0;
        break label487;
        k = Qm(Math.max((int)this.zRD - this.yI, 0));
        if (this.zRw != null)
        {
          localMarginLayoutParams = (ViewGroup.MarginLayoutParams)this.zRw.getLayoutParams();
          localMarginLayoutParams.topMargin = Math.min(0, Math.max(this.zRE, -k));
          ai.d("MicroMsg.PullDownListView", "closingCoordinationView params.bottomMargin:%s", new Object[] { Integer.valueOf(localMarginLayoutParams.bottomMargin) });
          this.zRw.setLayoutParams(localMarginLayoutParams);
        }
        if (this.zRr == null)
          break label1180;
        this.zRr.AV(Qm(Math.max(dLa() - this.yI, 0)));
        break label1180;
        label1684: if (T(paramMotionEvent))
          break label1313;
        this.zRB = false;
        break label1313;
        label1700: this.zRr.caM();
        break label1329;
        label1712: dLd();
        break label1329;
        k = paramMotionEvent.findPointerIndex(this.mActivePointerId);
        if (k == -1)
          break label144;
        this.zRx = paramMotionEvent.getY(k);
        this.zRy = paramMotionEvent.getX(k);
        dLb();
        this.mLastMotionY = 0.0F;
        this.zRH = 0.0F;
        this.zRA = false;
        this.zRM = (System.currentTimeMillis() - this.zRL);
        ai.d("MicroMsg.PullDownListView", "dancy test action up, mDeltaY:%s, closeLimitPx:%s, bottom:%s, mPullDownDuration%s", new Object[] { Integer.valueOf(this.yI), Integer.valueOf(dLa()), Integer.valueOf(this.zRo.getBottom()), Long.valueOf(this.zRM) });
        if ((dLc()) && (this.zRr != null) && (!this.zRz) && (this.zRn) && (!this.zRK))
        {
          ai.d("MicroMsg.PullDownListView", "dancy test action up, deltaOverScrollY:%s, translateBaseY:%s", new Object[] { Integer.valueOf(this.zRI), Float.valueOf(this.zRD) });
          if (this.zRI - this.zRD > 0.0F)
          {
            k = 1;
            label1926: if (k == 0)
              break label2042;
            if (((!this.isVisible) || (this.yI < aOX())) && ((this.isVisible) || (this.yI < dLa())))
              break label2464;
          }
        }
        label2060: label2318: label2324: label2458: label2464: for (k = this.zRo.getBottom() + this.zRq; ; k = 0)
        {
          z(this.yI, k, T(paramMotionEvent));
          label1996: this.zRs = false;
          this.zRG = false;
          this.zRI = 0;
          this.mActivePointerId = -1;
          this.zRK = false;
          this.zRM = 0L;
          this.zRL = 0L;
          bool2 = false;
          break label146;
          k = 0;
          break label1926;
          label2042: if (this.zRI - this.zRD < 0.0F)
          {
            k = 1;
            if (k == 0)
              break label2093;
            if (this.yI >= 0)
              break label2095;
            k = 0;
          }
          while (true)
          {
            while (true)
            {
              z(this.yI, k, false);
              break label1996;
              k = 0;
              break label2060;
              label2093: break label1996;
              label2095: if (this.yI < dLa())
                break label2458;
              k = this.zRo.getBottom();
              continue;
              if (dLc())
                break label1996;
              this.hOy = false;
              break label1996;
              dLb();
              this.zRG = false;
              this.zRs = false;
              this.mLastMotionY = 0.0F;
              this.zRH = 0.0F;
              this.zRA = false;
              if (this.zRr != null)
                bBu();
              this.zRI = 0;
              this.mActivePointerId = -1;
              this.zRK = false;
              this.zRM = 0L;
              this.zRL = 0L;
              bool2 = false;
              break label146;
              k = paramMotionEvent.getActionIndex();
              if (k == -1)
                break;
              this.mLastMotionY = ((int)paramMotionEvent.getY(k));
              this.mActivePointerId = paramMotionEvent.getPointerId(k);
              bool2 = false;
              break label146;
              k = paramMotionEvent.getActionIndex();
              if (paramMotionEvent.getPointerId(k) == this.mActivePointerId)
                if (k != 0)
                  break label2318;
              for (k = 1; ; k = 0)
              {
                this.mLastMotionY = ((int)paramMotionEvent.getY(k));
                this.mActivePointerId = paramMotionEvent.getPointerId(k);
                k = paramMotionEvent.getActionIndex();
                if (k == -1)
                  break;
                this.mLastMotionY = ((int)paramMotionEvent.getY(k));
                break;
              }
              try
              {
                boolean bool3 = super.onTouchEvent(paramMotionEvent);
                ai.d("MicroMsg.PullDownListView", "super.onTouchEvent(): %b", new Object[] { Boolean.valueOf(bool3) });
                if ((this.zRr != null) && (getChildCount() > 0))
                {
                  k = getChildAt(0).getTop();
                  ai.d("MicroMsg.PullDownListView", "scrolled %s", new Object[] { Integer.valueOf(k) });
                  this.zRr.AW(k);
                }
                AppMethodBeat.o(112736);
                bool2 = bool3;
              }
              catch (Exception paramMotionEvent)
              {
                ai.printErrStackTrace("MicroMsg.PullDownListView", paramMotionEvent, "%b, %d", new Object[] { Boolean.valueOf(bool2), Integer.valueOf(i) });
                AppMethodBeat.o(112736);
                bool2 = bool1;
              }
            }
            break;
            k = 0;
          }
        }
        bool2 = false;
        break label1028;
        bool2 = false;
      }
      label2480: k = 0;
    }
  }

  public void setMuteView(View paramView)
  {
    AppMethodBeat.i(112732);
    if (paramView != null)
      post(new PullDownListView.1(this, paramView));
    while (true)
    {
      this.zRp = paramView;
      AppMethodBeat.o(112732);
      return;
      this.zRl = 0.0F;
      this.zRm = 0.0F;
    }
  }

  public void setNavigationBarHeight(int paramInt)
  {
    AppMethodBeat.i(112733);
    ai.i("MicroMsg.PullDownListView", "setNavigationBarHeight=%s", new Object[] { Integer.valueOf(paramInt) });
    this.zRq = paramInt;
    AppMethodBeat.o(112733);
  }

  public void setOnItemClickListener(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    this.amz = paramOnItemClickListener;
  }

  public void setOnItemLongClickListener(AdapterView.OnItemLongClickListener paramOnItemLongClickListener)
  {
    this.zRN = paramOnItemLongClickListener;
  }

  public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener paramOnItemSelectedListener)
  {
    this.amA = paramOnItemSelectedListener;
  }

  public void setSupportOverscroll(boolean paramBoolean)
  {
    this.zRi = paramBoolean;
  }

  public void setTabView(View paramView)
  {
    this.aus = paramView;
  }

  public final void x(View paramView, int paramInt1, int paramInt2)
  {
    this.zRw = paramView;
    this.zRF = paramInt1;
    this.zRE = paramInt2;
    this.iVs = 0;
    this.iVr = 0;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.listview.PullDownListView
 * JD-Core Version:    0.6.2
 */