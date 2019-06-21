package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.a.a;
import com.google.firebase.components.e;
import com.google.firebase.components.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.List;

@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar
  implements e
{
  @SuppressLint({"MissingPermission"})
  @Keep
  @KeepForSdk
  public List<com.google.firebase.components.a<?>> getComponents()
  {
    AppMethodBeat.i(67875);
    List localList = Collections.singletonList(com.google.firebase.components.a.y(com.google.firebase.analytics.connector.a.class).a(f.A(com.google.firebase.a.class)).a(f.A(Context.class)).a(a.buN).uA());
    AppMethodBeat.o(67875);
    return localList;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar
 * JD-Core Version:    0.6.2
 */