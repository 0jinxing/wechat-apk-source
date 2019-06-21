package com.tencent.mm.storage;

import a.l;
import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.api.f;
import com.tencent.mm.cd.h;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/storage/FunctionMsgStorage;", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "Lcom/tencent/mm/api/FunctionMsgItem;", "()V", "ALL_FUNCTION_MSG_ITEM_PROJECTION", "", "", "[Ljava/lang/String;", "TABLE_NAME", "TAG", "db", "Lcom/tencent/mm/storagebase/SqliteDB;", "getDb", "()Lcom/tencent/mm/storagebase/SqliteDB;", "deleteAllHandleFunctionMsg", "", "getAllNeedHandleFunctionMsg", "", "getByFunctionMsgId", "functionMsgId", "updateByFunctionMsgId", "newFunctionMsgItem", "plugin-functionmsg_release"})
public final class ba extends com.tencent.mm.sdk.e.j<f>
{
  private static final h fni;
  private static final String[] xYZ;
  public static final ba xZa;

  static
  {
    AppMethodBeat.i(35502);
    xZa = new ba();
    xYZ = new String[] { "*", "rowid" };
    Object localObject = g.RP();
    a.f.b.j.o(localObject, "MMKernel.storage()");
    localObject = ((com.tencent.mm.kernel.e)localObject).Ru();
    if (localObject == null)
      a.f.b.j.dWJ();
    fni = (h)localObject;
    AppMethodBeat.o(35502);
  }

  private ba()
  {
    super((com.tencent.mm.sdk.e.e)locale.Ru(), f.ccO, "FunctionMsgItem", new String[] { "CREATE INDEX IF NOT EXISTS functionIdIndex ON FunctionMsgItem(functionmsgid)" });
    AppMethodBeat.i(35501);
    AppMethodBeat.o(35501);
  }

  public static void a(String paramString, f paramf)
  {
    AppMethodBeat.i(35498);
    a.f.b.j.p(paramString, "functionMsgId");
    a.f.b.j.p(paramf, "newFunctionMsgItem");
    ab.i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s", new Object[] { paramString });
    Object localObject = apy(paramString);
    if (localObject != null);
    while (true)
    {
      try
      {
        boolean bool1;
        if (paramf.Al() == null)
        {
          bool1 = true;
          if (((f)localObject).Al() == null)
          {
            bool2 = true;
            ab.i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, functionMsgId: %s, newFunctionMsgItem.msgContent==null: %s,oldFunctionMsgItem.msgContent==null: %s", new Object[] { paramString, Boolean.valueOf(bool1), Boolean.valueOf(bool2) });
            paramf = paramf.Hl();
            if ((paramf.get("addMsg") == null) && (((f)localObject).Al() != null))
            {
              localObject = ((f)localObject).Al();
              if (localObject == null)
                a.f.b.j.dWJ();
              paramf.put("addMsg", ((cm)localObject).toByteArray());
            }
            ab.i("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId, ret: %s", new Object[] { Integer.valueOf(fni.update("FunctionMsgItem", paramf, "functionmsgid=?", new String[] { paramString })) });
            AppMethodBeat.o(35498);
          }
        }
        else
        {
          bool1 = false;
          continue;
        }
        boolean bool2 = false;
        continue;
      }
      catch (Exception paramString)
      {
        ab.e("FunctionMsg.FunctionMsgStorage", "updateByFunctionMsgId error: %s", new Object[] { paramString.getMessage() });
      }
      AppMethodBeat.o(35498);
    }
  }

  // ERROR //
  public static f apy(String paramString)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: aconst_null
    //   3: astore_2
    //   4: ldc 188
    //   6: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   9: aload_0
    //   10: ldc 108
    //   12: invokestatic 111	a/f/b/j:p	(Ljava/lang/Object;Ljava/lang/String;)V
    //   15: aload_0
    //   16: invokestatic 194	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   19: ifeq +12 -> 31
    //   22: ldc 188
    //   24: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   27: aload_2
    //   28: astore_0
    //   29: aload_0
    //   30: areturn
    //   31: ldc 114
    //   33: ldc 196
    //   35: iconst_1
    //   36: anewarray 118	java/lang/Object
    //   39: dup
    //   40: iconst_0
    //   41: aload_0
    //   42: aastore
    //   43: invokestatic 123	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   46: getstatic 83	com/tencent/mm/storage/ba:fni	Lcom/tencent/mm/cd/h;
    //   49: ldc 96
    //   51: getstatic 58	com/tencent/mm/storage/ba:xYZ	[Ljava/lang/String;
    //   54: ldc 165
    //   56: iconst_1
    //   57: anewarray 52	java/lang/String
    //   60: dup
    //   61: iconst_0
    //   62: aload_0
    //   63: aastore
    //   64: aconst_null
    //   65: aconst_null
    //   66: aconst_null
    //   67: iconst_2
    //   68: invokevirtual 199	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   71: astore_3
    //   72: aload_3
    //   73: checkcast 201	java/io/Closeable
    //   76: astore 4
    //   78: aload_3
    //   79: ifnonnull +6 -> 85
    //   82: invokestatic 81	a/f/b/j:dWJ	()V
    //   85: aload_3
    //   86: invokeinterface 207 1 0
    //   91: ifeq +30 -> 121
    //   94: new 90	com/tencent/mm/api/f
    //   97: astore_0
    //   98: aload_0
    //   99: invokespecial 208	com/tencent/mm/api/f:<init>	()V
    //   102: aload_0
    //   103: aload_3
    //   104: invokevirtual 212	com/tencent/mm/api/f:d	(Landroid/database/Cursor;)V
    //   107: aload 4
    //   109: aconst_null
    //   110: invokestatic 217	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   113: ldc 188
    //   115: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   118: goto -89 -> 29
    //   121: getstatic 223	a/y:AUy	La/y;
    //   124: astore_0
    //   125: aload 4
    //   127: aconst_null
    //   128: invokestatic 217	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   131: ldc 188
    //   133: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   136: aload_2
    //   137: astore_0
    //   138: goto -109 -> 29
    //   141: astore_1
    //   142: ldc 188
    //   144: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   147: aload_1
    //   148: athrow
    //   149: astore_0
    //   150: aload 4
    //   152: aload_1
    //   153: invokestatic 217	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   156: ldc 188
    //   158: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   161: aload_0
    //   162: athrow
    //   163: astore_0
    //   164: goto -14 -> 150
    //
    // Exception table:
    //   from	to	target	type
    //   82	85	141	java/lang/Throwable
    //   85	107	141	java/lang/Throwable
    //   121	125	141	java/lang/Throwable
    //   142	149	149	finally
    //   82	85	163	finally
    //   85	107	163	finally
    //   121	125	163	finally
  }

  // ERROR //
  public static java.util.List<f> dtn()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: ldc 226
    //   4: invokestatic 45	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: getstatic 83	com/tencent/mm/storage/ba:fni	Lcom/tencent/mm/cd/h;
    //   10: ldc 96
    //   12: getstatic 58	com/tencent/mm/storage/ba:xYZ	[Ljava/lang/String;
    //   15: ldc 228
    //   17: iconst_1
    //   18: anewarray 52	java/lang/String
    //   21: dup
    //   22: iconst_0
    //   23: ldc 230
    //   25: aastore
    //   26: aconst_null
    //   27: aconst_null
    //   28: aconst_null
    //   29: iconst_2
    //   30: invokevirtual 199	com/tencent/mm/cd/h:a	(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Landroid/database/Cursor;
    //   33: checkcast 201	java/io/Closeable
    //   36: astore_1
    //   37: aload_1
    //   38: checkcast 203	android/database/Cursor
    //   41: astore_2
    //   42: new 232	java/util/ArrayList
    //   45: astore_3
    //   46: aload_3
    //   47: invokespecial 233	java/util/ArrayList:<init>	()V
    //   50: aload_2
    //   51: invokeinterface 207 1 0
    //   56: pop
    //   57: aload_2
    //   58: ldc 235
    //   60: invokestatic 72	a/f/b/j:o	(Ljava/lang/Object;Ljava/lang/String;)V
    //   63: aload_2
    //   64: invokeinterface 238 1 0
    //   69: ifne +57 -> 126
    //   72: new 90	com/tencent/mm/api/f
    //   75: astore 4
    //   77: aload 4
    //   79: invokespecial 208	com/tencent/mm/api/f:<init>	()V
    //   82: aload 4
    //   84: aload_2
    //   85: invokevirtual 212	com/tencent/mm/api/f:d	(Landroid/database/Cursor;)V
    //   88: aload_3
    //   89: aload 4
    //   91: invokevirtual 242	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   94: pop
    //   95: aload_2
    //   96: invokeinterface 245 1 0
    //   101: pop
    //   102: goto -45 -> 57
    //   105: astore_0
    //   106: ldc 226
    //   108: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   111: aload_0
    //   112: athrow
    //   113: astore_2
    //   114: aload_1
    //   115: aload_0
    //   116: invokestatic 217	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   119: ldc 226
    //   121: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   124: aload_2
    //   125: athrow
    //   126: aload_3
    //   127: checkcast 247	java/util/List
    //   130: astore_2
    //   131: aload_1
    //   132: aconst_null
    //   133: invokestatic 217	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   136: ldc 226
    //   138: invokestatic 85	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: aload_2
    //   142: areturn
    //   143: astore_2
    //   144: goto -30 -> 114
    //
    // Exception table:
    //   from	to	target	type
    //   37	57	105	java/lang/Throwable
    //   57	102	105	java/lang/Throwable
    //   126	131	105	java/lang/Throwable
    //   106	113	113	finally
    //   37	57	143	finally
    //   57	102	143	finally
    //   126	131	143	finally
  }

  public static void dto()
  {
    AppMethodBeat.i(35500);
    int i = fni.delete("FunctionMsgItem", "status=?", new String[] { "100" });
    int j = fni.delete("FunctionMsgItem", "status=?", new String[] { "3" });
    ab.i("FunctionMsg.FunctionMsgStorage", "[deleteAllHandleFunctionMsg] ret1:" + i + " ret2:" + j);
    AppMethodBeat.o(35500);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ba
 * JD-Core Version:    0.6.2
 */