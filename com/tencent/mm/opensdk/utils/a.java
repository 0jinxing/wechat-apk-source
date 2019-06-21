package com.tencent.mm.opensdk.utils;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a
{
  public static int a(Bundle paramBundle, String paramString)
  {
    int i = -1;
    AppMethodBeat.i(128072);
    if (paramBundle == null)
      AppMethodBeat.o(128072);
    while (true)
    {
      return i;
      try
      {
        int j = paramBundle.getInt(paramString, -1);
        i = j;
        AppMethodBeat.o(128072);
      }
      catch (Exception paramBundle)
      {
        while (true)
          Log.e("MicroMsg.IntentUtil", "getIntExtra exception:" + paramBundle.getMessage());
      }
    }
  }

  public static String b(Bundle paramBundle, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(128073);
    if (paramBundle == null)
    {
      AppMethodBeat.o(128073);
      paramBundle = localObject2;
    }
    while (true)
    {
      return paramBundle;
      try
      {
        paramBundle = paramBundle.getString(paramString);
        AppMethodBeat.o(128073);
      }
      catch (Exception paramBundle)
      {
        while (true)
        {
          Log.e("MicroMsg.IntentUtil", "getStringExtra exception:" + paramBundle.getMessage());
          paramBundle = localObject1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.opensdk.utils.a
 * JD-Core Version:    0.6.2
 */