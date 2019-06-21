package android.support.v7.widget.a;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.view.c;
import android.support.v4.view.s;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.d;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.i;
import android.support.v7.widget.RecyclerView.j;
import android.support.v7.widget.RecyclerView.l;
import android.support.v7.widget.RecyclerView.s;
import android.support.v7.widget.RecyclerView.v;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.List;

public final class a extends RecyclerView.h
  implements RecyclerView.j
{
  RecyclerView aiB;
  private RecyclerView.d aog = null;
  private int arL;
  private List<Integer> avA;
  View avB = null;
  int avC = -1;
  c avD;
  private a.b avE;
  private final RecyclerView.l avF = new a.2(this);
  long avG;
  final List<View> avj = new ArrayList();
  private final float[] avk = new float[2];
  RecyclerView.v avl = null;
  float avm;
  float avn;
  float avo;
  float avp;
  float avq;
  float avr;
  float avs;
  float avt;
  a.a avu;
  int avv = 0;
  int avw;
  List<c> avx = new ArrayList();
  final Runnable avy = new a.1(this);
  private List<RecyclerView.v> avz;
  int mActivePointerId = -1;
  VelocityTracker mVelocityTracker;
  Rect oT;

  public a(a.a parama)
  {
    this.avu = parama;
  }

  private static boolean a(View paramView, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
  {
    if ((paramFloat1 >= paramFloat3) && (paramFloat1 <= paramView.getWidth() + paramFloat3) && (paramFloat2 >= paramFloat4) && (paramFloat2 <= paramView.getHeight() + paramFloat4));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private void f(float[] paramArrayOfFloat)
  {
    if ((this.avw & 0xC) != 0)
    {
      paramArrayOfFloat[0] = (this.avs + this.avq - this.avl.apJ.getLeft());
      if ((this.avw & 0x3) == 0)
        break label84;
      paramArrayOfFloat[1] = (this.avt + this.avr - this.avl.apJ.getTop());
    }
    while (true)
    {
      return;
      paramArrayOfFloat[0] = this.avl.apJ.getTranslationX();
      break;
      label84: paramArrayOfFloat[1] = this.avl.apJ.getTranslationY();
    }
  }

  private void lA()
  {
    if (this.mVelocityTracker != null)
    {
      this.mVelocityTracker.recycle();
      this.mVelocityTracker = null;
    }
  }

  final void M(RecyclerView.v paramv)
  {
    if (this.aiB.isLayoutRequested());
    while (true)
    {
      return;
      if (this.avv == 2)
      {
        float f = this.avu.lC();
        int i = (int)(this.avs + this.avq);
        int j = (int)(this.avt + this.avr);
        if ((Math.abs(j - paramv.apJ.getTop()) >= paramv.apJ.getHeight() * f) || (Math.abs(i - paramv.apJ.getLeft()) >= f * paramv.apJ.getWidth()))
        {
          int k;
          int m;
          int n;
          int i1;
          int i2;
          int i3;
          RecyclerView.i locali;
          int i4;
          if (this.avz == null)
          {
            this.avz = new ArrayList();
            this.avA = new ArrayList();
            k = Math.round(this.avs + this.avq) + 0;
            m = Math.round(this.avt + this.avr) + 0;
            n = paramv.apJ.getWidth() + k + 0;
            i1 = paramv.apJ.getHeight() + m + 0;
            i2 = (k + n) / 2;
            i3 = (m + i1) / 2;
            locali = this.aiB.getLayoutManager();
            i4 = locali.getChildCount();
          }
          for (int i5 = 0; ; i5++)
          {
            if (i5 >= i4)
              break label477;
            View localView = locali.getChildAt(i5);
            if ((localView != paramv.apJ) && (localView.getBottom() >= m) && (localView.getTop() <= i1) && (localView.getRight() >= k) && (localView.getLeft() <= n))
            {
              localObject = this.aiB.aZ(localView);
              int i6 = Math.abs(i2 - (localView.getLeft() + localView.getRight()) / 2);
              int i7 = localView.getTop();
              i7 = Math.abs(i3 - (localView.getBottom() + i7) / 2);
              int i8 = i6 * i6 + i7 * i7;
              i6 = 0;
              int i9 = this.avz.size();
              i7 = 0;
              while (true)
                if ((i7 < i9) && (i8 > ((Integer)this.avA.get(i7)).intValue()))
                {
                  i6++;
                  i7++;
                  continue;
                  this.avz.clear();
                  this.avA.clear();
                  break;
                }
              this.avz.add(i6, localObject);
              this.avA.add(i6, Integer.valueOf(i8));
            }
          }
          label477: Object localObject = this.avz;
          if (((List)localObject).size() != 0)
          {
            localObject = a.a.a(paramv, (List)localObject, i, j);
            if (localObject == null)
            {
              this.avz.clear();
              this.avA.clear();
            }
            else
            {
              ((RecyclerView.v)localObject).kj();
              paramv.kj();
              this.avu.a(paramv, (RecyclerView.v)localObject);
            }
          }
        }
      }
    }
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView)
  {
    int i = 0;
    if (this.avl != null)
      f(this.avk);
    RecyclerView.v localv = this.avl;
    List localList = this.avx;
    int j = localList.size();
    for (int k = 0; k < j; k++)
    {
      localList.get(k);
      paramCanvas.restoreToCount(paramCanvas.save());
    }
    if (localv != null)
      paramCanvas.restoreToCount(paramCanvas.save());
    j--;
    k = i;
    if (j >= 0)
    {
      paramCanvas = (c)localList.get(j);
      if ((paramCanvas.Ag) && (!paramCanvas.avW))
        localList.remove(j);
    }
    while (true)
    {
      j--;
      break;
      if (!paramCanvas.Ag)
      {
        k = 1;
        continue;
        if (k != 0)
          paramRecyclerView.invalidate();
        return;
      }
    }
  }

  public final void a(Canvas paramCanvas, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    this.avC = -1;
    float f1;
    float f2;
    if (this.avl != null)
    {
      f(this.avk);
      f1 = this.avk[0];
      f2 = this.avk[1];
    }
    while (true)
    {
      params = this.avu;
      RecyclerView.v localv = this.avl;
      List localList = this.avx;
      int i = this.avv;
      int j = localList.size();
      int k = 0;
      if (k < j)
      {
        c localc = (c)localList.get(k);
        if (localc.avQ == localc.avS)
        {
          localc.avX = localc.aoM.apJ.getTranslationX();
          label122: if (localc.avR != localc.avT)
            break label228;
        }
        label228: for (localc.avY = localc.aoM.apJ.getTranslationY(); ; localc.avY = (localc.avR + localc.awa * (localc.avT - localc.avR)))
        {
          int m = paramCanvas.save();
          params.a(paramCanvas, paramRecyclerView, localc.aoM, localc.avX, localc.avY, localc.avv, false);
          paramCanvas.restoreToCount(m);
          k++;
          break;
          localc.avX = (localc.avQ + localc.awa * (localc.avS - localc.avQ));
          break label122;
        }
      }
      if (localv != null)
      {
        k = paramCanvas.save();
        params.a(paramCanvas, paramRecyclerView, localv, f1, f2, i, true);
        paramCanvas.restoreToCount(k);
      }
      return;
      f2 = 0.0F;
      f1 = 0.0F;
    }
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    paramRect.setEmpty();
  }

  final void a(MotionEvent paramMotionEvent, int paramInt1, int paramInt2)
  {
    float f1 = paramMotionEvent.getX(paramInt2);
    float f2 = paramMotionEvent.getY(paramInt2);
    this.avq = (f1 - this.avm);
    this.avr = (f2 - this.avn);
    if ((paramInt1 & 0x4) == 0)
      this.avq = Math.max(0.0F, this.avq);
    if ((paramInt1 & 0x8) == 0)
      this.avq = Math.min(0.0F, this.avq);
    if ((paramInt1 & 0x1) == 0)
      this.avr = Math.max(0.0F, this.avr);
    if ((paramInt1 & 0x2) == 0)
      this.avr = Math.min(0.0F, this.avr);
  }

  final boolean a(int paramInt1, MotionEvent paramMotionEvent, int paramInt2)
  {
    Object localObject1 = null;
    if ((this.avl != null) || (paramInt1 != 2) || (this.avv == 2) || (!this.avu.lB()));
    label229: 
    while (true)
    {
      return false;
      if (this.aiB.getScrollState() != 1)
      {
        RecyclerView.i locali = this.aiB.getLayoutManager();
        Object localObject2;
        if (this.mActivePointerId == -1)
          localObject2 = localObject1;
        while (true)
        {
          if (localObject2 == null)
            break label229;
          a.a.j(this.aiB);
          break;
          paramInt1 = paramMotionEvent.findPointerIndex(this.mActivePointerId);
          float f1 = paramMotionEvent.getX(paramInt1);
          float f2 = this.avm;
          float f3 = paramMotionEvent.getY(paramInt1);
          float f4 = this.avn;
          f2 = Math.abs(f1 - f2);
          f3 = Math.abs(f3 - f4);
          if (f2 < this.arL)
          {
            localObject2 = localObject1;
            if (f3 < this.arL);
          }
          else if (f2 > f3)
          {
            localObject2 = localObject1;
            if (locali.iG());
          }
          else if (f3 > f2)
          {
            localObject2 = localObject1;
            if (locali.iH());
          }
          else
          {
            paramMotionEvent = k(paramMotionEvent);
            localObject2 = localObject1;
            if (paramMotionEvent != null)
              localObject2 = this.aiB.aZ(paramMotionEvent);
          }
        }
      }
    }
  }

  final int b(RecyclerView.v paramv, boolean paramBoolean)
  {
    int i = this.avx.size() - 1;
    c localc;
    if (i >= 0)
    {
      localc = (c)this.avx.get(i);
      if (localc.aoM == paramv)
      {
        localc.avZ |= paramBoolean;
        if (!localc.Ag)
          localc.avU.cancel();
        this.avx.remove(i);
      }
    }
    for (i = localc.avV; ; i = 0)
    {
      return i;
      i--;
      break;
    }
  }

  public final void bH(View paramView)
  {
    bY(paramView);
    paramView = this.aiB.aZ(paramView);
    if (paramView == null);
    while (true)
    {
      return;
      if ((this.avl != null) && (paramView == this.avl))
      {
        e(null, 0);
      }
      else
      {
        b(paramView, false);
        if (this.avj.remove(paramView.apJ))
          this.avu.a(this.aiB, paramView);
      }
    }
  }

  final void bY(View paramView)
  {
    if (paramView == this.avB)
    {
      this.avB = null;
      if (this.aog != null)
        this.aiB.setChildDrawingOrderCallback(null);
    }
  }

  final void e(RecyclerView.v paramv, int paramInt)
  {
    if ((paramv == this.avl) && (paramInt == this.avv))
      return;
    this.avG = -9223372036854775808L;
    int i = this.avv;
    b(paramv, true);
    this.avv = paramInt;
    if (paramInt == 2)
    {
      this.avB = paramv.apJ;
      if (Build.VERSION.SDK_INT < 21)
      {
        if (this.aog == null)
          this.aog = new a.5(this);
        this.aiB.setChildDrawingOrderCallback(this.aog);
      }
    }
    int j = 0;
    int k = 0;
    Object localObject;
    if (this.avl != null)
    {
      localObject = this.avl;
      if (((RecyclerView.v)localObject).apJ.getParent() == null)
        break label416;
      if ((i != 2) && (this.avv != 2))
        a.a.cZ(s.T(this.aiB));
      lA();
      if (i == 2)
      {
        j = 8;
        label159: f(this.avk);
        localObject = new a.3(this, (RecyclerView.v)localObject, j, i, this.avk[0], this.avk[1], 0.0F, 0.0F, 0, (RecyclerView.v)localObject);
        long l = a.a.d(this.aiB, j);
        ((c)localObject).avU.setDuration(l);
        this.avx.add(localObject);
        ((c)localObject).aoM.ao(false);
        ((c)localObject).avU.start();
        j = 1;
        label253: this.avl = null;
      }
    }
    else
    {
      if (paramv != null)
      {
        this.avw = ((a.a.j(this.aiB) & (1 << paramInt * 8 + 8) - 1) >> this.avv * 8);
        this.avs = paramv.apJ.getLeft();
        this.avt = paramv.apJ.getTop();
        this.avl = paramv;
        if (paramInt == 2)
          this.avl.apJ.performHapticFeedback(0);
      }
      paramv = this.aiB.getParent();
      if (paramv != null)
        if (this.avl == null)
          break label445;
    }
    label416: label445: for (boolean bool = true; ; bool = false)
    {
      paramv.requestDisallowInterceptTouchEvent(bool);
      if (j == 0)
        this.aiB.getLayoutManager().aoD = true;
      this.avu.f(this.avl, this.avv);
      this.aiB.invalidate();
      break;
      j = 4;
      break label159;
      bY(((RecyclerView.v)localObject).apJ);
      this.avu.a(this.aiB, (RecyclerView.v)localObject);
      j = k;
      break label253;
    }
  }

  public final void i(RecyclerView paramRecyclerView)
  {
    if (this.aiB == paramRecyclerView);
    while (true)
    {
      return;
      if (this.aiB != null)
      {
        this.aiB.c(this);
        this.aiB.b(this.avF);
        Object localObject = this.aiB;
        if (((RecyclerView)localObject).anz != null)
          ((RecyclerView)localObject).anz.remove(this);
        for (int i = this.avx.size() - 1; i >= 0; i--)
        {
          localObject = (c)this.avx.get(0);
          this.avu.a(this.aiB, ((c)localObject).aoM);
        }
        this.avx.clear();
        this.avB = null;
        this.avC = -1;
        lA();
        if (this.avE != null)
        {
          this.avE.avP = false;
          this.avE = null;
        }
        if (this.avD != null)
          this.avD = null;
      }
      this.aiB = paramRecyclerView;
      if (paramRecyclerView != null)
      {
        paramRecyclerView = paramRecyclerView.getResources();
        this.avo = paramRecyclerView.getDimension(2131428462);
        this.avp = paramRecyclerView.getDimension(2131428461);
        this.arL = ViewConfiguration.get(this.aiB.getContext()).getScaledTouchSlop();
        this.aiB.a(this);
        this.aiB.a(this.avF);
        paramRecyclerView = this.aiB;
        if (paramRecyclerView.anz == null)
          paramRecyclerView.anz = new ArrayList();
        paramRecyclerView.anz.add(this);
        this.avE = new a.b(this);
        this.avD = new c(this.aiB.getContext(), this.avE);
      }
    }
  }

  final View k(MotionEvent paramMotionEvent)
  {
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    if (this.avl != null)
    {
      paramMotionEvent = this.avl.apJ;
      if (!a(paramMotionEvent, f1, f2, this.avs + this.avq, this.avt + this.avr));
    }
    while (true)
    {
      return paramMotionEvent;
      for (int i = this.avx.size() - 1; ; i--)
      {
        if (i < 0)
          break label125;
        c localc = (c)this.avx.get(i);
        paramMotionEvent = localc.aoM.apJ;
        if (a(paramMotionEvent, f1, f2, localc.avX, localc.avY))
          break;
      }
      label125: paramMotionEvent = this.aiB.x(f1, f2);
    }
  }

  static class c
    implements Animator.AnimatorListener
  {
    boolean Ag = false;
    final RecyclerView.v aoM;
    final float avQ;
    final float avR;
    final float avS;
    final float avT;
    final ValueAnimator avU;
    final int avV;
    public boolean avW;
    float avX;
    float avY;
    boolean avZ = false;
    final int avv;
    float awa;

    c(RecyclerView.v paramv, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4)
    {
      this.avv = paramInt2;
      this.avV = paramInt1;
      this.aoM = paramv;
      this.avQ = paramFloat1;
      this.avR = paramFloat2;
      this.avS = paramFloat3;
      this.avT = paramFloat4;
      this.avU = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F });
      this.avU.addUpdateListener(new a.c.1(this));
      this.avU.setTarget(paramv.apJ);
      this.avU.addListener(this);
      this.awa = 0.0F;
    }

    public void onAnimationCancel(Animator paramAnimator)
    {
      this.awa = 1.0F;
    }

    public void onAnimationEnd(Animator paramAnimator)
    {
      if (!this.Ag)
        this.aoM.ao(true);
      this.Ag = true;
    }

    public void onAnimationRepeat(Animator paramAnimator)
    {
    }

    public void onAnimationStart(Animator paramAnimator)
    {
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.a.a
 * JD-Core Version:    0.6.2
 */