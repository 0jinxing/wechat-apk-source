package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class el extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkc = "snsId".hashCode();
  private static final int dkd = "userName".hashCode();
  private static final int dke = "localFlag".hashCode();
  private static final int dkf = "createTime".hashCode();
  private static final int dkg = "head".hashCode();
  private static final int dkh = "localPrivate".hashCode();
  private static final int dki = "type".hashCode();
  private static final int dkj = "sourceType".hashCode();
  private static final int dkk = "likeFlag".hashCode();
  private static final int dkl = "pravited".hashCode();
  private static final int dkm = "stringSeq".hashCode();
  private static final int dkn = "content".hashCode();
  private static final int dko = "attrBuf".hashCode();
  private static final int dkp = "postBuf".hashCode();
  private static final int dkw = "subType".hashCode();
  private boolean djE = true;
  private boolean djF = true;
  private boolean djG = true;
  private boolean djH = true;
  private boolean djI = true;
  private boolean djJ = true;
  private boolean djK = true;
  private boolean djL = true;
  private boolean djM = true;
  private boolean djN = true;
  private boolean djO = true;
  private boolean djP = true;
  private boolean djQ = true;
  private boolean djR = true;
  private boolean djY = true;
  public byte[] field_attrBuf;
  public byte[] field_content;
  public int field_createTime;
  public int field_head;
  public int field_likeFlag;
  public int field_localFlag;
  public int field_localPrivate;
  public byte[] field_postBuf;
  public int field_pravited;
  public long field_snsId;
  public int field_sourceType;
  public String field_stringSeq;
  public int field_subType;
  public int field_type;
  public String field_userName;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.djE)
      localContentValues.put("snsId", Long.valueOf(this.field_snsId));
    if (this.djF)
      localContentValues.put("userName", this.field_userName);
    if (this.djG)
      localContentValues.put("localFlag", Integer.valueOf(this.field_localFlag));
    if (this.djH)
      localContentValues.put("createTime", Integer.valueOf(this.field_createTime));
    if (this.djI)
      localContentValues.put("head", Integer.valueOf(this.field_head));
    if (this.djJ)
      localContentValues.put("localPrivate", Integer.valueOf(this.field_localPrivate));
    if (this.djK)
      localContentValues.put("type", Integer.valueOf(this.field_type));
    if (this.djL)
      localContentValues.put("sourceType", Integer.valueOf(this.field_sourceType));
    if (this.djM)
      localContentValues.put("likeFlag", Integer.valueOf(this.field_likeFlag));
    if (this.djN)
      localContentValues.put("pravited", Integer.valueOf(this.field_pravited));
    if (this.djO)
      localContentValues.put("stringSeq", this.field_stringSeq);
    if (this.djP)
      localContentValues.put("content", this.field_content);
    if (this.djQ)
      localContentValues.put("attrBuf", this.field_attrBuf);
    if (this.djR)
      localContentValues.put("postBuf", this.field_postBuf);
    if (this.djY)
      localContentValues.put("subType", Integer.valueOf(this.field_subType));
    if (this.xDa > 0L)
      localContentValues.put("rowid", Long.valueOf(this.xDa));
    return localContentValues;
  }

  public void d(Cursor paramCursor)
  {
    String[] arrayOfString = paramCursor.getColumnNames();
    if (arrayOfString == null)
      return;
    int i = 0;
    int j = arrayOfString.length;
    label18: int k;
    if (i < j)
    {
      k = arrayOfString[i].hashCode();
      if (dkc != k)
        break label57;
      this.field_snsId = paramCursor.getLong(i);
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label57: if (dkd == k)
        this.field_userName = paramCursor.getString(i);
      else if (dke == k)
        this.field_localFlag = paramCursor.getInt(i);
      else if (dkf == k)
        this.field_createTime = paramCursor.getInt(i);
      else if (dkg == k)
        this.field_head = paramCursor.getInt(i);
      else if (dkh == k)
        this.field_localPrivate = paramCursor.getInt(i);
      else if (dki == k)
        this.field_type = paramCursor.getInt(i);
      else if (dkj == k)
        this.field_sourceType = paramCursor.getInt(i);
      else if (dkk == k)
        this.field_likeFlag = paramCursor.getInt(i);
      else if (dkl == k)
        this.field_pravited = paramCursor.getInt(i);
      else if (dkm == k)
        this.field_stringSeq = paramCursor.getString(i);
      else if (dkn == k)
        this.field_content = paramCursor.getBlob(i);
      else if (dko == k)
        this.field_attrBuf = paramCursor.getBlob(i);
      else if (dkp == k)
        this.field_postBuf = paramCursor.getBlob(i);
      else if (dkw == k)
        this.field_subType = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.el
 * JD-Core Version:    0.6.2
 */