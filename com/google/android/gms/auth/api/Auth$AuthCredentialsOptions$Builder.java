package com.google.android.gms.auth.api;

import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.tencent.matrix.trace.core.AppMethodBeat;

@Deprecated
public class Auth$AuthCredentialsOptions$Builder
{
  protected PasswordSpecification zzap = PasswordSpecification.zzdg;
  protected Boolean zzar = Boolean.FALSE;

  public Builder forceEnableSaveDialog()
  {
    this.zzar = Boolean.TRUE;
    return this;
  }

  public Auth.AuthCredentialsOptions zzh()
  {
    AppMethodBeat.i(50303);
    Auth.AuthCredentialsOptions localAuthCredentialsOptions = new Auth.AuthCredentialsOptions(this);
    AppMethodBeat.o(50303);
    return localAuthCredentialsOptions;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.Auth.AuthCredentialsOptions.Builder
 * JD-Core Version:    0.6.2
 */