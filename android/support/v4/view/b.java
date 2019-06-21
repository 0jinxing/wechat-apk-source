package android.support.v4.view;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b
{
  public a LG;
  public b LH;
  private final Context mContext;

  public b(Context paramContext)
  {
    this.mContext = paramContext;
  }

  public final void E(boolean paramBoolean)
  {
    if (this.LG != null)
      this.LG.F(paramBoolean);
  }

  public void a(b paramb)
  {
    if (this.LH != null)
      new StringBuilder("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ").append(getClass().getSimpleName()).append(" instance while it is still in use somewhere else?");
    this.LH = paramb;
  }

  public boolean hasSubMenu()
  {
    return false;
  }

  public boolean isVisible()
  {
    return true;
  }

  public abstract View onCreateActionView();

  public View onCreateActionView(MenuItem paramMenuItem)
  {
    return onCreateActionView();
  }

  public boolean onPerformDefaultAction()
  {
    return false;
  }

  public void onPrepareSubMenu(SubMenu paramSubMenu)
  {
  }

  public boolean overridesItemVisibility()
  {
    return false;
  }

  public static abstract interface a
  {
    public abstract void F(boolean paramBoolean);
  }

  public static abstract interface b
  {
    public abstract void en();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.view.b
 * JD-Core Version:    0.6.2
 */