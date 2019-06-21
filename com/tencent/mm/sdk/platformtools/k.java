package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.content.FileProvider;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;

public final class k
{
  public static void a(Context paramContext, Intent paramIntent, Uri paramUri, String paramString)
  {
    AppMethodBeat.i(93388);
    if (paramUri.getScheme().equals("file"))
    {
      a(paramContext, paramIntent, new File(paramUri.getPath()), paramString);
      AppMethodBeat.o(93388);
    }
    while (true)
    {
      return;
      if (d.iW(24))
      {
        paramIntent.setDataAndType(paramUri, paramString);
        paramIntent.addFlags(1);
      }
      AppMethodBeat.o(93388);
    }
  }

  public static void a(Context paramContext, Intent paramIntent, File paramFile, String paramString)
  {
    AppMethodBeat.i(93389);
    if (d.iW(24))
    {
      paramIntent.setDataAndType(d(paramContext, paramFile), paramString);
      paramIntent.addFlags(1);
      AppMethodBeat.o(93389);
    }
    while (true)
    {
      return;
      paramIntent.setDataAndType(Uri.fromFile(paramFile), paramString);
      AppMethodBeat.o(93389);
    }
  }

  public static Uri d(Context paramContext, File paramFile)
  {
    AppMethodBeat.i(93391);
    if (d.iW(24));
    for (paramContext = e(paramContext, paramFile); ; paramContext = Uri.fromFile(paramFile))
    {
      AppMethodBeat.o(93391);
      return paramContext;
    }
  }

  public static ArrayList<Uri> d(Context paramContext, ArrayList<Uri> paramArrayList)
  {
    AppMethodBeat.i(93390);
    ArrayList localArrayList = new ArrayList();
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
      localArrayList.add(d(paramContext, new File(((Uri)paramArrayList.next()).getPath())));
    AppMethodBeat.o(93390);
    return localArrayList;
  }

  private static Uri e(Context paramContext, File paramFile)
  {
    AppMethodBeat.i(93392);
    paramContext = FileProvider.getUriForFile(paramContext, paramContext.getPackageName() + ".external.fileprovider", paramFile);
    AppMethodBeat.o(93392);
    return paramContext;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.k
 * JD-Core Version:    0.6.2
 */