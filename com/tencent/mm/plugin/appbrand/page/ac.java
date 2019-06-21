package com.tencent.mm.plugin.appbrand.page;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.v;
import com.tencent.mm.model.v.b;
import com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView;
import com.tencent.mm.plugin.appbrand.jsapi.container.WrapperNativeContainerView;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.n;
import com.tencent.mm.plugin.appbrand.jsapi.coverview.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bj;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ac
{
  c isR;
  private AppBrandPageFullScreenView iuA;
  public ViewGroup ius;
  List<ac.b> iut;
  int iuu;
  float[] iuv;
  View iuw;
  an iux;
  int iuy;
  private ak iuz;
  private com.tencent.mm.sdk.platformtools.ak mHandler;

  public ac(ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(91097);
    this.iuu = -1;
    this.iuy = -1;
    this.ius = paramViewGroup;
    this.mHandler = new com.tencent.mm.sdk.platformtools.ak(Looper.getMainLooper());
    this.iut = new LinkedList();
    this.iuw = new View(paramViewGroup.getContext());
    AppMethodBeat.o(91097);
  }

  private void a(ac.b paramb)
  {
    AppMethodBeat.i(91108);
    this.iut.removeAll(b(paramb));
    AppMethodBeat.o(91108);
  }

  private ViewGroup aKf()
  {
    AppMethodBeat.i(138261);
    if (this.iuA == null)
    {
      this.iuA = new AppBrandPageFullScreenView(this.ius.getContext());
      if (this.iuz != null)
        this.iuz.a(this.iuA);
    }
    AppBrandPageFullScreenView localAppBrandPageFullScreenView = this.iuA;
    AppMethodBeat.o(138261);
    return localAppBrandPageFullScreenView;
  }

  private List<ac.b> b(ac.b paramb)
  {
    AppMethodBeat.i(91109);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.iut.iterator();
    while (localIterator.hasNext())
    {
      ac.b localb = (ac.b)localIterator.next();
      if (localb.iuN == paramb.id)
        localLinkedList.addAll(b(localb));
    }
    localLinkedList.add(paramb);
    AppMethodBeat.o(91109);
    return localLinkedList;
  }

  private int dj(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(91110);
    Iterator localIterator = this.iut.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      ac.b localb = (ac.b)localIterator.next();
      if ((paramInt1 != localb.iuN) || (paramInt2 < localb.z))
        break label70;
      i++;
    }
    label70: 
    while (true)
    {
      break;
      AppMethodBeat.o(91110);
      return i;
    }
  }

  final ViewGroup I(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(91102);
    Object localObject;
    if (paramBoolean)
    {
      localObject = aKf();
      AppMethodBeat.o(91102);
    }
    while (true)
    {
      return localObject;
      if (paramInt == 0)
      {
        localObject = this.ius;
        AppMethodBeat.o(91102);
      }
      else
      {
        localObject = py(paramInt);
        if (localObject == null)
        {
          AppMethodBeat.o(91102);
          localObject = null;
        }
        else
        {
          localObject = (View)((ac.b)localObject).iuM.get();
          if (((localObject instanceof WrapperNativeContainerView)) && ((localObject instanceof o)) && ((localObject instanceof ViewGroup)))
          {
            localObject = (ViewGroup)((WrapperNativeContainerView)localObject).ah(AppBrandNativeContainerView.class);
            AppMethodBeat.o(91102);
          }
          else if (((localObject instanceof o)) && ((localObject instanceof ViewGroup)))
          {
            localObject = (ViewGroup)localObject;
            AppMethodBeat.o(91102);
          }
          else
          {
            AppMethodBeat.o(91102);
            localObject = null;
          }
        }
      }
    }
  }

  public final v.b J(int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(91115);
    v.b localb = v.Zp().y(hashCode() + "#" + paramInt, paramBoolean);
    AppMethodBeat.o(91115);
    return localb;
  }

  public final void a(ak paramak)
  {
    AppMethodBeat.i(138260);
    ab.i("MicroMsg.AppBrandWebViewCustomViewContainer", "setFullScreenViewObtainer fullScreenViewAttacher:%b", new Object[] { Boolean.TRUE });
    this.iuz = paramak;
    if (this.iuA != null)
      this.iuz.a(this.iuA);
    AppMethodBeat.o(138260);
  }

  public final boolean a(int paramInt1, an paraman, int paramInt2)
  {
    AppMethodBeat.i(91116);
    paraman = new ac.6(this, Boolean.FALSE, paramInt1, paraman, paramInt2);
    boolean bool;
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      bool = ((Boolean)paraman.b(null)).booleanValue();
      AppMethodBeat.o(91116);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paraman.b(this.mHandler)).booleanValue();
      AppMethodBeat.o(91116);
    }
  }

  public final boolean a(int paramInt1, float[] paramArrayOfFloat, int paramInt2, Boolean paramBoolean1, Boolean paramBoolean2)
  {
    AppMethodBeat.i(91106);
    paramArrayOfFloat = new ac.5(this, Boolean.FALSE, paramInt1, paramArrayOfFloat, paramInt2, paramBoolean1, paramBoolean2);
    boolean bool;
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      bool = ((Boolean)paramArrayOfFloat.b(null)).booleanValue();
      AppMethodBeat.o(91106);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)paramArrayOfFloat.b(this.mHandler)).booleanValue();
      AppMethodBeat.o(91106);
    }
  }

  public final boolean a(View paramView, int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(91100);
    paramView = new ac.2(this, Boolean.FALSE, paramView, paramInt1, paramInt2, paramArrayOfFloat, paramInt3, paramBoolean1, paramBoolean2);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      paramBoolean1 = ((Boolean)paramView.b(null)).booleanValue();
      AppMethodBeat.o(91100);
    }
    while (true)
    {
      return paramBoolean1;
      paramBoolean1 = ((Boolean)paramView.b(this.mHandler)).booleanValue();
      AppMethodBeat.o(91100);
    }
  }

  final boolean b(int paramInt1, float[] paramArrayOfFloat, int paramInt2, Boolean paramBoolean1, Boolean paramBoolean2)
  {
    AppMethodBeat.i(91107);
    boolean bool1;
    if (pB(paramInt1))
    {
      bool1 = true;
      AppMethodBeat.o(91107);
    }
    ac.b localb;
    View localView;
    label115: float f1;
    label155: label161: float f2;
    float f3;
    float f4;
    boolean bool2;
    while (true)
    {
      return bool1;
      localb = py(paramInt1);
      if (localb == null)
      {
        bool1 = false;
        AppMethodBeat.o(91107);
      }
      else
      {
        localView = (View)localb.iuM.get();
        if (paramBoolean2 != null);
        for (bool1 = paramBoolean2.booleanValue(); ; bool1 = localb.hfz)
        {
          paramBoolean2 = I(localb.iuN, bool1);
          if (paramBoolean2 != null)
            break label115;
          bool1 = false;
          AppMethodBeat.o(91107);
          break;
        }
        if (paramInt2 >= 0)
          if (paramInt2 != 0)
            break label155;
        for (int i = 0; ; i = 4)
        {
          localView.setVisibility(i);
          if ((paramArrayOfFloat != null) && (paramArrayOfFloat.length >= 5))
            break label161;
          bool1 = true;
          AppMethodBeat.o(91107);
          break;
        }
        f1 = paramArrayOfFloat[0];
        f2 = paramArrayOfFloat[1];
        f3 = paramArrayOfFloat[2];
        f4 = paramArrayOfFloat[3];
        i = (int)paramArrayOfFloat[4];
        if (paramBoolean1 != null);
        for (bool2 = paramBoolean1.booleanValue(); ; bool2 = localb.iuO)
        {
          if ((localb.z == i) && (localb.hfz == bool1))
            break label357;
          this.iut.remove(localb);
          paramBoolean2.removeView(localView);
          if (localView.getParent() != null)
          {
            if ((localb.iuP != null) && ((localView.getParent() instanceof ao)))
              ((ao)localView.getParent()).b(localb.iuP);
            ((ViewGroup)localView.getParent()).removeView(localView);
          }
          if (!b(localView, paramInt1, localb.iuN, paramArrayOfFloat, paramInt2, bool2, bool1))
            break label339;
          bool1 = true;
          AppMethodBeat.o(91107);
          break;
        }
        label339: a(localb);
        bool1 = false;
        AppMethodBeat.o(91107);
      }
    }
    label357: paramBoolean1 = localb.iuP;
    if ((localb.iuN == 0) && ((paramBoolean2 instanceof ao)) && (bool2 != localb.iuO))
      if (bool2)
      {
        paramArrayOfFloat = paramBoolean1;
        if (paramBoolean1 == null)
        {
          paramArrayOfFloat = new ac.a((byte)0);
          paramArrayOfFloat.view = localView;
          localb.iuP = paramArrayOfFloat;
        }
        ((ao)paramBoolean2).a(paramArrayOfFloat);
        label435: if (paramArrayOfFloat == null)
          break label608;
        paramArrayOfFloat.x = f1;
        paramArrayOfFloat.y = f2;
        paramArrayOfFloat.iuK = this.ius.getScrollX();
        paramArrayOfFloat.iuL = this.ius.getScrollY();
        f1 = paramArrayOfFloat.iuK + f1;
        f2 = paramArrayOfFloat.iuL + f2;
      }
    label608: 
    while (true)
    {
      paramArrayOfFloat = localView.getLayoutParams();
      paramArrayOfFloat.width = ((int)f3);
      paramArrayOfFloat.height = ((int)f4);
      localView.setX(f1);
      localView.setY(f2);
      localView.requestLayout();
      paramInt1 = paramBoolean2.indexOfChild(this.iuw);
      if ((paramBoolean2.indexOfChild(localView) == -1) && (paramInt1 != -1))
      {
        paramBoolean2.addView(localView, paramInt1);
        paramBoolean2.removeView(this.iuw);
      }
      bool1 = true;
      AppMethodBeat.o(91107);
      break;
      ((ao)paramBoolean2).b(localb.iuP);
      paramArrayOfFloat = paramBoolean1;
      break label435;
    }
  }

  final boolean b(View paramView, int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(91101);
    if ((paramView == null) || (paramArrayOfFloat == null) || (paramArrayOfFloat.length < 5))
    {
      paramBoolean1 = false;
      AppMethodBeat.o(91101);
    }
    ViewGroup localViewGroup;
    while (true)
    {
      return paramBoolean1;
      localViewGroup = I(paramInt2, paramBoolean2);
      if (localViewGroup == null)
      {
        paramBoolean1 = false;
        AppMethodBeat.o(91101);
      }
      else
      {
        if (q(paramInt1) == null)
          break;
        paramBoolean1 = false;
        AppMethodBeat.o(91101);
      }
    }
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    int i = (int)paramArrayOfFloat[4];
    paramArrayOfFloat = new ViewGroup.LayoutParams((int)f3, (int)f4);
    int j = dj(paramInt2, i);
    if (j < 0)
      j = 0;
    while (true)
    {
      int k;
      if ((localViewGroup instanceof n))
      {
        k = ((n)localViewGroup).getTargetViewChildCount();
        label163: int m = j;
        if (j > k)
          m = k;
        if (paramInt3 >= 0)
        {
          if (paramInt3 != 0)
            break label387;
          paramInt3 = 0;
          label191: paramView.setVisibility(paramInt3);
        }
        localViewGroup.addView(paramView, m, paramArrayOfFloat);
        paramArrayOfFloat = new ac.b(paramView, paramInt1, paramInt2, i, paramBoolean1, paramBoolean2);
        this.iut.add(paramArrayOfFloat);
        if ((paramInt2 != 0) || (!(localViewGroup instanceof ao)) || (!paramBoolean1))
          break label393;
        ac.a locala = new ac.a((byte)0);
        locala.view = paramView;
        locala.x = f1;
        locala.y = f2;
        locala.iuK = this.ius.getScrollX();
        locala.iuL = this.ius.getScrollY();
        f1 += locala.iuK;
        f4 = locala.iuL;
        ((ao)localViewGroup).a(locala);
        paramArrayOfFloat.iuP = locala;
        f2 = f4 + f2;
      }
      label387: label393: 
      while (true)
      {
        paramView.setX(f1);
        paramView.setY(f2);
        paramBoolean1 = true;
        AppMethodBeat.o(91101);
        break;
        k = localViewGroup.getChildCount();
        break label163;
        paramInt3 = 4;
        break label191;
      }
    }
  }

  public final v.b pA(int paramInt)
  {
    AppMethodBeat.i(91114);
    v.b localb = v.Zp().nV(hashCode() + "#" + paramInt);
    AppMethodBeat.o(91114);
    return localb;
  }

  public final boolean pB(int paramInt)
  {
    if ((this.iuy == paramInt) || (this.iuu == paramInt));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean pC(int paramInt)
  {
    AppMethodBeat.i(91117);
    ac.7 local7 = new ac.7(this, Boolean.FALSE, paramInt);
    boolean bool;
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      bool = ((Boolean)local7.b(null)).booleanValue();
      AppMethodBeat.o(91117);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)local7.b(this.mHandler)).booleanValue();
      AppMethodBeat.o(91117);
    }
  }

  final boolean pD(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(91118);
    if (paramInt != this.iuu)
      AppMethodBeat.o(91118);
    while (true)
    {
      return bool;
      if (py(paramInt) == null)
      {
        AppMethodBeat.o(91118);
      }
      else
      {
        this.isR.aIZ();
        bool = true;
        AppMethodBeat.o(91118);
      }
    }
  }

  public final boolean pv(int paramInt)
  {
    AppMethodBeat.i(91103);
    ac.3 local3 = new ac.3(this, Boolean.FALSE, paramInt);
    boolean bool;
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
    {
      bool = ((Boolean)local3.b(null)).booleanValue();
      AppMethodBeat.o(91103);
    }
    while (true)
    {
      return bool;
      bool = ((Boolean)local3.b(this.mHandler)).booleanValue();
      AppMethodBeat.o(91103);
    }
  }

  final boolean pw(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(91104);
    ac.b localb = py(paramInt);
    if (localb == null)
      AppMethodBeat.o(91104);
    while (true)
    {
      return bool;
      pD(paramInt);
      a(localb);
      ViewGroup localViewGroup = I(localb.iuN, localb.hfz);
      if (localViewGroup != null)
      {
        this.iut.remove(localb);
        localViewGroup.removeView((View)localb.iuM.get());
        if ((localb.iuN == 0) && ((localViewGroup instanceof ao)) && (localb.iuO))
          ((ao)localViewGroup).b(localb.iuP);
        bool = true;
        AppMethodBeat.o(91104);
      }
      else
      {
        AppMethodBeat.o(91104);
      }
    }
  }

  public final ac.b py(int paramInt)
  {
    AppMethodBeat.i(91111);
    Iterator localIterator = this.iut.iterator();
    ac.b localb;
    while (localIterator.hasNext())
    {
      localb = (ac.b)localIterator.next();
      if (localb.id == paramInt)
        AppMethodBeat.o(91111);
    }
    while (true)
    {
      return localb;
      localb = null;
      AppMethodBeat.o(91111);
    }
  }

  public final boolean pz(int paramInt)
  {
    AppMethodBeat.i(91112);
    boolean bool;
    if (py(paramInt) != null)
    {
      bool = true;
      AppMethodBeat.o(91112);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91112);
    }
  }

  public final View q(int paramInt)
  {
    AppMethodBeat.i(91113);
    Object localObject = py(paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(91113);
    }
    while (true)
    {
      return localObject;
      localObject = (View)((ac.b)localObject).iuM.get();
      AppMethodBeat.o(91113);
    }
  }

  public final void removeAll()
  {
    AppMethodBeat.i(91105);
    ac.4 local4 = new ac.4(this, Boolean.FALSE);
    if (Thread.currentThread() == Looper.getMainLooper().getThread())
      local4.b(null);
    local4.b(this.mHandler);
    AppMethodBeat.o(91105);
  }

  public final void setFullscreenImpl(c paramc)
  {
    AppMethodBeat.i(91098);
    this.isR = paramc;
    this.isR.a(new ac.1(this));
    AppMethodBeat.o(91098);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.ac
 * JD-Core Version:    0.6.2
 */