package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup.LayoutParams;

public class i extends Dialog
  implements c
{
  private d mDelegate;

  public i(Context paramContext, int paramInt)
  {
    super(paramContext, i);
    getDelegate().onCreate(null);
    getDelegate().fl();
  }

  private d getDelegate()
  {
    if (this.mDelegate == null)
      this.mDelegate = d.a(this, this);
    return this.mDelegate;
  }

  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    getDelegate().addContentView(paramView, paramLayoutParams);
  }

  public final boolean fA()
  {
    return getDelegate().requestWindowFeature(1);
  }

  public <T extends View> T findViewById(int paramInt)
  {
    return getDelegate().findViewById(paramInt);
  }

  public void invalidateOptionsMenu()
  {
    getDelegate().invalidateOptionsMenu();
  }

  protected void onCreate(Bundle paramBundle)
  {
    getDelegate().fk();
    super.onCreate(paramBundle);
    getDelegate().onCreate(paramBundle);
  }

  protected void onStop()
  {
    super.onStop();
    getDelegate().onStop();
  }

  public void onSupportActionModeFinished(b paramb)
  {
  }

  public void onSupportActionModeStarted(b paramb)
  {
  }

  public b onWindowStartingSupportActionMode(b.a parama)
  {
    return null;
  }

  public void setContentView(int paramInt)
  {
    getDelegate().setContentView(paramInt);
  }

  public void setContentView(View paramView)
  {
    getDelegate().setContentView(paramView);
  }

  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    getDelegate().setContentView(paramView, paramLayoutParams);
  }

  public void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    getDelegate().setTitle(getContext().getString(paramInt));
  }

  public void setTitle(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    getDelegate().setTitle(paramCharSequence);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.i
 * JD-Core Version:    0.6.2
 */