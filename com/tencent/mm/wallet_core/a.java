package com.tencent.mm.wallet_core;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a
{
  private static Map<String, Class<?>> AeQ;
  private static SparseArray<c> AeR;

  static
  {
    AppMethodBeat.i(49005);
    AeQ = new HashMap();
    AeR = new SparseArray();
    AppMethodBeat.o(49005);
  }

  public static void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle)
  {
    AppMethodBeat.i(48992);
    a(paramActivity, paramClass, paramBundle, null);
    AppMethodBeat.o(48992);
  }

  public static void a(Activity paramActivity, Class<?> paramClass, Bundle paramBundle, c.a parama)
  {
    AppMethodBeat.i(48993);
    ab.i("MicroMsg.ProcessManager", "startProcess to1 context:%s proc name: %s bundle %s", new Object[] { paramActivity, paramClass.getSimpleName(), aD(paramBundle) });
    Bundle localBundle = paramBundle;
    if (paramBundle == null);
    try
    {
      localBundle = new android/os/Bundle;
      localBundle.<init>();
      if (localBundle.getLong("key_SessionId", 0L) == 0L)
        localBundle.putLong("key_SessionId", System.currentTimeMillis());
      paramBundle = (c)paramClass.newInstance();
      paramBundle.aE(localBundle);
      paramBundle.a(parama, paramActivity);
      paramBundle.a(paramActivity, localBundle);
      AeR.put(paramClass.hashCode(), paramBundle);
      AppMethodBeat.o(48993);
      return;
    }
    catch (Exception paramActivity)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ProcessManager", paramActivity, "", new Object[0]);
        AppMethodBeat.o(48993);
      }
    }
  }

  public static void a(Activity paramActivity, String paramString, Bundle paramBundle, c.a parama)
  {
    AppMethodBeat.i(48995);
    try
    {
      ab.i("MicroMsg.ProcessManager", "startProcess to2 context:%s proc name: %s bundle %s", new Object[] { paramActivity, paramString, aD(paramBundle) });
      Class localClass = (Class)AeQ.get(paramString);
      if (localClass == null)
      {
        paramString = String.format("start process=%s fail, process not register or plugin no import", new Object[] { paramString });
        ab.e("MicroMsg.ProcessManager", paramString);
        t.makeText(paramActivity, paramString, 1).show();
        AppMethodBeat.o(48995);
      }
      while (true)
      {
        return;
        a(paramActivity, localClass, paramBundle, parama);
        AppMethodBeat.o(48995);
      }
    }
    catch (Exception paramActivity)
    {
      while (true)
      {
        ab.e("MicroMsg.ProcessManager", "plugin load failed : " + paramActivity.toString());
        ab.printErrStackTrace("MicroMsg.ProcessManager", paramActivity, "", new Object[0]);
        AppMethodBeat.o(48995);
      }
    }
  }

  public static void aB(Activity paramActivity)
  {
    AppMethodBeat.i(48997);
    c localc = aE(paramActivity);
    if (localc == null);
    for (String str = ""; ; str = localc.bxP())
    {
      ab.i("MicroMsg.ProcessManager", "backProcess to1 context: %s procname %s", new Object[] { paramActivity, str });
      if (localc != null)
        localc.c(paramActivity, 0);
      AppMethodBeat.o(48997);
      return;
    }
  }

  public static boolean aC(Activity paramActivity)
  {
    AppMethodBeat.i(49000);
    boolean bool;
    if (aE(paramActivity) != null)
    {
      bool = true;
      AppMethodBeat.o(49000);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49000);
    }
  }

  public static Bundle aD(Activity paramActivity)
  {
    AppMethodBeat.i(49001);
    paramActivity = aE(paramActivity);
    if (paramActivity != null)
    {
      paramActivity = paramActivity.mqu;
      AppMethodBeat.o(49001);
    }
    while (true)
    {
      return paramActivity;
      paramActivity = new Bundle();
      AppMethodBeat.o(49001);
    }
  }

  private static String aD(Bundle paramBundle)
  {
    AppMethodBeat.i(48990);
    if (paramBundle == null)
    {
      paramBundle = "";
      AppMethodBeat.o(48990);
    }
    while (true)
    {
      return paramBundle;
      paramBundle = paramBundle.toString();
      AppMethodBeat.o(48990);
    }
  }

  public static c aE(Activity paramActivity)
  {
    Object localObject = null;
    AppMethodBeat.i(49003);
    if (paramActivity == null)
    {
      ab.w("MicroMsg.ProcessManager", "hy: ac is null");
      AppMethodBeat.o(49003);
      paramActivity = localObject;
    }
    while (true)
    {
      return paramActivity;
      if (paramActivity.getIntent() == null)
      {
        ab.w("MicroMsg.ProcessManager", "hy: get intent is null");
        AppMethodBeat.o(49003);
        paramActivity = localObject;
      }
      else
      {
        paramActivity = (c)AeR.get(paramActivity.getIntent().getIntExtra("process_id", 0));
        AppMethodBeat.o(49003);
      }
    }
  }

  public static List<c> atm(String paramString)
  {
    AppMethodBeat.i(49004);
    ArrayList localArrayList = new ArrayList();
    int i = AeR.size();
    for (int j = 0; j < i; j++)
    {
      c localc = (c)AeR.valueAt(j);
      if (paramString.equals(localc.bxP()))
        localArrayList.add(localc);
    }
    AppMethodBeat.o(49004);
    return localArrayList;
  }

  public static void b(Activity paramActivity, Bundle paramBundle, int paramInt)
  {
    AppMethodBeat.i(48999);
    ab.i("MicroMsg.ProcessManager", "endProcess with errCode : ".concat(String.valueOf(paramInt)));
    if (paramActivity == null)
      ab.w("MicroMsg.ProcessManager", "hy: end context is null");
    c localc = aE(paramActivity);
    String str1 = aD(paramBundle);
    String str2;
    if (localc == null)
    {
      str2 = "";
      ab.i("MicroMsg.ProcessManager", "endProcess to1 context: %s bundle: %s procName %s", new Object[] { paramActivity, str1, str2 });
      if (localc == null)
        break label99;
      localc.b(paramActivity, paramBundle);
      AppMethodBeat.o(48999);
    }
    while (true)
    {
      return;
      str2 = localc.bxP();
      break;
      label99: if (!paramActivity.isFinishing())
        paramActivity.finish();
      AppMethodBeat.o(48999);
    }
  }

  public static void b(Activity paramActivity, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(48994);
    a(paramActivity, paramString, paramBundle, null);
    AppMethodBeat.o(48994);
  }

  public static void g(String paramString, Class<?> paramClass)
  {
    AppMethodBeat.i(48989);
    if (AeQ.containsKey(paramString))
    {
      paramString = new IllegalArgumentException("register process fail, exist process=".concat(String.valueOf(paramString)));
      AppMethodBeat.o(48989);
      throw paramString;
    }
    AeQ.put(paramString, paramClass);
    AppMethodBeat.o(48989);
  }

  public static void j(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(48996);
    c localc = aE(paramActivity);
    String str1 = aD(paramBundle);
    if (localc == null);
    for (String str2 = ""; ; str2 = localc.bxP())
    {
      ab.i("MicroMsg.ProcessManager", "forwardProcess to1 context: %s bundle: %s procName %s", new Object[] { paramActivity, str1, str2 });
      if (localc != null)
        localc.a(paramActivity, 0, paramBundle);
      AppMethodBeat.o(48996);
      return;
    }
  }

  public static boolean k(Activity paramActivity, Bundle paramBundle)
  {
    AppMethodBeat.i(49002);
    paramActivity = aE(paramActivity);
    boolean bool;
    if (paramActivity != null)
    {
      paramActivity.aE(paramBundle);
      bool = true;
      AppMethodBeat.o(49002);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49002);
    }
  }

  public static void o(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(48998);
    if (paramActivity == null)
      ab.w("MicroMsg.ProcessManager", "hy: back context is null");
    c localc = aE(paramActivity);
    String str;
    if (localc == null)
    {
      str = "";
      ab.i("MicroMsg.ProcessManager", "backProcess to1 context: %s errCode %s procname %s ", new Object[] { paramActivity, Integer.valueOf(paramInt), str });
      if (localc == null)
        break label82;
      localc.c(paramActivity, paramInt);
      AppMethodBeat.o(48998);
    }
    while (true)
    {
      return;
      str = localc.bxP();
      break;
      label82: if (!paramActivity.isFinishing())
        paramActivity.finish();
      AppMethodBeat.o(48998);
    }
  }

  public static void remove(int paramInt)
  {
    AppMethodBeat.i(48991);
    AeR.remove(paramInt);
    AppMethodBeat.o(48991);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.a
 * JD-Core Version:    0.6.2
 */