package com.tencent.mm.compatible.loader;

import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.util.TypedValue;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.zip.ZipFile;
import org.xmlpull.v1.XmlPullParser;

public class PluginResourceLoader extends Resources
{
  public Resources euo;
  private Method eup;
  private Method euq;
  private HashMap<String, ZipFile> eur;
  private final b<WeakReference<Drawable.ConstantState>> eus;

  private Drawable a(TypedValue paramTypedValue, int paramInt)
  {
    AppMethodBeat.i(93032);
    try
    {
      Drawable localDrawable1 = (Drawable)this.eup.invoke(this.euo, new Object[] { paramTypedValue, Integer.valueOf(paramInt) });
      AppMethodBeat.o(93032);
      paramTypedValue = localDrawable1;
      return paramTypedValue;
    }
    catch (StackOverflowError localStackOverflowError)
    {
      while (true)
      {
        ab.e("MicroMsg.PluginResourceLoader", "load drawable StackOverflowError");
        try
        {
          if ((paramTypedValue.string != null) && (paramTypedValue.string.toString().endsWith(".xml")))
          {
            localObject = b(paramTypedValue.string.toString(), paramInt, paramTypedValue.assetCookie, "drawable");
            Drawable localDrawable2 = Drawable.createFromXml(this, (XmlPullParser)localObject);
            ((XmlResourceParser)localObject).close();
            AppMethodBeat.o(93032);
            paramTypedValue = localDrawable2;
          }
        }
        catch (Exception localException1)
        {
          Object localObject = this.eur.entrySet().iterator();
          while (true)
            if (((Iterator)localObject).hasNext())
            {
              Drawable localDrawable3 = a((ZipFile)((Map.Entry)((Iterator)localObject).next()).getValue(), paramTypedValue);
              if (localDrawable3 != null)
              {
                AppMethodBeat.o(93032);
                paramTypedValue = localDrawable3;
                break;
              }
            }
          ab.d("MicroMsg.PluginResourceLoader", "loadFromZipFile null");
          paramTypedValue = null;
          AppMethodBeat.o(93032);
        }
      }
    }
    catch (Exception localException2)
    {
      label52: break label52;
    }
  }

