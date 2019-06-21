package com.tencent.mm.storage;

import com.tencent.mm.cd.h;
import com.tencent.mm.plugin.messenger.foundation.a.a.o;
import com.tencent.mm.sdk.e.k;

public final class cb extends k
  implements o
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS verifycontact ( id INTEGER PRIMARY KEY, username varchar(40), nickname varchar(40), fullpy varchar(60), shortpy varchar(40), imgflag int, scene int, content text, status int, reserved1 int,reserved2 int,reserved3 text,reserved4 text)", "CREATE UNIQUE INDEX IF NOT EXISTS verifyContactIndex  ON verifycontact ( username )" };
  private h fni;

  public cb(h paramh)
  {
    this.fni = paramh;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.cb
 * JD-Core Version:    0.6.2
 */