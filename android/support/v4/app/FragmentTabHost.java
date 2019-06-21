package android.support.v4.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.TabHost;
import android.widget.TabHost.OnTabChangeListener;
import java.util.ArrayList;

public class FragmentTabHost extends TabHost
  implements TabHost.OnTabChangeListener
{
  private TabHost.OnTabChangeListener Dv;
  private FragmentTabHost.a Dw;
  private boolean Dx;
  private int mContainerId;
  private Context mContext;
  private i mFragmentManager;
  private final ArrayList<FragmentTabHost.a> rS = new ArrayList();

  public FragmentTabHost(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, new int[] { 16842995 }, 0, 0);
    this.mContainerId = paramContext.getResourceId(0, 0);
    paramContext.recycle();
    super.setOnTabChangedListener(this);
  }

  private FragmentTabHost.a I(String paramString)
  {
    int i = this.rS.size();
    int j = 0;
    FragmentTabHost.a locala;
    if (j < i)
    {
      locala = (FragmentTabHost.a)this.rS.get(j);
      if (!locala.tag.equals(paramString));
    }
    for (paramString = locala; ; paramString = null)
    {
      return paramString;
      j++;
      break;
    }
  }

  private m a(String paramString, m paramm)
  {
    FragmentTabHost.a locala = I(paramString);
    paramString = paramm;
    if (this.Dw != locala)
    {
      paramString = paramm;
      if (paramm == null)
        paramString = this.mFragmentManager.beginTransaction();
      if ((this.Dw != null) && (this.Dw.fragment != null))
        paramString.c(this.Dw.fragment);
      if (locala != null)
      {
        if (locala.fragment != null)
          break label116;
        locala.fragment = Fragment.instantiate(this.mContext, locala.Dz.getName(), locala.DA);
        paramString.a(this.mContainerId, locala.fragment, locala.tag);
      }
    }
    while (true)
    {
      this.Dw = locala;
      return paramString;
      label116: paramString.d(locala.fragment);
    }
  }

  protected void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    String str = getCurrentTabTag();
    Object localObject1 = null;
    int i = this.rS.size();
    int j = 0;
    if (j < i)
    {
      FragmentTabHost.a locala = (FragmentTabHost.a)this.rS.get(j);
      locala.fragment = this.mFragmentManager.findFragmentByTag(locala.tag);
      Object localObject2 = localObject1;
      if (locala.fragment != null)
      {
        localObject2 = localObject1;
        if (!locala.fragment.isDetached())
        {
          if (!locala.tag.equals(str))
            break label114;
          this.Dw = locala;
          localObject2 = localObject1;
        }
      }
      while (true)
      {
        j++;
        localObject1 = localObject2;
        break;
        label114: localObject2 = localObject1;
        if (localObject1 == null)
          localObject2 = this.mFragmentManager.beginTransaction();
        ((m)localObject2).c(locala.fragment);
      }
    }
    this.Dx = true;
    localObject1 = a(str, (m)localObject1);
    if (localObject1 != null)
    {
      ((m)localObject1).commit();
      this.mFragmentManager.executePendingTransactions();
    }
  }

  protected void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    this.Dx = false;
  }

  protected void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof FragmentTabHost.SavedState))
      super.onRestoreInstanceState(paramParcelable);
    while (true)
    {
      return;
      paramParcelable = (FragmentTabHost.SavedState)paramParcelable;
      super.onRestoreInstanceState(paramParcelable.getSuperState());
      setCurrentTabByTag(paramParcelable.Dy);
    }
  }

  protected Parcelable onSaveInstanceState()
  {
    FragmentTabHost.SavedState localSavedState = new FragmentTabHost.SavedState(super.onSaveInstanceState());
    localSavedState.Dy = getCurrentTabTag();
    return localSavedState;
  }

  public void onTabChanged(String paramString)
  {
    if (this.Dx)
    {
      m localm = a(paramString, null);
      if (localm != null)
        localm.commit();
    }
    if (this.Dv != null)
      this.Dv.onTabChanged(paramString);
  }

  public void setOnTabChangedListener(TabHost.OnTabChangeListener paramOnTabChangeListener)
  {
    this.Dv = paramOnTabChangeListener;
  }

  @Deprecated
  public void setup()
  {
    throw new IllegalStateException("Must call setup() that takes a Context and FragmentManager");
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     android.support.v4.app.FragmentTabHost
 * JD-Core Version:    0.6.2
 */