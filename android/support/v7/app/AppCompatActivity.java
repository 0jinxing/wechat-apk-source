package android.support.v7.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.a;
import android.support.v4.app.ae;
import android.support.v4.app.ae.a;
import android.support.v4.app.t;
import android.support.v7.view.b.a;
import android.support.v7.widget.Toolbar;
import android.support.v7.widget.bh;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import java.util.ArrayList;

public class AppCompatActivity extends FragmentActivity
  implements ae.a, c
{
  private d mDelegate;
  private Resources mResources;
  private int mThemeId = 0;

  private boolean performMenuItemShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 26) && (!paramKeyEvent.isCtrlPressed()) && (!KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState())) && (paramKeyEvent.getRepeatCount() == 0) && (!KeyEvent.isModifierKey(paramKeyEvent.getKeyCode())))
    {
      Window localWindow = getWindow();
      if ((localWindow == null) || (localWindow.getDecorView() == null) || (!localWindow.getDecorView().dispatchKeyShortcutEvent(paramKeyEvent)));
    }
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    getDelegate().addContentView(paramView, paramLayoutParams);
  }

  public void closeOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    if ((getWindow().hasFeature(0)) && ((localActionBar == null) || (!localActionBar.fg())))
      super.closeOptionsMenu();
  }

  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    ActionBar localActionBar = getSupportActionBar();
    if ((i == 82) && (localActionBar != null) && (localActionBar.b(paramKeyEvent)));
    for (boolean bool = true; ; bool = super.dispatchKeyEvent(paramKeyEvent))
      return bool;
  }

  public <T extends View> T findViewById(int paramInt)
  {
    return getDelegate().findViewById(paramInt);
  }

  public d getDelegate()
  {
    if (this.mDelegate == null)
      this.mDelegate = d.a(this, this);
    return this.mDelegate;
  }

  public a.a getDrawerToggleDelegate()
  {
    return getDelegate().getDrawerToggleDelegate();
  }

  public MenuInflater getMenuInflater()
  {
    return getDelegate().getMenuInflater();
  }

  public Resources getResources()
  {
    if ((this.mResources == null) && (bh.lw()))
      this.mResources = new bh(this, super.getResources());
    if (this.mResources == null);
    for (Resources localResources = super.getResources(); ; localResources = this.mResources)
      return localResources;
  }

  public ActionBar getSupportActionBar()
  {
    return getDelegate().getSupportActionBar();
  }

  public Intent getSupportParentActivityIntent()
  {
    return t.f(this);
  }

  public void invalidateOptionsMenu()
  {
    getDelegate().invalidateOptionsMenu();
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    getDelegate().onConfigurationChanged(paramConfiguration);
    if (this.mResources != null)
    {
      DisplayMetrics localDisplayMetrics = super.getResources().getDisplayMetrics();
      this.mResources.updateConfiguration(paramConfiguration, localDisplayMetrics);
    }
  }

  public void onContentChanged()
  {
    onSupportContentChanged();
  }

  public void onCreate(Bundle paramBundle)
  {
    d locald = getDelegate();
    locald.fk();
    locald.onCreate(paramBundle);
    if ((locald.fl()) && (this.mThemeId != 0))
    {
      if (Build.VERSION.SDK_INT < 23)
        break label55;
      onApplyThemeResource(getTheme(), this.mThemeId, false);
    }
    while (true)
    {
      super.onCreate(paramBundle);
      return;
      label55: setTheme(this.mThemeId);
    }
  }

  public void onCreateSupportNavigateUpTaskStack(ae paramae)
  {
    Intent localIntent = ((c)this).getSupportParentActivityIntent();
    if (localIntent == null)
      localIntent = t.f(this);
    while (true)
    {
      if (localIntent != null)
      {
        ComponentName localComponentName1 = localIntent.getComponent();
        ComponentName localComponentName2 = localComponentName1;
        if (localComponentName1 == null)
          localComponentName2 = localIntent.resolveActivity(paramae.Gg.getPackageManager());
        paramae.a(localComponentName2);
        paramae.Gf.add(localIntent);
      }
      return;
    }
  }

  public void onDestroy()
  {
    super.onDestroy();
    getDelegate().onDestroy();
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if (performMenuItemShortcut(paramInt, paramKeyEvent));
    for (boolean bool = true; ; bool = super.onKeyDown(paramInt, paramKeyEvent))
      return bool;
  }

  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    boolean bool;
    if (super.onMenuItemSelected(paramInt, paramMenuItem))
      bool = true;
    while (true)
    {
      return bool;
      ActionBar localActionBar = getSupportActionBar();
      if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((localActionBar.getDisplayOptions() & 0x4) != 0))
        bool = onSupportNavigateUp();
      else
        bool = false;
    }
  }

  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }

  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }

  protected void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    getDelegate().fj();
  }

  public void onPostResume()
  {
    super.onPostResume();
    getDelegate().onPostResume();
  }

  public void onPrepareSupportNavigateUpTaskStack(ae paramae)
  {
  }

  public void onSaveInstanceState(Bundle paramBundle)
  {
    super.onSaveInstanceState(paramBundle);
    getDelegate().onSaveInstanceState(paramBundle);
  }

  public void onStart()
  {
    super.onStart();
    getDelegate().onStart();
  }

  public void onStop()
  {
    super.onStop();
    getDelegate().onStop();
  }

  public void onSupportActionModeFinished(android.support.v7.view.b paramb)
  {
  }

  public void onSupportActionModeStarted(android.support.v7.view.b paramb)
  {
  }

  @Deprecated
  public void onSupportContentChanged()
  {
  }

  public boolean onSupportNavigateUp()
  {
    Object localObject = getSupportParentActivityIntent();
    if (localObject != null)
      if (supportShouldUpRecreateTask((Intent)localObject))
      {
        localObject = ae.N(this);
        onCreateSupportNavigateUpTaskStack((ae)localObject);
        onPrepareSupportNavigateUpTaskStack((ae)localObject);
        if (((ae)localObject).Gf.isEmpty())
          throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        Intent[] arrayOfIntent = (Intent[])((ae)localObject).Gf.toArray(new Intent[((ae)localObject).Gf.size()]);
        arrayOfIntent[0] = new Intent(arrayOfIntent[0]).addFlags(268484608);
        android.support.v4.content.b.a(((ae)localObject).Gg, arrayOfIntent);
      }
    while (true)
    {
      try
      {
        a.b(this);
        bool = true;
        return bool;
      }
      catch (IllegalStateException localIllegalStateException)
      {
        finish();
        continue;
      }
      supportNavigateUpTo(localIllegalStateException);
      continue;
      boolean bool = false;
    }
  }

  protected void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    getDelegate().setTitle(paramCharSequence);
  }

  public android.support.v7.view.b onWindowStartingSupportActionMode(b.a parama)
  {
    return null;
  }

  public void openOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    if ((getWindow().hasFeature(0)) && ((localActionBar == null) || (!localActionBar.ff())))
      super.openOptionsMenu();
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

  public void setSupportActionBar(Toolbar paramToolbar)
  {
    getDelegate().setSupportActionBar(paramToolbar);
  }

  @Deprecated
  public void setSupportProgress(int paramInt)
  {
  }

  @Deprecated
  public void setSupportProgressBarIndeterminate(boolean paramBoolean)
  {
  }

  @Deprecated
  public void setSupportProgressBarIndeterminateVisibility(boolean paramBoolean)
  {
  }

  @Deprecated
  public void setSupportProgressBarVisibility(boolean paramBoolean)
  {
  }

  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    this.mThemeId = paramInt;
  }

  public android.support.v7.view.b startSupportActionMode(b.a parama)
  {
    return getDelegate().startSupportActionMode(parama);
  }

  public void supportInvalidateOptionsMenu()
  {
    getDelegate().invalidateOptionsMenu();
  }

  public void supportNavigateUpTo(Intent paramIntent)
  {
    if (Build.VERSION.SDK_INT >= 16)
      navigateUpTo(paramIntent);
    while (true)
    {
      return;
      paramIntent.addFlags(67108864);
      startActivity(paramIntent);
      finish();
    }
  }

  public boolean supportRequestWindowFeature(int paramInt)
  {
    return getDelegate().requestWindowFeature(paramInt);
  }

  public boolean supportShouldUpRecreateTask(Intent paramIntent)
  {
    boolean bool;
    if (Build.VERSION.SDK_INT >= 16)
      bool = shouldUpRecreateTask(paramIntent);
    while (true)
    {
      return bool;
      paramIntent = getIntent().getAction();
      if ((paramIntent != null) && (!paramIntent.equals("android.intent.action.MAIN")))
        bool = true;
      else
        bool = false;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.AppCompatActivity
 * JD-Core Version:    0.6.2
 */