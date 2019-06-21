package com.tencent.mm.plugin.emoji.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.a.a;
import com.tencent.mm.at.a.c.i;
import com.tencent.mm.at.o;
import com.tencent.mm.opensdk.modelmsg.WXEmojiObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.aik;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;

public class EmojiLogic
{
  // ERROR //
  public static int JA(String paramString)
  {
    // Byte code:
    //   0: ldc 14
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 22
    //   8: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   11: astore_0
    //   12: aload_0
    //   13: ldc 30
    //   15: invokeinterface 36 2 0
    //   20: checkcast 38	java/lang/String
    //   23: invokestatic 43	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   26: istore_1
    //   27: ldc 45
    //   29: ldc 47
    //   31: iconst_1
    //   32: anewarray 4	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: iload_1
    //   38: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   41: aastore
    //   42: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: ldc 14
    //   47: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: iload_1
    //   51: ireturn
    //   52: astore_0
    //   53: iconst_0
    //   54: istore_1
    //   55: ldc 45
    //   57: ldc 64
    //   59: iconst_1
    //   60: anewarray 4	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: aload_0
    //   66: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   69: aastore
    //   70: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: goto -28 -> 45
    //   76: astore_0
    //   77: goto -22 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   12	27	52	java/lang/Exception
    //   27	45	76	java/lang/Exception
  }