  // ERROR //
  private Drawable a(ZipFile paramZipFile, TypedValue paramTypedValue)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aconst_null
    //   3: astore 4
    //   5: aconst_null
    //   6: astore 5
    //   8: ldc 142
    //   10: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   13: aload_2
    //   14: getfield 67	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   17: ifnonnull +13 -> 30
    //   20: ldc 142
    //   22: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   25: aload 5
    //   27: astore_1
    //   28: aload_1
    //   29: areturn
    //   30: aload_2
    //   31: getfield 85	android/util/TypedValue:assetCookie	I
    //   34: i2l
    //   35: lstore 6
    //   37: aload_2
    //   38: getfield 145	android/util/TypedValue:data	I
    //   41: i2l
    //   42: lload 6
    //   44: bipush 32
    //   46: lshl
    //   47: lor
    //   48: lstore 6
    //   50: aload_0
    //   51: getfield 147	com/tencent/mm/compatible/loader/PluginResourceLoader:eus	Lcom/tencent/mm/compatible/loader/b;
    //   54: astore 5
    //   56: aload 5
    //   58: getfield 153	com/tencent/mm/compatible/loader/b:Lk	[J
    //   61: aload 5
    //   63: getfield 156	com/tencent/mm/compatible/loader/b:mSize	I
    //   66: lload 6
    //   68: invokestatic 159	com/tencent/mm/compatible/loader/b:b	([JIJ)I
    //   71: istore 8
    //   73: iload 8
    //   75: iflt +17 -> 92
    //   78: aload 5
    //   80: getfield 163	com/tencent/mm/compatible/loader/b:Ll	[Ljava/lang/Object;
    //   83: iload 8
    //   85: aaload
    //   86: getstatic 167	com/tencent/mm/compatible/loader/b:Li	Ljava/lang/Object;
    //   89: if_acmpne +64 -> 153
    //   92: aconst_null
    //   93: astore 5
    //   95: aload 5
    //   97: checkcast 169	java/lang/ref/WeakReference
    //   100: astore 5
    //   102: aload 5
    //   104: ifnull +121 -> 225
    //   107: aload 5
    //   109: invokevirtual 172	java/lang/ref/WeakReference:get	()Ljava/lang/Object;
    //   112: checkcast 174	android/graphics/drawable/Drawable$ConstantState
    //   115: astore 5
    //   117: aload 5
    //   119: ifnull +47 -> 166
    //   122: aload 5
    //   124: aload_0
    //   125: invokevirtual 178	android/graphics/drawable/Drawable$ConstantState:newDrawable	(Landroid/content/res/Resources;)Landroid/graphics/drawable/Drawable;
    //   128: astore 5
    //   130: aload 5
    //   132: ifnull +99 -> 231
    //   135: ldc 53
    //   137: ldc 180
    //   139: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: ldc 142
    //   144: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload 5
    //   149: astore_1
    //   150: goto -122 -> 28
    //   153: aload 5
    //   155: getfield 163	com/tencent/mm/compatible/loader/b:Ll	[Ljava/lang/Object;
    //   158: iload 8
    //   160: aaload
    //   161: astore 5
    //   163: goto -68 -> 95
    //   166: aload_0
    //   167: getfield 147	com/tencent/mm/compatible/loader/PluginResourceLoader:eus	Lcom/tencent/mm/compatible/loader/b;
    //   170: astore 5
    //   172: aload 5
    //   174: getfield 153	com/tencent/mm/compatible/loader/b:Lk	[J
    //   177: aload 5
    //   179: getfield 156	com/tencent/mm/compatible/loader/b:mSize	I
    //   182: lload 6
    //   184: invokestatic 159	com/tencent/mm/compatible/loader/b:b	([JIJ)I
    //   187: istore 8
    //   189: iload 8
    //   191: iflt +34 -> 225
    //   194: aload 5
    //   196: getfield 163	com/tencent/mm/compatible/loader/b:Ll	[Ljava/lang/Object;
    //   199: iload 8
    //   201: aaload
    //   202: getstatic 167	com/tencent/mm/compatible/loader/b:Li	Ljava/lang/Object;
    //   205: if_acmpeq +20 -> 225
    //   208: aload 5
    //   210: getfield 163	com/tencent/mm/compatible/loader/b:Ll	[Ljava/lang/Object;
    //   213: iload 8
    //   215: getstatic 167	com/tencent/mm/compatible/loader/b:Li	Ljava/lang/Object;
    //   218: aastore
    //   219: aload 5
    //   221: iconst_1
    //   222: putfield 187	com/tencent/mm/compatible/loader/b:Lj	Z
    //   225: aconst_null
    //   226: astore 5
    //   228: goto -98 -> 130
    //   231: aload_2
    //   232: getfield 67	android/util/TypedValue:string	Ljava/lang/CharSequence;
    //   235: invokeinterface 73 1 0
    //   240: astore 9
    //   242: aload 5
    //   244: astore 10
    //   246: ldc 53
    //   248: ldc 189
    //   250: iconst_2
    //   251: anewarray 34	java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: aload 9
    //   258: aastore
    //   259: dup
    //   260: iconst_1
    //   261: aload_1
    //   262: invokevirtual 192	java/util/zip/ZipFile:getName	()Ljava/lang/String;
    //   265: aastore
    //   266: invokestatic 195	com/tencent/mm/sdk/platformtools/ab:v	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   269: aload 5
    //   271: astore 10
    //   273: aload_1
    //   274: aload 9
    //   276: invokevirtual 199	java/util/zip/ZipFile:getEntry	(Ljava/lang/String;)Ljava/util/zip/ZipEntry;
    //   279: astore 11
    //   281: aload 4
    //   283: astore 10
    //   285: aload_1
    //   286: aload 11
    //   288: invokevirtual 203	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   291: astore 4
    //   293: aload 4
    //   295: astore_3
    //   296: aload 4
    //   298: astore 10
    //   300: aload_0
    //   301: aload_2
    //   302: aload 4
    //   304: aload 9
    //   306: invokestatic 207	android/graphics/drawable/Drawable:createFromResourceStream	(Landroid/content/res/Resources;Landroid/util/TypedValue;Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   309: astore_2
    //   310: aload_2
    //   311: astore 5
    //   313: aload 5
    //   315: astore_2
    //   316: aload 4
    //   318: astore 10
    //   320: aload 4
    //   322: ifnull +15 -> 337
    //   325: aload 4
    //   327: invokevirtual 210	java/io/InputStream:close	()V
    //   330: aload 4
    //   332: astore 10
    //   334: aload 5
    //   336: astore_2
    //   337: aload_2
    //   338: astore 5
    //   340: aload_2
    //   341: ifnonnull +192 -> 533
    //   344: aload 10
    //   346: astore_3
    //   347: aload_1
    //   348: aload 11
    //   350: invokevirtual 203	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   353: astore 4
    //   355: aload 4
    //   357: astore_3
    //   358: aload 4
    //   360: astore 10
    //   362: aload 4
    //   364: aload 9
    //   366: invokestatic 214	android/graphics/drawable/Drawable:createFromStream	(Ljava/io/InputStream;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    //   369: astore_1
    //   370: aload_1
    //   371: astore 5
    //   373: aload 4
    //   375: ifnull +158 -> 533
    //   378: aload 4
    //   380: invokevirtual 210	java/io/InputStream:close	()V
    //   383: aload_1
    //   384: ifnull +23 -> 407
    //   387: aload_0
    //   388: getfield 147	com/tencent/mm/compatible/loader/PluginResourceLoader:eus	Lcom/tencent/mm/compatible/loader/b;
    //   391: lload 6
    //   393: new 169	java/lang/ref/WeakReference
    //   396: dup
    //   397: aload_1
    //   398: invokevirtual 218	android/graphics/drawable/Drawable:getConstantState	()Landroid/graphics/drawable/Drawable$ConstantState;
    //   401: invokespecial 222	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   404: invokevirtual 226	com/tencent/mm/compatible/loader/b:put	(JLjava/lang/Object;)V
    //   407: ldc 142
    //   409: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   412: goto -384 -> 28
    //   415: astore_2
    //   416: aload 5
    //   418: astore_2
    //   419: aload_3
    //   420: astore 10
    //   422: aload_3
    //   423: ifnull -86 -> 337
    //   426: aload_3
    //   427: invokevirtual 210	java/io/InputStream:close	()V
    //   430: aload 5
    //   432: astore_2
    //   433: aload_3
    //   434: astore 10
    //   436: goto -99 -> 337
    //   439: astore_2
    //   440: aload 5
    //   442: astore_2
    //   443: aload_3
    //   444: astore 10
    //   446: goto -109 -> 337
    //   449: astore_1
    //   450: aload 10
    //   452: ifnull +8 -> 460
    //   455: aload 10
    //   457: invokevirtual 210	java/io/InputStream:close	()V
    //   460: aload 5
    //   462: astore 10
    //   464: ldc 142
    //   466: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   469: aload 5
    //   471: astore 10
    //   473: aload_1
    //   474: athrow
    //   475: astore_1
    //   476: aload 10
    //   478: astore_1
    //   479: goto -96 -> 383
    //   482: astore_2
    //   483: goto -100 -> 383
    //   486: astore_1
    //   487: aload_2
    //   488: astore 5
    //   490: aload_3
    //   491: ifnull +42 -> 533
    //   494: aload_3
    //   495: invokevirtual 210	java/io/InputStream:close	()V
    //   498: aload_2
    //   499: astore_1
    //   500: goto -117 -> 383
    //   503: astore_1
    //   504: aload_2
    //   505: astore_1
    //   506: goto -123 -> 383
    //   509: astore_1
    //   510: aload 10
    //   512: ifnull +8 -> 520
    //   515: aload 10
    //   517: invokevirtual 210	java/io/InputStream:close	()V
    //   520: aload_2
    //   521: astore 10
    //   523: ldc 142
    //   525: invokestatic 51	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   528: aload_2
    //   529: astore 10
    //   531: aload_1
    //   532: athrow
    //   533: aload 5
    //   535: astore_1
    //   536: goto -153 -> 383
    //   539: astore_2
    //   540: aload 5
    //   542: astore_2
    //   543: aload 4
    //   545: astore 10
    //   547: goto -210 -> 337
    //   550: astore_2
    //   551: goto -91 -> 460
    //   554: astore 5
    //   556: goto -36 -> 520
    //
    // Exception table:
    //   from	to	target	type
    //   285	293	415	java/lang/Exception
    //   300	310	415	java/lang/Exception
    //   426	430	439	java/lang/Exception
    //   285	293	449	finally
    //   300	310	449	finally
    //   246	269	475	java/lang/Exception
    //   273	281	475	java/lang/Exception
    //   464	469	475	java/lang/Exception
    //   473	475	475	java/lang/Exception
    //   523	528	475	java/lang/Exception
    //   531	533	475	java/lang/Exception
    //   378	383	482	java/lang/Exception
    //   347	355	486	java/lang/Exception
    //   362	370	486	java/lang/Exception
    //   494	498	503	java/lang/Exception
    //   347	355	509	finally
    //   362	370	509	finally
    //   325	330	539	java/lang/Exception
    //   455	460	550	java/lang/Exception
    //   515	520	554	java/lang/Exception
  }

  private XmlResourceParser b(String paramString1, int paramInt1, int paramInt2, String paramString2)
  {
    AppMethodBeat.i(93028);
    try
    {
      paramString1 = (XmlResourceParser)this.euq.invoke(this.euo, new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString2 });
      AppMethodBeat.o(93028);
      return paramString1;
    }
    catch (Exception paramString1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.PluginResourceLoader", paramString1, "", new Object[0]);
        paramString1 = null;
        AppMethodBeat.o(93028);
      }
    }
  }

  private static InputStream b(ZipFile paramZipFile, TypedValue paramTypedValue)
  {
    Object localObject = null;
    AppMethodBeat.i(93034);
    if (paramTypedValue.string == null)
    {
      AppMethodBeat.o(93034);
      paramZipFile = localObject;
    }
    while (true)
    {
      return paramZipFile;
      paramTypedValue = paramTypedValue.string.toString();
      try
      {
        ab.d("MicroMsg.PluginResourceLoader", "try load stream from zip, entry=%s, file=%s", new Object[] { paramTypedValue, paramZipFile.getName() });
        paramZipFile = paramZipFile.getInputStream(paramZipFile.getEntry(paramTypedValue));
        AppMethodBeat.o(93034);
      }
      catch (Exception paramZipFile)
      {
        AppMethodBeat.o(93034);
        paramZipFile = localObject;
      }
    }
  }

  Drawable loadDrawable(TypedValue paramTypedValue, int paramInt)
  {
    AppMethodBeat.i(93029);
    paramTypedValue = a(paramTypedValue, paramInt);
    AppMethodBeat.o(93029);
    return paramTypedValue;
  }

  Drawable loadDrawable(TypedValue paramTypedValue, int paramInt, boolean paramBoolean)
  {
    AppMethodBeat.i(93030);
    paramTypedValue = a(paramTypedValue, paramInt);
    AppMethodBeat.o(93030);
    return paramTypedValue;
  }

  public InputStream openRawResource(int paramInt, TypedValue paramTypedValue)
  {
    InputStream localInputStream1 = null;
    AppMethodBeat.i(93031);
    getValue(paramInt, paramTypedValue, true);
    try
    {
      InputStream localInputStream2 = super.openRawResource(paramInt, paramTypedValue);
      if (localInputStream2 == null)
      {
        Iterator localIterator = this.eur.entrySet().iterator();
        localInputStream2 = localInputStream1;
        while (localIterator.hasNext())
        {
          localInputStream1 = b((ZipFile)((Map.Entry)localIterator.next()).getValue(), paramTypedValue);
          localInputStream2 = localInputStream1;
          if (localInputStream1 != null)
            localInputStream2 = localInputStream1;
        }
        AppMethodBeat.o(93031);
        return localInputStream2;
      }
    }
    catch (Exception localException)
    {
      while (true)
        Object localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.compatible.loader.PluginResourceLoader
 * JD-Core Version:    0.6.2
 */