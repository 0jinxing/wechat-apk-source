package com.tencent.mm.plugin.exdevice.f.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ci;
import com.tencent.mm.sdk.e.c.a;
import java.lang.reflect.Field;
import java.util.Map;

public final class d extends ci
{
  public static c.a ccO;

  static
  {
    AppMethodBeat.i(19488);
    c.a locala = new c.a();
    locala.xDb = new Field[7];
    locala.columns = new String[8];
    StringBuilder localStringBuilder = new StringBuilder();
    locala.columns[0] = "rankID";
    locala.xDd.put("rankID", "TEXT");
    localStringBuilder.append(" rankID TEXT");
    localStringBuilder.append(", ");
    locala.columns[1] = "appusername";
    locala.xDd.put("appusername", "TEXT");
    localStringBuilder.append(" appusername TEXT");
    localStringBuilder.append(", ");
    locala.columns[2] = "username";
    locala.xDd.put("username", "TEXT");
    localStringBuilder.append(" username TEXT");
    localStringBuilder.append(", ");
    locala.columns[3] = "ranknum";
    locala.xDd.put("ranknum", "INTEGER");
    localStringBuilder.append(" ranknum INTEGER");
    localStringBuilder.append(", ");
    locala.columns[4] = "score";
    locala.xDd.put("score", "INTEGER");
    localStringBuilder.append(" score INTEGER");
    localStringBuilder.append(", ");
    locala.columns[5] = "likecount";
    locala.xDd.put("likecount", "INTEGER default '0' ");
    localStringBuilder.append(" likecount INTEGER default '0' ");
    localStringBuilder.append(", ");
    locala.columns[6] = "selfLikeState";
    locala.xDd.put("selfLikeState", "INTEGER default '3' ");
    localStringBuilder.append(" selfLikeState INTEGER default '3' ");
    locala.columns[7] = "rowid";
    locala.sql = localStringBuilder.toString();
    ccO = locala;
    AppMethodBeat.o(19488);
  }

  public final c.a Ag()
  {
    return ccO;
  }

  public final String toString()
  {
    AppMethodBeat.i(19487);
    String str = "{" + "username: " + this.field_username + " ranknum: " + this.field_ranknum + " score: " + this.field_score;
    str = str + " likeCount:" + this.field_likecount + " selfLikeState:" + this.field_selfLikeState;
    str = str + "}";
    AppMethodBeat.o(19487);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.f.b.a.d
 * JD-Core Version:    0.6.2
 */