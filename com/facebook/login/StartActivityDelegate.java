package com.facebook.login;

import android.app.Activity;
import android.content.Intent;

abstract interface StartActivityDelegate
{
  public abstract Activity getActivityContext();

  public abstract void startActivityForResult(Intent paramIntent, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.facebook.login.StartActivityDelegate
 * JD-Core Version:    0.6.2
 */