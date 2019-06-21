package com.tencent.mm.an;

public final class b
{
  // ERROR //
  public static Object x(java.io.InputStream paramInputStream)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 9
    //   4: invokestatic 15	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: new 17	java/io/ObjectInputStream
    //   10: astore_2
    //   11: aload_2
    //   12: aload_0
    //   13: invokespecial 21	java/io/ObjectInputStream:<init>	(Ljava/io/InputStream;)V
    //   16: aload_2
    //   17: astore_0
    //   18: aload_2
    //   19: invokevirtual 25	java/io/ObjectInputStream:readObject	()Ljava/lang/Object;
    //   22: astore_3
    //   23: aload_3
    //   24: astore_0
    //   25: aload_2
    //   26: invokevirtual 29	java/io/ObjectInputStream:close	()V
    //   29: ldc 9
    //   31: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   34: aload_0
    //   35: areturn
    //   36: astore_2
    //   37: ldc 34
    //   39: new 36	java/lang/StringBuilder
    //   42: dup
    //   43: ldc 38
    //   45: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   48: aload_2
    //   49: invokevirtual 45	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   52: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   55: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   58: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   61: goto -32 -> 29
    //   64: astore_3
    //   65: aconst_null
    //   66: astore_2
    //   67: aload_2
    //   68: astore_0
    //   69: new 36	java/lang/StringBuilder
    //   72: astore 4
    //   74: aload_2
    //   75: astore_0
    //   76: aload 4
    //   78: ldc 60
    //   80: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   83: aload_2
    //   84: astore_0
    //   85: ldc 34
    //   87: aload 4
    //   89: aload_3
    //   90: invokevirtual 45	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   93: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   99: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   102: aload_1
    //   103: astore_0
    //   104: aload_2
    //   105: ifnull -76 -> 29
    //   108: aload_2
    //   109: invokevirtual 29	java/io/ObjectInputStream:close	()V
    //   112: aload_1
    //   113: astore_0
    //   114: goto -85 -> 29
    //   117: astore_0
    //   118: ldc 34
    //   120: new 36	java/lang/StringBuilder
    //   123: dup
    //   124: ldc 38
    //   126: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   129: aload_0
    //   130: invokevirtual 45	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   133: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   136: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   139: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   142: aload_1
    //   143: astore_0
    //   144: goto -115 -> 29
    //   147: astore_2
    //   148: aconst_null
    //   149: astore_0
    //   150: aload_0
    //   151: ifnull +7 -> 158
    //   154: aload_0
    //   155: invokevirtual 29	java/io/ObjectInputStream:close	()V
    //   158: ldc 9
    //   160: invokestatic 32	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   163: aload_2
    //   164: athrow
    //   165: astore_0
    //   166: ldc 34
    //   168: new 36	java/lang/StringBuilder
    //   171: dup
    //   172: ldc 38
    //   174: invokespecial 41	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   177: aload_0
    //   178: invokevirtual 45	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   181: invokevirtual 49	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   184: invokevirtual 52	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   187: invokestatic 58	com/tencent/mm/sdk/platformtools/ab:w	(Ljava/lang/String;Ljava/lang/String;)V
    //   190: goto -32 -> 158
    //   193: astore_2
    //   194: goto -44 -> 150
    //   197: astore_3
    //   198: goto -131 -> 67
    //
    // Exception table:
    //   from	to	target	type
    //   25	29	36	java/lang/Exception
    //   7	16	64	java/lang/Exception
    //   108	112	117	java/lang/Exception
    //   7	16	147	finally
    //   154	158	165	java/lang/Exception
    //   18	23	193	finally
    //   69	74	193	finally
    //   76	83	193	finally
    //   85	102	193	finally
    //   18	23	197	java/lang/Exception
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.an.b
 * JD-Core Version:    0.6.2
 */