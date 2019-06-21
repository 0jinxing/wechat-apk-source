package android.support.v4.content;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParserException;

public class FileProvider extends ContentProvider
{
  private static final String ATTR_NAME = "name";
  private static final String ATTR_PATH = "path";
  private static final String[] COLUMNS = { "_display_name", "_size" };
  private static final File DEVICE_ROOT = new File("/");
  private static final String META_DATA_FILE_PROVIDER_PATHS = "android.support.FILE_PROVIDER_PATHS";
  private static final String TAG_CACHE_PATH = "cache-path";
  private static final String TAG_EXTERNAL = "external-path";
  private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
  private static final String TAG_EXTERNAL_FILES = "external-files-path";
  private static final String TAG_EXTERNAL_MEDIA = "external-media-path";
  private static final String TAG_FILES_PATH = "files-path";
  private static final String TAG_ROOT_PATH = "root-path";
  private static HashMap<String, a> sCache = new HashMap();
  private a mStrategy;

  private static File buildPath(File paramFile, String[] paramArrayOfString)
  {
    int i = paramArrayOfString.length;
    int j = 0;
    if (j < i)
    {
      String str = paramArrayOfString[j];
      if (str == null)
        break label39;
      paramFile = new File(paramFile, str);
    }
    label39: 
    while (true)
    {
      j++;
      break;
      return paramFile;
    }
  }

  private static Object[] copyOf(Object[] paramArrayOfObject, int paramInt)
  {
    Object[] arrayOfObject = new Object[paramInt];
    System.arraycopy(paramArrayOfObject, 0, arrayOfObject, 0, paramInt);
    return arrayOfObject;
  }

  private static String[] copyOf(String[] paramArrayOfString, int paramInt)
  {
    String[] arrayOfString = new String[paramInt];
    System.arraycopy(paramArrayOfString, 0, arrayOfString, 0, paramInt);
    return arrayOfString;
  }

  private static a getPathStrategy(Context paramContext, String paramString)
  {
    a locala2;
    synchronized (sCache)
    {
      a locala1 = (a)sCache.get(paramString);
      locala2 = locala1;
      if (locala1 != null);
    }
    try
    {
      locala2 = parsePathStrategy(paramContext, paramString);
      sCache.put(paramString, locala2);
      return locala2;
    }
    catch (IOException paramContext)
    {
      paramString = new java/lang/IllegalArgumentException;
      paramString.<init>("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", paramContext);
      throw paramString;
      paramContext = finally;
      throw paramContext;
    }
    catch (XmlPullParserException paramString)
    {
      paramContext = new java/lang/IllegalArgumentException;
      paramContext.<init>("Failed to parse android.support.FILE_PROVIDER_PATHS meta-data", paramString);
    }
    throw paramContext;
  }

  public static Uri getUriForFile(Context paramContext, String paramString, File paramFile)
  {
    return getPathStrategy(paramContext, paramString).i(paramFile);
  }

  private static int modeToMode(String paramString)
  {
    int i;
    if ("r".equals(paramString))
      i = 268435456;
    while (true)
    {
      return i;
      if (("w".equals(paramString)) || ("wt".equals(paramString)))
      {
        i = 738197504;
      }
      else if ("wa".equals(paramString))
      {
        i = 704643072;
      }
      else if ("rw".equals(paramString))
      {
        i = 939524096;
      }
      else
      {
        if (!"rwt".equals(paramString))
          break;
        i = 1006632960;
      }
    }
    throw new IllegalArgumentException("Invalid mode: ".concat(String.valueOf(paramString)));
  }

