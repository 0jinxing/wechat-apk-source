package com.bumptech.glide.d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

@Deprecated
public final class d
{
  private final Context context;

  public d(Context paramContext)
  {
    this.context = paramContext;
  }

  private static void a(Class<?> paramClass, Exception paramException)
  {
    AppMethodBeat.i(92428);
    paramClass = new RuntimeException("Unable to instantiate GlideModule implementation for ".concat(String.valueOf(paramClass)), paramException);
    AppMethodBeat.o(92428);
    throw paramClass;
  }

  // ERROR //
  private static b ac(String paramString)
  {
    // Byte code:
    //   0: ldc 59
    //   2: invokestatic 24	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 65	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   9: astore_1
    //   10: aconst_null
    //   11: astore_0
    //   12: aload_1
    //   13: iconst_0
    //   14: anewarray 61	java/lang/Class
    //   17: invokevirtual 69	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   20: iconst_0
    //   21: anewarray 4	java/lang/Object
    //   24: invokevirtual 75	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   27: astore_2
    //   28: aload_2
    //   29: astore_0
    //   30: aload_0
    //   31: instanceof 77
    //   34: ifne +82 -> 116
    //   37: new 26	java/lang/RuntimeException
    //   40: dup
    //   41: ldc 79
    //   43: aload_0
    //   44: invokestatic 34	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   47: invokevirtual 38	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   50: invokespecial 82	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   53: astore_0
    //   54: ldc 59
    //   56: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   59: aload_0
    //   60: athrow
    //   61: astore_0
    //   62: new 84	java/lang/IllegalArgumentException
    //   65: dup
    //   66: ldc 86
    //   68: aload_0
    //   69: invokespecial 87	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   72: astore_0
    //   73: ldc 59
    //   75: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   78: aload_0
    //   79: athrow
    //   80: astore_2
    //   81: aload_1
    //   82: aload_2
    //   83: invokestatic 89	com/bumptech/glide/d/d:a	(Ljava/lang/Class;Ljava/lang/Exception;)V
    //   86: goto -56 -> 30
    //   89: astore_2
    //   90: aload_1
    //   91: aload_2
    //   92: invokestatic 89	com/bumptech/glide/d/d:a	(Ljava/lang/Class;Ljava/lang/Exception;)V
    //   95: goto -65 -> 30
    //   98: astore_2
    //   99: aload_1
    //   100: aload_2
    //   101: invokestatic 89	com/bumptech/glide/d/d:a	(Ljava/lang/Class;Ljava/lang/Exception;)V
    //   104: goto -74 -> 30
    //   107: astore_2
    //   108: aload_1
    //   109: aload_2
    //   110: invokestatic 89	com/bumptech/glide/d/d:a	(Ljava/lang/Class;Ljava/lang/Exception;)V
    //   113: goto -83 -> 30
    //   116: aload_0
    //   117: checkcast 77	com/bumptech/glide/d/b
    //   120: astore_0
    //   121: ldc 59
    //   123: invokestatic 44	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   126: aload_0
    //   127: areturn
    //
    // Exception table:
    //   from	to	target	type
    //   5	10	61	java/lang/ClassNotFoundException
    //   12	28	80	java/lang/InstantiationException
    //   12	28	89	java/lang/IllegalAccessException
    //   12	28	98	java/lang/NoSuchMethodException
    //   12	28	107	java/lang/reflect/InvocationTargetException
  }

  public final List<b> nJ()
  {
    AppMethodBeat.i(92426);
    Log.isLoggable("ManifestParser", 3);
    ArrayList localArrayList = new ArrayList();
    while (true)
    {
      try
      {
        ApplicationInfo localApplicationInfo = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
        if (localApplicationInfo.metaData == null)
        {
          Log.isLoggable("ManifestParser", 3);
          AppMethodBeat.o(92426);
          return localArrayList;
        }
        Object localObject;
        if (Log.isLoggable("ManifestParser", 2))
        {
          localObject = new java/lang/StringBuilder;
          ((StringBuilder)localObject).<init>("Got app info metadata: ");
          ((StringBuilder)localObject).append(localApplicationInfo.metaData);
        }
        Iterator localIterator = localApplicationInfo.metaData.keySet().iterator();
        if (localIterator.hasNext())
        {
          localObject = (String)localIterator.next();
          if (!"GlideModule".equals(localApplicationInfo.metaData.get((String)localObject)))
            continue;
          localArrayList.add(ac((String)localObject));
          Log.isLoggable("ManifestParser", 3);
          continue;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        RuntimeException localRuntimeException = new RuntimeException("Unable to find metadata to parse GlideModules", localNameNotFoundException);
        AppMethodBeat.o(92426);
        throw localRuntimeException;
      }
      Log.isLoggable("ManifestParser", 3);
      AppMethodBeat.o(92426);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.d.d
 * JD-Core Version:    0.6.2
 */