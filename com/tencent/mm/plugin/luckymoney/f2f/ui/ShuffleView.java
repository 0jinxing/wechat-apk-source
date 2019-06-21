package com.tencent.mm.plugin.luckymoney.f2f.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

public class ShuffleView extends FrameLayout
{
  public static DisplayMetrics ghw;
  private float eX;
  private float eY;
  View gCO;
  GestureDetector lCs;
  ValueAnimator lgH;
  List<View> nVP;
  private ShuffleView.c nVQ;
  ValueAnimator nVR;
  private ValueAnimator nVS;
  ValueAnimator nVT;
  private ShuffleView.a nVU;
  private ShuffleView.a nVV;
  private ShuffleView.b nVW;
  View nVX;
  private View nVY;
  int nVZ;
  private View nWa;
  private int nWb;
  int nWc;
  private final float nWd;
  private final float nWe;
  private final float nWf;
  private ArrayList<Float> nWg;
  private ArrayList<Float> nWh;
  private boolean nWi;
  private int nWj;
  private int nWk;

  public ShuffleView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(42244);
    this.nWd = 0.23F;
    this.nWe = 0.28F;
    this.nWf = 0.33F;
    this.nWk = 2500;
    this.lCs = new GestureDetector(new ShuffleView.14(this));
    this.nVQ = new ShuffleView.c();
    this.nVP = new ArrayList();
    this.nWg = new ArrayList();
    this.nWh = new ArrayList();
    this.nWj = getResources().getDimensionPixelSize(2131428489);
    AppMethodBeat.o(42244);
  }

  private void bLl()
  {
    AppMethodBeat.i(42247);
    if (this.nWc > 1)
    {
      ab.d("ShuffleView", "card width: %d,height: %d", new Object[] { Integer.valueOf(((View)this.nVP.get(0)).getWidth()), Integer.valueOf(((View)this.nVP.get(0)).getHeight()) });
      if (this.nVQ.nWp == 2)
      {
        this.eX = (((View)this.nVP.get(0)).getWidth() * 1.5F / this.nWc);
        if (this.eX <= ((View)this.nVP.get(0)).getWidth() * 0.23F)
          break label225;
        this.eX = (((View)this.nVP.get(0)).getWidth() * 0.23F);
        AppMethodBeat.o(42247);
      }
    }
    while (true)
    {
      return;
      if (this.nVQ.nWp == 1)
      {
        this.eY = (((View)this.nVP.get(0)).getHeight() * 1.0F / this.nWc);
        AppMethodBeat.o(42247);
        continue;
        this.eX = 0.0F;
        this.eY = 0.0F;
      }
      else
      {
        label225: AppMethodBeat.o(42247);
      }
    }
  }

  private void bLn()
  {
    AppMethodBeat.i(42250);
    if (this.gCO != null)
    {
      ab.i("ShuffleView", "selectView != null, cancel select");
      if (this.nVT.isStarted())
        this.nVT.cancel();
      this.nVT.removeAllUpdateListeners();
      this.nVT.removeAllListeners();
      switch (this.nVQ.nWq)
      {
      default:
      case 4:
      }
    }
    while (true)
    {
      this.gCO = null;
      this.nVZ = 0;
      this.nVT.start();
      AppMethodBeat.o(42250);
      return;
      if (this.nVZ >= 0)
        this.nVT.addUpdateListener(new ShuffleView.8(this));
    }
  }

  private void bLo()
  {
    AppMethodBeat.i(42253);
    if (this.nWa != null)
    {
      ab.i("ShuffleView", "touchView != null,cancel touch");
      if (this.nVT.isStarted())
        this.nVT.cancel();
      this.nVT.removeAllUpdateListeners();
      this.nVT.removeAllListeners();
      switch (this.nVQ.nWq)
      {
      default:
      case 4:
      }
    }
    while (true)
    {
      this.nWa = null;
      this.nWb = -1;
      this.nVT.start();
      AppMethodBeat.o(42253);
      return;
      if (this.nWb >= 0)
        this.nVT.addUpdateListener(new ShuffleView.11(this));
    }
  }

  private float getSelectScaleTranslationX()
  {
    AppMethodBeat.i(42251);
    float f1;
    if (this.gCO != null)
    {
      f1 = this.gCO.getWidth();
      float f2 = this.eX;
      int i = this.nVZ - 1;
      int j = this.nWc - 1 - this.nVZ;
      int k = 0;
      if (i > 0)
        k = i + 0;
      i = k;
      if (j > 0)
        i = k + j;
      if (i > 0)
      {
        f1 = (0.33F * f1 - f2) * 2.0F / i;
        AppMethodBeat.o(42251);
      }
    }
    while (true)
    {
      return f1;
      f1 = 0.0F;
      AppMethodBeat.o(42251);
    }
  }

  private float getTouchScaleTranslationX()
  {
    AppMethodBeat.i(42254);
    float f1;
    if (this.nWa != null)
    {
      f1 = this.nWa.getWidth();
      float f2 = this.eX;
      int i = this.nWb - 1;
      int j = this.nWc - 1 - this.nWb;
      int k = 0;
      if (i > 0)
        k = i + 0;
      i = k;
      if (j > 0)
        i = k + j;
      if (i > 0)
      {
        f1 = (0.28F * f1 - f2) * 2.0F / i;
        AppMethodBeat.o(42254);
      }
    }
    while (true)
    {
      return f1;
      f1 = 0.0F;
      AppMethodBeat.o(42254);
    }
  }

  private Rect xP(int paramInt)
  {
    AppMethodBeat.i(42256);
    Object localObject;
    if ((paramInt >= 0) && (paramInt < this.nWc))
      localObject = (View)this.nVP.get(paramInt);
    switch (this.nVQ.nWq)
    {
    default:
      localObject = null;
      AppMethodBeat.o(42256);
    case 4:
    }
    while (true)
    {
      return localObject;
      int i;
      int j;
      int k;
      int m;
      int n;
      int i1;
      if (paramInt == 0)
      {
        i = ((View)localObject).getLeft();
        j = (int)((View)localObject).getTranslationX();
        paramInt = ((View)localObject).getTop();
        k = (int)((View)localObject).getTranslationY();
        m = ((View)localObject).getRight();
        n = (int)((View)localObject).getTranslationX();
        i1 = ((View)localObject).getBottom();
        localObject = new Rect(i + j, paramInt + k, m + n, (int)((View)localObject).getTranslationY() + i1);
        AppMethodBeat.o(42256);
      }
      else
      {
        View localView = (View)this.nVP.get(paramInt - 1);
        i = localView.getRight();
        i1 = (int)localView.getTranslationX();
        k = ((View)localObject).getTop();
        n = (int)((View)localObject).getTranslationY();
        m = ((View)localObject).getRight();
        paramInt = (int)((View)localObject).getTranslationX();
        j = ((View)localObject).getBottom();
        localObject = new Rect(i1 + i, k + n, m + paramInt, (int)((View)localObject).getTranslationY() + j);
        AppMethodBeat.o(42256);
      }
    }
  }

  final void W(View paramView, int paramInt)
  {
    AppMethodBeat.i(42248);
    if (this.nVQ.nWp == 1)
    {
      paramView.setScaleX(1.0F - this.nVQ.scaleX * paramInt);
      paramView.setTranslationY(xN(paramInt));
      AppMethodBeat.o(42248);
    }
    while (true)
    {
      return;
      if (this.nVQ.nWp == 2)
      {
        paramView.setScaleY(1.0F - this.nVQ.scaleY * paramInt);
        paramView.setTranslationX(xM(paramInt));
      }
      AppMethodBeat.o(42248);
    }
  }

  final int bLm()
  {
    AppMethodBeat.i(42249);
    int i = (int)(Math.random() * this.nWc);
    AppMethodBeat.o(42249);
    return i;
  }

  public View getEnterView()
  {
    return this.nVY;
  }

  public View getExitView()
  {
    return this.nVX;
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(42255);
    if (this.nWi)
    {
      AppMethodBeat.o(42255);
      bool = true;
    }
    int i;
    int j;
    while (true)
    {
      return bool;
      i = (int)paramMotionEvent.getX();
      j = (int)paramMotionEvent.getY();
      if (this.nWc > 0)
        break;
      AppMethodBeat.o(42255);
    }
    ab.d("ShuffleView", "y:%d,packet largest:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(getHeight() - ((View)this.nVP.get(0)).getHeight() - ((View)this.nVP.get(0)).getHeight() / 7) });
    if (j < getHeight() - ((View)this.nVP.get(0)).getHeight() - ((View)this.nVP.get(0)).getHeight() / 7)
    {
      if ((this.gCO != null) && (paramMotionEvent.getActionMasked() == 0))
      {
        if (this.nVW != null)
          this.nVW.es(this.nVZ, this.nWc);
        bLn();
      }
      while (true)
      {
        AppMethodBeat.o(42255);
        break;
        if ((this.nWa != null) && (this.nWa.getTranslationY() == -this.nWa.getHeight() / 7))
        {
          if (this.nVW != null)
            this.nVW.xL(this.nWc);
          xO(this.nWb);
        }
        else if (this.nWa != null)
        {
          bLo();
        }
      }
    }
    int k = 0;
    label296: if (k < this.nWc)
    {
      Rect localRect = xP(k);
      if ((localRect == null) || (!localRect.contains(i, j)));
    }
    for (k = 1; ; k = 0)
    {
      if (k == 0)
      {
        ab.d("ShuffleView", "event %d out of cards,%d,%d", new Object[] { Integer.valueOf(paramMotionEvent.getActionMasked()), Integer.valueOf(i), Integer.valueOf(j) });
        if ((this.gCO == null) || (paramMotionEvent.getActionMasked() != 0))
          break label439;
        if (this.nVW != null)
          this.nVW.es(this.nVZ, this.nWc);
        bLn();
      }
      while (true)
      {
        if (this.nWc > 1)
          break label514;
        AppMethodBeat.o(42255);
        break;
        k++;
        break label296;
        label439: if ((this.nWa != null) && (this.nWa.getTranslationY() == -this.nWa.getHeight() / 7))
        {
          if (this.nVW != null)
            this.nVW.xL(this.nWc);
          xO(this.nWb);
        }
        else if (this.nWa != null)
        {
          bLo();
        }
      }
      label514: bool = this.lCs.onTouchEvent(paramMotionEvent);
      ab.i("ShuffleView", "ret:%s,action:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(paramMotionEvent.getActionMasked()) });
      if ((!bool) && (paramMotionEvent.getActionMasked() == 1))
      {
        if ((this.nWa == null) || (this.nWa.getTranslationY() != -this.nWa.getHeight() / 7))
          break label633;
        if (this.nVW != null)
          this.nVW.xL(this.nWc);
        xO(this.nWb);
      }
      while (true)
      {
        AppMethodBeat.o(42255);
        bool = true;
        break;
        label633: if (this.nWa != null)
          bLo();
      }
    }
  }

  public void setAllShuffleCards(List<View> paramList)
  {
    AppMethodBeat.i(42246);
    this.nVP.clear();
    this.nVP.addAll(paramList);
    this.nVZ = 0;
    this.gCO = null;
    this.nWb = -1;
    this.nWa = null;
    removeAllViews();
    paramList = this.nVP;
    if (paramList.size() > 100)
      this.nWc = 100;
    while (true)
    {
      for (int i = this.nWc - 1; i >= 0; i--)
        addView((View)paramList.get(i));
      this.nWc = paramList.size();
      if (this.nWc == 1)
        ((View)paramList.get(0)).findViewById(2131825501).setVisibility(0);
    }
    addOnLayoutChangeListener(new ShuffleView.1(this));
    AppMethodBeat.o(42246);
  }

  public void setCardListener(ShuffleView.b paramb)
  {
    this.nVW = paramb;
  }

  public void setEnterAnimator(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42259);
    if (this.nVS != null)
    {
      this.nVS.removeAllListeners();
      this.nVS.cancel();
    }
    this.nVS = paramValueAnimator;
    if (this.nVS != null)
      this.nVS.addUpdateListener(new ShuffleView.7(this));
    AppMethodBeat.o(42259);
  }

  public void setEnterAnimatorListener(ShuffleView.a parama)
  {
    this.nVV = parama;
  }

  public void setExitAnimator(ValueAnimator paramValueAnimator)
  {
    AppMethodBeat.i(42258);
    if (this.nVR != null)
    {
      this.nVR.removeAllListeners();
      this.nVR.cancel();
    }
    this.nVR = paramValueAnimator;
    if (this.nVR != null)
      this.nVR.addUpdateListener(new ShuffleView.6(this));
    AppMethodBeat.o(42258);
  }

  public void setExitAnimatorListener(ShuffleView.a parama)
  {
    this.nVU = parama;
  }

  public void setShuffleSetting(ShuffleView.c paramc)
  {
    AppMethodBeat.i(42245);
    this.nVQ = paramc;
    this.lgH = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(paramc.nWs);
    this.nVT = ValueAnimator.ofFloat(new float[] { 0.0F, 1.0F }).setDuration(paramc.nWt);
    AppMethodBeat.o(42245);
  }

  public final float xM(int paramInt)
  {
    float f;
    if ((this.nVQ.nWp == 2) && (this.nWc > 0))
      if (this.nVQ.nWq == 3)
        f = (this.nWc - 1) * 0.5F * this.eX - this.eX * paramInt;
    while (true)
    {
      return f;
      if (this.nVQ.nWq == 4)
        f = this.eX * paramInt - (this.nWc - 1) * 0.5F * this.eX;
      else
        f = 0.0F;
    }
  }

  public final float xN(int paramInt)
  {
    float f;
    if (this.nVQ.nWp == 1)
      if (this.nVQ.nWq == 1)
        f = (this.nWc - 1) * 0.5F * this.eY - this.eY * paramInt;
    while (true)
    {
      return f;
      if (this.nVQ.nWq == 2)
        f = this.eY * paramInt - (this.nWc - 1) * 0.5F * this.eY;
      else
        f = 0.0F;
    }
  }

  final void xO(int paramInt)
  {
    AppMethodBeat.i(42252);
    if ((paramInt >= 0) && (paramInt < this.nWc))
    {
      ab.i("ShuffleView", "select card ".concat(String.valueOf(paramInt)));
      if (this.nVT.isStarted())
        this.nVT.cancel();
      this.nVT.removeAllUpdateListeners();
      this.nVT.removeAllListeners();
      this.gCO = ((View)this.nVP.get(paramInt));
      this.nVZ = paramInt;
      this.nWa = null;
      this.nWb = -1;
      switch (this.nVQ.nWq)
      {
      default:
      case 4:
      }
    }
    while (true)
    {
      this.nVT.start();
      AppMethodBeat.o(42252);
      return;
      if (paramInt > 0)
      {
        int i = this.nWc;
        this.nVT.addUpdateListener(new ShuffleView.9(this, paramInt - 1, i - 1 - paramInt));
      }
      else
      {
        this.nVT.addUpdateListener(new ShuffleView.10(this));
      }
    }
  }

  final void xQ(int paramInt)
  {
    AppMethodBeat.i(42257);
    this.lgH.removeAllUpdateListeners();
    this.lgH.removeAllListeners();
    if (this.nVP.size() < this.nWc)
    {
      this.nWc -= 1;
      if (this.nWc == 1)
        ((View)this.nVP.get(0)).findViewById(2131825501).setVisibility(0);
      bLl();
      this.lgH.addUpdateListener(new ShuffleView.15(this));
      this.lgH.addListener(new ShuffleView.2(this));
      this.lgH.start();
      AppMethodBeat.o(42257);
      return;
    }
    this.nVY = ((View)this.nVP.get(this.nWc - 1));
    W(this.nVY, this.nWc - 1);
    addView(this.nVY, 0);
    if (this.nVS != null)
      switch (this.nVQ.nWr)
      {
      default:
      case 1:
      case 2:
      case 3:
      case 4:
      }
    while (true)
    {
      this.nVY.setVisibility(4);
      this.lgH.addUpdateListener(new ShuffleView.3(this, paramInt));
      this.lgH.addListener(new ShuffleView.4(this));
      break;
      this.nVY.setTranslationY(-ghw.heightPixels);
      continue;
      this.nVY.setTranslationY(ghw.heightPixels);
      continue;
      this.nVY.setTranslationX(-ghw.widthPixels);
      continue;
      this.nVY.setTranslationX(ghw.widthPixels);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.f2f.ui.ShuffleView
 * JD-Core Version:    0.6.2
 */