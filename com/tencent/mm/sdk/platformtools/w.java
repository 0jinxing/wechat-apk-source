package com.tencent.mm.sdk.platformtools;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class w
{
  public static int a(Intent paramIntent, String paramString, int paramInt)
  {
    AppMethodBeat.i(52008);
    if (paramIntent == null)
      AppMethodBeat.o(52008);
    while (true)
    {
      return paramInt;
      try
      {
        int i = paramIntent.getIntExtra(paramString, paramInt);
        paramInt = i;
        AppMethodBeat.o(52008);
      }
      catch (Exception paramIntent)
      {
        while (true)
          ab.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", new Object[] { paramIntent.getMessage() });
      }
    }
  }

  public static boolean a(Intent paramIntent, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(52012);
    if (paramIntent == null)
      AppMethodBeat.o(52012);
    while (true)
    {
      return paramBoolean;
      try
      {
        boolean bool = paramIntent.getBooleanExtra(paramString, paramBoolean);
        paramBoolean = bool;
        AppMethodBeat.o(52012);
      }
      catch (Exception paramIntent)
      {
        while (true)
          ab.e("MicroMsg.IntentUtil", "getBooleanExtra exception:%s", new Object[] { paramIntent.getMessage() });
      }
    }
  }

  public static Bundle aM(Intent paramIntent)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(52011);
    if (paramIntent == null)
    {
      AppMethodBeat.o(52011);
      paramIntent = localObject2;
    }
    while (true)
    {
      return paramIntent;
      try
      {
        paramIntent = paramIntent.getExtras();
        AppMethodBeat.o(52011);
      }
      catch (Exception paramIntent)
      {
        while (true)
        {
          ab.e("MicroMsg.IntentUtil", "getExtras exception:%s", new Object[] { paramIntent.getMessage() });
          paramIntent = localObject1;
        }
      }
    }
  }

  public static void b(Intent paramIntent, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(52017);
    try
    {
      paramIntent.putExtra(paramString, paramBoolean);
      AppMethodBeat.o(52017);
      return;
    }
    catch (Exception paramIntent)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.IntentUtil", paramIntent, "", new Object[0]);
        AppMethodBeat.o(52017);
      }
    }
  }

  public static int k(Bundle paramBundle, String paramString)
  {
    int i = 0;
    int j = 0;
    AppMethodBeat.i(52009);
    if (paramBundle == null)
    {
      AppMethodBeat.o(52009);
      i = j;
    }
    while (true)
    {
      return i;
      try
      {
        j = paramBundle.getInt(paramString, 0);
        i = j;
        AppMethodBeat.o(52009);
      }
      catch (Exception paramBundle)
      {
        while (true)
          ab.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", new Object[] { paramBundle.getMessage() });
      }
    }
  }

  public static String l(Bundle paramBundle, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(52014);
    if (paramBundle == null)
    {
      AppMethodBeat.o(52014);
      paramBundle = localObject2;
    }
    while (true)
    {
      return paramBundle;
      try
      {
        paramBundle = paramBundle.getString(paramString);
        AppMethodBeat.o(52014);
      }
      catch (Exception paramBundle)
      {
        while (true)
        {
          ab.e("MicroMsg.IntentUtil", "getStringExtra exception:%s", new Object[] { paramBundle.getMessage() });
          paramBundle = localObject1;
        }
      }
    }
  }

  public static long m(Intent paramIntent, String paramString)
  {
    long l1 = 0L;
    AppMethodBeat.i(52010);
    if (paramIntent == null)
      AppMethodBeat.o(52010);
    while (true)
    {
      return l1;
      try
      {
        long l2 = paramIntent.getLongExtra(paramString, 0L);
        l1 = l2;
        AppMethodBeat.o(52010);
      }
      catch (Exception paramIntent)
      {
        while (true)
          ab.e("MicroMsg.IntentUtil", "getIntExtra exception:%s", new Object[] { paramIntent.getMessage() });
      }
    }
  }

  public static String n(Intent paramIntent, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(52013);
    if (paramIntent == null)
    {
      AppMethodBeat.o(52013);
      paramIntent = localObject2;
    }
    while (true)
    {
      return paramIntent;
      try
      {
        paramIntent = paramIntent.getStringExtra(paramString);
        AppMethodBeat.o(52013);
      }
      catch (Exception paramIntent)
      {
        while (true)
        {
          ab.e("MicroMsg.IntentUtil", "getStringExtra exception:%s", new Object[] { paramIntent.getMessage() });
          paramIntent = localObject1;
        }
      }
    }
  }

  public static byte[] o(Intent paramIntent, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(52015);
    if (paramIntent == null)
    {
      AppMethodBeat.o(52015);
      paramIntent = localObject2;
    }
    while (true)
    {
      return paramIntent;
      try
      {
        paramIntent = paramIntent.getByteArrayExtra(paramString);
        AppMethodBeat.o(52015);
      }
      catch (Exception paramIntent)
      {
        while (true)
        {
          ab.e("MicroMsg.IntentUtil", "getByteArrayExtra exception:%s", new Object[] { paramIntent.getMessage() });
          paramIntent = localObject1;
        }
      }
    }
  }

  public static Parcelable p(Intent paramIntent, String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(52016);
    if (paramIntent == null)
    {
      AppMethodBeat.o(52016);
      paramIntent = localObject2;
    }
    while (true)
    {
      return paramIntent;
      try
      {
        paramIntent = paramIntent.getParcelableExtra(paramString);
        AppMethodBeat.o(52016);
      }
      catch (Exception paramIntent)
      {
        while (true)
        {
          ab.e("MicroMsg.IntentUtil", "getParcelableExtra exception:%s", new Object[] { paramIntent.getMessage() });
          paramIntent = localObject1;
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.w
 * JD-Core Version:    0.6.2
 */