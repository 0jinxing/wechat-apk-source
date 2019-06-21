package android.support.v4.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import java.io.PrintWriter;

public abstract class h<E> extends f
{
  final int CX;
  final Activity mActivity;
  final Context mContext;
  final FragmentManagerImpl mFragmentManager = new FragmentManagerImpl();
  final Handler mHandler;

  private h(Activity paramActivity, Context paramContext, Handler paramHandler)
  {
    this.mActivity = paramActivity;
    this.mContext = paramContext;
    this.mHandler = paramHandler;
    this.CX = 0;
  }

  h(FragmentActivity paramFragmentActivity)
  {
    this(paramFragmentActivity, paramFragmentActivity, paramFragmentActivity.mHandler);
  }

  public boolean H(String paramString)
  {
    return false;
  }

  public void a(Fragment paramFragment, Intent paramIntent, int paramInt, Bundle paramBundle)
  {
    if (paramInt != -1)
      throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    this.mContext.startActivity(paramIntent);
  }

  public void a(Fragment paramFragment, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle)
  {
    if (paramInt1 != -1)
      throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    a.a(this.mActivity, paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
  }

  public void a(Fragment paramFragment, String[] paramArrayOfString, int paramInt)
  {
  }

  public void a(String paramString, PrintWriter paramPrintWriter, String[] paramArrayOfString)
  {
  }

  public boolean dl()
  {
    return true;
  }

  public void dm()
  {
  }

  void onAttachFragment(Fragment paramFragment)
  {
  }

  public View onFindViewById(int paramInt)
  {
    return null;
  }

  public abstract E onGetHost();

  public LayoutInflater onGetLayoutInflater()
  {
    return LayoutInflater.from(this.mContext);
  }

  public int onGetWindowAnimations()
  {
    return this.CX;
  }

  public boolean onHasView()
  {
    return true;
  }

  public boolean onHasWindowAnimations()
  {
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.app.h
 * JD-Core Version:    0.6.2
 */