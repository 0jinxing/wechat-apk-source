package com.facebook.appevents;

import com.facebook.appevents.internal.AppEventUtility;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class AppEventStore
{
  private static final String PERSISTED_EVENTS_FILENAME = "AppEventsLogger.persistedevents";
  private static final String TAG;

  static
  {
    AppMethodBeat.i(71905);
    TAG = AppEventStore.class.getName();
    AppMethodBeat.o(71905);
  }

  public static void persistEvents(AccessTokenAppIdPair paramAccessTokenAppIdPair, SessionEventsState paramSessionEventsState)
  {
    try
    {
      AppMethodBeat.i(71901);
      AppEventUtility.assertIsNotMainThread();
      PersistedEvents localPersistedEvents = readAndClearStore();
      if (localPersistedEvents.containsKey(paramAccessTokenAppIdPair))
        localPersistedEvents.get(paramAccessTokenAppIdPair).addAll(paramSessionEventsState.getEventsToPersist());
      while (true)
      {
        saveEventsToDisk(localPersistedEvents);
        AppMethodBeat.o(71901);
        return;
        localPersistedEvents.addEvents(paramAccessTokenAppIdPair, paramSessionEventsState.getEventsToPersist());
      }
    }
    finally
    {
    }
    throw paramAccessTokenAppIdPair;
  }

  public static void persistEvents(AppEventCollection paramAppEventCollection)
  {
    PersistedEvents localPersistedEvents;
    try
    {
      AppMethodBeat.i(71902);
      AppEventUtility.assertIsNotMainThread();
      localPersistedEvents = readAndClearStore();
      Iterator localIterator = paramAppEventCollection.keySet().iterator();
      while (localIterator.hasNext())
      {
        AccessTokenAppIdPair localAccessTokenAppIdPair = (AccessTokenAppIdPair)localIterator.next();
        localPersistedEvents.addEvents(localAccessTokenAppIdPair, paramAppEventCollection.get(localAccessTokenAppIdPair).getEventsToPersist());
      }
    }
    finally
    {
    }
    saveEventsToDisk(localPersistedEvents);
    AppMethodBeat.o(71902);
  }

  // ERROR //
  public static PersistedEvents readAndClearStore()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 2
    //   4: monitorenter
    //   5: ldc 111
    //   7: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   10: invokestatic 43	com/facebook/appevents/internal/AppEventUtility:assertIsNotMainThread	()V
    //   13: invokestatic 117	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   16: astore_1
    //   17: aload_1
    //   18: ldc 10
    //   20: invokevirtual 123	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   23: astore_2
    //   24: new 6	com/facebook/appevents/AppEventStore$MovedClassObjectInputStream
    //   27: astore_3
    //   28: new 125	java/io/BufferedInputStream
    //   31: astore 4
    //   33: aload 4
    //   35: aload_2
    //   36: invokespecial 128	java/io/BufferedInputStream:<init>	(Ljava/io/InputStream;)V
    //   39: aload_3
    //   40: aload 4
    //   42: invokespecial 129	com/facebook/appevents/AppEventStore$MovedClassObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   45: aload_3
    //   46: invokevirtual 132	com/facebook/appevents/AppEventStore$MovedClassObjectInputStream:readObject	()Ljava/lang/Object;
    //   49: checkcast 49	com/facebook/appevents/PersistedEvents
    //   52: astore 4
    //   54: aload_3
    //   55: invokestatic 138	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   58: aload_1
    //   59: ldc 10
    //   61: invokevirtual 142	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   64: invokevirtual 147	java/io/File:delete	()Z
    //   67: pop
    //   68: aload 4
    //   70: astore_3
    //   71: aload_3
    //   72: astore 4
    //   74: aload_3
    //   75: ifnonnull +13 -> 88
    //   78: new 49	com/facebook/appevents/PersistedEvents
    //   81: astore 4
    //   83: aload 4
    //   85: invokespecial 148	com/facebook/appevents/PersistedEvents:<init>	()V
    //   88: ldc 111
    //   90: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   93: ldc 2
    //   95: monitorexit
    //   96: aload 4
    //   98: areturn
    //   99: astore_3
    //   100: aconst_null
    //   101: astore_3
    //   102: aload_3
    //   103: invokestatic 138	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   106: aload_1
    //   107: ldc 10
    //   109: invokevirtual 142	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   112: invokevirtual 147	java/io/File:delete	()Z
    //   115: pop
    //   116: aconst_null
    //   117: astore_3
    //   118: goto -47 -> 71
    //   121: astore_3
    //   122: aconst_null
    //   123: astore_3
    //   124: goto -53 -> 71
    //   127: astore_3
    //   128: aconst_null
    //   129: astore_3
    //   130: aload_3
    //   131: invokestatic 138	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   134: aload_1
    //   135: ldc 10
    //   137: invokevirtual 142	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   140: invokevirtual 147	java/io/File:delete	()Z
    //   143: pop
    //   144: aconst_null
    //   145: astore_3
    //   146: goto -75 -> 71
    //   149: astore_3
    //   150: aconst_null
    //   151: astore_3
    //   152: goto -81 -> 71
    //   155: astore_3
    //   156: aload_0
    //   157: invokestatic 138	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   160: aload_1
    //   161: ldc 10
    //   163: invokevirtual 142	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   166: invokevirtual 147	java/io/File:delete	()Z
    //   169: pop
    //   170: ldc 111
    //   172: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   175: aload_3
    //   176: athrow
    //   177: astore_3
    //   178: ldc 2
    //   180: monitorexit
    //   181: aload_3
    //   182: athrow
    //   183: astore 4
    //   185: goto -15 -> 170
    //   188: astore 4
    //   190: aload_3
    //   191: astore_0
    //   192: aload 4
    //   194: astore_3
    //   195: goto -39 -> 156
    //   198: astore 4
    //   200: goto -70 -> 130
    //   203: astore 4
    //   205: goto -103 -> 102
    //   208: astore_3
    //   209: aload 4
    //   211: astore_3
    //   212: goto -141 -> 71
    //
    // Exception table:
    //   from	to	target	type
    //   17	45	99	java/io/FileNotFoundException
    //   106	116	121	java/lang/Exception
    //   17	45	127	java/lang/Exception
    //   134	144	149	java/lang/Exception
    //   17	45	155	finally
    //   5	17	177	finally
    //   54	58	177	finally
    //   58	68	177	finally
    //   78	88	177	finally
    //   88	93	177	finally
    //   102	106	177	finally
    //   106	116	177	finally
    //   130	134	177	finally
    //   134	144	177	finally
    //   156	160	177	finally
    //   160	170	177	finally
    //   170	177	177	finally
    //   160	170	183	java/lang/Exception
    //   45	54	188	finally
    //   45	54	198	java/lang/Exception
    //   45	54	203	java/io/FileNotFoundException
    //   58	68	208	java/lang/Exception
  }

  // ERROR //
  private static void saveEventsToDisk(PersistedEvents paramPersistedEvents)
  {
    // Byte code:
    //   0: ldc 149
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: invokestatic 117	com/facebook/FacebookSdk:getApplicationContext	()Landroid/content/Context;
    //   8: astore_1
    //   9: new 151	java/io/ObjectOutputStream
    //   12: astore_2
    //   13: new 153	java/io/BufferedOutputStream
    //   16: astore_3
    //   17: aload_3
    //   18: aload_1
    //   19: ldc 10
    //   21: iconst_0
    //   22: invokevirtual 157	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   25: invokespecial 160	java/io/BufferedOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   28: aload_2
    //   29: aload_3
    //   30: invokespecial 161	java/io/ObjectOutputStream:<init>	(Ljava/io/OutputStream;)V
    //   33: aload_2
    //   34: astore_3
    //   35: aload_2
    //   36: aload_0
    //   37: invokevirtual 165	java/io/ObjectOutputStream:writeObject	(Ljava/lang/Object;)V
    //   40: aload_2
    //   41: invokestatic 138	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   44: ldc 149
    //   46: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   49: return
    //   50: astore_0
    //   51: aconst_null
    //   52: astore_0
    //   53: aload_0
    //   54: astore_3
    //   55: aload_1
    //   56: ldc 10
    //   58: invokevirtual 142	android/content/Context:getFileStreamPath	(Ljava/lang/String;)Ljava/io/File;
    //   61: invokevirtual 147	java/io/File:delete	()Z
    //   64: pop
    //   65: aload_0
    //   66: invokestatic 138	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   69: ldc 149
    //   71: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   74: goto -25 -> 49
    //   77: astore_0
    //   78: aconst_null
    //   79: astore_3
    //   80: aload_3
    //   81: invokestatic 138	com/facebook/internal/Utility:closeQuietly	(Ljava/io/Closeable;)V
    //   84: ldc 149
    //   86: invokestatic 31	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   89: aload_0
    //   90: athrow
    //   91: astore_0
    //   92: goto -12 -> 80
    //   95: astore_3
    //   96: goto -31 -> 65
    //   99: astore_0
    //   100: aload_2
    //   101: astore_0
    //   102: goto -49 -> 53
    //
    // Exception table:
    //   from	to	target	type
    //   9	33	50	java/lang/Exception
    //   9	33	77	finally
    //   35	40	91	finally
    //   55	65	91	finally
    //   55	65	95	java/lang/Exception
    //   35	40	99	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.appevents.AppEventStore
 * JD-Core Version:    0.6.2
 */