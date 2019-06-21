package android.support.v4.app;

import android.os.Parcelable;
import android.support.v4.view.p;
import android.view.View;
import android.view.ViewGroup;

public abstract class k extends p
{
  private m mCurTransaction = null;
  private Fragment mCurrentPrimaryItem = null;
  private final i mFragmentManager;

  public k(i parami)
  {
    this.mFragmentManager = parami;
  }

  private static String b(int paramInt, long paramLong)
  {
    return "android:switcher:" + paramInt + ":" + paramLong;
  }

  public void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    if (this.mCurTransaction == null)
      this.mCurTransaction = this.mFragmentManager.beginTransaction();
    this.mCurTransaction.c((Fragment)paramObject);
  }

  public void finishUpdate(ViewGroup paramViewGroup)
  {
    if (this.mCurTransaction != null)
    {
      this.mCurTransaction.commitNowAllowingStateLoss();
      this.mCurTransaction = null;
    }
  }

  public abstract Fragment getItem(int paramInt);

  public Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    if (this.mCurTransaction == null)
      this.mCurTransaction = this.mFragmentManager.beginTransaction();
    long l = paramInt;
    Object localObject = b(paramViewGroup.getId(), l);
    localObject = this.mFragmentManager.findFragmentByTag((String)localObject);
    if (localObject != null)
      this.mCurTransaction.d((Fragment)localObject);
    for (paramViewGroup = (ViewGroup)localObject; ; paramViewGroup = (ViewGroup)localObject)
    {
      if (paramViewGroup != this.mCurrentPrimaryItem)
      {
        paramViewGroup.setMenuVisibility(false);
        paramViewGroup.setUserVisibleHint(false);
      }
      return paramViewGroup;
      localObject = getItem(paramInt);
      this.mCurTransaction.a(paramViewGroup.getId(), (Fragment)localObject, b(paramViewGroup.getId(), l));
    }
  }

  public boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (((Fragment)paramObject).getView() == paramView);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void restoreState(Parcelable paramParcelable, ClassLoader paramClassLoader)
  {
  }

  public Parcelable saveState()
  {
    return null;
  }

  public void setPrimaryItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    paramViewGroup = (Fragment)paramObject;
    if (paramViewGroup != this.mCurrentPrimaryItem)
    {
      if (this.mCurrentPrimaryItem != null)
      {
        this.mCurrentPrimaryItem.setMenuVisibility(false);
        this.mCurrentPrimaryItem.setUserVisibleHint(false);
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.setMenuVisibility(true);
        paramViewGroup.setUserVisibleHint(true);
      }
      this.mCurrentPrimaryItem = paramViewGroup;
    }
  }

  public void startUpdate(ViewGroup paramViewGroup)
  {
    if (paramViewGroup.getId() == -1)
      throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     android.support.v4.app.k
 * JD-Core Version:    0.6.2
 */