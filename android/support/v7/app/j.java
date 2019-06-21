package android.support.v7.app;

import android.content.Context;
import android.support.v4.f.a;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Map;

public class j
{
  private static final Class<?>[] VT = { Context.class, AttributeSet.class };
  static final int[] VU = { 16843375 };
  private static final String[] VV = { "android.widget.", "android.view.", "android.webkit." };
  private static final Map<String, Constructor<? extends View>> VW = new a();
  private final Object[] VX = new Object[2];

  private View c(Context paramContext, String paramString1, String paramString2)
  {
    Constructor localConstructor = (Constructor)VW.get(paramString1);
    Object localObject = localConstructor;
    if (localConstructor == null);
    try
    {
      localObject = paramContext.getClassLoader();
      if (paramString2 != null)
      {
        paramContext = new java/lang/StringBuilder;
        paramContext.<init>();
      }
      for (paramContext = paramString2 + paramString1; ; paramContext = paramString1)
      {
        localObject = ((ClassLoader)localObject).loadClass(paramContext).asSubclass(View.class).getConstructor(VT);
        VW.put(paramString1, localObject);
        ((Constructor)localObject).setAccessible(true);
        paramContext = (View)((Constructor)localObject).newInstance(this.VX);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
        paramContext = null;
    }
  }

  final View a(Context paramContext, String paramString, AttributeSet paramAttributeSet)
  {
    String str = paramString;
    if (paramString.equals("view"))
      str = paramAttributeSet.getAttributeValue(null, "class");
    try
    {
      this.VX[0] = paramContext;
      this.VX[1] = paramAttributeSet;
      int i;
      if (-1 == str.indexOf('.'))
      {
        i = 0;
        if (i < VV.length)
        {
          paramString = c(paramContext, str, VV[i]);
          if (paramString != null)
          {
            this.VX[0] = null;
            this.VX[1] = null;
            paramContext = paramString;
          }
        }
      }
      while (true)
      {
        return paramContext;
        i++;
        break;
        this.VX[0] = null;
        this.VX[1] = null;
        paramContext = null;
        continue;
        paramContext = c(paramContext, str, null);
        this.VX[0] = null;
        this.VX[1] = null;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        this.VX[0] = null;
        this.VX[1] = null;
        paramContext = null;
      }
    }
    finally
    {
      this.VX[0] = null;
      this.VX[1] = null;
    }
    throw paramContext;
  }

  static final class a
    implements View.OnClickListener
  {
    private final View VY;
    private final String VZ;
    private Method Wa;
    private Context Wb;

    public a(View paramView, String paramString)
    {
      this.VY = paramView;
      this.VZ = paramString;
    }

    // ERROR //
    public final void onClick(View paramView)
    {
      // Byte code:
      //   0: aload_0
      //   1: getfield 37	android/support/v7/app/j$a:Wa	Ljava/lang/reflect/Method;
      //   4: ifnonnull +57 -> 61
      //   7: aload_0
      //   8: getfield 24	android/support/v7/app/j$a:VY	Landroid/view/View;
      //   11: invokevirtual 43	android/view/View:getContext	()Landroid/content/Context;
      //   14: astore_2
      //   15: aload_2
      //   16: ifnull +90 -> 106
      //   19: aload_2
      //   20: invokevirtual 49	android/content/Context:isRestricted	()Z
      //   23: ifne +60 -> 83
      //   26: aload_2
      //   27: invokevirtual 53	java/lang/Object:getClass	()Ljava/lang/Class;
      //   30: aload_0
      //   31: getfield 26	android/support/v7/app/j$a:VZ	Ljava/lang/String;
      //   34: iconst_1
      //   35: anewarray 55	java/lang/Class
      //   38: dup
      //   39: iconst_0
      //   40: ldc 39
      //   42: aastore
      //   43: invokevirtual 59	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
      //   46: astore_3
      //   47: aload_3
      //   48: ifnull +35 -> 83
      //   51: aload_0
      //   52: aload_3
      //   53: putfield 37	android/support/v7/app/j$a:Wa	Ljava/lang/reflect/Method;
      //   56: aload_0
      //   57: aload_2
      //   58: putfield 61	android/support/v7/app/j$a:Wb	Landroid/content/Context;
      //   61: aload_0
      //   62: getfield 37	android/support/v7/app/j$a:Wa	Ljava/lang/reflect/Method;
      //   65: aload_0
      //   66: getfield 61	android/support/v7/app/j$a:Wb	Landroid/content/Context;
      //   69: iconst_1
      //   70: anewarray 4	java/lang/Object
      //   73: dup
      //   74: iconst_0
      //   75: aload_1
      //   76: aastore
      //   77: invokevirtual 67	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
      //   80: pop
      //   81: return
      //   82: astore_3
      //   83: aload_2
      //   84: instanceof 69
      //   87: ifeq +14 -> 101
      //   90: aload_2
      //   91: checkcast 69	android/content/ContextWrapper
      //   94: invokevirtual 72	android/content/ContextWrapper:getBaseContext	()Landroid/content/Context;
      //   97: astore_2
      //   98: goto -83 -> 15
      //   101: aconst_null
      //   102: astore_2
      //   103: goto -88 -> 15
      //   106: aload_0
      //   107: getfield 24	android/support/v7/app/j$a:VY	Landroid/view/View;
      //   110: invokevirtual 76	android/view/View:getId	()I
      //   113: istore 4
      //   115: iload 4
      //   117: iconst_m1
      //   118: if_icmpne +52 -> 170
      //   121: ldc 78
      //   123: astore_1
      //   124: new 80	java/lang/IllegalStateException
      //   127: dup
      //   128: new 82	java/lang/StringBuilder
      //   131: dup
      //   132: ldc 84
      //   134: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   137: aload_0
      //   138: getfield 26	android/support/v7/app/j$a:VZ	Ljava/lang/String;
      //   141: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   144: ldc 93
      //   146: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   149: aload_0
      //   150: getfield 24	android/support/v7/app/j$a:VY	Landroid/view/View;
      //   153: invokevirtual 53	java/lang/Object:getClass	()Ljava/lang/Class;
      //   156: invokevirtual 96	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   159: aload_1
      //   160: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   163: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   166: invokespecial 101	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
      //   169: athrow
      //   170: new 82	java/lang/StringBuilder
      //   173: dup
      //   174: ldc 103
      //   176: invokespecial 87	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
      //   179: aload_0
      //   180: getfield 24	android/support/v7/app/j$a:VY	Landroid/view/View;
      //   183: invokevirtual 43	android/view/View:getContext	()Landroid/content/Context;
      //   186: invokevirtual 107	android/content/Context:getResources	()Landroid/content/res/Resources;
      //   189: iload 4
      //   191: invokevirtual 113	android/content/res/Resources:getResourceEntryName	(I)Ljava/lang/String;
      //   194: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   197: ldc 115
      //   199: invokevirtual 91	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   202: invokevirtual 100	java/lang/StringBuilder:toString	()Ljava/lang/String;
      //   205: astore_1
      //   206: goto -82 -> 124
      //   209: astore_1
      //   210: new 80	java/lang/IllegalStateException
      //   213: dup
      //   214: ldc 117
      //   216: aload_1
      //   217: invokespecial 120	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   220: athrow
      //   221: astore_1
      //   222: new 80	java/lang/IllegalStateException
      //   225: dup
      //   226: ldc 122
      //   228: aload_1
      //   229: invokespecial 120	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
      //   232: athrow
      //
      // Exception table:
      //   from	to	target	type
      //   19	47	82	java/lang/NoSuchMethodException
      //   51	61	82	java/lang/NoSuchMethodException
      //   61	81	209	java/lang/IllegalAccessException
      //   61	81	221	java/lang/reflect/InvocationTargetException
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v7.app.j
 * JD-Core Version:    0.6.2
 */