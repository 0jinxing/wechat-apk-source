package android.support.v7.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.support.v4.view.s;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class y extends av
{
  private static TimeInterpolator ahn;
  private ArrayList<RecyclerView.v> aho = new ArrayList();
  private ArrayList<RecyclerView.v> ahp = new ArrayList();
  private ArrayList<y.b> ahq = new ArrayList();
  private ArrayList<a> ahr = new ArrayList();
  ArrayList<ArrayList<RecyclerView.v>> ahs = new ArrayList();
  ArrayList<ArrayList<y.b>> aht = new ArrayList();
  ArrayList<ArrayList<a>> ahu = new ArrayList();
  ArrayList<RecyclerView.v> ahv = new ArrayList();
  ArrayList<RecyclerView.v> ahw = new ArrayList();
  ArrayList<RecyclerView.v> ahx = new ArrayList();
  ArrayList<RecyclerView.v> ahy = new ArrayList();

  private void a(a parama)
  {
    if (parama.ahL != null)
      a(parama, parama.ahL);
    if (parama.ahM != null)
      a(parama, parama.ahM);
  }

  private void a(List<a> paramList, RecyclerView.v paramv)
  {
    for (int i = paramList.size() - 1; i >= 0; i--)
    {
      a locala = (a)paramList.get(i);
      if ((a(locala, paramv)) && (locala.ahL == null) && (locala.ahM == null))
        paramList.remove(locala);
    }
  }

  private boolean a(a parama, RecyclerView.v paramv)
  {
    if (parama.ahM == paramv)
    {
      parama.ahM = null;
      paramv.apJ.setAlpha(1.0F);
      paramv.apJ.setTranslationX(0.0F);
      paramv.apJ.setTranslationY(0.0F);
      m(paramv);
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      if (parama.ahL == paramv)
      {
        parama.ahL = null;
        break;
      }
    }
  }

  private void e(RecyclerView.v paramv)
  {
    if (ahn == null)
      ahn = new ValueAnimator().getInterpolator();
    paramv.apJ.animate().setInterpolator(ahn);
    d(paramv);
  }

  private static void o(List<RecyclerView.v> paramList)
  {
    for (int i = paramList.size() - 1; i >= 0; i--)
      ((RecyclerView.v)paramList.get(i)).apJ.animate().cancel();
  }

  public boolean a(RecyclerView.v paramv, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = paramv.apJ;
    paramInt1 += (int)paramv.apJ.getTranslationX();
    paramInt2 += (int)paramv.apJ.getTranslationY();
    e(paramv);
    int i = paramInt3 - paramInt1;
    int j = paramInt4 - paramInt2;
    if ((i == 0) && (j == 0))
      C(paramv);
    for (boolean bool = false; ; bool = true)
    {
      return bool;
      if (i != 0)
        localView.setTranslationX(-i);
      if (j != 0)
        localView.setTranslationY(-j);
      this.ahq.add(new y.b(paramv, paramInt1, paramInt2, paramInt3, paramInt4));
    }
  }

  public boolean a(RecyclerView.v paramv1, RecyclerView.v paramv2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramv1 == paramv2);
    for (boolean bool = a(paramv1, paramInt1, paramInt2, paramInt3, paramInt4); ; bool = true)
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
      this.ahr.add(new a(paramv1, paramv2, paramInt1, paramInt2, paramInt3, paramInt4));
    }
  }

  public boolean a(RecyclerView.v paramv, List<Object> paramList)
  {
    if ((!paramList.isEmpty()) || (super.a(paramv, paramList)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public boolean b(RecyclerView.v paramv)
  {
    e(paramv);
    this.aho.add(paramv);
    return true;
  }

  public boolean c(RecyclerView.v paramv)
  {
    e(paramv);
    paramv.apJ.setAlpha(0.0F);
    this.ahp.add(paramv);
    return true;
  }

  public void d(RecyclerView.v paramv)
  {
    View localView = paramv.apJ;
    localView.animate().cancel();
    for (int i = this.ahq.size() - 1; i >= 0; i--)
      if (((y.b)this.ahq.get(i)).ahR == paramv)
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
          if (((y.b)localArrayList.get(j)).ahR != paramv)
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
  }

  public void hX()
  {
    int i;
    int j;
    label24: int k;
    label36: int m;
    if (!this.aho.isEmpty())
    {
      i = 1;
      if (this.ahq.isEmpty())
        break label72;
      j = 1;
      if (this.ahr.isEmpty())
        break label77;
      k = 1;
      if (this.ahp.isEmpty())
        break label82;
      m = 1;
      label49: if ((i != 0) || (j != 0) || (m != 0) || (k != 0))
        break label88;
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label72: j = 0;
      break label24;
      label77: k = 0;
      break label36;
      label82: m = 0;
      break label49;
      label88: Iterator localIterator = this.aho.iterator();
      Object localObject1;
      Object localObject2;
      while (localIterator.hasNext())
      {
        RecyclerView.v localv = (RecyclerView.v)localIterator.next();
        localObject1 = localv.apJ;
        localObject2 = ((View)localObject1).animate();
        this.ahx.add(localv);
        ((ViewPropertyAnimator)localObject2).setDuration(this.aou).alpha(0.0F).setListener(new y.4(this, localv, (ViewPropertyAnimator)localObject2, (View)localObject1)).start();
      }
      this.aho.clear();
      label266: label346: long l1;
      label421: long l2;
      if (j != 0)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.ahq);
        this.aht.add(localObject1);
        this.ahq.clear();
        localObject2 = new y.1(this, (ArrayList)localObject1);
        if (i != 0)
          s.a(((y.b)((ArrayList)localObject1).get(0)).ahR.apJ, (Runnable)localObject2, this.aou);
      }
      else
      {
        if (k != 0)
        {
          localObject1 = new ArrayList();
          ((ArrayList)localObject1).addAll(this.ahr);
          this.ahu.add(localObject1);
          this.ahr.clear();
          localObject2 = new y.2(this, (ArrayList)localObject1);
          if (i == 0)
            break label485;
          s.a(((a)((ArrayList)localObject1).get(0)).ahL.apJ, (Runnable)localObject2, this.aou);
        }
        if (m == 0)
          break label493;
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.ahp);
        this.ahs.add(localObject1);
        this.ahp.clear();
        localObject2 = new y.3(this, (ArrayList)localObject1);
        if ((i == 0) && (j == 0) && (k == 0))
          break label513;
        if (i == 0)
          break label495;
        l1 = this.aou;
        if (j == 0)
          break label501;
        l2 = this.aov;
        label431: if (k == 0)
          break label507;
      }
      label485: label493: label495: label501: label507: for (long l3 = this.aow; ; l3 = 0L)
      {
        l2 = Math.max(l2, l3);
        s.a(((RecyclerView.v)((ArrayList)localObject1).get(0)).apJ, (Runnable)localObject2, l1 + l2);
        break;
        ((Runnable)localObject2).run();
        break label266;
        ((Runnable)localObject2).run();
        break label346;
        break;
        l1 = 0L;
        break label421;
        l2 = 0L;
        break label431;
      }
      label513: ((Runnable)localObject2).run();
    }
  }

  final void hY()
  {
    if (!isRunning())
      jS();
  }

  public final void hZ()
  {
    Object localObject1;
    Object localObject2;
    for (int i = this.ahq.size() - 1; i >= 0; i--)
    {
      localObject1 = (y.b)this.ahq.get(i);
      localObject2 = ((y.b)localObject1).ahR.apJ;
      ((View)localObject2).setTranslationY(0.0F);
      ((View)localObject2).setTranslationX(0.0F);
      C(((y.b)localObject1).ahR);
      this.ahq.remove(i);
    }
    for (i = this.aho.size() - 1; i >= 0; i--)
    {
      B((RecyclerView.v)this.aho.get(i));
      this.aho.remove(i);
    }
    for (i = this.ahp.size() - 1; i >= 0; i--)
    {
      localObject1 = (RecyclerView.v)this.ahp.get(i);
      ((RecyclerView.v)localObject1).apJ.setAlpha(1.0F);
      m((RecyclerView.v)localObject1);
      this.ahp.remove(i);
    }
    for (i = this.ahr.size() - 1; i >= 0; i--)
      a((a)this.ahr.get(i));
    this.ahr.clear();
    if (!isRunning());
    while (true)
    {
      return;
      int j;
      for (i = this.aht.size() - 1; i >= 0; i--)
      {
        localObject2 = (ArrayList)this.aht.get(i);
        for (j = ((ArrayList)localObject2).size() - 1; j >= 0; j--)
        {
          localObject1 = (y.b)((ArrayList)localObject2).get(j);
          View localView = ((y.b)localObject1).ahR.apJ;
          localView.setTranslationY(0.0F);
          localView.setTranslationX(0.0F);
          C(((y.b)localObject1).ahR);
          ((ArrayList)localObject2).remove(j);
          if (((ArrayList)localObject2).isEmpty())
            this.aht.remove(localObject2);
        }
      }
      for (i = this.ahs.size() - 1; i >= 0; i--)
      {
        localObject1 = (ArrayList)this.ahs.get(i);
        for (j = ((ArrayList)localObject1).size() - 1; j >= 0; j--)
        {
          localObject2 = (RecyclerView.v)((ArrayList)localObject1).get(j);
          ((RecyclerView.v)localObject2).apJ.setAlpha(1.0F);
          m((RecyclerView.v)localObject2);
          ((ArrayList)localObject1).remove(j);
          if (((ArrayList)localObject1).isEmpty())
            this.ahs.remove(localObject1);
        }
      }
      for (i = this.ahu.size() - 1; i >= 0; i--)
      {
        localObject1 = (ArrayList)this.ahu.get(i);
        for (j = ((ArrayList)localObject1).size() - 1; j >= 0; j--)
        {
          a((a)((ArrayList)localObject1).get(j));
          if (((ArrayList)localObject1).isEmpty())
            this.ahu.remove(localObject1);
        }
      }
      o(this.ahx);
      o(this.ahw);
      o(this.ahv);
      o(this.ahy);
      jS();
    }
  }

  public boolean isRunning()
  {
    if ((!this.ahp.isEmpty()) || (!this.ahr.isEmpty()) || (!this.ahq.isEmpty()) || (!this.aho.isEmpty()) || (!this.ahw.isEmpty()) || (!this.ahx.isEmpty()) || (!this.ahv.isEmpty()) || (!this.ahy.isEmpty()) || (!this.aht.isEmpty()) || (!this.ahs.isEmpty()) || (!this.ahu.isEmpty()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  static final class a
  {
    public RecyclerView.v ahL;
    public RecyclerView.v ahM;
    public int ahN;
    public int ahO;
    public int ahP;
    public int ahQ;

    private a(RecyclerView.v paramv1, RecyclerView.v paramv2)
    {
      this.ahL = paramv1;
      this.ahM = paramv2;
    }

    a(RecyclerView.v paramv1, RecyclerView.v paramv2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
    {
      this(paramv1, paramv2);
      this.ahN = paramInt1;
      this.ahO = paramInt2;
      this.ahP = paramInt3;
      this.ahQ = paramInt4;
    }

    public final String toString()
    {
      return "ChangeInfo{oldHolder=" + this.ahL + ", newHolder=" + this.ahM + ", fromX=" + this.ahN + ", fromY=" + this.ahO + ", toX=" + this.ahP + ", toY=" + this.ahQ + '}';
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.y
 * JD-Core Version:    0.6.2
 */