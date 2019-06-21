package android.support.v4.app;

import android.support.v4.f.e;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

final class b extends m
  implements FragmentManagerImpl.g, i.a
{
  final FragmentManagerImpl BU;
  ArrayList<a> BV = new ArrayList();
  int BW;
  int BX;
  int BY;
  int BZ;
  int Ca;
  int Cb;
  boolean Cc;
  boolean Cd = true;
  boolean Ce;
  int Cf;
  CharSequence Cg;
  int Ch;
  CharSequence Ci;
  ArrayList<String> Cj;
  ArrayList<String> Ck;
  boolean Cl = false;
  ArrayList<Runnable> Cm;
  int mIndex = -1;
  String mName;

  public b(FragmentManagerImpl paramFragmentManagerImpl)
  {
    this.BU = paramFragmentManagerImpl;
  }

  private void a(int paramInt1, Fragment paramFragment, String paramString, int paramInt2)
  {
    Class localClass = paramFragment.getClass();
    int i = localClass.getModifiers();
    if ((localClass.isAnonymousClass()) || (!Modifier.isPublic(i)) || ((localClass.isMemberClass()) && (!Modifier.isStatic(i))))
      throw new IllegalStateException("Fragment " + localClass.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
    paramFragment.mFragmentManager = this.BU;
    if (paramString != null)
    {
      if ((paramFragment.mTag != null) && (!paramString.equals(paramFragment.mTag)))
        throw new IllegalStateException("Can't change tag of fragment " + paramFragment + ": was " + paramFragment.mTag + " now " + paramString);
      paramFragment.mTag = paramString;
    }
    if (paramInt1 != 0)
    {
      if (paramInt1 == -1)
        throw new IllegalArgumentException("Can't add fragment " + paramFragment + " with tag " + paramString + " to container view with no id");
      if ((paramFragment.mFragmentId != 0) && (paramFragment.mFragmentId != paramInt1))
        throw new IllegalStateException("Can't change container ID of fragment " + paramFragment + ": was " + paramFragment.mFragmentId + " now " + paramInt1);
      paramFragment.mFragmentId = paramInt1;
      paramFragment.mContainerId = paramInt1;
    }
    a(new a(paramInt2, paramFragment));
  }

  static boolean b(a parama)
  {
    parama = parama.fragment;
    if ((parama != null) && (parama.mAdded) && (parama.mView != null) && (!parama.mDetached) && (!parama.mHidden) && (parama.isPostponed()));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private m dh()
  {
    if (this.Cc)
      throw new IllegalStateException("This transaction is already being added to the back stack");
    this.Cd = false;
    return this;
  }

  private int x(boolean paramBoolean)
  {
    if (this.Ce)
      throw new IllegalStateException("commit already called");
    if (FragmentManagerImpl.DEBUG)
    {
      new StringBuilder("Commit: ").append(this);
      PrintWriter localPrintWriter = new PrintWriter(new e("FragmentManager"));
      a("  ", localPrintWriter);
      localPrintWriter.close();
    }
    this.Ce = true;
    if (this.Cc);
    for (this.mIndex = this.BU.allocBackStackIndex(this); ; this.mIndex = -1)
    {
      this.BU.enqueueAction(this, paramBoolean);
      return this.mIndex;
    }
  }

  final Fragment a(ArrayList<Fragment> paramArrayList, Fragment paramFragment)
  {
    int i = 0;
    Fragment localFragment1 = paramFragment;
    a locala;
    int j;
    Fragment localFragment2;
    int m;
    int n;
    label216: Fragment localFragment3;
    if (i < this.BV.size())
    {
      locala = (a)this.BV.get(i);
      j = i;
      paramFragment = localFragment1;
      switch (locala.Cn)
      {
      default:
        paramFragment = localFragment1;
        j = i;
      case 4:
      case 5:
      case 1:
      case 7:
      case 3:
      case 6:
        while (true)
        {
          i = j + 1;
          localFragment1 = paramFragment;
          break;
          paramArrayList.add(locala.fragment);
          j = i;
          paramFragment = localFragment1;
          continue;
          paramArrayList.remove(locala.fragment);
          j = i;
          paramFragment = localFragment1;
          if (locala.fragment == localFragment1)
          {
            this.BV.add(i, new a(9, locala.fragment));
            j = i + 1;
            paramFragment = null;
          }
        }
      case 2:
        localFragment2 = locala.fragment;
        int k = localFragment2.mContainerId;
        m = 0;
        n = paramArrayList.size() - 1;
        j = i;
        paramFragment = localFragment1;
        i = m;
        if (n >= 0)
        {
          localFragment3 = (Fragment)paramArrayList.get(n);
          if (localFragment3.mContainerId != k)
            break label447;
          if (localFragment3 == localFragment2)
            i = 1;
        }
        break;
      case 8:
      }
    }
    label447: 
    while (true)
    {
      n--;
      break label216;
      m = j;
      localFragment1 = paramFragment;
      if (localFragment3 == paramFragment)
      {
        this.BV.add(j, new a(9, localFragment3));
        m = j + 1;
        localFragment1 = null;
      }
      paramFragment = new a(3, localFragment3);
      paramFragment.Co = locala.Co;
      paramFragment.Cq = locala.Cq;
      paramFragment.Cp = locala.Cp;
      paramFragment.Cr = locala.Cr;
      this.BV.add(m, paramFragment);
      paramArrayList.remove(localFragment3);
      j = m + 1;
      paramFragment = localFragment1;
      continue;
      if (i != 0)
      {
        this.BV.remove(j);
        j--;
        break;
      }
      locala.Cn = 1;
      paramArrayList.add(localFragment2);
      break;
      this.BV.add(i, new a(9, localFragment1));
      j = i + 1;
      paramFragment = locala.fragment;
      break;
      return localFragment1;
    }
  }

  public final m a(int paramInt, Fragment paramFragment)
  {
    a(paramInt, paramFragment, null, 1);
    return this;
  }

  public final m a(int paramInt, Fragment paramFragment, String paramString)
  {
    a(paramInt, paramFragment, paramString, 1);
    return this;
  }

  public final m a(Fragment paramFragment)
  {
    a(new a(3, paramFragment));
    return this;
  }

  public final m a(Fragment paramFragment, String paramString)
  {
    a(0, paramFragment, paramString, 1);
    return this;
  }

  final void a(Fragment.c paramc)
  {
    for (int i = 0; i < this.BV.size(); i++)
    {
      a locala = (a)this.BV.get(i);
      if (b(locala))
        locala.fragment.setOnStartEnterTransitionListener(paramc);
    }
  }

  final void a(a parama)
  {
    this.BV.add(parama);
    parama.Co = this.BW;
    parama.Cp = this.BX;
    parama.Cq = this.BY;
    parama.Cr = this.BZ;
  }

  public final void a(String paramString, PrintWriter paramPrintWriter)
  {
    a(paramString, paramPrintWriter, true);
  }

  public final void a(String paramString, PrintWriter paramPrintWriter, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.print("mName=");
      paramPrintWriter.print(this.mName);
      paramPrintWriter.print(" mIndex=");
      paramPrintWriter.print(this.mIndex);
      paramPrintWriter.print(" mCommitted=");
      paramPrintWriter.println(this.Ce);
      if (this.Ca != 0)
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mTransition=#");
        paramPrintWriter.print(Integer.toHexString(this.Ca));
        paramPrintWriter.print(" mTransitionStyle=#");
        paramPrintWriter.println(Integer.toHexString(this.Cb));
      }
      if ((this.BW != 0) || (this.BX != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.BW));
        paramPrintWriter.print(" mExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.BX));
      }
      if ((this.BY != 0) || (this.BZ != 0))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mPopEnterAnim=#");
        paramPrintWriter.print(Integer.toHexString(this.BY));
        paramPrintWriter.print(" mPopExitAnim=#");
        paramPrintWriter.println(Integer.toHexString(this.BZ));
      }
      if ((this.Cf != 0) || (this.Cg != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.Cf));
        paramPrintWriter.print(" mBreadCrumbTitleText=");
        paramPrintWriter.println(this.Cg);
      }
      if ((this.Ch != 0) || (this.Ci != null))
      {
        paramPrintWriter.print(paramString);
        paramPrintWriter.print("mBreadCrumbShortTitleRes=#");
        paramPrintWriter.print(Integer.toHexString(this.Ch));
        paramPrintWriter.print(" mBreadCrumbShortTitleText=");
        paramPrintWriter.println(this.Ci);
      }
    }
    if (!this.BV.isEmpty())
    {
      paramPrintWriter.print(paramString);
      paramPrintWriter.println("Operations:");
      new StringBuilder().append(paramString).append("    ");
      int i = this.BV.size();
      int j = 0;
      if (j < i)
      {
        a locala = (a)this.BV.get(j);
        String str;
        switch (locala.Cn)
        {
        default:
          str = "cmd=" + locala.Cn;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case 6:
        case 7:
        case 8:
        case 9:
        }
        while (true)
        {
          paramPrintWriter.print(paramString);
          paramPrintWriter.print("  Op #");
          paramPrintWriter.print(j);
          paramPrintWriter.print(": ");
          paramPrintWriter.print(str);
          paramPrintWriter.print(" ");
          paramPrintWriter.println(locala.fragment);
          if (paramBoolean)
          {
            if ((locala.Co != 0) || (locala.Cp != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("enterAnim=#");
              paramPrintWriter.print(Integer.toHexString(locala.Co));
              paramPrintWriter.print(" exitAnim=#");
              paramPrintWriter.println(Integer.toHexString(locala.Cp));
            }
            if ((locala.Cq != 0) || (locala.Cr != 0))
            {
              paramPrintWriter.print(paramString);
              paramPrintWriter.print("popEnterAnim=#");
              paramPrintWriter.print(Integer.toHexString(locala.Cq));
              paramPrintWriter.print(" popExitAnim=#");
              paramPrintWriter.println(Integer.toHexString(locala.Cr));
            }
          }
          j++;
          break;
          str = "NULL";
          continue;
          str = "ADD";
          continue;
          str = "REPLACE";
          continue;
          str = "REMOVE";
          continue;
          str = "HIDE";
          continue;
          str = "SHOW";
          continue;
          str = "DETACH";
          continue;
          str = "ATTACH";
          continue;
          str = "SET_PRIMARY_NAV";
          continue;
          str = "UNSET_PRIMARY_NAV";
        }
      }
    }
  }

  final boolean a(ArrayList<b> paramArrayList, int paramInt1, int paramInt2)
  {
    boolean bool;
    if (paramInt2 == paramInt1)
    {
      bool = false;
      return bool;
    }
    int i = this.BV.size();
    int j = -1;
    int k = 0;
    label26: int m;
    if (k < i)
    {
      Object localObject = (a)this.BV.get(k);
      if (((a)localObject).fragment != null)
      {
        m = ((a)localObject).fragment.mContainerId;
        label65: if ((m == 0) || (m == j))
          break label203;
      }
      label175: label181: for (j = paramInt1; ; j++)
      {
        if (j >= paramInt2)
          break label187;
        localObject = (b)paramArrayList.get(j);
        int n = ((b)localObject).BV.size();
        for (int i1 = 0; ; i1++)
        {
          if (i1 >= n)
            break label181;
          a locala = (a)((b)localObject).BV.get(i1);
          if (locala.fragment != null);
          for (int i2 = locala.fragment.mContainerId; ; i2 = 0)
          {
            if (i2 != m)
              break label175;
            bool = true;
            break;
            m = 0;
            break label65;
          }
        }
      }
    }
    while (true)
    {
      label187: k++;
      j = m;
      break label26;
      bool = false;
      break;
      label203: m = j;
    }
  }

  public final boolean a(ArrayList<b> paramArrayList, ArrayList<Boolean> paramArrayList1)
  {
    if (FragmentManagerImpl.DEBUG)
      new StringBuilder("Run: ").append(this);
    paramArrayList.add(this);
    paramArrayList1.add(Boolean.FALSE);
    if (this.Cc)
      this.BU.addBackStackState(this);
    return true;
  }

  final void aq(int paramInt)
  {
    if (!this.Cc);
    while (true)
    {
      return;
      if (FragmentManagerImpl.DEBUG)
        new StringBuilder("Bump nesting in ").append(this).append(" by ").append(paramInt);
      int i = this.BV.size();
      for (int j = 0; j < i; j++)
      {
        a locala = (a)this.BV.get(j);
        if (locala.fragment != null)
        {
          Fragment localFragment = locala.fragment;
          localFragment.mBackStackNesting += paramInt;
          if (FragmentManagerImpl.DEBUG)
            new StringBuilder("Bump nesting of ").append(locala.fragment).append(" to ").append(locala.fragment.mBackStackNesting);
        }
      }
    }
  }

  final boolean ar(int paramInt)
  {
    int i = this.BV.size();
    int j = 0;
    int k;
    if (j < i)
    {
      a locala = (a)this.BV.get(j);
      if (locala.fragment != null)
      {
        k = locala.fragment.mContainerId;
        label46: if ((k == 0) || (k != paramInt))
          break label69;
      }
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      k = 0;
      break label46;
      label69: j++;
      break;
    }
  }

  final Fragment b(ArrayList<Fragment> paramArrayList, Fragment paramFragment)
  {
    int i = 0;
    Fragment localFragment = paramFragment;
    if (i < this.BV.size())
    {
      a locala = (a)this.BV.get(i);
      paramFragment = localFragment;
      switch (locala.Cn)
      {
      default:
        paramFragment = localFragment;
      case 2:
      case 4:
      case 5:
      case 1:
      case 7:
      case 3:
      case 6:
      case 9:
      case 8:
      }
      while (true)
      {
        i++;
        localFragment = paramFragment;
        break;
        paramArrayList.remove(locala.fragment);
        paramFragment = localFragment;
        continue;
        paramArrayList.add(locala.fragment);
        paramFragment = localFragment;
        continue;
        paramFragment = locala.fragment;
        continue;
        paramFragment = null;
      }
    }
    return localFragment;
  }

  public final m b(int paramInt, Fragment paramFragment)
  {
    if (paramInt == 0)
      throw new IllegalArgumentException("Must use non-zero containerViewId");
    a(paramInt, paramFragment, null, 2);
    return this;
  }

  public final m b(Fragment paramFragment)
  {
    a(new a(5, paramFragment));
    return this;
  }

  public final m c(Fragment paramFragment)
  {
    a(new a(6, paramFragment));
    return this;
  }

  public final int commit()
  {
    return x(false);
  }

  public final int commitAllowingStateLoss()
  {
    return x(true);
  }

  public final void commitNow()
  {
    dh();
    this.BU.execSingleAction(this, false);
  }

  public final void commitNowAllowingStateLoss()
  {
    dh();
    this.BU.execSingleAction(this, true);
  }

  public final m d(Fragment paramFragment)
  {
    a(new a(7, paramFragment));
    return this;
  }

  public final m dg()
  {
    if (!this.Cd)
      throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    this.Cc = true;
    this.mName = null;
    return this;
  }

  public final void di()
  {
    if (this.Cm != null)
    {
      int i = this.Cm.size();
      for (int j = 0; j < i; j++)
        ((Runnable)this.Cm.get(j)).run();
      this.Cm = null;
    }
  }

  final void dj()
  {
    int i = this.BV.size();
    int j = 0;
    if (j < i)
    {
      a locala = (a)this.BV.get(j);
      Fragment localFragment = locala.fragment;
      if (localFragment != null)
        localFragment.setNextTransition(this.Ca, this.Cb);
      switch (locala.Cn)
      {
      case 2:
      default:
        throw new IllegalArgumentException("Unknown cmd: " + locala.Cn);
      case 1:
        localFragment.setNextAnim(locala.Co);
        this.BU.addFragment(localFragment, false);
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      while (true)
      {
        if ((!this.Cl) && (locala.Cn != 1) && (localFragment != null))
          this.BU.moveFragmentToExpectedState(localFragment);
        j++;
        break;
        localFragment.setNextAnim(locala.Cp);
        this.BU.removeFragment(localFragment);
        continue;
        localFragment.setNextAnim(locala.Cp);
        this.BU.hideFragment(localFragment);
        continue;
        localFragment.setNextAnim(locala.Co);
        this.BU.showFragment(localFragment);
        continue;
        localFragment.setNextAnim(locala.Cp);
        this.BU.detachFragment(localFragment);
        continue;
        localFragment.setNextAnim(locala.Co);
        this.BU.attachFragment(localFragment);
        continue;
        this.BU.setPrimaryNavigationFragment(localFragment);
        continue;
        this.BU.setPrimaryNavigationFragment(null);
      }
    }
    if (!this.Cl)
      this.BU.moveToState(this.BU.mCurState, true);
  }

  public final m r(int paramInt1, int paramInt2)
  {
    this.BW = paramInt1;
    this.BX = paramInt2;
    this.BY = 0;
    this.BZ = 0;
    return this;
  }

  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("BackStackEntry{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    if (this.mIndex >= 0)
    {
      localStringBuilder.append(" #");
      localStringBuilder.append(this.mIndex);
    }
    if (this.mName != null)
    {
      localStringBuilder.append(" ");
      localStringBuilder.append(this.mName);
    }
    localStringBuilder.append("}");
    return localStringBuilder.toString();
  }

  final void y(boolean paramBoolean)
  {
    int i = this.BV.size() - 1;
    if (i >= 0)
    {
      a locala = (a)this.BV.get(i);
      Fragment localFragment = locala.fragment;
      if (localFragment != null)
        localFragment.setNextTransition(FragmentManagerImpl.reverseTransit(this.Ca), this.Cb);
      switch (locala.Cn)
      {
      case 2:
      default:
        throw new IllegalArgumentException("Unknown cmd: " + locala.Cn);
      case 1:
        localFragment.setNextAnim(locala.Cr);
        this.BU.removeFragment(localFragment);
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      case 8:
      case 9:
      }
      while (true)
      {
        if ((!this.Cl) && (locala.Cn != 3) && (localFragment != null))
          this.BU.moveFragmentToExpectedState(localFragment);
        i--;
        break;
        localFragment.setNextAnim(locala.Cq);
        this.BU.addFragment(localFragment, false);
        continue;
        localFragment.setNextAnim(locala.Cq);
        this.BU.showFragment(localFragment);
        continue;
        localFragment.setNextAnim(locala.Cr);
        this.BU.hideFragment(localFragment);
        continue;
        localFragment.setNextAnim(locala.Cq);
        this.BU.attachFragment(localFragment);
        continue;
        localFragment.setNextAnim(locala.Cr);
        this.BU.detachFragment(localFragment);
        continue;
        this.BU.setPrimaryNavigationFragment(null);
        continue;
        this.BU.setPrimaryNavigationFragment(localFragment);
      }
    }
    if ((!this.Cl) && (paramBoolean))
      this.BU.moveToState(this.BU.mCurState, true);
  }

  static final class a
  {
    int Cn;
    int Co;
    int Cp;
    int Cq;
    int Cr;
    Fragment fragment;

    a()
    {
    }

    a(int paramInt, Fragment paramFragment)
    {
      this.Cn = paramInt;
      this.fragment = paramFragment;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.b
 * JD-Core Version:    0.6.2
 */