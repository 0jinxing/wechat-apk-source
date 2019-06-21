package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class zze
  implements Runnable
{
  private static final Logger zzer;
  private final StatusPendingResult zzes;
  private final String zzz;

  static
  {
    AppMethodBeat.i(50420);
    zzer = new Logger("RevokeAccessOperation", new String[0]);
    AppMethodBeat.o(50420);
  }

  private zze(String paramString)
  {
    AppMethodBeat.i(50417);
    Preconditions.checkNotEmpty(paramString);
    this.zzz = paramString;
    this.zzes = new StatusPendingResult(null);
    AppMethodBeat.o(50417);
  }

  public static PendingResult<Status> zzg(String paramString)
  {
    AppMethodBeat.i(50419);
    if (paramString == null)
    {
      paramString = PendingResults.immediateFailedResult(new Status(4), null);
      AppMethodBeat.o(50419);
    }
    while (true)
    {
      return paramString;
      paramString = new zze(paramString);
      new Thread(paramString).start();
      paramString = paramString.zzes;
      AppMethodBeat.o(50419);
    }
  }

  // ERROR //
  public final void run()
  {
    // Byte code:
    //   0: ldc 87
    //   2: invokestatic 21	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: getstatic 91	com/google/android/gms/common/api/Status:RESULT_INTERNAL_ERROR	Lcom/google/android/gms/common/api/Status;
    //   8: astore_1
    //   9: new 93	java/net/URL
    //   12: astore_2
    //   13: ldc 95
    //   15: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   18: astore_3
    //   19: aload_0
    //   20: getfield 49	com/google/android/gms/auth/api/signin/internal/zze:zzz	Ljava/lang/String;
    //   23: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   26: astore 4
    //   28: aload 4
    //   30: invokevirtual 103	java/lang/String:length	()I
    //   33: ifeq +111 -> 144
    //   36: aload_3
    //   37: aload 4
    //   39: invokevirtual 106	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   42: astore 4
    //   44: aload_2
    //   45: aload 4
    //   47: invokespecial 107	java/net/URL:<init>	(Ljava/lang/String;)V
    //   50: aload_2
    //   51: invokevirtual 111	java/net/URL:openConnection	()Ljava/net/URLConnection;
    //   54: checkcast 113	java/net/HttpURLConnection
    //   57: astore 4
    //   59: aload 4
    //   61: ldc 115
    //   63: ldc 117
    //   65: invokevirtual 121	java/net/HttpURLConnection:setRequestProperty	(Ljava/lang/String;Ljava/lang/String;)V
    //   68: aload 4
    //   70: invokevirtual 124	java/net/HttpURLConnection:getResponseCode	()I
    //   73: istore 5
    //   75: iload 5
    //   77: sipush 200
    //   80: if_icmpne +123 -> 203
    //   83: getstatic 127	com/google/android/gms/common/api/Status:RESULT_SUCCESS	Lcom/google/android/gms/common/api/Status;
    //   86: astore 4
    //   88: aload 4
    //   90: astore_1
    //   91: getstatic 33	com/google/android/gms/auth/api/signin/internal/zze:zzer	Lcom/google/android/gms/common/logging/Logger;
    //   94: astore_2
    //   95: new 129	java/lang/StringBuilder
    //   98: astore 4
    //   100: aload 4
    //   102: bipush 26
    //   104: invokespecial 130	java/lang/StringBuilder:<init>	(I)V
    //   107: aload_2
    //   108: aload 4
    //   110: ldc 132
    //   112: invokevirtual 136	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: iload 5
    //   117: invokevirtual 139	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   120: invokevirtual 143	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   123: iconst_0
    //   124: anewarray 4	java/lang/Object
    //   127: invokevirtual 147	com/google/android/gms/common/logging/Logger:d	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   130: aload_0
    //   131: getfield 56	com/google/android/gms/auth/api/signin/internal/zze:zzes	Lcom/google/android/gms/common/api/internal/StatusPendingResult;
    //   134: aload_1
    //   135: invokevirtual 151	com/google/android/gms/common/api/internal/StatusPendingResult:setResult	(Lcom/google/android/gms/common/api/Result;)V
    //   138: ldc 87
    //   140: invokestatic 36	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   143: return
    //   144: new 27	java/lang/String
    //   147: dup
    //   148: aload_3
    //   149: invokespecial 152	java/lang/String:<init>	(Ljava/lang/String;)V
    //   152: astore 4
    //   154: goto -110 -> 44
    //   157: astore 4
    //   159: getstatic 33	com/google/android/gms/auth/api/signin/internal/zze:zzer	Lcom/google/android/gms/common/logging/Logger;
    //   162: astore_2
    //   163: aload 4
    //   165: invokevirtual 153	java/io/IOException:toString	()Ljava/lang/String;
    //   168: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   171: astore 4
    //   173: aload 4
    //   175: invokevirtual 103	java/lang/String:length	()I
    //   178: ifeq +40 -> 218
    //   181: ldc 155
    //   183: aload 4
    //   185: invokevirtual 106	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   188: astore 4
    //   190: aload_2
    //   191: aload 4
    //   193: iconst_0
    //   194: anewarray 4	java/lang/Object
    //   197: invokevirtual 158	com/google/android/gms/common/logging/Logger:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   200: goto -70 -> 130
    //   203: getstatic 33	com/google/android/gms/auth/api/signin/internal/zze:zzer	Lcom/google/android/gms/common/logging/Logger;
    //   206: ldc 160
    //   208: iconst_0
    //   209: anewarray 4	java/lang/Object
    //   212: invokevirtual 158	com/google/android/gms/common/logging/Logger:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   215: goto -124 -> 91
    //   218: new 27	java/lang/String
    //   221: dup
    //   222: ldc 155
    //   224: invokespecial 152	java/lang/String:<init>	(Ljava/lang/String;)V
    //   227: astore 4
    //   229: goto -39 -> 190
    //   232: astore 4
    //   234: getstatic 33	com/google/android/gms/auth/api/signin/internal/zze:zzer	Lcom/google/android/gms/common/logging/Logger;
    //   237: astore_2
    //   238: aload 4
    //   240: invokevirtual 161	java/lang/Exception:toString	()Ljava/lang/String;
    //   243: invokestatic 99	java/lang/String:valueOf	(Ljava/lang/Object;)Ljava/lang/String;
    //   246: astore 4
    //   248: aload 4
    //   250: invokevirtual 103	java/lang/String:length	()I
    //   253: ifeq +25 -> 278
    //   256: ldc 163
    //   258: aload 4
    //   260: invokevirtual 106	java/lang/String:concat	(Ljava/lang/String;)Ljava/lang/String;
    //   263: astore 4
    //   265: aload_2
    //   266: aload 4
    //   268: iconst_0
    //   269: anewarray 4	java/lang/Object
    //   272: invokevirtual 158	com/google/android/gms/common/logging/Logger:e	(Ljava/lang/String;[Ljava/lang/Object;)V
    //   275: goto -145 -> 130
    //   278: new 27	java/lang/String
    //   281: dup
    //   282: ldc 163
    //   284: invokespecial 152	java/lang/String:<init>	(Ljava/lang/String;)V
    //   287: astore 4
    //   289: goto -24 -> 265
    //   292: astore 4
    //   294: goto -60 -> 234
    //   297: astore 4
    //   299: goto -140 -> 159
    //
    // Exception table:
    //   from	to	target	type
    //   9	44	157	java/io/IOException
    //   44	75	157	java/io/IOException
    //   83	88	157	java/io/IOException
    //   144	154	157	java/io/IOException
    //   203	215	157	java/io/IOException
    //   9	44	232	java/lang/Exception
    //   44	75	232	java/lang/Exception
    //   83	88	232	java/lang/Exception
    //   144	154	232	java/lang/Exception
    //   203	215	232	java/lang/Exception
    //   91	130	292	java/lang/Exception
    //   91	130	297	java/io/IOException
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.google.android.gms.auth.api.signin.internal.zze
 * JD-Core Version:    0.6.2
 */