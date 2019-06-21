package com.tencent.mm.plugin.sns.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ej;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;
import java.util.Map;

public final class j extends ej
{
  protected static c.a ccO;
  public int rfb;

  static
  {
    AppMethodBeat.i(37842);
    c.a locala = new c.a();
    locala.xDb = new Field[13];
    locala.columns = new String[14];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "snsID";
    locala.xDd.put("snsID", "LONG");
    localStringBuilder.append(" snsID LONG");
    localStringBuilder.append(", ");
    locala.columns[1] = "parentID";
    locala.xDd.put("parentID", "LONG");
    localStringBuilder.append(" parentID LONG");
    localStringBuilder.append(", ");
    locala.columns[2] = "isRead";
    locala.xDd.put("isRead", "SHORT default '0' ");
    localStringBuilder.append(" isRead SHORT default '0' ");
    localStringBuilder.append(", ");
    locala.columns[3] = "createTime";
    locala.xDd.put("createTime", "INTEGER");
    localStringBuilder.append(" createTime INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "talker";
    locala.xDd.put("talker", "TEXT");
    localStringBuilder.append(" talker TEXT");
    localStringBuilder.append(", ");
    locala.columns[5] = "type";
    locala.xDd.put("type", "INTEGER");
    localStringBuilder.append(" type INTEGER");
    localStringBuilder.append(", ");
    locala.columns[6] = "isSend";
    locala.xDd.put("isSend", "INTEGER default 'false' ");
    localStringBuilder.append(" isSend INTEGER default 'false' ");
    localStringBuilder.append(", ");
    locala.columns[7] = "curActionBuf";
    locala.xDd.put("curActionBuf", "BLOB");
    localStringBuilder.append(" curActionBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[8] = "refActionBuf";
    locala.xDd.put("refActionBuf", "BLOB");
    localStringBuilder.append(" refActionBuf BLOB");
    localStringBuilder.append(", ");
    locala.columns[9] = "commentSvrID";
    locala.xDd.put("commentSvrID", "LONG");
    localStringBuilder.append(" commentSvrID LONG");
    localStringBuilder.append(", ");
    locala.columns[10] = "clientId";
    locala.xDd.put("clientId", "TEXT");
    localStringBuilder.append(" clientId TEXT");
    localStringBuilder.append(", ");
    locala.columns[11] = "commentflag";
    locala.xDd.put("commentflag", "INTEGER");
    localStringBuilder.append(" commentflag INTEGER");
    localStringBuilder.append(", ");
    locala.columns[12] = "isSilence";
    locala.xDd.put("isSilence", "INTEGER default '0' ");
    localStringBuilder.append(" isSilence INTEGER default '0' ");
    locala.columns[13] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(37842);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final void cqD()
  {
    this.field_commentflag |= 1;
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(37841);
    try
    {
      super.d(paramCursor);
      this.rfb = ((int)this.xDa);
      AppMethodBeat.o(37841);
      return;
    }
    catch (Exception localException)
    {
      while (true)
      {
        paramCursor = localException.getMessage();
        ab.e("MicroMsg.SnsComment", "error ".concat(String.valueOf(paramCursor)));
        if ((paramCursor != null) && (paramCursor.contains("Unable to convert")))
          af.cnK().cqH();
        try
        {
          AppMethodBeat.o(37841);
          throw localException;
        }
        catch (Exception paramCursor)
        {
          ab.printErrStackTrace("MicroMsg.SnsComment", paramCursor, "", new Object[0]);
          AppMethodBeat.o(37841);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.storage.j
 * JD-Core Version:    0.6.2
 */