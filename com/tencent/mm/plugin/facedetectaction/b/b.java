package com.tencent.mm.plugin.facedetectaction.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.k;
import com.tencent.youtu.ytcommon.YTCommonExInterface;
import com.tencent.youtu.ytposedetect.YTPoseDetectInterface.PoseDetectOnFrame;

public class b
{
  public int mcm;
  public YTPoseDetectInterface.PoseDetectOnFrame mcn = null;
  a mco;
  public int status = -1;

  static
  {
    AppMethodBeat.i(686);
    k.a("YTCommonEx", b.class.getClassLoader());
    k.a("YTFaceTrace", b.class.getClassLoader());
    k.a("YTNextCV", b.class.getClassLoader());
    k.a("YTPoseDetect", b.class.getClassLoader());
    YTCommonExInterface.setIsEnabledLog(true);
    YTCommonExInterface.setIsEnabledNativeLog(true);
    AppMethodBeat.o(686);
  }

  // ERROR //
  final boolean f(com.tencent.mm.ui.MMActivity paramMMActivity)
  {
    // Byte code:
    //   0: sipush 685
    //   3: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: ldc 71
    //   8: ldc 73
    //   10: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   13: invokestatic 84	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   16: invokevirtual 90	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   19: astore_2
    //   20: new 92	java/lang/StringBuilder
    //   23: astore_3
    //   24: aload_3
    //   25: ldc 94
    //   27: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   30: aload_2
    //   31: aload_3
    //   32: getstatic 103	java/io/File:separator	Ljava/lang/String;
    //   35: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc 109
    //   40: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   43: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   46: invokevirtual 119	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   49: astore 4
    //   51: invokestatic 84	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   54: invokevirtual 90	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   57: astore_3
    //   58: new 92	java/lang/StringBuilder
    //   61: astore_2
    //   62: aload_2
    //   63: ldc 94
    //   65: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   68: aload_3
    //   69: aload_2
    //   70: getstatic 103	java/io/File:separator	Ljava/lang/String;
    //   73: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   76: ldc 121
    //   78: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   81: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   84: invokevirtual 119	android/content/res/AssetManager:open	(Ljava/lang/String;)Ljava/io/InputStream;
    //   87: astore 5
    //   89: aload 4
    //   91: invokevirtual 127	java/io/InputStream:available	()I
    //   94: newarray byte
    //   96: astore_3
    //   97: aload 4
    //   99: aload_3
    //   100: invokevirtual 131	java/io/InputStream:read	([B)I
    //   103: pop
    //   104: aload 5
    //   106: invokevirtual 127	java/io/InputStream:available	()I
    //   109: newarray byte
    //   111: astore_2
    //   112: aload 5
    //   114: aload_2
    //   115: invokevirtual 131	java/io/InputStream:read	([B)I
    //   118: pop
    //   119: aload 4
    //   121: invokevirtual 134	java/io/InputStream:close	()V
    //   124: aload 5
    //   126: invokevirtual 134	java/io/InputStream:close	()V
    //   129: invokestatic 139	com/tencent/mm/plugin/facedetect/model/p:bsR	()Ljava/lang/String;
    //   132: invokestatic 145	com/tencent/mm/modelsfs/FileOp:ct	(Ljava/lang/String;)Z
    //   135: ifne +42 -> 177
    //   138: ldc 71
    //   140: ldc 147
    //   142: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: invokestatic 84	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   148: new 92	java/lang/StringBuilder
    //   151: dup
    //   152: ldc 94
    //   154: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   157: getstatic 103	java/io/File:separator	Ljava/lang/String;
    //   160: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   163: ldc 149
    //   165: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   168: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   171: invokestatic 139	com/tencent/mm/plugin/facedetect/model/p:bsR	()Ljava/lang/String;
    //   174: invokestatic 153	com/tencent/mm/plugin/facedetect/model/p:p	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    //   177: ldc 71
    //   179: ldc 155
    //   181: iconst_1
    //   182: anewarray 4	java/lang/Object
    //   185: dup
    //   186: iconst_0
    //   187: invokestatic 139	com/tencent/mm/plugin/facedetect/model/p:bsR	()Ljava/lang/String;
    //   190: aastore
    //   191: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   194: invokestatic 139	com/tencent/mm/plugin/facedetect/model/p:bsR	()Ljava/lang/String;
    //   197: invokestatic 164	com/tencent/youtu/ytposedetect/YTPoseDetectInterface:initModel	(Ljava/lang/String;)I
    //   200: istore 6
    //   202: ldc 71
    //   204: ldc 166
    //   206: iconst_1
    //   207: anewarray 4	java/lang/Object
    //   210: dup
    //   211: iconst_0
    //   212: iload 6
    //   214: invokestatic 172	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   217: aastore
    //   218: invokestatic 158	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   221: iload 6
    //   223: ifeq +85 -> 308
    //   226: ldc 71
    //   228: ldc 174
    //   230: iload 6
    //   232: invokestatic 179	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   235: invokevirtual 183	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   238: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   241: iconst_0
    //   242: istore 6
    //   244: iload 6
    //   246: ifeq +101 -> 347
    //   249: aload_1
    //   250: sipush 255
    //   253: invokestatic 187	com/tencent/youtu/ytcommon/YTCommonExInterface:setAppBrightness	(Landroid/app/Activity;I)F
    //   256: pop
    //   257: aload_0
    //   258: iconst_1
    //   259: putfield 59	com/tencent/mm/plugin/facedetectaction/b/b:status	I
    //   262: sipush 685
    //   265: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   268: iconst_1
    //   269: istore 7
    //   271: iload 7
    //   273: ireturn
    //   274: astore 4
    //   276: aconst_null
    //   277: astore_2
    //   278: aconst_null
    //   279: astore_3
    //   280: ldc 71
    //   282: new 92	java/lang/StringBuilder
    //   285: dup
    //   286: ldc 189
    //   288: invokespecial 97	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   291: aload 4
    //   293: invokevirtual 192	java/io/IOException:getMessage	()Ljava/lang/String;
    //   296: invokevirtual 107	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: invokevirtual 113	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   302: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   305: goto -176 -> 129
    //   308: aload_3
    //   309: aload_2
    //   310: invokestatic 197	com/tencent/youtu/ytfacetrace/YTFaceTraceInterface:initModel	([B[B)I
    //   313: istore 6
    //   315: iload 6
    //   317: ifeq +24 -> 341
    //   320: ldc 71
    //   322: ldc 199
    //   324: iload 6
    //   326: invokestatic 179	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   329: invokevirtual 183	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   332: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   335: iconst_0
    //   336: istore 6
    //   338: goto -94 -> 244
    //   341: iconst_1
    //   342: istore 6
    //   344: goto -100 -> 244
    //   347: sipush 685
    //   350: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   353: iconst_0
    //   354: istore 7
    //   356: goto -85 -> 271
    //   359: astore 4
    //   361: aconst_null
    //   362: astore_2
    //   363: goto -83 -> 280
    //   366: astore 4
    //   368: goto -88 -> 280
    //
    // Exception table:
    //   from	to	target	type
    //   13	97	274	java/io/IOException
    //   97	112	359	java/io/IOException
    //   112	129	366	java/io/IOException
  }

  public static abstract interface a
  {
    public abstract void a(byte[][] paramArrayOfByte, int paramInt1, int paramInt2);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetectaction.b.b
 * JD-Core Version:    0.6.2
 */