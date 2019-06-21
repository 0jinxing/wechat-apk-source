package com.tencent.mm.ah;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.memory.a.c;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;
import junit.framework.Assert;

public final class i extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS img_flag ( username VARCHAR(40) PRIMARY KEY , imgflag int , lastupdatetime int , reserved1 text ,reserved2 text ,reserved3 int ,reserved4 int )", "CREATE INDEX IF NOT EXISTS img_flag_small_url_index ON img_flag ( reserved2 )" };
  com.tencent.mm.cd.h fni;
  final f<String, h> frZ;

  public i(com.tencent.mm.cd.h paramh)
  {
    AppMethodBeat.i(77923);
    this.frZ = new c(800);
    this.fni = paramh;
    AppMethodBeat.o(77923);
  }

  private boolean c(h paramh)
  {
    boolean bool1 = true;
    AppMethodBeat.i(77927);
    if ((paramh != null) && (paramh.getUsername() != null))
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      paramh.frU = ((int)(System.currentTimeMillis() / 1000L));
      paramh.acm();
      paramh.bJt = -1;
      ContentValues localContentValues = paramh.acj();
      if ((int)this.fni.insert("img_flag", "username", localContentValues) < 0)
        break label99;
    }
    label99: for (boolean bool2 = bool1; ; bool2 = false)
    {
      if (bool2)
        b(paramh.getUsername(), 2, paramh.getUsername());
      AppMethodBeat.o(77927);
      return bool2;
      bool2 = false;
      break;
    }
  }

  private boolean d(h paramh)
  {
    boolean bool1 = true;
    AppMethodBeat.i(77928);
    if ((paramh != null) && (paramh.getUsername() != null))
    {
      bool2 = true;
      Assert.assertTrue(bool2);
      paramh.frU = ((int)(System.currentTimeMillis() / 1000L));
      paramh.bJt |= 4;
      ContentValues localContentValues = paramh.acj();
      if (this.fni.update("img_flag", localContentValues, "username=?", new String[] { paramh.getUsername() }) <= 0)
        break label123;
    }
    label123: for (boolean bool2 = bool1; ; bool2 = false)
    {
      if (bool2)
        b(paramh.getUsername(), 3, paramh.getUsername());
      AppMethodBeat.o(77928);
      return bool2;
      bool2 = false;
      break;
    }
  }

  public final boolean aa(List<h> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(77926);
    if (paramList.size() == 0)
      AppMethodBeat.o(77926);
    while (true)
    {
      return bool;
      long l = this.fni.iV(Thread.currentThread().getId());
      int i = 0;
      try
      {
        while (i < paramList.size())
        {
          b((h)paramList.get(i));
          i++;
        }
        bool = true;
        this.fni.mB(l);
        AppMethodBeat.o(77926);
      }
      catch (Exception paramList)
      {
        while (true)
        {
          ab.e("MicroMsg.ImgFlagStorage", paramList.getMessage());
          bool = false;
        }
      }
    }
  }

  public final boolean b(h paramh)
  {
    AppMethodBeat.i(77925);
    ab.i("MicroMsg.ImgFlagStorage", "new smallImageUrl = %s, bigImageUrl = %s", new Object[] { paramh.acl(), paramh.ack() });
    h localh = qo(paramh.getUsername());
    boolean bool;
    if (localh == null)
    {
      this.frZ.k(paramh.getUsername(), paramh);
      bool = c(paramh);
      AppMethodBeat.o(77925);
    }
    while (true)
    {
      return bool;
      ab.i("MicroMsg.ImgFlagStorage", "old, smallImageUrl = %s, bigImageUrl = %s", new Object[] { localh.acl(), localh.ack() });
      this.frZ.remove(paramh.getUsername());
      bool = d(paramh);
      AppMethodBeat.o(77925);
    }
  }

  public final h qo(String paramString)
  {
    AppMethodBeat.i(77924);
    Object localObject = (h)this.frZ.ai(paramString);
    if ((localObject != null) && (((h)localObject).getUsername().equals(paramString)))
      AppMethodBeat.o(77924);
    Cursor localCursor;
    while (true)
    {
      return localObject;
      localObject = "select img_flag.username,img_flag.imgflag,img_flag.lastupdatetime,img_flag.reserved1,img_flag.reserved2,img_flag.reserved3,img_flag.reserved4 from img_flag where img_flag.username=\"" + bo.vA(paramString) + "\"";
      localCursor = this.fni.a((String)localObject, null, 2);
      if (localCursor != null)
        break;
      AppMethodBeat.o(77924);
      localObject = null;
    }
    if (localCursor.moveToFirst())
    {
      localObject = new h();
      ((h)localObject).d(localCursor);
    }
    while (true)
    {
      localCursor.close();
      this.frZ.k(paramString, localObject);
      AppMethodBeat.o(77924);
      break;
      localObject = null;
    }
  }

  public final void qp(String paramString)
  {
    AppMethodBeat.i(77929);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(77929);
    while (true)
    {
      return;
      this.frZ.remove(paramString);
      this.fni.delete("img_flag", "username=?", new String[] { String.valueOf(paramString) });
      AppMethodBeat.o(77929);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ah.i
 * JD-Core Version:    0.6.2
 */