package com.tencent.mm.plugin.bottle.a;

import android.content.Context;
import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.r;
import com.tencent.mm.model.s;
import com.tencent.mm.modelvoice.n;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.RegionCodeDecoder;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bi;
import com.tencent.mm.vfs.e;

public final class c
{
  private static int jJK = 1;
  private static int jJL = 1;

  public static void FA(String paramString)
  {
    a locala = null;
    AppMethodBeat.i(18534);
    com.tencent.mm.plugin.bottle.a.gkF.BS();
    aw.ZK();
    if (com.tencent.mm.model.c.XO().Rp(paramString) != 1)
      AppMethodBeat.o(18534);
    bi localbi;
    while (true)
    {
      return;
      aw.ZK();
      localbi = com.tencent.mm.model.c.XO().Rb(paramString);
      if ((localbi == null) || (!localbi.field_talker.equals(paramString)))
      {
        AppMethodBeat.o(18534);
      }
      else
      {
        String str = Fz(paramString);
        if (bo.isNullOrNil(str))
        {
          AppMethodBeat.o(18534);
        }
        else
        {
          b localb = d.aVM();
          localObject = "select bottleinfo1.parentclientid,bottleinfo1.childcount,bottleinfo1.bottleid,bottleinfo1.bottletype,bottleinfo1.msgtype,bottleinfo1.voicelen,bottleinfo1.content,bottleinfo1.createtime,bottleinfo1.reserved1,bottleinfo1.reserved2,bottleinfo1.reserved3,bottleinfo1.reserved4 from bottleinfo1   where bottleinfo1.bottleid = \"" + bo.vA(String.valueOf(str)) + "\"";
          localObject = localb.fni.a((String)localObject, null, 0);
          if (localObject == null)
          {
            locala = null;
            label154: if (locala != null)
              if (locala.jJG != null)
                break label365;
          }
          label365: for (localObject = ""; ; localObject = locala.jJG)
          {
            if (((String)localObject).equals(str))
              break label374;
            AppMethodBeat.o(18534);
            break;
            if (((Cursor)localObject).moveToFirst())
            {
              locala = new a();
              locala.jJE = ((Cursor)localObject).getString(0);
              locala.jJF = ((Cursor)localObject).getInt(1);
              locala.jJG = ((Cursor)localObject).getString(2);
              locala.jJH = ((Cursor)localObject).getInt(3);
              locala.msgType = ((Cursor)localObject).getInt(4);
              locala.jJI = ((Cursor)localObject).getInt(5);
              locala.content = ((Cursor)localObject).getString(6);
              locala.jJJ = ((Cursor)localObject).getLong(7);
              locala.fne = ((Cursor)localObject).getInt(8);
              locala.fCx = ((Cursor)localObject).getInt(9);
              locala.fng = ((Cursor)localObject).getString(10);
              locala.fnh = ((Cursor)localObject).getString(11);
            }
            ((Cursor)localObject).close();
            break label154;
          }
          label374: if (locala.jJH == 1)
            break;
          AppMethodBeat.o(18534);
        }
      }
    }
    Object localObject = new bi();
    ((bi)localObject).ju(paramString);
    long l;
    label426: int i;
    if (localbi.field_createTime <= locala.jJJ)
    {
      l = localbi.field_createTime - 1L;
      ((bi)localObject).eJ(l);
      switch (locala.msgType)
      {
      default:
        i = -1;
      case 1:
      case 2:
      case 3:
      case 4:
      }
    }
    while (true)
    {
      ((bi)localObject).setType(i);
      ((bi)localObject).setStatus(2);
      ((bi)localObject).hO(1);
      if (((bi)localObject).getType() != 34)
        break label658;
      ((bi)localObject).setContent(n.d(r.Yz(), locala.jJI, false));
      paramString = locala.getContent() + bo.anU();
      if (e.y(q.getFullPath(locala.getContent()), q.getFullPath(paramString)) >= 0L)
        break label628;
      ab.e("MicroMsg.BottleLogic", "Copy Bottle Voice File Failed :" + locala.getContent());
      AppMethodBeat.o(18534);
      break;
      l = locala.jJJ;
      break label426;
      i = 1;
      continue;
      i = 3;
      continue;
      i = 34;
      continue;
      i = 43;
    }
    label628: ((bi)localObject).jv(paramString);
    while (true)
    {
      aw.ZK();
      com.tencent.mm.model.c.XO().Z((bi)localObject);
      AppMethodBeat.o(18534);
      break;
      label658: ((bi)localObject).setContent(locala.getContent());
    }
  }

  public static String Fz(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(18533);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(18533);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      paramString = paramString.split("@bottle:");
      if ((paramString == null) || (paramString.length < 2))
      {
        AppMethodBeat.o(18533);
        paramString = localObject;
      }
      else
      {
        paramString = paramString[1];
        AppMethodBeat.o(18533);
      }
    }
  }

  public static String a(Context paramContext, ad paramad)
  {
    AppMethodBeat.i(18536);
    if (paramad == null)
    {
      paramContext = paramContext.getString(2131297739);
      AppMethodBeat.o(18536);
    }
    while (true)
    {
      return paramContext;
      if (RegionCodeDecoder.apQ(paramad.getCountryCode()))
      {
        paramContext = paramad.getCity();
        if (!bo.isNullOrNil(paramContext))
        {
          AppMethodBeat.o(18536);
        }
        else
        {
          paramContext = s.mL(paramad.getProvince());
          if (!bo.isNullOrNil(paramContext))
          {
            AppMethodBeat.o(18536);
          }
          else
          {
            RegionCodeDecoder.duj();
            paramContext = RegionCodeDecoder.getLocName(paramad.getCountryCode());
            AppMethodBeat.o(18536);
          }
        }
      }
      else
      {
        paramContext = paramContext.getString(2131297739);
        AppMethodBeat.o(18536);
      }
    }
  }

  public static void aVK()
  {
    AppMethodBeat.i(18535);
    b localb = d.aVM();
    long l = bo.anU() - 7776000000L;
    Object localObject = "select distinct content , msgtype from bottleinfo1 where bottleinfo1.createtime < ".concat(String.valueOf(l));
    Cursor localCursor = localb.fni.a((String)localObject, null, 0);
    int i = localCursor.getCount();
    int j;
    if (i > 0)
    {
      String[] arrayOfString = new String[i];
      j = 0;
      localObject = arrayOfString;
      if (j < i)
      {
        localCursor.moveToPosition(j);
        if (localCursor.getInt(1) == 3)
          arrayOfString[j] = localCursor.getString(0);
        while (true)
        {
          j++;
          break;
          arrayOfString[j] = null;
        }
      }
    }
    else
    {
      localObject = null;
    }
    localCursor.close();
    if (i > 0)
      localb.fni.delete("bottleinfo1", "createtime< ?", new String[] { String.valueOf(l) });
    if (localObject == null)
      AppMethodBeat.o(18535);
    while (true)
    {
      return;
      for (j = 0; j < localObject.length; j++)
      {
        ab.d("MicroMsg.BottleLogic", "delete path:" + q.getFullPath(localObject[j]));
        if (!bo.isNullOrNil(q.getFullPath(localObject[j])))
          e.deleteFile(q.getFullPath(localObject[j]));
      }
      AppMethodBeat.o(18535);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bottle.a.c
 * JD-Core Version:    0.6.2
 */