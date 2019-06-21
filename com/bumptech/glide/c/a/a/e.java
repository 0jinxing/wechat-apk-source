package com.bumptech.glide.c.a.a;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.c.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

final class e
{
  private static final a azE;
  private final a azF;
  private final d azG;
  private final List<f> azH;
  private final b azx;
  private final ContentResolver azy;

  static
  {
    AppMethodBeat.i(91744);
    azE = new a();
    AppMethodBeat.o(91744);
  }

  private e(List<f> paramList, a parama, d paramd, b paramb, ContentResolver paramContentResolver)
  {
    this.azF = parama;
    this.azG = paramd;
    this.azx = paramb;
    this.azy = paramContentResolver;
    this.azH = paramList;
  }

  e(List<f> paramList, d paramd, b paramb, ContentResolver paramContentResolver)
  {
    this(paramList, azE, paramd, paramb, paramContentResolver);
  }

  private String k(Uri paramUri)
  {
    AppMethodBeat.i(91743);
    Cursor localCursor = this.azG.h(paramUri);
    if (localCursor != null);
    try
    {
      if (localCursor.moveToFirst())
      {
        paramUri = localCursor.getString(0);
        return paramUri;
      }
      if (localCursor != null)
        localCursor.close();
      paramUri = null;
      AppMethodBeat.o(91743);
    }
    finally
    {
      if (localCursor != null)
        localCursor.close();
      AppMethodBeat.o(91743);
    }
  }

  // ERROR //
  final int i(Uri paramUri)
  {
    // Byte code:
    //   0: ldc 82
    //   2: invokestatic 25	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aconst_null
    //   6: astore_2
    //   7: aload_0
    //   8: getfield 46	com/bumptech/glide/c/a/a/e:azy	Landroid/content/ContentResolver;
    //   11: aload_1
    //   12: invokevirtual 88	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   15: astore_3
    //   16: aload_3
    //   17: astore_2
    //   18: aload_2
    //   19: astore_3
    //   20: aload_0
    //   21: getfield 48	com/bumptech/glide/c/a/a/e:azH	Ljava/util/List;
    //   24: aload_2
    //   25: aload_0
    //   26: getfield 44	com/bumptech/glide/c/a/a/e:azx	Lcom/bumptech/glide/c/b/a/b;
    //   29: invokestatic 94	com/bumptech/glide/c/g:b	(Ljava/util/List;Ljava/io/InputStream;Lcom/bumptech/glide/c/b/a/b;)I
    //   32: istore 4
    //   34: aload_2
    //   35: ifnull +7 -> 42
    //   38: aload_2
    //   39: invokevirtual 97	java/io/InputStream:close	()V
    //   42: ldc 82
    //   44: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   47: iload 4
    //   49: ireturn
    //   50: astore_3
    //   51: aload_2
    //   52: astore_3
    //   53: ldc 99
    //   55: iconst_3
    //   56: invokestatic 105	android/util/Log:isLoggable	(Ljava/lang/String;I)Z
    //   59: ifeq +28 -> 87
    //   62: aload_2
    //   63: astore_3
    //   64: new 107	java/lang/StringBuilder
    //   67: astore 5
    //   69: aload_2
    //   70: astore_3
    //   71: aload 5
    //   73: ldc 109
    //   75: invokespecial 112	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   78: aload_2
    //   79: astore_3
    //   80: aload 5
    //   82: aload_1
    //   83: invokevirtual 116	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   86: pop
    //   87: aload_2
    //   88: ifnull +7 -> 95
    //   91: aload_2
    //   92: invokevirtual 97	java/io/InputStream:close	()V
    //   95: iconst_m1
    //   96: istore 4
    //   98: ldc 82
    //   100: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   103: goto -56 -> 47
    //   106: astore_1
    //   107: aconst_null
    //   108: astore_2
    //   109: aload_2
    //   110: ifnull +7 -> 117
    //   113: aload_2
    //   114: invokevirtual 97	java/io/InputStream:close	()V
    //   117: ldc 82
    //   119: invokestatic 35	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   122: aload_1
    //   123: athrow
    //   124: astore_1
    //   125: goto -83 -> 42
    //   128: astore_1
    //   129: goto -34 -> 95
    //   132: astore_2
    //   133: goto -16 -> 117
    //   136: astore_1
    //   137: aload_3
    //   138: astore_2
    //   139: goto -30 -> 109
    //   142: astore_2
    //   143: aconst_null
    //   144: astore_2
    //   145: goto -94 -> 51
    //   148: astore_3
    //   149: goto -98 -> 51
    //   152: astore_3
    //   153: goto -102 -> 51
    //
    // Exception table:
    //   from	to	target	type
    //   7	16	50	java/io/IOException
    //   7	16	106	finally
    //   38	42	124	java/io/IOException
    //   91	95	128	java/io/IOException
    //   113	117	132	java/io/IOException
    //   20	34	136	finally
    //   53	62	136	finally
    //   64	69	136	finally
    //   71	78	136	finally
    //   80	87	136	finally
    //   7	16	142	java/lang/NullPointerException
    //   20	34	148	java/lang/NullPointerException
    //   20	34	152	java/io/IOException
  }

  public final InputStream j(Uri paramUri)
  {
    InputStream localInputStream = null;
    AppMethodBeat.i(91742);
    Object localObject = k(paramUri);
    if (TextUtils.isEmpty((CharSequence)localObject))
    {
      AppMethodBeat.o(91742);
      paramUri = localInputStream;
    }
    while (true)
    {
      return paramUri;
      localObject = new File((String)localObject);
      if ((((File)localObject).exists()) && (0L < ((File)localObject).length()));
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label78;
        AppMethodBeat.o(91742);
        paramUri = localInputStream;
        break;
      }
      label78: localObject = Uri.fromFile((File)localObject);
      try
      {
        localInputStream = this.azy.openInputStream((Uri)localObject);
        paramUri = localInputStream;
        AppMethodBeat.o(91742);
      }
      catch (NullPointerException localNullPointerException)
      {
        paramUri = (FileNotFoundException)new FileNotFoundException("NPE opening uri: " + paramUri + " -> " + localObject).initCause(localNullPointerException);
        AppMethodBeat.o(91742);
      }
    }
    throw paramUri;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.a.e
 * JD-Core Version:    0.6.2
 */