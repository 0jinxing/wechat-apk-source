package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.support.v7.view.menu.ListMenuItemView;
import android.support.v7.view.menu.g;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.j;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public final class ak extends ListPopupWindow
  implements aj
{
  private static Method amJ;
  public aj amK;

  static
  {
    try
    {
      amJ = PopupWindow.class.getDeclaredMethod("setTouchModal", new Class[] { Boolean.TYPE });
      label20: return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label20;
    }
  }

  public ak(Context paramContext, int paramInt1, int paramInt2)
  {
    super(paramContext, null, paramInt1, paramInt2);
  }

  public final void b(h paramh, MenuItem paramMenuItem)
  {
    if (this.amK != null)
      this.amK.b(paramh, paramMenuItem);
  }

  public final void c(h paramh, MenuItem paramMenuItem)
  {
    if (this.amK != null)
      this.amK.c(paramh, paramMenuItem);
  }

  final ab g(Context paramContext, boolean paramBoolean)
  {
    paramContext = new a(paramContext, paramBoolean);
    paramContext.setHoverListener(this);
    return paramContext;
  }

  public final void jb()
  {
    if (Build.VERSION.SDK_INT >= 23)
      this.amH.setEnterTransition(null);
  }

  public final void jc()
  {
    if (amJ != null);
    try
    {
      amJ.invoke(this.amH, new Object[] { Boolean.FALSE });
      label27: return;
    }
    catch (Exception localException)
    {
      break label27;
    }
  }

  public static final class a extends ab
  {
    private aj amK;
    final int amL;
    final int amM;
    private MenuItem amN;

    public a(Context paramContext, boolean paramBoolean)
    {
      super(paramBoolean);
      paramContext = paramContext.getResources().getConfiguration();
      if ((Build.VERSION.SDK_INT >= 17) && (1 == paramContext.getLayoutDirection()))
        this.amL = 21;
      for (this.amM = 22; ; this.amM = 21)
      {
        return;
        this.amL = 22;
      }
    }

    public final boolean onHoverEvent(MotionEvent paramMotionEvent)
    {
      Object localObject;
      int i;
      if (this.amK != null)
      {
        localObject = getAdapter();
        if (!(localObject instanceof HeaderViewListAdapter))
          break label156;
        localObject = (HeaderViewListAdapter)localObject;
        i = ((HeaderViewListAdapter)localObject).getHeadersCount();
        localObject = (g)((HeaderViewListAdapter)localObject).getWrappedAdapter();
        if (paramMotionEvent.getAction() == 10)
          break label166;
        int j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
        if (j == -1)
          break label166;
        i = j - i;
        if ((i < 0) || (i >= ((g)localObject).getCount()))
          break label166;
      }
      label156: label166: for (j localj = ((g)localObject).br(i); ; localj = null)
      {
        MenuItem localMenuItem = this.amN;
        if (localMenuItem != localj)
        {
          localObject = ((g)localObject).abn;
          if (localMenuItem != null)
            this.amK.b((h)localObject, localMenuItem);
          this.amN = localj;
          if (localj != null)
            this.amK.c((h)localObject, localj);
        }
        return super.onHoverEvent(paramMotionEvent);
        i = 0;
        localObject = (g)localObject;
        break;
      }
    }

    public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
    {
      ListMenuItemView localListMenuItemView = (ListMenuItemView)getSelectedView();
      boolean bool;
      if ((localListMenuItemView != null) && (paramInt == this.amL))
      {
        if ((localListMenuItemView.isEnabled()) && (localListMenuItemView.getItemData().hasSubMenu()))
          performItemClick(localListMenuItemView, getSelectedItemPosition(), getSelectedItemId());
        bool = true;
      }
      while (true)
      {
        return bool;
        if ((localListMenuItemView != null) && (paramInt == this.amM))
        {
          setSelection(-1);
          ((g)getAdapter()).abn.U(false);
          bool = true;
        }
        else
        {
          bool = super.onKeyDown(paramInt, paramKeyEvent);
        }
      }
    }

    public final void setHoverListener(aj paramaj)
    {
      this.amK = paramaj;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.widget.ak
 * JD-Core Version:    0.6.2
 */