package android.support.v4.app;

import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

public abstract class i
{
  public static final int POP_BACK_STACK_INCLUSIVE = 1;

  public static void enableDebugLogging(boolean paramBoolean)
  {
    FragmentManagerImpl.DEBUG = paramBoolean;
  }

  public abstract void addOnBackStackChangedListener(c paramc);

  public abstract m beginTransaction();

  public abstract void dump(String paramString, FileDescriptor paramFileDescriptor, PrintWriter paramPrintWriter, String[] paramArrayOfString);

  public abstract boolean executePendingTransactions();

  public abstract Fragment findFragmentById(int paramInt);

  public abstract Fragment findFragmentByTag(String paramString);

  public abstract a getBackStackEntryAt(int paramInt);

  public abstract int getBackStackEntryCount();

  public abstract Fragment getFragment(Bundle paramBundle, String paramString);

  public abstract List<Fragment> getFragments();

  public abstract Fragment getPrimaryNavigationFragment();

  public abstract boolean isDestroyed();

  public abstract boolean isStateSaved();

  @Deprecated
  public m openTransaction()
  {
    return beginTransaction();
  }

  public abstract void popBackStack();

  public abstract void popBackStack(int paramInt1, int paramInt2);

  public abstract void popBackStack(String paramString, int paramInt);

  public abstract boolean popBackStackImmediate();

  public abstract boolean popBackStackImmediate(int paramInt1, int paramInt2);

  public abstract boolean popBackStackImmediate(String paramString, int paramInt);

  public abstract void putFragment(Bundle paramBundle, String paramString, Fragment paramFragment);

  public abstract void registerFragmentLifecycleCallbacks(b paramb, boolean paramBoolean);

  public abstract void removeOnBackStackChangedListener(c paramc);

  public abstract Fragment.SavedState saveFragmentInstanceState(Fragment paramFragment);

  public abstract void unregisterFragmentLifecycleCallbacks(b paramb);

  public static abstract interface a
  {
  }

  public static abstract class b
  {
  }

  public static abstract interface c
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.i
 * JD-Core Version:    0.6.2
 */