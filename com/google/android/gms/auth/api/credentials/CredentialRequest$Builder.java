package com.google.android.gms.auth.api.credentials;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class CredentialRequest$Builder
{
  private boolean zzcu;
  private String[] zzcv;
  private CredentialPickerConfig zzcw;
  private CredentialPickerConfig zzcx;
  private boolean zzcy = false;
  private String zzcz = null;
  private String zzda;
  private boolean zzdb = false;

  public final CredentialRequest build()
  {
    AppMethodBeat.i(50321);
    if (this.zzcv == null)
      this.zzcv = new String[0];
    if ((!this.zzcu) && (this.zzcv.length == 0))
    {
      localObject = new IllegalStateException("At least one authentication method must be specified");
      AppMethodBeat.o(50321);
      throw ((Throwable)localObject);
    }
    Object localObject = new CredentialRequest(this, null);
    AppMethodBeat.o(50321);
    return localObject;
  }

  public final Builder setAccountTypes(String[] paramArrayOfString)
  {
    String[] arrayOfString = paramArrayOfString;
    if (paramArrayOfString == null)
      arrayOfString = new String[0];
    this.zzcv = arrayOfString;
    return this;
  }

  public final Builder setCredentialHintPickerConfig(CredentialPickerConfig paramCredentialPickerConfig)
  {
    this.zzcx = paramCredentialPickerConfig;
    return this;
  }

  public final Builder setCredentialPickerConfig(CredentialPickerConfig paramCredentialPickerConfig)
  {
    this.zzcw = paramCredentialPickerConfig;
    return this;
  }

  public final Builder setIdTokenNonce(String paramString)
  {
    this.zzda = paramString;
    return this;
  }

  public final Builder setIdTokenRequested(boolean paramBoolean)
  {
    this.zzcy = paramBoolean;
    return this;
  }

  public final Builder setPasswordLoginSupported(boolean paramBoolean)
  {
    this.zzcu = paramBoolean;
    return this;
  }

  public final Builder setServerClientId(String paramString)
  {
    this.zzcz = paramString;
    return this;
  }

  @Deprecated
  public final Builder setSupportsPasswordLogin(boolean paramBoolean)
  {
    AppMethodBeat.i(50320);
    Builder localBuilder = setPasswordLoginSupported(paramBoolean);
    AppMethodBeat.o(50320);
    return localBuilder;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.credentials.CredentialRequest.Builder
 * JD-Core Version:    0.6.2
 */