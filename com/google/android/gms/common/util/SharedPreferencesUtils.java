package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import android.content.pm.ApplicationInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public class SharedPreferencesUtils
{
  @Deprecated
  public static void publishWorldReadableSharedPreferences(Context paramContext, SharedPreferences.Editor paramEditor, String paramString)
  {
    AppMethodBeat.i(90267);
    File localFile = new File(paramContext.getApplicationInfo().dataDir, "shared_prefs");
    paramContext = localFile.getParentFile();
    if (paramContext != null)
      paramContext.setExecutable(true, false);
    localFile.setExecutable(true, false);
    paramEditor.commit();
    new File(localFile, String.valueOf(paramString).concat(".xml")).setReadable(true, false);
    AppMethodBeat.o(90267);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.google.android.gms.common.util.SharedPreferencesUtils
 * JD-Core Version:    0.6.2
 */