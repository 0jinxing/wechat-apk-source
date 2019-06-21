package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.protobuf.bqd;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public abstract class o extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkV = "appId".hashCode();
  private static final int dlJ = "recommendCard".hashCode();
  private boolean dkE = true;
  private boolean dlI = true;
  public String field_appId;
  public bqd field_recommendCard;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dkE)
      localContentValues.put("appId", this.field_appId);
    if ((this.dlI) && (this.field_recommendCard != null));
    try
    {
      localContentValues.put("recommendCard", this.field_recommendCard.toByteArray());
      if (this.xDa > 0L)
        localContentValues.put("rowid", Long.valueOf(this.xDa));
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.SDK.BaseAppBrandRecommendCard", localIOException.getMessage());
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
      if (dkV != k)
        break label64;
      this.field_appId = paramCursor.getString(j);
      this.dkE = true;
    }
    while (true)
    {
      j++;
      break label18;
      break;
      label64: if (dlJ == k)
        try
        {
          byte[] arrayOfByte = paramCursor.getBlob(j);
          if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
            continue;
          bqd localbqd = new com/tencent/mm/protocal/protobuf/bqd;
          localbqd.<init>();
          this.field_recommendCard = ((bqd)localbqd.parseFrom(arrayOfByte));
        }
        catch (IOException localIOException)
        {
          ab.e("MicroMsg.SDK.BaseAppBrandRecommendCard", localIOException.getMessage());
        }
      else if (diR == k)
        this.xDa = paramCursor.getLong(j);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.o
 * JD-Core Version:    0.6.2
 */