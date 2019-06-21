package com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground;

import a.f.b.j;
import a.l;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/FileUtils;", "", "()V", "TAG", "", "copyFileFromAssets", "", "context", "Landroid/content/Context;", "srcFileName", "dstFileName", "getSavedFileDirectory", "plugin-appbrand-integration_release"})
public final class e
{
  private static final String TAG = "FileUtils";
  public static final e iZE;

  static
  {
    AppMethodBeat.i(135255);
    iZE = new e();
    TAG = "FileUtils";
    AppMethodBeat.o(135255);
  }

  public static String dn(Context paramContext)
  {
    AppMethodBeat.i(135254);
    j.p(paramContext, "context");
    StringBuilder localStringBuilder = new StringBuilder();
    paramContext = paramContext.getFilesDir();
    j.o(paramContext, "context.filesDir");
    paramContext = paramContext.getParent() + File.separator + "appbrand/glsl/";
    AppMethodBeat.o(135254);
    return paramContext;
  }

  // ERROR //
  public static void p(Context paramContext, String paramString1, String paramString2)
  {
    // Byte code:
    //   0: ldc 92
    //   2: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 51
    //   8: invokestatic 57	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   11: aload_1
    //   12: ldc 93
    //   14: invokestatic 57	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   17: aload_2
    //   18: ldc 94
    //   20: invokestatic 57	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   23: getstatic 42	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/e:TAG	Ljava/lang/String;
    //   26: ldc 96
    //   28: iconst_2
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: aload_1
    //   35: aastore
    //   36: dup
    //   37: iconst_1
    //   38: aload_2
    //   39: aastore
    //   40: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   43: new 72	java/io/File
    //   46: astore_3
    //   47: aload_3
    //   48: aload_2
    //   49: invokespecial 104	java/io/File:<init>	(Ljava/lang/String;)V
    //   52: aload_0
    //   53: invokevirtual 108	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   56: aload_1
    //   57: invokevirtual 114	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   60: astore_2
    //   61: new 116	java/io/FileOutputStream
    //   64: astore_0
    //   65: aload_0
    //   66: aload_3
    //   67: invokespecial 119	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   70: aload_0
    //   71: checkcast 121	java/io/OutputStream
    //   74: astore_0
    //   75: sipush 1024
    //   78: newarray byte
    //   80: astore 4
    //   82: aload_2
    //   83: ifnonnull +6 -> 89
    //   86: invokestatic 124	a/f/b/j:dWJ	()V
    //   89: aload_2
    //   90: aload 4
    //   92: invokevirtual 130	java/io/InputStream:read	([B)I
    //   95: istore 5
    //   97: iload 5
    //   99: iconst_m1
    //   100: if_icmpeq +54 -> 154
    //   103: aload_0
    //   104: aload 4
    //   106: iconst_0
    //   107: iload 5
    //   109: invokevirtual 134	java/io/OutputStream:write	([BII)V
    //   112: goto -30 -> 82
    //   115: astore_1
    //   116: getstatic 42	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/e:TAG	Ljava/lang/String;
    //   119: aload_1
    //   120: checkcast 136	java/lang/Throwable
    //   123: ldc 138
    //   125: iconst_0
    //   126: anewarray 4	java/lang/Object
    //   129: invokestatic 142	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   132: aload_2
    //   133: ifnull +7 -> 140
    //   136: aload_2
    //   137: invokevirtual 145	java/io/InputStream:close	()V
    //   140: aload_0
    //   141: ifnull +68 -> 209
    //   144: aload_0
    //   145: invokevirtual 146	java/io/OutputStream:close	()V
    //   148: ldc 92
    //   150: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: return
    //   154: aload_0
    //   155: invokevirtual 149	java/io/OutputStream:flush	()V
    //   158: getstatic 42	com/tencent/mm/plugin/appbrand/widget/desktop/dynamicbackground/e:TAG	Ljava/lang/String;
    //   161: ldc 151
    //   163: iconst_2
    //   164: anewarray 4	java/lang/Object
    //   167: dup
    //   168: iconst_0
    //   169: aload_1
    //   170: aastore
    //   171: dup
    //   172: iconst_1
    //   173: aload_3
    //   174: invokevirtual 155	java/io/File:length	()J
    //   177: invokestatic 161	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   180: aastore
    //   181: invokestatic 101	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   184: aload_2
    //   185: invokevirtual 145	java/io/InputStream:close	()V
    //   188: aload_0
    //   189: invokevirtual 146	java/io/OutputStream:close	()V
    //   192: ldc 92
    //   194: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   197: goto -44 -> 153
    //   200: astore_0
    //   201: ldc 92
    //   203: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: goto -53 -> 153
    //   209: ldc 92
    //   211: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   214: goto -61 -> 153
    //   217: astore_0
    //   218: ldc 92
    //   220: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   223: goto -70 -> 153
    //   226: astore_1
    //   227: aconst_null
    //   228: astore_0
    //   229: aconst_null
    //   230: astore_2
    //   231: aload_2
    //   232: ifnull +7 -> 239
    //   235: aload_2
    //   236: invokevirtual 145	java/io/InputStream:close	()V
    //   239: aload_0
    //   240: ifnull +7 -> 247
    //   243: aload_0
    //   244: invokevirtual 146	java/io/OutputStream:close	()V
    //   247: ldc 92
    //   249: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   252: aload_1
    //   253: athrow
    //   254: astore_0
    //   255: goto -8 -> 247
    //   258: astore_1
    //   259: aconst_null
    //   260: astore_0
    //   261: goto -30 -> 231
    //   264: astore_1
    //   265: goto -34 -> 231
    //   268: astore_1
    //   269: goto -38 -> 231
    //   272: astore_1
    //   273: aconst_null
    //   274: astore_0
    //   275: aconst_null
    //   276: astore_2
    //   277: goto -161 -> 116
    //   280: astore_1
    //   281: aconst_null
    //   282: astore_0
    //   283: goto -167 -> 116
    //
    // Exception table:
    //   from	to	target	type
    //   75	82	115	java/lang/Exception
    //   86	89	115	java/lang/Exception
    //   89	97	115	java/lang/Exception
    //   103	112	115	java/lang/Exception
    //   154	184	115	java/lang/Exception
    //   184	192	200	java/lang/Exception
    //   136	140	217	java/lang/Exception
    //   144	153	217	java/lang/Exception
    //   43	61	226	finally
    //   235	239	254	java/lang/Exception
    //   243	247	254	java/lang/Exception
    //   61	75	258	finally
    //   75	82	264	finally
    //   86	89	264	finally
    //   89	97	264	finally
    //   103	112	264	finally
    //   154	184	264	finally
    //   116	132	268	finally
    //   43	61	272	java/lang/Exception
    //   61	75	280	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.desktop.dynamicbackground.e
 * JD-Core Version:    0.6.2
 */