package com.google.android.gms.auth.api;

import android.os.Bundle;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.auth.api.credentials.PasswordSpecification;
import com.google.android.gms.auth.api.proxy.ProxyApi;
import com.google.android.gms.auth.api.signin.GoogleSignInApi;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.internal.zzg;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.AbstractClientBuilder;
import com.google.android.gms.common.api.Api.ApiOptions.Optional;
import com.google.android.gms.common.api.Api.ClientKey;
import com.google.android.gms.internal.auth.zzao;
import com.google.android.gms.internal.auth.zzax;
import com.google.android.gms.internal.auth.zzbn;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class Auth
{
  public static final Api<AuthCredentialsOptions> CREDENTIALS_API;
  public static final CredentialsApi CredentialsApi;
  public static final Api<GoogleSignInOptions> GOOGLE_SIGN_IN_API;
  public static final GoogleSignInApi GoogleSignInApi;

  @KeepForSdk
  public static final Api<zzh> PROXY_API;

  @KeepForSdk
  public static final ProxyApi ProxyApi;
  public static final Api.ClientKey<zzax> zzaj;
  public static final Api.ClientKey<com.google.android.gms.auth.api.signin.internal.zzh> zzak;
  private static final Api.AbstractClientBuilder<zzax, AuthCredentialsOptions> zzal;
  private static final Api.AbstractClientBuilder<com.google.android.gms.auth.api.signin.internal.zzh, GoogleSignInOptions> zzam;

  static
  {
    AppMethodBeat.i(50307);
    zzaj = new Api.ClientKey();
    zzak = new Api.ClientKey();
    zzal = new zzd();
    zzam = new zze();
    PROXY_API = zzf.API;
    CREDENTIALS_API = new Api("Auth.CREDENTIALS_API", zzal, zzaj);
    GOOGLE_SIGN_IN_API = new Api("Auth.GOOGLE_SIGN_IN_API", zzam, zzak);
    ProxyApi = new zzbn();
    CredentialsApi = new zzao();
    GoogleSignInApi = new zzg();
    AppMethodBeat.o(50307);
  }

  @Deprecated
  public static class AuthCredentialsOptions
    implements Api.ApiOptions.Optional
  {
    private static final AuthCredentialsOptions zzan;
    private final String zzao;
    private final PasswordSpecification zzap;
    private final boolean zzaq;

    static
    {
      AppMethodBeat.i(50306);
      zzan = new Auth.AuthCredentialsOptions.Builder().zzh();
      AppMethodBeat.o(50306);
    }

    public AuthCredentialsOptions(Auth.AuthCredentialsOptions.Builder paramBuilder)
    {
      AppMethodBeat.i(50304);
      this.zzao = null;
      this.zzap = paramBuilder.zzap;
      this.zzaq = paramBuilder.zzar.booleanValue();
      AppMethodBeat.o(50304);
    }

    public final Bundle toBundle()
    {
      AppMethodBeat.i(50305);
      Bundle localBundle = new Bundle();
      localBundle.putString("consumer_package", null);
      localBundle.putParcelable("password_specification", this.zzap);
      localBundle.putBoolean("force_save_dialog", this.zzaq);
      AppMethodBeat.o(50305);
      return localBundle;
    }

    public final PasswordSpecification zzg()
    {
      return this.zzap;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.Auth
 * JD-Core Version:    0.6.2
 */