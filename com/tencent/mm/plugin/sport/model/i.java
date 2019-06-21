package com.tencent.mm.plugin.sport.model;

import android.database.MatrixCursor;
import android.os.Bundle;

public final class i extends MatrixCursor
{
  private Bundle mqu;

  public i(String[] paramArrayOfString, Bundle paramBundle)
  {
    super(paramArrayOfString);
    this.mqu = paramBundle;
  }

  public final Bundle getExtras()
  {
    return this.mqu;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.i
 * JD-Core Version:    0.6.2
 */