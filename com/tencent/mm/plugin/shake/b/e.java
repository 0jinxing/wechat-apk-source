package com.tencent.mm.plugin.shake.b;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.e.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e extends j<d>
{
  public static final String[] fnj;
  public com.tencent.mm.sdk.e.e bSd;

  static
  {
    AppMethodBeat.i(24452);
    fnj = new String[] { j.a(d.ccO, "shakeitem1") };
    AppMethodBeat.o(24452);
  }

  public e(com.tencent.mm.sdk.e.e parame)
  {
    super(parame, d.ccO, "shakeitem1", null);
    AppMethodBeat.i(24434);
    this.bSd = parame;
    ab.d("MicroMsg.NewShakeItemStorage", "ShakeItemStorage");
    parame.hY("shakeitem1", "DROP INDEX IF EXISTS shakeItemUsernameIndex ");
    parame.hY("shakeitem1", "CREATE INDEX IF NOT EXISTS shakeItemNewUsernameIndex ON shakeitem1 ( username )");
    AppMethodBeat.o(24434);
  }

  public final Cursor Cs(int paramInt)
  {
    AppMethodBeat.i(24442);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc limit ? ", new String[] { "11", String.valueOf(paramInt) });
    AppMethodBeat.o(24442);
    return localCursor;
  }

  public final int Ct(int paramInt)
  {
    AppMethodBeat.i(24446);
    int i = this.bSd.delete("shakeitem1", "shakeItemID=?", new String[] { String.valueOf(paramInt) });
    doNotify();
    ab.i("MicroMsg.NewShakeItemStorage", "delById id:" + paramInt + " result:" + i);
    AppMethodBeat.o(24446);
    return i;
  }

  public final boolean Cu(int paramInt)
  {
    AppMethodBeat.i(24448);
    if (paramInt == 0);
    for (boolean bool = this.bSd.hY("shakeitem1", "delete from shakeitem1 where type = " + paramInt + " or type is null"); ; bool = this.bSd.hY("shakeitem1", "delete from shakeitem1 where type = ".concat(String.valueOf(paramInt))))
    {
      doNotify();
      AppMethodBeat.o(24448);
      return bool;
    }
  }

  public final int WC(String paramString)
  {
    AppMethodBeat.i(24447);
    int i = this.bSd.delete("shakeitem1", "(username=?)", new String[] { String.valueOf(paramString) });
    if (i > 0)
      doNotify();
    ab.i("MicroMsg.NewShakeItemStorage", "delByusername:" + paramString + " result:" + i);
    AppMethodBeat.o(24447);
    return i;
  }

  public final boolean a(d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(24445);
    if (paramd == null)
    {
      paramBoolean = false;
      AppMethodBeat.o(24445);
    }
    while (true)
    {
      return paramBoolean;
      if ((!paramBoolean) && (!bo.isNullOrNil(paramd.field_username)))
        WC(paramd.field_username);
      paramd.bJt = -1;
      paramBoolean = super.b(paramd);
      AppMethodBeat.o(24445);
    }
  }

  public final Cursor cjA()
  {
    AppMethodBeat.i(24437);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", new String[] { "0" });
    AppMethodBeat.o(24437);
    return localCursor;
  }

  public final Cursor cjB()
  {
    AppMethodBeat.i(24438);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by shakeItemID desc ", new String[] { "4" });
    AppMethodBeat.o(24438);
    return localCursor;
  }

  public final Cursor cjC()
  {
    AppMethodBeat.i(24439);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", new String[] { "4", "2" });
    AppMethodBeat.o(24439);
    return localCursor;
  }

  public final Cursor cjD()
  {
    AppMethodBeat.i(24440);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type in (?, ?, ?, ?, ?) order by shakeItemID desc ", new String[] { "7", "6", "8", "9", "10", "12" });
    AppMethodBeat.o(24440);
    return localCursor;
  }

  public final Cursor cjE()
  {
    AppMethodBeat.i(24441);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by shakeItemID desc ", new String[] { "8", "2" });
    AppMethodBeat.o(24441);
    return localCursor;
  }

  public final Cursor cjF()
  {
    AppMethodBeat.i(24443);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by reserved2 desc, shakeItemID desc ", new String[] { "11" });
    AppMethodBeat.o(24443);
    return localCursor;
  }

  public final d cjG()
  {
    AppMethodBeat.i(24444);
    d locald = new d();
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   order by shakeItemID desc limit 1", new String[0]);
    if (localCursor.getCount() != 0)
    {
      localCursor.moveToFirst();
      locald.d(localCursor);
    }
    localCursor.close();
    AppMethodBeat.o(24444);
    return locald;
  }

  public final boolean cjH()
  {
    AppMethodBeat.i(24449);
    boolean bool = this.bSd.hY("shakeitem1", "delete from shakeitem1");
    doNotify();
    AppMethodBeat.o(24449);
    return bool;
  }

  public final void cjI()
  {
    AppMethodBeat.i(24450);
    ab.i("MicroMsg.NewShakeItemStorage", "setAllOld");
    d locald = new d();
    locald.field_insertBatch = 0;
    locald.bJt = 1024;
    if (-1 != this.bSd.update("shakeitem1", locald.Hl(), "insertBatch!=?", new String[] { "0" }))
      doNotify();
    AppMethodBeat.o(24450);
  }

  public final Cursor cjy()
  {
    AppMethodBeat.i(24435);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   order by shakeItemID desc ", new String[0]);
    AppMethodBeat.o(24435);
    return localCursor;
  }

  public final Cursor cjz()
  {
    AppMethodBeat.i(24436);
    Cursor localCursor = rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? and insertBatch = ?  order by reserved2 desc, shakeItemID desc ", new String[] { "0", "2" });
    AppMethodBeat.o(24436);
    return localCursor;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.b.e
 * JD-Core Version:    0.6.2
 */