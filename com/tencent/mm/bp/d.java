package com.tencent.mm.bp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.support.v4.app.Fragment;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.hardcoder.WXHardCoderJNI;
import com.tencent.mm.ipcinvoker.wx_extension.service.ToolsProcessIPCService;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.at;
import com.tencent.mm.plugin.expt.a.a.a;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.pluginsdk.o;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.service.ProcessService.DexOptProcessService;
import com.tencent.mm.service.ProcessService.ExDeviceProcessService;
import com.tencent.mm.service.ProcessService.MMProcessService;
import com.tencent.mm.service.ProcessService.PushProcessServicer;
import com.tencent.mm.service.ProcessService.SandBoxProcessService;
import com.tencent.mm.service.ProcessService.SupportProcessService;
import com.tencent.mm.service.ProcessService.ToolsProcessService;
import com.tencent.mm.service.ProcessService.ToolsmpProcessService;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.MMWizardActivity;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public final class d
{
  private static final Map<String, String> vwE;
  private static HashMap<String, com.tencent.mm.pluginsdk.b.c> vwF;
  private static final HashSet<String> vwG;

  static
  {
    AppMethodBeat.i(114738);
    HashMap localHashMap = new HashMap();
    vwE = localHashMap;
    localHashMap.put("location", "talkroom");
    vwE.put("talkroom", "voip");
    vwF = new HashMap();
    vwG = new d.13();
    AppMethodBeat.o(114738);
  }

  public static void H(Context paramContext, String paramString1, String paramString2)
  {
    AppMethodBeat.i(114700);
    c(paramContext, paramString1, paramString2, null);
    AppMethodBeat.o(114700);
  }

  public static com.tencent.mm.pluginsdk.b.a I(Context paramContext, String paramString1, String paramString2)
  {
    Object localObject1 = null;
    AppMethodBeat.i(114731);
    Object localObject2 = akw(paramString1);
    if (localObject2 == null)
    {
      ab.f("MicroMsg.PluginHelper", "create contact widget failed, plugin=%s, type=%s", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(114731);
      paramContext = localObject1;
    }
    while (true)
    {
      return paramContext;
      localObject2 = ((com.tencent.mm.pluginsdk.b.c)localObject2).getContactWidgetFactory();
      if (localObject2 == null)
      {
        ab.f("MicroMsg.PluginHelper", "create contact widget factory failed, plugin=%s, type=%s", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(114731);
        paramContext = localObject1;
      }
      else
      {
        paramContext = ((com.tencent.mm.pluginsdk.b.b)localObject2).ac(paramContext, paramString2);
        AppMethodBeat.o(114731);
      }
    }
  }

  public static boolean Qb()
  {
    AppMethodBeat.i(138545);
    boolean bool = ToolsProcessIPCService.Qb();
    AppMethodBeat.o(138545);
    return bool;
  }

  // ERROR //
  public static com.tencent.mm.pluginsdk.b.c a(String paramString, a parama, b paramb)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 118
    //   5: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 39	com/tencent/mm/bp/d:vwE	Ljava/util/Map;
    //   11: aload_0
    //   12: invokeinterface 122 2 0
    //   17: checkcast 124	java/lang/String
    //   20: astore_3
    //   21: aload_3
    //   22: ifnull +22 -> 44
    //   25: ldc 78
    //   27: ldc 126
    //   29: iconst_2
    //   30: anewarray 4	java/lang/Object
    //   33: dup
    //   34: iconst_0
    //   35: aload_0
    //   36: aastore
    //   37: dup
    //   38: iconst_1
    //   39: aload_3
    //   40: aastore
    //   41: invokestatic 129	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   44: getstatic 53	com/tencent/mm/bp/d:vwF	Ljava/util/HashMap;
    //   47: aload_0
    //   48: invokevirtual 130	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   51: checkcast 88	com/tencent/mm/pluginsdk/b/c
    //   54: astore_3
    //   55: aload_3
    //   56: ifnull +21 -> 77
    //   59: aload_1
    //   60: invokeinterface 135 1 0
    //   65: ldc 118
    //   67: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   70: aload_3
    //   71: astore_0
    //   72: ldc 2
    //   74: monitorexit
    //   75: aload_0
    //   76: areturn
    //   77: aload_0
    //   78: invokestatic 138	com/tencent/mm/bp/d:akx	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/b/c;
    //   81: astore_3
    //   82: aload_3
    //   83: ifnull +9 -> 92
    //   86: aload_1
    //   87: invokeinterface 135 1 0
    //   92: ldc 118
    //   94: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   97: aload_3
    //   98: astore_0
    //   99: goto -27 -> 72
    //   102: astore_0
    //   103: ldc 2
    //   105: monitorexit
    //   106: aload_0
    //   107: athrow
    //   108: astore_3
    //   109: aload_0
    //   110: invokestatic 138	com/tencent/mm/bp/d:akx	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/b/c;
    //   113: astore_3
    //   114: aload_3
    //   115: ifnull +9 -> 124
    //   118: aload_1
    //   119: invokeinterface 135 1 0
    //   124: ldc 118
    //   126: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   129: aload_3
    //   130: astore_0
    //   131: goto -59 -> 72
    //   134: astore_1
    //   135: ldc 78
    //   137: ldc 140
    //   139: iconst_2
    //   140: anewarray 4	java/lang/Object
    //   143: dup
    //   144: iconst_0
    //   145: aload_0
    //   146: aastore
    //   147: dup
    //   148: iconst_1
    //   149: aload_1
    //   150: invokevirtual 144	java/lang/ClassNotFoundException:toString	()Ljava/lang/String;
    //   153: aastore
    //   154: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   157: ldc 78
    //   159: ldc 146
    //   161: iconst_1
    //   162: anewarray 4	java/lang/Object
    //   165: dup
    //   166: iconst_0
    //   167: aload_0
    //   168: aastore
    //   169: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   172: new 148	java/lang/IllegalArgumentException
    //   175: astore_0
    //   176: aload_0
    //   177: ldc 150
    //   179: invokespecial 153	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   182: aload_2
    //   183: aload_0
    //   184: invokeinterface 159 2 0
    //   189: aconst_null
    //   190: astore_0
    //   191: ldc 118
    //   193: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   196: goto -124 -> 72
    //   199: astore_1
    //   200: ldc 78
    //   202: ldc 161
    //   204: iconst_2
    //   205: anewarray 4	java/lang/Object
    //   208: dup
    //   209: iconst_0
    //   210: aload_0
    //   211: aastore
    //   212: dup
    //   213: iconst_1
    //   214: aload_1
    //   215: invokevirtual 162	java/lang/InstantiationException:toString	()Ljava/lang/String;
    //   218: aastore
    //   219: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   222: goto -65 -> 157
    //   225: astore_1
    //   226: ldc 78
    //   228: ldc 164
    //   230: iconst_2
    //   231: anewarray 4	java/lang/Object
    //   234: dup
    //   235: iconst_0
    //   236: aload_0
    //   237: aastore
    //   238: dup
    //   239: iconst_1
    //   240: aload_1
    //   241: invokevirtual 165	java/lang/IllegalAccessException:toString	()Ljava/lang/String;
    //   244: aastore
    //   245: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   248: goto -91 -> 157
    //
    // Exception table:
    //   from	to	target	type
    //   3	21	102	finally
    //   25	44	102	finally
    //   44	55	102	finally
    //   59	70	102	finally
    //   77	82	102	finally
    //   86	92	102	finally
    //   92	97	102	finally
    //   109	114	102	finally
    //   118	124	102	finally
    //   124	129	102	finally
    //   135	157	102	finally
    //   157	189	102	finally
    //   191	196	102	finally
    //   200	222	102	finally
    //   226	248	102	finally
    //   77	82	108	java/lang/Exception
    //   86	92	108	java/lang/Exception
    //   109	114	134	java/lang/ClassNotFoundException
    //   118	124	134	java/lang/ClassNotFoundException
    //   109	114	199	java/lang/InstantiationException
    //   118	124	199	java/lang/InstantiationException
    //   109	114	225	java/lang/IllegalAccessException
    //   118	124	225	java/lang/IllegalAccessException
  }

  public static void a(final Context paramContext, final String paramString1, final String paramString2, Intent paramIntent)
  {
    AppMethodBeat.i(114698);
    a(paramString1, new a()
    {
      public final void onDone()
      {
        AppMethodBeat.i(114685);
        Intent localIntent;
        if (this.val$intent == null)
        {
          localIntent = new Intent();
          str = ah.doz() + ".plugin." + paramString1;
          if (!paramString2.startsWith("."))
            break label114;
        }
        label114: for (String str = str + paramString2; ; str = paramString2)
        {
          localIntent.setClassName(ah.getPackageName(), str);
          MMWizardActivity.J(paramContext, localIntent);
          AppMethodBeat.o(114685);
          return;
          localIntent = this.val$intent;
          break;
        }
      }
    }
    , new d.6(paramString1));
    AppMethodBeat.o(114698);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(114710);
    ab.d("MicroMsg.PluginHelper", "start activity for result, need try load plugin[%B]", new Object[] { Boolean.valueOf(paramBoolean) });
    a(paramString1, new d.11(paramIntent, paramString1, paramString2, paramContext, paramInt), new b()
    {
      public final void e(Exception paramAnonymousException)
      {
        AppMethodBeat.i(114696);
        ab.f("MicroMsg.PluginHelper", "start activity failed, plugin(%s) not loaded", new Object[] { this.vwC });
        ab.e("MicroMsg.PluginHelper", "start activity failed,%s", new Object[] { paramAnonymousException });
        AppMethodBeat.o(114696);
      }
    });
    AppMethodBeat.o(114710);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent1, Intent paramIntent2)
  {
    AppMethodBeat.i(114699);
    a(paramString1, new d.7(paramIntent1, paramString1, paramString2, paramContext, paramIntent2), new d.8(paramString1));
    AppMethodBeat.o(114699);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, Intent paramIntent, Bundle paramBundle)
  {
    AppMethodBeat.i(114702);
    if (!com.tencent.mm.compatible.util.d.fP(21));
    try
    {
      if ((paramContext.getSharedPreferences(ah.doA(), 0).getBoolean("settings_multi_webview", false)) && (".ui.tools.WebViewUI".endsWith(paramString2)))
      {
        ab.i("MicroMsg.PluginHelper", "start multi webview!!!!!!!!!");
        paramIntent.addFlags(134217728);
        paramIntent.addFlags(524288);
      }
      b(paramContext, paramString1, paramString2, paramIntent, paramBundle);
      AppMethodBeat.o(114702);
      return;
    }
    catch (Exception localException)
    {
      while (true)
        ab.e("MicroMsg.PluginHelper", "%s", new Object[] { localException.getMessage() });
    }
  }

  public static void a(ServiceConnection paramServiceConnection, String paramString)
  {
    AppMethodBeat.i(114725);
    com.tencent.mm.service.c.a(paramServiceConnection, paramString, true, aku(paramString));
    AppMethodBeat.o(114725);
  }

  public static void a(Fragment paramFragment, String paramString, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(114715);
    String str = ah.doz();
    if (paramString.startsWith("."))
    {
      str = str + paramString;
      paramIntent.setClassName(ah.getPackageName(), str);
      if (!(paramFragment instanceof Fragment))
        break label87;
      paramFragment.startActivityForResult(paramIntent, paramInt);
      g(paramFragment.getActivity(), paramString, paramIntent);
      AppMethodBeat.o(114715);
    }
    while (true)
    {
      return;
      str = paramString;
      break;
      label87: ab.f("MicroMsg.PluginHelper", "fragment not Fragment, skipped");
      AppMethodBeat.o(114715);
    }
  }

  public static void a(Fragment paramFragment, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(114711);
    ab.d("MicroMsg.PluginHelper", "start activity for result, need try load plugin[%B]", new Object[] { Boolean.TRUE });
    a(paramString1, new d.4(paramIntent, paramString1, paramString2, paramFragment, paramInt), new d.5(paramString1));
    AppMethodBeat.o(114711);
  }

  public static void a(d.b paramb, String paramString1, String paramString2, Intent paramIntent, int paramInt, d.a parama)
  {
    AppMethodBeat.i(114716);
    ab.d("MicroMsg.PluginHelper", "start activity for result, need try load plugin[%B]", new Object[] { Boolean.TRUE });
    a(paramString1, new d.2(paramIntent, paramString1, paramString2, paramb, paramInt, parama), new d.3(paramString1));
    AppMethodBeat.o(114716);
  }

  public static void a(MMActivity paramMMActivity, String paramString, Intent paramIntent, int paramInt, MMActivity.a parama)
  {
    AppMethodBeat.i(114714);
    Intent localIntent;
    if (paramIntent == null)
    {
      localIntent = new Intent();
      str = ah.doz();
      if (!paramString.startsWith("."))
        break label93;
    }
    label93: for (String str = str + paramString; ; str = paramString)
    {
      localIntent.setClassName(ah.getPackageName(), str);
      paramMMActivity.b(parama, paramIntent, paramInt);
      g(paramMMActivity, paramString, paramIntent);
      AppMethodBeat.o(114714);
      return;
      localIntent = paramIntent;
      break;
    }
  }

  public static void a(String paramString, n paramn, m paramm)
  {
    AppMethodBeat.i(114729);
    ab.d("MicroMsg.PluginHelper", "--> registerApplication: %s", new Object[] { paramString });
    Object localObject = akw(paramString);
    if (localObject == null)
    {
      ab.f("MicroMsg.PluginHelper", "register application failed, plugin=%s", new Object[] { paramString });
      AppMethodBeat.o(114729);
    }
    while (true)
    {
      return;
      localObject = ((com.tencent.mm.pluginsdk.b.c)localObject).createApplication();
      if (localObject == null)
      {
        ab.w("MicroMsg.PluginHelper", "register application failed, plugin=%s", new Object[] { paramString });
        AppMethodBeat.o(114729);
      }
      else
      {
        ((o)localObject).a(paramm);
        ((o)localObject).a(paramn);
        ab.d("MicroMsg.PluginHelper", "<-- registerApplication successfully: %s %s %s", new Object[] { paramString, paramn, paramm });
        AppMethodBeat.o(114729);
      }
    }
  }

  public static boolean a(Intent paramIntent, ServiceConnection paramServiceConnection, String paramString)
  {
    AppMethodBeat.i(114724);
    boolean bool = com.tencent.mm.service.c.a(paramIntent, paramServiceConnection, 1, paramString, true, aku(paramString));
    AppMethodBeat.o(114724);
    return bool;
  }

  public static void aH(Intent paramIntent)
  {
    AppMethodBeat.i(114719);
    i(paramIntent, "mm");
    AppMethodBeat.o(114719);
  }

  public static void aI(Intent paramIntent)
  {
    AppMethodBeat.i(114722);
    k(paramIntent, "mm");
    AppMethodBeat.o(114722);
  }

  public static com.tencent.mm.pluginsdk.b.a ac(Context paramContext, String paramString)
  {
    AppMethodBeat.i(114730);
    paramContext = I(paramContext, paramString, null);
    AppMethodBeat.o(114730);
    return paramContext;
  }

  public static boolean afj(String paramString)
  {
    try
    {
      AppMethodBeat.i(114732);
      boolean bool;
      if (vwF.get(paramString) != null)
      {
        bool = true;
        AppMethodBeat.o(114732);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(114732);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  private static Intent aku(String paramString)
  {
    AppMethodBeat.i(114726);
    Object localObject = null;
    int i = -1;
    switch (paramString.hashCode())
    {
    default:
      switch (i)
      {
      default:
        paramString = localObject;
      case 0:
      case 1:
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
      }
      break;
    case 3488:
    case 3452698:
    case -1335091396:
    case 110545371:
    case 2016254153:
    case -1854767153:
    case -1140077378:
    case 1865400007:
    }
    while (true)
    {
      paramString = new Intent(ah.getContext(), paramString);
      AppMethodBeat.o(114726);
      return paramString;
      if (!paramString.equals("mm"))
        break;
      i = 0;
      break;
      if (!paramString.equals("push"))
        break;
      i = 1;
      break;
      if (!paramString.equals("dexopt"))
        break;
      i = 2;
      break;
      if (!paramString.equals("tools"))
        break;
      i = 3;
      break;
      if (!paramString.equals("exdevice"))
        break;
      i = 4;
      break;
      if (!paramString.equals("support"))
        break;
      i = 5;
      break;
      if (!paramString.equals("toolsmp"))
        break;
      i = 6;
      break;
      if (!paramString.equals("sandbox"))
        break;
      i = 7;
      break;
      paramString = ProcessService.MMProcessService.class;
      continue;
      paramString = ProcessService.PushProcessServicer.class;
      continue;
      paramString = ProcessService.DexOptProcessService.class;
      continue;
      paramString = ProcessService.ToolsProcessService.class;
      continue;
      paramString = ProcessService.ExDeviceProcessService.class;
      continue;
      paramString = ProcessService.SupportProcessService.class;
      continue;
      paramString = ProcessService.ToolsmpProcessService.class;
      continue;
      paramString = ProcessService.SandBoxProcessService.class;
    }
  }

  public static at akv(String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(114728);
    ab.d("MicroMsg.PluginHelper", "-->createSubCore: %s alone", new Object[] { paramString });
    Object localObject2 = akw(paramString);
    if (localObject2 == null)
    {
      ab.f("MicroMsg.PluginHelper", "register subcore failed, plugin=%s", new Object[] { paramString });
      AppMethodBeat.o(114728);
      paramString = localObject1;
    }
    while (true)
    {
      return paramString;
      localObject2 = ((com.tencent.mm.pluginsdk.b.c)localObject2).createSubCore();
      if (localObject2 == null)
      {
        ab.w("MicroMsg.PluginHelper", "create sub core failed, plugin=%s", new Object[] { paramString });
        AppMethodBeat.o(114728);
        paramString = localObject1;
      }
      else
      {
        ab.d("MicroMsg.PluginHelper", "<--createSubCore successfully: %s", new Object[] { paramString });
        AppMethodBeat.o(114728);
        paramString = (String)localObject2;
      }
    }
  }

  // ERROR //
  private static com.tencent.mm.pluginsdk.b.c akw(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 450
    //   6: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: invokestatic 138	com/tencent/mm/bp/d:akx	(Ljava/lang/String;)Lcom/tencent/mm/pluginsdk/b/c;
    //   13: astore_1
    //   14: aload_1
    //   15: astore_0
    //   16: ldc_w 450
    //   19: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   22: ldc 2
    //   24: monitorexit
    //   25: aload_0
    //   26: areturn
    //   27: astore_1
    //   28: ldc 78
    //   30: ldc_w 452
    //   33: iconst_2
    //   34: anewarray 4	java/lang/Object
    //   37: dup
    //   38: iconst_0
    //   39: aload_0
    //   40: aastore
    //   41: dup
    //   42: iconst_1
    //   43: aload_1
    //   44: invokevirtual 144	java/lang/ClassNotFoundException:toString	()Ljava/lang/String;
    //   47: aastore
    //   48: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   51: aconst_null
    //   52: astore_0
    //   53: ldc_w 450
    //   56: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: goto -37 -> 22
    //   62: astore_0
    //   63: ldc 2
    //   65: monitorexit
    //   66: aload_0
    //   67: athrow
    //   68: astore_1
    //   69: ldc 78
    //   71: ldc 161
    //   73: iconst_2
    //   74: anewarray 4	java/lang/Object
    //   77: dup
    //   78: iconst_0
    //   79: aload_0
    //   80: aastore
    //   81: dup
    //   82: iconst_1
    //   83: aload_1
    //   84: invokevirtual 162	java/lang/InstantiationException:toString	()Ljava/lang/String;
    //   87: aastore
    //   88: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   91: goto -40 -> 51
    //   94: astore_1
    //   95: ldc 78
    //   97: ldc 164
    //   99: iconst_2
    //   100: anewarray 4	java/lang/Object
    //   103: dup
    //   104: iconst_0
    //   105: aload_0
    //   106: aastore
    //   107: dup
    //   108: iconst_1
    //   109: aload_1
    //   110: invokevirtual 165	java/lang/IllegalAccessException:toString	()Ljava/lang/String;
    //   113: aastore
    //   114: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   117: goto -66 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   9	14	27	java/lang/ClassNotFoundException
    //   3	9	62	finally
    //   9	14	62	finally
    //   16	22	62	finally
    //   28	51	62	finally
    //   53	59	62	finally
    //   69	91	62	finally
    //   95	117	62	finally
    //   9	14	68	java/lang/InstantiationException
    //   9	14	94	java/lang/IllegalAccessException
  }

  private static com.tencent.mm.pluginsdk.b.c akx(String paramString)
  {
    AppMethodBeat.i(114735);
    com.tencent.mm.pluginsdk.b.c localc = (com.tencent.mm.pluginsdk.b.c)vwF.get(paramString);
    if (localc != null)
      AppMethodBeat.o(114735);
    for (paramString = localc; ; paramString = localc)
    {
      return paramString;
      localc = (com.tencent.mm.pluginsdk.b.c)ah.getContext().getClassLoader().loadClass(ah.doz() + ".plugin." + paramString + ".Plugin").newInstance();
      vwF.put(paramString, localc);
      AppMethodBeat.o(114735);
    }
  }

  private static boolean aky(String paramString)
  {
    try
    {
      AppMethodBeat.i(114737);
      boolean bool;
      if (akw(paramString) != null)
      {
        bool = true;
        AppMethodBeat.o(114737);
      }
      while (true)
      {
        return bool;
        bool = false;
        AppMethodBeat.o(114737);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public static void b(Context paramContext, String paramString, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(114713);
    String str = ah.doz();
    if (paramString.startsWith("."))
    {
      str = str + paramString;
      paramIntent.setClassName(ah.getPackageName(), str);
      if (!(paramContext instanceof Activity))
        break label87;
      ((Activity)paramContext).startActivityForResult(paramIntent, paramInt);
      g(paramContext, paramString, paramIntent);
      AppMethodBeat.o(114713);
    }
    while (true)
    {
      return;
      str = paramString;
      break;
      label87: ab.f("MicroMsg.PluginHelper", "context not activity, skipped");
      AppMethodBeat.o(114713);
    }
  }

  public static void b(Context paramContext, String paramString1, String paramString2, Intent paramIntent)
  {
    AppMethodBeat.i(114701);
    a(paramContext, paramString1, paramString2, paramIntent, null);
    AppMethodBeat.o(114701);
  }

  public static void b(Context paramContext, String paramString1, String paramString2, Intent paramIntent, int paramInt)
  {
    AppMethodBeat.i(114709);
    a(paramContext, paramString1, paramString2, paramIntent, paramInt, true);
    AppMethodBeat.o(114709);
  }

  private static void b(Context paramContext, String paramString1, String paramString2, Intent paramIntent, Bundle paramBundle)
  {
    AppMethodBeat.i(114704);
    ab.d("MicroMsg.PluginHelper", "start activity, need try load plugin[%B]", new Object[] { Boolean.TRUE });
    if (paramContext == null)
    {
      ab.e("MicroMsg.PluginHelper", "start activity error, context is null");
      AppMethodBeat.o(114704);
      return;
    }
    int m;
    if (".ui.tools.WebViewUI".equals(paramString2))
    {
      boolean bool = WXHardCoderJNI.hcBizEnable;
      int i = WXHardCoderJNI.hcBizDelay;
      int j = WXHardCoderJNI.hcBizCPU;
      int k = WXHardCoderJNI.hcBizIO;
      if (WXHardCoderJNI.hcBizThr)
      {
        m = Process.myTid();
        label83: ab.i("MicroMsg.PluginHelper", "summer hardcoder biz startPerformance [%s][%s]", new Object[] { Integer.valueOf(902), Integer.valueOf(WXHardCoderJNI.startPerformance(bool, i, j, k, m, WXHardCoderJNI.hcBizTimeout, 902, WXHardCoderJNI.hcBizAction, "MicroMsg.PluginHelper")) });
      }
    }
    while (true)
      try
      {
        Object localObject = paramIntent.getStringExtra("rawUrl");
        String str = paramString2;
        if (!bo.isNullOrNil((String)localObject))
        {
          localObject = Uri.parse((String)localObject);
          if (paramIntent.getLongExtra("start_activity_time", 0L) == 0L)
            paramIntent.putExtra("start_activity_time", System.currentTimeMillis());
          if ((((Uri)localObject).getHost() != null) && (((Uri)localObject).getHost().equals("game.weixin.qq.com")))
          {
            if (((com.tencent.mm.plugin.expt.a.a)g.K(com.tencent.mm.plugin.expt.a.a.class)).a(a.a.lFH, false))
            {
              paramString2 = "com.tencent.mm.plugin.game.luggage.LuggageGameWebViewUI";
              a(paramString1, new d.9(paramString1, paramString2, paramIntent, paramContext, paramBundle), new b()
              {
                public final void e(Exception paramAnonymousException)
                {
                  AppMethodBeat.i(114694);
                  ab.f("MicroMsg.PluginHelper", "start activity failed, plugin(%s) not loaded", new Object[] { this.vwC });
                  ab.e("MicroMsg.PluginHelper", "start activity failed,%s", new Object[] { paramAnonymousException });
                  AppMethodBeat.o(114694);
                }
              });
              AppMethodBeat.o(114704);
              break;
              m = 0;
              break label83;
            }
            paramString2 = ".ui.tools.game.GameWebViewUI";
            continue;
          }
          str = paramString2;
          if (((Uri)localObject).getHost() != null)
          {
            str = paramString2;
            if (((Uri)localObject).getHost().equals("mp.weixin.qq.com"))
            {
              str = paramString2;
              if (!ToolsProcessIPCService.Qb())
                str = ".ui.tools.WebviewMpUI";
            }
          }
        }
        paramString2 = str;
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.PluginHelper", "parse url failed :" + localException.getMessage());
      }
  }

  public static void c(Context paramContext, String paramString, Intent paramIntent, Bundle paramBundle)
  {
    AppMethodBeat.i(114707);
    Intent localIntent = paramIntent;
    if (paramIntent == null)
      localIntent = new Intent();
    String str = ah.doz();
    paramIntent = paramString;
    if (paramString.startsWith("."))
      paramIntent = str + paramString;
    localIntent.setClassName(ah.getPackageName(), paramIntent);
    if ((paramContext instanceof Activity))
    {
      paramContext.startActivity(localIntent, paramBundle);
      AppMethodBeat.o(114707);
    }
    while (true)
    {
      return;
      localIntent.addFlags(268435456);
      paramContext.startActivity(localIntent, paramBundle);
      AppMethodBeat.o(114707);
    }
  }

  public static void c(Context paramContext, String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(114708);
    a(paramContext, paramString1, paramString2, null, paramInt, true);
    AppMethodBeat.o(114708);
  }

  public static void c(Context paramContext, String paramString1, String paramString2, Intent paramIntent)
  {
    AppMethodBeat.i(114703);
    b(paramContext, paramString1, paramString2, paramIntent, null);
    AppMethodBeat.o(114703);
  }

  public static void dlK()
  {
    AppMethodBeat.i(114717);
    com.tencent.mm.service.c.a("mm", true, aku("mm"));
    AppMethodBeat.o(114717);
  }

  public static boolean dlL()
  {
    return false;
  }

  public static void f(Context paramContext, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(114706);
    c(paramContext, paramString, paramIntent, null);
    AppMethodBeat.o(114706);
  }

  public static void g(Context paramContext, String paramString, Intent paramIntent)
  {
    AppMethodBeat.i(114712);
    if ((paramIntent != null) && (vwG.contains(paramString)))
    {
      paramIntent.putExtra("animation_pop_in", true);
      com.tencent.mm.ui.base.b.K(paramContext, paramIntent);
    }
    AppMethodBeat.o(114712);
  }

  // ERROR //
  public static Class<?> hM(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc_w 650
    //   6: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: getstatic 39	com/tencent/mm/bp/d:vwE	Ljava/util/Map;
    //   12: aload_0
    //   13: invokeinterface 122 2 0
    //   18: checkcast 124	java/lang/String
    //   21: astore_2
    //   22: aload_2
    //   23: ifnull +22 -> 45
    //   26: ldc 78
    //   28: ldc 126
    //   30: iconst_2
    //   31: anewarray 4	java/lang/Object
    //   34: dup
    //   35: iconst_0
    //   36: aload_0
    //   37: aastore
    //   38: dup
    //   39: iconst_1
    //   40: aload_2
    //   41: aastore
    //   42: invokestatic 129	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: aload_0
    //   46: invokestatic 652	com/tencent/mm/bp/d:aky	(Ljava/lang/String;)Z
    //   49: ifne +31 -> 80
    //   52: ldc 78
    //   54: ldc 146
    //   56: iconst_1
    //   57: anewarray 4	java/lang/Object
    //   60: dup
    //   61: iconst_0
    //   62: aload_0
    //   63: aastore
    //   64: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   67: ldc_w 650
    //   70: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   73: aconst_null
    //   74: astore_0
    //   75: ldc 2
    //   77: monitorexit
    //   78: aload_0
    //   79: areturn
    //   80: new 279	java/lang/StringBuilder
    //   83: astore_2
    //   84: aload_2
    //   85: invokespecial 280	java/lang/StringBuilder:<init>	()V
    //   88: aload_2
    //   89: invokestatic 272	com/tencent/mm/sdk/platformtools/ah:doz	()Ljava/lang/String;
    //   92: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   95: ldc_w 459
    //   98: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   101: aload_0
    //   102: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   105: invokevirtual 285	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   108: astore_3
    //   109: aload_1
    //   110: astore_2
    //   111: aload_1
    //   112: ldc_w 274
    //   115: invokevirtual 277	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   118: ifeq +24 -> 142
    //   121: new 279	java/lang/StringBuilder
    //   124: astore_2
    //   125: aload_2
    //   126: invokespecial 280	java/lang/StringBuilder:<init>	()V
    //   129: aload_2
    //   130: aload_3
    //   131: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload_1
    //   135: invokevirtual 284	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   138: invokevirtual 285	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   141: astore_2
    //   142: invokestatic 397	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   145: invokevirtual 457	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   148: aload_2
    //   149: invokevirtual 467	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   152: astore_1
    //   153: aload_1
    //   154: astore_0
    //   155: ldc_w 650
    //   158: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: goto -86 -> 75
    //   164: astore_0
    //   165: ldc 2
    //   167: monitorexit
    //   168: aload_0
    //   169: athrow
    //   170: astore_1
    //   171: ldc 78
    //   173: ldc 146
    //   175: iconst_1
    //   176: anewarray 4	java/lang/Object
    //   179: dup
    //   180: iconst_0
    //   181: aload_0
    //   182: aastore
    //   183: invokestatic 86	com/tencent/mm/sdk/platformtools/ab:f	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   186: ldc_w 650
    //   189: invokestatic 61	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   192: aconst_null
    //   193: astore_0
    //   194: goto -119 -> 75
    //
    // Exception table:
    //   from	to	target	type
    //   3	22	164	finally
    //   26	45	164	finally
    //   45	73	164	finally
    //   80	109	164	finally
    //   111	142	164	finally
    //   142	153	164	finally
    //   155	161	164	finally
    //   171	192	164	finally
    //   142	153	170	java/lang/Exception
  }

  private static void i(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(114718);
    com.tencent.mm.service.c.a(paramIntent, paramString, true, aku(paramString));
    AppMethodBeat.o(114718);
  }

  public static void j(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(138546);
    i(paramIntent, paramString);
    AppMethodBeat.o(138546);
  }

  private static void k(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(114721);
    com.tencent.mm.service.c.b(paramIntent, paramString, true, aku(paramString));
    AppMethodBeat.o(114721);
  }

  public static void l(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(138547);
    k(paramIntent, paramString);
    AppMethodBeat.o(138547);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.bp.d
 * JD-Core Version:    0.6.2
 */