package com.tencent.mm.plugin.fts.a;

import android.database.Cursor;
import com.tencent.mm.storage.ad;
import java.util.List;

public abstract interface j
{
  public abstract ad MU(String paramString);

  public abstract boolean MV(String paramString);

  public abstract long MW(String paramString);

  public abstract List<String> MX(String paramString);

  public abstract Cursor i(String paramString, String[] paramArrayOfString);

  public abstract Cursor rawQuery(String paramString, String[] paramArrayOfString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fts.a.j
 * JD-Core Version:    0.6.2
 */