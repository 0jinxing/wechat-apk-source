package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class al extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkY = "mediaId".hashCode();
  private static final int drY = "downloadUrlHashCode".hashCode();
  private static final int drZ = "downloadUrl".hashCode();
  private static final int dsa = "httpsUrl".hashCode();
  private static final int dsb = "filePath".hashCode();
  private static final int dsc = "verifyHeaders".hashCode();
  private static final int dsd = "game_package_download".hashCode();
  private static final int dse = "allowMobileNetDownload".hashCode();
  private static final int dsf = "wifiAutoDownload".hashCode();
  private boolean dkH = true;
  private boolean drQ = true;
  private boolean drR = true;
  private boolean drS = true;
  private boolean drT = true;
  private boolean drU = true;
  private boolean drV = true;
  private boolean drW = true;
  private boolean drX = true;
  public Boolean field_allowMobileNetDownload;
  public String field_downloadUrl;
  public int field_downloadUrlHashCode;
  public String field_filePath;
  public Boolean field_game_package_download;
  public String field_httpsUrl;
  public String field_mediaId;
  public String field_verifyHeaders;
  public Boolean field_wifiAutoDownload;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dkH)
      localContentValues.put("mediaId", this.field_mediaId);
    if (this.drQ)
      localContentValues.put("downloadUrlHashCode", Integer.valueOf(this.field_downloadUrlHashCode));
    if (this.drR)
      localContentValues.put("downloadUrl", this.field_downloadUrl);
    if (this.drS)
      localContentValues.put("httpsUrl", this.field_httpsUrl);
    if (this.drT)
      localContentValues.put("filePath", this.field_filePath);
    if (this.drU)
      localContentValues.put("verifyHeaders", this.field_verifyHeaders);
    if (this.drV)
      localContentValues.put("game_package_download", this.field_game_package_download);
    if (this.drW)
      localContentValues.put("allowMobileNetDownload", this.field_allowMobileNetDownload);
    if (this.drX)
      localContentValues.put("wifiAutoDownload", this.field_wifiAutoDownload);
    if (this.xDa > 0L)
      localContentValues.put("rowid", Long.valueOf(this.xDa));
    return localContentValues;
  }

  public final void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
      return;
    int i = arrayOfString.length;
    int j = 0;
    label18: int k;
    if (j < i)
    {
      k = arrayOfString[j].hashCode();
      if (dkY != k)
        break label59;
      this.field_mediaId = paramCursor.getString(j);
    }
    while (true)
    {
      j++;
      break label18;
      break;
      label59: if (drY == k)
      {
        this.field_downloadUrlHashCode = paramCursor.getInt(j);
        this.drQ = true;
      }
      else if (drZ == k)
      {
        this.field_downloadUrl = paramCursor.getString(j);
      }
      else if (dsa == k)
      {
        this.field_httpsUrl = paramCursor.getString(j);
      }
      else if (dsb == k)
      {
        this.field_filePath = paramCursor.getString(j);
      }
      else if (dsc == k)
      {
        this.field_verifyHeaders = paramCursor.getString(j);
      }
      else
      {
        boolean bool;
        if (dsd == k)
        {
          if (paramCursor.getInt(j) != 0);
          for (bool = true; ; bool = false)
          {
            this.field_game_package_download = Boolean.valueOf(bool);
            break;
          }
        }
        if (dse == k)
        {
          if (paramCursor.getInt(j) != 0);
          for (bool = true; ; bool = false)
          {
            this.field_allowMobileNetDownload = Boolean.valueOf(bool);
            break;
          }
        }
        if (dsf == k)
        {
          if (paramCursor.getInt(j) != 0);
          for (bool = true; ; bool = false)
          {
            this.field_wifiAutoDownload = Boolean.valueOf(bool);
            break;
          }
        }
        if (diR == k)
          this.xDa = paramCursor.getLong(j);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.al
 * JD-Core Version:    0.6.2
 */