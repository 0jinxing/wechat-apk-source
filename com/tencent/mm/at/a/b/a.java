package com.tencent.mm.at.a.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.c.f;
import com.tencent.mm.modelsfs.SFSContext;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.vfs.d;
import java.io.FileNotFoundException;
import java.io.InputStream;

public final class a
  implements com.tencent.mm.at.a.c.a
{
  private f fHl;

  private String a(String paramString, c paramc)
  {
    AppMethodBeat.i(116076);
    Object localObject1 = paramc.ePJ;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject2 = localObject1;
      if (((String)localObject1).length() != 0);
    }
    else
    {
      localObject1 = paramc.ePK;
      localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (((String)localObject1).length() != 0)
          localObject2 = (String)localObject1 + "/" + this.fHl.sF(paramString);
      }
    }
    localObject1 = localObject2;
    if (paramc.ePG)
    {
      localObject1 = localObject2;
      if (bo.isNullOrNil((String)localObject2))
        localObject1 = com.tencent.mm.at.a.g.b.Ur() + "/" + this.fHl.sF(paramString);
    }
    if ((localObject1 == null) || (((String)localObject1).length() == 0))
    {
      localObject1 = null;
      AppMethodBeat.o(116076);
    }
    while (true)
    {
      return localObject1;
      AppMethodBeat.o(116076);
    }
  }

  private String b(String paramString, c paramc)
  {
    AppMethodBeat.i(116077);
    String str1 = paramc.ePL;
    Object localObject;
    if (str1 != null)
    {
      localObject = str1;
      if (str1.length() != 0);
    }
    else
    {
      String str2 = paramc.ePJ;
      localObject = str1;
      if (str2 != null)
      {
        localObject = str1;
        if (str2.length() > 0)
        {
          paramc = paramc.ePK;
          if ((paramc == null) || (paramc.length() == 0) || (!str2.startsWith(paramc)))
          {
            ab.e("MicroMsg.imageloader.DefaultImageDiskCache", "[johnw] SFS can't deal with absolute path: %s", new Object[] { str2 });
            paramString = new IllegalArgumentException("SFS can't deal with absolute path: ".concat(String.valueOf(str2)));
            AppMethodBeat.o(116077);
            throw paramString;
          }
          paramc = str2.substring(paramc.length());
          localObject = paramc;
          if (paramc.startsWith("/"))
            localObject = paramc.substring(1);
        }
      }
    }
    if (localObject != null)
    {
      paramc = (c)localObject;
      if (((String)localObject).length() != 0);
    }
    else
    {
      paramc = this.fHl.sF(paramString);
    }
    if ((paramc == null) || (paramc.length() == 0))
    {
      paramc = null;
      AppMethodBeat.o(116077);
    }
    while (true)
    {
      return paramc;
      AppMethodBeat.o(116077);
    }
  }

  public final void a(f paramf)
  {
    this.fHl = paramf;
  }

  // ERROR //
  public final boolean a(String paramString, byte[] paramArrayOfByte, c paramc)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 4
    //   3: ldc 119
    //   5: invokestatic 22	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: aload_3
    //   9: getfield 123	com/tencent/mm/at/a/a/c:ePY	Lcom/tencent/mm/modelsfs/SFSContext;
    //   12: astore 5
    //   14: aload 5
    //   16: ifnull +103 -> 119
    //   19: aload_0
    //   20: aload_1
    //   21: aload_3
    //   22: invokespecial 125	com/tencent/mm/at/a/b/a:b	(Ljava/lang/String;Lcom/tencent/mm/at/a/a/c;)Ljava/lang/String;
    //   25: astore 6
    //   27: aload 6
    //   29: ifnonnull +11 -> 40
    //   32: ldc 119
    //   34: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   37: iload 4
    //   39: ireturn
    //   40: aconst_null
    //   41: astore_3
    //   42: aconst_null
    //   43: astore_1
    //   44: aload 5
    //   46: aload 6
    //   48: invokevirtual 131	com/tencent/mm/modelsfs/SFSContext:pH	(Ljava/lang/String;)Ljava/io/OutputStream;
    //   51: astore 5
    //   53: aload 5
    //   55: astore_1
    //   56: aload 5
    //   58: astore_3
    //   59: aload 5
    //   61: aload_2
    //   62: invokevirtual 137	java/io/OutputStream:write	([B)V
    //   65: aload 5
    //   67: ifnull +8 -> 75
    //   70: aload 5
    //   72: invokevirtual 140	java/io/OutputStream:close	()V
    //   75: iconst_1
    //   76: istore 4
    //   78: ldc 119
    //   80: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   83: goto -46 -> 37
    //   86: astore_2
    //   87: aload_1
    //   88: ifnull +7 -> 95
    //   91: aload_1
    //   92: invokevirtual 140	java/io/OutputStream:close	()V
    //   95: ldc 119
    //   97: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   100: goto -63 -> 37
    //   103: astore_1
    //   104: aload_3
    //   105: ifnull +7 -> 112
    //   108: aload_3
    //   109: invokevirtual 140	java/io/OutputStream:close	()V
    //   112: ldc 119
    //   114: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   117: aload_1
    //   118: athrow
    //   119: aload_0
    //   120: aload_1
    //   121: aload_3
    //   122: invokespecial 142	com/tencent/mm/at/a/b/a:a	(Ljava/lang/String;Lcom/tencent/mm/at/a/a/c;)Ljava/lang/String;
    //   125: astore_1
    //   126: aload_1
    //   127: ifnonnull +11 -> 138
    //   130: ldc 119
    //   132: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   135: goto -98 -> 37
    //   138: new 144	com/tencent/mm/vfs/b
    //   141: dup
    //   142: aload_1
    //   143: invokespecial 145	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   146: invokevirtual 149	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   149: astore_3
    //   150: aload_3
    //   151: ifnull +15 -> 166
    //   154: aload_3
    //   155: invokevirtual 153	com/tencent/mm/vfs/b:exists	()Z
    //   158: ifne +8 -> 166
    //   161: aload_3
    //   162: invokevirtual 156	com/tencent/mm/vfs/b:mkdirs	()Z
    //   165: pop
    //   166: new 144	com/tencent/mm/vfs/b
    //   169: dup
    //   170: aload_1
    //   171: invokespecial 145	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   174: astore_3
    //   175: aload_3
    //   176: invokevirtual 153	com/tencent/mm/vfs/b:exists	()Z
    //   179: ifne +8 -> 187
    //   182: aload_3
    //   183: invokevirtual 159	com/tencent/mm/vfs/b:createNewFile	()Z
    //   186: pop
    //   187: aload_2
    //   188: ifnull -113 -> 75
    //   191: aload_1
    //   192: aload_2
    //   193: aload_2
    //   194: arraylength
    //   195: invokestatic 164	com/tencent/mm/vfs/e:b	(Ljava/lang/String;[BI)I
    //   198: ifge -123 -> 75
    //   201: ldc 119
    //   203: invokestatic 76	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   206: goto -169 -> 37
    //   209: astore_3
    //   210: ldc 86
    //   212: aload_3
    //   213: invokestatic 168	com/tencent/mm/sdk/platformtools/bo:l	(Ljava/lang/Throwable;)Ljava/lang/String;
    //   216: invokestatic 171	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   219: goto -32 -> 187
    //   222: astore_1
    //   223: goto -148 -> 75
    //   226: astore_1
    //   227: goto -132 -> 95
    //   230: astore_2
    //   231: goto -119 -> 112
    //
    // Exception table:
    //   from	to	target	type
    //   44	53	86	java/io/IOException
    //   59	65	86	java/io/IOException
    //   44	53	103	finally
    //   59	65	103	finally
    //   182	187	209	java/lang/Exception
    //   70	75	222	java/io/IOException
    //   91	95	226	java/io/IOException
    //   108	112	230	java/io/IOException
  }

  public final void ahH()
  {
    AppMethodBeat.i(116080);
    com.tencent.mm.at.a.g.b.ahJ();
    AppMethodBeat.o(116080);
  }

  public final boolean c(String paramString, c paramc)
  {
    boolean bool = false;
    AppMethodBeat.i(116079);
    SFSContext localSFSContext = paramc.ePY;
    if (localSFSContext != null)
    {
      paramString = b(paramString, paramc);
      if (paramString == null)
        AppMethodBeat.o(116079);
    }
    while (true)
    {
      return bool;
      bool = localSFSContext.pI(paramString);
      AppMethodBeat.o(116079);
      continue;
      paramString = a(paramString, paramc);
      if (paramString == null)
      {
        AppMethodBeat.o(116079);
      }
      else
      {
        bool = new com.tencent.mm.vfs.b(paramString).delete();
        AppMethodBeat.o(116079);
      }
    }
  }

  public final InputStream d(String paramString, c paramc)
  {
    Object localObject = null;
    AppMethodBeat.i(116081);
    try
    {
      SFSContext localSFSContext = paramc.ePY;
      if (localSFSContext != null)
      {
        paramString = b(paramString, paramc);
        if (paramString == null)
        {
          AppMethodBeat.o(116081);
          paramString = localObject;
        }
      }
      while (true)
      {
        return paramString;
        paramString = localSFSContext.openRead(paramString);
        AppMethodBeat.o(116081);
        continue;
        paramString = a(paramString, paramc);
        if (paramString == null)
        {
          AppMethodBeat.o(116081);
          paramString = localObject;
        }
        else
        {
          paramString = new d(paramString);
          AppMethodBeat.o(116081);
        }
      }
    }
    catch (FileNotFoundException paramString)
    {
      while (true)
      {
        AppMethodBeat.o(116081);
        paramString = localObject;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.b.a
 * JD-Core Version:    0.6.2
 */