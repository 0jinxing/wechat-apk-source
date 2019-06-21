package com.tencent.weui.base.preference;

import android.content.Context;
import android.preference.Preference;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class c
{
  private static HashMap<String, Constructor<?>> yCT;
  private static final Class<?>[] yCU;
  private final Object[] VX;
  final Context mContext;

  static
  {
    AppMethodBeat.i(113281);
    yCU = new Class[] { Context.class, AttributeSet.class };
    yCT = new HashMap();
    AppMethodBeat.o(113281);
  }

  public c(Context paramContext)
  {
    AppMethodBeat.i(113276);
    this.VX = new Object[2];
    this.mContext = paramContext;
    AppMethodBeat.o(113276);
  }

  private void a(XmlPullParser paramXmlPullParser, a parama, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(113280);
    int i = paramXmlPullParser.getDepth();
    int j = paramXmlPullParser.next();
    while (((j != 3) || (paramXmlPullParser.getDepth() > i)) && (j != 1))
      if (j != 2)
      {
        j = paramXmlPullParser.next();
      }
      else
      {
        parama.a(b(paramXmlPullParser.getName(), paramAttributeSet));
        j = paramXmlPullParser.next();
      }
    AppMethodBeat.o(113280);
  }

  private Preference b(String paramString, AttributeSet paramAttributeSet)
  {
    AppMethodBeat.i(113279);
    try
    {
      Preference localPreference;
      if (-1 == paramString.indexOf('.'))
        localPreference = b(paramString, "android.preference.", paramAttributeSet);
      for (paramString = localPreference; ; paramString = localPreference)
      {
        AppMethodBeat.o(113279);
        return paramString;
        localPreference = b(paramString, null, paramAttributeSet);
      }
    }
    catch (InflateException paramString)
    {
      AppMethodBeat.o(113279);
      throw paramString;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      paramString = new InflateException(paramAttributeSet.getPositionDescription() + ": Error inflating class " + paramString);
      paramString.initCause(localClassNotFoundException);
      AppMethodBeat.o(113279);
      throw paramString;
    }
    catch (Exception localException)
    {
      paramString = new InflateException(paramAttributeSet.getPositionDescription() + ": Error inflating class " + paramString);
      paramString.initCause(localException);
      AppMethodBeat.o(113279);
    }
    throw paramString;
  }

  // ERROR //
  private Preference b(String paramString1, String paramString2, AttributeSet paramAttributeSet)
  {
    // Byte code:
    //   0: ldc 117
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 38	com/tencent/weui/base/preference/c:yCT	Ljava/util/HashMap;
    //   8: aload_1
    //   9: invokevirtual 121	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast 123	java/lang/reflect/Constructor
    //   15: astore 4
    //   17: aload 4
    //   19: ifnonnull +273 -> 292
    //   22: aload_0
    //   23: getfield 49	com/tencent/weui/base/preference/c:mContext	Landroid/content/Context;
    //   26: invokevirtual 127	android/content/Context:getClassLoader	()Ljava/lang/ClassLoader;
    //   29: astore 5
    //   31: aload_2
    //   32: ifnull +96 -> 128
    //   35: new 94	java/lang/StringBuilder
    //   38: astore 6
    //   40: aload 6
    //   42: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   45: aload 6
    //   47: aload_2
    //   48: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   51: aload_1
    //   52: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: astore 6
    //   60: aload 5
    //   62: aload 6
    //   64: invokevirtual 133	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   67: getstatic 31	com/tencent/weui/base/preference/c:yCU	[Ljava/lang/Class;
    //   70: invokevirtual 137	java/lang/Class:getConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   73: astore 6
    //   75: aload 6
    //   77: astore 4
    //   79: getstatic 38	com/tencent/weui/base/preference/c:yCT	Ljava/util/HashMap;
    //   82: aload_1
    //   83: aload 6
    //   85: invokevirtual 141	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   88: pop
    //   89: aload 6
    //   91: astore 4
    //   93: aload_0
    //   94: getfield 47	com/tencent/weui/base/preference/c:VX	[Ljava/lang/Object;
    //   97: astore 5
    //   99: aload 5
    //   101: iconst_1
    //   102: aload_3
    //   103: aastore
    //   104: aload 6
    //   106: astore 4
    //   108: aload 6
    //   110: aload 5
    //   112: invokevirtual 145	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   115: checkcast 147	android/preference/Preference
    //   118: astore 6
    //   120: ldc 117
    //   122: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   125: aload 6
    //   127: areturn
    //   128: aload_1
    //   129: astore 6
    //   131: goto -71 -> 60
    //   134: astore 4
    //   136: new 94	java/lang/StringBuilder
    //   139: dup
    //   140: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   143: aload_3
    //   144: invokeinterface 98 1 0
    //   149: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   152: ldc 104
    //   154: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   157: astore 6
    //   159: aload_1
    //   160: astore_3
    //   161: aload_2
    //   162: ifnull +22 -> 184
    //   165: new 94	java/lang/StringBuilder
    //   168: dup
    //   169: invokespecial 95	java/lang/StringBuilder:<init>	()V
    //   172: aload_2
    //   173: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   176: aload_1
    //   177: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: astore_3
    //   184: new 76	android/view/InflateException
    //   187: dup
    //   188: aload 6
    //   190: aload_3
    //   191: invokevirtual 102	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   194: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   197: invokespecial 110	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   200: astore_1
    //   201: aload_1
    //   202: aload 4
    //   204: invokevirtual 114	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   207: pop
    //   208: ldc 117
    //   210: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   213: aload_1
    //   214: athrow
    //   215: astore_1
    //   216: ldc 117
    //   218: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   221: aload_1
    //   222: athrow
    //   223: astore_2
    //   224: aload_3
    //   225: ifnull +32 -> 257
    //   228: aload_3
    //   229: invokeinterface 98 1 0
    //   234: astore_1
    //   235: new 76	android/view/InflateException
    //   238: dup
    //   239: aload_1
    //   240: invokespecial 110	android/view/InflateException:<init>	(Ljava/lang/String;)V
    //   243: astore_1
    //   244: aload_1
    //   245: aload_2
    //   246: invokevirtual 114	android/view/InflateException:initCause	(Ljava/lang/Throwable;)Ljava/lang/Throwable;
    //   249: pop
    //   250: ldc 117
    //   252: invokestatic 41	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   255: aload_1
    //   256: athrow
    //   257: ldc 149
    //   259: aload 4
    //   261: invokestatic 153	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   264: invokevirtual 157	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   267: ifnull +15 -> 282
    //   270: aload 4
    //   272: invokevirtual 161	java/lang/Object:getClass	()Ljava/lang/Class;
    //   275: invokevirtual 162	java/lang/Class:getName	()Ljava/lang/String;
    //   278: astore_1
    //   279: goto -44 -> 235
    //   282: ldc 164
    //   284: astore_1
    //   285: goto -50 -> 235
    //   288: astore_2
    //   289: goto -65 -> 224
    //   292: aload 4
    //   294: astore 6
    //   296: goto -207 -> 89
    //
    // Exception table:
    //   from	to	target	type
    //   22	31	134	java/lang/NoSuchMethodException
    //   35	60	134	java/lang/NoSuchMethodException
    //   60	75	134	java/lang/NoSuchMethodException
    //   79	89	134	java/lang/NoSuchMethodException
    //   93	99	134	java/lang/NoSuchMethodException
    //   108	120	134	java/lang/NoSuchMethodException
    //   22	31	215	java/lang/ClassNotFoundException
    //   35	60	215	java/lang/ClassNotFoundException
    //   60	75	215	java/lang/ClassNotFoundException
    //   79	89	215	java/lang/ClassNotFoundException
    //   93	99	215	java/lang/ClassNotFoundException
    //   108	120	215	java/lang/ClassNotFoundException
    //   22	31	223	java/lang/Exception
    //   35	60	223	java/lang/Exception
    //   60	75	223	java/lang/Exception
    //   79	89	288	java/lang/Exception
    //   93	99	288	java/lang/Exception
    //   108	120	288	java/lang/Exception
  }

  final void a(XmlPullParser paramXmlPullParser, a parama)
  {
    AppMethodBeat.i(113277);
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
        parama = new java/lang/StringBuilder;
        parama.<init>();
        ((InflateException)localObject).<init>(paramXmlPullParser.getPositionDescription() + ": No start tag found!");
        AppMethodBeat.o(113277);
        throw ((Throwable)localObject);
      }
    }
    catch (InflateException paramXmlPullParser)
    {
      AppMethodBeat.o(113277);
      throw paramXmlPullParser;
      paramXmlPullParser = finally;
      AppMethodBeat.o(113277);
      throw paramXmlPullParser;
      b(paramXmlPullParser.getName(), (AttributeSet)localObject);
      a(paramXmlPullParser, parama, (AttributeSet)localObject);
      AppMethodBeat.o(113277);
      return;
    }
    catch (XmlPullParserException parama)
    {
      paramXmlPullParser = new android/view/InflateException;
      paramXmlPullParser.<init>(parama.getMessage());
      paramXmlPullParser.initCause(parama);
      AppMethodBeat.o(113277);
      throw paramXmlPullParser;
    }
    catch (IOException parama)
    {
      InflateException localInflateException = new android/view/InflateException;
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      localInflateException.<init>(paramXmlPullParser.getPositionDescription() + ": " + parama.getMessage());
      localInflateException.initCause(parama);
      AppMethodBeat.o(113277);
      throw localInflateException;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.weui.base.preference.c
 * JD-Core Version:    0.6.2
 */