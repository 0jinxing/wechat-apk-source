package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v4.content.b;
import android.support.v4.f.a;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class p
{
  private final Context bvF;
  private final SharedPreferences bwa;
  private final af bwb;
  private final Map<String, ag> bwc;

  public p(Context paramContext)
  {
    this(paramContext, new af());
    AppMethodBeat.i(108749);
    AppMethodBeat.o(108749);
  }

  private p(Context paramContext, af paramaf)
  {
    AppMethodBeat.i(108750);
    this.bwc = new a();
    this.bvF = paramContext;
    this.bwa = paramContext.getSharedPreferences("com.google.android.gms.appid", 0);
    this.bwb = paramaf;
    paramContext = new File(b.Q(this.bvF), "com.google.android.gms.appid-no-backup");
    if (!paramContext.exists());
    while (true)
    {
      try
      {
        if ((paramContext.createNewFile()) && (!isEmpty()))
        {
          zzag();
          FirebaseInstanceId.uD().uI();
        }
        AppMethodBeat.o(108750);
        return;
      }
      catch (IOException paramContext)
      {
        if (Log.isLoggable("FirebaseInstanceId", 3))
        {
          paramContext = String.valueOf(paramContext.getMessage());
          if (paramContext.length() != 0)
          {
            "Error creating file in no backup dir: ".concat(paramContext);
            AppMethodBeat.o(108750);
            continue;
          }
          new String("Error creating file in no backup dir: ");
        }
      }
      AppMethodBeat.o(108750);
    }
  }

  private static String c(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(108754);
    paramString1 = String.valueOf(paramString1).length() + 4 + String.valueOf(paramString2).length() + String.valueOf(paramString3).length() + paramString1 + "|T|" + paramString2 + "|" + paramString3;
    AppMethodBeat.o(108754);
    return paramString1;
  }

  private final boolean isEmpty()
  {
    try
    {
      AppMethodBeat.i(108753);
      boolean bool = this.bwa.getAll().isEmpty();
      AppMethodBeat.o(108753);
      return bool;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  static String o(String paramString1, String paramString2)
  {
    AppMethodBeat.i(108755);
    paramString1 = String.valueOf(paramString1).length() + 3 + String.valueOf(paramString2).length() + paramString1 + "|S|" + paramString2;
    AppMethodBeat.o(108755);
    return paramString1;
  }

  // ERROR //
  public final ag aY(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 160
    //   4: invokestatic 30	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: aload_0
    //   8: getfield 43	com/google/firebase/iid/p:bwc	Ljava/util/Map;
    //   11: aload_1
    //   12: invokeinterface 164 2 0
    //   17: checkcast 166	com/google/firebase/iid/ag
    //   20: astore_2
    //   21: aload_2
    //   22: ifnull +12 -> 34
    //   25: ldc 160
    //   27: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_2
    //   33: areturn
    //   34: aload_0
    //   35: getfield 45	com/google/firebase/iid/p:bvF	Landroid/content/Context;
    //   38: astore_3
    //   39: aload_3
    //   40: aload_1
    //   41: invokestatic 170	com/google/firebase/iid/af:l	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/firebase/iid/ag;
    //   44: astore_2
    //   45: aload_2
    //   46: ifnull +28 -> 74
    //   49: aload_0
    //   50: getfield 43	com/google/firebase/iid/p:bwc	Ljava/util/Map;
    //   53: aload_1
    //   54: aload_2
    //   55: invokeinterface 174 3 0
    //   60: pop
    //   61: ldc 160
    //   63: invokestatic 33	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   66: goto -36 -> 30
    //   69: astore_1
    //   70: aload_0
    //   71: monitorexit
    //   72: aload_1
    //   73: athrow
    //   74: aload_3
    //   75: aload_1
    //   76: invokestatic 177	com/google/firebase/iid/af:k	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/firebase/iid/ag;
    //   79: astore_2
    //   80: goto -31 -> 49
    //   83: astore_2
    //   84: invokestatic 89	com/google/firebase/iid/FirebaseInstanceId:uD	()Lcom/google/firebase/iid/FirebaseInstanceId;
    //   87: invokevirtual 92	com/google/firebase/iid/FirebaseInstanceId:uI	()V
    //   90: aload_0
    //   91: getfield 45	com/google/firebase/iid/p:bvF	Landroid/content/Context;
    //   94: aload_1
    //   95: invokestatic 177	com/google/firebase/iid/af:k	(Landroid/content/Context;Ljava/lang/String;)Lcom/google/firebase/iid/ag;
    //   98: astore_2
    //   99: goto -50 -> 49
    //
    // Exception table:
    //   from	to	target	type
    //   2	21	69	finally
    //   25	30	69	finally
    //   34	45	69	finally
    //   49	66	69	finally
    //   74	80	69	finally
    //   84	99	69	finally
    //   34	45	83	com/google/firebase/iid/ah
    //   74	80	83	com/google/firebase/iid/ah
  }

  public final void aZ(String paramString)
  {
    SharedPreferences.Editor localEditor;
    try
    {
      AppMethodBeat.i(108760);
      String str = String.valueOf(paramString).concat("|T|");
      localEditor = this.bwa.edit();
      Iterator localIterator = this.bwa.getAll().keySet().iterator();
      while (localIterator.hasNext())
      {
        paramString = (String)localIterator.next();
        if (paramString.startsWith(str))
          localEditor.remove(paramString);
      }
    }
    finally
    {
    }
    localEditor.commit();
    AppMethodBeat.o(108760);
  }

  public final void b(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    try
    {
      AppMethodBeat.i(108758);
      paramString5 = q.b(paramString4, paramString5, System.currentTimeMillis());
      if (paramString5 == null)
        AppMethodBeat.o(108758);
      while (true)
      {
        return;
        paramString4 = this.bwa.edit();
        paramString4.putString(c(paramString1, paramString2, paramString3), paramString5);
        paramString4.commit();
        AppMethodBeat.o(108758);
      }
    }
    finally
    {
    }
    throw paramString1;
  }

  public final q d(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      AppMethodBeat.i(108757);
      paramString1 = q.ba(this.bwa.getString(c(paramString1, paramString2, paramString3), null));
      AppMethodBeat.o(108757);
      return paramString1;
    }
    finally
    {
      paramString1 = finally;
    }
    throw paramString1;
  }

  public final String uT()
  {
    String str = null;
    try
    {
      AppMethodBeat.i(108751);
      Object localObject2 = this.bwa.getString("topic_operaion_queue", null);
      if (localObject2 != null)
      {
        localObject2 = ((String)localObject2).split(",");
        if ((localObject2.length > 1) && (!TextUtils.isEmpty(localObject2[1])))
        {
          str = localObject2[1];
          AppMethodBeat.o(108751);
        }
      }
      while (true)
      {
        return str;
        AppMethodBeat.o(108751);
      }
    }
    finally
    {
    }
  }

  public final void zzag()
  {
    try
    {
      AppMethodBeat.i(108756);
      this.bwc.clear();
      for (File localFile : af.aq(this.bvF).listFiles())
        if (localFile.getName().startsWith("com.google.InstanceId"))
          localFile.delete();
      this.bwa.edit().clear().commit();
      AppMethodBeat.o(108756);
      return;
    }
    finally
    {
    }
  }

  public final boolean zzf(String paramString)
  {
    while (true)
    {
      String str2;
      try
      {
        AppMethodBeat.i(108752);
        String str1 = this.bwa.getString("topic_operaion_queue", "");
        str2 = String.valueOf(",");
        String str3 = String.valueOf(paramString);
        if (str3.length() != 0)
        {
          str2 = str2.concat(str3);
          if (!str1.startsWith(str2))
            break label156;
          str2 = String.valueOf(",");
          paramString = String.valueOf(paramString);
          if (paramString.length() != 0)
          {
            paramString = str2.concat(paramString);
            paramString = str1.substring(paramString.length());
            this.bwa.edit().putString("topic_operaion_queue", paramString).apply();
            bool = true;
            AppMethodBeat.o(108752);
            return bool;
          }
        }
        else
        {
          str2 = new String(str2);
          continue;
        }
      }
      finally
      {
      }
      paramString = new String(str2);
      continue;
      label156: boolean bool = false;
      AppMethodBeat.o(108752);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.google.firebase.iid.p
 * JD-Core Version:    0.6.2
 */