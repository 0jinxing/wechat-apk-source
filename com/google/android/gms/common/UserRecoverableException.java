package com.google.android.gms.common;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class UserRecoverableException extends Exception
{
  private final Intent mIntent;

  public UserRecoverableException(String paramString, Intent paramIntent)
  {
    super(paramString);
    this.mIntent = paramIntent;
  }

  public Intent getIntent()
  {
    AppMethodBeat.i(89440);
    Intent localIntent = new Intent(this.mIntent);
    AppMethodBeat.o(89440);
    return localIntent;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.UserRecoverableException
 * JD-Core Version:    0.6.2
 */