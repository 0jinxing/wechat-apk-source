package com.tencent.mm.app;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;

final class l$3
  implements FilenameFilter
{
  String ceO = this.val$context.getPackageName();

  l$3(l paraml, Context paramContext)
  {
  }

  public final boolean accept(File paramFile, String paramString)
  {
    return paramString.startsWith(this.ceO);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.l.3
 * JD-Core Version:    0.6.2
 */