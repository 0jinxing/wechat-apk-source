package android.support.v7.view;

import android.content.Context;
import android.support.v7.view.menu.h;
import android.support.v7.view.menu.h.a;
import android.support.v7.widget.ActionBarContextView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.lang.ref.WeakReference;

public final class e extends b
  implements h.a
{
  private ActionBarContextView WK;
  private b.a Xi;
  private WeakReference<View> Xj;
  private boolean YP;
  private h lo;
  private Context mContext;
  private boolean mFinished;

  public e(Context paramContext, ActionBarContextView paramActionBarContextView, b.a parama, boolean paramBoolean)
  {
    this.mContext = paramContext;
    this.WK = paramActionBarContextView;
    this.Xi = parama;
    paramContext = new h(paramActionBarContextView.getContext());
    paramContext.abx = 1;
    this.lo = paramContext;
    this.lo.a(this);
    this.YP = paramBoolean;
  }

  public final boolean a(h paramh, MenuItem paramMenuItem)
  {
    return this.Xi.a(this, paramMenuItem);
  }

  public final void b(h paramh)
  {
    invalidate();
    this.WK.showOverflowMenu();
  }

  public final void finish()
  {
    if (this.mFinished);
    while (true)
    {
      return;
      this.mFinished = true;
      this.WK.sendAccessibilityEvent(32);
      this.Xi.a(this);
    }
  }

  public final View getCustomView()
  {
    if (this.Xj != null);
    for (View localView = (View)this.Xj.get(); ; localView = null)
      return localView;
  }

  public final Menu getMenu()
  {
    return this.lo;
  }

  public final MenuInflater getMenuInflater()
  {
    return new g(this.WK.getContext());
  }

  public final CharSequence getSubtitle()
  {
    return this.WK.getSubtitle();
  }

  public final CharSequence getTitle()
  {
    return this.WK.getTitle();
  }

  public final void invalidate()
  {
    this.Xi.b(this, this.lo);
  }

  public final boolean isTitleOptional()
  {
    return this.WK.acR;
  }

  public final void setCustomView(View paramView)
  {
    this.WK.setCustomView(paramView);
    if (paramView != null);
    for (paramView = new WeakReference(paramView); ; paramView = null)
    {
      this.Xj = paramView;
      return;
    }
  }

  public final void setSubtitle(int paramInt)
  {
    setSubtitle(this.mContext.getString(paramInt));
  }

  public final void setSubtitle(CharSequence paramCharSequence)
  {
    this.WK.setSubtitle(paramCharSequence);
  }

  public final void setTitle(int paramInt)
  {
    setTitle(this.mContext.getString(paramInt));
  }

  public final void setTitle(CharSequence paramCharSequence)
  {
    this.WK.setTitle(paramCharSequence);
  }

  public final void setTitleOptionalHint(boolean paramBoolean)
  {
    super.setTitleOptionalHint(paramBoolean);
    this.WK.setTitleOptional(paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.e
 * JD-Core Version:    0.6.2
 */