package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class ds extends c
{
  private static final int dNj = "originalArticleCount".hashCode();
  private static final int dNk = "friendSubscribeCount".hashCode();
  private static final int dNl = "allArticleWording".hashCode();
  private static final int dNm = "historyArticlesUrl".hashCode();
  private static final int dNn = "userRole".hashCode();
  private static final int dNo = "banReason".hashCode();
  private static final int dNp = "showRecommendArticle".hashCode();
  private static final int dNq = "showService".hashCode();
  private static final int dNr = "messageListStr".hashCode();
  private static final int dNs = "serviceInfoListStr".hashCode();
  private static final int dNt = "bizAccountListStr".hashCode();
  private static final int dNu = "cacheTime".hashCode();
  private static final int dNv = "decryptUserName".hashCode();
  private static final int dNw = "hiddenAvatar".hashCode();
  private static final int dNx = "hiddenButtonBeforeFocus".hashCode();
  private static final int dNy = "newBanReason".hashCode();
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dlo = "username".hashCode();
  private boolean dMT = true;
  private boolean dMU = true;
  private boolean dMV = true;
  private boolean dMW = true;
  private boolean dMX = true;
  private boolean dMY = true;
  private boolean dMZ = true;
  private boolean dNa = true;
  private boolean dNb = true;
  private boolean dNc = true;
  private boolean dNd = true;
  private boolean dNe = true;
  private boolean dNf = true;
  private boolean dNg = true;
  private boolean dNh = true;
  private boolean dNi = true;
  private boolean dlm = true;
  public String field_allArticleWording;
  public String field_banReason;
  public String field_bizAccountListStr;
  public long field_cacheTime;
  public String field_decryptUserName;
  public int field_friendSubscribeCount;
  public int field_hiddenAvatar;
  public int field_hiddenButtonBeforeFocus;
  public String field_historyArticlesUrl;
  public String field_messageListStr;
  public String field_newBanReason;
  public int field_originalArticleCount;
  public String field_serviceInfoListStr;
  public int field_showRecommendArticle;
  public int field_showService;
  public int field_userRole;
  public String field_username;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.dlm)
      localContentValues.put("username", this.field_username);
    if (this.dMT)
      localContentValues.put("originalArticleCount", Integer.valueOf(this.field_originalArticleCount));
    if (this.dMU)
      localContentValues.put("friendSubscribeCount", Integer.valueOf(this.field_friendSubscribeCount));
    if (this.dMV)
      localContentValues.put("allArticleWording", this.field_allArticleWording);
    if (this.dMW)
      localContentValues.put("historyArticlesUrl", this.field_historyArticlesUrl);
    if (this.dMX)
      localContentValues.put("userRole", Integer.valueOf(this.field_userRole));
    if (this.dMY)
      localContentValues.put("banReason", this.field_banReason);
    if (this.dMZ)
      localContentValues.put("showRecommendArticle", Integer.valueOf(this.field_showRecommendArticle));
    if (this.dNa)
      localContentValues.put("showService", Integer.valueOf(this.field_showService));
    if (this.dNb)
      localContentValues.put("messageListStr", this.field_messageListStr);
    if (this.dNc)
      localContentValues.put("serviceInfoListStr", this.field_serviceInfoListStr);
    if (this.dNd)
      localContentValues.put("bizAccountListStr", this.field_bizAccountListStr);
    if (this.dNe)
      localContentValues.put("cacheTime", Long.valueOf(this.field_cacheTime));
    if (this.field_decryptUserName == null)
      this.field_decryptUserName = "";
    if (this.dNf)
      localContentValues.put("decryptUserName", this.field_decryptUserName);
    if (this.dNg)
      localContentValues.put("hiddenAvatar", Integer.valueOf(this.field_hiddenAvatar));
    if (this.dNh)
      localContentValues.put("hiddenButtonBeforeFocus", Integer.valueOf(this.field_hiddenButtonBeforeFocus));
    if (this.dNi)
      localContentValues.put("newBanReason", this.field_newBanReason);
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
      if (dlo != k)
        break label62;
      this.field_username = paramCursor.getString(i);
      this.dlm = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dNj == k)
        this.field_originalArticleCount = paramCursor.getInt(i);
      else if (dNk == k)
        this.field_friendSubscribeCount = paramCursor.getInt(i);
      else if (dNl == k)
        this.field_allArticleWording = paramCursor.getString(i);
      else if (dNm == k)
        this.field_historyArticlesUrl = paramCursor.getString(i);
      else if (dNn == k)
        this.field_userRole = paramCursor.getInt(i);
      else if (dNo == k)
        this.field_banReason = paramCursor.getString(i);
      else if (dNp == k)
        this.field_showRecommendArticle = paramCursor.getInt(i);
      else if (dNq == k)
        this.field_showService = paramCursor.getInt(i);
      else if (dNr == k)
        this.field_messageListStr = paramCursor.getString(i);
      else if (dNs == k)
        this.field_serviceInfoListStr = paramCursor.getString(i);
      else if (dNt == k)
        this.field_bizAccountListStr = paramCursor.getString(i);
      else if (dNu == k)
        this.field_cacheTime = paramCursor.getLong(i);
      else if (dNv == k)
        this.field_decryptUserName = paramCursor.getString(i);
      else if (dNw == k)
        this.field_hiddenAvatar = paramCursor.getInt(i);
      else if (dNx == k)
        this.field_hiddenButtonBeforeFocus = paramCursor.getInt(i);
      else if (dNy == k)
        this.field_newBanReason = paramCursor.getString(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.ds
 * JD-Core Version:    0.6.2
 */