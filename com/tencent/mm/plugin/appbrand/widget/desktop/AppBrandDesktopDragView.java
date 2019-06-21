package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.v;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.widget.desktop.a.c;
import com.tencent.mm.plugin.appbrand.widget.header.HeaderContainer;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.v;
import java.util.List;

public class AppBrandDesktopDragView extends DragFeatureView
{
  private List iKa;
  private HeaderContainer iVo;
  private List iWE;
  private int iWF;
  private boolean iWG;
  private boolean iWH;
  private b iWI;
  private int iWJ;
  private boolean iWK;
  private boolean iWL;
  private a iWM;
  private e iWN;
  private int paddingLeft;
  private int paddingTop;
  private ValueAnimator rD;

  public AppBrandDesktopDragView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(133758);
    this.iWF = 0;
    this.iWG = false;
    this.iWH = false;
    this.iWI = null;
    this.iWJ = 0;
    this.paddingLeft = 0;
    this.paddingTop = 0;
    this.iWK = false;
    this.iWL = false;
    init();
    AppMethodBeat.o(133758);
  }

  public AppBrandDesktopDragView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(133759);
    this.iWF = 0;
    this.iWG = false;
    this.iWH = false;
    this.iWI = null;
    this.iWJ = 0;
    this.paddingLeft = 0;
    this.paddingTop = 0;
    this.iWK = false;
    this.iWL = false;
    init();
    AppMethodBeat.o(133759);
  }

  private int bH(Object paramObject)
  {
    int i = 0;
    AppMethodBeat.i(133765);
    int j;
    if (this.iWG)
      if ((this.iWM != null) && (this.iWM.aPl() - 1 >= b.axI()))
      {
        j = 1;
        if (j == 0)
          break label125;
        ab.i("MicroMsg.AppBrandDesktopDragView", "alvinluo checkCanInsert current: %d, over limit: %d", new Object[] { Integer.valueOf(this.iWM.aPl()), Integer.valueOf(b.axI()) });
        AppMethodBeat.o(133765);
        j = 2;
      }
    while (true)
    {
      return j;
      j = 0;
      break;
      if ((this.iWM != null) && (this.iWM.aPl() >= b.axI()))
      {
        j = 1;
        break;
      }
      j = 0;
      break;
      label125: if ((paramObject instanceof AppBrandDesktopView.c))
      {
        paramObject = (AppBrandDesktopView.c)paramObject;
        if (paramObject.iXW != null)
        {
          if (j.a.np(paramObject.iXW.har))
          {
            if (paramObject.iXW.haR <= System.currentTimeMillis() / 1000L)
            {
              AppMethodBeat.o(133765);
              j = i;
              continue;
            }
            AppMethodBeat.o(133765);
            j = 1;
            continue;
          }
          AppMethodBeat.o(133765);
          j = i;
        }
      }
      else
      {
        j = 99;
        AppMethodBeat.o(133765);
      }
    }
  }

  private float getOffsetX()
  {
    AppMethodBeat.i(133768);
    float f1 = d.di(getContext());
    float f2 = d.getScreenWidth(getContext()) / 2;
    float f3 = f1 / 2.0F;
    f1 = this.paddingLeft;
    AppMethodBeat.o(133768);
    return f1 - (f2 - f3);
  }

  private float getOffsetY()
  {
    AppMethodBeat.i(133769);
    float f = -(a.fromDPToPix(getContext(), 32) + (d.dl(getContext()) * 1.5F - d.dl(getContext())) / 2.0F);
    AppMethodBeat.o(133769);
    return f;
  }

  private void init()
  {
    AppMethodBeat.i(133760);
    this.paddingTop = getResources().getDimensionPixelOffset(2131427776);
    AppMethodBeat.o(133760);
  }

  private void m(final View paramView, boolean paramBoolean)
  {
    AppMethodBeat.i(133762);
    if ((paramView.getVisibility() == 0) && (paramBoolean))
      AppMethodBeat.o(133762);
    while (true)
    {
      return;
      if ((paramBoolean) && (this.iWL))
      {
        AppMethodBeat.o(133762);
      }
      else if ((paramView.getVisibility() != 0) && (!paramBoolean))
      {
        AppMethodBeat.o(133762);
      }
      else if ((!paramBoolean) && (this.iWK))
      {
        AppMethodBeat.o(133762);
      }
      else if (paramBoolean)
      {
        this.iWL = true;
        paramView.setScaleX(0.1F);
        paramView.setScaleY(0.1F);
        paramView.setVisibility(0);
        paramView.animate().scaleX(1.0F).scaleY(1.0F).setDuration(200L).setListener(new Animator.AnimatorListener()
        {
          public final void onAnimationCancel(Animator paramAnonymousAnimator)
          {
            AppMethodBeat.i(133753);
            AppBrandDesktopDragView.d(AppBrandDesktopDragView.this);
            AppMethodBeat.o(133753);
          }

          public final void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            AppMethodBeat.i(133752);
            AppBrandDesktopDragView.d(AppBrandDesktopDragView.this);
            AppMethodBeat.o(133752);
          }

          public final void onAnimationRepeat(Animator paramAnonymousAnimator)
          {
          }

          public final void onAnimationStart(Animator paramAnonymousAnimator)
          {
          }
        }).start();
        AppMethodBeat.o(133762);
      }
      else
      {
        this.iWK = true;
        paramView.setScaleX(1.0F);
        paramView.setScaleY(1.0F);
        paramView.setVisibility(0);
        paramView.animate().scaleX(0.0F).scaleY(0.0F).setDuration(200L).setListener(new Animator.AnimatorListener()
        {
          public final void onAnimationCancel(Animator paramAnonymousAnimator)
          {
            AppMethodBeat.i(133755);
            AppBrandDesktopDragView.e(AppBrandDesktopDragView.this);
            paramView.setVisibility(4);
            AppMethodBeat.o(133755);
          }

          public final void onAnimationEnd(Animator paramAnonymousAnimator)
          {
            AppMethodBeat.i(133754);
            AppBrandDesktopDragView.e(AppBrandDesktopDragView.this);
            paramView.setVisibility(4);
            AppMethodBeat.o(133754);
          }

          public final void onAnimationRepeat(Animator paramAnonymousAnimator)
          {
          }

          public final void onAnimationStart(Animator paramAnonymousAnimator)
          {
          }
        }).start();
        AppMethodBeat.o(133762);
      }
    }
  }

  protected final c N(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133761);
    int i;
    int j;
    if ((paramv != null) && (paramv.apN == 2))
    {
      this.iWG = false;
      paramv = new com.tencent.mm.plugin.appbrand.widget.desktop.a.d(this, this.iWE, this.iKa, new AppBrandDesktopDragView.1(this));
      i = getResources().getDimensionPixelSize(2131427858);
      j = this.paddingLeft;
      paramv.paddingTop = i;
      paramv.paddingLeft = j;
      paramv.iYu = getRecyclerScrollComputer();
      paramv.jbg = new AppBrandDesktopDragView.2(this);
      AppMethodBeat.o(133761);
    }
    while (true)
    {
      return paramv;
      this.iWG = true;
      paramv = new com.tencent.mm.plugin.appbrand.widget.desktop.a.e(this, this.iKa, new AppBrandDesktopDragView.3(this));
      paramv.iYu = getRecyclerScrollComputer();
      paramv.jbg = new AppBrandDesktopDragView.4(this);
      i = getResources().getDimensionPixelSize(2131427858);
      j = this.paddingLeft;
      paramv.paddingTop = i;
      paramv.paddingLeft = j;
      AppMethodBeat.o(133761);
    }
  }

  protected final View a(e parame)
  {
    AppMethodBeat.i(133767);
    View localView1 = v.hu(getContext()).inflate(2130969924, null, false);
    getResources().getDimensionPixelSize(2131427995);
    localView1.setLayoutParams(new RecyclerView.LayoutParams(-2, -2));
    this.iWN = new e(localView1);
    e locale = this.iWN;
    View localView2 = parame.apJ;
    localView1 = locale.apJ;
    localView1.setScaleX(1.0F);
    localView1.setScaleY(1.0F);
    localView1.setAlpha(1.0F);
    localView1.setVisibility(0);
    int[] arrayOfInt = new int[2];
    localView2.getLocationOnScreen(arrayOfInt);
    locale.iqT.setImageDrawable(parame.iqT.getDrawable());
    locale.iqT.setBackground(parame.iqT.getBackground());
    locale.iYf.setText(parame.iYf.getText());
    locale.iYf.setVisibility(parame.iYf.getVisibility());
    locale.iYg.setVisibility(4);
    float f1 = d.dl(getContext());
    float f2 = f1 * 1.5F + a.fromDPToPix(getContext(), 8) * 2;
    ab.i("MicroMsg.AppBrandDesktopDragView", "alvinluo fillFloatView iconLayout: %f", new Object[] { Float.valueOf(f2) });
    localView1.findViewById(2131825239).getLayoutParams().height = ((int)f2);
    locale.iYe.getLayoutParams().height = ((int)f2);
    locale.iYe.getLayoutParams().width = ((int)f1 + (int)(a.am(getContext(), 2131427858) * 2 * d.dm(getContext())));
    locale.iqT.getLayoutParams().width = ((int)f1);
    locale.iqT.getLayoutParams().height = ((int)f1);
    locale.iYd.getLayoutParams().width = ((int)f1);
    locale.iYd.getLayoutParams().height = ((int)f1);
    parame = locale.iYg.getLayoutParams();
    if ((parame instanceof RelativeLayout.LayoutParams))
    {
      ((RelativeLayout.LayoutParams)parame).topMargin = (a.fromDPToPix(getContext(), 6) + (int)(f1 * 0.5F / 2.0F));
      parame.width = ((int)(getContext().getResources().getDimensionPixelSize(2131427776) * d.dm(getContext())));
      parame.height = ((int)(getContext().getResources().getDimensionPixelSize(2131427776) * d.dm(getContext())));
    }
    float f3 = (f1 * 1.5F - f1) / 2.0F;
    f2 = arrayOfInt[0] + getOffsetX();
    f3 = arrayOfInt[1] + this.paddingTop - f3 - a.fromDPToPix(getContext(), 48);
    localView1.findViewById(2131825237).setVisibility(4);
    localView1.findViewById(2131821502).animate().alpha(0.5F).setDuration(300L).setListener(null).start();
    ee(false);
    localView1.findViewById(2131821502).animate().scaleX(1.5F).scaleY(1.5F).setDuration(300L).setListener(new Animator.AnimatorListener()
    {
      public final void onAnimationCancel(Animator paramAnonymousAnimator)
      {
      }

      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        AppMethodBeat.i(133756);
        AppBrandDesktopDragView.this.ee(true);
        AppMethodBeat.o(133756);
      }

      public final void onAnimationRepeat(Animator paramAnonymousAnimator)
      {
      }

      public final void onAnimationStart(Animator paramAnonymousAnimator)
      {
      }
    }).start();
    parame = (ImageView)localView1.findViewById(2131823276);
    parame.getLayoutParams().height = ((int)(a.fromDPToPix(getContext(), 24) * d.dm(getContext())));
    parame.getLayoutParams().width = ((int)(a.fromDPToPix(getContext(), 24) * d.dm(getContext())));
    parame.setTranslationY(-f1 * 0.5F / 2.0F);
    parame.setTranslationX(f1 * 0.5F / 2.0F);
    localView1.setTranslationX(f2);
    localView1.setTranslationY(f3);
    ab.i("MicroMsg.AppBrandDesktopDragView", "alvinluo fillFloatView offsetX: %f, transX: %f, transY: %f", new Object[] { Float.valueOf(getOffsetX()), Float.valueOf(f2), Float.valueOf(f3) });
    AppMethodBeat.o(133767);
    return localView1;
  }

  protected final RecyclerView.v e(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    AppMethodBeat.i(133766);
    getRecyclerView().getGlobalVisibleRect(this.mRect);
    if (!this.mRect.contains((int)paramFloat1, (int)paramFloat2))
    {
      localObject1 = null;
      AppMethodBeat.o(133766);
      return localObject1;
    }
    int i = 0;
    Object localObject1 = null;
    int j = 0;
    label53: RecyclerView.v localv;
    Object localObject2;
    int k;
    if (j < getRecyclerView().getChildCount())
    {
      localv = getRecyclerView().aZ(getRecyclerView().getChildAt(j));
      localObject2 = localObject1;
      k = i;
      if (localv.apN != 7)
      {
        localObject2 = localObject1;
        k = i;
        if (localv.apN != 3)
        {
          localObject2 = localObject1;
          k = i;
          if (localv.apN != 8)
          {
            localv.apJ.getGlobalVisibleRect(this.mRect);
            localObject2 = localObject1;
            k = i;
            if (this.mRect.contains((int)paramFloat1, (int)paramFloat2))
              if (2 == localv.apN)
              {
                RecyclerView localRecyclerView = (RecyclerView)localv.apJ.findViewById(2131821168);
                k = 0;
                label199: if (k < localRecyclerView.getAdapter().getItemCount())
                {
                  localObject2 = localRecyclerView.cf(k);
                  if ((localObject2 == null) || (((RecyclerView.v)localObject2).apJ == null))
                    break label438;
                  ((RecyclerView.v)localObject2).apJ.getGlobalVisibleRect(this.mRect);
                  if (!this.mRect.contains((int)paramFloat1, (int)paramFloat2))
                    break label438;
                  i = 1;
                  localObject1 = localObject2;
                }
              }
          }
        }
      }
    }
    label426: label438: 
    while (true)
    {
      k++;
      break label199;
      localObject2 = localObject1;
      k = i;
      if (i == 0)
      {
        if (paramBoolean)
        {
          localObject1 = null;
          AppMethodBeat.o(133766);
          break;
        }
        k = 1;
        localObject2 = localv;
      }
      j++;
      localObject1 = localObject2;
      i = k;
      break label53;
      if (i != 0)
      {
        AppMethodBeat.o(133766);
        break;
      }
      if (!paramBoolean)
        for (i = getRecyclerView().getChildCount() - 1; ; i--)
        {
          if (i < 0)
            break label426;
          localObject1 = getRecyclerView().aZ(getRecyclerView().getChildAt(i));
          if (this.iWG)
          {
            if (((RecyclerView.v)localObject1).apN != 1)
              continue;
            AppMethodBeat.o(133766);
            break;
          }
          if (((RecyclerView.v)localObject1).apN == 7)
          {
            AppMethodBeat.o(133766);
            break;
          }
        }
      localObject1 = null;
      AppMethodBeat.o(133766);
      break;
    }
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(133764);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    getGlobalVisibleRect(this.iYo);
    this.iYo.set(this.iYo.left, this.iYo.bottom - this.iYi - (int)(getContext().getResources().getDimensionPixelSize(2131428436) * 0.75F) - 40, this.iYo.right, this.iYo.bottom - this.iYi);
    ab.i("MicroMsg.AppBrandDesktopDragView", "alvinluo bottomRect: %s", new Object[] { this.iYo });
    getRecyclerView().getGlobalVisibleRect(this.iYp);
    this.iYp.set(this.iYp.left, 0, this.iYp.right, this.iYp.top + this.iYi);
    AppMethodBeat.o(133764);
  }

  public void setAppBrandCounter(a parama)
  {
    this.iWM = parama;
  }

  public void setCollectionCallback(b paramb)
  {
    this.iWI = paramb;
  }

  public void setCollectionStartPosition(int paramInt)
  {
    this.iWF = paramInt;
  }

  public void setCopyList(List paramList)
  {
    this.iWE = paramList;
  }

  public void setHeaderContainer(HeaderContainer paramHeaderContainer)
  {
    this.iVo = paramHeaderContainer;
  }

  public void setItemPadding(int paramInt)
  {
    this.paddingLeft = paramInt;
  }

  public void setList(List paramList)
  {
    this.iKa = paramList;
  }

  protected void setRubbishViewVisible(int paramInt)
  {
    AppMethodBeat.i(133763);
    super.setRubbishViewVisible(paramInt);
    boolean bool;
    float f;
    if (paramInt == 0)
    {
      bool = true;
      f = getResources().getDimension(2131428610) * 0.75F;
      if (!bool)
        break label175;
      f = -f;
    }
    label175: 
    while (true)
    {
      if (bool);
      for (paramInt = 0; ; paramInt = (int)f)
      {
        ab.v("MicroMsg.AppBrandDesktopDragView", "alvinluo transBackFooterAnim isShow: %b, offset: %f, extraBottomHeight: %d", new Object[] { Boolean.valueOf(bool), Float.valueOf(f), Integer.valueOf(paramInt) });
        this.rD = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofFloat("transY", new float[] { 0.0F, f }) });
        int i = this.iVo.getBackUpFooterRect().top;
        this.rD.addUpdateListener(new AppBrandDesktopDragView.8(this, i, paramInt));
        this.rD.setDuration(300L);
        this.rD.start();
        AppMethodBeat.o(133763);
        return;
        bool = false;
        break;
      }
    }
  }

  public static abstract interface a
  {
    public abstract int aPl();
  }

  public static abstract interface b
  {
    public abstract void bI(Object paramObject);

    public abstract void bJ(Object paramObject);

    public abstract void bK(Object paramObject);

    public abstract void e(int paramInt1, int paramInt2, Object paramObject);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.AppBrandDesktopDragView
 * JD-Core Version:    0.6.2
 */