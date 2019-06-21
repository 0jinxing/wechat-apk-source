package android.support.v4.content;

import android.net.Uri;
import android.net.Uri.Builder;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

final class FileProvider$b
  implements FileProvider.a
{
  private final String Gl;
  final HashMap<String, File> Gm = new HashMap();

  FileProvider$b(String paramString)
  {
    this.Gl = paramString;
  }

  public final File c(Uri paramUri)
  {
    Object localObject1 = paramUri.getEncodedPath();
    int i = ((String)localObject1).indexOf('/', 1);
    Object localObject2 = Uri.decode(((String)localObject1).substring(1, i));
    localObject1 = Uri.decode(((String)localObject1).substring(i + 1));
    localObject2 = (File)this.Gm.get(localObject2);
    if (localObject2 == null)
      throw new IllegalArgumentException("Unable to find configured root for ".concat(String.valueOf(paramUri)));
    paramUri = new File((File)localObject2, (String)localObject1);
    try
    {
      localObject1 = paramUri.getCanonicalFile();
      if (!((File)localObject1).getPath().startsWith(((File)localObject2).getPath()))
        throw new SecurityException("Resolved path jumped beyond configured root");
    }
    catch (IOException localIOException)
    {
      throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(paramUri)));
    }
    return localObject1;
  }

  public final Uri i(File paramFile)
  {
    while (true)
    {
      String str1;
      try
      {
        str1 = paramFile.getCanonicalPath();
        paramFile = null;
        Iterator localIterator = this.Gm.entrySet().iterator();
        if (localIterator.hasNext())
        {
          Map.Entry localEntry1 = (Map.Entry)localIterator.next();
          String str2 = ((File)localEntry1.getValue()).getPath();
          if (!str1.startsWith(str2))
            break label264;
          Map.Entry localEntry2 = localEntry1;
          if (paramFile != null)
          {
            if (str2.length() <= ((File)paramFile.getValue()).getPath().length())
              break label264;
            localEntry2 = localEntry1;
          }
          paramFile = localEntry2;
          continue;
        }
      }
      catch (IOException localIOException)
      {
        throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(paramFile)));
      }
      if (paramFile == null)
        throw new IllegalArgumentException("Failed to find configured root that contains ".concat(String.valueOf(str1)));
      Object localObject = ((File)paramFile.getValue()).getPath();
      if (((String)localObject).endsWith("/"));
      for (localObject = str1.substring(((String)localObject).length()); ; localObject = str1.substring(((String)localObject).length() + 1))
      {
        paramFile = Uri.encode((String)paramFile.getKey()) + '/' + Uri.encode((String)localObject, "/");
        return new Uri.Builder().scheme("content").authority(this.Gl).encodedPath(paramFile).build();
      }
      label264: localObject = paramFile;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     android.support.v4.content.FileProvider.b
 * JD-Core Version:    0.6.2
 */