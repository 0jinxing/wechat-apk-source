package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.protobuf.gp;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public abstract class v extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dnJ = "deviceId".hashCode();
  private static final int dnK = "sessionName".hashCode();
  private static final int dnL = "moveTime".hashCode();
  private boolean dnG = true;
  private boolean dnH = true;
  private boolean dnI = true;
  public String field_deviceId;
  public gp field_moveTime;
  public String field_sessionName;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_deviceId == null)
      this.field_deviceId = "";
    if (this.dnG)
      localContentValues.put("deviceId", this.field_deviceId);
    if (this.field_sessionName == null)
      this.field_sessionName = "";
    if (this.dnH)
      localContentValues.put("sessionName", this.field_sessionName);
    if ((this.dnI) && (this.field_moveTime != null));
    try
    {
      localContentValues.put("moveTime", this.field_moveTime.toByteArray());
      if (this.xDa > 0L)
        localContentValues.put("rowid", Long.valueOf(this.xDa));
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.SDK.BaseBackupMoveTime", localIOException.getMessage());
    }
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
      if (dnJ != k)
        break label59;
      this.field_deviceId = paramCursor.getString(j);
    }
    while (true)
    {
      j++;
      break label18;
      break;
      label59: if (dnK == k)
        this.field_sessionName = paramCursor.getString(j);
      else if (dnL == k)
        try
        {
          byte[] arrayOfByte = paramCursor.getBlob(j);
          if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
            continue;
          gp localgp = new com/tencent/mm/protocal/protobuf/gp;
          localgp.<init>();
          this.field_moveTime = ((gp)localgp.parseFrom(arrayOfByte));
        }
        catch (IOException localIOException)
        {
          ab.e("MicroMsg.SDK.BaseBackupMoveTime", localIOException.getMessage());
        }
      else if (diR == k)
        this.xDa = paramCursor.getLong(j);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.v
 * JD-Core Version:    0.6.2
 */