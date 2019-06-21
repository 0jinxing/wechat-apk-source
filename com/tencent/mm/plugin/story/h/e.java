package com.tencent.mm.plugin.story.h;

import a.l;
import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.eq;
import com.tencent.mm.sdk.e.c.a;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/storage/StoryEditorDataStorage;", "Lcom/tencent/mm/sdk/storage/MAutoStorage;", "Lcom/tencent/mm/plugin/story/storage/StoryEditorData;", "db", "Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "(Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;)V", "getDb", "()Lcom/tencent/mm/sdk/storage/ISQLiteDatabase;", "cleanDirtyData", "", "cleanNullData", "timeStamp", "", "getAllDataIfNoMix", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getByLocalId", "localId", "getByTimeStamp", "getLastDataIfNoMix", "updateByLocal", "id", "editorData", "Companion", "plugin-story_release"})
public final class e extends com.tencent.mm.sdk.e.j<d>
{
  private static final String[] sdG;
  public static final e.a sdH;
  public final com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(109869);
    sdH = new e.a((byte)0);
    d.a locala = d.sdF;
    sdG = new String[] { com.tencent.mm.sdk.e.j.a(d.cBF(), "StoryEditorInfo") };
    AppMethodBeat.o(109869);
  }

  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.cBF(), "StoryEditorInfo", eq.diI);
    AppMethodBeat.i(109868);
    this.bSd = parame;
    AppMethodBeat.o(109868);
  }

  public final long b(long paramLong, d paramd)
  {
    AppMethodBeat.i(109866);
    a.f.b.j.p(paramd, "editorData");
    paramd = paramd.Hl();
    paramd.remove("rowid");
    paramLong = this.bSd.update("StoryEditorInfo", paramd, "rowid=?", new String[] { String.valueOf(paramLong) });
    AppMethodBeat.o(109866);
    return paramLong;
  }

  // ERROR //
  public final d cBH()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_1
    //   2: ldc 137
    //   4: invokestatic 53	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   7: invokestatic 143	com/tencent/mm/model/cb:aaE	()J
    //   10: lstore_2
    //   11: new 145	java/lang/StringBuilder
    //   14: dup
    //   15: ldc 147
    //   17: invokespecial 149	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: astore 4
    //   22: getstatic 155	com/tencent/mm/plugin/story/h/a$d:sdv	Lcom/tencent/mm/plugin/story/h/a$d;
    //   25: astore 5
    //   27: aload 4
    //   29: invokestatic 159	com/tencent/mm/plugin/story/h/a$d:cBx	()I
    //   32: invokevirtual 163	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   35: ldc 165
    //   37: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: lload_2
    //   41: ldc2_w 169
    //   44: lsub
    //   45: invokevirtual 173	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   48: ldc 175
    //   50: invokevirtual 168	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   53: invokevirtual 179	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   56: astore 4
    //   58: aload_0
    //   59: getfield 102	com/tencent/mm/plugin/story/h/e:bSd	Lcom/tencent/mm/sdk/e/e;
    //   62: aload 4
    //   64: aconst_null
    //   65: invokeinterface 183 3 0
    //   70: astore 6
    //   72: aload 6
    //   74: ifnull +62 -> 136
    //   77: aload 6
    //   79: checkcast 185	java/io/Closeable
    //   82: astore 5
    //   84: aload 6
    //   86: invokeinterface 191 1 0
    //   91: ifeq +34 -> 125
    //   94: new 61	com/tencent/mm/plugin/story/h/d
    //   97: astore 4
    //   99: aload 4
    //   101: invokespecial 193	com/tencent/mm/plugin/story/h/d:<init>	()V
    //   104: aload 4
    //   106: aload 6
    //   108: invokevirtual 197	com/tencent/mm/plugin/story/h/d:d	(Landroid/database/Cursor;)V
    //   111: aload 5
    //   113: aconst_null
    //   114: invokestatic 202	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   117: ldc 137
    //   119: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload 4
    //   124: areturn
    //   125: getstatic 208	a/y:AUy	La/y;
    //   128: astore 4
    //   130: aload 5
    //   132: aconst_null
    //   133: invokestatic 202	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   136: ldc 137
    //   138: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   141: aconst_null
    //   142: astore 4
    //   144: goto -22 -> 122
    //   147: astore_1
    //   148: ldc 137
    //   150: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   153: aload_1
    //   154: athrow
    //   155: astore 4
    //   157: aload 5
    //   159: aload_1
    //   160: invokestatic 202	a/e/b:a	(Ljava/io/Closeable;Ljava/lang/Throwable;)V
    //   163: ldc 137
    //   165: invokestatic 82	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   168: aload 4
    //   170: athrow
    //   171: astore 4
    //   173: goto -16 -> 157
    //
    // Exception table:
    //   from	to	target	type
    //   84	111	147	java/lang/Throwable
    //   125	130	147	java/lang/Throwable
    //   148	155	155	finally
    //   84	111	171	finally
    //   125	130	171	finally
  }

  public final d ls(long paramLong)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(109865);
    Object localObject3 = this.bSd;
    d.a locala = d.sdF;
    localObject3 = ((com.tencent.mm.sdk.e.e)localObject3).query("StoryEditorInfo", d.cBF().columns, "rowid=".concat(String.valueOf(paramLong)), null, null, null, null);
    if (localObject3 != null)
    {
      localObject1 = localObject2;
      if (((Cursor)localObject3).moveToFirst())
      {
        localObject1 = new d();
        ((d)localObject1).d((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
    }
    AppMethodBeat.o(109865);
    return localObject1;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.h.e
 * JD-Core Version:    0.6.2
 */