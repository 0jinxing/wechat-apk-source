package com.tencent.tinker.lib.d;

import android.content.Intent;
import com.tencent.tinker.loader.shareutil.SharePatchInfo;
import java.io.File;
import java.util.List;

public abstract interface d
{
  public abstract void a(File paramFile, SharePatchInfo paramSharePatchInfo, String paramString);

  public abstract void a(File paramFile1, File paramFile2, String paramString, int paramInt);

  public abstract void a(File paramFile, String paramString1, String paramString2);

  public abstract void a(File paramFile, Throwable paramThrowable);

  public abstract void a(File paramFile, List<File> paramList, Throwable paramThrowable);

  public abstract void a(File paramFile, boolean paramBoolean, long paramLong);

  public abstract void ad(Intent paramIntent);

  public abstract void e(File paramFile, int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.tinker.lib.d.d
 * JD-Core Version:    0.6.2
 */