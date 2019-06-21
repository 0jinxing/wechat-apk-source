package android.support.v7.widget;

import android.support.v4.view.s;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class RecyclerView$o
{
  final ArrayList<RecyclerView.v> aoV = new ArrayList();
  ArrayList<RecyclerView.v> aoW = null;
  final ArrayList<RecyclerView.v> aoX = new ArrayList();
  final List<RecyclerView.v> aoY = Collections.unmodifiableList(this.aoV);
  int aoZ = 2;
  int apa = 2;
  RecyclerView.n apb;
  RecyclerView.t apc;

  public RecyclerView$o(RecyclerView paramRecyclerView)
  {
  }

  private boolean a(RecyclerView.v paramv, int paramInt1, int paramInt2, long paramLong)
  {
    boolean bool = false;
    paramv.apZ = this.aoo;
    int i = paramv.apN;
    long l1 = this.aoo.getNanoTime();
    if (paramLong != 9223372036854775807L)
    {
      long l2 = this.apb.co(i).aoU;
      if ((l2 == 0L) || (l2 + l1 < paramLong))
      {
        i = 1;
        if (i != 0)
          break label84;
      }
    }
    while (true)
    {
      return bool;
      i = 0;
      break;
      label84: Object localObject = this.aoo.Yq;
      paramv.mPosition = paramInt1;
      if (((RecyclerView.a)localObject).aoq)
        paramv.apM = ((RecyclerView.a)localObject).getItemId(paramInt1);
      paramv.setFlags(1, 519);
      android.support.v4.os.f.beginSection("RV OnBindView");
      ((RecyclerView.a)localObject).a(paramv, paramInt1, paramv.kv());
      paramv.ku();
      localObject = paramv.apJ.getLayoutParams();
      if ((localObject instanceof RecyclerView.LayoutParams))
        ((RecyclerView.LayoutParams)localObject).aoN = true;
      android.support.v4.os.f.endSection();
      paramLong = this.aoo.getNanoTime();
      localObject = this.apb.co(paramv.apN);
      ((RecyclerView.n.a)localObject).aoU = RecyclerView.n.c(((RecyclerView.n.a)localObject).aoU, paramLong - l1);
      if (this.aoo.jx())
      {
        localObject = paramv.apJ;
        if (s.S((View)localObject) == 0)
          s.o((View)localObject, 1);
        if (!s.P((View)localObject))
        {
          paramv.addFlags(16384);
          s.a((View)localObject, this.aoo.aof.aqa);
        }
      }
      if (this.aoo.anY.apv)
        paramv.apO = paramInt2;
      bool = true;
    }
  }

  private RecyclerView.v b(long paramLong, int paramInt)
  {
    int i = this.aoV.size() - 1;
    RecyclerView.v localv1;
    RecyclerView.v localv2;
    if (i >= 0)
    {
      localv1 = (RecyclerView.v)this.aoV.get(i);
      if ((localv1.apM == paramLong) && (!localv1.kn()))
        if (paramInt == localv1.apN)
        {
          localv1.addFlags(32);
          localv2 = localv1;
          if (localv1.isRemoved())
          {
            localv2 = localv1;
            if (!this.aoo.anY.apv)
            {
              localv1.setFlags(2, 14);
              localv2 = localv1;
            }
          }
        }
    }
    while (true)
    {
      return localv2;
      this.aoV.remove(i);
      this.aoo.removeDetachedView(localv1.apJ, false);
      bJ(localv1.apJ);
      i--;
      break;
      for (i = this.aoX.size() - 1; ; i--)
      {
        if (i < 0)
          break label226;
        localv2 = (RecyclerView.v)this.aoX.get(i);
        if (localv2.apM == paramLong)
        {
          if (paramInt == localv2.apN)
          {
            this.aoX.remove(i);
            break;
          }
          cs(i);
          localv2 = null;
          break;
        }
      }
      label226: localv2 = null;
    }
  }

  private RecyclerView.v ct(int paramInt)
  {
    int i = 0;
    int j;
    RecyclerView.v localv;
    if (this.aoW != null)
    {
      j = this.aoW.size();
      if (j != 0);
    }
    else
    {
      localv = null;
    }
    while (true)
    {
      return localv;
      for (int k = 0; ; k++)
      {
        if (k >= j)
          break label83;
        localv = (RecyclerView.v)this.aoW.get(k);
        if ((!localv.kn()) && (localv.ki() == paramInt))
        {
          localv.addFlags(32);
          break;
        }
      }
      label83: if (this.aoo.Yq.aoq)
      {
        paramInt = this.aoo.ane.N(paramInt, 0);
        if ((paramInt > 0) && (paramInt < this.aoo.Yq.getItemCount()))
        {
          long l = this.aoo.Yq.getItemId(paramInt);
          for (paramInt = i; ; paramInt++)
          {
            if (paramInt >= j)
              break label195;
            localv = (RecyclerView.v)this.aoW.get(paramInt);
            if ((!localv.kn()) && (localv.apM == l))
            {
              localv.addFlags(32);
              break;
            }
          }
        }
      }
      label195: localv = null;
    }
  }

  private RecyclerView.v cu(int paramInt)
  {
    int i = 0;
    int j = this.aoV.size();
    int k = 0;
    Object localObject;
    if (k < j)
    {
      localObject = (RecyclerView.v)this.aoV.get(k);
      if ((!((RecyclerView.v)localObject).kn()) && (((RecyclerView.v)localObject).ki() == paramInt) && (!((RecyclerView.v)localObject).kq()) && ((this.aoo.anY.apv) || (!((RecyclerView.v)localObject).isRemoved())))
        ((RecyclerView.v)localObject).addFlags(32);
    }
    while (true)
    {
      return localObject;
      k++;
      break;
      v localv = this.aoo.anf;
      j = localv.ahc.size();
      k = 0;
      label118: RecyclerView.v localv1;
      if (k < j)
      {
        localObject = (View)localv.ahc.get(k);
        localv1 = localv.aha.aZ((View)localObject);
        if ((localv1.ki() != paramInt) || (localv1.kq()) || (localv1.isRemoved()));
      }
      while (true)
        if (localObject != null)
        {
          localv1 = RecyclerView.bn((View)localObject);
          localv = this.aoo.anf;
          paramInt = localv.aha.indexOfChild((View)localObject);
          if (paramInt < 0)
          {
            throw new IllegalArgumentException("view is not a child, cannot hide ".concat(String.valueOf(localObject)));
            k++;
            break label118;
            localObject = null;
            continue;
          }
          if (!localv.ahb.get(paramInt))
            throw new RuntimeException("trying to unhide a view that was not hidden".concat(String.valueOf(localObject)));
          localv.ahb.clear(paramInt);
          localv.aX((View)localObject);
          paramInt = this.aoo.anf.indexOfChild((View)localObject);
          if (paramInt == -1)
            throw new IllegalStateException("layout index should not be -1 after unhiding a view:" + localv1 + this.aoo.ji());
          this.aoo.anf.detachViewFromParent(paramInt);
          bK((View)localObject);
          localv1.addFlags(8224);
          localObject = localv1;
          break;
        }
      j = this.aoX.size();
      for (k = i; ; k++)
      {
        if (k >= j)
          break label450;
        localObject = (RecyclerView.v)this.aoX.get(k);
        if ((!((RecyclerView.v)localObject).kq()) && (((RecyclerView.v)localObject).ki() == paramInt))
        {
          this.aoX.remove(k);
          break;
        }
      }
      label450: localObject = null;
    }
  }

  private void d(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    for (int i = paramViewGroup.getChildCount() - 1; i >= 0; i--)
    {
      View localView = paramViewGroup.getChildAt(i);
      if ((localView instanceof ViewGroup))
        d((ViewGroup)localView, true);
    }
    if (!paramBoolean);
    while (true)
    {
      return;
      if (paramViewGroup.getVisibility() == 4)
      {
        paramViewGroup.setVisibility(0);
        paramViewGroup.setVisibility(4);
      }
      else
      {
        i = paramViewGroup.getVisibility();
        paramViewGroup.setVisibility(4);
        paramViewGroup.setVisibility(i);
      }
    }
  }

  private void kc()
  {
    for (int i = this.aoX.size() - 1; i >= 0; i--)
      cs(i);
    this.aoX.clear();
    if (RecyclerView.access$800())
      this.aoo.anX.ig();
  }

  private boolean q(RecyclerView.v paramv)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramv.isRemoved())
      bool2 = this.aoo.anY.apv;
    while (true)
    {
      return bool2;
      if ((paramv.mPosition < 0) || (paramv.mPosition >= this.aoo.Yq.getItemCount()))
        throw new IndexOutOfBoundsException("Inconsistency detected. Invalid view holder adapter position" + paramv + this.aoo.ji());
      if (!this.aoo.anY.apv)
      {
        bool2 = bool1;
        if (this.aoo.Yq.getItemViewType(paramv.mPosition) != paramv.apN);
      }
      else if (this.aoo.Yq.aoq)
      {
        bool2 = bool1;
        if (paramv.apM == this.aoo.Yq.getItemId(paramv.mPosition))
          bool2 = true;
      }
      else
      {
        bool2 = true;
      }
    }
  }

  private void r(RecyclerView.v paramv)
  {
    if ((paramv.apJ instanceof ViewGroup))
      d((ViewGroup)paramv.apJ, false);
  }

  private void u(RecyclerView.v paramv)
  {
    if (this.aoo.Yq != null)
      this.aoo.Yq.a(paramv);
    if (this.aoo.anY != null)
      this.aoo.ang.L(paramv);
  }

  final void a(RecyclerView.v paramv, boolean paramBoolean)
  {
    RecyclerView.h(paramv);
    if (paramv.cx(16384))
    {
      paramv.setFlags(0, 16384);
      s.a(paramv.apJ, null);
    }
    if (paramBoolean)
      u(paramv);
    paramv.apZ = null;
    getRecycledViewPool().p(paramv);
  }

  public final void bI(View paramView)
  {
    RecyclerView.v localv = RecyclerView.bn(paramView);
    if (localv.ks())
      this.aoo.removeDetachedView(paramView, false);
    if (localv.kl())
      localv.km();
    while (true)
    {
      s(localv);
      return;
      if (localv.kn())
        localv.ko();
    }
  }

  final void bJ(View paramView)
  {
    paramView = RecyclerView.bn(paramView);
    RecyclerView.v.w(paramView);
    RecyclerView.v.x(paramView);
    paramView.ko();
    s(paramView);
  }

  final void bK(View paramView)
  {
    RecyclerView.v localv = RecyclerView.bn(paramView);
    int i;
    if ((!localv.cx(12)) && (localv.kx()))
    {
      paramView = this.aoo;
      if ((paramView.anJ != null) && (!paramView.anJ.a(localv, localv.kv())))
        break label112;
      i = 1;
    }
    while (i != 0)
      if ((localv.kq()) && (!localv.isRemoved()) && (!this.aoo.Yq.aoq))
      {
        throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool." + this.aoo.ji());
        label112: i = 0;
      }
      else
      {
        localv.a(this, false);
        this.aoV.add(localv);
      }
    while (true)
    {
      return;
      if (this.aoW == null)
        this.aoW = new ArrayList();
      localv.a(this, true);
      this.aoW.add(localv);
    }
  }

  public final void clear()
  {
    this.aoV.clear();
    kc();
  }

  public final int cp(int paramInt)
  {
    if ((paramInt < 0) || (paramInt >= this.aoo.anY.getItemCount()))
      throw new IndexOutOfBoundsException("invalid position " + paramInt + ". State item count is " + this.aoo.anY.getItemCount() + this.aoo.ji());
    if (!this.aoo.anY.apv);
    while (true)
    {
      return paramInt;
      paramInt = this.aoo.ane.bA(paramInt);
    }
  }

  public final View cq(int paramInt)
  {
    return cr(paramInt);
  }

  final View cr(int paramInt)
  {
    return e(paramInt, 9223372036854775807L).apJ;
  }

  final void cs(int paramInt)
  {
    a((RecyclerView.v)this.aoX.get(paramInt), true);
    this.aoX.remove(paramInt);
  }

  final RecyclerView.v e(int paramInt, long paramLong)
  {
    boolean bool1 = true;
    if ((paramInt < 0) || (paramInt >= this.aoo.anY.getItemCount()))
      throw new IndexOutOfBoundsException("Invalid item position " + paramInt + "(" + paramInt + "). Item count:" + this.aoo.anY.getItemCount() + this.aoo.ji());
    Object localObject1;
    int i;
    if (this.aoo.anY.apv)
    {
      localObject1 = ct(paramInt);
      if (localObject1 != null)
        i = 1;
    }
    for (int j = i; ; j = 0)
    {
      Object localObject2;
      if (localObject1 == null)
      {
        localObject2 = cu(paramInt);
        localObject1 = localObject2;
        i = j;
        if (localObject2 != null)
        {
          if (q((RecyclerView.v)localObject2))
            break label321;
          ((RecyclerView.v)localObject2).addFlags(4);
          if (!((RecyclerView.v)localObject2).kl())
            break label305;
          this.aoo.removeDetachedView(((RecyclerView.v)localObject2).apJ, false);
          ((RecyclerView.v)localObject2).km();
          label183: s((RecyclerView.v)localObject2);
          localObject1 = null;
          i = j;
        }
      }
      while (true)
      {
        if (localObject1 == null)
        {
          int k = this.aoo.ane.bA(paramInt);
          if ((k < 0) || (k >= this.aoo.Yq.getItemCount()))
          {
            throw new IndexOutOfBoundsException("Inconsistency detected. Invalid item position " + paramInt + "(offset:" + k + ").state:" + this.aoo.anY.getItemCount() + this.aoo.ji());
            i = 0;
            break;
            label305: if (!((RecyclerView.v)localObject2).kn())
              break label183;
            ((RecyclerView.v)localObject2).ko();
            break label183;
            label321: i = 1;
            localObject1 = localObject2;
            continue;
          }
          j = this.aoo.Yq.getItemViewType(k);
          if (this.aoo.Yq.aoq)
          {
            localObject2 = b(this.aoo.Yq.getItemId(k), j);
            localObject1 = localObject2;
            if (localObject2 != null)
            {
              ((RecyclerView.v)localObject2).mPosition = k;
              i = 1;
              localObject1 = localObject2;
              if (localObject2 == null)
              {
                localObject2 = getRecycledViewPool().cn(j);
                localObject1 = localObject2;
                if (localObject2 != null)
                {
                  ((RecyclerView.v)localObject2).resetInternal();
                  localObject1 = localObject2;
                  if (RecyclerView.amU)
                  {
                    r((RecyclerView.v)localObject2);
                    localObject1 = localObject2;
                  }
                }
              }
              localObject2 = localObject1;
              if (localObject1 == null)
              {
                long l1 = this.aoo.getNanoTime();
                if ((paramLong != 9223372036854775807L) && (!this.apb.b(j, l1, paramLong)))
                {
                  localObject1 = null;
                  return localObject1;
                }
                localObject2 = this.aoo.Yq.c(this.aoo, j);
                if (RecyclerView.access$800())
                {
                  localObject1 = RecyclerView.br(((RecyclerView.v)localObject2).apJ);
                  if (localObject1 != null)
                    ((RecyclerView.v)localObject2).apK = new WeakReference(localObject1);
                }
                long l2 = this.aoo.getNanoTime();
                this.apb.d(j, l2 - l1);
              }
              localObject1 = localObject2;
            }
          }
        }
        while (true)
        {
          if ((i != 0) && (!this.aoo.anY.apv) && (((RecyclerView.v)localObject1).cx(8192)))
          {
            ((RecyclerView.v)localObject1).setFlags(0, 8192);
            if (this.aoo.anY.apy)
            {
              j = RecyclerView.f.l((RecyclerView.v)localObject1);
              localObject2 = this.aoo.anJ.a(this.aoo.anY, (RecyclerView.v)localObject1, j | 0x1000, ((RecyclerView.v)localObject1).kv());
              this.aoo.a((RecyclerView.v)localObject1, (RecyclerView.f.c)localObject2);
            }
          }
          boolean bool2;
          if ((this.aoo.anY.apv) && (((RecyclerView.v)localObject1).isBound()))
          {
            ((RecyclerView.v)localObject1).apO = paramInt;
            bool2 = false;
          }
          while (true)
          {
            label709: localObject2 = ((RecyclerView.v)localObject1).apJ.getLayoutParams();
            if (localObject2 == null)
            {
              localObject2 = (RecyclerView.LayoutParams)this.aoo.generateDefaultLayoutParams();
              ((RecyclerView.v)localObject1).apJ.setLayoutParams((ViewGroup.LayoutParams)localObject2);
              label746: ((RecyclerView.LayoutParams)localObject2).aoM = ((RecyclerView.v)localObject1);
              if ((i == 0) || (!bool2))
                break label874;
            }
            label874: for (bool2 = bool1; ; bool2 = false)
            {
              ((RecyclerView.LayoutParams)localObject2).aoO = bool2;
              break;
              if ((((RecyclerView.v)localObject1).isBound()) && (!((RecyclerView.v)localObject1).kr()) && (!((RecyclerView.v)localObject1).kq()))
                break label880;
              bool2 = a((RecyclerView.v)localObject1, this.aoo.ane.bA(paramInt), paramInt, paramLong);
              break label709;
              if (!this.aoo.checkLayoutParams((ViewGroup.LayoutParams)localObject2))
              {
                localObject2 = (RecyclerView.LayoutParams)this.aoo.generateLayoutParams((ViewGroup.LayoutParams)localObject2);
                ((RecyclerView.v)localObject1).apJ.setLayoutParams((ViewGroup.LayoutParams)localObject2);
                break label746;
              }
              localObject2 = (RecyclerView.LayoutParams)localObject2;
              break label746;
            }
            label880: bool2 = false;
          }
          localObject2 = localObject1;
          break;
        }
        i = j;
      }
      localObject1 = null;
    }
  }

  final RecyclerView.n getRecycledViewPool()
  {
    if (this.apb == null)
      this.apb = new RecyclerView.n();
    return this.apb;
  }

  final void jK()
  {
    int i = this.aoX.size();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)((RecyclerView.v)this.aoX.get(j)).apJ.getLayoutParams();
      if (localLayoutParams != null)
        localLayoutParams.aoN = true;
    }
  }

  final void jM()
  {
    int i = 0;
    int j = this.aoX.size();
    for (int k = 0; k < j; k++)
      ((RecyclerView.v)this.aoX.get(k)).kf();
    j = this.aoV.size();
    for (k = 0; k < j; k++)
      ((RecyclerView.v)this.aoV.get(k)).kf();
    if (this.aoW != null)
    {
      j = this.aoW.size();
      for (k = i; k < j; k++)
        ((RecyclerView.v)this.aoW.get(k)).kf();
    }
  }

  final void jN()
  {
    int i = this.aoX.size();
    for (int j = 0; j < i; j++)
    {
      RecyclerView.v localv = (RecyclerView.v)this.aoX.get(j);
      if (localv != null)
      {
        localv.addFlags(6);
        localv.O(null);
      }
    }
    if ((this.aoo.Yq == null) || (!this.aoo.Yq.aoq))
      kc();
  }

  final void kb()
  {
    if (this.aoo.ank != null);
    for (int i = this.aoo.ank.aoH; ; i = 0)
    {
      this.apa = (i + this.aoZ);
      for (i = this.aoX.size() - 1; (i >= 0) && (this.aoX.size() > this.apa); i--)
        cs(i);
    }
  }

  final void s(RecyclerView.v paramv)
  {
    int i = 1;
    if ((paramv.kl()) || (paramv.apJ.getParent() != null))
    {
      StringBuilder localStringBuilder = new StringBuilder("Scrapped or attached views may not be recycled. isScrap:").append(paramv.kl()).append(" isAttached:");
      if (paramv.apJ.getParent() != null);
      for (bool = true; ; bool = false)
        throw new IllegalArgumentException(bool + this.aoo.ji());
    }
    if (paramv.ks())
      throw new IllegalArgumentException("Tmp detached view should be removed from RecyclerView before it can be recycled: " + paramv + this.aoo.ji());
    if (paramv.kh())
      throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle." + this.aoo.ji());
    boolean bool = RecyclerView.v.v(paramv);
    int j;
    int k;
    if (paramv.kw())
      if ((this.apa > 0) && (!paramv.cx(526)))
      {
        j = this.aoX.size();
        k = j;
        if (j >= this.apa)
        {
          k = j;
          if (j > 0)
          {
            cs(0);
            k = j - 1;
          }
        }
        j = k;
        if (RecyclerView.access$800())
        {
          j = k;
          if (k > 0)
          {
            j = k;
            if (!this.aoo.anX.bM(paramv.mPosition))
            {
              k--;
              while (k >= 0)
              {
                j = ((RecyclerView.v)this.aoX.get(k)).mPosition;
                if (!this.aoo.anX.bM(j))
                  break;
                k--;
              }
              j = k + 1;
            }
          }
        }
        this.aoX.add(j, paramv);
        k = 1;
        if (k == 0)
        {
          a(paramv, true);
          j = i;
        }
      }
    while (true)
    {
      this.aoo.ang.L(paramv);
      if ((k == 0) && (j == 0) && (bool))
        paramv.apZ = null;
      return;
      j = 0;
      continue;
      k = 0;
      break;
      j = 0;
      k = 0;
    }
  }

  final void t(RecyclerView.v paramv)
  {
    if (RecyclerView.v.y(paramv))
      this.aoW.remove(paramv);
    while (true)
    {
      RecyclerView.v.w(paramv);
      RecyclerView.v.x(paramv);
      paramv.ko();
      return;
      this.aoV.remove(paramv);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.RecyclerView.o
 * JD-Core Version:    0.6.2
 */