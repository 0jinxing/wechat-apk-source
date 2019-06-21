package com.tencent.mm.plugin.masssend.a;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory.Options;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.cd.h;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.platformtools.x;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.ExifHelper;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vfs.e;

public final class b extends k
{
  public static final String[] fnj = { "CREATE TABLE IF NOT EXISTS massendinfo ( clientid text  PRIMARY KEY , status int  , createtime long  , lastmodifytime long  , filename text  , thumbfilename text  , tolist text  , tolistcount int  , msgtype int  , mediatime int  , datanetoffset int  , datalen int  , thumbnetoffset int  , thumbtotallen int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) ", "CREATE INDEX IF NOT EXISTS  massendinfostatus_index ON massendinfo ( status )" };
  public h fni;

  public b(h paramh)
  {
    this.fni = paramh;
  }

  public static Bitmap Qr(String paramString)
  {
    AppMethodBeat.i(22726);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      AppMethodBeat.o(22726);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.trim();
      StringBuilder localStringBuilder = new StringBuilder();
      aw.ZK();
      paramString = x.vv(c.XW() + paramString);
      AppMethodBeat.o(22726);
    }
  }

  public static String a(a parama)
  {
    AppMethodBeat.i(22728);
    switch (parama.msgType)
    {
    default:
      parama = ah.getContext().getResources().getString(2131298580);
      AppMethodBeat.o(22728);
    case 1:
    case 3:
    case 34:
    case 43:
    }
    while (true)
    {
      return parama;
      parama = parama.bNw();
      AppMethodBeat.o(22728);
      continue;
      parama = ah.getContext().getResources().getString(2131297012);
      AppMethodBeat.o(22728);
      continue;
      parama = ah.getContext().getResources().getString(2131297079);
      AppMethodBeat.o(22728);
      continue;
      parama = ah.getContext().getResources().getString(2131297076);
      AppMethodBeat.o(22728);
    }
  }

  public static Bitmap g(String paramString, float paramFloat)
  {
    AppMethodBeat.i(22725);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      paramString = null;
      AppMethodBeat.o(22725);
    }
    while (true)
    {
      return paramString;
      paramString = paramString.trim();
      Object localObject = new StringBuilder();
      aw.ZK();
      localObject = BackwardSupportUtil.b.i(c.XW() + paramString, paramFloat);
      paramString = (String)localObject;
      if (localObject != null)
        paramString = Bitmap.createScaledBitmap((Bitmap)localObject, (int)(((Bitmap)localObject).getWidth() * paramFloat), (int)(((Bitmap)localObject).getHeight() * paramFloat), true);
      AppMethodBeat.o(22725);
    }
  }

  public static a i(String paramString1, String paramString2, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(22727);
    if (!e.ct(paramString1))
    {
      paramString1 = null;
      AppMethodBeat.o(22727);
    }
    while (true)
    {
      return paramString1;
      aw.ZK();
      String str1 = c.XW();
      int i = BackwardSupportUtil.ExifHelper.bJ(paramString1);
      String str2 = g.x((paramString1 + System.currentTimeMillis()).getBytes());
      ab.d("MicroMsg.MasSendInfoStorage", "insert : original img path = ".concat(String.valueOf(paramString1)));
      Object localObject = d.amj(paramString1);
      if ((paramInt2 == 0) && ((e.asZ(paramString1) > 204800L) || ((localObject != null) && ((((BitmapFactory.Options)localObject).outHeight > 960) || (((BitmapFactory.Options)localObject).outWidth > 960)))))
      {
        if (!d.a(paramString1, 960, 960, Bitmap.CompressFormat.JPEG, 70, str1, str2))
        {
          paramString1 = null;
          AppMethodBeat.o(22727);
        }
        else
        {
          e.h(str1, str2, str2 + ".jpg");
        }
      }
      else
      {
        while (true)
        {
          localObject = str2 + ".jpg";
          ab.d("MicroMsg.MasSendInfoStorage", "insert: compressed bigImgPath = ".concat(String.valueOf(localObject)));
          if ((paramInt2 != 0) || (i == 0) || (d.a(str1 + (String)localObject, i, Bitmap.CompressFormat.JPEG, str1, str2 + ".jpg")))
            break label345;
          paramString1 = null;
          AppMethodBeat.o(22727);
          break;
          localObject = str1 + str2 + ".jpg";
          paramString1 = e.e(paramString1, 0, -1);
          e.a((String)localObject, paramString1, paramString1.length);
        }
        label345: str2 = g.x(((String)localObject + System.currentTimeMillis()).getBytes());
        if (!d.a(str1 + (String)localObject, 120, 120, Bitmap.CompressFormat.JPEG, 90, str1, str2))
        {
          paramString1 = null;
          AppMethodBeat.o(22727);
        }
        else
        {
          ab.d("MicroMsg.MasSendInfoStorage", "insert: thumbName = ".concat(String.valueOf(str2)));
          paramString1 = new a();
          paramString1.msgType = 3;
          paramString1.onZ = paramString2;
          paramString1.ooa = paramInt1;
          paramString1.onY = str2;
          paramString1.filename = ((String)localObject);
          AppMethodBeat.o(22727);
        }
      }
    }
  }

  public final a Qs(String paramString)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    AppMethodBeat.i(22729);
    paramString = "select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   where massendinfo.clientid = \"" + bo.vA(String.valueOf(paramString)) + "\"";
    Cursor localCursor = this.fni.a(paramString, null, 2);
    if (localCursor == null)
    {
      AppMethodBeat.o(22729);
      paramString = localObject2;
    }
    while (true)
    {
      return paramString;
      paramString = localObject1;
      if (localCursor.moveToFirst())
      {
        paramString = new a();
        paramString.d(localCursor);
      }
      localCursor.close();
      AppMethodBeat.o(22729);
    }
  }

  public final int bNz()
  {
    int i = 0;
    AppMethodBeat.i(22724);
    Cursor localCursor = this.fni.a("SELECT count(*) FROM massendinfo", null, 2);
    if (localCursor.moveToFirst())
      i = localCursor.getInt(0);
    localCursor.close();
    AppMethodBeat.o(22724);
    return i;
  }

  public final Cursor xm(int paramInt)
  {
    AppMethodBeat.i(22723);
    Object localObject = "select massendinfo.clientid,massendinfo.status,massendinfo.createtime,massendinfo.lastmodifytime,massendinfo.filename,massendinfo.thumbfilename,massendinfo.tolist,massendinfo.tolistcount,massendinfo.msgtype,massendinfo.mediatime,massendinfo.datanetoffset,massendinfo.datalen,massendinfo.thumbnetoffset,massendinfo.thumbtotallen,massendinfo.reserved1,massendinfo.reserved2,massendinfo.reserved3,massendinfo.reserved4 from massendinfo   ORDER BY createtime ASC  LIMIT " + paramInt + " offset (SELECT count(*) FROM massendinfo ) -" + paramInt;
    ab.v("MicroMsg.MasSendInfoStorage", "getCursor sql:".concat(String.valueOf(localObject)));
    localObject = this.fni.a((String)localObject, null, 0);
    AppMethodBeat.o(22723);
    return localObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.a.b
 * JD-Core Version:    0.6.2
 */