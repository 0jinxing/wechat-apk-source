package com.tencent.mm.plugin.fav.b.a;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abs;
import com.tencent.mm.sdk.platformtools.ab;

final class b$c
{
  String cEV;
  abf cKb;
  long fDy;
  abs mgN;
  int type;
  long updateTime;

  private b$c(b paramb)
  {
  }

  public final void d(Cursor paramCursor)
  {
    AppMethodBeat.i(5306);
    this.fDy = paramCursor.getLong(0);
    this.type = paramCursor.getInt(1);
    this.updateTime = paramCursor.getLong(2);
    this.cEV = paramCursor.getString(3);
    byte[] arrayOfByte = paramCursor.getBlob(4);
    if ((arrayOfByte == null) || (arrayOfByte.length == 0))
    {
      ab.d("MicroMsg.FTS.FTS5SearchFavoriteLogic", "FavIndexItem protoData is null or data length is 0");
      this.cKb = new abf();
      paramCursor = paramCursor.getBlob(5);
      if ((paramCursor != null) && (paramCursor.length != 0))
        break label135;
      this.mgN = null;
      AppMethodBeat.o(5306);
    }
    while (true)
    {
      return;
      this.cKb = ((abf)new abf().parseFrom(arrayOfByte));
      break;
      label135: this.mgN = ((abs)new abs().parseFrom(paramCursor));
      AppMethodBeat.o(5306);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.a.b.c
 * JD-Core Version:    0.6.2
 */