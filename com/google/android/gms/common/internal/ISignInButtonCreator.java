package com.google.android.gms.common.internal;

import android.os.IInterface;
import com.google.android.gms.dynamic.IObjectWrapper;

public abstract interface ISignInButtonCreator extends IInterface
{
  public abstract IObjectWrapper newSignInButton(IObjectWrapper paramIObjectWrapper, int paramInt1, int paramInt2);

  public abstract IObjectWrapper newSignInButtonFromConfig(IObjectWrapper paramIObjectWrapper, SignInButtonConfig paramSignInButtonConfig);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.internal.ISignInButtonCreator
 * JD-Core Version:    0.6.2
 */