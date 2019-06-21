package com.google.android.gms.wearable;

import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import java.io.OutputStream;
import javax.annotation.Nullable;

@Deprecated
public abstract interface Channel$GetOutputStreamResult extends Releasable, Result
{
  @Nullable
  public abstract OutputStream getOutputStream();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.android.gms.wearable.Channel.GetOutputStreamResult
 * JD-Core Version:    0.6.2
 */