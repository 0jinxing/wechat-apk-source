package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.InputStream;
import javax.annotation.Nullable;

@Deprecated
public abstract interface Channel$GetInputStreamResult extends Releasable, Result
{
  @Nullable
  public abstract InputStream getInputStream();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.Channel.GetInputStreamResult
 * JD-Core Version:    0.6.2
 */