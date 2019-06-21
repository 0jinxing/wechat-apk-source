package android.support.v7.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.view.b;
import android.support.v7.view.b.a;
import android.support.v7.widget.Toolbar;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;

public abstract class d
{
  static int UB = -1;
  private static boolean UC = false;

  public static d a(Activity paramActivity, c paramc)
  {
    return a(paramActivity, paramActivity.getWindow(), paramc);
  }

  public static d a(Dialog paramDialog, c paramc)
  {
    return a(paramDialog.getContext(), paramDialog.getWindow(), paramc);
  }

  private static d a(Context paramContext, Window paramWindow, c paramc)
  {
    if (Build.VERSION.SDK_INT >= 24)
      paramContext = new f(paramContext, paramWindow, paramc);
    while (true)
    {
      return paramContext;
      if (Build.VERSION.SDK_INT >= 23)
        paramContext = new h(paramContext, paramWindow, paramc);
      else
        paramContext = new g(paramContext, paramWindow, paramc);
    }
  }

  public static boolean fm()
  {
    return UC;
  }

  public abstract void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  public abstract <T extends View> T findViewById(int paramInt);

  public abstract void fj();

  public abstract void fk();

  public abstract boolean fl();

  public abstract a.a getDrawerToggleDelegate();

  public abstract MenuInflater getMenuInflater();

  public abstract ActionBar getSupportActionBar();

  public abstract void invalidateOptionsMenu();

  public abstract void onConfigurationChanged(Configuration paramConfiguration);

  public abstract void onCreate(Bundle paramBundle);

  public abstract void onDestroy();

  public abstract void onPostResume();

  public abstract void onSaveInstanceState(Bundle paramBundle);

  public abstract void onStart();

  public abstract void onStop();

  public abstract boolean requestWindowFeature(int paramInt);

  public abstract void setContentView(int paramInt);

  public abstract void setContentView(View paramView);

  public abstract void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams);

  public abstract void setSupportActionBar(Toolbar paramToolbar);

  public abstract void setTitle(CharSequence paramCharSequence);

  public abstract b startSupportActionMode(b.a parama);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.d
 * JD-Core Version:    0.6.2
 */