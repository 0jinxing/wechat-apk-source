package com.tencent.mm.ui.base.preference;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class i
{
  private static HashMap<String, Constructor<?>> yCT;
  private static final Class<?>[] yCU;
  private final Object[] VX;
  private final Context mContext;

  static
  {
    AppMethodBeat.i(107248);
    yCT = new HashMap();
    yCU = new Class[] { Context.class, AttributeSet.class };
    AppMethodBeat.o(107248);
  }

  public i(Context paramContext)
  {
    AppMethodBeat.i(107242);
    this.VX = new Object[2];
    this.mContext = paramContext;
    AppMethodBeat.o(107242);
  }

  private Preference a(String paramString, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(107246);
    try
    {
      Preference localPreference;
      if (-1 == paramString.indexOf('.'))
        localPreference = a(paramString, "com.tencent.mm.ui.base.preference.", paramAttributeSet);
      for (paramString = localPreference; ; paramString = localPreference)
      {
        AppMethodBeat.o(107246);
        return paramString;
        localPreference = a(paramString, null, paramAttributeSet);
      }
    }
    catch (InflateException paramString)
    {
      AppMethodBeat.o(107246);
      throw paramString;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      paramString = new InflateException(paramAttributeSet.getPositionDescription() + ": Error inflating class " + paramString);
      paramString.initCause(localClassNotFoundException);
      AppMethodBeat.o(107246);
      throw paramString;
    }
    catch (Exception localException)
    {
      paramString = new InflateException(paramAttributeSet.getPositionDescription() + ": Error inflating class " + paramString);
      paramString.initCause(localException);
      AppMethodBeat.o(107246);
    }
    throw paramString;
  }

  // ERROR //
  private Preference a(String paramString1, String paramString2, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: ldc 95
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 30	com/tencent/mm/ui/base/preference/i:yCT	Ljava/util/HashMap;
    //   8: aload_1
    //   9: invokevirtual 99	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast 101	java/lang/reflect/Constructor
    //   15: astore 4
    //   17: aload 4
    //   19: ifnonnull +297 -> 316
    //   22: ldc 103
    //   24: ldc 105
    //   26: iconst_1
    //   27: anewarray 4	java/lang/Object
    //   30: dup
    //   31: iconst_0
    //   32: aload_0
    //   33: getfield 49	com/tencent/mm/ui/base/preference/i:mContext	Landroid/content/Context;
    //   36: invokevirtual 109	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   39: invokevirtual 110	java/lang/Object:toString	()Ljava/lang/String;
    //   42: aastore
    //   43: invokestatic 116	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: aload_0
    //   47: getfield 49	com/tencent/mm/ui/base/preference/i:mContext	Landroid/content/Context;
    //   50: invokevirtual 120	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   53: astore 5
    //   55: aload_2
    //   56: ifnull +96 -> 152
    //   59: new 71	java/lang/StringBuilder
    //   62: astore 6
    //   64: aload 6
    //   66: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   69: aload 6
    //   71: aload_2
    //   72: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   75: aload_1
    //   76: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   79: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   82: astore 6
    //   84: aload 5
    //   86: aload 6
    //   88: invokevirtual 126	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   91: getstatic 38	com/tencent/mm/ui/base/preference/i:yCU	[Ljava/lang/Class;
    //   94: invokevirtual 130	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   97: astore 6
    //   99: aload 6
    //   101: astore 4
    //   103: getstatic 30	com/tencent/mm/ui/base/preference/i:yCT	Ljava/util/HashMap;
    //   106: aload_1
    //   107: aload 6
    //   109: invokevirtual 134	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   112: pop
    //   113: aload 6
    //   115: astore 4
    //   117: aload_0
    //   118: getfield 47	com/tencent/mm/ui/base/preference/i:VX	[Ljava/lang/Object;
    //   121: astore 5
    //   123: aload 5
    //   125: iconst_1
    //   126: aload_3
    //   127: aastore
    //   128: aload 6
    //   130: astore 4
    //   132: aload 6
    //   134: aload 5
    //   136: invokevirtual 138	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   139: checkcast 140	com/tencent/mm/ui/base/preference/Preference
    //   142: astore 6
    //   144: ldc 95
    //   146: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   149: aload 6
    //   151: areturn
    //   152: aload_1
    //   153: astore 6
    //   155: goto -71 -> 84
    //   158: astore 4
    //   160: new 71	java/lang/StringBuilder
    //   163: dup
    //   164: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   167: aload_3
    //   168: invokeinterface 76 1 0
    //   173: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: ldc 82
    //   178: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   181: astore 6
    //   183: aload_1
    //   184: astore_3
    //   185: aload_2
    //   186: ifnull +22 -> 208
    //   189: new 71	java/lang/StringBuilder
    //   192: dup
    //   193: invokespecial 72	java/lang/StringBuilder:<init>	()V
    //   196: aload_2
    //   197: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   200: aload_1
    //   201: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: astore_3
    //   208: new 53	android/view/InflateException
    //   211: dup
    //   212: aload 6
    //   214: aload_3
    //   215: invokevirtual 80	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   218: invokevirtual 85	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   221: invokespecial 88	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   224: astore_1
    //   225: aload_1
    //   226: aload 4
    //   228: invokevirtual 92	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   231: pop
    //   232: ldc 95
    //   234: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   237: aload_1
    //   238: athrow
    //   239: astore_1
    //   240: ldc 95
    //   242: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   245: aload_1
    //   246: athrow
    //   247: astore_2
    //   248: aload_3
    //   249: ifnull +32 -> 281
    //   252: aload_3
    //   253: invokeinterface 76 1 0
    //   258: astore_1
    //   259: new 53	android/view/InflateException
    //   262: dup
    //   263: aload_1
    //   264: invokespecial 88	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   267: astore_1
    //   268: aload_1
    //   269: aload_2
    //   270: invokevirtual 92	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   273: pop
    //   274: ldc 95
    //   276: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   279: aload_1
    //   280: athrow
    //   281: ldc 142
    //   283: aload 4
    //   285: invokestatic 146	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   288: invokevirtual 150	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   291: ifnull +15 -> 306
    //   294: aload 4
    //   296: invokevirtual 154	java/lang/Object:getClass	()Ljava/lang/Class;
    //   299: invokevirtual 157	java/lang/Class:getName	()Ljava/lang/String;
    //   302: astore_1
    //   303: goto -44 -> 259
    //   306: ldc 159
    //   308: astore_1
    //   309: goto -50 -> 259
    //   312: astore_2
    //   313: goto -65 -> 248
    //   316: aload 4
    //   318: astore 6
    //   320: goto -207 -> 113
    //
    // Exception table:
    //   from	to	target	type
    //   22	55	158	java/lang/NoSuchMethodException
    //   59	84	158	java/lang/NoSuchMethodException
    //   84	99	158	java/lang/NoSuchMethodException
    //   103	113	158	java/lang/NoSuchMethodException
    //   117	123	158	java/lang/NoSuchMethodException
    //   132	144	158	java/lang/NoSuchMethodException
    //   22	55	239	java/lang/ClassNotFoundException
    //   59	84	239	java/lang/ClassNotFoundException
    //   84	99	239	java/lang/ClassNotFoundException
    //   103	113	239	java/lang/ClassNotFoundException
    //   117	123	239	java/lang/ClassNotFoundException
    //   132	144	239	java/lang/ClassNotFoundException
    //   22	55	247	java/lang/Exception
    //   59	84	247	java/lang/Exception
    //   84	99	247	java/lang/Exception
    //   103	113	312	java/lang/Exception
    //   117	123	312	java/lang/Exception
    //   132	144	312	java/lang/Exception
  }

  private void a(XmlPullParser paramXmlPullParser, f paramf)
  {
    AppMethodBeat.i(107244);
    Object localObject;
    synchronized (this.VX)
    {
      localObject = Xml.asAttributeSet(paramXmlPullParser);
      this.VX[0] = this.mContext;
    }
    try
    {
      for (int i = paramXmlPullParser.next(); (i != 2) && (i != 1); i = paramXmlPullParser.next());
      if (i != 2)
      {
        localObject = new android/view/InflateException;
        paramf = new java/lang/StringBuilder;
        paramf.<init>();
        ((InflateException)localObject).<init>(paramXmlPullParser.getPositionDescription() + ": No start tag found!");
        AppMethodBeat.o(107244);
        throw ((Throwable)localObject);
      }
    }
    catch (InflateException paramXmlPullParser)
    {
      AppMethodBeat.o(107244);
      throw paramXmlPullParser;
      paramXmlPullParser = finally;
      AppMethodBeat.o(107244);
      throw paramXmlPullParser;
      a(paramXmlPullParser.getName(), (AttributeSet)localObject);
      a(paramXmlPullParser, paramf, (AttributeSet)localObject);
      AppMethodBeat.o(107244);
      return;
    }
    catch (XmlPullParserException paramXmlPullParser)
    {
      paramf = new android/view/InflateException;
      paramf.<init>(paramXmlPullParser.getMessage());
      paramf.initCause(paramXmlPullParser);
      AppMethodBeat.o(107244);
      throw paramf;
    }
    catch (IOException localIOException)
    {
      localObject = new android/view/InflateException;
      paramf = new java/lang/StringBuilder;
      paramf.<init>();
      ((InflateException)localObject).<init>(paramXmlPullParser.getPositionDescription() + ": " + localIOException.getMessage());
      ((InflateException)localObject).initCause(localIOException);
      AppMethodBeat.o(107244);
    }
    throw ((Throwable)localObject);
  }

  private void a(XmlPullParser paramXmlPullParser, f paramf, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(107247);
    int i = paramXmlPullParser.getDepth();
    int j = paramXmlPullParser.next();
    while (((j != 3) || (paramXmlPullParser.getDepth() > i)) && (j != 1))
      if (j != 2)
      {
        j = paramXmlPullParser.next();
      }
      else
      {
        paramf.a(a(paramXmlPullParser.getName(), paramAttributeSet), -1);
        j = paramXmlPullParser.next();
      }
    AppMethodBeat.o(107247);
  }

  public final void a(int paramInt, f paramf)
  {
    AppMethodBeat.i(107243);
    XmlResourceParser localXmlResourceParser = this.mContext.getResources().getXml(paramInt);
    try
    {
      a(localXmlResourceParser, paramf);
      return;
    }
    finally
    {
      localXmlResourceParser.close();
      AppMethodBeat.o(107243);
    }
    throw paramf;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.preference.i
 * JD-Core Version:    0.6.2
 */