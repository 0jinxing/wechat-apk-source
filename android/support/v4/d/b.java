package android.support.v4.d;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.support.v4.a.d;
import android.support.v4.a.i;
import android.support.v4.f.g;
import android.support.v4.f.l;
import android.support.v4.f.m;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public final class b
{
  private static final g<String, Typeface> Hf = new g(16);
  private static final c Kk = new c("fonts");
  private static final m<String, ArrayList<c.a<c>>> Kl = new m();
  private static final Comparator<byte[]> Km = new Comparator()
  {
  };
  private static final Object sLock = new Object();

  public static Typeface a(Context paramContext, final a parama, android.support.v4.content.a.b.a arg2, boolean paramBoolean, int paramInt1, final int paramInt2)
  {
    Object localObject1 = null;
    final String str = parama.Kj + "-" + paramInt2;
    Object localObject2 = (Typeface)Hf.get(str);
    if (localObject2 != null)
    {
      if (??? != null)
        ???.b((Typeface)localObject2);
      paramContext = (Context)localObject2;
    }
    while (true)
    {
      return paramContext;
      if ((paramBoolean) && (paramInt1 == -1))
      {
        paramContext = a(paramContext, parama, paramInt2);
        if (??? != null)
        {
          if (paramContext.Kt != 0)
            break label111;
          ???.a(paramContext.tj, null);
        }
        while (true)
        {
          paramContext = paramContext.tj;
          break;
          label111: ???.a(paramContext.Kt, null);
        }
      }
      parama = new Callable()
      {
      };
      if (paramBoolean);
      try
      {
        paramContext = ((c)Kk.a(parama, paramInt1)).tj;
        continue;
        if (??? == null);
        for (paramContext = null; ; paramContext = new c.a()
        {
        })
          synchronized (sLock)
          {
            if (!Kl.containsKey(str))
              break;
            if (paramContext != null)
              ((ArrayList)Kl.get(str)).add(paramContext);
            paramContext = localObject1;
          }
        if (paramContext != null)
        {
          localObject2 = new java/util/ArrayList;
          ((ArrayList)localObject2).<init>();
          ((ArrayList)localObject2).add(paramContext);
          Kl.put(str, localObject2);
        }
        paramContext = Kk;
        ??? = new c.a()
        {
        };
        paramContext.f(new c.2(paramContext, parama, new Handler(), ???));
        paramContext = localObject1;
      }
      catch (InterruptedException paramContext)
      {
        paramContext = localObject1;
      }
    }
  }

  private static c a(Context paramContext, a parama, int paramInt)
  {
    int i = -3;
    Object localObject1;
    Object localObject2;
    Object localObject3;
    Object localObject4;
    try
    {
      localObject1 = paramContext.getPackageManager();
      localObject2 = paramContext.getResources();
      localObject3 = parama.Ke;
      localObject4 = ((PackageManager)localObject1).resolveContentProvider((String)localObject3, 0);
      if (localObject4 == null)
      {
        paramContext = new android/content/pm/PackageManager$NameNotFoundException;
        paramContext.<init>("No package found for authority: ".concat(String.valueOf(localObject3)));
        throw paramContext;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext = new c(null, -1);
    }
    while (true)
    {
      return paramContext;
      if (!((ProviderInfo)localObject4).packageName.equals(parama.Kf))
      {
        paramContext = new android/content/pm/PackageManager$NameNotFoundException;
        localObject4 = new java/lang/StringBuilder;
        ((StringBuilder)localObject4).<init>("Found content provider ");
        paramContext.<init>((String)localObject3 + ", but package was not " + parama.Kf);
        throw paramContext;
      }
      localObject1 = a(((PackageManager)localObject1).getPackageInfo(((ProviderInfo)localObject4).packageName, 64).signatures);
      Collections.sort((List)localObject1, Km);
      label169: int j;
      if (parama.Kh != null)
      {
        localObject3 = parama.Kh;
        j = 0;
        label172: if (j >= ((List)localObject3).size())
          break label299;
        localObject2 = new java/util/ArrayList;
        ((ArrayList)localObject2).<init>((Collection)((List)localObject3).get(j));
        Collections.sort((List)localObject2, Km);
        if (!b((List)localObject1, (List)localObject2))
          break label293;
        localObject3 = localObject4;
        label228: if (localObject3 != null)
          break label305;
        parama = new a(1, null);
        label243: if (parama.mStatusCode != 0)
          break label333;
        paramContext = d.a(paramContext, parama.Kr, paramInt);
        if (paramContext == null)
          break label327;
      }
      label293: label299: label305: label327: for (paramInt = 0; ; paramInt = -3)
      {
        paramContext = new c(paramContext, paramInt);
        break;
        localObject3 = android.support.v4.content.a.a.a((Resources)localObject2, parama.Ki);
        break label169;
        j++;
        break label172;
        localObject3 = null;
        break label228;
        parama = new a(0, a(paramContext, parama, ((ProviderInfo)localObject3).authority));
        break label243;
      }
      label333: paramInt = i;
      if (parama.mStatusCode == 1)
        paramInt = -2;
      paramContext = new c(null, paramInt);
    }
  }

  private static List<byte[]> a(Signature[] paramArrayOfSignature)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfSignature.length; i++)
      localArrayList.add(paramArrayOfSignature[i].toByteArray());
    return localArrayList;
  }

  public static Map<Uri, ByteBuffer> a(Context paramContext, b[] paramArrayOfb)
  {
    HashMap localHashMap = new HashMap();
    int i = paramArrayOfb.length;
    for (int j = 0; j < i; j++)
    {
      Object localObject = paramArrayOfb[j];
      if (((b)localObject).Kc == 0)
      {
        localObject = ((b)localObject).mUri;
        if (!localHashMap.containsKey(localObject))
          localHashMap.put(localObject, i.b(paramContext, (Uri)localObject));
      }
    }
    return Collections.unmodifiableMap(localHashMap);
  }

  private static b[] a(Context paramContext, a parama, String paramString)
  {
    Object localObject = new ArrayList();
    Uri localUri1 = new Uri.Builder().scheme("content").authority(paramString).build();
    Uri localUri2 = new Uri.Builder().scheme("content").authority(paramString).appendPath("file").build();
    try
    {
      if (Build.VERSION.SDK_INT > 16)
      {
        paramContext = paramContext.getContentResolver();
        parama = parama.Kg;
        paramContext = paramContext.query(localUri1, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { parama }, null, null);
        if (paramContext == null);
      }
      else
      {
        while (true)
        {
          int k;
          try
          {
            if (paramContext.getCount() <= 0)
              break label493;
            int i = paramContext.getColumnIndex("result_code");
            paramString = new java/util/ArrayList;
            paramString.<init>();
            int j = paramContext.getColumnIndex("_id");
            k = paramContext.getColumnIndex("file_id");
            int m = paramContext.getColumnIndex("font_ttc_index");
            int n = paramContext.getColumnIndex("font_weight");
            int i1 = paramContext.getColumnIndex("font_italic");
            parama = paramString;
            if (!paramContext.moveToNext())
              break label495;
            if (i == -1)
              break label450;
            i2 = paramContext.getInt(i);
            if (m == -1)
              break label456;
            i3 = paramContext.getInt(m);
            if (k != -1)
              break label462;
            parama = ContentUris.withAppendedId(localUri1, paramContext.getLong(j));
            if (n == -1)
              break label479;
            i4 = paramContext.getInt(n);
            if ((i1 == -1) || (paramContext.getInt(i1) != 1))
              break label487;
            bool = true;
            localObject = new android/support/v4/d/b$b;
            ((b)localObject).<init>(parama, i3, i4, bool, i2);
            paramString.add(localObject);
            continue;
          }
          finally
          {
          }
          if (paramContext != null)
            paramContext.close();
          throw parama;
          paramContext = paramContext.getContentResolver();
          parama = parama.Kg;
          paramContext = paramContext.query(localUri1, new String[] { "_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code" }, "query = ?", new String[] { parama }, null);
          break;
          label450: int i2 = 0;
          continue;
          label456: int i3 = 0;
          continue;
          label462: parama = ContentUris.withAppendedId(localUri2, paramContext.getLong(k));
          continue;
          label479: int i4 = 400;
          continue;
          label487: boolean bool = false;
        }
      }
      label493: parama = (a)localObject;
      label495: if (paramContext != null)
        paramContext.close();
      return (b[])parama.toArray(new b[0]);
    }
    finally
    {
      while (true)
        paramContext = null;
    }
  }

  private static boolean b(List<byte[]> paramList1, List<byte[]> paramList2)
  {
    boolean bool1 = false;
    boolean bool2;
    if (paramList1.size() != paramList2.size())
      bool2 = bool1;
    while (true)
    {
      return bool2;
      for (int i = 0; ; i++)
      {
        if (i >= paramList1.size())
          break label71;
        bool2 = bool1;
        if (!Arrays.equals((byte[])paramList1.get(i), (byte[])paramList2.get(i)))
          break;
      }
      label71: bool2 = true;
    }
  }

  public static final class a
  {
    final b.b[] Kr;
    final int mStatusCode;

    public a(int paramInt, b.b[] paramArrayOfb)
    {
      this.mStatusCode = paramInt;
      this.Kr = paramArrayOfb;
    }
  }

  public static final class b
  {
    public final int GO;
    public final boolean GP;
    final int Kc;
    public final int Ks;
    public final Uri mUri;

    public b(Uri paramUri, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3)
    {
      this.mUri = ((Uri)l.checkNotNull(paramUri));
      this.Ks = paramInt1;
      this.GO = paramInt2;
      this.GP = paramBoolean;
      this.Kc = paramInt3;
    }
  }

  static final class c
  {
    final int Kt;
    final Typeface tj;

    c(Typeface paramTypeface, int paramInt)
    {
      this.tj = paramTypeface;
      this.Kt = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     android.support.v4.d.b
 * JD-Core Version:    0.6.2
 */