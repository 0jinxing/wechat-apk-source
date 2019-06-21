package com.tencent.mm.vfs;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

final class AssetsFileSystem extends AbstractFileSystem
{
  public static final Parcelable.Creator<AssetsFileSystem> CREATOR = null;
  private AssetManager zYA;

  AssetsFileSystem(Context paramContext)
  {
    AppMethodBeat.i(54474);
    this.zYA = paramContext.getAssets();
    AppMethodBeat.o(54474);
  }

  private void b(String paramString1, String paramString2, ArrayList<FileSystem.a> paramArrayList)
  {
    AppMethodBeat.i(54480);
    if ((paramString2 != null) && (!paramString2.isEmpty()))
      paramString1 = paramString1 + '/' + paramString2;
    while (true)
    {
      String[] arrayOfString = this.zYA.list(paramString1);
      if ((arrayOfString == null) || (arrayOfString.length == 0))
      {
        if (paramString2 == null)
          break label158;
        paramArrayList.add(new FileSystem.a(this, paramString1, paramString2, 0L, 0L, 0L, false));
        AppMethodBeat.o(54480);
      }
      while (true)
      {
        return;
        if (paramString2 != null)
          paramArrayList.add(new FileSystem.a(this, paramString1, paramString2, 0L, 0L, 0L, true));
        int i = arrayOfString.length;
        for (int j = 0; j < i; j++)
        {
          paramString2 = arrayOfString[j];
          if ((paramString2 != null) && (!paramString2.isEmpty()))
            b(paramString1, paramString2, paramArrayList);
        }
        label158: AppMethodBeat.o(54480);
      }
    }
  }

  public final OutputStream L(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54477);
    paramString = new IOException("Cannot open files for writing on read-only file systems");
    AppMethodBeat.o(54477);
    throw paramString;
  }

  public final List<FileSystem.a> M(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(54481);
    String str1 = paramString;
    if (paramString.endsWith("/"))
      str1 = paramString.substring(0, paramString.length() - 1);
    if (paramBoolean);
    try
    {
      paramString = new java/util/ArrayList;
      paramString.<init>();
      b(str1, null, paramString);
      AppMethodBeat.o(54481);
      while (true)
      {
        return paramString;
        String[] arrayOfString1 = this.zYA.list(str1);
        if (arrayOfString1 == null)
        {
          paramString = null;
          AppMethodBeat.o(54481);
        }
        else
        {
          paramString = new java/lang/StringBuilder;
          paramString.<init>();
          str1 = str1 + '/';
          paramString = new java/util/ArrayList;
          paramString.<init>(arrayOfString1.length);
          int i = arrayOfString1.length;
          int j = 0;
          if (j < i)
          {
            String str2 = arrayOfString1[j];
            Object localObject = new java/lang/StringBuilder;
            ((StringBuilder)localObject).<init>();
            String str3 = str1 + str2;
            String[] arrayOfString2 = this.zYA.list(str3);
            localObject = new com/tencent/mm/vfs/FileSystem$a;
            if ((arrayOfString2 != null) && (arrayOfString2.length > 0));
            for (paramBoolean = true; ; paramBoolean = false)
            {
              ((FileSystem.a)localObject).<init>(this, str3, str2, 0L, 0L, 0L, paramBoolean);
              paramString.add(localObject);
              j++;
              break;
            }
          }
          AppMethodBeat.o(54481);
        }
      }
    }
    catch (IOException paramString)
    {
      while (true)
      {
        paramString = null;
        AppMethodBeat.o(54481);
      }
    }
  }

  public final boolean N(String paramString, boolean paramBoolean)
  {
    return false;
  }

  public final String O(String paramString, boolean paramBoolean)
  {
    return null;
  }

  public final boolean aS(String paramString1, String paramString2)
  {
    return false;
  }

  public final int aiR()
  {
    return 40;
  }

  public final int describeContents()
  {
    return 0;
  }

  public final boolean exists(String paramString)
  {
    AppMethodBeat.i(54478);
    try
    {
      openRead(paramString).close();
      bool = true;
      AppMethodBeat.o(54478);
      return bool;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        boolean bool = false;
        AppMethodBeat.o(54478);
      }
    }
  }

  public final InputStream openRead(String paramString)
  {
    AppMethodBeat.i(54476);
    paramString = this.zYA.open(paramString);
    AppMethodBeat.o(54476);
    return paramString;
  }

  public final boolean pI(String paramString)
  {
    return false;
  }

  public final boolean t(String paramString, long paramLong)
  {
    return false;
  }

  public final boolean tf(String paramString)
  {
    return false;
  }

  public final FileSystem.b tn(String paramString)
  {
    AppMethodBeat.i(54475);
    paramString = new FileSystem.b();
    AppMethodBeat.o(54475);
    return paramString;
  }

  public final FileSystem.a to(String paramString)
  {
    AppMethodBeat.i(54479);
    try
    {
      localObject = openRead(paramString);
      int i = ((InputStream)localObject).available();
      ((InputStream)localObject).close();
      j = paramString.lastIndexOf('/');
      if (j < 0)
      {
        localObject = paramString;
        paramString = new FileSystem.a(this, paramString, (String)localObject, i, 0L, 0L, false);
        AppMethodBeat.o(54479);
        return paramString;
      }
    }
    catch (IOException paramString)
    {
      while (true)
      {
        int j;
        paramString = null;
        AppMethodBeat.o(54479);
        continue;
        Object localObject = paramString.substring(j + 1);
      }
    }
  }

  public final String toString()
  {
    return "AssetsFS";
  }

  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    AppMethodBeat.i(54482);
    paramParcel = new UnsupportedOperationException();
    AppMethodBeat.o(54482);
    throw paramParcel;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.AssetsFileSystem
 * JD-Core Version:    0.6.2
 */