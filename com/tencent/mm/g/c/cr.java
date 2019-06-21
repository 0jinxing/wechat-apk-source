package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.protocal.protobuf.axr;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public abstract class cr extends c
{
  private static final int dIi = "launchPB".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkV = "appId".hashCode();
  private boolean dIh = true;
  private boolean dkE = true;
  public String field_appId;
  public axr field_launchPB;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dkE)
      localContentValues.put("appId", this.field_appId);
    if ((this.dIh) && (this.field_launchPB != null));
    try
    {
      localContentValues.put("launchPB", this.field_launchPB.toByteArray());
      if (this.xDa > 0L)
        localContentValues.put("rowid", Long.valueOf(this.xDa));
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.SDK.BaseLaunchWxaAppPBTable", localIOException.getMessage());
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
        break label59;
      this.field_appId = paramCursor.getString(j);
    }
    while (true)
    {
      j++;
      break label18;
      break;
      label59: if (dIi == k)
        try
        {
          byte[] arrayOfByte = paramCursor.getBlob(j);
          if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
            continue;
          axr localaxr = new com/tencent/mm/protocal/protobuf/axr;
          localaxr.<init>();
          this.field_launchPB = ((axr)localaxr.parseFrom(arrayOfByte));
        }
        catch (IOException localIOException)
        {
          ab.e("MicroMsg.SDK.BaseLaunchWxaAppPBTable", localIOException.getMessage());
        }
      else if (diR == k)
        this.xDa = paramCursor.getLong(j);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.cr
 * JD-Core Version:    0.6.2
 */