package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.m.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class ad extends com.tencent.mm.n.a
  implements Cloneable
{
  public CharSequence xHQ;
  public String xXc = null;

  public ad()
  {
  }

  public ad(String paramString)
  {
    super(paramString);
  }

  public static boolean Mn(int paramInt)
  {
    if ((paramInt & 0x8) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean aoA(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(60115);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.Contact", "Contact invisibleUsername username == null or nil");
      AppMethodBeat.o(60115);
    }
    while (true)
    {
      return bool;
      if (aox(paramString))
      {
        AppMethodBeat.o(60115);
        bool = true;
      }
      else
      {
        Object localObject = ((com.tencent.mm.plugin.zero.b.a)g.K(com.tencent.mm.plugin.zero.b.a.class)).Nv().O("HideWechatID", "idprefix");
        if (localObject != null)
        {
          localObject = ((String)localObject).split(";");
          for (int i = 0; ; i++)
          {
            if (i >= localObject.length)
              break label117;
            if ((localObject[i] != null) && (paramString.startsWith(localObject[i])))
            {
              AppMethodBeat.o(60115);
              bool = true;
              break;
            }
          }
        }
        label117: AppMethodBeat.o(60115);
      }
    }
  }

  public static boolean aoB(String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(60116);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(60116);
    while (true)
    {
      return bool;
      String[] arrayOfString = "wx_;wxid_;gh_;a0;a1;a2;a3;a4;a5;a6;a7;a8;a9;q0;q1;q2;q3;q4;q5;q6;q7;q8;q9;qq0;qq1;qq2;qq3;qq4;qq5;qq6;qq7;qq8;qq9;f0;f1;f2;f3;f4;f5;f6;f7;f8;f9;F0;F1;F2;F3;F4;F5;F6;F7;F8;F9;".split(";");
      int i = arrayOfString.length;
      for (int j = 0; ; j++)
      {
        if (j >= i)
          break label78;
        String str = arrayOfString[j];
        if ((!bo.isNullOrNil(str)) && (paramString.startsWith(str)))
        {
          AppMethodBeat.o(60116);
          break;
        }
      }
      label78: AppMethodBeat.o(60116);
      bool = false;
    }
  }

  public static String aoC(String paramString)
  {
    AppMethodBeat.i(60117);
    String[] arrayOfString;
    if (mR(paramString))
    {
      arrayOfString = paramString.split(":");
      if ((arrayOfString == null) || (arrayOfString.length <= 0))
        AppMethodBeat.o(60117);
    }
    while (true)
    {
      return paramString;
      paramString = arrayOfString[0];
      AppMethodBeat.o(60117);
      continue;
      if ((paramString != null) && (paramString.contains("@")))
      {
        paramString = "";
        AppMethodBeat.o(60117);
      }
      else
      {
        paramString = paramString + "@bottle";
        AppMethodBeat.o(60117);
      }
    }
  }

  public static boolean aou(String paramString)
  {
    AppMethodBeat.i(60107);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.endsWith("@t.qq.com");
      AppMethodBeat.o(60107);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60107);
    }
  }

  public static boolean aov(String paramString)
  {
    AppMethodBeat.i(60108);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.endsWith("@qr");
      AppMethodBeat.o(60108);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60108);
    }
  }

  public static boolean aow(String paramString)
  {
    AppMethodBeat.i(60109);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.endsWith("@qqim");
      AppMethodBeat.o(60109);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60109);
    }
  }

  public static boolean aox(String paramString)
  {
    AppMethodBeat.i(60110);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.endsWith("@openim");
      AppMethodBeat.o(60110);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60110);
    }
  }

  public static boolean aoy(String paramString)
  {
    AppMethodBeat.i(60111);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.endsWith("@im.chatroom");
      AppMethodBeat.o(60111);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60111);
    }
  }

  public static boolean aoz(String paramString)
  {
    AppMethodBeat.i(60112);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.endsWith("@fb");
      AppMethodBeat.o(60112);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60112);
    }
  }

  public static int dsg()
  {
    return 16;
  }

  public static int dsh()
  {
    return 8;
  }

  public static boolean mR(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(60113);
    if (paramString != null)
      if ((paramString.contains("@bottle:")) || (paramString.endsWith("@bottle")))
      {
        bool = true;
        AppMethodBeat.o(60113);
      }
    while (true)
    {
      return bool;
      AppMethodBeat.o(60113);
      continue;
      AppMethodBeat.o(60113);
    }
  }

  public static boolean mg(String paramString)
  {
    AppMethodBeat.i(60114);
    boolean bool;
    if (paramString != null)
    {
      bool = paramString.endsWith("@app");
      AppMethodBeat.o(60114);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60114);
    }
  }

  public static String q(Cursor paramCursor)
  {
    AppMethodBeat.i(60119);
    paramCursor = paramCursor.getString(paramCursor.getColumnIndex("username"));
    AppMethodBeat.o(60119);
    return paramCursor;
  }

  public final boolean dsf()
  {
    if ((this.field_verifyFlag & 0x8) > 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final boolean dsi()
  {
    AppMethodBeat.i(60118);
    boolean bool;
    if ((int)bo.anT() - this.duj > 86400L)
    {
      bool = true;
      AppMethodBeat.o(60118);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(60118);
    }
  }

  public final String dsj()
  {
    AppMethodBeat.i(60122);
    Object localObject = this.dui;
    if (bo.isNullOrNil((String)localObject))
    {
      localObject = "";
      AppMethodBeat.o(60122);
    }
    while (true)
    {
      return localObject;
      localObject = ((String)localObject).split("_");
      if ((localObject == null) || (localObject.length < 2))
      {
        localObject = "";
        AppMethodBeat.o(60122);
      }
      else
      {
        localObject = bo.nullAsNil(localObject[1]);
        AppMethodBeat.o(60122);
      }
    }
  }

  public final void dsk()
  {
    AppMethodBeat.i(60128);
    Object localObject = this.dui;
    if (bo.isNullOrNil((String)localObject))
      AppMethodBeat.o(60128);
    while (true)
    {
      return;
      localObject = ((String)localObject).split("_");
      if (localObject.length > 0)
      {
        if (localObject.length > 2)
        {
          if (RegionCodeDecoder.apQ(localObject[0]))
          {
            RegionCodeDecoder.duj();
            super.iR(RegionCodeDecoder.id(localObject[0], localObject[1]));
          }
          while (true)
          {
            RegionCodeDecoder.duj();
            super.iS(RegionCodeDecoder.aD(localObject[0], localObject[1], localObject[2]));
            AppMethodBeat.o(60128);
            break;
            RegionCodeDecoder.duj();
            super.iR(RegionCodeDecoder.apR(localObject[0]));
          }
        }
        if (localObject.length == 2)
        {
          RegionCodeDecoder.duj();
          super.iR(RegionCodeDecoder.apR(localObject[0]));
          RegionCodeDecoder.duj();
          super.iS(RegionCodeDecoder.id(localObject[0], localObject[1]));
          AppMethodBeat.o(60128);
        }
        else
        {
          RegionCodeDecoder.duj();
          super.iR(RegionCodeDecoder.apR(localObject[0]));
          super.iS("");
        }
      }
      else
      {
        AppMethodBeat.o(60128);
      }
    }
  }

  public final ad dsl()
  {
    AppMethodBeat.i(60129);
    try
    {
      ad localad = (ad)super.clone();
      AppMethodBeat.o(60129);
      return localad;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.Contact", localException, "", new Object[0]);
        ab.e("MicroMsg.Contact", "clone Contact error. e: " + localException.toString());
        Object localObject = null;
      }
    }
  }

  public final String getCity()
  {
    AppMethodBeat.i(60127);
    String str = super.getCity();
    AppMethodBeat.o(60127);
    return str;
  }

  public final String getCityCode()
  {
    AppMethodBeat.i(60123);
    Object localObject = this.dui;
    if (bo.isNullOrNil((String)localObject))
    {
      localObject = "";
      AppMethodBeat.o(60123);
    }
    while (true)
    {
      return localObject;
      localObject = ((String)localObject).split("_");
      if ((localObject == null) || (localObject.length < 3))
      {
        localObject = "";
        AppMethodBeat.o(60123);
      }
      else
      {
        localObject = bo.nullAsNil(localObject[2]);
        AppMethodBeat.o(60123);
      }
    }
  }

  public final String getCountryCode()
  {
    AppMethodBeat.i(60121);
    Object localObject = this.dui;
    if (bo.isNullOrNil((String)localObject))
    {
      localObject = "";
      AppMethodBeat.o(60121);
    }
    while (true)
    {
      return localObject;
      localObject = ((String)localObject).split("_");
      if ((localObject == null) || (localObject.length <= 0))
      {
        localObject = "";
        AppMethodBeat.o(60121);
      }
      else
      {
        localObject = bo.nullAsNil(localObject[0]);
        AppMethodBeat.o(60121);
      }
    }
  }

  public final String getProvince()
  {
    AppMethodBeat.i(60126);
    String str = super.getProvince();
    AppMethodBeat.o(60126);
    return str;
  }

  @Deprecated
  public final void iR(String paramString)
  {
    AppMethodBeat.i(60124);
    super.iR(paramString);
    AppMethodBeat.o(60124);
  }

  @Deprecated
  public final void iS(String paramString)
  {
    AppMethodBeat.i(60125);
    super.iS(paramString);
    AppMethodBeat.o(60125);
  }

  public final void iW(String paramString)
  {
    AppMethodBeat.i(60120);
    super.iW(paramString);
    dsk();
    AppMethodBeat.o(60120);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.storage.ad
 * JD-Core Version:    0.6.2
 */