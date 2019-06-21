package android.support.v4.a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.support.v4.content.a.a.b;
import android.support.v4.content.a.a.c;
import android.support.v4.d.b.b;
import java.io.File;
import java.io.InputStream;

class h
  implements d.a
{
  protected static Typeface a(Context paramContext, InputStream paramInputStream)
  {
    Object localObject = null;
    File localFile = i.T(paramContext);
    if (localFile == null)
      paramContext = localObject;
    while (true)
    {
      return paramContext;
      try
      {
        boolean bool = i.a(localFile, paramInputStream);
        if (!bool)
        {
          localFile.delete();
          paramContext = localObject;
        }
        else
        {
          paramContext = Typeface.createFromFile(localFile.getPath());
          localFile.delete();
        }
      }
      catch (RuntimeException paramContext)
      {
        localFile.delete();
        paramContext = localObject;
      }
      finally
      {
        localFile.delete();
      }
    }
    throw paramContext;
  }

  private static <T> T a(T[] paramArrayOfT, int paramInt, a<T> parama)
  {
    int i;
    int j;
    label19: Object localObject;
    int k;
    label32: T ?;
    int n;
    if ((paramInt & 0x1) == 0)
    {
      i = 400;
      if ((paramInt & 0x2) == 0)
        break label124;
      j = 1;
      localObject = null;
      k = 2147483647;
      int m = paramArrayOfT.length;
      paramInt = 0;
      if (paramInt >= m)
        break label136;
      ? = paramArrayOfT[paramInt];
      n = Math.abs(parama.u(?) - i);
      if (parama.t(?) != j)
        break label130;
    }
    label130: for (int i1 = 0; ; i1 = 1)
    {
      n = i1 + n * 2;
      if (localObject != null)
      {
        i1 = k;
        if (k <= n);
      }
      else
      {
        i1 = n;
        localObject = ?;
      }
      paramInt++;
      k = i1;
      break label32;
      i = 700;
      break;
      label124: j = 0;
      break label19;
    }
    label136: return localObject;
  }

  public Typeface a(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    paramString = null;
    File localFile = i.T(paramContext);
    if (localFile == null)
      paramContext = paramString;
    while (true)
    {
      return paramContext;
      try
      {
        boolean bool = i.a(localFile, paramResources, paramInt1);
        if (!bool)
        {
          localFile.delete();
          paramContext = paramString;
        }
        else
        {
          paramContext = Typeface.createFromFile(localFile.getPath());
          localFile.delete();
        }
      }
      catch (RuntimeException paramContext)
      {
        localFile.delete();
        paramContext = paramString;
      }
      finally
      {
        localFile.delete();
      }
    }
    throw paramContext;
  }

  public Typeface a(Context paramContext, a.b paramb, Resources paramResources, int paramInt)
  {
    paramb = (a.c)a(paramb.GN, paramInt, new a()
    {
    });
    if (paramb == null);
    for (paramContext = null; ; paramContext = d.a(paramContext, paramResources, paramb.GQ, paramb.mFileName, paramInt))
      return paramContext;
  }

  // ERROR //
  public Typeface a(Context paramContext, b.b[] paramArrayOfb, int paramInt)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 4
    //   3: aload_2
    //   4: arraylength
    //   5: ifgt +8 -> 13
    //   8: aload 4
    //   10: astore_1
    //   11: aload_1
    //   12: areturn
    //   13: aload_0
    //   14: aload_2
    //   15: iload_3
    //   16: invokevirtual 100	android/support/v4/a/h:a	([Landroid/support/v4/d/b$b;I)Landroid/support/v4/d/b$b;
    //   19: astore_2
    //   20: aload_1
    //   21: invokevirtual 106	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   24: aload_2
    //   25: getfield 112	android/support/v4/d/b$b:mUri	Landroid/net/Uri;
    //   28: invokevirtual 118	android/content/ContentResolver:openInputStream	(Landroid/net/Uri;)Ljava/io/InputStream;
    //   31: astore_2
    //   32: aload_1
    //   33: aload_2
    //   34: invokestatic 120	android/support/v4/a/h:a	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   37: astore_1
    //   38: aload_2
    //   39: invokestatic 124	android/support/v4/a/i:closeQuietly	(Ljava/io/Closeable;)V
    //   42: goto -31 -> 11
    //   45: astore_1
    //   46: aconst_null
    //   47: astore_2
    //   48: aload_2
    //   49: invokestatic 124	android/support/v4/a/i:closeQuietly	(Ljava/io/Closeable;)V
    //   52: aload 4
    //   54: astore_1
    //   55: goto -44 -> 11
    //   58: astore_2
    //   59: aconst_null
    //   60: astore_1
    //   61: aload_1
    //   62: invokestatic 124	android/support/v4/a/i:closeQuietly	(Ljava/io/Closeable;)V
    //   65: aload_2
    //   66: athrow
    //   67: astore 4
    //   69: aload_2
    //   70: astore_1
    //   71: aload 4
    //   73: astore_2
    //   74: goto -13 -> 61
    //   77: astore_1
    //   78: goto -30 -> 48
    //
    // Exception table:
    //   from	to	target	type
    //   20	32	45	java/io/IOException
    //   20	32	58	finally
    //   32	38	67	finally
    //   32	38	77	java/io/IOException
  }

  protected final b.b a(b.b[] paramArrayOfb, int paramInt)
  {
    return (b.b)a(paramArrayOfb, paramInt, new a()
    {
    });
  }

  static abstract interface a<T>
  {
    public abstract boolean t(T paramT);

    public abstract int u(T paramT);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.a.h
 * JD-Core Version:    0.6.2
 */