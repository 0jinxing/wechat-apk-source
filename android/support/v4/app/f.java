package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

public abstract class f
{
  public Fragment instantiate(Context paramContext, String paramString, Bundle paramBundle)
  {
    return Fragment.instantiate(paramContext, paramString, paramBundle);
  }

  public abstract View onFindViewById(int paramInt);

  public abstract boolean onHasView();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.f
 * JD-Core Version:    0.6.2
 */