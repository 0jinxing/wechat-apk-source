package android.support.v7.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

public final class az extends ContextWrapper
{
  private static final Object atA = new Object();
  private static ArrayList<WeakReference<az>> atB;
  private final Resources mResources;
  private final Resources.Theme mTheme;

  private az(Context paramContext)
  {
    super(paramContext);
    if (bh.lw())
    {
      this.mResources = new bh(this, paramContext.getResources());
      this.mTheme = this.mResources.newTheme();
      this.mTheme.setTo(paramContext.getTheme());
    }
    while (true)
    {
      return;
      this.mResources = new bb(this, paramContext.getResources());
      this.mTheme = null;
    }
  }

  public static Context ad(Context paramContext)
  {
    int i = 0;
    int j = i;
    if (!(paramContext instanceof az))
    {
      j = i;
      if (!(paramContext.getResources() instanceof bb))
      {
        if (!(paramContext.getResources() instanceof bh))
          break label102;
        j = i;
      }
    }
    while (true)
    {
      Object localObject1 = paramContext;
      if (j != 0);
      synchronized (atA)
      {
        if (atB == null)
        {
          localObject1 = new java/util/ArrayList;
          ((ArrayList)localObject1).<init>();
          atB = (ArrayList)localObject1;
        }
        label102: 
        do
        {
          localObject1 = new android/support/v7/widget/az;
          ((az)localObject1).<init>(paramContext);
          ArrayList localArrayList = atB;
          paramContext = new java/lang/ref/WeakReference;
          paramContext.<init>(localObject1);
          localArrayList.add(paramContext);
          return localObject1;
          if (Build.VERSION.SDK_INT >= 21)
          {
            j = i;
            if (!bh.lw())
              break;
          }
          j = 1;
          break;
          for (j = atB.size() - 1; j >= 0; j--)
          {
            localObject1 = (WeakReference)atB.get(j);
            if ((localObject1 == null) || (((WeakReference)localObject1).get() == null))
              atB.remove(j);
          }
          j = atB.size() - 1;
        }
        while (j < 0);
        localObject1 = (WeakReference)atB.get(j);
        if (localObject1 != null);
        for (localObject1 = (az)((WeakReference)localObject1).get(); ; localObject1 = null)
        {
          if ((localObject1 == null) || (((az)localObject1).getBaseContext() != paramContext))
            break label231;
          break;
        }
        label231: j--;
      }
    }
  }

  public final AssetManager getAssets()
  {
    return this.mResources.getAssets();
  }

  public final Resources getResources()
  {
    return this.mResources;
  }

  public final Resources.Theme getTheme()
  {
    if (this.mTheme == null);
    for (Resources.Theme localTheme = super.getTheme(); ; localTheme = this.mTheme)
      return localTheme;
  }

  public final void setTheme(int paramInt)
  {
    if (this.mTheme == null)
      super.setTheme(paramInt);
    while (true)
    {
      return;
      this.mTheme.applyStyle(paramInt, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.az
 * JD-Core Version:    0.6.2
 */