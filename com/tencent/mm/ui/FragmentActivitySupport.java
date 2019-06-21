package com.tencent.mm.ui;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.i;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.ArrayList;

public abstract class FragmentActivitySupport extends Fragment
{
  public boolean hasDestory = false;
  public boolean isCurrentActivity;
  private FragmentActivity mActivity;

  public FragmentActivitySupport()
  {
    this.isCurrentActivity = false;
  }

  public FragmentActivitySupport(boolean paramBoolean)
  {
    this.isCurrentActivity = paramBoolean;
  }

  public View findViewById(int paramInt)
  {
    View localView1 = getView();
    View localView2 = null;
    if (localView1 != null)
      localView2 = localView1.findViewById(paramInt);
    if (localView2 != null);
    while (true)
    {
      return localView2;
      localView2 = thisActivity().findViewById(paramInt);
    }
  }

  public void finish()
  {
    if (this.isCurrentActivity)
      if (thisActivity() != null)
        thisActivity().finish();
    while (true)
    {
      return;
      if (thisActivity() != null)
        thisActivity().getSupportFragmentManager().popBackStack();
    }
  }

  public LayoutInflater getActivityLayoutInflater()
  {
    return thisActivity().getLayoutInflater();
  }

  public Boolean getBooleanExtra(String paramString, boolean paramBoolean)
  {
    if ((this.isCurrentActivity) && (getArguments() == null));
    for (paramString = Boolean.valueOf(thisActivity().getIntent().getBooleanExtra(paramString, paramBoolean)); ; paramString = Boolean.valueOf(getArguments().getBoolean(paramString, paramBoolean)))
      return paramString;
  }

  public ContentResolver getContentResolver()
  {
    if (thisActivity() != null);
    for (ContentResolver localContentResolver = thisActivity().getContentResolver(); ; localContentResolver = null)
      return localContentResolver;
  }

  public int getIntExtra(String paramString, int paramInt)
  {
    int i;
    if ((this.isCurrentActivity) && (getArguments() == null) && (thisActivity() != null))
      i = thisActivity().getIntent().getIntExtra(paramString, paramInt);
    while (true)
    {
      return i;
      i = paramInt;
      if (getArguments() != null)
        i = getArguments().getInt(paramString, paramInt);
    }
  }

  public long getLongExtra(String paramString, long paramLong)
  {
    long l;
    if ((this.isCurrentActivity) && (getArguments() == null))
      l = thisActivity().getIntent().getLongExtra(paramString, paramLong);
    while (true)
    {
      return l;
      l = paramLong;
      if (getArguments() != null)
        l = getArguments().getLong(paramString, paramLong);
    }
  }

  public String getPackageName()
  {
    return thisActivity().getPackageName();
  }

  public <T extends Parcelable> T getParcelableExtra(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (this.isCurrentActivity)
    {
      localObject2 = localObject1;
      if (thisActivity() != null)
        localObject2 = thisActivity().getIntent().getParcelableExtra(paramString);
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = localObject2;
      if (getArguments() != null)
        localObject1 = super.getArguments().getParcelable(paramString);
    }
    return localObject1;
  }

  public SharedPreferences getSharedPreferences(String paramString, int paramInt)
  {
    return thisActivity().getSharedPreferences(paramString, paramInt);
  }

  public ArrayList<String> getStringArrayList(String paramString)
  {
    if ((this.isCurrentActivity) && (getArguments() == null));
    for (paramString = thisActivity().getIntent().getStringArrayListExtra(paramString); ; paramString = getArguments().getStringArrayList(paramString))
      return paramString;
  }

  public String getStringExtra(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = localObject1;
    if (this.isCurrentActivity)
    {
      localObject2 = localObject1;
      if (thisActivity() != null)
        localObject2 = thisActivity().getIntent().getStringExtra(paramString);
    }
    localObject1 = localObject2;
    if (localObject2 == null)
    {
      localObject1 = localObject2;
      if (getArguments() != null)
        localObject1 = super.getArguments().getString(paramString);
    }
    return localObject1;
  }

  public Window getWindow()
  {
    if (thisActivity() != null);
    for (Window localWindow = thisActivity().getWindow(); ; localWindow = null)
      return localWindow;
  }

  public WindowManager getWindowManager()
  {
    if (thisActivity() != null);
    for (WindowManager localWindowManager = thisActivity().getWindowManager(); ; localWindowManager = null)
      return localWindowManager;
  }

  public boolean isFinishing()
  {
    if (thisActivity() == null);
    for (boolean bool = true; ; bool = thisActivity().isFinishing())
      return bool;
  }

  public boolean isShowing()
  {
    if (!this.hasDestory);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final Cursor managedQuery(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    if (thisActivity() != null);
    for (paramUri = thisActivity().managedQuery(paramUri, paramArrayOfString1, paramString1, paramArrayOfString2, paramString2); ; paramUri = null)
      return paramUri;
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    this.mActivity = getActivity();
  }

  public void onDestroy()
  {
    super.onDestroy();
    this.hasDestory = true;
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    if ((paramKeyEvent.getKeyCode() == 4) && (paramKeyEvent.getAction() == 0))
      finish();
    while (true)
    {
      return bool;
      if ((paramInt == 82) && (paramKeyEvent.getAction() == 1))
        bool = onKeyUp(paramInt, paramKeyEvent);
      else
        bool = false;
    }
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    return false;
  }

  public void openContextMenu(View paramView)
  {
    if (thisActivity() != null)
      thisActivity().openContextMenu(paramView);
  }

  public void overridePendingTransition(int paramInt1, int paramInt2)
  {
    if (thisActivity() != null)
      thisActivity().overridePendingTransition(paramInt1, paramInt2);
  }

  public void sendBroadcast(Intent paramIntent)
  {
    thisActivity().sendBroadcast(paramIntent);
  }

  public void setRequestedOrientation(int paramInt)
  {
    if (thisActivity() != null)
      thisActivity().setRequestedOrientation(paramInt);
  }

  public void setResult(int paramInt)
  {
    if (this.isCurrentActivity)
      thisActivity().setResult(paramInt);
  }

  public void setResult(int paramInt, Intent paramIntent)
  {
    if (this.isCurrentActivity)
      thisActivity().setResult(paramInt);
    while (true)
    {
      return;
      thisActivity().setResult(paramInt, paramIntent);
    }
  }

  public void startActivity(Intent paramIntent)
  {
    FragmentActivity localFragmentActivity = thisActivity();
    if (localFragmentActivity == null)
      ah.getContext().startActivity(paramIntent);
    while (true)
    {
      return;
      localFragmentActivity.startActivityFromFragment(this, paramIntent, -1);
    }
  }

  public void startFragment(Class<?> paramClass, Intent paramIntent)
  {
    if (this.isCurrentActivity)
      startActivity(paramIntent);
  }

  public FragmentActivity thisActivity()
  {
    if (this.mActivity == null)
      this.mActivity = getActivity();
    return this.mActivity;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.FragmentActivitySupport
 * JD-Core Version:    0.6.2
 */