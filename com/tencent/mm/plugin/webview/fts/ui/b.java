package com.tencent.mm.plugin.webview.fts.ui;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsoluteLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.fts.c.a;
import com.tencent.mm.plugin.webview.fts.c.b.b;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.widget.MMWebView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class b
{
  private MMWebView fow;
  List<b.a> iut;
  public int iuu;
  public float[] iuv;
  View iuw;
  public int iuy;
  public ak mHandler;
  public a uhu;
  b.b uhv;

  @SuppressLint({"ClickableViewAccessibility"})
  public b(MMWebView paramMMWebView, b.b paramb)
  {
    AppMethodBeat.i(5918);
    this.iuu = -1;
    this.iuy = -1;
    this.fow = paramMMWebView;
    this.mHandler = new ak(Looper.getMainLooper());
    this.iut = new LinkedList();
    this.iuw = new View(paramMMWebView.getContext());
    this.uhv = paramb;
    AppMethodBeat.o(5918);
  }

  private List<b.a> b(b.a parama)
  {
    AppMethodBeat.i(5923);
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = this.iut.iterator();
    while (localIterator.hasNext())
    {
      b.a locala = (b.a)localIterator.next();
      if (locala.iuN == parama.id)
        localLinkedList.addAll(b(locala));
    }
    localLinkedList.add(parama);
    AppMethodBeat.o(5923);
    return localLinkedList;
  }

  private void c(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(5927);
    paramView = new b.a(paramView, paramInt1, paramInt2, paramInt3);
    this.iut.add(paramView);
    AppMethodBeat.o(5927);
  }

  private int dj(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(5924);
    Iterator localIterator = this.iut.iterator();
    int i = 0;
    if (localIterator.hasNext())
    {
      b.a locala = (b.a)localIterator.next();
      if ((paramInt1 != locala.iuN) || (paramInt2 < locala.z))
        break label72;
      i++;
    }
    label72: 
    while (true)
    {
      break;
      AppMethodBeat.o(5924);
      return i;
    }
  }

  final ViewGroup IB(int paramInt)
  {
    AppMethodBeat.i(5920);
    Object localObject;
    if (paramInt == 0)
    {
      localObject = this.fow.getTopView();
      if ((localObject instanceof AbsoluteLayout))
        AppMethodBeat.o(5920);
    }
    while (true)
    {
      return localObject;
      AppMethodBeat.o(5920);
      localObject = null;
      continue;
      localObject = IC(paramInt);
      if (localObject == null)
      {
        AppMethodBeat.o(5920);
        localObject = null;
      }
      else
      {
        localObject = (View)((b.a)localObject).iuM.get();
        if ((localObject instanceof ViewGroup))
        {
          localObject = (ViewGroup)localObject;
          AppMethodBeat.o(5920);
        }
        else
        {
          AppMethodBeat.o(5920);
          localObject = null;
        }
      }
    }
  }

  public final b.a IC(int paramInt)
  {
    AppMethodBeat.i(5925);
    Iterator localIterator = this.iut.iterator();
    b.a locala;
    while (localIterator.hasNext())
    {
      locala = (b.a)localIterator.next();
      if (locala.id == paramInt)
        AppMethodBeat.o(5925);
    }
    while (true)
    {
      return locala;
      locala = null;
      AppMethodBeat.o(5925);
    }
  }

  final void a(b.a parama)
  {
    AppMethodBeat.i(5922);
    this.iut.removeAll(b(parama));
    AppMethodBeat.o(5922);
  }

  public final boolean a(int paramInt1, float[] paramArrayOfFloat, int paramInt2)
  {
    AppMethodBeat.i(5921);
    boolean bool;
    if (pB(paramInt1))
    {
      bool = true;
      AppMethodBeat.o(5921);
    }
    while (true)
    {
      return bool;
      b.a locala = IC(paramInt1);
      if (locala == null)
      {
        bool = false;
        AppMethodBeat.o(5921);
      }
      else
      {
        View localView = (View)locala.iuM.get();
        ViewGroup localViewGroup = IB(locala.iuN);
        if (localViewGroup == null)
        {
          bool = false;
          AppMethodBeat.o(5921);
        }
        else
        {
          if ((paramInt2 >= 0) && (paramInt2 != 2147483647))
            if (paramInt2 != 0)
              break label137;
          label137: for (int i = 0; ; i = 8)
          {
            localView.setVisibility(i);
            if ((paramArrayOfFloat != null) && (paramArrayOfFloat.length >= 5))
              break label144;
            bool = true;
            AppMethodBeat.o(5921);
            break;
          }
          label144: float f1 = paramArrayOfFloat[0];
          float f2 = paramArrayOfFloat[1];
          float f3 = paramArrayOfFloat[2];
          float f4 = paramArrayOfFloat[3];
          i = (int)paramArrayOfFloat[4];
          this.iut.remove(locala);
          if (locala.z != i)
          {
            localViewGroup.removeView(localView);
            if (a(localView, paramInt1, locala.iuN, paramArrayOfFloat, paramInt2))
            {
              bool = true;
              AppMethodBeat.o(5921);
            }
            else
            {
              a(locala);
              bool = false;
              AppMethodBeat.o(5921);
            }
          }
          else
          {
            paramArrayOfFloat = localView.getLayoutParams();
            if (f3 != 3.4028235E+38F)
              paramArrayOfFloat.width = ((int)f3);
            if (f4 != 3.4028235E+38F)
              paramArrayOfFloat.height = ((int)f4);
            if (f1 != 3.4028235E+38F)
              localView.setX(f1);
            if (f2 != 3.4028235E+38F)
              localView.setY(f2);
            localView.requestLayout();
            c(localView, paramInt1, locala.iuN, i);
            paramInt1 = localViewGroup.indexOfChild(this.iuw);
            if ((localViewGroup.indexOfChild(localView) == -1) && (paramInt1 != -1))
            {
              localViewGroup.addView(localView, paramInt1);
              localViewGroup.removeView(this.iuw);
            }
            bool = true;
            AppMethodBeat.o(5921);
          }
        }
      }
    }
  }

  final boolean a(View paramView, int paramInt1, int paramInt2, float[] paramArrayOfFloat, int paramInt3)
  {
    int i = 0;
    boolean bool = false;
    AppMethodBeat.i(5919);
    if ((paramView == null) || (paramArrayOfFloat == null) || (paramArrayOfFloat.length < 5))
      AppMethodBeat.o(5919);
    ViewGroup localViewGroup;
    while (true)
    {
      return bool;
      localViewGroup = IB(paramInt2);
      if (localViewGroup == null)
      {
        AppMethodBeat.o(5919);
      }
      else
      {
        if (q(paramInt1) == null)
          break;
        AppMethodBeat.o(5919);
      }
    }
    float f1 = paramArrayOfFloat[0];
    float f2 = paramArrayOfFloat[1];
    float f3 = paramArrayOfFloat[2];
    float f4 = paramArrayOfFloat[3];
    int j = (int)paramArrayOfFloat[4];
    paramArrayOfFloat = new ViewGroup.LayoutParams((int)f3, (int)f4);
    int k = dj(paramInt2, j);
    int m = k;
    if (k < 0)
      m = 0;
    k = m;
    if (m > localViewGroup.getChildCount())
      k = localViewGroup.getChildCount();
    if ((paramInt3 != 2147483647) && (paramInt3 >= 0))
      if (paramInt3 != 0)
        break label233;
    label233: for (paramInt3 = i; ; paramInt3 = 8)
    {
      paramView.setVisibility(paramInt3);
      localViewGroup.addView(paramView, k, paramArrayOfFloat);
      paramView.setX(f1);
      paramView.setY(f2);
      c(paramView, paramInt1, paramInt2, j);
      AppMethodBeat.o(5919);
      bool = true;
      break;
    }
  }

  public final boolean pB(int paramInt)
  {
    if ((this.iuy == paramInt) || (this.iuu == paramInt));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  final boolean pD(int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(5928);
    if (paramInt != this.iuu)
      AppMethodBeat.o(5928);
    while (true)
    {
      return bool;
      if (IC(paramInt) == null)
      {
        AppMethodBeat.o(5928);
      }
      else
      {
        this.uhv.cWA();
        bool = true;
        AppMethodBeat.o(5928);
      }
    }
  }

  public final View q(int paramInt)
  {
    AppMethodBeat.i(5926);
    Object localObject = IC(paramInt);
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(5926);
    }
    while (true)
    {
      return localObject;
      localObject = (View)((b.a)localObject).iuM.get();
      AppMethodBeat.o(5926);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.b
 * JD-Core Version:    0.6.2
 */