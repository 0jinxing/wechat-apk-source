package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.zzi;
import com.google.android.gms.auth.api.signin.internal.zzq;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public final class GoogleSignIn
{
  public static GoogleSignInAccount getAccountForExtension(Context paramContext, GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
  {
    AppMethodBeat.i(50377);
    Preconditions.checkNotNull(paramContext, "please provide a valid Context object");
    Preconditions.checkNotNull(paramGoogleSignInOptionsExtension, "please provide valid GoogleSignInOptionsExtension");
    GoogleSignInAccount localGoogleSignInAccount = getLastSignedInAccount(paramContext);
    paramContext = localGoogleSignInAccount;
    if (localGoogleSignInAccount == null)
      paramContext = GoogleSignInAccount.createDefault();
    paramContext = paramContext.requestExtraScopes(zzd(paramGoogleSignInOptionsExtension.getImpliedScopes()));
    AppMethodBeat.o(50377);
    return paramContext;
  }

  public static GoogleSignInAccount getAccountForScopes(Context paramContext, Scope paramScope, Scope[] paramArrayOfScope)
  {
    AppMethodBeat.i(50376);
    Preconditions.checkNotNull(paramContext, "please provide a valid Context object");
    Preconditions.checkNotNull(paramScope, "please provide at least one valid scope");
    GoogleSignInAccount localGoogleSignInAccount = getLastSignedInAccount(paramContext);
    paramContext = localGoogleSignInAccount;
    if (localGoogleSignInAccount == null)
      paramContext = GoogleSignInAccount.createDefault();
    paramContext.requestExtraScopes(new Scope[] { paramScope });
    paramContext.requestExtraScopes(paramArrayOfScope);
    AppMethodBeat.o(50376);
    return paramContext;
  }

  public static GoogleSignInClient getClient(Activity paramActivity, GoogleSignInOptions paramGoogleSignInOptions)
  {
    AppMethodBeat.i(50373);
    paramActivity = new GoogleSignInClient(paramActivity, (GoogleSignInOptions)Preconditions.checkNotNull(paramGoogleSignInOptions));
    AppMethodBeat.o(50373);
    return paramActivity;
  }

  public static GoogleSignInClient getClient(Context paramContext, GoogleSignInOptions paramGoogleSignInOptions)
  {
    AppMethodBeat.i(50372);
    paramContext = new GoogleSignInClient(paramContext, (GoogleSignInOptions)Preconditions.checkNotNull(paramGoogleSignInOptions));
    AppMethodBeat.o(50372);
    return paramContext;
  }

  public static GoogleSignInAccount getLastSignedInAccount(Context paramContext)
  {
    AppMethodBeat.i(50375);
    paramContext = zzq.zze(paramContext).zzo();
    AppMethodBeat.o(50375);
    return paramContext;
  }

  public static Task<GoogleSignInAccount> getSignedInAccountFromIntent(Intent paramIntent)
  {
    AppMethodBeat.i(50374);
    paramIntent = zzi.getSignInResultFromIntent(paramIntent);
    if (paramIntent == null)
    {
      paramIntent = Tasks.forException(ApiExceptionUtil.fromStatus(Status.RESULT_INTERNAL_ERROR));
      AppMethodBeat.o(50374);
    }
    while (true)
    {
      return paramIntent;
      if ((!paramIntent.getStatus().isSuccess()) || (paramIntent.getSignInAccount() == null))
      {
        paramIntent = Tasks.forException(ApiExceptionUtil.fromStatus(paramIntent.getStatus()));
        AppMethodBeat.o(50374);
      }
      else
      {
        paramIntent = Tasks.forResult(paramIntent.getSignInAccount());
        AppMethodBeat.o(50374);
      }
    }
  }

  public static boolean hasPermissions(GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
  {
    AppMethodBeat.i(50378);
    Preconditions.checkNotNull(paramGoogleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
    boolean bool = hasPermissions(paramGoogleSignInAccount, zzd(paramGoogleSignInOptionsExtension.getImpliedScopes()));
    AppMethodBeat.o(50378);
    return bool;
  }

  public static boolean hasPermissions(GoogleSignInAccount paramGoogleSignInAccount, Scope[] paramArrayOfScope)
  {
    AppMethodBeat.i(50379);
    boolean bool;
    if (paramGoogleSignInAccount == null)
    {
      bool = false;
      AppMethodBeat.o(50379);
    }
    while (true)
    {
      return bool;
      HashSet localHashSet = new HashSet();
      Collections.addAll(localHashSet, paramArrayOfScope);
      bool = paramGoogleSignInAccount.getGrantedScopes().containsAll(localHashSet);
      AppMethodBeat.o(50379);
    }
  }

  public static void requestPermissions(Activity paramActivity, int paramInt, GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
  {
    AppMethodBeat.i(50380);
    Preconditions.checkNotNull(paramActivity, "Please provide a non-null Activity");
    Preconditions.checkNotNull(paramGoogleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
    requestPermissions(paramActivity, paramInt, paramGoogleSignInAccount, zzd(paramGoogleSignInOptionsExtension.getImpliedScopes()));
    AppMethodBeat.o(50380);
  }

  public static void requestPermissions(Activity paramActivity, int paramInt, GoogleSignInAccount paramGoogleSignInAccount, Scope[] paramArrayOfScope)
  {
    AppMethodBeat.i(50382);
    Preconditions.checkNotNull(paramActivity, "Please provide a non-null Activity");
    Preconditions.checkNotNull(paramArrayOfScope, "Please provide at least one scope");
    paramActivity.startActivityForResult(zzd(paramActivity, paramGoogleSignInAccount, paramArrayOfScope), paramInt);
    AppMethodBeat.o(50382);
  }

  public static void requestPermissions(Fragment paramFragment, int paramInt, GoogleSignInAccount paramGoogleSignInAccount, GoogleSignInOptionsExtension paramGoogleSignInOptionsExtension)
  {
    AppMethodBeat.i(50381);
    Preconditions.checkNotNull(paramFragment, "Please provide a non-null Fragment");
    Preconditions.checkNotNull(paramGoogleSignInOptionsExtension, "Please provide a non-null GoogleSignInOptionsExtension");
    requestPermissions(paramFragment, paramInt, paramGoogleSignInAccount, zzd(paramGoogleSignInOptionsExtension.getImpliedScopes()));
    AppMethodBeat.o(50381);
  }

  public static void requestPermissions(Fragment paramFragment, int paramInt, GoogleSignInAccount paramGoogleSignInAccount, Scope[] paramArrayOfScope)
  {
    AppMethodBeat.i(50383);
    Preconditions.checkNotNull(paramFragment, "Please provide a non-null Fragment");
    Preconditions.checkNotNull(paramArrayOfScope, "Please provide at least one scope");
    paramFragment.startActivityForResult(zzd(paramFragment.getActivity(), paramGoogleSignInAccount, paramArrayOfScope), paramInt);
    AppMethodBeat.o(50383);
  }

  private static Intent zzd(Activity paramActivity, GoogleSignInAccount paramGoogleSignInAccount, Scope[] paramArrayOfScope)
  {
    AppMethodBeat.i(50384);
    GoogleSignInOptions.Builder localBuilder = new GoogleSignInOptions.Builder();
    if (paramArrayOfScope.length > 0)
      localBuilder.requestScopes(paramArrayOfScope[0], paramArrayOfScope);
    if ((paramGoogleSignInAccount != null) && (!TextUtils.isEmpty(paramGoogleSignInAccount.getEmail())))
      localBuilder.setAccountName(paramGoogleSignInAccount.getEmail());
    paramActivity = new GoogleSignInClient(paramActivity, localBuilder.build()).getSignInIntent();
    AppMethodBeat.o(50384);
    return paramActivity;
  }

  private static Scope[] zzd(List<Scope> paramList)
  {
    AppMethodBeat.i(50385);
    if (paramList == null)
    {
      paramList = new Scope[0];
      AppMethodBeat.o(50385);
    }
    while (true)
    {
      return paramList;
      paramList = (Scope[])paramList.toArray(new Scope[paramList.size()]);
      AppMethodBeat.o(50385);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.GoogleSignIn
 * JD-Core Version:    0.6.2
 */