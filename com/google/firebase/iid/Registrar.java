package com.google.firebase.iid;

import android.support.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.a.a;
import com.google.firebase.components.e;
import com.google.firebase.components.f;
import com.google.firebase.components.r;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;
import java.util.List;

@Keep
@KeepForSdk
public final class Registrar
  implements e
{
  @Keep
  public final List<com.google.firebase.components.a<?>> getComponents()
  {
    AppMethodBeat.i(108712);
    Object localObject = com.google.firebase.components.a.y(FirebaseInstanceId.class).a(f.A(com.google.firebase.a.class)).a(g.bvI);
    if (((a.a)localObject).zzad == 0);
    for (boolean bool = true; ; bool = false)
    {
      r.c(bool, "Instantiation type has already been set.");
      ((a.a)localObject).zzad = 1;
      localObject = Arrays.asList(new com.google.firebase.components.a[] { ((a.a)localObject).uA(), com.google.firebase.components.a.y(com.google.firebase.iid.a.a.class).a(f.A(FirebaseInstanceId.class)).a(h.bvI).uA() });
      AppMethodBeat.o(108712);
      return localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.Registrar
 * JD-Core Version:    0.6.2
 */