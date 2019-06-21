package com.tencent.mm.vfs;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Parcel;
import com.tencent.e.a.b;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j
{
  private static final Pattern zZL;

  static
  {
    AppMethodBeat.i(54676);
    zZL = Pattern.compile("\\$\\{([A-Za-z0-9_]+)\\}");
    AppMethodBeat.o(54676);
  }

  static String H(String paramString, Map<String, String> paramMap)
  {
    AppMethodBeat.i(54672);
    Matcher localMatcher = zZL.matcher(paramString);
    StringBuilder localStringBuilder;
    int i;
    if (localMatcher.find())
    {
      localStringBuilder = new StringBuilder(paramString.length());
      i = 0;
    }
    while (true)
    {
      String str1 = localMatcher.group(1);
      String str2 = (String)paramMap.get(str1);
      if (str2 == null)
      {
        b.d("VFS.Utils", "Macro resolve: " + paramString + " cannot resolve ${" + str1 + "}.");
        paramString = null;
        AppMethodBeat.o(54672);
      }
      while (true)
      {
        return paramString;
        localStringBuilder.append(paramString.substring(i, localMatcher.start())).append(str2);
        i = localMatcher.end();
        if (localMatcher.find())
          break;
        paramMap = paramString.substring(i);
        b.d("VFS.Utils", "Macro resolve: " + paramString + " => " + paramMap);
        AppMethodBeat.o(54672);
        paramString = paramMap;
        continue;
        b.d("VFS.Utils", "Macro resolve: " + paramString + " contains no macros.");
        AppMethodBeat.o(54672);
      }
    }
  }

  public static void a(Parcel paramParcel, Class<? extends FileSystem> paramClass)
  {
    AppMethodBeat.i(54675);
    int i = paramParcel.readInt();
    if (i != 1)
    {
      paramParcel = new a(paramClass, i);
      AppMethodBeat.o(54675);
      throw paramParcel;
    }
    AppMethodBeat.o(54675);
  }

  static String ath(String paramString)
  {
    AppMethodBeat.i(54674);
    int i = paramString.lastIndexOf('/');
    if (i <= 0)
    {
      paramString = null;
      AppMethodBeat.o(54674);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.substring(0, i);
      AppMethodBeat.o(54674);
    }
  }

  static String k(String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    int i = 1;
    AppMethodBeat.i(54673);
    if (paramString.isEmpty())
      AppMethodBeat.o(54673);
    while (true)
    {
      return paramString;
      int j;
      label33: Object localObject;
      StringTokenizer localStringTokenizer;
      if (paramString.startsWith("/"))
      {
        j = 1;
        localObject = paramString;
        if (paramString.endsWith("/"))
        {
          localObject = paramString;
          if (paramString.length() > 1)
            localObject = paramString.substring(0, paramString.length() - 1);
        }
        localStringTokenizer = new StringTokenizer(((String)localObject).substring(j), "/");
        paramString = new ArrayList();
      }
      while (true)
      {
        if (!localStringTokenizer.hasMoreTokens())
          break label202;
        String str = localStringTokenizer.nextToken();
        if ((paramBoolean1) && ("..".equals(str)))
        {
          if (paramString.isEmpty())
          {
            paramString = null;
            AppMethodBeat.o(54673);
            break;
            j = 0;
            break label33;
          }
          paramString.remove(paramString.size() - 1);
          i = 0;
          continue;
        }
        if (((paramBoolean1) && (".".equals(str))) || ("".equals(str)))
          i = 0;
        else
          paramString.add(str);
      }
      label202: if (i != 0)
      {
        if (paramBoolean2)
        {
          paramString = ((String)localObject).substring(j);
          AppMethodBeat.o(54673);
        }
        else
        {
          AppMethodBeat.o(54673);
          paramString = (String)localObject;
        }
      }
      else
      {
        localObject = new StringBuilder();
        if ((!paramBoolean2) && (j > 0))
          ((StringBuilder)localObject).append('/');
        paramString = paramString.iterator();
        if (paramString.hasNext())
        {
          ((StringBuilder)localObject).append(paramString.next());
          while (paramString.hasNext())
          {
            ((StringBuilder)localObject).append('/');
            ((StringBuilder)localObject).append(paramString.next());
          }
        }
        paramString = ((StringBuilder)localObject).toString();
        AppMethodBeat.o(54673);
      }
    }
  }

  static Uri parseUri(String paramString)
  {
    AppMethodBeat.i(54670);
    Uri.Builder localBuilder = new Uri.Builder();
    int i = paramString.indexOf(':');
    if (i < 0)
      localBuilder.path(paramString);
    while (true)
    {
      paramString = localBuilder.build();
      AppMethodBeat.o(54670);
      return paramString;
      localBuilder.scheme(paramString.substring(0, i));
      int j = paramString.length();
      if ((j > i + 2) && (paramString.charAt(i + 1) == '/') && (paramString.charAt(i + 2) == '/'))
      {
        for (int k = i + 3; k < j; k++)
          switch (paramString.charAt(k))
          {
          default:
          case '#':
          case '/':
          case '?':
          }
        localBuilder.authority(paramString.substring(i + 3, k));
        if (k < j)
          localBuilder.path(paramString.substring(k + 1));
      }
      else
      {
        localBuilder.path(paramString.substring(i + 1));
      }
    }
  }

  public static String w(Uri paramUri)
  {
    AppMethodBeat.i(54671);
    StringBuilder localStringBuilder = new StringBuilder();
    String str = paramUri.getScheme();
    if ((str != null) && (!str.isEmpty()))
      localStringBuilder.append(str).append(':');
    str = paramUri.getAuthority();
    if ((str != null) && (!str.isEmpty()))
      localStringBuilder.append("//").append(str);
    paramUri = paramUri.getPath();
    if (paramUri != null)
      localStringBuilder.append(paramUri);
    paramUri = localStringBuilder.toString();
    AppMethodBeat.o(54671);
    return paramUri;
  }

  static final class a extends RuntimeException
  {
    a(Class<?> paramClass, int paramInt)
    {
      super();
      AppMethodBeat.i(54669);
      AppMethodBeat.o(54669);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.vfs.j
 * JD-Core Version:    0.6.2
 */