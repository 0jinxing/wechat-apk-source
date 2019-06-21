package com.tencent.mm.plugin.wear.model.a;

import android.net.Uri;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.wearable.Asset;
import java.util.HashSet;

public abstract interface b
{
  public abstract b.a B(String paramString, byte[] paramArrayOfByte);

  public abstract b.a C(String paramString, byte[] paramArrayOfByte);

  public abstract byte[] a(Asset paramAsset);

  public abstract void cUv();

  public abstract GoogleApiClient cUw();

  public abstract HashSet<String> cUx();

  public abstract boolean cUy();

  public abstract void cUz();

  public abstract void finish();

  public abstract boolean isAvailable();

  public abstract boolean q(Uri paramUri);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wear.model.a.b
 * JD-Core Version:    0.6.2
 */