package com.tencent.mm.plugin.appbrand.widget.desktop;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.s;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.f;
import android.support.v7.widget.RecyclerView.v;
import android.support.v7.widget.av;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class f extends av
{
  private static TimeInterpolator ahn;
  RecyclerView.a Yq;
  private ArrayList<RecyclerView.v> aho;
  private ArrayList<RecyclerView.v> ahp;
  private ArrayList<f.b> ahq;
  private ArrayList<f.a> ahr;
  ArrayList<ArrayList<RecyclerView.v>> ahs;
  ArrayList<ArrayList<f.b>> aht;
  ArrayList<ArrayList<f.a>> ahu;
  ArrayList<RecyclerView.v> ahv;
  ArrayList<RecyclerView.v> ahw;
  ArrayList<RecyclerView.v> ahx;
  ArrayList<RecyclerView.v> ahy;
  private boolean iYB;

  f()
  {
    AppMethodBeat.i(133915);
    this.iYB = false;
    this.Yq = null;
    this.aho = new ArrayList();
    this.ahp = new ArrayList();
    this.ahq = new ArrayList();
    this.ahr = new ArrayList();
    this.ahs = new ArrayList();
    this.aht = new ArrayList();
    this.ahu = new ArrayList();
    this.ahv = new ArrayList();
    this.ahw = new ArrayList();
    this.ahx = new ArrayList();
    this.ahy = new ArrayList();
    this.aot = 200L;
    this.aow = 200L;
    this.aov = 200L;
    this.aou = 200L;
    AppMethodBeat.o(133915);
  }

  private void a(f.a parama)
  {
    AppMethodBeat.i(133922);
    if (parama.ahL != null)
      a(parama, parama.ahL);
    if (parama.ahM != null)
      a(parama, parama.ahM);
    AppMethodBeat.o(133922);
  }

  private void a(List<f.a> paramList, RecyclerView.v paramv)
  {
    AppMethodBeat.i(133921);
    for (int i = paramList.size() - 1; i >= 0; i--)
    {
      f.a locala = (f.a)paramList.get(i);
      if ((a(locala, paramv)) && (locala.ahL == null) && (locala.ahM == null))
        paramList.remove(locala);
    }
    AppMethodBeat.o(133921);
  }

  private boolean a(f.a parama, RecyclerView.v paramv)
  {
    AppMethodBeat.i(133923);
    boolean bool;
    if (parama.ahM == paramv)
    {
      parama.ahM = null;
      paramv.apJ.setAlpha(1.0F);
      paramv.apJ.setTranslationX(0.0F);
      paramv.apJ.setTranslationY(0.0F);
      m(paramv);
      bool = true;
      AppMethodBeat.o(133923);
    }
    while (true)
    {
      return bool;
      if (parama.ahL == paramv)
      {
        parama.ahL = null;
        break;
      }
      bool = false;
      AppMethodBeat.o(133923);
    }
  }

  private void e(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133925);
    if (ahn == null)
      ahn = new ValueAnimator().getInterpolator();
    paramv.apJ.animate().setInterpolator(ahn);
    d(paramv);
    AppMethodBeat.o(133925);
  }

  private static void o(List<RecyclerView.v> paramList)
  {
    AppMethodBeat.i(133929);
    for (int i = paramList.size() - 1; i >= 0; i--)
      ((RecyclerView.v)paramList.get(i)).apJ.animate().cancel();
    AppMethodBeat.o(133929);
  }

  public final boolean a(RecyclerView.v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(133919);
    View localView = paramv.apJ;
    paramInt1 += (int)paramv.apJ.getTranslationX();
    int i = paramInt2 + (int)paramv.apJ.getTranslationY();
    e(paramv);
    paramInt2 = paramInt3 - paramInt1;
    int j = paramInt4 - i;
    boolean bool;
    if ((paramInt2 == 0) && (j == 0))
    {
      C(paramv);
      bool = false;
      AppMethodBeat.o(133919);
    }
    while (true)
    {
      return bool;
      if (paramInt2 != 0)
        localView.setTranslationX(-paramInt2);
      if (j != 0)
        localView.setTranslationY(-j);
      this.ahq.add(new f.b(paramv, paramInt1, i, paramInt3, paramInt4));
      bool = true;
      AppMethodBeat.o(133919);
    }
  }

  public final boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(133920);
    ab.i("MicroMsg.RecentAppBrandItemAnimator", "alvinluo animateChange lastPos: %d", new Object[] { Integer.valueOf(paramv1.kj()) });
    boolean bool;
    if (paramv1 == paramv2)
    {
      bool = a(paramv1, paramInt1, paramInt2, paramInt3, paramInt4);
      AppMethodBeat.o(133920);
    }
    while (true)
    {
      return bool;
      float f1 = paramv1.apJ.getTranslationX();
      float f2 = paramv1.apJ.getTranslationY();
      float f3 = paramv1.apJ.getAlpha();
      e(paramv1);
      int i = (int)(paramInt3 - paramInt1 - f1);
      int j = (int)(paramInt4 - paramInt2 - f2);
      paramv1.apJ.setTranslationX(f1);
      paramv1.apJ.setTranslationY(f2);
      paramv1.apJ.setAlpha(f3);
      if (paramv2 != null)
      {
        e(paramv2);
        paramv2.apJ.setTranslationX(-i);
        paramv2.apJ.setTranslationY(-j);
        paramv2.apJ.setAlpha(0.0F);
      }
      paramv1 = new f.a(paramv1, paramv2, paramInt1, paramInt2, paramInt3, paramInt4);
      this.ahr.add(paramv1);
      AppMethodBeat.o(133920);
      bool = true;
    }
  }

  public final boolean a(RecyclerView.v paramv, List<Object> paramList)
  {
    AppMethodBeat.i(133930);
    boolean bool;
    if ((!paramList.isEmpty()) || (super.a(paramv, paramList)))
    {
      bool = true;
      AppMethodBeat.o(133930);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133930);
    }
  }

  public final boolean b(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133917);
    ab.i("MicroMsg.RecentAppBrandItemAnimator", "alvinluo animateRemove %d", new Object[] { Integer.valueOf(paramv.kj()) });
    e(paramv);
    this.aho.add(paramv);
    AppMethodBeat.o(133917);
    return true;
  }

  public final boolean c(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133918);
    e(paramv);
    paramv.apJ.setAlpha(0.0F);
    paramv.apJ.setScaleX(0.75F);
    paramv.apJ.setScaleY(0.75F);
    this.ahp.add(paramv);
    AppMethodBeat.o(133918);
    return true;
  }

  public final void d(RecyclerView.v paramv)
  {
    AppMethodBeat.i(133924);
    View localView = paramv.apJ;
    localView.animate().cancel();
    for (int i = this.ahq.size() - 1; i >= 0; i--)
      if (((f.b)this.ahq.get(i)).ahR == paramv)
      {
        localView.setTranslationY(0.0F);
        localView.setTranslationX(0.0F);
        C(paramv);
        this.ahq.remove(i);
      }
    a(this.ahr, paramv);
    if (this.aho.remove(paramv))
    {
      localView.setAlpha(1.0F);
      B(paramv);
    }
    if (this.ahp.remove(paramv))
    {
      localView.setAlpha(1.0F);
      m(paramv);
    }
    ArrayList localArrayList;
    for (i = this.ahu.size() - 1; i >= 0; i--)
    {
      localArrayList = (ArrayList)this.ahu.get(i);
      a(localArrayList, paramv);
      if (localArrayList.isEmpty())
        this.ahu.remove(i);
    }
    i = this.aht.size() - 1;
    if (i >= 0)
    {
      localArrayList = (ArrayList)this.aht.get(i);
      for (int j = localArrayList.size() - 1; ; j--)
      {
        if (j >= 0)
        {
          if (((f.b)localArrayList.get(j)).ahR != paramv)
            continue;
          localView.setTranslationY(0.0F);
          localView.setTranslationX(0.0F);
          C(paramv);
          localArrayList.remove(j);
          if (localArrayList.isEmpty())
            this.aht.remove(i);
        }
        i--;
        break;
      }
    }
    for (i = this.ahs.size() - 1; i >= 0; i--)
    {
      localArrayList = (ArrayList)this.ahs.get(i);
      if (localArrayList.remove(paramv))
      {
        localView.setAlpha(1.0F);
        m(paramv);
        if (localArrayList.isEmpty())
          this.ahs.remove(i);
      }
    }
    this.ahx.remove(paramv);
    this.ahv.remove(paramv);
    this.ahy.remove(paramv);
    this.ahw.remove(paramv);
    hY();
    AppMethodBeat.o(133924);
  }

  public final void hX()
  {
    AppMethodBeat.i(133916);
    int i;
    int j;
    label30: int k;
    label42: int m;
    if (!this.aho.isEmpty())
    {
      i = 1;
      if (this.ahq.isEmpty())
        break label84;
      j = 1;
      if (this.ahr.isEmpty())
        break label89;
      k = 1;
      if (this.ahp.isEmpty())
        break label94;
      m = 1;
      label55: if ((i != 0) || (j != 0) || (m != 0) || (k != 0))
        break label100;
      AppMethodBeat.o(133916);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label84: j = 0;
      break label30;
      label89: k = 0;
      break label42;
      label94: m = 0;
      break label55;
      label100: Object localObject1 = this.aho.iterator();
      Object localObject2;
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (RecyclerView.v)((Iterator)localObject1).next();
        View localView = ((RecyclerView.v)localObject2).apJ;
        ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
        this.ahx.add(localObject2);
        localViewPropertyAnimator.setDuration(this.aou).alpha(0.0F).setListener(new f.4(this, (RecyclerView.v)localObject2, localViewPropertyAnimator, localView)).start();
      }
      this.aho.clear();
      label278: label358: long l1;
      label433: long l2;
      if (j != 0)
      {
        localObject2 = new ArrayList();
        ((ArrayList)localObject2).addAll(this.ahq);
        this.aht.add(localObject2);
        this.ahq.clear();
        localObject1 = new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(133902);
            Iterator localIterator = this.ahz.iterator();
            while (localIterator.hasNext())
            {
              Object localObject = (f.b)localIterator.next();
              f localf = f.this;
              RecyclerView.v localv = ((f.b)localObject).ahR;
              int i = ((f.b)localObject).ahN;
              int j = ((f.b)localObject).ahO;
              int k = ((f.b)localObject).ahP;
              int m = ((f.b)localObject).ahQ;
              localObject = localv.apJ;
              i = k - i;
              j = m - j;
              if (i != 0)
                ((View)localObject).animate().translationX(0.0F);
              if (j != 0)
                ((View)localObject).animate().translationY(0.0F);
              ViewPropertyAnimator localViewPropertyAnimator = ((View)localObject).animate();
              localf.ahw.add(localv);
              localViewPropertyAnimator.setDuration(localf.aov).setListener(new f.6(localf, localv, i, (View)localObject, j, localViewPropertyAnimator)).start();
            }
            this.ahz.clear();
            f.this.aht.remove(this.ahz);
            AppMethodBeat.o(133902);
          }
        };
        if (i != 0)
          s.a(((f.b)((ArrayList)localObject2).get(0)).ahR.apJ, (Runnable)localObject1, this.aou);
      }
      else
      {
        if (k != 0)
        {
          localObject2 = new ArrayList();
          ((ArrayList)localObject2).addAll(this.ahr);
          this.ahu.add(localObject2);
          this.ahr.clear();
          localObject1 = new f.2(this, (ArrayList)localObject2);
          if (i == 0)
            break label503;
          s.a(((f.a)((ArrayList)localObject2).get(0)).ahL.apJ, (Runnable)localObject1, this.aou);
        }
        if (m == 0)
          break label538;
        localObject2 = new ArrayList();
        ((ArrayList)localObject2).addAll(this.ahp);
        this.ahs.add(localObject2);
        this.ahp.clear();
        localObject1 = new Runnable()
        {
          public final void run()
          {
            AppMethodBeat.i(133904);
            Iterator localIterator = this.ahC.iterator();
            while (localIterator.hasNext())
            {
              RecyclerView.v localv = (RecyclerView.v)localIterator.next();
              f localf = f.this;
              View localView = localv.apJ;
              ViewPropertyAnimator localViewPropertyAnimator = localView.animate();
              localf.ahv.add(localv);
              localView.setAlpha(1.0F);
              localViewPropertyAnimator.scaleX(1.0F).scaleY(1.0F).setDuration(localf.aot).setListener(new f.5(localf, localv, localView, localViewPropertyAnimator)).start();
            }
            this.ahC.clear();
            f.this.ahs.remove(this.ahC);
            AppMethodBeat.o(133904);
          }
        };
        if ((i == 0) && (j == 0) && (k == 0))
          break label531;
        if (i == 0)
          break label513;
        l1 = this.aou;
        if (j == 0)
          break label519;
        l2 = this.aov;
        label443: if (k == 0)
          break label525;
      }
      label513: label519: label525: for (long l3 = this.aow; ; l3 = 0L)
      {
        l2 = Math.max(l2, l3);
        s.a(((RecyclerView.v)((ArrayList)localObject2).get(0)).apJ, (Runnable)localObject1, l1 + l2);
        AppMethodBeat.o(133916);
        break;
        ((Runnable)localObject1).run();
        break label278;
        label503: ((Runnable)localObject1).run();
        break label358;
        l1 = 0L;
        break label433;
        l2 = 0L;
        break label443;
      }
      label531: ((Runnable)localObject1).run();
      label538: AppMethodBeat.o(133916);
    }
  }

  final void hY()
  {
    AppMethodBeat.i(133927);
    if (!isRunning())
      jS();
    AppMethodBeat.o(133927);
  }

  public final void hZ()
  {
    AppMethodBeat.i(133928);
    Object localObject1;
    Object localObject2;
    for (int i = this.ahq.size() - 1; i >= 0; i--)
    {
      localObject1 = (f.b)this.ahq.get(i);
      localObject2 = ((f.b)localObject1).ahR.apJ;
      ((View)localObject2).setTranslationY(0.0F);
      ((View)localObject2).setTranslationX(0.0F);
      C(((f.b)localObject1).ahR);
      this.ahq.remove(i);
    }
    for (i = this.aho.size() - 1; i >= 0; i--)
    {
      B((RecyclerView.v)this.aho.get(i));
      this.aho.remove(i);
    }
    for (i = this.ahp.size() - 1; i >= 0; i--)
    {
      localObject2 = (RecyclerView.v)this.ahp.get(i);
      ((RecyclerView.v)localObject2).apJ.setAlpha(1.0F);
      m((RecyclerView.v)localObject2);
      this.ahp.remove(i);
    }
    for (i = this.ahr.size() - 1; i >= 0; i--)
      a((f.a)this.ahr.get(i));
    this.ahr.clear();
    if (!isRunning())
      AppMethodBeat.o(133928);
    while (true)
    {
      return;
      int j;
      for (i = this.aht.size() - 1; i >= 0; i--)
      {
        ArrayList localArrayList = (ArrayList)this.aht.get(i);
        for (j = localArrayList.size() - 1; j >= 0; j--)
        {
          localObject1 = (f.b)localArrayList.get(j);
          localObject2 = ((f.b)localObject1).ahR.apJ;
          ((View)localObject2).setTranslationY(0.0F);
          ((View)localObject2).setTranslationX(0.0F);
          C(((f.b)localObject1).ahR);
          localArrayList.remove(j);
          if (localArrayList.isEmpty())
            this.aht.remove(localArrayList);
        }
      }
      for (i = this.ahs.size() - 1; i >= 0; i--)
      {
        localObject2 = (ArrayList)this.ahs.get(i);
        for (j = ((ArrayList)localObject2).size() - 1; j >= 0; j--)
        {
          localObject1 = (RecyclerView.v)((ArrayList)localObject2).get(j);
          ((RecyclerView.v)localObject1).apJ.setAlpha(1.0F);
          m((RecyclerView.v)localObject1);
          ((ArrayList)localObject2).remove(j);
          if (((ArrayList)localObject2).isEmpty())
            this.ahs.remove(localObject2);
        }
      }
      for (i = this.ahu.size() - 1; i >= 0; i--)
      {
        localObject2 = (ArrayList)this.ahu.get(i);
        for (j = ((ArrayList)localObject2).size() - 1; j >= 0; j--)
        {
          a((f.a)((ArrayList)localObject2).get(j));
          if (((ArrayList)localObject2).isEmpty())
            this.ahu.remove(localObject2);
        }
      }
      o(this.ahx);
      o(this.ahw);
      o(this.ahv);
      o(this.ahy);
      jS();
      AppMethodBeat.o(133928);
    }
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(133926);
    boolean bool;
    if ((!this.ahp.isEmpty()) || (!this.ahr.isEmpty()) || (!this.ahq.isEmpty()) || (!this.aho.isEmpty()) || (!this.ahw.isEmpty()) || (!this.ahx.isEmpty()) || (!this.ahv.isEmpty()) || (!this.ahy.isEmpty()) || (!this.aht.isEmpty()) || (!this.ahs.isEmpty()) || (!this.ahu.isEmpty()))
    {
      bool = true;
      AppMethodBeat.o(133926);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(133926);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.f
 * JD-Core Version:    0.6.2
 */