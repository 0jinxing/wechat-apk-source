package com.tencent.mm.plugin.location.ui.impl;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.ref.WeakReference;

final class h$a extends AsyncTask<String, Integer, String>
{
  private final WeakReference<Context> nRe;
  private final WeakReference<View> nRf;

  h$a(Context paramContext, View paramView)
  {
    AppMethodBeat.i(113705);
    this.nRe = new WeakReference(paramContext);
    this.nRf = new WeakReference(paramView);
    AppMethodBeat.o(113705);
  }

  // ERROR //
  private static String Qd(String paramString)
  {
    // Byte code:
    //   0: ldc 47
    //   2: invokestatic 29	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_1
    //   7: aconst_null
    //   8: astore_2
    //   9: aload_2
    //   10: astore_3
    //   11: aload_1
    //   12: astore 4
    //   14: new 49	java/net/URL
    //   17: astore 5
    //   19: aload_2
    //   20: astore_3
    //   21: aload_1
    //   22: astore 4
    //   24: aload 5
    //   26: aload_0
    //   27: invokespecial 52	java/net/URL:<init>	(Ljava/lang/String;)V
    //   30: aload_2
    //   31: astore_3
    //   32: aload_1
    //   33: astore 4
    //   35: aload 5
    //   37: invokevirtual 56	java/net/URL:openStream	()Ljava/io/InputStream;
    //   40: astore_0
    //   41: aload_0
    //   42: astore_3
    //   43: aload_0
    //   44: astore 4
    //   46: sipush 1024
    //   49: newarray byte
    //   51: astore_1
    //   52: aload_0
    //   53: astore_3
    //   54: aload_0
    //   55: astore 4
    //   57: aload_0
    //   58: aload_1
    //   59: invokevirtual 62	java/io/InputStream:read	([B)I
    //   62: istore 6
    //   64: aload_0
    //   65: astore_3
    //   66: aload_0
    //   67: astore 4
    //   69: new 64	java/lang/String
    //   72: astore_2
    //   73: aload_0
    //   74: astore_3
    //   75: aload_0
    //   76: astore 4
    //   78: aload_2
    //   79: aload_1
    //   80: invokespecial 67	java/lang/String:<init>	([B)V
    //   83: aload_0
    //   84: astore 4
    //   86: ldc 69
    //   88: ldc 71
    //   90: iload 6
    //   92: invokestatic 75	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   95: invokevirtual 78	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   98: invokestatic 84	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   101: aload_2
    //   102: astore 4
    //   104: aload_0
    //   105: ifnull +10 -> 115
    //   108: aload_0
    //   109: invokevirtual 87	java/io/InputStream:close	()V
    //   112: aload_2
    //   113: astore 4
    //   115: ldc 47
    //   117: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   120: aload 4
    //   122: areturn
    //   123: astore_0
    //   124: ldc 69
    //   126: ldc 89
    //   128: iconst_1
    //   129: anewarray 91	java/lang/Object
    //   132: dup
    //   133: iconst_0
    //   134: aload_0
    //   135: invokevirtual 95	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   138: aastore
    //   139: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   142: aload_2
    //   143: astore 4
    //   145: goto -30 -> 115
    //   148: astore_2
    //   149: ldc 101
    //   151: astore 4
    //   153: aload_3
    //   154: astore_0
    //   155: aload 4
    //   157: astore_3
    //   158: aload_0
    //   159: astore 4
    //   161: ldc 69
    //   163: ldc 103
    //   165: iconst_1
    //   166: anewarray 91	java/lang/Object
    //   169: dup
    //   170: iconst_0
    //   171: aload_2
    //   172: invokevirtual 95	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   175: aastore
    //   176: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   179: aload_3
    //   180: astore 4
    //   182: aload_0
    //   183: ifnull -68 -> 115
    //   186: aload_0
    //   187: invokevirtual 87	java/io/InputStream:close	()V
    //   190: aload_3
    //   191: astore 4
    //   193: goto -78 -> 115
    //   196: astore_0
    //   197: ldc 69
    //   199: ldc 89
    //   201: iconst_1
    //   202: anewarray 91	java/lang/Object
    //   205: dup
    //   206: iconst_0
    //   207: aload_0
    //   208: invokevirtual 95	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   211: aastore
    //   212: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   215: aload_3
    //   216: astore 4
    //   218: goto -103 -> 115
    //   221: astore_0
    //   222: aload 4
    //   224: ifnull +8 -> 232
    //   227: aload 4
    //   229: invokevirtual 87	java/io/InputStream:close	()V
    //   232: ldc 47
    //   234: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: aload_0
    //   238: athrow
    //   239: astore 4
    //   241: ldc 69
    //   243: ldc 89
    //   245: iconst_1
    //   246: anewarray 91	java/lang/Object
    //   249: dup
    //   250: iconst_0
    //   251: aload 4
    //   253: invokevirtual 95	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   256: aastore
    //   257: invokestatic 99	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   260: goto -28 -> 232
    //   263: astore 4
    //   265: aload_2
    //   266: astore_3
    //   267: aload 4
    //   269: astore_2
    //   270: goto -112 -> 158
    //
    // Exception table:
    //   from	to	target	type
    //   108	112	123	java/lang/Exception
    //   14	19	148	java/lang/Exception
    //   24	30	148	java/lang/Exception
    //   35	41	148	java/lang/Exception
    //   46	52	148	java/lang/Exception
    //   57	64	148	java/lang/Exception
    //   69	73	148	java/lang/Exception
    //   78	83	148	java/lang/Exception
    //   186	190	196	java/lang/Exception
    //   14	19	221	finally
    //   24	30	221	finally
    //   35	41	221	finally
    //   46	52	221	finally
    //   57	64	221	finally
    //   69	73	221	finally
    //   78	83	221	finally
    //   86	101	221	finally
    //   161	179	221	finally
    //   227	232	239	java/lang/Exception
    //   86	101	263	java/lang/Exception
  }

  protected final void onPreExecute()
  {
    AppMethodBeat.i(113706);
    View localView = (View)this.nRf.get();
    if (localView != null)
      localView.setVisibility(0);
    AppMethodBeat.o(113706);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.h.a
 * JD-Core Version:    0.6.2
 */