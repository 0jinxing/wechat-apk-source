package com.tencent.mm.pluginsdk.model.app;

import android.net.Uri;

public final class ao
{
  public static ao vdg = null;
  public static long vdh = -1L;
  public int code = -1;
  public String[] projection = null;
  public String selection = "";
  public String[] selectionArgs = null;
  public Uri uri = null;
  public String vde = "";
  public String[] vdf = null;

  public ao(Uri paramUri, String[] paramArrayOfString1, String paramString1, String[] paramArrayOfString2, String paramString2, int paramInt, String[] paramArrayOfString3)
  {
    this.uri = paramUri;
    this.projection = paramArrayOfString1;
    this.selection = paramString1;
    this.selectionArgs = paramArrayOfString2;
    this.vde = paramString2;
    this.code = paramInt;
    this.vdf = paramArrayOfString3;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.app.ao
 * JD-Core Version:    0.6.2
 */