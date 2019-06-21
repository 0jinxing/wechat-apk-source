package com.tencent.smtt.sdk;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class MimeTypeMap
{
  private static MimeTypeMap a;

  public static String getFileExtensionFromUrl(String paramString)
  {
    AppMethodBeat.i(63976);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString = localbv.c().h(paramString);
      AppMethodBeat.o(63976);
    }
    while (true)
    {
      return paramString;
      paramString = android.webkit.MimeTypeMap.getFileExtensionFromUrl(paramString);
      AppMethodBeat.o(63976);
    }
  }

  public static MimeTypeMap getSingleton()
  {
    try
    {
      AppMethodBeat.i(63981);
      if (a == null)
      {
        localMimeTypeMap = new com/tencent/smtt/sdk/MimeTypeMap;
        localMimeTypeMap.<init>();
        a = localMimeTypeMap;
      }
      MimeTypeMap localMimeTypeMap = a;
      AppMethodBeat.o(63981);
      return localMimeTypeMap;
    }
    finally
    {
    }
  }

  public String getExtensionFromMimeType(String paramString)
  {
    AppMethodBeat.i(63980);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString = localbv.c().l(paramString);
      AppMethodBeat.o(63980);
    }
    while (true)
    {
      return paramString;
      paramString = android.webkit.MimeTypeMap.getSingleton().getExtensionFromMimeType(paramString);
      AppMethodBeat.o(63980);
    }
  }

  public String getMimeTypeFromExtension(String paramString)
  {
    AppMethodBeat.i(63978);
    bv localbv = bv.a();
    if ((localbv != null) && (localbv.b()))
    {
      paramString = localbv.c().j(paramString);
      AppMethodBeat.o(63978);
    }
    while (true)
    {
      return paramString;
      paramString = android.webkit.MimeTypeMap.getSingleton().getMimeTypeFromExtension(paramString);
      AppMethodBeat.o(63978);
    }
  }

  public boolean hasExtension(String paramString)
  {
    AppMethodBeat.i(63979);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().k(paramString);
      AppMethodBeat.o(63979);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.MimeTypeMap.getSingleton().hasExtension(paramString);
      AppMethodBeat.o(63979);
    }
  }

  public boolean hasMimeType(String paramString)
  {
    AppMethodBeat.i(63977);
    bv localbv = bv.a();
    boolean bool;
    if ((localbv != null) && (localbv.b()))
    {
      bool = localbv.c().i(paramString);
      AppMethodBeat.o(63977);
    }
    while (true)
    {
      return bool;
      bool = android.webkit.MimeTypeMap.getSingleton().hasMimeType(paramString);
      AppMethodBeat.o(63977);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.sdk.MimeTypeMap
 * JD-Core Version:    0.6.2
 */