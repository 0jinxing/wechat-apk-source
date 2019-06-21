package com.tencent.mm.g.c;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.mm.sdk.e.c;

public abstract class am extends c
{
  public static final String[] diI = new String[0];
  private static final int diR = "rowid".hashCode();
  private static final int dsB = "chatroomname".hashCode();
  private static final int dsC = "addtime".hashCode();
  private static final int dsD = "memberlist".hashCode();
  private static final int dsE = "displayname".hashCode();
  private static final int dsF = "chatroomnick".hashCode();
  private static final int dsG = "roomflag".hashCode();
  private static final int dsH = "roomowner".hashCode();
  private static final int dsI = "roomdata".hashCode();
  private static final int dsJ = "isShowname".hashCode();
  private static final int dsK = "selfDisplayName".hashCode();
  private static final int dsL = "style".hashCode();
  private static final int dsM = "chatroomdataflag".hashCode();
  private static final int dsN = "modifytime".hashCode();
  private static final int dsO = "chatroomnotice".hashCode();
  private static final int dsP = "chatroomVersion".hashCode();
  private static final int dsQ = "chatroomnoticeEditor".hashCode();
  private static final int dsR = "chatroomnoticePublishTime".hashCode();
  private static final int dsS = "chatroomLocalVersion".hashCode();
  private static final int dsT = "chatroomStatus".hashCode();
  private static final int dsU = "memberCount".hashCode();
  private boolean dsA = true;
  private boolean dsg = true;
  private boolean dsh = true;
  private boolean dsi = true;
  private boolean dsj = true;
  private boolean dsk = true;
  private boolean dsl = true;
  private boolean dsm = true;
  private boolean dsn = true;
  private boolean dso = true;
  private boolean dsp = true;
  private boolean dsq = true;
  private boolean dsr = true;
  private boolean dss = true;
  private boolean dsu = true;
  private boolean dsv = true;
  private boolean dsw = true;
  private boolean dsx = true;
  private boolean dsy = true;
  private boolean dsz = true;
  public long field_addtime;
  public long field_chatroomLocalVersion;
  public int field_chatroomStatus;
  public int field_chatroomVersion;
  public int field_chatroomdataflag;
  public String field_chatroomname;
  public String field_chatroomnick;
  public String field_chatroomnotice;
  public String field_chatroomnoticeEditor;
  public long field_chatroomnoticePublishTime;
  public String field_displayname;
  public int field_isShowname;
  public int field_memberCount;
  public String field_memberlist;
  public long field_modifytime;
  public byte[] field_roomdata;
  public int field_roomflag;
  public String field_roomowner;
  public String field_selfDisplayName;
  public int field_style;

  public final ContentValues Hl()
  {
    ContentValues localContentValues = new ContentValues();
    if (this.field_chatroomname == null)
      this.field_chatroomname = "";
    if (this.dsg)
      localContentValues.put("chatroomname", this.field_chatroomname);
    if (this.dsh)
      localContentValues.put("addtime", Long.valueOf(this.field_addtime));
    if (this.dsi)
      localContentValues.put("memberlist", this.field_memberlist);
    if (this.dsj)
      localContentValues.put("displayname", this.field_displayname);
    if (this.dsk)
      localContentValues.put("chatroomnick", this.field_chatroomnick);
    if (this.dsl)
      localContentValues.put("roomflag", Integer.valueOf(this.field_roomflag));
    if (this.dsm)
      localContentValues.put("roomowner", this.field_roomowner);
    if (this.dsn)
      localContentValues.put("roomdata", this.field_roomdata);
    if (this.dso)
      localContentValues.put("isShowname", Integer.valueOf(this.field_isShowname));
    if (this.dsp)
      localContentValues.put("selfDisplayName", this.field_selfDisplayName);
    if (this.dsq)
      localContentValues.put("style", Integer.valueOf(this.field_style));
    if (this.dsr)
      localContentValues.put("chatroomdataflag", Integer.valueOf(this.field_chatroomdataflag));
    if (this.dss)
      localContentValues.put("modifytime", Long.valueOf(this.field_modifytime));
    if (this.dsu)
      localContentValues.put("chatroomnotice", this.field_chatroomnotice);
    if (this.dsv)
      localContentValues.put("chatroomVersion", Integer.valueOf(this.field_chatroomVersion));
    if (this.dsw)
      localContentValues.put("chatroomnoticeEditor", this.field_chatroomnoticeEditor);
    if (this.dsx)
      localContentValues.put("chatroomnoticePublishTime", Long.valueOf(this.field_chatroomnoticePublishTime));
    if (this.dsy)
      localContentValues.put("chatroomLocalVersion", Long.valueOf(this.field_chatroomLocalVersion));
    if (this.dsz)
      localContentValues.put("chatroomStatus", Integer.valueOf(this.field_chatroomStatus));
    if (this.dsA)
      localContentValues.put("memberCount", Integer.valueOf(this.field_memberCount));
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
      if (dsB != k)
        break label62;
      this.field_chatroomname = paramCursor.getString(i);
      this.dsg = true;
    }
    while (true)
    {
      i++;
      break label18;
      break;
      label62: if (dsC == k)
        this.field_addtime = paramCursor.getLong(i);
      else if (dsD == k)
        this.field_memberlist = paramCursor.getString(i);
      else if (dsE == k)
        this.field_displayname = paramCursor.getString(i);
      else if (dsF == k)
        this.field_chatroomnick = paramCursor.getString(i);
      else if (dsG == k)
        this.field_roomflag = paramCursor.getInt(i);
      else if (dsH == k)
        this.field_roomowner = paramCursor.getString(i);
      else if (dsI == k)
        this.field_roomdata = paramCursor.getBlob(i);
      else if (dsJ == k)
        this.field_isShowname = paramCursor.getInt(i);
      else if (dsK == k)
        this.field_selfDisplayName = paramCursor.getString(i);
      else if (dsL == k)
        this.field_style = paramCursor.getInt(i);
      else if (dsM == k)
        this.field_chatroomdataflag = paramCursor.getInt(i);
      else if (dsN == k)
        this.field_modifytime = paramCursor.getLong(i);
      else if (dsO == k)
        this.field_chatroomnotice = paramCursor.getString(i);
      else if (dsP == k)
        this.field_chatroomVersion = paramCursor.getInt(i);
      else if (dsQ == k)
        this.field_chatroomnoticeEditor = paramCursor.getString(i);
      else if (dsR == k)
        this.field_chatroomnoticePublishTime = paramCursor.getLong(i);
      else if (dsS == k)
        this.field_chatroomLocalVersion = paramCursor.getLong(i);
      else if (dsT == k)
        this.field_chatroomStatus = paramCursor.getInt(i);
      else if (dsU == k)
        this.field_memberCount = paramCursor.getInt(i);
      else if (diR == k)
        this.xDa = paramCursor.getLong(i);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.g.c.am
 * JD-Core Version:    0.6.2
 */