  public static boolean JB(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(53030);
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        if (com.tencent.mm.modelcontrol.b.rR(paramString))
        {
          ab.d("MicroMsg.emoji.EmojiLogic", "In Not Auto Download Time Range. timeRange:%s", new Object[] { paramString });
          AppMethodBeat.o(53030);
          return bool;
        }
      }
      catch (Exception paramString)
      {
        ab.e("MicroMsg.emoji.EmojiLogic", "isInNotAutoDownloadTimeRange :%s", new Object[] { bo.l(paramString) });
      }
      AppMethodBeat.o(53030);
      bool = false;
    }
  }

  public static String Jf(String paramString)
  {
    byte[] arrayOfByte = null;
    AppMethodBeat.i(53005);
    if (!bo.isNullOrNil(paramString))
    {
      int i = (int)com.tencent.mm.vfs.e.asZ(paramString);
      if (i > 0)
      {
        arrayOfByte = com.tencent.mm.vfs.e.e(paramString, 0, i);
        paramString = com.tencent.mm.a.g.x(arrayOfByte);
        if ((paramString != null) || (arrayOfByte != null))
        {
          String str = com.tencent.mm.plugin.emoji.h.b.Yb();
          com.tencent.mm.vfs.e.b(str + paramString, arrayOfByte, arrayOfByte.length);
          if (r.bS(arrayOfByte))
            ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.a(paramString, "", EmojiInfo.yaf, EmojiInfo.yan, arrayOfByte.length, "", "");
        }
        else
        {
          AppMethodBeat.o(53005);
        }
      }
    }
    while (true)
    {
      return paramString;
      ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.a(paramString, "", EmojiInfo.yaf, EmojiInfo.yam, arrayOfByte.length, "", "");
      break;
      AppMethodBeat.o(53005);
      paramString = arrayOfByte;
      continue;
      AppMethodBeat.o(53005);
      paramString = arrayOfByte;
    }
  }

  public static String Jk(String paramString)
  {
    AppMethodBeat.i(53019);
    ab.d("MicroMsg.emoji.EmojiLogic", "url:%s", new Object[] { paramString });
    String str1 = "";
    String str2 = str1;
    if (!TextUtils.isEmpty(paramString))
    {
      str2 = str1;
      if (paramString.startsWith("http://weixin.qq.com/emoticonstore/"))
        str2 = paramString.substring(paramString.lastIndexOf("/") + 1);
    }
    AppMethodBeat.o(53019);
    return str2;
  }

  // ERROR //
  public static String Jl(String paramString)
  {
    // Byte code:
    //   0: ldc 195
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 22
    //   8: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   11: astore_0
    //   12: aload_0
    //   13: ldc 197
    //   15: invokeinterface 36 2 0
    //   20: checkcast 38	java/lang/String
    //   23: astore_0
    //   24: ldc 45
    //   26: ldc 199
    //   28: iconst_1
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: aload_0
    //   35: aastore
    //   36: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: ldc 195
    //   41: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: aload_0
    //   45: areturn
    //   46: astore_1
    //   47: ldc 151
    //   49: astore_0
    //   50: ldc 45
    //   52: ldc 201
    //   54: iconst_1
    //   55: anewarray 4	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_1
    //   61: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   64: aastore
    //   65: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   68: goto -29 -> 39
    //   71: astore_1
    //   72: goto -22 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   12	24	46	java/lang/Exception
    //   24	39	71	java/lang/Exception
  }

  // ERROR //
  public static int Jm(String paramString)
  {
    // Byte code:
    //   0: ldc 203
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 22
    //   8: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   11: astore_0
    //   12: aload_0
    //   13: ldc 205
    //   15: invokeinterface 36 2 0
    //   20: checkcast 38	java/lang/String
    //   23: invokestatic 210	com/tencent/mm/a/p:cB	(Ljava/lang/String;)I
    //   26: istore_1
    //   27: ldc 45
    //   29: ldc 212
    //   31: iconst_1
    //   32: anewarray 4	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: iload_1
    //   38: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   41: aastore
    //   42: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: ldc 203
    //   47: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: iload_1
    //   51: ireturn
    //   52: astore_0
    //   53: iconst_0
    //   54: istore_1
    //   55: ldc 45
    //   57: ldc 214
    //   59: iconst_1
    //   60: anewarray 4	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: aload_0
    //   66: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   69: aastore
    //   70: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: goto -28 -> 45
    //   76: astore_0
    //   77: goto -22 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   12	27	52	java/lang/Exception
    //   27	45	76	java/lang/Exception
  }

  // ERROR //
  public static String Jn(String paramString)
  {
    // Byte code:
    //   0: ldc 216
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 22
    //   8: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   11: astore_0
    //   12: aload_0
    //   13: ldc 218
    //   15: invokeinterface 36 2 0
    //   20: checkcast 38	java/lang/String
    //   23: astore_0
    //   24: ldc 45
    //   26: ldc 212
    //   28: iconst_1
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: aload_0
    //   35: aastore
    //   36: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: ldc 216
    //   41: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: aload_0
    //   45: areturn
    //   46: astore_1
    //   47: ldc 151
    //   49: astore_0
    //   50: ldc 45
    //   52: ldc 220
    //   54: iconst_1
    //   55: anewarray 4	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_1
    //   61: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   64: aastore
    //   65: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   68: goto -29 -> 39
    //   71: astore_1
    //   72: goto -22 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   12	24	46	java/lang/Exception
    //   24	39	71	java/lang/Exception
  }

  public static String Jt(String paramString)
  {
    AppMethodBeat.i(53013);
    if (!TextUtils.isEmpty(paramString))
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<xml>");
      localStringBuilder.append("<productid>" + paramString + "</productid>");
      localStringBuilder.append("</xml>");
      paramString = localStringBuilder.toString();
      ab.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", new Object[] { paramString });
      AppMethodBeat.o(53013);
    }
    while (true)
    {
      return paramString;
      paramString = null;
      AppMethodBeat.o(53013);
    }
  }

  // ERROR //
  public static String Ju(String paramString)
  {
    // Byte code:
    //   0: ldc 239
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 22
    //   8: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   11: astore_0
    //   12: aload_0
    //   13: ldc 241
    //   15: invokeinterface 36 2 0
    //   20: checkcast 38	java/lang/String
    //   23: astore_0
    //   24: ldc 45
    //   26: ldc 243
    //   28: iconst_1
    //   29: anewarray 4	java/lang/Object
    //   32: dup
    //   33: iconst_0
    //   34: aload_0
    //   35: aastore
    //   36: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   39: ldc 239
    //   41: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   44: aload_0
    //   45: areturn
    //   46: astore_1
    //   47: ldc 151
    //   49: astore_0
    //   50: ldc 45
    //   52: ldc 245
    //   54: iconst_1
    //   55: anewarray 4	java/lang/Object
    //   58: dup
    //   59: iconst_0
    //   60: aload_1
    //   61: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   64: aastore
    //   65: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   68: goto -29 -> 39
    //   71: astore_1
    //   72: goto -22 -> 50
    //
    // Exception table:
    //   from	to	target	type
    //   12	24	46	java/lang/Exception
    //   24	39	71	java/lang/Exception
  }

  // ERROR //
  public static int Jv(String paramString)
  {
    // Byte code:
    //   0: ldc 247
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 22
    //   8: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   11: astore_0
    //   12: aload_0
    //   13: ldc 249
    //   15: invokeinterface 36 2 0
    //   20: checkcast 38	java/lang/String
    //   23: invokestatic 43	com/tencent/mm/sdk/platformtools/bo:ank	(Ljava/lang/String;)I
    //   26: istore_1
    //   27: ldc 45
    //   29: ldc 251
    //   31: iconst_1
    //   32: anewarray 4	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: iload_1
    //   38: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   41: aastore
    //   42: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   45: ldc 247
    //   47: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   50: iload_1
    //   51: ireturn
    //   52: astore_0
    //   53: iconst_0
    //   54: istore_1
    //   55: ldc 45
    //   57: ldc 253
    //   59: iconst_1
    //   60: anewarray 4	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: aload_0
    //   66: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   69: aastore
    //   70: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: goto -28 -> 45
    //   76: astore_0
    //   77: goto -22 -> 55
    //
    // Exception table:
    //   from	to	target	type
    //   12	27	52	java/lang/Exception
    //   27	45	76	java/lang/Exception
  }

  // ERROR //
  public static String Jw(String paramString)
  {
    // Byte code:
    //   0: ldc 255
    //   2: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: ldc 22
    //   8: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   11: astore_0
    //   12: aload_0
    //   13: ldc_w 257
    //   16: invokeinterface 36 2 0
    //   21: checkcast 38	java/lang/String
    //   24: astore_0
    //   25: ldc 45
    //   27: ldc_w 259
    //   30: iconst_1
    //   31: anewarray 4	java/lang/Object
    //   34: dup
    //   35: iconst_0
    //   36: aload_0
    //   37: aastore
    //   38: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   41: ldc 255
    //   43: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   46: aload_0
    //   47: areturn
    //   48: astore_1
    //   49: ldc 151
    //   51: astore_0
    //   52: ldc 45
    //   54: ldc_w 261
    //   57: iconst_1
    //   58: anewarray 4	java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: aload_1
    //   64: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   67: aastore
    //   68: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   71: goto -30 -> 41
    //   74: astore_1
    //   75: goto -23 -> 52
    //
    // Exception table:
    //   from	to	target	type
    //   12	25	48	java/lang/Exception
    //   25	41	74	java/lang/Exception
  }

  // ERROR //
  public static String Jx(String paramString)
  {
    // Byte code:
    //   0: ldc_w 263
    //   3: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc 22
    //   9: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   12: astore_0
    //   13: aload_0
    //   14: ldc_w 265
    //   17: invokeinterface 36 2 0
    //   22: checkcast 38	java/lang/String
    //   25: astore_0
    //   26: ldc 45
    //   28: ldc_w 267
    //   31: iconst_1
    //   32: anewarray 4	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: aload_0
    //   38: aastore
    //   39: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: ldc_w 263
    //   45: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_0
    //   49: areturn
    //   50: astore_1
    //   51: ldc 151
    //   53: astore_0
    //   54: ldc 45
    //   56: ldc_w 269
    //   59: iconst_1
    //   60: anewarray 4	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: aload_1
    //   66: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   69: aastore
    //   70: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: goto -31 -> 42
    //   76: astore_1
    //   77: goto -23 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   13	26	50	java/lang/Exception
    //   26	42	76	java/lang/Exception
  }

  // ERROR //
  public static String Jy(String paramString)
  {
    // Byte code:
    //   0: ldc_w 271
    //   3: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc 22
    //   9: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   12: astore_0
    //   13: aload_0
    //   14: ldc_w 273
    //   17: invokeinterface 36 2 0
    //   22: checkcast 38	java/lang/String
    //   25: astore_0
    //   26: ldc 45
    //   28: ldc_w 275
    //   31: iconst_1
    //   32: anewarray 4	java/lang/Object
    //   35: dup
    //   36: iconst_0
    //   37: aload_0
    //   38: aastore
    //   39: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   42: ldc_w 271
    //   45: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   48: aload_0
    //   49: areturn
    //   50: astore_1
    //   51: ldc 151
    //   53: astore_0
    //   54: ldc 45
    //   56: ldc_w 277
    //   59: iconst_1
    //   60: anewarray 4	java/lang/Object
    //   63: dup
    //   64: iconst_0
    //   65: aload_1
    //   66: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   69: aastore
    //   70: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   73: goto -31 -> 42
    //   76: astore_1
    //   77: goto -23 -> 54
    //
    // Exception table:
    //   from	to	target	type
    //   13	26	50	java/lang/Exception
    //   26	42	76	java/lang/Exception
  }

  // ERROR //
  public static String Jz(String paramString)
  {
    // Byte code:
    //   0: ldc_w 279
    //   3: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: aload_0
    //   7: ldc 22
    //   9: invokestatic 28	com/tencent/mm/sdk/platformtools/br:z	(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;
    //   12: astore_0
    //   13: aload_0
    //   14: ldc_w 281
    //   17: invokeinterface 36 2 0
    //   22: checkcast 38	java/lang/String
    //   25: ldc 151
    //   27: invokestatic 285	com/tencent/mm/sdk/platformtools/bo:bc	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   30: astore_0
    //   31: ldc 45
    //   33: ldc_w 287
    //   36: iconst_1
    //   37: anewarray 4	java/lang/Object
    //   40: dup
    //   41: iconst_0
    //   42: aload_0
    //   43: aastore
    //   44: invokestatic 59	com/tencent/mm/sdk/platformtools/ab:d	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   47: ldc_w 279
    //   50: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   53: aload_0
    //   54: areturn
    //   55: astore_1
    //   56: ldc 151
    //   58: astore_0
    //   59: ldc 45
    //   61: ldc_w 289
    //   64: iconst_1
    //   65: anewarray 4	java/lang/Object
    //   68: dup
    //   69: iconst_0
    //   70: aload_1
    //   71: invokevirtual 68	java/lang/Exception:toString	()Ljava/lang/String;
    //   74: aastore
    //   75: invokestatic 71	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   78: goto -31 -> 47
    //   81: astore_1
    //   82: goto -23 -> 59
    //
    // Exception table:
    //   from	to	target	type
    //   13	31	55	java/lang/Exception
    //   31	47	81	java/lang/Exception
  }

  public static String K(String paramString1, String paramString2, String paramString3)
  {
    Object localObject = null;
    String str = null;
    AppMethodBeat.i(53027);
    if ((bo.isNullOrNil(paramString2)) && (bo.isNullOrNil(paramString3)))
    {
      ab.w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and url are null.");
      AppMethodBeat.o(53027);
      paramString3 = str;
      return paramString3;
    }
    str = getMD5(paramString2, paramString3);
    paramString3 = localObject;
    if (!bo.isNullOrNil(str))
      if (!bo.isNullOrNil(paramString2))
        break label97;
    label97: for (paramString3 = paramString1 + str; ; paramString3 = paramString1 + paramString2 + "/" + str)
    {
      AppMethodBeat.o(53027);
      break;
    }
  }

  public static String L(String paramString1, String paramString2, String paramString3)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(53028);
    if ((bo.isNullOrNil(paramString2)) && (bo.isNullOrNil(paramString3)))
    {
      ab.w("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path failed. productid and md5 are null.");
      AppMethodBeat.o(53028);
      return localObject2;
    }
    localObject2 = localObject1;
    if (!bo.isNullOrNil(paramString3))
      if (!bo.isNullOrNil(paramString2))
        break label113;
    label113: for (localObject2 = paramString1 + paramString3; ; localObject2 = paramString1 + paramString2 + "/" + paramString3)
    {
      ab.d("MicroMsg.emoji.EmojiLogic", "[cpan] get icon path. productid:%s md5:%s path:%s", new Object[] { paramString2, paramString3, localObject2 });
      AppMethodBeat.o(53028);
      break;
    }
  }

  public static EmojiInfo a(String paramString1, String paramString2, i parami)
  {
    EmojiInfo localEmojiInfo = null;
    AppMethodBeat.i(53009);
    if (!com.tencent.mm.kernel.g.RP().isSDCardAvailable())
      if (ah.getContext() == null)
      {
        AppMethodBeat.o(53009);
        paramString1 = localEmojiInfo;
      }
    while (true)
    {
      return paramString1;
      if (ah.getContext().getResources() == null)
      {
        AppMethodBeat.o(53009);
        paramString1 = localEmojiInfo;
      }
      else
      {
        new EmojiInfo().field_type = EmojiInfo.yam;
        AppMethodBeat.o(53009);
        paramString1 = localEmojiInfo;
        continue;
        localEmojiInfo = r(paramString1, 4, paramString2);
        if (localEmojiInfo == null)
        {
          o.ahp().a(paramString2, null, com.tencent.mm.plugin.emoji.e.g.h(paramString1, paramString2, new Object[0]), parami);
          ab.i("MicroMsg.emoji.EmojiLogic", "[cpan] get emoji info, try to load image:%s", new Object[] { paramString2 });
        }
        AppMethodBeat.o(53009);
        paramString1 = localEmojiInfo;
      }
    }
  }

  public static String a(int paramInt1, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt2)
  {
    AppMethodBeat.i(53020);
    if (paramInt1 > 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<xml>");
      localStringBuilder.append("<tid>" + paramInt1 + "</tid>");
      localStringBuilder.append("<title>" + paramString1 + "</title>");
      localStringBuilder.append("<desc>" + paramString2 + "</desc>");
      localStringBuilder.append("<iconUrl>" + paramString3 + "</iconUrl>");
      localStringBuilder.append("<secondUrl>" + paramString4 + "</secondUrl>");
      localStringBuilder.append("<pageType>" + paramInt2 + "</pageType>");
      localStringBuilder.append("</xml>");
      paramString1 = localStringBuilder.toString();
      ab.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", new Object[] { paramString1 });
      AppMethodBeat.o(53020);
    }
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(53020);
    }
  }

  public static void a(Context paramContext, byte[] paramArrayOfByte, String paramString1, String paramString2, EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(53008);
    boolean bool;
    label50: int i;
    int j;
    float f;
    if (paramArrayOfByte == null)
      if (paramEmojiInfo == null)
      {
        bool = true;
        ab.d("MicroMsg.emoji.EmojiLogic", "insertEmoji: thumb is null, emojiInfo is null ? %B", new Object[] { Boolean.valueOf(bool) });
        if (paramEmojiInfo == null)
          break label272;
        paramContext = paramEmojiInfo.hk(paramContext);
        if ((paramContext == null) || ((paramContext.getWidth() <= 300) && (paramContext.getHeight() <= 300)))
          break label410;
        i = paramContext.getWidth();
        j = paramContext.getHeight();
        ab.i("MicroMsg.emoji.EmojiLogic", "cpan app msg width:%d height:%d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
        if (i <= j)
          break label289;
        f = j / i;
        j = 300;
        i = (int)(f * 300.0F);
        label144: ab.i("MicroMsg.emoji.EmojiLogic", "cpan app msg new width:%d new height:%d", new Object[] { Integer.valueOf(j), Integer.valueOf(i) });
        paramContext = com.tencent.mm.sdk.platformtools.d.a(paramContext, i, j, false, true);
      }
    label272: label410: 
    while (true)
      while (true)
      {
        if (paramContext != null);
        try
        {
          if (paramContext.getByteCount() > 65536)
          {
            paramEmojiInfo = Bitmap.CompressFormat.JPEG;
            paramArrayOfByte = new java/lang/StringBuilder;
            paramArrayOfByte.<init>();
            com.tencent.mm.sdk.platformtools.d.a(paramContext, 80, paramEmojiInfo, paramString2 + paramString1 + "_thumb", true);
            ab.i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is over size. save as jpg. size :%d", new Object[] { Integer.valueOf(paramContext.getByteCount()) });
            AppMethodBeat.o(53008);
          }
          while (true)
          {
            return;
            bool = false;
            break;
            AppMethodBeat.o(53008);
            continue;
            paramContext = com.tencent.mm.sdk.platformtools.d.bQ(paramArrayOfByte);
            break label50;
            label289: f = i / j;
            i = 300;
            j = (int)(f * 300.0F);
            break label144;
            paramArrayOfByte = Bitmap.CompressFormat.PNG;
            paramEmojiInfo = new java/lang/StringBuilder;
            paramEmojiInfo.<init>();
            com.tencent.mm.sdk.platformtools.d.a(paramContext, 100, paramArrayOfByte, paramString2 + paramString1 + "_thumb", true);
            ab.i("MicroMsg.emoji.EmojiLogic", "cpan app msg bitmap is in normal size. sav as png. size :%d", new Object[] { Integer.valueOf(paramContext.getByteCount()) });
            AppMethodBeat.o(53008);
          }
        }
        catch (Exception paramContext)
        {
          while (true)
          {
            ab.printErrStackTrace("MicroMsg.emoji.EmojiLogic", paramContext, "insertEmoji Error", new Object[0]);
            AppMethodBeat.o(53008);
          }
        }
      }
  }

  private static void a(Context paramContext, byte[] paramArrayOfByte1, String paramString1, byte[] paramArrayOfByte2, String paramString2)
  {
    AppMethodBeat.i(53007);
    if ((paramString1 == null) && (paramArrayOfByte2 == null))
    {
      AppMethodBeat.o(53007);
      return;
    }
    String str = com.tencent.mm.plugin.emoji.h.b.Yb();
    com.tencent.mm.vfs.e.b(str + paramString1, paramArrayOfByte2, paramArrayOfByte2.length);
    if (r.bS(paramArrayOfByte2));
    for (paramArrayOfByte2 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.a(paramString1, "", EmojiInfo.yaf, EmojiInfo.yap, paramArrayOfByte2.length, paramString2, ""); ; paramArrayOfByte2 = ((com.tencent.mm.plugin.emoji.b.d)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiStorageMgr().xYn.a(paramString1, "", EmojiInfo.yaf, EmojiInfo.yaq, paramArrayOfByte2.length, paramString2, ""))
    {
      a(paramContext, paramArrayOfByte1, paramString1, str, paramArrayOfByte2);
      AppMethodBeat.o(53007);
      break;
    }
  }

  // ERROR //
  public static boolean a(String paramString1, String paramString2, String paramString3, com.tencent.mm.storage.emotion.EmojiGroupInfo paramEmojiGroupInfo)
  {
    // Byte code:
    //   0: ldc_w 463
    //   3: invokestatic 20	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   6: new 115	java/lang/StringBuilder
    //   9: dup
    //   10: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   13: getstatic 469	com/tencent/mm/compatible/util/e:euQ	Ljava/lang/String;
    //   16: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   19: aload_0
    //   20: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   23: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   26: astore 4
    //   28: new 115	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   35: invokestatic 113	com/tencent/mm/plugin/emoji/h/b:Yb	()Ljava/lang/String;
    //   38: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: aload_0
    //   42: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   45: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: astore 5
    //   50: aconst_null
    //   51: astore 6
    //   53: aconst_null
    //   54: astore 7
    //   56: aconst_null
    //   57: astore 8
    //   59: aconst_null
    //   60: astore 9
    //   62: aconst_null
    //   63: astore 10
    //   65: aconst_null
    //   66: astore 11
    //   68: aconst_null
    //   69: astore 12
    //   71: new 471	java/util/HashMap
    //   74: dup
    //   75: invokespecial 472	java/util/HashMap:<init>	()V
    //   78: astore 13
    //   80: new 474	java/util/ArrayList
    //   83: dup
    //   84: invokespecial 475	java/util/ArrayList:<init>	()V
    //   87: astore 14
    //   89: new 477	java/util/zip/ZipFile
    //   92: astore 15
    //   94: aload 15
    //   96: aload 4
    //   98: invokespecial 478	java/util/zip/ZipFile:<init>	(Ljava/lang/String;)V
    //   101: aload 15
    //   103: astore 4
    //   105: aload 11
    //   107: astore 7
    //   109: aload 8
    //   111: astore 10
    //   113: aload 15
    //   115: invokevirtual 482	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   118: astore 16
    //   120: iconst_0
    //   121: istore 17
    //   123: aconst_null
    //   124: astore 7
    //   126: aload 9
    //   128: astore 4
    //   130: aload 7
    //   132: astore 9
    //   134: aload 9
    //   136: astore 12
    //   138: aload 4
    //   140: astore 6
    //   142: aload 9
    //   144: astore 10
    //   146: aload 4
    //   148: astore 7
    //   150: aload 16
    //   152: invokeinterface 487 1 0
    //   157: ifeq +1934 -> 2091
    //   160: aload 9
    //   162: astore 12
    //   164: aload 4
    //   166: astore 6
    //   168: aload 9
    //   170: astore 10
    //   172: aload 4
    //   174: astore 7
    //   176: aload 16
    //   178: invokeinterface 491 1 0
    //   183: checkcast 493	java/util/zip/ZipEntry
    //   186: astore 11
    //   188: aload 9
    //   190: astore 12
    //   192: aload 4
    //   194: astore 6
    //   196: aload 9
    //   198: astore 10
    //   200: aload 4
    //   202: astore 7
    //   204: aload 11
    //   206: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   209: ldc_w 498
    //   212: invokevirtual 501	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   215: ifne -81 -> 134
    //   218: aload 9
    //   220: astore 12
    //   222: aload 4
    //   224: astore 6
    //   226: aload 9
    //   228: astore 10
    //   230: aload 4
    //   232: astore 7
    //   234: aload 11
    //   236: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   239: ldc_w 503
    //   242: invokevirtual 501	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   245: ifne -111 -> 134
    //   248: aload 9
    //   250: astore 12
    //   252: aload 4
    //   254: astore 6
    //   256: aload 9
    //   258: astore 10
    //   260: aload 4
    //   262: astore 7
    //   264: aload 4
    //   266: astore 8
    //   268: aload 11
    //   270: invokevirtual 506	java/util/zip/ZipEntry:isDirectory	()Z
    //   273: ifne +3749 -> 4022
    //   276: aload 9
    //   278: astore 12
    //   280: aload 4
    //   282: astore 6
    //   284: aload 9
    //   286: astore 10
    //   288: aload 4
    //   290: astore 7
    //   292: aload 15
    //   294: aload 11
    //   296: invokevirtual 510	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   299: astore 4
    //   301: aload 9
    //   303: astore 12
    //   305: aload 4
    //   307: astore 6
    //   309: aload 9
    //   311: astore 10
    //   313: aload 4
    //   315: astore 7
    //   317: aload 11
    //   319: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   322: aload 11
    //   324: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   327: ldc 186
    //   329: invokevirtual 189	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   332: iconst_1
    //   333: iadd
    //   334: invokevirtual 193	java/lang/String:substring	(I)Ljava/lang/String;
    //   337: invokevirtual 513	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   340: astore 18
    //   342: aload 9
    //   344: astore 12
    //   346: aload 4
    //   348: astore 6
    //   350: aload 9
    //   352: astore 10
    //   354: aload 4
    //   356: astore 7
    //   358: new 515	com/tencent/mm/vfs/b
    //   361: astore 19
    //   363: aload 9
    //   365: astore 12
    //   367: aload 4
    //   369: astore 6
    //   371: aload 9
    //   373: astore 10
    //   375: aload 4
    //   377: astore 7
    //   379: new 115	java/lang/StringBuilder
    //   382: astore 8
    //   384: aload 9
    //   386: astore 12
    //   388: aload 4
    //   390: astore 6
    //   392: aload 9
    //   394: astore 10
    //   396: aload 4
    //   398: astore 7
    //   400: aload 8
    //   402: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   405: aload 9
    //   407: astore 12
    //   409: aload 4
    //   411: astore 6
    //   413: aload 9
    //   415: astore 10
    //   417: aload 4
    //   419: astore 7
    //   421: aload 19
    //   423: aload 8
    //   425: aload 5
    //   427: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   430: ldc 186
    //   432: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   435: aload 11
    //   437: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   440: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   443: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   446: invokespecial 516	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   449: aload 9
    //   451: astore 12
    //   453: aload 4
    //   455: astore 6
    //   457: aload 9
    //   459: astore 10
    //   461: aload 4
    //   463: astore 7
    //   465: aload 19
    //   467: invokevirtual 519	com/tencent/mm/vfs/b:isFile	()Z
    //   470: ifeq +25 -> 495
    //   473: aload 9
    //   475: astore 12
    //   477: aload 4
    //   479: astore 6
    //   481: aload 9
    //   483: astore 10
    //   485: aload 4
    //   487: astore 7
    //   489: aload 19
    //   491: invokevirtual 522	com/tencent/mm/vfs/b:delete	()Z
    //   494: pop
    //   495: aload 9
    //   497: astore 12
    //   499: aload 4
    //   501: astore 6
    //   503: aload 9
    //   505: astore 10
    //   507: aload 4
    //   509: astore 7
    //   511: aload 19
    //   513: invokevirtual 526	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   516: invokevirtual 529	com/tencent/mm/vfs/b:mkdirs	()Z
    //   519: pop
    //   520: aload 9
    //   522: astore 12
    //   524: aload 4
    //   526: astore 6
    //   528: aload 9
    //   530: astore 10
    //   532: aload 4
    //   534: astore 7
    //   536: aload 4
    //   538: astore 8
    //   540: aload 18
    //   542: ldc_w 531
    //   545: invokevirtual 184	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   548: ifne +3474 -> 4022
    //   551: aload 9
    //   553: astore 12
    //   555: aload 4
    //   557: astore 6
    //   559: aload 9
    //   561: astore 10
    //   563: aload 4
    //   565: astore 7
    //   567: aload 18
    //   569: ldc_w 533
    //   572: invokevirtual 536	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   575: ifne +34 -> 609
    //   578: aload 9
    //   580: astore 12
    //   582: aload 4
    //   584: astore 6
    //   586: aload 9
    //   588: astore 10
    //   590: aload 4
    //   592: astore 7
    //   594: aload 4
    //   596: astore 8
    //   598: aload 18
    //   600: ldc_w 538
    //   603: invokevirtual 536	java/lang/String:endsWith	(Ljava/lang/String;)Z
    //   606: ifeq +3416 -> 4022
    //   609: aload 9
    //   611: astore 12
    //   613: aload 4
    //   615: astore 6
    //   617: aload 9
    //   619: astore 10
    //   621: aload 4
    //   623: astore 7
    //   625: aload 11
    //   627: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   630: invokevirtual 513	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   633: ldc_w 540
    //   636: invokevirtual 501	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   639: ifeq +1099 -> 1738
    //   642: aload 9
    //   644: astore 12
    //   646: aload 4
    //   648: astore 6
    //   650: aload 9
    //   652: astore 10
    //   654: aload 4
    //   656: astore 7
    //   658: new 115	java/lang/StringBuilder
    //   661: astore 8
    //   663: aload 9
    //   665: astore 12
    //   667: aload 4
    //   669: astore 6
    //   671: aload 9
    //   673: astore 10
    //   675: aload 4
    //   677: astore 7
    //   679: aload 8
    //   681: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   684: aload 9
    //   686: astore 12
    //   688: aload 4
    //   690: astore 6
    //   692: aload 9
    //   694: astore 10
    //   696: aload 4
    //   698: astore 7
    //   700: aload 8
    //   702: aload 5
    //   704: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   707: ldc 186
    //   709: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   712: aload 18
    //   714: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   717: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   720: iconst_0
    //   721: invokestatic 543	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   724: astore 9
    //   726: aload 9
    //   728: astore 6
    //   730: aload 4
    //   732: astore 12
    //   734: aload 9
    //   736: astore 7
    //   738: aload 4
    //   740: astore 10
    //   742: ldc_w 544
    //   745: newarray byte
    //   747: astore 8
    //   749: aload 9
    //   751: astore 6
    //   753: aload 4
    //   755: astore 12
    //   757: aload 9
    //   759: astore 7
    //   761: aload 4
    //   763: astore 10
    //   765: aload 4
    //   767: aload 8
    //   769: invokevirtual 550	java/io/InputStream:read	([B)I
    //   772: istore 20
    //   774: iload 20
    //   776: ifle +140 -> 916
    //   779: aload 9
    //   781: astore 6
    //   783: aload 4
    //   785: astore 12
    //   787: aload 9
    //   789: astore 7
    //   791: aload 4
    //   793: astore 10
    //   795: aload 9
    //   797: aload 8
    //   799: iconst_0
    //   800: iload 20
    //   802: invokevirtual 556	java/io/OutputStream:write	([BII)V
    //   805: goto -56 -> 749
    //   808: astore_0
    //   809: aload 6
    //   811: astore_1
    //   812: aload 12
    //   814: astore 6
    //   816: aload 15
    //   818: astore 4
    //   820: aload_1
    //   821: astore 7
    //   823: aload 6
    //   825: astore 10
    //   827: new 115	java/lang/StringBuilder
    //   830: astore_2
    //   831: aload 15
    //   833: astore 4
    //   835: aload_1
    //   836: astore 7
    //   838: aload 6
    //   840: astore 10
    //   842: aload_2
    //   843: ldc_w 558
    //   846: invokespecial 229	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   849: aload 15
    //   851: astore 4
    //   853: aload_1
    //   854: astore 7
    //   856: aload 6
    //   858: astore 10
    //   860: ldc 45
    //   862: aload_2
    //   863: aload_0
    //   864: invokevirtual 561	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   867: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   870: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   873: invokestatic 563	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   876: aload_1
    //   877: ifnull +7 -> 884
    //   880: aload_1
    //   881: invokevirtual 566	java/io/OutputStream:close	()V
    //   884: aload 6
    //   886: ifnull +8 -> 894
    //   889: aload 6
    //   891: invokevirtual 567	java/io/InputStream:close	()V
    //   894: aload 15
    //   896: ifnull +8 -> 904
    //   899: aload 15
    //   901: invokevirtual 568	java/util/zip/ZipFile:close	()V
    //   904: iconst_0
    //   905: istore 21
    //   907: ldc_w 463
    //   910: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   913: iload 21
    //   915: ireturn
    //   916: aload 9
    //   918: astore 6
    //   920: aload 4
    //   922: astore 12
    //   924: aload 9
    //   926: astore 7
    //   928: aload 4
    //   930: astore 10
    //   932: aload 9
    //   934: invokevirtual 566	java/io/OutputStream:close	()V
    //   937: aconst_null
    //   938: astore 11
    //   940: aconst_null
    //   941: astore 19
    //   943: aconst_null
    //   944: astore 8
    //   946: aload 11
    //   948: astore 12
    //   950: aload 4
    //   952: astore 6
    //   954: aload 19
    //   956: astore 10
    //   958: aload 4
    //   960: astore 7
    //   962: new 115	java/lang/StringBuilder
    //   965: astore 9
    //   967: aload 11
    //   969: astore 12
    //   971: aload 4
    //   973: astore 6
    //   975: aload 19
    //   977: astore 10
    //   979: aload 4
    //   981: astore 7
    //   983: aload 9
    //   985: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   988: aload 11
    //   990: astore 12
    //   992: aload 4
    //   994: astore 6
    //   996: aload 19
    //   998: astore 10
    //   1000: aload 4
    //   1002: astore 7
    //   1004: aload 9
    //   1006: aload 5
    //   1008: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1011: ldc 186
    //   1013: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1016: aload 18
    //   1018: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1021: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1024: invokestatic 571	com/tencent/mm/vfs/e:atg	(Ljava/lang/String;)Ljava/lang/String;
    //   1027: astore 22
    //   1029: aload 11
    //   1031: astore 12
    //   1033: aload 4
    //   1035: astore 6
    //   1037: aload 19
    //   1039: astore 10
    //   1041: aload 4
    //   1043: astore 7
    //   1045: ldc 45
    //   1047: ldc_w 573
    //   1050: iconst_2
    //   1051: anewarray 4	java/lang/Object
    //   1054: dup
    //   1055: iconst_0
    //   1056: aload 22
    //   1058: aastore
    //   1059: dup
    //   1060: iconst_1
    //   1061: iload 17
    //   1063: invokestatic 53	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1066: aastore
    //   1067: invokestatic 237	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1070: aload 11
    //   1072: astore 12
    //   1074: aload 4
    //   1076: astore 6
    //   1078: aload 19
    //   1080: astore 10
    //   1082: aload 4
    //   1084: astore 7
    //   1086: new 515	com/tencent/mm/vfs/b
    //   1089: astore 23
    //   1091: aload 11
    //   1093: astore 12
    //   1095: aload 4
    //   1097: astore 6
    //   1099: aload 19
    //   1101: astore 10
    //   1103: aload 4
    //   1105: astore 7
    //   1107: new 115	java/lang/StringBuilder
    //   1110: astore 9
    //   1112: aload 11
    //   1114: astore 12
    //   1116: aload 4
    //   1118: astore 6
    //   1120: aload 19
    //   1122: astore 10
    //   1124: aload 4
    //   1126: astore 7
    //   1128: aload 9
    //   1130: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   1133: aload 11
    //   1135: astore 12
    //   1137: aload 4
    //   1139: astore 6
    //   1141: aload 19
    //   1143: astore 10
    //   1145: aload 4
    //   1147: astore 7
    //   1149: aload 23
    //   1151: aload 9
    //   1153: aload 5
    //   1155: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1158: ldc 186
    //   1160: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1163: aload 18
    //   1165: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1168: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1171: invokespecial 516	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   1174: aload 11
    //   1176: astore 12
    //   1178: aload 4
    //   1180: astore 6
    //   1182: aload 19
    //   1184: astore 10
    //   1186: aload 4
    //   1188: astore 7
    //   1190: new 515	com/tencent/mm/vfs/b
    //   1193: astore 24
    //   1195: aload 11
    //   1197: astore 12
    //   1199: aload 4
    //   1201: astore 6
    //   1203: aload 19
    //   1205: astore 10
    //   1207: aload 4
    //   1209: astore 7
    //   1211: new 115	java/lang/StringBuilder
    //   1214: astore 9
    //   1216: aload 11
    //   1218: astore 12
    //   1220: aload 4
    //   1222: astore 6
    //   1224: aload 19
    //   1226: astore 10
    //   1228: aload 4
    //   1230: astore 7
    //   1232: aload 9
    //   1234: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   1237: aload 11
    //   1239: astore 12
    //   1241: aload 4
    //   1243: astore 6
    //   1245: aload 19
    //   1247: astore 10
    //   1249: aload 4
    //   1251: astore 7
    //   1253: aload 24
    //   1255: aload 9
    //   1257: aload 5
    //   1259: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1262: ldc 186
    //   1264: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1267: aload 22
    //   1269: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1272: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1275: invokespecial 516	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   1278: aload 11
    //   1280: astore 12
    //   1282: aload 4
    //   1284: astore 6
    //   1286: aload 19
    //   1288: astore 10
    //   1290: aload 4
    //   1292: astore 7
    //   1294: aload 23
    //   1296: getfield 577	com/tencent/mm/vfs/b:mUri	Landroid/net/Uri;
    //   1299: invokestatic 582	com/tencent/mm/vfs/j:w	(Landroid/net/Uri;)Ljava/lang/String;
    //   1302: invokestatic 585	com/tencent/mm/sdk/platformtools/r:amo	(Ljava/lang/String;)Z
    //   1305: ifeq +409 -> 1714
    //   1308: aload 11
    //   1310: astore 12
    //   1312: aload 4
    //   1314: astore 6
    //   1316: aload 19
    //   1318: astore 10
    //   1320: aload 4
    //   1322: astore 7
    //   1324: getstatic 160	com/tencent/mm/storage/emotion/EmojiInfo:yan	I
    //   1327: istore 20
    //   1329: aload 11
    //   1331: astore 12
    //   1333: aload 4
    //   1335: astore 6
    //   1337: aload 19
    //   1339: astore 10
    //   1341: aload 4
    //   1343: astore 7
    //   1345: ldc 133
    //   1347: invokestatic 139	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   1350: checkcast 133	com/tencent/mm/plugin/emoji/b/d
    //   1353: invokeinterface 143 1 0
    //   1358: getfield 149	com/tencent/mm/storage/at:xYn	Lcom/tencent/mm/storage/emotion/d;
    //   1361: aload 22
    //   1363: invokevirtual 589	com/tencent/mm/storage/emotion/d:aqi	(Ljava/lang/String;)Lcom/tencent/mm/storage/emotion/EmojiInfo;
    //   1366: astore 25
    //   1368: aload 25
    //   1370: astore 9
    //   1372: aload 25
    //   1374: ifnonnull +67 -> 1441
    //   1377: aload 11
    //   1379: astore 12
    //   1381: aload 4
    //   1383: astore 6
    //   1385: aload 19
    //   1387: astore 10
    //   1389: aload 4
    //   1391: astore 7
    //   1393: new 153	com/tencent/mm/storage/emotion/EmojiInfo
    //   1396: astore 9
    //   1398: aload 11
    //   1400: astore 12
    //   1402: aload 4
    //   1404: astore 6
    //   1406: aload 19
    //   1408: astore 10
    //   1410: aload 4
    //   1412: astore 7
    //   1414: aload 9
    //   1416: invokespecial 332	com/tencent/mm/storage/emotion/EmojiInfo:<init>	()V
    //   1419: aload 11
    //   1421: astore 12
    //   1423: aload 4
    //   1425: astore 6
    //   1427: aload 19
    //   1429: astore 10
    //   1431: aload 4
    //   1433: astore 7
    //   1435: aload 9
    //   1437: iconst_0
    //   1438: putfield 592	com/tencent/mm/storage/emotion/EmojiInfo:field_catalog	I
    //   1441: aload 11
    //   1443: astore 12
    //   1445: aload 4
    //   1447: astore 6
    //   1449: aload 19
    //   1451: astore 10
    //   1453: aload 4
    //   1455: astore 7
    //   1457: aload 9
    //   1459: aload 18
    //   1461: putfield 595	com/tencent/mm/storage/emotion/EmojiInfo:field_name	Ljava/lang/String;
    //   1464: aload 11
    //   1466: astore 12
    //   1468: aload 4
    //   1470: astore 6
    //   1472: aload 19
    //   1474: astore 10
    //   1476: aload 4
    //   1478: astore 7
    //   1480: aload 9
    //   1482: aload 22
    //   1484: putfield 598	com/tencent/mm/storage/emotion/EmojiInfo:field_md5	Ljava/lang/String;
    //   1487: aload 11
    //   1489: astore 12
    //   1491: aload 4
    //   1493: astore 6
    //   1495: aload 19
    //   1497: astore 10
    //   1499: aload 4
    //   1501: astore 7
    //   1503: aload 9
    //   1505: aload 23
    //   1507: invokevirtual 602	com/tencent/mm/vfs/b:length	()J
    //   1510: l2i
    //   1511: putfield 605	com/tencent/mm/storage/emotion/EmojiInfo:field_size	I
    //   1514: aload 11
    //   1516: astore 12
    //   1518: aload 4
    //   1520: astore 6
    //   1522: aload 19
    //   1524: astore 10
    //   1526: aload 4
    //   1528: astore 7
    //   1530: aload 9
    //   1532: iload 20
    //   1534: putfield 335	com/tencent/mm/storage/emotion/EmojiInfo:field_type	I
    //   1537: aload 11
    //   1539: astore 12
    //   1541: aload 4
    //   1543: astore 6
    //   1545: aload 19
    //   1547: astore 10
    //   1549: aload 4
    //   1551: astore 7
    //   1553: aload 9
    //   1555: aload_0
    //   1556: putfield 608	com/tencent/mm/storage/emotion/EmojiInfo:field_groupId	Ljava/lang/String;
    //   1559: aload 11
    //   1561: astore 12
    //   1563: aload 4
    //   1565: astore 6
    //   1567: aload 19
    //   1569: astore 10
    //   1571: aload 4
    //   1573: astore 7
    //   1575: aload 9
    //   1577: iload 17
    //   1579: putfield 611	com/tencent/mm/storage/emotion/EmojiInfo:field_idx	I
    //   1582: aload 11
    //   1584: astore 12
    //   1586: aload 4
    //   1588: astore 6
    //   1590: aload 19
    //   1592: astore 10
    //   1594: aload 4
    //   1596: astore 7
    //   1598: aload 14
    //   1600: aload 9
    //   1602: invokevirtual 615	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   1605: pop
    //   1606: aload 11
    //   1608: astore 12
    //   1610: aload 4
    //   1612: astore 6
    //   1614: aload 19
    //   1616: astore 10
    //   1618: aload 4
    //   1620: astore 7
    //   1622: aload 23
    //   1624: aload 24
    //   1626: invokevirtual 618	com/tencent/mm/vfs/b:o	(Lcom/tencent/mm/vfs/b;)Z
    //   1629: pop
    //   1630: aload 11
    //   1632: astore 12
    //   1634: aload 4
    //   1636: astore 6
    //   1638: aload 19
    //   1640: astore 10
    //   1642: aload 4
    //   1644: astore 7
    //   1646: aload 13
    //   1648: aload 18
    //   1650: iconst_0
    //   1651: aload 18
    //   1653: invokevirtual 620	java/lang/String:length	()I
    //   1656: iconst_4
    //   1657: isub
    //   1658: invokevirtual 623	java/lang/String:substring	(II)Ljava/lang/String;
    //   1661: aload 22
    //   1663: invokevirtual 627	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   1666: pop
    //   1667: aload 8
    //   1669: astore 9
    //   1671: aload 4
    //   1673: astore 7
    //   1675: aload 4
    //   1677: ifnull +27 -> 1704
    //   1680: aload 4
    //   1682: astore 7
    //   1684: aload 9
    //   1686: astore 10
    //   1688: aload 4
    //   1690: astore 6
    //   1692: aload 9
    //   1694: astore 12
    //   1696: aload 4
    //   1698: invokevirtual 567	java/io/InputStream:close	()V
    //   1701: aconst_null
    //   1702: astore 7
    //   1704: iinc 17 1
    //   1707: aload 7
    //   1709: astore 4
    //   1711: goto -1577 -> 134
    //   1714: aload 11
    //   1716: astore 12
    //   1718: aload 4
    //   1720: astore 6
    //   1722: aload 19
    //   1724: astore 10
    //   1726: aload 4
    //   1728: astore 7
    //   1730: getstatic 169	com/tencent/mm/storage/emotion/EmojiInfo:yam	I
    //   1733: istore 20
    //   1735: goto -406 -> 1329
    //   1738: aload 9
    //   1740: astore 12
    //   1742: aload 4
    //   1744: astore 6
    //   1746: aload 9
    //   1748: astore 10
    //   1750: aload 4
    //   1752: astore 7
    //   1754: aload 4
    //   1756: astore 8
    //   1758: aload 18
    //   1760: ldc_w 629
    //   1763: invokevirtual 184	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   1766: ifeq +2256 -> 4022
    //   1769: aload 9
    //   1771: astore 12
    //   1773: aload 4
    //   1775: astore 6
    //   1777: aload 9
    //   1779: astore 10
    //   1781: aload 4
    //   1783: astore 7
    //   1785: new 115	java/lang/StringBuilder
    //   1788: astore 8
    //   1790: aload 9
    //   1792: astore 12
    //   1794: aload 4
    //   1796: astore 6
    //   1798: aload 9
    //   1800: astore 10
    //   1802: aload 4
    //   1804: astore 7
    //   1806: aload 8
    //   1808: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   1811: aload 9
    //   1813: astore 12
    //   1815: aload 4
    //   1817: astore 6
    //   1819: aload 9
    //   1821: astore 10
    //   1823: aload 4
    //   1825: astore 7
    //   1827: aload 8
    //   1829: aload_0
    //   1830: invokevirtual 633	java/lang/String:getBytes	()[B
    //   1833: invokestatic 108	com/tencent/mm/a/g:x	([B)Ljava/lang/String;
    //   1836: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1839: ldc_w 635
    //   1842: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1845: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1848: astore 8
    //   1850: aload 9
    //   1852: astore 12
    //   1854: aload 4
    //   1856: astore 6
    //   1858: aload 9
    //   1860: astore 10
    //   1862: aload 4
    //   1864: astore 7
    //   1866: new 115	java/lang/StringBuilder
    //   1869: astore 11
    //   1871: aload 9
    //   1873: astore 12
    //   1875: aload 4
    //   1877: astore 6
    //   1879: aload 9
    //   1881: astore 10
    //   1883: aload 4
    //   1885: astore 7
    //   1887: aload 11
    //   1889: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   1892: aload 9
    //   1894: astore 12
    //   1896: aload 4
    //   1898: astore 6
    //   1900: aload 9
    //   1902: astore 10
    //   1904: aload 4
    //   1906: astore 7
    //   1908: aload 11
    //   1910: aload 5
    //   1912: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1915: ldc 186
    //   1917: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1920: aload 8
    //   1922: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1925: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1928: iconst_0
    //   1929: invokestatic 543	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   1932: astore 9
    //   1934: aload 9
    //   1936: astore 6
    //   1938: aload 4
    //   1940: astore 12
    //   1942: aload 9
    //   1944: astore 7
    //   1946: aload 4
    //   1948: astore 10
    //   1950: ldc_w 544
    //   1953: newarray byte
    //   1955: astore 8
    //   1957: aload 9
    //   1959: astore 6
    //   1961: aload 4
    //   1963: astore 12
    //   1965: aload 9
    //   1967: astore 7
    //   1969: aload 4
    //   1971: astore 10
    //   1973: aload 4
    //   1975: aload 8
    //   1977: invokevirtual 550	java/io/InputStream:read	([B)I
    //   1980: istore 20
    //   1982: iload 20
    //   1984: ifle +80 -> 2064
    //   1987: aload 9
    //   1989: astore 6
    //   1991: aload 4
    //   1993: astore 12
    //   1995: aload 9
    //   1997: astore 7
    //   1999: aload 4
    //   2001: astore 10
    //   2003: aload 9
    //   2005: aload 8
    //   2007: iconst_0
    //   2008: iload 20
    //   2010: invokevirtual 556	java/io/OutputStream:write	([BII)V
    //   2013: goto -56 -> 1957
    //   2016: astore_0
    //   2017: aload 7
    //   2019: astore_1
    //   2020: aload 10
    //   2022: astore 7
    //   2024: aload 15
    //   2026: astore 4
    //   2028: aload_1
    //   2029: ifnull +7 -> 2036
    //   2032: aload_1
    //   2033: invokevirtual 566	java/io/OutputStream:close	()V
    //   2036: aload 7
    //   2038: ifnull +8 -> 2046
    //   2041: aload 7
    //   2043: invokevirtual 567	java/io/InputStream:close	()V
    //   2046: aload 4
    //   2048: ifnull +8 -> 2056
    //   2051: aload 4
    //   2053: invokevirtual 568	java/util/zip/ZipFile:close	()V
    //   2056: ldc_w 463
    //   2059: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   2062: aload_0
    //   2063: athrow
    //   2064: aload 9
    //   2066: astore 6
    //   2068: aload 4
    //   2070: astore 12
    //   2072: aload 9
    //   2074: astore 7
    //   2076: aload 4
    //   2078: astore 10
    //   2080: aload 9
    //   2082: invokevirtual 566	java/io/OutputStream:close	()V
    //   2085: aconst_null
    //   2086: astore 9
    //   2088: goto -417 -> 1671
    //   2091: aload 9
    //   2093: astore 12
    //   2095: aload 4
    //   2097: astore 6
    //   2099: aload 9
    //   2101: astore 10
    //   2103: aload 4
    //   2105: astore 7
    //   2107: aload 15
    //   2109: invokevirtual 482	java/util/zip/ZipFile:entries	()Ljava/util/Enumeration;
    //   2112: astore 16
    //   2114: aload 9
    //   2116: astore 8
    //   2118: aload 8
    //   2120: astore 12
    //   2122: aload 4
    //   2124: astore 6
    //   2126: aload 8
    //   2128: astore 10
    //   2130: aload 4
    //   2132: astore 7
    //   2134: aload 16
    //   2136: invokeinterface 487 1 0
    //   2141: ifeq +1160 -> 3301
    //   2144: aload 8
    //   2146: astore 12
    //   2148: aload 4
    //   2150: astore 6
    //   2152: aload 8
    //   2154: astore 10
    //   2156: aload 4
    //   2158: astore 7
    //   2160: aload 16
    //   2162: invokeinterface 491 1 0
    //   2167: checkcast 493	java/util/zip/ZipEntry
    //   2170: astore 25
    //   2172: aload 8
    //   2174: astore 12
    //   2176: aload 4
    //   2178: astore 6
    //   2180: aload 8
    //   2182: astore 10
    //   2184: aload 4
    //   2186: astore 7
    //   2188: aload 25
    //   2190: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   2193: ldc_w 498
    //   2196: invokevirtual 501	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   2199: ifne -81 -> 2118
    //   2202: aload 8
    //   2204: astore 12
    //   2206: aload 4
    //   2208: astore 6
    //   2210: aload 8
    //   2212: astore 10
    //   2214: aload 4
    //   2216: astore 7
    //   2218: aload 25
    //   2220: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   2223: ldc_w 503
    //   2226: invokevirtual 501	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   2229: ifne -111 -> 2118
    //   2232: aload 8
    //   2234: astore 9
    //   2236: aload 4
    //   2238: astore 11
    //   2240: aload 8
    //   2242: astore 12
    //   2244: aload 4
    //   2246: astore 6
    //   2248: aload 8
    //   2250: astore 10
    //   2252: aload 4
    //   2254: astore 7
    //   2256: aload 25
    //   2258: invokevirtual 506	java/util/zip/ZipEntry:isDirectory	()Z
    //   2261: ifne +992 -> 3253
    //   2264: aload 8
    //   2266: astore 12
    //   2268: aload 4
    //   2270: astore 6
    //   2272: aload 8
    //   2274: astore 10
    //   2276: aload 4
    //   2278: astore 7
    //   2280: aload 15
    //   2282: aload 25
    //   2284: invokevirtual 510	java/util/zip/ZipFile:getInputStream	(Ljava/util/zip/ZipEntry;)Ljava/io/InputStream;
    //   2287: astore 4
    //   2289: aload 8
    //   2291: astore 12
    //   2293: aload 4
    //   2295: astore 6
    //   2297: aload 8
    //   2299: astore 10
    //   2301: aload 4
    //   2303: astore 7
    //   2305: aload 25
    //   2307: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   2310: aload 25
    //   2312: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   2315: ldc 186
    //   2317: invokevirtual 189	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   2320: iconst_1
    //   2321: iadd
    //   2322: invokevirtual 193	java/lang/String:substring	(I)Ljava/lang/String;
    //   2325: invokevirtual 513	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   2328: astore 19
    //   2330: aload 8
    //   2332: astore 12
    //   2334: aload 4
    //   2336: astore 6
    //   2338: aload 8
    //   2340: astore 10
    //   2342: aload 4
    //   2344: astore 7
    //   2346: new 515	com/tencent/mm/vfs/b
    //   2349: astore 9
    //   2351: aload 8
    //   2353: astore 12
    //   2355: aload 4
    //   2357: astore 6
    //   2359: aload 8
    //   2361: astore 10
    //   2363: aload 4
    //   2365: astore 7
    //   2367: new 115	java/lang/StringBuilder
    //   2370: astore 11
    //   2372: aload 8
    //   2374: astore 12
    //   2376: aload 4
    //   2378: astore 6
    //   2380: aload 8
    //   2382: astore 10
    //   2384: aload 4
    //   2386: astore 7
    //   2388: aload 11
    //   2390: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   2393: aload 8
    //   2395: astore 12
    //   2397: aload 4
    //   2399: astore 6
    //   2401: aload 8
    //   2403: astore 10
    //   2405: aload 4
    //   2407: astore 7
    //   2409: aload 9
    //   2411: aload 11
    //   2413: aload 5
    //   2415: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2418: ldc 186
    //   2420: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2423: aload 25
    //   2425: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   2428: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2431: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2434: invokespecial 516	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   2437: aload 8
    //   2439: astore 12
    //   2441: aload 4
    //   2443: astore 6
    //   2445: aload 8
    //   2447: astore 10
    //   2449: aload 4
    //   2451: astore 7
    //   2453: aload 9
    //   2455: invokevirtual 519	com/tencent/mm/vfs/b:isFile	()Z
    //   2458: ifeq +25 -> 2483
    //   2461: aload 8
    //   2463: astore 12
    //   2465: aload 4
    //   2467: astore 6
    //   2469: aload 8
    //   2471: astore 10
    //   2473: aload 4
    //   2475: astore 7
    //   2477: aload 9
    //   2479: invokevirtual 522	com/tencent/mm/vfs/b:delete	()Z
    //   2482: pop
    //   2483: aload 8
    //   2485: astore 12
    //   2487: aload 4
    //   2489: astore 6
    //   2491: aload 8
    //   2493: astore 10
    //   2495: aload 4
    //   2497: astore 7
    //   2499: aload 9
    //   2501: invokevirtual 526	com/tencent/mm/vfs/b:dMC	()Lcom/tencent/mm/vfs/b;
    //   2504: invokevirtual 529	com/tencent/mm/vfs/b:mkdirs	()Z
    //   2507: pop
    //   2508: aload 8
    //   2510: astore 9
    //   2512: aload 4
    //   2514: astore 11
    //   2516: aload 8
    //   2518: astore 12
    //   2520: aload 4
    //   2522: astore 6
    //   2524: aload 8
    //   2526: astore 10
    //   2528: aload 4
    //   2530: astore 7
    //   2532: aload 25
    //   2534: invokevirtual 496	java/util/zip/ZipEntry:getName	()Ljava/lang/String;
    //   2537: invokevirtual 513	java/lang/String:toLowerCase	()Ljava/lang/String;
    //   2540: ldc_w 637
    //   2543: invokevirtual 501	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   2546: ifeq +707 -> 3253
    //   2549: aload 8
    //   2551: astore 12
    //   2553: aload 4
    //   2555: astore 6
    //   2557: aload 8
    //   2559: astore 10
    //   2561: aload 4
    //   2563: astore 7
    //   2565: aload 19
    //   2567: ldc_w 531
    //   2570: invokevirtual 189	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   2573: iconst_1
    //   2574: iadd
    //   2575: istore 17
    //   2577: aload 8
    //   2579: astore 12
    //   2581: aload 4
    //   2583: astore 6
    //   2585: aload 8
    //   2587: astore 10
    //   2589: aload 4
    //   2591: astore 7
    //   2593: aload 19
    //   2595: iload 17
    //   2597: invokevirtual 193	java/lang/String:substring	(I)Ljava/lang/String;
    //   2600: astore 11
    //   2602: aload 8
    //   2604: astore 12
    //   2606: aload 4
    //   2608: astore 6
    //   2610: aload 8
    //   2612: astore 10
    //   2614: aload 4
    //   2616: astore 7
    //   2618: new 115	java/lang/StringBuilder
    //   2621: astore 9
    //   2623: aload 8
    //   2625: astore 12
    //   2627: aload 4
    //   2629: astore 6
    //   2631: aload 8
    //   2633: astore 10
    //   2635: aload 4
    //   2637: astore 7
    //   2639: aload 9
    //   2641: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   2644: aload 8
    //   2646: astore 12
    //   2648: aload 4
    //   2650: astore 6
    //   2652: aload 8
    //   2654: astore 10
    //   2656: aload 4
    //   2658: astore 7
    //   2660: aload 9
    //   2662: aload 19
    //   2664: iconst_0
    //   2665: iload 17
    //   2667: iconst_1
    //   2668: isub
    //   2669: invokevirtual 623	java/lang/String:substring	(II)Ljava/lang/String;
    //   2672: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2675: ldc_w 639
    //   2678: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2681: aload 11
    //   2683: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2686: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2689: astore 18
    //   2691: aload 8
    //   2693: astore 12
    //   2695: aload 4
    //   2697: astore 6
    //   2699: aload 8
    //   2701: astore 10
    //   2703: aload 4
    //   2705: astore 7
    //   2707: new 115	java/lang/StringBuilder
    //   2710: astore 9
    //   2712: aload 8
    //   2714: astore 12
    //   2716: aload 4
    //   2718: astore 6
    //   2720: aload 8
    //   2722: astore 10
    //   2724: aload 4
    //   2726: astore 7
    //   2728: aload 9
    //   2730: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   2733: aload 8
    //   2735: astore 12
    //   2737: aload 4
    //   2739: astore 6
    //   2741: aload 8
    //   2743: astore 10
    //   2745: aload 4
    //   2747: astore 7
    //   2749: aload 9
    //   2751: aload 5
    //   2753: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2756: ldc 186
    //   2758: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2761: aload 18
    //   2763: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   2766: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   2769: iconst_0
    //   2770: invokestatic 543	com/tencent/mm/vfs/e:L	(Ljava/lang/String;Z)Ljava/io/OutputStream;
    //   2773: astore 9
    //   2775: aload 9
    //   2777: astore 6
    //   2779: aload 4
    //   2781: astore 12
    //   2783: aload 9
    //   2785: astore 7
    //   2787: aload 4
    //   2789: astore 10
    //   2791: ldc_w 544
    //   2794: newarray byte
    //   2796: astore 8
    //   2798: aload 9
    //   2800: astore 6
    //   2802: aload 4
    //   2804: astore 12
    //   2806: aload 9
    //   2808: astore 7
    //   2810: aload 4
    //   2812: astore 10
    //   2814: aload 4
    //   2816: aload 8
    //   2818: invokevirtual 550	java/io/InputStream:read	([B)I
    //   2821: istore 17
    //   2823: iload 17
    //   2825: ifle +32 -> 2857
    //   2828: aload 9
    //   2830: astore 6
    //   2832: aload 4
    //   2834: astore 12
    //   2836: aload 9
    //   2838: astore 7
    //   2840: aload 4
    //   2842: astore 10
    //   2844: aload 9
    //   2846: aload 8
    //   2848: iconst_0
    //   2849: iload 17
    //   2851: invokevirtual 556	java/io/OutputStream:write	([BII)V
    //   2854: goto -56 -> 2798
    //   2857: aload 9
    //   2859: astore 6
    //   2861: aload 4
    //   2863: astore 12
    //   2865: aload 9
    //   2867: astore 7
    //   2869: aload 4
    //   2871: astore 10
    //   2873: aload 9
    //   2875: invokevirtual 566	java/io/OutputStream:close	()V
    //   2878: aconst_null
    //   2879: astore 19
    //   2881: aconst_null
    //   2882: astore 25
    //   2884: aconst_null
    //   2885: astore 8
    //   2887: aload 19
    //   2889: astore 12
    //   2891: aload 4
    //   2893: astore 6
    //   2895: aload 25
    //   2897: astore 10
    //   2899: aload 4
    //   2901: astore 7
    //   2903: aload 18
    //   2905: iconst_0
    //   2906: aload 18
    //   2908: ldc_w 639
    //   2911: invokevirtual 189	java/lang/String:lastIndexOf	(Ljava/lang/String;)I
    //   2914: invokevirtual 623	java/lang/String:substring	(II)Ljava/lang/String;
    //   2917: astore 23
    //   2919: aload 8
    //   2921: astore 9
    //   2923: aload 4
    //   2925: astore 11
    //   2927: aload 19
    //   2929: astore 12
    //   2931: aload 4
    //   2933: astore 6
    //   2935: aload 25
    //   2937: astore 10
    //   2939: aload 4
    //   2941: astore 7
    //   2943: aload 13
    //   2945: aload 23
    //   2947: invokevirtual 642	java/util/HashMap:containsKey	(Ljava/lang/Object;)Z
    //   2950: ifeq +303 -> 3253
    //   2953: aload 19
    //   2955: astore 12
    //   2957: aload 4
    //   2959: astore 6
    //   2961: aload 25
    //   2963: astore 10
    //   2965: aload 4
    //   2967: astore 7
    //   2969: aload 13
    //   2971: aload 23
    //   2973: invokevirtual 643	java/util/HashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   2976: checkcast 38	java/lang/String
    //   2979: astore 9
    //   2981: aload 19
    //   2983: astore 12
    //   2985: aload 4
    //   2987: astore 6
    //   2989: aload 25
    //   2991: astore 10
    //   2993: aload 4
    //   2995: astore 7
    //   2997: new 515	com/tencent/mm/vfs/b
    //   3000: astore 11
    //   3002: aload 19
    //   3004: astore 12
    //   3006: aload 4
    //   3008: astore 6
    //   3010: aload 25
    //   3012: astore 10
    //   3014: aload 4
    //   3016: astore 7
    //   3018: new 115	java/lang/StringBuilder
    //   3021: astore 23
    //   3023: aload 19
    //   3025: astore 12
    //   3027: aload 4
    //   3029: astore 6
    //   3031: aload 25
    //   3033: astore 10
    //   3035: aload 4
    //   3037: astore 7
    //   3039: aload 23
    //   3041: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   3044: aload 19
    //   3046: astore 12
    //   3048: aload 4
    //   3050: astore 6
    //   3052: aload 25
    //   3054: astore 10
    //   3056: aload 4
    //   3058: astore 7
    //   3060: aload 11
    //   3062: aload 23
    //   3064: aload 5
    //   3066: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3069: ldc 186
    //   3071: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3074: aload 18
    //   3076: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3079: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3082: invokespecial 516	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   3085: aload 19
    //   3087: astore 12
    //   3089: aload 4
    //   3091: astore 6
    //   3093: aload 25
    //   3095: astore 10
    //   3097: aload 4
    //   3099: astore 7
    //   3101: new 515	com/tencent/mm/vfs/b
    //   3104: astore 23
    //   3106: aload 19
    //   3108: astore 12
    //   3110: aload 4
    //   3112: astore 6
    //   3114: aload 25
    //   3116: astore 10
    //   3118: aload 4
    //   3120: astore 7
    //   3122: new 115	java/lang/StringBuilder
    //   3125: astore 22
    //   3127: aload 19
    //   3129: astore 12
    //   3131: aload 4
    //   3133: astore 6
    //   3135: aload 25
    //   3137: astore 10
    //   3139: aload 4
    //   3141: astore 7
    //   3143: aload 22
    //   3145: invokespecial 116	java/lang/StringBuilder:<init>	()V
    //   3148: aload 19
    //   3150: astore 12
    //   3152: aload 4
    //   3154: astore 6
    //   3156: aload 25
    //   3158: astore 10
    //   3160: aload 4
    //   3162: astore 7
    //   3164: aload 23
    //   3166: aload 22
    //   3168: aload 5
    //   3170: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3173: ldc 186
    //   3175: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3178: aload 9
    //   3180: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3183: ldc_w 645
    //   3186: invokevirtual 120	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   3189: invokevirtual 121	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   3192: invokespecial 516	com/tencent/mm/vfs/b:<init>	(Ljava/lang/String;)V
    //   3195: aload 19
    //   3197: astore 12
    //   3199: aload 4
    //   3201: astore 6
    //   3203: aload 25
    //   3205: astore 10
    //   3207: aload 4
    //   3209: astore 7
    //   3211: aload 11
    //   3213: aload 23
    //   3215: invokevirtual 618	com/tencent/mm/vfs/b:o	(Lcom/tencent/mm/vfs/b;)Z
    //   3218: pop
    //   3219: aload 19
    //   3221: astore 12
    //   3223: aload 4
    //   3225: astore 6
    //   3227: aload 25
    //   3229: astore 10
    //   3231: aload 4
    //   3233: astore 7
    //   3235: aload 13
    //   3237: aload 18
    //   3239: aload 9
    //   3241: invokevirtual 627	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   3244: pop
    //   3245: aload 4
    //   3247: astore 11
    //   3249: aload 8
    //   3251: astore 9
    //   3253: aload 11
    //   3255: astore 4
    //   3257: aload 4
    //   3259: astore 7
    //   3261: aload 4
    //   3263: ifnull +27 -> 3290
    //   3266: aload 4
    //   3268: astore 7
    //   3270: aload 9
    //   3272: astore 10
    //   3274: aload 4
    //   3276: astore 6
    //   3278: aload 9
    //   3280: astore 12
    //   3282: aload 4
    //   3284: invokevirtual 567	java/io/InputStream:close	()V
    //   3287: aconst_null
    //   3288: astore 7
    //   3290: aload 7
    //   3292: astore 4
    //   3294: aload 9
    //   3296: astore 8
    //   3298: goto -1180 -> 2118
    //   3301: aload 8
    //   3303: astore 12
    //   3305: aload 4
    //   3307: astore 6
    //   3309: aload 8
    //   3311: astore 10
    //   3313: aload 4
    //   3315: astore 7
    //   3317: aload 13
    //   3319: invokevirtual 648	java/util/HashMap:clear	()V
    //   3322: aload_3
    //   3323: astore 9
    //   3325: aload_3
    //   3326: ifnonnull +42 -> 3368
    //   3329: aload 8
    //   3331: astore 12
    //   3333: aload 4
    //   3335: astore 6
    //   3337: aload 8
    //   3339: astore 10
    //   3341: aload 4
    //   3343: astore 7
    //   3345: ldc 133
    //   3347: invokestatic 139	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   3350: checkcast 133	com/tencent/mm/plugin/emoji/b/d
    //   3353: invokeinterface 143 1 0
    //   3358: getfield 652	com/tencent/mm/storage/at:xYo	Lcom/tencent/mm/storage/emotion/a;
    //   3361: aload_0
    //   3362: iconst_0
    //   3363: invokevirtual 658	com/tencent/mm/storage/emotion/a:bZ	(Ljava/lang/String;Z)Lcom/tencent/mm/storage/emotion/EmojiGroupInfo;
    //   3366: astore 9
    //   3368: aload 8
    //   3370: astore 12
    //   3372: aload 4
    //   3374: astore 6
    //   3376: aload 8
    //   3378: astore 10
    //   3380: aload 4
    //   3382: astore 7
    //   3384: aload 9
    //   3386: aload_0
    //   3387: putfield 663	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_productID	Ljava/lang/String;
    //   3390: aload 8
    //   3392: astore 12
    //   3394: aload 4
    //   3396: astore 6
    //   3398: aload 8
    //   3400: astore 10
    //   3402: aload 4
    //   3404: astore 7
    //   3406: aload_1
    //   3407: invokestatic 77	com/tencent/mm/sdk/platformtools/bo:isNullOrNil	(Ljava/lang/String;)Z
    //   3410: ifne +25 -> 3435
    //   3413: aload 8
    //   3415: astore 12
    //   3417: aload 4
    //   3419: astore 6
    //   3421: aload 8
    //   3423: astore 10
    //   3425: aload 4
    //   3427: astore 7
    //   3429: aload 9
    //   3431: aload_1
    //   3432: putfield 666	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_packName	Ljava/lang/String;
    //   3435: aload 8
    //   3437: astore 12
    //   3439: aload 4
    //   3441: astore 6
    //   3443: aload 8
    //   3445: astore 10
    //   3447: aload 4
    //   3449: astore 7
    //   3451: aload 9
    //   3453: invokestatic 671	java/lang/System:currentTimeMillis	()J
    //   3456: putfield 675	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_lastUseTime	J
    //   3459: aload 8
    //   3461: astore 12
    //   3463: aload 4
    //   3465: astore 6
    //   3467: aload 8
    //   3469: astore 10
    //   3471: aload 4
    //   3473: astore 7
    //   3475: aload 9
    //   3477: bipush 7
    //   3479: putfield 678	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_status	I
    //   3482: aload 8
    //   3484: astore 12
    //   3486: aload 4
    //   3488: astore 6
    //   3490: aload 8
    //   3492: astore 10
    //   3494: aload 4
    //   3496: astore 7
    //   3498: aload 9
    //   3500: iconst_1
    //   3501: putfield 681	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_packStatus	I
    //   3504: aload 8
    //   3506: astore 12
    //   3508: aload 4
    //   3510: astore 6
    //   3512: aload 8
    //   3514: astore 10
    //   3516: aload 4
    //   3518: astore 7
    //   3520: aload 9
    //   3522: getstatic 684	com/tencent/mm/storage/emotion/EmojiGroupInfo:xZZ	I
    //   3525: putfield 685	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_type	I
    //   3528: aload 8
    //   3530: astore 12
    //   3532: aload 4
    //   3534: astore 6
    //   3536: aload 8
    //   3538: astore 10
    //   3540: aload 4
    //   3542: astore 7
    //   3544: aload 9
    //   3546: iconst_0
    //   3547: putfield 688	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_recommand	I
    //   3550: aload 8
    //   3552: astore 12
    //   3554: aload 4
    //   3556: astore 6
    //   3558: aload 8
    //   3560: astore 10
    //   3562: aload 4
    //   3564: astore 7
    //   3566: aload 9
    //   3568: iconst_2
    //   3569: putfield 691	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_sync	I
    //   3572: aload 8
    //   3574: astore 12
    //   3576: aload 4
    //   3578: astore 6
    //   3580: aload 8
    //   3582: astore 10
    //   3584: aload 4
    //   3586: astore 7
    //   3588: aload 9
    //   3590: aload 14
    //   3592: invokevirtual 694	java/util/ArrayList:size	()I
    //   3595: putfield 697	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_count	I
    //   3598: aload 8
    //   3600: astore 12
    //   3602: aload 4
    //   3604: astore 6
    //   3606: aload 8
    //   3608: astore 10
    //   3610: aload 4
    //   3612: astore 7
    //   3614: aload 9
    //   3616: aload_2
    //   3617: putfield 700	com/tencent/mm/storage/emotion/EmojiGroupInfo:field_packIconUrl	Ljava/lang/String;
    //   3620: aload 8
    //   3622: astore 12
    //   3624: aload 4
    //   3626: astore 6
    //   3628: aload 8
    //   3630: astore 10
    //   3632: aload 4
    //   3634: astore 7
    //   3636: ldc 133
    //   3638: invokestatic 139	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   3641: checkcast 133	com/tencent/mm/plugin/emoji/b/d
    //   3644: invokeinterface 143 1 0
    //   3649: getfield 149	com/tencent/mm/storage/at:xYn	Lcom/tencent/mm/storage/emotion/d;
    //   3652: aload 14
    //   3654: aload_0
    //   3655: invokevirtual 704	com/tencent/mm/storage/emotion/d:j	(Ljava/util/List;Ljava/lang/String;)Z
    //   3658: istore 26
    //   3660: iload 26
    //   3662: ifeq +254 -> 3916
    //   3665: aload 8
    //   3667: astore 12
    //   3669: aload 4
    //   3671: astore 6
    //   3673: aload 8
    //   3675: astore 10
    //   3677: aload 4
    //   3679: astore 7
    //   3681: ldc 133
    //   3683: invokestatic 139	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   3686: checkcast 133	com/tencent/mm/plugin/emoji/b/d
    //   3689: invokeinterface 143 1 0
    //   3694: getfield 652	com/tencent/mm/storage/at:xYo	Lcom/tencent/mm/storage/emotion/a;
    //   3697: aload 9
    //   3699: invokevirtual 708	com/tencent/mm/storage/emotion/a:c	(Lcom/tencent/mm/storage/emotion/EmojiGroupInfo;)Z
    //   3702: istore 21
    //   3704: aload 8
    //   3706: astore 12
    //   3708: aload 4
    //   3710: astore 6
    //   3712: aload 8
    //   3714: astore 10
    //   3716: aload 4
    //   3718: astore 7
    //   3720: aload 14
    //   3722: invokevirtual 712	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   3725: astore_1
    //   3726: aload 8
    //   3728: astore 12
    //   3730: aload 4
    //   3732: astore 6
    //   3734: aload 8
    //   3736: astore 10
    //   3738: aload 4
    //   3740: astore 7
    //   3742: aload_1
    //   3743: invokeinterface 717 1 0
    //   3748: ifeq +97 -> 3845
    //   3751: aload 8
    //   3753: astore 12
    //   3755: aload 4
    //   3757: astore 6
    //   3759: aload 8
    //   3761: astore 10
    //   3763: aload 4
    //   3765: astore 7
    //   3767: aload_1
    //   3768: invokeinterface 720 1 0
    //   3773: checkcast 153	com/tencent/mm/storage/emotion/EmojiInfo
    //   3776: astore_0
    //   3777: aload 8
    //   3779: astore 12
    //   3781: aload 4
    //   3783: astore 6
    //   3785: aload 8
    //   3787: astore 10
    //   3789: aload 4
    //   3791: astore 7
    //   3793: aload_0
    //   3794: iconst_0
    //   3795: putfield 723	com/tencent/mm/storage/emotion/EmojiInfo:field_reserved4	I
    //   3798: aload 8
    //   3800: astore 12
    //   3802: aload 4
    //   3804: astore 6
    //   3806: aload 8
    //   3808: astore 10
    //   3810: aload 4
    //   3812: astore 7
    //   3814: ldc 133
    //   3816: invokestatic 139	com/tencent/mm/kernel/g:M	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/b/a;
    //   3819: checkcast 133	com/tencent/mm/plugin/emoji/b/d
    //   3822: invokeinterface 727 1 0
    //   3827: aload_0
    //   3828: iconst_1
    //   3829: invokeinterface 732 3 0
    //   3834: pop
    //   3835: goto -109 -> 3726
    //   3838: astore_0
    //   3839: aload 12
    //   3841: astore_1
    //   3842: goto -3026 -> 816
    //   3845: aload 8
    //   3847: astore 12
    //   3849: aload 4
    //   3851: astore 6
    //   3853: aload 8
    //   3855: astore 10
    //   3857: aload 4
    //   3859: astore 7
    //   3861: ldc 45
    //   3863: ldc_w 734
    //   3866: iconst_2
    //   3867: anewarray 4	java/lang/Object
    //   3870: dup
    //   3871: iconst_0
    //   3872: iload 21
    //   3874: invokestatic 396	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3877: aastore
    //   3878: dup
    //   3879: iconst_1
    //   3880: iload 26
    //   3882: invokestatic 396	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3885: aastore
    //   3886: invokestatic 237	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3889: aload 4
    //   3891: ifnull +8 -> 3899
    //   3894: aload 4
    //   3896: invokevirtual 567	java/io/InputStream:close	()V
    //   3899: aload 15
    //   3901: invokevirtual 568	java/util/zip/ZipFile:close	()V
    //   3904: iconst_1
    //   3905: istore 21
    //   3907: ldc_w 463
    //   3910: invokestatic 62	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   3913: goto -3000 -> 913
    //   3916: aload 8
    //   3918: astore 12
    //   3920: aload 4
    //   3922: astore 6
    //   3924: aload 8
    //   3926: astore 10
    //   3928: aload 4
    //   3930: astore 7
    //   3932: ldc 45
    //   3934: ldc_w 736
    //   3937: iconst_1
    //   3938: anewarray 4	java/lang/Object
    //   3941: dup
    //   3942: iconst_0
    //   3943: iload 26
    //   3945: invokestatic 396	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   3948: aastore
    //   3949: invokestatic 237	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   3952: goto -63 -> 3889
    //   3955: astore_0
    //   3956: aload 10
    //   3958: astore_1
    //   3959: aload 15
    //   3961: astore 4
    //   3963: goto -1935 -> 2028
    //   3966: astore_0
    //   3967: aconst_null
    //   3968: astore 4
    //   3970: aload 10
    //   3972: astore_1
    //   3973: goto -1945 -> 2028
    //   3976: astore_0
    //   3977: aload 7
    //   3979: astore_1
    //   3980: aload 10
    //   3982: astore 7
    //   3984: goto -1956 -> 2028
    //   3987: astore_0
    //   3988: aload 10
    //   3990: astore_1
    //   3991: aload 15
    //   3993: astore 4
    //   3995: goto -1967 -> 2028
    //   3998: astore_0
    //   3999: aconst_null
    //   4000: astore 15
    //   4002: aload 12
    //   4004: astore_1
    //   4005: goto -3189 -> 816
    //   4008: astore_0
    //   4009: aload 12
    //   4011: astore_1
    //   4012: goto -3196 -> 816
    //   4015: astore_0
    //   4016: aload 12
    //   4018: astore_1
    //   4019: goto -3203 -> 816
    //   4022: aload 8
    //   4024: astore 4
    //   4026: goto -2355 -> 1671
    //
    // Exception table:
    //   from	to	target	type
    //   742	749	808	java/lang/Exception
    //   765	774	808	java/lang/Exception
    //   795	805	808	java/lang/Exception
    //   932	937	808	java/lang/Exception
    //   1950	1957	808	java/lang/Exception
    //   1973	1982	808	java/lang/Exception
    //   2003	2013	808	java/lang/Exception
    //   2080	2085	808	java/lang/Exception
    //   2791	2798	808	java/lang/Exception
    //   2814	2823	808	java/lang/Exception
    //   2844	2854	808	java/lang/Exception
    //   2873	2878	808	java/lang/Exception
    //   742	749	2016	finally
    //   765	774	2016	finally
    //   795	805	2016	finally
    //   932	937	2016	finally
    //   1950	1957	2016	finally
    //   1973	1982	2016	finally
    //   2003	2013	2016	finally
    //   2080	2085	2016	finally
    //   2791	2798	2016	finally
    //   2814	2823	2016	finally
    //   2844	2854	2016	finally
    //   2873	2878	2016	finally
    //   150	160	3838	java/lang/Exception
    //   176	188	3838	java/lang/Exception
    //   204	218	3838	java/lang/Exception
    //   234	248	3838	java/lang/Exception
    //   268	276	3838	java/lang/Exception
    //   292	301	3838	java/lang/Exception
    //   317	342	3838	java/lang/Exception
    //   358	363	3838	java/lang/Exception
    //   379	384	3838	java/lang/Exception
    //   400	405	3838	java/lang/Exception
    //   421	449	3838	java/lang/Exception
    //   465	473	3838	java/lang/Exception
    //   489	495	3838	java/lang/Exception
    //   511	520	3838	java/lang/Exception
    //   540	551	3838	java/lang/Exception
    //   567	578	3838	java/lang/Exception
    //   598	609	3838	java/lang/Exception
    //   625	642	3838	java/lang/Exception
    //   658	663	3838	java/lang/Exception
    //   679	684	3838	java/lang/Exception
    //   700	726	3838	java/lang/Exception
    //   962	967	3838	java/lang/Exception
    //   983	988	3838	java/lang/Exception
    //   1004	1029	3838	java/lang/Exception
    //   1045	1070	3838	java/lang/Exception
    //   1086	1091	3838	java/lang/Exception
    //   1107	1112	3838	java/lang/Exception
    //   1128	1133	3838	java/lang/Exception
    //   1149	1174	3838	java/lang/Exception
    //   1190	1195	3838	java/lang/Exception
    //   1211	1216	3838	java/lang/Exception
    //   1232	1237	3838	java/lang/Exception
    //   1253	1278	3838	java/lang/Exception
    //   1294	1308	3838	java/lang/Exception
    //   1324	1329	3838	java/lang/Exception
    //   1345	1368	3838	java/lang/Exception
    //   1393	1398	3838	java/lang/Exception
    //   1414	1419	3838	java/lang/Exception
    //   1435	1441	3838	java/lang/Exception
    //   1457	1464	3838	java/lang/Exception
    //   1480	1487	3838	java/lang/Exception
    //   1503	1514	3838	java/lang/Exception
    //   1530	1537	3838	java/lang/Exception
    //   1553	1559	3838	java/lang/Exception
    //   1575	1582	3838	java/lang/Exception
    //   1598	1606	3838	java/lang/Exception
    //   1622	1630	3838	java/lang/Exception
    //   1646	1667	3838	java/lang/Exception
    //   1730	1735	3838	java/lang/Exception
    //   1758	1769	3838	java/lang/Exception
    //   1785	1790	3838	java/lang/Exception
    //   1806	1811	3838	java/lang/Exception
    //   1827	1850	3838	java/lang/Exception
    //   1866	1871	3838	java/lang/Exception
    //   1887	1892	3838	java/lang/Exception
    //   1908	1934	3838	java/lang/Exception
    //   2107	2114	3838	java/lang/Exception
    //   2134	2144	3838	java/lang/Exception
    //   2160	2172	3838	java/lang/Exception
    //   2188	2202	3838	java/lang/Exception
    //   2218	2232	3838	java/lang/Exception
    //   2256	2264	3838	java/lang/Exception
    //   2280	2289	3838	java/lang/Exception
    //   2305	2330	3838	java/lang/Exception
    //   2346	2351	3838	java/lang/Exception
    //   2367	2372	3838	java/lang/Exception
    //   2388	2393	3838	java/lang/Exception
    //   2409	2437	3838	java/lang/Exception
    //   2453	2461	3838	java/lang/Exception
    //   2477	2483	3838	java/lang/Exception
    //   2499	2508	3838	java/lang/Exception
    //   2532	2549	3838	java/lang/Exception
    //   2565	2577	3838	java/lang/Exception
    //   2593	2602	3838	java/lang/Exception
    //   2618	2623	3838	java/lang/Exception
    //   2639	2644	3838	java/lang/Exception
    //   2660	2691	3838	java/lang/Exception
    //   2707	2712	3838	java/lang/Exception
    //   2728	2733	3838	java/lang/Exception
    //   2749	2775	3838	java/lang/Exception
    //   2903	2919	3838	java/lang/Exception
    //   2943	2953	3838	java/lang/Exception
    //   2969	2981	3838	java/lang/Exception
    //   2997	3002	3838	java/lang/Exception
    //   3018	3023	3838	java/lang/Exception
    //   3039	3044	3838	java/lang/Exception
    //   3060	3085	3838	java/lang/Exception
    //   3101	3106	3838	java/lang/Exception
    //   3122	3127	3838	java/lang/Exception
    //   3143	3148	3838	java/lang/Exception
    //   3164	3195	3838	java/lang/Exception
    //   3211	3219	3838	java/lang/Exception
    //   3235	3245	3838	java/lang/Exception
    //   3317	3322	3838	java/lang/Exception
    //   3345	3368	3838	java/lang/Exception
    //   3384	3390	3838	java/lang/Exception
    //   3406	3413	3838	java/lang/Exception
    //   3429	3435	3838	java/lang/Exception
    //   3451	3459	3838	java/lang/Exception
    //   3475	3482	3838	java/lang/Exception
    //   3498	3504	3838	java/lang/Exception
    //   3520	3528	3838	java/lang/Exception
    //   3544	3550	3838	java/lang/Exception
    //   3566	3572	3838	java/lang/Exception
    //   3588	3598	3838	java/lang/Exception
    //   3614	3620	3838	java/lang/Exception
    //   3636	3660	3838	java/lang/Exception
    //   3681	3704	3838	java/lang/Exception
    //   3720	3726	3838	java/lang/Exception
    //   3742	3751	3838	java/lang/Exception
    //   3767	3777	3838	java/lang/Exception
    //   3793	3798	3838	java/lang/Exception
    //   3814	3835	3838	java/lang/Exception
    //   3861	3889	3838	java/lang/Exception
    //   3932	3952	3838	java/lang/Exception
    //   150	160	3955	finally
    //   176	188	3955	finally
    //   204	218	3955	finally
    //   234	248	3955	finally
    //   268	276	3955	finally
    //   292	301	3955	finally
    //   317	342	3955	finally
    //   358	363	3955	finally
    //   379	384	3955	finally
    //   400	405	3955	finally
    //   421	449	3955	finally
    //   465	473	3955	finally
    //   489	495	3955	finally
    //   511	520	3955	finally
    //   540	551	3955	finally
    //   567	578	3955	finally
    //   598	609	3955	finally
    //   625	642	3955	finally
    //   658	663	3955	finally
    //   679	684	3955	finally
    //   700	726	3955	finally
    //   962	967	3955	finally
    //   983	988	3955	finally
    //   1004	1029	3955	finally
    //   1045	1070	3955	finally
    //   1086	1091	3955	finally
    //   1107	1112	3955	finally
    //   1128	1133	3955	finally
    //   1149	1174	3955	finally
    //   1190	1195	3955	finally
    //   1211	1216	3955	finally
    //   1232	1237	3955	finally
    //   1253	1278	3955	finally
    //   1294	1308	3955	finally
    //   1324	1329	3955	finally
    //   1345	1368	3955	finally
    //   1393	1398	3955	finally
    //   1414	1419	3955	finally
    //   1435	1441	3955	finally
    //   1457	1464	3955	finally
    //   1480	1487	3955	finally
    //   1503	1514	3955	finally
    //   1530	1537	3955	finally
    //   1553	1559	3955	finally
    //   1575	1582	3955	finally
    //   1598	1606	3955	finally
    //   1622	1630	3955	finally
    //   1646	1667	3955	finally
    //   1730	1735	3955	finally
    //   1758	1769	3955	finally
    //   1785	1790	3955	finally
    //   1806	1811	3955	finally
    //   1827	1850	3955	finally
    //   1866	1871	3955	finally
    //   1887	1892	3955	finally
    //   1908	1934	3955	finally
    //   2107	2114	3955	finally
    //   2134	2144	3955	finally
    //   2160	2172	3955	finally
    //   2188	2202	3955	finally
    //   2218	2232	3955	finally
    //   2256	2264	3955	finally
    //   2280	2289	3955	finally
    //   2305	2330	3955	finally
    //   2346	2351	3955	finally
    //   2367	2372	3955	finally
    //   2388	2393	3955	finally
    //   2409	2437	3955	finally
    //   2453	2461	3955	finally
    //   2477	2483	3955	finally
    //   2499	2508	3955	finally
    //   2532	2549	3955	finally
    //   2565	2577	3955	finally
    //   2593	2602	3955	finally
    //   2618	2623	3955	finally
    //   2639	2644	3955	finally
    //   2660	2691	3955	finally
    //   2707	2712	3955	finally
    //   2728	2733	3955	finally
    //   2749	2775	3955	finally
    //   2903	2919	3955	finally
    //   2943	2953	3955	finally
    //   2969	2981	3955	finally
    //   2997	3002	3955	finally
    //   3018	3023	3955	finally
    //   3039	3044	3955	finally
    //   3060	3085	3955	finally
    //   3101	3106	3955	finally
    //   3122	3127	3955	finally
    //   3143	3148	3955	finally
    //   3164	3195	3955	finally
    //   3211	3219	3955	finally
    //   3235	3245	3955	finally
    //   3317	3322	3955	finally
    //   3345	3368	3955	finally
    //   3384	3390	3955	finally
    //   3406	3413	3955	finally
    //   3429	3435	3955	finally
    //   3451	3459	3955	finally
    //   3475	3482	3955	finally
    //   3498	3504	3955	finally
    //   3520	3528	3955	finally
    //   3544	3550	3955	finally
    //   3566	3572	3955	finally
    //   3588	3598	3955	finally
    //   3614	3620	3955	finally
    //   3636	3660	3955	finally
    //   3681	3704	3955	finally
    //   3720	3726	3955	finally
    //   3742	3751	3955	finally
    //   3767	3777	3955	finally
    //   3793	3798	3955	finally
    //   3814	3835	3955	finally
    //   3861	3889	3955	finally
    //   3932	3952	3955	finally
    //   89	101	3966	finally
    //   113	120	3976	finally
    //   827	831	3976	finally
    //   842	849	3976	finally
    //   860	876	3976	finally
    //   1696	1701	3987	finally
    //   3282	3287	3987	finally
    //   89	101	3998	java/lang/Exception
    //   113	120	4008	java/lang/Exception
    //   1696	1701	4015	java/lang/Exception
    //   3282	3287	4015	java/lang/Exception
  }

  public static int aF(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53004);
    int i = com.tencent.mm.plugin.emoji.h.b.aF(paramArrayOfByte);
    AppMethodBeat.o(53004);
    return i;
  }

  public static String b(Context paramContext, WXMediaMessage paramWXMediaMessage, String paramString)
  {
    AppMethodBeat.i(53006);
    if (paramWXMediaMessage.getType() != 8)
    {
      AppMethodBeat.o(53006);
      paramContext = null;
    }
    while (true)
    {
      return paramContext;
      Object localObject = (WXEmojiObject)paramWXMediaMessage.mediaObject;
      String str;
      if (!bo.cb(((WXEmojiObject)localObject).emojiData))
      {
        ab.d("MicroMsg.emoji.EmojiLogic", " fileData:" + ((WXEmojiObject)localObject).emojiData.length);
        str = com.tencent.mm.a.g.x(((WXEmojiObject)localObject).emojiData);
        a(paramContext, paramWXMediaMessage.thumbData, str, ((WXEmojiObject)localObject).emojiData, paramString);
        AppMethodBeat.o(53006);
        paramContext = str;
      }
      else if (!bo.isNullOrNil(((WXEmojiObject)localObject).emojiPath))
      {
        int i = (int)com.tencent.mm.vfs.e.asZ(((WXEmojiObject)localObject).emojiPath);
        if (i > 0)
        {
          localObject = com.tencent.mm.vfs.e.e(((WXEmojiObject)localObject).emojiPath, 0, i);
          str = com.tencent.mm.a.g.x((byte[])localObject);
          a(paramContext, paramWXMediaMessage.thumbData, str, (byte[])localObject, paramString);
          AppMethodBeat.o(53006);
          paramContext = str;
        }
        else
        {
          AppMethodBeat.o(53006);
          paramContext = null;
        }
      }
      else
      {
        AppMethodBeat.o(53006);
        paramContext = null;
      }
    }
  }

  public static aik bkd()
  {
    AppMethodBeat.i(53012);
    aik localaik = new aik();
    localaik.wov = 1;
    localaik.wox = 1;
    AppMethodBeat.o(53012);
    return localaik;
  }

  public static native boolean extractForeground(int[] paramArrayOfInt, int paramInt1, int paramInt2);

  private static String getMD5(String paramString1, String paramString2)
  {
    AppMethodBeat.i(53029);
    if ((bo.isNullOrNil(paramString1)) && (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.emoji.EmojiLogic", "[cpan] product id and url are null.");
      paramString1 = null;
      AppMethodBeat.o(53029);
      return paramString1;
    }
    if (bo.isNullOrNil(paramString2));
    for (paramString1 = com.tencent.mm.a.g.x(paramString1.getBytes()); ; paramString1 = com.tencent.mm.a.g.x(paramString2.getBytes()))
    {
      AppMethodBeat.o(53029);
      break;
    }
  }

  public static native boolean gifToMMAni(byte[] paramArrayOfByte, PByteArray paramPByteArray, int paramInt);

  public static EmojiInfo r(String paramString1, int paramInt, String paramString2)
  {
    Object localObject = null;
    int i = 0;
    AppMethodBeat.i(53010);
    if (TextUtils.isEmpty(paramString1))
    {
      ab.d("MicroMsg.emoji.EmojiLogic", "getIcon : productId is null.");
      AppMethodBeat.o(53010);
      paramString1 = localObject;
    }
    while (true)
    {
      return paramString1;
      EmojiInfo localEmojiInfo = new EmojiInfo();
      String str = K(com.tencent.mm.plugin.emoji.h.b.Yb(), paramString1, paramString2);
      int j = i;
      if (com.tencent.mm.vfs.e.ct(str))
      {
        com.tencent.mm.vfs.b localb = new com.tencent.mm.vfs.b(str);
        j = i;
        if (localb.exists())
        {
          if (localb.length() >= 1L)
            break label159;
          localb.delete();
        }
      }
      for (j = i; ; j = 1)
      {
        if (j != 0)
          break label181;
        ab.d("MicroMsg.emoji.EmojiLogic", "banner icon does not exist. icon path :" + str + "...., icon type:" + paramInt);
        AppMethodBeat.o(53010);
        paramString1 = localObject;
        break;
        label159: localEmojiInfo.field_type = com.tencent.mm.plugin.emoji.h.b.aF(com.tencent.mm.vfs.e.e(str, 0, 10));
      }
      label181: localEmojiInfo.field_md5 = getMD5(paramString1, paramString2);
      localEmojiInfo.field_catalog = ud(paramInt);
      localEmojiInfo.field_groupId = paramString1;
      localEmojiInfo.field_temp = 1;
      AppMethodBeat.o(53010);
      paramString1 = localEmojiInfo;
    }
  }

  public static String r(int paramInt, String paramString1, String paramString2)
  {
    AppMethodBeat.i(53014);
    if (paramInt != 0)
    {
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("<xml>");
      localStringBuilder.append("<designeruin>" + paramInt + "</designeruin>");
      localStringBuilder.append("<designername>" + paramString1 + "</designername>");
      localStringBuilder.append("<designerrediretcturl>" + paramString2 + "</designerrediretcturl>");
      localStringBuilder.append("</xml>");
      paramString1 = localStringBuilder.toString();
      ab.i("MicroMsg.emoji.EmojiLogic", "sns object data:%s", new Object[] { paramString1 });
      AppMethodBeat.o(53014);
    }
    while (true)
    {
      return paramString1;
      paramString1 = null;
      AppMethodBeat.o(53014);
    }
  }

  private static int ud(int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = EmojiInfo.yah;
    case 2:
    case 4:
    case 8:
    }
    while (true)
    {
      return paramInt;
      paramInt = 82;
      continue;
      paramInt = 83;
      continue;
      paramInt = 84;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.model.EmojiLogic
 * JD-Core Version:    0.6.2
 */