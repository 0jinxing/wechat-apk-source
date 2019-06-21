package android.support.v7.view.menu;

import android.content.Context;
import android.support.v4.b.a.b;
import android.support.v4.view.b.b;
import android.view.ActionProvider;
import android.view.ActionProvider.VisibilityListener;
import android.view.MenuItem;
import android.view.View;

final class l extends k
{
  l(Context paramContext, b paramb)
  {
    super(paramContext, paramb);
  }

  final k.a a(ActionProvider paramActionProvider)
  {
    return new a(this.mContext, paramActionProvider);
  }

  final class a extends k.a
    implements ActionProvider.VisibilityListener
  {
    b.b acf;

    public a(Context paramActionProvider, ActionProvider arg3)
    {
      super(paramActionProvider, localActionProvider);
    }

    public final void a(b.b paramb)
    {
      this.acf = paramb;
      this.acc.setVisibilityListener(this);
    }

    public final boolean isVisible()
    {
      return this.acc.isVisible();
    }

    public final void onActionProviderVisibilityChanged(boolean paramBoolean)
    {
      if (this.acf != null)
        this.acf.en();
    }

    public final View onCreateActionView(MenuItem paramMenuItem)
    {
      return this.acc.onCreateActionView(paramMenuItem);
    }

    public final boolean overridesItemVisibility()
    {
      return this.acc.overridesItemVisibility();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.menu.l
 * JD-Core Version:    0.6.2
 */