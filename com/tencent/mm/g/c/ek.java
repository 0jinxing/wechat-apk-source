package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ek extends c
{
  private static final int dRA = "bgId".hashCode();
  private static final int dRB = "bgUrl".hashCode();
  private static final int dRC = "older_bgId".hashCode();
  private static final int dRD = "local_flag".hashCode();
  private static final int dRE = "istyle".hashCode();
  private static final int dRF = "iFlag".hashCode();
  private static final int dRG = "icount".hashCode();
  private static final int dRH = "faultS".hashCode();
  private static final int dRI = "snsBgId".hashCode();
  private static final int dRJ = "snsuser".hashCode();
  private static final int dRK = "adsession".hashCode();
  private static final int dRL = "lastFirstPageRequestErrCode".hashCode();
  private static final int dRM = "lastFirstPageRequestErrType".hashCode();
  private static final int dRz;
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dkd = "userName".hashCode();
  private static final int dxn = "md5".hashCode();
  private boolean dRl = true;
  private boolean dRm = true;
  private boolean dRn = true;
  private boolean dRo = true;
  private boolean dRp = true;
  private boolean dRq = true;
  private boolean dRr = true;
  private boolean dRs = true;
  private boolean dRt = true;
  private boolean dRu = true;
  private boolean dRv = true;
  private boolean dRw = true;
  private boolean dRx = true;
  private boolean dRy = true;
  private boolean djF = true;
  private boolean dwB = true;
  public byte[] field_adsession;
  public String field_bgId;
  public String field_bgUrl;
  public byte[] field_faultS;
  public int field_iFlag;
  public int field_icount;
  public int field_istyle;
  public int field_lastFirstPageRequestErrCode;
  public int field_lastFirstPageRequestErrType;
  public int field_local_flag;
  public String field_md5;
  public String field_newerIds;
  public String field_older_bgId;
  public long field_snsBgId;
  public byte[] field_snsuser;
  public String field_userName;

  static
  {
    dRz = "newerIds".hashCode();
  }

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_userName == null)
      this.field_userName = "";
    if (this.djF)
      localContentValues.put("userName", this.field_userName);
    if (this.dwB)
      localContentValues.put("md5", this.field_md5);
    if (this.dRl)
      localContentValues.put("newerIds", this.field_newerIds);
    if (this.dRm)
      localContentValues.put("bgId", this.field_bgId);
    if (this.dRn)
      localContentValues.put("bgUrl", this.field_bgUrl);
    if (this.dRo)
      localContentValues.put("older_bgId", this.field_older_bgId);
    if (this.dRp)
      localContentValues.put("local_flag", Integer.valueOf(this.field_local_flag));
    if (this.dRq)
      localContentValues.put("istyle", Integer.valueOf(this.field_istyle));
    if (this.dRr)
      localContentValues.put("iFlag", Integer.valueOf(this.field_iFlag));
    if (this.dRs)
      localContentValues.put("icount", Integer.valueOf(this.field_icount));
    if (this.dRt)
      localContentValues.put("faultS", this.field_faultS);
    if (this.dRu)
      localContentValues.put("snsBgId", Long.valueOf(this.field_snsBgId));
    if (this.dRv)
      localContentValues.put("snsuser", this.field_snsuser);
    if (this.dRw)
      localContentValues.put("adsession", this.field_adsession);
    if (this.dRx)
      localContentValues.put("lastFirstPageRequestErrCode", Integer.valueOf(this.field_lastFirstPageRequestErrCode));
    if (this.dRy)
      localContentValues.put("lastFirstPageRequestErrType", Integer.valueOf(this.field_lastFirstPageRequestErrType));
    if (this.xDa > 0L)
      localContentValues.put("rowid", Long.valueOf(this.xDa));
    return localContentValues;
  }

  public final void d(Cursor paramCursor)
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
      if (dkd != k)
        break label62;
      this.field_userName = paramCursor.getString(i);
      this.djF = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dxn == k)
        this.field_md5 = paramCursor.getString(i);
      else if (dRz == k)
        this.field_newerIds = paramCursor.getString(i);
      else if (dRA == k)
        this.field_bgId = paramCursor.getString(i);
      else if (dRB == k)
        this.field_bgUrl = paramCursor.getString(i);
      else if (dRC == k)
        this.field_older_bgId = paramCursor.getString(i);
      else if (dRD == k)
        this.field_local_flag = paramCursor.getInt(i);
      else if (dRE == k)
        this.field_istyle = paramCursor.getInt(i);
      else if (dRF == k)
        this.field_iFlag = paramCursor.getInt(i);
      else if (dRG == k)
        this.field_icount = paramCursor.getInt(i);
      else if (dRH == k)
        this.field_faultS = paramCursor.getBlob(i);
      else if (dRI == k)
        this.field_snsBgId = paramCursor.getLong(i);
      else if (dRJ == k)
        this.field_snsuser = paramCursor.getBlob(i);
      else if (dRK == k)
        this.field_adsession = paramCursor.getBlob(i);
      else if (dRL == k)
        this.field_lastFirstPageRequestErrCode = paramCursor.getInt(i);
      else if (dRM == k)
        this.field_lastFirstPageRequestErrType = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ek
 * JD-Core Version:    0.6.2
 */