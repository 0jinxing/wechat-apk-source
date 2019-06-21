package com.tencent.mm.compatible.f;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Build.VERSION;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public final class b
{
  private static Boolean euB = null;

  public static boolean Mi()
  {
    AppMethodBeat.i(93043);
    boolean bool;
    if (!Build.MANUFACTURER.equalsIgnoreCase("meizu"))
    {
      bool = true;
      AppMethodBeat.o(93043);
      return bool;
    }
    int i = 0;
    if (Build.VERSION.SDK_INT == 17)
      i = 36;
    while (true)
    {
      bool = iV(i);
      AppMethodBeat.o(93043);
      break;
      if (Build.VERSION.SDK_INT >= 19)
        i = 27;
    }
  }

  public static boolean Mj()
  {
    AppMethodBeat.i(93045);
    boolean bool;
    if (!Build.MANUFACTURER.equalsIgnoreCase("meizu"))
    {
      bool = true;
      AppMethodBeat.o(93045);
      return bool;
    }
    int i = 0;
    if (Build.VERSION.SDK_INT == 17)
      i = 35;
    while (true)
    {
      bool = iV(i);
      AppMethodBeat.o(93045);
      break;
      if (Build.VERSION.SDK_INT >= 19)
        i = 26;
    }
  }

  public static boolean bD(Context paramContext)
  {
    AppMethodBeat.i(93044);
    if (euB == null)
      if (paramContext != null)
        break label38;
    label38: for (boolean bool = false; ; bool = paramContext.getPackageManager().hasSystemFeature("org.chromium.arc.device_management"))
    {
      euB = Boolean.valueOf(bool);
      bool = euB.booleanValue();
      AppMethodBeat.o(93044);
      return bool;
    }
  }

  public static void bE(Context paramContext)
  {
    AppMethodBeat.i(93046);
    if (Build.MANUFACTURER.equalsIgnoreCase("meizu"));
    while (true)
    {
      try
      {
        Intent localIntent1 = new android/content/Intent;
        localIntent1.<init>();
        localIntent1.setClassName("com.android.settings", "com.android.settings.applications.AppsCheckReadPermission");
        paramContext.startActivity(localIntent1);
        AppMethodBeat.o(93046);
        return;
      }
      catch (Exception localException1)
      {
        ab.e("MicroMsg.PermissionUtil", "unable start activity AppsCheckReadPermission");
        try
        {
          Intent localIntent2 = new android/content/Intent;
          localIntent2.<init>("android.settings.APP_OPS_SETTINGS");
          localIntent2.addCategory("android.intent.category.DEFAULT");
          paramContext.startActivity(localIntent2);
          AppMethodBeat.o(93046);
        }
        catch (Exception localException2)
        {
          ab.e("MicroMsg.PermissionUtil", "unable start activity APP_OPS_SETTINGS");
          try
          {
            Intent localIntent3 = new android/content/Intent;
            localIntent3.<init>();
            localIntent3.setClassName("com.android.settings", "com.android.settings.Settings$AppControlSettingsActivity");
            paramContext.startActivity(localIntent3);
            AppMethodBeat.o(93046);
          }
          catch (Exception paramContext)
          {
            ab.e("MicroMsg.PermissionUtil", "unable start activity AppControlSettingsActivity");
          }
        }
      }
      AppMethodBeat.o(93046);
    }
  }

  // ERROR //
  @android.annotation.TargetApi(19)
  public static boolean bF(Context paramContext)
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_1
    //   2: iconst_1
    //   3: istore_2
    //   4: ldc 132
    //   6: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: getstatic 43	android/os/Build$VERSION:SDK_INT	I
    //   12: istore_3
    //   13: iload_3
    //   14: bipush 23
    //   16: if_icmplt +98 -> 114
    //   19: ldc 134
    //   21: ldc 136
    //   23: iconst_1
    //   24: anewarray 138	java/lang/Class
    //   27: dup
    //   28: iconst_0
    //   29: ldc 63
    //   31: aastore
    //   32: invokevirtual 142	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   35: aconst_null
    //   36: iconst_1
    //   37: anewarray 4	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload_0
    //   43: aastore
    //   44: invokevirtual 148	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   47: checkcast 54	java/lang/Boolean
    //   50: invokevirtual 61	java/lang/Boolean:booleanValue	()Z
    //   53: istore_1
    //   54: ldc 98
    //   56: ldc 150
    //   58: iload_1
    //   59: invokestatic 153	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   62: invokevirtual 157	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   65: invokestatic 159	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: ldc 132
    //   70: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: iload_1
    //   74: istore_2
    //   75: iload_2
    //   76: ireturn
    //   77: astore_0
    //   78: ldc 98
    //   80: ldc 161
    //   82: iconst_2
    //   83: anewarray 4	java/lang/Object
    //   86: dup
    //   87: iconst_0
    //   88: aload_0
    //   89: invokevirtual 165	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   92: aastore
    //   93: dup
    //   94: iconst_1
    //   95: aload_0
    //   96: invokevirtual 169	java/lang/Object:getClass	()Ljava/lang/Class;
    //   99: invokevirtual 172	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   102: aastore
    //   103: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   106: ldc 132
    //   108: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: goto -36 -> 75
    //   114: iload_3
    //   115: bipush 19
    //   117: if_icmplt +212 -> 329
    //   120: invokestatic 181	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   123: ldc 183
    //   125: invokevirtual 187	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   128: astore 4
    //   130: ldc 189
    //   132: invokestatic 193	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   135: ldc 195
    //   137: iconst_3
    //   138: anewarray 138	java/lang/Class
    //   141: dup
    //   142: iconst_0
    //   143: getstatic 201	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: getstatic 201	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   152: aastore
    //   153: dup
    //   154: iconst_2
    //   155: ldc 30
    //   157: aastore
    //   158: invokevirtual 204	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   161: astore_0
    //   162: iload_1
    //   163: istore_2
    //   164: aload_0
    //   165: ifnull +55 -> 220
    //   168: aload_0
    //   169: aload 4
    //   171: iconst_3
    //   172: anewarray 4	java/lang/Object
    //   175: dup
    //   176: iconst_0
    //   177: bipush 24
    //   179: invokestatic 207	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   182: aastore
    //   183: dup
    //   184: iconst_1
    //   185: invokestatic 181	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   188: invokevirtual 211	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   191: getfield 216	android/content/pm/ApplicationInfo:uid	I
    //   194: invokestatic 207	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   197: aastore
    //   198: dup
    //   199: iconst_2
    //   200: invokestatic 219	com/tencent/mm/sdk/platformtools/ah:getPackageName	()Ljava/lang/String;
    //   203: aastore
    //   204: invokevirtual 148	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   207: checkcast 197	java/lang/Integer
    //   210: invokevirtual 223	java/lang/Integer:intValue	()I
    //   213: istore_3
    //   214: iload_3
    //   215: ifne +75 -> 290
    //   218: iconst_1
    //   219: istore_2
    //   220: ldc 98
    //   222: ldc 150
    //   224: iload_2
    //   225: invokestatic 153	java/lang/String:valueOf	(Z)Ljava/lang/String;
    //   228: invokevirtual 157	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   231: invokestatic 159	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   234: ldc 132
    //   236: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   239: goto -164 -> 75
    //   242: astore_0
    //   243: ldc 98
    //   245: ldc 225
    //   247: iconst_1
    //   248: anewarray 4	java/lang/Object
    //   251: dup
    //   252: iconst_0
    //   253: aload_0
    //   254: invokevirtual 226	java/lang/NoSuchMethodException:getMessage	()Ljava/lang/String;
    //   257: aastore
    //   258: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   261: aconst_null
    //   262: astore_0
    //   263: goto -101 -> 162
    //   266: astore_0
    //   267: ldc 98
    //   269: ldc 228
    //   271: iconst_1
    //   272: anewarray 4	java/lang/Object
    //   275: dup
    //   276: iconst_0
    //   277: aload_0
    //   278: invokevirtual 229	java/lang/ClassNotFoundException:getMessage	()Ljava/lang/String;
    //   281: aastore
    //   282: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   285: aconst_null
    //   286: astore_0
    //   287: goto -125 -> 162
    //   290: iconst_0
    //   291: istore_2
    //   292: goto -72 -> 220
    //   295: astore_0
    //   296: ldc 98
    //   298: ldc 231
    //   300: iconst_2
    //   301: anewarray 4	java/lang/Object
    //   304: dup
    //   305: iconst_0
    //   306: aload_0
    //   307: invokevirtual 165	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   310: aastore
    //   311: dup
    //   312: iconst_1
    //   313: aload_0
    //   314: invokevirtual 169	java/lang/Object:getClass	()Ljava/lang/Class;
    //   317: invokevirtual 172	java/lang/Class:getCanonicalName	()Ljava/lang/String;
    //   320: aastore
    //   321: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   324: iload_1
    //   325: istore_2
    //   326: goto -106 -> 220
    //   329: ldc 132
    //   331: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   334: goto -259 -> 75
    //
    // Exception table:
    //   from	to	target	type
    //   19	68	77	java/lang/Exception
    //   130	162	242	java/lang/NoSuchMethodException
    //   130	162	266	java/lang/ClassNotFoundException
    //   168	214	295	java/lang/Exception
  }

  // ERROR //
  private static boolean iV(int paramInt)
  {
    // Byte code:
    //   0: ldc 233
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: iload_0
    //   6: ifne +12 -> 18
    //   9: ldc 233
    //   11: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   14: iconst_1
    //   15: istore_1
    //   16: iload_1
    //   17: ireturn
    //   18: invokestatic 181	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   21: ldc 183
    //   23: invokevirtual 187	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   26: astore_2
    //   27: aload_2
    //   28: ifnull +158 -> 186
    //   31: ldc 189
    //   33: invokestatic 193	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   36: ldc 235
    //   38: iconst_3
    //   39: anewarray 138	java/lang/Class
    //   42: dup
    //   43: iconst_0
    //   44: getstatic 201	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   47: aastore
    //   48: dup
    //   49: iconst_1
    //   50: getstatic 201	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   53: aastore
    //   54: dup
    //   55: iconst_2
    //   56: ldc 30
    //   58: aastore
    //   59: invokevirtual 204	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   62: astore_3
    //   63: aload_3
    //   64: ifnull +151 -> 215
    //   67: aload_3
    //   68: aload_2
    //   69: iconst_3
    //   70: anewarray 4	java/lang/Object
    //   73: dup
    //   74: iconst_0
    //   75: iload_0
    //   76: invokestatic 207	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   79: aastore
    //   80: dup
    //   81: iconst_1
    //   82: invokestatic 181	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   85: invokevirtual 211	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   88: getfield 216	android/content/pm/ApplicationInfo:uid	I
    //   91: invokestatic 207	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   94: aastore
    //   95: dup
    //   96: iconst_2
    //   97: invokestatic 219	com/tencent/mm/sdk/platformtools/ah:getPackageName	()Ljava/lang/String;
    //   100: aastore
    //   101: invokevirtual 148	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   104: checkcast 197	java/lang/Integer
    //   107: invokevirtual 223	java/lang/Integer:intValue	()I
    //   110: istore_0
    //   111: iload_0
    //   112: ifeq +103 -> 215
    //   115: ldc 98
    //   117: ldc 237
    //   119: iconst_1
    //   120: anewarray 4	java/lang/Object
    //   123: dup
    //   124: iconst_0
    //   125: iload_0
    //   126: invokestatic 207	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   129: aastore
    //   130: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   133: ldc 233
    //   135: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   138: iconst_0
    //   139: istore_1
    //   140: goto -124 -> 16
    //   143: astore_3
    //   144: ldc 98
    //   146: ldc 239
    //   148: iconst_1
    //   149: anewarray 4	java/lang/Object
    //   152: dup
    //   153: iconst_0
    //   154: aload_3
    //   155: invokevirtual 226	java/lang/NoSuchMethodException:getMessage	()Ljava/lang/String;
    //   158: aastore
    //   159: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   162: aconst_null
    //   163: astore_3
    //   164: goto -101 -> 63
    //   167: astore_3
    //   168: ldc 98
    //   170: ldc 228
    //   172: iconst_1
    //   173: anewarray 4	java/lang/Object
    //   176: dup
    //   177: iconst_0
    //   178: aload_3
    //   179: invokevirtual 229	java/lang/ClassNotFoundException:getMessage	()Ljava/lang/String;
    //   182: aastore
    //   183: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: aconst_null
    //   187: astore_3
    //   188: goto -125 -> 63
    //   191: astore_3
    //   192: ldc 98
    //   194: ldc 241
    //   196: iconst_1
    //   197: anewarray 4	java/lang/Object
    //   200: dup
    //   201: iconst_0
    //   202: aload_3
    //   203: invokevirtual 165	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   206: aastore
    //   207: invokestatic 175	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   210: iconst_m1
    //   211: istore_0
    //   212: goto -101 -> 111
    //   215: ldc 233
    //   217: invokestatic 37	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   220: iconst_1
    //   221: istore_1
    //   222: goto -206 -> 16
    //
    // Exception table:
    //   from	to	target	type
    //   31	63	143	java/lang/NoSuchMethodException
    //   31	63	167	java/lang/ClassNotFoundException
    //   67	111	191	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.f.b
 * JD-Core Version:    0.6.2
 */