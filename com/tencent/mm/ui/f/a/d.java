package com.tencent.mm.ui.f.a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.CallbackManager.Factory;
import com.facebook.FacebookCallback;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.login.LoginManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Calendar;

public final class d
{
  private final String mAppId;
  long zxC;
  public AccessToken zxJ;
  private CallbackManager zxK;
  b zxL;
  private FacebookCallback zxM;

  public d(String paramString)
  {
    AppMethodBeat.i(80314);
    this.zxM = new d.1(this);
    if (paramString == null)
    {
      paramString = new IllegalArgumentException("You must specify your application ID when instantiating a Facebook object. See README for details.");
      AppMethodBeat.o(80314);
      throw paramString;
    }
    this.mAppId = paramString;
    AppMethodBeat.o(80314);
  }

  private static void dJe()
  {
    AppMethodBeat.i(80316);
    try
    {
      Calendar localCalendar = Calendar.getInstance();
      localCalendar.set(1, localCalendar.get(1) + 100);
      Field localField1 = AttributionIdentifiers.class.getDeclaredField("recentlyFetchedIdentifiers");
      Field localField2 = AttributionIdentifiers.class.getDeclaredField("fetchTime");
      localField2.setAccessible(true);
      AttributionIdentifiers localAttributionIdentifiers = new com/facebook/internal/AttributionIdentifiers;
      localAttributionIdentifiers.<init>();
      localField2.set(localAttributionIdentifiers, Long.valueOf(localCalendar.getTimeInMillis()));
      localField1.setAccessible(true);
      localField1.set(AttributionIdentifiers.class, localAttributionIdentifiers);
      AppMethodBeat.o(80316);
      return;
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.FacebookAndroid", localException.getMessage());
      RuntimeException localRuntimeException = new RuntimeException(localException);
      AppMethodBeat.o(80316);
      throw localRuntimeException;
    }
  }

  public final void a(Activity paramActivity, b paramb, String[] paramArrayOfString)
  {
    AppMethodBeat.i(80317);
    LoginManager.getInstance().registerCallback(this.zxK, this.zxM);
    this.zxL = paramb;
    LoginManager.getInstance().logInWithReadPermissions(paramActivity, Arrays.asList(paramArrayOfString));
    AppMethodBeat.o(80317);
  }

  public final void a(String paramString, d.a parama)
  {
    AppMethodBeat.i(80318);
    Bundle localBundle = new Bundle();
    localBundle.putString("fields", paramString);
    new GraphRequest(this.zxJ, "me", localBundle, HttpMethod.GET, new d.2(this, parama)).executeAsync();
    AppMethodBeat.o(80318);
  }

  public final boolean dJc()
  {
    AppMethodBeat.i(80319);
    boolean bool;
    if ((this.zxJ != null) && ((this.zxC == 0L) || (System.currentTimeMillis() < this.zxC)))
    {
      bool = true;
      AppMethodBeat.o(80319);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(80319);
    }
  }

  public final void dJd()
  {
    AppMethodBeat.i(80315);
    dJe();
    FacebookSdk.setApplicationId(this.mAppId);
    FacebookSdk.sdkInitialize(ah.getContext());
    ab.i("MicroMsg.FacebookAndroid", "installerPkg %s", new Object[] { AttributionIdentifiers.getAttributionIdentifiers(ah.getContext()).getAndroidInstallerPackage() });
    this.zxK = CallbackManager.Factory.create();
    AppMethodBeat.o(80315);
  }

  public final void h(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(80320);
    if (this.zxK != null)
      this.zxK.onActivityResult(paramInt1, paramInt2, paramIntent);
    AppMethodBeat.o(80320);
  }

  public final void logout()
  {
    AppMethodBeat.i(80321);
    this.zxJ = null;
    this.zxC = 0L;
    this.zxL = null;
    LoginManager.getInstance().logOut();
    AppMethodBeat.o(80321);
  }

  public static abstract interface b
  {
    public abstract void onCancel();

    public abstract void onError(String paramString);

    public abstract void onSuccess();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.f.a.d
 * JD-Core Version:    0.6.2
 */