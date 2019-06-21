package android.support.v7.view;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class d extends ContextWrapper
{
  public int YN;
  private Configuration YO;
  private LayoutInflater mInflater;
  private Resources mResources;
  private Resources.Theme mTheme;

  public d()
  {
    super(null);
  }

  public d(Context paramContext, int paramInt)
  {
    super(paramContext);
    this.YN = paramInt;
  }

  public d(Context paramContext, Resources.Theme paramTheme)
  {
    super(paramContext);
    this.mTheme = paramTheme;
  }

  private void gb()
  {
    if (this.mTheme == null);
    for (int i = 1; ; i = 0)
    {
      if (i != 0)
      {
        this.mTheme = getResources().newTheme();
        Resources.Theme localTheme = getBaseContext().getTheme();
        if (localTheme != null)
          this.mTheme.setTo(localTheme);
      }
      this.mTheme.applyStyle(this.YN, true);
      return;
    }
  }

  protected final void attachBaseContext(Context paramContext)
  {
    super.attachBaseContext(paramContext);
  }

  public final AssetManager getAssets()
  {
    return getResources().getAssets();
  }

  public final Resources getResources()
  {
    if (this.mResources == null)
    {
      if (this.YO != null)
        break label27;
      this.mResources = super.getResources();
    }
    while (true)
    {
      return this.mResources;
      label27: if (Build.VERSION.SDK_INT >= 17)
        this.mResources = createConfigurationContext(this.YO).getResources();
    }
  }

  public final Object getSystemService(String paramString)
  {
    if ("layout_inflater".equals(paramString))
      if (this.mInflater == null)
        this.mInflater = LayoutInflater.from(getBaseContext()).cloneInContext(this);
    for (paramString = this.mInflater; ; paramString = getBaseContext().getSystemService(paramString))
      return paramString;
  }

  public final Resources.Theme getTheme()
  {
    if (this.mTheme != null);
    for (Resources.Theme localTheme = this.mTheme; ; localTheme = this.mTheme)
    {
      return localTheme;
      if (this.YN == 0)
        this.YN = 2131493657;
      gb();
    }
  }

  public final void setTheme(int paramInt)
  {
    if (this.YN != paramInt)
    {
      this.YN = paramInt;
      gb();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.d
 * JD-Core Version:    0.6.2
 */