  private static a parsePathStrategy(Context paramContext, String paramString)
  {
    FileProvider.b localb = new FileProvider.b(paramString);
    XmlResourceParser localXmlResourceParser = paramContext.getPackageManager().resolveContentProvider(paramString, 128).loadXmlMetaData(paramContext.getPackageManager(), "android.support.FILE_PROVIDER_PATHS");
    if (localXmlResourceParser == null)
      throw new IllegalArgumentException("Missing android.support.FILE_PROVIDER_PATHS meta-data");
    while (true)
    {
      try
      {
        Object localObject1 = paramString.getCanonicalFile();
        Object localObject2;
        localb.Gm.put(localObject2, localObject1);
        int i = localXmlResourceParser.next();
        if (i != 1)
        {
          if (i != 2)
            continue;
          paramString = localXmlResourceParser.getName();
          localObject2 = localXmlResourceParser.getAttributeValue(null, "name");
          localObject1 = localXmlResourceParser.getAttributeValue(null, "path");
          if ("root-path".equals(paramString))
          {
            paramString = DEVICE_ROOT;
            if (paramString == null)
              continue;
            paramString = buildPath(paramString, new String[] { localObject1 });
            if (!TextUtils.isEmpty((CharSequence)localObject2))
              continue;
            throw new IllegalArgumentException("Name must not be empty");
          }
          if ("files-path".equals(paramString))
          {
            paramString = paramContext.getFilesDir();
            continue;
          }
          if ("cache-path".equals(paramString))
          {
            paramString = paramContext.getCacheDir();
            continue;
          }
          if ("external-path".equals(paramString))
          {
            paramString = Environment.getExternalStorageDirectory();
            continue;
          }
          if ("external-files-path".equals(paramString))
          {
            paramString = b.O(paramContext);
            if (paramString.length <= 0)
              break label317;
            paramString = paramString[0];
            continue;
          }
          if ("external-cache-path".equals(paramString))
          {
            paramString = b.P(paramContext);
            if (paramString.length <= 0)
              break label317;
            paramString = paramString[0];
            continue;
          }
          if ((Build.VERSION.SDK_INT < 21) || (!"external-media-path".equals(paramString)))
            break label317;
          paramString = paramContext.getExternalMediaDirs();
          if (paramString.length <= 0)
            break label317;
          paramString = paramString[0];
          continue;
          continue;
        }
      }
      catch (IOException paramContext)
      {
        throw new IllegalArgumentException("Failed to resolve canonical path for ".concat(String.valueOf(paramString)), paramContext);
      }
      return localb;
      label317: paramString = null;
    }
  }

  public void attachInfo(Context paramContext, ProviderInfo paramProviderInfo)
  {
    super.attachInfo(paramContext, paramProviderInfo);
    if (paramProviderInfo.exported)
      throw new SecurityException("Provider must not be exported");
    if (!paramProviderInfo.grantUriPermissions)
      throw new SecurityException("Provider must grant uri permissions");
    this.mStrategy = getPathStrategy(paramContext, paramProviderInfo.authority);
  }

  public int delete(Uri paramUri, String paramString, String[] paramArrayOfString)
  {
    if (this.mStrategy.c(paramUri).delete());
    for (int i = 1; ; i = 0)
      return i;
  }

  public String getType(Uri paramUri)
  {
    paramUri = this.mStrategy.c(paramUri);
    int i = paramUri.getName().lastIndexOf('.');
    if (i >= 0)
    {
      paramUri = paramUri.getName().substring(i + 1);
      paramUri = MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramUri);
      if (paramUri == null);
    }
    while (true)
    {
      return paramUri;
      paramUri = "application/octet-stream";
    }
  }

  public Uri insert(Uri paramUri, ContentValues paramContentValues)
  {
    throw new UnsupportedOperationException("No external inserts");
  }

  public boolean onCreate()
  {
    return true;
  }

  public ParcelFileDescriptor openFile(Uri paramUri, String paramString)
  {
    return ParcelFileDescriptor.open(this.mStrategy.c(paramUri), modeToMode(paramString));
  }

  public Cursor query(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2)
  {
    paramString1 = this.mStrategy.c(paramUri);
    paramUri = paramArrayOfString1;
    if (paramArrayOfString1 == null)
      paramUri = COLUMNS;
    paramArrayOfString2 = new String[paramUri.length];
    paramArrayOfString1 = new Object[paramUri.length];
    int i = paramUri.length;
    int j = 0;
    int k = 0;
    int m;
    if (j < i)
    {
      paramString2 = paramUri[j];
      if ("_display_name".equals(paramString2))
      {
        paramArrayOfString2[k] = "_display_name";
        m = k + 1;
        paramArrayOfString1[k] = paramString1.getName();
        k = m;
      }
    }
    while (true)
    {
      j++;
      break;
      if ("_size".equals(paramString2))
      {
        paramArrayOfString2[k] = "_size";
        m = k + 1;
        paramArrayOfString1[k] = Long.valueOf(paramString1.length());
        k = m;
        continue;
        paramString1 = copyOf(paramArrayOfString2, k);
        paramUri = copyOf(paramArrayOfString1, k);
        paramArrayOfString1 = new MatrixCursor(paramString1, 1);
        paramArrayOfString1.addRow(paramUri);
        return paramArrayOfString1;
      }
    }
  }

  public int update(Uri paramUri, ContentValues paramContentValues, String paramString, String[] paramArrayOfString)
  {
    throw new UnsupportedOperationException("No external updates");
  }

  static abstract interface a
  {
    public abstract File c(Uri paramUri);

    public abstract Uri i(File paramFile);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     android.support.v4.content.FileProvider
 * JD-Core Version:    0.6.2
 */