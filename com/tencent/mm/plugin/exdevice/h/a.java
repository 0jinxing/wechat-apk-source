package com.tencent.mm.plugin.exdevice.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;

public final class a
{
  public static boolean C(String paramString, long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19707);
    ab.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "isItemInSharedPreferences, key = %s, device id = %d", new Object[] { paramString, Long.valueOf(paramLong) });
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      AppMethodBeat.o(19707);
    }
    while (true)
    {
      return bool;
      SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("exdevice_pref", 0);
      if (localSharedPreferences == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
        AppMethodBeat.o(19707);
      }
      else
      {
        c(localSharedPreferences);
        if (!b.dX(String.valueOf(paramLong), localSharedPreferences.getString(paramString, new String())))
        {
          AppMethodBeat.o(19707);
        }
        else
        {
          AppMethodBeat.o(19707);
          bool = true;
        }
      }
    }
  }

  public static boolean D(String paramString, long paramLong)
  {
    boolean bool = false;
    AppMethodBeat.i(19708);
    ab.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addToSharedPreferences, key = %s, deviceId = %d", new Object[] { paramString, Long.valueOf(paramLong) });
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      AppMethodBeat.o(19708);
    }
    while (true)
    {
      return bool;
      SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("exdevice_pref", 0);
      if (localSharedPreferences == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
        AppMethodBeat.o(19708);
      }
      else
      {
        c(localSharedPreferences);
        String str = b.dY(String.valueOf(paramLong), localSharedPreferences.getString(paramString, new String()));
        if (str == null)
        {
          ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "addDeviceToDeviceList failed!!!");
          AppMethodBeat.o(19708);
        }
        else if (!localSharedPreferences.edit().putString(paramString, str).commit())
        {
          ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit() Failed!!!");
          AppMethodBeat.o(19708);
        }
        else
        {
          ab.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "add to sharepreference successful, new device list is %s", new Object[] { str });
          AppMethodBeat.o(19708);
          bool = true;
        }
      }
    }
  }

  public static boolean E(String paramString, long paramLong)
  {
    boolean bool1 = false;
    AppMethodBeat.i(19709);
    ab.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "removeFromSharedPreferences, key = %s, deviceId = %d", new Object[] { paramString, Long.valueOf(paramLong) });
    boolean bool2;
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "key is null or nil");
      AppMethodBeat.o(19709);
      bool2 = bool1;
    }
    while (true)
    {
      return bool2;
      SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("exdevice_pref", 0);
      if (localSharedPreferences == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == sp");
        AppMethodBeat.o(19709);
        bool2 = bool1;
      }
      else
      {
        c(localSharedPreferences);
        String str = b.dZ(String.valueOf(paramLong), localSharedPreferences.getString(paramString, new String()));
        if (str == null)
        {
          ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove device from device list failed!!!");
          AppMethodBeat.o(19709);
          bool2 = bool1;
        }
        else
        {
          if (str.length() == 0);
          for (bool2 = localSharedPreferences.edit().remove(paramString).commit(); ; bool2 = localSharedPreferences.edit().putString(paramString, str).commit())
          {
            if (bool2)
              break label221;
            ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "sp.edit().putString().commit()");
            AppMethodBeat.o(19709);
            bool2 = bool1;
            break;
          }
          label221: ab.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove from sharepreference successful, new device list is %s", new Object[] { str });
          AppMethodBeat.o(19709);
          bool2 = true;
        }
      }
    }
  }

  // ERROR //
  public static long[] Kt(String paramString)
  {
    // Byte code:
    //   0: sipush 19710
    //   3: invokestatic 12	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 14
    //   8: ldc 136
    //   10: iconst_1
    //   11: anewarray 4	java/lang/Object
    //   14: dup
    //   15: iconst_0
    //   16: aload_0
    //   17: aastore
    //   18: invokestatic 27	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   21: aload_0
    //   22: invokestatic 33	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   25: ifeq +20 -> 45
    //   28: ldc 14
    //   30: ldc 35
    //   32: invokestatic 39	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   35: sipush 19710
    //   38: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   41: aconst_null
    //   42: astore_0
    //   43: aload_0
    //   44: areturn
    //   45: invokestatic 48	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   48: ldc 50
    //   50: iconst_0
    //   51: invokevirtual 56	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   54: astore_1
    //   55: aload_1
    //   56: ifnonnull +21 -> 77
    //   59: ldc 14
    //   61: ldc 58
    //   63: invokestatic 39	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   66: sipush 19710
    //   69: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   72: aconst_null
    //   73: astore_0
    //   74: goto -31 -> 43
    //   77: aload_1
    //   78: invokestatic 62	com/tencent/mm/plugin/exdevice/h/a:c	(Landroid/content/SharedPreferences;)V
    //   81: new 64	java/lang/String
    //   84: astore_2
    //   85: aload_2
    //   86: invokespecial 71	java/lang/String:<init>	()V
    //   89: aload_1
    //   90: aload_0
    //   91: aload_2
    //   92: invokeinterface 77 3 0
    //   97: ldc 138
    //   99: invokevirtual 142	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   102: astore_2
    //   103: aload_2
    //   104: ifnull +8 -> 112
    //   107: aload_2
    //   108: arraylength
    //   109: ifne +51 -> 160
    //   112: ldc 14
    //   114: ldc 144
    //   116: invokestatic 39	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: sipush 19710
    //   122: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: aconst_null
    //   126: astore_0
    //   127: goto -84 -> 43
    //   130: astore_0
    //   131: ldc 14
    //   133: ldc 146
    //   135: iconst_1
    //   136: anewarray 4	java/lang/Object
    //   139: dup
    //   140: iconst_0
    //   141: aload_0
    //   142: invokevirtual 150	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   145: aastore
    //   146: invokestatic 152	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   149: sipush 19710
    //   152: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   155: aconst_null
    //   156: astore_0
    //   157: goto -114 -> 43
    //   160: aload_2
    //   161: arraylength
    //   162: newarray long
    //   164: astore_1
    //   165: aload_2
    //   166: arraylength
    //   167: istore_3
    //   168: iconst_0
    //   169: istore 4
    //   171: iconst_0
    //   172: istore 5
    //   174: iload 4
    //   176: iload_3
    //   177: if_icmpge +90 -> 267
    //   180: aload_2
    //   181: iload 4
    //   183: aaload
    //   184: astore_0
    //   185: ldc 14
    //   187: ldc 154
    //   189: iconst_1
    //   190: anewarray 4	java/lang/Object
    //   193: dup
    //   194: iconst_0
    //   195: aload_0
    //   196: aastore
    //   197: invokestatic 27	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: aload_0
    //   201: invokevirtual 122	java/lang/String:length	()I
    //   204: istore 6
    //   206: iload 6
    //   208: ifne +9 -> 217
    //   211: iinc 4 1
    //   214: goto -40 -> 174
    //   217: iload 5
    //   219: iconst_1
    //   220: iadd
    //   221: istore 6
    //   223: aload_1
    //   224: iload 5
    //   226: aload_0
    //   227: lconst_0
    //   228: invokestatic 158	com/tencent/mm/sdk/platformtools/bo:getLong	(Ljava/lang/String;J)J
    //   231: lastore
    //   232: iload 6
    //   234: istore 5
    //   236: goto -25 -> 211
    //   239: astore_0
    //   240: ldc 14
    //   242: new 160	java/lang/StringBuilder
    //   245: dup
    //   246: ldc 162
    //   248: invokespecial 165	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   251: aload_0
    //   252: invokevirtual 150	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   255: invokevirtual 169	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   258: invokevirtual 172	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   261: invokestatic 39	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   264: goto -53 -> 211
    //   267: iload 5
    //   269: ifne +14 -> 283
    //   272: sipush 19710
    //   275: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   278: aconst_null
    //   279: astore_0
    //   280: goto -237 -> 43
    //   283: sipush 19710
    //   286: invokestatic 42	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   289: aload_1
    //   290: astore_0
    //   291: goto -248 -> 43
    //   294: astore_0
    //   295: iload 6
    //   297: istore 5
    //   299: goto -59 -> 240
    //
    // Exception table:
    //   from	to	target	type
    //   81	103	130	java/lang/Exception
    //   185	206	239	java/lang/Exception
    //   223	232	294	java/lang/Exception
  }

  private static void c(SharedPreferences paramSharedPreferences)
  {
    int i = 0;
    AppMethodBeat.i(19706);
    ab.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "tryToClearDirtyData");
    if (Build.VERSION.SDK_INT < 11)
      AppMethodBeat.o(19706);
    while (true)
    {
      return;
      if (paramSharedPreferences == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "null == aSP");
        AppMethodBeat.o(19706);
        continue;
      }
      label50: String str;
      if (i < 2)
        str = new String[] { "conneted_device", "shut_down_device" }[i];
      try
      {
        if (paramSharedPreferences.getStringSet(str, null) != null)
        {
          ab.i("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "find dirty data, remove it, key = %s", new Object[] { str });
          if (!paramSharedPreferences.edit().remove(str).commit())
            ab.e("MicroMsg.exdevice.ExdeviceSharePreferencesManager", "remove dirty data failed!!!");
        }
        label125: i++;
        break label50;
        AppMethodBeat.o(19706);
      }
      catch (Exception localException)
      {
        break label125;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.h.a
 * JD-Core Version:    0.6.2
 */