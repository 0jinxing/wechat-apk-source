package com.tencent.mm.vfs;

import android.net.Uri;
import android.net.Uri.Builder;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class b
  implements Comparable<b>
{
  public final Uri mUri;
  private FileSystemManager.d zZK;

  private b(Uri paramUri)
  {
    AppMethodBeat.i(54592);
    this.zZK = null;
    if (paramUri == null)
    {
      paramUri = new NullPointerException("uri == null");
      AppMethodBeat.o(54592);
      throw paramUri;
    }
    String str = paramUri.getPath();
    Uri localUri = paramUri;
    if (str != null)
    {
      str = j.k(str, false, false);
      localUri = paramUri;
      if (!paramUri.getPath().equals(str))
        localUri = paramUri.buildUpon().path(str).build();
    }
    this.mUri = localUri;
    AppMethodBeat.o(54592);
  }

  private b(Uri paramUri, String paramString)
  {
    AppMethodBeat.i(54597);
    this.zZK = null;
    if (paramString == null)
    {
      paramUri = new NullPointerException("name == null");
      AppMethodBeat.o(54597);
      throw paramUri;
    }
    Object localObject;
    if (paramUri == null)
    {
      paramUri = new Uri.Builder().path(paramString);
      paramString = paramUri.build();
      localObject = paramString.getPath();
      if (localObject == null)
        break label128;
      localObject = j.k((String)localObject, false, false);
      if (paramString.getPath().equals(localObject))
        break label128;
    }
    label128: for (paramUri = paramUri.path((String)localObject).build(); ; paramUri = paramString)
    {
      this.mUri = paramUri;
      AppMethodBeat.o(54597);
      return;
      localObject = paramUri.buildUpon();
      paramUri = (Uri)localObject;
      if (paramString.isEmpty())
        break;
      ((Uri.Builder)localObject).appendPath(paramString);
      paramUri = (Uri)localObject;
      break;
    }
  }

  public b(b paramb, String paramString)
  {
  }

  public b(File paramFile)
  {
    this(j.parseUri(paramFile.getPath()));
    AppMethodBeat.i(54593);
    AppMethodBeat.o(54593);
  }

  public b(File paramFile, String paramString)
  {
    this(j.parseUri(paramFile.getPath()), paramString);
    AppMethodBeat.i(54596);
    AppMethodBeat.o(54596);
  }

  public b(String paramString)
  {
    this(j.parseUri(paramString));
    AppMethodBeat.i(54591);
    AppMethodBeat.o(54591);
  }

  public b(String paramString1, String paramString2)
  {
    this(j.parseUri(paramString1), paramString2);
    AppMethodBeat.i(54594);
    AppMethodBeat.o(54594);
  }

  private Uri dMB()
  {
    AppMethodBeat.i(54600);
    Object localObject = this.mUri.getPath();
    int i = ((String)localObject).length();
    int j = ((String)localObject).lastIndexOf('/');
    if ((j == -1) || (((String)localObject).charAt(i - 1) == '/'))
    {
      localObject = null;
      AppMethodBeat.o(54600);
      return localObject;
    }
    if ((((String)localObject).indexOf('/') == j) && (((String)localObject).charAt(0) == '/'));
    for (localObject = ((String)localObject).substring(0, j + 1); ; localObject = ((String)localObject).substring(0, j))
    {
      localObject = this.mUri.buildUpon().path((String)localObject).build();
      AppMethodBeat.o(54600);
      break;
    }
  }

  public final b[] a(c paramc)
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(54615);
    Object localObject = dMA();
    if (!((FileSystemManager.d)localObject).valid())
    {
      AppMethodBeat.o(54615);
      paramc = localArrayList;
    }
    while (true)
    {
      return paramc;
      localObject = ((FileSystemManager.d)localObject).zZs.M(((FileSystemManager.d)localObject).path, false);
      if (localObject == null)
      {
        AppMethodBeat.o(54615);
        paramc = localArrayList;
      }
      else
      {
        localArrayList = new ArrayList();
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = new b(this, ((FileSystem.a)localIterator.next()).name);
          if (paramc.f((b)localObject))
            localArrayList.add(localObject);
        }
        paramc = (b[])localArrayList.toArray(new b[localArrayList.size()]);
        AppMethodBeat.o(54615);
      }
    }
  }

  public final String[] a(i parami)
  {
    ArrayList localArrayList = null;
    AppMethodBeat.i(54613);
    Object localObject = dMA();
    if (!((FileSystemManager.d)localObject).valid())
    {
      AppMethodBeat.o(54613);
      parami = localArrayList;
    }
    while (true)
    {
      return parami;
      localObject = ((FileSystemManager.d)localObject).zZs.M(((FileSystemManager.d)localObject).path, false);
      if (localObject == null)
      {
        AppMethodBeat.o(54613);
        parami = localArrayList;
      }
      else
      {
        localArrayList = new ArrayList();
        Iterator localIterator = ((List)localObject).iterator();
        while (localIterator.hasNext())
        {
          localObject = (FileSystem.a)localIterator.next();
          if (parami.ml(((FileSystem.a)localObject).name))
            localArrayList.add(((FileSystem.a)localObject).name);
        }
        parami = (String[])localArrayList.toArray(new String[localArrayList.size()]);
        AppMethodBeat.o(54613);
      }
    }
  }

  public final boolean canRead()
  {
    boolean bool = false;
    AppMethodBeat.i(54603);
    FileSystemManager.d locald = dMA();
    if (!locald.valid())
      AppMethodBeat.o(54603);
    while (true)
    {
      return bool;
      FileSystem localFileSystem = locald.zZs;
      String str = localFileSystem.O(locald.path, false);
      if (str != null)
      {
        bool = new File(str).canRead();
        AppMethodBeat.o(54603);
      }
      else
      {
        bool = localFileSystem.exists(locald.path);
        AppMethodBeat.o(54603);
      }
    }
  }

  public final boolean createNewFile()
  {
    boolean bool = true;
    AppMethodBeat.i(54617);
    Object localObject = dMA();
    if (!((FileSystemManager.d)localObject).valid())
    {
      localObject = new FileNotFoundException("Cannot resolve path or URI: " + this.mUri);
      AppMethodBeat.o(54617);
      throw ((Throwable)localObject);
    }
    if (((FileSystemManager.d)localObject).zZs.exists(((FileSystemManager.d)localObject).path))
    {
      bool = false;
      AppMethodBeat.o(54617);
    }
    while (true)
    {
      return bool;
      ((FileSystemManager.d)localObject).zZs.L(((FileSystemManager.d)localObject).path, true).close();
      AppMethodBeat.o(54617);
    }
  }

  public final FileSystemManager.d dMA()
  {
    AppMethodBeat.i(54590);
    this.zZK = FileSystemManager.dMv().a(this.mUri, this.zZK);
    FileSystemManager.d locald = this.zZK;
    AppMethodBeat.o(54590);
    return locald;
  }

  public final b dMC()
  {
    AppMethodBeat.i(54602);
    Object localObject = dMB();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(54602);
    }
    while (true)
    {
      return localObject;
      localObject = new b((Uri)localObject);
      AppMethodBeat.o(54602);
    }
  }

  public final Uri dMD()
  {
    int i = 0;
    AppMethodBeat.i(54605);
    Object localObject = this.mUri.getPath();
    int j;
    if (!this.mUri.isAbsolute())
    {
      j = i;
      if (((String)localObject).length() > 0)
      {
        j = i;
        if (((String)localObject).charAt(0) != '/');
      }
    }
    else
    {
      j = 1;
    }
    if (j != 0)
    {
      localObject = this.mUri;
      AppMethodBeat.o(54605);
      return localObject;
    }
    String str = this.mUri.getPath();
    localObject = System.getProperty("user.dir");
    if (str.isEmpty());
    while (true)
    {
      localObject = this.mUri.buildUpon().path((String)localObject).build();
      AppMethodBeat.o(54605);
      break;
      localObject = (String)localObject + '/' + str;
    }
  }

  public final b dME()
  {
    AppMethodBeat.i(54607);
    b localb = new b(dMD());
    AppMethodBeat.o(54607);
    return localb;
  }

  public final b[] dMF()
  {
    AppMethodBeat.i(54614);
    Object localObject1 = dMA();
    if (!((FileSystemManager.d)localObject1).valid())
    {
      AppMethodBeat.o(54614);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = ((FileSystemManager.d)localObject1).zZs.M(((FileSystemManager.d)localObject1).path, false);
      if (localObject2 == null)
      {
        AppMethodBeat.o(54614);
        localObject1 = null;
      }
      else
      {
        localObject1 = new b[((List)localObject2).size()];
        localObject2 = ((List)localObject2).iterator();
        for (int i = 0; ((Iterator)localObject2).hasNext(); i++)
          localObject1[i] = new b(this, ((FileSystem.a)((Iterator)localObject2).next()).name);
        AppMethodBeat.o(54614);
      }
    }
  }

  public final boolean delete()
  {
    AppMethodBeat.i(54619);
    FileSystemManager.d locald = dMA();
    boolean bool;
    if ((locald.valid()) && (locald.zZs.pI(locald.path)))
    {
      bool = true;
      AppMethodBeat.o(54619);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(54619);
    }
  }

  public final boolean equals(Object paramObject)
  {
    AppMethodBeat.i(54621);
    boolean bool;
    if (!(paramObject instanceof b))
    {
      bool = false;
      AppMethodBeat.o(54621);
    }
    while (true)
    {
      return bool;
      bool = this.mUri.equals(((b)paramObject).mUri);
      AppMethodBeat.o(54621);
    }
  }

  public final boolean exists()
  {
    AppMethodBeat.i(54604);
    FileSystemManager.d locald = dMA();
    boolean bool;
    if (!locald.valid())
    {
      bool = false;
      AppMethodBeat.o(54604);
    }
    while (true)
    {
      return bool;
      bool = locald.zZs.exists(locald.path);
      AppMethodBeat.o(54604);
    }
  }

  public final String getAbsolutePath()
  {
    AppMethodBeat.i(138358);
    String str = j.w(dMD());
    AppMethodBeat.o(138358);
    return str;
  }

  public final String getName()
  {
    AppMethodBeat.i(54599);
    String str = this.mUri.getPath();
    int i = str.lastIndexOf("/");
    if (i < 0)
      AppMethodBeat.o(54599);
    while (true)
    {
      return str;
      str = str.substring(i + 1, str.length());
      AppMethodBeat.o(54599);
    }
  }

  public final String getParent()
  {
    AppMethodBeat.i(54601);
    Object localObject = dMB();
    if (localObject == null)
    {
      localObject = null;
      AppMethodBeat.o(54601);
    }
    while (true)
    {
      return localObject;
      localObject = j.w((Uri)localObject);
      AppMethodBeat.o(54601);
    }
  }

  public final String getPath()
  {
    AppMethodBeat.i(138357);
    String str = j.w(this.mUri);
    AppMethodBeat.o(138357);
    return str;
  }

  public final int hashCode()
  {
    AppMethodBeat.i(54620);
    int i = j.w(this.mUri).hashCode();
    AppMethodBeat.o(54620);
    return i ^ 0x12D591;
  }

  public final boolean isDirectory()
  {
    boolean bool = false;
    AppMethodBeat.i(54608);
    Object localObject = dMA();
    if (!((FileSystemManager.d)localObject).valid())
      AppMethodBeat.o(54608);
    while (true)
    {
      return bool;
      localObject = ((FileSystemManager.d)localObject).zZs.to(((FileSystemManager.d)localObject).path);
      if ((localObject != null) && (((FileSystem.a)localObject).zYN))
      {
        bool = true;
        AppMethodBeat.o(54608);
      }
      else
      {
        AppMethodBeat.o(54608);
      }
    }
  }

  public final boolean isFile()
  {
    boolean bool = false;
    AppMethodBeat.i(54609);
    Object localObject = dMA();
    if (!((FileSystemManager.d)localObject).valid())
      AppMethodBeat.o(54609);
    while (true)
    {
      return bool;
      localObject = ((FileSystemManager.d)localObject).zZs.to(((FileSystemManager.d)localObject).path);
      if ((localObject != null) && (!((FileSystem.a)localObject).zYN))
      {
        bool = true;
        AppMethodBeat.o(54609);
      }
      else
      {
        AppMethodBeat.o(54609);
      }
    }
  }

  public final long lastModified()
  {
    long l = 0L;
    AppMethodBeat.i(54610);
    Object localObject = dMA();
    if (!((FileSystemManager.d)localObject).valid())
      AppMethodBeat.o(54610);
    while (true)
    {
      return l;
      localObject = ((FileSystemManager.d)localObject).zZs.to(((FileSystemManager.d)localObject).path);
      if (localObject == null)
      {
        AppMethodBeat.o(54610);
      }
      else
      {
        l = ((FileSystem.a)localObject).zYM;
        AppMethodBeat.o(54610);
      }
    }
  }

  public final long length()
  {
    long l = 0L;
    AppMethodBeat.i(54611);
    Object localObject = dMA();
    if (!((FileSystemManager.d)localObject).valid())
      AppMethodBeat.o(54611);
    while (true)
    {
      return l;
      localObject = ((FileSystemManager.d)localObject).zZs.to(((FileSystemManager.d)localObject).path);
      if (localObject == null)
      {
        AppMethodBeat.o(54611);
      }
      else
      {
        l = ((FileSystem.a)localObject).size;
        AppMethodBeat.o(54611);
      }
    }
  }

  public final String[] list()
  {
    AppMethodBeat.i(54612);
    Object localObject1 = dMA();
    if (!((FileSystemManager.d)localObject1).valid())
    {
      AppMethodBeat.o(54612);
      localObject1 = null;
    }
    while (true)
    {
      return localObject1;
      Object localObject2 = ((FileSystemManager.d)localObject1).zZs.M(((FileSystemManager.d)localObject1).path, false);
      if (localObject2 == null)
      {
        AppMethodBeat.o(54612);
        localObject1 = null;
      }
      else
      {
        localObject1 = new String[((List)localObject2).size()];
        localObject2 = ((List)localObject2).iterator();
        for (int i = 0; ((Iterator)localObject2).hasNext(); i++)
          localObject1[i] = ((FileSystem.a)((Iterator)localObject2).next()).name;
        AppMethodBeat.o(54612);
      }
    }
  }

  public final boolean mkdirs()
  {
    AppMethodBeat.i(54616);
    FileSystemManager.d locald = dMA();
    boolean bool;
    if (!locald.valid())
    {
      bool = false;
      AppMethodBeat.o(54616);
    }
    while (true)
    {
      return bool;
      bool = locald.zZs.tf(locald.path);
      AppMethodBeat.o(54616);
    }
  }

  public final boolean o(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(54618);
    FileSystemManager.d locald = dMA();
    paramb = paramb.dMA();
    if ((!locald.valid()) || (!paramb.valid()))
      AppMethodBeat.o(54618);
    while (true)
    {
      return bool;
      if (locald.zZs != paramb.zZs)
      {
        AppMethodBeat.o(54618);
      }
      else
      {
        bool = locald.zZs.aS(locald.path, paramb.path);
        AppMethodBeat.o(54618);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.b
 * JD-Core Version:    0.6.2
 */