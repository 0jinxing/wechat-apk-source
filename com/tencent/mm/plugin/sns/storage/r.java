package com.tencent.mm.plugin.sns.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.data.i;

public final class r
{
  long createTime;
  private int guJ;
  public int offset;
  public int reX;
  private long rfC;
  public int rfD;
  public String rfE;
  private int rfF;
  private long rfG;
  public String rfH;
  public byte[] rfI;
  public int type;
  private String userName;

  public final ContentValues cro()
  {
    AppMethodBeat.i(37976);
    ContentValues localContentValues = new ContentValues();
    localContentValues.put("seqId", Long.valueOf(this.rfC));
    localContentValues.put("type", Integer.valueOf(this.type));
    localContentValues.put("createTime", Long.valueOf(this.createTime));
    localContentValues.put("userName", this.userName);
    localContentValues.put("totallen", Integer.valueOf(this.rfD));
    localContentValues.put("offset", Integer.valueOf(this.offset));
    localContentValues.put("local_flag", Integer.valueOf(this.guJ));
    localContentValues.put("tmp_path", this.rfE);
    localContentValues.put("nums", Integer.valueOf(this.rfF));
    localContentValues.put("try_times", Long.valueOf(this.rfG));
    localContentValues.put("StrId", this.rfH);
    localContentValues.put("upload_buf", this.rfI);
    AppMethodBeat.o(37976);
    return localContentValues;
  }

  public final void crp()
  {
    this.guJ |= 4;
  }

  public final void crq()
  {
    this.guJ &= -5;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(37977);
    this.reX = paramCursor.getInt(0);
    long l = paramCursor.getLong(1);
    this.rfC = l;
    this.rfH = i.jV(l);
    this.type = paramCursor.getInt(2);
    this.createTime = paramCursor.getLong(3);
    this.userName = paramCursor.getString(4);
    this.rfD = paramCursor.getInt(5);
    this.offset = paramCursor.getInt(6);
    this.guJ = paramCursor.getInt(7);
    this.rfE = paramCursor.getString(8);
    this.rfF = paramCursor.getInt(9);
    this.rfG = paramCursor.getLong(10);
    this.rfH = paramCursor.getString(11);
    this.rfI = paramCursor.getBlob(12);
    AppMethodBeat.o(37977);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.r
 * JD-Core Version:    0.6.2
 */