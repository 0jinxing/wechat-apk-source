package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.j.a.a.d;
import com.tencent.mm.sdk.e.c;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public abstract class an extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dlo = "username".hashCode();
  private static final int dta = "lastPushSeq".hashCode();
  private static final int dtb = "lastLocalSeq".hashCode();
  private static final int dtc = "lastPushCreateTime".hashCode();
  private static final int dtd = "lastLocalCreateTime".hashCode();
  private static final int dte = "seqBlockInfo".hashCode();
  private boolean dlm = true;
  private boolean dsV = true;
  private boolean dsW = true;
  private boolean dsX = true;
  private boolean dsY = true;
  private boolean dsZ = true;
  public long field_lastLocalCreateTime;
  public long field_lastLocalSeq;
  public long field_lastPushCreateTime;
  public long field_lastPushSeq;
  public d field_seqBlockInfo;
  public String field_username;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_username == null)
      this.field_username = "";
    if (this.dlm)
      localContentValues.put("username", this.field_username);
    if (this.dsV)
      localContentValues.put("lastPushSeq", Long.valueOf(this.field_lastPushSeq));
    if (this.dsW)
      localContentValues.put("lastLocalSeq", Long.valueOf(this.field_lastLocalSeq));
    if (this.dsX)
      localContentValues.put("lastPushCreateTime", Long.valueOf(this.field_lastPushCreateTime));
    if (this.dsY)
      localContentValues.put("lastLocalCreateTime", Long.valueOf(this.field_lastLocalCreateTime));
    if ((this.dsZ) && (this.field_seqBlockInfo != null));
    try
    {
      localContentValues.put("seqBlockInfo", this.field_seqBlockInfo.toByteArray());
      if (this.xDa > 0L)
        localContentValues.put("rowid", Long.valueOf(this.xDa));
      return localContentValues;
    }
    catch (IOException localIOException)
    {
      while (true)
        ab.e("MicroMsg.SDK.BaseChatroomMsgSeq", localIOException.getMessage());
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
      if (dlo != k)
        break label64;
      this.field_username = paramCursor.getString(j);
      this.dlm = true;
    }
    while (true)
    {
      j++;
      break label18;
      break;
      label64: if (dta == k)
        this.field_lastPushSeq = paramCursor.getLong(j);
      else if (dtb == k)
        this.field_lastLocalSeq = paramCursor.getLong(j);
      else if (dtc == k)
        this.field_lastPushCreateTime = paramCursor.getLong(j);
      else if (dtd == k)
        this.field_lastLocalCreateTime = paramCursor.getLong(j);
      else if (dte == k)
        try
        {
          byte[] arrayOfByte = paramCursor.getBlob(j);
          if ((arrayOfByte == null) || (arrayOfByte.length <= 0))
            continue;
          d locald = new com/tencent/mm/j/a/a/d;
          locald.<init>();
          this.field_seqBlockInfo = ((d)locald.parseFrom(arrayOfByte));
        }
        catch (IOException localIOException)
        {
          ab.e("MicroMsg.SDK.BaseChatroomMsgSeq", localIOException.getMessage());
        }
      else if (diR == k)
        this.xDa = paramCursor.getLong(j);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.an
 * JD-Core Version:    0.6.2
 */