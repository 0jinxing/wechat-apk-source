package com.tencent.mm.kiss.widget.textview.b;

import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.lang.reflect.Constructor;

public class a
{
  private static boolean eIC;
  private static boolean eOh;
  private static Constructor<StaticLayout> eOi;
  private static Object eOj;

  public static StaticLayout a(CharSequence paramCharSequence, int paramInt1, int paramInt2, TextPaint paramTextPaint, int paramInt3, Layout.Alignment paramAlignment, float paramFloat1, float paramFloat2, boolean paramBoolean, TextUtils.TruncateAt paramTruncateAt, int paramInt4, int paramInt5)
  {
    try
    {
      AppMethodBeat.i(105818);
      ensureInitialized();
      if (eOh)
      {
        paramCharSequence = new java/lang/IllegalStateException;
        paramCharSequence.<init>("initialize error, cannot create StaticLayout");
        AppMethodBeat.o(105818);
        throw paramCharSequence;
      }
    }
    finally
    {
    }
    try
    {
      Object localObject = eOj;
      paramCharSequence = (StaticLayout)eOi.newInstance(new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramTextPaint, Integer.valueOf(paramInt3), paramAlignment, localObject, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Boolean.valueOf(paramBoolean), paramTruncateAt, Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
      AppMethodBeat.o(105818);
      return paramCharSequence;
    }
    catch (Exception paramCharSequence)
    {
      paramTextPaint = new java/lang/IllegalStateException;
      paramAlignment = new java/lang/StringBuilder;
      paramAlignment.<init>("Error creating StaticLayout with max lines: ");
      paramTextPaint.<init>(paramCharSequence.getCause());
      AppMethodBeat.o(105818);
    }
    throw paramTextPaint;
  }

  public static StaticLayout a(CharSequence paramCharSequence, int paramInt1, int paramInt2, TextPaint paramTextPaint, int paramInt3, Layout.Alignment paramAlignment, TextDirectionHeuristic paramTextDirectionHeuristic, float paramFloat1, float paramFloat2, boolean paramBoolean, TextUtils.TruncateAt paramTruncateAt, int paramInt4, int paramInt5)
  {
    try
    {
      AppMethodBeat.i(105819);
      ensureInitialized();
      if (eOh)
      {
        paramCharSequence = new java/lang/IllegalStateException;
        paramCharSequence.<init>("initialize error, cannot create StaticLayout");
        AppMethodBeat.o(105819);
        throw paramCharSequence;
      }
    }
    finally
    {
    }
    try
    {
      paramCharSequence = (StaticLayout)eOi.newInstance(new Object[] { paramCharSequence, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramTextPaint, Integer.valueOf(paramInt3), paramAlignment, paramTextDirectionHeuristic, Float.valueOf(paramFloat1), Float.valueOf(paramFloat2), Boolean.valueOf(paramBoolean), paramTruncateAt, Integer.valueOf(paramInt4), Integer.valueOf(paramInt5) });
      AppMethodBeat.o(105819);
      return paramCharSequence;
    }
    catch (Exception paramAlignment)
    {
      paramTextPaint = new java/lang/IllegalStateException;
      paramCharSequence = new java/lang/StringBuilder;
      paramCharSequence.<init>("Error creating StaticLayout with max lines: ");
      paramTextPaint.<init>(paramAlignment.getCause());
      AppMethodBeat.o(105819);
    }
    throw paramTextPaint;
  }

  // ERROR //
  @android.annotation.TargetApi(18)
  private static void ensureInitialized()
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: ldc 102
    //   5: invokestatic 28	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   8: getstatic 104	com/tencent/mm/kiss/widget/textview/b/a:eIC	Z
    //   11: ifeq +12 -> 23
    //   14: ldc 102
    //   16: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   19: ldc 2
    //   21: monitorexit
    //   22: return
    //   23: getstatic 110	android/os/Build$VERSION:SDK_INT	I
    //   26: bipush 18
    //   28: if_icmplt +154 -> 182
    //   31: ldc 112
    //   33: astore_0
    //   34: getstatic 118	android/text/TextDirectionHeuristics:FIRSTSTRONG_LTR	Landroid/text/TextDirectionHeuristic;
    //   37: putstatic 45	com/tencent/mm/kiss/widget/textview/b/a:eOj	Ljava/lang/Object;
    //   40: ldc 71
    //   42: bipush 13
    //   44: anewarray 120	java/lang/Class
    //   47: dup
    //   48: iconst_0
    //   49: ldc 122
    //   51: aastore
    //   52: dup
    //   53: iconst_1
    //   54: getstatic 126	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   57: aastore
    //   58: dup
    //   59: iconst_2
    //   60: getstatic 126	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   63: aastore
    //   64: dup
    //   65: iconst_3
    //   66: ldc 128
    //   68: aastore
    //   69: dup
    //   70: iconst_4
    //   71: getstatic 126	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   74: aastore
    //   75: dup
    //   76: iconst_5
    //   77: ldc 130
    //   79: aastore
    //   80: dup
    //   81: bipush 6
    //   83: aload_0
    //   84: aastore
    //   85: dup
    //   86: bipush 7
    //   88: getstatic 131	java/lang/Float:TYPE	Ljava/lang/Class;
    //   91: aastore
    //   92: dup
    //   93: bipush 8
    //   95: getstatic 131	java/lang/Float:TYPE	Ljava/lang/Class;
    //   98: aastore
    //   99: dup
    //   100: bipush 9
    //   102: getstatic 132	java/lang/Boolean:TYPE	Ljava/lang/Class;
    //   105: aastore
    //   106: dup
    //   107: bipush 10
    //   109: ldc 134
    //   111: aastore
    //   112: dup
    //   113: bipush 11
    //   115: getstatic 126	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   118: aastore
    //   119: dup
    //   120: bipush 12
    //   122: getstatic 126	java/lang/Integer:TYPE	Ljava/lang/Class;
    //   125: aastore
    //   126: invokevirtual 138	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   129: astore_0
    //   130: aload_0
    //   131: putstatic 47	com/tencent/mm/kiss/widget/textview/b/a:eOi	Ljava/lang/reflect/Constructor;
    //   134: aload_0
    //   135: iconst_1
    //   136: invokevirtual 142	java/lang/reflect/Constructor:setAccessible	(Z)V
    //   139: iconst_1
    //   140: putstatic 104	com/tencent/mm/kiss/widget/textview/b/a:eIC	Z
    //   143: new 73	java/lang/StringBuilder
    //   146: astore_0
    //   147: aload_0
    //   148: ldc 144
    //   150: invokespecial 76	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   153: ldc 146
    //   155: aload_0
    //   156: getstatic 33	com/tencent/mm/kiss/widget/textview/b/a:eOh	Z
    //   159: invokevirtual 149	java/lang/StringBuilder:append	(Z)Ljava/lang/StringBuilder;
    //   162: invokevirtual 88	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   165: invokestatic 154	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   168: ldc 102
    //   170: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   173: goto -154 -> 19
    //   176: astore_0
    //   177: ldc 2
    //   179: monitorexit
    //   180: aload_0
    //   181: athrow
    //   182: ldc 2
    //   184: invokevirtual 158	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   187: astore_1
    //   188: aload_1
    //   189: ldc 160
    //   191: invokevirtual 166	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   194: astore_0
    //   195: aload_1
    //   196: ldc 168
    //   198: invokevirtual 166	java/lang/ClassLoader:loadClass	(Ljava/lang/String;)Ljava/lang/Class;
    //   201: astore_1
    //   202: aload_1
    //   203: ldc 169
    //   205: invokevirtual 173	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   208: aload_1
    //   209: invokevirtual 179	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   212: putstatic 45	com/tencent/mm/kiss/widget/textview/b/a:eOj	Ljava/lang/Object;
    //   215: goto -175 -> 40
    //   218: astore_0
    //   219: ldc 146
    //   221: ldc 181
    //   223: iconst_1
    //   224: anewarray 4	java/lang/Object
    //   227: dup
    //   228: iconst_0
    //   229: aload_0
    //   230: aastore
    //   231: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   234: iconst_1
    //   235: putstatic 33	com/tencent/mm/kiss/widget/textview/b/a:eOh	Z
    //   238: iconst_1
    //   239: putstatic 104	com/tencent/mm/kiss/widget/textview/b/a:eIC	Z
    //   242: goto -99 -> 143
    //   245: astore_0
    //   246: ldc 146
    //   248: ldc 187
    //   250: iconst_1
    //   251: anewarray 4	java/lang/Object
    //   254: dup
    //   255: iconst_0
    //   256: aload_0
    //   257: aastore
    //   258: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   261: iconst_1
    //   262: putstatic 33	com/tencent/mm/kiss/widget/textview/b/a:eOh	Z
    //   265: iconst_1
    //   266: putstatic 104	com/tencent/mm/kiss/widget/textview/b/a:eIC	Z
    //   269: goto -126 -> 143
    //   272: astore_0
    //   273: ldc 146
    //   275: ldc 189
    //   277: iconst_1
    //   278: anewarray 4	java/lang/Object
    //   281: dup
    //   282: iconst_0
    //   283: aload_0
    //   284: aastore
    //   285: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   288: iconst_1
    //   289: putstatic 33	com/tencent/mm/kiss/widget/textview/b/a:eOh	Z
    //   292: iconst_1
    //   293: putstatic 104	com/tencent/mm/kiss/widget/textview/b/a:eIC	Z
    //   296: goto -153 -> 143
    //   299: astore_0
    //   300: ldc 146
    //   302: ldc 191
    //   304: iconst_1
    //   305: anewarray 4	java/lang/Object
    //   308: dup
    //   309: iconst_0
    //   310: aload_0
    //   311: aastore
    //   312: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   315: iconst_1
    //   316: putstatic 33	com/tencent/mm/kiss/widget/textview/b/a:eOh	Z
    //   319: iconst_1
    //   320: putstatic 104	com/tencent/mm/kiss/widget/textview/b/a:eIC	Z
    //   323: goto -180 -> 143
    //   326: astore_0
    //   327: ldc 146
    //   329: ldc 193
    //   331: iconst_1
    //   332: anewarray 4	java/lang/Object
    //   335: dup
    //   336: iconst_0
    //   337: aload_0
    //   338: aastore
    //   339: invokestatic 185	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   342: iconst_1
    //   343: putstatic 33	com/tencent/mm/kiss/widget/textview/b/a:eOh	Z
    //   346: iconst_1
    //   347: putstatic 104	com/tencent/mm/kiss/widget/textview/b/a:eIC	Z
    //   350: goto -207 -> 143
    //   353: astore_0
    //   354: iconst_1
    //   355: putstatic 104	com/tencent/mm/kiss/widget/textview/b/a:eIC	Z
    //   358: ldc 102
    //   360: invokestatic 43	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   363: aload_0
    //   364: athrow
    //
    // Exception table:
    //   from	to	target	type
    //   3	19	176	finally
    //   139	143	176	finally
    //   143	173	176	finally
    //   238	242	176	finally
    //   265	269	176	finally
    //   292	296	176	finally
    //   319	323	176	finally
    //   346	350	176	finally
    //   354	365	176	finally
    //   23	31	218	java/lang/NoSuchMethodException
    //   34	40	218	java/lang/NoSuchMethodException
    //   40	139	218	java/lang/NoSuchMethodException
    //   182	215	218	java/lang/NoSuchMethodException
    //   23	31	245	java/lang/ClassNotFoundException
    //   34	40	245	java/lang/ClassNotFoundException
    //   40	139	245	java/lang/ClassNotFoundException
    //   182	215	245	java/lang/ClassNotFoundException
    //   23	31	272	java/lang/NoSuchFieldException
    //   34	40	272	java/lang/NoSuchFieldException
    //   40	139	272	java/lang/NoSuchFieldException
    //   182	215	272	java/lang/NoSuchFieldException
    //   23	31	299	java/lang/IllegalAccessException
    //   34	40	299	java/lang/IllegalAccessException
    //   40	139	299	java/lang/IllegalAccessException
    //   182	215	299	java/lang/IllegalAccessException
    //   23	31	326	java/lang/Exception
    //   34	40	326	java/lang/Exception
    //   40	139	326	java/lang/Exception
    //   182	215	326	java/lang/Exception
    //   23	31	353	finally
    //   34	40	353	finally
    //   40	139	353	finally
    //   182	215	353	finally
    //   219	238	353	finally
    //   246	265	353	finally
    //   273	292	353	finally
    //   300	319	353	finally
    //   327	346	353	finally
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.b.a
 * JD-Core Version:    0.6.2
 */