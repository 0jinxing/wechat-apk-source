package com.google.android.gms.dynamite;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class zze
  implements DynamiteModule.VersionPolicy
{
  public final DynamiteModule.VersionPolicy.SelectionResult selectModule(Context paramContext, String paramString, DynamiteModule.VersionPolicy.IVersions paramIVersions)
  {
    AppMethodBeat.i(90453);
    DynamiteModule.VersionPolicy.SelectionResult localSelectionResult = new DynamiteModule.VersionPolicy.SelectionResult();
    localSelectionResult.localVersion = paramIVersions.getLocalVersion(paramContext, paramString);
    if (localSelectionResult.localVersion != 0)
    {
      localSelectionResult.remoteVersion = paramIVersions.getRemoteVersion(paramContext, paramString, false);
      if ((localSelectionResult.localVersion != 0) || (localSelectionResult.remoteVersion != 0))
        break label96;
      localSelectionResult.selection = 0;
    }
    while (true)
    {
      AppMethodBeat.o(90453);
      return localSelectionResult;
      localSelectionResult.remoteVersion = paramIVersions.getRemoteVersion(paramContext, paramString, true);
      break;
      label96: if (localSelectionResult.localVersion >= localSelectionResult.remoteVersion)
        localSelectionResult.selection = -1;
      else
        localSelectionResult.selection = 1;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.google.android.gms.dynamite.zze
 * JD-Core Version:    0.6.2
 */