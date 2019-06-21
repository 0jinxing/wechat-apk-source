package com.facebook.internal;

import java.util.TreeSet;

abstract class NativeProtocol$NativeAppInfo
{
  private TreeSet<Integer> availableVersions;

  private void fetchAvailableVersions(boolean paramBoolean)
  {
    if (!paramBoolean);
    try
    {
      if (this.availableVersions == null)
        this.availableVersions = NativeProtocol.access$000(this);
      return;
    }
    finally
    {
    }
  }

  public TreeSet<Integer> getAvailableVersions()
  {
    if (this.availableVersions == null)
      fetchAvailableVersions(false);
    return this.availableVersions;
  }

  protected abstract String getLoginActivity();

  protected abstract String getPackage();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.facebook.internal.NativeProtocol.NativeAppInfo
 * JD-Core Version:    0.6.2
 */