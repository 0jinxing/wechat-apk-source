package android.support.v7.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b
{
  boolean YM;
  Object sO;

  public abstract void finish();

  public abstract View getCustomView();

  public abstract Menu getMenu();

  public abstract MenuInflater getMenuInflater();

  public abstract CharSequence getSubtitle();

  public abstract CharSequence getTitle();

  public abstract void invalidate();

  public boolean isTitleOptional()
  {
    return false;
  }

  public abstract void setCustomView(View paramView);

  public abstract void setSubtitle(int paramInt);

  public abstract void setSubtitle(CharSequence paramCharSequence);

  public abstract void setTitle(int paramInt);

  public abstract void setTitle(CharSequence paramCharSequence);

  public void setTitleOptionalHint(boolean paramBoolean)
  {
    this.YM = paramBoolean;
  }

  public static abstract interface a
  {
    public abstract void a(b paramb);

    public abstract boolean a(b paramb, Menu paramMenu);

    public abstract boolean a(b paramb, MenuItem paramMenuItem);

    public abstract boolean b(b paramb, Menu paramMenu);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.view.b
 * JD-Core Version:    0.6.2
 */