package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashMap;
import java.util.Map;

public final class c extends MMPluginProvider.a
{
  private static final Map<String, Object> jDp;

  static
  {
    AppMethodBeat.i(18121);
    HashMap localHashMap = new HashMap();
    jDp = localHashMap;
    localHashMap.put("_build_info_sdk_int_", Integer.valueOf(620954368));
    jDp.put("_build_info_sdk_name_", "android 5.3.3");
    jDp.put("_wxapp_pay_entry_classname_", "com.tencent.mm.plugin.base.stub.WXPayEntryActivity");
    AppMethodBeat.o(18121);
  }

  public static Cursor a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    AppMethodBeat.i(18120);
    String str = paramArrayOfString2[0];
    Object localObject = jDp.get(str);
    if (localObject == null)
    {
      ab.w("MicroMsg.MMPluginProviderSharedPrefImpl", "not found value for key: ".concat(String.valueOf(str)));
      paramArrayOfString1 = null;
      AppMethodBeat.o(18120);
      return paramArrayOfString1;
    }
    int i;
    if (localObject == null)
    {
      ab.e("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, null value");
      i = 0;
      label62: paramArrayOfString2 = new MatrixCursor(paramArrayOfString1);
      if (localObject != null)
        break label231;
    }
    label231: for (paramArrayOfString1 = null; ; paramArrayOfString1 = localObject.toString())
    {
      paramArrayOfString2.addRow(new Object[] { Integer.valueOf(0), str, Integer.valueOf(i), paramArrayOfString1 });
      AppMethodBeat.o(18120);
      paramArrayOfString1 = paramArrayOfString2;
      break;
      if ((localObject instanceof Integer))
      {
        i = 1;
        break label62;
      }
      if ((localObject instanceof Long))
      {
        i = 2;
        break label62;
      }
      if ((localObject instanceof String))
      {
        i = 3;
        break label62;
      }
      if ((localObject instanceof Boolean))
      {
        i = 4;
        break label62;
      }
      if ((localObject instanceof Float))
      {
        i = 5;
        break label62;
      }
      if ((localObject instanceof Double))
      {
        i = 6;
        break label62;
      }
      ab.e("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, unknown type=" + localObject.getClass().toString());
      i = 0;
      break label62;
    }
  }

  public final boolean dt(Context paramContext)
  {
    AppMethodBeat.i(18119);
    super.dt(paramContext);
    AppMethodBeat.o(18119);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.base.stub.c
 * JD-Core Version:    0.6.2
 */