package com.google.android.gms.common.util;

import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.Preconditions;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public final class ScopeUtil
{
  public static Set<Scope> fromScopeString(Collection<String> paramCollection)
  {
    AppMethodBeat.i(90263);
    Preconditions.checkNotNull(paramCollection, "scopeStrings can't be null.");
    paramCollection = fromScopeString((String[])paramCollection.toArray(new String[paramCollection.size()]));
    AppMethodBeat.o(90263);
    return paramCollection;
  }

  public static Set<Scope> fromScopeString(String[] paramArrayOfString)
  {
    AppMethodBeat.i(90264);
    Preconditions.checkNotNull(paramArrayOfString, "scopeStrings can't be null.");
    HashSet localHashSet = new HashSet(paramArrayOfString.length);
    int i = 0;
    int j = paramArrayOfString.length;
    while (i < j)
    {
      String str = paramArrayOfString[i];
      if (!TextUtils.isEmpty(str))
        localHashSet.add(new Scope(str));
      i++;
    }
    AppMethodBeat.o(90264);
    return localHashSet;
  }

  public static String[] toScopeString(Set<Scope> paramSet)
  {
    AppMethodBeat.i(90266);
    Preconditions.checkNotNull(paramSet, "scopes can't be null.");
    paramSet = toScopeString((Scope[])paramSet.toArray(new Scope[paramSet.size()]));
    AppMethodBeat.o(90266);
    return paramSet;
  }

  public static String[] toScopeString(Scope[] paramArrayOfScope)
  {
    AppMethodBeat.i(90265);
    Preconditions.checkNotNull(paramArrayOfScope, "scopes can't be null.");
    String[] arrayOfString = new String[paramArrayOfScope.length];
    for (int i = 0; i < paramArrayOfScope.length; i++)
      arrayOfString[i] = paramArrayOfScope[i].getScopeUri();
    AppMethodBeat.o(90265);
    return arrayOfString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.ScopeUtil
 * JD-Core Version:    0.6.2
 */