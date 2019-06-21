package android.support.v4.app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.support.v4.f.a;
import android.support.v4.view.s;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class n
{
  private static final int[] DC = { 0, 3, 0, 1, 5, 4, 7, 6, 9, 8 };
  private static final p DD;
  private static final p DE;

  static
  {
    if (Build.VERSION.SDK_INT >= 21);
    for (o localo = new o(); ; localo = null)
    {
      DD = localo;
      DE = dp();
      return;
    }
  }

  private static a a(a parama, SparseArray<a> paramSparseArray, int paramInt)
  {
    a locala = parama;
    if (parama == null)
    {
      locala = new a();
      paramSparseArray.put(paramInt, locala);
    }
    return locala;
  }

  private static p a(Fragment paramFragment1, Fragment paramFragment2)
  {
    Object localObject1 = null;
    ArrayList localArrayList = new ArrayList();
    if (paramFragment1 != null)
    {
      Object localObject2 = paramFragment1.getExitTransition();
      if (localObject2 != null)
        localArrayList.add(localObject2);
      localObject2 = paramFragment1.getReturnTransition();
      if (localObject2 != null)
        localArrayList.add(localObject2);
      paramFragment1 = paramFragment1.getSharedElementReturnTransition();
      if (paramFragment1 != null)
        localArrayList.add(paramFragment1);
    }
    if (paramFragment2 != null)
    {
      paramFragment1 = paramFragment2.getEnterTransition();
      if (paramFragment1 != null)
        localArrayList.add(paramFragment1);
      paramFragment1 = paramFragment2.getReenterTransition();
      if (paramFragment1 != null)
        localArrayList.add(paramFragment1);
      paramFragment1 = paramFragment2.getSharedElementEnterTransition();
      if (paramFragment1 != null)
        localArrayList.add(paramFragment1);
    }
    if (localArrayList.isEmpty())
      paramFragment1 = localObject1;
    do
    {
      while (true)
      {
        return paramFragment1;
        if ((DD != null) && (a(DD, localArrayList)))
        {
          paramFragment1 = DD;
        }
        else
        {
          if ((DE == null) || (!a(DE, localArrayList)))
            break;
          paramFragment1 = DE;
        }
      }
      if (DD != null)
        break;
      paramFragment1 = localObject1;
    }
    while (DE == null);
    throw new IllegalArgumentException("Invalid Transition types");
  }

  private static a<String, String> a(int paramInt1, ArrayList<b> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt2, int paramInt3)
  {
    a locala = new a();
    paramInt3--;
    while (paramInt3 >= paramInt2)
    {
      Object localObject = (b)paramArrayList.get(paramInt3);
      if (((b)localObject).ar(paramInt1))
      {
        boolean bool = ((Boolean)paramArrayList1.get(paramInt3)).booleanValue();
        if (((b)localObject).Cj != null)
        {
          int i = ((b)localObject).Cj.size();
          ArrayList localArrayList1;
          ArrayList localArrayList2;
          int j;
          label92: String str1;
          if (bool)
          {
            localArrayList1 = ((b)localObject).Cj;
            localArrayList2 = ((b)localObject).Ck;
            j = 0;
            if (j >= i)
              break label186;
            str1 = (String)localArrayList2.get(j);
            localObject = (String)localArrayList1.get(j);
            String str2 = (String)locala.remove(localObject);
            if (str2 == null)
              break label173;
            locala.put(str1, str2);
          }
          while (true)
          {
            j++;
            break label92;
            localArrayList2 = ((b)localObject).Cj;
            localArrayList1 = ((b)localObject).Ck;
            break;
            label173: locala.put(str1, localObject);
          }
        }
      }
      label186: paramInt3--;
    }
    return locala;
  }

  private static a<String, View> a(p paramp, a<String, String> parama, Object paramObject, a parama1)
  {
    if ((parama.isEmpty()) || (paramObject == null))
      parama.clear();
    a locala;
    for (paramp = null; ; paramp = locala)
    {
      return paramp;
      paramObject = parama1.DU;
      locala = new a();
      paramp.a(locala, paramObject.getView());
      paramp = parama1.DW;
      int i;
      if (parama1.DV)
      {
        paramObject = paramObject.getEnterTransitionCallback();
        paramp = paramp.Ck;
        android.support.v4.f.h.a(locala, paramp);
        if (paramObject == null)
          break label171;
        i = paramp.size() - 1;
        label84: if (i < 0)
          continue;
        parama1 = (String)paramp.get(i);
        paramObject = (View)locala.get(parama1);
        if (paramObject != null)
          break label138;
        parama.remove(parama1);
      }
      while (true)
      {
        i--;
        break label84;
        paramObject = paramObject.getExitTransitionCallback();
        paramp = paramp.Cj;
        break;
        label138: if (!parama1.equals(s.ai(paramObject)))
        {
          parama1 = (String)parama.remove(parama1);
          parama.put(s.ai(paramObject), parama1);
        }
      }
      label171: android.support.v4.f.h.a(parama, locala.keySet());
    }
  }

  private static View a(a<String, View> parama, a parama1, Object paramObject, boolean paramBoolean)
  {
    parama1 = parama1.DT;
    if ((paramObject != null) && (parama != null) && (parama1.Cj != null) && (!parama1.Cj.isEmpty()))
      if (paramBoolean)
        parama1 = (String)parama1.Cj.get(0);
    for (parama = (View)parama.get(parama1); ; parama = null)
    {
      return parama;
      parama1 = (String)parama1.Ck.get(0);
      break;
    }
  }

  private static Object a(p paramp, Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean)
  {
    if ((paramFragment1 == null) || (paramFragment2 == null))
    {
      paramp = null;
      return paramp;
    }
    if (paramBoolean);
    for (paramFragment1 = paramFragment2.getSharedElementReturnTransition(); ; paramFragment1 = paramFragment1.getSharedElementEnterTransition())
    {
      paramp = paramp.l(paramp.k(paramFragment1));
      break;
    }
  }

  private static Object a(p paramp, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null)
    {
      paramp = null;
      return paramp;
    }
    if (paramBoolean);
    for (paramFragment = paramFragment.getReenterTransition(); ; paramFragment = paramFragment.getEnterTransition())
    {
      paramp = paramp.k(paramFragment);
      break;
    }
  }

  private static Object a(p paramp, Object paramObject1, Object paramObject2, Object paramObject3, Fragment paramFragment, boolean paramBoolean)
  {
    boolean bool1 = true;
    boolean bool2 = bool1;
    if (paramObject1 != null)
    {
      bool2 = bool1;
      if (paramObject2 != null)
      {
        bool2 = bool1;
        if (paramFragment != null)
        {
          if (!paramBoolean)
            break label55;
          bool2 = paramFragment.getAllowReturnTransitionOverlap();
        }
      }
    }
    if (bool2);
    for (paramp = paramp.a(paramObject2, paramObject1, paramObject3); ; paramp = paramp.b(paramObject2, paramObject1, paramObject3))
    {
      return paramp;
      label55: bool2 = paramFragment.getAllowEnterTransitionOverlap();
      break;
    }
  }

  private static String a(a<String, String> parama, String paramString)
  {
    int i = parama.size();
    int j = 0;
    if (j < i)
      if (!paramString.equals(parama.valueAt(j)));
    for (parama = (String)parama.keyAt(j); ; parama = null)
    {
      return parama;
      j++;
      break;
    }
  }

  private static ArrayList<View> a(p paramp, Object paramObject, Fragment paramFragment, ArrayList<View> paramArrayList, View paramView)
  {
    Object localObject = null;
    if (paramObject != null)
    {
      ArrayList localArrayList = new ArrayList();
      paramFragment = paramFragment.getView();
      if (paramFragment != null)
        paramp.a(localArrayList, paramFragment);
      if (paramArrayList != null)
        localArrayList.removeAll(paramArrayList);
      localObject = localArrayList;
      if (!localArrayList.isEmpty())
      {
        localArrayList.add(paramView);
        paramp.a(paramObject, localArrayList);
        localObject = localArrayList;
      }
    }
    return localObject;
  }

  private static void a(Fragment paramFragment1, Fragment paramFragment2, boolean paramBoolean, a<String, View> parama)
  {
    int i = 0;
    int j;
    if (paramBoolean)
    {
      paramFragment1 = paramFragment2.getEnterTransitionCallback();
      if (paramFragment1 == null)
        return;
      paramFragment2 = new ArrayList();
      paramFragment1 = new ArrayList();
      if (parama != null)
        break label82;
      j = 0;
    }
    while (true)
    {
      if (i >= j)
        return;
      paramFragment1.add(parama.keyAt(i));
      paramFragment2.add(parama.valueAt(i));
      i++;
      continue;
      paramFragment1 = paramFragment1.getEnterTransitionCallback();
      break;
      label82: j = parama.size();
    }
  }

  static void a(FragmentManagerImpl paramFragmentManagerImpl, ArrayList<b> paramArrayList, ArrayList<Boolean> paramArrayList1, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    if (paramFragmentManagerImpl.mCurState <= 0);
    SparseArray localSparseArray;
    final Object localObject1;
    do
    {
      return;
      localSparseArray = new SparseArray();
      i = paramInt1;
      if (i < paramInt2)
      {
        localObject1 = (b)paramArrayList.get(i);
        if (((Boolean)paramArrayList1.get(i)).booleanValue())
          b((b)localObject1, localSparseArray, paramBoolean);
        while (true)
        {
          i++;
          break;
          a((b)localObject1, localSparseArray, paramBoolean);
        }
      }
    }
    while (localSparseArray.size() == 0);
    final View localView = new View(paramFragmentManagerImpl.mHost.mContext);
    int j = localSparseArray.size();
    int i = 0;
    label114: int k;
    final a locala1;
    Object localObject2;
    if (i < j)
    {
      k = localSparseArray.keyAt(i);
      locala1 = a(k, paramArrayList, paramArrayList1, paramInt1, paramInt2);
      localObject2 = (a)localSparseArray.valueAt(i);
      if (!paramBoolean)
        break label823;
      if (!paramFragmentManagerImpl.mContainer.onHasView())
        break label1379;
    }
    label529: label547: label676: label823: label961: label1227: label1241: label1377: label1379: for (ViewGroup localViewGroup = (ViewGroup)paramFragmentManagerImpl.mContainer.onFindViewById(k); ; localViewGroup = null)
    {
      final Fragment localFragment1;
      Fragment localFragment2;
      Object localObject3;
      final boolean bool1;
      final boolean bool2;
      Object localObject4;
      final Object localObject5;
      Object localObject6;
      Object localObject7;
      Fragment localFragment3;
      final Fragment localFragment4;
      final Object localObject8;
      Object localObject9;
      Object localObject10;
      if (localViewGroup != null)
      {
        localFragment1 = ((a)localObject2).DR;
        localFragment2 = ((a)localObject2).DU;
        localObject3 = a(localFragment2, localFragment1);
        if (localObject3 != null)
        {
          bool1 = ((a)localObject2).DS;
          bool2 = ((a)localObject2).DV;
          localObject4 = new ArrayList();
          localObject5 = new ArrayList();
          localObject6 = a((p)localObject3, localFragment1, bool1);
          localObject7 = b((p)localObject3, localFragment2, bool2);
          localFragment3 = ((a)localObject2).DR;
          localFragment4 = ((a)localObject2).DU;
          if (localFragment3 != null)
            localFragment3.getView().setVisibility(0);
          if ((localFragment3 != null) && (localFragment4 != null))
            break label529;
          localObject1 = null;
          if ((localObject6 != null) || (localObject1 != null) || (localObject7 != null))
          {
            localObject8 = a((p)localObject3, localObject7, localFragment2, (ArrayList)localObject5, localView);
            localObject9 = a((p)localObject3, localObject6, localFragment1, (ArrayList)localObject4, localView);
            a((ArrayList)localObject9, 4);
            localObject10 = a((p)localObject3, localObject6, localObject7, localObject1, localFragment1, bool1);
            if (localObject10 != null)
            {
              if ((localFragment2 != null) && (localObject7 != null) && (localFragment2.mAdded) && (localFragment2.mHidden) && (localFragment2.mHiddenChanged))
              {
                localFragment2.setHideReplaced(true);
                ((p)localObject3).b(localObject7, localFragment2.getView(), (ArrayList)localObject8);
                z.a(localFragment2.mContainer, new Runnable()
                {
                  public final void run()
                  {
                    n.b(this.yy);
                  }
                });
              }
              localObject2 = p.c((ArrayList)localObject4);
              ((p)localObject3).a(localObject10, localObject6, (ArrayList)localObject9, localObject7, (ArrayList)localObject8, localObject1, (ArrayList)localObject4);
              ((p)localObject3).a(localViewGroup, localObject10);
              ((p)localObject3).a(localViewGroup, (ArrayList)localObject5, (ArrayList)localObject4, (ArrayList)localObject2, locala1);
              a((ArrayList)localObject9, 0);
              ((p)localObject3).a(localObject1, (ArrayList)localObject5, (ArrayList)localObject4);
            }
          }
        }
      }
      while (true)
      {
        i++;
        break label114;
        break;
        bool2 = ((a)localObject2).DS;
        final a locala2;
        if (locala1.isEmpty())
        {
          localObject1 = null;
          localObject9 = a((p)localObject3, locala1, localObject1, (a)localObject2);
          locala2 = b((p)localObject3, locala1, localObject1, (a)localObject2);
          if (!locala1.isEmpty())
            break label649;
          localObject8 = null;
          if (localObject9 != null)
            ((a)localObject9).clear();
          localObject1 = localObject8;
          if (locala2 != null)
          {
            locala2.clear();
            localObject1 = localObject8;
          }
        }
        while (true)
        {
          if ((localObject6 != null) || (localObject7 != null) || (localObject1 != null))
            break label676;
          localObject1 = null;
          break;
          localObject1 = a((p)localObject3, localFragment3, localFragment4, bool2);
          break label547;
          a((ArrayList)localObject5, (a)localObject9, locala1.keySet());
          a((ArrayList)localObject4, locala2, locala1.values());
        }
        a(localFragment3, localFragment4, bool2, (a)localObject9);
        if (localObject1 != null)
        {
          ((ArrayList)localObject4).add(localView);
          ((p)localObject3).a(localObject1, localView, (ArrayList)localObject5);
          a((p)localObject3, localObject1, localObject7, (a)localObject9, ((a)localObject2).DV, ((a)localObject2).DW);
          localObject10 = new Rect();
          localObject2 = a(locala2, (a)localObject2, localObject6, bool2);
          localObject8 = localObject2;
          localObject9 = localObject10;
          if (localObject2 != null)
          {
            ((p)localObject3).a(localObject6, (Rect)localObject10);
            localObject9 = localObject10;
          }
        }
        for (localObject8 = localObject2; ; localObject8 = null)
        {
          z.a(localViewGroup, new Runnable()
          {
            public final void run()
            {
              n.b(this.DH, localFragment4, bool2, locala2);
              if (this.DL != null)
                p.b(this.DL, this.yv);
            }
          });
          break;
          localObject9 = null;
        }
        if (paramFragmentManagerImpl.mContainer.onHasView());
        for (localViewGroup = (ViewGroup)paramFragmentManagerImpl.mContainer.onFindViewById(k); ; localViewGroup = null)
        {
          if (localViewGroup == null)
            break label1377;
          localObject7 = ((a)localObject2).DR;
          localFragment2 = ((a)localObject2).DU;
          localObject4 = a(localFragment2, (Fragment)localObject7);
          if (localObject4 == null)
            break;
          bool2 = ((a)localObject2).DS;
          bool1 = ((a)localObject2).DV;
          localObject5 = a((p)localObject4, (Fragment)localObject7, bool2);
          localObject9 = b((p)localObject4, localFragment2, bool1);
          localObject6 = new ArrayList();
          localObject3 = new ArrayList();
          localFragment1 = ((a)localObject2).DR;
          localFragment4 = ((a)localObject2).DU;
          if ((localFragment1 == null) || (localFragment4 == null))
          {
            localObject1 = null;
            if ((localObject5 == null) && (localObject1 == null) && (localObject9 == null))
              break label1358;
            localObject10 = a((p)localObject4, localObject9, localFragment2, (ArrayList)localObject6, localView);
            if ((localObject10 != null) && (!((ArrayList)localObject10).isEmpty()))
              break label1366;
          }
          for (localObject8 = null; ; localObject8 = localObject9)
          {
            ((p)localObject4).b(localObject5, localView);
            localObject2 = a((p)localObject4, localObject5, localObject8, localObject1, (Fragment)localObject7, ((a)localObject2).DS);
            if (localObject2 == null)
              break;
            localObject9 = new ArrayList();
            ((p)localObject4).a(localObject2, localObject5, (ArrayList)localObject9, localObject8, (ArrayList)localObject10, localObject1, (ArrayList)localObject3);
            z.a(localViewGroup, new Runnable()
            {
              public final void run()
              {
                ArrayList localArrayList;
                if (this.yz != null)
                {
                  this.DF.c(this.yz, localView);
                  localArrayList = n.b(this.DF, this.yz, this.DH, this.yD, localView);
                  this.yA.addAll(localArrayList);
                }
                if (this.yy != null)
                {
                  if (localObject8 != null)
                  {
                    localArrayList = new ArrayList();
                    localArrayList.add(localView);
                    this.DF.b(localObject8, this.yy, localArrayList);
                  }
                  this.yy.clear();
                  this.yy.add(localView);
                }
              }
            });
            z.a(localViewGroup, new p.2((p)localObject4, (ArrayList)localObject3, locala1));
            ((p)localObject4).a(localViewGroup, localObject2);
            z.a(localViewGroup, new p.3((p)localObject4, (ArrayList)localObject3, locala1));
            break;
            bool1 = ((a)localObject2).DS;
            if (locala1.isEmpty())
            {
              localObject1 = null;
              localObject8 = a((p)localObject4, locala1, localObject1, (a)localObject2);
              if (!locala1.isEmpty())
                break label1227;
              localObject1 = null;
            }
            while (true)
            {
              if ((localObject5 != null) || (localObject9 != null) || (localObject1 != null))
                break label1241;
              localObject1 = null;
              break;
              localObject1 = a((p)localObject4, localFragment1, localFragment4, bool1);
              break label1166;
              ((ArrayList)localObject6).addAll(((a)localObject8).values());
            }
            a(localFragment1, localFragment4, bool1, (a)localObject8);
            if (localObject1 != null)
            {
              localObject10 = new Rect();
              ((p)localObject4).a(localObject1, localView, (ArrayList)localObject6);
              a((p)localObject4, localObject1, localObject9, (a)localObject8, ((a)localObject2).DV, ((a)localObject2).DW);
              localObject8 = localObject10;
              if (localObject5 != null)
                ((p)localObject4).a(localObject5, (Rect)localObject10);
            }
            for (localObject8 = localObject10; ; localObject8 = null)
            {
              z.a(localViewGroup, new Runnable()
              {
                public final void run()
                {
                  Object localObject = n.c(this.DF, locala1, localObject1, this.DO);
                  if (localObject != null)
                  {
                    this.yD.addAll(((a)localObject).values());
                    this.yD.add(localView);
                  }
                  n.b(localFragment1, localFragment4, bool1, (a)localObject);
                  if (localObject1 != null)
                  {
                    this.DF.a(localObject1, this.DP, this.yD);
                    localObject = n.b((a)localObject, this.DO, localObject5, bool1);
                    if (localObject != null)
                      p.b((View)localObject, this.DQ);
                  }
                }
              });
              break label961;
              break;
            }
          }
        }
      }
    }
  }

  private static void a(b paramb, b.a parama, SparseArray<a> paramSparseArray, boolean paramBoolean1, boolean paramBoolean2)
  {
    Fragment localFragment = parama.fragment;
    if (localFragment == null);
    int i;
    do
    {
      return;
      i = localFragment.mContainerId;
    }
    while (i == 0);
    int j;
    label38: int k;
    int m;
    boolean bool;
    if (paramBoolean1)
    {
      j = DC[parama.Cn];
      switch (j)
      {
      case 2:
      default:
        j = 0;
        k = 0;
        m = 0;
        bool = false;
        parama = (a)paramSparseArray.get(i);
        if (bool)
        {
          parama = a(parama, paramSparseArray, i);
          parama.DR = localFragment;
          parama.DS = paramBoolean1;
          parama.DT = paramb;
        }
        break;
      case 5:
      case 1:
      case 7:
      case 4:
      case 3:
      case 6:
      }
    }
    while (true)
    {
      if ((!paramBoolean2) && (j != 0))
      {
        if ((parama != null) && (parama.DU == localFragment))
          parama.DU = null;
        FragmentManagerImpl localFragmentManagerImpl = paramb.BU;
        if ((localFragment.mState <= 0) && (localFragmentManagerImpl.mCurState > 0) && (!paramb.Cl))
        {
          localFragmentManagerImpl.makeActive(localFragment);
          localFragmentManagerImpl.moveToState(localFragment, 1, 0, 0, false);
        }
      }
      if ((k != 0) && ((parama == null) || (parama.DU == null)))
      {
        parama = a(parama, paramSparseArray, i);
        parama.DU = localFragment;
        parama.DV = paramBoolean1;
        parama.DW = paramb;
      }
      for (paramb = parama; (!paramBoolean2) && (m != 0) && (paramb != null) && (paramb.DR == localFragment); paramb = parama)
      {
        paramb.DR = null;
        break;
        j = parama.Cn;
        break label38;
        if (paramBoolean2)
          if ((localFragment.mHiddenChanged) && (!localFragment.mHidden) && (localFragment.mAdded))
            bool = true;
        while (true)
        {
          j = 1;
          k = 0;
          m = 0;
          break;
          bool = false;
          continue;
          bool = localFragment.mHidden;
        }
        if (paramBoolean2)
          bool = localFragment.mIsNewlyAdded;
        while (true)
        {
          j = 1;
          k = 0;
          m = 0;
          break;
          if ((!localFragment.mAdded) && (!localFragment.mHidden))
            bool = true;
          else
            bool = false;
        }
        if (paramBoolean2)
          if ((localFragment.mHiddenChanged) && (localFragment.mAdded) && (localFragment.mHidden))
            j = 1;
        int n;
        while (true)
        {
          n = 0;
          k = j;
          m = 1;
          bool = false;
          j = n;
          break;
          j = 0;
          continue;
          if ((localFragment.mAdded) && (!localFragment.mHidden))
            j = 1;
          else
            j = 0;
        }
        if (paramBoolean2)
          if ((!localFragment.mAdded) && (localFragment.mView != null) && (localFragment.mView.getVisibility() == 0) && (localFragment.mPostponedAlpha >= 0.0F))
            j = 1;
        while (true)
        {
          n = 0;
          k = j;
          m = 1;
          bool = false;
          j = n;
          break;
          j = 0;
          continue;
          if ((localFragment.mAdded) && (!localFragment.mHidden))
            j = 1;
          else
            j = 0;
        }
      }
    }
  }

  private static void a(b paramb, SparseArray<a> paramSparseArray, boolean paramBoolean)
  {
    int i = paramb.BV.size();
    for (int j = 0; j < i; j++)
      a(paramb, (b.a)paramb.BV.get(j), paramSparseArray, false, paramBoolean);
  }

  private static void a(p paramp, Object paramObject1, Object paramObject2, a<String, View> parama, boolean paramBoolean, b paramb)
  {
    if ((paramb.Cj != null) && (!paramb.Cj.isEmpty()))
      if (!paramBoolean)
        break label65;
    label65: for (paramb = (String)paramb.Ck.get(0); ; paramb = (String)paramb.Cj.get(0))
    {
      parama = (View)parama.get(paramb);
      paramp.a(paramObject1, parama);
      if (paramObject2 != null)
        paramp.a(paramObject2, parama);
      return;
    }
  }

  private static void a(ArrayList<View> paramArrayList, int paramInt)
  {
    if (paramArrayList == null);
    while (true)
    {
      return;
      for (int i = paramArrayList.size() - 1; i >= 0; i--)
        ((View)paramArrayList.get(i)).setVisibility(paramInt);
    }
  }

  private static void a(ArrayList<View> paramArrayList, a<String, View> parama, Collection<String> paramCollection)
  {
    for (int i = parama.size() - 1; i >= 0; i--)
    {
      View localView = (View)parama.valueAt(i);
      if (paramCollection.contains(s.ai(localView)))
        paramArrayList.add(localView);
    }
  }

  private static boolean a(p paramp, List<Object> paramList)
  {
    boolean bool = false;
    int i = paramList.size();
    int j = 0;
    if (j < i)
      if (paramp.j(paramList.get(j)));
    while (true)
    {
      return bool;
      j++;
      break;
      bool = true;
    }
  }

  private static a<String, View> b(p paramp, a<String, String> parama, Object paramObject, a parama1)
  {
    Fragment localFragment = parama1.DR;
    View localView = localFragment.getView();
    if ((parama.isEmpty()) || (paramObject == null) || (localView == null))
      parama.clear();
    a locala;
    for (paramp = null; ; paramp = locala)
    {
      return paramp;
      locala = new a();
      paramp.a(locala, localView);
      paramp = parama1.DT;
      if (parama1.DS)
      {
        paramObject = localFragment.getExitTransitionCallback();
        paramp = paramp.Cj;
        if (paramp != null)
        {
          android.support.v4.f.h.a(locala, paramp);
          android.support.v4.f.h.a(locala, parama.values());
        }
        if (paramObject == null)
          break label209;
        i = paramp.size() - 1;
        label110: if (i < 0)
          continue;
        parama1 = (String)paramp.get(i);
        paramObject = (View)locala.get(parama1);
        if (paramObject != null)
          break label175;
        paramObject = a(parama, parama1);
        if (paramObject != null)
          parama.remove(paramObject);
      }
      while (true)
      {
        i--;
        break label110;
        paramObject = localFragment.getEnterTransitionCallback();
        paramp = paramp.Ck;
        break;
        label175: if (!parama1.equals(s.ai(paramObject)))
        {
          parama1 = a(parama, parama1);
          if (parama1 != null)
            parama.put(parama1, s.ai(paramObject));
        }
      }
      label209: for (int i = parama.size() - 1; i >= 0; i--)
        if (!locala.containsKey((String)parama.valueAt(i)))
          parama.removeAt(i);
    }
  }

  private static Object b(p paramp, Fragment paramFragment, boolean paramBoolean)
  {
    if (paramFragment == null)
    {
      paramp = null;
      return paramp;
    }
    if (paramBoolean);
    for (paramFragment = paramFragment.getReturnTransition(); ; paramFragment = paramFragment.getExitTransition())
    {
      paramp = paramp.k(paramFragment);
      break;
    }
  }

  private static void b(b paramb, SparseArray<a> paramSparseArray, boolean paramBoolean)
  {
    if (!paramb.BU.mContainer.onHasView());
    while (true)
    {
      return;
      for (int i = paramb.BV.size() - 1; i >= 0; i--)
        a(paramb, (b.a)paramb.BV.get(i), paramSparseArray, true, paramBoolean);
    }
  }

  private static p dp()
  {
    try
    {
      p localp = (p)Class.forName("android.support.transition.g").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
      return localp;
    }
    catch (Exception localException)
    {
      while (true)
        Object localObject = null;
    }
  }

  static final class a
  {
    public Fragment DR;
    public boolean DS;
    public b DT;
    public Fragment DU;
    public boolean DV;
    public b DW;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.n
 * JD-Core Version:    0.6.2
 */