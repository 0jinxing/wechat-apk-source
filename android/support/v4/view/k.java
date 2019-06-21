package android.support.v4.view;

import android.view.View;
import android.view.ViewParent;

public final class k
{
  private ViewParent Mn;
  private ViewParent Mo;
  public boolean Mp;
  private int[] Mq;
  private final View mView;

  public k(View paramView)
  {
    this.mView = paramView;
  }

  private void a(int paramInt, ViewParent paramViewParent)
  {
    switch (paramInt)
    {
    default:
    case 0:
    case 1:
    }
    while (true)
    {
      return;
      this.Mn = paramViewParent;
      continue;
      this.Mo = paramViewParent;
    }
  }

  private ViewParent aK(int paramInt)
  {
    ViewParent localViewParent;
    switch (paramInt)
    {
    default:
      localViewParent = null;
    case 0:
    case 1:
    }
    while (true)
    {
      return localViewParent;
      localViewParent = this.Mn;
      continue;
      localViewParent = this.Mo;
    }
  }

  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt, int paramInt5)
  {
    ViewParent localViewParent;
    boolean bool;
    int i;
    int j;
    if (this.Mp)
    {
      localViewParent = aK(paramInt5);
      if (localViewParent == null)
      {
        bool = false;
        return bool;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0) || (paramInt3 != 0) || (paramInt4 != 0))
      {
        if (paramArrayOfInt == null)
          break label148;
        this.mView.getLocationInWindow(paramArrayOfInt);
        i = paramArrayOfInt[0];
        j = paramArrayOfInt[1];
      }
    }
    while (true)
    {
      v.a(localViewParent, this.mView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
      if (paramArrayOfInt != null)
      {
        this.mView.getLocationInWindow(paramArrayOfInt);
        paramArrayOfInt[0] -= i;
        paramArrayOfInt[1] -= j;
      }
      bool = true;
      break;
      if (paramArrayOfInt != null)
      {
        paramArrayOfInt[0] = 0;
        paramArrayOfInt[1] = 0;
      }
      bool = false;
      break;
      label148: j = 0;
      i = 0;
    }
  }

  public final boolean a(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2, int paramInt3)
  {
    ViewParent localViewParent;
    boolean bool;
    int i;
    int j;
    if (this.Mp)
    {
      localViewParent = aK(paramInt3);
      if (localViewParent == null)
      {
        bool = false;
        return bool;
      }
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        if (paramArrayOfInt2 == null)
          break label189;
        this.mView.getLocationInWindow(paramArrayOfInt2);
        i = paramArrayOfInt2[0];
        j = paramArrayOfInt2[1];
      }
    }
    while (true)
    {
      if (paramArrayOfInt1 == null)
      {
        if (this.Mq == null)
          this.Mq = new int[2];
        paramArrayOfInt1 = this.Mq;
      }
      while (true)
      {
        paramArrayOfInt1[0] = 0;
        paramArrayOfInt1[1] = 0;
        v.a(localViewParent, this.mView, paramInt1, paramInt2, paramArrayOfInt1, paramInt3);
        if (paramArrayOfInt2 != null)
        {
          this.mView.getLocationInWindow(paramArrayOfInt2);
          paramArrayOfInt2[0] -= i;
          paramArrayOfInt2[1] -= j;
        }
        if ((paramArrayOfInt1[0] != 0) || (paramArrayOfInt1[1] != 0))
        {
          bool = true;
          break;
        }
        bool = false;
        break;
        if (paramArrayOfInt2 != null)
        {
          paramArrayOfInt2[0] = 0;
          paramArrayOfInt2[1] = 0;
        }
        bool = false;
        break;
      }
      label189: j = 0;
      i = 0;
    }
  }

  public final boolean aI(int paramInt)
  {
    if (aK(paramInt) != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void aJ(int paramInt)
  {
    ViewParent localViewParent = aK(paramInt);
    if (localViewParent != null)
    {
      v.a(localViewParent, this.mView, paramInt);
      a(paramInt, null);
    }
  }

  public final boolean dispatchNestedFling(float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.Mp)
    {
      ViewParent localViewParent = aK(0);
      bool2 = bool1;
      if (localViewParent != null)
        bool2 = v.a(localViewParent, this.mView, paramFloat1, paramFloat2, paramBoolean);
    }
    return bool2;
  }

  public final boolean dispatchNestedPreFling(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    boolean bool2 = bool1;
    if (this.Mp)
    {
      ViewParent localViewParent = aK(0);
      bool2 = bool1;
      if (localViewParent != null)
        bool2 = v.a(localViewParent, this.mView, paramFloat1, paramFloat2);
    }
    return bool2;
  }

  public final boolean dispatchNestedPreScroll(int paramInt1, int paramInt2, int[] paramArrayOfInt1, int[] paramArrayOfInt2)
  {
    return a(paramInt1, paramInt2, paramArrayOfInt1, paramArrayOfInt2, 0);
  }

  public final boolean dispatchNestedScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    return a(paramInt1, paramInt2, paramInt3, paramInt4, paramArrayOfInt, 0);
  }

  public final void setNestedScrollingEnabled(boolean paramBoolean)
  {
    if (this.Mp)
      s.ar(this.mView);
    this.Mp = paramBoolean;
  }

  public final boolean w(int paramInt1, int paramInt2)
  {
    boolean bool;
    if (aI(paramInt2))
      bool = true;
    while (true)
    {
      return bool;
      if (this.Mp)
      {
        ViewParent localViewParent = this.mView.getParent();
        View localView = this.mView;
        while (true)
        {
          if (localViewParent == null)
            break label107;
          if (v.a(localViewParent, localView, this.mView, paramInt1, paramInt2))
          {
            a(paramInt2, localViewParent);
            v.b(localViewParent, localView, this.mView, paramInt1, paramInt2);
            bool = true;
            break;
          }
          if ((localViewParent instanceof View))
            localView = (View)localViewParent;
          localViewParent = localViewParent.getParent();
        }
      }
      label107: bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.k
 * JD-Core Version:    0.6.2
 */